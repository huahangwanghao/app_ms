package cn.com.lzt.model;

import java.util.Date;

public class TCmsGood {
    private Integer goodId;

    private String goodLevel;

    private Integer parentId;

    private String goodName;

    private Integer hasCount;

    private String goodDec;

    private String goodBrand;

    private String goodGuige;

    private Date goodEndTime;

    private String goodDetail;

    private String goodImage;

    private Date crtDate;

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public String getGoodDec() {
        return goodDec;
    }

    public void setGoodDec(String goodDec) {
        this.goodDec = goodDec == null ? null : goodDec.trim();
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand == null ? null : goodBrand.trim();
    }

    public String getGoodGuige() {
        return goodGuige;
    }

    public void setGoodGuige(String goodGuige) {
        this.goodGuige = goodGuige == null ? null : goodGuige.trim();
    }

    public Date getGoodEndTime() {
        return goodEndTime;
    }

    public void setGoodEndTime(Date goodEndTime) {
        this.goodEndTime = goodEndTime;
    }

    public String getGoodDetail() {
        return goodDetail;
    }

    public void setGoodDetail(String goodDetail) {
        this.goodDetail = goodDetail == null ? null : goodDetail.trim();
    }

    public String getGoodImage() {
        return goodImage;
    }

    public void setGoodImage(String goodImage) {
        this.goodImage = goodImage == null ? null : goodImage.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }
}