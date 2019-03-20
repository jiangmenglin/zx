package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LongOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongOrderDetailExample() {
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

        public Criteria andTblodIdIsNull() {
            addCriterion("tblod_id is null");
            return (Criteria) this;
        }

        public Criteria andTblodIdIsNotNull() {
            addCriterion("tblod_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblodIdEqualTo(Long value) {
            addCriterion("tblod_id =", value, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdNotEqualTo(Long value) {
            addCriterion("tblod_id <>", value, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdGreaterThan(Long value) {
            addCriterion("tblod_id >", value, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_id >=", value, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdLessThan(Long value) {
            addCriterion("tblod_id <", value, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdLessThanOrEqualTo(Long value) {
            addCriterion("tblod_id <=", value, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdIn(List<Long> values) {
            addCriterion("tblod_id in", values, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdNotIn(List<Long> values) {
            addCriterion("tblod_id not in", values, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdBetween(Long value1, Long value2) {
            addCriterion("tblod_id between", value1, value2, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodIdNotBetween(Long value1, Long value2) {
            addCriterion("tblod_id not between", value1, value2, "tblodId");
            return (Criteria) this;
        }

        public Criteria andTblodHostIsNull() {
            addCriterion("tblod_host is null");
            return (Criteria) this;
        }

        public Criteria andTblodHostIsNotNull() {
            addCriterion("tblod_host is not null");
            return (Criteria) this;
        }

        public Criteria andTblodHostEqualTo(Long value) {
            addCriterion("tblod_host =", value, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostNotEqualTo(Long value) {
            addCriterion("tblod_host <>", value, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostGreaterThan(Long value) {
            addCriterion("tblod_host >", value, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_host >=", value, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostLessThan(Long value) {
            addCriterion("tblod_host <", value, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostLessThanOrEqualTo(Long value) {
            addCriterion("tblod_host <=", value, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostIn(List<Long> values) {
            addCriterion("tblod_host in", values, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostNotIn(List<Long> values) {
            addCriterion("tblod_host not in", values, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostBetween(Long value1, Long value2) {
            addCriterion("tblod_host between", value1, value2, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodHostNotBetween(Long value1, Long value2) {
            addCriterion("tblod_host not between", value1, value2, "tblodHost");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderIsNull() {
            addCriterion("tblod_long_order is null");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderIsNotNull() {
            addCriterion("tblod_long_order is not null");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderEqualTo(Long value) {
            addCriterion("tblod_long_order =", value, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderNotEqualTo(Long value) {
            addCriterion("tblod_long_order <>", value, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderGreaterThan(Long value) {
            addCriterion("tblod_long_order >", value, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_long_order >=", value, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderLessThan(Long value) {
            addCriterion("tblod_long_order <", value, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderLessThanOrEqualTo(Long value) {
            addCriterion("tblod_long_order <=", value, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderIn(List<Long> values) {
            addCriterion("tblod_long_order in", values, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderNotIn(List<Long> values) {
            addCriterion("tblod_long_order not in", values, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderBetween(Long value1, Long value2) {
            addCriterion("tblod_long_order between", value1, value2, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodLongOrderNotBetween(Long value1, Long value2) {
            addCriterion("tblod_long_order not between", value1, value2, "tblodLongOrder");
            return (Criteria) this;
        }

        public Criteria andTblodCarIsNull() {
            addCriterion("tblod_car is null");
            return (Criteria) this;
        }

        public Criteria andTblodCarIsNotNull() {
            addCriterion("tblod_car is not null");
            return (Criteria) this;
        }

        public Criteria andTblodCarEqualTo(Long value) {
            addCriterion("tblod_car =", value, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarNotEqualTo(Long value) {
            addCriterion("tblod_car <>", value, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarGreaterThan(Long value) {
            addCriterion("tblod_car >", value, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_car >=", value, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarLessThan(Long value) {
            addCriterion("tblod_car <", value, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarLessThanOrEqualTo(Long value) {
            addCriterion("tblod_car <=", value, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarIn(List<Long> values) {
            addCriterion("tblod_car in", values, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarNotIn(List<Long> values) {
            addCriterion("tblod_car not in", values, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarBetween(Long value1, Long value2) {
            addCriterion("tblod_car between", value1, value2, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodCarNotBetween(Long value1, Long value2) {
            addCriterion("tblod_car not between", value1, value2, "tblodCar");
            return (Criteria) this;
        }

        public Criteria andTblodPriceIsNull() {
            addCriterion("tblod_price is null");
            return (Criteria) this;
        }

        public Criteria andTblodPriceIsNotNull() {
            addCriterion("tblod_price is not null");
            return (Criteria) this;
        }

        public Criteria andTblodPriceEqualTo(Double value) {
            addCriterion("tblod_price =", value, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceNotEqualTo(Double value) {
            addCriterion("tblod_price <>", value, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceGreaterThan(Double value) {
            addCriterion("tblod_price >", value, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tblod_price >=", value, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceLessThan(Double value) {
            addCriterion("tblod_price <", value, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceLessThanOrEqualTo(Double value) {
            addCriterion("tblod_price <=", value, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceIn(List<Double> values) {
            addCriterion("tblod_price in", values, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceNotIn(List<Double> values) {
            addCriterion("tblod_price not in", values, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceBetween(Double value1, Double value2) {
            addCriterion("tblod_price between", value1, value2, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodPriceNotBetween(Double value1, Double value2) {
            addCriterion("tblod_price not between", value1, value2, "tblodPrice");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloIsNull() {
            addCriterion("tblod_set_kilo is null");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloIsNotNull() {
            addCriterion("tblod_set_kilo is not null");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloEqualTo(Long value) {
            addCriterion("tblod_set_kilo =", value, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloNotEqualTo(Long value) {
            addCriterion("tblod_set_kilo <>", value, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloGreaterThan(Long value) {
            addCriterion("tblod_set_kilo >", value, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_set_kilo >=", value, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloLessThan(Long value) {
            addCriterion("tblod_set_kilo <", value, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloLessThanOrEqualTo(Long value) {
            addCriterion("tblod_set_kilo <=", value, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloIn(List<Long> values) {
            addCriterion("tblod_set_kilo in", values, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloNotIn(List<Long> values) {
            addCriterion("tblod_set_kilo not in", values, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloBetween(Long value1, Long value2) {
            addCriterion("tblod_set_kilo between", value1, value2, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetKiloNotBetween(Long value1, Long value2) {
            addCriterion("tblod_set_kilo not between", value1, value2, "tblodSetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloIsNull() {
            addCriterion("tblod_ret_kilo is null");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloIsNotNull() {
            addCriterion("tblod_ret_kilo is not null");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloEqualTo(Long value) {
            addCriterion("tblod_ret_kilo =", value, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloNotEqualTo(Long value) {
            addCriterion("tblod_ret_kilo <>", value, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloGreaterThan(Long value) {
            addCriterion("tblod_ret_kilo >", value, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_ret_kilo >=", value, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloLessThan(Long value) {
            addCriterion("tblod_ret_kilo <", value, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloLessThanOrEqualTo(Long value) {
            addCriterion("tblod_ret_kilo <=", value, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloIn(List<Long> values) {
            addCriterion("tblod_ret_kilo in", values, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloNotIn(List<Long> values) {
            addCriterion("tblod_ret_kilo not in", values, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloBetween(Long value1, Long value2) {
            addCriterion("tblod_ret_kilo between", value1, value2, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodRetKiloNotBetween(Long value1, Long value2) {
            addCriterion("tblod_ret_kilo not between", value1, value2, "tblodRetKilo");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeIsNull() {
            addCriterion("tblod_set_time is null");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeIsNotNull() {
            addCriterion("tblod_set_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_set_time =", value, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_set_time <>", value, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tblod_set_time >", value, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_set_time >=", value, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeLessThan(Date value) {
            addCriterionForJDBCDate("tblod_set_time <", value, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_set_time <=", value, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tblod_set_time in", values, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tblod_set_time not in", values, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblod_set_time between", value1, value2, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodSetTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblod_set_time not between", value1, value2, "tblodSetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeIsNull() {
            addCriterion("tblod_ret_time is null");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeIsNotNull() {
            addCriterion("tblod_ret_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_ret_time =", value, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_ret_time <>", value, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tblod_ret_time >", value, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_ret_time >=", value, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeLessThan(Date value) {
            addCriterionForJDBCDate("tblod_ret_time <", value, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tblod_ret_time <=", value, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tblod_ret_time in", values, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tblod_ret_time not in", values, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblod_ret_time between", value1, value2, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodRetTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tblod_ret_time not between", value1, value2, "tblodRetTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeIsNull() {
            addCriterion("tblod_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeIsNotNull() {
            addCriterion("tblod_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeEqualTo(Date value) {
            addCriterion("tblod_update_time =", value, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeNotEqualTo(Date value) {
            addCriterion("tblod_update_time <>", value, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeGreaterThan(Date value) {
            addCriterion("tblod_update_time >", value, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblod_update_time >=", value, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeLessThan(Date value) {
            addCriterion("tblod_update_time <", value, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblod_update_time <=", value, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeIn(List<Date> values) {
            addCriterion("tblod_update_time in", values, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeNotIn(List<Date> values) {
            addCriterion("tblod_update_time not in", values, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tblod_update_time between", value1, value2, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblod_update_time not between", value1, value2, "tblodUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeIsNull() {
            addCriterion("tblod_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeIsNotNull() {
            addCriterion("tblod_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeEqualTo(Date value) {
            addCriterion("tblod_add_time =", value, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeNotEqualTo(Date value) {
            addCriterion("tblod_add_time <>", value, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeGreaterThan(Date value) {
            addCriterion("tblod_add_time >", value, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblod_add_time >=", value, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeLessThan(Date value) {
            addCriterion("tblod_add_time <", value, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblod_add_time <=", value, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeIn(List<Date> values) {
            addCriterion("tblod_add_time in", values, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeNotIn(List<Date> values) {
            addCriterion("tblod_add_time not in", values, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeBetween(Date value1, Date value2) {
            addCriterion("tblod_add_time between", value1, value2, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblod_add_time not between", value1, value2, "tblodAddTime");
            return (Criteria) this;
        }

        public Criteria andTblodEditorIsNull() {
            addCriterion("tblod_editor is null");
            return (Criteria) this;
        }

        public Criteria andTblodEditorIsNotNull() {
            addCriterion("tblod_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTblodEditorEqualTo(Long value) {
            addCriterion("tblod_editor =", value, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorNotEqualTo(Long value) {
            addCriterion("tblod_editor <>", value, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorGreaterThan(Long value) {
            addCriterion("tblod_editor >", value, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("tblod_editor >=", value, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorLessThan(Long value) {
            addCriterion("tblod_editor <", value, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorLessThanOrEqualTo(Long value) {
            addCriterion("tblod_editor <=", value, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorIn(List<Long> values) {
            addCriterion("tblod_editor in", values, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorNotIn(List<Long> values) {
            addCriterion("tblod_editor not in", values, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorBetween(Long value1, Long value2) {
            addCriterion("tblod_editor between", value1, value2, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodEditorNotBetween(Long value1, Long value2) {
            addCriterion("tblod_editor not between", value1, value2, "tblodEditor");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkIsNull() {
            addCriterion("tblod_remark is null");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkIsNotNull() {
            addCriterion("tblod_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkEqualTo(String value) {
            addCriterion("tblod_remark =", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkNotEqualTo(String value) {
            addCriterion("tblod_remark <>", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkGreaterThan(String value) {
            addCriterion("tblod_remark >", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tblod_remark >=", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkLessThan(String value) {
            addCriterion("tblod_remark <", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkLessThanOrEqualTo(String value) {
            addCriterion("tblod_remark <=", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkLike(String value) {
            addCriterion("tblod_remark like", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkNotLike(String value) {
            addCriterion("tblod_remark not like", value, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkIn(List<String> values) {
            addCriterion("tblod_remark in", values, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkNotIn(List<String> values) {
            addCriterion("tblod_remark not in", values, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkBetween(String value1, String value2) {
            addCriterion("tblod_remark between", value1, value2, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodRemarkNotBetween(String value1, String value2) {
            addCriterion("tblod_remark not between", value1, value2, "tblodRemark");
            return (Criteria) this;
        }

        public Criteria andTblodStatusIsNull() {
            addCriterion("tblod_status is null");
            return (Criteria) this;
        }

        public Criteria andTblodStatusIsNotNull() {
            addCriterion("tblod_status is not null");
            return (Criteria) this;
        }

        public Criteria andTblodStatusEqualTo(Short value) {
            addCriterion("tblod_status =", value, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusNotEqualTo(Short value) {
            addCriterion("tblod_status <>", value, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusGreaterThan(Short value) {
            addCriterion("tblod_status >", value, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tblod_status >=", value, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusLessThan(Short value) {
            addCriterion("tblod_status <", value, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusLessThanOrEqualTo(Short value) {
            addCriterion("tblod_status <=", value, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusIn(List<Short> values) {
            addCriterion("tblod_status in", values, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusNotIn(List<Short> values) {
            addCriterion("tblod_status not in", values, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusBetween(Short value1, Short value2) {
            addCriterion("tblod_status between", value1, value2, "tblodStatus");
            return (Criteria) this;
        }

        public Criteria andTblodStatusNotBetween(Short value1, Short value2) {
            addCriterion("tblod_status not between", value1, value2, "tblodStatus");
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