package cn.com.lzt.model;

import java.util.Date;

public class TCmsShoppingCar {
    private Integer carId;

    private Integer customerId;

    private Integer customerGoodId;

    private Integer orderId;

    private Integer cmsGoodId;

    private String cmsGoodGuige;

    private String shoppingCarStatus;

    private Date crtDate;

    private Date endDate;

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
}