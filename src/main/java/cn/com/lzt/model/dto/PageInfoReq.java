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
    private String goodName;
    private String userName;
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
	
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getQueryJson() {
		return queryJson;
	}
	public void setQueryJson(String queryJson) {
		this.queryJson = queryJson;
	}

	@Override
	public String toString() {
		return "PageInfoReq{" +
				"pageNumber=" + pageNumber +
				", pageSize=" + pageSize +
				", goodName='" + goodName + '\'' +
				", userName='" + userName + '\'' +
				", queryJson='" + queryJson + '\'' +
				'}';
	}
}
