package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebHelpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebHelpExample() {
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

        public Criteria andTbwhIdIsNull() {
            addCriterion("tbwh_id is null");
            return (Criteria) this;
        }

        public Criteria andTbwhIdIsNotNull() {
            addCriterion("tbwh_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbwhIdEqualTo(Long value) {
            addCriterion("tbwh_id =", value, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdNotEqualTo(Long value) {
            addCriterion("tbwh_id <>", value, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdGreaterThan(Long value) {
            addCriterion("tbwh_id >", value, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbwh_id >=", value, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdLessThan(Long value) {
            addCriterion("tbwh_id <", value, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdLessThanOrEqualTo(Long value) {
            addCriterion("tbwh_id <=", value, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdIn(List<Long> values) {
            addCriterion("tbwh_id in", values, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdNotIn(List<Long> values) {
            addCriterion("tbwh_id not in", values, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdBetween(Long value1, Long value2) {
            addCriterion("tbwh_id between", value1, value2, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhIdNotBetween(Long value1, Long value2) {
            addCriterion("tbwh_id not between", value1, value2, "tbwhId");
            return (Criteria) this;
        }

        public Criteria andTbwhNameIsNull() {
            addCriterion("tbwh_name is null");
            return (Criteria) this;
        }

        public Criteria andTbwhNameIsNotNull() {
            addCriterion("tbwh_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbwhNameEqualTo(String value) {
            addCriterion("tbwh_name =", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameNotEqualTo(String value) {
            addCriterion("tbwh_name <>", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameGreaterThan(String value) {
            addCriterion("tbwh_name >", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbwh_name >=", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameLessThan(String value) {
            addCriterion("tbwh_name <", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameLessThanOrEqualTo(String value) {
            addCriterion("tbwh_name <=", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameLike(String value) {
            addCriterion("tbwh_name like", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameNotLike(String value) {
            addCriterion("tbwh_name not like", value, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameIn(List<String> values) {
            addCriterion("tbwh_name in", values, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameNotIn(List<String> values) {
            addCriterion("tbwh_name not in", values, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameBetween(String value1, String value2) {
            addCriterion("tbwh_name between", value1, value2, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhNameNotBetween(String value1, String value2) {
            addCriterion("tbwh_name not between", value1, value2, "tbwhName");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeIsNull() {
            addCriterion("tbwh_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeIsNotNull() {
            addCriterion("tbwh_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeEqualTo(Date value) {
            addCriterion("tbwh_add_time =", value, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeNotEqualTo(Date value) {
            addCriterion("tbwh_add_time <>", value, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeGreaterThan(Date value) {
            addCriterion("tbwh_add_time >", value, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwh_add_time >=", value, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeLessThan(Date value) {
            addCriterion("tbwh_add_time <", value, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwh_add_time <=", value, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeIn(List<Date> values) {
            addCriterion("tbwh_add_time in", values, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeNotIn(List<Date> values) {
            addCriterion("tbwh_add_time not in", values, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbwh_add_time between", value1, value2, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwh_add_time not between", value1, value2, "tbwhAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeIsNull() {
            addCriterion("tbwh_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeIsNotNull() {
            addCriterion("tbwh_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeEqualTo(Date value) {
            addCriterion("tbwh_update_time =", value, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbwh_update_time <>", value, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeGreaterThan(Date value) {
            addCriterion("tbwh_update_time >", value, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwh_update_time >=", value, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeLessThan(Date value) {
            addCriterion("tbwh_update_time <", value, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwh_update_time <=", value, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeIn(List<Date> values) {
            addCriterion("tbwh_update_time in", values, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbwh_update_time not in", values, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbwh_update_time between", value1, value2, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwh_update_time not between", value1, value2, "tbwhUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusIsNull() {
            addCriterion("tbwh_status is null");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusIsNotNull() {
            addCriterion("tbwh_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusEqualTo(Byte value) {
            addCriterion("tbwh_status =", value, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusNotEqualTo(Byte value) {
            addCriterion("tbwh_status <>", value, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusGreaterThan(Byte value) {
            addCriterion("tbwh_status >", value, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbwh_status >=", value, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusLessThan(Byte value) {
            addCriterion("tbwh_status <", value, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbwh_status <=", value, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusIn(List<Byte> values) {
            addCriterion("tbwh_status in", values, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusNotIn(List<Byte> values) {
            addCriterion("tbwh_status not in", values, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbwh_status between", value1, value2, "tbwhStatus");
            return (Criteria) this;
        }

        public Criteria andTbwhStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbwh_status not between", value1, value2, "tbwhStatus");
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