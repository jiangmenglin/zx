package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorExample() {
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

        public Criteria andTbcIdIsNull() {
            addCriterion("tbc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcIdIsNotNull() {
            addCriterion("tbc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcIdEqualTo(Integer value) {
            addCriterion("tbc_id =", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotEqualTo(Integer value) {
            addCriterion("tbc_id <>", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdGreaterThan(Integer value) {
            addCriterion("tbc_id >", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_id >=", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdLessThan(Integer value) {
            addCriterion("tbc_id <", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_id <=", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdIn(List<Integer> values) {
            addCriterion("tbc_id in", values, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotIn(List<Integer> values) {
            addCriterion("tbc_id not in", values, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdBetween(Integer value1, Integer value2) {
            addCriterion("tbc_id between", value1, value2, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_id not between", value1, value2, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcNameIsNull() {
            addCriterion("tbc_name is null");
            return (Criteria) this;
        }

        public Criteria andTbcNameIsNotNull() {
            addCriterion("tbc_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbcNameEqualTo(String value) {
            addCriterion("tbc_name =", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameNotEqualTo(String value) {
            addCriterion("tbc_name <>", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameGreaterThan(String value) {
            addCriterion("tbc_name >", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_name >=", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameLessThan(String value) {
            addCriterion("tbc_name <", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameLessThanOrEqualTo(String value) {
            addCriterion("tbc_name <=", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameLike(String value) {
            addCriterion("tbc_name like", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameNotLike(String value) {
            addCriterion("tbc_name not like", value, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameIn(List<String> values) {
            addCriterion("tbc_name in", values, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameNotIn(List<String> values) {
            addCriterion("tbc_name not in", values, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameBetween(String value1, String value2) {
            addCriterion("tbc_name between", value1, value2, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcNameNotBetween(String value1, String value2) {
            addCriterion("tbc_name not between", value1, value2, "tbcName");
            return (Criteria) this;
        }

        public Criteria andTbcModelIsNull() {
            addCriterion("tbc_model is null");
            return (Criteria) this;
        }

        public Criteria andTbcModelIsNotNull() {
            addCriterion("tbc_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbcModelEqualTo(Long value) {
            addCriterion("tbc_model =", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotEqualTo(Long value) {
            addCriterion("tbc_model <>", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelGreaterThan(Long value) {
            addCriterion("tbc_model >", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelGreaterThanOrEqualTo(Long value) {
            addCriterion("tbc_model >=", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelLessThan(Long value) {
            addCriterion("tbc_model <", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelLessThanOrEqualTo(Long value) {
            addCriterion("tbc_model <=", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelIn(List<Long> values) {
            addCriterion("tbc_model in", values, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotIn(List<Long> values) {
            addCriterion("tbc_model not in", values, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelBetween(Long value1, Long value2) {
            addCriterion("tbc_model between", value1, value2, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotBetween(Long value1, Long value2) {
            addCriterion("tbc_model not between", value1, value2, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIsNull() {
            addCriterion("tbc_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIsNotNull() {
            addCriterion("tbc_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbcFlagEqualTo(String value) {
            addCriterion("tbc_flag =", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotEqualTo(String value) {
            addCriterion("tbc_flag <>", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagGreaterThan(String value) {
            addCriterion("tbc_flag >", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_flag >=", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLessThan(String value) {
            addCriterion("tbc_flag <", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLessThanOrEqualTo(String value) {
            addCriterion("tbc_flag <=", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLike(String value) {
            addCriterion("tbc_flag like", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotLike(String value) {
            addCriterion("tbc_flag not like", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIn(List<String> values) {
            addCriterion("tbc_flag in", values, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotIn(List<String> values) {
            addCriterion("tbc_flag not in", values, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagBetween(String value1, String value2) {
            addCriterion("tbc_flag between", value1, value2, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotBetween(String value1, String value2) {
            addCriterion("tbc_flag not between", value1, value2, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcImageIsNull() {
            addCriterion("tbc_image is null");
            return (Criteria) this;
        }

        public Criteria andTbcImageIsNotNull() {
            addCriterion("tbc_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbcImageEqualTo(String value) {
            addCriterion("tbc_image =", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageNotEqualTo(String value) {
            addCriterion("tbc_image <>", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageGreaterThan(String value) {
            addCriterion("tbc_image >", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_image >=", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageLessThan(String value) {
            addCriterion("tbc_image <", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageLessThanOrEqualTo(String value) {
            addCriterion("tbc_image <=", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageLike(String value) {
            addCriterion("tbc_image like", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageNotLike(String value) {
            addCriterion("tbc_image not like", value, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageIn(List<String> values) {
            addCriterion("tbc_image in", values, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageNotIn(List<String> values) {
            addCriterion("tbc_image not in", values, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageBetween(String value1, String value2) {
            addCriterion("tbc_image between", value1, value2, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcImageNotBetween(String value1, String value2) {
            addCriterion("tbc_image not between", value1, value2, "tbcImage");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIsNull() {
            addCriterion("tbc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIsNotNull() {
            addCriterion("tbc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeEqualTo(Date value) {
            addCriterion("tbc_update_time =", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbc_update_time <>", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeGreaterThan(Date value) {
            addCriterion("tbc_update_time >", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_update_time >=", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeLessThan(Date value) {
            addCriterion("tbc_update_time <", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_update_time <=", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIn(List<Date> values) {
            addCriterion("tbc_update_time in", values, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbc_update_time not in", values, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_update_time between", value1, value2, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_update_time not between", value1, value2, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIsNull() {
            addCriterion("tbc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIsNotNull() {
            addCriterion("tbc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeEqualTo(Date value) {
            addCriterion("tbc_add_time =", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotEqualTo(Date value) {
            addCriterion("tbc_add_time <>", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeGreaterThan(Date value) {
            addCriterion("tbc_add_time >", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_add_time >=", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeLessThan(Date value) {
            addCriterion("tbc_add_time <", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_add_time <=", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIn(List<Date> values) {
            addCriterion("tbc_add_time in", values, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotIn(List<Date> values) {
            addCriterion("tbc_add_time not in", values, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_add_time between", value1, value2, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_add_time not between", value1, value2, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIsNull() {
            addCriterion("tbc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIsNotNull() {
            addCriterion("tbc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusEqualTo(Byte value) {
            addCriterion("tbc_status =", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotEqualTo(Byte value) {
            addCriterion("tbc_status <>", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusGreaterThan(Byte value) {
            addCriterion("tbc_status >", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_status >=", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusLessThan(Byte value) {
            addCriterion("tbc_status <", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_status <=", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIn(List<Byte> values) {
            addCriterion("tbc_status in", values, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotIn(List<Byte> values) {
            addCriterion("tbc_status not in", values, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status between", value1, value2, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status not between", value1, value2, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
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