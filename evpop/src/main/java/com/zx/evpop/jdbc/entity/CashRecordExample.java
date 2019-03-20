package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashRecordExample() {
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

        public Criteria andTbcrIdIsNull() {
            addCriterion("tbcr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcrIdIsNotNull() {
            addCriterion("tbcr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrIdEqualTo(Long value) {
            addCriterion("tbcr_id =", value, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdNotEqualTo(Long value) {
            addCriterion("tbcr_id <>", value, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdGreaterThan(Long value) {
            addCriterion("tbcr_id >", value, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcr_id >=", value, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdLessThan(Long value) {
            addCriterion("tbcr_id <", value, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdLessThanOrEqualTo(Long value) {
            addCriterion("tbcr_id <=", value, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdIn(List<Long> values) {
            addCriterion("tbcr_id in", values, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdNotIn(List<Long> values) {
            addCriterion("tbcr_id not in", values, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdBetween(Long value1, Long value2) {
            addCriterion("tbcr_id between", value1, value2, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrIdNotBetween(Long value1, Long value2) {
            addCriterion("tbcr_id not between", value1, value2, "tbcrId");
            return (Criteria) this;
        }

        public Criteria andTbcrHostIsNull() {
            addCriterion("tbcr_host is null");
            return (Criteria) this;
        }

        public Criteria andTbcrHostIsNotNull() {
            addCriterion("tbcr_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrHostEqualTo(Long value) {
            addCriterion("tbcr_host =", value, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostNotEqualTo(Long value) {
            addCriterion("tbcr_host <>", value, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostGreaterThan(Long value) {
            addCriterion("tbcr_host >", value, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcr_host >=", value, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostLessThan(Long value) {
            addCriterion("tbcr_host <", value, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostLessThanOrEqualTo(Long value) {
            addCriterion("tbcr_host <=", value, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostIn(List<Long> values) {
            addCriterion("tbcr_host in", values, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostNotIn(List<Long> values) {
            addCriterion("tbcr_host not in", values, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostBetween(Long value1, Long value2) {
            addCriterion("tbcr_host between", value1, value2, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrHostNotBetween(Long value1, Long value2) {
            addCriterion("tbcr_host not between", value1, value2, "tbcrHost");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoIsNull() {
            addCriterion("tbcr_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoIsNotNull() {
            addCriterion("tbcr_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoEqualTo(String value) {
            addCriterion("tbcr_trade_no =", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoNotEqualTo(String value) {
            addCriterion("tbcr_trade_no <>", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoGreaterThan(String value) {
            addCriterion("tbcr_trade_no >", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbcr_trade_no >=", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoLessThan(String value) {
            addCriterion("tbcr_trade_no <", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoLessThanOrEqualTo(String value) {
            addCriterion("tbcr_trade_no <=", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoLike(String value) {
            addCriterion("tbcr_trade_no like", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoNotLike(String value) {
            addCriterion("tbcr_trade_no not like", value, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoIn(List<String> values) {
            addCriterion("tbcr_trade_no in", values, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoNotIn(List<String> values) {
            addCriterion("tbcr_trade_no not in", values, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoBetween(String value1, String value2) {
            addCriterion("tbcr_trade_no between", value1, value2, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrTradeNoNotBetween(String value1, String value2) {
            addCriterion("tbcr_trade_no not between", value1, value2, "tbcrTradeNo");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountIsNull() {
            addCriterion("tbcr_ammount is null");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountIsNotNull() {
            addCriterion("tbcr_ammount is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountEqualTo(Double value) {
            addCriterion("tbcr_ammount =", value, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountNotEqualTo(Double value) {
            addCriterion("tbcr_ammount <>", value, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountGreaterThan(Double value) {
            addCriterion("tbcr_ammount >", value, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbcr_ammount >=", value, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountLessThan(Double value) {
            addCriterion("tbcr_ammount <", value, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountLessThanOrEqualTo(Double value) {
            addCriterion("tbcr_ammount <=", value, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountIn(List<Double> values) {
            addCriterion("tbcr_ammount in", values, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountNotIn(List<Double> values) {
            addCriterion("tbcr_ammount not in", values, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountBetween(Double value1, Double value2) {
            addCriterion("tbcr_ammount between", value1, value2, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrAmmountNotBetween(Double value1, Double value2) {
            addCriterion("tbcr_ammount not between", value1, value2, "tbcrAmmount");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleIsNull() {
            addCriterion("tbcr_title is null");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleIsNotNull() {
            addCriterion("tbcr_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleEqualTo(String value) {
            addCriterion("tbcr_title =", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleNotEqualTo(String value) {
            addCriterion("tbcr_title <>", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleGreaterThan(String value) {
            addCriterion("tbcr_title >", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbcr_title >=", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleLessThan(String value) {
            addCriterion("tbcr_title <", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleLessThanOrEqualTo(String value) {
            addCriterion("tbcr_title <=", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleLike(String value) {
            addCriterion("tbcr_title like", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleNotLike(String value) {
            addCriterion("tbcr_title not like", value, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleIn(List<String> values) {
            addCriterion("tbcr_title in", values, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleNotIn(List<String> values) {
            addCriterion("tbcr_title not in", values, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleBetween(String value1, String value2) {
            addCriterion("tbcr_title between", value1, value2, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrTitleNotBetween(String value1, String value2) {
            addCriterion("tbcr_title not between", value1, value2, "tbcrTitle");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherIsNull() {
            addCriterion("tbcr_voucher is null");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherIsNotNull() {
            addCriterion("tbcr_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherEqualTo(String value) {
            addCriterion("tbcr_voucher =", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherNotEqualTo(String value) {
            addCriterion("tbcr_voucher <>", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherGreaterThan(String value) {
            addCriterion("tbcr_voucher >", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("tbcr_voucher >=", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherLessThan(String value) {
            addCriterion("tbcr_voucher <", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherLessThanOrEqualTo(String value) {
            addCriterion("tbcr_voucher <=", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherLike(String value) {
            addCriterion("tbcr_voucher like", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherNotLike(String value) {
            addCriterion("tbcr_voucher not like", value, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherIn(List<String> values) {
            addCriterion("tbcr_voucher in", values, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherNotIn(List<String> values) {
            addCriterion("tbcr_voucher not in", values, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherBetween(String value1, String value2) {
            addCriterion("tbcr_voucher between", value1, value2, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrVoucherNotBetween(String value1, String value2) {
            addCriterion("tbcr_voucher not between", value1, value2, "tbcrVoucher");
            return (Criteria) this;
        }

        public Criteria andTbcrImageIsNull() {
            addCriterion("tbcr_image is null");
            return (Criteria) this;
        }

        public Criteria andTbcrImageIsNotNull() {
            addCriterion("tbcr_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrImageEqualTo(String value) {
            addCriterion("tbcr_image =", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageNotEqualTo(String value) {
            addCriterion("tbcr_image <>", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageGreaterThan(String value) {
            addCriterion("tbcr_image >", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbcr_image >=", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageLessThan(String value) {
            addCriterion("tbcr_image <", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageLessThanOrEqualTo(String value) {
            addCriterion("tbcr_image <=", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageLike(String value) {
            addCriterion("tbcr_image like", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageNotLike(String value) {
            addCriterion("tbcr_image not like", value, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageIn(List<String> values) {
            addCriterion("tbcr_image in", values, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageNotIn(List<String> values) {
            addCriterion("tbcr_image not in", values, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageBetween(String value1, String value2) {
            addCriterion("tbcr_image between", value1, value2, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrImageNotBetween(String value1, String value2) {
            addCriterion("tbcr_image not between", value1, value2, "tbcrImage");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderIsNull() {
            addCriterion("tbcr_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderIsNotNull() {
            addCriterion("tbcr_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderEqualTo(Long value) {
            addCriterion("tbcr_adder =", value, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderNotEqualTo(Long value) {
            addCriterion("tbcr_adder <>", value, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderGreaterThan(Long value) {
            addCriterion("tbcr_adder >", value, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcr_adder >=", value, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderLessThan(Long value) {
            addCriterion("tbcr_adder <", value, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbcr_adder <=", value, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderIn(List<Long> values) {
            addCriterion("tbcr_adder in", values, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderNotIn(List<Long> values) {
            addCriterion("tbcr_adder not in", values, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderBetween(Long value1, Long value2) {
            addCriterion("tbcr_adder between", value1, value2, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbcr_adder not between", value1, value2, "tbcrAdder");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerIsNull() {
            addCriterion("tbcr_checker is null");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerIsNotNull() {
            addCriterion("tbcr_checker is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerEqualTo(Long value) {
            addCriterion("tbcr_checker =", value, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerNotEqualTo(Long value) {
            addCriterion("tbcr_checker <>", value, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerGreaterThan(Long value) {
            addCriterion("tbcr_checker >", value, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcr_checker >=", value, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerLessThan(Long value) {
            addCriterion("tbcr_checker <", value, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerLessThanOrEqualTo(Long value) {
            addCriterion("tbcr_checker <=", value, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerIn(List<Long> values) {
            addCriterion("tbcr_checker in", values, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerNotIn(List<Long> values) {
            addCriterion("tbcr_checker not in", values, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerBetween(Long value1, Long value2) {
            addCriterion("tbcr_checker between", value1, value2, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrCheckerNotBetween(Long value1, Long value2) {
            addCriterion("tbcr_checker not between", value1, value2, "tbcrChecker");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkIsNull() {
            addCriterion("tbcr_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkIsNotNull() {
            addCriterion("tbcr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkEqualTo(String value) {
            addCriterion("tbcr_remark =", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkNotEqualTo(String value) {
            addCriterion("tbcr_remark <>", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkGreaterThan(String value) {
            addCriterion("tbcr_remark >", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbcr_remark >=", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkLessThan(String value) {
            addCriterion("tbcr_remark <", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbcr_remark <=", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkLike(String value) {
            addCriterion("tbcr_remark like", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkNotLike(String value) {
            addCriterion("tbcr_remark not like", value, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkIn(List<String> values) {
            addCriterion("tbcr_remark in", values, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkNotIn(List<String> values) {
            addCriterion("tbcr_remark not in", values, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkBetween(String value1, String value2) {
            addCriterion("tbcr_remark between", value1, value2, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrRemarkNotBetween(String value1, String value2) {
            addCriterion("tbcr_remark not between", value1, value2, "tbcrRemark");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeIsNull() {
            addCriterion("tbcr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeIsNotNull() {
            addCriterion("tbcr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeEqualTo(Date value) {
            addCriterion("tbcr_update_time =", value, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbcr_update_time <>", value, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeGreaterThan(Date value) {
            addCriterion("tbcr_update_time >", value, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcr_update_time >=", value, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeLessThan(Date value) {
            addCriterion("tbcr_update_time <", value, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcr_update_time <=", value, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeIn(List<Date> values) {
            addCriterion("tbcr_update_time in", values, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbcr_update_time not in", values, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbcr_update_time between", value1, value2, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcr_update_time not between", value1, value2, "tbcrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeIsNull() {
            addCriterion("tbcr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeIsNotNull() {
            addCriterion("tbcr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeEqualTo(Date value) {
            addCriterion("tbcr_add_time =", value, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeNotEqualTo(Date value) {
            addCriterion("tbcr_add_time <>", value, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeGreaterThan(Date value) {
            addCriterion("tbcr_add_time >", value, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcr_add_time >=", value, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeLessThan(Date value) {
            addCriterion("tbcr_add_time <", value, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcr_add_time <=", value, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeIn(List<Date> values) {
            addCriterion("tbcr_add_time in", values, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeNotIn(List<Date> values) {
            addCriterion("tbcr_add_time not in", values, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbcr_add_time between", value1, value2, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcr_add_time not between", value1, value2, "tbcrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusIsNull() {
            addCriterion("tbcr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusIsNotNull() {
            addCriterion("tbcr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusEqualTo(Short value) {
            addCriterion("tbcr_status =", value, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusNotEqualTo(Short value) {
            addCriterion("tbcr_status <>", value, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusGreaterThan(Short value) {
            addCriterion("tbcr_status >", value, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbcr_status >=", value, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusLessThan(Short value) {
            addCriterion("tbcr_status <", value, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbcr_status <=", value, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusIn(List<Short> values) {
            addCriterion("tbcr_status in", values, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusNotIn(List<Short> values) {
            addCriterion("tbcr_status not in", values, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusBetween(Short value1, Short value2) {
            addCriterion("tbcr_status between", value1, value2, "tbcrStatus");
            return (Criteria) this;
        }

        public Criteria andTbcrStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbcr_status not between", value1, value2, "tbcrStatus");
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