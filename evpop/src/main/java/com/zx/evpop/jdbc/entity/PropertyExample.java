package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class PropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Long value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Long value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Long value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Long value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Long value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Long> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Long> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Long value1, Long value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Long value1, Long value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNull() {
            addCriterion("sp_name is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("sp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("sp_name =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("sp_name <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("sp_name >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_name >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("sp_name <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("sp_name <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("sp_name like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("sp_name not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("sp_name in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("sp_name not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("sp_name between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("sp_name not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpParentIsNull() {
            addCriterion("sp_parent is null");
            return (Criteria) this;
        }

        public Criteria andSpParentIsNotNull() {
            addCriterion("sp_parent is not null");
            return (Criteria) this;
        }

        public Criteria andSpParentEqualTo(Long value) {
            addCriterion("sp_parent =", value, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentNotEqualTo(Long value) {
            addCriterion("sp_parent <>", value, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentGreaterThan(Long value) {
            addCriterion("sp_parent >", value, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_parent >=", value, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentLessThan(Long value) {
            addCriterion("sp_parent <", value, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentLessThanOrEqualTo(Long value) {
            addCriterion("sp_parent <=", value, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentIn(List<Long> values) {
            addCriterion("sp_parent in", values, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentNotIn(List<Long> values) {
            addCriterion("sp_parent not in", values, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentBetween(Long value1, Long value2) {
            addCriterion("sp_parent between", value1, value2, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpParentNotBetween(Long value1, Long value2) {
            addCriterion("sp_parent not between", value1, value2, "spParent");
            return (Criteria) this;
        }

        public Criteria andSpFlagIsNull() {
            addCriterion("sp_flag is null");
            return (Criteria) this;
        }

        public Criteria andSpFlagIsNotNull() {
            addCriterion("sp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSpFlagEqualTo(String value) {
            addCriterion("sp_flag =", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagNotEqualTo(String value) {
            addCriterion("sp_flag <>", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagGreaterThan(String value) {
            addCriterion("sp_flag >", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sp_flag >=", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagLessThan(String value) {
            addCriterion("sp_flag <", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagLessThanOrEqualTo(String value) {
            addCriterion("sp_flag <=", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagLike(String value) {
            addCriterion("sp_flag like", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagNotLike(String value) {
            addCriterion("sp_flag not like", value, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagIn(List<String> values) {
            addCriterion("sp_flag in", values, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagNotIn(List<String> values) {
            addCriterion("sp_flag not in", values, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagBetween(String value1, String value2) {
            addCriterion("sp_flag between", value1, value2, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpFlagNotBetween(String value1, String value2) {
            addCriterion("sp_flag not between", value1, value2, "spFlag");
            return (Criteria) this;
        }

        public Criteria andSpNumberIsNull() {
            addCriterion("sp_number is null");
            return (Criteria) this;
        }

        public Criteria andSpNumberIsNotNull() {
            addCriterion("sp_number is not null");
            return (Criteria) this;
        }

        public Criteria andSpNumberEqualTo(Long value) {
            addCriterion("sp_number =", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberNotEqualTo(Long value) {
            addCriterion("sp_number <>", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberGreaterThan(Long value) {
            addCriterion("sp_number >", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_number >=", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberLessThan(Long value) {
            addCriterion("sp_number <", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberLessThanOrEqualTo(Long value) {
            addCriterion("sp_number <=", value, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberIn(List<Long> values) {
            addCriterion("sp_number in", values, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberNotIn(List<Long> values) {
            addCriterion("sp_number not in", values, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberBetween(Long value1, Long value2) {
            addCriterion("sp_number between", value1, value2, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpNumberNotBetween(Long value1, Long value2) {
            addCriterion("sp_number not between", value1, value2, "spNumber");
            return (Criteria) this;
        }

        public Criteria andSpValueIsNull() {
            addCriterion("sp_value is null");
            return (Criteria) this;
        }

        public Criteria andSpValueIsNotNull() {
            addCriterion("sp_value is not null");
            return (Criteria) this;
        }

        public Criteria andSpValueEqualTo(String value) {
            addCriterion("sp_value =", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotEqualTo(String value) {
            addCriterion("sp_value <>", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueGreaterThan(String value) {
            addCriterion("sp_value >", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueGreaterThanOrEqualTo(String value) {
            addCriterion("sp_value >=", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueLessThan(String value) {
            addCriterion("sp_value <", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueLessThanOrEqualTo(String value) {
            addCriterion("sp_value <=", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueLike(String value) {
            addCriterion("sp_value like", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotLike(String value) {
            addCriterion("sp_value not like", value, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueIn(List<String> values) {
            addCriterion("sp_value in", values, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotIn(List<String> values) {
            addCriterion("sp_value not in", values, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueBetween(String value1, String value2) {
            addCriterion("sp_value between", value1, value2, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpValueNotBetween(String value1, String value2) {
            addCriterion("sp_value not between", value1, value2, "spValue");
            return (Criteria) this;
        }

        public Criteria andSpStatusIsNull() {
            addCriterion("sp_status is null");
            return (Criteria) this;
        }

        public Criteria andSpStatusIsNotNull() {
            addCriterion("sp_status is not null");
            return (Criteria) this;
        }

        public Criteria andSpStatusEqualTo(Short value) {
            addCriterion("sp_status =", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotEqualTo(Short value) {
            addCriterion("sp_status <>", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusGreaterThan(Short value) {
            addCriterion("sp_status >", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sp_status >=", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusLessThan(Short value) {
            addCriterion("sp_status <", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusLessThanOrEqualTo(Short value) {
            addCriterion("sp_status <=", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusIn(List<Short> values) {
            addCriterion("sp_status in", values, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotIn(List<Short> values) {
            addCriterion("sp_status not in", values, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusBetween(Short value1, Short value2) {
            addCriterion("sp_status between", value1, value2, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotBetween(Short value1, Short value2) {
            addCriterion("sp_status not between", value1, value2, "spStatus");
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