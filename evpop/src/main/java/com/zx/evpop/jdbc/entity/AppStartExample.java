package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppStartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppStartExample() {
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

        public Criteria andTbasIdIsNull() {
            addCriterion("tbas_id is null");
            return (Criteria) this;
        }

        public Criteria andTbasIdIsNotNull() {
            addCriterion("tbas_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbasIdEqualTo(Long value) {
            addCriterion("tbas_id =", value, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdNotEqualTo(Long value) {
            addCriterion("tbas_id <>", value, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdGreaterThan(Long value) {
            addCriterion("tbas_id >", value, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbas_id >=", value, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdLessThan(Long value) {
            addCriterion("tbas_id <", value, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdLessThanOrEqualTo(Long value) {
            addCriterion("tbas_id <=", value, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdIn(List<Long> values) {
            addCriterion("tbas_id in", values, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdNotIn(List<Long> values) {
            addCriterion("tbas_id not in", values, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdBetween(Long value1, Long value2) {
            addCriterion("tbas_id between", value1, value2, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasIdNotBetween(Long value1, Long value2) {
            addCriterion("tbas_id not between", value1, value2, "tbasId");
            return (Criteria) this;
        }

        public Criteria andTbasNameIsNull() {
            addCriterion("tbas_name is null");
            return (Criteria) this;
        }

        public Criteria andTbasNameIsNotNull() {
            addCriterion("tbas_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbasNameEqualTo(String value) {
            addCriterion("tbas_name =", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameNotEqualTo(String value) {
            addCriterion("tbas_name <>", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameGreaterThan(String value) {
            addCriterion("tbas_name >", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbas_name >=", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameLessThan(String value) {
            addCriterion("tbas_name <", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameLessThanOrEqualTo(String value) {
            addCriterion("tbas_name <=", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameLike(String value) {
            addCriterion("tbas_name like", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameNotLike(String value) {
            addCriterion("tbas_name not like", value, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameIn(List<String> values) {
            addCriterion("tbas_name in", values, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameNotIn(List<String> values) {
            addCriterion("tbas_name not in", values, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameBetween(String value1, String value2) {
            addCriterion("tbas_name between", value1, value2, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasNameNotBetween(String value1, String value2) {
            addCriterion("tbas_name not between", value1, value2, "tbasName");
            return (Criteria) this;
        }

        public Criteria andTbasOrderIsNull() {
            addCriterion("tbas_order is null");
            return (Criteria) this;
        }

        public Criteria andTbasOrderIsNotNull() {
            addCriterion("tbas_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbasOrderEqualTo(Integer value) {
            addCriterion("tbas_order =", value, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderNotEqualTo(Integer value) {
            addCriterion("tbas_order <>", value, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderGreaterThan(Integer value) {
            addCriterion("tbas_order >", value, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbas_order >=", value, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderLessThan(Integer value) {
            addCriterion("tbas_order <", value, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderLessThanOrEqualTo(Integer value) {
            addCriterion("tbas_order <=", value, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderIn(List<Integer> values) {
            addCriterion("tbas_order in", values, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderNotIn(List<Integer> values) {
            addCriterion("tbas_order not in", values, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderBetween(Integer value1, Integer value2) {
            addCriterion("tbas_order between", value1, value2, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbas_order not between", value1, value2, "tbasOrder");
            return (Criteria) this;
        }

        public Criteria andTbasThumIsNull() {
            addCriterion("tbas_thum is null");
            return (Criteria) this;
        }

        public Criteria andTbasThumIsNotNull() {
            addCriterion("tbas_thum is not null");
            return (Criteria) this;
        }

        public Criteria andTbasThumEqualTo(String value) {
            addCriterion("tbas_thum =", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumNotEqualTo(String value) {
            addCriterion("tbas_thum <>", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumGreaterThan(String value) {
            addCriterion("tbas_thum >", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumGreaterThanOrEqualTo(String value) {
            addCriterion("tbas_thum >=", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumLessThan(String value) {
            addCriterion("tbas_thum <", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumLessThanOrEqualTo(String value) {
            addCriterion("tbas_thum <=", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumLike(String value) {
            addCriterion("tbas_thum like", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumNotLike(String value) {
            addCriterion("tbas_thum not like", value, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumIn(List<String> values) {
            addCriterion("tbas_thum in", values, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumNotIn(List<String> values) {
            addCriterion("tbas_thum not in", values, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumBetween(String value1, String value2) {
            addCriterion("tbas_thum between", value1, value2, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasThumNotBetween(String value1, String value2) {
            addCriterion("tbas_thum not between", value1, value2, "tbasThum");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionIsNull() {
            addCriterion("tbas_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionIsNotNull() {
            addCriterion("tbas_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionEqualTo(String value) {
            addCriterion("tbas_introduction =", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionNotEqualTo(String value) {
            addCriterion("tbas_introduction <>", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionGreaterThan(String value) {
            addCriterion("tbas_introduction >", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("tbas_introduction >=", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionLessThan(String value) {
            addCriterion("tbas_introduction <", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionLessThanOrEqualTo(String value) {
            addCriterion("tbas_introduction <=", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionLike(String value) {
            addCriterion("tbas_introduction like", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionNotLike(String value) {
            addCriterion("tbas_introduction not like", value, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionIn(List<String> values) {
            addCriterion("tbas_introduction in", values, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionNotIn(List<String> values) {
            addCriterion("tbas_introduction not in", values, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionBetween(String value1, String value2) {
            addCriterion("tbas_introduction between", value1, value2, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasIntroductionNotBetween(String value1, String value2) {
            addCriterion("tbas_introduction not between", value1, value2, "tbasIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbasLinkIsNull() {
            addCriterion("tbas_link is null");
            return (Criteria) this;
        }

        public Criteria andTbasLinkIsNotNull() {
            addCriterion("tbas_link is not null");
            return (Criteria) this;
        }

        public Criteria andTbasLinkEqualTo(String value) {
            addCriterion("tbas_link =", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkNotEqualTo(String value) {
            addCriterion("tbas_link <>", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkGreaterThan(String value) {
            addCriterion("tbas_link >", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkGreaterThanOrEqualTo(String value) {
            addCriterion("tbas_link >=", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkLessThan(String value) {
            addCriterion("tbas_link <", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkLessThanOrEqualTo(String value) {
            addCriterion("tbas_link <=", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkLike(String value) {
            addCriterion("tbas_link like", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkNotLike(String value) {
            addCriterion("tbas_link not like", value, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkIn(List<String> values) {
            addCriterion("tbas_link in", values, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkNotIn(List<String> values) {
            addCriterion("tbas_link not in", values, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkBetween(String value1, String value2) {
            addCriterion("tbas_link between", value1, value2, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasLinkNotBetween(String value1, String value2) {
            addCriterion("tbas_link not between", value1, value2, "tbasLink");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeIsNull() {
            addCriterion("tbas_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeIsNotNull() {
            addCriterion("tbas_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeEqualTo(Date value) {
            addCriterion("tbas_update_time =", value, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbas_update_time <>", value, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeGreaterThan(Date value) {
            addCriterion("tbas_update_time >", value, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbas_update_time >=", value, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeLessThan(Date value) {
            addCriterion("tbas_update_time <", value, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbas_update_time <=", value, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeIn(List<Date> values) {
            addCriterion("tbas_update_time in", values, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbas_update_time not in", values, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbas_update_time between", value1, value2, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbas_update_time not between", value1, value2, "tbasUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeIsNull() {
            addCriterion("tbas_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeIsNotNull() {
            addCriterion("tbas_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeEqualTo(Date value) {
            addCriterion("tbas_add_time =", value, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeNotEqualTo(Date value) {
            addCriterion("tbas_add_time <>", value, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeGreaterThan(Date value) {
            addCriterion("tbas_add_time >", value, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbas_add_time >=", value, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeLessThan(Date value) {
            addCriterion("tbas_add_time <", value, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbas_add_time <=", value, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeIn(List<Date> values) {
            addCriterion("tbas_add_time in", values, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeNotIn(List<Date> values) {
            addCriterion("tbas_add_time not in", values, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbas_add_time between", value1, value2, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbas_add_time not between", value1, value2, "tbasAddTime");
            return (Criteria) this;
        }

        public Criteria andTbasStatusIsNull() {
            addCriterion("tbas_status is null");
            return (Criteria) this;
        }

        public Criteria andTbasStatusIsNotNull() {
            addCriterion("tbas_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbasStatusEqualTo(Byte value) {
            addCriterion("tbas_status =", value, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusNotEqualTo(Byte value) {
            addCriterion("tbas_status <>", value, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusGreaterThan(Byte value) {
            addCriterion("tbas_status >", value, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbas_status >=", value, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusLessThan(Byte value) {
            addCriterion("tbas_status <", value, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbas_status <=", value, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusIn(List<Byte> values) {
            addCriterion("tbas_status in", values, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusNotIn(List<Byte> values) {
            addCriterion("tbas_status not in", values, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbas_status between", value1, value2, "tbasStatus");
            return (Criteria) this;
        }

        public Criteria andTbasStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbas_status not between", value1, value2, "tbasStatus");
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