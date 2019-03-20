package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andTbcVinIsNull() {
            addCriterion("tbc_vin is null");
            return (Criteria) this;
        }

        public Criteria andTbcVinIsNotNull() {
            addCriterion("tbc_vin is not null");
            return (Criteria) this;
        }

        public Criteria andTbcVinEqualTo(String value) {
            addCriterion("tbc_vin =", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinNotEqualTo(String value) {
            addCriterion("tbc_vin <>", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinGreaterThan(String value) {
            addCriterion("tbc_vin >", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_vin >=", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinLessThan(String value) {
            addCriterion("tbc_vin <", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinLessThanOrEqualTo(String value) {
            addCriterion("tbc_vin <=", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinLike(String value) {
            addCriterion("tbc_vin like", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinNotLike(String value) {
            addCriterion("tbc_vin not like", value, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinIn(List<String> values) {
            addCriterion("tbc_vin in", values, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinNotIn(List<String> values) {
            addCriterion("tbc_vin not in", values, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinBetween(String value1, String value2) {
            addCriterion("tbc_vin between", value1, value2, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcVinNotBetween(String value1, String value2) {
            addCriterion("tbc_vin not between", value1, value2, "tbcVin");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoIsNull() {
            addCriterion("tbc_car_no is null");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoIsNotNull() {
            addCriterion("tbc_car_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoEqualTo(String value) {
            addCriterion("tbc_car_no =", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoNotEqualTo(String value) {
            addCriterion("tbc_car_no <>", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoGreaterThan(String value) {
            addCriterion("tbc_car_no >", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_car_no >=", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoLessThan(String value) {
            addCriterion("tbc_car_no <", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoLessThanOrEqualTo(String value) {
            addCriterion("tbc_car_no <=", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoLike(String value) {
            addCriterion("tbc_car_no like", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoNotLike(String value) {
            addCriterion("tbc_car_no not like", value, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoIn(List<String> values) {
            addCriterion("tbc_car_no in", values, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoNotIn(List<String> values) {
            addCriterion("tbc_car_no not in", values, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoBetween(String value1, String value2) {
            addCriterion("tbc_car_no between", value1, value2, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcCarNoNotBetween(String value1, String value2) {
            addCriterion("tbc_car_no not between", value1, value2, "tbcCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcNumberIsNull() {
            addCriterion("tbc_number is null");
            return (Criteria) this;
        }

        public Criteria andTbcNumberIsNotNull() {
            addCriterion("tbc_number is not null");
            return (Criteria) this;
        }

        public Criteria andTbcNumberEqualTo(String value) {
            addCriterion("tbc_number =", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberNotEqualTo(String value) {
            addCriterion("tbc_number <>", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberGreaterThan(String value) {
            addCriterion("tbc_number >", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_number >=", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberLessThan(String value) {
            addCriterion("tbc_number <", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberLessThanOrEqualTo(String value) {
            addCriterion("tbc_number <=", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberLike(String value) {
            addCriterion("tbc_number like", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberNotLike(String value) {
            addCriterion("tbc_number not like", value, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberIn(List<String> values) {
            addCriterion("tbc_number in", values, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberNotIn(List<String> values) {
            addCriterion("tbc_number not in", values, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberBetween(String value1, String value2) {
            addCriterion("tbc_number between", value1, value2, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcNumberNotBetween(String value1, String value2) {
            addCriterion("tbc_number not between", value1, value2, "tbcNumber");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleIsNull() {
            addCriterion("tbc_vehicle is null");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleIsNotNull() {
            addCriterion("tbc_vehicle is not null");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleEqualTo(Integer value) {
            addCriterion("tbc_vehicle =", value, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleNotEqualTo(Integer value) {
            addCriterion("tbc_vehicle <>", value, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleGreaterThan(Integer value) {
            addCriterion("tbc_vehicle >", value, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_vehicle >=", value, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleLessThan(Integer value) {
            addCriterion("tbc_vehicle <", value, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_vehicle <=", value, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleIn(List<Integer> values) {
            addCriterion("tbc_vehicle in", values, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleNotIn(List<Integer> values) {
            addCriterion("tbc_vehicle not in", values, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleBetween(Integer value1, Integer value2) {
            addCriterion("tbc_vehicle between", value1, value2, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcVehicleNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_vehicle not between", value1, value2, "tbcVehicle");
            return (Criteria) this;
        }

        public Criteria andTbcProvidIsNull() {
            addCriterion("tbc_provid is null");
            return (Criteria) this;
        }

        public Criteria andTbcProvidIsNotNull() {
            addCriterion("tbc_provid is not null");
            return (Criteria) this;
        }

        public Criteria andTbcProvidEqualTo(Integer value) {
            addCriterion("tbc_provid =", value, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidNotEqualTo(Integer value) {
            addCriterion("tbc_provid <>", value, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidGreaterThan(Integer value) {
            addCriterion("tbc_provid >", value, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_provid >=", value, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidLessThan(Integer value) {
            addCriterion("tbc_provid <", value, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_provid <=", value, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidIn(List<Integer> values) {
            addCriterion("tbc_provid in", values, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidNotIn(List<Integer> values) {
            addCriterion("tbc_provid not in", values, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidBetween(Integer value1, Integer value2) {
            addCriterion("tbc_provid between", value1, value2, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcProvidNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_provid not between", value1, value2, "tbcProvid");
            return (Criteria) this;
        }

        public Criteria andTbcModelIsNull() {
            addCriterion("tbc_model is null");
            return (Criteria) this;
        }

        public Criteria andTbcModelIsNotNull() {
            addCriterion("tbc_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbcModelEqualTo(Integer value) {
            addCriterion("tbc_model =", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotEqualTo(Integer value) {
            addCriterion("tbc_model <>", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelGreaterThan(Integer value) {
            addCriterion("tbc_model >", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_model >=", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelLessThan(Integer value) {
            addCriterion("tbc_model <", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_model <=", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelIn(List<Integer> values) {
            addCriterion("tbc_model in", values, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotIn(List<Integer> values) {
            addCriterion("tbc_model not in", values, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelBetween(Integer value1, Integer value2) {
            addCriterion("tbc_model between", value1, value2, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_model not between", value1, value2, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcAreaIsNull() {
            addCriterion("tbc_area is null");
            return (Criteria) this;
        }

        public Criteria andTbcAreaIsNotNull() {
            addCriterion("tbc_area is not null");
            return (Criteria) this;
        }

        public Criteria andTbcAreaEqualTo(Long value) {
            addCriterion("tbc_area =", value, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaNotEqualTo(Long value) {
            addCriterion("tbc_area <>", value, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaGreaterThan(Long value) {
            addCriterion("tbc_area >", value, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("tbc_area >=", value, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaLessThan(Long value) {
            addCriterion("tbc_area <", value, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaLessThanOrEqualTo(Long value) {
            addCriterion("tbc_area <=", value, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaIn(List<Long> values) {
            addCriterion("tbc_area in", values, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaNotIn(List<Long> values) {
            addCriterion("tbc_area not in", values, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaBetween(Long value1, Long value2) {
            addCriterion("tbc_area between", value1, value2, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcAreaNotBetween(Long value1, Long value2) {
            addCriterion("tbc_area not between", value1, value2, "tbcArea");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsIsNull() {
            addCriterion("tbc_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsIsNotNull() {
            addCriterion("tbc_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsEqualTo(Integer value) {
            addCriterion("tbc_outlets =", value, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsNotEqualTo(Integer value) {
            addCriterion("tbc_outlets <>", value, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsGreaterThan(Integer value) {
            addCriterion("tbc_outlets >", value, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_outlets >=", value, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsLessThan(Integer value) {
            addCriterion("tbc_outlets <", value, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_outlets <=", value, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsIn(List<Integer> values) {
            addCriterion("tbc_outlets in", values, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsNotIn(List<Integer> values) {
            addCriterion("tbc_outlets not in", values, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsBetween(Integer value1, Integer value2) {
            addCriterion("tbc_outlets between", value1, value2, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcOutletsNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_outlets not between", value1, value2, "tbcOutlets");
            return (Criteria) this;
        }

        public Criteria andTbcEngineIsNull() {
            addCriterion("tbc_engine is null");
            return (Criteria) this;
        }

        public Criteria andTbcEngineIsNotNull() {
            addCriterion("tbc_engine is not null");
            return (Criteria) this;
        }

        public Criteria andTbcEngineEqualTo(String value) {
            addCriterion("tbc_engine =", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineNotEqualTo(String value) {
            addCriterion("tbc_engine <>", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineGreaterThan(String value) {
            addCriterion("tbc_engine >", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_engine >=", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineLessThan(String value) {
            addCriterion("tbc_engine <", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineLessThanOrEqualTo(String value) {
            addCriterion("tbc_engine <=", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineLike(String value) {
            addCriterion("tbc_engine like", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineNotLike(String value) {
            addCriterion("tbc_engine not like", value, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineIn(List<String> values) {
            addCriterion("tbc_engine in", values, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineNotIn(List<String> values) {
            addCriterion("tbc_engine not in", values, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineBetween(String value1, String value2) {
            addCriterion("tbc_engine between", value1, value2, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcEngineNotBetween(String value1, String value2) {
            addCriterion("tbc_engine not between", value1, value2, "tbcEngine");
            return (Criteria) this;
        }

        public Criteria andTbcColorIsNull() {
            addCriterion("tbc_color is null");
            return (Criteria) this;
        }

        public Criteria andTbcColorIsNotNull() {
            addCriterion("tbc_color is not null");
            return (Criteria) this;
        }

        public Criteria andTbcColorEqualTo(String value) {
            addCriterion("tbc_color =", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorNotEqualTo(String value) {
            addCriterion("tbc_color <>", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorGreaterThan(String value) {
            addCriterion("tbc_color >", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_color >=", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorLessThan(String value) {
            addCriterion("tbc_color <", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorLessThanOrEqualTo(String value) {
            addCriterion("tbc_color <=", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorLike(String value) {
            addCriterion("tbc_color like", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorNotLike(String value) {
            addCriterion("tbc_color not like", value, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorIn(List<String> values) {
            addCriterion("tbc_color in", values, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorNotIn(List<String> values) {
            addCriterion("tbc_color not in", values, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorBetween(String value1, String value2) {
            addCriterion("tbc_color between", value1, value2, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcColorNotBetween(String value1, String value2) {
            addCriterion("tbc_color not between", value1, value2, "tbcColor");
            return (Criteria) this;
        }

        public Criteria andTbcLatIsNull() {
            addCriterion("tbc_lat is null");
            return (Criteria) this;
        }

        public Criteria andTbcLatIsNotNull() {
            addCriterion("tbc_lat is not null");
            return (Criteria) this;
        }

        public Criteria andTbcLatEqualTo(BigDecimal value) {
            addCriterion("tbc_lat =", value, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatNotEqualTo(BigDecimal value) {
            addCriterion("tbc_lat <>", value, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatGreaterThan(BigDecimal value) {
            addCriterion("tbc_lat >", value, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbc_lat >=", value, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatLessThan(BigDecimal value) {
            addCriterion("tbc_lat <", value, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbc_lat <=", value, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatIn(List<BigDecimal> values) {
            addCriterion("tbc_lat in", values, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatNotIn(List<BigDecimal> values) {
            addCriterion("tbc_lat not in", values, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbc_lat between", value1, value2, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbc_lat not between", value1, value2, "tbcLat");
            return (Criteria) this;
        }

        public Criteria andTbcLngIsNull() {
            addCriterion("tbc_lng is null");
            return (Criteria) this;
        }

        public Criteria andTbcLngIsNotNull() {
            addCriterion("tbc_lng is not null");
            return (Criteria) this;
        }

        public Criteria andTbcLngEqualTo(BigDecimal value) {
            addCriterion("tbc_lng =", value, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngNotEqualTo(BigDecimal value) {
            addCriterion("tbc_lng <>", value, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngGreaterThan(BigDecimal value) {
            addCriterion("tbc_lng >", value, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbc_lng >=", value, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngLessThan(BigDecimal value) {
            addCriterion("tbc_lng <", value, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbc_lng <=", value, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngIn(List<BigDecimal> values) {
            addCriterion("tbc_lng in", values, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngNotIn(List<BigDecimal> values) {
            addCriterion("tbc_lng not in", values, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbc_lng between", value1, value2, "tbcLng");
            return (Criteria) this;
        }

        public Criteria andTbcLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbc_lng not between", value1, value2, "tbcLng");
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

        public Criteria andTbcConditionIsNull() {
            addCriterion("tbc_condition is null");
            return (Criteria) this;
        }

        public Criteria andTbcConditionIsNotNull() {
            addCriterion("tbc_condition is not null");
            return (Criteria) this;
        }

        public Criteria andTbcConditionEqualTo(String value) {
            addCriterion("tbc_condition =", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionNotEqualTo(String value) {
            addCriterion("tbc_condition <>", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionGreaterThan(String value) {
            addCriterion("tbc_condition >", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_condition >=", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionLessThan(String value) {
            addCriterion("tbc_condition <", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionLessThanOrEqualTo(String value) {
            addCriterion("tbc_condition <=", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionLike(String value) {
            addCriterion("tbc_condition like", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionNotLike(String value) {
            addCriterion("tbc_condition not like", value, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionIn(List<String> values) {
            addCriterion("tbc_condition in", values, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionNotIn(List<String> values) {
            addCriterion("tbc_condition not in", values, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionBetween(String value1, String value2) {
            addCriterion("tbc_condition between", value1, value2, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcConditionNotBetween(String value1, String value2) {
            addCriterion("tbc_condition not between", value1, value2, "tbcCondition");
            return (Criteria) this;
        }

        public Criteria andTbcReasonIsNull() {
            addCriterion("tbc_reason is null");
            return (Criteria) this;
        }

        public Criteria andTbcReasonIsNotNull() {
            addCriterion("tbc_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTbcReasonEqualTo(String value) {
            addCriterion("tbc_reason =", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonNotEqualTo(String value) {
            addCriterion("tbc_reason <>", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonGreaterThan(String value) {
            addCriterion("tbc_reason >", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_reason >=", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonLessThan(String value) {
            addCriterion("tbc_reason <", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonLessThanOrEqualTo(String value) {
            addCriterion("tbc_reason <=", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonLike(String value) {
            addCriterion("tbc_reason like", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonNotLike(String value) {
            addCriterion("tbc_reason not like", value, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonIn(List<String> values) {
            addCriterion("tbc_reason in", values, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonNotIn(List<String> values) {
            addCriterion("tbc_reason not in", values, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonBetween(String value1, String value2) {
            addCriterion("tbc_reason between", value1, value2, "tbcReason");
            return (Criteria) this;
        }

        public Criteria andTbcReasonNotBetween(String value1, String value2) {
            addCriterion("tbc_reason not between", value1, value2, "tbcReason");
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

        public Criteria andTbcStateIsNull() {
            addCriterion("tbc_state is null");
            return (Criteria) this;
        }

        public Criteria andTbcStateIsNotNull() {
            addCriterion("tbc_state is not null");
            return (Criteria) this;
        }

        public Criteria andTbcStateEqualTo(Byte value) {
            addCriterion("tbc_state =", value, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateNotEqualTo(Byte value) {
            addCriterion("tbc_state <>", value, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateGreaterThan(Byte value) {
            addCriterion("tbc_state >", value, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_state >=", value, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateLessThan(Byte value) {
            addCriterion("tbc_state <", value, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_state <=", value, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateIn(List<Byte> values) {
            addCriterion("tbc_state in", values, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateNotIn(List<Byte> values) {
            addCriterion("tbc_state not in", values, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateBetween(Byte value1, Byte value2) {
            addCriterion("tbc_state between", value1, value2, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStateNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_state not between", value1, value2, "tbcState");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExIsNull() {
            addCriterion("tbc_status_ex is null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExIsNotNull() {
            addCriterion("tbc_status_ex is not null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExEqualTo(Byte value) {
            addCriterion("tbc_status_ex =", value, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExNotEqualTo(Byte value) {
            addCriterion("tbc_status_ex <>", value, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExGreaterThan(Byte value) {
            addCriterion("tbc_status_ex >", value, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_status_ex >=", value, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExLessThan(Byte value) {
            addCriterion("tbc_status_ex <", value, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_status_ex <=", value, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExIn(List<Byte> values) {
            addCriterion("tbc_status_ex in", values, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExNotIn(List<Byte> values) {
            addCriterion("tbc_status_ex not in", values, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status_ex between", value1, value2, "tbcStatusEx");
            return (Criteria) this;
        }

        public Criteria andTbcStatusExNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status_ex not between", value1, value2, "tbcStatusEx");
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

        public Criteria andTbcDrivingIsNull() {
            addCriterion("tbc_driving is null");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingIsNotNull() {
            addCriterion("tbc_driving is not null");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingEqualTo(String value) {
            addCriterion("tbc_driving =", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingNotEqualTo(String value) {
            addCriterion("tbc_driving <>", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingGreaterThan(String value) {
            addCriterion("tbc_driving >", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_driving >=", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingLessThan(String value) {
            addCriterion("tbc_driving <", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingLessThanOrEqualTo(String value) {
            addCriterion("tbc_driving <=", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingLike(String value) {
            addCriterion("tbc_driving like", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingNotLike(String value) {
            addCriterion("tbc_driving not like", value, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingIn(List<String> values) {
            addCriterion("tbc_driving in", values, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingNotIn(List<String> values) {
            addCriterion("tbc_driving not in", values, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingBetween(String value1, String value2) {
            addCriterion("tbc_driving between", value1, value2, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcDrivingNotBetween(String value1, String value2) {
            addCriterion("tbc_driving not between", value1, value2, "tbcDriving");
            return (Criteria) this;
        }

        public Criteria andTbcNodayIsNull() {
            addCriterion("tbc_noday is null");
            return (Criteria) this;
        }

        public Criteria andTbcNodayIsNotNull() {
            addCriterion("tbc_noday is not null");
            return (Criteria) this;
        }

        public Criteria andTbcNodayEqualTo(Short value) {
            addCriterion("tbc_noday =", value, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayNotEqualTo(Short value) {
            addCriterion("tbc_noday <>", value, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayGreaterThan(Short value) {
            addCriterion("tbc_noday >", value, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayGreaterThanOrEqualTo(Short value) {
            addCriterion("tbc_noday >=", value, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayLessThan(Short value) {
            addCriterion("tbc_noday <", value, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayLessThanOrEqualTo(Short value) {
            addCriterion("tbc_noday <=", value, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayIn(List<Short> values) {
            addCriterion("tbc_noday in", values, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayNotIn(List<Short> values) {
            addCriterion("tbc_noday not in", values, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayBetween(Short value1, Short value2) {
            addCriterion("tbc_noday between", value1, value2, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcNodayNotBetween(Short value1, Short value2) {
            addCriterion("tbc_noday not between", value1, value2, "tbcNoday");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskIsNull() {
            addCriterion("tbc_yntask is null");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskIsNotNull() {
            addCriterion("tbc_yntask is not null");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskEqualTo(Integer value) {
            addCriterion("tbc_yntask =", value, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskNotEqualTo(Integer value) {
            addCriterion("tbc_yntask <>", value, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskGreaterThan(Integer value) {
            addCriterion("tbc_yntask >", value, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_yntask >=", value, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskLessThan(Integer value) {
            addCriterion("tbc_yntask <", value, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_yntask <=", value, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskIn(List<Integer> values) {
            addCriterion("tbc_yntask in", values, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskNotIn(List<Integer> values) {
            addCriterion("tbc_yntask not in", values, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskBetween(Integer value1, Integer value2) {
            addCriterion("tbc_yntask between", value1, value2, "tbcYntask");
            return (Criteria) this;
        }

        public Criteria andTbcYntaskNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_yntask not between", value1, value2, "tbcYntask");
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