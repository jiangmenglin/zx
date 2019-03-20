package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class LimitedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimitedExample() {
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

        public Criteria andSlIdIsNull() {
            addCriterion("sl_id is null");
            return (Criteria) this;
        }

        public Criteria andSlIdIsNotNull() {
            addCriterion("sl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlIdEqualTo(Long value) {
            addCriterion("sl_id =", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotEqualTo(Long value) {
            addCriterion("sl_id <>", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThan(Long value) {
            addCriterion("sl_id >", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_id >=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThan(Long value) {
            addCriterion("sl_id <", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThanOrEqualTo(Long value) {
            addCriterion("sl_id <=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdIn(List<Long> values) {
            addCriterion("sl_id in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotIn(List<Long> values) {
            addCriterion("sl_id not in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdBetween(Long value1, Long value2) {
            addCriterion("sl_id between", value1, value2, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotBetween(Long value1, Long value2) {
            addCriterion("sl_id not between", value1, value2, "slId");
            return (Criteria) this;
        }

        public Criteria andSlProjectIsNull() {
            addCriterion("sl_project is null");
            return (Criteria) this;
        }

        public Criteria andSlProjectIsNotNull() {
            addCriterion("sl_project is not null");
            return (Criteria) this;
        }

        public Criteria andSlProjectEqualTo(Long value) {
            addCriterion("sl_project =", value, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectNotEqualTo(Long value) {
            addCriterion("sl_project <>", value, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectGreaterThan(Long value) {
            addCriterion("sl_project >", value, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_project >=", value, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectLessThan(Long value) {
            addCriterion("sl_project <", value, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectLessThanOrEqualTo(Long value) {
            addCriterion("sl_project <=", value, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectIn(List<Long> values) {
            addCriterion("sl_project in", values, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectNotIn(List<Long> values) {
            addCriterion("sl_project not in", values, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectBetween(Long value1, Long value2) {
            addCriterion("sl_project between", value1, value2, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlProjectNotBetween(Long value1, Long value2) {
            addCriterion("sl_project not between", value1, value2, "slProject");
            return (Criteria) this;
        }

        public Criteria andSlUserIsNull() {
            addCriterion("sl_user is null");
            return (Criteria) this;
        }

        public Criteria andSlUserIsNotNull() {
            addCriterion("sl_user is not null");
            return (Criteria) this;
        }

        public Criteria andSlUserEqualTo(Long value) {
            addCriterion("sl_user =", value, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserNotEqualTo(Long value) {
            addCriterion("sl_user <>", value, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserGreaterThan(Long value) {
            addCriterion("sl_user >", value, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_user >=", value, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserLessThan(Long value) {
            addCriterion("sl_user <", value, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserLessThanOrEqualTo(Long value) {
            addCriterion("sl_user <=", value, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserIn(List<Long> values) {
            addCriterion("sl_user in", values, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserNotIn(List<Long> values) {
            addCriterion("sl_user not in", values, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserBetween(Long value1, Long value2) {
            addCriterion("sl_user between", value1, value2, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlUserNotBetween(Long value1, Long value2) {
            addCriterion("sl_user not between", value1, value2, "slUser");
            return (Criteria) this;
        }

        public Criteria andSlGroupIsNull() {
            addCriterion("sl_group is null");
            return (Criteria) this;
        }

        public Criteria andSlGroupIsNotNull() {
            addCriterion("sl_group is not null");
            return (Criteria) this;
        }

        public Criteria andSlGroupEqualTo(Long value) {
            addCriterion("sl_group =", value, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupNotEqualTo(Long value) {
            addCriterion("sl_group <>", value, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupGreaterThan(Long value) {
            addCriterion("sl_group >", value, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_group >=", value, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupLessThan(Long value) {
            addCriterion("sl_group <", value, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupLessThanOrEqualTo(Long value) {
            addCriterion("sl_group <=", value, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupIn(List<Long> values) {
            addCriterion("sl_group in", values, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupNotIn(List<Long> values) {
            addCriterion("sl_group not in", values, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupBetween(Long value1, Long value2) {
            addCriterion("sl_group between", value1, value2, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlGroupNotBetween(Long value1, Long value2) {
            addCriterion("sl_group not between", value1, value2, "slGroup");
            return (Criteria) this;
        }

        public Criteria andSlLimitIsNull() {
            addCriterion("sl_limit is null");
            return (Criteria) this;
        }

        public Criteria andSlLimitIsNotNull() {
            addCriterion("sl_limit is not null");
            return (Criteria) this;
        }

        public Criteria andSlLimitEqualTo(Integer value) {
            addCriterion("sl_limit =", value, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitNotEqualTo(Integer value) {
            addCriterion("sl_limit <>", value, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitGreaterThan(Integer value) {
            addCriterion("sl_limit >", value, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl_limit >=", value, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitLessThan(Integer value) {
            addCriterion("sl_limit <", value, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitLessThanOrEqualTo(Integer value) {
            addCriterion("sl_limit <=", value, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitIn(List<Integer> values) {
            addCriterion("sl_limit in", values, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitNotIn(List<Integer> values) {
            addCriterion("sl_limit not in", values, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitBetween(Integer value1, Integer value2) {
            addCriterion("sl_limit between", value1, value2, "slLimit");
            return (Criteria) this;
        }

        public Criteria andSlLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("sl_limit not between", value1, value2, "slLimit");
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