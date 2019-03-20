package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankTypeExample() {
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

        public Criteria andTbbtIdIsNull() {
            addCriterion("tbbt_id is null");
            return (Criteria) this;
        }

        public Criteria andTbbtIdIsNotNull() {
            addCriterion("tbbt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtIdEqualTo(Long value) {
            addCriterion("tbbt_id =", value, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdNotEqualTo(Long value) {
            addCriterion("tbbt_id <>", value, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdGreaterThan(Long value) {
            addCriterion("tbbt_id >", value, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbbt_id >=", value, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdLessThan(Long value) {
            addCriterion("tbbt_id <", value, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdLessThanOrEqualTo(Long value) {
            addCriterion("tbbt_id <=", value, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdIn(List<Long> values) {
            addCriterion("tbbt_id in", values, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdNotIn(List<Long> values) {
            addCriterion("tbbt_id not in", values, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdBetween(Long value1, Long value2) {
            addCriterion("tbbt_id between", value1, value2, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtIdNotBetween(Long value1, Long value2) {
            addCriterion("tbbt_id not between", value1, value2, "tbbtId");
            return (Criteria) this;
        }

        public Criteria andTbbtNameIsNull() {
            addCriterion("tbbt_name is null");
            return (Criteria) this;
        }

        public Criteria andTbbtNameIsNotNull() {
            addCriterion("tbbt_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtNameEqualTo(String value) {
            addCriterion("tbbt_name =", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameNotEqualTo(String value) {
            addCriterion("tbbt_name <>", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameGreaterThan(String value) {
            addCriterion("tbbt_name >", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbbt_name >=", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameLessThan(String value) {
            addCriterion("tbbt_name <", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameLessThanOrEqualTo(String value) {
            addCriterion("tbbt_name <=", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameLike(String value) {
            addCriterion("tbbt_name like", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameNotLike(String value) {
            addCriterion("tbbt_name not like", value, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameIn(List<String> values) {
            addCriterion("tbbt_name in", values, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameNotIn(List<String> values) {
            addCriterion("tbbt_name not in", values, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameBetween(String value1, String value2) {
            addCriterion("tbbt_name between", value1, value2, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtNameNotBetween(String value1, String value2) {
            addCriterion("tbbt_name not between", value1, value2, "tbbtName");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagIsNull() {
            addCriterion("tbbt_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagIsNotNull() {
            addCriterion("tbbt_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagEqualTo(String value) {
            addCriterion("tbbt_flag =", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagNotEqualTo(String value) {
            addCriterion("tbbt_flag <>", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagGreaterThan(String value) {
            addCriterion("tbbt_flag >", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbbt_flag >=", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagLessThan(String value) {
            addCriterion("tbbt_flag <", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagLessThanOrEqualTo(String value) {
            addCriterion("tbbt_flag <=", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagLike(String value) {
            addCriterion("tbbt_flag like", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagNotLike(String value) {
            addCriterion("tbbt_flag not like", value, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagIn(List<String> values) {
            addCriterion("tbbt_flag in", values, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagNotIn(List<String> values) {
            addCriterion("tbbt_flag not in", values, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagBetween(String value1, String value2) {
            addCriterion("tbbt_flag between", value1, value2, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtFlagNotBetween(String value1, String value2) {
            addCriterion("tbbt_flag not between", value1, value2, "tbbtFlag");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityIsNull() {
            addCriterion("tbbt_priority is null");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityIsNotNull() {
            addCriterion("tbbt_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityEqualTo(Short value) {
            addCriterion("tbbt_priority =", value, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityNotEqualTo(Short value) {
            addCriterion("tbbt_priority <>", value, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityGreaterThan(Short value) {
            addCriterion("tbbt_priority >", value, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityGreaterThanOrEqualTo(Short value) {
            addCriterion("tbbt_priority >=", value, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityLessThan(Short value) {
            addCriterion("tbbt_priority <", value, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityLessThanOrEqualTo(Short value) {
            addCriterion("tbbt_priority <=", value, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityIn(List<Short> values) {
            addCriterion("tbbt_priority in", values, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityNotIn(List<Short> values) {
            addCriterion("tbbt_priority not in", values, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityBetween(Short value1, Short value2) {
            addCriterion("tbbt_priority between", value1, value2, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtPriorityNotBetween(Short value1, Short value2) {
            addCriterion("tbbt_priority not between", value1, value2, "tbbtPriority");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeIsNull() {
            addCriterion("tbbt_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeIsNotNull() {
            addCriterion("tbbt_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeEqualTo(Date value) {
            addCriterion("tbbt_add_time =", value, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeNotEqualTo(Date value) {
            addCriterion("tbbt_add_time <>", value, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeGreaterThan(Date value) {
            addCriterion("tbbt_add_time >", value, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbbt_add_time >=", value, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeLessThan(Date value) {
            addCriterion("tbbt_add_time <", value, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbbt_add_time <=", value, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeIn(List<Date> values) {
            addCriterion("tbbt_add_time in", values, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeNotIn(List<Date> values) {
            addCriterion("tbbt_add_time not in", values, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbbt_add_time between", value1, value2, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbbt_add_time not between", value1, value2, "tbbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeIsNull() {
            addCriterion("tbbt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeIsNotNull() {
            addCriterion("tbbt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeEqualTo(Date value) {
            addCriterion("tbbt_update_time =", value, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbbt_update_time <>", value, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeGreaterThan(Date value) {
            addCriterion("tbbt_update_time >", value, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbbt_update_time >=", value, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeLessThan(Date value) {
            addCriterion("tbbt_update_time <", value, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbbt_update_time <=", value, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeIn(List<Date> values) {
            addCriterion("tbbt_update_time in", values, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbbt_update_time not in", values, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbbt_update_time between", value1, value2, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbbt_update_time not between", value1, value2, "tbbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusIsNull() {
            addCriterion("tbbt_status is null");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusIsNotNull() {
            addCriterion("tbbt_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusEqualTo(Byte value) {
            addCriterion("tbbt_status =", value, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusNotEqualTo(Byte value) {
            addCriterion("tbbt_status <>", value, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusGreaterThan(Byte value) {
            addCriterion("tbbt_status >", value, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbbt_status >=", value, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusLessThan(Byte value) {
            addCriterion("tbbt_status <", value, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbbt_status <=", value, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusIn(List<Byte> values) {
            addCriterion("tbbt_status in", values, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusNotIn(List<Byte> values) {
            addCriterion("tbbt_status not in", values, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbbt_status between", value1, value2, "tbbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbbtStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbbt_status not between", value1, value2, "tbbtStatus");
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