package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andTbcIdIsNull() {
            addCriterion("tbc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcIdIsNotNull() {
            addCriterion("tbc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcIdEqualTo(Integer value) {
            addCriterion("tbc_id =", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotEqualTo(Integer value) {
            addCriterion("tbc_id <>", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdGreaterThan(Integer value) {
            addCriterion("tbc_id >", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_id >=", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdLessThan(Integer value) {
            addCriterion("tbc_id <", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_id <=", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdIn(List<Integer> values) {
            addCriterion("tbc_id in", values, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotIn(List<Integer> values) {
            addCriterion("tbc_id not in", values, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdBetween(Integer value1, Integer value2) {
            addCriterion("tbc_id between", value1, value2, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_id not between", value1, value2, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcHostIsNull() {
            addCriterion("tbc_host is null");
            return (Criteria) this;
        }

        public Criteria andTbcHostIsNotNull() {
            addCriterion("tbc_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbcHostEqualTo(Short value) {
            addCriterion("tbc_host =", value, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostNotEqualTo(Short value) {
            addCriterion("tbc_host <>", value, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostGreaterThan(Short value) {
            addCriterion("tbc_host >", value, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbc_host >=", value, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostLessThan(Short value) {
            addCriterion("tbc_host <", value, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostLessThanOrEqualTo(Short value) {
            addCriterion("tbc_host <=", value, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostIn(List<Short> values) {
            addCriterion("tbc_host in", values, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostNotIn(List<Short> values) {
            addCriterion("tbc_host not in", values, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostBetween(Short value1, Short value2) {
            addCriterion("tbc_host between", value1, value2, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcHostNotBetween(Short value1, Short value2) {
            addCriterion("tbc_host not between", value1, value2, "tbcHost");
            return (Criteria) this;
        }

        public Criteria andTbcTitleIsNull() {
            addCriterion("tbc_title is null");
            return (Criteria) this;
        }

        public Criteria andTbcTitleIsNotNull() {
            addCriterion("tbc_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbcTitleEqualTo(String value) {
            addCriterion("tbc_title =", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotEqualTo(String value) {
            addCriterion("tbc_title <>", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleGreaterThan(String value) {
            addCriterion("tbc_title >", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_title >=", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleLessThan(String value) {
            addCriterion("tbc_title <", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleLessThanOrEqualTo(String value) {
            addCriterion("tbc_title <=", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleLike(String value) {
            addCriterion("tbc_title like", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotLike(String value) {
            addCriterion("tbc_title not like", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleIn(List<String> values) {
            addCriterion("tbc_title in", values, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotIn(List<String> values) {
            addCriterion("tbc_title not in", values, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleBetween(String value1, String value2) {
            addCriterion("tbc_title between", value1, value2, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotBetween(String value1, String value2) {
            addCriterion("tbc_title not between", value1, value2, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcMemberIsNull() {
            addCriterion("tbc_member is null");
            return (Criteria) this;
        }

        public Criteria andTbcMemberIsNotNull() {
            addCriterion("tbc_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbcMemberEqualTo(Integer value) {
            addCriterion("tbc_member =", value, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberNotEqualTo(Integer value) {
            addCriterion("tbc_member <>", value, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberGreaterThan(Integer value) {
            addCriterion("tbc_member >", value, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_member >=", value, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberLessThan(Integer value) {
            addCriterion("tbc_member <", value, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_member <=", value, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberIn(List<Integer> values) {
            addCriterion("tbc_member in", values, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberNotIn(List<Integer> values) {
            addCriterion("tbc_member not in", values, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbc_member between", value1, value2, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_member not between", value1, value2, "tbcMember");
            return (Criteria) this;
        }

        public Criteria andTbcLimitIsNull() {
            addCriterion("tbc_limit is null");
            return (Criteria) this;
        }

        public Criteria andTbcLimitIsNotNull() {
            addCriterion("tbc_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTbcLimitEqualTo(Byte value) {
            addCriterion("tbc_limit =", value, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitNotEqualTo(Byte value) {
            addCriterion("tbc_limit <>", value, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitGreaterThan(Byte value) {
            addCriterion("tbc_limit >", value, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_limit >=", value, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitLessThan(Byte value) {
            addCriterion("tbc_limit <", value, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_limit <=", value, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitIn(List<Byte> values) {
            addCriterion("tbc_limit in", values, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitNotIn(List<Byte> values) {
            addCriterion("tbc_limit not in", values, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitBetween(Byte value1, Byte value2) {
            addCriterion("tbc_limit between", value1, value2, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_limit not between", value1, value2, "tbcLimit");
            return (Criteria) this;
        }

        public Criteria andTbcMinIsNull() {
            addCriterion("tbc_min is null");
            return (Criteria) this;
        }

        public Criteria andTbcMinIsNotNull() {
            addCriterion("tbc_min is not null");
            return (Criteria) this;
        }

        public Criteria andTbcMinEqualTo(BigDecimal value) {
            addCriterion("tbc_min =", value, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinNotEqualTo(BigDecimal value) {
            addCriterion("tbc_min <>", value, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinGreaterThan(BigDecimal value) {
            addCriterion("tbc_min >", value, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbc_min >=", value, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinLessThan(BigDecimal value) {
            addCriterion("tbc_min <", value, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbc_min <=", value, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinIn(List<BigDecimal> values) {
            addCriterion("tbc_min in", values, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinNotIn(List<BigDecimal> values) {
            addCriterion("tbc_min not in", values, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbc_min between", value1, value2, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbc_min not between", value1, value2, "tbcMin");
            return (Criteria) this;
        }

        public Criteria andTbcTypeIsNull() {
            addCriterion("tbc_type is null");
            return (Criteria) this;
        }

        public Criteria andTbcTypeIsNotNull() {
            addCriterion("tbc_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbcTypeEqualTo(Integer value) {
            addCriterion("tbc_type =", value, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeNotEqualTo(Integer value) {
            addCriterion("tbc_type <>", value, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeGreaterThan(Integer value) {
            addCriterion("tbc_type >", value, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_type >=", value, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeLessThan(Integer value) {
            addCriterion("tbc_type <", value, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_type <=", value, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeIn(List<Integer> values) {
            addCriterion("tbc_type in", values, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeNotIn(List<Integer> values) {
            addCriterion("tbc_type not in", values, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeBetween(Integer value1, Integer value2) {
            addCriterion("tbc_type between", value1, value2, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_type not between", value1, value2, "tbcType");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIsNull() {
            addCriterion("tbc_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIsNotNull() {
            addCriterion("tbc_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbcFlagEqualTo(String value) {
            addCriterion("tbc_flag =", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotEqualTo(String value) {
            addCriterion("tbc_flag <>", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagGreaterThan(String value) {
            addCriterion("tbc_flag >", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_flag >=", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLessThan(String value) {
            addCriterion("tbc_flag <", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLessThanOrEqualTo(String value) {
            addCriterion("tbc_flag <=", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLike(String value) {
            addCriterion("tbc_flag like", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotLike(String value) {
            addCriterion("tbc_flag not like", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIn(List<String> values) {
            addCriterion("tbc_flag in", values, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotIn(List<String> values) {
            addCriterion("tbc_flag not in", values, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagBetween(String value1, String value2) {
            addCriterion("tbc_flag between", value1, value2, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotBetween(String value1, String value2) {
            addCriterion("tbc_flag not between", value1, value2, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcCountIsNull() {
            addCriterion("tbc_count is null");
            return (Criteria) this;
        }

        public Criteria andTbcCountIsNotNull() {
            addCriterion("tbc_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbcCountEqualTo(Double value) {
            addCriterion("tbc_count =", value, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountNotEqualTo(Double value) {
            addCriterion("tbc_count <>", value, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountGreaterThan(Double value) {
            addCriterion("tbc_count >", value, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbc_count >=", value, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountLessThan(Double value) {
            addCriterion("tbc_count <", value, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountLessThanOrEqualTo(Double value) {
            addCriterion("tbc_count <=", value, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountIn(List<Double> values) {
            addCriterion("tbc_count in", values, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountNotIn(List<Double> values) {
            addCriterion("tbc_count not in", values, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountBetween(Double value1, Double value2) {
            addCriterion("tbc_count between", value1, value2, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcCountNotBetween(Double value1, Double value2) {
            addCriterion("tbc_count not between", value1, value2, "tbcCount");
            return (Criteria) this;
        }

        public Criteria andTbcValidityIsNull() {
            addCriterion("tbc_validity is null");
            return (Criteria) this;
        }

        public Criteria andTbcValidityIsNotNull() {
            addCriterion("tbc_validity is not null");
            return (Criteria) this;
        }

        public Criteria andTbcValidityEqualTo(Byte value) {
            addCriterion("tbc_validity =", value, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityNotEqualTo(Byte value) {
            addCriterion("tbc_validity <>", value, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityGreaterThan(Byte value) {
            addCriterion("tbc_validity >", value, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_validity >=", value, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityLessThan(Byte value) {
            addCriterion("tbc_validity <", value, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_validity <=", value, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityIn(List<Byte> values) {
            addCriterion("tbc_validity in", values, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityNotIn(List<Byte> values) {
            addCriterion("tbc_validity not in", values, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityBetween(Byte value1, Byte value2) {
            addCriterion("tbc_validity between", value1, value2, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcValidityNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_validity not between", value1, value2, "tbcValidity");
            return (Criteria) this;
        }

        public Criteria andTbcBeginIsNull() {
            addCriterion("tbc_begin is null");
            return (Criteria) this;
        }

        public Criteria andTbcBeginIsNotNull() {
            addCriterion("tbc_begin is not null");
            return (Criteria) this;
        }

        public Criteria andTbcBeginEqualTo(Date value) {
            addCriterion("tbc_begin =", value, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginNotEqualTo(Date value) {
            addCriterion("tbc_begin <>", value, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginGreaterThan(Date value) {
            addCriterion("tbc_begin >", value, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_begin >=", value, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginLessThan(Date value) {
            addCriterion("tbc_begin <", value, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginLessThanOrEqualTo(Date value) {
            addCriterion("tbc_begin <=", value, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginIn(List<Date> values) {
            addCriterion("tbc_begin in", values, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginNotIn(List<Date> values) {
            addCriterion("tbc_begin not in", values, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginBetween(Date value1, Date value2) {
            addCriterion("tbc_begin between", value1, value2, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcBeginNotBetween(Date value1, Date value2) {
            addCriterion("tbc_begin not between", value1, value2, "tbcBegin");
            return (Criteria) this;
        }

        public Criteria andTbcEndIsNull() {
            addCriterion("tbc_end is null");
            return (Criteria) this;
        }

        public Criteria andTbcEndIsNotNull() {
            addCriterion("tbc_end is not null");
            return (Criteria) this;
        }

        public Criteria andTbcEndEqualTo(Date value) {
            addCriterion("tbc_end =", value, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndNotEqualTo(Date value) {
            addCriterion("tbc_end <>", value, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndGreaterThan(Date value) {
            addCriterion("tbc_end >", value, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_end >=", value, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndLessThan(Date value) {
            addCriterion("tbc_end <", value, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndLessThanOrEqualTo(Date value) {
            addCriterion("tbc_end <=", value, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndIn(List<Date> values) {
            addCriterion("tbc_end in", values, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndNotIn(List<Date> values) {
            addCriterion("tbc_end not in", values, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndBetween(Date value1, Date value2) {
            addCriterion("tbc_end between", value1, value2, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcEndNotBetween(Date value1, Date value2) {
            addCriterion("tbc_end not between", value1, value2, "tbcEnd");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeIsNull() {
            addCriterion("tbc_use_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeIsNotNull() {
            addCriterion("tbc_use_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeEqualTo(Date value) {
            addCriterion("tbc_use_time =", value, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeNotEqualTo(Date value) {
            addCriterion("tbc_use_time <>", value, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeGreaterThan(Date value) {
            addCriterion("tbc_use_time >", value, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_use_time >=", value, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeLessThan(Date value) {
            addCriterion("tbc_use_time <", value, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_use_time <=", value, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeIn(List<Date> values) {
            addCriterion("tbc_use_time in", values, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeNotIn(List<Date> values) {
            addCriterion("tbc_use_time not in", values, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_use_time between", value1, value2, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcUseTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_use_time not between", value1, value2, "tbcUseTime");
            return (Criteria) this;
        }

        public Criteria andTbcSerialIsNull() {
            addCriterion("tbc_serial is null");
            return (Criteria) this;
        }

        public Criteria andTbcSerialIsNotNull() {
            addCriterion("tbc_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTbcSerialEqualTo(String value) {
            addCriterion("tbc_serial =", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialNotEqualTo(String value) {
            addCriterion("tbc_serial <>", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialGreaterThan(String value) {
            addCriterion("tbc_serial >", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_serial >=", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialLessThan(String value) {
            addCriterion("tbc_serial <", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialLessThanOrEqualTo(String value) {
            addCriterion("tbc_serial <=", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialLike(String value) {
            addCriterion("tbc_serial like", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialNotLike(String value) {
            addCriterion("tbc_serial not like", value, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialIn(List<String> values) {
            addCriterion("tbc_serial in", values, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialNotIn(List<String> values) {
            addCriterion("tbc_serial not in", values, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialBetween(String value1, String value2) {
            addCriterion("tbc_serial between", value1, value2, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcSerialNotBetween(String value1, String value2) {
            addCriterion("tbc_serial not between", value1, value2, "tbcSerial");
            return (Criteria) this;
        }

        public Criteria andTbcOrderIsNull() {
            addCriterion("tbc_order is null");
            return (Criteria) this;
        }

        public Criteria andTbcOrderIsNotNull() {
            addCriterion("tbc_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbcOrderEqualTo(Long value) {
            addCriterion("tbc_order =", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderNotEqualTo(Long value) {
            addCriterion("tbc_order <>", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderGreaterThan(Long value) {
            addCriterion("tbc_order >", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbc_order >=", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderLessThan(Long value) {
            addCriterion("tbc_order <", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbc_order <=", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderIn(List<Long> values) {
            addCriterion("tbc_order in", values, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderNotIn(List<Long> values) {
            addCriterion("tbc_order not in", values, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderBetween(Long value1, Long value2) {
            addCriterion("tbc_order between", value1, value2, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbc_order not between", value1, value2, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderIsNull() {
            addCriterion("tbc_long_order is null");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderIsNotNull() {
            addCriterion("tbc_long_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderEqualTo(Long value) {
            addCriterion("tbc_long_order =", value, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderNotEqualTo(Long value) {
            addCriterion("tbc_long_order <>", value, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderGreaterThan(Long value) {
            addCriterion("tbc_long_order >", value, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbc_long_order >=", value, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderLessThan(Long value) {
            addCriterion("tbc_long_order <", value, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbc_long_order <=", value, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderIn(List<Long> values) {
            addCriterion("tbc_long_order in", values, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderNotIn(List<Long> values) {
            addCriterion("tbc_long_order not in", values, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderBetween(Long value1, Long value2) {
            addCriterion("tbc_long_order between", value1, value2, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcLongOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbc_long_order not between", value1, value2, "tbcLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbcDataIsNull() {
            addCriterion("tbc_data is null");
            return (Criteria) this;
        }

        public Criteria andTbcDataIsNotNull() {
            addCriterion("tbc_data is not null");
            return (Criteria) this;
        }

        public Criteria andTbcDataEqualTo(String value) {
            addCriterion("tbc_data =", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataNotEqualTo(String value) {
            addCriterion("tbc_data <>", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataGreaterThan(String value) {
            addCriterion("tbc_data >", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_data >=", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataLessThan(String value) {
            addCriterion("tbc_data <", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataLessThanOrEqualTo(String value) {
            addCriterion("tbc_data <=", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataLike(String value) {
            addCriterion("tbc_data like", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataNotLike(String value) {
            addCriterion("tbc_data not like", value, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataIn(List<String> values) {
            addCriterion("tbc_data in", values, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataNotIn(List<String> values) {
            addCriterion("tbc_data not in", values, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataBetween(String value1, String value2) {
            addCriterion("tbc_data between", value1, value2, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcDataNotBetween(String value1, String value2) {
            addCriterion("tbc_data not between", value1, value2, "tbcData");
            return (Criteria) this;
        }

        public Criteria andTbcEditorIsNull() {
            addCriterion("tbc_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbcEditorIsNotNull() {
            addCriterion("tbc_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbcEditorEqualTo(Integer value) {
            addCriterion("tbc_editor =", value, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorNotEqualTo(Integer value) {
            addCriterion("tbc_editor <>", value, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorGreaterThan(Integer value) {
            addCriterion("tbc_editor >", value, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_editor >=", value, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorLessThan(Integer value) {
            addCriterion("tbc_editor <", value, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_editor <=", value, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorIn(List<Integer> values) {
            addCriterion("tbc_editor in", values, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorNotIn(List<Integer> values) {
            addCriterion("tbc_editor not in", values, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbc_editor between", value1, value2, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_editor not between", value1, value2, "tbcEditor");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIsNull() {
            addCriterion("tbc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIsNotNull() {
            addCriterion("tbc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeEqualTo(Date value) {
            addCriterion("tbc_update_time =", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbc_update_time <>", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeGreaterThan(Date value) {
            addCriterion("tbc_update_time >", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_update_time >=", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeLessThan(Date value) {
            addCriterion("tbc_update_time <", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_update_time <=", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIn(List<Date> values) {
            addCriterion("tbc_update_time in", values, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbc_update_time not in", values, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_update_time between", value1, value2, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_update_time not between", value1, value2, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIsNull() {
            addCriterion("tbc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIsNotNull() {
            addCriterion("tbc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeEqualTo(Date value) {
            addCriterion("tbc_add_time =", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotEqualTo(Date value) {
            addCriterion("tbc_add_time <>", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeGreaterThan(Date value) {
            addCriterion("tbc_add_time >", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_add_time >=", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeLessThan(Date value) {
            addCriterion("tbc_add_time <", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_add_time <=", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIn(List<Date> values) {
            addCriterion("tbc_add_time in", values, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotIn(List<Date> values) {
            addCriterion("tbc_add_time not in", values, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_add_time between", value1, value2, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_add_time not between", value1, value2, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkIsNull() {
            addCriterion("tbc_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkIsNotNull() {
            addCriterion("tbc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkEqualTo(String value) {
            addCriterion("tbc_remark =", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkNotEqualTo(String value) {
            addCriterion("tbc_remark <>", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkGreaterThan(String value) {
            addCriterion("tbc_remark >", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_remark >=", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkLessThan(String value) {
            addCriterion("tbc_remark <", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbc_remark <=", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkLike(String value) {
            addCriterion("tbc_remark like", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkNotLike(String value) {
            addCriterion("tbc_remark not like", value, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkIn(List<String> values) {
            addCriterion("tbc_remark in", values, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkNotIn(List<String> values) {
            addCriterion("tbc_remark not in", values, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkBetween(String value1, String value2) {
            addCriterion("tbc_remark between", value1, value2, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcRemarkNotBetween(String value1, String value2) {
            addCriterion("tbc_remark not between", value1, value2, "tbcRemark");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutIsNull() {
            addCriterion("tbc_timeout is null");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutIsNotNull() {
            addCriterion("tbc_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutEqualTo(Byte value) {
            addCriterion("tbc_timeout =", value, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutNotEqualTo(Byte value) {
            addCriterion("tbc_timeout <>", value, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutGreaterThan(Byte value) {
            addCriterion("tbc_timeout >", value, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_timeout >=", value, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutLessThan(Byte value) {
            addCriterion("tbc_timeout <", value, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_timeout <=", value, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutIn(List<Byte> values) {
            addCriterion("tbc_timeout in", values, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutNotIn(List<Byte> values) {
            addCriterion("tbc_timeout not in", values, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutBetween(Byte value1, Byte value2) {
            addCriterion("tbc_timeout between", value1, value2, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcTimeoutNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_timeout not between", value1, value2, "tbcTimeout");
            return (Criteria) this;
        }

        public Criteria andTbcUsedIsNull() {
            addCriterion("tbc_used is null");
            return (Criteria) this;
        }

        public Criteria andTbcUsedIsNotNull() {
            addCriterion("tbc_used is not null");
            return (Criteria) this;
        }

        public Criteria andTbcUsedEqualTo(Byte value) {
            addCriterion("tbc_used =", value, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedNotEqualTo(Byte value) {
            addCriterion("tbc_used <>", value, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedGreaterThan(Byte value) {
            addCriterion("tbc_used >", value, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_used >=", value, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedLessThan(Byte value) {
            addCriterion("tbc_used <", value, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_used <=", value, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedIn(List<Byte> values) {
            addCriterion("tbc_used in", values, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedNotIn(List<Byte> values) {
            addCriterion("tbc_used not in", values, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedBetween(Byte value1, Byte value2) {
            addCriterion("tbc_used between", value1, value2, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcUsedNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_used not between", value1, value2, "tbcUsed");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIsNull() {
            addCriterion("tbc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIsNotNull() {
            addCriterion("tbc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusEqualTo(Byte value) {
            addCriterion("tbc_status =", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotEqualTo(Byte value) {
            addCriterion("tbc_status <>", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusGreaterThan(Byte value) {
            addCriterion("tbc_status >", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_status >=", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusLessThan(Byte value) {
            addCriterion("tbc_status <", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_status <=", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIn(List<Byte> values) {
            addCriterion("tbc_status in", values, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotIn(List<Byte> values) {
            addCriterion("tbc_status not in", values, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status between", value1, value2, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status not between", value1, value2, "tbcStatus");
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