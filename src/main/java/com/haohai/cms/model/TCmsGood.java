package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.Date;

public class TCmsGood {
    private Integer goodId;

    private String goodLevel;

    private String goodName;

    private Integer hasCount;

    private String goodDesc;

    private String goodSpeci;

    private BigDecimal goodOriginalPrice;

    private BigDecimal goodPromotionPrice;

    private Date goodEndTime;

    private String goodImage;

    private String goodStatus;

    private String dataFlag;

    private Date crtDate;

    private String goodDetail;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodLevel() {
        return goodLevel;
    }

    public void setGoodLevel(String goodLevel) {
        this.goodLevel = goodLevel == null ? null : goodLevel.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Integer getHasCount() {
        return hasCount;
    }

    public void setHasCount(Integer hasCount) {
        this.hasCount = hasCount;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc == null ? null : goodDesc.trim();
    }

    public String getGoodSpeci() {
        return goodSpeci;
    }

    public void setGoodSpeci(String goodSpeci) {
        this.goodSpeci = goodSpeci == null ? null : goodSpeci.trim();
    }

    public BigDecimal getGoodOriginalPrice() {
        return goodOriginalPrice;
    }

    public void setGoodOriginalPrice(BigDecimal goodOriginalPrice) {
        this.goodOriginalPrice = goodOriginalPrice;
    }

    public BigDecimal getGoodPromotionPrice() {
        return goodPromotionPrice;
    }

    public void setGoodPromotionPrice(BigDecimal goodPromotionPrice) {
        this.goodPromotionPrice = goodPromotionPrice;
    }

    public Date getGoodEndTime() {
        return goodEndTime;
    }

    public void setGoodEndTime(Date goodEndTime) {
        this.goodEndTime = goodEndTime;
    }

    public String getGoodImage() {
        return goodImage;
    }

    public void setGoodImage(String goodImage) {
        this.goodImage = goodImage == null ? null : goodImage.trim();
    }

    public String getGoodStatus() {
        return goodStatus;
    }

    public void setGoodStatus(String goodStatus) {
        this.goodStatus = goodStatus == null ? null : goodStatus.trim();
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

    public String getGoodDetail() {
        return goodDetail;
    }

    public void setGoodDetail(String goodDetail) {
        this.goodDetail = goodDetail == null ? null : goodDetail.trim();
    }
}