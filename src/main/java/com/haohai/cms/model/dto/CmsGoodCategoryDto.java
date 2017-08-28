package com.haohai.cms.model.dto;

import com.haohai.cms.model.TCmsGoodCategory;

public class CmsGoodCategoryDto extends TCmsGoodCategory {

	private String categoryParentName;
	private String[] goodCategoryTags;
	private String goodCategoryTag;
	private String goodCategoryTagname;

	public String getCategoryParentName() {
		return categoryParentName;
	}

	public void setCategoryParentName(String categoryParentName) {
		this.categoryParentName = categoryParentName;
	}

	public String[] getGoodCategoryTags() {
		return goodCategoryTags;
	}

	public void setGoodCategoryTags(String[] goodCategoryTags) {
		this.goodCategoryTags = goodCategoryTags;
	}

	public String getGoodCategoryTag() {
		return goodCategoryTag;
	}

	public void setGoodCategoryTag(String goodCategoryTag) {
		this.goodCategoryTag = goodCategoryTag;
	}

	public String getGoodCategoryTagname() {
		return goodCategoryTagname;
	}

	public void setGoodCategoryTagname(String goodCategoryTagname) {
		this.goodCategoryTagname = goodCategoryTagname;
	}

}
