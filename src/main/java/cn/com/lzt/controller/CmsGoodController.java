package cn.com.lzt.controller;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.common.util.FileUtils;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.service.cms.CmsGoodService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;

@RestController
@RequestMapping("/good")
public class CmsGoodController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(CmsGoodController.class);
	@Autowired
	private CmsGoodService cmsGoodService;




	/**
	 * 新增cms商品
	 *
	 * @param tCmsGood
	 * @return
	 */
	@RequestMapping("toAddCmsGood.do")
	public ModelAndView toSysUsers(@ModelAttribute("tCmsGood") TCmsGood tCmsGood) {
	    logger.info("新增cms商品的入参:"+tCmsGood);
		ModelAndView mav = new ModelAndView();
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodService.save(tCmsGood);
		mav.addObject("roles", null);
		mav.setViewName("sys/sysusers");
		return mav;
	}
	

	/**
	 * 上传基本信息照片
	 * @return
	 */
	@RequestMapping(value={"/pic/upload.do"}, method= RequestMethod.POST)
	@ResponseBody
	public ResponseMessage uploadBaseInfoPic(HttpServletRequest request){
		ResponseMessage rm=new ResponseMessage();
		String imgPath=this.UPLOAD_DIR;
		try {
			String loanApplyNo=request.getParameter("loanApplyNo");
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile multipartFile = multipartRequest.getFile("multipartFile");
			String fileName=multipartFile.getOriginalFilename();
			logger.info(loanApplyNo+"上传基本信息照片的名称:"+fileName);
			File targetFile = new File(imgPath, fileName);
			if(!targetFile.exists()){
				targetFile.mkdir();
			}
			multipartFile.transferTo(targetFile);
		} catch (Exception e) {
			logger.info("上传基本信息照片异常:",e);
			rm=ResponseMessage.createErrorMsg(e);
		}
		return rm;
	}

	/**
	 * 批量上传图片的接口
	 * @param file
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "uploadtopicimg.do")
	public String addImg(MultipartFile file, HttpServletResponse response)
			throws Exception {
		if (null != file && !file.isEmpty()) {
			BufferedImage sourceImg = ImageIO.read(file.getInputStream());
			JSONObject json = new JSONObject();
			String imgpath = FileUtils.uploadImg(file, "topic/");
			json.put("imgpath", imgpath);
			json.put("imgwidth", sourceImg.getWidth());
			json.put("imgheight", sourceImg.getHeight());
			// 返回图片路径
			response.getWriter().print(json.toString());
		}
		return null;
	}
	
	
	
	/**
	 * 查询cms商品
	 *
	 * @param cmsGoodReq
	 * @return
	 */
	@RequestMapping("/getCmsGoodList.do")
	public ResponseMessage getGood(@ModelAttribute("cmsGoodReq") CmsGoodReq cmsGoodReq) {
		logger.info("查询cms商品的入参:"+cmsGoodReq);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodService.queryByCondition(cmsGoodReq);
		logger.info("返回给前端的数据"+responseMessage);
		return responseMessage;
	}


	
	


}
