package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.Date;

public class TCmsCustomerOrder {
    private Integer orderId;

    private Integer customerId;

    private String customerName;

    private String customerPhone;

    private String customerAddress;

    private BigDecimal orderAmount;

    private Date crtDate;

    private Date mdfDate;

    private String dataFlag;
    
    private String  goodName;
    private Integer customerGoodId;
    private String expressType;
    private String expressId;
    private Integer goodStatus;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
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

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getCustomerGoodId() {
        return customerGoodId;
    }

    public void setCustomerGoodId(Integer customerGoodId) {
        this.customerGoodId = customerGoodId;
    }

    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public Integer getGoodStatus() {
        return goodStatus;
    }

    public void setGoodStatus(Integer goodStatus) {
        this.goodStatus = goodStatus;
    }

    @Override
    public String toString() {
        return "TCmsCustomerOrder{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", orderAmount=" + orderAmount +
                ", crtDate=" + crtDate +
                ", mdfDate=" + mdfDate +
                ", dataFlag='" + dataFlag + '\'' +
                ", goodName='" + goodName + '\'' +
                ", customerGoodId=" + customerGoodId +
                ", expressType='" + expressType + '\'' +
                ", expressId='" + expressId + '\'' +
                ", goodStatus=" + goodStatus +
                '}';
    }
}