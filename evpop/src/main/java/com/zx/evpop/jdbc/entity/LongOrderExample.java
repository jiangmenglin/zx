package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LongOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTbloIdIsNull() {
            addCriterion("tblo_id is null");
            return (Criteria) this;
        }

        public Criteria andTbloIdIsNotNull() {
            addCriterion("tblo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbloIdEqualTo(Long value) {
            addCriterion("tblo_id =", value, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdNotEqualTo(Long value) {
            addCriterion("tblo_id <>", value, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdGreaterThan(Long value) {
            addCriterion("tblo_id >", value, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_id >=", value, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdLessThan(Long value) {
            addCriterion("tblo_id <", value, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdLessThanOrEqualTo(Long value) {
            addCriterion("tblo_id <=", value, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdIn(List<Long> values) {
            addCriterion("tblo_id in", values, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdNotIn(List<Long> values) {
            addCriterion("tblo_id not in", values, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdBetween(Long value1, Long value2) {
            addCriterion("tblo_id between", value1, value2, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloIdNotBetween(Long value1, Long value2) {
            addCriterion("tblo_id not between", value1, value2, "tbloId");
            return (Criteria) this;
        }

        public Criteria andTbloHostIsNull() {
            addCriterion("tblo_host is null");
            return (Criteria) this;
        }

        public Criteria andTbloHostIsNotNull() {
            addCriterion("tblo_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbloHostEqualTo(Long value) {
            addCriterion("tblo_host =", value, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostNotEqualTo(Long value) {
            addCriterion("tblo_host <>", value, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostGreaterThan(Long value) {
            addCriterion("tblo_host >", value, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_host >=", value, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostLessThan(Long value) {
            addCriterion("tblo_host <", value, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostLessThanOrEqualTo(Long value) {
            addCriterion("tblo_host <=", value, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostIn(List<Long> values) {
            addCriterion("tblo_host in", values, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostNotIn(List<Long> values) {
            addCriterion("tblo_host not in", values, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostBetween(Long value1, Long value2) {
            addCriterion("tblo_host between", value1, value2, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloHostNotBetween(Long value1, Long value2) {
            addCriterion("tblo_host not between", value1, value2, "tbloHost");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoIsNull() {
            addCriterion("tblo_pack_no is null");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoIsNotNull() {
            addCriterion("tblo_pack_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoEqualTo(String value) {
            addCriterion("tblo_pack_no =", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoNotEqualTo(String value) {
            addCriterion("tblo_pack_no <>", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoGreaterThan(String value) {
            addCriterion("tblo_pack_no >", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_pack_no >=", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoLessThan(String value) {
            addCriterion("tblo_pack_no <", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoLessThanOrEqualTo(String value) {
            addCriterion("tblo_pack_no <=", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoLike(String value) {
            addCriterion("tblo_pack_no like", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoNotLike(String value) {
            addCriterion("tblo_pack_no not like", value, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoIn(List<String> values) {
            addCriterion("tblo_pack_no in", values, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoNotIn(List<String> values) {
            addCriterion("tblo_pack_no not in", values, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoBetween(String value1, String value2) {
            addCriterion("tblo_pack_no between", value1, value2, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloPackNoNotBetween(String value1, String value2) {
            addCriterion("tblo_pack_no not between", value1, value2, "tbloPackNo");
            return (Criteria) this;
        }

        public Criteria andTbloMemberIsNull() {
            addCriterion("tblo_member is null");
            return (Criteria) this;
        }

        public Criteria andTbloMemberIsNotNull() {
            addCriterion("tblo_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbloMemberEqualTo(Long value) {
            addCriterion("tblo_member =", value, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberNotEqualTo(Long value) {
            addCriterion("tblo_member <>", value, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberGreaterThan(Long value) {
            addCriterion("tblo_member >", value, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_member >=", value, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberLessThan(Long value) {
            addCriterion("tblo_member <", value, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberLessThanOrEqualTo(Long value) {
            addCriterion("tblo_member <=", value, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberIn(List<Long> values) {
            addCriterion("tblo_member in", values, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberNotIn(List<Long> values) {
            addCriterion("tblo_member not in", values, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberBetween(Long value1, Long value2) {
            addCriterion("tblo_member between", value1, value2, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloMemberNotBetween(Long value1, Long value2) {
            addCriterion("tblo_member not between", value1, value2, "tbloMember");
            return (Criteria) this;
        }

        public Criteria andTbloCarIsNull() {
            addCriterion("tblo_car is null");
            return (Criteria) this;
        }

        public Criteria andTbloCarIsNotNull() {
            addCriterion("tblo_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbloCarEqualTo(Long value) {
            addCriterion("tblo_car =", value, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarNotEqualTo(Long value) {
            addCriterion("tblo_car <>", value, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarGreaterThan(Long value) {
            addCriterion("tblo_car >", value, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_car >=", value, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarLessThan(Long value) {
            addCriterion("tblo_car <", value, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarLessThanOrEqualTo(Long value) {
            addCriterion("tblo_car <=", value, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarIn(List<Long> values) {
            addCriterion("tblo_car in", values, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarNotIn(List<Long> values) {
            addCriterion("tblo_car not in", values, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarBetween(Long value1, Long value2) {
            addCriterion("tblo_car between", value1, value2, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloCarNotBetween(Long value1, Long value2) {
            addCriterion("tblo_car not between", value1, value2, "tbloCar");
            return (Criteria) this;
        }

        public Criteria andTbloStartIsNull() {
            addCriterion("tblo_start is null");
            return (Criteria) this;
        }

        public Criteria andTbloStartIsNotNull() {
            addCriterion("tblo_start is not null");
            return (Criteria) this;
        }

        public Criteria andTbloStartEqualTo(Date value) {
            addCriterion("tblo_start =", value, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartNotEqualTo(Date value) {
            addCriterion("tblo_start <>", value, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartGreaterThan(Date value) {
            addCriterion("tblo_start >", value, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_start >=", value, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartLessThan(Date value) {
            addCriterion("tblo_start <", value, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartLessThanOrEqualTo(Date value) {
            addCriterion("tblo_start <=", value, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartIn(List<Date> values) {
            addCriterion("tblo_start in", values, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartNotIn(List<Date> values) {
            addCriterion("tblo_start not in", values, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartBetween(Date value1, Date value2) {
            addCriterion("tblo_start between", value1, value2, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloStartNotBetween(Date value1, Date value2) {
            addCriterion("tblo_start not between", value1, value2, "tbloStart");
            return (Criteria) this;
        }

        public Criteria andTbloFinishIsNull() {
            addCriterion("tblo_finish is null");
            return (Criteria) this;
        }

        public Criteria andTbloFinishIsNotNull() {
            addCriterion("tblo_finish is not null");
            return (Criteria) this;
        }

        public Criteria andTbloFinishEqualTo(Date value) {
            addCriterion("tblo_finish =", value, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishNotEqualTo(Date value) {
            addCriterion("tblo_finish <>", value, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishGreaterThan(Date value) {
            addCriterion("tblo_finish >", value, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_finish >=", value, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishLessThan(Date value) {
            addCriterion("tblo_finish <", value, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishLessThanOrEqualTo(Date value) {
            addCriterion("tblo_finish <=", value, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishIn(List<Date> values) {
            addCriterion("tblo_finish in", values, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishNotIn(List<Date> values) {
            addCriterion("tblo_finish not in", values, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishBetween(Date value1, Date value2) {
            addCriterion("tblo_finish between", value1, value2, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloFinishNotBetween(Date value1, Date value2) {
            addCriterion("tblo_finish not between", value1, value2, "tbloFinish");
            return (Criteria) this;
        }

        public Criteria andTbloDepositIsNull() {
            addCriterion("tblo_deposit is null");
            return (Criteria) this;
        }

        public Criteria andTbloDepositIsNotNull() {
            addCriterion("tblo_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andTbloDepositEqualTo(Double value) {
            addCriterion("tblo_deposit =", value, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositNotEqualTo(Double value) {
            addCriterion("tblo_deposit <>", value, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositGreaterThan(Double value) {
            addCriterion("tblo_deposit >", value, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_deposit >=", value, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositLessThan(Double value) {
            addCriterion("tblo_deposit <", value, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositLessThanOrEqualTo(Double value) {
            addCriterion("tblo_deposit <=", value, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositIn(List<Double> values) {
            addCriterion("tblo_deposit in", values, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositNotIn(List<Double> values) {
            addCriterion("tblo_deposit not in", values, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositBetween(Double value1, Double value2) {
            addCriterion("tblo_deposit between", value1, value2, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloDepositNotBetween(Double value1, Double value2) {
            addCriterion("tblo_deposit not between", value1, value2, "tbloDeposit");
            return (Criteria) this;
        }

        public Criteria andTbloFeeIsNull() {
            addCriterion("tblo_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbloFeeIsNotNull() {
            addCriterion("tblo_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbloFeeEqualTo(Double value) {
            addCriterion("tblo_fee =", value, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeNotEqualTo(Double value) {
            addCriterion("tblo_fee <>", value, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeGreaterThan(Double value) {
            addCriterion("tblo_fee >", value, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_fee >=", value, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeLessThan(Double value) {
            addCriterion("tblo_fee <", value, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeLessThanOrEqualTo(Double value) {
            addCriterion("tblo_fee <=", value, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeIn(List<Double> values) {
            addCriterion("tblo_fee in", values, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeNotIn(List<Double> values) {
            addCriterion("tblo_fee not in", values, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeBetween(Double value1, Double value2) {
            addCriterion("tblo_fee between", value1, value2, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloFeeNotBetween(Double value1, Double value2) {
            addCriterion("tblo_fee not between", value1, value2, "tbloFee");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleIsNull() {
            addCriterion("tblo_pay_cycle is null");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleIsNotNull() {
            addCriterion("tblo_pay_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleEqualTo(Short value) {
            addCriterion("tblo_pay_cycle =", value, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleNotEqualTo(Short value) {
            addCriterion("tblo_pay_cycle <>", value, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleGreaterThan(Short value) {
            addCriterion("tblo_pay_cycle >", value, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleGreaterThanOrEqualTo(Short value) {
            addCriterion("tblo_pay_cycle >=", value, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleLessThan(Short value) {
            addCriterion("tblo_pay_cycle <", value, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleLessThanOrEqualTo(Short value) {
            addCriterion("tblo_pay_cycle <=", value, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleIn(List<Short> values) {
            addCriterion("tblo_pay_cycle in", values, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleNotIn(List<Short> values) {
            addCriterion("tblo_pay_cycle not in", values, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleBetween(Short value1, Short value2) {
            addCriterion("tblo_pay_cycle between", value1, value2, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloPayCycleNotBetween(Short value1, Short value2) {
            addCriterion("tblo_pay_cycle not between", value1, value2, "tbloPayCycle");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayIsNull() {
            addCriterion("tblo_need_pay is null");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayIsNotNull() {
            addCriterion("tblo_need_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayEqualTo(Double value) {
            addCriterion("tblo_need_pay =", value, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayNotEqualTo(Double value) {
            addCriterion("tblo_need_pay <>", value, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayGreaterThan(Double value) {
            addCriterion("tblo_need_pay >", value, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_need_pay >=", value, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayLessThan(Double value) {
            addCriterion("tblo_need_pay <", value, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayLessThanOrEqualTo(Double value) {
            addCriterion("tblo_need_pay <=", value, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayIn(List<Double> values) {
            addCriterion("tblo_need_pay in", values, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayNotIn(List<Double> values) {
            addCriterion("tblo_need_pay not in", values, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayBetween(Double value1, Double value2) {
            addCriterion("tblo_need_pay between", value1, value2, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloNeedPayNotBetween(Double value1, Double value2) {
            addCriterion("tblo_need_pay not between", value1, value2, "tbloNeedPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayIsNull() {
            addCriterion("tblo_real_pay is null");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayIsNotNull() {
            addCriterion("tblo_real_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayEqualTo(Double value) {
            addCriterion("tblo_real_pay =", value, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayNotEqualTo(Double value) {
            addCriterion("tblo_real_pay <>", value, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayGreaterThan(Double value) {
            addCriterion("tblo_real_pay >", value, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_real_pay >=", value, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayLessThan(Double value) {
            addCriterion("tblo_real_pay <", value, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayLessThanOrEqualTo(Double value) {
            addCriterion("tblo_real_pay <=", value, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayIn(List<Double> values) {
            addCriterion("tblo_real_pay in", values, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayNotIn(List<Double> values) {
            addCriterion("tblo_real_pay not in", values, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayBetween(Double value1, Double value2) {
            addCriterion("tblo_real_pay between", value1, value2, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloRealPayNotBetween(Double value1, Double value2) {
            addCriterion("tblo_real_pay not between", value1, value2, "tbloRealPay");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeIsNull() {
            addCriterion("tblo_pact_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeIsNotNull() {
            addCriterion("tblo_pact_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_pact_time =", value, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_pact_time <>", value, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tblo_pact_time >", value, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_pact_time >=", value, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeLessThan(Date value) {
            addCriterionForJDBCDate("tblo_pact_time <", value, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_pact_time <=", value, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tblo_pact_time in", values, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tblo_pact_time not in", values, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblo_pact_time between", value1, value2, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloPactTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblo_pact_time not between", value1, value2, "tbloPactTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeIsNull() {
            addCriterion("tblo_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeIsNotNull() {
            addCriterion("tblo_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_start_time =", value, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_start_time <>", value, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tblo_start_time >", value, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_start_time >=", value, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("tblo_start_time <", value, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_start_time <=", value, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tblo_start_time in", values, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tblo_start_time not in", values, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblo_start_time between", value1, value2, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblo_start_time not between", value1, value2, "tbloStartTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeIsNull() {
            addCriterion("tblo_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeIsNotNull() {
            addCriterion("tblo_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_finish_time =", value, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_finish_time <>", value, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tblo_finish_time >", value, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_finish_time >=", value, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeLessThan(Date value) {
            addCriterionForJDBCDate("tblo_finish_time <", value, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblo_finish_time <=", value, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tblo_finish_time in", values, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tblo_finish_time not in", values, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblo_finish_time between", value1, value2, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloFinishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblo_finish_time not between", value1, value2, "tbloFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeIsNull() {
            addCriterion("tblo_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeIsNotNull() {
            addCriterion("tblo_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeEqualTo(Date value) {
            addCriterion("tblo_update_time =", value, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeNotEqualTo(Date value) {
            addCriterion("tblo_update_time <>", value, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeGreaterThan(Date value) {
            addCriterion("tblo_update_time >", value, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_update_time >=", value, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeLessThan(Date value) {
            addCriterion("tblo_update_time <", value, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_update_time <=", value, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeIn(List<Date> values) {
            addCriterion("tblo_update_time in", values, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeNotIn(List<Date> values) {
            addCriterion("tblo_update_time not in", values, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tblo_update_time between", value1, value2, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_update_time not between", value1, value2, "tbloUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeIsNull() {
            addCriterion("tblo_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeIsNotNull() {
            addCriterion("tblo_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeEqualTo(Date value) {
            addCriterion("tblo_add_time =", value, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeNotEqualTo(Date value) {
            addCriterion("tblo_add_time <>", value, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeGreaterThan(Date value) {
            addCriterion("tblo_add_time >", value, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_add_time >=", value, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeLessThan(Date value) {
            addCriterion("tblo_add_time <", value, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_add_time <=", value, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeIn(List<Date> values) {
            addCriterion("tblo_add_time in", values, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeNotIn(List<Date> values) {
            addCriterion("tblo_add_time not in", values, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeBetween(Date value1, Date value2) {
            addCriterion("tblo_add_time between", value1, value2, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_add_time not between", value1, value2, "tbloAddTime");
            return (Criteria) this;
        }

        public Criteria andTbloFlagIsNull() {
            addCriterion("tblo_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbloFlagIsNotNull() {
            addCriterion("tblo_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbloFlagEqualTo(String value) {
            addCriterion("tblo_flag =", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagNotEqualTo(String value) {
            addCriterion("tblo_flag <>", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagGreaterThan(String value) {
            addCriterion("tblo_flag >", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_flag >=", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagLessThan(String value) {
            addCriterion("tblo_flag <", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagLessThanOrEqualTo(String value) {
            addCriterion("tblo_flag <=", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagLike(String value) {
            addCriterion("tblo_flag like", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagNotLike(String value) {
            addCriterion("tblo_flag not like", value, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagIn(List<String> values) {
            addCriterion("tblo_flag in", values, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagNotIn(List<String> values) {
            addCriterion("tblo_flag not in", values, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagBetween(String value1, String value2) {
            addCriterion("tblo_flag between", value1, value2, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloFlagNotBetween(String value1, String value2) {
            addCriterion("tblo_flag not between", value1, value2, "tbloFlag");
            return (Criteria) this;
        }

        public Criteria andTbloTagIsNull() {
            addCriterion("tblo_tag is null");
            return (Criteria) this;
        }

        public Criteria andTbloTagIsNotNull() {
            addCriterion("tblo_tag is not null");
            return (Criteria) this;
        }

        public Criteria andTbloTagEqualTo(String value) {
            addCriterion("tblo_tag =", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagNotEqualTo(String value) {
            addCriterion("tblo_tag <>", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagGreaterThan(String value) {
            addCriterion("tblo_tag >", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_tag >=", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagLessThan(String value) {
            addCriterion("tblo_tag <", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagLessThanOrEqualTo(String value) {
            addCriterion("tblo_tag <=", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagLike(String value) {
            addCriterion("tblo_tag like", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagNotLike(String value) {
            addCriterion("tblo_tag not like", value, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagIn(List<String> values) {
            addCriterion("tblo_tag in", values, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagNotIn(List<String> values) {
            addCriterion("tblo_tag not in", values, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagBetween(String value1, String value2) {
            addCriterion("tblo_tag between", value1, value2, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloTagNotBetween(String value1, String value2) {
            addCriterion("tblo_tag not between", value1, value2, "tbloTag");
            return (Criteria) this;
        }

        public Criteria andTbloSerialIsNull() {
            addCriterion("tblo_serial is null");
            return (Criteria) this;
        }

        public Criteria andTbloSerialIsNotNull() {
            addCriterion("tblo_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTbloSerialEqualTo(String value) {
            addCriterion("tblo_serial =", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialNotEqualTo(String value) {
            addCriterion("tblo_serial <>", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialGreaterThan(String value) {
            addCriterion("tblo_serial >", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_serial >=", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialLessThan(String value) {
            addCriterion("tblo_serial <", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialLessThanOrEqualTo(String value) {
            addCriterion("tblo_serial <=", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialLike(String value) {
            addCriterion("tblo_serial like", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialNotLike(String value) {
            addCriterion("tblo_serial not like", value, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialIn(List<String> values) {
            addCriterion("tblo_serial in", values, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialNotIn(List<String> values) {
            addCriterion("tblo_serial not in", values, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialBetween(String value1, String value2) {
            addCriterion("tblo_serial between", value1, value2, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloSerialNotBetween(String value1, String value2) {
            addCriterion("tblo_serial not between", value1, value2, "tbloSerial");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkIsNull() {
            addCriterion("tblo_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkIsNotNull() {
            addCriterion("tblo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkEqualTo(String value) {
            addCriterion("tblo_remark =", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkNotEqualTo(String value) {
            addCriterion("tblo_remark <>", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkGreaterThan(String value) {
            addCriterion("tblo_remark >", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_remark >=", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkLessThan(String value) {
            addCriterion("tblo_remark <", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkLessThanOrEqualTo(String value) {
            addCriterion("tblo_remark <=", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkLike(String value) {
            addCriterion("tblo_remark like", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkNotLike(String value) {
            addCriterion("tblo_remark not like", value, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkIn(List<String> values) {
            addCriterion("tblo_remark in", values, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkNotIn(List<String> values) {
            addCriterion("tblo_remark not in", values, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkBetween(String value1, String value2) {
            addCriterion("tblo_remark between", value1, value2, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloRemarkNotBetween(String value1, String value2) {
            addCriterion("tblo_remark not between", value1, value2, "tbloRemark");
            return (Criteria) this;
        }

        public Criteria andTbloEditorIsNull() {
            addCriterion("tblo_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbloEditorIsNotNull() {
            addCriterion("tblo_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbloEditorEqualTo(Long value) {
            addCriterion("tblo_editor =", value, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorNotEqualTo(Long value) {
            addCriterion("tblo_editor <>", value, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorGreaterThan(Long value) {
            addCriterion("tblo_editor >", value, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_editor >=", value, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorLessThan(Long value) {
            addCriterion("tblo_editor <", value, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorLessThanOrEqualTo(Long value) {
            addCriterion("tblo_editor <=", value, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorIn(List<Long> values) {
            addCriterion("tblo_editor in", values, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorNotIn(List<Long> values) {
            addCriterion("tblo_editor not in", values, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorBetween(Long value1, Long value2) {
            addCriterion("tblo_editor between", value1, value2, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloEditorNotBetween(Long value1, Long value2) {
            addCriterion("tblo_editor not between", value1, value2, "tbloEditor");
            return (Criteria) this;
        }

        public Criteria andTbloErrorIsNull() {
            addCriterion("tblo_error is null");
            return (Criteria) this;
        }

        public Criteria andTbloErrorIsNotNull() {
            addCriterion("tblo_error is not null");
            return (Criteria) this;
        }

        public Criteria andTbloErrorEqualTo(String value) {
            addCriterion("tblo_error =", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorNotEqualTo(String value) {
            addCriterion("tblo_error <>", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorGreaterThan(String value) {
            addCriterion("tblo_error >", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_error >=", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorLessThan(String value) {
            addCriterion("tblo_error <", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorLessThanOrEqualTo(String value) {
            addCriterion("tblo_error <=", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorLike(String value) {
            addCriterion("tblo_error like", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorNotLike(String value) {
            addCriterion("tblo_error not like", value, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorIn(List<String> values) {
            addCriterion("tblo_error in", values, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorNotIn(List<String> values) {
            addCriterion("tblo_error not in", values, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorBetween(String value1, String value2) {
            addCriterion("tblo_error between", value1, value2, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloErrorNotBetween(String value1, String value2) {
            addCriterion("tblo_error not between", value1, value2, "tbloError");
            return (Criteria) this;
        }

        public Criteria andTbloStatusIsNull() {
            addCriterion("tblo_status is null");
            return (Criteria) this;
        }

        public Criteria andTbloStatusIsNotNull() {
            addCriterion("tblo_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbloStatusEqualTo(Short value) {
            addCriterion("tblo_status =", value, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusNotEqualTo(Short value) {
            addCriterion("tblo_status <>", value, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusGreaterThan(Short value) {
            addCriterion("tblo_status >", value, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tblo_status >=", value, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusLessThan(Short value) {
            addCriterion("tblo_status <", value, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusLessThanOrEqualTo(Short value) {
            addCriterion("tblo_status <=", value, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusIn(List<Short> values) {
            addCriterion("tblo_status in", values, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusNotIn(List<Short> values) {
            addCriterion("tblo_status not in", values, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusBetween(Short value1, Short value2) {
            addCriterion("tblo_status between", value1, value2, "tbloStatus");
            return (Criteria) this;
        }

        public Criteria andTbloStatusNotBetween(Short value1, Short value2) {
            addCriterion("tblo_status not between", value1, value2, "tbloStatus");
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