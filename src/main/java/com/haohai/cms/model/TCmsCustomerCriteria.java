package com.haohai.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCmsCustomerCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCmsCustomerCriteria() {
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountIsNull() {
            addCriterion("customer_acount is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountIsNotNull() {
            addCriterion("customer_acount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountEqualTo(String value) {
            addCriterion("customer_acount =", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountNotEqualTo(String value) {
            addCriterion("customer_acount <>", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountGreaterThan(String value) {
            addCriterion("customer_acount >", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_acount >=", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountLessThan(String value) {
            addCriterion("customer_acount <", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountLessThanOrEqualTo(String value) {
            addCriterion("customer_acount <=", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountLike(String value) {
            addCriterion("customer_acount like", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountNotLike(String value) {
            addCriterion("customer_acount not like", value, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountIn(List<String> values) {
            addCriterion("customer_acount in", values, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountNotIn(List<String> values) {
            addCriterion("customer_acount not in", values, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountBetween(String value1, String value2) {
            addCriterion("customer_acount between", value1, value2, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerAcountNotBetween(String value1, String value2) {
            addCriterion("customer_acount not between", value1, value2, "customerAcount");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdIsNull() {
            addCriterion("customer_pwd is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdIsNotNull() {
            addCriterion("customer_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdEqualTo(String value) {
            addCriterion("customer_pwd =", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotEqualTo(String value) {
            addCriterion("customer_pwd <>", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdGreaterThan(String value) {
            addCriterion("customer_pwd >", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_pwd >=", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdLessThan(String value) {
            addCriterion("customer_pwd <", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdLessThanOrEqualTo(String value) {
            addCriterion("customer_pwd <=", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdLike(String value) {
            addCriterion("customer_pwd like", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotLike(String value) {
            addCriterion("customer_pwd not like", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdIn(List<String> values) {
            addCriterion("customer_pwd in", values, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotIn(List<String> values) {
            addCriterion("customer_pwd not in", values, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdBetween(String value1, String value2) {
            addCriterion("customer_pwd between", value1, value2, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotBetween(String value1, String value2) {
            addCriterion("customer_pwd not between", value1, value2, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoIsNull() {
            addCriterion("customer_idno is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoIsNotNull() {
            addCriterion("customer_idno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoEqualTo(String value) {
            addCriterion("customer_idno =", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoNotEqualTo(String value) {
            addCriterion("customer_idno <>", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoGreaterThan(String value) {
            addCriterion("customer_idno >", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_idno >=", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoLessThan(String value) {
            addCriterion("customer_idno <", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoLessThanOrEqualTo(String value) {
            addCriterion("customer_idno <=", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoLike(String value) {
            addCriterion("customer_idno like", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoNotLike(String value) {
            addCriterion("customer_idno not like", value, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoIn(List<String> values) {
            addCriterion("customer_idno in", values, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoNotIn(List<String> values) {
            addCriterion("customer_idno not in", values, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoBetween(String value1, String value2) {
            addCriterion("customer_idno between", value1, value2, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerIdnoNotBetween(String value1, String value2) {
            addCriterion("customer_idno not between", value1, value2, "customerIdno");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("customer_email not between", value1, value2, "customerEmail");
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

        public Criteria andDataFlagIsNull() {
            addCriterion("data_flag is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("data_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(String value) {
            addCriterion("data_flag =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(String value) {
            addCriterion("data_flag <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(String value) {
            addCriterion("data_flag >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(String value) {
            addCriterion("data_flag >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(String value) {
            addCriterion("data_flag <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(String value) {
            addCriterion("data_flag <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLike(String value) {
            addCriterion("data_flag like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotLike(String value) {
            addCriterion("data_flag not like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<String> values) {
            addCriterion("data_flag in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<String> values) {
            addCriterion("data_flag not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(String value1, String value2) {
            addCriterion("data_flag between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(String value1, String value2) {
            addCriterion("data_flag not between", value1, value2, "dataFlag");
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