package cn.com.lzt.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.common.exception.CustomException;
import cn.com.lzt.common.util.FileType;
import cn.com.lzt.common.util.JsonUtil;
import cn.com.lzt.common.util.StringUtil;
import cn.com.lzt.model.dto.DefaultReq;

@Controller
@RequestMapping("/upload")
public class FileUploadController extends BaseController {

	private static final Logger logger = Logger
			.getLogger(FileUploadController.class.getName());

	// 支持的图片最大字节数
	private final long MAX_IMAGE_SIZE = 5242880; // 5M

	@SuppressWarnings("static-access")
	@RequestMapping(value = "upload.do", method = RequestMethod.POST)
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
		String relativePath = StringUtils.isEmpty(foldername) ? "/appuser/"
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
	
}
