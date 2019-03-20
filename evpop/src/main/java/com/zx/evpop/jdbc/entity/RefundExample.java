package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundExample() {
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

        public Criteria andTbrDepositTypeIsNull() {
            addCriterion("tbr_deposit_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeIsNotNull() {
            addCriterion("tbr_deposit_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeEqualTo(Byte value) {
            addCriterion("tbr_deposit_type =", value, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeNotEqualTo(Byte value) {
            addCriterion("tbr_deposit_type <>", value, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeGreaterThan(Byte value) {
            addCriterion("tbr_deposit_type >", value, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_deposit_type >=", value, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeLessThan(Byte value) {
            addCriterion("tbr_deposit_type <", value, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_deposit_type <=", value, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeIn(List<Byte> values) {
            addCriterion("tbr_deposit_type in", values, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeNotIn(List<Byte> values) {
            addCriterion("tbr_deposit_type not in", values, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbr_deposit_type between", value1, value2, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_deposit_type not between", value1, value2, "tbrDepositType");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeIsNull() {
            addCriterion("tbr_deposit_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeIsNotNull() {
            addCriterion("tbr_deposit_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeEqualTo(Date value) {
            addCriterion("tbr_deposit_time =", value, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeNotEqualTo(Date value) {
            addCriterion("tbr_deposit_time <>", value, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeGreaterThan(Date value) {
            addCriterion("tbr_deposit_time >", value, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_deposit_time >=", value, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeLessThan(Date value) {
            addCriterion("tbr_deposit_time <", value, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_deposit_time <=", value, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeIn(List<Date> values) {
            addCriterion("tbr_deposit_time in", values, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeNotIn(List<Date> values) {
            addCriterion("tbr_deposit_time not in", values, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_deposit_time between", value1, value2, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrDepositTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_deposit_time not between", value1, value2, "tbrDepositTime");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseIsNull() {
            addCriterion("tbr_last_use is null");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseIsNotNull() {
            addCriterion("tbr_last_use is not null");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseEqualTo(Date value) {
            addCriterion("tbr_last_use =", value, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseNotEqualTo(Date value) {
            addCriterion("tbr_last_use <>", value, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseGreaterThan(Date value) {
            addCriterion("tbr_last_use >", value, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_last_use >=", value, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseLessThan(Date value) {
            addCriterion("tbr_last_use <", value, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseLessThanOrEqualTo(Date value) {
            addCriterion("tbr_last_use <=", value, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseIn(List<Date> values) {
            addCriterion("tbr_last_use in", values, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseNotIn(List<Date> values) {
            addCriterion("tbr_last_use not in", values, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseBetween(Date value1, Date value2) {
            addCriterion("tbr_last_use between", value1, value2, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrLastUseNotBetween(Date value1, Date value2) {
            addCriterion("tbr_last_use not between", value1, value2, "tbrLastUse");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedIsNull() {
            addCriterion("tbr_refunded is null");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedIsNotNull() {
            addCriterion("tbr_refunded is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedEqualTo(Double value) {
            addCriterion("tbr_refunded =", value, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedNotEqualTo(Double value) {
            addCriterion("tbr_refunded <>", value, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedGreaterThan(Double value) {
            addCriterion("tbr_refunded >", value, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedGreaterThanOrEqualTo(Double value) {
            addCriterion("tbr_refunded >=", value, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedLessThan(Double value) {
            addCriterion("tbr_refunded <", value, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedLessThanOrEqualTo(Double value) {
            addCriterion("tbr_refunded <=", value, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedIn(List<Double> values) {
            addCriterion("tbr_refunded in", values, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedNotIn(List<Double> values) {
            addCriterion("tbr_refunded not in", values, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedBetween(Double value1, Double value2) {
            addCriterion("tbr_refunded between", value1, value2, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrRefundedNotBetween(Double value1, Double value2) {
            addCriterion("tbr_refunded not between", value1, value2, "tbrRefunded");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeIsNull() {
            addCriterion("tbr_return_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeIsNotNull() {
            addCriterion("tbr_return_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeEqualTo(Byte value) {
            addCriterion("tbr_return_type =", value, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeNotEqualTo(Byte value) {
            addCriterion("tbr_return_type <>", value, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeGreaterThan(Byte value) {
            addCriterion("tbr_return_type >", value, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_return_type >=", value, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeLessThan(Byte value) {
            addCriterion("tbr_return_type <", value, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_return_type <=", value, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeIn(List<Byte> values) {
            addCriterion("tbr_return_type in", values, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeNotIn(List<Byte> values) {
            addCriterion("tbr_return_type not in", values, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbr_return_type between", value1, value2, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrReturnTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_return_type not between", value1, value2, "tbrReturnType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeIsNull() {
            addCriterion("tbr_bank_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeIsNotNull() {
            addCriterion("tbr_bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeEqualTo(Long value) {
            addCriterion("tbr_bank_type =", value, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeNotEqualTo(Long value) {
            addCriterion("tbr_bank_type <>", value, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeGreaterThan(Long value) {
            addCriterion("tbr_bank_type >", value, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_bank_type >=", value, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeLessThan(Long value) {
            addCriterion("tbr_bank_type <", value, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeLessThanOrEqualTo(Long value) {
            addCriterion("tbr_bank_type <=", value, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeIn(List<Long> values) {
            addCriterion("tbr_bank_type in", values, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeNotIn(List<Long> values) {
            addCriterion("tbr_bank_type not in", values, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeBetween(Long value1, Long value2) {
            addCriterion("tbr_bank_type between", value1, value2, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankTypeNotBetween(Long value1, Long value2) {
            addCriterion("tbr_bank_type not between", value1, value2, "tbrBankType");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchIsNull() {
            addCriterion("tbr_bank_branch is null");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchIsNotNull() {
            addCriterion("tbr_bank_branch is not null");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchEqualTo(String value) {
            addCriterion("tbr_bank_branch =", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchNotEqualTo(String value) {
            addCriterion("tbr_bank_branch <>", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchGreaterThan(String value) {
            addCriterion("tbr_bank_branch >", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_bank_branch >=", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchLessThan(String value) {
            addCriterion("tbr_bank_branch <", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchLessThanOrEqualTo(String value) {
            addCriterion("tbr_bank_branch <=", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchLike(String value) {
            addCriterion("tbr_bank_branch like", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchNotLike(String value) {
            addCriterion("tbr_bank_branch not like", value, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchIn(List<String> values) {
            addCriterion("tbr_bank_branch in", values, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchNotIn(List<String> values) {
            addCriterion("tbr_bank_branch not in", values, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchBetween(String value1, String value2) {
            addCriterion("tbr_bank_branch between", value1, value2, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrBankBranchNotBetween(String value1, String value2) {
            addCriterion("tbr_bank_branch not between", value1, value2, "tbrBankBranch");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoIsNull() {
            addCriterion("tbr_account_no is null");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoIsNotNull() {
            addCriterion("tbr_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoEqualTo(String value) {
            addCriterion("tbr_account_no =", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoNotEqualTo(String value) {
            addCriterion("tbr_account_no <>", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoGreaterThan(String value) {
            addCriterion("tbr_account_no >", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_account_no >=", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoLessThan(String value) {
            addCriterion("tbr_account_no <", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoLessThanOrEqualTo(String value) {
            addCriterion("tbr_account_no <=", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoLike(String value) {
            addCriterion("tbr_account_no like", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoNotLike(String value) {
            addCriterion("tbr_account_no not like", value, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoIn(List<String> values) {
            addCriterion("tbr_account_no in", values, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoNotIn(List<String> values) {
            addCriterion("tbr_account_no not in", values, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoBetween(String value1, String value2) {
            addCriterion("tbr_account_no between", value1, value2, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNoNotBetween(String value1, String value2) {
            addCriterion("tbr_account_no not between", value1, value2, "tbrAccountNo");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameIsNull() {
            addCriterion("tbr_account_name is null");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameIsNotNull() {
            addCriterion("tbr_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameEqualTo(String value) {
            addCriterion("tbr_account_name =", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameNotEqualTo(String value) {
            addCriterion("tbr_account_name <>", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameGreaterThan(String value) {
            addCriterion("tbr_account_name >", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_account_name >=", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameLessThan(String value) {
            addCriterion("tbr_account_name <", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameLessThanOrEqualTo(String value) {
            addCriterion("tbr_account_name <=", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameLike(String value) {
            addCriterion("tbr_account_name like", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameNotLike(String value) {
            addCriterion("tbr_account_name not like", value, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameIn(List<String> values) {
            addCriterion("tbr_account_name in", values, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameNotIn(List<String> values) {
            addCriterion("tbr_account_name not in", values, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameBetween(String value1, String value2) {
            addCriterion("tbr_account_name between", value1, value2, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrAccountNameNotBetween(String value1, String value2) {
            addCriterion("tbr_account_name not between", value1, value2, "tbrAccountName");
            return (Criteria) this;
        }

        public Criteria andTbrMobileIsNull() {
            addCriterion("tbr_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTbrMobileIsNotNull() {
            addCriterion("tbr_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTbrMobileEqualTo(String value) {
            addCriterion("tbr_mobile =", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotEqualTo(String value) {
            addCriterion("tbr_mobile <>", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileGreaterThan(String value) {
            addCriterion("tbr_mobile >", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_mobile >=", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileLessThan(String value) {
            addCriterion("tbr_mobile <", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileLessThanOrEqualTo(String value) {
            addCriterion("tbr_mobile <=", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileLike(String value) {
            addCriterion("tbr_mobile like", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotLike(String value) {
            addCriterion("tbr_mobile not like", value, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileIn(List<String> values) {
            addCriterion("tbr_mobile in", values, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotIn(List<String> values) {
            addCriterion("tbr_mobile not in", values, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileBetween(String value1, String value2) {
            addCriterion("tbr_mobile between", value1, value2, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrMobileNotBetween(String value1, String value2) {
            addCriterion("tbr_mobile not between", value1, value2, "tbrMobile");
            return (Criteria) this;
        }

        public Criteria andTbrRecordIsNull() {
            addCriterion("tbr_record is null");
            return (Criteria) this;
        }

        public Criteria andTbrRecordIsNotNull() {
            addCriterion("tbr_record is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRecordEqualTo(Integer value) {
            addCriterion("tbr_record =", value, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordNotEqualTo(Integer value) {
            addCriterion("tbr_record <>", value, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordGreaterThan(Integer value) {
            addCriterion("tbr_record >", value, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_record >=", value, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordLessThan(Integer value) {
            addCriterion("tbr_record <", value, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_record <=", value, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordIn(List<Integer> values) {
            addCriterion("tbr_record in", values, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordNotIn(List<Integer> values) {
            addCriterion("tbr_record not in", values, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordBetween(Integer value1, Integer value2) {
            addCriterion("tbr_record between", value1, value2, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_record not between", value1, value2, "tbrRecord");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerIsNull() {
            addCriterion("tbr_checker is null");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerIsNotNull() {
            addCriterion("tbr_checker is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerEqualTo(Integer value) {
            addCriterion("tbr_checker =", value, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerNotEqualTo(Integer value) {
            addCriterion("tbr_checker <>", value, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerGreaterThan(Integer value) {
            addCriterion("tbr_checker >", value, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_checker >=", value, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerLessThan(Integer value) {
            addCriterion("tbr_checker <", value, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_checker <=", value, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerIn(List<Integer> values) {
            addCriterion("tbr_checker in", values, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerNotIn(List<Integer> values) {
            addCriterion("tbr_checker not in", values, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerBetween(Integer value1, Integer value2) {
            addCriterion("tbr_checker between", value1, value2, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrCheckerNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_checker not between", value1, value2, "tbrChecker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerIsNull() {
            addCriterion("tbr_backer is null");
            return (Criteria) this;
        }

        public Criteria andTbrBackerIsNotNull() {
            addCriterion("tbr_backer is not null");
            return (Criteria) this;
        }

        public Criteria andTbrBackerEqualTo(Integer value) {
            addCriterion("tbr_backer =", value, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerNotEqualTo(Integer value) {
            addCriterion("tbr_backer <>", value, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerGreaterThan(Integer value) {
            addCriterion("tbr_backer >", value, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_backer >=", value, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerLessThan(Integer value) {
            addCriterion("tbr_backer <", value, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_backer <=", value, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerIn(List<Integer> values) {
            addCriterion("tbr_backer in", values, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerNotIn(List<Integer> values) {
            addCriterion("tbr_backer not in", values, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerBetween(Integer value1, Integer value2) {
            addCriterion("tbr_backer between", value1, value2, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrBackerNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_backer not between", value1, value2, "tbrBacker");
            return (Criteria) this;
        }

        public Criteria andTbrPostilIsNull() {
            addCriterion("tbr_postil is null");
            return (Criteria) this;
        }

        public Criteria andTbrPostilIsNotNull() {
            addCriterion("tbr_postil is not null");
            return (Criteria) this;
        }

        public Criteria andTbrPostilEqualTo(String value) {
            addCriterion("tbr_postil =", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilNotEqualTo(String value) {
            addCriterion("tbr_postil <>", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilGreaterThan(String value) {
            addCriterion("tbr_postil >", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_postil >=", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilLessThan(String value) {
            addCriterion("tbr_postil <", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilLessThanOrEqualTo(String value) {
            addCriterion("tbr_postil <=", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilLike(String value) {
            addCriterion("tbr_postil like", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilNotLike(String value) {
            addCriterion("tbr_postil not like", value, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilIn(List<String> values) {
            addCriterion("tbr_postil in", values, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilNotIn(List<String> values) {
            addCriterion("tbr_postil not in", values, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilBetween(String value1, String value2) {
            addCriterion("tbr_postil between", value1, value2, "tbrPostil");
            return (Criteria) this;
        }

        public Criteria andTbrPostilNotBetween(String value1, String value2) {
            addCriterion("tbr_postil not between", value1, value2, "tbrPostil");
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

        public Criteria andTbrCheckTimeIsNull() {
            addCriterion("tbr_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeIsNotNull() {
            addCriterion("tbr_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeEqualTo(Date value) {
            addCriterion("tbr_check_time =", value, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeNotEqualTo(Date value) {
            addCriterion("tbr_check_time <>", value, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeGreaterThan(Date value) {
            addCriterion("tbr_check_time >", value, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_check_time >=", value, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeLessThan(Date value) {
            addCriterion("tbr_check_time <", value, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_check_time <=", value, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeIn(List<Date> values) {
            addCriterion("tbr_check_time in", values, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeNotIn(List<Date> values) {
            addCriterion("tbr_check_time not in", values, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_check_time between", value1, value2, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_check_time not between", value1, value2, "tbrCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeIsNull() {
            addCriterion("tbr_back_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeIsNotNull() {
            addCriterion("tbr_back_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeEqualTo(Date value) {
            addCriterion("tbr_back_time =", value, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeNotEqualTo(Date value) {
            addCriterion("tbr_back_time <>", value, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeGreaterThan(Date value) {
            addCriterion("tbr_back_time >", value, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_back_time >=", value, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeLessThan(Date value) {
            addCriterion("tbr_back_time <", value, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_back_time <=", value, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeIn(List<Date> values) {
            addCriterion("tbr_back_time in", values, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeNotIn(List<Date> values) {
            addCriterion("tbr_back_time not in", values, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_back_time between", value1, value2, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrBackTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_back_time not between", value1, value2, "tbrBackTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeIsNull() {
            addCriterion("tbr_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeIsNotNull() {
            addCriterion("tbr_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeEqualTo(Date value) {
            addCriterion("tbr_end_time =", value, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeNotEqualTo(Date value) {
            addCriterion("tbr_end_time <>", value, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeGreaterThan(Date value) {
            addCriterion("tbr_end_time >", value, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_end_time >=", value, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeLessThan(Date value) {
            addCriterion("tbr_end_time <", value, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_end_time <=", value, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeIn(List<Date> values) {
            addCriterion("tbr_end_time in", values, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeNotIn(List<Date> values) {
            addCriterion("tbr_end_time not in", values, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_end_time between", value1, value2, "tbrEndTime");
            return (Criteria) this;
        }

        public Criteria andTbrEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_end_time not between", value1, value2, "tbrEndTime");
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

        public Criteria andTbrLongTypeIsNull() {
            addCriterion("tbr_long_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeIsNotNull() {
            addCriterion("tbr_long_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeEqualTo(Short value) {
            addCriterion("tbr_long_type =", value, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeNotEqualTo(Short value) {
            addCriterion("tbr_long_type <>", value, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeGreaterThan(Short value) {
            addCriterion("tbr_long_type >", value, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbr_long_type >=", value, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeLessThan(Short value) {
            addCriterion("tbr_long_type <", value, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbr_long_type <=", value, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeIn(List<Short> values) {
            addCriterion("tbr_long_type in", values, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeNotIn(List<Short> values) {
            addCriterion("tbr_long_type not in", values, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeBetween(Short value1, Short value2) {
            addCriterion("tbr_long_type between", value1, value2, "tbrLongType");
            return (Criteria) this;
        }

        public Criteria andTbrLongTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbr_long_type not between", value1, value2, "tbrLongType");
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

        public Criteria andTbrTbrNoIsNull() {
            addCriterion("tbr_tbr_no is null");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoIsNotNull() {
            addCriterion("tbr_tbr_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoEqualTo(String value) {
            addCriterion("tbr_tbr_no =", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoNotEqualTo(String value) {
            addCriterion("tbr_tbr_no <>", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoGreaterThan(String value) {
            addCriterion("tbr_tbr_no >", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_tbr_no >=", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoLessThan(String value) {
            addCriterion("tbr_tbr_no <", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoLessThanOrEqualTo(String value) {
            addCriterion("tbr_tbr_no <=", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoLike(String value) {
            addCriterion("tbr_tbr_no like", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoNotLike(String value) {
            addCriterion("tbr_tbr_no not like", value, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoIn(List<String> values) {
            addCriterion("tbr_tbr_no in", values, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoNotIn(List<String> values) {
            addCriterion("tbr_tbr_no not in", values, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoBetween(String value1, String value2) {
            addCriterion("tbr_tbr_no between", value1, value2, "tbrTbrNo");
            return (Criteria) this;
        }

        public Criteria andTbrTbrNoNotBetween(String value1, String value2) {
            addCriterion("tbr_tbr_no not between", value1, value2, "tbrTbrNo");
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