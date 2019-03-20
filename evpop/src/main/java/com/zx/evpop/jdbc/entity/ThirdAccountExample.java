package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThirdAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThirdAccountExample() {
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

        public Criteria andTbtaIdIsNull() {
            addCriterion("tbta_id is null");
            return (Criteria) this;
        }

        public Criteria andTbtaIdIsNotNull() {
            addCriterion("tbta_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbtaIdEqualTo(Integer value) {
            addCriterion("tbta_id =", value, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdNotEqualTo(Integer value) {
            addCriterion("tbta_id <>", value, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdGreaterThan(Integer value) {
            addCriterion("tbta_id >", value, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbta_id >=", value, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdLessThan(Integer value) {
            addCriterion("tbta_id <", value, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbta_id <=", value, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdIn(List<Integer> values) {
            addCriterion("tbta_id in", values, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdNotIn(List<Integer> values) {
            addCriterion("tbta_id not in", values, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdBetween(Integer value1, Integer value2) {
            addCriterion("tbta_id between", value1, value2, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbta_id not between", value1, value2, "tbtaId");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberIsNull() {
            addCriterion("tbta_member is null");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberIsNotNull() {
            addCriterion("tbta_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberEqualTo(Integer value) {
            addCriterion("tbta_member =", value, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberNotEqualTo(Integer value) {
            addCriterion("tbta_member <>", value, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberGreaterThan(Integer value) {
            addCriterion("tbta_member >", value, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbta_member >=", value, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberLessThan(Integer value) {
            addCriterion("tbta_member <", value, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbta_member <=", value, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberIn(List<Integer> values) {
            addCriterion("tbta_member in", values, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberNotIn(List<Integer> values) {
            addCriterion("tbta_member not in", values, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbta_member between", value1, value2, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbta_member not between", value1, value2, "tbtaMember");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdIsNull() {
            addCriterion("tbta_third_id is null");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdIsNotNull() {
            addCriterion("tbta_third_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdEqualTo(String value) {
            addCriterion("tbta_third_id =", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdNotEqualTo(String value) {
            addCriterion("tbta_third_id <>", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdGreaterThan(String value) {
            addCriterion("tbta_third_id >", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdGreaterThanOrEqualTo(String value) {
            addCriterion("tbta_third_id >=", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdLessThan(String value) {
            addCriterion("tbta_third_id <", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdLessThanOrEqualTo(String value) {
            addCriterion("tbta_third_id <=", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdLike(String value) {
            addCriterion("tbta_third_id like", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdNotLike(String value) {
            addCriterion("tbta_third_id not like", value, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdIn(List<String> values) {
            addCriterion("tbta_third_id in", values, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdNotIn(List<String> values) {
            addCriterion("tbta_third_id not in", values, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdBetween(String value1, String value2) {
            addCriterion("tbta_third_id between", value1, value2, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaThirdIdNotBetween(String value1, String value2) {
            addCriterion("tbta_third_id not between", value1, value2, "tbtaThirdId");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeIsNull() {
            addCriterion("tbta_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeIsNotNull() {
            addCriterion("tbta_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeEqualTo(Date value) {
            addCriterion("tbta_create_time =", value, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeNotEqualTo(Date value) {
            addCriterion("tbta_create_time <>", value, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeGreaterThan(Date value) {
            addCriterion("tbta_create_time >", value, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbta_create_time >=", value, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeLessThan(Date value) {
            addCriterion("tbta_create_time <", value, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbta_create_time <=", value, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeIn(List<Date> values) {
            addCriterion("tbta_create_time in", values, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeNotIn(List<Date> values) {
            addCriterion("tbta_create_time not in", values, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeBetween(Date value1, Date value2) {
            addCriterion("tbta_create_time between", value1, value2, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbta_create_time not between", value1, value2, "tbtaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeIsNull() {
            addCriterion("tbta_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeIsNotNull() {
            addCriterion("tbta_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeEqualTo(Date value) {
            addCriterion("tbta_last_login_time =", value, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeNotEqualTo(Date value) {
            addCriterion("tbta_last_login_time <>", value, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeGreaterThan(Date value) {
            addCriterion("tbta_last_login_time >", value, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbta_last_login_time >=", value, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeLessThan(Date value) {
            addCriterion("tbta_last_login_time <", value, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbta_last_login_time <=", value, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeIn(List<Date> values) {
            addCriterion("tbta_last_login_time in", values, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeNotIn(List<Date> values) {
            addCriterion("tbta_last_login_time not in", values, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("tbta_last_login_time between", value1, value2, "tbtaLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTbtaLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbta_last_login_time not between", value1, value2, "tbtaLastLoginTime");
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