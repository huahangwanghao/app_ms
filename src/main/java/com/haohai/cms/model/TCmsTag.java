package com.haohai.cms.model;

import java.util.Date;

public class TCmsTag {
    private Integer tagId;

    private Integer tagParentId;

    private String tagName;

    private Integer dataFlag;

    private String tagLevel;

    private Date crtDate;

    private Date updDate;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getTagParentId() {
        return tagParentId;
    }

    public void setTagParentId(Integer tagParentId) {
        this.tagParentId = tagParentId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }

    public String getTagLevel() {
        return tagLevel;
    }

    public void setTagLevel(String tagLevel) {
        this.tagLevel = tagLevel == null ? null : tagLevel.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }
}