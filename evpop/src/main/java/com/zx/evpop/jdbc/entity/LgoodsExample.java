package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LgoodsExample() {
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

        public Criteria andTblIdIsNull() {
            addCriterion("tbl_id is null");
            return (Criteria) this;
        }

        public Criteria andTblIdIsNotNull() {
            addCriterion("tbl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblIdEqualTo(Long value) {
            addCriterion("tbl_id =", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdNotEqualTo(Long value) {
            addCriterion("tbl_id <>", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdGreaterThan(Long value) {
            addCriterion("tbl_id >", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_id >=", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdLessThan(Long value) {
            addCriterion("tbl_id <", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdLessThanOrEqualTo(Long value) {
            addCriterion("tbl_id <=", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdIn(List<Long> values) {
            addCriterion("tbl_id in", values, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdNotIn(List<Long> values) {
            addCriterion("tbl_id not in", values, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdBetween(Long value1, Long value2) {
            addCriterion("tbl_id between", value1, value2, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdNotBetween(Long value1, Long value2) {
            addCriterion("tbl_id not between", value1, value2, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblNameIsNull() {
            addCriterion("tbl_name is null");
            return (Criteria) this;
        }

        public Criteria andTblNameIsNotNull() {
            addCriterion("tbl_name is not null");
            return (Criteria) this;
        }

        public Criteria andTblNameEqualTo(String value) {
            addCriterion("tbl_name =", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameNotEqualTo(String value) {
            addCriterion("tbl_name <>", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameGreaterThan(String value) {
            addCriterion("tbl_name >", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbl_name >=", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameLessThan(String value) {
            addCriterion("tbl_name <", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameLessThanOrEqualTo(String value) {
            addCriterion("tbl_name <=", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameLike(String value) {
            addCriterion("tbl_name like", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameNotLike(String value) {
            addCriterion("tbl_name not like", value, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameIn(List<String> values) {
            addCriterion("tbl_name in", values, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameNotIn(List<String> values) {
            addCriterion("tbl_name not in", values, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameBetween(String value1, String value2) {
            addCriterion("tbl_name between", value1, value2, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblNameNotBetween(String value1, String value2) {
            addCriterion("tbl_name not between", value1, value2, "tblName");
            return (Criteria) this;
        }

        public Criteria andTblProductIsNull() {
            addCriterion("tbl_product is null");
            return (Criteria) this;
        }

        public Criteria andTblProductIsNotNull() {
            addCriterion("tbl_product is not null");
            return (Criteria) this;
        }

        public Criteria andTblProductEqualTo(Short value) {
            addCriterion("tbl_product =", value, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductNotEqualTo(Short value) {
            addCriterion("tbl_product <>", value, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductGreaterThan(Short value) {
            addCriterion("tbl_product >", value, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductGreaterThanOrEqualTo(Short value) {
            addCriterion("tbl_product >=", value, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductLessThan(Short value) {
            addCriterion("tbl_product <", value, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductLessThanOrEqualTo(Short value) {
            addCriterion("tbl_product <=", value, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductIn(List<Short> values) {
            addCriterion("tbl_product in", values, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductNotIn(List<Short> values) {
            addCriterion("tbl_product not in", values, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductBetween(Short value1, Short value2) {
            addCriterion("tbl_product between", value1, value2, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblProductNotBetween(Short value1, Short value2) {
            addCriterion("tbl_product not between", value1, value2, "tblProduct");
            return (Criteria) this;
        }

        public Criteria andTblFlagIsNull() {
            addCriterion("tbl_flag is null");
            return (Criteria) this;
        }

        public Criteria andTblFlagIsNotNull() {
            addCriterion("tbl_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTblFlagEqualTo(String value) {
            addCriterion("tbl_flag =", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagNotEqualTo(String value) {
            addCriterion("tbl_flag <>", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagGreaterThan(String value) {
            addCriterion("tbl_flag >", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbl_flag >=", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagLessThan(String value) {
            addCriterion("tbl_flag <", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagLessThanOrEqualTo(String value) {
            addCriterion("tbl_flag <=", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagLike(String value) {
            addCriterion("tbl_flag like", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagNotLike(String value) {
            addCriterion("tbl_flag not like", value, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagIn(List<String> values) {
            addCriterion("tbl_flag in", values, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagNotIn(List<String> values) {
            addCriterion("tbl_flag not in", values, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagBetween(String value1, String value2) {
            addCriterion("tbl_flag between", value1, value2, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblFlagNotBetween(String value1, String value2) {
            addCriterion("tbl_flag not between", value1, value2, "tblFlag");
            return (Criteria) this;
        }

        public Criteria andTblTimeIsNull() {
            addCriterion("tbl_time is null");
            return (Criteria) this;
        }

        public Criteria andTblTimeIsNotNull() {
            addCriterion("tbl_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblTimeEqualTo(Integer value) {
            addCriterion("tbl_time =", value, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeNotEqualTo(Integer value) {
            addCriterion("tbl_time <>", value, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeGreaterThan(Integer value) {
            addCriterion("tbl_time >", value, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbl_time >=", value, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeLessThan(Integer value) {
            addCriterion("tbl_time <", value, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeLessThanOrEqualTo(Integer value) {
            addCriterion("tbl_time <=", value, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeIn(List<Integer> values) {
            addCriterion("tbl_time in", values, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeNotIn(List<Integer> values) {
            addCriterion("tbl_time not in", values, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeBetween(Integer value1, Integer value2) {
            addCriterion("tbl_time between", value1, value2, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbl_time not between", value1, value2, "tblTime");
            return (Criteria) this;
        }

        public Criteria andTblPriorityIsNull() {
            addCriterion("tbl_priority is null");
            return (Criteria) this;
        }

        public Criteria andTblPriorityIsNotNull() {
            addCriterion("tbl_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTblPriorityEqualTo(String value) {
            addCriterion("tbl_priority =", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityNotEqualTo(String value) {
            addCriterion("tbl_priority <>", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityGreaterThan(String value) {
            addCriterion("tbl_priority >", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("tbl_priority >=", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityLessThan(String value) {
            addCriterion("tbl_priority <", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityLessThanOrEqualTo(String value) {
            addCriterion("tbl_priority <=", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityLike(String value) {
            addCriterion("tbl_priority like", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityNotLike(String value) {
            addCriterion("tbl_priority not like", value, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityIn(List<String> values) {
            addCriterion("tbl_priority in", values, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityNotIn(List<String> values) {
            addCriterion("tbl_priority not in", values, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityBetween(String value1, String value2) {
            addCriterion("tbl_priority between", value1, value2, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblPriorityNotBetween(String value1, String value2) {
            addCriterion("tbl_priority not between", value1, value2, "tblPriority");
            return (Criteria) this;
        }

        public Criteria andTblExpreIsNull() {
            addCriterion("tbl_expre is null");
            return (Criteria) this;
        }

        public Criteria andTblExpreIsNotNull() {
            addCriterion("tbl_expre is not null");
            return (Criteria) this;
        }

        public Criteria andTblExpreEqualTo(String value) {
            addCriterion("tbl_expre =", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreNotEqualTo(String value) {
            addCriterion("tbl_expre <>", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreGreaterThan(String value) {
            addCriterion("tbl_expre >", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreGreaterThanOrEqualTo(String value) {
            addCriterion("tbl_expre >=", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreLessThan(String value) {
            addCriterion("tbl_expre <", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreLessThanOrEqualTo(String value) {
            addCriterion("tbl_expre <=", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreLike(String value) {
            addCriterion("tbl_expre like", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreNotLike(String value) {
            addCriterion("tbl_expre not like", value, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreIn(List<String> values) {
            addCriterion("tbl_expre in", values, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreNotIn(List<String> values) {
            addCriterion("tbl_expre not in", values, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreBetween(String value1, String value2) {
            addCriterion("tbl_expre between", value1, value2, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblExpreNotBetween(String value1, String value2) {
            addCriterion("tbl_expre not between", value1, value2, "tblExpre");
            return (Criteria) this;
        }

        public Criteria andTblMeasIsNull() {
            addCriterion("tbl_meas is null");
            return (Criteria) this;
        }

        public Criteria andTblMeasIsNotNull() {
            addCriterion("tbl_meas is not null");
            return (Criteria) this;
        }

        public Criteria andTblMeasEqualTo(String value) {
            addCriterion("tbl_meas =", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasNotEqualTo(String value) {
            addCriterion("tbl_meas <>", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasGreaterThan(String value) {
            addCriterion("tbl_meas >", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasGreaterThanOrEqualTo(String value) {
            addCriterion("tbl_meas >=", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasLessThan(String value) {
            addCriterion("tbl_meas <", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasLessThanOrEqualTo(String value) {
            addCriterion("tbl_meas <=", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasLike(String value) {
            addCriterion("tbl_meas like", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasNotLike(String value) {
            addCriterion("tbl_meas not like", value, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasIn(List<String> values) {
            addCriterion("tbl_meas in", values, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasNotIn(List<String> values) {
            addCriterion("tbl_meas not in", values, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasBetween(String value1, String value2) {
            addCriterion("tbl_meas between", value1, value2, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblMeasNotBetween(String value1, String value2) {
            addCriterion("tbl_meas not between", value1, value2, "tblMeas");
            return (Criteria) this;
        }

        public Criteria andTblProfileIsNull() {
            addCriterion("tbl_profile is null");
            return (Criteria) this;
        }

        public Criteria andTblProfileIsNotNull() {
            addCriterion("tbl_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTblProfileEqualTo(String value) {
            addCriterion("tbl_profile =", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileNotEqualTo(String value) {
            addCriterion("tbl_profile <>", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileGreaterThan(String value) {
            addCriterion("tbl_profile >", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbl_profile >=", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileLessThan(String value) {
            addCriterion("tbl_profile <", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileLessThanOrEqualTo(String value) {
            addCriterion("tbl_profile <=", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileLike(String value) {
            addCriterion("tbl_profile like", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileNotLike(String value) {
            addCriterion("tbl_profile not like", value, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileIn(List<String> values) {
            addCriterion("tbl_profile in", values, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileNotIn(List<String> values) {
            addCriterion("tbl_profile not in", values, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileBetween(String value1, String value2) {
            addCriterion("tbl_profile between", value1, value2, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblProfileNotBetween(String value1, String value2) {
            addCriterion("tbl_profile not between", value1, value2, "tblProfile");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeIsNull() {
            addCriterion("tbl_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeIsNotNull() {
            addCriterion("tbl_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeEqualTo(Date value) {
            addCriterion("tbl_update_time =", value, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbl_update_time <>", value, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeGreaterThan(Date value) {
            addCriterion("tbl_update_time >", value, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbl_update_time >=", value, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeLessThan(Date value) {
            addCriterion("tbl_update_time <", value, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbl_update_time <=", value, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeIn(List<Date> values) {
            addCriterion("tbl_update_time in", values, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbl_update_time not in", values, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbl_update_time between", value1, value2, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbl_update_time not between", value1, value2, "tblUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeIsNull() {
            addCriterion("tbl_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeIsNotNull() {
            addCriterion("tbl_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeEqualTo(Date value) {
            addCriterion("tbl_add_time =", value, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeNotEqualTo(Date value) {
            addCriterion("tbl_add_time <>", value, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeGreaterThan(Date value) {
            addCriterion("tbl_add_time >", value, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbl_add_time >=", value, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeLessThan(Date value) {
            addCriterion("tbl_add_time <", value, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbl_add_time <=", value, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeIn(List<Date> values) {
            addCriterion("tbl_add_time in", values, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeNotIn(List<Date> values) {
            addCriterion("tbl_add_time not in", values, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbl_add_time between", value1, value2, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbl_add_time not between", value1, value2, "tblAddTime");
            return (Criteria) this;
        }

        public Criteria andTblStatusIsNull() {
            addCriterion("tbl_status is null");
            return (Criteria) this;
        }

        public Criteria andTblStatusIsNotNull() {
            addCriterion("tbl_status is not null");
            return (Criteria) this;
        }

        public Criteria andTblStatusEqualTo(Short value) {
            addCriterion("tbl_status =", value, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusNotEqualTo(Short value) {
            addCriterion("tbl_status <>", value, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusGreaterThan(Short value) {
            addCriterion("tbl_status >", value, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbl_status >=", value, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusLessThan(Short value) {
            addCriterion("tbl_status <", value, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbl_status <=", value, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusIn(List<Short> values) {
            addCriterion("tbl_status in", values, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusNotIn(List<Short> values) {
            addCriterion("tbl_status not in", values, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusBetween(Short value1, Short value2) {
            addCriterion("tbl_status between", value1, value2, "tblStatus");
            return (Criteria) this;
        }

        public Criteria andTblStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbl_status not between", value1, value2, "tblStatus");
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