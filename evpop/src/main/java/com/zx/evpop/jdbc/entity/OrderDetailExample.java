package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andTbodIdIsNull() {
            addCriterion("tbod_id is null");
            return (Criteria) this;
        }

        public Criteria andTbodIdIsNotNull() {
            addCriterion("tbod_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbodIdEqualTo(Integer value) {
            addCriterion("tbod_id =", value, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdNotEqualTo(Integer value) {
            addCriterion("tbod_id <>", value, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdGreaterThan(Integer value) {
            addCriterion("tbod_id >", value, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbod_id >=", value, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdLessThan(Integer value) {
            addCriterion("tbod_id <", value, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbod_id <=", value, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdIn(List<Integer> values) {
            addCriterion("tbod_id in", values, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdNotIn(List<Integer> values) {
            addCriterion("tbod_id not in", values, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdBetween(Integer value1, Integer value2) {
            addCriterion("tbod_id between", value1, value2, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbod_id not between", value1, value2, "tbodId");
            return (Criteria) this;
        }

        public Criteria andTbodHostIsNull() {
            addCriterion("tbod_host is null");
            return (Criteria) this;
        }

        public Criteria andTbodHostIsNotNull() {
            addCriterion("tbod_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbodHostEqualTo(Short value) {
            addCriterion("tbod_host =", value, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostNotEqualTo(Short value) {
            addCriterion("tbod_host <>", value, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostGreaterThan(Short value) {
            addCriterion("tbod_host >", value, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbod_host >=", value, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostLessThan(Short value) {
            addCriterion("tbod_host <", value, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostLessThanOrEqualTo(Short value) {
            addCriterion("tbod_host <=", value, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostIn(List<Short> values) {
            addCriterion("tbod_host in", values, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostNotIn(List<Short> values) {
            addCriterion("tbod_host not in", values, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostBetween(Short value1, Short value2) {
            addCriterion("tbod_host between", value1, value2, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodHostNotBetween(Short value1, Short value2) {
            addCriterion("tbod_host not between", value1, value2, "tbodHost");
            return (Criteria) this;
        }

        public Criteria andTbodProfileIsNull() {
            addCriterion("tbod_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbodProfileIsNotNull() {
            addCriterion("tbod_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbodProfileEqualTo(String value) {
            addCriterion("tbod_profile =", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileNotEqualTo(String value) {
            addCriterion("tbod_profile <>", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileGreaterThan(String value) {
            addCriterion("tbod_profile >", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbod_profile >=", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileLessThan(String value) {
            addCriterion("tbod_profile <", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileLessThanOrEqualTo(String value) {
            addCriterion("tbod_profile <=", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileLike(String value) {
            addCriterion("tbod_profile like", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileNotLike(String value) {
            addCriterion("tbod_profile not like", value, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileIn(List<String> values) {
            addCriterion("tbod_profile in", values, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileNotIn(List<String> values) {
            addCriterion("tbod_profile not in", values, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileBetween(String value1, String value2) {
            addCriterion("tbod_profile between", value1, value2, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodProfileNotBetween(String value1, String value2) {
            addCriterion("tbod_profile not between", value1, value2, "tbodProfile");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsIsNull() {
            addCriterion("tbod_goods is null");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsIsNotNull() {
            addCriterion("tbod_goods is not null");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsEqualTo(Integer value) {
            addCriterion("tbod_goods =", value, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsNotEqualTo(Integer value) {
            addCriterion("tbod_goods <>", value, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsGreaterThan(Integer value) {
            addCriterion("tbod_goods >", value, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbod_goods >=", value, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsLessThan(Integer value) {
            addCriterion("tbod_goods <", value, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("tbod_goods <=", value, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsIn(List<Integer> values) {
            addCriterion("tbod_goods in", values, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsNotIn(List<Integer> values) {
            addCriterion("tbod_goods not in", values, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsBetween(Integer value1, Integer value2) {
            addCriterion("tbod_goods between", value1, value2, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("tbod_goods not between", value1, value2, "tbodGoods");
            return (Criteria) this;
        }

        public Criteria andTbodOrderIsNull() {
            addCriterion("tbod_order is null");
            return (Criteria) this;
        }

        public Criteria andTbodOrderIsNotNull() {
            addCriterion("tbod_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbodOrderEqualTo(Long value) {
            addCriterion("tbod_order =", value, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderNotEqualTo(Long value) {
            addCriterion("tbod_order <>", value, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderGreaterThan(Long value) {
            addCriterion("tbod_order >", value, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbod_order >=", value, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderLessThan(Long value) {
            addCriterion("tbod_order <", value, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbod_order <=", value, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderIn(List<Long> values) {
            addCriterion("tbod_order in", values, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderNotIn(List<Long> values) {
            addCriterion("tbod_order not in", values, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderBetween(Long value1, Long value2) {
            addCriterion("tbod_order between", value1, value2, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbod_order not between", value1, value2, "tbodOrder");
            return (Criteria) this;
        }

        public Criteria andTbodStartIsNull() {
            addCriterion("tbod_start is null");
            return (Criteria) this;
        }

        public Criteria andTbodStartIsNotNull() {
            addCriterion("tbod_start is not null");
            return (Criteria) this;
        }

        public Criteria andTbodStartEqualTo(Date value) {
            addCriterion("tbod_start =", value, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartNotEqualTo(Date value) {
            addCriterion("tbod_start <>", value, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartGreaterThan(Date value) {
            addCriterion("tbod_start >", value, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartGreaterThanOrEqualTo(Date value) {
            addCriterion("tbod_start >=", value, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartLessThan(Date value) {
            addCriterion("tbod_start <", value, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartLessThanOrEqualTo(Date value) {
            addCriterion("tbod_start <=", value, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartIn(List<Date> values) {
            addCriterion("tbod_start in", values, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartNotIn(List<Date> values) {
            addCriterion("tbod_start not in", values, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartBetween(Date value1, Date value2) {
            addCriterion("tbod_start between", value1, value2, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodStartNotBetween(Date value1, Date value2) {
            addCriterion("tbod_start not between", value1, value2, "tbodStart");
            return (Criteria) this;
        }

        public Criteria andTbodEndIsNull() {
            addCriterion("tbod_end is null");
            return (Criteria) this;
        }

        public Criteria andTbodEndIsNotNull() {
            addCriterion("tbod_end is not null");
            return (Criteria) this;
        }

        public Criteria andTbodEndEqualTo(Date value) {
            addCriterion("tbod_end =", value, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndNotEqualTo(Date value) {
            addCriterion("tbod_end <>", value, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndGreaterThan(Date value) {
            addCriterion("tbod_end >", value, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndGreaterThanOrEqualTo(Date value) {
            addCriterion("tbod_end >=", value, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndLessThan(Date value) {
            addCriterion("tbod_end <", value, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndLessThanOrEqualTo(Date value) {
            addCriterion("tbod_end <=", value, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndIn(List<Date> values) {
            addCriterion("tbod_end in", values, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndNotIn(List<Date> values) {
            addCriterion("tbod_end not in", values, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndBetween(Date value1, Date value2) {
            addCriterion("tbod_end between", value1, value2, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodEndNotBetween(Date value1, Date value2) {
            addCriterion("tbod_end not between", value1, value2, "tbodEnd");
            return (Criteria) this;
        }

        public Criteria andTbodCountIsNull() {
            addCriterion("tbod_count is null");
            return (Criteria) this;
        }

        public Criteria andTbodCountIsNotNull() {
            addCriterion("tbod_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbodCountEqualTo(Double value) {
            addCriterion("tbod_count =", value, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountNotEqualTo(Double value) {
            addCriterion("tbod_count <>", value, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountGreaterThan(Double value) {
            addCriterion("tbod_count >", value, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbod_count >=", value, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountLessThan(Double value) {
            addCriterion("tbod_count <", value, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountLessThanOrEqualTo(Double value) {
            addCriterion("tbod_count <=", value, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountIn(List<Double> values) {
            addCriterion("tbod_count in", values, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountNotIn(List<Double> values) {
            addCriterion("tbod_count not in", values, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountBetween(Double value1, Double value2) {
            addCriterion("tbod_count between", value1, value2, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodCountNotBetween(Double value1, Double value2) {
            addCriterion("tbod_count not between", value1, value2, "tbodCount");
            return (Criteria) this;
        }

        public Criteria andTbodPriceIsNull() {
            addCriterion("tbod_price is null");
            return (Criteria) this;
        }

        public Criteria andTbodPriceIsNotNull() {
            addCriterion("tbod_price is not null");
            return (Criteria) this;
        }

        public Criteria andTbodPriceEqualTo(Double value) {
            addCriterion("tbod_price =", value, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceNotEqualTo(Double value) {
            addCriterion("tbod_price <>", value, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceGreaterThan(Double value) {
            addCriterion("tbod_price >", value, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tbod_price >=", value, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceLessThan(Double value) {
            addCriterion("tbod_price <", value, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceLessThanOrEqualTo(Double value) {
            addCriterion("tbod_price <=", value, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceIn(List<Double> values) {
            addCriterion("tbod_price in", values, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceNotIn(List<Double> values) {
            addCriterion("tbod_price not in", values, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceBetween(Double value1, Double value2) {
            addCriterion("tbod_price between", value1, value2, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodPriceNotBetween(Double value1, Double value2) {
            addCriterion("tbod_price not between", value1, value2, "tbodPrice");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyIsNull() {
            addCriterion("tbod_money is null");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyIsNotNull() {
            addCriterion("tbod_money is not null");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyEqualTo(Double value) {
            addCriterion("tbod_money =", value, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyNotEqualTo(Double value) {
            addCriterion("tbod_money <>", value, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyGreaterThan(Double value) {
            addCriterion("tbod_money >", value, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tbod_money >=", value, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyLessThan(Double value) {
            addCriterion("tbod_money <", value, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tbod_money <=", value, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyIn(List<Double> values) {
            addCriterion("tbod_money in", values, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyNotIn(List<Double> values) {
            addCriterion("tbod_money not in", values, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyBetween(Double value1, Double value2) {
            addCriterion("tbod_money between", value1, value2, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tbod_money not between", value1, value2, "tbodMoney");
            return (Criteria) this;
        }

        public Criteria andTbodRebateIsNull() {
            addCriterion("tbod_rebate is null");
            return (Criteria) this;
        }

        public Criteria andTbodRebateIsNotNull() {
            addCriterion("tbod_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andTbodRebateEqualTo(Double value) {
            addCriterion("tbod_rebate =", value, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateNotEqualTo(Double value) {
            addCriterion("tbod_rebate <>", value, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateGreaterThan(Double value) {
            addCriterion("tbod_rebate >", value, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateGreaterThanOrEqualTo(Double value) {
            addCriterion("tbod_rebate >=", value, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateLessThan(Double value) {
            addCriterion("tbod_rebate <", value, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateLessThanOrEqualTo(Double value) {
            addCriterion("tbod_rebate <=", value, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateIn(List<Double> values) {
            addCriterion("tbod_rebate in", values, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateNotIn(List<Double> values) {
            addCriterion("tbod_rebate not in", values, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateBetween(Double value1, Double value2) {
            addCriterion("tbod_rebate between", value1, value2, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRebateNotBetween(Double value1, Double value2) {
            addCriterion("tbod_rebate not between", value1, value2, "tbodRebate");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkIsNull() {
            addCriterion("tbod_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkIsNotNull() {
            addCriterion("tbod_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkEqualTo(String value) {
            addCriterion("tbod_remark =", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkNotEqualTo(String value) {
            addCriterion("tbod_remark <>", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkGreaterThan(String value) {
            addCriterion("tbod_remark >", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbod_remark >=", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkLessThan(String value) {
            addCriterion("tbod_remark <", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbod_remark <=", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkLike(String value) {
            addCriterion("tbod_remark like", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkNotLike(String value) {
            addCriterion("tbod_remark not like", value, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkIn(List<String> values) {
            addCriterion("tbod_remark in", values, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkNotIn(List<String> values) {
            addCriterion("tbod_remark not in", values, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkBetween(String value1, String value2) {
            addCriterion("tbod_remark between", value1, value2, "tbodRemark");
            return (Criteria) this;
        }

        public Criteria andTbodRemarkNotBetween(String value1, String value2) {
            addCriterion("tbod_remark not between", value1, value2, "tbodRemark");
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