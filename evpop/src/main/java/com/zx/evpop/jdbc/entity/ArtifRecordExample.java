package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtifRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtifRecordExample() {
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

        public Criteria andTbarIdIsNull() {
            addCriterion("tbar_id is null");
            return (Criteria) this;
        }

        public Criteria andTbarIdIsNotNull() {
            addCriterion("tbar_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbarIdEqualTo(Integer value) {
            addCriterion("tbar_id =", value, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdNotEqualTo(Integer value) {
            addCriterion("tbar_id <>", value, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdGreaterThan(Integer value) {
            addCriterion("tbar_id >", value, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_id >=", value, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdLessThan(Integer value) {
            addCriterion("tbar_id <", value, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_id <=", value, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdIn(List<Integer> values) {
            addCriterion("tbar_id in", values, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdNotIn(List<Integer> values) {
            addCriterion("tbar_id not in", values, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdBetween(Integer value1, Integer value2) {
            addCriterion("tbar_id between", value1, value2, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_id not between", value1, value2, "tbarId");
            return (Criteria) this;
        }

        public Criteria andTbarHostIsNull() {
            addCriterion("tbar_host is null");
            return (Criteria) this;
        }

        public Criteria andTbarHostIsNotNull() {
            addCriterion("tbar_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbarHostEqualTo(Short value) {
            addCriterion("tbar_host =", value, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostNotEqualTo(Short value) {
            addCriterion("tbar_host <>", value, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostGreaterThan(Short value) {
            addCriterion("tbar_host >", value, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbar_host >=", value, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostLessThan(Short value) {
            addCriterion("tbar_host <", value, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostLessThanOrEqualTo(Short value) {
            addCriterion("tbar_host <=", value, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostIn(List<Short> values) {
            addCriterion("tbar_host in", values, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostNotIn(List<Short> values) {
            addCriterion("tbar_host not in", values, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostBetween(Short value1, Short value2) {
            addCriterion("tbar_host between", value1, value2, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarHostNotBetween(Short value1, Short value2) {
            addCriterion("tbar_host not between", value1, value2, "tbarHost");
            return (Criteria) this;
        }

        public Criteria andTbarTitleIsNull() {
            addCriterion("tbar_title is null");
            return (Criteria) this;
        }

        public Criteria andTbarTitleIsNotNull() {
            addCriterion("tbar_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbarTitleEqualTo(String value) {
            addCriterion("tbar_title =", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleNotEqualTo(String value) {
            addCriterion("tbar_title <>", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleGreaterThan(String value) {
            addCriterion("tbar_title >", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbar_title >=", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleLessThan(String value) {
            addCriterion("tbar_title <", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleLessThanOrEqualTo(String value) {
            addCriterion("tbar_title <=", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleLike(String value) {
            addCriterion("tbar_title like", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleNotLike(String value) {
            addCriterion("tbar_title not like", value, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleIn(List<String> values) {
            addCriterion("tbar_title in", values, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleNotIn(List<String> values) {
            addCriterion("tbar_title not in", values, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleBetween(String value1, String value2) {
            addCriterion("tbar_title between", value1, value2, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarTitleNotBetween(String value1, String value2) {
            addCriterion("tbar_title not between", value1, value2, "tbarTitle");
            return (Criteria) this;
        }

        public Criteria andTbarMemberIsNull() {
            addCriterion("tbar_member is null");
            return (Criteria) this;
        }

        public Criteria andTbarMemberIsNotNull() {
            addCriterion("tbar_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbarMemberEqualTo(Integer value) {
            addCriterion("tbar_member =", value, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberNotEqualTo(Integer value) {
            addCriterion("tbar_member <>", value, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberGreaterThan(Integer value) {
            addCriterion("tbar_member >", value, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_member >=", value, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberLessThan(Integer value) {
            addCriterion("tbar_member <", value, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_member <=", value, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberIn(List<Integer> values) {
            addCriterion("tbar_member in", values, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberNotIn(List<Integer> values) {
            addCriterion("tbar_member not in", values, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbar_member between", value1, value2, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_member not between", value1, value2, "tbarMember");
            return (Criteria) this;
        }

        public Criteria andTbarCountIsNull() {
            addCriterion("tbar_count is null");
            return (Criteria) this;
        }

        public Criteria andTbarCountIsNotNull() {
            addCriterion("tbar_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbarCountEqualTo(Double value) {
            addCriterion("tbar_count =", value, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountNotEqualTo(Double value) {
            addCriterion("tbar_count <>", value, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountGreaterThan(Double value) {
            addCriterion("tbar_count >", value, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbar_count >=", value, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountLessThan(Double value) {
            addCriterion("tbar_count <", value, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountLessThanOrEqualTo(Double value) {
            addCriterion("tbar_count <=", value, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountIn(List<Double> values) {
            addCriterion("tbar_count in", values, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountNotIn(List<Double> values) {
            addCriterion("tbar_count not in", values, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountBetween(Double value1, Double value2) {
            addCriterion("tbar_count between", value1, value2, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarCountNotBetween(Double value1, Double value2) {
            addCriterion("tbar_count not between", value1, value2, "tbarCount");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeIsNull() {
            addCriterion("tbar_money_type is null");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeIsNotNull() {
            addCriterion("tbar_money_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeEqualTo(Byte value) {
            addCriterion("tbar_money_type =", value, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeNotEqualTo(Byte value) {
            addCriterion("tbar_money_type <>", value, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeGreaterThan(Byte value) {
            addCriterion("tbar_money_type >", value, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbar_money_type >=", value, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeLessThan(Byte value) {
            addCriterion("tbar_money_type <", value, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbar_money_type <=", value, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeIn(List<Byte> values) {
            addCriterion("tbar_money_type in", values, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeNotIn(List<Byte> values) {
            addCriterion("tbar_money_type not in", values, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbar_money_type between", value1, value2, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarMoneyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbar_money_type not between", value1, value2, "tbarMoneyType");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectIsNull() {
            addCriterion("tbar_record_subject is null");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectIsNotNull() {
            addCriterion("tbar_record_subject is not null");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectEqualTo(Integer value) {
            addCriterion("tbar_record_subject =", value, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectNotEqualTo(Integer value) {
            addCriterion("tbar_record_subject <>", value, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectGreaterThan(Integer value) {
            addCriterion("tbar_record_subject >", value, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_record_subject >=", value, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectLessThan(Integer value) {
            addCriterion("tbar_record_subject <", value, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_record_subject <=", value, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectIn(List<Integer> values) {
            addCriterion("tbar_record_subject in", values, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectNotIn(List<Integer> values) {
            addCriterion("tbar_record_subject not in", values, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectBetween(Integer value1, Integer value2) {
            addCriterion("tbar_record_subject between", value1, value2, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarRecordSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_record_subject not between", value1, value2, "tbarRecordSubject");
            return (Criteria) this;
        }

        public Criteria andTbarOrderIsNull() {
            addCriterion("tbar_order is null");
            return (Criteria) this;
        }

        public Criteria andTbarOrderIsNotNull() {
            addCriterion("tbar_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbarOrderEqualTo(Integer value) {
            addCriterion("tbar_order =", value, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderNotEqualTo(Integer value) {
            addCriterion("tbar_order <>", value, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderGreaterThan(Integer value) {
            addCriterion("tbar_order >", value, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_order >=", value, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderLessThan(Integer value) {
            addCriterion("tbar_order <", value, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_order <=", value, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderIn(List<Integer> values) {
            addCriterion("tbar_order in", values, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderNotIn(List<Integer> values) {
            addCriterion("tbar_order not in", values, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderBetween(Integer value1, Integer value2) {
            addCriterion("tbar_order between", value1, value2, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_order not between", value1, value2, "tbarOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderIsNull() {
            addCriterion("tbar_long_order is null");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderIsNotNull() {
            addCriterion("tbar_long_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderEqualTo(Long value) {
            addCriterion("tbar_long_order =", value, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderNotEqualTo(Long value) {
            addCriterion("tbar_long_order <>", value, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderGreaterThan(Long value) {
            addCriterion("tbar_long_order >", value, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbar_long_order >=", value, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderLessThan(Long value) {
            addCriterion("tbar_long_order <", value, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbar_long_order <=", value, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderIn(List<Long> values) {
            addCriterion("tbar_long_order in", values, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderNotIn(List<Long> values) {
            addCriterion("tbar_long_order not in", values, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderBetween(Long value1, Long value2) {
            addCriterion("tbar_long_order between", value1, value2, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarLongOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbar_long_order not between", value1, value2, "tbarLongOrder");
            return (Criteria) this;
        }

        public Criteria andTbarRelateIsNull() {
            addCriterion("tbar_relate is null");
            return (Criteria) this;
        }

        public Criteria andTbarRelateIsNotNull() {
            addCriterion("tbar_relate is not null");
            return (Criteria) this;
        }

        public Criteria andTbarRelateEqualTo(String value) {
            addCriterion("tbar_relate =", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateNotEqualTo(String value) {
            addCriterion("tbar_relate <>", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateGreaterThan(String value) {
            addCriterion("tbar_relate >", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateGreaterThanOrEqualTo(String value) {
            addCriterion("tbar_relate >=", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateLessThan(String value) {
            addCriterion("tbar_relate <", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateLessThanOrEqualTo(String value) {
            addCriterion("tbar_relate <=", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateLike(String value) {
            addCriterion("tbar_relate like", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateNotLike(String value) {
            addCriterion("tbar_relate not like", value, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateIn(List<String> values) {
            addCriterion("tbar_relate in", values, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateNotIn(List<String> values) {
            addCriterion("tbar_relate not in", values, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateBetween(String value1, String value2) {
            addCriterion("tbar_relate between", value1, value2, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarRelateNotBetween(String value1, String value2) {
            addCriterion("tbar_relate not between", value1, value2, "tbarRelate");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherIsNull() {
            addCriterion("tbar_voucher is null");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherIsNotNull() {
            addCriterion("tbar_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherEqualTo(Integer value) {
            addCriterion("tbar_voucher =", value, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherNotEqualTo(Integer value) {
            addCriterion("tbar_voucher <>", value, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherGreaterThan(Integer value) {
            addCriterion("tbar_voucher >", value, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_voucher >=", value, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherLessThan(Integer value) {
            addCriterion("tbar_voucher <", value, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_voucher <=", value, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherIn(List<Integer> values) {
            addCriterion("tbar_voucher in", values, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherNotIn(List<Integer> values) {
            addCriterion("tbar_voucher not in", values, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherBetween(Integer value1, Integer value2) {
            addCriterion("tbar_voucher between", value1, value2, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarVoucherNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_voucher not between", value1, value2, "tbarVoucher");
            return (Criteria) this;
        }

        public Criteria andTbarAdderIsNull() {
            addCriterion("tbar_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbarAdderIsNotNull() {
            addCriterion("tbar_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbarAdderEqualTo(Integer value) {
            addCriterion("tbar_adder =", value, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderNotEqualTo(Integer value) {
            addCriterion("tbar_adder <>", value, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderGreaterThan(Integer value) {
            addCriterion("tbar_adder >", value, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_adder >=", value, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderLessThan(Integer value) {
            addCriterion("tbar_adder <", value, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_adder <=", value, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderIn(List<Integer> values) {
            addCriterion("tbar_adder in", values, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderNotIn(List<Integer> values) {
            addCriterion("tbar_adder not in", values, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderBetween(Integer value1, Integer value2) {
            addCriterion("tbar_adder between", value1, value2, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarAdderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_adder not between", value1, value2, "tbarAdder");
            return (Criteria) this;
        }

        public Criteria andTbarEditorIsNull() {
            addCriterion("tbar_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbarEditorIsNotNull() {
            addCriterion("tbar_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbarEditorEqualTo(Integer value) {
            addCriterion("tbar_editor =", value, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorNotEqualTo(Integer value) {
            addCriterion("tbar_editor <>", value, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorGreaterThan(Integer value) {
            addCriterion("tbar_editor >", value, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_editor >=", value, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorLessThan(Integer value) {
            addCriterion("tbar_editor <", value, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_editor <=", value, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorIn(List<Integer> values) {
            addCriterion("tbar_editor in", values, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorNotIn(List<Integer> values) {
            addCriterion("tbar_editor not in", values, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbar_editor between", value1, value2, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_editor not between", value1, value2, "tbarEditor");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerIsNull() {
            addCriterion("tbar_confirmer is null");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerIsNotNull() {
            addCriterion("tbar_confirmer is not null");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerEqualTo(Integer value) {
            addCriterion("tbar_confirmer =", value, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerNotEqualTo(Integer value) {
            addCriterion("tbar_confirmer <>", value, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerGreaterThan(Integer value) {
            addCriterion("tbar_confirmer >", value, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbar_confirmer >=", value, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerLessThan(Integer value) {
            addCriterion("tbar_confirmer <", value, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerLessThanOrEqualTo(Integer value) {
            addCriterion("tbar_confirmer <=", value, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerIn(List<Integer> values) {
            addCriterion("tbar_confirmer in", values, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerNotIn(List<Integer> values) {
            addCriterion("tbar_confirmer not in", values, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerBetween(Integer value1, Integer value2) {
            addCriterion("tbar_confirmer between", value1, value2, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmerNotBetween(Integer value1, Integer value2) {
            addCriterion("tbar_confirmer not between", value1, value2, "tbarConfirmer");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeIsNull() {
            addCriterion("tbar_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeIsNotNull() {
            addCriterion("tbar_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeEqualTo(Date value) {
            addCriterion("tbar_update_time =", value, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbar_update_time <>", value, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeGreaterThan(Date value) {
            addCriterion("tbar_update_time >", value, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbar_update_time >=", value, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeLessThan(Date value) {
            addCriterion("tbar_update_time <", value, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbar_update_time <=", value, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeIn(List<Date> values) {
            addCriterion("tbar_update_time in", values, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbar_update_time not in", values, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbar_update_time between", value1, value2, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbar_update_time not between", value1, value2, "tbarUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeIsNull() {
            addCriterion("tbar_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeIsNotNull() {
            addCriterion("tbar_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeEqualTo(Date value) {
            addCriterion("tbar_add_time =", value, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeNotEqualTo(Date value) {
            addCriterion("tbar_add_time <>", value, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeGreaterThan(Date value) {
            addCriterion("tbar_add_time >", value, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbar_add_time >=", value, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeLessThan(Date value) {
            addCriterion("tbar_add_time <", value, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbar_add_time <=", value, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeIn(List<Date> values) {
            addCriterion("tbar_add_time in", values, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeNotIn(List<Date> values) {
            addCriterion("tbar_add_time not in", values, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbar_add_time between", value1, value2, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbar_add_time not between", value1, value2, "tbarAddTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeIsNull() {
            addCriterion("tbar_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeIsNotNull() {
            addCriterion("tbar_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeEqualTo(Date value) {
            addCriterion("tbar_confirm_time =", value, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeNotEqualTo(Date value) {
            addCriterion("tbar_confirm_time <>", value, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeGreaterThan(Date value) {
            addCriterion("tbar_confirm_time >", value, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbar_confirm_time >=", value, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeLessThan(Date value) {
            addCriterion("tbar_confirm_time <", value, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbar_confirm_time <=", value, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeIn(List<Date> values) {
            addCriterion("tbar_confirm_time in", values, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeNotIn(List<Date> values) {
            addCriterion("tbar_confirm_time not in", values, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("tbar_confirm_time between", value1, value2, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbar_confirm_time not between", value1, value2, "tbarConfirmTime");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkIsNull() {
            addCriterion("tbar_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkIsNotNull() {
            addCriterion("tbar_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkEqualTo(String value) {
            addCriterion("tbar_remark =", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkNotEqualTo(String value) {
            addCriterion("tbar_remark <>", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkGreaterThan(String value) {
            addCriterion("tbar_remark >", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbar_remark >=", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkLessThan(String value) {
            addCriterion("tbar_remark <", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbar_remark <=", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkLike(String value) {
            addCriterion("tbar_remark like", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkNotLike(String value) {
            addCriterion("tbar_remark not like", value, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkIn(List<String> values) {
            addCriterion("tbar_remark in", values, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkNotIn(List<String> values) {
            addCriterion("tbar_remark not in", values, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkBetween(String value1, String value2) {
            addCriterion("tbar_remark between", value1, value2, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarRemarkNotBetween(String value1, String value2) {
            addCriterion("tbar_remark not between", value1, value2, "tbarRemark");
            return (Criteria) this;
        }

        public Criteria andTbarStatusIsNull() {
            addCriterion("tbar_status is null");
            return (Criteria) this;
        }

        public Criteria andTbarStatusIsNotNull() {
            addCriterion("tbar_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbarStatusEqualTo(Byte value) {
            addCriterion("tbar_status =", value, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusNotEqualTo(Byte value) {
            addCriterion("tbar_status <>", value, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusGreaterThan(Byte value) {
            addCriterion("tbar_status >", value, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbar_status >=", value, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusLessThan(Byte value) {
            addCriterion("tbar_status <", value, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbar_status <=", value, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusIn(List<Byte> values) {
            addCriterion("tbar_status in", values, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusNotIn(List<Byte> values) {
            addCriterion("tbar_status not in", values, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbar_status between", value1, value2, "tbarStatus");
            return (Criteria) this;
        }

        public Criteria andTbarStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbar_status not between", value1, value2, "tbarStatus");
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