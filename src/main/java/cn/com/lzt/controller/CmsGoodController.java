package cn.com.lzt.controller;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.model.dto.PageInfoReq;
import cn.com.lzt.service.cms.CmsGoodService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
	@RequestMapping("/toAddCmsGoo1d.do")
	public ModelAndView toSysUsers1(@ModelAttribute("tCmsGood") TCmsGood tCmsGood) {
	    logger.info("新增cms商品的入参:"+tCmsGood);
		ModelAndView mav = new ModelAndView();
		ResponseMessage responseMessage=null;
		int i =0;
		responseMessage=cmsGoodService.save(tCmsGood);
		mav.addObject("roles", null);
		mav.setViewName("sys/sysusers");
		return mav;
	}


	/**
	 * 新增cms商品
	 *
	 * @param tCmsGood
	 * @return
	 */
	@RequestMapping("/toAddCmsGood.do")
	public ResponseMessage addCmsGood(@ModelAttribute("tCmsGood") TCmsGood tCmsGood) {
		logger.info("新增cms商品的入参:"+tCmsGood);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodService.save(tCmsGood);
		return responseMessage;
	}

	/**
	 * 修改cms商品
	 *
	 * @param tCmsGood
	 * @return
	 */
	@RequestMapping("/toUpdateCmsGood.do")
	public ResponseMessage updateCmsGood(@ModelAttribute("tCmsGood") TCmsGood tCmsGood) {
		logger.info("新增cms商品的入参:"+tCmsGood);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodService.update(tCmsGood);
		return responseMessage;
	}

	/**
	 * 删除cms商品
	 *
	 * @param tCmsGood
	 * @return
	 */
	@RequestMapping("/doDeleteCmsGood.do")
	public ResponseMessage deleteCmsGood(@ModelAttribute("tCmsGood") TCmsGood tCmsGood) {
		logger.info("新增cms商品的入参:"+tCmsGood);
		ResponseMessage responseMessage=null;
		tCmsGood.setDataFlag("0");
		responseMessage=cmsGoodService.update(tCmsGood);
		return responseMessage;
	}
	/**
	 * 删除选中cms商品
	 *
	 * @param goodIds
	 * @return
	 */
	@RequestMapping("/doDeleteAllCmsGood.do")
	public ResponseMessage deleteAllCmsGood(@RequestParam String goodIds) {
		logger.info("新增cms商品的入参:"+goodIds);
		ResponseMessage responseMessage=null;
		responseMessage=responseMessage=cmsGoodService.batchDeleteByIds(goodIds);
		return responseMessage;
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
			String fileName="test.png";
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

	/**
	 * 查询cms分页信息
	 *
	 * @param 
	 * @return
	 */
	@RequestMapping("/getGoodPageInfo.do")
	public JSONObject getGoodPageInfo(@ModelAttribute("pageInfo") PageInfoReq pageInfo) {
		logger.info("查询cms分页信息入参:"+pageInfo);
		JSONObject json= cmsGoodService.query4Page(pageInfo);
		logger.info("查询cms分页信息返回结果:"+json);
		return json;
		
	}

	/**
	 * 通过商品名称进行模糊查询
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/getGoodPageInfoByName.do")
	public JSONObject getGoodPageInfoByName(@ModelAttribute("pageInfo") PageInfoReq pageInfo) {
		logger.info("通过商品名称查询cms分页信息入参:"+pageInfo);
		JSONObject json= cmsGoodService.query4Page(pageInfo);
		logger.info("通过商品名称查询cms分页信息返回结果:"+json);
		return json;

	}

}
