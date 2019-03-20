package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongOrdersExample() {
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

        public Criteria andTbloNoIsNull() {
            addCriterion("tblo_no is null");
            return (Criteria) this;
        }

        public Criteria andTbloNoIsNotNull() {
            addCriterion("tblo_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbloNoEqualTo(String value) {
            addCriterion("tblo_no =", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoNotEqualTo(String value) {
            addCriterion("tblo_no <>", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoGreaterThan(String value) {
            addCriterion("tblo_no >", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_no >=", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoLessThan(String value) {
            addCriterion("tblo_no <", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoLessThanOrEqualTo(String value) {
            addCriterion("tblo_no <=", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoLike(String value) {
            addCriterion("tblo_no like", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoNotLike(String value) {
            addCriterion("tblo_no not like", value, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoIn(List<String> values) {
            addCriterion("tblo_no in", values, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoNotIn(List<String> values) {
            addCriterion("tblo_no not in", values, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoBetween(String value1, String value2) {
            addCriterion("tblo_no between", value1, value2, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloNoNotBetween(String value1, String value2) {
            addCriterion("tblo_no not between", value1, value2, "tbloNo");
            return (Criteria) this;
        }

        public Criteria andTbloMenberIsNull() {
            addCriterion("tblo_menber is null");
            return (Criteria) this;
        }

        public Criteria andTbloMenberIsNotNull() {
            addCriterion("tblo_menber is not null");
            return (Criteria) this;
        }

        public Criteria andTbloMenberEqualTo(Long value) {
            addCriterion("tblo_menber =", value, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberNotEqualTo(Long value) {
            addCriterion("tblo_menber <>", value, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberGreaterThan(Long value) {
            addCriterion("tblo_menber >", value, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_menber >=", value, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberLessThan(Long value) {
            addCriterion("tblo_menber <", value, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberLessThanOrEqualTo(Long value) {
            addCriterion("tblo_menber <=", value, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberIn(List<Long> values) {
            addCriterion("tblo_menber in", values, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberNotIn(List<Long> values) {
            addCriterion("tblo_menber not in", values, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberBetween(Long value1, Long value2) {
            addCriterion("tblo_menber between", value1, value2, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloMenberNotBetween(Long value1, Long value2) {
            addCriterion("tblo_menber not between", value1, value2, "tbloMenber");
            return (Criteria) this;
        }

        public Criteria andTbloModelIsNull() {
            addCriterion("tblo_model is null");
            return (Criteria) this;
        }

        public Criteria andTbloModelIsNotNull() {
            addCriterion("tblo_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbloModelEqualTo(Long value) {
            addCriterion("tblo_model =", value, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelNotEqualTo(Long value) {
            addCriterion("tblo_model <>", value, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelGreaterThan(Long value) {
            addCriterion("tblo_model >", value, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_model >=", value, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelLessThan(Long value) {
            addCriterion("tblo_model <", value, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelLessThanOrEqualTo(Long value) {
            addCriterion("tblo_model <=", value, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelIn(List<Long> values) {
            addCriterion("tblo_model in", values, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelNotIn(List<Long> values) {
            addCriterion("tblo_model not in", values, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelBetween(Long value1, Long value2) {
            addCriterion("tblo_model between", value1, value2, "tbloModel");
            return (Criteria) this;
        }

        public Criteria andTbloModelNotBetween(Long value1, Long value2) {
            addCriterion("tblo_model not between", value1, value2, "tbloModel");
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

        public Criteria andTbloGetTimeIsNull() {
            addCriterion("tblo_get_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeIsNotNull() {
            addCriterion("tblo_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeEqualTo(Date value) {
            addCriterion("tblo_get_time =", value, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeNotEqualTo(Date value) {
            addCriterion("tblo_get_time <>", value, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeGreaterThan(Date value) {
            addCriterion("tblo_get_time >", value, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_get_time >=", value, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeLessThan(Date value) {
            addCriterion("tblo_get_time <", value, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_get_time <=", value, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeIn(List<Date> values) {
            addCriterion("tblo_get_time in", values, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeNotIn(List<Date> values) {
            addCriterion("tblo_get_time not in", values, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeBetween(Date value1, Date value2) {
            addCriterion("tblo_get_time between", value1, value2, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_get_time not between", value1, value2, "tbloGetTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeIsNull() {
            addCriterion("tblo_return_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeIsNotNull() {
            addCriterion("tblo_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeEqualTo(Date value) {
            addCriterion("tblo_return_time =", value, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeNotEqualTo(Date value) {
            addCriterion("tblo_return_time <>", value, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeGreaterThan(Date value) {
            addCriterion("tblo_return_time >", value, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_return_time >=", value, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeLessThan(Date value) {
            addCriterion("tblo_return_time <", value, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_return_time <=", value, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeIn(List<Date> values) {
            addCriterion("tblo_return_time in", values, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeNotIn(List<Date> values) {
            addCriterion("tblo_return_time not in", values, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeBetween(Date value1, Date value2) {
            addCriterion("tblo_return_time between", value1, value2, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_return_time not between", value1, value2, "tbloReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeIsNull() {
            addCriterion("tblo_ji_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeIsNotNull() {
            addCriterion("tblo_ji_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeEqualTo(Date value) {
            addCriterion("tblo_ji_time =", value, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeNotEqualTo(Date value) {
            addCriterion("tblo_ji_time <>", value, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeGreaterThan(Date value) {
            addCriterion("tblo_ji_time >", value, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_ji_time >=", value, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeLessThan(Date value) {
            addCriterion("tblo_ji_time <", value, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_ji_time <=", value, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeIn(List<Date> values) {
            addCriterion("tblo_ji_time in", values, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeNotIn(List<Date> values) {
            addCriterion("tblo_ji_time not in", values, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeBetween(Date value1, Date value2) {
            addCriterion("tblo_ji_time between", value1, value2, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloJiTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_ji_time not between", value1, value2, "tbloJiTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeIsNull() {
            addCriterion("tblo_menu_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeIsNotNull() {
            addCriterion("tblo_menu_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeEqualTo(Long value) {
            addCriterion("tblo_menu_time =", value, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeNotEqualTo(Long value) {
            addCriterion("tblo_menu_time <>", value, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeGreaterThan(Long value) {
            addCriterion("tblo_menu_time >", value, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_menu_time >=", value, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeLessThan(Long value) {
            addCriterion("tblo_menu_time <", value, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeLessThanOrEqualTo(Long value) {
            addCriterion("tblo_menu_time <=", value, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeIn(List<Long> values) {
            addCriterion("tblo_menu_time in", values, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeNotIn(List<Long> values) {
            addCriterion("tblo_menu_time not in", values, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeBetween(Long value1, Long value2) {
            addCriterion("tblo_menu_time between", value1, value2, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloMenuTimeNotBetween(Long value1, Long value2) {
            addCriterion("tblo_menu_time not between", value1, value2, "tbloMenuTime");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentIsNull() {
            addCriterion("tblo_order_rent is null");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentIsNotNull() {
            addCriterion("tblo_order_rent is not null");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentEqualTo(Double value) {
            addCriterion("tblo_order_rent =", value, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentNotEqualTo(Double value) {
            addCriterion("tblo_order_rent <>", value, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentGreaterThan(Double value) {
            addCriterion("tblo_order_rent >", value, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_order_rent >=", value, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentLessThan(Double value) {
            addCriterion("tblo_order_rent <", value, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentLessThanOrEqualTo(Double value) {
            addCriterion("tblo_order_rent <=", value, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentIn(List<Double> values) {
            addCriterion("tblo_order_rent in", values, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentNotIn(List<Double> values) {
            addCriterion("tblo_order_rent not in", values, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentBetween(Double value1, Double value2) {
            addCriterion("tblo_order_rent between", value1, value2, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloOrderRentNotBetween(Double value1, Double value2) {
            addCriterion("tblo_order_rent not between", value1, value2, "tbloOrderRent");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsIsNull() {
            addCriterion("tblo_get_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsIsNotNull() {
            addCriterion("tblo_get_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsEqualTo(Long value) {
            addCriterion("tblo_get_outlets =", value, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsNotEqualTo(Long value) {
            addCriterion("tblo_get_outlets <>", value, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsGreaterThan(Long value) {
            addCriterion("tblo_get_outlets >", value, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_get_outlets >=", value, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsLessThan(Long value) {
            addCriterion("tblo_get_outlets <", value, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsLessThanOrEqualTo(Long value) {
            addCriterion("tblo_get_outlets <=", value, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsIn(List<Long> values) {
            addCriterion("tblo_get_outlets in", values, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsNotIn(List<Long> values) {
            addCriterion("tblo_get_outlets not in", values, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsBetween(Long value1, Long value2) {
            addCriterion("tblo_get_outlets between", value1, value2, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloGetOutletsNotBetween(Long value1, Long value2) {
            addCriterion("tblo_get_outlets not between", value1, value2, "tbloGetOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsIsNull() {
            addCriterion("tblo_return_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsIsNotNull() {
            addCriterion("tblo_return_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsEqualTo(Long value) {
            addCriterion("tblo_return_outlets =", value, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsNotEqualTo(Long value) {
            addCriterion("tblo_return_outlets <>", value, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsGreaterThan(Long value) {
            addCriterion("tblo_return_outlets >", value, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_return_outlets >=", value, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsLessThan(Long value) {
            addCriterion("tblo_return_outlets <", value, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsLessThanOrEqualTo(Long value) {
            addCriterion("tblo_return_outlets <=", value, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsIn(List<Long> values) {
            addCriterion("tblo_return_outlets in", values, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsNotIn(List<Long> values) {
            addCriterion("tblo_return_outlets not in", values, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsBetween(Long value1, Long value2) {
            addCriterion("tblo_return_outlets between", value1, value2, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloReturnOutletsNotBetween(Long value1, Long value2) {
            addCriterion("tblo_return_outlets not between", value1, value2, "tbloReturnOutlets");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionIsNull() {
            addCriterion("tblo_coupon_reduction is null");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionIsNotNull() {
            addCriterion("tblo_coupon_reduction is not null");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionEqualTo(Double value) {
            addCriterion("tblo_coupon_reduction =", value, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionNotEqualTo(Double value) {
            addCriterion("tblo_coupon_reduction <>", value, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionGreaterThan(Double value) {
            addCriterion("tblo_coupon_reduction >", value, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_coupon_reduction >=", value, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionLessThan(Double value) {
            addCriterion("tblo_coupon_reduction <", value, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionLessThanOrEqualTo(Double value) {
            addCriterion("tblo_coupon_reduction <=", value, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionIn(List<Double> values) {
            addCriterion("tblo_coupon_reduction in", values, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionNotIn(List<Double> values) {
            addCriterion("tblo_coupon_reduction not in", values, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionBetween(Double value1, Double value2) {
            addCriterion("tblo_coupon_reduction between", value1, value2, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloCouponReductionNotBetween(Double value1, Double value2) {
            addCriterion("tblo_coupon_reduction not between", value1, value2, "tbloCouponReduction");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentIsNull() {
            addCriterion("tblo_actual_rent is null");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentIsNotNull() {
            addCriterion("tblo_actual_rent is not null");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentEqualTo(Double value) {
            addCriterion("tblo_actual_rent =", value, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentNotEqualTo(Double value) {
            addCriterion("tblo_actual_rent <>", value, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentGreaterThan(Double value) {
            addCriterion("tblo_actual_rent >", value, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_actual_rent >=", value, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentLessThan(Double value) {
            addCriterion("tblo_actual_rent <", value, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentLessThanOrEqualTo(Double value) {
            addCriterion("tblo_actual_rent <=", value, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentIn(List<Double> values) {
            addCriterion("tblo_actual_rent in", values, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentNotIn(List<Double> values) {
            addCriterion("tblo_actual_rent not in", values, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentBetween(Double value1, Double value2) {
            addCriterion("tblo_actual_rent between", value1, value2, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloActualRentNotBetween(Double value1, Double value2) {
            addCriterion("tblo_actual_rent not between", value1, value2, "tbloActualRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesIsNull() {
            addCriterion("tblo_over_times is null");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesIsNotNull() {
            addCriterion("tblo_over_times is not null");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesEqualTo(String value) {
            addCriterion("tblo_over_times =", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesNotEqualTo(String value) {
            addCriterion("tblo_over_times <>", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesGreaterThan(String value) {
            addCriterion("tblo_over_times >", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_over_times >=", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesLessThan(String value) {
            addCriterion("tblo_over_times <", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesLessThanOrEqualTo(String value) {
            addCriterion("tblo_over_times <=", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesLike(String value) {
            addCriterion("tblo_over_times like", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesNotLike(String value) {
            addCriterion("tblo_over_times not like", value, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesIn(List<String> values) {
            addCriterion("tblo_over_times in", values, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesNotIn(List<String> values) {
            addCriterion("tblo_over_times not in", values, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesBetween(String value1, String value2) {
            addCriterion("tblo_over_times between", value1, value2, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverTimesNotBetween(String value1, String value2) {
            addCriterion("tblo_over_times not between", value1, value2, "tbloOverTimes");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentIsNull() {
            addCriterion("tblo_over_rent is null");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentIsNotNull() {
            addCriterion("tblo_over_rent is not null");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentEqualTo(Double value) {
            addCriterion("tblo_over_rent =", value, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentNotEqualTo(Double value) {
            addCriterion("tblo_over_rent <>", value, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentGreaterThan(Double value) {
            addCriterion("tblo_over_rent >", value, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentGreaterThanOrEqualTo(Double value) {
            addCriterion("tblo_over_rent >=", value, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentLessThan(Double value) {
            addCriterion("tblo_over_rent <", value, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentLessThanOrEqualTo(Double value) {
            addCriterion("tblo_over_rent <=", value, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentIn(List<Double> values) {
            addCriterion("tblo_over_rent in", values, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentNotIn(List<Double> values) {
            addCriterion("tblo_over_rent not in", values, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentBetween(Double value1, Double value2) {
            addCriterion("tblo_over_rent between", value1, value2, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverRentNotBetween(Double value1, Double value2) {
            addCriterion("tblo_over_rent not between", value1, value2, "tbloOverRent");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayIsNull() {
            addCriterion("tblo_over_pay is null");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayIsNotNull() {
            addCriterion("tblo_over_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayEqualTo(Short value) {
            addCriterion("tblo_over_pay =", value, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayNotEqualTo(Short value) {
            addCriterion("tblo_over_pay <>", value, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayGreaterThan(Short value) {
            addCriterion("tblo_over_pay >", value, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayGreaterThanOrEqualTo(Short value) {
            addCriterion("tblo_over_pay >=", value, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayLessThan(Short value) {
            addCriterion("tblo_over_pay <", value, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayLessThanOrEqualTo(Short value) {
            addCriterion("tblo_over_pay <=", value, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayIn(List<Short> values) {
            addCriterion("tblo_over_pay in", values, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayNotIn(List<Short> values) {
            addCriterion("tblo_over_pay not in", values, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayBetween(Short value1, Short value2) {
            addCriterion("tblo_over_pay between", value1, value2, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPayNotBetween(Short value1, Short value2) {
            addCriterion("tblo_over_pay not between", value1, value2, "tbloOverPay");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeIsNull() {
            addCriterion("tblo_over_paytime is null");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeIsNotNull() {
            addCriterion("tblo_over_paytime is not null");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeEqualTo(Date value) {
            addCriterion("tblo_over_paytime =", value, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeNotEqualTo(Date value) {
            addCriterion("tblo_over_paytime <>", value, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeGreaterThan(Date value) {
            addCriterion("tblo_over_paytime >", value, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_over_paytime >=", value, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeLessThan(Date value) {
            addCriterion("tblo_over_paytime <", value, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_over_paytime <=", value, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeIn(List<Date> values) {
            addCriterion("tblo_over_paytime in", values, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeNotIn(List<Date> values) {
            addCriterion("tblo_over_paytime not in", values, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeBetween(Date value1, Date value2) {
            addCriterion("tblo_over_paytime between", value1, value2, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloOverPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_over_paytime not between", value1, value2, "tbloOverPaytime");
            return (Criteria) this;
        }

        public Criteria andTbloImglistIsNull() {
            addCriterion("tblo_imglist is null");
            return (Criteria) this;
        }

        public Criteria andTbloImglistIsNotNull() {
            addCriterion("tblo_imglist is not null");
            return (Criteria) this;
        }

        public Criteria andTbloImglistEqualTo(String value) {
            addCriterion("tblo_imglist =", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistNotEqualTo(String value) {
            addCriterion("tblo_imglist <>", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistGreaterThan(String value) {
            addCriterion("tblo_imglist >", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_imglist >=", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistLessThan(String value) {
            addCriterion("tblo_imglist <", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistLessThanOrEqualTo(String value) {
            addCriterion("tblo_imglist <=", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistLike(String value) {
            addCriterion("tblo_imglist like", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistNotLike(String value) {
            addCriterion("tblo_imglist not like", value, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistIn(List<String> values) {
            addCriterion("tblo_imglist in", values, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistNotIn(List<String> values) {
            addCriterion("tblo_imglist not in", values, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistBetween(String value1, String value2) {
            addCriterion("tblo_imglist between", value1, value2, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloImglistNotBetween(String value1, String value2) {
            addCriterion("tblo_imglist not between", value1, value2, "tbloImglist");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgIsNull() {
            addCriterion("tblo_return_img is null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgIsNotNull() {
            addCriterion("tblo_return_img is not null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgEqualTo(String value) {
            addCriterion("tblo_return_img =", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgNotEqualTo(String value) {
            addCriterion("tblo_return_img <>", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgGreaterThan(String value) {
            addCriterion("tblo_return_img >", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_return_img >=", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgLessThan(String value) {
            addCriterion("tblo_return_img <", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgLessThanOrEqualTo(String value) {
            addCriterion("tblo_return_img <=", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgLike(String value) {
            addCriterion("tblo_return_img like", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgNotLike(String value) {
            addCriterion("tblo_return_img not like", value, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgIn(List<String> values) {
            addCriterion("tblo_return_img in", values, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgNotIn(List<String> values) {
            addCriterion("tblo_return_img not in", values, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgBetween(String value1, String value2) {
            addCriterion("tblo_return_img between", value1, value2, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloReturnImgNotBetween(String value1, String value2) {
            addCriterion("tblo_return_img not between", value1, value2, "tbloReturnImg");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeIsNull() {
            addCriterion("tblo_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeIsNotNull() {
            addCriterion("tblo_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeEqualTo(Short value) {
            addCriterion("tblo_pay_type =", value, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeNotEqualTo(Short value) {
            addCriterion("tblo_pay_type <>", value, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeGreaterThan(Short value) {
            addCriterion("tblo_pay_type >", value, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tblo_pay_type >=", value, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeLessThan(Short value) {
            addCriterion("tblo_pay_type <", value, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeLessThanOrEqualTo(Short value) {
            addCriterion("tblo_pay_type <=", value, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeIn(List<Short> values) {
            addCriterion("tblo_pay_type in", values, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeNotIn(List<Short> values) {
            addCriterion("tblo_pay_type not in", values, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeBetween(Short value1, Short value2) {
            addCriterion("tblo_pay_type between", value1, value2, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTypeNotBetween(Short value1, Short value2) {
            addCriterion("tblo_pay_type not between", value1, value2, "tbloPayType");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeIsNull() {
            addCriterion("tblo_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeIsNotNull() {
            addCriterion("tblo_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeEqualTo(Date value) {
            addCriterion("tblo_pay_time =", value, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeNotEqualTo(Date value) {
            addCriterion("tblo_pay_time <>", value, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeGreaterThan(Date value) {
            addCriterion("tblo_pay_time >", value, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblo_pay_time >=", value, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeLessThan(Date value) {
            addCriterion("tblo_pay_time <", value, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblo_pay_time <=", value, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeIn(List<Date> values) {
            addCriterion("tblo_pay_time in", values, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeNotIn(List<Date> values) {
            addCriterion("tblo_pay_time not in", values, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeBetween(Date value1, Date value2) {
            addCriterion("tblo_pay_time between", value1, value2, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblo_pay_time not between", value1, value2, "tbloPayTime");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngIsNull() {
            addCriterion("tblo_TakeLatlng is null");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngIsNotNull() {
            addCriterion("tblo_TakeLatlng is not null");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngEqualTo(String value) {
            addCriterion("tblo_TakeLatlng =", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngNotEqualTo(String value) {
            addCriterion("tblo_TakeLatlng <>", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngGreaterThan(String value) {
            addCriterion("tblo_TakeLatlng >", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_TakeLatlng >=", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngLessThan(String value) {
            addCriterion("tblo_TakeLatlng <", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngLessThanOrEqualTo(String value) {
            addCriterion("tblo_TakeLatlng <=", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngLike(String value) {
            addCriterion("tblo_TakeLatlng like", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngNotLike(String value) {
            addCriterion("tblo_TakeLatlng not like", value, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngIn(List<String> values) {
            addCriterion("tblo_TakeLatlng in", values, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngNotIn(List<String> values) {
            addCriterion("tblo_TakeLatlng not in", values, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngBetween(String value1, String value2) {
            addCriterion("tblo_TakeLatlng between", value1, value2, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloTakelatlngNotBetween(String value1, String value2) {
            addCriterion("tblo_TakeLatlng not between", value1, value2, "tbloTakelatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngIsNull() {
            addCriterion("tblo_ReturnLatlng is null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngIsNotNull() {
            addCriterion("tblo_ReturnLatlng is not null");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngEqualTo(String value) {
            addCriterion("tblo_ReturnLatlng =", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngNotEqualTo(String value) {
            addCriterion("tblo_ReturnLatlng <>", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngGreaterThan(String value) {
            addCriterion("tblo_ReturnLatlng >", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_ReturnLatlng >=", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngLessThan(String value) {
            addCriterion("tblo_ReturnLatlng <", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngLessThanOrEqualTo(String value) {
            addCriterion("tblo_ReturnLatlng <=", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngLike(String value) {
            addCriterion("tblo_ReturnLatlng like", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngNotLike(String value) {
            addCriterion("tblo_ReturnLatlng not like", value, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngIn(List<String> values) {
            addCriterion("tblo_ReturnLatlng in", values, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngNotIn(List<String> values) {
            addCriterion("tblo_ReturnLatlng not in", values, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngBetween(String value1, String value2) {
            addCriterion("tblo_ReturnLatlng between", value1, value2, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloReturnlatlngNotBetween(String value1, String value2) {
            addCriterion("tblo_ReturnLatlng not between", value1, value2, "tbloReturnlatlng");
            return (Criteria) this;
        }

        public Criteria andTbloSrcIsNull() {
            addCriterion("tblo_src is null");
            return (Criteria) this;
        }

        public Criteria andTbloSrcIsNotNull() {
            addCriterion("tblo_src is not null");
            return (Criteria) this;
        }

        public Criteria andTbloSrcEqualTo(String value) {
            addCriterion("tblo_src =", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcNotEqualTo(String value) {
            addCriterion("tblo_src <>", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcGreaterThan(String value) {
            addCriterion("tblo_src >", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcGreaterThanOrEqualTo(String value) {
            addCriterion("tblo_src >=", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcLessThan(String value) {
            addCriterion("tblo_src <", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcLessThanOrEqualTo(String value) {
            addCriterion("tblo_src <=", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcLike(String value) {
            addCriterion("tblo_src like", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcNotLike(String value) {
            addCriterion("tblo_src not like", value, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcIn(List<String> values) {
            addCriterion("tblo_src in", values, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcNotIn(List<String> values) {
            addCriterion("tblo_src not in", values, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcBetween(String value1, String value2) {
            addCriterion("tblo_src between", value1, value2, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloSrcNotBetween(String value1, String value2) {
            addCriterion("tblo_src not between", value1, value2, "tbloSrc");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserIsNull() {
            addCriterion("tblo_update_user is null");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserIsNotNull() {
            addCriterion("tblo_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserEqualTo(Long value) {
            addCriterion("tblo_update_user =", value, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserNotEqualTo(Long value) {
            addCriterion("tblo_update_user <>", value, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserGreaterThan(Long value) {
            addCriterion("tblo_update_user >", value, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_update_user >=", value, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserLessThan(Long value) {
            addCriterion("tblo_update_user <", value, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("tblo_update_user <=", value, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserIn(List<Long> values) {
            addCriterion("tblo_update_user in", values, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserNotIn(List<Long> values) {
            addCriterion("tblo_update_user not in", values, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserBetween(Long value1, Long value2) {
            addCriterion("tblo_update_user between", value1, value2, "tbloUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbloUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("tblo_update_user not between", value1, value2, "tbloUpdateUser");
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

        public Criteria andTbloCreateUserIsNull() {
            addCriterion("tblo_create_user is null");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserIsNotNull() {
            addCriterion("tblo_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserEqualTo(Long value) {
            addCriterion("tblo_create_user =", value, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserNotEqualTo(Long value) {
            addCriterion("tblo_create_user <>", value, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserGreaterThan(Long value) {
            addCriterion("tblo_create_user >", value, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tblo_create_user >=", value, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserLessThan(Long value) {
            addCriterion("tblo_create_user <", value, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("tblo_create_user <=", value, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserIn(List<Long> values) {
            addCriterion("tblo_create_user in", values, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserNotIn(List<Long> values) {
            addCriterion("tblo_create_user not in", values, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserBetween(Long value1, Long value2) {
            addCriterion("tblo_create_user between", value1, value2, "tbloCreateUser");
            return (Criteria) this;
        }

        public Criteria andTbloCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("tblo_create_user not between", value1, value2, "tbloCreateUser");
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