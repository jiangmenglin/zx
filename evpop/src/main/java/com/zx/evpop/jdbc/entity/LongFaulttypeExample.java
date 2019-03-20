package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongFaulttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongFaulttypeExample() {
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

        public Criteria andTblfIdIsNull() {
            addCriterion("tblf_id is null");
            return (Criteria) this;
        }

        public Criteria andTblfIdIsNotNull() {
            addCriterion("tblf_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblfIdEqualTo(Long value) {
            addCriterion("tblf_id =", value, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdNotEqualTo(Long value) {
            addCriterion("tblf_id <>", value, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdGreaterThan(Long value) {
            addCriterion("tblf_id >", value, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblf_id >=", value, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdLessThan(Long value) {
            addCriterion("tblf_id <", value, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdLessThanOrEqualTo(Long value) {
            addCriterion("tblf_id <=", value, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdIn(List<Long> values) {
            addCriterion("tblf_id in", values, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdNotIn(List<Long> values) {
            addCriterion("tblf_id not in", values, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdBetween(Long value1, Long value2) {
            addCriterion("tblf_id between", value1, value2, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfIdNotBetween(Long value1, Long value2) {
            addCriterion("tblf_id not between", value1, value2, "tblfId");
            return (Criteria) this;
        }

        public Criteria andTblfNameIsNull() {
            addCriterion("tblf_name is null");
            return (Criteria) this;
        }

        public Criteria andTblfNameIsNotNull() {
            addCriterion("tblf_name is not null");
            return (Criteria) this;
        }

        public Criteria andTblfNameEqualTo(String value) {
            addCriterion("tblf_name =", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameNotEqualTo(String value) {
            addCriterion("tblf_name <>", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameGreaterThan(String value) {
            addCriterion("tblf_name >", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameGreaterThanOrEqualTo(String value) {
            addCriterion("tblf_name >=", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameLessThan(String value) {
            addCriterion("tblf_name <", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameLessThanOrEqualTo(String value) {
            addCriterion("tblf_name <=", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameLike(String value) {
            addCriterion("tblf_name like", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameNotLike(String value) {
            addCriterion("tblf_name not like", value, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameIn(List<String> values) {
            addCriterion("tblf_name in", values, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameNotIn(List<String> values) {
            addCriterion("tblf_name not in", values, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameBetween(String value1, String value2) {
            addCriterion("tblf_name between", value1, value2, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfNameNotBetween(String value1, String value2) {
            addCriterion("tblf_name not between", value1, value2, "tblfName");
            return (Criteria) this;
        }

        public Criteria andTblfFlagIsNull() {
            addCriterion("tblf_flag is null");
            return (Criteria) this;
        }

        public Criteria andTblfFlagIsNotNull() {
            addCriterion("tblf_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTblfFlagEqualTo(String value) {
            addCriterion("tblf_flag =", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagNotEqualTo(String value) {
            addCriterion("tblf_flag <>", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagGreaterThan(String value) {
            addCriterion("tblf_flag >", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tblf_flag >=", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagLessThan(String value) {
            addCriterion("tblf_flag <", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagLessThanOrEqualTo(String value) {
            addCriterion("tblf_flag <=", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagLike(String value) {
            addCriterion("tblf_flag like", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagNotLike(String value) {
            addCriterion("tblf_flag not like", value, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagIn(List<String> values) {
            addCriterion("tblf_flag in", values, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagNotIn(List<String> values) {
            addCriterion("tblf_flag not in", values, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagBetween(String value1, String value2) {
            addCriterion("tblf_flag between", value1, value2, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfFlagNotBetween(String value1, String value2) {
            addCriterion("tblf_flag not between", value1, value2, "tblfFlag");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityIsNull() {
            addCriterion("tblf_priority is null");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityIsNotNull() {
            addCriterion("tblf_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityEqualTo(Short value) {
            addCriterion("tblf_priority =", value, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityNotEqualTo(Short value) {
            addCriterion("tblf_priority <>", value, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityGreaterThan(Short value) {
            addCriterion("tblf_priority >", value, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityGreaterThanOrEqualTo(Short value) {
            addCriterion("tblf_priority >=", value, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityLessThan(Short value) {
            addCriterion("tblf_priority <", value, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityLessThanOrEqualTo(Short value) {
            addCriterion("tblf_priority <=", value, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityIn(List<Short> values) {
            addCriterion("tblf_priority in", values, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityNotIn(List<Short> values) {
            addCriterion("tblf_priority not in", values, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityBetween(Short value1, Short value2) {
            addCriterion("tblf_priority between", value1, value2, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfPriorityNotBetween(Short value1, Short value2) {
            addCriterion("tblf_priority not between", value1, value2, "tblfPriority");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeIsNull() {
            addCriterion("tblf_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeIsNotNull() {
            addCriterion("tblf_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeEqualTo(Date value) {
            addCriterion("tblf_add_time =", value, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeNotEqualTo(Date value) {
            addCriterion("tblf_add_time <>", value, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeGreaterThan(Date value) {
            addCriterion("tblf_add_time >", value, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblf_add_time >=", value, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeLessThan(Date value) {
            addCriterion("tblf_add_time <", value, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblf_add_time <=", value, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeIn(List<Date> values) {
            addCriterion("tblf_add_time in", values, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeNotIn(List<Date> values) {
            addCriterion("tblf_add_time not in", values, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeBetween(Date value1, Date value2) {
            addCriterion("tblf_add_time between", value1, value2, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblf_add_time not between", value1, value2, "tblfAddTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeIsNull() {
            addCriterion("tblf_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeIsNotNull() {
            addCriterion("tblf_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeEqualTo(Date value) {
            addCriterion("tblf_update_time =", value, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeNotEqualTo(Date value) {
            addCriterion("tblf_update_time <>", value, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeGreaterThan(Date value) {
            addCriterion("tblf_update_time >", value, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblf_update_time >=", value, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeLessThan(Date value) {
            addCriterion("tblf_update_time <", value, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblf_update_time <=", value, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeIn(List<Date> values) {
            addCriterion("tblf_update_time in", values, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeNotIn(List<Date> values) {
            addCriterion("tblf_update_time not in", values, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tblf_update_time between", value1, value2, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblf_update_time not between", value1, value2, "tblfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblfStatusIsNull() {
            addCriterion("tblf_status is null");
            return (Criteria) this;
        }

        public Criteria andTblfStatusIsNotNull() {
            addCriterion("tblf_status is not null");
            return (Criteria) this;
        }

        public Criteria andTblfStatusEqualTo(Byte value) {
            addCriterion("tblf_status =", value, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusNotEqualTo(Byte value) {
            addCriterion("tblf_status <>", value, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusGreaterThan(Byte value) {
            addCriterion("tblf_status >", value, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tblf_status >=", value, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusLessThan(Byte value) {
            addCriterion("tblf_status <", value, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tblf_status <=", value, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusIn(List<Byte> values) {
            addCriterion("tblf_status in", values, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusNotIn(List<Byte> values) {
            addCriterion("tblf_status not in", values, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusBetween(Byte value1, Byte value2) {
            addCriterion("tblf_status between", value1, value2, "tblfStatus");
            return (Criteria) this;
        }

        public Criteria andTblfStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tblf_status not between", value1, value2, "tblfStatus");
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