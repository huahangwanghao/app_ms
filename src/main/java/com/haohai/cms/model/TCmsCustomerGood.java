package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.Date;

public class TCmsCustomerGood {
    private Integer customerGoodId;

    private Integer customerId;

    private Integer orderId;

    private String goodName;

    private String cmsGoodGuige;

    private BigDecimal goodAmountOld;

    private BigDecimal goodAmountNow;

    private String goodImgSrc;

    private Date crtDate;

    private Date mdfDate;

    private Integer cmsGoodId;

    private String expressId;

    private String expressType;

    private Integer goodStatus;

    private Integer goodCount;

    public Integer getCustomerGoodId() {
        return customerGoodId;
    }

    public void setCustomerGoodId(Integer customerGoodId) {
        this.customerGoodId = customerGoodId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getCmsGoodGuige() {
        return cmsGoodGuige;
    }

    public void setCmsGoodGuige(String cmsGoodGuige) {
        this.cmsGoodGuige = cmsGoodGuige == null ? null : cmsGoodGuige.trim();
    }

    public BigDecimal getGoodAmountOld() {
        return goodAmountOld;
    }

    public void setGoodAmountOld(BigDecimal goodAmountOld) {
        this.goodAmountOld = goodAmountOld;
    }

    public BigDecimal getGoodAmountNow() {
        return goodAmountNow;
    }

    public void setGoodAmountNow(BigDecimal goodAmountNow) {
        this.goodAmountNow = goodAmountNow;
    }

    public String getGoodImgSrc() {
        return goodImgSrc;
    }

    public void setGoodImgSrc(String goodImgSrc) {
        this.goodImgSrc = goodImgSrc == null ? null : goodImgSrc.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public Date getMdfDate() {
        return mdfDate;
    }

    public void setMdfDate(Date mdfDate) {
        this.mdfDate = mdfDate;
    }

    public Integer getCmsGoodId() {
        return cmsGoodId;
    }

    public void setCmsGoodId(Integer cmsGoodId) {
        this.cmsGoodId = cmsGoodId;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId == null ? null : expressId.trim();
    }

    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType == null ? null : expressType.trim();
    }

    public Integer getGoodStatus() {
        return goodStatus;
    }

    public void setGoodStatus(Integer goodStatus) {
        this.goodStatus = goodStatus;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }
}