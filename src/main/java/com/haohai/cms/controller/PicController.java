package com.haohai.cms.controller;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.service.role.IRoleService;
import com.haohai.cms.service.sys.ISysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.OutputStream;

@Controller
@RequestMapping("/pic")
public class PicController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(PicController.class);
	@Autowired
	private ISysService sysService;

	@Autowired
	private IRoleService roleService;


	/**
	 * 上传基本信息照片
	 * @return
	 */
	@RequestMapping(value={"/basePic/upload"}, method= RequestMethod.POST)
	@ResponseBody
	public ResponseMessage uploadBaseInfoPic(HttpServletRequest request){
		ResponseMessage rm=new ResponseMessage();
		try {
			String loanApplyNo=request.getParameter("loanApplyNo");
			
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile multipartFile = multipartRequest.getFile("multipartFile");
			logger.info(loanApplyNo+"上传基本信息照片照片内容:" + multipartFile + ",照片内容的字节长度" + multipartFile.getBytes().length);
	;
			String fileName=multipartFile.getOriginalFilename();
			logger.info(loanApplyNo+"上传基本信息照片的名称:"+fileName);
		
			String type=request.getParameter("type");
			// String patch=request.getParameter("patch");
			String token=request.getParameter("token");
			String businessType=request.getParameter("businessType");
			logger.info(loanApplyNo+"基本信息上传开始入参：fileName:" + fileName + ",loanApplyNo:"
					+ request.getParameter("loanApplyNo") + ",type:" + request.getParameter("type") + ",patch:"
					+ request.getParameter("patch") + ",token:" + request.getParameter("token") + ",businessType:"
					+ request.getParameter("businessType")+"pictureOrder"+request.getParameter("pictureOrder"));
		

			
		} catch (Exception e) {
			logger.info("上传基本信息照片异常:",e);
			rm=ResponseMessage.createErrorMsg(e);
		}
		return rm;
	}


	/**
	 * 下载图片
	 *
	 * 前端把图片的路径传递给我们,然后我们根据路径查询出来对应的图片返回给前端
	 *
	 * @param request
	 */
	@RequestMapping(value = "/file/download.do", method = RequestMethod.GET)
	public   void  download(HttpServletRequest request, HttpServletResponse response){
		String imagePath=request.getParameter("url");
		logger.info("下载图片上传参数:"+UPLOAD_DIR+imagePath);
		OutputStream out = null;
		try {
			
			FileInputStream inputStream = new FileInputStream(UPLOAD_DIR+imagePath);
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
