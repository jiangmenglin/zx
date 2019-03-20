package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponCodeExample() {
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

        public Criteria andTbccIdIsNull() {
            addCriterion("tbcc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbccIdIsNotNull() {
            addCriterion("tbcc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbccIdEqualTo(Integer value) {
            addCriterion("tbcc_id =", value, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdNotEqualTo(Integer value) {
            addCriterion("tbcc_id <>", value, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdGreaterThan(Integer value) {
            addCriterion("tbcc_id >", value, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbcc_id >=", value, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdLessThan(Integer value) {
            addCriterion("tbcc_id <", value, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbcc_id <=", value, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdIn(List<Integer> values) {
            addCriterion("tbcc_id in", values, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdNotIn(List<Integer> values) {
            addCriterion("tbcc_id not in", values, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdBetween(Integer value1, Integer value2) {
            addCriterion("tbcc_id between", value1, value2, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbcc_id not between", value1, value2, "tbccId");
            return (Criteria) this;
        }

        public Criteria andTbccHostIsNull() {
            addCriterion("tbcc_host is null");
            return (Criteria) this;
        }

        public Criteria andTbccHostIsNotNull() {
            addCriterion("tbcc_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbccHostEqualTo(Short value) {
            addCriterion("tbcc_host =", value, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostNotEqualTo(Short value) {
            addCriterion("tbcc_host <>", value, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostGreaterThan(Short value) {
            addCriterion("tbcc_host >", value, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcc_host >=", value, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostLessThan(Short value) {
            addCriterion("tbcc_host <", value, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostLessThanOrEqualTo(Short value) {
            addCriterion("tbcc_host <=", value, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostIn(List<Short> values) {
            addCriterion("tbcc_host in", values, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostNotIn(List<Short> values) {
            addCriterion("tbcc_host not in", values, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostBetween(Short value1, Short value2) {
            addCriterion("tbcc_host between", value1, value2, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccHostNotBetween(Short value1, Short value2) {
            addCriterion("tbcc_host not between", value1, value2, "tbccHost");
            return (Criteria) this;
        }

        public Criteria andTbccCodeIsNull() {
            addCriterion("tbcc_code is null");
            return (Criteria) this;
        }

        public Criteria andTbccCodeIsNotNull() {
            addCriterion("tbcc_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbccCodeEqualTo(String value) {
            addCriterion("tbcc_code =", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeNotEqualTo(String value) {
            addCriterion("tbcc_code <>", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeGreaterThan(String value) {
            addCriterion("tbcc_code >", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbcc_code >=", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeLessThan(String value) {
            addCriterion("tbcc_code <", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeLessThanOrEqualTo(String value) {
            addCriterion("tbcc_code <=", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeLike(String value) {
            addCriterion("tbcc_code like", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeNotLike(String value) {
            addCriterion("tbcc_code not like", value, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeIn(List<String> values) {
            addCriterion("tbcc_code in", values, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeNotIn(List<String> values) {
            addCriterion("tbcc_code not in", values, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeBetween(String value1, String value2) {
            addCriterion("tbcc_code between", value1, value2, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCodeNotBetween(String value1, String value2) {
            addCriterion("tbcc_code not between", value1, value2, "tbccCode");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeIsNull() {
            addCriterion("tbcc_coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeIsNotNull() {
            addCriterion("tbcc_coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeEqualTo(Integer value) {
            addCriterion("tbcc_coupon_type =", value, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeNotEqualTo(Integer value) {
            addCriterion("tbcc_coupon_type <>", value, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeGreaterThan(Integer value) {
            addCriterion("tbcc_coupon_type >", value, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbcc_coupon_type >=", value, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeLessThan(Integer value) {
            addCriterion("tbcc_coupon_type <", value, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tbcc_coupon_type <=", value, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeIn(List<Integer> values) {
            addCriterion("tbcc_coupon_type in", values, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeNotIn(List<Integer> values) {
            addCriterion("tbcc_coupon_type not in", values, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("tbcc_coupon_type between", value1, value2, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbcc_coupon_type not between", value1, value2, "tbccCouponType");
            return (Criteria) this;
        }

        public Criteria andTbccMemberIsNull() {
            addCriterion("tbcc_member is null");
            return (Criteria) this;
        }

        public Criteria andTbccMemberIsNotNull() {
            addCriterion("tbcc_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbccMemberEqualTo(Integer value) {
            addCriterion("tbcc_member =", value, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberNotEqualTo(Integer value) {
            addCriterion("tbcc_member <>", value, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberGreaterThan(Integer value) {
            addCriterion("tbcc_member >", value, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbcc_member >=", value, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberLessThan(Integer value) {
            addCriterion("tbcc_member <", value, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbcc_member <=", value, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberIn(List<Integer> values) {
            addCriterion("tbcc_member in", values, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberNotIn(List<Integer> values) {
            addCriterion("tbcc_member not in", values, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbcc_member between", value1, value2, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbcc_member not between", value1, value2, "tbccMember");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkIsNull() {
            addCriterion("tbcc_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkIsNotNull() {
            addCriterion("tbcc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkEqualTo(String value) {
            addCriterion("tbcc_remark =", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkNotEqualTo(String value) {
            addCriterion("tbcc_remark <>", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkGreaterThan(String value) {
            addCriterion("tbcc_remark >", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbcc_remark >=", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkLessThan(String value) {
            addCriterion("tbcc_remark <", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbcc_remark <=", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkLike(String value) {
            addCriterion("tbcc_remark like", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkNotLike(String value) {
            addCriterion("tbcc_remark not like", value, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkIn(List<String> values) {
            addCriterion("tbcc_remark in", values, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkNotIn(List<String> values) {
            addCriterion("tbcc_remark not in", values, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkBetween(String value1, String value2) {
            addCriterion("tbcc_remark between", value1, value2, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRemarkNotBetween(String value1, String value2) {
            addCriterion("tbcc_remark not between", value1, value2, "tbccRemark");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeIsNull() {
            addCriterion("tbcc_rch_time is null");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeIsNotNull() {
            addCriterion("tbcc_rch_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeEqualTo(Date value) {
            addCriterion("tbcc_rch_time =", value, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeNotEqualTo(Date value) {
            addCriterion("tbcc_rch_time <>", value, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeGreaterThan(Date value) {
            addCriterion("tbcc_rch_time >", value, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcc_rch_time >=", value, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeLessThan(Date value) {
            addCriterion("tbcc_rch_time <", value, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcc_rch_time <=", value, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeIn(List<Date> values) {
            addCriterion("tbcc_rch_time in", values, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeNotIn(List<Date> values) {
            addCriterion("tbcc_rch_time not in", values, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeBetween(Date value1, Date value2) {
            addCriterion("tbcc_rch_time between", value1, value2, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccRchTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcc_rch_time not between", value1, value2, "tbccRchTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeIsNull() {
            addCriterion("tbcc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeIsNotNull() {
            addCriterion("tbcc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeEqualTo(Date value) {
            addCriterion("tbcc_update_time =", value, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbcc_update_time <>", value, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeGreaterThan(Date value) {
            addCriterion("tbcc_update_time >", value, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcc_update_time >=", value, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeLessThan(Date value) {
            addCriterion("tbcc_update_time <", value, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcc_update_time <=", value, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeIn(List<Date> values) {
            addCriterion("tbcc_update_time in", values, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbcc_update_time not in", values, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbcc_update_time between", value1, value2, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcc_update_time not between", value1, value2, "tbccUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeIsNull() {
            addCriterion("tbcc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeIsNotNull() {
            addCriterion("tbcc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeEqualTo(Date value) {
            addCriterion("tbcc_add_time =", value, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeNotEqualTo(Date value) {
            addCriterion("tbcc_add_time <>", value, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeGreaterThan(Date value) {
            addCriterion("tbcc_add_time >", value, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcc_add_time >=", value, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeLessThan(Date value) {
            addCriterion("tbcc_add_time <", value, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcc_add_time <=", value, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeIn(List<Date> values) {
            addCriterion("tbcc_add_time in", values, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeNotIn(List<Date> values) {
            addCriterion("tbcc_add_time not in", values, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbcc_add_time between", value1, value2, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcc_add_time not between", value1, value2, "tbccAddTime");
            return (Criteria) this;
        }

        public Criteria andTbccStatusIsNull() {
            addCriterion("tbcc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbccStatusIsNotNull() {
            addCriterion("tbcc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbccStatusEqualTo(Byte value) {
            addCriterion("tbcc_status =", value, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusNotEqualTo(Byte value) {
            addCriterion("tbcc_status <>", value, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusGreaterThan(Byte value) {
            addCriterion("tbcc_status >", value, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbcc_status >=", value, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusLessThan(Byte value) {
            addCriterion("tbcc_status <", value, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbcc_status <=", value, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusIn(List<Byte> values) {
            addCriterion("tbcc_status in", values, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusNotIn(List<Byte> values) {
            addCriterion("tbcc_status not in", values, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbcc_status between", value1, value2, "tbccStatus");
            return (Criteria) this;
        }

        public Criteria andTbccStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbcc_status not between", value1, value2, "tbccStatus");
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