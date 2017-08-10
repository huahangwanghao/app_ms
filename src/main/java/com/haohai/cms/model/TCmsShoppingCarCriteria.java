package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCmsShoppingCarCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCmsShoppingCarCriteria() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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

        public Criteria andCarGoodCountIsNull() {
            addCriterion("car_good_count is null");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountIsNotNull() {
            addCriterion("car_good_count is not null");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountEqualTo(Integer value) {
            addCriterion("car_good_count =", value, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountNotEqualTo(Integer value) {
            addCriterion("car_good_count <>", value, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountGreaterThan(Integer value) {
            addCriterion("car_good_count >", value, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_good_count >=", value, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountLessThan(Integer value) {
            addCriterion("car_good_count <", value, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("car_good_count <=", value, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountIn(List<Integer> values) {
            addCriterion("car_good_count in", values, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountNotIn(List<Integer> values) {
            addCriterion("car_good_count not in", values, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountBetween(Integer value1, Integer value2) {
            addCriterion("car_good_count between", value1, value2, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andCarGoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("car_good_count not between", value1, value2, "carGoodCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusIsNull() {
            addCriterion("shopping_car_status is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusIsNotNull() {
            addCriterion("shopping_car_status is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusEqualTo(String value) {
            addCriterion("shopping_car_status =", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusNotEqualTo(String value) {
            addCriterion("shopping_car_status <>", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusGreaterThan(String value) {
            addCriterion("shopping_car_status >", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_car_status >=", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusLessThan(String value) {
            addCriterion("shopping_car_status <", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusLessThanOrEqualTo(String value) {
            addCriterion("shopping_car_status <=", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusLike(String value) {
            addCriterion("shopping_car_status like", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusNotLike(String value) {
            addCriterion("shopping_car_status not like", value, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusIn(List<String> values) {
            addCriterion("shopping_car_status in", values, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusNotIn(List<String> values) {
            addCriterion("shopping_car_status not in", values, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusBetween(String value1, String value2) {
            addCriterion("shopping_car_status between", value1, value2, "shoppingCarStatus");
            return (Criteria) this;
        }

        public Criteria andShoppingCarStatusNotBetween(String value1, String value2) {
            addCriterion("shopping_car_status not between", value1, value2, "shoppingCarStatus");
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

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceIsNull() {
            addCriterion("good_now_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceIsNotNull() {
            addCriterion("good_now_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceEqualTo(BigDecimal value) {
            addCriterion("good_now_price =", value, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_now_price <>", value, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceGreaterThan(BigDecimal value) {
            addCriterion("good_now_price >", value, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_now_price >=", value, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceLessThan(BigDecimal value) {
            addCriterion("good_now_price <", value, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_now_price <=", value, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceIn(List<BigDecimal> values) {
            addCriterion("good_now_price in", values, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_now_price not in", values, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_now_price between", value1, value2, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodNowPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_now_price not between", value1, value2, "goodNowPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceIsNull() {
            addCriterion("good_old_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceIsNotNull() {
            addCriterion("good_old_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceEqualTo(BigDecimal value) {
            addCriterion("good_old_price =", value, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_old_price <>", value, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceGreaterThan(BigDecimal value) {
            addCriterion("good_old_price >", value, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_old_price >=", value, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceLessThan(BigDecimal value) {
            addCriterion("good_old_price <", value, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_old_price <=", value, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceIn(List<BigDecimal> values) {
            addCriterion("good_old_price in", values, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_old_price not in", values, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_old_price between", value1, value2, "goodOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOldPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_old_price not between", value1, value2, "goodOldPrice");
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