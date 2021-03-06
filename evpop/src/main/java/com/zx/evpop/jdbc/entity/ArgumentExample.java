package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class ArgumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArgumentExample() {
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

        public Criteria andSaIdIsNull() {
            addCriterion("sa_id is null");
            return (Criteria) this;
        }

        public Criteria andSaIdIsNotNull() {
            addCriterion("sa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaIdEqualTo(Long value) {
            addCriterion("sa_id =", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotEqualTo(Long value) {
            addCriterion("sa_id <>", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThan(Long value) {
            addCriterion("sa_id >", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sa_id >=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThan(Long value) {
            addCriterion("sa_id <", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThanOrEqualTo(Long value) {
            addCriterion("sa_id <=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdIn(List<Long> values) {
            addCriterion("sa_id in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotIn(List<Long> values) {
            addCriterion("sa_id not in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdBetween(Long value1, Long value2) {
            addCriterion("sa_id between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotBetween(Long value1, Long value2) {
            addCriterion("sa_id not between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaNameIsNull() {
            addCriterion("sa_name is null");
            return (Criteria) this;
        }

        public Criteria andSaNameIsNotNull() {
            addCriterion("sa_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaNameEqualTo(String value) {
            addCriterion("sa_name =", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotEqualTo(String value) {
            addCriterion("sa_name <>", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameGreaterThan(String value) {
            addCriterion("sa_name >", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameGreaterThanOrEqualTo(String value) {
            addCriterion("sa_name >=", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameLessThan(String value) {
            addCriterion("sa_name <", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameLessThanOrEqualTo(String value) {
            addCriterion("sa_name <=", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameLike(String value) {
            addCriterion("sa_name like", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotLike(String value) {
            addCriterion("sa_name not like", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameIn(List<String> values) {
            addCriterion("sa_name in", values, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotIn(List<String> values) {
            addCriterion("sa_name not in", values, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameBetween(String value1, String value2) {
            addCriterion("sa_name between", value1, value2, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotBetween(String value1, String value2) {
            addCriterion("sa_name not between", value1, value2, "saName");
            return (Criteria) this;
        }

        public Criteria andSaFlagIsNull() {
            addCriterion("sa_flag is null");
            return (Criteria) this;
        }

        public Criteria andSaFlagIsNotNull() {
            addCriterion("sa_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSaFlagEqualTo(String value) {
            addCriterion("sa_flag =", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagNotEqualTo(String value) {
            addCriterion("sa_flag <>", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagGreaterThan(String value) {
            addCriterion("sa_flag >", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sa_flag >=", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagLessThan(String value) {
            addCriterion("sa_flag <", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagLessThanOrEqualTo(String value) {
            addCriterion("sa_flag <=", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagLike(String value) {
            addCriterion("sa_flag like", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagNotLike(String value) {
            addCriterion("sa_flag not like", value, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagIn(List<String> values) {
            addCriterion("sa_flag in", values, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagNotIn(List<String> values) {
            addCriterion("sa_flag not in", values, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagBetween(String value1, String value2) {
            addCriterion("sa_flag between", value1, value2, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaFlagNotBetween(String value1, String value2) {
            addCriterion("sa_flag not between", value1, value2, "saFlag");
            return (Criteria) this;
        }

        public Criteria andSaValueIsNull() {
            addCriterion("sa_value is null");
            return (Criteria) this;
        }

        public Criteria andSaValueIsNotNull() {
            addCriterion("sa_value is not null");
            return (Criteria) this;
        }

        public Criteria andSaValueEqualTo(String value) {
            addCriterion("sa_value =", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueNotEqualTo(String value) {
            addCriterion("sa_value <>", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueGreaterThan(String value) {
            addCriterion("sa_value >", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueGreaterThanOrEqualTo(String value) {
            addCriterion("sa_value >=", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueLessThan(String value) {
            addCriterion("sa_value <", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueLessThanOrEqualTo(String value) {
            addCriterion("sa_value <=", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueLike(String value) {
            addCriterion("sa_value like", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueNotLike(String value) {
            addCriterion("sa_value not like", value, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueIn(List<String> values) {
            addCriterion("sa_value in", values, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueNotIn(List<String> values) {
            addCriterion("sa_value not in", values, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueBetween(String value1, String value2) {
            addCriterion("sa_value between", value1, value2, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaValueNotBetween(String value1, String value2) {
            addCriterion("sa_value not between", value1, value2, "saValue");
            return (Criteria) this;
        }

        public Criteria andSaDescribeIsNull() {
            addCriterion("sa_describe is null");
            return (Criteria) this;
        }

        public Criteria andSaDescribeIsNotNull() {
            addCriterion("sa_describe is not null");
            return (Criteria) this;
        }

        public Criteria andSaDescribeEqualTo(String value) {
            addCriterion("sa_describe =", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeNotEqualTo(String value) {
            addCriterion("sa_describe <>", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeGreaterThan(String value) {
            addCriterion("sa_describe >", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("sa_describe >=", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeLessThan(String value) {
            addCriterion("sa_describe <", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeLessThanOrEqualTo(String value) {
            addCriterion("sa_describe <=", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeLike(String value) {
            addCriterion("sa_describe like", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeNotLike(String value) {
            addCriterion("sa_describe not like", value, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeIn(List<String> values) {
            addCriterion("sa_describe in", values, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeNotIn(List<String> values) {
            addCriterion("sa_describe not in", values, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeBetween(String value1, String value2) {
            addCriterion("sa_describe between", value1, value2, "saDescribe");
            return (Criteria) this;
        }

        public Criteria andSaDescribeNotBetween(String value1, String value2) {
            addCriterion("sa_describe not between", value1, value2, "saDescribe");
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