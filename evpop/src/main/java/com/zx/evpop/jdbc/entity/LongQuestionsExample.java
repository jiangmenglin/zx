package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongQuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongQuestionsExample() {
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

        public Criteria andTblqIdIsNull() {
            addCriterion("tblq_id is null");
            return (Criteria) this;
        }

        public Criteria andTblqIdIsNotNull() {
            addCriterion("tblq_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblqIdEqualTo(Long value) {
            addCriterion("tblq_id =", value, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdNotEqualTo(Long value) {
            addCriterion("tblq_id <>", value, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdGreaterThan(Long value) {
            addCriterion("tblq_id >", value, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblq_id >=", value, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdLessThan(Long value) {
            addCriterion("tblq_id <", value, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdLessThanOrEqualTo(Long value) {
            addCriterion("tblq_id <=", value, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdIn(List<Long> values) {
            addCriterion("tblq_id in", values, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdNotIn(List<Long> values) {
            addCriterion("tblq_id not in", values, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdBetween(Long value1, Long value2) {
            addCriterion("tblq_id between", value1, value2, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqIdNotBetween(Long value1, Long value2) {
            addCriterion("tblq_id not between", value1, value2, "tblqId");
            return (Criteria) this;
        }

        public Criteria andTblqNameIsNull() {
            addCriterion("tblq_name is null");
            return (Criteria) this;
        }

        public Criteria andTblqNameIsNotNull() {
            addCriterion("tblq_name is not null");
            return (Criteria) this;
        }

        public Criteria andTblqNameEqualTo(String value) {
            addCriterion("tblq_name =", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameNotEqualTo(String value) {
            addCriterion("tblq_name <>", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameGreaterThan(String value) {
            addCriterion("tblq_name >", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameGreaterThanOrEqualTo(String value) {
            addCriterion("tblq_name >=", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameLessThan(String value) {
            addCriterion("tblq_name <", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameLessThanOrEqualTo(String value) {
            addCriterion("tblq_name <=", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameLike(String value) {
            addCriterion("tblq_name like", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameNotLike(String value) {
            addCriterion("tblq_name not like", value, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameIn(List<String> values) {
            addCriterion("tblq_name in", values, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameNotIn(List<String> values) {
            addCriterion("tblq_name not in", values, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameBetween(String value1, String value2) {
            addCriterion("tblq_name between", value1, value2, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqNameNotBetween(String value1, String value2) {
            addCriterion("tblq_name not between", value1, value2, "tblqName");
            return (Criteria) this;
        }

        public Criteria andTblqLevelIsNull() {
            addCriterion("tblq_level is null");
            return (Criteria) this;
        }

        public Criteria andTblqLevelIsNotNull() {
            addCriterion("tblq_level is not null");
            return (Criteria) this;
        }

        public Criteria andTblqLevelEqualTo(Long value) {
            addCriterion("tblq_level =", value, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelNotEqualTo(Long value) {
            addCriterion("tblq_level <>", value, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelGreaterThan(Long value) {
            addCriterion("tblq_level >", value, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("tblq_level >=", value, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelLessThan(Long value) {
            addCriterion("tblq_level <", value, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelLessThanOrEqualTo(Long value) {
            addCriterion("tblq_level <=", value, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelIn(List<Long> values) {
            addCriterion("tblq_level in", values, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelNotIn(List<Long> values) {
            addCriterion("tblq_level not in", values, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelBetween(Long value1, Long value2) {
            addCriterion("tblq_level between", value1, value2, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqLevelNotBetween(Long value1, Long value2) {
            addCriterion("tblq_level not between", value1, value2, "tblqLevel");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeIsNull() {
            addCriterion("tblq_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeIsNotNull() {
            addCriterion("tblq_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeEqualTo(Date value) {
            addCriterion("tblq_add_time =", value, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeNotEqualTo(Date value) {
            addCriterion("tblq_add_time <>", value, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeGreaterThan(Date value) {
            addCriterion("tblq_add_time >", value, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblq_add_time >=", value, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeLessThan(Date value) {
            addCriterion("tblq_add_time <", value, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblq_add_time <=", value, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeIn(List<Date> values) {
            addCriterion("tblq_add_time in", values, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeNotIn(List<Date> values) {
            addCriterion("tblq_add_time not in", values, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeBetween(Date value1, Date value2) {
            addCriterion("tblq_add_time between", value1, value2, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblq_add_time not between", value1, value2, "tblqAddTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeIsNull() {
            addCriterion("tblq_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeIsNotNull() {
            addCriterion("tblq_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeEqualTo(Date value) {
            addCriterion("tblq_update_time =", value, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeNotEqualTo(Date value) {
            addCriterion("tblq_update_time <>", value, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeGreaterThan(Date value) {
            addCriterion("tblq_update_time >", value, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblq_update_time >=", value, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeLessThan(Date value) {
            addCriterion("tblq_update_time <", value, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblq_update_time <=", value, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeIn(List<Date> values) {
            addCriterion("tblq_update_time in", values, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeNotIn(List<Date> values) {
            addCriterion("tblq_update_time not in", values, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tblq_update_time between", value1, value2, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblq_update_time not between", value1, value2, "tblqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblqStatusIsNull() {
            addCriterion("tblq_status is null");
            return (Criteria) this;
        }

        public Criteria andTblqStatusIsNotNull() {
            addCriterion("tblq_status is not null");
            return (Criteria) this;
        }

        public Criteria andTblqStatusEqualTo(Short value) {
            addCriterion("tblq_status =", value, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusNotEqualTo(Short value) {
            addCriterion("tblq_status <>", value, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusGreaterThan(Short value) {
            addCriterion("tblq_status >", value, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tblq_status >=", value, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusLessThan(Short value) {
            addCriterion("tblq_status <", value, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusLessThanOrEqualTo(Short value) {
            addCriterion("tblq_status <=", value, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusIn(List<Short> values) {
            addCriterion("tblq_status in", values, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusNotIn(List<Short> values) {
            addCriterion("tblq_status not in", values, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusBetween(Short value1, Short value2) {
            addCriterion("tblq_status between", value1, value2, "tblqStatus");
            return (Criteria) this;
        }

        public Criteria andTblqStatusNotBetween(Short value1, Short value2) {
            addCriterion("tblq_status not between", value1, value2, "tblqStatus");
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