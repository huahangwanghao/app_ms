package com.haohai.cms.controller.cms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.controller.BaseController;
import com.haohai.cms.model.TCmsTag;
import com.haohai.cms.service.cms.ICmsTagService;

@RestController
@RequestMapping("/cms/tag")
public class CmsTagController extends BaseController {
	
	private static final Logger logger = LoggerFactory.getLogger(CmsTagController.class);
	
	@Autowired
	private ICmsTagService cmsTagService;
	
	/**
	 * 查询标签列表
	 * @param pageDto
	 * @return
	 */
	@RequestMapping("/getCmsTags.do")
	public ResponseMessage getCmsTags() {
		ResponseMessage rm = this.cmsTagService.getCmsTags();
		logger.info("查询标签列表响应结果："+rm);
		return rm;
	}
	
	/**
	 * 保存标签信息
	 * @param cmsTag
	 * @return
	 */
	@RequestMapping("/saveCmsTag.do")
	public ResponseMessage saveCmsTag(TCmsTag cmsTag) {
		logger.info("保存标签请求参数："+cmsTag);
		ResponseMessage responseMessage = this.cmsTagService.tmSaveCmsTag(cmsTag);
		return responseMessage;
	}

}
