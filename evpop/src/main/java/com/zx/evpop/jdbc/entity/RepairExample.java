package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andTbrIdIsNull() {
            addCriterion("tbr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbrIdIsNotNull() {
            addCriterion("tbr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbrIdEqualTo(Long value) {
            addCriterion("tbr_id =", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotEqualTo(Long value) {
            addCriterion("tbr_id <>", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThan(Long value) {
            addCriterion("tbr_id >", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_id >=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThan(Long value) {
            addCriterion("tbr_id <", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThanOrEqualTo(Long value) {
            addCriterion("tbr_id <=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdIn(List<Long> values) {
            addCriterion("tbr_id in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotIn(List<Long> values) {
            addCriterion("tbr_id not in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdBetween(Long value1, Long value2) {
            addCriterion("tbr_id between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotBetween(Long value1, Long value2) {
            addCriterion("tbr_id not between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrHostIsNull() {
            addCriterion("tbr_host is null");
            return (Criteria) this;
        }

        public Criteria andTbrHostIsNotNull() {
            addCriterion("tbr_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbrHostEqualTo(Long value) {
            addCriterion("tbr_host =", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotEqualTo(Long value) {
            addCriterion("tbr_host <>", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThan(Long value) {
            addCriterion("tbr_host >", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_host >=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThan(Long value) {
            addCriterion("tbr_host <", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThanOrEqualTo(Long value) {
            addCriterion("tbr_host <=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostIn(List<Long> values) {
            addCriterion("tbr_host in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotIn(List<Long> values) {
            addCriterion("tbr_host not in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostBetween(Long value1, Long value2) {
            addCriterion("tbr_host between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotBetween(Long value1, Long value2) {
            addCriterion("tbr_host not between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrCarIsNull() {
            addCriterion("tbr_car is null");
            return (Criteria) this;
        }

        public Criteria andTbrCarIsNotNull() {
            addCriterion("tbr_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCarEqualTo(Long value) {
            addCriterion("tbr_car =", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarNotEqualTo(Long value) {
            addCriterion("tbr_car <>", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarGreaterThan(Long value) {
            addCriterion("tbr_car >", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_car >=", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarLessThan(Long value) {
            addCriterion("tbr_car <", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarLessThanOrEqualTo(Long value) {
            addCriterion("tbr_car <=", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarIn(List<Long> values) {
            addCriterion("tbr_car in", values, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarNotIn(List<Long> values) {
            addCriterion("tbr_car not in", values, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarBetween(Long value1, Long value2) {
            addCriterion("tbr_car between", value1, value2, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarNotBetween(Long value1, Long value2) {
            addCriterion("tbr_car not between", value1, value2, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeIsNull() {
            addCriterion("tbr_insure_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeIsNotNull() {
            addCriterion("tbr_insure_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeEqualTo(Byte value) {
            addCriterion("tbr_insure_type =", value, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeNotEqualTo(Byte value) {
            addCriterion("tbr_insure_type <>", value, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeGreaterThan(Byte value) {
            addCriterion("tbr_insure_type >", value, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_insure_type >=", value, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeLessThan(Byte value) {
            addCriterion("tbr_insure_type <", value, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_insure_type <=", value, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeIn(List<Byte> values) {
            addCriterion("tbr_insure_type in", values, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeNotIn(List<Byte> values) {
            addCriterion("tbr_insure_type not in", values, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbr_insure_type between", value1, value2, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrInsureTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_insure_type not between", value1, value2, "tbrInsureType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeIsNull() {
            addCriterion("tbr_repair_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeIsNotNull() {
            addCriterion("tbr_repair_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeEqualTo(Byte value) {
            addCriterion("tbr_repair_type =", value, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeNotEqualTo(Byte value) {
            addCriterion("tbr_repair_type <>", value, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeGreaterThan(Byte value) {
            addCriterion("tbr_repair_type >", value, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_repair_type >=", value, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeLessThan(Byte value) {
            addCriterion("tbr_repair_type <", value, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_repair_type <=", value, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeIn(List<Byte> values) {
            addCriterion("tbr_repair_type in", values, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeNotIn(List<Byte> values) {
            addCriterion("tbr_repair_type not in", values, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbr_repair_type between", value1, value2, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrRepairTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_repair_type not between", value1, value2, "tbrRepairType");
            return (Criteria) this;
        }

        public Criteria andTbrAdrIsNull() {
            addCriterion("tbr_adr is null");
            return (Criteria) this;
        }

        public Criteria andTbrAdrIsNotNull() {
            addCriterion("tbr_adr is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAdrEqualTo(Long value) {
            addCriterion("tbr_adr =", value, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrNotEqualTo(Long value) {
            addCriterion("tbr_adr <>", value, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrGreaterThan(Long value) {
            addCriterion("tbr_adr >", value, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_adr >=", value, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrLessThan(Long value) {
            addCriterion("tbr_adr <", value, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrLessThanOrEqualTo(Long value) {
            addCriterion("tbr_adr <=", value, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrIn(List<Long> values) {
            addCriterion("tbr_adr in", values, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrNotIn(List<Long> values) {
            addCriterion("tbr_adr not in", values, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrBetween(Long value1, Long value2) {
            addCriterion("tbr_adr between", value1, value2, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrAdrNotBetween(Long value1, Long value2) {
            addCriterion("tbr_adr not between", value1, value2, "tbrAdr");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIsNull() {
            addCriterion("tbr_order is null");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIsNotNull() {
            addCriterion("tbr_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbrOrderEqualTo(Long value) {
            addCriterion("tbr_order =", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotEqualTo(Long value) {
            addCriterion("tbr_order <>", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderGreaterThan(Long value) {
            addCriterion("tbr_order >", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_order >=", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderLessThan(Long value) {
            addCriterion("tbr_order <", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbr_order <=", value, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderIn(List<Long> values) {
            addCriterion("tbr_order in", values, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotIn(List<Long> values) {
            addCriterion("tbr_order not in", values, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderBetween(Long value1, Long value2) {
            addCriterion("tbr_order between", value1, value2, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbr_order not between", value1, value2, "tbrOrder");
            return (Criteria) this;
        }

        public Criteria andTbrInDateIsNull() {
            addCriterion("tbr_in_date is null");
            return (Criteria) this;
        }

        public Criteria andTbrInDateIsNotNull() {
            addCriterion("tbr_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbrInDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_in_date =", value, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_in_date <>", value, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbr_in_date >", value, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_in_date >=", value, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateLessThan(Date value) {
            addCriterionForJDBCDate("tbr_in_date <", value, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_in_date <=", value, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_in_date in", values, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_in_date not in", values, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_in_date between", value1, value2, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_in_date not between", value1, value2, "tbrInDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateIsNull() {
            addCriterion("tbr_out_date is null");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateIsNotNull() {
            addCriterion("tbr_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_out_date =", value, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_out_date <>", value, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbr_out_date >", value, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_out_date >=", value, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateLessThan(Date value) {
            addCriterionForJDBCDate("tbr_out_date <", value, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_out_date <=", value, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_out_date in", values, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_out_date not in", values, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_out_date between", value1, value2, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_out_date not between", value1, value2, "tbrOutDate");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptIsNull() {
            addCriterion("tbr_descript is null");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptIsNotNull() {
            addCriterion("tbr_descript is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptEqualTo(String value) {
            addCriterion("tbr_descript =", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptNotEqualTo(String value) {
            addCriterion("tbr_descript <>", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptGreaterThan(String value) {
            addCriterion("tbr_descript >", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_descript >=", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptLessThan(String value) {
            addCriterion("tbr_descript <", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptLessThanOrEqualTo(String value) {
            addCriterion("tbr_descript <=", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptLike(String value) {
            addCriterion("tbr_descript like", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptNotLike(String value) {
            addCriterion("tbr_descript not like", value, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptIn(List<String> values) {
            addCriterion("tbr_descript in", values, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptNotIn(List<String> values) {
            addCriterion("tbr_descript not in", values, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptBetween(String value1, String value2) {
            addCriterion("tbr_descript between", value1, value2, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrDescriptNotBetween(String value1, String value2) {
            addCriterion("tbr_descript not between", value1, value2, "tbrDescript");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoIsNull() {
            addCriterion("tbr_repair_no is null");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoIsNotNull() {
            addCriterion("tbr_repair_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoEqualTo(String value) {
            addCriterion("tbr_repair_no =", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoNotEqualTo(String value) {
            addCriterion("tbr_repair_no <>", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoGreaterThan(String value) {
            addCriterion("tbr_repair_no >", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_repair_no >=", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoLessThan(String value) {
            addCriterion("tbr_repair_no <", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoLessThanOrEqualTo(String value) {
            addCriterion("tbr_repair_no <=", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoLike(String value) {
            addCriterion("tbr_repair_no like", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoNotLike(String value) {
            addCriterion("tbr_repair_no not like", value, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoIn(List<String> values) {
            addCriterion("tbr_repair_no in", values, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoNotIn(List<String> values) {
            addCriterion("tbr_repair_no not in", values, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoBetween(String value1, String value2) {
            addCriterion("tbr_repair_no between", value1, value2, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrRepairNoNotBetween(String value1, String value2) {
            addCriterion("tbr_repair_no not between", value1, value2, "tbrRepairNo");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyIsNull() {
            addCriterion("tbr_money is null");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyIsNotNull() {
            addCriterion("tbr_money is not null");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyEqualTo(Double value) {
            addCriterion("tbr_money =", value, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyNotEqualTo(Double value) {
            addCriterion("tbr_money <>", value, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyGreaterThan(Double value) {
            addCriterion("tbr_money >", value, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tbr_money >=", value, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyLessThan(Double value) {
            addCriterion("tbr_money <", value, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tbr_money <=", value, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyIn(List<Double> values) {
            addCriterion("tbr_money in", values, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyNotIn(List<Double> values) {
            addCriterion("tbr_money not in", values, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyBetween(Double value1, Double value2) {
            addCriterion("tbr_money between", value1, value2, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tbr_money not between", value1, value2, "tbrMoney");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleIsNull() {
            addCriterion("tbr_is_settle is null");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleIsNotNull() {
            addCriterion("tbr_is_settle is not null");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleEqualTo(Byte value) {
            addCriterion("tbr_is_settle =", value, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleNotEqualTo(Byte value) {
            addCriterion("tbr_is_settle <>", value, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleGreaterThan(Byte value) {
            addCriterion("tbr_is_settle >", value, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_is_settle >=", value, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleLessThan(Byte value) {
            addCriterion("tbr_is_settle <", value, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_is_settle <=", value, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleIn(List<Byte> values) {
            addCriterion("tbr_is_settle in", values, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleNotIn(List<Byte> values) {
            addCriterion("tbr_is_settle not in", values, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleBetween(Byte value1, Byte value2) {
            addCriterion("tbr_is_settle between", value1, value2, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrIsSettleNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_is_settle not between", value1, value2, "tbrIsSettle");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeIsNull() {
            addCriterion("tbr_settle_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeIsNotNull() {
            addCriterion("tbr_settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_settle_time =", value, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_settle_time <>", value, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tbr_settle_time >", value, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_settle_time >=", value, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeLessThan(Date value) {
            addCriterionForJDBCDate("tbr_settle_time <", value, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_settle_time <=", value, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_settle_time in", values, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_settle_time not in", values, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_settle_time between", value1, value2, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrSettleTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_settle_time not between", value1, value2, "tbrSettleTime");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNull() {
            addCriterion("tbr_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNotNull() {
            addCriterion("tbr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkEqualTo(String value) {
            addCriterion("tbr_remark =", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotEqualTo(String value) {
            addCriterion("tbr_remark <>", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThan(String value) {
            addCriterion("tbr_remark >", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_remark >=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThan(String value) {
            addCriterion("tbr_remark <", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbr_remark <=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLike(String value) {
            addCriterion("tbr_remark like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotLike(String value) {
            addCriterion("tbr_remark not like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIn(List<String> values) {
            addCriterion("tbr_remark in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotIn(List<String> values) {
            addCriterion("tbr_remark not in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkBetween(String value1, String value2) {
            addCriterion("tbr_remark between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotBetween(String value1, String value2) {
            addCriterion("tbr_remark not between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrAdderIsNull() {
            addCriterion("tbr_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbrAdderIsNotNull() {
            addCriterion("tbr_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAdderEqualTo(Long value) {
            addCriterion("tbr_adder =", value, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderNotEqualTo(Long value) {
            addCriterion("tbr_adder <>", value, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderGreaterThan(Long value) {
            addCriterion("tbr_adder >", value, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_adder >=", value, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderLessThan(Long value) {
            addCriterion("tbr_adder <", value, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbr_adder <=", value, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderIn(List<Long> values) {
            addCriterion("tbr_adder in", values, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderNotIn(List<Long> values) {
            addCriterion("tbr_adder not in", values, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderBetween(Long value1, Long value2) {
            addCriterion("tbr_adder between", value1, value2, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbr_adder not between", value1, value2, "tbrAdder");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIsNull() {
            addCriterion("tbr_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIsNotNull() {
            addCriterion("tbr_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEditorEqualTo(Long value) {
            addCriterion("tbr_editor =", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotEqualTo(Long value) {
            addCriterion("tbr_editor <>", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorGreaterThan(Long value) {
            addCriterion("tbr_editor >", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_editor >=", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLessThan(Long value) {
            addCriterion("tbr_editor <", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLessThanOrEqualTo(Long value) {
            addCriterion("tbr_editor <=", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIn(List<Long> values) {
            addCriterion("tbr_editor in", values, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotIn(List<Long> values) {
            addCriterion("tbr_editor not in", values, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorBetween(Long value1, Long value2) {
            addCriterion("tbr_editor between", value1, value2, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotBetween(Long value1, Long value2) {
            addCriterion("tbr_editor not between", value1, value2, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNull() {
            addCriterion("tbr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNotNull() {
            addCriterion("tbr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeEqualTo(Date value) {
            addCriterion("tbr_add_time =", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotEqualTo(Date value) {
            addCriterion("tbr_add_time <>", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThan(Date value) {
            addCriterion("tbr_add_time >", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time >=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThan(Date value) {
            addCriterion("tbr_add_time <", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time <=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIn(List<Date> values) {
            addCriterion("tbr_add_time in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotIn(List<Date> values) {
            addCriterion("tbr_add_time not in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time not between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNull() {
            addCriterion("tbr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNotNull() {
            addCriterion("tbr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeEqualTo(Date value) {
            addCriterion("tbr_update_time =", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbr_update_time <>", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThan(Date value) {
            addCriterion("tbr_update_time >", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time >=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThan(Date value) {
            addCriterion("tbr_update_time <", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time <=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIn(List<Date> values) {
            addCriterion("tbr_update_time in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbr_update_time not in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time not between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNull() {
            addCriterion("tbr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNotNull() {
            addCriterion("tbr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusEqualTo(Short value) {
            addCriterion("tbr_status =", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotEqualTo(Short value) {
            addCriterion("tbr_status <>", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThan(Short value) {
            addCriterion("tbr_status >", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbr_status >=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThan(Short value) {
            addCriterion("tbr_status <", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbr_status <=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIn(List<Short> values) {
            addCriterion("tbr_status in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotIn(List<Short> values) {
            addCriterion("tbr_status not in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusBetween(Short value1, Short value2) {
            addCriterion("tbr_status between", value1, value2, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbr_status not between", value1, value2, "tbrStatus");
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