package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsTag;
import com.haohai.cms.model.dto.PageDto;

public interface ICmsTagService {

	/**
	 * 查询标签列表
	 * @param pageDto
	 * @return
	 */
	ResponseMessage getCmsTags(PageDto pageDto);
	
	/**
	 * 保存标签信息
	 * @param cmsTag
	 * @return
	 */
	ResponseMessage tmSaveCmsTag(TCmsTag cmsTag);
	
}
