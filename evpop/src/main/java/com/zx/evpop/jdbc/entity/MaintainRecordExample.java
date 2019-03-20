package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainRecordExample() {
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

        public Criteria andTbmrIdIsNull() {
            addCriterion("tbmr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbmrIdIsNotNull() {
            addCriterion("tbmr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrIdEqualTo(Long value) {
            addCriterion("tbmr_id =", value, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdNotEqualTo(Long value) {
            addCriterion("tbmr_id <>", value, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdGreaterThan(Long value) {
            addCriterion("tbmr_id >", value, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbmr_id >=", value, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdLessThan(Long value) {
            addCriterion("tbmr_id <", value, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdLessThanOrEqualTo(Long value) {
            addCriterion("tbmr_id <=", value, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdIn(List<Long> values) {
            addCriterion("tbmr_id in", values, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdNotIn(List<Long> values) {
            addCriterion("tbmr_id not in", values, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdBetween(Long value1, Long value2) {
            addCriterion("tbmr_id between", value1, value2, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrIdNotBetween(Long value1, Long value2) {
            addCriterion("tbmr_id not between", value1, value2, "tbmrId");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainIsNull() {
            addCriterion("tbmr_maintain is null");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainIsNotNull() {
            addCriterion("tbmr_maintain is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainEqualTo(Long value) {
            addCriterion("tbmr_maintain =", value, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainNotEqualTo(Long value) {
            addCriterion("tbmr_maintain <>", value, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainGreaterThan(Long value) {
            addCriterion("tbmr_maintain >", value, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainGreaterThanOrEqualTo(Long value) {
            addCriterion("tbmr_maintain >=", value, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainLessThan(Long value) {
            addCriterion("tbmr_maintain <", value, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainLessThanOrEqualTo(Long value) {
            addCriterion("tbmr_maintain <=", value, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainIn(List<Long> values) {
            addCriterion("tbmr_maintain in", values, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainNotIn(List<Long> values) {
            addCriterion("tbmr_maintain not in", values, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainBetween(Long value1, Long value2) {
            addCriterion("tbmr_maintain between", value1, value2, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrMaintainNotBetween(Long value1, Long value2) {
            addCriterion("tbmr_maintain not between", value1, value2, "tbmrMaintain");
            return (Criteria) this;
        }

        public Criteria andTbmrCarIsNull() {
            addCriterion("tbmr_car is null");
            return (Criteria) this;
        }

        public Criteria andTbmrCarIsNotNull() {
            addCriterion("tbmr_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrCarEqualTo(Long value) {
            addCriterion("tbmr_car =", value, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarNotEqualTo(Long value) {
            addCriterion("tbmr_car <>", value, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarGreaterThan(Long value) {
            addCriterion("tbmr_car >", value, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbmr_car >=", value, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarLessThan(Long value) {
            addCriterion("tbmr_car <", value, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarLessThanOrEqualTo(Long value) {
            addCriterion("tbmr_car <=", value, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarIn(List<Long> values) {
            addCriterion("tbmr_car in", values, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarNotIn(List<Long> values) {
            addCriterion("tbmr_car not in", values, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarBetween(Long value1, Long value2) {
            addCriterion("tbmr_car between", value1, value2, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrCarNotBetween(Long value1, Long value2) {
            addCriterion("tbmr_car not between", value1, value2, "tbmrCar");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeIsNull() {
            addCriterion("tbmr_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeIsNotNull() {
            addCriterion("tbmr_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeEqualTo(Short value) {
            addCriterion("tbmr_type =", value, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeNotEqualTo(Short value) {
            addCriterion("tbmr_type <>", value, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeGreaterThan(Short value) {
            addCriterion("tbmr_type >", value, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbmr_type >=", value, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeLessThan(Short value) {
            addCriterion("tbmr_type <", value, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbmr_type <=", value, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeIn(List<Short> values) {
            addCriterion("tbmr_type in", values, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeNotIn(List<Short> values) {
            addCriterion("tbmr_type not in", values, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeBetween(Short value1, Short value2) {
            addCriterion("tbmr_type between", value1, value2, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbmr_type not between", value1, value2, "tbmrType");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrIsNull() {
            addCriterion("tbmr_repair_adr is null");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrIsNotNull() {
            addCriterion("tbmr_repair_adr is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrEqualTo(Long value) {
            addCriterion("tbmr_repair_adr =", value, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrNotEqualTo(Long value) {
            addCriterion("tbmr_repair_adr <>", value, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrGreaterThan(Long value) {
            addCriterion("tbmr_repair_adr >", value, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrGreaterThanOrEqualTo(Long value) {
            addCriterion("tbmr_repair_adr >=", value, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrLessThan(Long value) {
            addCriterion("tbmr_repair_adr <", value, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrLessThanOrEqualTo(Long value) {
            addCriterion("tbmr_repair_adr <=", value, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrIn(List<Long> values) {
            addCriterion("tbmr_repair_adr in", values, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrNotIn(List<Long> values) {
            addCriterion("tbmr_repair_adr not in", values, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrBetween(Long value1, Long value2) {
            addCriterion("tbmr_repair_adr between", value1, value2, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrRepairAdrNotBetween(Long value1, Long value2) {
            addCriterion("tbmr_repair_adr not between", value1, value2, "tbmrRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeIsNull() {
            addCriterion("tbmr_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeIsNotNull() {
            addCriterion("tbmr_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeEqualTo(Short value) {
            addCriterion("tbmr_fee_type =", value, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeNotEqualTo(Short value) {
            addCriterion("tbmr_fee_type <>", value, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeGreaterThan(Short value) {
            addCriterion("tbmr_fee_type >", value, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbmr_fee_type >=", value, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeLessThan(Short value) {
            addCriterion("tbmr_fee_type <", value, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbmr_fee_type <=", value, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeIn(List<Short> values) {
            addCriterion("tbmr_fee_type in", values, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeNotIn(List<Short> values) {
            addCriterion("tbmr_fee_type not in", values, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeBetween(Short value1, Short value2) {
            addCriterion("tbmr_fee_type between", value1, value2, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbmr_fee_type not between", value1, value2, "tbmrFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeIsNull() {
            addCriterion("tbmr_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeIsNotNull() {
            addCriterion("tbmr_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeEqualTo(Double value) {
            addCriterion("tbmr_fee =", value, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeNotEqualTo(Double value) {
            addCriterion("tbmr_fee <>", value, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeGreaterThan(Double value) {
            addCriterion("tbmr_fee >", value, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbmr_fee >=", value, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeLessThan(Double value) {
            addCriterion("tbmr_fee <", value, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbmr_fee <=", value, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeIn(List<Double> values) {
            addCriterion("tbmr_fee in", values, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeNotIn(List<Double> values) {
            addCriterion("tbmr_fee not in", values, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeBetween(Double value1, Double value2) {
            addCriterion("tbmr_fee between", value1, value2, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbmr_fee not between", value1, value2, "tbmrFee");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoIsNull() {
            addCriterion("tbmr_bill_no is null");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoIsNotNull() {
            addCriterion("tbmr_bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoEqualTo(String value) {
            addCriterion("tbmr_bill_no =", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoNotEqualTo(String value) {
            addCriterion("tbmr_bill_no <>", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoGreaterThan(String value) {
            addCriterion("tbmr_bill_no >", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbmr_bill_no >=", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoLessThan(String value) {
            addCriterion("tbmr_bill_no <", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoLessThanOrEqualTo(String value) {
            addCriterion("tbmr_bill_no <=", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoLike(String value) {
            addCriterion("tbmr_bill_no like", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoNotLike(String value) {
            addCriterion("tbmr_bill_no not like", value, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoIn(List<String> values) {
            addCriterion("tbmr_bill_no in", values, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoNotIn(List<String> values) {
            addCriterion("tbmr_bill_no not in", values, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoBetween(String value1, String value2) {
            addCriterion("tbmr_bill_no between", value1, value2, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrBillNoNotBetween(String value1, String value2) {
            addCriterion("tbmr_bill_no not between", value1, value2, "tbmrBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmIsNull() {
            addCriterion("tbmr_real_km is null");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmIsNotNull() {
            addCriterion("tbmr_real_km is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmEqualTo(Integer value) {
            addCriterion("tbmr_real_km =", value, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmNotEqualTo(Integer value) {
            addCriterion("tbmr_real_km <>", value, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmGreaterThan(Integer value) {
            addCriterion("tbmr_real_km >", value, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbmr_real_km >=", value, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmLessThan(Integer value) {
            addCriterion("tbmr_real_km <", value, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmLessThanOrEqualTo(Integer value) {
            addCriterion("tbmr_real_km <=", value, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmIn(List<Integer> values) {
            addCriterion("tbmr_real_km in", values, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmNotIn(List<Integer> values) {
            addCriterion("tbmr_real_km not in", values, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmBetween(Integer value1, Integer value2) {
            addCriterion("tbmr_real_km between", value1, value2, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrRealKmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbmr_real_km not between", value1, value2, "tbmrRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderIsNull() {
            addCriterion("tbmr_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderIsNotNull() {
            addCriterion("tbmr_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderEqualTo(Long value) {
            addCriterion("tbmr_adder =", value, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderNotEqualTo(Long value) {
            addCriterion("tbmr_adder <>", value, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderGreaterThan(Long value) {
            addCriterion("tbmr_adder >", value, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbmr_adder >=", value, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderLessThan(Long value) {
            addCriterion("tbmr_adder <", value, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbmr_adder <=", value, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderIn(List<Long> values) {
            addCriterion("tbmr_adder in", values, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderNotIn(List<Long> values) {
            addCriterion("tbmr_adder not in", values, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderBetween(Long value1, Long value2) {
            addCriterion("tbmr_adder between", value1, value2, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbmr_adder not between", value1, value2, "tbmrAdder");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeIsNull() {
            addCriterion("tbmr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeIsNotNull() {
            addCriterion("tbmr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeEqualTo(Date value) {
            addCriterion("tbmr_add_time =", value, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeNotEqualTo(Date value) {
            addCriterion("tbmr_add_time <>", value, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeGreaterThan(Date value) {
            addCriterion("tbmr_add_time >", value, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbmr_add_time >=", value, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeLessThan(Date value) {
            addCriterion("tbmr_add_time <", value, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbmr_add_time <=", value, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeIn(List<Date> values) {
            addCriterion("tbmr_add_time in", values, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeNotIn(List<Date> values) {
            addCriterion("tbmr_add_time not in", values, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbmr_add_time between", value1, value2, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbmr_add_time not between", value1, value2, "tbmrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusIsNull() {
            addCriterion("tbmr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusIsNotNull() {
            addCriterion("tbmr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusEqualTo(Short value) {
            addCriterion("tbmr_status =", value, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusNotEqualTo(Short value) {
            addCriterion("tbmr_status <>", value, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusGreaterThan(Short value) {
            addCriterion("tbmr_status >", value, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbmr_status >=", value, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusLessThan(Short value) {
            addCriterion("tbmr_status <", value, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbmr_status <=", value, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusIn(List<Short> values) {
            addCriterion("tbmr_status in", values, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusNotIn(List<Short> values) {
            addCriterion("tbmr_status not in", values, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusBetween(Short value1, Short value2) {
            addCriterion("tbmr_status between", value1, value2, "tbmrStatus");
            return (Criteria) this;
        }

        public Criteria andTbmrStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbmr_status not between", value1, value2, "tbmrStatus");
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