package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayRecordExample() {
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

        public Criteria andTbprIdEqualTo(Integer value) {
            addCriterion("tbpr_id =", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdNotEqualTo(Integer value) {
            addCriterion("tbpr_id <>", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdGreaterThan(Integer value) {
            addCriterion("tbpr_id >", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbpr_id >=", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdLessThan(Integer value) {
            addCriterion("tbpr_id <", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbpr_id <=", value, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdIn(List<Integer> values) {
            addCriterion("tbpr_id in", values, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdNotIn(List<Integer> values) {
            addCriterion("tbpr_id not in", values, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdBetween(Integer value1, Integer value2) {
            addCriterion("tbpr_id between", value1, value2, "tbprId");
            return (Criteria) this;
        }

        public Criteria andTbprIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTbprHostEqualTo(Short value) {
            addCriterion("tbpr_host =", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostNotEqualTo(Short value) {
            addCriterion("tbpr_host <>", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostGreaterThan(Short value) {
            addCriterion("tbpr_host >", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbpr_host >=", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostLessThan(Short value) {
            addCriterion("tbpr_host <", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostLessThanOrEqualTo(Short value) {
            addCriterion("tbpr_host <=", value, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostIn(List<Short> values) {
            addCriterion("tbpr_host in", values, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostNotIn(List<Short> values) {
            addCriterion("tbpr_host not in", values, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostBetween(Short value1, Short value2) {
            addCriterion("tbpr_host between", value1, value2, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprHostNotBetween(Short value1, Short value2) {
            addCriterion("tbpr_host not between", value1, value2, "tbprHost");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeIsNull() {
            addCriterion("tbpr_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeIsNotNull() {
            addCriterion("tbpr_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeEqualTo(Byte value) {
            addCriterion("tbpr_pay_type =", value, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeNotEqualTo(Byte value) {
            addCriterion("tbpr_pay_type <>", value, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeGreaterThan(Byte value) {
            addCriterion("tbpr_pay_type >", value, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbpr_pay_type >=", value, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeLessThan(Byte value) {
            addCriterion("tbpr_pay_type <", value, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbpr_pay_type <=", value, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeIn(List<Byte> values) {
            addCriterion("tbpr_pay_type in", values, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeNotIn(List<Byte> values) {
            addCriterion("tbpr_pay_type not in", values, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbpr_pay_type between", value1, value2, "tbprPayType");
            return (Criteria) this;
        }

        public Criteria andTbprPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbpr_pay_type not between", value1, value2, "tbprPayType");
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

        public Criteria andTbprBankTypeEqualTo(Byte value) {
            addCriterion("tbpr_bank_type =", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeNotEqualTo(Byte value) {
            addCriterion("tbpr_bank_type <>", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeGreaterThan(Byte value) {
            addCriterion("tbpr_bank_type >", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbpr_bank_type >=", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeLessThan(Byte value) {
            addCriterion("tbpr_bank_type <", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbpr_bank_type <=", value, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeIn(List<Byte> values) {
            addCriterion("tbpr_bank_type in", values, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeNotIn(List<Byte> values) {
            addCriterion("tbpr_bank_type not in", values, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbpr_bank_type between", value1, value2, "tbprBankType");
            return (Criteria) this;
        }

        public Criteria andTbprBankTypeNotBetween(Byte value1, Byte value2) {
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

        public Criteria andTbprMemberEqualTo(Integer value) {
            addCriterion("tbpr_member =", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberNotEqualTo(Integer value) {
            addCriterion("tbpr_member <>", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberGreaterThan(Integer value) {
            addCriterion("tbpr_member >", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbpr_member >=", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberLessThan(Integer value) {
            addCriterion("tbpr_member <", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbpr_member <=", value, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberIn(List<Integer> values) {
            addCriterion("tbpr_member in", values, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberNotIn(List<Integer> values) {
            addCriterion("tbpr_member not in", values, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbpr_member between", value1, value2, "tbprMember");
            return (Criteria) this;
        }

        public Criteria andTbprMemberNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTbprAmountEqualTo(BigDecimal value) {
            addCriterion("tbpr_amount =", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountNotEqualTo(BigDecimal value) {
            addCriterion("tbpr_amount <>", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountGreaterThan(BigDecimal value) {
            addCriterion("tbpr_amount >", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbpr_amount >=", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountLessThan(BigDecimal value) {
            addCriterion("tbpr_amount <", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbpr_amount <=", value, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountIn(List<BigDecimal> values) {
            addCriterion("tbpr_amount in", values, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountNotIn(List<BigDecimal> values) {
            addCriterion("tbpr_amount not in", values, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbpr_amount between", value1, value2, "tbprAmount");
            return (Criteria) this;
        }

        public Criteria andTbprAmountNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andTbprRefundEqualTo(BigDecimal value) {
            addCriterion("tbpr_refund =", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundNotEqualTo(BigDecimal value) {
            addCriterion("tbpr_refund <>", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundGreaterThan(BigDecimal value) {
            addCriterion("tbpr_refund >", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbpr_refund >=", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundLessThan(BigDecimal value) {
            addCriterion("tbpr_refund <", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbpr_refund <=", value, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundIn(List<BigDecimal> values) {
            addCriterion("tbpr_refund in", values, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundNotIn(List<BigDecimal> values) {
            addCriterion("tbpr_refund not in", values, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbpr_refund between", value1, value2, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprRefundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbpr_refund not between", value1, value2, "tbprRefund");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodIsNull() {
            addCriterion("tbpr_pay_method is null");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodIsNotNull() {
            addCriterion("tbpr_pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodEqualTo(String value) {
            addCriterion("tbpr_pay_method =", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodNotEqualTo(String value) {
            addCriterion("tbpr_pay_method <>", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodGreaterThan(String value) {
            addCriterion("tbpr_pay_method >", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_pay_method >=", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodLessThan(String value) {
            addCriterion("tbpr_pay_method <", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodLessThanOrEqualTo(String value) {
            addCriterion("tbpr_pay_method <=", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodLike(String value) {
            addCriterion("tbpr_pay_method like", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodNotLike(String value) {
            addCriterion("tbpr_pay_method not like", value, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodIn(List<String> values) {
            addCriterion("tbpr_pay_method in", values, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodNotIn(List<String> values) {
            addCriterion("tbpr_pay_method not in", values, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodBetween(String value1, String value2) {
            addCriterion("tbpr_pay_method between", value1, value2, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprPayMethodNotBetween(String value1, String value2) {
            addCriterion("tbpr_pay_method not between", value1, value2, "tbprPayMethod");
            return (Criteria) this;
        }

        public Criteria andTbprBlankIsNull() {
            addCriterion("tbpr_blank is null");
            return (Criteria) this;
        }

        public Criteria andTbprBlankIsNotNull() {
            addCriterion("tbpr_blank is not null");
            return (Criteria) this;
        }

        public Criteria andTbprBlankEqualTo(String value) {
            addCriterion("tbpr_blank =", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankNotEqualTo(String value) {
            addCriterion("tbpr_blank <>", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankGreaterThan(String value) {
            addCriterion("tbpr_blank >", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_blank >=", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankLessThan(String value) {
            addCriterion("tbpr_blank <", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankLessThanOrEqualTo(String value) {
            addCriterion("tbpr_blank <=", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankLike(String value) {
            addCriterion("tbpr_blank like", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankNotLike(String value) {
            addCriterion("tbpr_blank not like", value, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankIn(List<String> values) {
            addCriterion("tbpr_blank in", values, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankNotIn(List<String> values) {
            addCriterion("tbpr_blank not in", values, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankBetween(String value1, String value2) {
            addCriterion("tbpr_blank between", value1, value2, "tbprBlank");
            return (Criteria) this;
        }

        public Criteria andTbprBlankNotBetween(String value1, String value2) {
            addCriterion("tbpr_blank not between", value1, value2, "tbprBlank");
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

        public Criteria andTbprBuyerAccountIsNull() {
            addCriterion("tbpr_buyer_account is null");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountIsNotNull() {
            addCriterion("tbpr_buyer_account is not null");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountEqualTo(String value) {
            addCriterion("tbpr_buyer_account =", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountNotEqualTo(String value) {
            addCriterion("tbpr_buyer_account <>", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountGreaterThan(String value) {
            addCriterion("tbpr_buyer_account >", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_buyer_account >=", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountLessThan(String value) {
            addCriterion("tbpr_buyer_account <", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountLessThanOrEqualTo(String value) {
            addCriterion("tbpr_buyer_account <=", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountLike(String value) {
            addCriterion("tbpr_buyer_account like", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountNotLike(String value) {
            addCriterion("tbpr_buyer_account not like", value, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountIn(List<String> values) {
            addCriterion("tbpr_buyer_account in", values, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountNotIn(List<String> values) {
            addCriterion("tbpr_buyer_account not in", values, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountBetween(String value1, String value2) {
            addCriterion("tbpr_buyer_account between", value1, value2, "tbprBuyerAccount");
            return (Criteria) this;
        }

        public Criteria andTbprBuyerAccountNotBetween(String value1, String value2) {
            addCriterion("tbpr_buyer_account not between", value1, value2, "tbprBuyerAccount");
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

        public Criteria andTbprRecordEqualTo(Integer value) {
            addCriterion("tbpr_record =", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordNotEqualTo(Integer value) {
            addCriterion("tbpr_record <>", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordGreaterThan(Integer value) {
            addCriterion("tbpr_record >", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbpr_record >=", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordLessThan(Integer value) {
            addCriterion("tbpr_record <", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordLessThanOrEqualTo(Integer value) {
            addCriterion("tbpr_record <=", value, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordIn(List<Integer> values) {
            addCriterion("tbpr_record in", values, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordNotIn(List<Integer> values) {
            addCriterion("tbpr_record not in", values, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordBetween(Integer value1, Integer value2) {
            addCriterion("tbpr_record between", value1, value2, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("tbpr_record not between", value1, value2, "tbprRecord");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdIsNull() {
            addCriterion("tbpr_client_id is null");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdIsNotNull() {
            addCriterion("tbpr_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdEqualTo(Integer value) {
            addCriterion("tbpr_client_id =", value, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdNotEqualTo(Integer value) {
            addCriterion("tbpr_client_id <>", value, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdGreaterThan(Integer value) {
            addCriterion("tbpr_client_id >", value, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbpr_client_id >=", value, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdLessThan(Integer value) {
            addCriterion("tbpr_client_id <", value, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbpr_client_id <=", value, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdIn(List<Integer> values) {
            addCriterion("tbpr_client_id in", values, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdNotIn(List<Integer> values) {
            addCriterion("tbpr_client_id not in", values, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdBetween(Integer value1, Integer value2) {
            addCriterion("tbpr_client_id between", value1, value2, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbpr_client_id not between", value1, value2, "tbprClientId");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackIsNull() {
            addCriterion("tbpr_third_back is null");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackIsNotNull() {
            addCriterion("tbpr_third_back is not null");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackEqualTo(String value) {
            addCriterion("tbpr_third_back =", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackNotEqualTo(String value) {
            addCriterion("tbpr_third_back <>", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackGreaterThan(String value) {
            addCriterion("tbpr_third_back >", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackGreaterThanOrEqualTo(String value) {
            addCriterion("tbpr_third_back >=", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackLessThan(String value) {
            addCriterion("tbpr_third_back <", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackLessThanOrEqualTo(String value) {
            addCriterion("tbpr_third_back <=", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackLike(String value) {
            addCriterion("tbpr_third_back like", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackNotLike(String value) {
            addCriterion("tbpr_third_back not like", value, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackIn(List<String> values) {
            addCriterion("tbpr_third_back in", values, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackNotIn(List<String> values) {
            addCriterion("tbpr_third_back not in", values, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackBetween(String value1, String value2) {
            addCriterion("tbpr_third_back between", value1, value2, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprThirdBackNotBetween(String value1, String value2) {
            addCriterion("tbpr_third_back not between", value1, value2, "tbprThirdBack");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeIsNull() {
            addCriterion("tbpr_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeIsNotNull() {
            addCriterion("tbpr_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeEqualTo(Date value) {
            addCriterion("tbpr_arrival_time =", value, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeNotEqualTo(Date value) {
            addCriterion("tbpr_arrival_time <>", value, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeGreaterThan(Date value) {
            addCriterion("tbpr_arrival_time >", value, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbpr_arrival_time >=", value, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeLessThan(Date value) {
            addCriterion("tbpr_arrival_time <", value, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbpr_arrival_time <=", value, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeIn(List<Date> values) {
            addCriterion("tbpr_arrival_time in", values, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeNotIn(List<Date> values) {
            addCriterion("tbpr_arrival_time not in", values, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("tbpr_arrival_time between", value1, value2, "tbprArrivalTime");
            return (Criteria) this;
        }

        public Criteria andTbprArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbpr_arrival_time not between", value1, value2, "tbprArrivalTime");
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

        public Criteria andTbprStatusEqualTo(Byte value) {
            addCriterion("tbpr_status =", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusNotEqualTo(Byte value) {
            addCriterion("tbpr_status <>", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusGreaterThan(Byte value) {
            addCriterion("tbpr_status >", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbpr_status >=", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusLessThan(Byte value) {
            addCriterion("tbpr_status <", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbpr_status <=", value, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusIn(List<Byte> values) {
            addCriterion("tbpr_status in", values, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusNotIn(List<Byte> values) {
            addCriterion("tbpr_status not in", values, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbpr_status between", value1, value2, "tbprStatus");
            return (Criteria) this;
        }

        public Criteria andTbprStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbpr_status not between", value1, value2, "tbprStatus");
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