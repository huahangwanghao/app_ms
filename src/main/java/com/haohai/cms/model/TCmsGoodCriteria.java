package com.haohai.cms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCmsGoodCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCmsGoodCriteria() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "CategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "CategoryId");
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

        public Criteria andHasCountIsNull() {
            addCriterion("has_count is null");
            return (Criteria) this;
        }

        public Criteria andHasCountIsNotNull() {
            addCriterion("has_count is not null");
            return (Criteria) this;
        }

        public Criteria andHasCountEqualTo(Integer value) {
            addCriterion("has_count =", value, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountNotEqualTo(Integer value) {
            addCriterion("has_count <>", value, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountGreaterThan(Integer value) {
            addCriterion("has_count >", value, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_count >=", value, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountLessThan(Integer value) {
            addCriterion("has_count <", value, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountLessThanOrEqualTo(Integer value) {
            addCriterion("has_count <=", value, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountIn(List<Integer> values) {
            addCriterion("has_count in", values, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountNotIn(List<Integer> values) {
            addCriterion("has_count not in", values, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountBetween(Integer value1, Integer value2) {
            addCriterion("has_count between", value1, value2, "hasCount");
            return (Criteria) this;
        }

        public Criteria andHasCountNotBetween(Integer value1, Integer value2) {
            addCriterion("has_count not between", value1, value2, "hasCount");
            return (Criteria) this;
        }

        public Criteria andGoodDescIsNull() {
            addCriterion("good_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodDescIsNotNull() {
            addCriterion("good_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDescEqualTo(String value) {
            addCriterion("good_desc =", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotEqualTo(String value) {
            addCriterion("good_desc <>", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescGreaterThan(String value) {
            addCriterion("good_desc >", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescGreaterThanOrEqualTo(String value) {
            addCriterion("good_desc >=", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescLessThan(String value) {
            addCriterion("good_desc <", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescLessThanOrEqualTo(String value) {
            addCriterion("good_desc <=", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescLike(String value) {
            addCriterion("good_desc like", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotLike(String value) {
            addCriterion("good_desc not like", value, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescIn(List<String> values) {
            addCriterion("good_desc in", values, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotIn(List<String> values) {
            addCriterion("good_desc not in", values, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescBetween(String value1, String value2) {
            addCriterion("good_desc between", value1, value2, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodDescNotBetween(String value1, String value2) {
            addCriterion("good_desc not between", value1, value2, "goodDesc");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciIsNull() {
            addCriterion("good_speci is null");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciIsNotNull() {
            addCriterion("good_speci is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciEqualTo(String value) {
            addCriterion("good_speci =", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciNotEqualTo(String value) {
            addCriterion("good_speci <>", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciGreaterThan(String value) {
            addCriterion("good_speci >", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciGreaterThanOrEqualTo(String value) {
            addCriterion("good_speci >=", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciLessThan(String value) {
            addCriterion("good_speci <", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciLessThanOrEqualTo(String value) {
            addCriterion("good_speci <=", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciLike(String value) {
            addCriterion("good_speci like", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciNotLike(String value) {
            addCriterion("good_speci not like", value, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciIn(List<String> values) {
            addCriterion("good_speci in", values, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciNotIn(List<String> values) {
            addCriterion("good_speci not in", values, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciBetween(String value1, String value2) {
            addCriterion("good_speci between", value1, value2, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodSpeciNotBetween(String value1, String value2) {
            addCriterion("good_speci not between", value1, value2, "goodSpeci");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceIsNull() {
            addCriterion("good_original_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceIsNotNull() {
            addCriterion("good_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("good_original_price =", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_original_price <>", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("good_original_price >", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_original_price >=", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceLessThan(BigDecimal value) {
            addCriterion("good_original_price <", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_original_price <=", value, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("good_original_price in", values, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_original_price not in", values, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_original_price between", value1, value2, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_original_price not between", value1, value2, "goodOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceIsNull() {
            addCriterion("good_promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceIsNotNull() {
            addCriterion("good_promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceEqualTo(BigDecimal value) {
            addCriterion("good_promotion_price =", value, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_promotion_price <>", value, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceGreaterThan(BigDecimal value) {
            addCriterion("good_promotion_price >", value, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_promotion_price >=", value, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceLessThan(BigDecimal value) {
            addCriterion("good_promotion_price <", value, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_promotion_price <=", value, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceIn(List<BigDecimal> values) {
            addCriterion("good_promotion_price in", values, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_promotion_price not in", values, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_promotion_price between", value1, value2, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPromotionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_promotion_price not between", value1, value2, "goodPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeIsNull() {
            addCriterion("good_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeIsNotNull() {
            addCriterion("good_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeEqualTo(Date value) {
            addCriterion("good_end_time =", value, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeNotEqualTo(Date value) {
            addCriterion("good_end_time <>", value, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeGreaterThan(Date value) {
            addCriterion("good_end_time >", value, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("good_end_time >=", value, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeLessThan(Date value) {
            addCriterion("good_end_time <", value, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("good_end_time <=", value, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeIn(List<Date> values) {
            addCriterion("good_end_time in", values, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeNotIn(List<Date> values) {
            addCriterion("good_end_time not in", values, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeBetween(Date value1, Date value2) {
            addCriterion("good_end_time between", value1, value2, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("good_end_time not between", value1, value2, "goodEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodImageIsNull() {
            addCriterion("good_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodImageIsNotNull() {
            addCriterion("good_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodImageEqualTo(String value) {
            addCriterion("good_image =", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotEqualTo(String value) {
            addCriterion("good_image <>", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageGreaterThan(String value) {
            addCriterion("good_image >", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageGreaterThanOrEqualTo(String value) {
            addCriterion("good_image >=", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageLessThan(String value) {
            addCriterion("good_image <", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageLessThanOrEqualTo(String value) {
            addCriterion("good_image <=", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageLike(String value) {
            addCriterion("good_image like", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotLike(String value) {
            addCriterion("good_image not like", value, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageIn(List<String> values) {
            addCriterion("good_image in", values, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotIn(List<String> values) {
            addCriterion("good_image not in", values, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageBetween(String value1, String value2) {
            addCriterion("good_image between", value1, value2, "goodImage");
            return (Criteria) this;
        }

        public Criteria andGoodImageNotBetween(String value1, String value2) {
            addCriterion("good_image not between", value1, value2, "goodImage");
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

        public Criteria andGoodStatusEqualTo(String value) {
            addCriterion("good_status =", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotEqualTo(String value) {
            addCriterion("good_status <>", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusGreaterThan(String value) {
            addCriterion("good_status >", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusGreaterThanOrEqualTo(String value) {
            addCriterion("good_status >=", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusLessThan(String value) {
            addCriterion("good_status <", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusLessThanOrEqualTo(String value) {
            addCriterion("good_status <=", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusLike(String value) {
            addCriterion("good_status like", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotLike(String value) {
            addCriterion("good_status not like", value, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusIn(List<String> values) {
            addCriterion("good_status in", values, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotIn(List<String> values) {
            addCriterion("good_status not in", values, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusBetween(String value1, String value2) {
            addCriterion("good_status between", value1, value2, "goodStatus");
            return (Criteria) this;
        }

        public Criteria andGoodStatusNotBetween(String value1, String value2) {
            addCriterion("good_status not between", value1, value2, "goodStatus");
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