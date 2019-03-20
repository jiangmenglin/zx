package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OauthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OauthExample() {
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

        public Criteria andSoIdIsNull() {
            addCriterion("so_id is null");
            return (Criteria) this;
        }

        public Criteria andSoIdIsNotNull() {
            addCriterion("so_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoIdEqualTo(Long value) {
            addCriterion("so_id =", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotEqualTo(Long value) {
            addCriterion("so_id <>", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdGreaterThan(Long value) {
            addCriterion("so_id >", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("so_id >=", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdLessThan(Long value) {
            addCriterion("so_id <", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdLessThanOrEqualTo(Long value) {
            addCriterion("so_id <=", value, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdIn(List<Long> values) {
            addCriterion("so_id in", values, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotIn(List<Long> values) {
            addCriterion("so_id not in", values, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdBetween(Long value1, Long value2) {
            addCriterion("so_id between", value1, value2, "soId");
            return (Criteria) this;
        }

        public Criteria andSoIdNotBetween(Long value1, Long value2) {
            addCriterion("so_id not between", value1, value2, "soId");
            return (Criteria) this;
        }

        public Criteria andSoTokenIsNull() {
            addCriterion("so_token is null");
            return (Criteria) this;
        }

        public Criteria andSoTokenIsNotNull() {
            addCriterion("so_token is not null");
            return (Criteria) this;
        }

        public Criteria andSoTokenEqualTo(String value) {
            addCriterion("so_token =", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenNotEqualTo(String value) {
            addCriterion("so_token <>", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenGreaterThan(String value) {
            addCriterion("so_token >", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenGreaterThanOrEqualTo(String value) {
            addCriterion("so_token >=", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenLessThan(String value) {
            addCriterion("so_token <", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenLessThanOrEqualTo(String value) {
            addCriterion("so_token <=", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenLike(String value) {
            addCriterion("so_token like", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenNotLike(String value) {
            addCriterion("so_token not like", value, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenIn(List<String> values) {
            addCriterion("so_token in", values, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenNotIn(List<String> values) {
            addCriterion("so_token not in", values, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenBetween(String value1, String value2) {
            addCriterion("so_token between", value1, value2, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoTokenNotBetween(String value1, String value2) {
            addCriterion("so_token not between", value1, value2, "soToken");
            return (Criteria) this;
        }

        public Criteria andSoUserIdIsNull() {
            addCriterion("so_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSoUserIdIsNotNull() {
            addCriterion("so_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoUserIdEqualTo(Long value) {
            addCriterion("so_user_id =", value, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdNotEqualTo(Long value) {
            addCriterion("so_user_id <>", value, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdGreaterThan(Long value) {
            addCriterion("so_user_id >", value, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("so_user_id >=", value, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdLessThan(Long value) {
            addCriterion("so_user_id <", value, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdLessThanOrEqualTo(Long value) {
            addCriterion("so_user_id <=", value, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdIn(List<Long> values) {
            addCriterion("so_user_id in", values, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdNotIn(List<Long> values) {
            addCriterion("so_user_id not in", values, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdBetween(Long value1, Long value2) {
            addCriterion("so_user_id between", value1, value2, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoUserIdNotBetween(Long value1, Long value2) {
            addCriterion("so_user_id not between", value1, value2, "soUserId");
            return (Criteria) this;
        }

        public Criteria andSoApiClientIsNull() {
            addCriterion("so_api_client is null");
            return (Criteria) this;
        }

        public Criteria andSoApiClientIsNotNull() {
            addCriterion("so_api_client is not null");
            return (Criteria) this;
        }

        public Criteria andSoApiClientEqualTo(Long value) {
            addCriterion("so_api_client =", value, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientNotEqualTo(Long value) {
            addCriterion("so_api_client <>", value, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientGreaterThan(Long value) {
            addCriterion("so_api_client >", value, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientGreaterThanOrEqualTo(Long value) {
            addCriterion("so_api_client >=", value, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientLessThan(Long value) {
            addCriterion("so_api_client <", value, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientLessThanOrEqualTo(Long value) {
            addCriterion("so_api_client <=", value, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientIn(List<Long> values) {
            addCriterion("so_api_client in", values, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientNotIn(List<Long> values) {
            addCriterion("so_api_client not in", values, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientBetween(Long value1, Long value2) {
            addCriterion("so_api_client between", value1, value2, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoApiClientNotBetween(Long value1, Long value2) {
            addCriterion("so_api_client not between", value1, value2, "soApiClient");
            return (Criteria) this;
        }

        public Criteria andSoTicketIsNull() {
            addCriterion("so_ticket is null");
            return (Criteria) this;
        }

        public Criteria andSoTicketIsNotNull() {
            addCriterion("so_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andSoTicketEqualTo(String value) {
            addCriterion("so_ticket =", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketNotEqualTo(String value) {
            addCriterion("so_ticket <>", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketGreaterThan(String value) {
            addCriterion("so_ticket >", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketGreaterThanOrEqualTo(String value) {
            addCriterion("so_ticket >=", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketLessThan(String value) {
            addCriterion("so_ticket <", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketLessThanOrEqualTo(String value) {
            addCriterion("so_ticket <=", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketLike(String value) {
            addCriterion("so_ticket like", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketNotLike(String value) {
            addCriterion("so_ticket not like", value, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketIn(List<String> values) {
            addCriterion("so_ticket in", values, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketNotIn(List<String> values) {
            addCriterion("so_ticket not in", values, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketBetween(String value1, String value2) {
            addCriterion("so_ticket between", value1, value2, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoTicketNotBetween(String value1, String value2) {
            addCriterion("so_ticket not between", value1, value2, "soTicket");
            return (Criteria) this;
        }

        public Criteria andSoParamsIsNull() {
            addCriterion("so_params is null");
            return (Criteria) this;
        }

        public Criteria andSoParamsIsNotNull() {
            addCriterion("so_params is not null");
            return (Criteria) this;
        }

        public Criteria andSoParamsEqualTo(String value) {
            addCriterion("so_params =", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsNotEqualTo(String value) {
            addCriterion("so_params <>", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsGreaterThan(String value) {
            addCriterion("so_params >", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsGreaterThanOrEqualTo(String value) {
            addCriterion("so_params >=", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsLessThan(String value) {
            addCriterion("so_params <", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsLessThanOrEqualTo(String value) {
            addCriterion("so_params <=", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsLike(String value) {
            addCriterion("so_params like", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsNotLike(String value) {
            addCriterion("so_params not like", value, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsIn(List<String> values) {
            addCriterion("so_params in", values, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsNotIn(List<String> values) {
            addCriterion("so_params not in", values, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsBetween(String value1, String value2) {
            addCriterion("so_params between", value1, value2, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoParamsNotBetween(String value1, String value2) {
            addCriterion("so_params not between", value1, value2, "soParams");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeIsNull() {
            addCriterion("so_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeIsNotNull() {
            addCriterion("so_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeEqualTo(Date value) {
            addCriterion("so_update_time =", value, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeNotEqualTo(Date value) {
            addCriterion("so_update_time <>", value, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeGreaterThan(Date value) {
            addCriterion("so_update_time >", value, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("so_update_time >=", value, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeLessThan(Date value) {
            addCriterion("so_update_time <", value, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("so_update_time <=", value, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeIn(List<Date> values) {
            addCriterion("so_update_time in", values, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeNotIn(List<Date> values) {
            addCriterion("so_update_time not in", values, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("so_update_time between", value1, value2, "soUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSoUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("so_update_time not between", value1, value2, "soUpdateTime");
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