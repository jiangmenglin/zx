package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViolatQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolatQueryExample() {
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

        public Criteria andTbvqIdIsNull() {
            addCriterion("tbvq_id is null");
            return (Criteria) this;
        }

        public Criteria andTbvqIdIsNotNull() {
            addCriterion("tbvq_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqIdEqualTo(Long value) {
            addCriterion("tbvq_id =", value, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdNotEqualTo(Long value) {
            addCriterion("tbvq_id <>", value, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdGreaterThan(Long value) {
            addCriterion("tbvq_id >", value, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbvq_id >=", value, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdLessThan(Long value) {
            addCriterion("tbvq_id <", value, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdLessThanOrEqualTo(Long value) {
            addCriterion("tbvq_id <=", value, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdIn(List<Long> values) {
            addCriterion("tbvq_id in", values, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdNotIn(List<Long> values) {
            addCriterion("tbvq_id not in", values, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdBetween(Long value1, Long value2) {
            addCriterion("tbvq_id between", value1, value2, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqIdNotBetween(Long value1, Long value2) {
            addCriterion("tbvq_id not between", value1, value2, "tbvqId");
            return (Criteria) this;
        }

        public Criteria andTbvqUserIsNull() {
            addCriterion("tbvq_user is null");
            return (Criteria) this;
        }

        public Criteria andTbvqUserIsNotNull() {
            addCriterion("tbvq_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqUserEqualTo(Long value) {
            addCriterion("tbvq_user =", value, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserNotEqualTo(Long value) {
            addCriterion("tbvq_user <>", value, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserGreaterThan(Long value) {
            addCriterion("tbvq_user >", value, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbvq_user >=", value, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserLessThan(Long value) {
            addCriterion("tbvq_user <", value, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserLessThanOrEqualTo(Long value) {
            addCriterion("tbvq_user <=", value, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserIn(List<Long> values) {
            addCriterion("tbvq_user in", values, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserNotIn(List<Long> values) {
            addCriterion("tbvq_user not in", values, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserBetween(Long value1, Long value2) {
            addCriterion("tbvq_user between", value1, value2, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqUserNotBetween(Long value1, Long value2) {
            addCriterion("tbvq_user not between", value1, value2, "tbvqUser");
            return (Criteria) this;
        }

        public Criteria andTbvqCountIsNull() {
            addCriterion("tbvq_count is null");
            return (Criteria) this;
        }

        public Criteria andTbvqCountIsNotNull() {
            addCriterion("tbvq_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqCountEqualTo(Short value) {
            addCriterion("tbvq_count =", value, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountNotEqualTo(Short value) {
            addCriterion("tbvq_count <>", value, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountGreaterThan(Short value) {
            addCriterion("tbvq_count >", value, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountGreaterThanOrEqualTo(Short value) {
            addCriterion("tbvq_count >=", value, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountLessThan(Short value) {
            addCriterion("tbvq_count <", value, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountLessThanOrEqualTo(Short value) {
            addCriterion("tbvq_count <=", value, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountIn(List<Short> values) {
            addCriterion("tbvq_count in", values, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountNotIn(List<Short> values) {
            addCriterion("tbvq_count not in", values, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountBetween(Short value1, Short value2) {
            addCriterion("tbvq_count between", value1, value2, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqCountNotBetween(Short value1, Short value2) {
            addCriterion("tbvq_count not between", value1, value2, "tbvqCount");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondIsNull() {
            addCriterion("tbvq_second is null");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondIsNotNull() {
            addCriterion("tbvq_second is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondEqualTo(Short value) {
            addCriterion("tbvq_second =", value, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondNotEqualTo(Short value) {
            addCriterion("tbvq_second <>", value, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondGreaterThan(Short value) {
            addCriterion("tbvq_second >", value, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondGreaterThanOrEqualTo(Short value) {
            addCriterion("tbvq_second >=", value, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondLessThan(Short value) {
            addCriterion("tbvq_second <", value, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondLessThanOrEqualTo(Short value) {
            addCriterion("tbvq_second <=", value, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondIn(List<Short> values) {
            addCriterion("tbvq_second in", values, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondNotIn(List<Short> values) {
            addCriterion("tbvq_second not in", values, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondBetween(Short value1, Short value2) {
            addCriterion("tbvq_second between", value1, value2, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqSecondNotBetween(Short value1, Short value2) {
            addCriterion("tbvq_second not between", value1, value2, "tbvqSecond");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeIsNull() {
            addCriterion("tbvq_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeIsNotNull() {
            addCriterion("tbvq_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeEqualTo(Date value) {
            addCriterion("tbvq_update_time =", value, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbvq_update_time <>", value, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeGreaterThan(Date value) {
            addCriterion("tbvq_update_time >", value, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbvq_update_time >=", value, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeLessThan(Date value) {
            addCriterion("tbvq_update_time <", value, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbvq_update_time <=", value, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeIn(List<Date> values) {
            addCriterion("tbvq_update_time in", values, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbvq_update_time not in", values, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbvq_update_time between", value1, value2, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbvq_update_time not between", value1, value2, "tbvqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeIsNull() {
            addCriterion("tbvq_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeIsNotNull() {
            addCriterion("tbvq_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeEqualTo(Date value) {
            addCriterion("tbvq_add_time =", value, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeNotEqualTo(Date value) {
            addCriterion("tbvq_add_time <>", value, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeGreaterThan(Date value) {
            addCriterion("tbvq_add_time >", value, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbvq_add_time >=", value, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeLessThan(Date value) {
            addCriterion("tbvq_add_time <", value, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbvq_add_time <=", value, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeIn(List<Date> values) {
            addCriterion("tbvq_add_time in", values, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeNotIn(List<Date> values) {
            addCriterion("tbvq_add_time not in", values, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbvq_add_time between", value1, value2, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbvq_add_time not between", value1, value2, "tbvqAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusIsNull() {
            addCriterion("tbvq_status is null");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusIsNotNull() {
            addCriterion("tbvq_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusEqualTo(Short value) {
            addCriterion("tbvq_status =", value, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusNotEqualTo(Short value) {
            addCriterion("tbvq_status <>", value, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusGreaterThan(Short value) {
            addCriterion("tbvq_status >", value, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbvq_status >=", value, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusLessThan(Short value) {
            addCriterion("tbvq_status <", value, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbvq_status <=", value, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusIn(List<Short> values) {
            addCriterion("tbvq_status in", values, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusNotIn(List<Short> values) {
            addCriterion("tbvq_status not in", values, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusBetween(Short value1, Short value2) {
            addCriterion("tbvq_status between", value1, value2, "tbvqStatus");
            return (Criteria) this;
        }

        public Criteria andTbvqStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbvq_status not between", value1, value2, "tbvqStatus");
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