package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorExample() {
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

        public Criteria andSeIdIsNull() {
            addCriterion("se_id is null");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNotNull() {
            addCriterion("se_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeIdEqualTo(Long value) {
            addCriterion("se_id =", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotEqualTo(Long value) {
            addCriterion("se_id <>", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThan(Long value) {
            addCriterion("se_id >", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("se_id >=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThan(Long value) {
            addCriterion("se_id <", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThanOrEqualTo(Long value) {
            addCriterion("se_id <=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdIn(List<Long> values) {
            addCriterion("se_id in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotIn(List<Long> values) {
            addCriterion("se_id not in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdBetween(Long value1, Long value2) {
            addCriterion("se_id between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotBetween(Long value1, Long value2) {
            addCriterion("se_id not between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeFlagIsNull() {
            addCriterion("se_flag is null");
            return (Criteria) this;
        }

        public Criteria andSeFlagIsNotNull() {
            addCriterion("se_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSeFlagEqualTo(String value) {
            addCriterion("se_flag =", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagNotEqualTo(String value) {
            addCriterion("se_flag <>", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagGreaterThan(String value) {
            addCriterion("se_flag >", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("se_flag >=", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagLessThan(String value) {
            addCriterion("se_flag <", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagLessThanOrEqualTo(String value) {
            addCriterion("se_flag <=", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagLike(String value) {
            addCriterion("se_flag like", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagNotLike(String value) {
            addCriterion("se_flag not like", value, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagIn(List<String> values) {
            addCriterion("se_flag in", values, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagNotIn(List<String> values) {
            addCriterion("se_flag not in", values, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagBetween(String value1, String value2) {
            addCriterion("se_flag between", value1, value2, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeFlagNotBetween(String value1, String value2) {
            addCriterion("se_flag not between", value1, value2, "seFlag");
            return (Criteria) this;
        }

        public Criteria andSeCountIsNull() {
            addCriterion("se_count is null");
            return (Criteria) this;
        }

        public Criteria andSeCountIsNotNull() {
            addCriterion("se_count is not null");
            return (Criteria) this;
        }

        public Criteria andSeCountEqualTo(Integer value) {
            addCriterion("se_count =", value, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountNotEqualTo(Integer value) {
            addCriterion("se_count <>", value, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountGreaterThan(Integer value) {
            addCriterion("se_count >", value, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_count >=", value, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountLessThan(Integer value) {
            addCriterion("se_count <", value, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountLessThanOrEqualTo(Integer value) {
            addCriterion("se_count <=", value, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountIn(List<Integer> values) {
            addCriterion("se_count in", values, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountNotIn(List<Integer> values) {
            addCriterion("se_count not in", values, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountBetween(Integer value1, Integer value2) {
            addCriterion("se_count between", value1, value2, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("se_count not between", value1, value2, "seCount");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeIsNull() {
            addCriterion("se_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeIsNotNull() {
            addCriterion("se_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeEqualTo(Date value) {
            addCriterion("se_update_time =", value, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeNotEqualTo(Date value) {
            addCriterion("se_update_time <>", value, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeGreaterThan(Date value) {
            addCriterion("se_update_time >", value, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("se_update_time >=", value, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeLessThan(Date value) {
            addCriterion("se_update_time <", value, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("se_update_time <=", value, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeIn(List<Date> values) {
            addCriterion("se_update_time in", values, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeNotIn(List<Date> values) {
            addCriterion("se_update_time not in", values, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("se_update_time between", value1, value2, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("se_update_time not between", value1, value2, "seUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeIsNull() {
            addCriterion("se_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeIsNotNull() {
            addCriterion("se_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeEqualTo(Date value) {
            addCriterion("se_add_time =", value, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeNotEqualTo(Date value) {
            addCriterion("se_add_time <>", value, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeGreaterThan(Date value) {
            addCriterion("se_add_time >", value, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("se_add_time >=", value, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeLessThan(Date value) {
            addCriterion("se_add_time <", value, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("se_add_time <=", value, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeIn(List<Date> values) {
            addCriterion("se_add_time in", values, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeNotIn(List<Date> values) {
            addCriterion("se_add_time not in", values, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeBetween(Date value1, Date value2) {
            addCriterion("se_add_time between", value1, value2, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("se_add_time not between", value1, value2, "seAddTime");
            return (Criteria) this;
        }

        public Criteria andSeStatusIsNull() {
            addCriterion("se_status is null");
            return (Criteria) this;
        }

        public Criteria andSeStatusIsNotNull() {
            addCriterion("se_status is not null");
            return (Criteria) this;
        }

        public Criteria andSeStatusEqualTo(Short value) {
            addCriterion("se_status =", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusNotEqualTo(Short value) {
            addCriterion("se_status <>", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusGreaterThan(Short value) {
            addCriterion("se_status >", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("se_status >=", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusLessThan(Short value) {
            addCriterion("se_status <", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusLessThanOrEqualTo(Short value) {
            addCriterion("se_status <=", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusIn(List<Short> values) {
            addCriterion("se_status in", values, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusNotIn(List<Short> values) {
            addCriterion("se_status not in", values, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusBetween(Short value1, Short value2) {
            addCriterion("se_status between", value1, value2, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusNotBetween(Short value1, Short value2) {
            addCriterion("se_status not between", value1, value2, "seStatus");
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