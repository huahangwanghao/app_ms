package com.haohai.cms.model.dto;/**
 * Created by Administrator on 2017/8/3.
 */

import java.util.Date;

/**
 * 客户请求的dto
 *
 * @author WangH
 * @create 2017-08-03 16:48
 **/
public class CmsCustomerReq extends  PageDto {

        private Integer customerId;

        private String customerName;

        private String customerAcount;

        private String customerPwd;

        private String customerIdno;

        private String customerPhone;

        private String customerEmail;

        private Date crtDate;

        private Date mdfDate;

        private String dataFlag;

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

        public String getCustomerAcount() {
            return customerAcount;
        }

        public void setCustomerAcount(String customerAcount) {
            this.customerAcount = customerAcount == null ? null : customerAcount.trim();
        }

        public String getCustomerPwd() {
            return customerPwd;
        }

        public void setCustomerPwd(String customerPwd) {
            this.customerPwd = customerPwd == null ? null : customerPwd.trim();
        }

        public String getCustomerIdno() {
            return customerIdno;
        }

        public void setCustomerIdno(String customerIdno) {
            this.customerIdno = customerIdno == null ? null : customerIdno.trim();
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone == null ? null : customerPhone.trim();
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail == null ? null : customerEmail.trim();
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

    @Override
    public String toString() {
        return "CmsCustomerReq{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAcount='" + customerAcount + '\'' +
                ", customerPwd='" + customerPwd + '\'' +
                ", customerIdno='" + customerIdno + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", crtDate=" + crtDate +
                ", mdfDate=" + mdfDate +
                ", dataFlag='" + dataFlag + '\'' +
                '}'+super.toString();
    }
}
