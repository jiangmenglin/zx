package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppHelpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppHelpExample() {
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

        public Criteria andTbahIdIsNull() {
            addCriterion("tbah_id is null");
            return (Criteria) this;
        }

        public Criteria andTbahIdIsNotNull() {
            addCriterion("tbah_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbahIdEqualTo(Long value) {
            addCriterion("tbah_id =", value, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdNotEqualTo(Long value) {
            addCriterion("tbah_id <>", value, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdGreaterThan(Long value) {
            addCriterion("tbah_id >", value, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbah_id >=", value, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdLessThan(Long value) {
            addCriterion("tbah_id <", value, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdLessThanOrEqualTo(Long value) {
            addCriterion("tbah_id <=", value, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdIn(List<Long> values) {
            addCriterion("tbah_id in", values, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdNotIn(List<Long> values) {
            addCriterion("tbah_id not in", values, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdBetween(Long value1, Long value2) {
            addCriterion("tbah_id between", value1, value2, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahIdNotBetween(Long value1, Long value2) {
            addCriterion("tbah_id not between", value1, value2, "tbahId");
            return (Criteria) this;
        }

        public Criteria andTbahNameIsNull() {
            addCriterion("tbah_name is null");
            return (Criteria) this;
        }

        public Criteria andTbahNameIsNotNull() {
            addCriterion("tbah_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbahNameEqualTo(String value) {
            addCriterion("tbah_name =", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameNotEqualTo(String value) {
            addCriterion("tbah_name <>", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameGreaterThan(String value) {
            addCriterion("tbah_name >", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbah_name >=", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameLessThan(String value) {
            addCriterion("tbah_name <", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameLessThanOrEqualTo(String value) {
            addCriterion("tbah_name <=", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameLike(String value) {
            addCriterion("tbah_name like", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameNotLike(String value) {
            addCriterion("tbah_name not like", value, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameIn(List<String> values) {
            addCriterion("tbah_name in", values, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameNotIn(List<String> values) {
            addCriterion("tbah_name not in", values, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameBetween(String value1, String value2) {
            addCriterion("tbah_name between", value1, value2, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahNameNotBetween(String value1, String value2) {
            addCriterion("tbah_name not between", value1, value2, "tbahName");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeIsNull() {
            addCriterion("tbah_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeIsNotNull() {
            addCriterion("tbah_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeEqualTo(Date value) {
            addCriterion("tbah_add_time =", value, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeNotEqualTo(Date value) {
            addCriterion("tbah_add_time <>", value, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeGreaterThan(Date value) {
            addCriterion("tbah_add_time >", value, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbah_add_time >=", value, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeLessThan(Date value) {
            addCriterion("tbah_add_time <", value, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbah_add_time <=", value, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeIn(List<Date> values) {
            addCriterion("tbah_add_time in", values, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeNotIn(List<Date> values) {
            addCriterion("tbah_add_time not in", values, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbah_add_time between", value1, value2, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbah_add_time not between", value1, value2, "tbahAddTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeIsNull() {
            addCriterion("tbah_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeIsNotNull() {
            addCriterion("tbah_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeEqualTo(Date value) {
            addCriterion("tbah_update_time =", value, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbah_update_time <>", value, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeGreaterThan(Date value) {
            addCriterion("tbah_update_time >", value, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbah_update_time >=", value, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeLessThan(Date value) {
            addCriterion("tbah_update_time <", value, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbah_update_time <=", value, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeIn(List<Date> values) {
            addCriterion("tbah_update_time in", values, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbah_update_time not in", values, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbah_update_time between", value1, value2, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbah_update_time not between", value1, value2, "tbahUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbahStatusIsNull() {
            addCriterion("tbah_status is null");
            return (Criteria) this;
        }

        public Criteria andTbahStatusIsNotNull() {
            addCriterion("tbah_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbahStatusEqualTo(Byte value) {
            addCriterion("tbah_status =", value, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusNotEqualTo(Byte value) {
            addCriterion("tbah_status <>", value, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusGreaterThan(Byte value) {
            addCriterion("tbah_status >", value, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbah_status >=", value, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusLessThan(Byte value) {
            addCriterion("tbah_status <", value, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbah_status <=", value, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusIn(List<Byte> values) {
            addCriterion("tbah_status in", values, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusNotIn(List<Byte> values) {
            addCriterion("tbah_status not in", values, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbah_status between", value1, value2, "tbahStatus");
            return (Criteria) this;
        }

        public Criteria andTbahStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbah_status not between", value1, value2, "tbahStatus");
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