package com.haohai.cms.service.cms.impl;

/**
 * Created by Administrator on 2017/8/2.
 */

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.JsonUtil;
import com.haohai.cms.common.util.ztree.ZTree;
import com.haohai.cms.mapper.TCmsGoodCategoryMapper;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.TCmsGoodCategoryCriteria;
import com.haohai.cms.model.dto.CmsGoodCategoryReq;
import com.haohai.cms.service.cms.CmsGoodCategoryService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 评论的实现类
 * 
 * @author WangH
 * @create 2017-08-02 16:41
 **/
@Service
@Transactional
public class CmsGoodCategoryServiceImpl implements CmsGoodCategoryService {

	private static final Logger logger = LoggerFactory
			.getLogger(CmsGoodCategoryServiceImpl.class);

	@Autowired
	private TCmsGoodCategoryMapper tCmsGoodCategoryMapper;

	/**
	 * 增加商品分类
	 * 
	 * @param tCmsGoodCategory
	 * @return
	 */
	@Override
	public ResponseMessage insert(TCmsGoodCategory tCmsGoodCategory) {
		//查询父节点的Id
		String categoryLevel=tCmsGoodCategory.getCategoryLevel();
		
		tCmsGoodCategoryMapper.insertSelective(tCmsGoodCategory);
		int categoryId=tCmsGoodCategory.getCategoryId();
		tCmsGoodCategory.setCategoryLevel(categoryLevel+"."+categoryId);
		tCmsGoodCategoryMapper.updateByPrimaryKeySelective(tCmsGoodCategory);
		return ResponseMessage.createSuccessMsg(0);
	}

	/**
	 * 得到所有的分类信息
	 * 
	 * @return
	 */
	@Override
	public ResponseMessage selectAllCategoryList() {
		TCmsGoodCategoryCriteria tCmsGoodCategoryCriteria = new TCmsGoodCategoryCriteria();
		TCmsGoodCategoryCriteria.Criteria criteria = tCmsGoodCategoryCriteria
				.createCriteria();
		criteria.andDataFlagEqualTo("1");
		List<TCmsGoodCategory> list = tCmsGoodCategoryMapper
				.selectByExample(tCmsGoodCategoryCriteria);
		return ResponseMessage.createSuccessMsg(list);
	}

	/**
	 * 得到分类信息的分页信息
	 * 
	 * @param cmsGoodCategoryReq
	 * @return
	 */
	@Override
	public JSONObject selectCategoryList4Page(
			CmsGoodCategoryReq cmsGoodCategoryReq) {
		JSONObject paramJson = JSONObject.parseObject(cmsGoodCategoryReq.getParamJson());
		TCmsGoodCategoryCriteria tCmsGoodCategoryCriteria = new TCmsGoodCategoryCriteria();
		TCmsGoodCategoryCriteria.Criteria criteria = tCmsGoodCategoryCriteria.createCriteria();
		if (StringUtils.isNotEmpty(paramJson.getString("categoryName")))
			criteria.andCategoryNameLike("%" + paramJson.getString("categoryName").trim() + "%");
		if (StringUtils.isNotEmpty(paramJson.getString("dataFlag")))
			criteria.andDataFlagEqualTo(paramJson.getString("dataFlag"));
		PageHelper.startPage(cmsGoodCategoryReq.getPageNumber(),
				cmsGoodCategoryReq.getPageSize());
		List<TCmsGoodCategory> list = tCmsGoodCategoryMapper
				.selectByExample(tCmsGoodCategoryCriteria);
		PageInfo<TCmsGoodCategory> pageInfo1 = new PageInfo<>(list);
		long total = pageInfo1.getTotal();
		JSONObject jsonObject = JsonUtil.getPageInfo2JsonObject(total, list);
		// TODO 判断是否需要使用Response形式还是使用JsonObject形式返回数据.
		return jsonObject;
	}

	/**
	 * 查询商品分类树结构
	 */
	@Override
	public ResponseMessage selectGoodCategoryTreeData() {
		TCmsGoodCategoryCriteria goodCategory = new TCmsGoodCategoryCriteria();
		TCmsGoodCategoryCriteria.Criteria criteria = goodCategory
				.createCriteria();
		criteria.andDataFlagEqualTo("1");
		List<TCmsGoodCategory> categories = tCmsGoodCategoryMapper
				.selectByExample(goodCategory);
		List<ZTree> treedata = new ArrayList<ZTree>();
		if (categories != null && categories.size() > 0) {
			for (TCmsGoodCategory category : categories) {
				ZTree tree = new ZTree(category.getCategoryId(),
						category.getCategoryParentId(),
						category.getCategoryName(), false,
						category.getCategoryLevel());
				if (category.getCategoryParentId() == 0)
					tree.setOpen(true);
				treedata.add(tree);
			}
		}
		return ResponseMessage.createSuccessMsg(treedata);
	}

	/**
	 * 通过等级查询树形结构
	 *
	 * @param level
	 * @return
	 */
	@Override
	public ResponseMessage selectGoodCategoryTreeDataByLevel(String level) {
		TCmsGoodCategoryCriteria goodCategory = new TCmsGoodCategoryCriteria();
		TCmsGoodCategoryCriteria.Criteria criteria = goodCategory
				.createCriteria();
		criteria.andDataFlagEqualTo("1");
		criteria.andLevelLessThan(level);
		List<TCmsGoodCategory> categories = tCmsGoodCategoryMapper
				.selectByExample(goodCategory);
		List<ZTree> treedata = new ArrayList<ZTree>();
		if (categories != null && categories.size() > 0) {
			for (TCmsGoodCategory category : categories) {
				ZTree tree = new ZTree(category.getCategoryId(),
						category.getCategoryParentId(),
						category.getCategoryName(), false,
						category.getCategoryLevel());
				if (category.getCategoryParentId() == 0)
					tree.setOpen(true);
				treedata.add(tree);
			}
		}
		return ResponseMessage.createSuccessMsg(treedata);
	}
}
