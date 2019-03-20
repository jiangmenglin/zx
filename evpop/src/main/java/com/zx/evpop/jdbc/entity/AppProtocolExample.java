package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppProtocolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppProtocolExample() {
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

        public Criteria andTbapIdIsNull() {
            addCriterion("tbap_id is null");
            return (Criteria) this;
        }

        public Criteria andTbapIdIsNotNull() {
            addCriterion("tbap_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbapIdEqualTo(Long value) {
            addCriterion("tbap_id =", value, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdNotEqualTo(Long value) {
            addCriterion("tbap_id <>", value, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdGreaterThan(Long value) {
            addCriterion("tbap_id >", value, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbap_id >=", value, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdLessThan(Long value) {
            addCriterion("tbap_id <", value, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdLessThanOrEqualTo(Long value) {
            addCriterion("tbap_id <=", value, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdIn(List<Long> values) {
            addCriterion("tbap_id in", values, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdNotIn(List<Long> values) {
            addCriterion("tbap_id not in", values, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdBetween(Long value1, Long value2) {
            addCriterion("tbap_id between", value1, value2, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapIdNotBetween(Long value1, Long value2) {
            addCriterion("tbap_id not between", value1, value2, "tbapId");
            return (Criteria) this;
        }

        public Criteria andTbapNameIsNull() {
            addCriterion("tbap_name is null");
            return (Criteria) this;
        }

        public Criteria andTbapNameIsNotNull() {
            addCriterion("tbap_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbapNameEqualTo(String value) {
            addCriterion("tbap_name =", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameNotEqualTo(String value) {
            addCriterion("tbap_name <>", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameGreaterThan(String value) {
            addCriterion("tbap_name >", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbap_name >=", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameLessThan(String value) {
            addCriterion("tbap_name <", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameLessThanOrEqualTo(String value) {
            addCriterion("tbap_name <=", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameLike(String value) {
            addCriterion("tbap_name like", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameNotLike(String value) {
            addCriterion("tbap_name not like", value, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameIn(List<String> values) {
            addCriterion("tbap_name in", values, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameNotIn(List<String> values) {
            addCriterion("tbap_name not in", values, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameBetween(String value1, String value2) {
            addCriterion("tbap_name between", value1, value2, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapNameNotBetween(String value1, String value2) {
            addCriterion("tbap_name not between", value1, value2, "tbapName");
            return (Criteria) this;
        }

        public Criteria andTbapTypeIsNull() {
            addCriterion("tbap_type is null");
            return (Criteria) this;
        }

        public Criteria andTbapTypeIsNotNull() {
            addCriterion("tbap_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbapTypeEqualTo(Short value) {
            addCriterion("tbap_type =", value, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeNotEqualTo(Short value) {
            addCriterion("tbap_type <>", value, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeGreaterThan(Short value) {
            addCriterion("tbap_type >", value, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbap_type >=", value, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeLessThan(Short value) {
            addCriterion("tbap_type <", value, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbap_type <=", value, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeIn(List<Short> values) {
            addCriterion("tbap_type in", values, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeNotIn(List<Short> values) {
            addCriterion("tbap_type not in", values, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeBetween(Short value1, Short value2) {
            addCriterion("tbap_type between", value1, value2, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbap_type not between", value1, value2, "tbapType");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeIsNull() {
            addCriterion("tbap_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeIsNotNull() {
            addCriterion("tbap_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeEqualTo(Date value) {
            addCriterion("tbap_add_time =", value, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeNotEqualTo(Date value) {
            addCriterion("tbap_add_time <>", value, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeGreaterThan(Date value) {
            addCriterion("tbap_add_time >", value, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbap_add_time >=", value, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeLessThan(Date value) {
            addCriterion("tbap_add_time <", value, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbap_add_time <=", value, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeIn(List<Date> values) {
            addCriterion("tbap_add_time in", values, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeNotIn(List<Date> values) {
            addCriterion("tbap_add_time not in", values, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbap_add_time between", value1, value2, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbap_add_time not between", value1, value2, "tbapAddTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeIsNull() {
            addCriterion("tbap_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeIsNotNull() {
            addCriterion("tbap_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeEqualTo(Date value) {
            addCriterion("tbap_update_time =", value, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbap_update_time <>", value, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeGreaterThan(Date value) {
            addCriterion("tbap_update_time >", value, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbap_update_time >=", value, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeLessThan(Date value) {
            addCriterion("tbap_update_time <", value, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbap_update_time <=", value, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeIn(List<Date> values) {
            addCriterion("tbap_update_time in", values, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbap_update_time not in", values, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbap_update_time between", value1, value2, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbap_update_time not between", value1, value2, "tbapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbapStatusIsNull() {
            addCriterion("tbap_status is null");
            return (Criteria) this;
        }

        public Criteria andTbapStatusIsNotNull() {
            addCriterion("tbap_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbapStatusEqualTo(Byte value) {
            addCriterion("tbap_status =", value, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusNotEqualTo(Byte value) {
            addCriterion("tbap_status <>", value, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusGreaterThan(Byte value) {
            addCriterion("tbap_status >", value, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbap_status >=", value, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusLessThan(Byte value) {
            addCriterion("tbap_status <", value, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbap_status <=", value, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusIn(List<Byte> values) {
            addCriterion("tbap_status in", values, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusNotIn(List<Byte> values) {
            addCriterion("tbap_status not in", values, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbap_status between", value1, value2, "tbapStatus");
            return (Criteria) this;
        }

        public Criteria andTbapStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbap_status not between", value1, value2, "tbapStatus");
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