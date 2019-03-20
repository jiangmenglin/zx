package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeScanConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeScanConfigExample() {
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

        public Criteria andTbcscIdIsNull() {
            addCriterion("tbcsc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcscIdIsNotNull() {
            addCriterion("tbcsc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscIdEqualTo(Long value) {
            addCriterion("tbcsc_id =", value, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdNotEqualTo(Long value) {
            addCriterion("tbcsc_id <>", value, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdGreaterThan(Long value) {
            addCriterion("tbcsc_id >", value, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsc_id >=", value, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdLessThan(Long value) {
            addCriterion("tbcsc_id <", value, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdLessThanOrEqualTo(Long value) {
            addCriterion("tbcsc_id <=", value, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdIn(List<Long> values) {
            addCriterion("tbcsc_id in", values, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdNotIn(List<Long> values) {
            addCriterion("tbcsc_id not in", values, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdBetween(Long value1, Long value2) {
            addCriterion("tbcsc_id between", value1, value2, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscIdNotBetween(Long value1, Long value2) {
            addCriterion("tbcsc_id not between", value1, value2, "tbcscId");
            return (Criteria) this;
        }

        public Criteria andTbcscNameIsNull() {
            addCriterion("tbcsc_name is null");
            return (Criteria) this;
        }

        public Criteria andTbcscNameIsNotNull() {
            addCriterion("tbcsc_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscNameEqualTo(String value) {
            addCriterion("tbcsc_name =", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameNotEqualTo(String value) {
            addCriterion("tbcsc_name <>", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameGreaterThan(String value) {
            addCriterion("tbcsc_name >", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbcsc_name >=", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameLessThan(String value) {
            addCriterion("tbcsc_name <", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameLessThanOrEqualTo(String value) {
            addCriterion("tbcsc_name <=", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameLike(String value) {
            addCriterion("tbcsc_name like", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameNotLike(String value) {
            addCriterion("tbcsc_name not like", value, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameIn(List<String> values) {
            addCriterion("tbcsc_name in", values, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameNotIn(List<String> values) {
            addCriterion("tbcsc_name not in", values, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameBetween(String value1, String value2) {
            addCriterion("tbcsc_name between", value1, value2, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscNameNotBetween(String value1, String value2) {
            addCriterion("tbcsc_name not between", value1, value2, "tbcscName");
            return (Criteria) this;
        }

        public Criteria andTbcscHostIsNull() {
            addCriterion("tbcsc_host is null");
            return (Criteria) this;
        }

        public Criteria andTbcscHostIsNotNull() {
            addCriterion("tbcsc_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscHostEqualTo(Long value) {
            addCriterion("tbcsc_host =", value, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostNotEqualTo(Long value) {
            addCriterion("tbcsc_host <>", value, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostGreaterThan(Long value) {
            addCriterion("tbcsc_host >", value, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsc_host >=", value, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostLessThan(Long value) {
            addCriterion("tbcsc_host <", value, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostLessThanOrEqualTo(Long value) {
            addCriterion("tbcsc_host <=", value, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostIn(List<Long> values) {
            addCriterion("tbcsc_host in", values, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostNotIn(List<Long> values) {
            addCriterion("tbcsc_host not in", values, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostBetween(Long value1, Long value2) {
            addCriterion("tbcsc_host between", value1, value2, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscHostNotBetween(Long value1, Long value2) {
            addCriterion("tbcsc_host not between", value1, value2, "tbcscHost");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdIsNull() {
            addCriterion("tbcsc_code_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdIsNotNull() {
            addCriterion("tbcsc_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdEqualTo(String value) {
            addCriterion("tbcsc_code_id =", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdNotEqualTo(String value) {
            addCriterion("tbcsc_code_id <>", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdGreaterThan(String value) {
            addCriterion("tbcsc_code_id >", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("tbcsc_code_id >=", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdLessThan(String value) {
            addCriterion("tbcsc_code_id <", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdLessThanOrEqualTo(String value) {
            addCriterion("tbcsc_code_id <=", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdLike(String value) {
            addCriterion("tbcsc_code_id like", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdNotLike(String value) {
            addCriterion("tbcsc_code_id not like", value, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdIn(List<String> values) {
            addCriterion("tbcsc_code_id in", values, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdNotIn(List<String> values) {
            addCriterion("tbcsc_code_id not in", values, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdBetween(String value1, String value2) {
            addCriterion("tbcsc_code_id between", value1, value2, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCodeIdNotBetween(String value1, String value2) {
            addCriterion("tbcsc_code_id not between", value1, value2, "tbcscCodeId");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeIsNull() {
            addCriterion("tbcsc_coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeIsNotNull() {
            addCriterion("tbcsc_coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeEqualTo(Long value) {
            addCriterion("tbcsc_coupon_type =", value, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeNotEqualTo(Long value) {
            addCriterion("tbcsc_coupon_type <>", value, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeGreaterThan(Long value) {
            addCriterion("tbcsc_coupon_type >", value, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsc_coupon_type >=", value, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeLessThan(Long value) {
            addCriterion("tbcsc_coupon_type <", value, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeLessThanOrEqualTo(Long value) {
            addCriterion("tbcsc_coupon_type <=", value, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeIn(List<Long> values) {
            addCriterion("tbcsc_coupon_type in", values, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeNotIn(List<Long> values) {
            addCriterion("tbcsc_coupon_type not in", values, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeBetween(Long value1, Long value2) {
            addCriterion("tbcsc_coupon_type between", value1, value2, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcscCouponTypeNotBetween(Long value1, Long value2) {
            addCriterion("tbcsc_coupon_type not between", value1, value2, "tbcscCouponType");
            return (Criteria) this;
        }

        public Criteria andScanTimesIsNull() {
            addCriterion("scan_times is null");
            return (Criteria) this;
        }

        public Criteria andScanTimesIsNotNull() {
            addCriterion("scan_times is not null");
            return (Criteria) this;
        }

        public Criteria andScanTimesEqualTo(Integer value) {
            addCriterion("scan_times =", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesNotEqualTo(Integer value) {
            addCriterion("scan_times <>", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesGreaterThan(Integer value) {
            addCriterion("scan_times >", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_times >=", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesLessThan(Integer value) {
            addCriterion("scan_times <", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesLessThanOrEqualTo(Integer value) {
            addCriterion("scan_times <=", value, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesIn(List<Integer> values) {
            addCriterion("scan_times in", values, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesNotIn(List<Integer> values) {
            addCriterion("scan_times not in", values, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesBetween(Integer value1, Integer value2) {
            addCriterion("scan_times between", value1, value2, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andScanTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_times not between", value1, value2, "scanTimes");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeIsNull() {
            addCriterion("tbcsc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeIsNotNull() {
            addCriterion("tbcsc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeEqualTo(Date value) {
            addCriterion("tbcsc_update_time =", value, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbcsc_update_time <>", value, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeGreaterThan(Date value) {
            addCriterion("tbcsc_update_time >", value, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcsc_update_time >=", value, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeLessThan(Date value) {
            addCriterion("tbcsc_update_time <", value, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcsc_update_time <=", value, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeIn(List<Date> values) {
            addCriterion("tbcsc_update_time in", values, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbcsc_update_time not in", values, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbcsc_update_time between", value1, value2, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcsc_update_time not between", value1, value2, "tbcscUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeIsNull() {
            addCriterion("tbcsc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeIsNotNull() {
            addCriterion("tbcsc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeEqualTo(Date value) {
            addCriterion("tbcsc_add_time =", value, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeNotEqualTo(Date value) {
            addCriterion("tbcsc_add_time <>", value, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeGreaterThan(Date value) {
            addCriterion("tbcsc_add_time >", value, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcsc_add_time >=", value, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeLessThan(Date value) {
            addCriterion("tbcsc_add_time <", value, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcsc_add_time <=", value, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeIn(List<Date> values) {
            addCriterion("tbcsc_add_time in", values, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeNotIn(List<Date> values) {
            addCriterion("tbcsc_add_time not in", values, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbcsc_add_time between", value1, value2, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcsc_add_time not between", value1, value2, "tbcscAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusIsNull() {
            addCriterion("tbcsc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusIsNotNull() {
            addCriterion("tbcsc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusEqualTo(Short value) {
            addCriterion("tbcsc_status =", value, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusNotEqualTo(Short value) {
            addCriterion("tbcsc_status <>", value, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusGreaterThan(Short value) {
            addCriterion("tbcsc_status >", value, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcsc_status >=", value, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusLessThan(Short value) {
            addCriterion("tbcsc_status <", value, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbcsc_status <=", value, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusIn(List<Short> values) {
            addCriterion("tbcsc_status in", values, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusNotIn(List<Short> values) {
            addCriterion("tbcsc_status not in", values, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusBetween(Short value1, Short value2) {
            addCriterion("tbcsc_status between", value1, value2, "tbcscStatus");
            return (Criteria) this;
        }

        public Criteria andTbcscStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbcsc_status not between", value1, value2, "tbcscStatus");
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