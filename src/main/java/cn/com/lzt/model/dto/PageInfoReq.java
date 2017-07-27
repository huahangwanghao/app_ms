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
    
    private int offset;
    
    private int limit;
    
    private String name;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PageInfoReq{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", name='" + name + '\'' +
                '}';
    }
}
