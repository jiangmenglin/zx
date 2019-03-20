package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitBillExample() {
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

        public Criteria andTbubIdIsNull() {
            addCriterion("tbub_id is null");
            return (Criteria) this;
        }

        public Criteria andTbubIdIsNotNull() {
            addCriterion("tbub_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbubIdEqualTo(Long value) {
            addCriterion("tbub_id =", value, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdNotEqualTo(Long value) {
            addCriterion("tbub_id <>", value, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdGreaterThan(Long value) {
            addCriterion("tbub_id >", value, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbub_id >=", value, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdLessThan(Long value) {
            addCriterion("tbub_id <", value, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdLessThanOrEqualTo(Long value) {
            addCriterion("tbub_id <=", value, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdIn(List<Long> values) {
            addCriterion("tbub_id in", values, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdNotIn(List<Long> values) {
            addCriterion("tbub_id not in", values, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdBetween(Long value1, Long value2) {
            addCriterion("tbub_id between", value1, value2, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubIdNotBetween(Long value1, Long value2) {
            addCriterion("tbub_id not between", value1, value2, "tbubId");
            return (Criteria) this;
        }

        public Criteria andTbubHostIsNull() {
            addCriterion("tbub_host is null");
            return (Criteria) this;
        }

        public Criteria andTbubHostIsNotNull() {
            addCriterion("tbub_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbubHostEqualTo(Long value) {
            addCriterion("tbub_host =", value, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostNotEqualTo(Long value) {
            addCriterion("tbub_host <>", value, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostGreaterThan(Long value) {
            addCriterion("tbub_host >", value, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbub_host >=", value, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostLessThan(Long value) {
            addCriterion("tbub_host <", value, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostLessThanOrEqualTo(Long value) {
            addCriterion("tbub_host <=", value, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostIn(List<Long> values) {
            addCriterion("tbub_host in", values, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostNotIn(List<Long> values) {
            addCriterion("tbub_host not in", values, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostBetween(Long value1, Long value2) {
            addCriterion("tbub_host between", value1, value2, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubHostNotBetween(Long value1, Long value2) {
            addCriterion("tbub_host not between", value1, value2, "tbubHost");
            return (Criteria) this;
        }

        public Criteria andTbubMonthIsNull() {
            addCriterion("tbub_month is null");
            return (Criteria) this;
        }

        public Criteria andTbubMonthIsNotNull() {
            addCriterion("tbub_month is not null");
            return (Criteria) this;
        }

        public Criteria andTbubMonthEqualTo(String value) {
            addCriterion("tbub_month =", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthNotEqualTo(String value) {
            addCriterion("tbub_month <>", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthGreaterThan(String value) {
            addCriterion("tbub_month >", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthGreaterThanOrEqualTo(String value) {
            addCriterion("tbub_month >=", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthLessThan(String value) {
            addCriterion("tbub_month <", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthLessThanOrEqualTo(String value) {
            addCriterion("tbub_month <=", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthLike(String value) {
            addCriterion("tbub_month like", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthNotLike(String value) {
            addCriterion("tbub_month not like", value, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthIn(List<String> values) {
            addCriterion("tbub_month in", values, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthNotIn(List<String> values) {
            addCriterion("tbub_month not in", values, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthBetween(String value1, String value2) {
            addCriterion("tbub_month between", value1, value2, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubMonthNotBetween(String value1, String value2) {
            addCriterion("tbub_month not between", value1, value2, "tbubMonth");
            return (Criteria) this;
        }

        public Criteria andTbubUnitIsNull() {
            addCriterion("tbub_unit is null");
            return (Criteria) this;
        }

        public Criteria andTbubUnitIsNotNull() {
            addCriterion("tbub_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTbubUnitEqualTo(Long value) {
            addCriterion("tbub_unit =", value, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitNotEqualTo(Long value) {
            addCriterion("tbub_unit <>", value, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitGreaterThan(Long value) {
            addCriterion("tbub_unit >", value, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitGreaterThanOrEqualTo(Long value) {
            addCriterion("tbub_unit >=", value, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitLessThan(Long value) {
            addCriterion("tbub_unit <", value, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitLessThanOrEqualTo(Long value) {
            addCriterion("tbub_unit <=", value, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitIn(List<Long> values) {
            addCriterion("tbub_unit in", values, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitNotIn(List<Long> values) {
            addCriterion("tbub_unit not in", values, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitBetween(Long value1, Long value2) {
            addCriterion("tbub_unit between", value1, value2, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubUnitNotBetween(Long value1, Long value2) {
            addCriterion("tbub_unit not between", value1, value2, "tbubUnit");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSIsNull() {
            addCriterion("tbub_order_s is null");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSIsNotNull() {
            addCriterion("tbub_order_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSEqualTo(Integer value) {
            addCriterion("tbub_order_s =", value, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSNotEqualTo(Integer value) {
            addCriterion("tbub_order_s <>", value, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSGreaterThan(Integer value) {
            addCriterion("tbub_order_s >", value, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbub_order_s >=", value, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSLessThan(Integer value) {
            addCriterion("tbub_order_s <", value, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSLessThanOrEqualTo(Integer value) {
            addCriterion("tbub_order_s <=", value, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSIn(List<Integer> values) {
            addCriterion("tbub_order_s in", values, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSNotIn(List<Integer> values) {
            addCriterion("tbub_order_s not in", values, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSBetween(Integer value1, Integer value2) {
            addCriterion("tbub_order_s between", value1, value2, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubOrderSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbub_order_s not between", value1, value2, "tbubOrderS");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayIsNull() {
            addCriterion("tbub_need_pay is null");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayIsNotNull() {
            addCriterion("tbub_need_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayEqualTo(Double value) {
            addCriterion("tbub_need_pay =", value, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayNotEqualTo(Double value) {
            addCriterion("tbub_need_pay <>", value, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayGreaterThan(Double value) {
            addCriterion("tbub_need_pay >", value, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayGreaterThanOrEqualTo(Double value) {
            addCriterion("tbub_need_pay >=", value, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayLessThan(Double value) {
            addCriterion("tbub_need_pay <", value, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayLessThanOrEqualTo(Double value) {
            addCriterion("tbub_need_pay <=", value, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayIn(List<Double> values) {
            addCriterion("tbub_need_pay in", values, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayNotIn(List<Double> values) {
            addCriterion("tbub_need_pay not in", values, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayBetween(Double value1, Double value2) {
            addCriterion("tbub_need_pay between", value1, value2, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubNeedPayNotBetween(Double value1, Double value2) {
            addCriterion("tbub_need_pay not between", value1, value2, "tbubNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayIsNull() {
            addCriterion("tbub_real_pay is null");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayIsNotNull() {
            addCriterion("tbub_real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayEqualTo(Double value) {
            addCriterion("tbub_real_pay =", value, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayNotEqualTo(Double value) {
            addCriterion("tbub_real_pay <>", value, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayGreaterThan(Double value) {
            addCriterion("tbub_real_pay >", value, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayGreaterThanOrEqualTo(Double value) {
            addCriterion("tbub_real_pay >=", value, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayLessThan(Double value) {
            addCriterion("tbub_real_pay <", value, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayLessThanOrEqualTo(Double value) {
            addCriterion("tbub_real_pay <=", value, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayIn(List<Double> values) {
            addCriterion("tbub_real_pay in", values, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayNotIn(List<Double> values) {
            addCriterion("tbub_real_pay not in", values, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayBetween(Double value1, Double value2) {
            addCriterion("tbub_real_pay between", value1, value2, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubRealPayNotBetween(Double value1, Double value2) {
            addCriterion("tbub_real_pay not between", value1, value2, "tbubRealPay");
            return (Criteria) this;
        }

        public Criteria andTbubEditorIsNull() {
            addCriterion("tbub_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbubEditorIsNotNull() {
            addCriterion("tbub_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbubEditorEqualTo(Long value) {
            addCriterion("tbub_editor =", value, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorNotEqualTo(Long value) {
            addCriterion("tbub_editor <>", value, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorGreaterThan(Long value) {
            addCriterion("tbub_editor >", value, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("tbub_editor >=", value, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorLessThan(Long value) {
            addCriterion("tbub_editor <", value, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorLessThanOrEqualTo(Long value) {
            addCriterion("tbub_editor <=", value, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorIn(List<Long> values) {
            addCriterion("tbub_editor in", values, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorNotIn(List<Long> values) {
            addCriterion("tbub_editor not in", values, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorBetween(Long value1, Long value2) {
            addCriterion("tbub_editor between", value1, value2, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubEditorNotBetween(Long value1, Long value2) {
            addCriterion("tbub_editor not between", value1, value2, "tbubEditor");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeIsNull() {
            addCriterion("tbub_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeIsNotNull() {
            addCriterion("tbub_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeEqualTo(Date value) {
            addCriterion("tbub_update_time =", value, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbub_update_time <>", value, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeGreaterThan(Date value) {
            addCriterion("tbub_update_time >", value, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbub_update_time >=", value, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeLessThan(Date value) {
            addCriterion("tbub_update_time <", value, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbub_update_time <=", value, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeIn(List<Date> values) {
            addCriterion("tbub_update_time in", values, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbub_update_time not in", values, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbub_update_time between", value1, value2, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbub_update_time not between", value1, value2, "tbubUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeIsNull() {
            addCriterion("tbub_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeIsNotNull() {
            addCriterion("tbub_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeEqualTo(Date value) {
            addCriterion("tbub_add_time =", value, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeNotEqualTo(Date value) {
            addCriterion("tbub_add_time <>", value, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeGreaterThan(Date value) {
            addCriterion("tbub_add_time >", value, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbub_add_time >=", value, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeLessThan(Date value) {
            addCriterion("tbub_add_time <", value, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbub_add_time <=", value, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeIn(List<Date> values) {
            addCriterion("tbub_add_time in", values, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeNotIn(List<Date> values) {
            addCriterion("tbub_add_time not in", values, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbub_add_time between", value1, value2, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbub_add_time not between", value1, value2, "tbubAddTime");
            return (Criteria) this;
        }

        public Criteria andTbubStatusIsNull() {
            addCriterion("tbub_status is null");
            return (Criteria) this;
        }

        public Criteria andTbubStatusIsNotNull() {
            addCriterion("tbub_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbubStatusEqualTo(Short value) {
            addCriterion("tbub_status =", value, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusNotEqualTo(Short value) {
            addCriterion("tbub_status <>", value, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusGreaterThan(Short value) {
            addCriterion("tbub_status >", value, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbub_status >=", value, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusLessThan(Short value) {
            addCriterion("tbub_status <", value, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbub_status <=", value, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusIn(List<Short> values) {
            addCriterion("tbub_status in", values, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusNotIn(List<Short> values) {
            addCriterion("tbub_status not in", values, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusBetween(Short value1, Short value2) {
            addCriterion("tbub_status between", value1, value2, "tbubStatus");
            return (Criteria) this;
        }

        public Criteria andTbubStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbub_status not between", value1, value2, "tbubStatus");
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