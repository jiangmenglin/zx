package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViolatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViolatExample() {
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

        public Criteria andTbvIdEqualTo(Integer value) {
            addCriterion("tbv_id =", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdNotEqualTo(Integer value) {
            addCriterion("tbv_id <>", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdGreaterThan(Integer value) {
            addCriterion("tbv_id >", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_id >=", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdLessThan(Integer value) {
            addCriterion("tbv_id <", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_id <=", value, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdIn(List<Integer> values) {
            addCriterion("tbv_id in", values, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdNotIn(List<Integer> values) {
            addCriterion("tbv_id not in", values, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdBetween(Integer value1, Integer value2) {
            addCriterion("tbv_id between", value1, value2, "tbvId");
            return (Criteria) this;
        }

        public Criteria andTbvIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTbvHostEqualTo(Short value) {
            addCriterion("tbv_host =", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostNotEqualTo(Short value) {
            addCriterion("tbv_host <>", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostGreaterThan(Short value) {
            addCriterion("tbv_host >", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbv_host >=", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostLessThan(Short value) {
            addCriterion("tbv_host <", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostLessThanOrEqualTo(Short value) {
            addCriterion("tbv_host <=", value, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostIn(List<Short> values) {
            addCriterion("tbv_host in", values, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostNotIn(List<Short> values) {
            addCriterion("tbv_host not in", values, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostBetween(Short value1, Short value2) {
            addCriterion("tbv_host between", value1, value2, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvHostNotBetween(Short value1, Short value2) {
            addCriterion("tbv_host not between", value1, value2, "tbvHost");
            return (Criteria) this;
        }

        public Criteria andTbvOrderIsNull() {
            addCriterion("tbv_order is null");
            return (Criteria) this;
        }

        public Criteria andTbvOrderIsNotNull() {
            addCriterion("tbv_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbvOrderEqualTo(Long value) {
            addCriterion("tbv_order =", value, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderNotEqualTo(Long value) {
            addCriterion("tbv_order <>", value, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderGreaterThan(Long value) {
            addCriterion("tbv_order >", value, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbv_order >=", value, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderLessThan(Long value) {
            addCriterion("tbv_order <", value, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbv_order <=", value, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderIn(List<Long> values) {
            addCriterion("tbv_order in", values, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderNotIn(List<Long> values) {
            addCriterion("tbv_order not in", values, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderBetween(Long value1, Long value2) {
            addCriterion("tbv_order between", value1, value2, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbv_order not between", value1, value2, "tbvOrder");
            return (Criteria) this;
        }

        public Criteria andTbvMemberIsNull() {
            addCriterion("tbv_member is null");
            return (Criteria) this;
        }

        public Criteria andTbvMemberIsNotNull() {
            addCriterion("tbv_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbvMemberEqualTo(Integer value) {
            addCriterion("tbv_member =", value, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberNotEqualTo(Integer value) {
            addCriterion("tbv_member <>", value, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberGreaterThan(Integer value) {
            addCriterion("tbv_member >", value, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_member >=", value, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberLessThan(Integer value) {
            addCriterion("tbv_member <", value, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_member <=", value, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberIn(List<Integer> values) {
            addCriterion("tbv_member in", values, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberNotIn(List<Integer> values) {
            addCriterion("tbv_member not in", values, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbv_member between", value1, value2, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbv_member not between", value1, value2, "tbvMember");
            return (Criteria) this;
        }

        public Criteria andTbvCarIsNull() {
            addCriterion("tbv_car is null");
            return (Criteria) this;
        }

        public Criteria andTbvCarIsNotNull() {
            addCriterion("tbv_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbvCarEqualTo(Integer value) {
            addCriterion("tbv_car =", value, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarNotEqualTo(Integer value) {
            addCriterion("tbv_car <>", value, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarGreaterThan(Integer value) {
            addCriterion("tbv_car >", value, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_car >=", value, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarLessThan(Integer value) {
            addCriterion("tbv_car <", value, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_car <=", value, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarIn(List<Integer> values) {
            addCriterion("tbv_car in", values, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarNotIn(List<Integer> values) {
            addCriterion("tbv_car not in", values, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarBetween(Integer value1, Integer value2) {
            addCriterion("tbv_car between", value1, value2, "tbvCar");
            return (Criteria) this;
        }

        public Criteria andTbvCarNotBetween(Integer value1, Integer value2) {
            addCriterion("tbv_car not between", value1, value2, "tbvCar");
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

        public Criteria andTbvScoreIsNull() {
            addCriterion("tbv_score is null");
            return (Criteria) this;
        }

        public Criteria andTbvScoreIsNotNull() {
            addCriterion("tbv_score is not null");
            return (Criteria) this;
        }

        public Criteria andTbvScoreEqualTo(Integer value) {
            addCriterion("tbv_score =", value, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreNotEqualTo(Integer value) {
            addCriterion("tbv_score <>", value, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreGreaterThan(Integer value) {
            addCriterion("tbv_score >", value, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_score >=", value, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreLessThan(Integer value) {
            addCriterion("tbv_score <", value, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_score <=", value, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreIn(List<Integer> values) {
            addCriterion("tbv_score in", values, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreNotIn(List<Integer> values) {
            addCriterion("tbv_score not in", values, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreBetween(Integer value1, Integer value2) {
            addCriterion("tbv_score between", value1, value2, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("tbv_score not between", value1, value2, "tbvScore");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeIsNull() {
            addCriterion("tbv_happen_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeIsNotNull() {
            addCriterion("tbv_happen_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeEqualTo(Date value) {
            addCriterion("tbv_happen_time =", value, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeNotEqualTo(Date value) {
            addCriterion("tbv_happen_time <>", value, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeGreaterThan(Date value) {
            addCriterion("tbv_happen_time >", value, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbv_happen_time >=", value, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeLessThan(Date value) {
            addCriterion("tbv_happen_time <", value, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbv_happen_time <=", value, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeIn(List<Date> values) {
            addCriterion("tbv_happen_time in", values, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeNotIn(List<Date> values) {
            addCriterion("tbv_happen_time not in", values, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeBetween(Date value1, Date value2) {
            addCriterion("tbv_happen_time between", value1, value2, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvHappenTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbv_happen_time not between", value1, value2, "tbvHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeIsNull() {
            addCriterion("tbv_deal_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeIsNotNull() {
            addCriterion("tbv_deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeEqualTo(Date value) {
            addCriterion("tbv_deal_time =", value, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeNotEqualTo(Date value) {
            addCriterion("tbv_deal_time <>", value, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeGreaterThan(Date value) {
            addCriterion("tbv_deal_time >", value, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbv_deal_time >=", value, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeLessThan(Date value) {
            addCriterion("tbv_deal_time <", value, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbv_deal_time <=", value, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeIn(List<Date> values) {
            addCriterion("tbv_deal_time in", values, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeNotIn(List<Date> values) {
            addCriterion("tbv_deal_time not in", values, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeBetween(Date value1, Date value2) {
            addCriterion("tbv_deal_time between", value1, value2, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbv_deal_time not between", value1, value2, "tbvDealTime");
            return (Criteria) this;
        }

        public Criteria andTbvAddressIsNull() {
            addCriterion("tbv_address is null");
            return (Criteria) this;
        }

        public Criteria andTbvAddressIsNotNull() {
            addCriterion("tbv_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbvAddressEqualTo(String value) {
            addCriterion("tbv_address =", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressNotEqualTo(String value) {
            addCriterion("tbv_address <>", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressGreaterThan(String value) {
            addCriterion("tbv_address >", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_address >=", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressLessThan(String value) {
            addCriterion("tbv_address <", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressLessThanOrEqualTo(String value) {
            addCriterion("tbv_address <=", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressLike(String value) {
            addCriterion("tbv_address like", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressNotLike(String value) {
            addCriterion("tbv_address not like", value, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressIn(List<String> values) {
            addCriterion("tbv_address in", values, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressNotIn(List<String> values) {
            addCriterion("tbv_address not in", values, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressBetween(String value1, String value2) {
            addCriterion("tbv_address between", value1, value2, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvAddressNotBetween(String value1, String value2) {
            addCriterion("tbv_address not between", value1, value2, "tbvAddress");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptIsNull() {
            addCriterion("tbv_decipt is null");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptIsNotNull() {
            addCriterion("tbv_decipt is not null");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptEqualTo(String value) {
            addCriterion("tbv_decipt =", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptNotEqualTo(String value) {
            addCriterion("tbv_decipt <>", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptGreaterThan(String value) {
            addCriterion("tbv_decipt >", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_decipt >=", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptLessThan(String value) {
            addCriterion("tbv_decipt <", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptLessThanOrEqualTo(String value) {
            addCriterion("tbv_decipt <=", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptLike(String value) {
            addCriterion("tbv_decipt like", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptNotLike(String value) {
            addCriterion("tbv_decipt not like", value, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptIn(List<String> values) {
            addCriterion("tbv_decipt in", values, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptNotIn(List<String> values) {
            addCriterion("tbv_decipt not in", values, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptBetween(String value1, String value2) {
            addCriterion("tbv_decipt between", value1, value2, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvDeciptNotBetween(String value1, String value2) {
            addCriterion("tbv_decipt not between", value1, value2, "tbvDecipt");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeIsNull() {
            addCriterion("tbv_notice is null");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeIsNotNull() {
            addCriterion("tbv_notice is not null");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeEqualTo(Byte value) {
            addCriterion("tbv_notice =", value, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeNotEqualTo(Byte value) {
            addCriterion("tbv_notice <>", value, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeGreaterThan(Byte value) {
            addCriterion("tbv_notice >", value, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbv_notice >=", value, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeLessThan(Byte value) {
            addCriterion("tbv_notice <", value, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeLessThanOrEqualTo(Byte value) {
            addCriterion("tbv_notice <=", value, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeIn(List<Byte> values) {
            addCriterion("tbv_notice in", values, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeNotIn(List<Byte> values) {
            addCriterion("tbv_notice not in", values, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeBetween(Byte value1, Byte value2) {
            addCriterion("tbv_notice between", value1, value2, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvNoticeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbv_notice not between", value1, value2, "tbvNotice");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeIsNull() {
            addCriterion("tbv_cutoff_time is null");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeIsNotNull() {
            addCriterion("tbv_cutoff_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeEqualTo(Date value) {
            addCriterion("tbv_cutoff_time =", value, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeNotEqualTo(Date value) {
            addCriterion("tbv_cutoff_time <>", value, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeGreaterThan(Date value) {
            addCriterion("tbv_cutoff_time >", value, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbv_cutoff_time >=", value, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeLessThan(Date value) {
            addCriterion("tbv_cutoff_time <", value, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbv_cutoff_time <=", value, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeIn(List<Date> values) {
            addCriterion("tbv_cutoff_time in", values, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeNotIn(List<Date> values) {
            addCriterion("tbv_cutoff_time not in", values, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeBetween(Date value1, Date value2) {
            addCriterion("tbv_cutoff_time between", value1, value2, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvCutoffTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbv_cutoff_time not between", value1, value2, "tbvCutoffTime");
            return (Criteria) this;
        }

        public Criteria andTbvTypeIsNull() {
            addCriterion("tbv_type is null");
            return (Criteria) this;
        }

        public Criteria andTbvTypeIsNotNull() {
            addCriterion("tbv_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbvTypeEqualTo(Byte value) {
            addCriterion("tbv_type =", value, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeNotEqualTo(Byte value) {
            addCriterion("tbv_type <>", value, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeGreaterThan(Byte value) {
            addCriterion("tbv_type >", value, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbv_type >=", value, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeLessThan(Byte value) {
            addCriterion("tbv_type <", value, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbv_type <=", value, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeIn(List<Byte> values) {
            addCriterion("tbv_type in", values, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeNotIn(List<Byte> values) {
            addCriterion("tbv_type not in", values, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbv_type between", value1, value2, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbv_type not between", value1, value2, "tbvType");
            return (Criteria) this;
        }

        public Criteria andTbvPriceIsNull() {
            addCriterion("tbv_price is null");
            return (Criteria) this;
        }

        public Criteria andTbvPriceIsNotNull() {
            addCriterion("tbv_price is not null");
            return (Criteria) this;
        }

        public Criteria andTbvPriceEqualTo(Double value) {
            addCriterion("tbv_price =", value, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceNotEqualTo(Double value) {
            addCriterion("tbv_price <>", value, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceGreaterThan(Double value) {
            addCriterion("tbv_price >", value, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tbv_price >=", value, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceLessThan(Double value) {
            addCriterion("tbv_price <", value, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceLessThanOrEqualTo(Double value) {
            addCriterion("tbv_price <=", value, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceIn(List<Double> values) {
            addCriterion("tbv_price in", values, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceNotIn(List<Double> values) {
            addCriterion("tbv_price not in", values, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceBetween(Double value1, Double value2) {
            addCriterion("tbv_price between", value1, value2, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvPriceNotBetween(Double value1, Double value2) {
            addCriterion("tbv_price not between", value1, value2, "tbvPrice");
            return (Criteria) this;
        }

        public Criteria andTbvBranchIsNull() {
            addCriterion("tbv_branch is null");
            return (Criteria) this;
        }

        public Criteria andTbvBranchIsNotNull() {
            addCriterion("tbv_branch is not null");
            return (Criteria) this;
        }

        public Criteria andTbvBranchEqualTo(Byte value) {
            addCriterion("tbv_branch =", value, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchNotEqualTo(Byte value) {
            addCriterion("tbv_branch <>", value, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchGreaterThan(Byte value) {
            addCriterion("tbv_branch >", value, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbv_branch >=", value, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchLessThan(Byte value) {
            addCriterion("tbv_branch <", value, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchLessThanOrEqualTo(Byte value) {
            addCriterion("tbv_branch <=", value, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchIn(List<Byte> values) {
            addCriterion("tbv_branch in", values, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchNotIn(List<Byte> values) {
            addCriterion("tbv_branch not in", values, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchBetween(Byte value1, Byte value2) {
            addCriterion("tbv_branch between", value1, value2, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvBranchNotBetween(Byte value1, Byte value2) {
            addCriterion("tbv_branch not between", value1, value2, "tbvBranch");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeIsNull() {
            addCriterion("tbv_post_type is null");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeIsNotNull() {
            addCriterion("tbv_post_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeEqualTo(Byte value) {
            addCriterion("tbv_post_type =", value, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeNotEqualTo(Byte value) {
            addCriterion("tbv_post_type <>", value, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeGreaterThan(Byte value) {
            addCriterion("tbv_post_type >", value, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbv_post_type >=", value, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeLessThan(Byte value) {
            addCriterion("tbv_post_type <", value, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbv_post_type <=", value, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeIn(List<Byte> values) {
            addCriterion("tbv_post_type in", values, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeNotIn(List<Byte> values) {
            addCriterion("tbv_post_type not in", values, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbv_post_type between", value1, value2, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbv_post_type not between", value1, value2, "tbvPostType");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrIsNull() {
            addCriterion("tbv_post_addr is null");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrIsNotNull() {
            addCriterion("tbv_post_addr is not null");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrEqualTo(String value) {
            addCriterion("tbv_post_addr =", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrNotEqualTo(String value) {
            addCriterion("tbv_post_addr <>", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrGreaterThan(String value) {
            addCriterion("tbv_post_addr >", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrGreaterThanOrEqualTo(String value) {
            addCriterion("tbv_post_addr >=", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrLessThan(String value) {
            addCriterion("tbv_post_addr <", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrLessThanOrEqualTo(String value) {
            addCriterion("tbv_post_addr <=", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrLike(String value) {
            addCriterion("tbv_post_addr like", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrNotLike(String value) {
            addCriterion("tbv_post_addr not like", value, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrIn(List<String> values) {
            addCriterion("tbv_post_addr in", values, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrNotIn(List<String> values) {
            addCriterion("tbv_post_addr not in", values, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrBetween(String value1, String value2) {
            addCriterion("tbv_post_addr between", value1, value2, "tbvPostAddr");
            return (Criteria) this;
        }

        public Criteria andTbvPostAddrNotBetween(String value1, String value2) {
            addCriterion("tbv_post_addr not between", value1, value2, "tbvPostAddr");
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

        public Criteria andTbvAccepterIsNull() {
            addCriterion("tbv_accepter is null");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterIsNotNull() {
            addCriterion("tbv_accepter is not null");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterEqualTo(Integer value) {
            addCriterion("tbv_accepter =", value, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterNotEqualTo(Integer value) {
            addCriterion("tbv_accepter <>", value, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterGreaterThan(Integer value) {
            addCriterion("tbv_accepter >", value, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_accepter >=", value, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterLessThan(Integer value) {
            addCriterion("tbv_accepter <", value, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_accepter <=", value, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterIn(List<Integer> values) {
            addCriterion("tbv_accepter in", values, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterNotIn(List<Integer> values) {
            addCriterion("tbv_accepter not in", values, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterBetween(Integer value1, Integer value2) {
            addCriterion("tbv_accepter between", value1, value2, "tbvAccepter");
            return (Criteria) this;
        }

        public Criteria andTbvAccepterNotBetween(Integer value1, Integer value2) {
            addCriterion("tbv_accepter not between", value1, value2, "tbvAccepter");
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

        public Criteria andTbvAdderEqualTo(Integer value) {
            addCriterion("tbv_adder =", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderNotEqualTo(Integer value) {
            addCriterion("tbv_adder <>", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderGreaterThan(Integer value) {
            addCriterion("tbv_adder >", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_adder >=", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderLessThan(Integer value) {
            addCriterion("tbv_adder <", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_adder <=", value, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderIn(List<Integer> values) {
            addCriterion("tbv_adder in", values, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderNotIn(List<Integer> values) {
            addCriterion("tbv_adder not in", values, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderBetween(Integer value1, Integer value2) {
            addCriterion("tbv_adder between", value1, value2, "tbvAdder");
            return (Criteria) this;
        }

        public Criteria andTbvAdderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbv_adder not between", value1, value2, "tbvAdder");
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

        public Criteria andTbvDealFlagIsNull() {
            addCriterion("tbv_deal_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagIsNotNull() {
            addCriterion("tbv_deal_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagEqualTo(Byte value) {
            addCriterion("tbv_deal_flag =", value, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagNotEqualTo(Byte value) {
            addCriterion("tbv_deal_flag <>", value, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagGreaterThan(Byte value) {
            addCriterion("tbv_deal_flag >", value, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbv_deal_flag >=", value, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagLessThan(Byte value) {
            addCriterion("tbv_deal_flag <", value, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagLessThanOrEqualTo(Byte value) {
            addCriterion("tbv_deal_flag <=", value, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagIn(List<Byte> values) {
            addCriterion("tbv_deal_flag in", values, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagNotIn(List<Byte> values) {
            addCriterion("tbv_deal_flag not in", values, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagBetween(Byte value1, Byte value2) {
            addCriterion("tbv_deal_flag between", value1, value2, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvDealFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("tbv_deal_flag not between", value1, value2, "tbvDealFlag");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountIsNull() {
            addCriterion("tbv_query_count is null");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountIsNotNull() {
            addCriterion("tbv_query_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountEqualTo(Integer value) {
            addCriterion("tbv_query_count =", value, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountNotEqualTo(Integer value) {
            addCriterion("tbv_query_count <>", value, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountGreaterThan(Integer value) {
            addCriterion("tbv_query_count >", value, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbv_query_count >=", value, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountLessThan(Integer value) {
            addCriterion("tbv_query_count <", value, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountLessThanOrEqualTo(Integer value) {
            addCriterion("tbv_query_count <=", value, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountIn(List<Integer> values) {
            addCriterion("tbv_query_count in", values, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountNotIn(List<Integer> values) {
            addCriterion("tbv_query_count not in", values, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountBetween(Integer value1, Integer value2) {
            addCriterion("tbv_query_count between", value1, value2, "tbvQueryCount");
            return (Criteria) this;
        }

        public Criteria andTbvQueryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tbv_query_count not between", value1, value2, "tbvQueryCount");
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

        public Criteria andTbvStatusEqualTo(Byte value) {
            addCriterion("tbv_status =", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusNotEqualTo(Byte value) {
            addCriterion("tbv_status <>", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusGreaterThan(Byte value) {
            addCriterion("tbv_status >", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbv_status >=", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusLessThan(Byte value) {
            addCriterion("tbv_status <", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbv_status <=", value, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusIn(List<Byte> values) {
            addCriterion("tbv_status in", values, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusNotIn(List<Byte> values) {
            addCriterion("tbv_status not in", values, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbv_status between", value1, value2, "tbvStatus");
            return (Criteria) this;
        }

        public Criteria andTbvStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbv_status not between", value1, value2, "tbvStatus");
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