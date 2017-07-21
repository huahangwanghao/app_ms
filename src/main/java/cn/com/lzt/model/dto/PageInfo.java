package cn.com.lzt.model.dto;/**
 * Created by Administrator on 2017/7/21.
 */

/**
 * 分页查询的功能
 *
 * @author WangH
 * @create 2017-07-21 11:03
 **/
public class PageInfo {
    
    private int pageSize;
    
    private int pageNo;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
