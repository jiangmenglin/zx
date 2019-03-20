package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HostExample() {
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

        public Criteria andShIdIsNull() {
            addCriterion("sh_id is null");
            return (Criteria) this;
        }

        public Criteria andShIdIsNotNull() {
            addCriterion("sh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShIdEqualTo(Integer value) {
            addCriterion("sh_id =", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotEqualTo(Integer value) {
            addCriterion("sh_id <>", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThan(Integer value) {
            addCriterion("sh_id >", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_id >=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThan(Integer value) {
            addCriterion("sh_id <", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThanOrEqualTo(Integer value) {
            addCriterion("sh_id <=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdIn(List<Integer> values) {
            addCriterion("sh_id in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotIn(List<Integer> values) {
            addCriterion("sh_id not in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdBetween(Integer value1, Integer value2) {
            addCriterion("sh_id between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_id not between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShNameIsNull() {
            addCriterion("sh_name is null");
            return (Criteria) this;
        }

        public Criteria andShNameIsNotNull() {
            addCriterion("sh_name is not null");
            return (Criteria) this;
        }

        public Criteria andShNameEqualTo(String value) {
            addCriterion("sh_name =", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotEqualTo(String value) {
            addCriterion("sh_name <>", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameGreaterThan(String value) {
            addCriterion("sh_name >", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameGreaterThanOrEqualTo(String value) {
            addCriterion("sh_name >=", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLessThan(String value) {
            addCriterion("sh_name <", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLessThanOrEqualTo(String value) {
            addCriterion("sh_name <=", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameLike(String value) {
            addCriterion("sh_name like", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotLike(String value) {
            addCriterion("sh_name not like", value, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameIn(List<String> values) {
            addCriterion("sh_name in", values, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotIn(List<String> values) {
            addCriterion("sh_name not in", values, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameBetween(String value1, String value2) {
            addCriterion("sh_name between", value1, value2, "shName");
            return (Criteria) this;
        }

        public Criteria andShNameNotBetween(String value1, String value2) {
            addCriterion("sh_name not between", value1, value2, "shName");
            return (Criteria) this;
        }

        public Criteria andShFlagIsNull() {
            addCriterion("sh_flag is null");
            return (Criteria) this;
        }

        public Criteria andShFlagIsNotNull() {
            addCriterion("sh_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShFlagEqualTo(String value) {
            addCriterion("sh_flag =", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagNotEqualTo(String value) {
            addCriterion("sh_flag <>", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagGreaterThan(String value) {
            addCriterion("sh_flag >", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sh_flag >=", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagLessThan(String value) {
            addCriterion("sh_flag <", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagLessThanOrEqualTo(String value) {
            addCriterion("sh_flag <=", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagLike(String value) {
            addCriterion("sh_flag like", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagNotLike(String value) {
            addCriterion("sh_flag not like", value, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagIn(List<String> values) {
            addCriterion("sh_flag in", values, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagNotIn(List<String> values) {
            addCriterion("sh_flag not in", values, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagBetween(String value1, String value2) {
            addCriterion("sh_flag between", value1, value2, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShFlagNotBetween(String value1, String value2) {
            addCriterion("sh_flag not between", value1, value2, "shFlag");
            return (Criteria) this;
        }

        public Criteria andShOperIsNull() {
            addCriterion("sh_oper is null");
            return (Criteria) this;
        }

        public Criteria andShOperIsNotNull() {
            addCriterion("sh_oper is not null");
            return (Criteria) this;
        }

        public Criteria andShOperEqualTo(Integer value) {
            addCriterion("sh_oper =", value, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperNotEqualTo(Integer value) {
            addCriterion("sh_oper <>", value, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperGreaterThan(Integer value) {
            addCriterion("sh_oper >", value, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_oper >=", value, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperLessThan(Integer value) {
            addCriterion("sh_oper <", value, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperLessThanOrEqualTo(Integer value) {
            addCriterion("sh_oper <=", value, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperIn(List<Integer> values) {
            addCriterion("sh_oper in", values, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperNotIn(List<Integer> values) {
            addCriterion("sh_oper not in", values, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperBetween(Integer value1, Integer value2) {
            addCriterion("sh_oper between", value1, value2, "shOper");
            return (Criteria) this;
        }

        public Criteria andShOperNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_oper not between", value1, value2, "shOper");
            return (Criteria) this;
        }

        public Criteria andShLonIsNull() {
            addCriterion("sh_lon is null");
            return (Criteria) this;
        }

        public Criteria andShLonIsNotNull() {
            addCriterion("sh_lon is not null");
            return (Criteria) this;
        }

        public Criteria andShLonEqualTo(Double value) {
            addCriterion("sh_lon =", value, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonNotEqualTo(Double value) {
            addCriterion("sh_lon <>", value, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonGreaterThan(Double value) {
            addCriterion("sh_lon >", value, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonGreaterThanOrEqualTo(Double value) {
            addCriterion("sh_lon >=", value, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonLessThan(Double value) {
            addCriterion("sh_lon <", value, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonLessThanOrEqualTo(Double value) {
            addCriterion("sh_lon <=", value, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonIn(List<Double> values) {
            addCriterion("sh_lon in", values, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonNotIn(List<Double> values) {
            addCriterion("sh_lon not in", values, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonBetween(Double value1, Double value2) {
            addCriterion("sh_lon between", value1, value2, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLonNotBetween(Double value1, Double value2) {
            addCriterion("sh_lon not between", value1, value2, "shLon");
            return (Criteria) this;
        }

        public Criteria andShLatIsNull() {
            addCriterion("sh_lat is null");
            return (Criteria) this;
        }

        public Criteria andShLatIsNotNull() {
            addCriterion("sh_lat is not null");
            return (Criteria) this;
        }

        public Criteria andShLatEqualTo(Double value) {
            addCriterion("sh_lat =", value, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatNotEqualTo(Double value) {
            addCriterion("sh_lat <>", value, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatGreaterThan(Double value) {
            addCriterion("sh_lat >", value, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatGreaterThanOrEqualTo(Double value) {
            addCriterion("sh_lat >=", value, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatLessThan(Double value) {
            addCriterion("sh_lat <", value, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatLessThanOrEqualTo(Double value) {
            addCriterion("sh_lat <=", value, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatIn(List<Double> values) {
            addCriterion("sh_lat in", values, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatNotIn(List<Double> values) {
            addCriterion("sh_lat not in", values, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatBetween(Double value1, Double value2) {
            addCriterion("sh_lat between", value1, value2, "shLat");
            return (Criteria) this;
        }

        public Criteria andShLatNotBetween(Double value1, Double value2) {
            addCriterion("sh_lat not between", value1, value2, "shLat");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeIsNull() {
            addCriterion("sh_update_time is null");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeIsNotNull() {
            addCriterion("sh_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeEqualTo(Date value) {
            addCriterion("sh_update_time =", value, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeNotEqualTo(Date value) {
            addCriterion("sh_update_time <>", value, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeGreaterThan(Date value) {
            addCriterion("sh_update_time >", value, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sh_update_time >=", value, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeLessThan(Date value) {
            addCriterion("sh_update_time <", value, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sh_update_time <=", value, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeIn(List<Date> values) {
            addCriterion("sh_update_time in", values, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeNotIn(List<Date> values) {
            addCriterion("sh_update_time not in", values, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sh_update_time between", value1, value2, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sh_update_time not between", value1, value2, "shUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeIsNull() {
            addCriterion("sh_add_time is null");
            return (Criteria) this;
        }

        public Criteria andShAddTimeIsNotNull() {
            addCriterion("sh_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andShAddTimeEqualTo(Date value) {
            addCriterion("sh_add_time =", value, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeNotEqualTo(Date value) {
            addCriterion("sh_add_time <>", value, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeGreaterThan(Date value) {
            addCriterion("sh_add_time >", value, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sh_add_time >=", value, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeLessThan(Date value) {
            addCriterion("sh_add_time <", value, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("sh_add_time <=", value, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeIn(List<Date> values) {
            addCriterion("sh_add_time in", values, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeNotIn(List<Date> values) {
            addCriterion("sh_add_time not in", values, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeBetween(Date value1, Date value2) {
            addCriterion("sh_add_time between", value1, value2, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("sh_add_time not between", value1, value2, "shAddTime");
            return (Criteria) this;
        }

        public Criteria andShStateIsNull() {
            addCriterion("sh_state is null");
            return (Criteria) this;
        }

        public Criteria andShStateIsNotNull() {
            addCriterion("sh_state is not null");
            return (Criteria) this;
        }

        public Criteria andShStateEqualTo(Byte value) {
            addCriterion("sh_state =", value, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateNotEqualTo(Byte value) {
            addCriterion("sh_state <>", value, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateGreaterThan(Byte value) {
            addCriterion("sh_state >", value, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("sh_state >=", value, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateLessThan(Byte value) {
            addCriterion("sh_state <", value, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateLessThanOrEqualTo(Byte value) {
            addCriterion("sh_state <=", value, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateIn(List<Byte> values) {
            addCriterion("sh_state in", values, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateNotIn(List<Byte> values) {
            addCriterion("sh_state not in", values, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateBetween(Byte value1, Byte value2) {
            addCriterion("sh_state between", value1, value2, "shState");
            return (Criteria) this;
        }

        public Criteria andShStateNotBetween(Byte value1, Byte value2) {
            addCriterion("sh_state not between", value1, value2, "shState");
            return (Criteria) this;
        }

        public Criteria andShStatusIsNull() {
            addCriterion("sh_status is null");
            return (Criteria) this;
        }

        public Criteria andShStatusIsNotNull() {
            addCriterion("sh_status is not null");
            return (Criteria) this;
        }

        public Criteria andShStatusEqualTo(Byte value) {
            addCriterion("sh_status =", value, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusNotEqualTo(Byte value) {
            addCriterion("sh_status <>", value, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusGreaterThan(Byte value) {
            addCriterion("sh_status >", value, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sh_status >=", value, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusLessThan(Byte value) {
            addCriterion("sh_status <", value, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sh_status <=", value, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusIn(List<Byte> values) {
            addCriterion("sh_status in", values, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusNotIn(List<Byte> values) {
            addCriterion("sh_status not in", values, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusBetween(Byte value1, Byte value2) {
            addCriterion("sh_status between", value1, value2, "shStatus");
            return (Criteria) this;
        }

        public Criteria andShStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sh_status not between", value1, value2, "shStatus");
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