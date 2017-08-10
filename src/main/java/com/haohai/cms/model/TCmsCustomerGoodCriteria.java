package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCmsCustomerGoodCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCmsCustomerGoodCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCustomerGoodIdIsNull() {
            addCriterion("customer_good_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdIsNotNull() {
            addCriterion("customer_good_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdEqualTo(Integer value) {
            addCriterion("customer_good_id =", value, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdNotEqualTo(Integer value) {
            addCriterion("customer_good_id <>", value, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdGreaterThan(Integer value) {
            addCriterion("customer_good_id >", value, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_good_id >=", value, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdLessThan(Integer value) {
            addCriterion("customer_good_id <", value, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_good_id <=", value, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdIn(List<Integer> values) {
            addCriterion("customer_good_id in", values, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdNotIn(List<Integer> values) {
            addCriterion("customer_good_id not in", values, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_good_id between", value1, value2, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_good_id not between", value1, value2, "customerGoodId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeIsNull() {
            addCriterion("cms_good_guige is null");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeIsNotNull() {
            addCriterion("cms_good_guige is not null");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeEqualTo(String value) {
            addCriterion("cms_good_guige =", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeNotEqualTo(String value) {
            addCriterion("cms_good_guige <>", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeGreaterThan(String value) {
            addCriterion("cms_good_guige >", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("cms_good_guige >=", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeLessThan(String value) {
            addCriterion("cms_good_guige <", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeLessThanOrEqualTo(String value) {
            addCriterion("cms_good_guige <=", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeLike(String value) {
            addCriterion("cms_good_guige like", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeNotLike(String value) {
            addCriterion("cms_good_guige not like", value, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeIn(List<String> values) {
            addCriterion("cms_good_guige in", values, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeNotIn(List<String> values) {
            addCriterion("cms_good_guige not in", values, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeBetween(String value1, String value2) {
            addCriterion("cms_good_guige between", value1, value2, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andCmsGoodGuigeNotBetween(String value1, String value2) {
            addCriterion("cms_good_guige not between", value1, value2, "cmsGoodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldIsNull() {
            addCriterion("good_amount_old is null");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldIsNotNull() {
            addCriterion("good_amount_old is not null");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldEqualTo(BigDecimal value) {
            addCriterion("good_amount_old =", value, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldNotEqualTo(BigDecimal value) {
            addCriterion("good_amount_old <>", value, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldGreaterThan(BigDecimal value) {
            addCriterion("good_amount_old >", value, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_amount_old >=", value, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldLessThan(BigDecimal value) {
            addCriterion("good_amount_old <", value, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_amount_old <=", value, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldIn(List<BigDecimal> values) {
            addCriterion("good_amount_old in", values, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldNotIn(List<BigDecimal> values) {
            addCriterion("good_amount_old not in", values, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_amount_old between", value1, value2, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountOldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_amount_old not between", value1, value2, "goodAmountOld");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowIsNull() {
            addCriterion("good_amount_now is null");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowIsNotNull() {
            addCriterion("good_amount_now is not null");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowEqualTo(BigDecimal value) {
            addCriterion("good_amount_now =", value, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowNotEqualTo(BigDecimal value) {
            addCriterion("good_amount_now <>", value, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowGreaterThan(BigDecimal value) {
            addCriterion("good_amount_now >", value, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_amount_now >=", value, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowLessThan(BigDecimal value) {
            addCriterion("good_amount_now <", value, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_amount_now <=", value, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowIn(List<BigDecimal> values) {
            addCriterion("good_amount_now in", values, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowNotIn(List<BigDecimal> values) {
            addCriterion("good_amount_now not in", values, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_amount_now between", value1, value2, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodAmountNowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_amount_now not between", value1, value2, "goodAmountNow");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcIsNull() {
            addCriterion("good_img_src is null");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcIsNotNull() {
            addCriterion("good_img_src is not null");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcEqualTo(String value) {
            addCriterion("good_img_src =", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcNotEqualTo(String value) {
            addCriterion("good_img_src <>", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcGreaterThan(String value) {
            addCriterion("good_img_src >", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("good_img_src >=", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcLessThan(String value) {
            addCriterion("good_img_src <", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcLessThanOrEqualTo(String value) {
            addCriterion("good_img_src <=", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcLike(String value) {
            addCriterion("good_img_src like", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcNotLike(String value) {
            addCriterion("good_img_src not like", value, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcIn(List<String> values) {
            addCriterion("good_img_src in", values, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcNotIn(List<String> values) {
            addCriterion("good_img_src not in", values, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcBetween(String value1, String value2) {
            addCriterion("good_img_src between", value1, value2, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andGoodImgSrcNotBetween(String value1, String value2) {
            addCriterion("good_img_src not between", value1, value2, "goodImgSrc");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNull() {
            addCriterion("crt_date is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateIsNotNull() {
            addCriterion("crt_date is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateEqualTo(Date value) {
            addCriterion("crt_date =", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotEqualTo(Date value) {
            addCriterion("crt_date <>", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThan(Date value) {
            addCriterion("crt_date >", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_date >=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThan(Date value) {
            addCriterion("crt_date <", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateLessThanOrEqualTo(Date value) {
            addCriterion("crt_date <=", value, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateIn(List<Date> values) {
            addCriterion("crt_date in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotIn(List<Date> values) {
            addCriterion("crt_date not in", values, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateBetween(Date value1, Date value2) {
            addCriterion("crt_date between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andCrtDateNotBetween(Date value1, Date value2) {
            addCriterion("crt_date not between", value1, value2, "crtDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateIsNull() {
            addCriterion("mdf_date is null");
            return (Criteria) this;
        }

        public Criteria andMdfDateIsNotNull() {
            addCriterion("mdf_date is not null");
            return (Criteria) this;
        }

        public Criteria andMdfDateEqualTo(Date value) {
            addCriterion("mdf_date =", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateNotEqualTo(Date value) {
            addCriterion("mdf_date <>", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateGreaterThan(Date value) {
            addCriterion("mdf_date >", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mdf_date >=", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateLessThan(Date value) {
            addCriterion("mdf_date <", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateLessThanOrEqualTo(Date value) {
            addCriterion("mdf_date <=", value, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateIn(List<Date> values) {
            addCriterion("mdf_date in", values, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateNotIn(List<Date> values) {
            addCriterion("mdf_date not in", values, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateBetween(Date value1, Date value2) {
            addCriterion("mdf_date between", value1, value2, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andMdfDateNotBetween(Date value1, Date value2) {
            addCriterion("mdf_date not between", value1, value2, "mdfDate");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdIsNull() {
            addCriterion("cms_good_id is null");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdIsNotNull() {
            addCriterion("cms_good_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdEqualTo(Integer value) {
            addCriterion("cms_good_id =", value, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdNotEqualTo(Integer value) {
            addCriterion("cms_good_id <>", value, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdGreaterThan(Integer value) {
            addCriterion("cms_good_id >", value, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cms_good_id >=", value, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdLessThan(Integer value) {
            addCriterion("cms_good_id <", value, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("cms_good_id <=", value, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdIn(List<Integer> values) {
            addCriterion("cms_good_id in", values, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdNotIn(List<Integer> values) {
            addCriterion("cms_good_id not in", values, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("cms_good_id between", value1, value2, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andCmsGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cms_good_id not between", value1, value2, "cmsGoodId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("express_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("express_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(String value) {
            addCriterion("express_id =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(String value) {
            addCriterion("express_id <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(String value) {
            addCriterion("express_id >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(String value) {
            addCriterion("express_id >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(String value) {
            addCriterion("express_id <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(String value) {
            addCriterion("express_id <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLike(String value) {
            addCriterion("express_id like", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotLike(String value) {
            addCriterion("express_id not like", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<String> values) {
            addCriterion("express_id in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<String> values) {
            addCriterion("express_id not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(String value1, String value2) {
            addCriterion("express_id between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(String value1, String value2) {
            addCriterion("express_id not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressTypeIsNull() {
            addCriterion("express_type is null");
            return (Criteria) this;
        }

        public Criteria andExpressTypeIsNotNull() {
            addCriterion("express_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpressTypeEqualTo(String value) {
            addCriterion("express_type =", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeNotEqualTo(String value) {
            addCriterion("express_type <>", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeGreaterThan(String value) {
            addCriterion("express_type >", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeGreaterThanOrEqualTo(String value) {
            addCriterion("express_type >=", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeLessThan(String value) {
            addCriterion("express_type <", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeLessThanOrEqualTo(String value) {
            addCriterion("express_type <=", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeLike(String value) {
            addCriterion("express_type like", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeNotLike(String value) {
            addCriterion("express_type not like", value, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeIn(List<String> values) {
            addCriterion("express_type in", values, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeNotIn(List<String> values) {
            addCriterion("express_type not in", values, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeBetween(String value1, String value2) {
            addCriterion("express_type between", value1, value2, "expressType");
            return (Criteria) this;
        }

        public Criteria andExpressTypeNotBetween(String value1, String value2) {
            addCriterion("express_type not between", value1, value2, "expressType");
            return (Criteria) this;
        }

        public Criteria andGoodStatusIsNull() {
            addCriterion("good_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodStatusIsNotNull() {
            addCriterion("good_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStatusEqualTo(Integer value) {
            addCriterion("good_status =", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotEqualTo(Integer value) {
            addCriterion("good_status <>", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusGreaterThan(Integer value) {
            addCriterion("good_status >", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_status >=", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusLessThan(Integer value) {
            addCriterion("good_status <", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusLessThanOrEqualTo(Integer value) {
            addCriterion("good_status <=", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusIn(List<Integer> values) {
            addCriterion("good_status in", values, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotIn(List<Integer> values) {
            addCriterion("good_status not in", values, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusBetween(Integer value1, Integer value2) {
            addCriterion("good_status between", value1, value2, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("good_status not between", value1, value2, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNull() {
            addCriterion("good_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNotNull() {
            addCriterion("good_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCountEqualTo(Integer value) {
            addCriterion("good_count =", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotEqualTo(Integer value) {
            addCriterion("good_count <>", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThan(Integer value) {
            addCriterion("good_count >", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_count >=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThan(Integer value) {
            addCriterion("good_count <", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("good_count <=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountIn(List<Integer> values) {
            addCriterion("good_count in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotIn(List<Integer> values) {
            addCriterion("good_count not in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountBetween(Integer value1, Integer value2) {
            addCriterion("good_count between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("good_count not between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andCustomCriteria(String value) {
            addCriterion( "("+ value +")" );
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}