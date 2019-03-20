package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperRecordExample() {
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

        public Criteria andTborIdIsNull() {
            addCriterion("tbor_id is null");
            return (Criteria) this;
        }

        public Criteria andTborIdIsNotNull() {
            addCriterion("tbor_id is not null");
            return (Criteria) this;
        }

        public Criteria andTborIdEqualTo(Integer value) {
            addCriterion("tbor_id =", value, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdNotEqualTo(Integer value) {
            addCriterion("tbor_id <>", value, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdGreaterThan(Integer value) {
            addCriterion("tbor_id >", value, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbor_id >=", value, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdLessThan(Integer value) {
            addCriterion("tbor_id <", value, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbor_id <=", value, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdIn(List<Integer> values) {
            addCriterion("tbor_id in", values, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdNotIn(List<Integer> values) {
            addCriterion("tbor_id not in", values, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdBetween(Integer value1, Integer value2) {
            addCriterion("tbor_id between", value1, value2, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbor_id not between", value1, value2, "tborId");
            return (Criteria) this;
        }

        public Criteria andTborHostIsNull() {
            addCriterion("tbor_host is null");
            return (Criteria) this;
        }

        public Criteria andTborHostIsNotNull() {
            addCriterion("tbor_host is not null");
            return (Criteria) this;
        }

        public Criteria andTborHostEqualTo(Short value) {
            addCriterion("tbor_host =", value, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostNotEqualTo(Short value) {
            addCriterion("tbor_host <>", value, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostGreaterThan(Short value) {
            addCriterion("tbor_host >", value, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbor_host >=", value, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostLessThan(Short value) {
            addCriterion("tbor_host <", value, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostLessThanOrEqualTo(Short value) {
            addCriterion("tbor_host <=", value, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostIn(List<Short> values) {
            addCriterion("tbor_host in", values, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostNotIn(List<Short> values) {
            addCriterion("tbor_host not in", values, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostBetween(Short value1, Short value2) {
            addCriterion("tbor_host between", value1, value2, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborHostNotBetween(Short value1, Short value2) {
            addCriterion("tbor_host not between", value1, value2, "tborHost");
            return (Criteria) this;
        }

        public Criteria andTborTitleIsNull() {
            addCriterion("tbor_title is null");
            return (Criteria) this;
        }

        public Criteria andTborTitleIsNotNull() {
            addCriterion("tbor_title is not null");
            return (Criteria) this;
        }

        public Criteria andTborTitleEqualTo(String value) {
            addCriterion("tbor_title =", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleNotEqualTo(String value) {
            addCriterion("tbor_title <>", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleGreaterThan(String value) {
            addCriterion("tbor_title >", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbor_title >=", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleLessThan(String value) {
            addCriterion("tbor_title <", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleLessThanOrEqualTo(String value) {
            addCriterion("tbor_title <=", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleLike(String value) {
            addCriterion("tbor_title like", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleNotLike(String value) {
            addCriterion("tbor_title not like", value, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleIn(List<String> values) {
            addCriterion("tbor_title in", values, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleNotIn(List<String> values) {
            addCriterion("tbor_title not in", values, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleBetween(String value1, String value2) {
            addCriterion("tbor_title between", value1, value2, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborTitleNotBetween(String value1, String value2) {
            addCriterion("tbor_title not between", value1, value2, "tborTitle");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeIsNull() {
            addCriterion("tbor_money_type is null");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeIsNotNull() {
            addCriterion("tbor_money_type is not null");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeEqualTo(Byte value) {
            addCriterion("tbor_money_type =", value, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeNotEqualTo(Byte value) {
            addCriterion("tbor_money_type <>", value, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeGreaterThan(Byte value) {
            addCriterion("tbor_money_type >", value, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbor_money_type >=", value, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeLessThan(Byte value) {
            addCriterion("tbor_money_type <", value, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbor_money_type <=", value, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeIn(List<Byte> values) {
            addCriterion("tbor_money_type in", values, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeNotIn(List<Byte> values) {
            addCriterion("tbor_money_type not in", values, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbor_money_type between", value1, value2, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborMoneyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbor_money_type not between", value1, value2, "tborMoneyType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeIsNull() {
            addCriterion("tbor_record_type is null");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeIsNotNull() {
            addCriterion("tbor_record_type is not null");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeEqualTo(Byte value) {
            addCriterion("tbor_record_type =", value, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeNotEqualTo(Byte value) {
            addCriterion("tbor_record_type <>", value, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeGreaterThan(Byte value) {
            addCriterion("tbor_record_type >", value, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbor_record_type >=", value, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeLessThan(Byte value) {
            addCriterion("tbor_record_type <", value, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbor_record_type <=", value, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeIn(List<Byte> values) {
            addCriterion("tbor_record_type in", values, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeNotIn(List<Byte> values) {
            addCriterion("tbor_record_type not in", values, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbor_record_type between", value1, value2, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborRecordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbor_record_type not between", value1, value2, "tborRecordType");
            return (Criteria) this;
        }

        public Criteria andTborInIsNull() {
            addCriterion("tbor_in is null");
            return (Criteria) this;
        }

        public Criteria andTborInIsNotNull() {
            addCriterion("tbor_in is not null");
            return (Criteria) this;
        }

        public Criteria andTborInEqualTo(BigDecimal value) {
            addCriterion("tbor_in =", value, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInNotEqualTo(BigDecimal value) {
            addCriterion("tbor_in <>", value, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInGreaterThan(BigDecimal value) {
            addCriterion("tbor_in >", value, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbor_in >=", value, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInLessThan(BigDecimal value) {
            addCriterion("tbor_in <", value, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbor_in <=", value, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInIn(List<BigDecimal> values) {
            addCriterion("tbor_in in", values, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInNotIn(List<BigDecimal> values) {
            addCriterion("tbor_in not in", values, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbor_in between", value1, value2, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbor_in not between", value1, value2, "tborIn");
            return (Criteria) this;
        }

        public Criteria andTborOutIsNull() {
            addCriterion("tbor_out is null");
            return (Criteria) this;
        }

        public Criteria andTborOutIsNotNull() {
            addCriterion("tbor_out is not null");
            return (Criteria) this;
        }

        public Criteria andTborOutEqualTo(BigDecimal value) {
            addCriterion("tbor_out =", value, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutNotEqualTo(BigDecimal value) {
            addCriterion("tbor_out <>", value, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutGreaterThan(BigDecimal value) {
            addCriterion("tbor_out >", value, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbor_out >=", value, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutLessThan(BigDecimal value) {
            addCriterion("tbor_out <", value, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbor_out <=", value, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutIn(List<BigDecimal> values) {
            addCriterion("tbor_out in", values, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutNotIn(List<BigDecimal> values) {
            addCriterion("tbor_out not in", values, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbor_out between", value1, value2, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbor_out not between", value1, value2, "tborOut");
            return (Criteria) this;
        }

        public Criteria andTborRecordIsNull() {
            addCriterion("tbor_record is null");
            return (Criteria) this;
        }

        public Criteria andTborRecordIsNotNull() {
            addCriterion("tbor_record is not null");
            return (Criteria) this;
        }

        public Criteria andTborRecordEqualTo(Integer value) {
            addCriterion("tbor_record =", value, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordNotEqualTo(Integer value) {
            addCriterion("tbor_record <>", value, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordGreaterThan(Integer value) {
            addCriterion("tbor_record >", value, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbor_record >=", value, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordLessThan(Integer value) {
            addCriterion("tbor_record <", value, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordLessThanOrEqualTo(Integer value) {
            addCriterion("tbor_record <=", value, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordIn(List<Integer> values) {
            addCriterion("tbor_record in", values, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordNotIn(List<Integer> values) {
            addCriterion("tbor_record not in", values, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordBetween(Integer value1, Integer value2) {
            addCriterion("tbor_record between", value1, value2, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("tbor_record not between", value1, value2, "tborRecord");
            return (Criteria) this;
        }

        public Criteria andTborMemberIsNull() {
            addCriterion("tbor_member is null");
            return (Criteria) this;
        }

        public Criteria andTborMemberIsNotNull() {
            addCriterion("tbor_member is not null");
            return (Criteria) this;
        }

        public Criteria andTborMemberEqualTo(Integer value) {
            addCriterion("tbor_member =", value, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberNotEqualTo(Integer value) {
            addCriterion("tbor_member <>", value, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberGreaterThan(Integer value) {
            addCriterion("tbor_member >", value, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbor_member >=", value, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberLessThan(Integer value) {
            addCriterion("tbor_member <", value, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbor_member <=", value, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberIn(List<Integer> values) {
            addCriterion("tbor_member in", values, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberNotIn(List<Integer> values) {
            addCriterion("tbor_member not in", values, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbor_member between", value1, value2, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbor_member not between", value1, value2, "tborMember");
            return (Criteria) this;
        }

        public Criteria andTborOrderIsNull() {
            addCriterion("tbor_order is null");
            return (Criteria) this;
        }

        public Criteria andTborOrderIsNotNull() {
            addCriterion("tbor_order is not null");
            return (Criteria) this;
        }

        public Criteria andTborOrderEqualTo(Long value) {
            addCriterion("tbor_order =", value, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderNotEqualTo(Long value) {
            addCriterion("tbor_order <>", value, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderGreaterThan(Long value) {
            addCriterion("tbor_order >", value, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbor_order >=", value, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderLessThan(Long value) {
            addCriterion("tbor_order <", value, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbor_order <=", value, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderIn(List<Long> values) {
            addCriterion("tbor_order in", values, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderNotIn(List<Long> values) {
            addCriterion("tbor_order not in", values, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderBetween(Long value1, Long value2) {
            addCriterion("tbor_order between", value1, value2, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbor_order not between", value1, value2, "tborOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderIsNull() {
            addCriterion("tbor_long_order is null");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderIsNotNull() {
            addCriterion("tbor_long_order is not null");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderEqualTo(Long value) {
            addCriterion("tbor_long_order =", value, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderNotEqualTo(Long value) {
            addCriterion("tbor_long_order <>", value, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderGreaterThan(Long value) {
            addCriterion("tbor_long_order >", value, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbor_long_order >=", value, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderLessThan(Long value) {
            addCriterion("tbor_long_order <", value, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbor_long_order <=", value, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderIn(List<Long> values) {
            addCriterion("tbor_long_order in", values, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderNotIn(List<Long> values) {
            addCriterion("tbor_long_order not in", values, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderBetween(Long value1, Long value2) {
            addCriterion("tbor_long_order between", value1, value2, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborLongOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbor_long_order not between", value1, value2, "tborLongOrder");
            return (Criteria) this;
        }

        public Criteria andTborObjectIsNull() {
            addCriterion("tbor_object is null");
            return (Criteria) this;
        }

        public Criteria andTborObjectIsNotNull() {
            addCriterion("tbor_object is not null");
            return (Criteria) this;
        }

        public Criteria andTborObjectEqualTo(String value) {
            addCriterion("tbor_object =", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectNotEqualTo(String value) {
            addCriterion("tbor_object <>", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectGreaterThan(String value) {
            addCriterion("tbor_object >", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectGreaterThanOrEqualTo(String value) {
            addCriterion("tbor_object >=", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectLessThan(String value) {
            addCriterion("tbor_object <", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectLessThanOrEqualTo(String value) {
            addCriterion("tbor_object <=", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectLike(String value) {
            addCriterion("tbor_object like", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectNotLike(String value) {
            addCriterion("tbor_object not like", value, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectIn(List<String> values) {
            addCriterion("tbor_object in", values, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectNotIn(List<String> values) {
            addCriterion("tbor_object not in", values, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectBetween(String value1, String value2) {
            addCriterion("tbor_object between", value1, value2, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborObjectNotBetween(String value1, String value2) {
            addCriterion("tbor_object not between", value1, value2, "tborObject");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyIsNull() {
            addCriterion("tbor_indemnify is null");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyIsNotNull() {
            addCriterion("tbor_indemnify is not null");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyEqualTo(String value) {
            addCriterion("tbor_indemnify =", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyNotEqualTo(String value) {
            addCriterion("tbor_indemnify <>", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyGreaterThan(String value) {
            addCriterion("tbor_indemnify >", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyGreaterThanOrEqualTo(String value) {
            addCriterion("tbor_indemnify >=", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyLessThan(String value) {
            addCriterion("tbor_indemnify <", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyLessThanOrEqualTo(String value) {
            addCriterion("tbor_indemnify <=", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyLike(String value) {
            addCriterion("tbor_indemnify like", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyNotLike(String value) {
            addCriterion("tbor_indemnify not like", value, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyIn(List<String> values) {
            addCriterion("tbor_indemnify in", values, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyNotIn(List<String> values) {
            addCriterion("tbor_indemnify not in", values, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyBetween(String value1, String value2) {
            addCriterion("tbor_indemnify between", value1, value2, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborIndemnifyNotBetween(String value1, String value2) {
            addCriterion("tbor_indemnify not between", value1, value2, "tborIndemnify");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeIsNull() {
            addCriterion("tbor_date_time is null");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeIsNotNull() {
            addCriterion("tbor_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeEqualTo(Date value) {
            addCriterion("tbor_date_time =", value, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeNotEqualTo(Date value) {
            addCriterion("tbor_date_time <>", value, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeGreaterThan(Date value) {
            addCriterion("tbor_date_time >", value, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbor_date_time >=", value, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeLessThan(Date value) {
            addCriterion("tbor_date_time <", value, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbor_date_time <=", value, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeIn(List<Date> values) {
            addCriterion("tbor_date_time in", values, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeNotIn(List<Date> values) {
            addCriterion("tbor_date_time not in", values, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeBetween(Date value1, Date value2) {
            addCriterion("tbor_date_time between", value1, value2, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbor_date_time not between", value1, value2, "tborDateTime");
            return (Criteria) this;
        }

        public Criteria andTborCashNoIsNull() {
            addCriterion("tbor_cash_no is null");
            return (Criteria) this;
        }

        public Criteria andTborCashNoIsNotNull() {
            addCriterion("tbor_cash_no is not null");
            return (Criteria) this;
        }

        public Criteria andTborCashNoEqualTo(Long value) {
            addCriterion("tbor_cash_no =", value, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoNotEqualTo(Long value) {
            addCriterion("tbor_cash_no <>", value, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoGreaterThan(Long value) {
            addCriterion("tbor_cash_no >", value, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoGreaterThanOrEqualTo(Long value) {
            addCriterion("tbor_cash_no >=", value, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoLessThan(Long value) {
            addCriterion("tbor_cash_no <", value, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoLessThanOrEqualTo(Long value) {
            addCriterion("tbor_cash_no <=", value, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoIn(List<Long> values) {
            addCriterion("tbor_cash_no in", values, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoNotIn(List<Long> values) {
            addCriterion("tbor_cash_no not in", values, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoBetween(Long value1, Long value2) {
            addCriterion("tbor_cash_no between", value1, value2, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborCashNoNotBetween(Long value1, Long value2) {
            addCriterion("tbor_cash_no not between", value1, value2, "tborCashNo");
            return (Criteria) this;
        }

        public Criteria andTborAdderIsNull() {
            addCriterion("tbor_adder is null");
            return (Criteria) this;
        }

        public Criteria andTborAdderIsNotNull() {
            addCriterion("tbor_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTborAdderEqualTo(Integer value) {
            addCriterion("tbor_adder =", value, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderNotEqualTo(Integer value) {
            addCriterion("tbor_adder <>", value, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderGreaterThan(Integer value) {
            addCriterion("tbor_adder >", value, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbor_adder >=", value, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderLessThan(Integer value) {
            addCriterion("tbor_adder <", value, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderLessThanOrEqualTo(Integer value) {
            addCriterion("tbor_adder <=", value, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderIn(List<Integer> values) {
            addCriterion("tbor_adder in", values, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderNotIn(List<Integer> values) {
            addCriterion("tbor_adder not in", values, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderBetween(Integer value1, Integer value2) {
            addCriterion("tbor_adder between", value1, value2, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborAdderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbor_adder not between", value1, value2, "tborAdder");
            return (Criteria) this;
        }

        public Criteria andTborStatusIsNull() {
            addCriterion("tbor_status is null");
            return (Criteria) this;
        }

        public Criteria andTborStatusIsNotNull() {
            addCriterion("tbor_status is not null");
            return (Criteria) this;
        }

        public Criteria andTborStatusEqualTo(Byte value) {
            addCriterion("tbor_status =", value, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusNotEqualTo(Byte value) {
            addCriterion("tbor_status <>", value, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusGreaterThan(Byte value) {
            addCriterion("tbor_status >", value, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbor_status >=", value, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusLessThan(Byte value) {
            addCriterion("tbor_status <", value, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbor_status <=", value, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusIn(List<Byte> values) {
            addCriterion("tbor_status in", values, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusNotIn(List<Byte> values) {
            addCriterion("tbor_status not in", values, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbor_status between", value1, value2, "tborStatus");
            return (Criteria) this;
        }

        public Criteria andTborStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbor_status not between", value1, value2, "tborStatus");
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