package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andTbgIdIsNull() {
            addCriterion("tbg_id is null");
            return (Criteria) this;
        }

        public Criteria andTbgIdIsNotNull() {
            addCriterion("tbg_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbgIdEqualTo(Long value) {
            addCriterion("tbg_id =", value, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdNotEqualTo(Long value) {
            addCriterion("tbg_id <>", value, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdGreaterThan(Long value) {
            addCriterion("tbg_id >", value, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbg_id >=", value, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdLessThan(Long value) {
            addCriterion("tbg_id <", value, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdLessThanOrEqualTo(Long value) {
            addCriterion("tbg_id <=", value, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdIn(List<Long> values) {
            addCriterion("tbg_id in", values, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdNotIn(List<Long> values) {
            addCriterion("tbg_id not in", values, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdBetween(Long value1, Long value2) {
            addCriterion("tbg_id between", value1, value2, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgIdNotBetween(Long value1, Long value2) {
            addCriterion("tbg_id not between", value1, value2, "tbgId");
            return (Criteria) this;
        }

        public Criteria andTbgNameIsNull() {
            addCriterion("tbg_name is null");
            return (Criteria) this;
        }

        public Criteria andTbgNameIsNotNull() {
            addCriterion("tbg_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbgNameEqualTo(String value) {
            addCriterion("tbg_name =", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameNotEqualTo(String value) {
            addCriterion("tbg_name <>", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameGreaterThan(String value) {
            addCriterion("tbg_name >", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbg_name >=", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameLessThan(String value) {
            addCriterion("tbg_name <", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameLessThanOrEqualTo(String value) {
            addCriterion("tbg_name <=", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameLike(String value) {
            addCriterion("tbg_name like", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameNotLike(String value) {
            addCriterion("tbg_name not like", value, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameIn(List<String> values) {
            addCriterion("tbg_name in", values, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameNotIn(List<String> values) {
            addCriterion("tbg_name not in", values, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameBetween(String value1, String value2) {
            addCriterion("tbg_name between", value1, value2, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgNameNotBetween(String value1, String value2) {
            addCriterion("tbg_name not between", value1, value2, "tbgName");
            return (Criteria) this;
        }

        public Criteria andTbgProductIsNull() {
            addCriterion("tbg_product is null");
            return (Criteria) this;
        }

        public Criteria andTbgProductIsNotNull() {
            addCriterion("tbg_product is not null");
            return (Criteria) this;
        }

        public Criteria andTbgProductEqualTo(Short value) {
            addCriterion("tbg_product =", value, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductNotEqualTo(Short value) {
            addCriterion("tbg_product <>", value, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductGreaterThan(Short value) {
            addCriterion("tbg_product >", value, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductGreaterThanOrEqualTo(Short value) {
            addCriterion("tbg_product >=", value, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductLessThan(Short value) {
            addCriterion("tbg_product <", value, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductLessThanOrEqualTo(Short value) {
            addCriterion("tbg_product <=", value, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductIn(List<Short> values) {
            addCriterion("tbg_product in", values, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductNotIn(List<Short> values) {
            addCriterion("tbg_product not in", values, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductBetween(Short value1, Short value2) {
            addCriterion("tbg_product between", value1, value2, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgProductNotBetween(Short value1, Short value2) {
            addCriterion("tbg_product not between", value1, value2, "tbgProduct");
            return (Criteria) this;
        }

        public Criteria andTbgFlagIsNull() {
            addCriterion("tbg_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbgFlagIsNotNull() {
            addCriterion("tbg_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbgFlagEqualTo(String value) {
            addCriterion("tbg_flag =", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagNotEqualTo(String value) {
            addCriterion("tbg_flag <>", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagGreaterThan(String value) {
            addCriterion("tbg_flag >", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbg_flag >=", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagLessThan(String value) {
            addCriterion("tbg_flag <", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagLessThanOrEqualTo(String value) {
            addCriterion("tbg_flag <=", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagLike(String value) {
            addCriterion("tbg_flag like", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagNotLike(String value) {
            addCriterion("tbg_flag not like", value, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagIn(List<String> values) {
            addCriterion("tbg_flag in", values, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagNotIn(List<String> values) {
            addCriterion("tbg_flag not in", values, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagBetween(String value1, String value2) {
            addCriterion("tbg_flag between", value1, value2, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgFlagNotBetween(String value1, String value2) {
            addCriterion("tbg_flag not between", value1, value2, "tbgFlag");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityIsNull() {
            addCriterion("tbg_priority is null");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityIsNotNull() {
            addCriterion("tbg_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityEqualTo(String value) {
            addCriterion("tbg_priority =", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityNotEqualTo(String value) {
            addCriterion("tbg_priority <>", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityGreaterThan(String value) {
            addCriterion("tbg_priority >", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("tbg_priority >=", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityLessThan(String value) {
            addCriterion("tbg_priority <", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityLessThanOrEqualTo(String value) {
            addCriterion("tbg_priority <=", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityLike(String value) {
            addCriterion("tbg_priority like", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityNotLike(String value) {
            addCriterion("tbg_priority not like", value, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityIn(List<String> values) {
            addCriterion("tbg_priority in", values, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityNotIn(List<String> values) {
            addCriterion("tbg_priority not in", values, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityBetween(String value1, String value2) {
            addCriterion("tbg_priority between", value1, value2, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgPriorityNotBetween(String value1, String value2) {
            addCriterion("tbg_priority not between", value1, value2, "tbgPriority");
            return (Criteria) this;
        }

        public Criteria andTbgExpreIsNull() {
            addCriterion("tbg_expre is null");
            return (Criteria) this;
        }

        public Criteria andTbgExpreIsNotNull() {
            addCriterion("tbg_expre is not null");
            return (Criteria) this;
        }

        public Criteria andTbgExpreEqualTo(String value) {
            addCriterion("tbg_expre =", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreNotEqualTo(String value) {
            addCriterion("tbg_expre <>", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreGreaterThan(String value) {
            addCriterion("tbg_expre >", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreGreaterThanOrEqualTo(String value) {
            addCriterion("tbg_expre >=", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreLessThan(String value) {
            addCriterion("tbg_expre <", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreLessThanOrEqualTo(String value) {
            addCriterion("tbg_expre <=", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreLike(String value) {
            addCriterion("tbg_expre like", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreNotLike(String value) {
            addCriterion("tbg_expre not like", value, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreIn(List<String> values) {
            addCriterion("tbg_expre in", values, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreNotIn(List<String> values) {
            addCriterion("tbg_expre not in", values, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreBetween(String value1, String value2) {
            addCriterion("tbg_expre between", value1, value2, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgExpreNotBetween(String value1, String value2) {
            addCriterion("tbg_expre not between", value1, value2, "tbgExpre");
            return (Criteria) this;
        }

        public Criteria andTbgMeasIsNull() {
            addCriterion("tbg_meas is null");
            return (Criteria) this;
        }

        public Criteria andTbgMeasIsNotNull() {
            addCriterion("tbg_meas is not null");
            return (Criteria) this;
        }

        public Criteria andTbgMeasEqualTo(String value) {
            addCriterion("tbg_meas =", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasNotEqualTo(String value) {
            addCriterion("tbg_meas <>", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasGreaterThan(String value) {
            addCriterion("tbg_meas >", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasGreaterThanOrEqualTo(String value) {
            addCriterion("tbg_meas >=", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasLessThan(String value) {
            addCriterion("tbg_meas <", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasLessThanOrEqualTo(String value) {
            addCriterion("tbg_meas <=", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasLike(String value) {
            addCriterion("tbg_meas like", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasNotLike(String value) {
            addCriterion("tbg_meas not like", value, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasIn(List<String> values) {
            addCriterion("tbg_meas in", values, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasNotIn(List<String> values) {
            addCriterion("tbg_meas not in", values, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasBetween(String value1, String value2) {
            addCriterion("tbg_meas between", value1, value2, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgMeasNotBetween(String value1, String value2) {
            addCriterion("tbg_meas not between", value1, value2, "tbgMeas");
            return (Criteria) this;
        }

        public Criteria andTbgProfileIsNull() {
            addCriterion("tbg_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbgProfileIsNotNull() {
            addCriterion("tbg_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbgProfileEqualTo(String value) {
            addCriterion("tbg_profile =", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileNotEqualTo(String value) {
            addCriterion("tbg_profile <>", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileGreaterThan(String value) {
            addCriterion("tbg_profile >", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbg_profile >=", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileLessThan(String value) {
            addCriterion("tbg_profile <", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileLessThanOrEqualTo(String value) {
            addCriterion("tbg_profile <=", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileLike(String value) {
            addCriterion("tbg_profile like", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileNotLike(String value) {
            addCriterion("tbg_profile not like", value, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileIn(List<String> values) {
            addCriterion("tbg_profile in", values, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileNotIn(List<String> values) {
            addCriterion("tbg_profile not in", values, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileBetween(String value1, String value2) {
            addCriterion("tbg_profile between", value1, value2, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgProfileNotBetween(String value1, String value2) {
            addCriterion("tbg_profile not between", value1, value2, "tbgProfile");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeIsNull() {
            addCriterion("tbg_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeIsNotNull() {
            addCriterion("tbg_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeEqualTo(Date value) {
            addCriterion("tbg_update_time =", value, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbg_update_time <>", value, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeGreaterThan(Date value) {
            addCriterion("tbg_update_time >", value, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbg_update_time >=", value, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeLessThan(Date value) {
            addCriterion("tbg_update_time <", value, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbg_update_time <=", value, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeIn(List<Date> values) {
            addCriterion("tbg_update_time in", values, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbg_update_time not in", values, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbg_update_time between", value1, value2, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbg_update_time not between", value1, value2, "tbgUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeIsNull() {
            addCriterion("tbg_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeIsNotNull() {
            addCriterion("tbg_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeEqualTo(Date value) {
            addCriterion("tbg_add_time =", value, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeNotEqualTo(Date value) {
            addCriterion("tbg_add_time <>", value, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeGreaterThan(Date value) {
            addCriterion("tbg_add_time >", value, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbg_add_time >=", value, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeLessThan(Date value) {
            addCriterion("tbg_add_time <", value, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbg_add_time <=", value, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeIn(List<Date> values) {
            addCriterion("tbg_add_time in", values, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeNotIn(List<Date> values) {
            addCriterion("tbg_add_time not in", values, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbg_add_time between", value1, value2, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbg_add_time not between", value1, value2, "tbgAddTime");
            return (Criteria) this;
        }

        public Criteria andTbgStatusIsNull() {
            addCriterion("tbg_status is null");
            return (Criteria) this;
        }

        public Criteria andTbgStatusIsNotNull() {
            addCriterion("tbg_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbgStatusEqualTo(Short value) {
            addCriterion("tbg_status =", value, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusNotEqualTo(Short value) {
            addCriterion("tbg_status <>", value, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusGreaterThan(Short value) {
            addCriterion("tbg_status >", value, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbg_status >=", value, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusLessThan(Short value) {
            addCriterion("tbg_status <", value, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbg_status <=", value, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusIn(List<Short> values) {
            addCriterion("tbg_status in", values, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusNotIn(List<Short> values) {
            addCriterion("tbg_status not in", values, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusBetween(Short value1, Short value2) {
            addCriterion("tbg_status between", value1, value2, "tbgStatus");
            return (Criteria) this;
        }

        public Criteria andTbgStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbg_status not between", value1, value2, "tbgStatus");
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