package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeScanRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeScanRecordExample() {
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

        public Criteria andTbcsrIdIsNull() {
            addCriterion("tbcsr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdIsNotNull() {
            addCriterion("tbcsr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdEqualTo(Long value) {
            addCriterion("tbcsr_id =", value, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdNotEqualTo(Long value) {
            addCriterion("tbcsr_id <>", value, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdGreaterThan(Long value) {
            addCriterion("tbcsr_id >", value, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_id >=", value, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdLessThan(Long value) {
            addCriterion("tbcsr_id <", value, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_id <=", value, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdIn(List<Long> values) {
            addCriterion("tbcsr_id in", values, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdNotIn(List<Long> values) {
            addCriterion("tbcsr_id not in", values, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdBetween(Long value1, Long value2) {
            addCriterion("tbcsr_id between", value1, value2, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrIdNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_id not between", value1, value2, "tbcsrId");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberIsNull() {
            addCriterion("tbcsr_member is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberIsNotNull() {
            addCriterion("tbcsr_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberEqualTo(Long value) {
            addCriterion("tbcsr_member =", value, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberNotEqualTo(Long value) {
            addCriterion("tbcsr_member <>", value, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberGreaterThan(Long value) {
            addCriterion("tbcsr_member >", value, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_member >=", value, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberLessThan(Long value) {
            addCriterion("tbcsr_member <", value, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_member <=", value, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberIn(List<Long> values) {
            addCriterion("tbcsr_member in", values, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberNotIn(List<Long> values) {
            addCriterion("tbcsr_member not in", values, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberBetween(Long value1, Long value2) {
            addCriterion("tbcsr_member between", value1, value2, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrMemberNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_member not between", value1, value2, "tbcsrMember");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponIsNull() {
            addCriterion("tbcsr_coupon is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponIsNotNull() {
            addCriterion("tbcsr_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponEqualTo(Long value) {
            addCriterion("tbcsr_coupon =", value, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponNotEqualTo(Long value) {
            addCriterion("tbcsr_coupon <>", value, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponGreaterThan(Long value) {
            addCriterion("tbcsr_coupon >", value, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_coupon >=", value, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponLessThan(Long value) {
            addCriterion("tbcsr_coupon <", value, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_coupon <=", value, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponIn(List<Long> values) {
            addCriterion("tbcsr_coupon in", values, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponNotIn(List<Long> values) {
            addCriterion("tbcsr_coupon not in", values, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponBetween(Long value1, Long value2) {
            addCriterion("tbcsr_coupon between", value1, value2, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_coupon not between", value1, value2, "tbcsrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeIsNull() {
            addCriterion("tbcsr_coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeIsNotNull() {
            addCriterion("tbcsr_coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeEqualTo(Long value) {
            addCriterion("tbcsr_coupon_type =", value, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeNotEqualTo(Long value) {
            addCriterion("tbcsr_coupon_type <>", value, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeGreaterThan(Long value) {
            addCriterion("tbcsr_coupon_type >", value, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_coupon_type >=", value, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeLessThan(Long value) {
            addCriterion("tbcsr_coupon_type <", value, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_coupon_type <=", value, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeIn(List<Long> values) {
            addCriterion("tbcsr_coupon_type in", values, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeNotIn(List<Long> values) {
            addCriterion("tbcsr_coupon_type not in", values, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeBetween(Long value1, Long value2) {
            addCriterion("tbcsr_coupon_type between", value1, value2, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponTypeNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_coupon_type not between", value1, value2, "tbcsrCouponType");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigIsNull() {
            addCriterion("tbcsr_code_scan_config is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigIsNotNull() {
            addCriterion("tbcsr_code_scan_config is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigEqualTo(Long value) {
            addCriterion("tbcsr_code_scan_config =", value, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigNotEqualTo(Long value) {
            addCriterion("tbcsr_code_scan_config <>", value, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigGreaterThan(Long value) {
            addCriterion("tbcsr_code_scan_config >", value, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_code_scan_config >=", value, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigLessThan(Long value) {
            addCriterion("tbcsr_code_scan_config <", value, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_code_scan_config <=", value, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigIn(List<Long> values) {
            addCriterion("tbcsr_code_scan_config in", values, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigNotIn(List<Long> values) {
            addCriterion("tbcsr_code_scan_config not in", values, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigBetween(Long value1, Long value2) {
            addCriterion("tbcsr_code_scan_config between", value1, value2, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeScanConfigNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_code_scan_config not between", value1, value2, "tbcsrCodeScanConfig");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelIsNull() {
            addCriterion("tbcsr_unit_channel is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelIsNotNull() {
            addCriterion("tbcsr_unit_channel is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelEqualTo(Long value) {
            addCriterion("tbcsr_unit_channel =", value, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelNotEqualTo(Long value) {
            addCriterion("tbcsr_unit_channel <>", value, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelGreaterThan(Long value) {
            addCriterion("tbcsr_unit_channel >", value, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_unit_channel >=", value, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelLessThan(Long value) {
            addCriterion("tbcsr_unit_channel <", value, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_unit_channel <=", value, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelIn(List<Long> values) {
            addCriterion("tbcsr_unit_channel in", values, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelNotIn(List<Long> values) {
            addCriterion("tbcsr_unit_channel not in", values, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelBetween(Long value1, Long value2) {
            addCriterion("tbcsr_unit_channel between", value1, value2, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitChannelNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_unit_channel not between", value1, value2, "tbcsrUnitChannel");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerIsNull() {
            addCriterion("tbcsr_unit_partner is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerIsNotNull() {
            addCriterion("tbcsr_unit_partner is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerEqualTo(Long value) {
            addCriterion("tbcsr_unit_partner =", value, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerNotEqualTo(Long value) {
            addCriterion("tbcsr_unit_partner <>", value, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerGreaterThan(Long value) {
            addCriterion("tbcsr_unit_partner >", value, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcsr_unit_partner >=", value, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerLessThan(Long value) {
            addCriterion("tbcsr_unit_partner <", value, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerLessThanOrEqualTo(Long value) {
            addCriterion("tbcsr_unit_partner <=", value, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerIn(List<Long> values) {
            addCriterion("tbcsr_unit_partner in", values, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerNotIn(List<Long> values) {
            addCriterion("tbcsr_unit_partner not in", values, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerBetween(Long value1, Long value2) {
            addCriterion("tbcsr_unit_partner between", value1, value2, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrUnitPartnerNotBetween(Long value1, Long value2) {
            addCriterion("tbcsr_unit_partner not between", value1, value2, "tbcsrUnitPartner");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountIsNull() {
            addCriterion("tbcsr_coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountIsNotNull() {
            addCriterion("tbcsr_coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount =", value, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountNotEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount <>", value, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountGreaterThan(Double value) {
            addCriterion("tbcsr_coupon_amount >", value, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount >=", value, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountLessThan(Double value) {
            addCriterion("tbcsr_coupon_amount <", value, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountLessThanOrEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount <=", value, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountIn(List<Double> values) {
            addCriterion("tbcsr_coupon_amount in", values, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountNotIn(List<Double> values) {
            addCriterion("tbcsr_coupon_amount not in", values, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountBetween(Double value1, Double value2) {
            addCriterion("tbcsr_coupon_amount between", value1, value2, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountNotBetween(Double value1, Double value2) {
            addCriterion("tbcsr_coupon_amount not between", value1, value2, "tbcsrCouponAmount");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllIsNull() {
            addCriterion("tbcsr_coupon_amount_all is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllIsNotNull() {
            addCriterion("tbcsr_coupon_amount_all is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount_all =", value, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllNotEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount_all <>", value, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllGreaterThan(Double value) {
            addCriterion("tbcsr_coupon_amount_all >", value, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllGreaterThanOrEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount_all >=", value, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllLessThan(Double value) {
            addCriterion("tbcsr_coupon_amount_all <", value, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllLessThanOrEqualTo(Double value) {
            addCriterion("tbcsr_coupon_amount_all <=", value, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllIn(List<Double> values) {
            addCriterion("tbcsr_coupon_amount_all in", values, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllNotIn(List<Double> values) {
            addCriterion("tbcsr_coupon_amount_all not in", values, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllBetween(Double value1, Double value2) {
            addCriterion("tbcsr_coupon_amount_all between", value1, value2, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCouponAmountAllNotBetween(Double value1, Double value2) {
            addCriterion("tbcsr_coupon_amount_all not between", value1, value2, "tbcsrCouponAmountAll");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceIsNull() {
            addCriterion("tbcsr_code_source is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceIsNotNull() {
            addCriterion("tbcsr_code_source is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceEqualTo(Short value) {
            addCriterion("tbcsr_code_source =", value, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceNotEqualTo(Short value) {
            addCriterion("tbcsr_code_source <>", value, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceGreaterThan(Short value) {
            addCriterion("tbcsr_code_source >", value, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcsr_code_source >=", value, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceLessThan(Short value) {
            addCriterion("tbcsr_code_source <", value, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceLessThanOrEqualTo(Short value) {
            addCriterion("tbcsr_code_source <=", value, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceIn(List<Short> values) {
            addCriterion("tbcsr_code_source in", values, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceNotIn(List<Short> values) {
            addCriterion("tbcsr_code_source not in", values, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceBetween(Short value1, Short value2) {
            addCriterion("tbcsr_code_source between", value1, value2, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeSourceNotBetween(Short value1, Short value2) {
            addCriterion("tbcsr_code_source not between", value1, value2, "tbcsrCodeSource");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeIsNull() {
            addCriterion("tbcsr_code is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeIsNotNull() {
            addCriterion("tbcsr_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeEqualTo(String value) {
            addCriterion("tbcsr_code =", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeNotEqualTo(String value) {
            addCriterion("tbcsr_code <>", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeGreaterThan(String value) {
            addCriterion("tbcsr_code >", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbcsr_code >=", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeLessThan(String value) {
            addCriterion("tbcsr_code <", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeLessThanOrEqualTo(String value) {
            addCriterion("tbcsr_code <=", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeLike(String value) {
            addCriterion("tbcsr_code like", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeNotLike(String value) {
            addCriterion("tbcsr_code not like", value, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeIn(List<String> values) {
            addCriterion("tbcsr_code in", values, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeNotIn(List<String> values) {
            addCriterion("tbcsr_code not in", values, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeBetween(String value1, String value2) {
            addCriterion("tbcsr_code between", value1, value2, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeNotBetween(String value1, String value2) {
            addCriterion("tbcsr_code not between", value1, value2, "tbcsrCode");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateIsNull() {
            addCriterion("tbcsr_code_state is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateIsNotNull() {
            addCriterion("tbcsr_code_state is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateEqualTo(Short value) {
            addCriterion("tbcsr_code_state =", value, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateNotEqualTo(Short value) {
            addCriterion("tbcsr_code_state <>", value, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateGreaterThan(Short value) {
            addCriterion("tbcsr_code_state >", value, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcsr_code_state >=", value, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateLessThan(Short value) {
            addCriterion("tbcsr_code_state <", value, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateLessThanOrEqualTo(Short value) {
            addCriterion("tbcsr_code_state <=", value, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateIn(List<Short> values) {
            addCriterion("tbcsr_code_state in", values, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateNotIn(List<Short> values) {
            addCriterion("tbcsr_code_state not in", values, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateBetween(Short value1, Short value2) {
            addCriterion("tbcsr_code_state between", value1, value2, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeStateNotBetween(Short value1, Short value2) {
            addCriterion("tbcsr_code_state not between", value1, value2, "tbcsrCodeState");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeIsNull() {
            addCriterion("tbcsr_code_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeIsNotNull() {
            addCriterion("tbcsr_code_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeEqualTo(Date value) {
            addCriterion("tbcsr_code_time =", value, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeNotEqualTo(Date value) {
            addCriterion("tbcsr_code_time <>", value, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeGreaterThan(Date value) {
            addCriterion("tbcsr_code_time >", value, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcsr_code_time >=", value, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeLessThan(Date value) {
            addCriterion("tbcsr_code_time <", value, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcsr_code_time <=", value, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeIn(List<Date> values) {
            addCriterion("tbcsr_code_time in", values, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeNotIn(List<Date> values) {
            addCriterion("tbcsr_code_time not in", values, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeBetween(Date value1, Date value2) {
            addCriterion("tbcsr_code_time between", value1, value2, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrCodeTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcsr_code_time not between", value1, value2, "tbcsrCodeTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkIsNull() {
            addCriterion("tbcsr_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkIsNotNull() {
            addCriterion("tbcsr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkEqualTo(String value) {
            addCriterion("tbcsr_remark =", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkNotEqualTo(String value) {
            addCriterion("tbcsr_remark <>", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkGreaterThan(String value) {
            addCriterion("tbcsr_remark >", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbcsr_remark >=", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkLessThan(String value) {
            addCriterion("tbcsr_remark <", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbcsr_remark <=", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkLike(String value) {
            addCriterion("tbcsr_remark like", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkNotLike(String value) {
            addCriterion("tbcsr_remark not like", value, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkIn(List<String> values) {
            addCriterion("tbcsr_remark in", values, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkNotIn(List<String> values) {
            addCriterion("tbcsr_remark not in", values, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkBetween(String value1, String value2) {
            addCriterion("tbcsr_remark between", value1, value2, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrRemarkNotBetween(String value1, String value2) {
            addCriterion("tbcsr_remark not between", value1, value2, "tbcsrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeIsNull() {
            addCriterion("tbcsr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeIsNotNull() {
            addCriterion("tbcsr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeEqualTo(Date value) {
            addCriterion("tbcsr_update_time =", value, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbcsr_update_time <>", value, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeGreaterThan(Date value) {
            addCriterion("tbcsr_update_time >", value, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcsr_update_time >=", value, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeLessThan(Date value) {
            addCriterion("tbcsr_update_time <", value, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcsr_update_time <=", value, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeIn(List<Date> values) {
            addCriterion("tbcsr_update_time in", values, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbcsr_update_time not in", values, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbcsr_update_time between", value1, value2, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcsr_update_time not between", value1, value2, "tbcsrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeIsNull() {
            addCriterion("tbcsr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeIsNotNull() {
            addCriterion("tbcsr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeEqualTo(Date value) {
            addCriterion("tbcsr_add_time =", value, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeNotEqualTo(Date value) {
            addCriterion("tbcsr_add_time <>", value, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeGreaterThan(Date value) {
            addCriterion("tbcsr_add_time >", value, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcsr_add_time >=", value, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeLessThan(Date value) {
            addCriterion("tbcsr_add_time <", value, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcsr_add_time <=", value, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeIn(List<Date> values) {
            addCriterion("tbcsr_add_time in", values, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeNotIn(List<Date> values) {
            addCriterion("tbcsr_add_time not in", values, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbcsr_add_time between", value1, value2, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcsr_add_time not between", value1, value2, "tbcsrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusIsNull() {
            addCriterion("tbcsr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusIsNotNull() {
            addCriterion("tbcsr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusEqualTo(Short value) {
            addCriterion("tbcsr_status =", value, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusNotEqualTo(Short value) {
            addCriterion("tbcsr_status <>", value, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusGreaterThan(Short value) {
            addCriterion("tbcsr_status >", value, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcsr_status >=", value, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusLessThan(Short value) {
            addCriterion("tbcsr_status <", value, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbcsr_status <=", value, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusIn(List<Short> values) {
            addCriterion("tbcsr_status in", values, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusNotIn(List<Short> values) {
            addCriterion("tbcsr_status not in", values, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusBetween(Short value1, Short value2) {
            addCriterion("tbcsr_status between", value1, value2, "tbcsrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcsrStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbcsr_status not between", value1, value2, "tbcsrStatus");
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