package com.haohai.cms.model.dto;

public class PageDto {

	/**
	 * 当前页
	 */
	private int pageNumber;
	/**
	 * 页大小
	 */
	private int pageSize;
	/**
	 * 排序列名
	 */
	private String sortName;
	/**
	 * 排序方式
	 */
	private String sortOrder;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}
