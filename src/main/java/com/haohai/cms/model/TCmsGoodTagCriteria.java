package com.haohai.cms.model;

import java.util.ArrayList;
import java.util.List;

public class TCmsGoodTagCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCmsGoodTagCriteria() {
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

        public Criteria andGoodTagIdIsNull() {
            addCriterion("good_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdIsNotNull() {
            addCriterion("good_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdEqualTo(Integer value) {
            addCriterion("good_tag_id =", value, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdNotEqualTo(Integer value) {
            addCriterion("good_tag_id <>", value, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdGreaterThan(Integer value) {
            addCriterion("good_tag_id >", value, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_tag_id >=", value, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdLessThan(Integer value) {
            addCriterion("good_tag_id <", value, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_tag_id <=", value, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdIn(List<Integer> values) {
            addCriterion("good_tag_id in", values, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdNotIn(List<Integer> values) {
            addCriterion("good_tag_id not in", values, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdBetween(Integer value1, Integer value2) {
            addCriterion("good_tag_id between", value1, value2, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_tag_id not between", value1, value2, "goodTagId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Integer value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Integer value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Integer value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Integer value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Integer> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Integer> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Integer value1, Integer value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortIsNull() {
            addCriterion("good_tag_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortIsNotNull() {
            addCriterion("good_tag_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortEqualTo(Integer value) {
            addCriterion("good_tag_sort =", value, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortNotEqualTo(Integer value) {
            addCriterion("good_tag_sort <>", value, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortGreaterThan(Integer value) {
            addCriterion("good_tag_sort >", value, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_tag_sort >=", value, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortLessThan(Integer value) {
            addCriterion("good_tag_sort <", value, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortLessThanOrEqualTo(Integer value) {
            addCriterion("good_tag_sort <=", value, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortIn(List<Integer> values) {
            addCriterion("good_tag_sort in", values, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortNotIn(List<Integer> values) {
            addCriterion("good_tag_sort not in", values, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortBetween(Integer value1, Integer value2) {
            addCriterion("good_tag_sort between", value1, value2, "goodTagSort");
            return (Criteria) this;
        }

        public Criteria andGoodTagSortNotBetween(Integer value1, Integer value2) {
            addCriterion("good_tag_sort not between", value1, value2, "goodTagSort");
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