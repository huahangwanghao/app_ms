package com.haohai.cms.model;

import java.util.Date;

public class TCmsGoodComment {
    private Long commentId;

    private Integer customerId;

    private Integer customerGoodId;

    private Integer cmsGoodId;

    private String commentStart;

    private String commentContent;

    private String commentContentAnswer;

    private String commentContent1;

    private String commentContentAnswer1;

    private String dataFlag;

    private Date crtDate;
    
    private String customerName;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerGoodId() {
        return customerGoodId;
    }

    public void setCustomerGoodId(Integer customerGoodId) {
        this.customerGoodId = customerGoodId;
    }

    public Integer getCmsGoodId() {
        return cmsGoodId;
    }

    public void setCmsGoodId(Integer cmsGoodId) {
        this.cmsGoodId = cmsGoodId;
    }

    public String getCommentStart() {
        return commentStart;
    }

    public void setCommentStart(String commentStart) {
        this.commentStart = commentStart == null ? null : commentStart.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentContentAnswer() {
        return commentContentAnswer;
    }

    public void setCommentContentAnswer(String commentContentAnswer) {
        this.commentContentAnswer = commentContentAnswer == null ? null : commentContentAnswer.trim();
    }

    public String getCommentContent1() {
        return commentContent1;
    }

    public void setCommentContent1(String commentContent1) {
        this.commentContent1 = commentContent1 == null ? null : commentContent1.trim();
    }

    public String getCommentContentAnswer1() {
        return commentContentAnswer1;
    }

    public void setCommentContentAnswer1(String commentContentAnswer1) {
        this.commentContentAnswer1 = commentContentAnswer1 == null ? null : commentContentAnswer1.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "TCmsGoodComment{" +
                "commentId=" + commentId +
                ", customerId=" + customerId +
                ", customerGoodId=" + customerGoodId +
                ", cmsGoodId=" + cmsGoodId +
                ", commentStart='" + commentStart + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentContentAnswer='" + commentContentAnswer + '\'' +
                ", commentContent1='" + commentContent1 + '\'' +
                ", commentContentAnswer1='" + commentContentAnswer1 + '\'' +
                ", dataFlag='" + dataFlag + '\'' +
                ", crtDate=" + crtDate +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}