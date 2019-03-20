package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitChannelExample() {
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

        public Criteria andTbucIdIsNull() {
            addCriterion("tbuc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbucIdIsNotNull() {
            addCriterion("tbuc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbucIdEqualTo(Long value) {
            addCriterion("tbuc_id =", value, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdNotEqualTo(Long value) {
            addCriterion("tbuc_id <>", value, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdGreaterThan(Long value) {
            addCriterion("tbuc_id >", value, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuc_id >=", value, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdLessThan(Long value) {
            addCriterion("tbuc_id <", value, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdLessThanOrEqualTo(Long value) {
            addCriterion("tbuc_id <=", value, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdIn(List<Long> values) {
            addCriterion("tbuc_id in", values, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdNotIn(List<Long> values) {
            addCriterion("tbuc_id not in", values, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdBetween(Long value1, Long value2) {
            addCriterion("tbuc_id between", value1, value2, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucIdNotBetween(Long value1, Long value2) {
            addCriterion("tbuc_id not between", value1, value2, "tbucId");
            return (Criteria) this;
        }

        public Criteria andTbucNameIsNull() {
            addCriterion("tbuc_name is null");
            return (Criteria) this;
        }

        public Criteria andTbucNameIsNotNull() {
            addCriterion("tbuc_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbucNameEqualTo(String value) {
            addCriterion("tbuc_name =", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameNotEqualTo(String value) {
            addCriterion("tbuc_name <>", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameGreaterThan(String value) {
            addCriterion("tbuc_name >", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbuc_name >=", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameLessThan(String value) {
            addCriterion("tbuc_name <", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameLessThanOrEqualTo(String value) {
            addCriterion("tbuc_name <=", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameLike(String value) {
            addCriterion("tbuc_name like", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameNotLike(String value) {
            addCriterion("tbuc_name not like", value, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameIn(List<String> values) {
            addCriterion("tbuc_name in", values, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameNotIn(List<String> values) {
            addCriterion("tbuc_name not in", values, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameBetween(String value1, String value2) {
            addCriterion("tbuc_name between", value1, value2, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucNameNotBetween(String value1, String value2) {
            addCriterion("tbuc_name not between", value1, value2, "tbucName");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerIsNull() {
            addCriterion("tbuc_partner is null");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerIsNotNull() {
            addCriterion("tbuc_partner is not null");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerEqualTo(Long value) {
            addCriterion("tbuc_partner =", value, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerNotEqualTo(Long value) {
            addCriterion("tbuc_partner <>", value, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerGreaterThan(Long value) {
            addCriterion("tbuc_partner >", value, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuc_partner >=", value, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerLessThan(Long value) {
            addCriterion("tbuc_partner <", value, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerLessThanOrEqualTo(Long value) {
            addCriterion("tbuc_partner <=", value, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerIn(List<Long> values) {
            addCriterion("tbuc_partner in", values, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerNotIn(List<Long> values) {
            addCriterion("tbuc_partner not in", values, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerBetween(Long value1, Long value2) {
            addCriterion("tbuc_partner between", value1, value2, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucPartnerNotBetween(Long value1, Long value2) {
            addCriterion("tbuc_partner not between", value1, value2, "tbucPartner");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdIsNull() {
            addCriterion("tbuc_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdIsNotNull() {
            addCriterion("tbuc_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdEqualTo(String value) {
            addCriterion("tbuc_channel_id =", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdNotEqualTo(String value) {
            addCriterion("tbuc_channel_id <>", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdGreaterThan(String value) {
            addCriterion("tbuc_channel_id >", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("tbuc_channel_id >=", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdLessThan(String value) {
            addCriterion("tbuc_channel_id <", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdLessThanOrEqualTo(String value) {
            addCriterion("tbuc_channel_id <=", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdLike(String value) {
            addCriterion("tbuc_channel_id like", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdNotLike(String value) {
            addCriterion("tbuc_channel_id not like", value, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdIn(List<String> values) {
            addCriterion("tbuc_channel_id in", values, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdNotIn(List<String> values) {
            addCriterion("tbuc_channel_id not in", values, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdBetween(String value1, String value2) {
            addCriterion("tbuc_channel_id between", value1, value2, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucChannelIdNotBetween(String value1, String value2) {
            addCriterion("tbuc_channel_id not between", value1, value2, "tbucChannelId");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeIsNull() {
            addCriterion("tbuc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeIsNotNull() {
            addCriterion("tbuc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeEqualTo(Date value) {
            addCriterion("tbuc_update_time =", value, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbuc_update_time <>", value, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeGreaterThan(Date value) {
            addCriterion("tbuc_update_time >", value, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuc_update_time >=", value, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeLessThan(Date value) {
            addCriterion("tbuc_update_time <", value, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuc_update_time <=", value, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeIn(List<Date> values) {
            addCriterion("tbuc_update_time in", values, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbuc_update_time not in", values, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbuc_update_time between", value1, value2, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuc_update_time not between", value1, value2, "tbucUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeIsNull() {
            addCriterion("tbuc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeIsNotNull() {
            addCriterion("tbuc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeEqualTo(Date value) {
            addCriterion("tbuc_add_time =", value, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeNotEqualTo(Date value) {
            addCriterion("tbuc_add_time <>", value, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeGreaterThan(Date value) {
            addCriterion("tbuc_add_time >", value, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuc_add_time >=", value, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeLessThan(Date value) {
            addCriterion("tbuc_add_time <", value, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuc_add_time <=", value, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeIn(List<Date> values) {
            addCriterion("tbuc_add_time in", values, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeNotIn(List<Date> values) {
            addCriterion("tbuc_add_time not in", values, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbuc_add_time between", value1, value2, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuc_add_time not between", value1, value2, "tbucAddTime");
            return (Criteria) this;
        }

        public Criteria andTbucStatusIsNull() {
            addCriterion("tbuc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbucStatusIsNotNull() {
            addCriterion("tbuc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbucStatusEqualTo(Short value) {
            addCriterion("tbuc_status =", value, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusNotEqualTo(Short value) {
            addCriterion("tbuc_status <>", value, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusGreaterThan(Short value) {
            addCriterion("tbuc_status >", value, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbuc_status >=", value, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusLessThan(Short value) {
            addCriterion("tbuc_status <", value, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbuc_status <=", value, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusIn(List<Short> values) {
            addCriterion("tbuc_status in", values, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusNotIn(List<Short> values) {
            addCriterion("tbuc_status not in", values, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusBetween(Short value1, Short value2) {
            addCriterion("tbuc_status between", value1, value2, "tbucStatus");
            return (Criteria) this;
        }

        public Criteria andTbucStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbuc_status not between", value1, value2, "tbucStatus");
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