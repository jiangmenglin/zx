package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarnTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarnTypeExample() {
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

        public Criteria andTbwtIdIsNull() {
            addCriterion("tbwt_id is null");
            return (Criteria) this;
        }

        public Criteria andTbwtIdIsNotNull() {
            addCriterion("tbwt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtIdEqualTo(Long value) {
            addCriterion("tbwt_id =", value, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdNotEqualTo(Long value) {
            addCriterion("tbwt_id <>", value, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdGreaterThan(Long value) {
            addCriterion("tbwt_id >", value, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbwt_id >=", value, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdLessThan(Long value) {
            addCriterion("tbwt_id <", value, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdLessThanOrEqualTo(Long value) {
            addCriterion("tbwt_id <=", value, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdIn(List<Long> values) {
            addCriterion("tbwt_id in", values, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdNotIn(List<Long> values) {
            addCriterion("tbwt_id not in", values, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdBetween(Long value1, Long value2) {
            addCriterion("tbwt_id between", value1, value2, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtIdNotBetween(Long value1, Long value2) {
            addCriterion("tbwt_id not between", value1, value2, "tbwtId");
            return (Criteria) this;
        }

        public Criteria andTbwtNameIsNull() {
            addCriterion("tbwt_name is null");
            return (Criteria) this;
        }

        public Criteria andTbwtNameIsNotNull() {
            addCriterion("tbwt_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtNameEqualTo(String value) {
            addCriterion("tbwt_name =", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameNotEqualTo(String value) {
            addCriterion("tbwt_name <>", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameGreaterThan(String value) {
            addCriterion("tbwt_name >", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbwt_name >=", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameLessThan(String value) {
            addCriterion("tbwt_name <", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameLessThanOrEqualTo(String value) {
            addCriterion("tbwt_name <=", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameLike(String value) {
            addCriterion("tbwt_name like", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameNotLike(String value) {
            addCriterion("tbwt_name not like", value, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameIn(List<String> values) {
            addCriterion("tbwt_name in", values, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameNotIn(List<String> values) {
            addCriterion("tbwt_name not in", values, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameBetween(String value1, String value2) {
            addCriterion("tbwt_name between", value1, value2, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtNameNotBetween(String value1, String value2) {
            addCriterion("tbwt_name not between", value1, value2, "tbwtName");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelIsNull() {
            addCriterion("tbwt_level is null");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelIsNotNull() {
            addCriterion("tbwt_level is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelEqualTo(Short value) {
            addCriterion("tbwt_level =", value, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelNotEqualTo(Short value) {
            addCriterion("tbwt_level <>", value, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelGreaterThan(Short value) {
            addCriterion("tbwt_level >", value, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("tbwt_level >=", value, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelLessThan(Short value) {
            addCriterion("tbwt_level <", value, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelLessThanOrEqualTo(Short value) {
            addCriterion("tbwt_level <=", value, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelIn(List<Short> values) {
            addCriterion("tbwt_level in", values, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelNotIn(List<Short> values) {
            addCriterion("tbwt_level not in", values, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelBetween(Short value1, Short value2) {
            addCriterion("tbwt_level between", value1, value2, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtLevelNotBetween(Short value1, Short value2) {
            addCriterion("tbwt_level not between", value1, value2, "tbwtLevel");
            return (Criteria) this;
        }

        public Criteria andTbwtActionIsNull() {
            addCriterion("tbwt_action is null");
            return (Criteria) this;
        }

        public Criteria andTbwtActionIsNotNull() {
            addCriterion("tbwt_action is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtActionEqualTo(String value) {
            addCriterion("tbwt_action =", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionNotEqualTo(String value) {
            addCriterion("tbwt_action <>", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionGreaterThan(String value) {
            addCriterion("tbwt_action >", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionGreaterThanOrEqualTo(String value) {
            addCriterion("tbwt_action >=", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionLessThan(String value) {
            addCriterion("tbwt_action <", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionLessThanOrEqualTo(String value) {
            addCriterion("tbwt_action <=", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionLike(String value) {
            addCriterion("tbwt_action like", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionNotLike(String value) {
            addCriterion("tbwt_action not like", value, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionIn(List<String> values) {
            addCriterion("tbwt_action in", values, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionNotIn(List<String> values) {
            addCriterion("tbwt_action not in", values, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionBetween(String value1, String value2) {
            addCriterion("tbwt_action between", value1, value2, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtActionNotBetween(String value1, String value2) {
            addCriterion("tbwt_action not between", value1, value2, "tbwtAction");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalIsNull() {
            addCriterion("tbwt_interval is null");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalIsNotNull() {
            addCriterion("tbwt_interval is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalEqualTo(Long value) {
            addCriterion("tbwt_interval =", value, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalNotEqualTo(Long value) {
            addCriterion("tbwt_interval <>", value, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalGreaterThan(Long value) {
            addCriterion("tbwt_interval >", value, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("tbwt_interval >=", value, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalLessThan(Long value) {
            addCriterion("tbwt_interval <", value, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalLessThanOrEqualTo(Long value) {
            addCriterion("tbwt_interval <=", value, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalIn(List<Long> values) {
            addCriterion("tbwt_interval in", values, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalNotIn(List<Long> values) {
            addCriterion("tbwt_interval not in", values, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalBetween(Long value1, Long value2) {
            addCriterion("tbwt_interval between", value1, value2, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtIntervalNotBetween(Long value1, Long value2) {
            addCriterion("tbwt_interval not between", value1, value2, "tbwtInterval");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeIsNull() {
            addCriterion("tbwt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeIsNotNull() {
            addCriterion("tbwt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeEqualTo(Date value) {
            addCriterion("tbwt_update_time =", value, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbwt_update_time <>", value, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeGreaterThan(Date value) {
            addCriterion("tbwt_update_time >", value, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwt_update_time >=", value, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeLessThan(Date value) {
            addCriterion("tbwt_update_time <", value, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwt_update_time <=", value, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeIn(List<Date> values) {
            addCriterion("tbwt_update_time in", values, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbwt_update_time not in", values, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbwt_update_time between", value1, value2, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwt_update_time not between", value1, value2, "tbwtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeIsNull() {
            addCriterion("tbwt_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeIsNotNull() {
            addCriterion("tbwt_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeEqualTo(Date value) {
            addCriterion("tbwt_add_time =", value, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeNotEqualTo(Date value) {
            addCriterion("tbwt_add_time <>", value, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeGreaterThan(Date value) {
            addCriterion("tbwt_add_time >", value, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwt_add_time >=", value, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeLessThan(Date value) {
            addCriterion("tbwt_add_time <", value, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwt_add_time <=", value, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeIn(List<Date> values) {
            addCriterion("tbwt_add_time in", values, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeNotIn(List<Date> values) {
            addCriterion("tbwt_add_time not in", values, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbwt_add_time between", value1, value2, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwt_add_time not between", value1, value2, "tbwtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusIsNull() {
            addCriterion("tbwt_status is null");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusIsNotNull() {
            addCriterion("tbwt_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusEqualTo(Short value) {
            addCriterion("tbwt_status =", value, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusNotEqualTo(Short value) {
            addCriterion("tbwt_status <>", value, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusGreaterThan(Short value) {
            addCriterion("tbwt_status >", value, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbwt_status >=", value, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusLessThan(Short value) {
            addCriterion("tbwt_status <", value, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbwt_status <=", value, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusIn(List<Short> values) {
            addCriterion("tbwt_status in", values, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusNotIn(List<Short> values) {
            addCriterion("tbwt_status not in", values, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusBetween(Short value1, Short value2) {
            addCriterion("tbwt_status between", value1, value2, "tbwtStatus");
            return (Criteria) this;
        }

        public Criteria andTbwtStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbwt_status not between", value1, value2, "tbwtStatus");
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