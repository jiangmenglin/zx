package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqlExample() {
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

        public Criteria andSsIdIsNull() {
            addCriterion("ss_id is null");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNotNull() {
            addCriterion("ss_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsIdEqualTo(Long value) {
            addCriterion("ss_id =", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotEqualTo(Long value) {
            addCriterion("ss_id <>", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThan(Long value) {
            addCriterion("ss_id >", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ss_id >=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThan(Long value) {
            addCriterion("ss_id <", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThanOrEqualTo(Long value) {
            addCriterion("ss_id <=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdIn(List<Long> values) {
            addCriterion("ss_id in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotIn(List<Long> values) {
            addCriterion("ss_id not in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdBetween(Long value1, Long value2) {
            addCriterion("ss_id between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotBetween(Long value1, Long value2) {
            addCriterion("ss_id not between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsNameIsNull() {
            addCriterion("ss_name is null");
            return (Criteria) this;
        }

        public Criteria andSsNameIsNotNull() {
            addCriterion("ss_name is not null");
            return (Criteria) this;
        }

        public Criteria andSsNameEqualTo(String value) {
            addCriterion("ss_name =", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotEqualTo(String value) {
            addCriterion("ss_name <>", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameGreaterThan(String value) {
            addCriterion("ss_name >", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ss_name >=", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameLessThan(String value) {
            addCriterion("ss_name <", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameLessThanOrEqualTo(String value) {
            addCriterion("ss_name <=", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameLike(String value) {
            addCriterion("ss_name like", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotLike(String value) {
            addCriterion("ss_name not like", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameIn(List<String> values) {
            addCriterion("ss_name in", values, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotIn(List<String> values) {
            addCriterion("ss_name not in", values, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameBetween(String value1, String value2) {
            addCriterion("ss_name between", value1, value2, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotBetween(String value1, String value2) {
            addCriterion("ss_name not between", value1, value2, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsSqlIsNull() {
            addCriterion("ss_sql is null");
            return (Criteria) this;
        }

        public Criteria andSsSqlIsNotNull() {
            addCriterion("ss_sql is not null");
            return (Criteria) this;
        }

        public Criteria andSsSqlEqualTo(String value) {
            addCriterion("ss_sql =", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlNotEqualTo(String value) {
            addCriterion("ss_sql <>", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlGreaterThan(String value) {
            addCriterion("ss_sql >", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlGreaterThanOrEqualTo(String value) {
            addCriterion("ss_sql >=", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlLessThan(String value) {
            addCriterion("ss_sql <", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlLessThanOrEqualTo(String value) {
            addCriterion("ss_sql <=", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlLike(String value) {
            addCriterion("ss_sql like", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlNotLike(String value) {
            addCriterion("ss_sql not like", value, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlIn(List<String> values) {
            addCriterion("ss_sql in", values, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlNotIn(List<String> values) {
            addCriterion("ss_sql not in", values, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlBetween(String value1, String value2) {
            addCriterion("ss_sql between", value1, value2, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsSqlNotBetween(String value1, String value2) {
            addCriterion("ss_sql not between", value1, value2, "ssSql");
            return (Criteria) this;
        }

        public Criteria andSsIntervalIsNull() {
            addCriterion("ss_interval is null");
            return (Criteria) this;
        }

        public Criteria andSsIntervalIsNotNull() {
            addCriterion("ss_interval is not null");
            return (Criteria) this;
        }

        public Criteria andSsIntervalEqualTo(Integer value) {
            addCriterion("ss_interval =", value, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalNotEqualTo(Integer value) {
            addCriterion("ss_interval <>", value, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalGreaterThan(Integer value) {
            addCriterion("ss_interval >", value, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ss_interval >=", value, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalLessThan(Integer value) {
            addCriterion("ss_interval <", value, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("ss_interval <=", value, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalIn(List<Integer> values) {
            addCriterion("ss_interval in", values, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalNotIn(List<Integer> values) {
            addCriterion("ss_interval not in", values, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalBetween(Integer value1, Integer value2) {
            addCriterion("ss_interval between", value1, value2, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("ss_interval not between", value1, value2, "ssInterval");
            return (Criteria) this;
        }

        public Criteria andSsLastIsNull() {
            addCriterion("ss_last is null");
            return (Criteria) this;
        }

        public Criteria andSsLastIsNotNull() {
            addCriterion("ss_last is not null");
            return (Criteria) this;
        }

        public Criteria andSsLastEqualTo(Date value) {
            addCriterion("ss_last =", value, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastNotEqualTo(Date value) {
            addCriterion("ss_last <>", value, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastGreaterThan(Date value) {
            addCriterion("ss_last >", value, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_last >=", value, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastLessThan(Date value) {
            addCriterion("ss_last <", value, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastLessThanOrEqualTo(Date value) {
            addCriterion("ss_last <=", value, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastIn(List<Date> values) {
            addCriterion("ss_last in", values, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastNotIn(List<Date> values) {
            addCriterion("ss_last not in", values, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastBetween(Date value1, Date value2) {
            addCriterion("ss_last between", value1, value2, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsLastNotBetween(Date value1, Date value2) {
            addCriterion("ss_last not between", value1, value2, "ssLast");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeIsNull() {
            addCriterion("ss_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeIsNotNull() {
            addCriterion("ss_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeEqualTo(Date value) {
            addCriterion("ss_update_time =", value, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeNotEqualTo(Date value) {
            addCriterion("ss_update_time <>", value, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeGreaterThan(Date value) {
            addCriterion("ss_update_time >", value, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_update_time >=", value, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeLessThan(Date value) {
            addCriterion("ss_update_time <", value, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ss_update_time <=", value, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeIn(List<Date> values) {
            addCriterion("ss_update_time in", values, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeNotIn(List<Date> values) {
            addCriterion("ss_update_time not in", values, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ss_update_time between", value1, value2, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ss_update_time not between", value1, value2, "ssUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeIsNull() {
            addCriterion("ss_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeIsNotNull() {
            addCriterion("ss_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeEqualTo(Date value) {
            addCriterion("ss_add_time =", value, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeNotEqualTo(Date value) {
            addCriterion("ss_add_time <>", value, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeGreaterThan(Date value) {
            addCriterion("ss_add_time >", value, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_add_time >=", value, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeLessThan(Date value) {
            addCriterion("ss_add_time <", value, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ss_add_time <=", value, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeIn(List<Date> values) {
            addCriterion("ss_add_time in", values, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeNotIn(List<Date> values) {
            addCriterion("ss_add_time not in", values, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeBetween(Date value1, Date value2) {
            addCriterion("ss_add_time between", value1, value2, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ss_add_time not between", value1, value2, "ssAddTime");
            return (Criteria) this;
        }

        public Criteria andSsStatusIsNull() {
            addCriterion("ss_status is null");
            return (Criteria) this;
        }

        public Criteria andSsStatusIsNotNull() {
            addCriterion("ss_status is not null");
            return (Criteria) this;
        }

        public Criteria andSsStatusEqualTo(Short value) {
            addCriterion("ss_status =", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusNotEqualTo(Short value) {
            addCriterion("ss_status <>", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusGreaterThan(Short value) {
            addCriterion("ss_status >", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ss_status >=", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusLessThan(Short value) {
            addCriterion("ss_status <", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusLessThanOrEqualTo(Short value) {
            addCriterion("ss_status <=", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusIn(List<Short> values) {
            addCriterion("ss_status in", values, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusNotIn(List<Short> values) {
            addCriterion("ss_status not in", values, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusBetween(Short value1, Short value2) {
            addCriterion("ss_status between", value1, value2, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusNotBetween(Short value1, Short value2) {
            addCriterion("ss_status not between", value1, value2, "ssStatus");
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