package com.haohai.cms.service.cms.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.ztree.ZTree;
import com.haohai.cms.mapper.TCmsGoodCategoryMapper;
import com.haohai.cms.mapper.TCmsGoodCategoryTagMapper;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.TCmsGoodCategoryCriteria;
import com.haohai.cms.model.TCmsGoodCategoryTag;
import com.haohai.cms.model.TCmsGoodCategoryTagCriteria;
import com.haohai.cms.model.dto.CmsGoodCategoryDto;
import com.haohai.cms.model.dto.CmsGoodCategoryTagDto;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.CmsGoodCategoryService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CmsGoodCategoryServiceImpl implements CmsGoodCategoryService {

	private static final Logger logger = LoggerFactory
			.getLogger(CmsGoodCategoryServiceImpl.class);

	@Autowired
	private TCmsGoodCategoryMapper tCmsGoodCategoryMapper;
	@Autowired
	private TCmsGoodCategoryTagMapper tCmsGoodCategoryTagMapper;

	/**
	 * 查询商品分类列表
	 * @param pageDto
	 * @return
	 */
	@Override
	public ResponseMessage getCmsGoodCategories(PageDto pageDto) {
		ResponseMessage rm = ResponseMessage.createSuccessMsg(0);
		JSONObject paramJson = JSONObject.parseObject(pageDto.getParamJson());
		TCmsGoodCategoryCriteria tCmsGoodCategoryCriteria = new TCmsGoodCategoryCriteria();
		TCmsGoodCategoryCriteria.Criteria criteria = tCmsGoodCategoryCriteria.createCriteria();
		criteria.andCategoryParentIdNotEqualTo(0);
		if (StringUtils.isNotEmpty(paramJson.getString("categoryName")))
			criteria.andCategoryNameLike("%" + paramJson.getString("categoryName").trim() + "%");
		if (StringUtils.isNotEmpty(paramJson.getString("dataFlag")))
			criteria.andDataFlagEqualTo(paramJson.getString("dataFlag"));
		tCmsGoodCategoryCriteria.setOrderByClause(pageDto.getSortName() + " " + pageDto.getSortOrder());
		PageHelper.startPage(pageDto.getPageNumber(),pageDto.getPageSize());
		List<TCmsGoodCategory> list = tCmsGoodCategoryMapper.selectByExample(tCmsGoodCategoryCriteria);
		PageInfo<TCmsGoodCategory> pageInfo = new PageInfo<TCmsGoodCategory>(list);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("total",pageInfo.getTotal());
        jsonObject.put("rows",list);
        rm.setData(jsonObject);
        return rm;
	}
	
	/**
	 * 保存商品分类
	 */
	@Override
	public ResponseMessage tmSaveCmsGood(CmsGoodCategoryDto cmsGoodCategoryDto) {
		ResponseMessage rm = ResponseMessage.createSuccessMsg(0);
    	if (cmsGoodCategoryDto.getCategoryId() !=null && cmsGoodCategoryDto.getCategoryId() !=0){
    		//修改商品分类
    		rm = this.updateGoodCategory(cmsGoodCategoryDto);
    	}else{
    		//保存商品分类
    		rm = this.addGoodCategory(cmsGoodCategoryDto);
    	}
        return rm;
	}
	
	/**
	 * 修改商品分类
	 * @param cmsGoodCategoryDto
	 * @return
	 */
	public ResponseMessage updateGoodCategory(CmsGoodCategoryDto cmsGoodCategoryDto) {
		//修改商品分类基本信息
		this.tCmsGoodCategoryMapper.updateByPrimaryKeySelective(cmsGoodCategoryDto);
		//修改商品分类绑定的标签
		//根据商品分类id删除商品分类之前绑定的标签
		TCmsGoodCategoryTagCriteria gcTagCriteria = new TCmsGoodCategoryTagCriteria();
		TCmsGoodCategoryTagCriteria.Criteria criteria = gcTagCriteria.createCriteria();
		criteria.andCategoryIdEqualTo(cmsGoodCategoryDto.getCategoryId());
		this.tCmsGoodCategoryTagMapper.deleteByExample(gcTagCriteria);
		//保存商品分类和标签的关系
		this.addGoodCategoryTag(cmsGoodCategoryDto);
		return ResponseMessage.createSuccessMsg(0);
	}

	/**
	 * 增加商品分类
	 */
	public ResponseMessage addGoodCategory(CmsGoodCategoryDto cmsGoodCategoryDto) {
		String categoryLevel = cmsGoodCategoryDto.getCategoryLevel();
		tCmsGoodCategoryMapper.insertSelective(cmsGoodCategoryDto);
		int categoryId = cmsGoodCategoryDto.getCategoryId();
		//更新节点深度
		cmsGoodCategoryDto.setCategoryLevel(categoryLevel+"."+categoryId);
		tCmsGoodCategoryMapper.updateByPrimaryKeySelective(cmsGoodCategoryDto);
		//保存商品分类和标签的关系
		this.addGoodCategoryTag(cmsGoodCategoryDto);
		return ResponseMessage.createSuccessMsg(0);
	}
	
	/**
	 * 插入商品分类和标签的绑定关系
	 * @param cmsGoodCategoryDto
	 */
	public void addGoodCategoryTag(CmsGoodCategoryDto cmsGoodCategoryDto){
		String[] goodCategoryTags = cmsGoodCategoryDto.getGoodCategoryTags();
		if (goodCategoryTags !=null && goodCategoryTags.length > 0){
			List<TCmsGoodCategoryTag> gcTags = new ArrayList<TCmsGoodCategoryTag>();
			for (int i=0;i<goodCategoryTags.length;i++){
				TCmsGoodCategoryTag gcTag = new TCmsGoodCategoryTag();
				gcTag.setCategoryId(cmsGoodCategoryDto.getCategoryId());
				gcTag.setTagId(Integer.parseInt(goodCategoryTags[i]));
				gcTag.setGoodCategoryTagSort(i+1);
				gcTags.add(gcTag);
			}
			this.tCmsGoodCategoryTagMapper.batchInsert(gcTags);
		}
	}
	
	/**
	 * 根据商品分类id查询商品分类信息
	 */
	@Override
	public ResponseMessage getCategoryInfoById(Integer categoryId) {
		//查询商品分类详情
		CmsGoodCategoryDto cmsGoodCategory = this.tCmsGoodCategoryMapper.getCmsGoodCategoryById(categoryId);
		return ResponseMessage.createSuccessMsg(cmsGoodCategory);
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
//		criteria.andLevelLessThan(level);
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
     * 根据商品分类id查询商品分类标签树
     * @param categoryId
     * @return
     */
	@Override
	public ResponseMessage getGoodCategoryTagTree(Integer categoryId){
    	TCmsGoodCategoryTagCriteria cctCriteria = new TCmsGoodCategoryTagCriteria();
    	TCmsGoodCategoryTagCriteria.Criteria criteria = cctCriteria.createCriteria();
    	criteria.andCategoryIdEqualTo(categoryId);
    	List<CmsGoodCategoryTagDto> list = this.tCmsGoodCategoryTagMapper.selectGoodCategoryTagByCategoryId(categoryId);
    	List<ZTree> treedata = new ArrayList<ZTree>();
		if (list != null && list.size() > 0) {
			for (CmsGoodCategoryTagDto categoryTag : list) {
				ZTree tree = new ZTree(categoryTag.getTagId(), categoryTag.getTagParentId(), 
						categoryTag.getTagName(), false, null);
				if (categoryTag.getTagParentId() == 1)
					tree.setOpen(true);
				treedata.add(tree);
			}
		}
		return ResponseMessage.createSuccessMsg(treedata);
    }
	
}
