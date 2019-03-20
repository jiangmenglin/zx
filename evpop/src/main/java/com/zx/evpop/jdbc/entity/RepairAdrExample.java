package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RepairAdrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairAdrExample() {
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

        public Criteria andTbraIdIsNull() {
            addCriterion("tbra_id is null");
            return (Criteria) this;
        }

        public Criteria andTbraIdIsNotNull() {
            addCriterion("tbra_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbraIdEqualTo(Integer value) {
            addCriterion("tbra_id =", value, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdNotEqualTo(Integer value) {
            addCriterion("tbra_id <>", value, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdGreaterThan(Integer value) {
            addCriterion("tbra_id >", value, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbra_id >=", value, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdLessThan(Integer value) {
            addCriterion("tbra_id <", value, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbra_id <=", value, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdIn(List<Integer> values) {
            addCriterion("tbra_id in", values, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdNotIn(List<Integer> values) {
            addCriterion("tbra_id not in", values, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdBetween(Integer value1, Integer value2) {
            addCriterion("tbra_id between", value1, value2, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbra_id not between", value1, value2, "tbraId");
            return (Criteria) this;
        }

        public Criteria andTbraHostIsNull() {
            addCriterion("tbra_host is null");
            return (Criteria) this;
        }

        public Criteria andTbraHostIsNotNull() {
            addCriterion("tbra_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbraHostEqualTo(Short value) {
            addCriterion("tbra_host =", value, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostNotEqualTo(Short value) {
            addCriterion("tbra_host <>", value, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostGreaterThan(Short value) {
            addCriterion("tbra_host >", value, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbra_host >=", value, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostLessThan(Short value) {
            addCriterion("tbra_host <", value, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostLessThanOrEqualTo(Short value) {
            addCriterion("tbra_host <=", value, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostIn(List<Short> values) {
            addCriterion("tbra_host in", values, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostNotIn(List<Short> values) {
            addCriterion("tbra_host not in", values, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostBetween(Short value1, Short value2) {
            addCriterion("tbra_host between", value1, value2, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraHostNotBetween(Short value1, Short value2) {
            addCriterion("tbra_host not between", value1, value2, "tbraHost");
            return (Criteria) this;
        }

        public Criteria andTbraNameIsNull() {
            addCriterion("tbra_name is null");
            return (Criteria) this;
        }

        public Criteria andTbraNameIsNotNull() {
            addCriterion("tbra_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbraNameEqualTo(String value) {
            addCriterion("tbra_name =", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameNotEqualTo(String value) {
            addCriterion("tbra_name <>", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameGreaterThan(String value) {
            addCriterion("tbra_name >", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbra_name >=", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameLessThan(String value) {
            addCriterion("tbra_name <", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameLessThanOrEqualTo(String value) {
            addCriterion("tbra_name <=", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameLike(String value) {
            addCriterion("tbra_name like", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameNotLike(String value) {
            addCriterion("tbra_name not like", value, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameIn(List<String> values) {
            addCriterion("tbra_name in", values, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameNotIn(List<String> values) {
            addCriterion("tbra_name not in", values, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameBetween(String value1, String value2) {
            addCriterion("tbra_name between", value1, value2, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraNameNotBetween(String value1, String value2) {
            addCriterion("tbra_name not between", value1, value2, "tbraName");
            return (Criteria) this;
        }

        public Criteria andTbraLatIsNull() {
            addCriterion("tbra_lat is null");
            return (Criteria) this;
        }

        public Criteria andTbraLatIsNotNull() {
            addCriterion("tbra_lat is not null");
            return (Criteria) this;
        }

        public Criteria andTbraLatEqualTo(BigDecimal value) {
            addCriterion("tbra_lat =", value, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatNotEqualTo(BigDecimal value) {
            addCriterion("tbra_lat <>", value, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatGreaterThan(BigDecimal value) {
            addCriterion("tbra_lat >", value, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbra_lat >=", value, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatLessThan(BigDecimal value) {
            addCriterion("tbra_lat <", value, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbra_lat <=", value, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatIn(List<BigDecimal> values) {
            addCriterion("tbra_lat in", values, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatNotIn(List<BigDecimal> values) {
            addCriterion("tbra_lat not in", values, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbra_lat between", value1, value2, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbra_lat not between", value1, value2, "tbraLat");
            return (Criteria) this;
        }

        public Criteria andTbraLngIsNull() {
            addCriterion("tbra_lng is null");
            return (Criteria) this;
        }

        public Criteria andTbraLngIsNotNull() {
            addCriterion("tbra_lng is not null");
            return (Criteria) this;
        }

        public Criteria andTbraLngEqualTo(BigDecimal value) {
            addCriterion("tbra_lng =", value, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngNotEqualTo(BigDecimal value) {
            addCriterion("tbra_lng <>", value, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngGreaterThan(BigDecimal value) {
            addCriterion("tbra_lng >", value, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbra_lng >=", value, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngLessThan(BigDecimal value) {
            addCriterion("tbra_lng <", value, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbra_lng <=", value, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngIn(List<BigDecimal> values) {
            addCriterion("tbra_lng in", values, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngNotIn(List<BigDecimal> values) {
            addCriterion("tbra_lng not in", values, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbra_lng between", value1, value2, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbra_lng not between", value1, value2, "tbraLng");
            return (Criteria) this;
        }

        public Criteria andTbraAddressIsNull() {
            addCriterion("tbra_address is null");
            return (Criteria) this;
        }

        public Criteria andTbraAddressIsNotNull() {
            addCriterion("tbra_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbraAddressEqualTo(String value) {
            addCriterion("tbra_address =", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressNotEqualTo(String value) {
            addCriterion("tbra_address <>", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressGreaterThan(String value) {
            addCriterion("tbra_address >", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbra_address >=", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressLessThan(String value) {
            addCriterion("tbra_address <", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressLessThanOrEqualTo(String value) {
            addCriterion("tbra_address <=", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressLike(String value) {
            addCriterion("tbra_address like", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressNotLike(String value) {
            addCriterion("tbra_address not like", value, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressIn(List<String> values) {
            addCriterion("tbra_address in", values, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressNotIn(List<String> values) {
            addCriterion("tbra_address not in", values, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressBetween(String value1, String value2) {
            addCriterion("tbra_address between", value1, value2, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraAddressNotBetween(String value1, String value2) {
            addCriterion("tbra_address not between", value1, value2, "tbraAddress");
            return (Criteria) this;
        }

        public Criteria andTbraStatusIsNull() {
            addCriterion("tbra_status is null");
            return (Criteria) this;
        }

        public Criteria andTbraStatusIsNotNull() {
            addCriterion("tbra_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbraStatusEqualTo(Byte value) {
            addCriterion("tbra_status =", value, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusNotEqualTo(Byte value) {
            addCriterion("tbra_status <>", value, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusGreaterThan(Byte value) {
            addCriterion("tbra_status >", value, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbra_status >=", value, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusLessThan(Byte value) {
            addCriterion("tbra_status <", value, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbra_status <=", value, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusIn(List<Byte> values) {
            addCriterion("tbra_status in", values, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusNotIn(List<Byte> values) {
            addCriterion("tbra_status not in", values, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbra_status between", value1, value2, "tbraStatus");
            return (Criteria) this;
        }

        public Criteria andTbraStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbra_status not between", value1, value2, "tbraStatus");
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