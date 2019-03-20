package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
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

        public Criteria andTbdIdIsNull() {
            addCriterion("tbd_id is null");
            return (Criteria) this;
        }

        public Criteria andTbdIdIsNotNull() {
            addCriterion("tbd_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbdIdEqualTo(Long value) {
            addCriterion("tbd_id =", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdNotEqualTo(Long value) {
            addCriterion("tbd_id <>", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdGreaterThan(Long value) {
            addCriterion("tbd_id >", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbd_id >=", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdLessThan(Long value) {
            addCriterion("tbd_id <", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdLessThanOrEqualTo(Long value) {
            addCriterion("tbd_id <=", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdIn(List<Long> values) {
            addCriterion("tbd_id in", values, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdNotIn(List<Long> values) {
            addCriterion("tbd_id not in", values, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdBetween(Long value1, Long value2) {
            addCriterion("tbd_id between", value1, value2, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdNotBetween(Long value1, Long value2) {
            addCriterion("tbd_id not between", value1, value2, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdHostIsNull() {
            addCriterion("tbd_host is null");
            return (Criteria) this;
        }

        public Criteria andTbdHostIsNotNull() {
            addCriterion("tbd_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbdHostEqualTo(Long value) {
            addCriterion("tbd_host =", value, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostNotEqualTo(Long value) {
            addCriterion("tbd_host <>", value, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostGreaterThan(Long value) {
            addCriterion("tbd_host >", value, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbd_host >=", value, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostLessThan(Long value) {
            addCriterion("tbd_host <", value, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostLessThanOrEqualTo(Long value) {
            addCriterion("tbd_host <=", value, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostIn(List<Long> values) {
            addCriterion("tbd_host in", values, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostNotIn(List<Long> values) {
            addCriterion("tbd_host not in", values, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostBetween(Long value1, Long value2) {
            addCriterion("tbd_host between", value1, value2, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdHostNotBetween(Long value1, Long value2) {
            addCriterion("tbd_host not between", value1, value2, "tbdHost");
            return (Criteria) this;
        }

        public Criteria andTbdTitleIsNull() {
            addCriterion("tbd_title is null");
            return (Criteria) this;
        }

        public Criteria andTbdTitleIsNotNull() {
            addCriterion("tbd_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbdTitleEqualTo(String value) {
            addCriterion("tbd_title =", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleNotEqualTo(String value) {
            addCriterion("tbd_title <>", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleGreaterThan(String value) {
            addCriterion("tbd_title >", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbd_title >=", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleLessThan(String value) {
            addCriterion("tbd_title <", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleLessThanOrEqualTo(String value) {
            addCriterion("tbd_title <=", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleLike(String value) {
            addCriterion("tbd_title like", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleNotLike(String value) {
            addCriterion("tbd_title not like", value, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleIn(List<String> values) {
            addCriterion("tbd_title in", values, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleNotIn(List<String> values) {
            addCriterion("tbd_title not in", values, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleBetween(String value1, String value2) {
            addCriterion("tbd_title between", value1, value2, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdTitleNotBetween(String value1, String value2) {
            addCriterion("tbd_title not between", value1, value2, "tbdTitle");
            return (Criteria) this;
        }

        public Criteria andTbdRelateIsNull() {
            addCriterion("tbd_relate is null");
            return (Criteria) this;
        }

        public Criteria andTbdRelateIsNotNull() {
            addCriterion("tbd_relate is not null");
            return (Criteria) this;
        }

        public Criteria andTbdRelateEqualTo(String value) {
            addCriterion("tbd_relate =", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateNotEqualTo(String value) {
            addCriterion("tbd_relate <>", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateGreaterThan(String value) {
            addCriterion("tbd_relate >", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateGreaterThanOrEqualTo(String value) {
            addCriterion("tbd_relate >=", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateLessThan(String value) {
            addCriterion("tbd_relate <", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateLessThanOrEqualTo(String value) {
            addCriterion("tbd_relate <=", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateLike(String value) {
            addCriterion("tbd_relate like", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateNotLike(String value) {
            addCriterion("tbd_relate not like", value, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateIn(List<String> values) {
            addCriterion("tbd_relate in", values, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateNotIn(List<String> values) {
            addCriterion("tbd_relate not in", values, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateBetween(String value1, String value2) {
            addCriterion("tbd_relate between", value1, value2, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdRelateNotBetween(String value1, String value2) {
            addCriterion("tbd_relate not between", value1, value2, "tbdRelate");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeIsNull() {
            addCriterion("tbd_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeIsNotNull() {
            addCriterion("tbd_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeEqualTo(Date value) {
            addCriterion("tbd_update_time =", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbd_update_time <>", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeGreaterThan(Date value) {
            addCriterion("tbd_update_time >", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbd_update_time >=", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeLessThan(Date value) {
            addCriterion("tbd_update_time <", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbd_update_time <=", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeIn(List<Date> values) {
            addCriterion("tbd_update_time in", values, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbd_update_time not in", values, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbd_update_time between", value1, value2, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbd_update_time not between", value1, value2, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeIsNull() {
            addCriterion("tbd_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeIsNotNull() {
            addCriterion("tbd_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeEqualTo(Date value) {
            addCriterion("tbd_add_time =", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeNotEqualTo(Date value) {
            addCriterion("tbd_add_time <>", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeGreaterThan(Date value) {
            addCriterion("tbd_add_time >", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbd_add_time >=", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeLessThan(Date value) {
            addCriterion("tbd_add_time <", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbd_add_time <=", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeIn(List<Date> values) {
            addCriterion("tbd_add_time in", values, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeNotIn(List<Date> values) {
            addCriterion("tbd_add_time not in", values, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbd_add_time between", value1, value2, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbd_add_time not between", value1, value2, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdStatusIsNull() {
            addCriterion("tbd_status is null");
            return (Criteria) this;
        }

        public Criteria andTbdStatusIsNotNull() {
            addCriterion("tbd_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbdStatusEqualTo(Short value) {
            addCriterion("tbd_status =", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusNotEqualTo(Short value) {
            addCriterion("tbd_status <>", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusGreaterThan(Short value) {
            addCriterion("tbd_status >", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbd_status >=", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusLessThan(Short value) {
            addCriterion("tbd_status <", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbd_status <=", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusIn(List<Short> values) {
            addCriterion("tbd_status in", values, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusNotIn(List<Short> values) {
            addCriterion("tbd_status not in", values, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusBetween(Short value1, Short value2) {
            addCriterion("tbd_status between", value1, value2, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbd_status not between", value1, value2, "tbdStatus");
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