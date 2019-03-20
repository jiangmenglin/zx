package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParklotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParklotExample() {
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

        public Criteria andTbpIdIsNull() {
            addCriterion("tbp_id is null");
            return (Criteria) this;
        }

        public Criteria andTbpIdIsNotNull() {
            addCriterion("tbp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbpIdEqualTo(Integer value) {
            addCriterion("tbp_id =", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotEqualTo(Integer value) {
            addCriterion("tbp_id <>", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThan(Integer value) {
            addCriterion("tbp_id >", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbp_id >=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThan(Integer value) {
            addCriterion("tbp_id <", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbp_id <=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdIn(List<Integer> values) {
            addCriterion("tbp_id in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotIn(List<Integer> values) {
            addCriterion("tbp_id not in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdBetween(Integer value1, Integer value2) {
            addCriterion("tbp_id between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbp_id not between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNull() {
            addCriterion("tbp_host is null");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNotNull() {
            addCriterion("tbp_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbpHostEqualTo(Short value) {
            addCriterion("tbp_host =", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotEqualTo(Short value) {
            addCriterion("tbp_host <>", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThan(Short value) {
            addCriterion("tbp_host >", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbp_host >=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThan(Short value) {
            addCriterion("tbp_host <", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThanOrEqualTo(Short value) {
            addCriterion("tbp_host <=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostIn(List<Short> values) {
            addCriterion("tbp_host in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotIn(List<Short> values) {
            addCriterion("tbp_host not in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostBetween(Short value1, Short value2) {
            addCriterion("tbp_host between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotBetween(Short value1, Short value2) {
            addCriterion("tbp_host not between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpCodeIsNull() {
            addCriterion("tbp_code is null");
            return (Criteria) this;
        }

        public Criteria andTbpCodeIsNotNull() {
            addCriterion("tbp_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbpCodeEqualTo(String value) {
            addCriterion("tbp_code =", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeNotEqualTo(String value) {
            addCriterion("tbp_code <>", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeGreaterThan(String value) {
            addCriterion("tbp_code >", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_code >=", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeLessThan(String value) {
            addCriterion("tbp_code <", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeLessThanOrEqualTo(String value) {
            addCriterion("tbp_code <=", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeLike(String value) {
            addCriterion("tbp_code like", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeNotLike(String value) {
            addCriterion("tbp_code not like", value, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeIn(List<String> values) {
            addCriterion("tbp_code in", values, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeNotIn(List<String> values) {
            addCriterion("tbp_code not in", values, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeBetween(String value1, String value2) {
            addCriterion("tbp_code between", value1, value2, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpCodeNotBetween(String value1, String value2) {
            addCriterion("tbp_code not between", value1, value2, "tbpCode");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsIsNull() {
            addCriterion("tbp_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsIsNotNull() {
            addCriterion("tbp_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsEqualTo(Integer value) {
            addCriterion("tbp_outlets =", value, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsNotEqualTo(Integer value) {
            addCriterion("tbp_outlets <>", value, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsGreaterThan(Integer value) {
            addCriterion("tbp_outlets >", value, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbp_outlets >=", value, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsLessThan(Integer value) {
            addCriterion("tbp_outlets <", value, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsLessThanOrEqualTo(Integer value) {
            addCriterion("tbp_outlets <=", value, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsIn(List<Integer> values) {
            addCriterion("tbp_outlets in", values, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsNotIn(List<Integer> values) {
            addCriterion("tbp_outlets not in", values, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsBetween(Integer value1, Integer value2) {
            addCriterion("tbp_outlets between", value1, value2, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpOutletsNotBetween(Integer value1, Integer value2) {
            addCriterion("tbp_outlets not between", value1, value2, "tbpOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIsNull() {
            addCriterion("tbp_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIsNotNull() {
            addCriterion("tbp_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeEqualTo(Date value) {
            addCriterion("tbp_update_time =", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbp_update_time <>", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeGreaterThan(Date value) {
            addCriterion("tbp_update_time >", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_update_time >=", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeLessThan(Date value) {
            addCriterion("tbp_update_time <", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_update_time <=", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIn(List<Date> values) {
            addCriterion("tbp_update_time in", values, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbp_update_time not in", values, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_update_time between", value1, value2, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_update_time not between", value1, value2, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIsNull() {
            addCriterion("tbp_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIsNotNull() {
            addCriterion("tbp_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeEqualTo(Date value) {
            addCriterion("tbp_add_time =", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotEqualTo(Date value) {
            addCriterion("tbp_add_time <>", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeGreaterThan(Date value) {
            addCriterion("tbp_add_time >", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_add_time >=", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeLessThan(Date value) {
            addCriterion("tbp_add_time <", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_add_time <=", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIn(List<Date> values) {
            addCriterion("tbp_add_time in", values, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotIn(List<Date> values) {
            addCriterion("tbp_add_time not in", values, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_add_time between", value1, value2, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_add_time not between", value1, value2, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIsNull() {
            addCriterion("tbp_status is null");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIsNotNull() {
            addCriterion("tbp_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbpStatusEqualTo(Byte value) {
            addCriterion("tbp_status =", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotEqualTo(Byte value) {
            addCriterion("tbp_status <>", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusGreaterThan(Byte value) {
            addCriterion("tbp_status >", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbp_status >=", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusLessThan(Byte value) {
            addCriterion("tbp_status <", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbp_status <=", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIn(List<Byte> values) {
            addCriterion("tbp_status in", values, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotIn(List<Byte> values) {
            addCriterion("tbp_status not in", values, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbp_status between", value1, value2, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbp_status not between", value1, value2, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
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