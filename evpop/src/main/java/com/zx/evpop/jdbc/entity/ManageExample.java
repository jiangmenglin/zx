package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageExample() {
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

        public Criteria andTbmIdIsNull() {
            addCriterion("tbm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdIsNotNull() {
            addCriterion("tbm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdEqualTo(Integer value) {
            addCriterion("tbm_id =", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotEqualTo(Integer value) {
            addCriterion("tbm_id <>", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThan(Integer value) {
            addCriterion("tbm_id >", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_id >=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThan(Integer value) {
            addCriterion("tbm_id <", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_id <=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdIn(List<Integer> values) {
            addCriterion("tbm_id in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotIn(List<Integer> values) {
            addCriterion("tbm_id not in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTbmHostEqualTo(Integer value) {
            addCriterion("tbm_host =", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotEqualTo(Integer value) {
            addCriterion("tbm_host <>", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThan(Integer value) {
            addCriterion("tbm_host >", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_host >=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThan(Integer value) {
            addCriterion("tbm_host <", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_host <=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostIn(List<Integer> values) {
            addCriterion("tbm_host in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotIn(List<Integer> values) {
            addCriterion("tbm_host not in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostBetween(Integer value1, Integer value2) {
            addCriterion("tbm_host between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_host not between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmNameIsNull() {
            addCriterion("tbm_name is null");
            return (Criteria) this;
        }

        public Criteria andTbmNameIsNotNull() {
            addCriterion("tbm_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbmNameEqualTo(String value) {
            addCriterion("tbm_name =", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotEqualTo(String value) {
            addCriterion("tbm_name <>", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameGreaterThan(String value) {
            addCriterion("tbm_name >", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_name >=", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLessThan(String value) {
            addCriterion("tbm_name <", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLessThanOrEqualTo(String value) {
            addCriterion("tbm_name <=", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLike(String value) {
            addCriterion("tbm_name like", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotLike(String value) {
            addCriterion("tbm_name not like", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameIn(List<String> values) {
            addCriterion("tbm_name in", values, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotIn(List<String> values) {
            addCriterion("tbm_name not in", values, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameBetween(String value1, String value2) {
            addCriterion("tbm_name between", value1, value2, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotBetween(String value1, String value2) {
            addCriterion("tbm_name not between", value1, value2, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmMobileIsNull() {
            addCriterion("tbm_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTbmMobileIsNotNull() {
            addCriterion("tbm_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTbmMobileEqualTo(String value) {
            addCriterion("tbm_mobile =", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotEqualTo(String value) {
            addCriterion("tbm_mobile <>", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileGreaterThan(String value) {
            addCriterion("tbm_mobile >", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_mobile >=", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileLessThan(String value) {
            addCriterion("tbm_mobile <", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileLessThanOrEqualTo(String value) {
            addCriterion("tbm_mobile <=", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileLike(String value) {
            addCriterion("tbm_mobile like", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotLike(String value) {
            addCriterion("tbm_mobile not like", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileIn(List<String> values) {
            addCriterion("tbm_mobile in", values, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotIn(List<String> values) {
            addCriterion("tbm_mobile not in", values, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileBetween(String value1, String value2) {
            addCriterion("tbm_mobile between", value1, value2, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotBetween(String value1, String value2) {
            addCriterion("tbm_mobile not between", value1, value2, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordIsNull() {
            addCriterion("tbm_password is null");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordIsNotNull() {
            addCriterion("tbm_password is not null");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordEqualTo(String value) {
            addCriterion("tbm_password =", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordNotEqualTo(String value) {
            addCriterion("tbm_password <>", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordGreaterThan(String value) {
            addCriterion("tbm_password >", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_password >=", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordLessThan(String value) {
            addCriterion("tbm_password <", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordLessThanOrEqualTo(String value) {
            addCriterion("tbm_password <=", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordLike(String value) {
            addCriterion("tbm_password like", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordNotLike(String value) {
            addCriterion("tbm_password not like", value, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordIn(List<String> values) {
            addCriterion("tbm_password in", values, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordNotIn(List<String> values) {
            addCriterion("tbm_password not in", values, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordBetween(String value1, String value2) {
            addCriterion("tbm_password between", value1, value2, "tbmPassword");
            return (Criteria) this;
        }

        public Criteria andTbmPasswordNotBetween(String value1, String value2) {
            addCriterion("tbm_password not between", value1, value2, "tbmPassword");
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

        public Criteria andTbmTypeEqualTo(Byte value) {
            addCriterion("tbm_type =", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotEqualTo(Byte value) {
            addCriterion("tbm_type <>", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThan(Byte value) {
            addCriterion("tbm_type >", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_type >=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThan(Byte value) {
            addCriterion("tbm_type <", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_type <=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIn(List<Byte> values) {
            addCriterion("tbm_type in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotIn(List<Byte> values) {
            addCriterion("tbm_type not in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type not between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmAreasIsNull() {
            addCriterion("tbm_areas is null");
            return (Criteria) this;
        }

        public Criteria andTbmAreasIsNotNull() {
            addCriterion("tbm_areas is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAreasEqualTo(String value) {
            addCriterion("tbm_areas =", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasNotEqualTo(String value) {
            addCriterion("tbm_areas <>", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasGreaterThan(String value) {
            addCriterion("tbm_areas >", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_areas >=", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasLessThan(String value) {
            addCriterion("tbm_areas <", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasLessThanOrEqualTo(String value) {
            addCriterion("tbm_areas <=", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasLike(String value) {
            addCriterion("tbm_areas like", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasNotLike(String value) {
            addCriterion("tbm_areas not like", value, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasIn(List<String> values) {
            addCriterion("tbm_areas in", values, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasNotIn(List<String> values) {
            addCriterion("tbm_areas not in", values, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasBetween(String value1, String value2) {
            addCriterion("tbm_areas between", value1, value2, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmAreasNotBetween(String value1, String value2) {
            addCriterion("tbm_areas not between", value1, value2, "tbmAreas");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNull() {
            addCriterion("tbm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNotNull() {
            addCriterion("tbm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeEqualTo(Date value) {
            addCriterion("tbm_update_time =", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbm_update_time <>", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThan(Date value) {
            addCriterion("tbm_update_time >", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time >=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThan(Date value) {
            addCriterion("tbm_update_time <", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time <=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIn(List<Date> values) {
            addCriterion("tbm_update_time in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbm_update_time not in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time not between", value1, value2, "tbmUpdateTime");
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

        public Criteria andTbmStateIsNull() {
            addCriterion("tbm_state is null");
            return (Criteria) this;
        }

        public Criteria andTbmStateIsNotNull() {
            addCriterion("tbm_state is not null");
            return (Criteria) this;
        }

        public Criteria andTbmStateEqualTo(Byte value) {
            addCriterion("tbm_state =", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateNotEqualTo(Byte value) {
            addCriterion("tbm_state <>", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateGreaterThan(Byte value) {
            addCriterion("tbm_state >", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_state >=", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateLessThan(Byte value) {
            addCriterion("tbm_state <", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_state <=", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateIn(List<Byte> values) {
            addCriterion("tbm_state in", values, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateNotIn(List<Byte> values) {
            addCriterion("tbm_state not in", values, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateBetween(Byte value1, Byte value2) {
            addCriterion("tbm_state between", value1, value2, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_state not between", value1, value2, "tbmState");
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

        public Criteria andTbmStatusEqualTo(Byte value) {
            addCriterion("tbm_status =", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotEqualTo(Byte value) {
            addCriterion("tbm_status <>", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThan(Byte value) {
            addCriterion("tbm_status >", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_status >=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThan(Byte value) {
            addCriterion("tbm_status <", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_status <=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIn(List<Byte> values) {
            addCriterion("tbm_status in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotIn(List<Byte> values) {
            addCriterion("tbm_status not in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotBetween(Byte value1, Byte value2) {
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