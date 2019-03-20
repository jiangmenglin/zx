package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andSlHostIsNull() {
            addCriterion("sl_host is null");
            return (Criteria) this;
        }

        public Criteria andSlHostIsNotNull() {
            addCriterion("sl_host is not null");
            return (Criteria) this;
        }

        public Criteria andSlHostEqualTo(Long value) {
            addCriterion("sl_host =", value, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostNotEqualTo(Long value) {
            addCriterion("sl_host <>", value, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostGreaterThan(Long value) {
            addCriterion("sl_host >", value, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_host >=", value, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostLessThan(Long value) {
            addCriterion("sl_host <", value, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostLessThanOrEqualTo(Long value) {
            addCriterion("sl_host <=", value, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostIn(List<Long> values) {
            addCriterion("sl_host in", values, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostNotIn(List<Long> values) {
            addCriterion("sl_host not in", values, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostBetween(Long value1, Long value2) {
            addCriterion("sl_host between", value1, value2, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlHostNotBetween(Long value1, Long value2) {
            addCriterion("sl_host not between", value1, value2, "slHost");
            return (Criteria) this;
        }

        public Criteria andSlNameIsNull() {
            addCriterion("sl_name is null");
            return (Criteria) this;
        }

        public Criteria andSlNameIsNotNull() {
            addCriterion("sl_name is not null");
            return (Criteria) this;
        }

        public Criteria andSlNameEqualTo(String value) {
            addCriterion("sl_name =", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameNotEqualTo(String value) {
            addCriterion("sl_name <>", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameGreaterThan(String value) {
            addCriterion("sl_name >", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameGreaterThanOrEqualTo(String value) {
            addCriterion("sl_name >=", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameLessThan(String value) {
            addCriterion("sl_name <", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameLessThanOrEqualTo(String value) {
            addCriterion("sl_name <=", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameLike(String value) {
            addCriterion("sl_name like", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameNotLike(String value) {
            addCriterion("sl_name not like", value, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameIn(List<String> values) {
            addCriterion("sl_name in", values, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameNotIn(List<String> values) {
            addCriterion("sl_name not in", values, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameBetween(String value1, String value2) {
            addCriterion("sl_name between", value1, value2, "slName");
            return (Criteria) this;
        }

        public Criteria andSlNameNotBetween(String value1, String value2) {
            addCriterion("sl_name not between", value1, value2, "slName");
            return (Criteria) this;
        }

        public Criteria andSlModelIsNull() {
            addCriterion("sl_model is null");
            return (Criteria) this;
        }

        public Criteria andSlModelIsNotNull() {
            addCriterion("sl_model is not null");
            return (Criteria) this;
        }

        public Criteria andSlModelEqualTo(Long value) {
            addCriterion("sl_model =", value, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelNotEqualTo(Long value) {
            addCriterion("sl_model <>", value, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelGreaterThan(Long value) {
            addCriterion("sl_model >", value, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_model >=", value, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelLessThan(Long value) {
            addCriterion("sl_model <", value, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelLessThanOrEqualTo(Long value) {
            addCriterion("sl_model <=", value, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelIn(List<Long> values) {
            addCriterion("sl_model in", values, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelNotIn(List<Long> values) {
            addCriterion("sl_model not in", values, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelBetween(Long value1, Long value2) {
            addCriterion("sl_model between", value1, value2, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlModelNotBetween(Long value1, Long value2) {
            addCriterion("sl_model not between", value1, value2, "slModel");
            return (Criteria) this;
        }

        public Criteria andSlTypeIsNull() {
            addCriterion("sl_type is null");
            return (Criteria) this;
        }

        public Criteria andSlTypeIsNotNull() {
            addCriterion("sl_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlTypeEqualTo(Long value) {
            addCriterion("sl_type =", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeNotEqualTo(Long value) {
            addCriterion("sl_type <>", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeGreaterThan(Long value) {
            addCriterion("sl_type >", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_type >=", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeLessThan(Long value) {
            addCriterion("sl_type <", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeLessThanOrEqualTo(Long value) {
            addCriterion("sl_type <=", value, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeIn(List<Long> values) {
            addCriterion("sl_type in", values, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeNotIn(List<Long> values) {
            addCriterion("sl_type not in", values, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeBetween(Long value1, Long value2) {
            addCriterion("sl_type between", value1, value2, "slType");
            return (Criteria) this;
        }

        public Criteria andSlTypeNotBetween(Long value1, Long value2) {
            addCriterion("sl_type not between", value1, value2, "slType");
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

        public Criteria andSlClassIsNull() {
            addCriterion("sl_class is null");
            return (Criteria) this;
        }

        public Criteria andSlClassIsNotNull() {
            addCriterion("sl_class is not null");
            return (Criteria) this;
        }

        public Criteria andSlClassEqualTo(String value) {
            addCriterion("sl_class =", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassNotEqualTo(String value) {
            addCriterion("sl_class <>", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassGreaterThan(String value) {
            addCriterion("sl_class >", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassGreaterThanOrEqualTo(String value) {
            addCriterion("sl_class >=", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassLessThan(String value) {
            addCriterion("sl_class <", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassLessThanOrEqualTo(String value) {
            addCriterion("sl_class <=", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassLike(String value) {
            addCriterion("sl_class like", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassNotLike(String value) {
            addCriterion("sl_class not like", value, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassIn(List<String> values) {
            addCriterion("sl_class in", values, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassNotIn(List<String> values) {
            addCriterion("sl_class not in", values, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassBetween(String value1, String value2) {
            addCriterion("sl_class between", value1, value2, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlClassNotBetween(String value1, String value2) {
            addCriterion("sl_class not between", value1, value2, "slClass");
            return (Criteria) this;
        }

        public Criteria andSlRelateIsNull() {
            addCriterion("sl_relate is null");
            return (Criteria) this;
        }

        public Criteria andSlRelateIsNotNull() {
            addCriterion("sl_relate is not null");
            return (Criteria) this;
        }

        public Criteria andSlRelateEqualTo(Long value) {
            addCriterion("sl_relate =", value, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateNotEqualTo(Long value) {
            addCriterion("sl_relate <>", value, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateGreaterThan(Long value) {
            addCriterion("sl_relate >", value, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateGreaterThanOrEqualTo(Long value) {
            addCriterion("sl_relate >=", value, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateLessThan(Long value) {
            addCriterion("sl_relate <", value, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateLessThanOrEqualTo(Long value) {
            addCriterion("sl_relate <=", value, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateIn(List<Long> values) {
            addCriterion("sl_relate in", values, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateNotIn(List<Long> values) {
            addCriterion("sl_relate not in", values, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateBetween(Long value1, Long value2) {
            addCriterion("sl_relate between", value1, value2, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlRelateNotBetween(Long value1, Long value2) {
            addCriterion("sl_relate not between", value1, value2, "slRelate");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeIsNull() {
            addCriterion("sl_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeIsNotNull() {
            addCriterion("sl_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeEqualTo(Date value) {
            addCriterion("sl_add_time =", value, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeNotEqualTo(Date value) {
            addCriterion("sl_add_time <>", value, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeGreaterThan(Date value) {
            addCriterion("sl_add_time >", value, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sl_add_time >=", value, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeLessThan(Date value) {
            addCriterion("sl_add_time <", value, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("sl_add_time <=", value, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeIn(List<Date> values) {
            addCriterion("sl_add_time in", values, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeNotIn(List<Date> values) {
            addCriterion("sl_add_time not in", values, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeBetween(Date value1, Date value2) {
            addCriterion("sl_add_time between", value1, value2, "slAddTime");
            return (Criteria) this;
        }

        public Criteria andSlAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("sl_add_time not between", value1, value2, "slAddTime");
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