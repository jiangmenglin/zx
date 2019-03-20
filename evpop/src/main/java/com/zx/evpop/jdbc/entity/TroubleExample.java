package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TroubleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TroubleExample() {
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

        public Criteria andTbtIdIsNull() {
            addCriterion("tbt_id is null");
            return (Criteria) this;
        }

        public Criteria andTbtIdIsNotNull() {
            addCriterion("tbt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbtIdEqualTo(Long value) {
            addCriterion("tbt_id =", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdNotEqualTo(Long value) {
            addCriterion("tbt_id <>", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdGreaterThan(Long value) {
            addCriterion("tbt_id >", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_id >=", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdLessThan(Long value) {
            addCriterion("tbt_id <", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdLessThanOrEqualTo(Long value) {
            addCriterion("tbt_id <=", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdIn(List<Long> values) {
            addCriterion("tbt_id in", values, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdNotIn(List<Long> values) {
            addCriterion("tbt_id not in", values, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdBetween(Long value1, Long value2) {
            addCriterion("tbt_id between", value1, value2, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdNotBetween(Long value1, Long value2) {
            addCriterion("tbt_id not between", value1, value2, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtHostIsNull() {
            addCriterion("tbt_host is null");
            return (Criteria) this;
        }

        public Criteria andTbtHostIsNotNull() {
            addCriterion("tbt_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbtHostEqualTo(Long value) {
            addCriterion("tbt_host =", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostNotEqualTo(Long value) {
            addCriterion("tbt_host <>", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostGreaterThan(Long value) {
            addCriterion("tbt_host >", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_host >=", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostLessThan(Long value) {
            addCriterion("tbt_host <", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostLessThanOrEqualTo(Long value) {
            addCriterion("tbt_host <=", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostIn(List<Long> values) {
            addCriterion("tbt_host in", values, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostNotIn(List<Long> values) {
            addCriterion("tbt_host not in", values, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostBetween(Long value1, Long value2) {
            addCriterion("tbt_host between", value1, value2, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostNotBetween(Long value1, Long value2) {
            addCriterion("tbt_host not between", value1, value2, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtOrderIsNull() {
            addCriterion("tbt_order is null");
            return (Criteria) this;
        }

        public Criteria andTbtOrderIsNotNull() {
            addCriterion("tbt_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbtOrderEqualTo(Long value) {
            addCriterion("tbt_order =", value, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderNotEqualTo(Long value) {
            addCriterion("tbt_order <>", value, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderGreaterThan(Long value) {
            addCriterion("tbt_order >", value, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_order >=", value, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderLessThan(Long value) {
            addCriterion("tbt_order <", value, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbt_order <=", value, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderIn(List<Long> values) {
            addCriterion("tbt_order in", values, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderNotIn(List<Long> values) {
            addCriterion("tbt_order not in", values, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderBetween(Long value1, Long value2) {
            addCriterion("tbt_order between", value1, value2, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbt_order not between", value1, value2, "tbtOrder");
            return (Criteria) this;
        }

        public Criteria andTbtMemberIsNull() {
            addCriterion("tbt_member is null");
            return (Criteria) this;
        }

        public Criteria andTbtMemberIsNotNull() {
            addCriterion("tbt_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbtMemberEqualTo(Long value) {
            addCriterion("tbt_member =", value, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberNotEqualTo(Long value) {
            addCriterion("tbt_member <>", value, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberGreaterThan(Long value) {
            addCriterion("tbt_member >", value, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_member >=", value, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberLessThan(Long value) {
            addCriterion("tbt_member <", value, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberLessThanOrEqualTo(Long value) {
            addCriterion("tbt_member <=", value, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberIn(List<Long> values) {
            addCriterion("tbt_member in", values, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberNotIn(List<Long> values) {
            addCriterion("tbt_member not in", values, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberBetween(Long value1, Long value2) {
            addCriterion("tbt_member between", value1, value2, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtMemberNotBetween(Long value1, Long value2) {
            addCriterion("tbt_member not between", value1, value2, "tbtMember");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoIsNull() {
            addCriterion("tbt_driver_info is null");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoIsNotNull() {
            addCriterion("tbt_driver_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoEqualTo(String value) {
            addCriterion("tbt_driver_info =", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoNotEqualTo(String value) {
            addCriterion("tbt_driver_info <>", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoGreaterThan(String value) {
            addCriterion("tbt_driver_info >", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_driver_info >=", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoLessThan(String value) {
            addCriterion("tbt_driver_info <", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoLessThanOrEqualTo(String value) {
            addCriterion("tbt_driver_info <=", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoLike(String value) {
            addCriterion("tbt_driver_info like", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoNotLike(String value) {
            addCriterion("tbt_driver_info not like", value, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoIn(List<String> values) {
            addCriterion("tbt_driver_info in", values, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoNotIn(List<String> values) {
            addCriterion("tbt_driver_info not in", values, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoBetween(String value1, String value2) {
            addCriterion("tbt_driver_info between", value1, value2, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtDriverInfoNotBetween(String value1, String value2) {
            addCriterion("tbt_driver_info not between", value1, value2, "tbtDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbtCarIsNull() {
            addCriterion("tbt_car is null");
            return (Criteria) this;
        }

        public Criteria andTbtCarIsNotNull() {
            addCriterion("tbt_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbtCarEqualTo(Long value) {
            addCriterion("tbt_car =", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarNotEqualTo(Long value) {
            addCriterion("tbt_car <>", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarGreaterThan(Long value) {
            addCriterion("tbt_car >", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_car >=", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarLessThan(Long value) {
            addCriterion("tbt_car <", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarLessThanOrEqualTo(Long value) {
            addCriterion("tbt_car <=", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarIn(List<Long> values) {
            addCriterion("tbt_car in", values, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarNotIn(List<Long> values) {
            addCriterion("tbt_car not in", values, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarBetween(Long value1, Long value2) {
            addCriterion("tbt_car between", value1, value2, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarNotBetween(Long value1, Long value2) {
            addCriterion("tbt_car not between", value1, value2, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtTypeIsNull() {
            addCriterion("tbt_type is null");
            return (Criteria) this;
        }

        public Criteria andTbtTypeIsNotNull() {
            addCriterion("tbt_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbtTypeEqualTo(Byte value) {
            addCriterion("tbt_type =", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeNotEqualTo(Byte value) {
            addCriterion("tbt_type <>", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeGreaterThan(Byte value) {
            addCriterion("tbt_type >", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_type >=", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeLessThan(Byte value) {
            addCriterion("tbt_type <", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_type <=", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeIn(List<Byte> values) {
            addCriterion("tbt_type in", values, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeNotIn(List<Byte> values) {
            addCriterion("tbt_type not in", values, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbt_type between", value1, value2, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_type not between", value1, value2, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeIsNull() {
            addCriterion("tbt_repair_type is null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeIsNotNull() {
            addCriterion("tbt_repair_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeEqualTo(Byte value) {
            addCriterion("tbt_repair_type =", value, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeNotEqualTo(Byte value) {
            addCriterion("tbt_repair_type <>", value, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeGreaterThan(Byte value) {
            addCriterion("tbt_repair_type >", value, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_repair_type >=", value, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeLessThan(Byte value) {
            addCriterion("tbt_repair_type <", value, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_repair_type <=", value, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeIn(List<Byte> values) {
            addCriterion("tbt_repair_type in", values, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeNotIn(List<Byte> values) {
            addCriterion("tbt_repair_type not in", values, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbt_repair_type between", value1, value2, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_repair_type not between", value1, value2, "tbtRepairType");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrIsNull() {
            addCriterion("tbt_repair_adr is null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrIsNotNull() {
            addCriterion("tbt_repair_adr is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrEqualTo(Long value) {
            addCriterion("tbt_repair_adr =", value, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrNotEqualTo(Long value) {
            addCriterion("tbt_repair_adr <>", value, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrGreaterThan(Long value) {
            addCriterion("tbt_repair_adr >", value, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_repair_adr >=", value, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrLessThan(Long value) {
            addCriterion("tbt_repair_adr <", value, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrLessThanOrEqualTo(Long value) {
            addCriterion("tbt_repair_adr <=", value, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrIn(List<Long> values) {
            addCriterion("tbt_repair_adr in", values, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrNotIn(List<Long> values) {
            addCriterion("tbt_repair_adr not in", values, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrBetween(Long value1, Long value2) {
            addCriterion("tbt_repair_adr between", value1, value2, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairAdrNotBetween(Long value1, Long value2) {
            addCriterion("tbt_repair_adr not between", value1, value2, "tbtRepairAdr");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeIsNull() {
            addCriterion("tbt_repair_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeIsNotNull() {
            addCriterion("tbt_repair_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeEqualTo(Date value) {
            addCriterion("tbt_repair_time =", value, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeNotEqualTo(Date value) {
            addCriterion("tbt_repair_time <>", value, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeGreaterThan(Date value) {
            addCriterion("tbt_repair_time >", value, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_repair_time >=", value, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeLessThan(Date value) {
            addCriterion("tbt_repair_time <", value, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_repair_time <=", value, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeIn(List<Date> values) {
            addCriterion("tbt_repair_time in", values, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeNotIn(List<Date> values) {
            addCriterion("tbt_repair_time not in", values, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_repair_time between", value1, value2, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtRepairTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_repair_time not between", value1, value2, "tbtRepairTime");
            return (Criteria) this;
        }

        public Criteria andTbtAreaIsNull() {
            addCriterion("tbt_area is null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaIsNotNull() {
            addCriterion("tbt_area is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaEqualTo(Long value) {
            addCriterion("tbt_area =", value, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaNotEqualTo(Long value) {
            addCriterion("tbt_area <>", value, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaGreaterThan(Long value) {
            addCriterion("tbt_area >", value, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_area >=", value, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaLessThan(Long value) {
            addCriterion("tbt_area <", value, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaLessThanOrEqualTo(Long value) {
            addCriterion("tbt_area <=", value, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaIn(List<Long> values) {
            addCriterion("tbt_area in", values, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaNotIn(List<Long> values) {
            addCriterion("tbt_area not in", values, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaBetween(Long value1, Long value2) {
            addCriterion("tbt_area between", value1, value2, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtAreaNotBetween(Long value1, Long value2) {
            addCriterion("tbt_area not between", value1, value2, "tbtArea");
            return (Criteria) this;
        }

        public Criteria andTbtRepairIsNull() {
            addCriterion("tbt_repair is null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairIsNotNull() {
            addCriterion("tbt_repair is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairEqualTo(Long value) {
            addCriterion("tbt_repair =", value, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairNotEqualTo(Long value) {
            addCriterion("tbt_repair <>", value, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairGreaterThan(Long value) {
            addCriterion("tbt_repair >", value, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_repair >=", value, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairLessThan(Long value) {
            addCriterion("tbt_repair <", value, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairLessThanOrEqualTo(Long value) {
            addCriterion("tbt_repair <=", value, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairIn(List<Long> values) {
            addCriterion("tbt_repair in", values, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairNotIn(List<Long> values) {
            addCriterion("tbt_repair not in", values, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBetween(Long value1, Long value2) {
            addCriterion("tbt_repair between", value1, value2, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtRepairNotBetween(Long value1, Long value2) {
            addCriterion("tbt_repair not between", value1, value2, "tbtRepair");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumIsNull() {
            addCriterion("tbt_report_num is null");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumIsNotNull() {
            addCriterion("tbt_report_num is not null");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumEqualTo(String value) {
            addCriterion("tbt_report_num =", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumNotEqualTo(String value) {
            addCriterion("tbt_report_num <>", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumGreaterThan(String value) {
            addCriterion("tbt_report_num >", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_report_num >=", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumLessThan(String value) {
            addCriterion("tbt_report_num <", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumLessThanOrEqualTo(String value) {
            addCriterion("tbt_report_num <=", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumLike(String value) {
            addCriterion("tbt_report_num like", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumNotLike(String value) {
            addCriterion("tbt_report_num not like", value, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumIn(List<String> values) {
            addCriterion("tbt_report_num in", values, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumNotIn(List<String> values) {
            addCriterion("tbt_report_num not in", values, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumBetween(String value1, String value2) {
            addCriterion("tbt_report_num between", value1, value2, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtReportNumNotBetween(String value1, String value2) {
            addCriterion("tbt_report_num not between", value1, value2, "tbtReportNum");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeIsNull() {
            addCriterion("tbt_insure_type is null");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeIsNotNull() {
            addCriterion("tbt_insure_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeEqualTo(Byte value) {
            addCriterion("tbt_insure_type =", value, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeNotEqualTo(Byte value) {
            addCriterion("tbt_insure_type <>", value, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeGreaterThan(Byte value) {
            addCriterion("tbt_insure_type >", value, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_insure_type >=", value, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeLessThan(Byte value) {
            addCriterion("tbt_insure_type <", value, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_insure_type <=", value, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeIn(List<Byte> values) {
            addCriterion("tbt_insure_type in", values, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeNotIn(List<Byte> values) {
            addCriterion("tbt_insure_type not in", values, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbt_insure_type between", value1, value2, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtInsureTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_insure_type not between", value1, value2, "tbtInsureType");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeIsNull() {
            addCriterion("tbt_happen_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeIsNotNull() {
            addCriterion("tbt_happen_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeEqualTo(Date value) {
            addCriterion("tbt_happen_time =", value, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeNotEqualTo(Date value) {
            addCriterion("tbt_happen_time <>", value, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeGreaterThan(Date value) {
            addCriterion("tbt_happen_time >", value, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_happen_time >=", value, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeLessThan(Date value) {
            addCriterion("tbt_happen_time <", value, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_happen_time <=", value, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeIn(List<Date> values) {
            addCriterion("tbt_happen_time in", values, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeNotIn(List<Date> values) {
            addCriterion("tbt_happen_time not in", values, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_happen_time between", value1, value2, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtHappenTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_happen_time not between", value1, value2, "tbtHappenTime");
            return (Criteria) this;
        }

        public Criteria andTbtAdderIsNull() {
            addCriterion("tbt_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbtAdderIsNotNull() {
            addCriterion("tbt_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAdderEqualTo(Long value) {
            addCriterion("tbt_adder =", value, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderNotEqualTo(Long value) {
            addCriterion("tbt_adder <>", value, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderGreaterThan(Long value) {
            addCriterion("tbt_adder >", value, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_adder >=", value, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderLessThan(Long value) {
            addCriterion("tbt_adder <", value, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbt_adder <=", value, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderIn(List<Long> values) {
            addCriterion("tbt_adder in", values, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderNotIn(List<Long> values) {
            addCriterion("tbt_adder not in", values, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderBetween(Long value1, Long value2) {
            addCriterion("tbt_adder between", value1, value2, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbt_adder not between", value1, value2, "tbtAdder");
            return (Criteria) this;
        }

        public Criteria andTbtEditerIsNull() {
            addCriterion("tbt_editer is null");
            return (Criteria) this;
        }

        public Criteria andTbtEditerIsNotNull() {
            addCriterion("tbt_editer is not null");
            return (Criteria) this;
        }

        public Criteria andTbtEditerEqualTo(Long value) {
            addCriterion("tbt_editer =", value, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerNotEqualTo(Long value) {
            addCriterion("tbt_editer <>", value, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerGreaterThan(Long value) {
            addCriterion("tbt_editer >", value, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_editer >=", value, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerLessThan(Long value) {
            addCriterion("tbt_editer <", value, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerLessThanOrEqualTo(Long value) {
            addCriterion("tbt_editer <=", value, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerIn(List<Long> values) {
            addCriterion("tbt_editer in", values, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerNotIn(List<Long> values) {
            addCriterion("tbt_editer not in", values, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerBetween(Long value1, Long value2) {
            addCriterion("tbt_editer between", value1, value2, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtEditerNotBetween(Long value1, Long value2) {
            addCriterion("tbt_editer not between", value1, value2, "tbtEditer");
            return (Criteria) this;
        }

        public Criteria andTbtCaserIsNull() {
            addCriterion("tbt_caser is null");
            return (Criteria) this;
        }

        public Criteria andTbtCaserIsNotNull() {
            addCriterion("tbt_caser is not null");
            return (Criteria) this;
        }

        public Criteria andTbtCaserEqualTo(Long value) {
            addCriterion("tbt_caser =", value, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserNotEqualTo(Long value) {
            addCriterion("tbt_caser <>", value, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserGreaterThan(Long value) {
            addCriterion("tbt_caser >", value, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_caser >=", value, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserLessThan(Long value) {
            addCriterion("tbt_caser <", value, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserLessThanOrEqualTo(Long value) {
            addCriterion("tbt_caser <=", value, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserIn(List<Long> values) {
            addCriterion("tbt_caser in", values, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserNotIn(List<Long> values) {
            addCriterion("tbt_caser not in", values, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserBetween(Long value1, Long value2) {
            addCriterion("tbt_caser between", value1, value2, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtCaserNotBetween(Long value1, Long value2) {
            addCriterion("tbt_caser not between", value1, value2, "tbtCaser");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeIsNull() {
            addCriterion("tbt_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeIsNotNull() {
            addCriterion("tbt_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeEqualTo(Date value) {
            addCriterion("tbt_finish_time =", value, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeNotEqualTo(Date value) {
            addCriterion("tbt_finish_time <>", value, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeGreaterThan(Date value) {
            addCriterion("tbt_finish_time >", value, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_finish_time >=", value, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeLessThan(Date value) {
            addCriterion("tbt_finish_time <", value, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_finish_time <=", value, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeIn(List<Date> values) {
            addCriterion("tbt_finish_time in", values, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeNotIn(List<Date> values) {
            addCriterion("tbt_finish_time not in", values, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_finish_time between", value1, value2, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_finish_time not between", value1, value2, "tbtFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeIsNull() {
            addCriterion("tbt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeIsNotNull() {
            addCriterion("tbt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeEqualTo(Date value) {
            addCriterion("tbt_update_time =", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbt_update_time <>", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeGreaterThan(Date value) {
            addCriterion("tbt_update_time >", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_update_time >=", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeLessThan(Date value) {
            addCriterion("tbt_update_time <", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_update_time <=", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeIn(List<Date> values) {
            addCriterion("tbt_update_time in", values, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbt_update_time not in", values, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_update_time between", value1, value2, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_update_time not between", value1, value2, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeIsNull() {
            addCriterion("tbt_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeIsNotNull() {
            addCriterion("tbt_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeEqualTo(Date value) {
            addCriterion("tbt_add_time =", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeNotEqualTo(Date value) {
            addCriterion("tbt_add_time <>", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeGreaterThan(Date value) {
            addCriterion("tbt_add_time >", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_add_time >=", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeLessThan(Date value) {
            addCriterion("tbt_add_time <", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_add_time <=", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeIn(List<Date> values) {
            addCriterion("tbt_add_time in", values, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeNotIn(List<Date> values) {
            addCriterion("tbt_add_time not in", values, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_add_time between", value1, value2, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_add_time not between", value1, value2, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtStatusIsNull() {
            addCriterion("tbt_status is null");
            return (Criteria) this;
        }

        public Criteria andTbtStatusIsNotNull() {
            addCriterion("tbt_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbtStatusEqualTo(Short value) {
            addCriterion("tbt_status =", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusNotEqualTo(Short value) {
            addCriterion("tbt_status <>", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusGreaterThan(Short value) {
            addCriterion("tbt_status >", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbt_status >=", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusLessThan(Short value) {
            addCriterion("tbt_status <", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbt_status <=", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusIn(List<Short> values) {
            addCriterion("tbt_status in", values, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusNotIn(List<Short> values) {
            addCriterion("tbt_status not in", values, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusBetween(Short value1, Short value2) {
            addCriterion("tbt_status between", value1, value2, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbt_status not between", value1, value2, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerIsNull() {
            addCriterion("tbt_trailer is null");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerIsNotNull() {
            addCriterion("tbt_trailer is not null");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerEqualTo(Byte value) {
            addCriterion("tbt_trailer =", value, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerNotEqualTo(Byte value) {
            addCriterion("tbt_trailer <>", value, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerGreaterThan(Byte value) {
            addCriterion("tbt_trailer >", value, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_trailer >=", value, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerLessThan(Byte value) {
            addCriterion("tbt_trailer <", value, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_trailer <=", value, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerIn(List<Byte> values) {
            addCriterion("tbt_trailer in", values, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerNotIn(List<Byte> values) {
            addCriterion("tbt_trailer not in", values, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerBetween(Byte value1, Byte value2) {
            addCriterion("tbt_trailer between", value1, value2, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_trailer not between", value1, value2, "tbtTrailer");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeIsNull() {
            addCriterion("tbt_trailer_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeIsNotNull() {
            addCriterion("tbt_trailer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeEqualTo(Double value) {
            addCriterion("tbt_trailer_fee =", value, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeNotEqualTo(Double value) {
            addCriterion("tbt_trailer_fee <>", value, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeGreaterThan(Double value) {
            addCriterion("tbt_trailer_fee >", value, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_trailer_fee >=", value, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeLessThan(Double value) {
            addCriterion("tbt_trailer_fee <", value, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_trailer_fee <=", value, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeIn(List<Double> values) {
            addCriterion("tbt_trailer_fee in", values, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeNotIn(List<Double> values) {
            addCriterion("tbt_trailer_fee not in", values, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_trailer_fee between", value1, value2, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtTrailerFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_trailer_fee not between", value1, value2, "tbtTrailerFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorIsNull() {
            addCriterion("tbt_auditor is null");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorIsNotNull() {
            addCriterion("tbt_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorEqualTo(String value) {
            addCriterion("tbt_auditor =", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorNotEqualTo(String value) {
            addCriterion("tbt_auditor <>", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorGreaterThan(String value) {
            addCriterion("tbt_auditor >", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_auditor >=", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorLessThan(String value) {
            addCriterion("tbt_auditor <", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorLessThanOrEqualTo(String value) {
            addCriterion("tbt_auditor <=", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorLike(String value) {
            addCriterion("tbt_auditor like", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorNotLike(String value) {
            addCriterion("tbt_auditor not like", value, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorIn(List<String> values) {
            addCriterion("tbt_auditor in", values, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorNotIn(List<String> values) {
            addCriterion("tbt_auditor not in", values, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorBetween(String value1, String value2) {
            addCriterion("tbt_auditor between", value1, value2, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorNotBetween(String value1, String value2) {
            addCriterion("tbt_auditor not between", value1, value2, "tbtAuditor");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeIsNull() {
            addCriterion("tbt_auditor_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeIsNotNull() {
            addCriterion("tbt_auditor_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeEqualTo(Double value) {
            addCriterion("tbt_auditor_fee =", value, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeNotEqualTo(Double value) {
            addCriterion("tbt_auditor_fee <>", value, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeGreaterThan(Double value) {
            addCriterion("tbt_auditor_fee >", value, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_auditor_fee >=", value, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeLessThan(Double value) {
            addCriterion("tbt_auditor_fee <", value, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_auditor_fee <=", value, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeIn(List<Double> values) {
            addCriterion("tbt_auditor_fee in", values, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeNotIn(List<Double> values) {
            addCriterion("tbt_auditor_fee not in", values, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_auditor_fee between", value1, value2, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_auditor_fee not between", value1, value2, "tbtAuditorFee");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherIsNull() {
            addCriterion("tbt_auditor_other is null");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherIsNotNull() {
            addCriterion("tbt_auditor_other is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherEqualTo(Double value) {
            addCriterion("tbt_auditor_other =", value, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherNotEqualTo(Double value) {
            addCriterion("tbt_auditor_other <>", value, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherGreaterThan(Double value) {
            addCriterion("tbt_auditor_other >", value, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_auditor_other >=", value, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherLessThan(Double value) {
            addCriterion("tbt_auditor_other <", value, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherLessThanOrEqualTo(Double value) {
            addCriterion("tbt_auditor_other <=", value, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherIn(List<Double> values) {
            addCriterion("tbt_auditor_other in", values, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherNotIn(List<Double> values) {
            addCriterion("tbt_auditor_other not in", values, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherBetween(Double value1, Double value2) {
            addCriterion("tbt_auditor_other between", value1, value2, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAuditorOtherNotBetween(Double value1, Double value2) {
            addCriterion("tbt_auditor_other not between", value1, value2, "tbtAuditorOther");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeIsNull() {
            addCriterion("tbt_advance_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeIsNotNull() {
            addCriterion("tbt_advance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeEqualTo(Double value) {
            addCriterion("tbt_advance_fee =", value, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeNotEqualTo(Double value) {
            addCriterion("tbt_advance_fee <>", value, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeGreaterThan(Double value) {
            addCriterion("tbt_advance_fee >", value, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_advance_fee >=", value, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeLessThan(Double value) {
            addCriterion("tbt_advance_fee <", value, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_advance_fee <=", value, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeIn(List<Double> values) {
            addCriterion("tbt_advance_fee in", values, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeNotIn(List<Double> values) {
            addCriterion("tbt_advance_fee not in", values, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_advance_fee between", value1, value2, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtAdvanceFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_advance_fee not between", value1, value2, "tbtAdvanceFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeIsNull() {
            addCriterion("tbt_damage_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeIsNotNull() {
            addCriterion("tbt_damage_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeEqualTo(Double value) {
            addCriterion("tbt_damage_fee =", value, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeNotEqualTo(Double value) {
            addCriterion("tbt_damage_fee <>", value, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeGreaterThan(Double value) {
            addCriterion("tbt_damage_fee >", value, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_damage_fee >=", value, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeLessThan(Double value) {
            addCriterion("tbt_damage_fee <", value, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_damage_fee <=", value, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeIn(List<Double> values) {
            addCriterion("tbt_damage_fee in", values, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeNotIn(List<Double> values) {
            addCriterion("tbt_damage_fee not in", values, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_damage_fee between", value1, value2, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtDamageFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_damage_fee not between", value1, value2, "tbtDamageFee");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpIsNull() {
            addCriterion("tbt_insure_up is null");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpIsNotNull() {
            addCriterion("tbt_insure_up is not null");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpEqualTo(Double value) {
            addCriterion("tbt_insure_up =", value, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpNotEqualTo(Double value) {
            addCriterion("tbt_insure_up <>", value, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpGreaterThan(Double value) {
            addCriterion("tbt_insure_up >", value, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_insure_up >=", value, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpLessThan(Double value) {
            addCriterion("tbt_insure_up <", value, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpLessThanOrEqualTo(Double value) {
            addCriterion("tbt_insure_up <=", value, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpIn(List<Double> values) {
            addCriterion("tbt_insure_up in", values, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpNotIn(List<Double> values) {
            addCriterion("tbt_insure_up not in", values, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpBetween(Double value1, Double value2) {
            addCriterion("tbt_insure_up between", value1, value2, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtInsureUpNotBetween(Double value1, Double value2) {
            addCriterion("tbt_insure_up not between", value1, value2, "tbtInsureUp");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherIsNull() {
            addCriterion("tbt_fee_other is null");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherIsNotNull() {
            addCriterion("tbt_fee_other is not null");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherEqualTo(Double value) {
            addCriterion("tbt_fee_other =", value, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherNotEqualTo(Double value) {
            addCriterion("tbt_fee_other <>", value, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherGreaterThan(Double value) {
            addCriterion("tbt_fee_other >", value, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_fee_other >=", value, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherLessThan(Double value) {
            addCriterion("tbt_fee_other <", value, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherLessThanOrEqualTo(Double value) {
            addCriterion("tbt_fee_other <=", value, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherIn(List<Double> values) {
            addCriterion("tbt_fee_other in", values, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherNotIn(List<Double> values) {
            addCriterion("tbt_fee_other not in", values, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherBetween(Double value1, Double value2) {
            addCriterion("tbt_fee_other between", value1, value2, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtFeeOtherNotBetween(Double value1, Double value2) {
            addCriterion("tbt_fee_other not between", value1, value2, "tbtFeeOther");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeIsNull() {
            addCriterion("tbt_charge_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeIsNotNull() {
            addCriterion("tbt_charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeEqualTo(Date value) {
            addCriterion("tbt_charge_time =", value, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeNotEqualTo(Date value) {
            addCriterion("tbt_charge_time <>", value, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeGreaterThan(Date value) {
            addCriterion("tbt_charge_time >", value, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_charge_time >=", value, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeLessThan(Date value) {
            addCriterion("tbt_charge_time <", value, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_charge_time <=", value, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeIn(List<Date> values) {
            addCriterion("tbt_charge_time in", values, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeNotIn(List<Date> values) {
            addCriterion("tbt_charge_time not in", values, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_charge_time between", value1, value2, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_charge_time not between", value1, value2, "tbtChargeTime");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeIsNull() {
            addCriterion("tbt_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeIsNotNull() {
            addCriterion("tbt_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeEqualTo(Byte value) {
            addCriterion("tbt_pay_type =", value, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeNotEqualTo(Byte value) {
            addCriterion("tbt_pay_type <>", value, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeGreaterThan(Byte value) {
            addCriterion("tbt_pay_type >", value, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_pay_type >=", value, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeLessThan(Byte value) {
            addCriterion("tbt_pay_type <", value, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_pay_type <=", value, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeIn(List<Byte> values) {
            addCriterion("tbt_pay_type in", values, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeNotIn(List<Byte> values) {
            addCriterion("tbt_pay_type not in", values, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbt_pay_type between", value1, value2, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_pay_type not between", value1, value2, "tbtPayType");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleIsNull() {
            addCriterion("tbt_track_people is null");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleIsNotNull() {
            addCriterion("tbt_track_people is not null");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleEqualTo(String value) {
            addCriterion("tbt_track_people =", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleNotEqualTo(String value) {
            addCriterion("tbt_track_people <>", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleGreaterThan(String value) {
            addCriterion("tbt_track_people >", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_track_people >=", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleLessThan(String value) {
            addCriterion("tbt_track_people <", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleLessThanOrEqualTo(String value) {
            addCriterion("tbt_track_people <=", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleLike(String value) {
            addCriterion("tbt_track_people like", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleNotLike(String value) {
            addCriterion("tbt_track_people not like", value, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleIn(List<String> values) {
            addCriterion("tbt_track_people in", values, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleNotIn(List<String> values) {
            addCriterion("tbt_track_people not in", values, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleBetween(String value1, String value2) {
            addCriterion("tbt_track_people between", value1, value2, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtTrackPeopleNotBetween(String value1, String value2) {
            addCriterion("tbt_track_people not between", value1, value2, "tbtTrackPeople");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoIsNull() {
            addCriterion("tbt_third_carno is null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoIsNotNull() {
            addCriterion("tbt_third_carno is not null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoEqualTo(String value) {
            addCriterion("tbt_third_carno =", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoNotEqualTo(String value) {
            addCriterion("tbt_third_carno <>", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoGreaterThan(String value) {
            addCriterion("tbt_third_carno >", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_third_carno >=", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoLessThan(String value) {
            addCriterion("tbt_third_carno <", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoLessThanOrEqualTo(String value) {
            addCriterion("tbt_third_carno <=", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoLike(String value) {
            addCriterion("tbt_third_carno like", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoNotLike(String value) {
            addCriterion("tbt_third_carno not like", value, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoIn(List<String> values) {
            addCriterion("tbt_third_carno in", values, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoNotIn(List<String> values) {
            addCriterion("tbt_third_carno not in", values, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoBetween(String value1, String value2) {
            addCriterion("tbt_third_carno between", value1, value2, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdCarnoNotBetween(String value1, String value2) {
            addCriterion("tbt_third_carno not between", value1, value2, "tbtThirdCarno");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossIsNull() {
            addCriterion("tbt_third_loss is null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossIsNotNull() {
            addCriterion("tbt_third_loss is not null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossEqualTo(Double value) {
            addCriterion("tbt_third_loss =", value, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossNotEqualTo(Double value) {
            addCriterion("tbt_third_loss <>", value, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossGreaterThan(Double value) {
            addCriterion("tbt_third_loss >", value, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_third_loss >=", value, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossLessThan(Double value) {
            addCriterion("tbt_third_loss <", value, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossLessThanOrEqualTo(Double value) {
            addCriterion("tbt_third_loss <=", value, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossIn(List<Double> values) {
            addCriterion("tbt_third_loss in", values, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossNotIn(List<Double> values) {
            addCriterion("tbt_third_loss not in", values, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossBetween(Double value1, Double value2) {
            addCriterion("tbt_third_loss between", value1, value2, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdLossNotBetween(Double value1, Double value2) {
            addCriterion("tbt_third_loss not between", value1, value2, "tbtThirdLoss");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoIsNull() {
            addCriterion("tbt_third_info is null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoIsNotNull() {
            addCriterion("tbt_third_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoEqualTo(String value) {
            addCriterion("tbt_third_info =", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoNotEqualTo(String value) {
            addCriterion("tbt_third_info <>", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoGreaterThan(String value) {
            addCriterion("tbt_third_info >", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_third_info >=", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoLessThan(String value) {
            addCriterion("tbt_third_info <", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoLessThanOrEqualTo(String value) {
            addCriterion("tbt_third_info <=", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoLike(String value) {
            addCriterion("tbt_third_info like", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoNotLike(String value) {
            addCriterion("tbt_third_info not like", value, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoIn(List<String> values) {
            addCriterion("tbt_third_info in", values, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoNotIn(List<String> values) {
            addCriterion("tbt_third_info not in", values, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoBetween(String value1, String value2) {
            addCriterion("tbt_third_info between", value1, value2, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInfoNotBetween(String value1, String value2) {
            addCriterion("tbt_third_info not between", value1, value2, "tbtThirdInfo");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureIsNull() {
            addCriterion("tbt_third_insure is null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureIsNotNull() {
            addCriterion("tbt_third_insure is not null");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureEqualTo(String value) {
            addCriterion("tbt_third_insure =", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureNotEqualTo(String value) {
            addCriterion("tbt_third_insure <>", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureGreaterThan(String value) {
            addCriterion("tbt_third_insure >", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_third_insure >=", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureLessThan(String value) {
            addCriterion("tbt_third_insure <", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureLessThanOrEqualTo(String value) {
            addCriterion("tbt_third_insure <=", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureLike(String value) {
            addCriterion("tbt_third_insure like", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureNotLike(String value) {
            addCriterion("tbt_third_insure not like", value, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureIn(List<String> values) {
            addCriterion("tbt_third_insure in", values, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureNotIn(List<String> values) {
            addCriterion("tbt_third_insure not in", values, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureBetween(String value1, String value2) {
            addCriterion("tbt_third_insure between", value1, value2, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtThirdInsureNotBetween(String value1, String value2) {
            addCriterion("tbt_third_insure not between", value1, value2, "tbtThirdInsure");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkIsNull() {
            addCriterion("tbt_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkIsNotNull() {
            addCriterion("tbt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkEqualTo(String value) {
            addCriterion("tbt_remark =", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotEqualTo(String value) {
            addCriterion("tbt_remark <>", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkGreaterThan(String value) {
            addCriterion("tbt_remark >", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_remark >=", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkLessThan(String value) {
            addCriterion("tbt_remark <", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbt_remark <=", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkLike(String value) {
            addCriterion("tbt_remark like", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotLike(String value) {
            addCriterion("tbt_remark not like", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkIn(List<String> values) {
            addCriterion("tbt_remark in", values, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotIn(List<String> values) {
            addCriterion("tbt_remark not in", values, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkBetween(String value1, String value2) {
            addCriterion("tbt_remark between", value1, value2, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotBetween(String value1, String value2) {
            addCriterion("tbt_remark not between", value1, value2, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillIsNull() {
            addCriterion("tbt_repair_bill is null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillIsNotNull() {
            addCriterion("tbt_repair_bill is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillEqualTo(String value) {
            addCriterion("tbt_repair_bill =", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillNotEqualTo(String value) {
            addCriterion("tbt_repair_bill <>", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillGreaterThan(String value) {
            addCriterion("tbt_repair_bill >", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_repair_bill >=", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillLessThan(String value) {
            addCriterion("tbt_repair_bill <", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillLessThanOrEqualTo(String value) {
            addCriterion("tbt_repair_bill <=", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillLike(String value) {
            addCriterion("tbt_repair_bill like", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillNotLike(String value) {
            addCriterion("tbt_repair_bill not like", value, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillIn(List<String> values) {
            addCriterion("tbt_repair_bill in", values, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillNotIn(List<String> values) {
            addCriterion("tbt_repair_bill not in", values, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillBetween(String value1, String value2) {
            addCriterion("tbt_repair_bill between", value1, value2, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtRepairBillNotBetween(String value1, String value2) {
            addCriterion("tbt_repair_bill not between", value1, value2, "tbtRepairBill");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeIsNull() {
            addCriterion("tbt_settle_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeIsNotNull() {
            addCriterion("tbt_settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeEqualTo(Date value) {
            addCriterion("tbt_settle_time =", value, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeNotEqualTo(Date value) {
            addCriterion("tbt_settle_time <>", value, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeGreaterThan(Date value) {
            addCriterion("tbt_settle_time >", value, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_settle_time >=", value, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeLessThan(Date value) {
            addCriterion("tbt_settle_time <", value, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_settle_time <=", value, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeIn(List<Date> values) {
            addCriterion("tbt_settle_time in", values, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeNotIn(List<Date> values) {
            addCriterion("tbt_settle_time not in", values, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_settle_time between", value1, value2, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtSettleTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_settle_time not between", value1, value2, "tbtSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeIsNull() {
            addCriterion("tbt_claim_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeIsNotNull() {
            addCriterion("tbt_claim_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeEqualTo(Double value) {
            addCriterion("tbt_claim_fee =", value, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeNotEqualTo(Double value) {
            addCriterion("tbt_claim_fee <>", value, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeGreaterThan(Double value) {
            addCriterion("tbt_claim_fee >", value, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_claim_fee >=", value, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeLessThan(Double value) {
            addCriterion("tbt_claim_fee <", value, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_claim_fee <=", value, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeIn(List<Double> values) {
            addCriterion("tbt_claim_fee in", values, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeNotIn(List<Double> values) {
            addCriterion("tbt_claim_fee not in", values, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_claim_fee between", value1, value2, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtClaimFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_claim_fee not between", value1, value2, "tbtClaimFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeIsNull() {
            addCriterion("tbt_repair_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeIsNotNull() {
            addCriterion("tbt_repair_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeEqualTo(Double value) {
            addCriterion("tbt_repair_fee =", value, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeNotEqualTo(Double value) {
            addCriterion("tbt_repair_fee <>", value, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeGreaterThan(Double value) {
            addCriterion("tbt_repair_fee >", value, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_repair_fee >=", value, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeLessThan(Double value) {
            addCriterion("tbt_repair_fee <", value, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_repair_fee <=", value, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeIn(List<Double> values) {
            addCriterion("tbt_repair_fee in", values, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeNotIn(List<Double> values) {
            addCriterion("tbt_repair_fee not in", values, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_repair_fee between", value1, value2, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtRepairFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_repair_fee not between", value1, value2, "tbtRepairFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeIsNull() {
            addCriterion("tbt_need_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeIsNotNull() {
            addCriterion("tbt_need_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeEqualTo(Double value) {
            addCriterion("tbt_need_fee =", value, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeNotEqualTo(Double value) {
            addCriterion("tbt_need_fee <>", value, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeGreaterThan(Double value) {
            addCriterion("tbt_need_fee >", value, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_need_fee >=", value, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeLessThan(Double value) {
            addCriterion("tbt_need_fee <", value, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_need_fee <=", value, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeIn(List<Double> values) {
            addCriterion("tbt_need_fee in", values, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeNotIn(List<Double> values) {
            addCriterion("tbt_need_fee not in", values, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_need_fee between", value1, value2, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtNeedFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_need_fee not between", value1, value2, "tbtNeedFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeIsNull() {
            addCriterion("tbt_real_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeIsNotNull() {
            addCriterion("tbt_real_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeEqualTo(Double value) {
            addCriterion("tbt_real_fee =", value, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeNotEqualTo(Double value) {
            addCriterion("tbt_real_fee <>", value, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeGreaterThan(Double value) {
            addCriterion("tbt_real_fee >", value, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbt_real_fee >=", value, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeLessThan(Double value) {
            addCriterion("tbt_real_fee <", value, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbt_real_fee <=", value, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeIn(List<Double> values) {
            addCriterion("tbt_real_fee in", values, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeNotIn(List<Double> values) {
            addCriterion("tbt_real_fee not in", values, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeBetween(Double value1, Double value2) {
            addCriterion("tbt_real_fee between", value1, value2, "tbtRealFee");
            return (Criteria) this;
        }

        public Criteria andTbtRealFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbt_real_fee not between", value1, value2, "tbtRealFee");
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