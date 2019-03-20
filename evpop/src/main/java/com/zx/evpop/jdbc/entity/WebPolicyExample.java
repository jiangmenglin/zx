package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebPolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebPolicyExample() {
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

        public Criteria andTbwpIdIsNull() {
            addCriterion("tbwp_id is null");
            return (Criteria) this;
        }

        public Criteria andTbwpIdIsNotNull() {
            addCriterion("tbwp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpIdEqualTo(Long value) {
            addCriterion("tbwp_id =", value, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdNotEqualTo(Long value) {
            addCriterion("tbwp_id <>", value, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdGreaterThan(Long value) {
            addCriterion("tbwp_id >", value, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbwp_id >=", value, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdLessThan(Long value) {
            addCriterion("tbwp_id <", value, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdLessThanOrEqualTo(Long value) {
            addCriterion("tbwp_id <=", value, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdIn(List<Long> values) {
            addCriterion("tbwp_id in", values, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdNotIn(List<Long> values) {
            addCriterion("tbwp_id not in", values, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdBetween(Long value1, Long value2) {
            addCriterion("tbwp_id between", value1, value2, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpIdNotBetween(Long value1, Long value2) {
            addCriterion("tbwp_id not between", value1, value2, "tbwpId");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleIsNull() {
            addCriterion("tbwp_title is null");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleIsNotNull() {
            addCriterion("tbwp_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleEqualTo(String value) {
            addCriterion("tbwp_title =", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleNotEqualTo(String value) {
            addCriterion("tbwp_title <>", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleGreaterThan(String value) {
            addCriterion("tbwp_title >", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbwp_title >=", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleLessThan(String value) {
            addCriterion("tbwp_title <", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleLessThanOrEqualTo(String value) {
            addCriterion("tbwp_title <=", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleLike(String value) {
            addCriterion("tbwp_title like", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleNotLike(String value) {
            addCriterion("tbwp_title not like", value, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleIn(List<String> values) {
            addCriterion("tbwp_title in", values, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleNotIn(List<String> values) {
            addCriterion("tbwp_title not in", values, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleBetween(String value1, String value2) {
            addCriterion("tbwp_title between", value1, value2, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpTitleNotBetween(String value1, String value2) {
            addCriterion("tbwp_title not between", value1, value2, "tbwpTitle");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceIsNull() {
            addCriterion("tbwp_source is null");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceIsNotNull() {
            addCriterion("tbwp_source is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceEqualTo(String value) {
            addCriterion("tbwp_source =", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceNotEqualTo(String value) {
            addCriterion("tbwp_source <>", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceGreaterThan(String value) {
            addCriterion("tbwp_source >", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceGreaterThanOrEqualTo(String value) {
            addCriterion("tbwp_source >=", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceLessThan(String value) {
            addCriterion("tbwp_source <", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceLessThanOrEqualTo(String value) {
            addCriterion("tbwp_source <=", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceLike(String value) {
            addCriterion("tbwp_source like", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceNotLike(String value) {
            addCriterion("tbwp_source not like", value, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceIn(List<String> values) {
            addCriterion("tbwp_source in", values, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceNotIn(List<String> values) {
            addCriterion("tbwp_source not in", values, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceBetween(String value1, String value2) {
            addCriterion("tbwp_source between", value1, value2, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpSourceNotBetween(String value1, String value2) {
            addCriterion("tbwp_source not between", value1, value2, "tbwpSource");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1IsNull() {
            addCriterion("tbwp_thum1 is null");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1IsNotNull() {
            addCriterion("tbwp_thum1 is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1EqualTo(String value) {
            addCriterion("tbwp_thum1 =", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1NotEqualTo(String value) {
            addCriterion("tbwp_thum1 <>", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1GreaterThan(String value) {
            addCriterion("tbwp_thum1 >", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1GreaterThanOrEqualTo(String value) {
            addCriterion("tbwp_thum1 >=", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1LessThan(String value) {
            addCriterion("tbwp_thum1 <", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1LessThanOrEqualTo(String value) {
            addCriterion("tbwp_thum1 <=", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1Like(String value) {
            addCriterion("tbwp_thum1 like", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1NotLike(String value) {
            addCriterion("tbwp_thum1 not like", value, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1In(List<String> values) {
            addCriterion("tbwp_thum1 in", values, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1NotIn(List<String> values) {
            addCriterion("tbwp_thum1 not in", values, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1Between(String value1, String value2) {
            addCriterion("tbwp_thum1 between", value1, value2, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum1NotBetween(String value1, String value2) {
            addCriterion("tbwp_thum1 not between", value1, value2, "tbwpThum1");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2IsNull() {
            addCriterion("tbwp_thum2 is null");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2IsNotNull() {
            addCriterion("tbwp_thum2 is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2EqualTo(String value) {
            addCriterion("tbwp_thum2 =", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2NotEqualTo(String value) {
            addCriterion("tbwp_thum2 <>", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2GreaterThan(String value) {
            addCriterion("tbwp_thum2 >", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2GreaterThanOrEqualTo(String value) {
            addCriterion("tbwp_thum2 >=", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2LessThan(String value) {
            addCriterion("tbwp_thum2 <", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2LessThanOrEqualTo(String value) {
            addCriterion("tbwp_thum2 <=", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2Like(String value) {
            addCriterion("tbwp_thum2 like", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2NotLike(String value) {
            addCriterion("tbwp_thum2 not like", value, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2In(List<String> values) {
            addCriterion("tbwp_thum2 in", values, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2NotIn(List<String> values) {
            addCriterion("tbwp_thum2 not in", values, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2Between(String value1, String value2) {
            addCriterion("tbwp_thum2 between", value1, value2, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpThum2NotBetween(String value1, String value2) {
            addCriterion("tbwp_thum2 not between", value1, value2, "tbwpThum2");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeIsNull() {
            addCriterion("tbwp_policy_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeIsNotNull() {
            addCriterion("tbwp_policy_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeEqualTo(Date value) {
            addCriterion("tbwp_policy_time =", value, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeNotEqualTo(Date value) {
            addCriterion("tbwp_policy_time <>", value, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeGreaterThan(Date value) {
            addCriterion("tbwp_policy_time >", value, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwp_policy_time >=", value, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeLessThan(Date value) {
            addCriterion("tbwp_policy_time <", value, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwp_policy_time <=", value, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeIn(List<Date> values) {
            addCriterion("tbwp_policy_time in", values, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeNotIn(List<Date> values) {
            addCriterion("tbwp_policy_time not in", values, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeBetween(Date value1, Date value2) {
            addCriterion("tbwp_policy_time between", value1, value2, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpPolicyTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwp_policy_time not between", value1, value2, "tbwpPolicyTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeIsNull() {
            addCriterion("tbwp_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeIsNotNull() {
            addCriterion("tbwp_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeEqualTo(Date value) {
            addCriterion("tbwp_add_time =", value, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeNotEqualTo(Date value) {
            addCriterion("tbwp_add_time <>", value, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeGreaterThan(Date value) {
            addCriterion("tbwp_add_time >", value, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwp_add_time >=", value, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeLessThan(Date value) {
            addCriterion("tbwp_add_time <", value, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwp_add_time <=", value, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeIn(List<Date> values) {
            addCriterion("tbwp_add_time in", values, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeNotIn(List<Date> values) {
            addCriterion("tbwp_add_time not in", values, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbwp_add_time between", value1, value2, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwp_add_time not between", value1, value2, "tbwpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeIsNull() {
            addCriterion("tbwp_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeIsNotNull() {
            addCriterion("tbwp_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeEqualTo(Date value) {
            addCriterion("tbwp_update_time =", value, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbwp_update_time <>", value, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeGreaterThan(Date value) {
            addCriterion("tbwp_update_time >", value, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwp_update_time >=", value, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeLessThan(Date value) {
            addCriterion("tbwp_update_time <", value, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwp_update_time <=", value, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeIn(List<Date> values) {
            addCriterion("tbwp_update_time in", values, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbwp_update_time not in", values, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbwp_update_time between", value1, value2, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwp_update_time not between", value1, value2, "tbwpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusIsNull() {
            addCriterion("tbwp_status is null");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusIsNotNull() {
            addCriterion("tbwp_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusEqualTo(Byte value) {
            addCriterion("tbwp_status =", value, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusNotEqualTo(Byte value) {
            addCriterion("tbwp_status <>", value, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusGreaterThan(Byte value) {
            addCriterion("tbwp_status >", value, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbwp_status >=", value, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusLessThan(Byte value) {
            addCriterion("tbwp_status <", value, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbwp_status <=", value, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusIn(List<Byte> values) {
            addCriterion("tbwp_status in", values, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusNotIn(List<Byte> values) {
            addCriterion("tbwp_status not in", values, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbwp_status between", value1, value2, "tbwpStatus");
            return (Criteria) this;
        }

        public Criteria andTbwpStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbwp_status not between", value1, value2, "tbwpStatus");
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