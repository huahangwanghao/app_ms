package cn.com.lzt.model.dto;/**
 * Created by Administrator on 2017/7/21.
 */

/**
 * 商品请求入参
 *
 * @author WangH
 * @create 2017-07-21 11:01
 **/
public class CmsGoodReq extends PageInfoReq {
    
    private Integer goodId;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    @Override
    public String toString() {
        return "CmsGoodReq{" +
                "goodId=" + goodId +
                '}';
    }
}
