package cn.com.lzt.controller;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.service.cms.CmsGoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
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
	public ModelAndView toSysUsers(@ModelAttribute("user") TCmsGood tCmsGood) {
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
	@RequestMapping(value={"monthloan/basePic/upload"}, method= RequestMethod.POST)
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
			logger.info(loanApplyNo+"月供贷基本信息上传开始入参：fileName:" + fileName + ",loanApplyNo:"
					+ request.getParameter("loanApplyNo") + ",type:" + request.getParameter("type") + ",patch:"
					+ request.getParameter("patch") + ",token:" + request.getParameter("token") + ",businessType:"
					+ request.getParameter("businessType")+"pictureOrder"+request.getParameter("pictureOrder"));
		

			
		} catch (Exception e) {
			logger.info("上传基本信息照片异常:",e);
			rm=ResponseMessage.createErrorMsg(e);
		}
		return rm;
	}
	

}
