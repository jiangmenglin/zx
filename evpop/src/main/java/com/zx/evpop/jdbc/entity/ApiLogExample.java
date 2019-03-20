package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiLogExample() {
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

        public Criteria andSalIdIsNull() {
            addCriterion("sal_id is null");
            return (Criteria) this;
        }

        public Criteria andSalIdIsNotNull() {
            addCriterion("sal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalIdEqualTo(Long value) {
            addCriterion("sal_id =", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotEqualTo(Long value) {
            addCriterion("sal_id <>", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThan(Long value) {
            addCriterion("sal_id >", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sal_id >=", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdLessThan(Long value) {
            addCriterion("sal_id <", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdLessThanOrEqualTo(Long value) {
            addCriterion("sal_id <=", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdIn(List<Long> values) {
            addCriterion("sal_id in", values, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotIn(List<Long> values) {
            addCriterion("sal_id not in", values, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdBetween(Long value1, Long value2) {
            addCriterion("sal_id between", value1, value2, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotBetween(Long value1, Long value2) {
            addCriterion("sal_id not between", value1, value2, "salId");
            return (Criteria) this;
        }

        public Criteria andSalClientIsNull() {
            addCriterion("sal_client is null");
            return (Criteria) this;
        }

        public Criteria andSalClientIsNotNull() {
            addCriterion("sal_client is not null");
            return (Criteria) this;
        }

        public Criteria andSalClientEqualTo(Long value) {
            addCriterion("sal_client =", value, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientNotEqualTo(Long value) {
            addCriterion("sal_client <>", value, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientGreaterThan(Long value) {
            addCriterion("sal_client >", value, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientGreaterThanOrEqualTo(Long value) {
            addCriterion("sal_client >=", value, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientLessThan(Long value) {
            addCriterion("sal_client <", value, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientLessThanOrEqualTo(Long value) {
            addCriterion("sal_client <=", value, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientIn(List<Long> values) {
            addCriterion("sal_client in", values, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientNotIn(List<Long> values) {
            addCriterion("sal_client not in", values, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientBetween(Long value1, Long value2) {
            addCriterion("sal_client between", value1, value2, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalClientNotBetween(Long value1, Long value2) {
            addCriterion("sal_client not between", value1, value2, "salClient");
            return (Criteria) this;
        }

        public Criteria andSalApiIsNull() {
            addCriterion("sal_api is null");
            return (Criteria) this;
        }

        public Criteria andSalApiIsNotNull() {
            addCriterion("sal_api is not null");
            return (Criteria) this;
        }

        public Criteria andSalApiEqualTo(String value) {
            addCriterion("sal_api =", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiNotEqualTo(String value) {
            addCriterion("sal_api <>", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiGreaterThan(String value) {
            addCriterion("sal_api >", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiGreaterThanOrEqualTo(String value) {
            addCriterion("sal_api >=", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiLessThan(String value) {
            addCriterion("sal_api <", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiLessThanOrEqualTo(String value) {
            addCriterion("sal_api <=", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiLike(String value) {
            addCriterion("sal_api like", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiNotLike(String value) {
            addCriterion("sal_api not like", value, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiIn(List<String> values) {
            addCriterion("sal_api in", values, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiNotIn(List<String> values) {
            addCriterion("sal_api not in", values, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiBetween(String value1, String value2) {
            addCriterion("sal_api between", value1, value2, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalApiNotBetween(String value1, String value2) {
            addCriterion("sal_api not between", value1, value2, "salApi");
            return (Criteria) this;
        }

        public Criteria andSalMemberIsNull() {
            addCriterion("sal_member is null");
            return (Criteria) this;
        }

        public Criteria andSalMemberIsNotNull() {
            addCriterion("sal_member is not null");
            return (Criteria) this;
        }

        public Criteria andSalMemberEqualTo(Long value) {
            addCriterion("sal_member =", value, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberNotEqualTo(Long value) {
            addCriterion("sal_member <>", value, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberGreaterThan(Long value) {
            addCriterion("sal_member >", value, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("sal_member >=", value, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberLessThan(Long value) {
            addCriterion("sal_member <", value, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberLessThanOrEqualTo(Long value) {
            addCriterion("sal_member <=", value, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberIn(List<Long> values) {
            addCriterion("sal_member in", values, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberNotIn(List<Long> values) {
            addCriterion("sal_member not in", values, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberBetween(Long value1, Long value2) {
            addCriterion("sal_member between", value1, value2, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalMemberNotBetween(Long value1, Long value2) {
            addCriterion("sal_member not between", value1, value2, "salMember");
            return (Criteria) this;
        }

        public Criteria andSalLatIsNull() {
            addCriterion("sal_lat is null");
            return (Criteria) this;
        }

        public Criteria andSalLatIsNotNull() {
            addCriterion("sal_lat is not null");
            return (Criteria) this;
        }

        public Criteria andSalLatEqualTo(Double value) {
            addCriterion("sal_lat =", value, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatNotEqualTo(Double value) {
            addCriterion("sal_lat <>", value, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatGreaterThan(Double value) {
            addCriterion("sal_lat >", value, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatGreaterThanOrEqualTo(Double value) {
            addCriterion("sal_lat >=", value, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatLessThan(Double value) {
            addCriterion("sal_lat <", value, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatLessThanOrEqualTo(Double value) {
            addCriterion("sal_lat <=", value, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatIn(List<Double> values) {
            addCriterion("sal_lat in", values, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatNotIn(List<Double> values) {
            addCriterion("sal_lat not in", values, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatBetween(Double value1, Double value2) {
            addCriterion("sal_lat between", value1, value2, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLatNotBetween(Double value1, Double value2) {
            addCriterion("sal_lat not between", value1, value2, "salLat");
            return (Criteria) this;
        }

        public Criteria andSalLngIsNull() {
            addCriterion("sal_lng is null");
            return (Criteria) this;
        }

        public Criteria andSalLngIsNotNull() {
            addCriterion("sal_lng is not null");
            return (Criteria) this;
        }

        public Criteria andSalLngEqualTo(Double value) {
            addCriterion("sal_lng =", value, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngNotEqualTo(Double value) {
            addCriterion("sal_lng <>", value, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngGreaterThan(Double value) {
            addCriterion("sal_lng >", value, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngGreaterThanOrEqualTo(Double value) {
            addCriterion("sal_lng >=", value, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngLessThan(Double value) {
            addCriterion("sal_lng <", value, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngLessThanOrEqualTo(Double value) {
            addCriterion("sal_lng <=", value, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngIn(List<Double> values) {
            addCriterion("sal_lng in", values, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngNotIn(List<Double> values) {
            addCriterion("sal_lng not in", values, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngBetween(Double value1, Double value2) {
            addCriterion("sal_lng between", value1, value2, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalLngNotBetween(Double value1, Double value2) {
            addCriterion("sal_lng not between", value1, value2, "salLng");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeIsNull() {
            addCriterion("sal_invoke_time is null");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeIsNotNull() {
            addCriterion("sal_invoke_time is not null");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeEqualTo(Date value) {
            addCriterion("sal_invoke_time =", value, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeNotEqualTo(Date value) {
            addCriterion("sal_invoke_time <>", value, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeGreaterThan(Date value) {
            addCriterion("sal_invoke_time >", value, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sal_invoke_time >=", value, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeLessThan(Date value) {
            addCriterion("sal_invoke_time <", value, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeLessThanOrEqualTo(Date value) {
            addCriterion("sal_invoke_time <=", value, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeIn(List<Date> values) {
            addCriterion("sal_invoke_time in", values, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeNotIn(List<Date> values) {
            addCriterion("sal_invoke_time not in", values, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeBetween(Date value1, Date value2) {
            addCriterion("sal_invoke_time between", value1, value2, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalInvokeTimeNotBetween(Date value1, Date value2) {
            addCriterion("sal_invoke_time not between", value1, value2, "salInvokeTime");
            return (Criteria) this;
        }

        public Criteria andSalStatusIsNull() {
            addCriterion("sal_status is null");
            return (Criteria) this;
        }

        public Criteria andSalStatusIsNotNull() {
            addCriterion("sal_status is not null");
            return (Criteria) this;
        }

        public Criteria andSalStatusEqualTo(Short value) {
            addCriterion("sal_status =", value, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusNotEqualTo(Short value) {
            addCriterion("sal_status <>", value, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusGreaterThan(Short value) {
            addCriterion("sal_status >", value, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sal_status >=", value, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusLessThan(Short value) {
            addCriterion("sal_status <", value, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusLessThanOrEqualTo(Short value) {
            addCriterion("sal_status <=", value, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusIn(List<Short> values) {
            addCriterion("sal_status in", values, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusNotIn(List<Short> values) {
            addCriterion("sal_status not in", values, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusBetween(Short value1, Short value2) {
            addCriterion("sal_status between", value1, value2, "salStatus");
            return (Criteria) this;
        }

        public Criteria andSalStatusNotBetween(Short value1, Short value2) {
            addCriterion("sal_status not between", value1, value2, "salStatus");
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