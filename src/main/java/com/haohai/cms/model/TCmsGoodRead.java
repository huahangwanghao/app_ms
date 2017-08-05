package com.haohai.cms.model;

import java.util.Date;

public class TCmsGoodRead {
    private Long readId;

    private Integer customerId;

    private Integer cmsGoodId;

    private Date crtDate;

    public Long getReadId() {
        return readId;
    }

    public void setReadId(Long readId) {
        this.readId = readId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCmsGoodId() {
        return cmsGoodId;
    }

    public void setCmsGoodId(Integer cmsGoodId) {
        this.cmsGoodId = cmsGoodId;
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }
}