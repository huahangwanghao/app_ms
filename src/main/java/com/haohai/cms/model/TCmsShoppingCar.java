package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.Date;

public class TCmsShoppingCar {
    private Integer carId;

    private Integer customerId;

    private Integer customerGoodId;

    private Integer orderId;

    private Integer cmsGoodId;

    private String cmsGoodGuige;

    private Integer carGoodCount;

    private String shoppingCarStatus;

    private Date crtDate;

    private Date endDate;

    private BigDecimal goodNowPrice;

    private BigDecimal goodOldPrice;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCmsGoodId() {
        return cmsGoodId;
    }

    public void setCmsGoodId(Integer cmsGoodId) {
        this.cmsGoodId = cmsGoodId;
    }

    public String getCmsGoodGuige() {
        return cmsGoodGuige;
    }

    public void setCmsGoodGuige(String cmsGoodGuige) {
        this.cmsGoodGuige = cmsGoodGuige == null ? null : cmsGoodGuige.trim();
    }

    public Integer getCarGoodCount() {
        return carGoodCount;
    }

    public void setCarGoodCount(Integer carGoodCount) {
        this.carGoodCount = carGoodCount;
    }

    public String getShoppingCarStatus() {
        return shoppingCarStatus;
    }

    public void setShoppingCarStatus(String shoppingCarStatus) {
        this.shoppingCarStatus = shoppingCarStatus == null ? null : shoppingCarStatus.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getGoodNowPrice() {
        return goodNowPrice;
    }

    public void setGoodNowPrice(BigDecimal goodNowPrice) {
        this.goodNowPrice = goodNowPrice;
    }

    public BigDecimal getGoodOldPrice() {
        return goodOldPrice;
    }

    public void setGoodOldPrice(BigDecimal goodOldPrice) {
        this.goodOldPrice = goodOldPrice;
    }
}