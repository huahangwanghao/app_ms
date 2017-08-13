package com.haohai.cms.service.cms.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.ztree.ZTree;
import com.haohai.cms.mapper.TCmsTagMapper;
import com.haohai.cms.model.TCmsTag;
import com.haohai.cms.model.TCmsTagCriteria;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.ICmsTagService;

@Service
@Transactional
public class CmsTagServiceImpl implements ICmsTagService {

	private static final Logger logger = LoggerFactory.getLogger(CmsTagServiceImpl.class);
    
    @Autowired
    private TCmsTagMapper tCmsTagMapper;
	
    /**
     * 查询标签列表
     */
	@Override
	public ResponseMessage getCmsTags(PageDto pageDto) {
		TCmsTagCriteria tagCriteria = new TCmsTagCriteria();
		TCmsTagCriteria.Criteria criteria = tagCriteria.createCriteria();
		criteria.andDataFlagEqualTo(1);
		List<TCmsTag> tags = this.tCmsTagMapper.selectByExample(tagCriteria);
		List<ZTree> treedata = new ArrayList<ZTree>();
		if (tags != null && tags.size() > 0) {
			for (TCmsTag tag : tags) {
				ZTree tree = new ZTree(tag.getTagId(),
						tag.getTagParentId(),
						tag.getTagName(), false,
						tag.getTagLevel());
				if (tag.getTagParentId() == 0)
					tree.setOpen(true);
				treedata.add(tree);
			}
		}
		return ResponseMessage.createSuccessMsg(treedata);
	}

	/**
	 * 保存标签信息
	 */
	@Override
	public ResponseMessage tmSaveCmsTag(TCmsTag cmsTag) {
		ResponseMessage rm = ResponseMessage.createSuccessMsg(0);
		if (cmsTag.getTagId() !=null && cmsTag.getTagId() !=0){
			//更新标签信息
			cmsTag.setTagParentId(null);
			cmsTag.setTagLevel(null);
			cmsTag.setUpdDate(new Date());
			this.tCmsTagMapper.updateByPrimaryKeySelective(cmsTag);
		}else{
			cmsTag.setTagId(null);
			//新增标签信息
			cmsTag.setCrtDate(new Date());
			this.tCmsTagMapper.insertSelective(cmsTag);
			//更新标签深度
			cmsTag.setTagLevel(cmsTag.getTagLevel() + "." + cmsTag.getTagId());
			this.tCmsTagMapper.updateByPrimaryKeySelective(cmsTag);
		}
		return rm;
	}

}
