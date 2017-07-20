package cn.com.lzt.model;

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

        public Criteria andGoodLevelIsNull() {
            addCriterion("good_level is null");
            return (Criteria) this;
        }

        public Criteria andGoodLevelIsNotNull() {
            addCriterion("good_level is not null");
            return (Criteria) this;
        }

        public Criteria andGoodLevelEqualTo(String value) {
            addCriterion("good_level =", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelNotEqualTo(String value) {
            addCriterion("good_level <>", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelGreaterThan(String value) {
            addCriterion("good_level >", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelGreaterThanOrEqualTo(String value) {
            addCriterion("good_level >=", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelLessThan(String value) {
            addCriterion("good_level <", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelLessThanOrEqualTo(String value) {
            addCriterion("good_level <=", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelLike(String value) {
            addCriterion("good_level like", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelNotLike(String value) {
            addCriterion("good_level not like", value, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelIn(List<String> values) {
            addCriterion("good_level in", values, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelNotIn(List<String> values) {
            addCriterion("good_level not in", values, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelBetween(String value1, String value2) {
            addCriterion("good_level between", value1, value2, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andGoodLevelNotBetween(String value1, String value2) {
            addCriterion("good_level not between", value1, value2, "goodLevel");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andGoodDecIsNull() {
            addCriterion("good_dec is null");
            return (Criteria) this;
        }

        public Criteria andGoodDecIsNotNull() {
            addCriterion("good_dec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDecEqualTo(String value) {
            addCriterion("good_dec =", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecNotEqualTo(String value) {
            addCriterion("good_dec <>", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecGreaterThan(String value) {
            addCriterion("good_dec >", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecGreaterThanOrEqualTo(String value) {
            addCriterion("good_dec >=", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecLessThan(String value) {
            addCriterion("good_dec <", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecLessThanOrEqualTo(String value) {
            addCriterion("good_dec <=", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecLike(String value) {
            addCriterion("good_dec like", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecNotLike(String value) {
            addCriterion("good_dec not like", value, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecIn(List<String> values) {
            addCriterion("good_dec in", values, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecNotIn(List<String> values) {
            addCriterion("good_dec not in", values, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecBetween(String value1, String value2) {
            addCriterion("good_dec between", value1, value2, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodDecNotBetween(String value1, String value2) {
            addCriterion("good_dec not between", value1, value2, "goodDec");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNull() {
            addCriterion("good_brand is null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNotNull() {
            addCriterion("good_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandEqualTo(String value) {
            addCriterion("good_brand =", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotEqualTo(String value) {
            addCriterion("good_brand <>", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThan(String value) {
            addCriterion("good_brand >", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThanOrEqualTo(String value) {
            addCriterion("good_brand >=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThan(String value) {
            addCriterion("good_brand <", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThanOrEqualTo(String value) {
            addCriterion("good_brand <=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLike(String value) {
            addCriterion("good_brand like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotLike(String value) {
            addCriterion("good_brand not like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIn(List<String> values) {
            addCriterion("good_brand in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotIn(List<String> values) {
            addCriterion("good_brand not in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandBetween(String value1, String value2) {
            addCriterion("good_brand between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotBetween(String value1, String value2) {
            addCriterion("good_brand not between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeIsNull() {
            addCriterion("good_guige is null");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeIsNotNull() {
            addCriterion("good_guige is not null");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeEqualTo(String value) {
            addCriterion("good_guige =", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeNotEqualTo(String value) {
            addCriterion("good_guige <>", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeGreaterThan(String value) {
            addCriterion("good_guige >", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("good_guige >=", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeLessThan(String value) {
            addCriterion("good_guige <", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeLessThanOrEqualTo(String value) {
            addCriterion("good_guige <=", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeLike(String value) {
            addCriterion("good_guige like", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeNotLike(String value) {
            addCriterion("good_guige not like", value, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeIn(List<String> values) {
            addCriterion("good_guige in", values, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeNotIn(List<String> values) {
            addCriterion("good_guige not in", values, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeBetween(String value1, String value2) {
            addCriterion("good_guige between", value1, value2, "goodGuige");
            return (Criteria) this;
        }

        public Criteria andGoodGuigeNotBetween(String value1, String value2) {
            addCriterion("good_guige not between", value1, value2, "goodGuige");
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

        public Criteria andGoodDetailIsNull() {
            addCriterion("good_detail is null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailIsNotNull() {
            addCriterion("good_detail is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDetailEqualTo(String value) {
            addCriterion("good_detail =", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailNotEqualTo(String value) {
            addCriterion("good_detail <>", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailGreaterThan(String value) {
            addCriterion("good_detail >", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailGreaterThanOrEqualTo(String value) {
            addCriterion("good_detail >=", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailLessThan(String value) {
            addCriterion("good_detail <", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailLessThanOrEqualTo(String value) {
            addCriterion("good_detail <=", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailLike(String value) {
            addCriterion("good_detail like", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailNotLike(String value) {
            addCriterion("good_detail not like", value, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailIn(List<String> values) {
            addCriterion("good_detail in", values, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailNotIn(List<String> values) {
            addCriterion("good_detail not in", values, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailBetween(String value1, String value2) {
            addCriterion("good_detail between", value1, value2, "goodDetail");
            return (Criteria) this;
        }

        public Criteria andGoodDetailNotBetween(String value1, String value2) {
            addCriterion("good_detail not between", value1, value2, "goodDetail");
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