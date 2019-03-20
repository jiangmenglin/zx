package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralRuleExample() {
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

        public Criteria andTbirIdIsNull() {
            addCriterion("tbir_id is null");
            return (Criteria) this;
        }

        public Criteria andTbirIdIsNotNull() {
            addCriterion("tbir_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbirIdEqualTo(Integer value) {
            addCriterion("tbir_id =", value, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdNotEqualTo(Integer value) {
            addCriterion("tbir_id <>", value, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdGreaterThan(Integer value) {
            addCriterion("tbir_id >", value, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbir_id >=", value, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdLessThan(Integer value) {
            addCriterion("tbir_id <", value, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbir_id <=", value, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdIn(List<Integer> values) {
            addCriterion("tbir_id in", values, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdNotIn(List<Integer> values) {
            addCriterion("tbir_id not in", values, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdBetween(Integer value1, Integer value2) {
            addCriterion("tbir_id between", value1, value2, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbir_id not between", value1, value2, "tbirId");
            return (Criteria) this;
        }

        public Criteria andTbirNameIsNull() {
            addCriterion("tbir_name is null");
            return (Criteria) this;
        }

        public Criteria andTbirNameIsNotNull() {
            addCriterion("tbir_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbirNameEqualTo(String value) {
            addCriterion("tbir_name =", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameNotEqualTo(String value) {
            addCriterion("tbir_name <>", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameGreaterThan(String value) {
            addCriterion("tbir_name >", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbir_name >=", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameLessThan(String value) {
            addCriterion("tbir_name <", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameLessThanOrEqualTo(String value) {
            addCriterion("tbir_name <=", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameLike(String value) {
            addCriterion("tbir_name like", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameNotLike(String value) {
            addCriterion("tbir_name not like", value, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameIn(List<String> values) {
            addCriterion("tbir_name in", values, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameNotIn(List<String> values) {
            addCriterion("tbir_name not in", values, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameBetween(String value1, String value2) {
            addCriterion("tbir_name between", value1, value2, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirNameNotBetween(String value1, String value2) {
            addCriterion("tbir_name not between", value1, value2, "tbirName");
            return (Criteria) this;
        }

        public Criteria andTbirFlagIsNull() {
            addCriterion("tbir_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbirFlagIsNotNull() {
            addCriterion("tbir_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbirFlagEqualTo(String value) {
            addCriterion("tbir_flag =", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagNotEqualTo(String value) {
            addCriterion("tbir_flag <>", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagGreaterThan(String value) {
            addCriterion("tbir_flag >", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbir_flag >=", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagLessThan(String value) {
            addCriterion("tbir_flag <", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagLessThanOrEqualTo(String value) {
            addCriterion("tbir_flag <=", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagLike(String value) {
            addCriterion("tbir_flag like", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagNotLike(String value) {
            addCriterion("tbir_flag not like", value, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagIn(List<String> values) {
            addCriterion("tbir_flag in", values, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagNotIn(List<String> values) {
            addCriterion("tbir_flag not in", values, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagBetween(String value1, String value2) {
            addCriterion("tbir_flag between", value1, value2, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirFlagNotBetween(String value1, String value2) {
            addCriterion("tbir_flag not between", value1, value2, "tbirFlag");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyIsNull() {
            addCriterion("tbir_money is null");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyIsNotNull() {
            addCriterion("tbir_money is not null");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyEqualTo(Integer value) {
            addCriterion("tbir_money =", value, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyNotEqualTo(Integer value) {
            addCriterion("tbir_money <>", value, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyGreaterThan(Integer value) {
            addCriterion("tbir_money >", value, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbir_money >=", value, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyLessThan(Integer value) {
            addCriterion("tbir_money <", value, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("tbir_money <=", value, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyIn(List<Integer> values) {
            addCriterion("tbir_money in", values, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyNotIn(List<Integer> values) {
            addCriterion("tbir_money not in", values, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyBetween(Integer value1, Integer value2) {
            addCriterion("tbir_money between", value1, value2, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("tbir_money not between", value1, value2, "tbirMoney");
            return (Criteria) this;
        }

        public Criteria andTbirDepictIsNull() {
            addCriterion("tbir_depict is null");
            return (Criteria) this;
        }

        public Criteria andTbirDepictIsNotNull() {
            addCriterion("tbir_depict is not null");
            return (Criteria) this;
        }

        public Criteria andTbirDepictEqualTo(String value) {
            addCriterion("tbir_depict =", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictNotEqualTo(String value) {
            addCriterion("tbir_depict <>", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictGreaterThan(String value) {
            addCriterion("tbir_depict >", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictGreaterThanOrEqualTo(String value) {
            addCriterion("tbir_depict >=", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictLessThan(String value) {
            addCriterion("tbir_depict <", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictLessThanOrEqualTo(String value) {
            addCriterion("tbir_depict <=", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictLike(String value) {
            addCriterion("tbir_depict like", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictNotLike(String value) {
            addCriterion("tbir_depict not like", value, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictIn(List<String> values) {
            addCriterion("tbir_depict in", values, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictNotIn(List<String> values) {
            addCriterion("tbir_depict not in", values, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictBetween(String value1, String value2) {
            addCriterion("tbir_depict between", value1, value2, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirDepictNotBetween(String value1, String value2) {
            addCriterion("tbir_depict not between", value1, value2, "tbirDepict");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralIsNull() {
            addCriterion("tbir_integral is null");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralIsNotNull() {
            addCriterion("tbir_integral is not null");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralEqualTo(BigDecimal value) {
            addCriterion("tbir_integral =", value, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralNotEqualTo(BigDecimal value) {
            addCriterion("tbir_integral <>", value, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralGreaterThan(BigDecimal value) {
            addCriterion("tbir_integral >", value, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbir_integral >=", value, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralLessThan(BigDecimal value) {
            addCriterion("tbir_integral <", value, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbir_integral <=", value, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralIn(List<BigDecimal> values) {
            addCriterion("tbir_integral in", values, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralNotIn(List<BigDecimal> values) {
            addCriterion("tbir_integral not in", values, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbir_integral between", value1, value2, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirIntegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbir_integral not between", value1, value2, "tbirIntegral");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeIsNull() {
            addCriterion("tbir_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeIsNotNull() {
            addCriterion("tbir_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeEqualTo(Date value) {
            addCriterion("tbir_update_time =", value, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbir_update_time <>", value, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeGreaterThan(Date value) {
            addCriterion("tbir_update_time >", value, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbir_update_time >=", value, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeLessThan(Date value) {
            addCriterion("tbir_update_time <", value, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbir_update_time <=", value, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeIn(List<Date> values) {
            addCriterion("tbir_update_time in", values, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbir_update_time not in", values, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbir_update_time between", value1, value2, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbir_update_time not between", value1, value2, "tbirUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeIsNull() {
            addCriterion("tbir_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeIsNotNull() {
            addCriterion("tbir_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeEqualTo(Date value) {
            addCriterion("tbir_add_time =", value, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeNotEqualTo(Date value) {
            addCriterion("tbir_add_time <>", value, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeGreaterThan(Date value) {
            addCriterion("tbir_add_time >", value, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbir_add_time >=", value, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeLessThan(Date value) {
            addCriterion("tbir_add_time <", value, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbir_add_time <=", value, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeIn(List<Date> values) {
            addCriterion("tbir_add_time in", values, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeNotIn(List<Date> values) {
            addCriterion("tbir_add_time not in", values, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbir_add_time between", value1, value2, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbir_add_time not between", value1, value2, "tbirAddTime");
            return (Criteria) this;
        }

        public Criteria andTbirStatusIsNull() {
            addCriterion("tbir_status is null");
            return (Criteria) this;
        }

        public Criteria andTbirStatusIsNotNull() {
            addCriterion("tbir_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbirStatusEqualTo(Byte value) {
            addCriterion("tbir_status =", value, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusNotEqualTo(Byte value) {
            addCriterion("tbir_status <>", value, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusGreaterThan(Byte value) {
            addCriterion("tbir_status >", value, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbir_status >=", value, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusLessThan(Byte value) {
            addCriterion("tbir_status <", value, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbir_status <=", value, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusIn(List<Byte> values) {
            addCriterion("tbir_status in", values, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusNotIn(List<Byte> values) {
            addCriterion("tbir_status not in", values, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbir_status between", value1, value2, "tbirStatus");
            return (Criteria) this;
        }

        public Criteria andTbirStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbir_status not between", value1, value2, "tbirStatus");
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