package com.haohai.cms.model.dto;

import com.haohai.cms.model.TCmsGoodCategoryTag;

public class CmsGoodCategoryTagDto extends TCmsGoodCategoryTag {

	private Integer tagParentId;
	private String tagName;

	public Integer getTagParentId() {
		return tagParentId;
	}

	public void setTagParentId(Integer tagParentId) {
		this.tagParentId = tagParentId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
