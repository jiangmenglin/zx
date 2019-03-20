package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class CarLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarLineExample() {
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

        public Criteria andTbclIdIsNull() {
            addCriterion("tbcl_id is null");
            return (Criteria) this;
        }

        public Criteria andTbclIdIsNotNull() {
            addCriterion("tbcl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbclIdEqualTo(Long value) {
            addCriterion("tbcl_id =", value, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdNotEqualTo(Long value) {
            addCriterion("tbcl_id <>", value, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdGreaterThan(Long value) {
            addCriterion("tbcl_id >", value, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcl_id >=", value, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdLessThan(Long value) {
            addCriterion("tbcl_id <", value, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdLessThanOrEqualTo(Long value) {
            addCriterion("tbcl_id <=", value, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdIn(List<Long> values) {
            addCriterion("tbcl_id in", values, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdNotIn(List<Long> values) {
            addCriterion("tbcl_id not in", values, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdBetween(Long value1, Long value2) {
            addCriterion("tbcl_id between", value1, value2, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclIdNotBetween(Long value1, Long value2) {
            addCriterion("tbcl_id not between", value1, value2, "tbclId");
            return (Criteria) this;
        }

        public Criteria andTbclHostIsNull() {
            addCriterion("tbcl_host is null");
            return (Criteria) this;
        }

        public Criteria andTbclHostIsNotNull() {
            addCriterion("tbcl_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbclHostEqualTo(Long value) {
            addCriterion("tbcl_host =", value, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostNotEqualTo(Long value) {
            addCriterion("tbcl_host <>", value, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostGreaterThan(Long value) {
            addCriterion("tbcl_host >", value, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcl_host >=", value, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostLessThan(Long value) {
            addCriterion("tbcl_host <", value, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostLessThanOrEqualTo(Long value) {
            addCriterion("tbcl_host <=", value, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostIn(List<Long> values) {
            addCriterion("tbcl_host in", values, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostNotIn(List<Long> values) {
            addCriterion("tbcl_host not in", values, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostBetween(Long value1, Long value2) {
            addCriterion("tbcl_host between", value1, value2, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclHostNotBetween(Long value1, Long value2) {
            addCriterion("tbcl_host not between", value1, value2, "tbclHost");
            return (Criteria) this;
        }

        public Criteria andTbclCarIsNull() {
            addCriterion("tbcl_car is null");
            return (Criteria) this;
        }

        public Criteria andTbclCarIsNotNull() {
            addCriterion("tbcl_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbclCarEqualTo(Long value) {
            addCriterion("tbcl_car =", value, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarNotEqualTo(Long value) {
            addCriterion("tbcl_car <>", value, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarGreaterThan(Long value) {
            addCriterion("tbcl_car >", value, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcl_car >=", value, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarLessThan(Long value) {
            addCriterion("tbcl_car <", value, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarLessThanOrEqualTo(Long value) {
            addCriterion("tbcl_car <=", value, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarIn(List<Long> values) {
            addCriterion("tbcl_car in", values, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarNotIn(List<Long> values) {
            addCriterion("tbcl_car not in", values, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarBetween(Long value1, Long value2) {
            addCriterion("tbcl_car between", value1, value2, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclCarNotBetween(Long value1, Long value2) {
            addCriterion("tbcl_car not between", value1, value2, "tbclCar");
            return (Criteria) this;
        }

        public Criteria andTbclMonthIsNull() {
            addCriterion("tbcl_month is null");
            return (Criteria) this;
        }

        public Criteria andTbclMonthIsNotNull() {
            addCriterion("tbcl_month is not null");
            return (Criteria) this;
        }

        public Criteria andTbclMonthEqualTo(String value) {
            addCriterion("tbcl_month =", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthNotEqualTo(String value) {
            addCriterion("tbcl_month <>", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthGreaterThan(String value) {
            addCriterion("tbcl_month >", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthGreaterThanOrEqualTo(String value) {
            addCriterion("tbcl_month >=", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthLessThan(String value) {
            addCriterion("tbcl_month <", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthLessThanOrEqualTo(String value) {
            addCriterion("tbcl_month <=", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthLike(String value) {
            addCriterion("tbcl_month like", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthNotLike(String value) {
            addCriterion("tbcl_month not like", value, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthIn(List<String> values) {
            addCriterion("tbcl_month in", values, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthNotIn(List<String> values) {
            addCriterion("tbcl_month not in", values, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthBetween(String value1, String value2) {
            addCriterion("tbcl_month between", value1, value2, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclMonthNotBetween(String value1, String value2) {
            addCriterion("tbcl_month not between", value1, value2, "tbclMonth");
            return (Criteria) this;
        }

        public Criteria andTbclDLineIsNull() {
            addCriterion("tbcl_d_line is null");
            return (Criteria) this;
        }

        public Criteria andTbclDLineIsNotNull() {
            addCriterion("tbcl_d_line is not null");
            return (Criteria) this;
        }

        public Criteria andTbclDLineEqualTo(String value) {
            addCriterion("tbcl_d_line =", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineNotEqualTo(String value) {
            addCriterion("tbcl_d_line <>", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineGreaterThan(String value) {
            addCriterion("tbcl_d_line >", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineGreaterThanOrEqualTo(String value) {
            addCriterion("tbcl_d_line >=", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineLessThan(String value) {
            addCriterion("tbcl_d_line <", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineLessThanOrEqualTo(String value) {
            addCriterion("tbcl_d_line <=", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineLike(String value) {
            addCriterion("tbcl_d_line like", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineNotLike(String value) {
            addCriterion("tbcl_d_line not like", value, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineIn(List<String> values) {
            addCriterion("tbcl_d_line in", values, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineNotIn(List<String> values) {
            addCriterion("tbcl_d_line not in", values, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineBetween(String value1, String value2) {
            addCriterion("tbcl_d_line between", value1, value2, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclDLineNotBetween(String value1, String value2) {
            addCriterion("tbcl_d_line not between", value1, value2, "tbclDLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineIsNull() {
            addCriterion("tbcl_h_line is null");
            return (Criteria) this;
        }

        public Criteria andTbclHLineIsNotNull() {
            addCriterion("tbcl_h_line is not null");
            return (Criteria) this;
        }

        public Criteria andTbclHLineEqualTo(String value) {
            addCriterion("tbcl_h_line =", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineNotEqualTo(String value) {
            addCriterion("tbcl_h_line <>", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineGreaterThan(String value) {
            addCriterion("tbcl_h_line >", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineGreaterThanOrEqualTo(String value) {
            addCriterion("tbcl_h_line >=", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineLessThan(String value) {
            addCriterion("tbcl_h_line <", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineLessThanOrEqualTo(String value) {
            addCriterion("tbcl_h_line <=", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineLike(String value) {
            addCriterion("tbcl_h_line like", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineNotLike(String value) {
            addCriterion("tbcl_h_line not like", value, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineIn(List<String> values) {
            addCriterion("tbcl_h_line in", values, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineNotIn(List<String> values) {
            addCriterion("tbcl_h_line not in", values, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineBetween(String value1, String value2) {
            addCriterion("tbcl_h_line between", value1, value2, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclHLineNotBetween(String value1, String value2) {
            addCriterion("tbcl_h_line not between", value1, value2, "tbclHLine");
            return (Criteria) this;
        }

        public Criteria andTbclDaySIsNull() {
            addCriterion("tbcl_day_s is null");
            return (Criteria) this;
        }

        public Criteria andTbclDaySIsNotNull() {
            addCriterion("tbcl_day_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbclDaySEqualTo(Integer value) {
            addCriterion("tbcl_day_s =", value, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySNotEqualTo(Integer value) {
            addCriterion("tbcl_day_s <>", value, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySGreaterThan(Integer value) {
            addCriterion("tbcl_day_s >", value, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbcl_day_s >=", value, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySLessThan(Integer value) {
            addCriterion("tbcl_day_s <", value, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySLessThanOrEqualTo(Integer value) {
            addCriterion("tbcl_day_s <=", value, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySIn(List<Integer> values) {
            addCriterion("tbcl_day_s in", values, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySNotIn(List<Integer> values) {
            addCriterion("tbcl_day_s not in", values, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySBetween(Integer value1, Integer value2) {
            addCriterion("tbcl_day_s between", value1, value2, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclDaySNotBetween(Integer value1, Integer value2) {
            addCriterion("tbcl_day_s not between", value1, value2, "tbclDayS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSIsNull() {
            addCriterion("tbcl_hour_s is null");
            return (Criteria) this;
        }

        public Criteria andTbclHourSIsNotNull() {
            addCriterion("tbcl_hour_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbclHourSEqualTo(Integer value) {
            addCriterion("tbcl_hour_s =", value, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSNotEqualTo(Integer value) {
            addCriterion("tbcl_hour_s <>", value, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSGreaterThan(Integer value) {
            addCriterion("tbcl_hour_s >", value, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbcl_hour_s >=", value, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSLessThan(Integer value) {
            addCriterion("tbcl_hour_s <", value, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSLessThanOrEqualTo(Integer value) {
            addCriterion("tbcl_hour_s <=", value, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSIn(List<Integer> values) {
            addCriterion("tbcl_hour_s in", values, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSNotIn(List<Integer> values) {
            addCriterion("tbcl_hour_s not in", values, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSBetween(Integer value1, Integer value2) {
            addCriterion("tbcl_hour_s between", value1, value2, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclHourSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbcl_hour_s not between", value1, value2, "tbclHourS");
            return (Criteria) this;
        }

        public Criteria andTbclStatusIsNull() {
            addCriterion("tbcl_status is null");
            return (Criteria) this;
        }

        public Criteria andTbclStatusIsNotNull() {
            addCriterion("tbcl_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbclStatusEqualTo(Short value) {
            addCriterion("tbcl_status =", value, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusNotEqualTo(Short value) {
            addCriterion("tbcl_status <>", value, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusGreaterThan(Short value) {
            addCriterion("tbcl_status >", value, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcl_status >=", value, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusLessThan(Short value) {
            addCriterion("tbcl_status <", value, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbcl_status <=", value, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusIn(List<Short> values) {
            addCriterion("tbcl_status in", values, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusNotIn(List<Short> values) {
            addCriterion("tbcl_status not in", values, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusBetween(Short value1, Short value2) {
            addCriterion("tbcl_status between", value1, value2, "tbclStatus");
            return (Criteria) this;
        }

        public Criteria andTbclStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbcl_status not between", value1, value2, "tbclStatus");
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