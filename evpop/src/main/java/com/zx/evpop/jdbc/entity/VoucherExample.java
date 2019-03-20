package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoucherExample() {
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

        public Criteria andTbvIdIsNull() {
            addCriterion("tbv_id is null");
            return (Criteria) this;
        }

        public Criteria andTbvIdIsNotNull() {
            addCriterion("tbv_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbvIdEqualTo(Long value) {
            addCriterion("tbv_id =", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdNotEqualTo(Long value) {
            addCriterion("tbv_id <>", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdGreaterThan(Long value) {
            addCriterion("tbv_id >", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbv_id >=", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdLessThan(Long value) {
            addCriterion("tbv_id <", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdLessThanOrEqualTo(Long value) {
            addCriterion("tbv_id <=", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdIn(List<Long> values) {
            addCriterion("tbv_id in", values, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdNotIn(List<Long> values) {
            addCriterion("tbv_id not in", values, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdBetween(Long value1, Long value2) {
            addCriterion("tbv_id between", value1, value2, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdNotBetween(Long value1, Long value2) {
            addCriterion("tbv_id not between", value1, value2, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvHostIsNull() {
            addCriterion("tbv_host is null");
            return (Criteria) this;
        }

        public Criteria andTbvHostIsNotNull() {
            addCriterion("tbv_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbvHostEqualTo(Long value) {
            addCriterion("tbv_host =", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostNotEqualTo(Long value) {
            addCriterion("tbv_host <>", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostGreaterThan(Long value) {
            addCriterion("tbv_host >", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbv_host >=", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostLessThan(Long value) {
            addCriterion("tbv_host <", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostLessThanOrEqualTo(Long value) {
            addCriterion("tbv_host <=", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostIn(List<Long> values) {
            addCriterion("tbv_host in", values, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostNotIn(List<Long> values) {
            addCriterion("tbv_host not in", values, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostBetween(Long value1, Long value2) {
            addCriterion("tbv_host between", value1, value2, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostNotBetween(Long value1, Long value2) {
            addCriterion("tbv_host not between", value1, value2, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvProfileIsNull() {
            addCriterion("tbv_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbvProfileIsNotNull() {
            addCriterion("tbv_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbvProfileEqualTo(String value) {
            addCriterion("tbv_profile =", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileNotEqualTo(String value) {
            addCriterion("tbv_profile <>", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileGreaterThan(String value) {
            addCriterion("tbv_profile >", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_profile >=", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileLessThan(String value) {
            addCriterion("tbv_profile <", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileLessThanOrEqualTo(String value) {
            addCriterion("tbv_profile <=", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileLike(String value) {
            addCriterion("tbv_profile like", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileNotLike(String value) {
            addCriterion("tbv_profile not like", value, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileIn(List<String> values) {
            addCriterion("tbv_profile in", values, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileNotIn(List<String> values) {
            addCriterion("tbv_profile not in", values, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileBetween(String value1, String value2) {
            addCriterion("tbv_profile between", value1, value2, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvProfileNotBetween(String value1, String value2) {
            addCriterion("tbv_profile not between", value1, value2, "tbvProfile");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyIsNull() {
            addCriterion("tbv_money is null");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyIsNotNull() {
            addCriterion("tbv_money is not null");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyEqualTo(Double value) {
            addCriterion("tbv_money =", value, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyNotEqualTo(Double value) {
            addCriterion("tbv_money <>", value, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyGreaterThan(Double value) {
            addCriterion("tbv_money >", value, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tbv_money >=", value, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyLessThan(Double value) {
            addCriterion("tbv_money <", value, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tbv_money <=", value, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyIn(List<Double> values) {
            addCriterion("tbv_money in", values, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyNotIn(List<Double> values) {
            addCriterion("tbv_money not in", values, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyBetween(Double value1, Double value2) {
            addCriterion("tbv_money between", value1, value2, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tbv_money not between", value1, value2, "tbvMoney");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherIsNull() {
            addCriterion("tbv_voucher is null");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherIsNotNull() {
            addCriterion("tbv_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherEqualTo(String value) {
            addCriterion("tbv_voucher =", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherNotEqualTo(String value) {
            addCriterion("tbv_voucher <>", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherGreaterThan(String value) {
            addCriterion("tbv_voucher >", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_voucher >=", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherLessThan(String value) {
            addCriterion("tbv_voucher <", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherLessThanOrEqualTo(String value) {
            addCriterion("tbv_voucher <=", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherLike(String value) {
            addCriterion("tbv_voucher like", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherNotLike(String value) {
            addCriterion("tbv_voucher not like", value, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherIn(List<String> values) {
            addCriterion("tbv_voucher in", values, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherNotIn(List<String> values) {
            addCriterion("tbv_voucher not in", values, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherBetween(String value1, String value2) {
            addCriterion("tbv_voucher between", value1, value2, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvVoucherNotBetween(String value1, String value2) {
            addCriterion("tbv_voucher not between", value1, value2, "tbvVoucher");
            return (Criteria) this;
        }

        public Criteria andTbvUuidIsNull() {
            addCriterion("tbv_uuid is null");
            return (Criteria) this;
        }

        public Criteria andTbvUuidIsNotNull() {
            addCriterion("tbv_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andTbvUuidEqualTo(String value) {
            addCriterion("tbv_uuid =", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidNotEqualTo(String value) {
            addCriterion("tbv_uuid <>", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidGreaterThan(String value) {
            addCriterion("tbv_uuid >", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_uuid >=", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidLessThan(String value) {
            addCriterion("tbv_uuid <", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidLessThanOrEqualTo(String value) {
            addCriterion("tbv_uuid <=", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidLike(String value) {
            addCriterion("tbv_uuid like", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidNotLike(String value) {
            addCriterion("tbv_uuid not like", value, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidIn(List<String> values) {
            addCriterion("tbv_uuid in", values, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidNotIn(List<String> values) {
            addCriterion("tbv_uuid not in", values, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidBetween(String value1, String value2) {
            addCriterion("tbv_uuid between", value1, value2, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvUuidNotBetween(String value1, String value2) {
            addCriterion("tbv_uuid not between", value1, value2, "tbvUuid");
            return (Criteria) this;
        }

        public Criteria andTbvAdderIsNull() {
            addCriterion("tbv_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbvAdderIsNotNull() {
            addCriterion("tbv_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbvAdderEqualTo(Long value) {
            addCriterion("tbv_adder =", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderNotEqualTo(Long value) {
            addCriterion("tbv_adder <>", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderGreaterThan(Long value) {
            addCriterion("tbv_adder >", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbv_adder >=", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderLessThan(Long value) {
            addCriterion("tbv_adder <", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbv_adder <=", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderIn(List<Long> values) {
            addCriterion("tbv_adder in", values, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderNotIn(List<Long> values) {
            addCriterion("tbv_adder not in", values, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderBetween(Long value1, Long value2) {
            addCriterion("tbv_adder between", value1, value2, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbv_adder not between", value1, value2, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkIsNull() {
            addCriterion("tbv_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkIsNotNull() {
            addCriterion("tbv_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkEqualTo(String value) {
            addCriterion("tbv_remark =", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkNotEqualTo(String value) {
            addCriterion("tbv_remark <>", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkGreaterThan(String value) {
            addCriterion("tbv_remark >", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_remark >=", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkLessThan(String value) {
            addCriterion("tbv_remark <", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbv_remark <=", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkLike(String value) {
            addCriterion("tbv_remark like", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkNotLike(String value) {
            addCriterion("tbv_remark not like", value, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkIn(List<String> values) {
            addCriterion("tbv_remark in", values, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkNotIn(List<String> values) {
            addCriterion("tbv_remark not in", values, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkBetween(String value1, String value2) {
            addCriterion("tbv_remark between", value1, value2, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvRemarkNotBetween(String value1, String value2) {
            addCriterion("tbv_remark not between", value1, value2, "tbvRemark");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeIsNull() {
            addCriterion("tbv_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeIsNotNull() {
            addCriterion("tbv_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeEqualTo(Date value) {
            addCriterion("tbv_update_time =", value, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbv_update_time <>", value, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeGreaterThan(Date value) {
            addCriterion("tbv_update_time >", value, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbv_update_time >=", value, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeLessThan(Date value) {
            addCriterion("tbv_update_time <", value, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbv_update_time <=", value, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeIn(List<Date> values) {
            addCriterion("tbv_update_time in", values, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbv_update_time not in", values, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbv_update_time between", value1, value2, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbv_update_time not between", value1, value2, "tbvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeIsNull() {
            addCriterion("tbv_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeIsNotNull() {
            addCriterion("tbv_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeEqualTo(Date value) {
            addCriterion("tbv_add_time =", value, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeNotEqualTo(Date value) {
            addCriterion("tbv_add_time <>", value, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeGreaterThan(Date value) {
            addCriterion("tbv_add_time >", value, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbv_add_time >=", value, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeLessThan(Date value) {
            addCriterion("tbv_add_time <", value, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbv_add_time <=", value, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeIn(List<Date> values) {
            addCriterion("tbv_add_time in", values, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeNotIn(List<Date> values) {
            addCriterion("tbv_add_time not in", values, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbv_add_time between", value1, value2, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbv_add_time not between", value1, value2, "tbvAddTime");
            return (Criteria) this;
        }

        public Criteria andTbvStatusIsNull() {
            addCriterion("tbv_status is null");
            return (Criteria) this;
        }

        public Criteria andTbvStatusIsNotNull() {
            addCriterion("tbv_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbvStatusEqualTo(Short value) {
            addCriterion("tbv_status =", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusNotEqualTo(Short value) {
            addCriterion("tbv_status <>", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusGreaterThan(Short value) {
            addCriterion("tbv_status >", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbv_status >=", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusLessThan(Short value) {
            addCriterion("tbv_status <", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbv_status <=", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusIn(List<Short> values) {
            addCriterion("tbv_status in", values, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusNotIn(List<Short> values) {
            addCriterion("tbv_status not in", values, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusBetween(Short value1, Short value2) {
            addCriterion("tbv_status between", value1, value2, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbv_status not between", value1, value2, "tbvStatus");
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