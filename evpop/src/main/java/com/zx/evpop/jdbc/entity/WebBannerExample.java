package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebBannerExample() {
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

        public Criteria andTbwbIdIsNull() {
            addCriterion("tbwb_id is null");
            return (Criteria) this;
        }

        public Criteria andTbwbIdIsNotNull() {
            addCriterion("tbwb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbIdEqualTo(Long value) {
            addCriterion("tbwb_id =", value, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdNotEqualTo(Long value) {
            addCriterion("tbwb_id <>", value, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdGreaterThan(Long value) {
            addCriterion("tbwb_id >", value, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbwb_id >=", value, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdLessThan(Long value) {
            addCriterion("tbwb_id <", value, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdLessThanOrEqualTo(Long value) {
            addCriterion("tbwb_id <=", value, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdIn(List<Long> values) {
            addCriterion("tbwb_id in", values, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdNotIn(List<Long> values) {
            addCriterion("tbwb_id not in", values, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdBetween(Long value1, Long value2) {
            addCriterion("tbwb_id between", value1, value2, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbIdNotBetween(Long value1, Long value2) {
            addCriterion("tbwb_id not between", value1, value2, "tbwbId");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleIsNull() {
            addCriterion("tbwb_title is null");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleIsNotNull() {
            addCriterion("tbwb_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleEqualTo(String value) {
            addCriterion("tbwb_title =", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleNotEqualTo(String value) {
            addCriterion("tbwb_title <>", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleGreaterThan(String value) {
            addCriterion("tbwb_title >", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbwb_title >=", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleLessThan(String value) {
            addCriterion("tbwb_title <", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleLessThanOrEqualTo(String value) {
            addCriterion("tbwb_title <=", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleLike(String value) {
            addCriterion("tbwb_title like", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleNotLike(String value) {
            addCriterion("tbwb_title not like", value, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleIn(List<String> values) {
            addCriterion("tbwb_title in", values, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleNotIn(List<String> values) {
            addCriterion("tbwb_title not in", values, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleBetween(String value1, String value2) {
            addCriterion("tbwb_title between", value1, value2, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbTitleNotBetween(String value1, String value2) {
            addCriterion("tbwb_title not between", value1, value2, "tbwbTitle");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1IsNull() {
            addCriterion("tbwb_thum1 is null");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1IsNotNull() {
            addCriterion("tbwb_thum1 is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1EqualTo(String value) {
            addCriterion("tbwb_thum1 =", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1NotEqualTo(String value) {
            addCriterion("tbwb_thum1 <>", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1GreaterThan(String value) {
            addCriterion("tbwb_thum1 >", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1GreaterThanOrEqualTo(String value) {
            addCriterion("tbwb_thum1 >=", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1LessThan(String value) {
            addCriterion("tbwb_thum1 <", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1LessThanOrEqualTo(String value) {
            addCriterion("tbwb_thum1 <=", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1Like(String value) {
            addCriterion("tbwb_thum1 like", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1NotLike(String value) {
            addCriterion("tbwb_thum1 not like", value, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1In(List<String> values) {
            addCriterion("tbwb_thum1 in", values, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1NotIn(List<String> values) {
            addCriterion("tbwb_thum1 not in", values, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1Between(String value1, String value2) {
            addCriterion("tbwb_thum1 between", value1, value2, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum1NotBetween(String value1, String value2) {
            addCriterion("tbwb_thum1 not between", value1, value2, "tbwbThum1");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2IsNull() {
            addCriterion("tbwb_thum2 is null");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2IsNotNull() {
            addCriterion("tbwb_thum2 is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2EqualTo(String value) {
            addCriterion("tbwb_thum2 =", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2NotEqualTo(String value) {
            addCriterion("tbwb_thum2 <>", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2GreaterThan(String value) {
            addCriterion("tbwb_thum2 >", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2GreaterThanOrEqualTo(String value) {
            addCriterion("tbwb_thum2 >=", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2LessThan(String value) {
            addCriterion("tbwb_thum2 <", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2LessThanOrEqualTo(String value) {
            addCriterion("tbwb_thum2 <=", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2Like(String value) {
            addCriterion("tbwb_thum2 like", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2NotLike(String value) {
            addCriterion("tbwb_thum2 not like", value, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2In(List<String> values) {
            addCriterion("tbwb_thum2 in", values, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2NotIn(List<String> values) {
            addCriterion("tbwb_thum2 not in", values, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2Between(String value1, String value2) {
            addCriterion("tbwb_thum2 between", value1, value2, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbThum2NotBetween(String value1, String value2) {
            addCriterion("tbwb_thum2 not between", value1, value2, "tbwbThum2");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkIsNull() {
            addCriterion("tbwb_link is null");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkIsNotNull() {
            addCriterion("tbwb_link is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkEqualTo(String value) {
            addCriterion("tbwb_link =", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkNotEqualTo(String value) {
            addCriterion("tbwb_link <>", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkGreaterThan(String value) {
            addCriterion("tbwb_link >", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkGreaterThanOrEqualTo(String value) {
            addCriterion("tbwb_link >=", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkLessThan(String value) {
            addCriterion("tbwb_link <", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkLessThanOrEqualTo(String value) {
            addCriterion("tbwb_link <=", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkLike(String value) {
            addCriterion("tbwb_link like", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkNotLike(String value) {
            addCriterion("tbwb_link not like", value, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkIn(List<String> values) {
            addCriterion("tbwb_link in", values, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkNotIn(List<String> values) {
            addCriterion("tbwb_link not in", values, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkBetween(String value1, String value2) {
            addCriterion("tbwb_link between", value1, value2, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbLinkNotBetween(String value1, String value2) {
            addCriterion("tbwb_link not between", value1, value2, "tbwbLink");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeIsNull() {
            addCriterion("tbwb_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeIsNotNull() {
            addCriterion("tbwb_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeEqualTo(Date value) {
            addCriterion("tbwb_add_time =", value, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeNotEqualTo(Date value) {
            addCriterion("tbwb_add_time <>", value, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeGreaterThan(Date value) {
            addCriterion("tbwb_add_time >", value, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbwb_add_time >=", value, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeLessThan(Date value) {
            addCriterion("tbwb_add_time <", value, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbwb_add_time <=", value, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeIn(List<Date> values) {
            addCriterion("tbwb_add_time in", values, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeNotIn(List<Date> values) {
            addCriterion("tbwb_add_time not in", values, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbwb_add_time between", value1, value2, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbwb_add_time not between", value1, value2, "tbwbAddTime");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionIsNull() {
            addCriterion("tbwb_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionIsNotNull() {
            addCriterion("tbwb_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionEqualTo(String value) {
            addCriterion("tbwb_introduction =", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionNotEqualTo(String value) {
            addCriterion("tbwb_introduction <>", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionGreaterThan(String value) {
            addCriterion("tbwb_introduction >", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("tbwb_introduction >=", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionLessThan(String value) {
            addCriterion("tbwb_introduction <", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionLessThanOrEqualTo(String value) {
            addCriterion("tbwb_introduction <=", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionLike(String value) {
            addCriterion("tbwb_introduction like", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionNotLike(String value) {
            addCriterion("tbwb_introduction not like", value, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionIn(List<String> values) {
            addCriterion("tbwb_introduction in", values, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionNotIn(List<String> values) {
            addCriterion("tbwb_introduction not in", values, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionBetween(String value1, String value2) {
            addCriterion("tbwb_introduction between", value1, value2, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbIntroductionNotBetween(String value1, String value2) {
            addCriterion("tbwb_introduction not between", value1, value2, "tbwbIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusIsNull() {
            addCriterion("tbwb_status is null");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusIsNotNull() {
            addCriterion("tbwb_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusEqualTo(Byte value) {
            addCriterion("tbwb_status =", value, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusNotEqualTo(Byte value) {
            addCriterion("tbwb_status <>", value, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusGreaterThan(Byte value) {
            addCriterion("tbwb_status >", value, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbwb_status >=", value, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusLessThan(Byte value) {
            addCriterion("tbwb_status <", value, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbwb_status <=", value, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusIn(List<Byte> values) {
            addCriterion("tbwb_status in", values, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusNotIn(List<Byte> values) {
            addCriterion("tbwb_status not in", values, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbwb_status between", value1, value2, "tbwbStatus");
            return (Criteria) this;
        }

        public Criteria andTbwbStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbwb_status not between", value1, value2, "tbwbStatus");
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