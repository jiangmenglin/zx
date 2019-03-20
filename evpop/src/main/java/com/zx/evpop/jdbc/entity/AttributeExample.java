package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class AttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeExample() {
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

        public Criteria andSaIdIsNull() {
            addCriterion("sa_id is null");
            return (Criteria) this;
        }

        public Criteria andSaIdIsNotNull() {
            addCriterion("sa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaIdEqualTo(Integer value) {
            addCriterion("sa_id =", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotEqualTo(Integer value) {
            addCriterion("sa_id <>", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThan(Integer value) {
            addCriterion("sa_id >", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_id >=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThan(Integer value) {
            addCriterion("sa_id <", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThanOrEqualTo(Integer value) {
            addCriterion("sa_id <=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdIn(List<Integer> values) {
            addCriterion("sa_id in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotIn(List<Integer> values) {
            addCriterion("sa_id not in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdBetween(Integer value1, Integer value2) {
            addCriterion("sa_id between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_id not between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaHostIsNull() {
            addCriterion("sa_host is null");
            return (Criteria) this;
        }

        public Criteria andSaHostIsNotNull() {
            addCriterion("sa_host is not null");
            return (Criteria) this;
        }

        public Criteria andSaHostEqualTo(Long value) {
            addCriterion("sa_host =", value, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostNotEqualTo(Long value) {
            addCriterion("sa_host <>", value, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostGreaterThan(Long value) {
            addCriterion("sa_host >", value, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostGreaterThanOrEqualTo(Long value) {
            addCriterion("sa_host >=", value, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostLessThan(Long value) {
            addCriterion("sa_host <", value, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostLessThanOrEqualTo(Long value) {
            addCriterion("sa_host <=", value, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostIn(List<Long> values) {
            addCriterion("sa_host in", values, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostNotIn(List<Long> values) {
            addCriterion("sa_host not in", values, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostBetween(Long value1, Long value2) {
            addCriterion("sa_host between", value1, value2, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaHostNotBetween(Long value1, Long value2) {
            addCriterion("sa_host not between", value1, value2, "saHost");
            return (Criteria) this;
        }

        public Criteria andSaTelIsNull() {
            addCriterion("sa_tel is null");
            return (Criteria) this;
        }

        public Criteria andSaTelIsNotNull() {
            addCriterion("sa_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSaTelEqualTo(String value) {
            addCriterion("sa_tel =", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelNotEqualTo(String value) {
            addCriterion("sa_tel <>", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelGreaterThan(String value) {
            addCriterion("sa_tel >", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelGreaterThanOrEqualTo(String value) {
            addCriterion("sa_tel >=", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelLessThan(String value) {
            addCriterion("sa_tel <", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelLessThanOrEqualTo(String value) {
            addCriterion("sa_tel <=", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelLike(String value) {
            addCriterion("sa_tel like", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelNotLike(String value) {
            addCriterion("sa_tel not like", value, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelIn(List<String> values) {
            addCriterion("sa_tel in", values, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelNotIn(List<String> values) {
            addCriterion("sa_tel not in", values, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelBetween(String value1, String value2) {
            addCriterion("sa_tel between", value1, value2, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaTelNotBetween(String value1, String value2) {
            addCriterion("sa_tel not between", value1, value2, "saTel");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixIsNull() {
            addCriterion("sa_sms_fix is null");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixIsNotNull() {
            addCriterion("sa_sms_fix is not null");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixEqualTo(String value) {
            addCriterion("sa_sms_fix =", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixNotEqualTo(String value) {
            addCriterion("sa_sms_fix <>", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixGreaterThan(String value) {
            addCriterion("sa_sms_fix >", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixGreaterThanOrEqualTo(String value) {
            addCriterion("sa_sms_fix >=", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixLessThan(String value) {
            addCriterion("sa_sms_fix <", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixLessThanOrEqualTo(String value) {
            addCriterion("sa_sms_fix <=", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixLike(String value) {
            addCriterion("sa_sms_fix like", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixNotLike(String value) {
            addCriterion("sa_sms_fix not like", value, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixIn(List<String> values) {
            addCriterion("sa_sms_fix in", values, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixNotIn(List<String> values) {
            addCriterion("sa_sms_fix not in", values, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixBetween(String value1, String value2) {
            addCriterion("sa_sms_fix between", value1, value2, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaSmsFixNotBetween(String value1, String value2) {
            addCriterion("sa_sms_fix not between", value1, value2, "saSmsFix");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayIsNull() {
            addCriterion("sa_refund_day is null");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayIsNotNull() {
            addCriterion("sa_refund_day is not null");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayEqualTo(Integer value) {
            addCriterion("sa_refund_day =", value, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayNotEqualTo(Integer value) {
            addCriterion("sa_refund_day <>", value, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayGreaterThan(Integer value) {
            addCriterion("sa_refund_day >", value, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_refund_day >=", value, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayLessThan(Integer value) {
            addCriterion("sa_refund_day <", value, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayLessThanOrEqualTo(Integer value) {
            addCriterion("sa_refund_day <=", value, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayIn(List<Integer> values) {
            addCriterion("sa_refund_day in", values, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayNotIn(List<Integer> values) {
            addCriterion("sa_refund_day not in", values, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayBetween(Integer value1, Integer value2) {
            addCriterion("sa_refund_day between", value1, value2, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaRefundDayNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_refund_day not between", value1, value2, "saRefundDay");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyIsNull() {
            addCriterion("sa_invoce_mny is null");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyIsNotNull() {
            addCriterion("sa_invoce_mny is not null");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyEqualTo(Integer value) {
            addCriterion("sa_invoce_mny =", value, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyNotEqualTo(Integer value) {
            addCriterion("sa_invoce_mny <>", value, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyGreaterThan(Integer value) {
            addCriterion("sa_invoce_mny >", value, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_invoce_mny >=", value, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyLessThan(Integer value) {
            addCriterion("sa_invoce_mny <", value, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyLessThanOrEqualTo(Integer value) {
            addCriterion("sa_invoce_mny <=", value, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyIn(List<Integer> values) {
            addCriterion("sa_invoce_mny in", values, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyNotIn(List<Integer> values) {
            addCriterion("sa_invoce_mny not in", values, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyBetween(Integer value1, Integer value2) {
            addCriterion("sa_invoce_mny between", value1, value2, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaInvoceMnyNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_invoce_mny not between", value1, value2, "saInvoceMny");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitIsNull() {
            addCriterion("sa_cancel_order_limit is null");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitIsNotNull() {
            addCriterion("sa_cancel_order_limit is not null");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitEqualTo(Integer value) {
            addCriterion("sa_cancel_order_limit =", value, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitNotEqualTo(Integer value) {
            addCriterion("sa_cancel_order_limit <>", value, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitGreaterThan(Integer value) {
            addCriterion("sa_cancel_order_limit >", value, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_cancel_order_limit >=", value, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitLessThan(Integer value) {
            addCriterion("sa_cancel_order_limit <", value, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitLessThanOrEqualTo(Integer value) {
            addCriterion("sa_cancel_order_limit <=", value, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitIn(List<Integer> values) {
            addCriterion("sa_cancel_order_limit in", values, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitNotIn(List<Integer> values) {
            addCriterion("sa_cancel_order_limit not in", values, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitBetween(Integer value1, Integer value2) {
            addCriterion("sa_cancel_order_limit between", value1, value2, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaCancelOrderLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_cancel_order_limit not between", value1, value2, "saCancelOrderLimit");
            return (Criteria) this;
        }

        public Criteria andSaDistanceIsNull() {
            addCriterion("sa_distance is null");
            return (Criteria) this;
        }

        public Criteria andSaDistanceIsNotNull() {
            addCriterion("sa_distance is not null");
            return (Criteria) this;
        }

        public Criteria andSaDistanceEqualTo(Integer value) {
            addCriterion("sa_distance =", value, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceNotEqualTo(Integer value) {
            addCriterion("sa_distance <>", value, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceGreaterThan(Integer value) {
            addCriterion("sa_distance >", value, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_distance >=", value, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceLessThan(Integer value) {
            addCriterion("sa_distance <", value, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("sa_distance <=", value, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceIn(List<Integer> values) {
            addCriterion("sa_distance in", values, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceNotIn(List<Integer> values) {
            addCriterion("sa_distance not in", values, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceBetween(Integer value1, Integer value2) {
            addCriterion("sa_distance between", value1, value2, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_distance not between", value1, value2, "saDistance");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipIsNull() {
            addCriterion("sa_power_tip is null");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipIsNotNull() {
            addCriterion("sa_power_tip is not null");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipEqualTo(Integer value) {
            addCriterion("sa_power_tip =", value, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipNotEqualTo(Integer value) {
            addCriterion("sa_power_tip <>", value, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipGreaterThan(Integer value) {
            addCriterion("sa_power_tip >", value, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_power_tip >=", value, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipLessThan(Integer value) {
            addCriterion("sa_power_tip <", value, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipLessThanOrEqualTo(Integer value) {
            addCriterion("sa_power_tip <=", value, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipIn(List<Integer> values) {
            addCriterion("sa_power_tip in", values, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipNotIn(List<Integer> values) {
            addCriterion("sa_power_tip not in", values, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipBetween(Integer value1, Integer value2) {
            addCriterion("sa_power_tip between", value1, value2, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerTipNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_power_tip not between", value1, value2, "saPowerTip");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineIsNull() {
            addCriterion("sa_power_offline is null");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineIsNotNull() {
            addCriterion("sa_power_offline is not null");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineEqualTo(Integer value) {
            addCriterion("sa_power_offline =", value, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineNotEqualTo(Integer value) {
            addCriterion("sa_power_offline <>", value, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineGreaterThan(Integer value) {
            addCriterion("sa_power_offline >", value, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineGreaterThanOrEqualTo(Integer value) {
            addCriterion("sa_power_offline >=", value, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineLessThan(Integer value) {
            addCriterion("sa_power_offline <", value, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineLessThanOrEqualTo(Integer value) {
            addCriterion("sa_power_offline <=", value, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineIn(List<Integer> values) {
            addCriterion("sa_power_offline in", values, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineNotIn(List<Integer> values) {
            addCriterion("sa_power_offline not in", values, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineBetween(Integer value1, Integer value2) {
            addCriterion("sa_power_offline between", value1, value2, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaPowerOfflineNotBetween(Integer value1, Integer value2) {
            addCriterion("sa_power_offline not between", value1, value2, "saPowerOffline");
            return (Criteria) this;
        }

        public Criteria andSaStatusIsNull() {
            addCriterion("sa_status is null");
            return (Criteria) this;
        }

        public Criteria andSaStatusIsNotNull() {
            addCriterion("sa_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaStatusEqualTo(Byte value) {
            addCriterion("sa_status =", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusNotEqualTo(Byte value) {
            addCriterion("sa_status <>", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusGreaterThan(Byte value) {
            addCriterion("sa_status >", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sa_status >=", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusLessThan(Byte value) {
            addCriterion("sa_status <", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sa_status <=", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusIn(List<Byte> values) {
            addCriterion("sa_status in", values, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusNotIn(List<Byte> values) {
            addCriterion("sa_status not in", values, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusBetween(Byte value1, Byte value2) {
            addCriterion("sa_status between", value1, value2, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sa_status not between", value1, value2, "saStatus");
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