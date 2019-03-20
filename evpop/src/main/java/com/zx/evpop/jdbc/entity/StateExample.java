package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StateExample() {
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

        public Criteria andTbsIdIsNull() {
            addCriterion("tbs_id is null");
            return (Criteria) this;
        }

        public Criteria andTbsIdIsNotNull() {
            addCriterion("tbs_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbsIdEqualTo(Integer value) {
            addCriterion("tbs_id =", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotEqualTo(Integer value) {
            addCriterion("tbs_id <>", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdGreaterThan(Integer value) {
            addCriterion("tbs_id >", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_id >=", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdLessThan(Integer value) {
            addCriterion("tbs_id <", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_id <=", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdIn(List<Integer> values) {
            addCriterion("tbs_id in", values, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotIn(List<Integer> values) {
            addCriterion("tbs_id not in", values, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdBetween(Integer value1, Integer value2) {
            addCriterion("tbs_id between", value1, value2, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_id not between", value1, value2, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsHostIsNull() {
            addCriterion("tbs_host is null");
            return (Criteria) this;
        }

        public Criteria andTbsHostIsNotNull() {
            addCriterion("tbs_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbsHostEqualTo(Short value) {
            addCriterion("tbs_host =", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotEqualTo(Short value) {
            addCriterion("tbs_host <>", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostGreaterThan(Short value) {
            addCriterion("tbs_host >", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_host >=", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostLessThan(Short value) {
            addCriterion("tbs_host <", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostLessThanOrEqualTo(Short value) {
            addCriterion("tbs_host <=", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostIn(List<Short> values) {
            addCriterion("tbs_host in", values, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotIn(List<Short> values) {
            addCriterion("tbs_host not in", values, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostBetween(Short value1, Short value2) {
            addCriterion("tbs_host between", value1, value2, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotBetween(Short value1, Short value2) {
            addCriterion("tbs_host not between", value1, value2, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsNumberIsNull() {
            addCriterion("tbs_number is null");
            return (Criteria) this;
        }

        public Criteria andTbsNumberIsNotNull() {
            addCriterion("tbs_number is not null");
            return (Criteria) this;
        }

        public Criteria andTbsNumberEqualTo(String value) {
            addCriterion("tbs_number =", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberNotEqualTo(String value) {
            addCriterion("tbs_number <>", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberGreaterThan(String value) {
            addCriterion("tbs_number >", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_number >=", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberLessThan(String value) {
            addCriterion("tbs_number <", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberLessThanOrEqualTo(String value) {
            addCriterion("tbs_number <=", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberLike(String value) {
            addCriterion("tbs_number like", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberNotLike(String value) {
            addCriterion("tbs_number not like", value, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberIn(List<String> values) {
            addCriterion("tbs_number in", values, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberNotIn(List<String> values) {
            addCriterion("tbs_number not in", values, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberBetween(String value1, String value2) {
            addCriterion("tbs_number between", value1, value2, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsNumberNotBetween(String value1, String value2) {
            addCriterion("tbs_number not between", value1, value2, "tbsNumber");
            return (Criteria) this;
        }

        public Criteria andTbsCarIsNull() {
            addCriterion("tbs_car is null");
            return (Criteria) this;
        }

        public Criteria andTbsCarIsNotNull() {
            addCriterion("tbs_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCarEqualTo(Long value) {
            addCriterion("tbs_car =", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotEqualTo(Long value) {
            addCriterion("tbs_car <>", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarGreaterThan(Long value) {
            addCriterion("tbs_car >", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbs_car >=", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarLessThan(Long value) {
            addCriterion("tbs_car <", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarLessThanOrEqualTo(Long value) {
            addCriterion("tbs_car <=", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarIn(List<Long> values) {
            addCriterion("tbs_car in", values, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotIn(List<Long> values) {
            addCriterion("tbs_car not in", values, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarBetween(Long value1, Long value2) {
            addCriterion("tbs_car between", value1, value2, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotBetween(Long value1, Long value2) {
            addCriterion("tbs_car not between", value1, value2, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsRentedIsNull() {
            addCriterion("tbs_rented is null");
            return (Criteria) this;
        }

        public Criteria andTbsRentedIsNotNull() {
            addCriterion("tbs_rented is not null");
            return (Criteria) this;
        }

        public Criteria andTbsRentedEqualTo(String value) {
            addCriterion("tbs_rented =", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedNotEqualTo(String value) {
            addCriterion("tbs_rented <>", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedGreaterThan(String value) {
            addCriterion("tbs_rented >", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_rented >=", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedLessThan(String value) {
            addCriterion("tbs_rented <", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedLessThanOrEqualTo(String value) {
            addCriterion("tbs_rented <=", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedLike(String value) {
            addCriterion("tbs_rented like", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedNotLike(String value) {
            addCriterion("tbs_rented not like", value, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedIn(List<String> values) {
            addCriterion("tbs_rented in", values, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedNotIn(List<String> values) {
            addCriterion("tbs_rented not in", values, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedBetween(String value1, String value2) {
            addCriterion("tbs_rented between", value1, value2, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsRentedNotBetween(String value1, String value2) {
            addCriterion("tbs_rented not between", value1, value2, "tbsRented");
            return (Criteria) this;
        }

        public Criteria andTbsWarnIsNull() {
            addCriterion("tbs_warn is null");
            return (Criteria) this;
        }

        public Criteria andTbsWarnIsNotNull() {
            addCriterion("tbs_warn is not null");
            return (Criteria) this;
        }

        public Criteria andTbsWarnEqualTo(String value) {
            addCriterion("tbs_warn =", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnNotEqualTo(String value) {
            addCriterion("tbs_warn <>", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnGreaterThan(String value) {
            addCriterion("tbs_warn >", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_warn >=", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnLessThan(String value) {
            addCriterion("tbs_warn <", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnLessThanOrEqualTo(String value) {
            addCriterion("tbs_warn <=", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnLike(String value) {
            addCriterion("tbs_warn like", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnNotLike(String value) {
            addCriterion("tbs_warn not like", value, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnIn(List<String> values) {
            addCriterion("tbs_warn in", values, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnNotIn(List<String> values) {
            addCriterion("tbs_warn not in", values, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnBetween(String value1, String value2) {
            addCriterion("tbs_warn between", value1, value2, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsWarnNotBetween(String value1, String value2) {
            addCriterion("tbs_warn not between", value1, value2, "tbsWarn");
            return (Criteria) this;
        }

        public Criteria andTbsRfidIsNull() {
            addCriterion("tbs_rfid is null");
            return (Criteria) this;
        }

        public Criteria andTbsRfidIsNotNull() {
            addCriterion("tbs_rfid is not null");
            return (Criteria) this;
        }

        public Criteria andTbsRfidEqualTo(String value) {
            addCriterion("tbs_rfid =", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidNotEqualTo(String value) {
            addCriterion("tbs_rfid <>", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidGreaterThan(String value) {
            addCriterion("tbs_rfid >", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_rfid >=", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidLessThan(String value) {
            addCriterion("tbs_rfid <", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidLessThanOrEqualTo(String value) {
            addCriterion("tbs_rfid <=", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidLike(String value) {
            addCriterion("tbs_rfid like", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidNotLike(String value) {
            addCriterion("tbs_rfid not like", value, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidIn(List<String> values) {
            addCriterion("tbs_rfid in", values, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidNotIn(List<String> values) {
            addCriterion("tbs_rfid not in", values, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidBetween(String value1, String value2) {
            addCriterion("tbs_rfid between", value1, value2, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidNotBetween(String value1, String value2) {
            addCriterion("tbs_rfid not between", value1, value2, "tbsRfid");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteIsNull() {
            addCriterion("tbs_rfid_dte is null");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteIsNotNull() {
            addCriterion("tbs_rfid_dte is not null");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteEqualTo(String value) {
            addCriterion("tbs_rfid_dte =", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteNotEqualTo(String value) {
            addCriterion("tbs_rfid_dte <>", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteGreaterThan(String value) {
            addCriterion("tbs_rfid_dte >", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_rfid_dte >=", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteLessThan(String value) {
            addCriterion("tbs_rfid_dte <", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteLessThanOrEqualTo(String value) {
            addCriterion("tbs_rfid_dte <=", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteLike(String value) {
            addCriterion("tbs_rfid_dte like", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteNotLike(String value) {
            addCriterion("tbs_rfid_dte not like", value, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteIn(List<String> values) {
            addCriterion("tbs_rfid_dte in", values, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteNotIn(List<String> values) {
            addCriterion("tbs_rfid_dte not in", values, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteBetween(String value1, String value2) {
            addCriterion("tbs_rfid_dte between", value1, value2, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsRfidDteNotBetween(String value1, String value2) {
            addCriterion("tbs_rfid_dte not between", value1, value2, "tbsRfidDte");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileIsNull() {
            addCriterion("tbs_obd_mile is null");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileIsNotNull() {
            addCriterion("tbs_obd_mile is not null");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileEqualTo(String value) {
            addCriterion("tbs_obd_mile =", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileNotEqualTo(String value) {
            addCriterion("tbs_obd_mile <>", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileGreaterThan(String value) {
            addCriterion("tbs_obd_mile >", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_obd_mile >=", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileLessThan(String value) {
            addCriterion("tbs_obd_mile <", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileLessThanOrEqualTo(String value) {
            addCriterion("tbs_obd_mile <=", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileLike(String value) {
            addCriterion("tbs_obd_mile like", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileNotLike(String value) {
            addCriterion("tbs_obd_mile not like", value, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileIn(List<String> values) {
            addCriterion("tbs_obd_mile in", values, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileNotIn(List<String> values) {
            addCriterion("tbs_obd_mile not in", values, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileBetween(String value1, String value2) {
            addCriterion("tbs_obd_mile between", value1, value2, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsObdMileNotBetween(String value1, String value2) {
            addCriterion("tbs_obd_mile not between", value1, value2, "tbsObdMile");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTIsNull() {
            addCriterion("tbs_engine_t is null");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTIsNotNull() {
            addCriterion("tbs_engine_t is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTEqualTo(Integer value) {
            addCriterion("tbs_engine_t =", value, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTNotEqualTo(Integer value) {
            addCriterion("tbs_engine_t <>", value, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTGreaterThan(Integer value) {
            addCriterion("tbs_engine_t >", value, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_engine_t >=", value, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTLessThan(Integer value) {
            addCriterion("tbs_engine_t <", value, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_engine_t <=", value, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTIn(List<Integer> values) {
            addCriterion("tbs_engine_t in", values, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTNotIn(List<Integer> values) {
            addCriterion("tbs_engine_t not in", values, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTBetween(Integer value1, Integer value2) {
            addCriterion("tbs_engine_t between", value1, value2, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsEngineTNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_engine_t not between", value1, value2, "tbsEngineT");
            return (Criteria) this;
        }

        public Criteria andTbsMileageIsNull() {
            addCriterion("tbs_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTbsMileageIsNotNull() {
            addCriterion("tbs_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTbsMileageEqualTo(Integer value) {
            addCriterion("tbs_mileage =", value, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageNotEqualTo(Integer value) {
            addCriterion("tbs_mileage <>", value, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageGreaterThan(Integer value) {
            addCriterion("tbs_mileage >", value, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_mileage >=", value, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageLessThan(Integer value) {
            addCriterion("tbs_mileage <", value, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_mileage <=", value, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageIn(List<Integer> values) {
            addCriterion("tbs_mileage in", values, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageNotIn(List<Integer> values) {
            addCriterion("tbs_mileage not in", values, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageBetween(Integer value1, Integer value2) {
            addCriterion("tbs_mileage between", value1, value2, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_mileage not between", value1, value2, "tbsMileage");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedIsNull() {
            addCriterion("tbs_speed is null");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedIsNotNull() {
            addCriterion("tbs_speed is not null");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedEqualTo(Short value) {
            addCriterion("tbs_speed =", value, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedNotEqualTo(Short value) {
            addCriterion("tbs_speed <>", value, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedGreaterThan(Short value) {
            addCriterion("tbs_speed >", value, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_speed >=", value, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedLessThan(Short value) {
            addCriterion("tbs_speed <", value, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedLessThanOrEqualTo(Short value) {
            addCriterion("tbs_speed <=", value, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedIn(List<Short> values) {
            addCriterion("tbs_speed in", values, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedNotIn(List<Short> values) {
            addCriterion("tbs_speed not in", values, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedBetween(Short value1, Short value2) {
            addCriterion("tbs_speed between", value1, value2, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsSpeedNotBetween(Short value1, Short value2) {
            addCriterion("tbs_speed not between", value1, value2, "tbsSpeed");
            return (Criteria) this;
        }

        public Criteria andTbsMotorIsNull() {
            addCriterion("tbs_motor is null");
            return (Criteria) this;
        }

        public Criteria andTbsMotorIsNotNull() {
            addCriterion("tbs_motor is not null");
            return (Criteria) this;
        }

        public Criteria andTbsMotorEqualTo(Short value) {
            addCriterion("tbs_motor =", value, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorNotEqualTo(Short value) {
            addCriterion("tbs_motor <>", value, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorGreaterThan(Short value) {
            addCriterion("tbs_motor >", value, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_motor >=", value, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorLessThan(Short value) {
            addCriterion("tbs_motor <", value, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorLessThanOrEqualTo(Short value) {
            addCriterion("tbs_motor <=", value, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorIn(List<Short> values) {
            addCriterion("tbs_motor in", values, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorNotIn(List<Short> values) {
            addCriterion("tbs_motor not in", values, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorBetween(Short value1, Short value2) {
            addCriterion("tbs_motor between", value1, value2, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsMotorNotBetween(Short value1, Short value2) {
            addCriterion("tbs_motor not between", value1, value2, "tbsMotor");
            return (Criteria) this;
        }

        public Criteria andTbsOilIsNull() {
            addCriterion("tbs_oil is null");
            return (Criteria) this;
        }

        public Criteria andTbsOilIsNotNull() {
            addCriterion("tbs_oil is not null");
            return (Criteria) this;
        }

        public Criteria andTbsOilEqualTo(String value) {
            addCriterion("tbs_oil =", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilNotEqualTo(String value) {
            addCriterion("tbs_oil <>", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilGreaterThan(String value) {
            addCriterion("tbs_oil >", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_oil >=", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilLessThan(String value) {
            addCriterion("tbs_oil <", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilLessThanOrEqualTo(String value) {
            addCriterion("tbs_oil <=", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilLike(String value) {
            addCriterion("tbs_oil like", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilNotLike(String value) {
            addCriterion("tbs_oil not like", value, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilIn(List<String> values) {
            addCriterion("tbs_oil in", values, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilNotIn(List<String> values) {
            addCriterion("tbs_oil not in", values, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilBetween(String value1, String value2) {
            addCriterion("tbs_oil between", value1, value2, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsOilNotBetween(String value1, String value2) {
            addCriterion("tbs_oil not between", value1, value2, "tbsOil");
            return (Criteria) this;
        }

        public Criteria andTbsPowerIsNull() {
            addCriterion("tbs_power is null");
            return (Criteria) this;
        }

        public Criteria andTbsPowerIsNotNull() {
            addCriterion("tbs_power is not null");
            return (Criteria) this;
        }

        public Criteria andTbsPowerEqualTo(Short value) {
            addCriterion("tbs_power =", value, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerNotEqualTo(Short value) {
            addCriterion("tbs_power <>", value, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerGreaterThan(Short value) {
            addCriterion("tbs_power >", value, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_power >=", value, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerLessThan(Short value) {
            addCriterion("tbs_power <", value, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerLessThanOrEqualTo(Short value) {
            addCriterion("tbs_power <=", value, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerIn(List<Short> values) {
            addCriterion("tbs_power in", values, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerNotIn(List<Short> values) {
            addCriterion("tbs_power not in", values, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerBetween(Short value1, Short value2) {
            addCriterion("tbs_power between", value1, value2, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsPowerNotBetween(Short value1, Short value2) {
            addCriterion("tbs_power not between", value1, value2, "tbsPower");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryIsNull() {
            addCriterion("tbs_ev_battery is null");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryIsNotNull() {
            addCriterion("tbs_ev_battery is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryEqualTo(Short value) {
            addCriterion("tbs_ev_battery =", value, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryNotEqualTo(Short value) {
            addCriterion("tbs_ev_battery <>", value, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryGreaterThan(Short value) {
            addCriterion("tbs_ev_battery >", value, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_ev_battery >=", value, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryLessThan(Short value) {
            addCriterion("tbs_ev_battery <", value, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryLessThanOrEqualTo(Short value) {
            addCriterion("tbs_ev_battery <=", value, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryIn(List<Short> values) {
            addCriterion("tbs_ev_battery in", values, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryNotIn(List<Short> values) {
            addCriterion("tbs_ev_battery not in", values, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryBetween(Short value1, Short value2) {
            addCriterion("tbs_ev_battery between", value1, value2, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsEvBatteryNotBetween(Short value1, Short value2) {
            addCriterion("tbs_ev_battery not between", value1, value2, "tbsEvBattery");
            return (Criteria) this;
        }

        public Criteria andTbsChargingIsNull() {
            addCriterion("tbs_charging is null");
            return (Criteria) this;
        }

        public Criteria andTbsChargingIsNotNull() {
            addCriterion("tbs_charging is not null");
            return (Criteria) this;
        }

        public Criteria andTbsChargingEqualTo(Byte value) {
            addCriterion("tbs_charging =", value, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingNotEqualTo(Byte value) {
            addCriterion("tbs_charging <>", value, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingGreaterThan(Byte value) {
            addCriterion("tbs_charging >", value, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_charging >=", value, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingLessThan(Byte value) {
            addCriterion("tbs_charging <", value, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_charging <=", value, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingIn(List<Byte> values) {
            addCriterion("tbs_charging in", values, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingNotIn(List<Byte> values) {
            addCriterion("tbs_charging not in", values, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingBetween(Byte value1, Byte value2) {
            addCriterion("tbs_charging between", value1, value2, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsChargingNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_charging not between", value1, value2, "tbsCharging");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageIsNull() {
            addCriterion("tbs_fuel_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageIsNotNull() {
            addCriterion("tbs_fuel_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageEqualTo(String value) {
            addCriterion("tbs_fuel_mileage =", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageNotEqualTo(String value) {
            addCriterion("tbs_fuel_mileage <>", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageGreaterThan(String value) {
            addCriterion("tbs_fuel_mileage >", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_fuel_mileage >=", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageLessThan(String value) {
            addCriterion("tbs_fuel_mileage <", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageLessThanOrEqualTo(String value) {
            addCriterion("tbs_fuel_mileage <=", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageLike(String value) {
            addCriterion("tbs_fuel_mileage like", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageNotLike(String value) {
            addCriterion("tbs_fuel_mileage not like", value, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageIn(List<String> values) {
            addCriterion("tbs_fuel_mileage in", values, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageNotIn(List<String> values) {
            addCriterion("tbs_fuel_mileage not in", values, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageBetween(String value1, String value2) {
            addCriterion("tbs_fuel_mileage between", value1, value2, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsFuelMileageNotBetween(String value1, String value2) {
            addCriterion("tbs_fuel_mileage not between", value1, value2, "tbsFuelMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageIsNull() {
            addCriterion("tbs_electric_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageIsNotNull() {
            addCriterion("tbs_electric_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageEqualTo(String value) {
            addCriterion("tbs_electric_mileage =", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageNotEqualTo(String value) {
            addCriterion("tbs_electric_mileage <>", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageGreaterThan(String value) {
            addCriterion("tbs_electric_mileage >", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_electric_mileage >=", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageLessThan(String value) {
            addCriterion("tbs_electric_mileage <", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageLessThanOrEqualTo(String value) {
            addCriterion("tbs_electric_mileage <=", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageLike(String value) {
            addCriterion("tbs_electric_mileage like", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageNotLike(String value) {
            addCriterion("tbs_electric_mileage not like", value, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageIn(List<String> values) {
            addCriterion("tbs_electric_mileage in", values, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageNotIn(List<String> values) {
            addCriterion("tbs_electric_mileage not in", values, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageBetween(String value1, String value2) {
            addCriterion("tbs_electric_mileage between", value1, value2, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsElectricMileageNotBetween(String value1, String value2) {
            addCriterion("tbs_electric_mileage not between", value1, value2, "tbsElectricMileage");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceIsNull() {
            addCriterion("tbs_endurance is null");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceIsNotNull() {
            addCriterion("tbs_endurance is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceEqualTo(Short value) {
            addCriterion("tbs_endurance =", value, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceNotEqualTo(Short value) {
            addCriterion("tbs_endurance <>", value, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceGreaterThan(Short value) {
            addCriterion("tbs_endurance >", value, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_endurance >=", value, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceLessThan(Short value) {
            addCriterion("tbs_endurance <", value, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceLessThanOrEqualTo(Short value) {
            addCriterion("tbs_endurance <=", value, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceIn(List<Short> values) {
            addCriterion("tbs_endurance in", values, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceNotIn(List<Short> values) {
            addCriterion("tbs_endurance not in", values, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceBetween(Short value1, Short value2) {
            addCriterion("tbs_endurance between", value1, value2, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsEnduranceNotBetween(Short value1, Short value2) {
            addCriterion("tbs_endurance not between", value1, value2, "tbsEndurance");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureIsNull() {
            addCriterion("tbs_temperature is null");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureIsNotNull() {
            addCriterion("tbs_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureEqualTo(Integer value) {
            addCriterion("tbs_temperature =", value, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureNotEqualTo(Integer value) {
            addCriterion("tbs_temperature <>", value, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureGreaterThan(Integer value) {
            addCriterion("tbs_temperature >", value, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_temperature >=", value, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureLessThan(Integer value) {
            addCriterion("tbs_temperature <", value, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_temperature <=", value, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureIn(List<Integer> values) {
            addCriterion("tbs_temperature in", values, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureNotIn(List<Integer> values) {
            addCriterion("tbs_temperature not in", values, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("tbs_temperature between", value1, value2, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_temperature not between", value1, value2, "tbsTemperature");
            return (Criteria) this;
        }

        public Criteria andTbsCsqIsNull() {
            addCriterion("tbs_csq is null");
            return (Criteria) this;
        }

        public Criteria andTbsCsqIsNotNull() {
            addCriterion("tbs_csq is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCsqEqualTo(Short value) {
            addCriterion("tbs_csq =", value, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqNotEqualTo(Short value) {
            addCriterion("tbs_csq <>", value, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqGreaterThan(Short value) {
            addCriterion("tbs_csq >", value, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_csq >=", value, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqLessThan(Short value) {
            addCriterion("tbs_csq <", value, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqLessThanOrEqualTo(Short value) {
            addCriterion("tbs_csq <=", value, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqIn(List<Short> values) {
            addCriterion("tbs_csq in", values, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqNotIn(List<Short> values) {
            addCriterion("tbs_csq not in", values, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqBetween(Short value1, Short value2) {
            addCriterion("tbs_csq between", value1, value2, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsCsqNotBetween(Short value1, Short value2) {
            addCriterion("tbs_csq not between", value1, value2, "tbsCsq");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionIsNull() {
            addCriterion("tbs_power_consumption is null");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionIsNotNull() {
            addCriterion("tbs_power_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionEqualTo(String value) {
            addCriterion("tbs_power_consumption =", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionNotEqualTo(String value) {
            addCriterion("tbs_power_consumption <>", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionGreaterThan(String value) {
            addCriterion("tbs_power_consumption >", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_power_consumption >=", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionLessThan(String value) {
            addCriterion("tbs_power_consumption <", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionLessThanOrEqualTo(String value) {
            addCriterion("tbs_power_consumption <=", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionLike(String value) {
            addCriterion("tbs_power_consumption like", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionNotLike(String value) {
            addCriterion("tbs_power_consumption not like", value, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionIn(List<String> values) {
            addCriterion("tbs_power_consumption in", values, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionNotIn(List<String> values) {
            addCriterion("tbs_power_consumption not in", values, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionBetween(String value1, String value2) {
            addCriterion("tbs_power_consumption between", value1, value2, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsPowerConsumptionNotBetween(String value1, String value2) {
            addCriterion("tbs_power_consumption not between", value1, value2, "tbsPowerConsumption");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeIsNull() {
            addCriterion("tbs_longitude is null");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeIsNotNull() {
            addCriterion("tbs_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeEqualTo(BigDecimal value) {
            addCriterion("tbs_longitude =", value, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("tbs_longitude <>", value, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeGreaterThan(BigDecimal value) {
            addCriterion("tbs_longitude >", value, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbs_longitude >=", value, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeLessThan(BigDecimal value) {
            addCriterion("tbs_longitude <", value, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbs_longitude <=", value, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeIn(List<BigDecimal> values) {
            addCriterion("tbs_longitude in", values, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("tbs_longitude not in", values, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbs_longitude between", value1, value2, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbs_longitude not between", value1, value2, "tbsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeIsNull() {
            addCriterion("tbs_latitude is null");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeIsNotNull() {
            addCriterion("tbs_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeEqualTo(BigDecimal value) {
            addCriterion("tbs_latitude =", value, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("tbs_latitude <>", value, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeGreaterThan(BigDecimal value) {
            addCriterion("tbs_latitude >", value, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbs_latitude >=", value, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeLessThan(BigDecimal value) {
            addCriterion("tbs_latitude <", value, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbs_latitude <=", value, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeIn(List<BigDecimal> values) {
            addCriterion("tbs_latitude in", values, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("tbs_latitude not in", values, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbs_latitude between", value1, value2, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbs_latitude not between", value1, value2, "tbsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbsDirIsNull() {
            addCriterion("tbs_dir is null");
            return (Criteria) this;
        }

        public Criteria andTbsDirIsNotNull() {
            addCriterion("tbs_dir is not null");
            return (Criteria) this;
        }

        public Criteria andTbsDirEqualTo(Short value) {
            addCriterion("tbs_dir =", value, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirNotEqualTo(Short value) {
            addCriterion("tbs_dir <>", value, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirGreaterThan(Short value) {
            addCriterion("tbs_dir >", value, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_dir >=", value, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirLessThan(Short value) {
            addCriterion("tbs_dir <", value, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirLessThanOrEqualTo(Short value) {
            addCriterion("tbs_dir <=", value, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirIn(List<Short> values) {
            addCriterion("tbs_dir in", values, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirNotIn(List<Short> values) {
            addCriterion("tbs_dir not in", values, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirBetween(Short value1, Short value2) {
            addCriterion("tbs_dir between", value1, value2, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsDirNotBetween(Short value1, Short value2) {
            addCriterion("tbs_dir not between", value1, value2, "tbsDir");
            return (Criteria) this;
        }

        public Criteria andTbsCircularIsNull() {
            addCriterion("tbs_circular is null");
            return (Criteria) this;
        }

        public Criteria andTbsCircularIsNotNull() {
            addCriterion("tbs_circular is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCircularEqualTo(Byte value) {
            addCriterion("tbs_circular =", value, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularNotEqualTo(Byte value) {
            addCriterion("tbs_circular <>", value, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularGreaterThan(Byte value) {
            addCriterion("tbs_circular >", value, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_circular >=", value, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularLessThan(Byte value) {
            addCriterion("tbs_circular <", value, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_circular <=", value, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularIn(List<Byte> values) {
            addCriterion("tbs_circular in", values, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularNotIn(List<Byte> values) {
            addCriterion("tbs_circular not in", values, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularBetween(Byte value1, Byte value2) {
            addCriterion("tbs_circular between", value1, value2, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsCircularNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_circular not between", value1, value2, "tbsCircular");
            return (Criteria) this;
        }

        public Criteria andTbsPtcIsNull() {
            addCriterion("tbs_ptc is null");
            return (Criteria) this;
        }

        public Criteria andTbsPtcIsNotNull() {
            addCriterion("tbs_ptc is not null");
            return (Criteria) this;
        }

        public Criteria andTbsPtcEqualTo(Byte value) {
            addCriterion("tbs_ptc =", value, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcNotEqualTo(Byte value) {
            addCriterion("tbs_ptc <>", value, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcGreaterThan(Byte value) {
            addCriterion("tbs_ptc >", value, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_ptc >=", value, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcLessThan(Byte value) {
            addCriterion("tbs_ptc <", value, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_ptc <=", value, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcIn(List<Byte> values) {
            addCriterion("tbs_ptc in", values, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcNotIn(List<Byte> values) {
            addCriterion("tbs_ptc not in", values, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcBetween(Byte value1, Byte value2) {
            addCriterion("tbs_ptc between", value1, value2, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsPtcNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_ptc not between", value1, value2, "tbsPtc");
            return (Criteria) this;
        }

        public Criteria andTbsCompresIsNull() {
            addCriterion("tbs_compres is null");
            return (Criteria) this;
        }

        public Criteria andTbsCompresIsNotNull() {
            addCriterion("tbs_compres is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCompresEqualTo(Byte value) {
            addCriterion("tbs_compres =", value, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresNotEqualTo(Byte value) {
            addCriterion("tbs_compres <>", value, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresGreaterThan(Byte value) {
            addCriterion("tbs_compres >", value, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_compres >=", value, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresLessThan(Byte value) {
            addCriterion("tbs_compres <", value, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_compres <=", value, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresIn(List<Byte> values) {
            addCriterion("tbs_compres in", values, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresNotIn(List<Byte> values) {
            addCriterion("tbs_compres not in", values, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresBetween(Byte value1, Byte value2) {
            addCriterion("tbs_compres between", value1, value2, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsCompresNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_compres not between", value1, value2, "tbsCompres");
            return (Criteria) this;
        }

        public Criteria andTbsFanIsNull() {
            addCriterion("tbs_fan is null");
            return (Criteria) this;
        }

        public Criteria andTbsFanIsNotNull() {
            addCriterion("tbs_fan is not null");
            return (Criteria) this;
        }

        public Criteria andTbsFanEqualTo(Byte value) {
            addCriterion("tbs_fan =", value, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanNotEqualTo(Byte value) {
            addCriterion("tbs_fan <>", value, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanGreaterThan(Byte value) {
            addCriterion("tbs_fan >", value, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_fan >=", value, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanLessThan(Byte value) {
            addCriterion("tbs_fan <", value, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_fan <=", value, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanIn(List<Byte> values) {
            addCriterion("tbs_fan in", values, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanNotIn(List<Byte> values) {
            addCriterion("tbs_fan not in", values, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanBetween(Byte value1, Byte value2) {
            addCriterion("tbs_fan between", value1, value2, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsFanNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_fan not between", value1, value2, "tbsFan");
            return (Criteria) this;
        }

        public Criteria andTbsSavingIsNull() {
            addCriterion("tbs_saving is null");
            return (Criteria) this;
        }

        public Criteria andTbsSavingIsNotNull() {
            addCriterion("tbs_saving is not null");
            return (Criteria) this;
        }

        public Criteria andTbsSavingEqualTo(Byte value) {
            addCriterion("tbs_saving =", value, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingNotEqualTo(Byte value) {
            addCriterion("tbs_saving <>", value, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingGreaterThan(Byte value) {
            addCriterion("tbs_saving >", value, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_saving >=", value, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingLessThan(Byte value) {
            addCriterion("tbs_saving <", value, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_saving <=", value, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingIn(List<Byte> values) {
            addCriterion("tbs_saving in", values, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingNotIn(List<Byte> values) {
            addCriterion("tbs_saving not in", values, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingBetween(Byte value1, Byte value2) {
            addCriterion("tbs_saving between", value1, value2, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsSavingNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_saving not between", value1, value2, "tbsSaving");
            return (Criteria) this;
        }

        public Criteria andTbsDoorIsNull() {
            addCriterion("tbs_door is null");
            return (Criteria) this;
        }

        public Criteria andTbsDoorIsNotNull() {
            addCriterion("tbs_door is not null");
            return (Criteria) this;
        }

        public Criteria andTbsDoorEqualTo(Byte value) {
            addCriterion("tbs_door =", value, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorNotEqualTo(Byte value) {
            addCriterion("tbs_door <>", value, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorGreaterThan(Byte value) {
            addCriterion("tbs_door >", value, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_door >=", value, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorLessThan(Byte value) {
            addCriterion("tbs_door <", value, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_door <=", value, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorIn(List<Byte> values) {
            addCriterion("tbs_door in", values, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorNotIn(List<Byte> values) {
            addCriterion("tbs_door not in", values, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorBetween(Byte value1, Byte value2) {
            addCriterion("tbs_door between", value1, value2, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsDoorNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_door not between", value1, value2, "tbsDoor");
            return (Criteria) this;
        }

        public Criteria andTbsLockIsNull() {
            addCriterion("tbs_lock is null");
            return (Criteria) this;
        }

        public Criteria andTbsLockIsNotNull() {
            addCriterion("tbs_lock is not null");
            return (Criteria) this;
        }

        public Criteria andTbsLockEqualTo(Short value) {
            addCriterion("tbs_lock =", value, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockNotEqualTo(Short value) {
            addCriterion("tbs_lock <>", value, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockGreaterThan(Short value) {
            addCriterion("tbs_lock >", value, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_lock >=", value, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockLessThan(Short value) {
            addCriterion("tbs_lock <", value, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockLessThanOrEqualTo(Short value) {
            addCriterion("tbs_lock <=", value, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockIn(List<Short> values) {
            addCriterion("tbs_lock in", values, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockNotIn(List<Short> values) {
            addCriterion("tbs_lock not in", values, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockBetween(Short value1, Short value2) {
            addCriterion("tbs_lock between", value1, value2, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLockNotBetween(Short value1, Short value2) {
            addCriterion("tbs_lock not between", value1, value2, "tbsLock");
            return (Criteria) this;
        }

        public Criteria andTbsLightIsNull() {
            addCriterion("tbs_light is null");
            return (Criteria) this;
        }

        public Criteria andTbsLightIsNotNull() {
            addCriterion("tbs_light is not null");
            return (Criteria) this;
        }

        public Criteria andTbsLightEqualTo(Integer value) {
            addCriterion("tbs_light =", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightNotEqualTo(Integer value) {
            addCriterion("tbs_light <>", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightGreaterThan(Integer value) {
            addCriterion("tbs_light >", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_light >=", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightLessThan(Integer value) {
            addCriterion("tbs_light <", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_light <=", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightIn(List<Integer> values) {
            addCriterion("tbs_light in", values, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightNotIn(List<Integer> values) {
            addCriterion("tbs_light not in", values, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightBetween(Integer value1, Integer value2) {
            addCriterion("tbs_light between", value1, value2, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_light not between", value1, value2, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsEngineIsNull() {
            addCriterion("tbs_engine is null");
            return (Criteria) this;
        }

        public Criteria andTbsEngineIsNotNull() {
            addCriterion("tbs_engine is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEngineEqualTo(Short value) {
            addCriterion("tbs_engine =", value, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineNotEqualTo(Short value) {
            addCriterion("tbs_engine <>", value, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineGreaterThan(Short value) {
            addCriterion("tbs_engine >", value, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_engine >=", value, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineLessThan(Short value) {
            addCriterion("tbs_engine <", value, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineLessThanOrEqualTo(Short value) {
            addCriterion("tbs_engine <=", value, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineIn(List<Short> values) {
            addCriterion("tbs_engine in", values, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineNotIn(List<Short> values) {
            addCriterion("tbs_engine not in", values, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineBetween(Short value1, Short value2) {
            addCriterion("tbs_engine between", value1, value2, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsEngineNotBetween(Short value1, Short value2) {
            addCriterion("tbs_engine not between", value1, value2, "tbsEngine");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacIsNull() {
            addCriterion("tbs_base_lac is null");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacIsNotNull() {
            addCriterion("tbs_base_lac is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacEqualTo(Integer value) {
            addCriterion("tbs_base_lac =", value, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacNotEqualTo(Integer value) {
            addCriterion("tbs_base_lac <>", value, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacGreaterThan(Integer value) {
            addCriterion("tbs_base_lac >", value, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_base_lac >=", value, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacLessThan(Integer value) {
            addCriterion("tbs_base_lac <", value, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_base_lac <=", value, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacIn(List<Integer> values) {
            addCriterion("tbs_base_lac in", values, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacNotIn(List<Integer> values) {
            addCriterion("tbs_base_lac not in", values, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacBetween(Integer value1, Integer value2) {
            addCriterion("tbs_base_lac between", value1, value2, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseLacNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_base_lac not between", value1, value2, "tbsBaseLac");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiIsNull() {
            addCriterion("tbs_base_ci is null");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiIsNotNull() {
            addCriterion("tbs_base_ci is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiEqualTo(Integer value) {
            addCriterion("tbs_base_ci =", value, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiNotEqualTo(Integer value) {
            addCriterion("tbs_base_ci <>", value, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiGreaterThan(Integer value) {
            addCriterion("tbs_base_ci >", value, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_base_ci >=", value, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiLessThan(Integer value) {
            addCriterion("tbs_base_ci <", value, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_base_ci <=", value, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiIn(List<Integer> values) {
            addCriterion("tbs_base_ci in", values, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiNotIn(List<Integer> values) {
            addCriterion("tbs_base_ci not in", values, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiBetween(Integer value1, Integer value2) {
            addCriterion("tbs_base_ci between", value1, value2, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsBaseCiNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_base_ci not between", value1, value2, "tbsBaseCi");
            return (Criteria) this;
        }

        public Criteria andTbsOrderIsNull() {
            addCriterion("tbs_order is null");
            return (Criteria) this;
        }

        public Criteria andTbsOrderIsNotNull() {
            addCriterion("tbs_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbsOrderEqualTo(String value) {
            addCriterion("tbs_order =", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderNotEqualTo(String value) {
            addCriterion("tbs_order <>", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderGreaterThan(String value) {
            addCriterion("tbs_order >", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_order >=", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderLessThan(String value) {
            addCriterion("tbs_order <", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderLessThanOrEqualTo(String value) {
            addCriterion("tbs_order <=", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderLike(String value) {
            addCriterion("tbs_order like", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderNotLike(String value) {
            addCriterion("tbs_order not like", value, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderIn(List<String> values) {
            addCriterion("tbs_order in", values, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderNotIn(List<String> values) {
            addCriterion("tbs_order not in", values, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderBetween(String value1, String value2) {
            addCriterion("tbs_order between", value1, value2, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsOrderNotBetween(String value1, String value2) {
            addCriterion("tbs_order not between", value1, value2, "tbsOrder");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataIsNull() {
            addCriterion("tbs_mo_data is null");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataIsNotNull() {
            addCriterion("tbs_mo_data is not null");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataEqualTo(String value) {
            addCriterion("tbs_mo_data =", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataNotEqualTo(String value) {
            addCriterion("tbs_mo_data <>", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataGreaterThan(String value) {
            addCriterion("tbs_mo_data >", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_mo_data >=", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataLessThan(String value) {
            addCriterion("tbs_mo_data <", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataLessThanOrEqualTo(String value) {
            addCriterion("tbs_mo_data <=", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataLike(String value) {
            addCriterion("tbs_mo_data like", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataNotLike(String value) {
            addCriterion("tbs_mo_data not like", value, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataIn(List<String> values) {
            addCriterion("tbs_mo_data in", values, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataNotIn(List<String> values) {
            addCriterion("tbs_mo_data not in", values, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataBetween(String value1, String value2) {
            addCriterion("tbs_mo_data between", value1, value2, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsMoDataNotBetween(String value1, String value2) {
            addCriterion("tbs_mo_data not between", value1, value2, "tbsMoData");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeIsNull() {
            addCriterion("tbs_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeIsNotNull() {
            addCriterion("tbs_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeEqualTo(Date value) {
            addCriterion("tbs_add_time =", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeNotEqualTo(Date value) {
            addCriterion("tbs_add_time <>", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeGreaterThan(Date value) {
            addCriterion("tbs_add_time >", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbs_add_time >=", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeLessThan(Date value) {
            addCriterion("tbs_add_time <", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbs_add_time <=", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeIn(List<Date> values) {
            addCriterion("tbs_add_time in", values, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeNotIn(List<Date> values) {
            addCriterion("tbs_add_time not in", values, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbs_add_time between", value1, value2, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbs_add_time not between", value1, value2, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeIsNull() {
            addCriterion("tbs_current_time is null");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeIsNotNull() {
            addCriterion("tbs_current_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeEqualTo(Date value) {
            addCriterion("tbs_current_time =", value, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeNotEqualTo(Date value) {
            addCriterion("tbs_current_time <>", value, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeGreaterThan(Date value) {
            addCriterion("tbs_current_time >", value, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbs_current_time >=", value, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeLessThan(Date value) {
            addCriterion("tbs_current_time <", value, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbs_current_time <=", value, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeIn(List<Date> values) {
            addCriterion("tbs_current_time in", values, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeNotIn(List<Date> values) {
            addCriterion("tbs_current_time not in", values, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeBetween(Date value1, Date value2) {
            addCriterion("tbs_current_time between", value1, value2, "tbsCurrentTime");
            return (Criteria) this;
        }

        public Criteria andTbsCurrentTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbs_current_time not between", value1, value2, "tbsCurrentTime");
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