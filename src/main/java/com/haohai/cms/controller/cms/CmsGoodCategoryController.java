package com.haohai.cms.controller.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.JsonUtil;
import com.haohai.cms.controller.BaseController;
import com.haohai.cms.model.dto.CmsGoodCategoryDto;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.CmsGoodCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cms/category")
public class CmsGoodCategoryController extends BaseController {

	private static final Logger logger = LoggerFactory
			.getLogger(CmsGoodCategoryController.class);

	@Autowired
	private CmsGoodCategoryService cmsGoodCategoryService;
	
	/**
	 * 查询商品分类列表
	 * @param pageDto
	 * @return
	 */
	@RequestMapping("/getGoodCategories.do")
	public ResponseMessage getGoodCategories(@ModelAttribute("pageInfo") PageDto pageDto) {
		logger.info("查询商品分类列表请求：" + pageDto);
		ResponseMessage rm = cmsGoodCategoryService.getCmsGoodCategories(pageDto);
		logger.info("查询商品分类列表响应："+rm);
		return rm;
	}
	
	/**
	 * 保存商品分类
	 * @param tCmsGood
	 * @return
	 */
	@RequestMapping("/saveGoodCategory.do")
	public ResponseMessage saveGoodCategory(CmsGoodCategoryDto cmsGoodCategoryDto) {
		logger.info("保存商品分类请求："+cmsGoodCategoryDto);
		ResponseMessage responseMessage = this.cmsGoodCategoryService.tmSaveCmsGood(cmsGoodCategoryDto);
		logger.info("保存商品分类响应："+responseMessage);
		return responseMessage;
	}
	
	/**
	 * 根据商品分类id查询商品分类信息
	 * @param goodId
	 * @return
	 */
	@RequestMapping("/getGoodCategoryById.do")
	public ResponseMessage getGoodCategoryById(@RequestParam Integer categoryId) {
		logger.info("查询商品分类请求参数：" + categoryId);
		ResponseMessage responseMessage = cmsGoodCategoryService.getCategoryInfoById(categoryId);
		logger.info("查询商品分类相应信息："+responseMessage);
		return responseMessage;
	}
	
	/**
	 * 查询商品分类树结构
	 * @return
	 */
	@RequestMapping("/getGoodCategoryTree.do")
	public ResponseMessage getGoodCategoryTree() {
		logger.info("查询商品分类树结构入参");
		ResponseMessage responseMessage = this.cmsGoodCategoryService.selectGoodCategoryTreeData();
		logger.info("查询商品分类树结构响应" + JsonUtil.jsonToString(responseMessage));
		return responseMessage;
	}

	/**
	 * 查询商品分类树结构
	 * @return
	 */
	@RequestMapping("/getGoodCategoriesByLevel.do")
	public ResponseMessage getGoodCategories(@RequestParam String level) {
		logger.info("查询商品分类树结构入参");
		ResponseMessage responseMessage = this.cmsGoodCategoryService.selectGoodCategoryTreeDataByLevel(level);
		logger.info("查询商品分类树结构响应" + JsonUtil.jsonToString(responseMessage));
		return responseMessage;
	}
	
	/**
	 * 根据商品分类id查询商品分类标签树
	 * @param categoryId
	 * @return
	 */
	@RequestMapping("/getGoodCategoryTagTree.do")
	public ResponseMessage getGoodCategoryTagTree(@RequestParam Integer categoryId) {
		logger.info("查询商品分类标签请求参数："+categoryId);
		ResponseMessage responseMessage = this.cmsGoodCategoryService.getGoodCategoryTagTree(categoryId);
		logger.info("查询商品分类标签响应：" + JsonUtil.jsonToString(responseMessage));
		return responseMessage;
	}

}
