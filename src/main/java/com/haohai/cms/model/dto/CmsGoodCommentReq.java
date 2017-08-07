package com.haohai.cms.model.dto;/**
 * Created by Administrator on 2017/7/21.
 */

/**
 * 商品请求入参
 *
 * @author WangH
 * @create 2017-07-21 11:01
 **/
public class CmsGoodCommentReq extends PageDto {
    
    private Long commentId;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "CmsGoodCommentReq{" +
                "commentId=" + commentId +
                '}'+super.toString();
    }
}
