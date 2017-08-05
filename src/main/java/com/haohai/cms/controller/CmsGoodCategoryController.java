package com.haohai.cms.controller;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.dto.CmsGoodCategoryReq;
import com.haohai.cms.service.cms.CmsGoodCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品分类control
 */
@RestController
@RequestMapping("/category")
public class CmsGoodCategoryController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(CmsGoodCategoryController.class);
	@Autowired
	private CmsGoodCategoryService cmsGoodCategoryService;


	/**
	 * 增加分类
	 *
	 * @param tCmsGoodCategory
	 * @return
	 */
	@RequestMapping("/toAddGoodCategory.do")
	public ResponseMessage addGoodCategory(@ModelAttribute("tCmsGoodCategory") TCmsGoodCategory tCmsGoodCategory) {
		logger.info("增加分类入参:"+tCmsGoodCategory);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodCategoryService.insert(tCmsGoodCategory);
		return responseMessage;
	}

	/**
	 * 得到所有分类信息
	 *
	 * @param tCmsGoodCategory
	 * @return
	 */
	@RequestMapping("/getAllGoodCategory.do")
	public ResponseMessage getAllGoodCategory(@ModelAttribute("tCmsGoodCategory") TCmsGoodCategory tCmsGoodCategory) {
		logger.info("得到所有分类信息入参:"+tCmsGoodCategory);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodCategoryService.selectAllCategoryList();
		return responseMessage;
	}

	/**
	 * 得到所有分类信息
	 *
	 * @param cmsGoodCategoryReq
	 * @return
	 */
	@RequestMapping("/getGoodCategory4Page.do")
	public ResponseMessage getGoodCategory4Page(@ModelAttribute("tCmsGoodCategory") CmsGoodCategoryReq cmsGoodCategoryReq) {
		logger.info("得到所有分类信息入参:"+ cmsGoodCategoryReq);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodCategoryService.selectCategoryList4Page(cmsGoodCategoryReq);
		return responseMessage;
	}

	
	
	

}
