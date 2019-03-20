package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RetroactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RetroactExample() {
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

        public Criteria andTbrIdIsNull() {
            addCriterion("tbr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbrIdIsNotNull() {
            addCriterion("tbr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbrIdEqualTo(Integer value) {
            addCriterion("tbr_id =", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotEqualTo(Integer value) {
            addCriterion("tbr_id <>", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThan(Integer value) {
            addCriterion("tbr_id >", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_id >=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThan(Integer value) {
            addCriterion("tbr_id <", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_id <=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdIn(List<Integer> values) {
            addCriterion("tbr_id in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotIn(List<Integer> values) {
            addCriterion("tbr_id not in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdBetween(Integer value1, Integer value2) {
            addCriterion("tbr_id between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_id not between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrMobileIsNull() {
            addCriterion("tbr_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTbrMobileIsNotNull() {
            addCriterion("tbr_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTbrMobileEqualTo(String value) {
            addCriterion("tbr_mobile =", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotEqualTo(String value) {
            addCriterion("tbr_mobile <>", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileGreaterThan(String value) {
            addCriterion("tbr_mobile >", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_mobile >=", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileLessThan(String value) {
            addCriterion("tbr_mobile <", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileLessThanOrEqualTo(String value) {
            addCriterion("tbr_mobile <=", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileLike(String value) {
            addCriterion("tbr_mobile like", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotLike(String value) {
            addCriterion("tbr_mobile not like", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileIn(List<String> values) {
            addCriterion("tbr_mobile in", values, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotIn(List<String> values) {
            addCriterion("tbr_mobile not in", values, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileBetween(String value1, String value2) {
            addCriterion("tbr_mobile between", value1, value2, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotBetween(String value1, String value2) {
            addCriterion("tbr_mobile not between", value1, value2, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrNameIsNull() {
            addCriterion("tbr_name is null");
            return (Criteria) this;
        }

        public Criteria andTbrNameIsNotNull() {
            addCriterion("tbr_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbrNameEqualTo(String value) {
            addCriterion("tbr_name =", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotEqualTo(String value) {
            addCriterion("tbr_name <>", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameGreaterThan(String value) {
            addCriterion("tbr_name >", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_name >=", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLessThan(String value) {
            addCriterion("tbr_name <", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLessThanOrEqualTo(String value) {
            addCriterion("tbr_name <=", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLike(String value) {
            addCriterion("tbr_name like", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotLike(String value) {
            addCriterion("tbr_name not like", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameIn(List<String> values) {
            addCriterion("tbr_name in", values, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotIn(List<String> values) {
            addCriterion("tbr_name not in", values, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameBetween(String value1, String value2) {
            addCriterion("tbr_name between", value1, value2, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotBetween(String value1, String value2) {
            addCriterion("tbr_name not between", value1, value2, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryIsNull() {
            addCriterion("tbr_category is null");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryIsNotNull() {
            addCriterion("tbr_category is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryEqualTo(Integer value) {
            addCriterion("tbr_category =", value, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryNotEqualTo(Integer value) {
            addCriterion("tbr_category <>", value, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryGreaterThan(Integer value) {
            addCriterion("tbr_category >", value, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_category >=", value, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryLessThan(Integer value) {
            addCriterion("tbr_category <", value, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_category <=", value, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryIn(List<Integer> values) {
            addCriterion("tbr_category in", values, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryNotIn(List<Integer> values) {
            addCriterion("tbr_category not in", values, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryBetween(Integer value1, Integer value2) {
            addCriterion("tbr_category between", value1, value2, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_category not between", value1, value2, "tbrCategory");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNull() {
            addCriterion("tbr_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNotNull() {
            addCriterion("tbr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkEqualTo(String value) {
            addCriterion("tbr_remark =", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotEqualTo(String value) {
            addCriterion("tbr_remark <>", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThan(String value) {
            addCriterion("tbr_remark >", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_remark >=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThan(String value) {
            addCriterion("tbr_remark <", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbr_remark <=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLike(String value) {
            addCriterion("tbr_remark like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotLike(String value) {
            addCriterion("tbr_remark not like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIn(List<String> values) {
            addCriterion("tbr_remark in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotIn(List<String> values) {
            addCriterion("tbr_remark not in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkBetween(String value1, String value2) {
            addCriterion("tbr_remark between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotBetween(String value1, String value2) {
            addCriterion("tbr_remark not between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrImagesIsNull() {
            addCriterion("tbr_images is null");
            return (Criteria) this;
        }

        public Criteria andTbrImagesIsNotNull() {
            addCriterion("tbr_images is not null");
            return (Criteria) this;
        }

        public Criteria andTbrImagesEqualTo(String value) {
            addCriterion("tbr_images =", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesNotEqualTo(String value) {
            addCriterion("tbr_images <>", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesGreaterThan(String value) {
            addCriterion("tbr_images >", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_images >=", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesLessThan(String value) {
            addCriterion("tbr_images <", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesLessThanOrEqualTo(String value) {
            addCriterion("tbr_images <=", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesLike(String value) {
            addCriterion("tbr_images like", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesNotLike(String value) {
            addCriterion("tbr_images not like", value, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesIn(List<String> values) {
            addCriterion("tbr_images in", values, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesNotIn(List<String> values) {
            addCriterion("tbr_images not in", values, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesBetween(String value1, String value2) {
            addCriterion("tbr_images between", value1, value2, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrImagesNotBetween(String value1, String value2) {
            addCriterion("tbr_images not between", value1, value2, "tbrImages");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIsNull() {
            addCriterion("tbr_order is null");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIsNotNull() {
            addCriterion("tbr_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbrOrderEqualTo(Long value) {
            addCriterion("tbr_order =", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotEqualTo(Long value) {
            addCriterion("tbr_order <>", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderGreaterThan(Long value) {
            addCriterion("tbr_order >", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_order >=", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderLessThan(Long value) {
            addCriterion("tbr_order <", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbr_order <=", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIn(List<Long> values) {
            addCriterion("tbr_order in", values, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotIn(List<Long> values) {
            addCriterion("tbr_order not in", values, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderBetween(Long value1, Long value2) {
            addCriterion("tbr_order between", value1, value2, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbr_order not between", value1, value2, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNull() {
            addCriterion("tbr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNotNull() {
            addCriterion("tbr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeEqualTo(Date value) {
            addCriterion("tbr_add_time =", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotEqualTo(Date value) {
            addCriterion("tbr_add_time <>", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThan(Date value) {
            addCriterion("tbr_add_time >", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time >=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThan(Date value) {
            addCriterion("tbr_add_time <", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time <=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIn(List<Date> values) {
            addCriterion("tbr_add_time in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotIn(List<Date> values) {
            addCriterion("tbr_add_time not in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time not between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNull() {
            addCriterion("tbr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNotNull() {
            addCriterion("tbr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeEqualTo(Date value) {
            addCriterion("tbr_update_time =", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbr_update_time <>", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThan(Date value) {
            addCriterion("tbr_update_time >", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time >=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThan(Date value) {
            addCriterion("tbr_update_time <", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time <=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIn(List<Date> values) {
            addCriterion("tbr_update_time in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbr_update_time not in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time not between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNull() {
            addCriterion("tbr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNotNull() {
            addCriterion("tbr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusEqualTo(Byte value) {
            addCriterion("tbr_status =", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotEqualTo(Byte value) {
            addCriterion("tbr_status <>", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThan(Byte value) {
            addCriterion("tbr_status >", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_status >=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThan(Byte value) {
            addCriterion("tbr_status <", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_status <=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIn(List<Byte> values) {
            addCriterion("tbr_status in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotIn(List<Byte> values) {
            addCriterion("tbr_status not in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbr_status between", value1, value2, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_status not between", value1, value2, "tbrStatus");
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