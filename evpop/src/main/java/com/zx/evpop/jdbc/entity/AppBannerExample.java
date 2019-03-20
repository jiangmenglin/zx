package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppBannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppBannerExample() {
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

        public Criteria andTbabIdIsNull() {
            addCriterion("tbab_id is null");
            return (Criteria) this;
        }

        public Criteria andTbabIdIsNotNull() {
            addCriterion("tbab_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbabIdEqualTo(Long value) {
            addCriterion("tbab_id =", value, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdNotEqualTo(Long value) {
            addCriterion("tbab_id <>", value, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdGreaterThan(Long value) {
            addCriterion("tbab_id >", value, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbab_id >=", value, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdLessThan(Long value) {
            addCriterion("tbab_id <", value, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdLessThanOrEqualTo(Long value) {
            addCriterion("tbab_id <=", value, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdIn(List<Long> values) {
            addCriterion("tbab_id in", values, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdNotIn(List<Long> values) {
            addCriterion("tbab_id not in", values, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdBetween(Long value1, Long value2) {
            addCriterion("tbab_id between", value1, value2, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabIdNotBetween(Long value1, Long value2) {
            addCriterion("tbab_id not between", value1, value2, "tbabId");
            return (Criteria) this;
        }

        public Criteria andTbabTitleIsNull() {
            addCriterion("tbab_title is null");
            return (Criteria) this;
        }

        public Criteria andTbabTitleIsNotNull() {
            addCriterion("tbab_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbabTitleEqualTo(String value) {
            addCriterion("tbab_title =", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleNotEqualTo(String value) {
            addCriterion("tbab_title <>", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleGreaterThan(String value) {
            addCriterion("tbab_title >", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbab_title >=", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleLessThan(String value) {
            addCriterion("tbab_title <", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleLessThanOrEqualTo(String value) {
            addCriterion("tbab_title <=", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleLike(String value) {
            addCriterion("tbab_title like", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleNotLike(String value) {
            addCriterion("tbab_title not like", value, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleIn(List<String> values) {
            addCriterion("tbab_title in", values, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleNotIn(List<String> values) {
            addCriterion("tbab_title not in", values, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleBetween(String value1, String value2) {
            addCriterion("tbab_title between", value1, value2, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabTitleNotBetween(String value1, String value2) {
            addCriterion("tbab_title not between", value1, value2, "tbabTitle");
            return (Criteria) this;
        }

        public Criteria andTbabOrderIsNull() {
            addCriterion("tbab_order is null");
            return (Criteria) this;
        }

        public Criteria andTbabOrderIsNotNull() {
            addCriterion("tbab_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbabOrderEqualTo(Integer value) {
            addCriterion("tbab_order =", value, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderNotEqualTo(Integer value) {
            addCriterion("tbab_order <>", value, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderGreaterThan(Integer value) {
            addCriterion("tbab_order >", value, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbab_order >=", value, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderLessThan(Integer value) {
            addCriterion("tbab_order <", value, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderLessThanOrEqualTo(Integer value) {
            addCriterion("tbab_order <=", value, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderIn(List<Integer> values) {
            addCriterion("tbab_order in", values, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderNotIn(List<Integer> values) {
            addCriterion("tbab_order not in", values, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderBetween(Integer value1, Integer value2) {
            addCriterion("tbab_order between", value1, value2, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbab_order not between", value1, value2, "tbabOrder");
            return (Criteria) this;
        }

        public Criteria andTbabThumIsNull() {
            addCriterion("tbab_thum is null");
            return (Criteria) this;
        }

        public Criteria andTbabThumIsNotNull() {
            addCriterion("tbab_thum is not null");
            return (Criteria) this;
        }

        public Criteria andTbabThumEqualTo(String value) {
            addCriterion("tbab_thum =", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumNotEqualTo(String value) {
            addCriterion("tbab_thum <>", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumGreaterThan(String value) {
            addCriterion("tbab_thum >", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumGreaterThanOrEqualTo(String value) {
            addCriterion("tbab_thum >=", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumLessThan(String value) {
            addCriterion("tbab_thum <", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumLessThanOrEqualTo(String value) {
            addCriterion("tbab_thum <=", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumLike(String value) {
            addCriterion("tbab_thum like", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumNotLike(String value) {
            addCriterion("tbab_thum not like", value, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumIn(List<String> values) {
            addCriterion("tbab_thum in", values, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumNotIn(List<String> values) {
            addCriterion("tbab_thum not in", values, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumBetween(String value1, String value2) {
            addCriterion("tbab_thum between", value1, value2, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabThumNotBetween(String value1, String value2) {
            addCriterion("tbab_thum not between", value1, value2, "tbabThum");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionIsNull() {
            addCriterion("tbab_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionIsNotNull() {
            addCriterion("tbab_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionEqualTo(String value) {
            addCriterion("tbab_introduction =", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionNotEqualTo(String value) {
            addCriterion("tbab_introduction <>", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionGreaterThan(String value) {
            addCriterion("tbab_introduction >", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("tbab_introduction >=", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionLessThan(String value) {
            addCriterion("tbab_introduction <", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionLessThanOrEqualTo(String value) {
            addCriterion("tbab_introduction <=", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionLike(String value) {
            addCriterion("tbab_introduction like", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionNotLike(String value) {
            addCriterion("tbab_introduction not like", value, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionIn(List<String> values) {
            addCriterion("tbab_introduction in", values, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionNotIn(List<String> values) {
            addCriterion("tbab_introduction not in", values, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionBetween(String value1, String value2) {
            addCriterion("tbab_introduction between", value1, value2, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabIntroductionNotBetween(String value1, String value2) {
            addCriterion("tbab_introduction not between", value1, value2, "tbabIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbabLinkIsNull() {
            addCriterion("tbab_link is null");
            return (Criteria) this;
        }

        public Criteria andTbabLinkIsNotNull() {
            addCriterion("tbab_link is not null");
            return (Criteria) this;
        }

        public Criteria andTbabLinkEqualTo(String value) {
            addCriterion("tbab_link =", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkNotEqualTo(String value) {
            addCriterion("tbab_link <>", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkGreaterThan(String value) {
            addCriterion("tbab_link >", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkGreaterThanOrEqualTo(String value) {
            addCriterion("tbab_link >=", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkLessThan(String value) {
            addCriterion("tbab_link <", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkLessThanOrEqualTo(String value) {
            addCriterion("tbab_link <=", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkLike(String value) {
            addCriterion("tbab_link like", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkNotLike(String value) {
            addCriterion("tbab_link not like", value, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkIn(List<String> values) {
            addCriterion("tbab_link in", values, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkNotIn(List<String> values) {
            addCriterion("tbab_link not in", values, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkBetween(String value1, String value2) {
            addCriterion("tbab_link between", value1, value2, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabLinkNotBetween(String value1, String value2) {
            addCriterion("tbab_link not between", value1, value2, "tbabLink");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeIsNull() {
            addCriterion("tbab_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeIsNotNull() {
            addCriterion("tbab_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeEqualTo(Date value) {
            addCriterion("tbab_add_time =", value, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeNotEqualTo(Date value) {
            addCriterion("tbab_add_time <>", value, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeGreaterThan(Date value) {
            addCriterion("tbab_add_time >", value, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbab_add_time >=", value, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeLessThan(Date value) {
            addCriterion("tbab_add_time <", value, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbab_add_time <=", value, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeIn(List<Date> values) {
            addCriterion("tbab_add_time in", values, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeNotIn(List<Date> values) {
            addCriterion("tbab_add_time not in", values, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbab_add_time between", value1, value2, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbab_add_time not between", value1, value2, "tbabAddTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeIsNull() {
            addCriterion("tbab_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeIsNotNull() {
            addCriterion("tbab_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeEqualTo(Date value) {
            addCriterion("tbab_update_time =", value, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbab_update_time <>", value, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeGreaterThan(Date value) {
            addCriterion("tbab_update_time >", value, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbab_update_time >=", value, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeLessThan(Date value) {
            addCriterion("tbab_update_time <", value, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbab_update_time <=", value, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeIn(List<Date> values) {
            addCriterion("tbab_update_time in", values, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbab_update_time not in", values, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbab_update_time between", value1, value2, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbab_update_time not between", value1, value2, "tbabUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbabStatusIsNull() {
            addCriterion("tbab_status is null");
            return (Criteria) this;
        }

        public Criteria andTbabStatusIsNotNull() {
            addCriterion("tbab_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbabStatusEqualTo(Byte value) {
            addCriterion("tbab_status =", value, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusNotEqualTo(Byte value) {
            addCriterion("tbab_status <>", value, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusGreaterThan(Byte value) {
            addCriterion("tbab_status >", value, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbab_status >=", value, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusLessThan(Byte value) {
            addCriterion("tbab_status <", value, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbab_status <=", value, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusIn(List<Byte> values) {
            addCriterion("tbab_status in", values, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusNotIn(List<Byte> values) {
            addCriterion("tbab_status not in", values, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbab_status between", value1, value2, "tbabStatus");
            return (Criteria) this;
        }

        public Criteria andTbabStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbab_status not between", value1, value2, "tbabStatus");
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