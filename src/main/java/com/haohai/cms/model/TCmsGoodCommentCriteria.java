package com.haohai.cms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCmsGoodCommentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCmsGoodCommentCriteria() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
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

        public Criteria andCommentStartIsNull() {
            addCriterion("comment_start is null");
            return (Criteria) this;
        }

        public Criteria andCommentStartIsNotNull() {
            addCriterion("comment_start is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStartEqualTo(String value) {
            addCriterion("comment_start =", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartNotEqualTo(String value) {
            addCriterion("comment_start <>", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartGreaterThan(String value) {
            addCriterion("comment_start >", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartGreaterThanOrEqualTo(String value) {
            addCriterion("comment_start >=", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartLessThan(String value) {
            addCriterion("comment_start <", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartLessThanOrEqualTo(String value) {
            addCriterion("comment_start <=", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartLike(String value) {
            addCriterion("comment_start like", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartNotLike(String value) {
            addCriterion("comment_start not like", value, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartIn(List<String> values) {
            addCriterion("comment_start in", values, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartNotIn(List<String> values) {
            addCriterion("comment_start not in", values, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartBetween(String value1, String value2) {
            addCriterion("comment_start between", value1, value2, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentStartNotBetween(String value1, String value2) {
            addCriterion("comment_start not between", value1, value2, "commentStart");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerIsNull() {
            addCriterion("comment_content_answer is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerIsNotNull() {
            addCriterion("comment_content_answer is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerEqualTo(String value) {
            addCriterion("comment_content_answer =", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerNotEqualTo(String value) {
            addCriterion("comment_content_answer <>", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerGreaterThan(String value) {
            addCriterion("comment_content_answer >", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content_answer >=", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerLessThan(String value) {
            addCriterion("comment_content_answer <", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerLessThanOrEqualTo(String value) {
            addCriterion("comment_content_answer <=", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerLike(String value) {
            addCriterion("comment_content_answer like", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerNotLike(String value) {
            addCriterion("comment_content_answer not like", value, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerIn(List<String> values) {
            addCriterion("comment_content_answer in", values, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerNotIn(List<String> values) {
            addCriterion("comment_content_answer not in", values, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerBetween(String value1, String value2) {
            addCriterion("comment_content_answer between", value1, value2, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswerNotBetween(String value1, String value2) {
            addCriterion("comment_content_answer not between", value1, value2, "commentContentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentContent1IsNull() {
            addCriterion("comment_content1 is null");
            return (Criteria) this;
        }

        public Criteria andCommentContent1IsNotNull() {
            addCriterion("comment_content1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContent1EqualTo(String value) {
            addCriterion("comment_content1 =", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1NotEqualTo(String value) {
            addCriterion("comment_content1 <>", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1GreaterThan(String value) {
            addCriterion("comment_content1 >", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1GreaterThanOrEqualTo(String value) {
            addCriterion("comment_content1 >=", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1LessThan(String value) {
            addCriterion("comment_content1 <", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1LessThanOrEqualTo(String value) {
            addCriterion("comment_content1 <=", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1Like(String value) {
            addCriterion("comment_content1 like", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1NotLike(String value) {
            addCriterion("comment_content1 not like", value, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1In(List<String> values) {
            addCriterion("comment_content1 in", values, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1NotIn(List<String> values) {
            addCriterion("comment_content1 not in", values, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1Between(String value1, String value2) {
            addCriterion("comment_content1 between", value1, value2, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContent1NotBetween(String value1, String value2) {
            addCriterion("comment_content1 not between", value1, value2, "commentContent1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1IsNull() {
            addCriterion("comment_content_answer1 is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1IsNotNull() {
            addCriterion("comment_content_answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1EqualTo(String value) {
            addCriterion("comment_content_answer1 =", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1NotEqualTo(String value) {
            addCriterion("comment_content_answer1 <>", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1GreaterThan(String value) {
            addCriterion("comment_content_answer1 >", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1GreaterThanOrEqualTo(String value) {
            addCriterion("comment_content_answer1 >=", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1LessThan(String value) {
            addCriterion("comment_content_answer1 <", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1LessThanOrEqualTo(String value) {
            addCriterion("comment_content_answer1 <=", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1Like(String value) {
            addCriterion("comment_content_answer1 like", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1NotLike(String value) {
            addCriterion("comment_content_answer1 not like", value, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1In(List<String> values) {
            addCriterion("comment_content_answer1 in", values, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1NotIn(List<String> values) {
            addCriterion("comment_content_answer1 not in", values, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1Between(String value1, String value2) {
            addCriterion("comment_content_answer1 between", value1, value2, "commentContentAnswer1");
            return (Criteria) this;
        }

        public Criteria andCommentContentAnswer1NotBetween(String value1, String value2) {
            addCriterion("comment_content_answer1 not between", value1, value2, "commentContentAnswer1");
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