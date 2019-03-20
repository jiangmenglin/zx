package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiTypeExample() {
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

        public Criteria andSatIdIsNull() {
            addCriterion("sat_id is null");
            return (Criteria) this;
        }

        public Criteria andSatIdIsNotNull() {
            addCriterion("sat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSatIdEqualTo(Long value) {
            addCriterion("sat_id =", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotEqualTo(Long value) {
            addCriterion("sat_id <>", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdGreaterThan(Long value) {
            addCriterion("sat_id >", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sat_id >=", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdLessThan(Long value) {
            addCriterion("sat_id <", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdLessThanOrEqualTo(Long value) {
            addCriterion("sat_id <=", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdIn(List<Long> values) {
            addCriterion("sat_id in", values, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotIn(List<Long> values) {
            addCriterion("sat_id not in", values, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdBetween(Long value1, Long value2) {
            addCriterion("sat_id between", value1, value2, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotBetween(Long value1, Long value2) {
            addCriterion("sat_id not between", value1, value2, "satId");
            return (Criteria) this;
        }

        public Criteria andSatNameIsNull() {
            addCriterion("sat_name is null");
            return (Criteria) this;
        }

        public Criteria andSatNameIsNotNull() {
            addCriterion("sat_name is not null");
            return (Criteria) this;
        }

        public Criteria andSatNameEqualTo(String value) {
            addCriterion("sat_name =", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotEqualTo(String value) {
            addCriterion("sat_name <>", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameGreaterThan(String value) {
            addCriterion("sat_name >", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameGreaterThanOrEqualTo(String value) {
            addCriterion("sat_name >=", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameLessThan(String value) {
            addCriterion("sat_name <", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameLessThanOrEqualTo(String value) {
            addCriterion("sat_name <=", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameLike(String value) {
            addCriterion("sat_name like", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotLike(String value) {
            addCriterion("sat_name not like", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameIn(List<String> values) {
            addCriterion("sat_name in", values, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotIn(List<String> values) {
            addCriterion("sat_name not in", values, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameBetween(String value1, String value2) {
            addCriterion("sat_name between", value1, value2, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotBetween(String value1, String value2) {
            addCriterion("sat_name not between", value1, value2, "satName");
            return (Criteria) this;
        }

        public Criteria andSatParentIsNull() {
            addCriterion("sat_parent is null");
            return (Criteria) this;
        }

        public Criteria andSatParentIsNotNull() {
            addCriterion("sat_parent is not null");
            return (Criteria) this;
        }

        public Criteria andSatParentEqualTo(Long value) {
            addCriterion("sat_parent =", value, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentNotEqualTo(Long value) {
            addCriterion("sat_parent <>", value, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentGreaterThan(Long value) {
            addCriterion("sat_parent >", value, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentGreaterThanOrEqualTo(Long value) {
            addCriterion("sat_parent >=", value, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentLessThan(Long value) {
            addCriterion("sat_parent <", value, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentLessThanOrEqualTo(Long value) {
            addCriterion("sat_parent <=", value, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentIn(List<Long> values) {
            addCriterion("sat_parent in", values, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentNotIn(List<Long> values) {
            addCriterion("sat_parent not in", values, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentBetween(Long value1, Long value2) {
            addCriterion("sat_parent between", value1, value2, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatParentNotBetween(Long value1, Long value2) {
            addCriterion("sat_parent not between", value1, value2, "satParent");
            return (Criteria) this;
        }

        public Criteria andSatFlagIsNull() {
            addCriterion("sat_flag is null");
            return (Criteria) this;
        }

        public Criteria andSatFlagIsNotNull() {
            addCriterion("sat_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSatFlagEqualTo(String value) {
            addCriterion("sat_flag =", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagNotEqualTo(String value) {
            addCriterion("sat_flag <>", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagGreaterThan(String value) {
            addCriterion("sat_flag >", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sat_flag >=", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagLessThan(String value) {
            addCriterion("sat_flag <", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagLessThanOrEqualTo(String value) {
            addCriterion("sat_flag <=", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagLike(String value) {
            addCriterion("sat_flag like", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagNotLike(String value) {
            addCriterion("sat_flag not like", value, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagIn(List<String> values) {
            addCriterion("sat_flag in", values, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagNotIn(List<String> values) {
            addCriterion("sat_flag not in", values, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagBetween(String value1, String value2) {
            addCriterion("sat_flag between", value1, value2, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatFlagNotBetween(String value1, String value2) {
            addCriterion("sat_flag not between", value1, value2, "satFlag");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeIsNull() {
            addCriterion("sat_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeIsNotNull() {
            addCriterion("sat_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeEqualTo(Date value) {
            addCriterion("sat_update_time =", value, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeNotEqualTo(Date value) {
            addCriterion("sat_update_time <>", value, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeGreaterThan(Date value) {
            addCriterion("sat_update_time >", value, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sat_update_time >=", value, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeLessThan(Date value) {
            addCriterion("sat_update_time <", value, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sat_update_time <=", value, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeIn(List<Date> values) {
            addCriterion("sat_update_time in", values, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeNotIn(List<Date> values) {
            addCriterion("sat_update_time not in", values, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sat_update_time between", value1, value2, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sat_update_time not between", value1, value2, "satUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeIsNull() {
            addCriterion("sat_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeIsNotNull() {
            addCriterion("sat_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeEqualTo(Date value) {
            addCriterion("sat_add_time =", value, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeNotEqualTo(Date value) {
            addCriterion("sat_add_time <>", value, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeGreaterThan(Date value) {
            addCriterion("sat_add_time >", value, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sat_add_time >=", value, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeLessThan(Date value) {
            addCriterion("sat_add_time <", value, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("sat_add_time <=", value, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeIn(List<Date> values) {
            addCriterion("sat_add_time in", values, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeNotIn(List<Date> values) {
            addCriterion("sat_add_time not in", values, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeBetween(Date value1, Date value2) {
            addCriterion("sat_add_time between", value1, value2, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("sat_add_time not between", value1, value2, "satAddTime");
            return (Criteria) this;
        }

        public Criteria andSatStatusIsNull() {
            addCriterion("sat_status is null");
            return (Criteria) this;
        }

        public Criteria andSatStatusIsNotNull() {
            addCriterion("sat_status is not null");
            return (Criteria) this;
        }

        public Criteria andSatStatusEqualTo(Short value) {
            addCriterion("sat_status =", value, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusNotEqualTo(Short value) {
            addCriterion("sat_status <>", value, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusGreaterThan(Short value) {
            addCriterion("sat_status >", value, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sat_status >=", value, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusLessThan(Short value) {
            addCriterion("sat_status <", value, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusLessThanOrEqualTo(Short value) {
            addCriterion("sat_status <=", value, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusIn(List<Short> values) {
            addCriterion("sat_status in", values, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusNotIn(List<Short> values) {
            addCriterion("sat_status not in", values, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusBetween(Short value1, Short value2) {
            addCriterion("sat_status between", value1, value2, "satStatus");
            return (Criteria) this;
        }

        public Criteria andSatStatusNotBetween(Short value1, Short value2) {
            addCriterion("sat_status not between", value1, value2, "satStatus");
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