package com.haohai.cms.controller.api;

import com.alibaba.fastjson.JSONObject;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.JsonUtil;
import com.haohai.cms.controller.BaseController;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.service.cms.CmsGoodCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品分类control
 */
@RestController
@RequestMapping("/api/category")
public class ApiGoodCategoryController extends BaseController {

	private static final Logger logger = LoggerFactory
			.getLogger(ApiGoodCategoryController.class);

	@Autowired
	private CmsGoodCategoryService cmsGoodCategoryService;


}
