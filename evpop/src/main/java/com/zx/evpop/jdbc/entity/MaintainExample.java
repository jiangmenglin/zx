package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainExample() {
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

        public Criteria andTbmIdIsNull() {
            addCriterion("tbm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdIsNotNull() {
            addCriterion("tbm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdEqualTo(Long value) {
            addCriterion("tbm_id =", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotEqualTo(Long value) {
            addCriterion("tbm_id <>", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThan(Long value) {
            addCriterion("tbm_id >", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_id >=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThan(Long value) {
            addCriterion("tbm_id <", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThanOrEqualTo(Long value) {
            addCriterion("tbm_id <=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdIn(List<Long> values) {
            addCriterion("tbm_id in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotIn(List<Long> values) {
            addCriterion("tbm_id not in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdBetween(Long value1, Long value2) {
            addCriterion("tbm_id between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotBetween(Long value1, Long value2) {
            addCriterion("tbm_id not between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmHostIsNull() {
            addCriterion("tbm_host is null");
            return (Criteria) this;
        }

        public Criteria andTbmHostIsNotNull() {
            addCriterion("tbm_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbmHostEqualTo(Long value) {
            addCriterion("tbm_host =", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotEqualTo(Long value) {
            addCriterion("tbm_host <>", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThan(Long value) {
            addCriterion("tbm_host >", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_host >=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThan(Long value) {
            addCriterion("tbm_host <", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThanOrEqualTo(Long value) {
            addCriterion("tbm_host <=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostIn(List<Long> values) {
            addCriterion("tbm_host in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotIn(List<Long> values) {
            addCriterion("tbm_host not in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostBetween(Long value1, Long value2) {
            addCriterion("tbm_host between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotBetween(Long value1, Long value2) {
            addCriterion("tbm_host not between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmCarIsNull() {
            addCriterion("tbm_car is null");
            return (Criteria) this;
        }

        public Criteria andTbmCarIsNotNull() {
            addCriterion("tbm_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCarEqualTo(Long value) {
            addCriterion("tbm_car =", value, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarNotEqualTo(Long value) {
            addCriterion("tbm_car <>", value, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarGreaterThan(Long value) {
            addCriterion("tbm_car >", value, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_car >=", value, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarLessThan(Long value) {
            addCriterion("tbm_car <", value, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarLessThanOrEqualTo(Long value) {
            addCriterion("tbm_car <=", value, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarIn(List<Long> values) {
            addCriterion("tbm_car in", values, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarNotIn(List<Long> values) {
            addCriterion("tbm_car not in", values, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarBetween(Long value1, Long value2) {
            addCriterion("tbm_car between", value1, value2, "tbmCar");
            return (Criteria) this;
        }

        public Criteria andTbmCarNotBetween(Long value1, Long value2) {
            addCriterion("tbm_car not between", value1, value2, "tbmCar");
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

        public Criteria andTbcModelEqualTo(Long value) {
            addCriterion("tbc_model =", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotEqualTo(Long value) {
            addCriterion("tbc_model <>", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelGreaterThan(Long value) {
            addCriterion("tbc_model >", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelGreaterThanOrEqualTo(Long value) {
            addCriterion("tbc_model >=", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelLessThan(Long value) {
            addCriterion("tbc_model <", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelLessThanOrEqualTo(Long value) {
            addCriterion("tbc_model <=", value, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelIn(List<Long> values) {
            addCriterion("tbc_model in", values, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotIn(List<Long> values) {
            addCriterion("tbc_model not in", values, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelBetween(Long value1, Long value2) {
            addCriterion("tbc_model between", value1, value2, "tbcModel");
            return (Criteria) this;
        }

        public Criteria andTbcModelNotBetween(Long value1, Long value2) {
            addCriterion("tbc_model not between", value1, value2, "tbcModel");
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

        public Criteria andTbmRepairStaIsNull() {
            addCriterion("tbm_repair_sta is null");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaIsNotNull() {
            addCriterion("tbm_repair_sta is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaEqualTo(Long value) {
            addCriterion("tbm_repair_sta =", value, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaNotEqualTo(Long value) {
            addCriterion("tbm_repair_sta <>", value, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaGreaterThan(Long value) {
            addCriterion("tbm_repair_sta >", value, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_repair_sta >=", value, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaLessThan(Long value) {
            addCriterion("tbm_repair_sta <", value, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaLessThanOrEqualTo(Long value) {
            addCriterion("tbm_repair_sta <=", value, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaIn(List<Long> values) {
            addCriterion("tbm_repair_sta in", values, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaNotIn(List<Long> values) {
            addCriterion("tbm_repair_sta not in", values, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaBetween(Long value1, Long value2) {
            addCriterion("tbm_repair_sta between", value1, value2, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmRepairStaNotBetween(Long value1, Long value2) {
            addCriterion("tbm_repair_sta not between", value1, value2, "tbmRepairSta");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeIsNull() {
            addCriterion("tbm_curr_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeIsNotNull() {
            addCriterion("tbm_curr_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeEqualTo(Short value) {
            addCriterion("tbm_curr_type =", value, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeNotEqualTo(Short value) {
            addCriterion("tbm_curr_type <>", value, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeGreaterThan(Short value) {
            addCriterion("tbm_curr_type >", value, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_curr_type >=", value, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeLessThan(Short value) {
            addCriterion("tbm_curr_type <", value, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbm_curr_type <=", value, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeIn(List<Short> values) {
            addCriterion("tbm_curr_type in", values, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeNotIn(List<Short> values) {
            addCriterion("tbm_curr_type not in", values, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeBetween(Short value1, Short value2) {
            addCriterion("tbm_curr_type between", value1, value2, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmCurrTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbm_curr_type not between", value1, value2, "tbmCurrType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNull() {
            addCriterion("tbm_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNotNull() {
            addCriterion("tbm_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeEqualTo(Short value) {
            addCriterion("tbm_type =", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotEqualTo(Short value) {
            addCriterion("tbm_type <>", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThan(Short value) {
            addCriterion("tbm_type >", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_type >=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThan(Short value) {
            addCriterion("tbm_type <", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbm_type <=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIn(List<Short> values) {
            addCriterion("tbm_type in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotIn(List<Short> values) {
            addCriterion("tbm_type not in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeBetween(Short value1, Short value2) {
            addCriterion("tbm_type between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbm_type not between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByIsNull() {
            addCriterion("tbm_expect_by is null");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByIsNotNull() {
            addCriterion("tbm_expect_by is not null");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByEqualTo(Short value) {
            addCriterion("tbm_expect_by =", value, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByNotEqualTo(Short value) {
            addCriterion("tbm_expect_by <>", value, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByGreaterThan(Short value) {
            addCriterion("tbm_expect_by >", value, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_expect_by >=", value, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByLessThan(Short value) {
            addCriterion("tbm_expect_by <", value, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByLessThanOrEqualTo(Short value) {
            addCriterion("tbm_expect_by <=", value, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByIn(List<Short> values) {
            addCriterion("tbm_expect_by in", values, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByNotIn(List<Short> values) {
            addCriterion("tbm_expect_by not in", values, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByBetween(Short value1, Short value2) {
            addCriterion("tbm_expect_by between", value1, value2, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectByNotBetween(Short value1, Short value2) {
            addCriterion("tbm_expect_by not between", value1, value2, "tbmExpectBy");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateIsNull() {
            addCriterion("tbm_expect_date is null");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateIsNotNull() {
            addCriterion("tbm_expect_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_expect_date =", value, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_expect_date <>", value, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbm_expect_date >", value, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_expect_date >=", value, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateLessThan(Date value) {
            addCriterionForJDBCDate("tbm_expect_date <", value, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_expect_date <=", value, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_expect_date in", values, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_expect_date not in", values, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_expect_date between", value1, value2, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_expect_date not between", value1, value2, "tbmExpectDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateIsNull() {
            addCriterion("tbm_date is null");
            return (Criteria) this;
        }

        public Criteria andTbmDateIsNotNull() {
            addCriterion("tbm_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_date =", value, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_date <>", value, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbm_date >", value, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_date >=", value, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateLessThan(Date value) {
            addCriterionForJDBCDate("tbm_date <", value, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_date <=", value, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_date in", values, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_date not in", values, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_date between", value1, value2, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_date not between", value1, value2, "tbmDate");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmIsNull() {
            addCriterion("tbm_expect_km is null");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmIsNotNull() {
            addCriterion("tbm_expect_km is not null");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmEqualTo(Integer value) {
            addCriterion("tbm_expect_km =", value, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmNotEqualTo(Integer value) {
            addCriterion("tbm_expect_km <>", value, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmGreaterThan(Integer value) {
            addCriterion("tbm_expect_km >", value, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_expect_km >=", value, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmLessThan(Integer value) {
            addCriterion("tbm_expect_km <", value, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_expect_km <=", value, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmIn(List<Integer> values) {
            addCriterion("tbm_expect_km in", values, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmNotIn(List<Integer> values) {
            addCriterion("tbm_expect_km not in", values, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmBetween(Integer value1, Integer value2) {
            addCriterion("tbm_expect_km between", value1, value2, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmExpectKmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_expect_km not between", value1, value2, "tbmExpectKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmIsNull() {
            addCriterion("tbm_real_km is null");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmIsNotNull() {
            addCriterion("tbm_real_km is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmEqualTo(Integer value) {
            addCriterion("tbm_real_km =", value, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmNotEqualTo(Integer value) {
            addCriterion("tbm_real_km <>", value, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmGreaterThan(Integer value) {
            addCriterion("tbm_real_km >", value, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_real_km >=", value, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmLessThan(Integer value) {
            addCriterion("tbm_real_km <", value, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_real_km <=", value, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmIn(List<Integer> values) {
            addCriterion("tbm_real_km in", values, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmNotIn(List<Integer> values) {
            addCriterion("tbm_real_km not in", values, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmBetween(Integer value1, Integer value2) {
            addCriterion("tbm_real_km between", value1, value2, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmRealKmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_real_km not between", value1, value2, "tbmRealKm");
            return (Criteria) this;
        }

        public Criteria andTbmMileageIsNull() {
            addCriterion("tbm_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTbmMileageIsNotNull() {
            addCriterion("tbm_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTbmMileageEqualTo(Integer value) {
            addCriterion("tbm_mileage =", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageNotEqualTo(Integer value) {
            addCriterion("tbm_mileage <>", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageGreaterThan(Integer value) {
            addCriterion("tbm_mileage >", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_mileage >=", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageLessThan(Integer value) {
            addCriterion("tbm_mileage <", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_mileage <=", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageIn(List<Integer> values) {
            addCriterion("tbm_mileage in", values, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageNotIn(List<Integer> values) {
            addCriterion("tbm_mileage not in", values, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageBetween(Integer value1, Integer value2) {
            addCriterion("tbm_mileage between", value1, value2, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_mileage not between", value1, value2, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusIsNull() {
            addCriterion("tbm_carstatus is null");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusIsNotNull() {
            addCriterion("tbm_carstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusEqualTo(String value) {
            addCriterion("tbm_carstatus =", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusNotEqualTo(String value) {
            addCriterion("tbm_carstatus <>", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusGreaterThan(String value) {
            addCriterion("tbm_carstatus >", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_carstatus >=", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusLessThan(String value) {
            addCriterion("tbm_carstatus <", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusLessThanOrEqualTo(String value) {
            addCriterion("tbm_carstatus <=", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusLike(String value) {
            addCriterion("tbm_carstatus like", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusNotLike(String value) {
            addCriterion("tbm_carstatus not like", value, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusIn(List<String> values) {
            addCriterion("tbm_carstatus in", values, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusNotIn(List<String> values) {
            addCriterion("tbm_carstatus not in", values, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusBetween(String value1, String value2) {
            addCriterion("tbm_carstatus between", value1, value2, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmCarstatusNotBetween(String value1, String value2) {
            addCriterion("tbm_carstatus not between", value1, value2, "tbmCarstatus");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmIsNull() {
            addCriterion("tbm_next_km is null");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmIsNotNull() {
            addCriterion("tbm_next_km is not null");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmEqualTo(Integer value) {
            addCriterion("tbm_next_km =", value, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmNotEqualTo(Integer value) {
            addCriterion("tbm_next_km <>", value, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmGreaterThan(Integer value) {
            addCriterion("tbm_next_km >", value, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_next_km >=", value, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmLessThan(Integer value) {
            addCriterion("tbm_next_km <", value, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_next_km <=", value, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmIn(List<Integer> values) {
            addCriterion("tbm_next_km in", values, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmNotIn(List<Integer> values) {
            addCriterion("tbm_next_km not in", values, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmBetween(Integer value1, Integer value2) {
            addCriterion("tbm_next_km between", value1, value2, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextKmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_next_km not between", value1, value2, "tbmNextKm");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateIsNull() {
            addCriterion("tbm_next_date is null");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateIsNotNull() {
            addCriterion("tbm_next_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_next_date =", value, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_next_date <>", value, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbm_next_date >", value, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_next_date >=", value, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateLessThan(Date value) {
            addCriterionForJDBCDate("tbm_next_date <", value, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_next_date <=", value, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_next_date in", values, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_next_date not in", values, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_next_date between", value1, value2, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmNextDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_next_date not between", value1, value2, "tbmNextDate");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeIsNull() {
            addCriterion("tbm_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeIsNotNull() {
            addCriterion("tbm_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeEqualTo(Short value) {
            addCriterion("tbm_fee_type =", value, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeNotEqualTo(Short value) {
            addCriterion("tbm_fee_type <>", value, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeGreaterThan(Short value) {
            addCriterion("tbm_fee_type >", value, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_fee_type >=", value, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeLessThan(Short value) {
            addCriterion("tbm_fee_type <", value, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbm_fee_type <=", value, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeIn(List<Short> values) {
            addCriterion("tbm_fee_type in", values, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeNotIn(List<Short> values) {
            addCriterion("tbm_fee_type not in", values, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeBetween(Short value1, Short value2) {
            addCriterion("tbm_fee_type between", value1, value2, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbm_fee_type not between", value1, value2, "tbmFeeType");
            return (Criteria) this;
        }

        public Criteria andTbmFeeIsNull() {
            addCriterion("tbm_fee is null");
            return (Criteria) this;
        }

        public Criteria andTbmFeeIsNotNull() {
            addCriterion("tbm_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFeeEqualTo(Double value) {
            addCriterion("tbm_fee =", value, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeNotEqualTo(Double value) {
            addCriterion("tbm_fee <>", value, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeGreaterThan(Double value) {
            addCriterion("tbm_fee >", value, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbm_fee >=", value, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeLessThan(Double value) {
            addCriterion("tbm_fee <", value, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeLessThanOrEqualTo(Double value) {
            addCriterion("tbm_fee <=", value, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeIn(List<Double> values) {
            addCriterion("tbm_fee in", values, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeNotIn(List<Double> values) {
            addCriterion("tbm_fee not in", values, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeBetween(Double value1, Double value2) {
            addCriterion("tbm_fee between", value1, value2, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmFeeNotBetween(Double value1, Double value2) {
            addCriterion("tbm_fee not between", value1, value2, "tbmFee");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoIsNull() {
            addCriterion("tbm_bill_no is null");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoIsNotNull() {
            addCriterion("tbm_bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoEqualTo(String value) {
            addCriterion("tbm_bill_no =", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoNotEqualTo(String value) {
            addCriterion("tbm_bill_no <>", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoGreaterThan(String value) {
            addCriterion("tbm_bill_no >", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_bill_no >=", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoLessThan(String value) {
            addCriterion("tbm_bill_no <", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoLessThanOrEqualTo(String value) {
            addCriterion("tbm_bill_no <=", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoLike(String value) {
            addCriterion("tbm_bill_no like", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoNotLike(String value) {
            addCriterion("tbm_bill_no not like", value, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoIn(List<String> values) {
            addCriterion("tbm_bill_no in", values, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoNotIn(List<String> values) {
            addCriterion("tbm_bill_no not in", values, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoBetween(String value1, String value2) {
            addCriterion("tbm_bill_no between", value1, value2, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmBillNoNotBetween(String value1, String value2) {
            addCriterion("tbm_bill_no not between", value1, value2, "tbmBillNo");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkIsNull() {
            addCriterion("tbm_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkIsNotNull() {
            addCriterion("tbm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkEqualTo(String value) {
            addCriterion("tbm_remark =", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotEqualTo(String value) {
            addCriterion("tbm_remark <>", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkGreaterThan(String value) {
            addCriterion("tbm_remark >", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_remark >=", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkLessThan(String value) {
            addCriterion("tbm_remark <", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbm_remark <=", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkLike(String value) {
            addCriterion("tbm_remark like", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotLike(String value) {
            addCriterion("tbm_remark not like", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkIn(List<String> values) {
            addCriterion("tbm_remark in", values, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotIn(List<String> values) {
            addCriterion("tbm_remark not in", values, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkBetween(String value1, String value2) {
            addCriterion("tbm_remark between", value1, value2, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotBetween(String value1, String value2) {
            addCriterion("tbm_remark not between", value1, value2, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNull() {
            addCriterion("tbm_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNotNull() {
            addCriterion("tbm_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeEqualTo(Date value) {
            addCriterion("tbm_add_time =", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotEqualTo(Date value) {
            addCriterion("tbm_add_time <>", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThan(Date value) {
            addCriterion("tbm_add_time >", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time >=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThan(Date value) {
            addCriterion("tbm_add_time <", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time <=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIn(List<Date> values) {
            addCriterion("tbm_add_time in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotIn(List<Date> values) {
            addCriterion("tbm_add_time not in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time not between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmEditerIsNull() {
            addCriterion("tbm_editer is null");
            return (Criteria) this;
        }

        public Criteria andTbmEditerIsNotNull() {
            addCriterion("tbm_editer is not null");
            return (Criteria) this;
        }

        public Criteria andTbmEditerEqualTo(Long value) {
            addCriterion("tbm_editer =", value, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerNotEqualTo(Long value) {
            addCriterion("tbm_editer <>", value, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerGreaterThan(Long value) {
            addCriterion("tbm_editer >", value, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_editer >=", value, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerLessThan(Long value) {
            addCriterion("tbm_editer <", value, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerLessThanOrEqualTo(Long value) {
            addCriterion("tbm_editer <=", value, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerIn(List<Long> values) {
            addCriterion("tbm_editer in", values, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerNotIn(List<Long> values) {
            addCriterion("tbm_editer not in", values, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerBetween(Long value1, Long value2) {
            addCriterion("tbm_editer between", value1, value2, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmEditerNotBetween(Long value1, Long value2) {
            addCriterion("tbm_editer not between", value1, value2, "tbmEditer");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeIsNull() {
            addCriterion("tbm_updat_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeIsNotNull() {
            addCriterion("tbm_updat_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeEqualTo(Date value) {
            addCriterion("tbm_updat_time =", value, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeNotEqualTo(Date value) {
            addCriterion("tbm_updat_time <>", value, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeGreaterThan(Date value) {
            addCriterion("tbm_updat_time >", value, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_updat_time >=", value, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeLessThan(Date value) {
            addCriterion("tbm_updat_time <", value, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_updat_time <=", value, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeIn(List<Date> values) {
            addCriterion("tbm_updat_time in", values, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeNotIn(List<Date> values) {
            addCriterion("tbm_updat_time not in", values, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_updat_time between", value1, value2, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdatTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_updat_time not between", value1, value2, "tbmUpdatTime");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNull() {
            addCriterion("tbm_status is null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNotNull() {
            addCriterion("tbm_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusEqualTo(Short value) {
            addCriterion("tbm_status =", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotEqualTo(Short value) {
            addCriterion("tbm_status <>", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThan(Short value) {
            addCriterion("tbm_status >", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_status >=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThan(Short value) {
            addCriterion("tbm_status <", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbm_status <=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIn(List<Short> values) {
            addCriterion("tbm_status in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotIn(List<Short> values) {
            addCriterion("tbm_status not in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusBetween(Short value1, Short value2) {
            addCriterion("tbm_status between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbm_status not between", value1, value2, "tbmStatus");
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