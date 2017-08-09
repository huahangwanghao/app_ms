package com.haohai.cms.service.cms;

import com.alibaba.fastjson.JSONObject;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.dto.CmsGoodCategoryReq;

/**
 * Created by Administrator on 2017/8/2.
 */
public interface CmsGoodCategoryService {

	/**
	 * 增加商品分类
	 * 
	 * @param tCmsGoodCategory
	 * @return
	 */
	ResponseMessage insert(TCmsGoodCategory tCmsGoodCategory);

	ResponseMessage selectAllCategoryList();

	/**
	 * 得到分类信息的分页信息
	 * 
	 * @param cmsGoodCategoryReq
	 * @return
	 */
	JSONObject selectCategoryList4Page(
			CmsGoodCategoryReq cmsGoodCategoryReq);
	
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
	 * 通过Id查询分类信息的详细信息
	 * @param goodId
	 * @return
	 */
    ResponseMessage getCategoryInfoById(Integer goodId);

	/**
	 * 进行修改
	 * @param tCmsGoodCategory
	 * @return
	 */
    ResponseMessage update(TCmsGoodCategory tCmsGoodCategory);
}
