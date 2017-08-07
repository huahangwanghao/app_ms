package com.haohai.cms.controller;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.exception.CustomException;
import com.haohai.cms.common.util.JsonUtil;
import com.haohai.cms.common.util.StringUtil;
import com.haohai.cms.common.util.file.FileType;
import com.haohai.cms.model.dto.DefaultReq;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/upload")
public class FileUploadController extends BaseController {

	private static final Logger logger = Logger
			.getLogger(FileUploadController.class.getName());

	// 支持的图片最大字节数
	private final long MAX_IMAGE_SIZE = 5242880; // 5M

	@SuppressWarnings("static-access")
	@RequestMapping(value = "upload.do", method	 = RequestMethod.POST)
	@ResponseBody
	public ResponseMessage upload(
			@RequestParam(value = "msg") String msg,
			@RequestParam(value = "photo") MultipartFile file,
			@RequestParam(value = "photoname") String filename,
			@RequestParam(value = "foldername", required = false) String foldername,
			HttpServletRequest request) throws Exception {
		DefaultReq req = JsonUtil.stringToObject(msg, DefaultReq.class);
		logger.info("文件上传请求：" + JsonUtil.jsonToString(req));
		ResponseMessage message = new ResponseMessage();
		message = message.createSuccessMsg("");
		if (file.getSize() > MAX_IMAGE_SIZE) {
			throw new CustomException("文件太大");
		}
		// 通过二进制判断真实文件类型
		String filetype = FileType.getFileType(file.getBytes());
		if (StringUtils.isEmpty(filetype)
				|| !("png".equals(filetype) || "jpg".equals(filetype))) {
			throw new CustomException("图片格式不支持");
		}
		String flname = StringUtil.formatDate("yyyyMMddHHmmssSSS", new Date())
				+ "." + Math.abs(new Random().nextInt()) + "." + filename;
		// 图片相对路径
		String relativePath = StringUtils.isEmpty(foldername) ? "/temp/"
				: "/" + foldername + "/";
		// tomcat上传路径
		String filepath = StringUtil.getUploadpath(UPLOAD_DIR,relativePath);
		file.transferTo(new File(filepath + flname));
		Map<String,String> dataMap = new HashMap<String,String>();
		dataMap.put("imageurl", relativePath + flname);
		message.setData(dataMap);
		logger.info("上传文件响应：" + JsonUtil.jsonToString(message));
		return message;
	}
	
	/**
	 * 文件上传
	 * @param file
	 * @param filefolder：文件夹
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	@RequestMapping(value = "fileUpload.do", method = RequestMethod.POST)
	@ResponseBody
	public ResponseMessage fileUpload(MultipartFile file,String filefolder)
			throws Exception {
		ResponseMessage message = new ResponseMessage();
		JSONObject json = new JSONObject();
		String contentType = file.getContentType();
		if (contentType.indexOf("image") == 0){
			BufferedImage sourceImg = ImageIO.read(file.getInputStream());
			json.put("imgwidth", sourceImg.getWidth());
			json.put("imgheight", sourceImg.getHeight());
		}
		String fileoriname = file.getOriginalFilename();
		String fileformat = fileoriname.substring(fileoriname.lastIndexOf("."),fileoriname.length());
		String filename = new SimpleDateFormat("yyyyMMddHHmmsssss")
				.format(new Date()) + new Random().nextInt() + fileformat;
		//文件相对路径
		String relativePath = StringUtils.isEmpty(filefolder) ? "/temp/"
				: "/" + filefolder + "/";
		//文件上传绝对路径
		String filepath = StringUtil.getUploadpath(UPLOAD_DIR,relativePath);
		File path = new File(filepath);
		if (!path.exists()) {
			path.mkdirs();
		}
		file.transferTo(new File(filepath + filename));
		json.put("filepath", relativePath + filename);
		message = message.createSuccessMsg(json);
		logger.info("上传文件响应：" + JsonUtil.jsonToString(message));
		return message;
	}

	/**
	 * 下载图片
	 *
	 * 前端把图片的路径传递给我们,然后我们根据路径查询出来对应的图片返回给前端
	 *
	 * @param request
	 */
	@RequestMapping(value = "/file/{key}/download.do", method = RequestMethod.GET)
	public   void  download(HttpServletRequest request, HttpServletResponse response, @PathVariable String key){
		logger.info("下载图片上传参数:"+key);
		logger.info("123-------->"+request.getParameter("url"));
		OutputStream out = null;
		try {
			FileInputStream inputStream = new FileInputStream("D:/good/20170802103400035-93684824.jpg");
			int i = inputStream.available();
			//byte数组用于存放图片字节数据  
			byte[] buff = new byte[i];
			inputStream.read(buff);
			//记得关闭输入流  
			inputStream.close();
			//设置发送到客户端的响应内容类型  
			response.setContentType("image/*");
			response.setContentType("image/jpeg");
			out = response.getOutputStream();
			out.write(buff);
			//关闭响应输出流  
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null){
					out.flush();
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
