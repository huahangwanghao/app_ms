package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.dto.CmsGoodCategoryDto;
import com.haohai.cms.model.dto.PageDto;

public interface CmsGoodCategoryService {
	
	/**
	 * 查询商品分类列表
	 * @param pageDto
	 * @return
	 */
	ResponseMessage getCmsGoodCategories(PageDto pageDto);
	
	/**
	 * 保存商品分类
	 * @param cmsGoodCategoryDto
	 * @return
	 */
	ResponseMessage tmSaveCmsGood(CmsGoodCategoryDto cmsGoodCategoryDto);
	
	/**
	 * 根据商品分类id查询商品分类信息
	 * @param categoryId
	 * @return
	 */
    ResponseMessage getCategoryInfoById(Integer categoryId);

	/**
	 * 查询商品分类树结构
	 * @return
	 */
	ResponseMessage selectGoodCategoryTreeData();

	/**
	 * 通过等级查询树形结构
	 * @param level
	 * @return
	 */
    ResponseMessage selectGoodCategoryTreeDataByLevel(String level);
    
    /**
     * 根据商品分类id查询商品分类标签树
     * @param categoryId
     * @return
     */
    ResponseMessage getGoodCategoryTagTree(Integer categoryId);

}
