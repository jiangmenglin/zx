package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RuleExample() {
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

        public Criteria andTbrIdIsNull() {
            addCriterion("tbr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbrIdIsNotNull() {
            addCriterion("tbr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbrIdEqualTo(Integer value) {
            addCriterion("tbr_id =", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotEqualTo(Integer value) {
            addCriterion("tbr_id <>", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThan(Integer value) {
            addCriterion("tbr_id >", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_id >=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThan(Integer value) {
            addCriterion("tbr_id <", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_id <=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdIn(List<Integer> values) {
            addCriterion("tbr_id in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotIn(List<Integer> values) {
            addCriterion("tbr_id not in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdBetween(Integer value1, Integer value2) {
            addCriterion("tbr_id between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_id not between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrNameIsNull() {
            addCriterion("tbr_name is null");
            return (Criteria) this;
        }

        public Criteria andTbrNameIsNotNull() {
            addCriterion("tbr_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbrNameEqualTo(String value) {
            addCriterion("tbr_name =", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotEqualTo(String value) {
            addCriterion("tbr_name <>", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameGreaterThan(String value) {
            addCriterion("tbr_name >", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_name >=", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLessThan(String value) {
            addCriterion("tbr_name <", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLessThanOrEqualTo(String value) {
            addCriterion("tbr_name <=", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLike(String value) {
            addCriterion("tbr_name like", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotLike(String value) {
            addCriterion("tbr_name not like", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameIn(List<String> values) {
            addCriterion("tbr_name in", values, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotIn(List<String> values) {
            addCriterion("tbr_name not in", values, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameBetween(String value1, String value2) {
            addCriterion("tbr_name between", value1, value2, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotBetween(String value1, String value2) {
            addCriterion("tbr_name not between", value1, value2, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrEventIsNull() {
            addCriterion("tbr_event is null");
            return (Criteria) this;
        }

        public Criteria andTbrEventIsNotNull() {
            addCriterion("tbr_event is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEventEqualTo(Integer value) {
            addCriterion("tbr_event =", value, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventNotEqualTo(Integer value) {
            addCriterion("tbr_event <>", value, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventGreaterThan(Integer value) {
            addCriterion("tbr_event >", value, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_event >=", value, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventLessThan(Integer value) {
            addCriterion("tbr_event <", value, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_event <=", value, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventIn(List<Integer> values) {
            addCriterion("tbr_event in", values, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventNotIn(List<Integer> values) {
            addCriterion("tbr_event not in", values, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventBetween(Integer value1, Integer value2) {
            addCriterion("tbr_event between", value1, value2, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrEventNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_event not between", value1, value2, "tbrEvent");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatIsNull() {
            addCriterion("tbr_repeat is null");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatIsNotNull() {
            addCriterion("tbr_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatEqualTo(Integer value) {
            addCriterion("tbr_repeat =", value, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatNotEqualTo(Integer value) {
            addCriterion("tbr_repeat <>", value, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatGreaterThan(Integer value) {
            addCriterion("tbr_repeat >", value, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_repeat >=", value, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatLessThan(Integer value) {
            addCriterion("tbr_repeat <", value, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_repeat <=", value, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatIn(List<Integer> values) {
            addCriterion("tbr_repeat in", values, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatNotIn(List<Integer> values) {
            addCriterion("tbr_repeat not in", values, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatBetween(Integer value1, Integer value2) {
            addCriterion("tbr_repeat between", value1, value2, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrRepeatNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_repeat not between", value1, value2, "tbrRepeat");
            return (Criteria) this;
        }

        public Criteria andTbrInfoIsNull() {
            addCriterion("tbr_info is null");
            return (Criteria) this;
        }

        public Criteria andTbrInfoIsNotNull() {
            addCriterion("tbr_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbrInfoEqualTo(Long value) {
            addCriterion("tbr_info =", value, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoNotEqualTo(Long value) {
            addCriterion("tbr_info <>", value, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoGreaterThan(Long value) {
            addCriterion("tbr_info >", value, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_info >=", value, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoLessThan(Long value) {
            addCriterion("tbr_info <", value, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoLessThanOrEqualTo(Long value) {
            addCriterion("tbr_info <=", value, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoIn(List<Long> values) {
            addCriterion("tbr_info in", values, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoNotIn(List<Long> values) {
            addCriterion("tbr_info not in", values, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoBetween(Long value1, Long value2) {
            addCriterion("tbr_info between", value1, value2, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrInfoNotBetween(Long value1, Long value2) {
            addCriterion("tbr_info not between", value1, value2, "tbrInfo");
            return (Criteria) this;
        }

        public Criteria andTbrAmountIsNull() {
            addCriterion("tbr_amount is null");
            return (Criteria) this;
        }

        public Criteria andTbrAmountIsNotNull() {
            addCriterion("tbr_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAmountEqualTo(Integer value) {
            addCriterion("tbr_amount =", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountNotEqualTo(Integer value) {
            addCriterion("tbr_amount <>", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountGreaterThan(Integer value) {
            addCriterion("tbr_amount >", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_amount >=", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountLessThan(Integer value) {
            addCriterion("tbr_amount <", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_amount <=", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountIn(List<Integer> values) {
            addCriterion("tbr_amount in", values, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountNotIn(List<Integer> values) {
            addCriterion("tbr_amount not in", values, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountBetween(Integer value1, Integer value2) {
            addCriterion("tbr_amount between", value1, value2, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_amount not between", value1, value2, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrProfileIsNull() {
            addCriterion("tbr_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbrProfileIsNotNull() {
            addCriterion("tbr_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbrProfileEqualTo(String value) {
            addCriterion("tbr_profile =", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileNotEqualTo(String value) {
            addCriterion("tbr_profile <>", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileGreaterThan(String value) {
            addCriterion("tbr_profile >", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_profile >=", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileLessThan(String value) {
            addCriterion("tbr_profile <", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileLessThanOrEqualTo(String value) {
            addCriterion("tbr_profile <=", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileLike(String value) {
            addCriterion("tbr_profile like", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileNotLike(String value) {
            addCriterion("tbr_profile not like", value, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileIn(List<String> values) {
            addCriterion("tbr_profile in", values, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileNotIn(List<String> values) {
            addCriterion("tbr_profile not in", values, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileBetween(String value1, String value2) {
            addCriterion("tbr_profile between", value1, value2, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrProfileNotBetween(String value1, String value2) {
            addCriterion("tbr_profile not between", value1, value2, "tbrProfile");
            return (Criteria) this;
        }

        public Criteria andTbrConditionIsNull() {
            addCriterion("tbr_condition is null");
            return (Criteria) this;
        }

        public Criteria andTbrConditionIsNotNull() {
            addCriterion("tbr_condition is not null");
            return (Criteria) this;
        }

        public Criteria andTbrConditionEqualTo(String value) {
            addCriterion("tbr_condition =", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionNotEqualTo(String value) {
            addCriterion("tbr_condition <>", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionGreaterThan(String value) {
            addCriterion("tbr_condition >", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_condition >=", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionLessThan(String value) {
            addCriterion("tbr_condition <", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionLessThanOrEqualTo(String value) {
            addCriterion("tbr_condition <=", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionLike(String value) {
            addCriterion("tbr_condition like", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionNotLike(String value) {
            addCriterion("tbr_condition not like", value, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionIn(List<String> values) {
            addCriterion("tbr_condition in", values, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionNotIn(List<String> values) {
            addCriterion("tbr_condition not in", values, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionBetween(String value1, String value2) {
            addCriterion("tbr_condition between", value1, value2, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrConditionNotBetween(String value1, String value2) {
            addCriterion("tbr_condition not between", value1, value2, "tbrCondition");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralIsNull() {
            addCriterion("tbr_integral is null");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralIsNotNull() {
            addCriterion("tbr_integral is not null");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralEqualTo(String value) {
            addCriterion("tbr_integral =", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralNotEqualTo(String value) {
            addCriterion("tbr_integral <>", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralGreaterThan(String value) {
            addCriterion("tbr_integral >", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_integral >=", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralLessThan(String value) {
            addCriterion("tbr_integral <", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralLessThanOrEqualTo(String value) {
            addCriterion("tbr_integral <=", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralLike(String value) {
            addCriterion("tbr_integral like", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralNotLike(String value) {
            addCriterion("tbr_integral not like", value, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralIn(List<String> values) {
            addCriterion("tbr_integral in", values, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralNotIn(List<String> values) {
            addCriterion("tbr_integral not in", values, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralBetween(String value1, String value2) {
            addCriterion("tbr_integral between", value1, value2, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrIntegralNotBetween(String value1, String value2) {
            addCriterion("tbr_integral not between", value1, value2, "tbrIntegral");
            return (Criteria) this;
        }

        public Criteria andTbrCouponIsNull() {
            addCriterion("tbr_coupon is null");
            return (Criteria) this;
        }

        public Criteria andTbrCouponIsNotNull() {
            addCriterion("tbr_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCouponEqualTo(String value) {
            addCriterion("tbr_coupon =", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponNotEqualTo(String value) {
            addCriterion("tbr_coupon <>", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponGreaterThan(String value) {
            addCriterion("tbr_coupon >", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_coupon >=", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponLessThan(String value) {
            addCriterion("tbr_coupon <", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponLessThanOrEqualTo(String value) {
            addCriterion("tbr_coupon <=", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponLike(String value) {
            addCriterion("tbr_coupon like", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponNotLike(String value) {
            addCriterion("tbr_coupon not like", value, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponIn(List<String> values) {
            addCriterion("tbr_coupon in", values, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponNotIn(List<String> values) {
            addCriterion("tbr_coupon not in", values, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponBetween(String value1, String value2) {
            addCriterion("tbr_coupon between", value1, value2, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrCouponNotBetween(String value1, String value2) {
            addCriterion("tbr_coupon not between", value1, value2, "tbrCoupon");
            return (Criteria) this;
        }

        public Criteria andTbrDerateIsNull() {
            addCriterion("tbr_derate is null");
            return (Criteria) this;
        }

        public Criteria andTbrDerateIsNotNull() {
            addCriterion("tbr_derate is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDerateEqualTo(String value) {
            addCriterion("tbr_derate =", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateNotEqualTo(String value) {
            addCriterion("tbr_derate <>", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateGreaterThan(String value) {
            addCriterion("tbr_derate >", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_derate >=", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateLessThan(String value) {
            addCriterion("tbr_derate <", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateLessThanOrEqualTo(String value) {
            addCriterion("tbr_derate <=", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateLike(String value) {
            addCriterion("tbr_derate like", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateNotLike(String value) {
            addCriterion("tbr_derate not like", value, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateIn(List<String> values) {
            addCriterion("tbr_derate in", values, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateNotIn(List<String> values) {
            addCriterion("tbr_derate not in", values, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateBetween(String value1, String value2) {
            addCriterion("tbr_derate between", value1, value2, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrDerateNotBetween(String value1, String value2) {
            addCriterion("tbr_derate not between", value1, value2, "tbrDerate");
            return (Criteria) this;
        }

        public Criteria andTbrStartIsNull() {
            addCriterion("tbr_start is null");
            return (Criteria) this;
        }

        public Criteria andTbrStartIsNotNull() {
            addCriterion("tbr_start is not null");
            return (Criteria) this;
        }

        public Criteria andTbrStartEqualTo(Date value) {
            addCriterion("tbr_start =", value, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartNotEqualTo(Date value) {
            addCriterion("tbr_start <>", value, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartGreaterThan(Date value) {
            addCriterion("tbr_start >", value, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_start >=", value, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartLessThan(Date value) {
            addCriterion("tbr_start <", value, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartLessThanOrEqualTo(Date value) {
            addCriterion("tbr_start <=", value, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartIn(List<Date> values) {
            addCriterion("tbr_start in", values, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartNotIn(List<Date> values) {
            addCriterion("tbr_start not in", values, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartBetween(Date value1, Date value2) {
            addCriterion("tbr_start between", value1, value2, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrStartNotBetween(Date value1, Date value2) {
            addCriterion("tbr_start not between", value1, value2, "tbrStart");
            return (Criteria) this;
        }

        public Criteria andTbrEndIsNull() {
            addCriterion("tbr_end is null");
            return (Criteria) this;
        }

        public Criteria andTbrEndIsNotNull() {
            addCriterion("tbr_end is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEndEqualTo(Date value) {
            addCriterion("tbr_end =", value, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndNotEqualTo(Date value) {
            addCriterion("tbr_end <>", value, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndGreaterThan(Date value) {
            addCriterion("tbr_end >", value, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_end >=", value, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndLessThan(Date value) {
            addCriterion("tbr_end <", value, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndLessThanOrEqualTo(Date value) {
            addCriterion("tbr_end <=", value, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndIn(List<Date> values) {
            addCriterion("tbr_end in", values, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndNotIn(List<Date> values) {
            addCriterion("tbr_end not in", values, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndBetween(Date value1, Date value2) {
            addCriterion("tbr_end between", value1, value2, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrEndNotBetween(Date value1, Date value2) {
            addCriterion("tbr_end not between", value1, value2, "tbrEnd");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNull() {
            addCriterion("tbr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNotNull() {
            addCriterion("tbr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeEqualTo(Date value) {
            addCriterion("tbr_update_time =", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbr_update_time <>", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThan(Date value) {
            addCriterion("tbr_update_time >", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time >=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThan(Date value) {
            addCriterion("tbr_update_time <", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time <=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIn(List<Date> values) {
            addCriterion("tbr_update_time in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbr_update_time not in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time not between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNull() {
            addCriterion("tbr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNotNull() {
            addCriterion("tbr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeEqualTo(Date value) {
            addCriterion("tbr_add_time =", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotEqualTo(Date value) {
            addCriterion("tbr_add_time <>", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThan(Date value) {
            addCriterion("tbr_add_time >", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time >=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThan(Date value) {
            addCriterion("tbr_add_time <", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time <=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIn(List<Date> values) {
            addCriterion("tbr_add_time in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotIn(List<Date> values) {
            addCriterion("tbr_add_time not in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time not between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNull() {
            addCriterion("tbr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNotNull() {
            addCriterion("tbr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusEqualTo(Byte value) {
            addCriterion("tbr_status =", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotEqualTo(Byte value) {
            addCriterion("tbr_status <>", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThan(Byte value) {
            addCriterion("tbr_status >", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_status >=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThan(Byte value) {
            addCriterion("tbr_status <", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_status <=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIn(List<Byte> values) {
            addCriterion("tbr_status in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotIn(List<Byte> values) {
            addCriterion("tbr_status not in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbr_status between", value1, value2, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_status not between", value1, value2, "tbrStatus");
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