package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsTag;

public interface ICmsTagService {

	/**
	 * 查询标签集合
	 * @return
	 */
	ResponseMessage getCmsTags();
	
	/**
	 * 保存标签信息
	 * @param cmsTag
	 * @return
	 */
	ResponseMessage tmSaveCmsTag(TCmsTag cmsTag);
	
}
