package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andTbrIdEqualTo(Long value) {
            addCriterion("tbr_id =", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotEqualTo(Long value) {
            addCriterion("tbr_id <>", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThan(Long value) {
            addCriterion("tbr_id >", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_id >=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThan(Long value) {
            addCriterion("tbr_id <", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThanOrEqualTo(Long value) {
            addCriterion("tbr_id <=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdIn(List<Long> values) {
            addCriterion("tbr_id in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotIn(List<Long> values) {
            addCriterion("tbr_id not in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdBetween(Long value1, Long value2) {
            addCriterion("tbr_id between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotBetween(Long value1, Long value2) {
            addCriterion("tbr_id not between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrHostIsNull() {
            addCriterion("tbr_host is null");
            return (Criteria) this;
        }

        public Criteria andTbrHostIsNotNull() {
            addCriterion("tbr_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbrHostEqualTo(Short value) {
            addCriterion("tbr_host =", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotEqualTo(Short value) {
            addCriterion("tbr_host <>", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThan(Short value) {
            addCriterion("tbr_host >", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbr_host >=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThan(Short value) {
            addCriterion("tbr_host <", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThanOrEqualTo(Short value) {
            addCriterion("tbr_host <=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostIn(List<Short> values) {
            addCriterion("tbr_host in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotIn(List<Short> values) {
            addCriterion("tbr_host not in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostBetween(Short value1, Short value2) {
            addCriterion("tbr_host between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotBetween(Short value1, Short value2) {
            addCriterion("tbr_host not between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrNoIsNull() {
            addCriterion("tbr_no is null");
            return (Criteria) this;
        }

        public Criteria andTbrNoIsNotNull() {
            addCriterion("tbr_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbrNoEqualTo(String value) {
            addCriterion("tbr_no =", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoNotEqualTo(String value) {
            addCriterion("tbr_no <>", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoGreaterThan(String value) {
            addCriterion("tbr_no >", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_no >=", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoLessThan(String value) {
            addCriterion("tbr_no <", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoLessThanOrEqualTo(String value) {
            addCriterion("tbr_no <=", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoLike(String value) {
            addCriterion("tbr_no like", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoNotLike(String value) {
            addCriterion("tbr_no not like", value, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoIn(List<String> values) {
            addCriterion("tbr_no in", values, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoNotIn(List<String> values) {
            addCriterion("tbr_no not in", values, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoBetween(String value1, String value2) {
            addCriterion("tbr_no between", value1, value2, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrNoNotBetween(String value1, String value2) {
            addCriterion("tbr_no not between", value1, value2, "tbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoIsNull() {
            addCriterion("tbr_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoIsNotNull() {
            addCriterion("tbr_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoEqualTo(String value) {
            addCriterion("tbr_trade_no =", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoNotEqualTo(String value) {
            addCriterion("tbr_trade_no <>", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoGreaterThan(String value) {
            addCriterion("tbr_trade_no >", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_trade_no >=", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoLessThan(String value) {
            addCriterion("tbr_trade_no <", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoLessThanOrEqualTo(String value) {
            addCriterion("tbr_trade_no <=", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoLike(String value) {
            addCriterion("tbr_trade_no like", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoNotLike(String value) {
            addCriterion("tbr_trade_no not like", value, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoIn(List<String> values) {
            addCriterion("tbr_trade_no in", values, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoNotIn(List<String> values) {
            addCriterion("tbr_trade_no not in", values, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoBetween(String value1, String value2) {
            addCriterion("tbr_trade_no between", value1, value2, "tbrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbrTradeNoNotBetween(String value1, String value2) {
            addCriterion("tbr_trade_no not between", value1, value2, "tbrTradeNo");
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

        public Criteria andTbrMemberIsNull() {
            addCriterion("tbr_member is null");
            return (Criteria) this;
        }

        public Criteria andTbrMemberIsNotNull() {
            addCriterion("tbr_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbrMemberEqualTo(Integer value) {
            addCriterion("tbr_member =", value, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberNotEqualTo(Integer value) {
            addCriterion("tbr_member <>", value, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberGreaterThan(Integer value) {
            addCriterion("tbr_member >", value, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_member >=", value, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberLessThan(Integer value) {
            addCriterion("tbr_member <", value, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_member <=", value, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberIn(List<Integer> values) {
            addCriterion("tbr_member in", values, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberNotIn(List<Integer> values) {
            addCriterion("tbr_member not in", values, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbr_member between", value1, value2, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_member not between", value1, value2, "tbrMember");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeIsNull() {
            addCriterion("tbr_money_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeIsNotNull() {
            addCriterion("tbr_money_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeEqualTo(Byte value) {
            addCriterion("tbr_money_type =", value, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeNotEqualTo(Byte value) {
            addCriterion("tbr_money_type <>", value, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeGreaterThan(Byte value) {
            addCriterion("tbr_money_type >", value, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_money_type >=", value, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeLessThan(Byte value) {
            addCriterion("tbr_money_type <", value, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_money_type <=", value, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeIn(List<Byte> values) {
            addCriterion("tbr_money_type in", values, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeNotIn(List<Byte> values) {
            addCriterion("tbr_money_type not in", values, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbr_money_type between", value1, value2, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_money_type not between", value1, value2, "tbrMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectIsNull() {
            addCriterion("tbr_record_subject is null");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectIsNotNull() {
            addCriterion("tbr_record_subject is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectEqualTo(Integer value) {
            addCriterion("tbr_record_subject =", value, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectNotEqualTo(Integer value) {
            addCriterion("tbr_record_subject <>", value, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectGreaterThan(Integer value) {
            addCriterion("tbr_record_subject >", value, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_record_subject >=", value, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectLessThan(Integer value) {
            addCriterion("tbr_record_subject <", value, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_record_subject <=", value, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectIn(List<Integer> values) {
            addCriterion("tbr_record_subject in", values, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectNotIn(List<Integer> values) {
            addCriterion("tbr_record_subject not in", values, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectBetween(Integer value1, Integer value2) {
            addCriterion("tbr_record_subject between", value1, value2, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrRecordSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_record_subject not between", value1, value2, "tbrRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbrInIsNull() {
            addCriterion("tbr_in is null");
            return (Criteria) this;
        }

        public Criteria andTbrInIsNotNull() {
            addCriterion("tbr_in is not null");
            return (Criteria) this;
        }

        public Criteria andTbrInEqualTo(BigDecimal value) {
            addCriterion("tbr_in =", value, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInNotEqualTo(BigDecimal value) {
            addCriterion("tbr_in <>", value, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInGreaterThan(BigDecimal value) {
            addCriterion("tbr_in >", value, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbr_in >=", value, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInLessThan(BigDecimal value) {
            addCriterion("tbr_in <", value, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbr_in <=", value, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInIn(List<BigDecimal> values) {
            addCriterion("tbr_in in", values, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInNotIn(List<BigDecimal> values) {
            addCriterion("tbr_in not in", values, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbr_in between", value1, value2, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbr_in not between", value1, value2, "tbrIn");
            return (Criteria) this;
        }

        public Criteria andTbrOutIsNull() {
            addCriterion("tbr_out is null");
            return (Criteria) this;
        }

        public Criteria andTbrOutIsNotNull() {
            addCriterion("tbr_out is not null");
            return (Criteria) this;
        }

        public Criteria andTbrOutEqualTo(BigDecimal value) {
            addCriterion("tbr_out =", value, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutNotEqualTo(BigDecimal value) {
            addCriterion("tbr_out <>", value, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutGreaterThan(BigDecimal value) {
            addCriterion("tbr_out >", value, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbr_out >=", value, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutLessThan(BigDecimal value) {
            addCriterion("tbr_out <", value, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbr_out <=", value, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutIn(List<BigDecimal> values) {
            addCriterion("tbr_out in", values, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutNotIn(List<BigDecimal> values) {
            addCriterion("tbr_out not in", values, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbr_out between", value1, value2, "tbrOut");
            return (Criteria) this;
        }

        public Criteria andTbrOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbr_out not between", value1, value2, "tbrOut");
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

        public Criteria andTbrAmountEqualTo(BigDecimal value) {
            addCriterion("tbr_amount =", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountNotEqualTo(BigDecimal value) {
            addCriterion("tbr_amount <>", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountGreaterThan(BigDecimal value) {
            addCriterion("tbr_amount >", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbr_amount >=", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountLessThan(BigDecimal value) {
            addCriterion("tbr_amount <", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbr_amount <=", value, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountIn(List<BigDecimal> values) {
            addCriterion("tbr_amount in", values, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountNotIn(List<BigDecimal> values) {
            addCriterion("tbr_amount not in", values, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbr_amount between", value1, value2, "tbrAmount");
            return (Criteria) this;
        }

        public Criteria andTbrAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbr_amount not between", value1, value2, "tbrAmount");
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

        public Criteria andTbrRemarkIsNull() {
            addCriterion("tbr_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNotNull() {
            addCriterion("tbr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkEqualTo(String value) {
            addCriterion("tbr_remark =", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotEqualTo(String value) {
            addCriterion("tbr_remark <>", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThan(String value) {
            addCriterion("tbr_remark >", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_remark >=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThan(String value) {
            addCriterion("tbr_remark <", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbr_remark <=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLike(String value) {
            addCriterion("tbr_remark like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotLike(String value) {
            addCriterion("tbr_remark not like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIn(List<String> values) {
            addCriterion("tbr_remark in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotIn(List<String> values) {
            addCriterion("tbr_remark not in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkBetween(String value1, String value2) {
            addCriterion("tbr_remark between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotBetween(String value1, String value2) {
            addCriterion("tbr_remark not between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIsNull() {
            addCriterion("tbr_order is null");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIsNotNull() {
            addCriterion("tbr_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbrOrderEqualTo(Long value) {
            addCriterion("tbr_order =", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotEqualTo(Long value) {
            addCriterion("tbr_order <>", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderGreaterThan(Long value) {
            addCriterion("tbr_order >", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_order >=", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderLessThan(Long value) {
            addCriterion("tbr_order <", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbr_order <=", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIn(List<Long> values) {
            addCriterion("tbr_order in", values, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotIn(List<Long> values) {
            addCriterion("tbr_order not in", values, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderBetween(Long value1, Long value2) {
            addCriterion("tbr_order between", value1, value2, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbr_order not between", value1, value2, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderIsNull() {
            addCriterion("tbr_long_order is null");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderIsNotNull() {
            addCriterion("tbr_long_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderEqualTo(Long value) {
            addCriterion("tbr_long_order =", value, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderNotEqualTo(Long value) {
            addCriterion("tbr_long_order <>", value, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderGreaterThan(Long value) {
            addCriterion("tbr_long_order >", value, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_long_order >=", value, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderLessThan(Long value) {
            addCriterion("tbr_long_order <", value, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbr_long_order <=", value, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderIn(List<Long> values) {
            addCriterion("tbr_long_order in", values, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderNotIn(List<Long> values) {
            addCriterion("tbr_long_order not in", values, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderBetween(Long value1, Long value2) {
            addCriterion("tbr_long_order between", value1, value2, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrLongOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbr_long_order not between", value1, value2, "tbrLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbrRelateIsNull() {
            addCriterion("tbr_relate is null");
            return (Criteria) this;
        }

        public Criteria andTbrRelateIsNotNull() {
            addCriterion("tbr_relate is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRelateEqualTo(String value) {
            addCriterion("tbr_relate =", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateNotEqualTo(String value) {
            addCriterion("tbr_relate <>", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateGreaterThan(String value) {
            addCriterion("tbr_relate >", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_relate >=", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateLessThan(String value) {
            addCriterion("tbr_relate <", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateLessThanOrEqualTo(String value) {
            addCriterion("tbr_relate <=", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateLike(String value) {
            addCriterion("tbr_relate like", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateNotLike(String value) {
            addCriterion("tbr_relate not like", value, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateIn(List<String> values) {
            addCriterion("tbr_relate in", values, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateNotIn(List<String> values) {
            addCriterion("tbr_relate not in", values, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateBetween(String value1, String value2) {
            addCriterion("tbr_relate between", value1, value2, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrRelateNotBetween(String value1, String value2) {
            addCriterion("tbr_relate not between", value1, value2, "tbrRelate");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIsNull() {
            addCriterion("tbr_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIsNotNull() {
            addCriterion("tbr_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEditorEqualTo(Integer value) {
            addCriterion("tbr_editor =", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotEqualTo(Integer value) {
            addCriterion("tbr_editor <>", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorGreaterThan(Integer value) {
            addCriterion("tbr_editor >", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_editor >=", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLessThan(Integer value) {
            addCriterion("tbr_editor <", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_editor <=", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIn(List<Integer> values) {
            addCriterion("tbr_editor in", values, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotIn(List<Integer> values) {
            addCriterion("tbr_editor not in", values, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbr_editor between", value1, value2, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_editor not between", value1, value2, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrSerialIsNull() {
            addCriterion("tbr_serial is null");
            return (Criteria) this;
        }

        public Criteria andTbrSerialIsNotNull() {
            addCriterion("tbr_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTbrSerialEqualTo(String value) {
            addCriterion("tbr_serial =", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialNotEqualTo(String value) {
            addCriterion("tbr_serial <>", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialGreaterThan(String value) {
            addCriterion("tbr_serial >", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_serial >=", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialLessThan(String value) {
            addCriterion("tbr_serial <", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialLessThanOrEqualTo(String value) {
            addCriterion("tbr_serial <=", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialLike(String value) {
            addCriterion("tbr_serial like", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialNotLike(String value) {
            addCriterion("tbr_serial not like", value, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialIn(List<String> values) {
            addCriterion("tbr_serial in", values, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialNotIn(List<String> values) {
            addCriterion("tbr_serial not in", values, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialBetween(String value1, String value2) {
            addCriterion("tbr_serial between", value1, value2, "tbrSerial");
            return (Criteria) this;
        }

        public Criteria andTbrSerialNotBetween(String value1, String value2) {
            addCriterion("tbr_serial not between", value1, value2, "tbrSerial");
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