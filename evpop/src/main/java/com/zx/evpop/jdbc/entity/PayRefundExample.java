package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayRefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayRefundExample() {
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

        public Criteria andTbprIdIsNull() {
            addCriterion("tbpr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbprIdIsNotNull() {
            addCriterion("tbpr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbprIdEqualTo(Long value) {
            addCriterion("tbpr_id =", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdNotEqualTo(Long value) {
            addCriterion("tbpr_id <>", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdGreaterThan(Long value) {
            addCriterion("tbpr_id >", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpr_id >=", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdLessThan(Long value) {
            addCriterion("tbpr_id <", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdLessThanOrEqualTo(Long value) {
            addCriterion("tbpr_id <=", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdIn(List<Long> values) {
            addCriterion("tbpr_id in", values, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdNotIn(List<Long> values) {
            addCriterion("tbpr_id not in", values, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdBetween(Long value1, Long value2) {
            addCriterion("tbpr_id between", value1, value2, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdNotBetween(Long value1, Long value2) {
            addCriterion("tbpr_id not between", value1, value2, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprHostIsNull() {
            addCriterion("tbpr_host is null");
            return (Criteria) this;
        }

        public Criteria andTbprHostIsNotNull() {
            addCriterion("tbpr_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbprHostEqualTo(Long value) {
            addCriterion("tbpr_host =", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostNotEqualTo(Long value) {
            addCriterion("tbpr_host <>", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostGreaterThan(Long value) {
            addCriterion("tbpr_host >", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpr_host >=", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostLessThan(Long value) {
            addCriterion("tbpr_host <", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostLessThanOrEqualTo(Long value) {
            addCriterion("tbpr_host <=", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostIn(List<Long> values) {
            addCriterion("tbpr_host in", values, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostNotIn(List<Long> values) {
            addCriterion("tbpr_host not in", values, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostBetween(Long value1, Long value2) {
            addCriterion("tbpr_host between", value1, value2, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostNotBetween(Long value1, Long value2) {
            addCriterion("tbpr_host not between", value1, value2, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeIsNull() {
            addCriterion("tbpr_bank_type is null");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeIsNotNull() {
            addCriterion("tbpr_bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeEqualTo(Short value) {
            addCriterion("tbpr_bank_type =", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeNotEqualTo(Short value) {
            addCriterion("tbpr_bank_type <>", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeGreaterThan(Short value) {
            addCriterion("tbpr_bank_type >", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbpr_bank_type >=", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeLessThan(Short value) {
            addCriterion("tbpr_bank_type <", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbpr_bank_type <=", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeIn(List<Short> values) {
            addCriterion("tbpr_bank_type in", values, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeNotIn(List<Short> values) {
            addCriterion("tbpr_bank_type not in", values, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeBetween(Short value1, Short value2) {
            addCriterion("tbpr_bank_type between", value1, value2, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbpr_bank_type not between", value1, value2, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoIsNull() {
            addCriterion("tbpr_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoIsNotNull() {
            addCriterion("tbpr_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoEqualTo(String value) {
            addCriterion("tbpr_trade_no =", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoNotEqualTo(String value) {
            addCriterion("tbpr_trade_no <>", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoGreaterThan(String value) {
            addCriterion("tbpr_trade_no >", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_trade_no >=", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoLessThan(String value) {
            addCriterion("tbpr_trade_no <", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoLessThanOrEqualTo(String value) {
            addCriterion("tbpr_trade_no <=", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoLike(String value) {
            addCriterion("tbpr_trade_no like", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoNotLike(String value) {
            addCriterion("tbpr_trade_no not like", value, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoIn(List<String> values) {
            addCriterion("tbpr_trade_no in", values, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoNotIn(List<String> values) {
            addCriterion("tbpr_trade_no not in", values, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoBetween(String value1, String value2) {
            addCriterion("tbpr_trade_no between", value1, value2, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprTradeNoNotBetween(String value1, String value2) {
            addCriterion("tbpr_trade_no not between", value1, value2, "tbprTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbprMemberIsNull() {
            addCriterion("tbpr_member is null");
            return (Criteria) this;
        }

        public Criteria andTbprMemberIsNotNull() {
            addCriterion("tbpr_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbprMemberEqualTo(Long value) {
            addCriterion("tbpr_member =", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberNotEqualTo(Long value) {
            addCriterion("tbpr_member <>", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberGreaterThan(Long value) {
            addCriterion("tbpr_member >", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpr_member >=", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberLessThan(Long value) {
            addCriterion("tbpr_member <", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberLessThanOrEqualTo(Long value) {
            addCriterion("tbpr_member <=", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberIn(List<Long> values) {
            addCriterion("tbpr_member in", values, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberNotIn(List<Long> values) {
            addCriterion("tbpr_member not in", values, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberBetween(Long value1, Long value2) {
            addCriterion("tbpr_member between", value1, value2, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberNotBetween(Long value1, Long value2) {
            addCriterion("tbpr_member not between", value1, value2, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameIsNull() {
            addCriterion("tbpr_real_name is null");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameIsNotNull() {
            addCriterion("tbpr_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameEqualTo(String value) {
            addCriterion("tbpr_real_name =", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameNotEqualTo(String value) {
            addCriterion("tbpr_real_name <>", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameGreaterThan(String value) {
            addCriterion("tbpr_real_name >", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_real_name >=", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameLessThan(String value) {
            addCriterion("tbpr_real_name <", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameLessThanOrEqualTo(String value) {
            addCriterion("tbpr_real_name <=", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameLike(String value) {
            addCriterion("tbpr_real_name like", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameNotLike(String value) {
            addCriterion("tbpr_real_name not like", value, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameIn(List<String> values) {
            addCriterion("tbpr_real_name in", values, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameNotIn(List<String> values) {
            addCriterion("tbpr_real_name not in", values, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameBetween(String value1, String value2) {
            addCriterion("tbpr_real_name between", value1, value2, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprRealNameNotBetween(String value1, String value2) {
            addCriterion("tbpr_real_name not between", value1, value2, "tbprRealName");
            return (Criteria) this;
        }

        public Criteria andTbprAmountIsNull() {
            addCriterion("tbpr_amount is null");
            return (Criteria) this;
        }

        public Criteria andTbprAmountIsNotNull() {
            addCriterion("tbpr_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTbprAmountEqualTo(Double value) {
            addCriterion("tbpr_amount =", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountNotEqualTo(Double value) {
            addCriterion("tbpr_amount <>", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountGreaterThan(Double value) {
            addCriterion("tbpr_amount >", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbpr_amount >=", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountLessThan(Double value) {
            addCriterion("tbpr_amount <", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountLessThanOrEqualTo(Double value) {
            addCriterion("tbpr_amount <=", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountIn(List<Double> values) {
            addCriterion("tbpr_amount in", values, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountNotIn(List<Double> values) {
            addCriterion("tbpr_amount not in", values, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountBetween(Double value1, Double value2) {
            addCriterion("tbpr_amount between", value1, value2, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountNotBetween(Double value1, Double value2) {
            addCriterion("tbpr_amount not between", value1, value2, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprRefundIsNull() {
            addCriterion("tbpr_refund is null");
            return (Criteria) this;
        }

        public Criteria andTbprRefundIsNotNull() {
            addCriterion("tbpr_refund is not null");
            return (Criteria) this;
        }

        public Criteria andTbprRefundEqualTo(Long value) {
            addCriterion("tbpr_refund =", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundNotEqualTo(Long value) {
            addCriterion("tbpr_refund <>", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundGreaterThan(Long value) {
            addCriterion("tbpr_refund >", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpr_refund >=", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundLessThan(Long value) {
            addCriterion("tbpr_refund <", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundLessThanOrEqualTo(Long value) {
            addCriterion("tbpr_refund <=", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundIn(List<Long> values) {
            addCriterion("tbpr_refund in", values, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundNotIn(List<Long> values) {
            addCriterion("tbpr_refund not in", values, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundBetween(Long value1, Long value2) {
            addCriterion("tbpr_refund between", value1, value2, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundNotBetween(Long value1, Long value2) {
            addCriterion("tbpr_refund not between", value1, value2, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordIsNull() {
            addCriterion("tbpr_pay_record is null");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordIsNotNull() {
            addCriterion("tbpr_pay_record is not null");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordEqualTo(Long value) {
            addCriterion("tbpr_pay_record =", value, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordNotEqualTo(Long value) {
            addCriterion("tbpr_pay_record <>", value, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordGreaterThan(Long value) {
            addCriterion("tbpr_pay_record >", value, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpr_pay_record >=", value, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordLessThan(Long value) {
            addCriterion("tbpr_pay_record <", value, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordLessThanOrEqualTo(Long value) {
            addCriterion("tbpr_pay_record <=", value, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordIn(List<Long> values) {
            addCriterion("tbpr_pay_record in", values, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordNotIn(List<Long> values) {
            addCriterion("tbpr_pay_record not in", values, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordBetween(Long value1, Long value2) {
            addCriterion("tbpr_pay_record between", value1, value2, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprPayRecordNotBetween(Long value1, Long value2) {
            addCriterion("tbpr_pay_record not between", value1, value2, "tbprPayRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordIsNull() {
            addCriterion("tbpr_record is null");
            return (Criteria) this;
        }

        public Criteria andTbprRecordIsNotNull() {
            addCriterion("tbpr_record is not null");
            return (Criteria) this;
        }

        public Criteria andTbprRecordEqualTo(Long value) {
            addCriterion("tbpr_record =", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordNotEqualTo(Long value) {
            addCriterion("tbpr_record <>", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordGreaterThan(Long value) {
            addCriterion("tbpr_record >", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpr_record >=", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordLessThan(Long value) {
            addCriterion("tbpr_record <", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordLessThanOrEqualTo(Long value) {
            addCriterion("tbpr_record <=", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordIn(List<Long> values) {
            addCriterion("tbpr_record in", values, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordNotIn(List<Long> values) {
            addCriterion("tbpr_record not in", values, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordBetween(Long value1, Long value2) {
            addCriterion("tbpr_record between", value1, value2, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordNotBetween(Long value1, Long value2) {
            addCriterion("tbpr_record not between", value1, value2, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoIsNull() {
            addCriterion("tbpr_alipay_no is null");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoIsNotNull() {
            addCriterion("tbpr_alipay_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoEqualTo(String value) {
            addCriterion("tbpr_alipay_no =", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoNotEqualTo(String value) {
            addCriterion("tbpr_alipay_no <>", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoGreaterThan(String value) {
            addCriterion("tbpr_alipay_no >", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_alipay_no >=", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoLessThan(String value) {
            addCriterion("tbpr_alipay_no <", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoLessThanOrEqualTo(String value) {
            addCriterion("tbpr_alipay_no <=", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoLike(String value) {
            addCriterion("tbpr_alipay_no like", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoNotLike(String value) {
            addCriterion("tbpr_alipay_no not like", value, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoIn(List<String> values) {
            addCriterion("tbpr_alipay_no in", values, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoNotIn(List<String> values) {
            addCriterion("tbpr_alipay_no not in", values, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoBetween(String value1, String value2) {
            addCriterion("tbpr_alipay_no between", value1, value2, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprAlipayNoNotBetween(String value1, String value2) {
            addCriterion("tbpr_alipay_no not between", value1, value2, "tbprAlipayNo");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeIsNull() {
            addCriterion("tbpr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeIsNotNull() {
            addCriterion("tbpr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeEqualTo(Date value) {
            addCriterion("tbpr_update_time =", value, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbpr_update_time <>", value, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeGreaterThan(Date value) {
            addCriterion("tbpr_update_time >", value, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbpr_update_time >=", value, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeLessThan(Date value) {
            addCriterion("tbpr_update_time <", value, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbpr_update_time <=", value, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeIn(List<Date> values) {
            addCriterion("tbpr_update_time in", values, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbpr_update_time not in", values, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbpr_update_time between", value1, value2, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbpr_update_time not between", value1, value2, "tbprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeIsNull() {
            addCriterion("tbpr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeIsNotNull() {
            addCriterion("tbpr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeEqualTo(Date value) {
            addCriterion("tbpr_add_time =", value, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeNotEqualTo(Date value) {
            addCriterion("tbpr_add_time <>", value, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeGreaterThan(Date value) {
            addCriterion("tbpr_add_time >", value, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbpr_add_time >=", value, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeLessThan(Date value) {
            addCriterion("tbpr_add_time <", value, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbpr_add_time <=", value, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeIn(List<Date> values) {
            addCriterion("tbpr_add_time in", values, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeNotIn(List<Date> values) {
            addCriterion("tbpr_add_time not in", values, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbpr_add_time between", value1, value2, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbpr_add_time not between", value1, value2, "tbprAddTime");
            return (Criteria) this;
        }

        public Criteria andTbprStatusIsNull() {
            addCriterion("tbpr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbprStatusIsNotNull() {
            addCriterion("tbpr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbprStatusEqualTo(Short value) {
            addCriterion("tbpr_status =", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusNotEqualTo(Short value) {
            addCriterion("tbpr_status <>", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusGreaterThan(Short value) {
            addCriterion("tbpr_status >", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbpr_status >=", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusLessThan(Short value) {
            addCriterion("tbpr_status <", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbpr_status <=", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusIn(List<Short> values) {
            addCriterion("tbpr_status in", values, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusNotIn(List<Short> values) {
            addCriterion("tbpr_status not in", values, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusBetween(Short value1, Short value2) {
            addCriterion("tbpr_status between", value1, value2, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbpr_status not between", value1, value2, "tbprStatus");
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