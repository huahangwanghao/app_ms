package cn.com.lzt.model.dto;/**
 * Created by Administrator on 2017/7/21.
 */

/**
 * 分页查询的功能
 *
 * @author WangH
 * @create 2017-07-21 11:03
 **/
public class PageInfoReq {
    
    private int pageNumber;
    private int pageSize;
    private String name;
    private String queryJson;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQueryJson() {
		return queryJson;
	}
	public void setQueryJson(String queryJson) {
		this.queryJson = queryJson;
	}
    
}
