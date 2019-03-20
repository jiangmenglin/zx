package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventTypeExample() {
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

        public Criteria andTbetIdIsNull() {
            addCriterion("tbet_id is null");
            return (Criteria) this;
        }

        public Criteria andTbetIdIsNotNull() {
            addCriterion("tbet_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbetIdEqualTo(Integer value) {
            addCriterion("tbet_id =", value, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdNotEqualTo(Integer value) {
            addCriterion("tbet_id <>", value, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdGreaterThan(Integer value) {
            addCriterion("tbet_id >", value, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbet_id >=", value, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdLessThan(Integer value) {
            addCriterion("tbet_id <", value, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbet_id <=", value, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdIn(List<Integer> values) {
            addCriterion("tbet_id in", values, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdNotIn(List<Integer> values) {
            addCriterion("tbet_id not in", values, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdBetween(Integer value1, Integer value2) {
            addCriterion("tbet_id between", value1, value2, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbet_id not between", value1, value2, "tbetId");
            return (Criteria) this;
        }

        public Criteria andTbetNameIsNull() {
            addCriterion("tbet_name is null");
            return (Criteria) this;
        }

        public Criteria andTbetNameIsNotNull() {
            addCriterion("tbet_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbetNameEqualTo(String value) {
            addCriterion("tbet_name =", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameNotEqualTo(String value) {
            addCriterion("tbet_name <>", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameGreaterThan(String value) {
            addCriterion("tbet_name >", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbet_name >=", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameLessThan(String value) {
            addCriterion("tbet_name <", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameLessThanOrEqualTo(String value) {
            addCriterion("tbet_name <=", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameLike(String value) {
            addCriterion("tbet_name like", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameNotLike(String value) {
            addCriterion("tbet_name not like", value, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameIn(List<String> values) {
            addCriterion("tbet_name in", values, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameNotIn(List<String> values) {
            addCriterion("tbet_name not in", values, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameBetween(String value1, String value2) {
            addCriterion("tbet_name between", value1, value2, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetNameNotBetween(String value1, String value2) {
            addCriterion("tbet_name not between", value1, value2, "tbetName");
            return (Criteria) this;
        }

        public Criteria andTbetFlagIsNull() {
            addCriterion("tbet_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbetFlagIsNotNull() {
            addCriterion("tbet_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbetFlagEqualTo(String value) {
            addCriterion("tbet_flag =", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagNotEqualTo(String value) {
            addCriterion("tbet_flag <>", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagGreaterThan(String value) {
            addCriterion("tbet_flag >", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbet_flag >=", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagLessThan(String value) {
            addCriterion("tbet_flag <", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagLessThanOrEqualTo(String value) {
            addCriterion("tbet_flag <=", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagLike(String value) {
            addCriterion("tbet_flag like", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagNotLike(String value) {
            addCriterion("tbet_flag not like", value, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagIn(List<String> values) {
            addCriterion("tbet_flag in", values, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagNotIn(List<String> values) {
            addCriterion("tbet_flag not in", values, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagBetween(String value1, String value2) {
            addCriterion("tbet_flag between", value1, value2, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetFlagNotBetween(String value1, String value2) {
            addCriterion("tbet_flag not between", value1, value2, "tbetFlag");
            return (Criteria) this;
        }

        public Criteria andTbetTypeIsNull() {
            addCriterion("tbet_type is null");
            return (Criteria) this;
        }

        public Criteria andTbetTypeIsNotNull() {
            addCriterion("tbet_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbetTypeEqualTo(Short value) {
            addCriterion("tbet_type =", value, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeNotEqualTo(Short value) {
            addCriterion("tbet_type <>", value, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeGreaterThan(Short value) {
            addCriterion("tbet_type >", value, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbet_type >=", value, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeLessThan(Short value) {
            addCriterion("tbet_type <", value, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbet_type <=", value, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeIn(List<Short> values) {
            addCriterion("tbet_type in", values, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeNotIn(List<Short> values) {
            addCriterion("tbet_type not in", values, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeBetween(Short value1, Short value2) {
            addCriterion("tbet_type between", value1, value2, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbet_type not between", value1, value2, "tbetType");
            return (Criteria) this;
        }

        public Criteria andTbetSupportIsNull() {
            addCriterion("tbet_support is null");
            return (Criteria) this;
        }

        public Criteria andTbetSupportIsNotNull() {
            addCriterion("tbet_support is not null");
            return (Criteria) this;
        }

        public Criteria andTbetSupportEqualTo(Short value) {
            addCriterion("tbet_support =", value, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportNotEqualTo(Short value) {
            addCriterion("tbet_support <>", value, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportGreaterThan(Short value) {
            addCriterion("tbet_support >", value, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportGreaterThanOrEqualTo(Short value) {
            addCriterion("tbet_support >=", value, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportLessThan(Short value) {
            addCriterion("tbet_support <", value, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportLessThanOrEqualTo(Short value) {
            addCriterion("tbet_support <=", value, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportIn(List<Short> values) {
            addCriterion("tbet_support in", values, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportNotIn(List<Short> values) {
            addCriterion("tbet_support not in", values, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportBetween(Short value1, Short value2) {
            addCriterion("tbet_support between", value1, value2, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetSupportNotBetween(Short value1, Short value2) {
            addCriterion("tbet_support not between", value1, value2, "tbetSupport");
            return (Criteria) this;
        }

        public Criteria andTbetModelIsNull() {
            addCriterion("tbet_model is null");
            return (Criteria) this;
        }

        public Criteria andTbetModelIsNotNull() {
            addCriterion("tbet_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbetModelEqualTo(String value) {
            addCriterion("tbet_model =", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelNotEqualTo(String value) {
            addCriterion("tbet_model <>", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelGreaterThan(String value) {
            addCriterion("tbet_model >", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelGreaterThanOrEqualTo(String value) {
            addCriterion("tbet_model >=", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelLessThan(String value) {
            addCriterion("tbet_model <", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelLessThanOrEqualTo(String value) {
            addCriterion("tbet_model <=", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelLike(String value) {
            addCriterion("tbet_model like", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelNotLike(String value) {
            addCriterion("tbet_model not like", value, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelIn(List<String> values) {
            addCriterion("tbet_model in", values, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelNotIn(List<String> values) {
            addCriterion("tbet_model not in", values, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelBetween(String value1, String value2) {
            addCriterion("tbet_model between", value1, value2, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetModelNotBetween(String value1, String value2) {
            addCriterion("tbet_model not between", value1, value2, "tbetModel");
            return (Criteria) this;
        }

        public Criteria andTbetProfileIsNull() {
            addCriterion("tbet_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbetProfileIsNotNull() {
            addCriterion("tbet_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbetProfileEqualTo(String value) {
            addCriterion("tbet_profile =", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileNotEqualTo(String value) {
            addCriterion("tbet_profile <>", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileGreaterThan(String value) {
            addCriterion("tbet_profile >", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbet_profile >=", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileLessThan(String value) {
            addCriterion("tbet_profile <", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileLessThanOrEqualTo(String value) {
            addCriterion("tbet_profile <=", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileLike(String value) {
            addCriterion("tbet_profile like", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileNotLike(String value) {
            addCriterion("tbet_profile not like", value, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileIn(List<String> values) {
            addCriterion("tbet_profile in", values, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileNotIn(List<String> values) {
            addCriterion("tbet_profile not in", values, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileBetween(String value1, String value2) {
            addCriterion("tbet_profile between", value1, value2, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetProfileNotBetween(String value1, String value2) {
            addCriterion("tbet_profile not between", value1, value2, "tbetProfile");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeIsNull() {
            addCriterion("tbet_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeIsNotNull() {
            addCriterion("tbet_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeEqualTo(Date value) {
            addCriterion("tbet_update_time =", value, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbet_update_time <>", value, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeGreaterThan(Date value) {
            addCriterion("tbet_update_time >", value, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbet_update_time >=", value, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeLessThan(Date value) {
            addCriterion("tbet_update_time <", value, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbet_update_time <=", value, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeIn(List<Date> values) {
            addCriterion("tbet_update_time in", values, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbet_update_time not in", values, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbet_update_time between", value1, value2, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbet_update_time not between", value1, value2, "tbetUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeIsNull() {
            addCriterion("tbet_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeIsNotNull() {
            addCriterion("tbet_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeEqualTo(Date value) {
            addCriterion("tbet_add_time =", value, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeNotEqualTo(Date value) {
            addCriterion("tbet_add_time <>", value, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeGreaterThan(Date value) {
            addCriterion("tbet_add_time >", value, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbet_add_time >=", value, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeLessThan(Date value) {
            addCriterion("tbet_add_time <", value, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbet_add_time <=", value, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeIn(List<Date> values) {
            addCriterion("tbet_add_time in", values, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeNotIn(List<Date> values) {
            addCriterion("tbet_add_time not in", values, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbet_add_time between", value1, value2, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbet_add_time not between", value1, value2, "tbetAddTime");
            return (Criteria) this;
        }

        public Criteria andTbetStatusIsNull() {
            addCriterion("tbet_status is null");
            return (Criteria) this;
        }

        public Criteria andTbetStatusIsNotNull() {
            addCriterion("tbet_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbetStatusEqualTo(Byte value) {
            addCriterion("tbet_status =", value, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusNotEqualTo(Byte value) {
            addCriterion("tbet_status <>", value, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusGreaterThan(Byte value) {
            addCriterion("tbet_status >", value, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbet_status >=", value, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusLessThan(Byte value) {
            addCriterion("tbet_status <", value, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbet_status <=", value, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusIn(List<Byte> values) {
            addCriterion("tbet_status in", values, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusNotIn(List<Byte> values) {
            addCriterion("tbet_status not in", values, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbet_status between", value1, value2, "tbetStatus");
            return (Criteria) this;
        }

        public Criteria andTbetStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbet_status not between", value1, value2, "tbetStatus");
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