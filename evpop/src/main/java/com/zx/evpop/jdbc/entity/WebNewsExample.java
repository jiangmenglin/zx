package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebNewsExample() {
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

        public Criteria andTbwnIdIsNull() {
            addCriterion("tbwn_id is null");
            return (Criteria) this;
        }

        public Criteria andTbwnIdIsNotNull() {
            addCriterion("tbwn_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnIdEqualTo(Long value) {
            addCriterion("tbwn_id =", value, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdNotEqualTo(Long value) {
            addCriterion("tbwn_id <>", value, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdGreaterThan(Long value) {
            addCriterion("tbwn_id >", value, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbwn_id >=", value, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdLessThan(Long value) {
            addCriterion("tbwn_id <", value, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdLessThanOrEqualTo(Long value) {
            addCriterion("tbwn_id <=", value, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdIn(List<Long> values) {
            addCriterion("tbwn_id in", values, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdNotIn(List<Long> values) {
            addCriterion("tbwn_id not in", values, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdBetween(Long value1, Long value2) {
            addCriterion("tbwn_id between", value1, value2, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnIdNotBetween(Long value1, Long value2) {
            addCriterion("tbwn_id not between", value1, value2, "tbwnId");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleIsNull() {
            addCriterion("tbwn_title is null");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleIsNotNull() {
            addCriterion("tbwn_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleEqualTo(String value) {
            addCriterion("tbwn_title =", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleNotEqualTo(String value) {
            addCriterion("tbwn_title <>", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleGreaterThan(String value) {
            addCriterion("tbwn_title >", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbwn_title >=", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleLessThan(String value) {
            addCriterion("tbwn_title <", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleLessThanOrEqualTo(String value) {
            addCriterion("tbwn_title <=", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleLike(String value) {
            addCriterion("tbwn_title like", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleNotLike(String value) {
            addCriterion("tbwn_title not like", value, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleIn(List<String> values) {
            addCriterion("tbwn_title in", values, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleNotIn(List<String> values) {
            addCriterion("tbwn_title not in", values, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleBetween(String value1, String value2) {
            addCriterion("tbwn_title between", value1, value2, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnTitleNotBetween(String value1, String value2) {
            addCriterion("tbwn_title not between", value1, value2, "tbwnTitle");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceIsNull() {
            addCriterion("tbwn_source is null");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceIsNotNull() {
            addCriterion("tbwn_source is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceEqualTo(String value) {
            addCriterion("tbwn_source =", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceNotEqualTo(String value) {
            addCriterion("tbwn_source <>", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceGreaterThan(String value) {
            addCriterion("tbwn_source >", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceGreaterThanOrEqualTo(String value) {
            addCriterion("tbwn_source >=", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceLessThan(String value) {
            addCriterion("tbwn_source <", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceLessThanOrEqualTo(String value) {
            addCriterion("tbwn_source <=", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceLike(String value) {
            addCriterion("tbwn_source like", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceNotLike(String value) {
            addCriterion("tbwn_source not like", value, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceIn(List<String> values) {
            addCriterion("tbwn_source in", values, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceNotIn(List<String> values) {
            addCriterion("tbwn_source not in", values, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceBetween(String value1, String value2) {
            addCriterion("tbwn_source between", value1, value2, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnSourceNotBetween(String value1, String value2) {
            addCriterion("tbwn_source not between", value1, value2, "tbwnSource");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1IsNull() {
            addCriterion("tbwn_thum1 is null");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1IsNotNull() {
            addCriterion("tbwn_thum1 is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1EqualTo(String value) {
            addCriterion("tbwn_thum1 =", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1NotEqualTo(String value) {
            addCriterion("tbwn_thum1 <>", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1GreaterThan(String value) {
            addCriterion("tbwn_thum1 >", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1GreaterThanOrEqualTo(String value) {
            addCriterion("tbwn_thum1 >=", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1LessThan(String value) {
            addCriterion("tbwn_thum1 <", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1LessThanOrEqualTo(String value) {
            addCriterion("tbwn_thum1 <=", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1Like(String value) {
            addCriterion("tbwn_thum1 like", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1NotLike(String value) {
            addCriterion("tbwn_thum1 not like", value, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1In(List<String> values) {
            addCriterion("tbwn_thum1 in", values, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1NotIn(List<String> values) {
            addCriterion("tbwn_thum1 not in", values, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1Between(String value1, String value2) {
            addCriterion("tbwn_thum1 between", value1, value2, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum1NotBetween(String value1, String value2) {
            addCriterion("tbwn_thum1 not between", value1, value2, "tbwnThum1");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2IsNull() {
            addCriterion("tbwn_thum2 is null");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2IsNotNull() {
            addCriterion("tbwn_thum2 is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2EqualTo(String value) {
            addCriterion("tbwn_thum2 =", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2NotEqualTo(String value) {
            addCriterion("tbwn_thum2 <>", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2GreaterThan(String value) {
            addCriterion("tbwn_thum2 >", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2GreaterThanOrEqualTo(String value) {
            addCriterion("tbwn_thum2 >=", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2LessThan(String value) {
            addCriterion("tbwn_thum2 <", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2LessThanOrEqualTo(String value) {
            addCriterion("tbwn_thum2 <=", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2Like(String value) {
            addCriterion("tbwn_thum2 like", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2NotLike(String value) {
            addCriterion("tbwn_thum2 not like", value, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2In(List<String> values) {
            addCriterion("tbwn_thum2 in", values, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2NotIn(List<String> values) {
            addCriterion("tbwn_thum2 not in", values, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2Between(String value1, String value2) {
            addCriterion("tbwn_thum2 between", value1, value2, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnThum2NotBetween(String value1, String value2) {
            addCriterion("tbwn_thum2 not between", value1, value2, "tbwnThum2");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeIsNull() {
            addCriterion("tbwn_news_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeIsNotNull() {
            addCriterion("tbwn_news_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeEqualTo(Date value) {
            addCriterion("tbwn_news_time =", value, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeNotEqualTo(Date value) {
            addCriterion("tbwn_news_time <>", value, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeGreaterThan(Date value) {
            addCriterion("tbwn_news_time >", value, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwn_news_time >=", value, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeLessThan(Date value) {
            addCriterion("tbwn_news_time <", value, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwn_news_time <=", value, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeIn(List<Date> values) {
            addCriterion("tbwn_news_time in", values, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeNotIn(List<Date> values) {
            addCriterion("tbwn_news_time not in", values, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeBetween(Date value1, Date value2) {
            addCriterion("tbwn_news_time between", value1, value2, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnNewsTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwn_news_time not between", value1, value2, "tbwnNewsTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeIsNull() {
            addCriterion("tbwn_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeIsNotNull() {
            addCriterion("tbwn_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeEqualTo(Date value) {
            addCriterion("tbwn_add_time =", value, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeNotEqualTo(Date value) {
            addCriterion("tbwn_add_time <>", value, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeGreaterThan(Date value) {
            addCriterion("tbwn_add_time >", value, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwn_add_time >=", value, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeLessThan(Date value) {
            addCriterion("tbwn_add_time <", value, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwn_add_time <=", value, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeIn(List<Date> values) {
            addCriterion("tbwn_add_time in", values, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeNotIn(List<Date> values) {
            addCriterion("tbwn_add_time not in", values, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbwn_add_time between", value1, value2, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwn_add_time not between", value1, value2, "tbwnAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeIsNull() {
            addCriterion("tbwn_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeIsNotNull() {
            addCriterion("tbwn_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeEqualTo(Date value) {
            addCriterion("tbwn_update_time =", value, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbwn_update_time <>", value, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeGreaterThan(Date value) {
            addCriterion("tbwn_update_time >", value, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwn_update_time >=", value, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeLessThan(Date value) {
            addCriterion("tbwn_update_time <", value, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwn_update_time <=", value, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeIn(List<Date> values) {
            addCriterion("tbwn_update_time in", values, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbwn_update_time not in", values, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbwn_update_time between", value1, value2, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwn_update_time not between", value1, value2, "tbwnUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusIsNull() {
            addCriterion("tbwn_status is null");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusIsNotNull() {
            addCriterion("tbwn_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusEqualTo(Byte value) {
            addCriterion("tbwn_status =", value, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusNotEqualTo(Byte value) {
            addCriterion("tbwn_status <>", value, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusGreaterThan(Byte value) {
            addCriterion("tbwn_status >", value, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbwn_status >=", value, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusLessThan(Byte value) {
            addCriterion("tbwn_status <", value, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbwn_status <=", value, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusIn(List<Byte> values) {
            addCriterion("tbwn_status in", values, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusNotIn(List<Byte> values) {
            addCriterion("tbwn_status not in", values, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbwn_status between", value1, value2, "tbwnStatus");
            return (Criteria) this;
        }

        public Criteria andTbwnStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbwn_status not between", value1, value2, "tbwnStatus");
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