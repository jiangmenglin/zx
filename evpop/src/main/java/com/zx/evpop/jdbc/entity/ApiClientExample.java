package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiClientExample() {
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

        public Criteria andSacIdIsNull() {
            addCriterion("sac_id is null");
            return (Criteria) this;
        }

        public Criteria andSacIdIsNotNull() {
            addCriterion("sac_id is not null");
            return (Criteria) this;
        }

        public Criteria andSacIdEqualTo(Long value) {
            addCriterion("sac_id =", value, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdNotEqualTo(Long value) {
            addCriterion("sac_id <>", value, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdGreaterThan(Long value) {
            addCriterion("sac_id >", value, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sac_id >=", value, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdLessThan(Long value) {
            addCriterion("sac_id <", value, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdLessThanOrEqualTo(Long value) {
            addCriterion("sac_id <=", value, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdIn(List<Long> values) {
            addCriterion("sac_id in", values, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdNotIn(List<Long> values) {
            addCriterion("sac_id not in", values, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdBetween(Long value1, Long value2) {
            addCriterion("sac_id between", value1, value2, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacIdNotBetween(Long value1, Long value2) {
            addCriterion("sac_id not between", value1, value2, "sacId");
            return (Criteria) this;
        }

        public Criteria andSacClientIsNull() {
            addCriterion("sac_client is null");
            return (Criteria) this;
        }

        public Criteria andSacClientIsNotNull() {
            addCriterion("sac_client is not null");
            return (Criteria) this;
        }

        public Criteria andSacClientEqualTo(String value) {
            addCriterion("sac_client =", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientNotEqualTo(String value) {
            addCriterion("sac_client <>", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientGreaterThan(String value) {
            addCriterion("sac_client >", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientGreaterThanOrEqualTo(String value) {
            addCriterion("sac_client >=", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientLessThan(String value) {
            addCriterion("sac_client <", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientLessThanOrEqualTo(String value) {
            addCriterion("sac_client <=", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientLike(String value) {
            addCriterion("sac_client like", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientNotLike(String value) {
            addCriterion("sac_client not like", value, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientIn(List<String> values) {
            addCriterion("sac_client in", values, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientNotIn(List<String> values) {
            addCriterion("sac_client not in", values, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientBetween(String value1, String value2) {
            addCriterion("sac_client between", value1, value2, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacClientNotBetween(String value1, String value2) {
            addCriterion("sac_client not between", value1, value2, "sacClient");
            return (Criteria) this;
        }

        public Criteria andSacSecretIsNull() {
            addCriterion("sac_secret is null");
            return (Criteria) this;
        }

        public Criteria andSacSecretIsNotNull() {
            addCriterion("sac_secret is not null");
            return (Criteria) this;
        }

        public Criteria andSacSecretEqualTo(String value) {
            addCriterion("sac_secret =", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretNotEqualTo(String value) {
            addCriterion("sac_secret <>", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretGreaterThan(String value) {
            addCriterion("sac_secret >", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretGreaterThanOrEqualTo(String value) {
            addCriterion("sac_secret >=", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretLessThan(String value) {
            addCriterion("sac_secret <", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretLessThanOrEqualTo(String value) {
            addCriterion("sac_secret <=", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretLike(String value) {
            addCriterion("sac_secret like", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretNotLike(String value) {
            addCriterion("sac_secret not like", value, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretIn(List<String> values) {
            addCriterion("sac_secret in", values, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretNotIn(List<String> values) {
            addCriterion("sac_secret not in", values, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretBetween(String value1, String value2) {
            addCriterion("sac_secret between", value1, value2, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacSecretNotBetween(String value1, String value2) {
            addCriterion("sac_secret not between", value1, value2, "sacSecret");
            return (Criteria) this;
        }

        public Criteria andSacTypeIsNull() {
            addCriterion("sac_type is null");
            return (Criteria) this;
        }

        public Criteria andSacTypeIsNotNull() {
            addCriterion("sac_type is not null");
            return (Criteria) this;
        }

        public Criteria andSacTypeEqualTo(Short value) {
            addCriterion("sac_type =", value, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeNotEqualTo(Short value) {
            addCriterion("sac_type <>", value, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeGreaterThan(Short value) {
            addCriterion("sac_type >", value, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("sac_type >=", value, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeLessThan(Short value) {
            addCriterion("sac_type <", value, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeLessThanOrEqualTo(Short value) {
            addCriterion("sac_type <=", value, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeIn(List<Short> values) {
            addCriterion("sac_type in", values, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeNotIn(List<Short> values) {
            addCriterion("sac_type not in", values, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeBetween(Short value1, Short value2) {
            addCriterion("sac_type between", value1, value2, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacTypeNotBetween(Short value1, Short value2) {
            addCriterion("sac_type not between", value1, value2, "sacType");
            return (Criteria) this;
        }

        public Criteria andSacUrlIsNull() {
            addCriterion("sac_url is null");
            return (Criteria) this;
        }

        public Criteria andSacUrlIsNotNull() {
            addCriterion("sac_url is not null");
            return (Criteria) this;
        }

        public Criteria andSacUrlEqualTo(String value) {
            addCriterion("sac_url =", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlNotEqualTo(String value) {
            addCriterion("sac_url <>", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlGreaterThan(String value) {
            addCriterion("sac_url >", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sac_url >=", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlLessThan(String value) {
            addCriterion("sac_url <", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlLessThanOrEqualTo(String value) {
            addCriterion("sac_url <=", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlLike(String value) {
            addCriterion("sac_url like", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlNotLike(String value) {
            addCriterion("sac_url not like", value, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlIn(List<String> values) {
            addCriterion("sac_url in", values, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlNotIn(List<String> values) {
            addCriterion("sac_url not in", values, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlBetween(String value1, String value2) {
            addCriterion("sac_url between", value1, value2, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacUrlNotBetween(String value1, String value2) {
            addCriterion("sac_url not between", value1, value2, "sacUrl");
            return (Criteria) this;
        }

        public Criteria andSacDescIsNull() {
            addCriterion("sac_desc is null");
            return (Criteria) this;
        }

        public Criteria andSacDescIsNotNull() {
            addCriterion("sac_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSacDescEqualTo(String value) {
            addCriterion("sac_desc =", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescNotEqualTo(String value) {
            addCriterion("sac_desc <>", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescGreaterThan(String value) {
            addCriterion("sac_desc >", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescGreaterThanOrEqualTo(String value) {
            addCriterion("sac_desc >=", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescLessThan(String value) {
            addCriterion("sac_desc <", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescLessThanOrEqualTo(String value) {
            addCriterion("sac_desc <=", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescLike(String value) {
            addCriterion("sac_desc like", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescNotLike(String value) {
            addCriterion("sac_desc not like", value, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescIn(List<String> values) {
            addCriterion("sac_desc in", values, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescNotIn(List<String> values) {
            addCriterion("sac_desc not in", values, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescBetween(String value1, String value2) {
            addCriterion("sac_desc between", value1, value2, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacDescNotBetween(String value1, String value2) {
            addCriterion("sac_desc not between", value1, value2, "sacDesc");
            return (Criteria) this;
        }

        public Criteria andSacRestfulIsNull() {
            addCriterion("sac_restful is null");
            return (Criteria) this;
        }

        public Criteria andSacRestfulIsNotNull() {
            addCriterion("sac_restful is not null");
            return (Criteria) this;
        }

        public Criteria andSacRestfulEqualTo(String value) {
            addCriterion("sac_restful =", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulNotEqualTo(String value) {
            addCriterion("sac_restful <>", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulGreaterThan(String value) {
            addCriterion("sac_restful >", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulGreaterThanOrEqualTo(String value) {
            addCriterion("sac_restful >=", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulLessThan(String value) {
            addCriterion("sac_restful <", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulLessThanOrEqualTo(String value) {
            addCriterion("sac_restful <=", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulLike(String value) {
            addCriterion("sac_restful like", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulNotLike(String value) {
            addCriterion("sac_restful not like", value, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulIn(List<String> values) {
            addCriterion("sac_restful in", values, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulNotIn(List<String> values) {
            addCriterion("sac_restful not in", values, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulBetween(String value1, String value2) {
            addCriterion("sac_restful between", value1, value2, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacRestfulNotBetween(String value1, String value2) {
            addCriterion("sac_restful not between", value1, value2, "sacRestful");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeIsNull() {
            addCriterion("sac_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeIsNotNull() {
            addCriterion("sac_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeEqualTo(Date value) {
            addCriterion("sac_update_time =", value, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeNotEqualTo(Date value) {
            addCriterion("sac_update_time <>", value, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeGreaterThan(Date value) {
            addCriterion("sac_update_time >", value, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sac_update_time >=", value, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeLessThan(Date value) {
            addCriterion("sac_update_time <", value, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sac_update_time <=", value, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeIn(List<Date> values) {
            addCriterion("sac_update_time in", values, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeNotIn(List<Date> values) {
            addCriterion("sac_update_time not in", values, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sac_update_time between", value1, value2, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sac_update_time not between", value1, value2, "sacUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeIsNull() {
            addCriterion("sac_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeIsNotNull() {
            addCriterion("sac_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeEqualTo(Date value) {
            addCriterion("sac_add_time =", value, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeNotEqualTo(Date value) {
            addCriterion("sac_add_time <>", value, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeGreaterThan(Date value) {
            addCriterion("sac_add_time >", value, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sac_add_time >=", value, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeLessThan(Date value) {
            addCriterion("sac_add_time <", value, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("sac_add_time <=", value, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeIn(List<Date> values) {
            addCriterion("sac_add_time in", values, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeNotIn(List<Date> values) {
            addCriterion("sac_add_time not in", values, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeBetween(Date value1, Date value2) {
            addCriterion("sac_add_time between", value1, value2, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("sac_add_time not between", value1, value2, "sacAddTime");
            return (Criteria) this;
        }

        public Criteria andSacStatusIsNull() {
            addCriterion("sac_status is null");
            return (Criteria) this;
        }

        public Criteria andSacStatusIsNotNull() {
            addCriterion("sac_status is not null");
            return (Criteria) this;
        }

        public Criteria andSacStatusEqualTo(Short value) {
            addCriterion("sac_status =", value, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusNotEqualTo(Short value) {
            addCriterion("sac_status <>", value, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusGreaterThan(Short value) {
            addCriterion("sac_status >", value, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sac_status >=", value, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusLessThan(Short value) {
            addCriterion("sac_status <", value, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusLessThanOrEqualTo(Short value) {
            addCriterion("sac_status <=", value, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusIn(List<Short> values) {
            addCriterion("sac_status in", values, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusNotIn(List<Short> values) {
            addCriterion("sac_status not in", values, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusBetween(Short value1, Short value2) {
            addCriterion("sac_status between", value1, value2, "sacStatus");
            return (Criteria) this;
        }

        public Criteria andSacStatusNotBetween(Short value1, Short value2) {
            addCriterion("sac_status not between", value1, value2, "sacStatus");
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