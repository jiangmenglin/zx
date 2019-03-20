package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AffairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AffairExample() {
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

        public Criteria andTbaIdIsNull() {
            addCriterion("tba_id is null");
            return (Criteria) this;
        }

        public Criteria andTbaIdIsNotNull() {
            addCriterion("tba_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbaIdEqualTo(Integer value) {
            addCriterion("tba_id =", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotEqualTo(Integer value) {
            addCriterion("tba_id <>", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdGreaterThan(Integer value) {
            addCriterion("tba_id >", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_id >=", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdLessThan(Integer value) {
            addCriterion("tba_id <", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tba_id <=", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdIn(List<Integer> values) {
            addCriterion("tba_id in", values, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotIn(List<Integer> values) {
            addCriterion("tba_id not in", values, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdBetween(Integer value1, Integer value2) {
            addCriterion("tba_id between", value1, value2, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_id not between", value1, value2, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaNameIsNull() {
            addCriterion("tba_name is null");
            return (Criteria) this;
        }

        public Criteria andTbaNameIsNotNull() {
            addCriterion("tba_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbaNameEqualTo(String value) {
            addCriterion("tba_name =", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotEqualTo(String value) {
            addCriterion("tba_name <>", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameGreaterThan(String value) {
            addCriterion("tba_name >", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tba_name >=", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameLessThan(String value) {
            addCriterion("tba_name <", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameLessThanOrEqualTo(String value) {
            addCriterion("tba_name <=", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameLike(String value) {
            addCriterion("tba_name like", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotLike(String value) {
            addCriterion("tba_name not like", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameIn(List<String> values) {
            addCriterion("tba_name in", values, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotIn(List<String> values) {
            addCriterion("tba_name not in", values, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameBetween(String value1, String value2) {
            addCriterion("tba_name between", value1, value2, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotBetween(String value1, String value2) {
            addCriterion("tba_name not between", value1, value2, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaFlagIsNull() {
            addCriterion("tba_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbaFlagIsNotNull() {
            addCriterion("tba_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbaFlagEqualTo(String value) {
            addCriterion("tba_flag =", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagNotEqualTo(String value) {
            addCriterion("tba_flag <>", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagGreaterThan(String value) {
            addCriterion("tba_flag >", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tba_flag >=", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagLessThan(String value) {
            addCriterion("tba_flag <", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagLessThanOrEqualTo(String value) {
            addCriterion("tba_flag <=", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagLike(String value) {
            addCriterion("tba_flag like", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagNotLike(String value) {
            addCriterion("tba_flag not like", value, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagIn(List<String> values) {
            addCriterion("tba_flag in", values, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagNotIn(List<String> values) {
            addCriterion("tba_flag not in", values, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagBetween(String value1, String value2) {
            addCriterion("tba_flag between", value1, value2, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaFlagNotBetween(String value1, String value2) {
            addCriterion("tba_flag not between", value1, value2, "tbaFlag");
            return (Criteria) this;
        }

        public Criteria andTbaModelIsNull() {
            addCriterion("tba_model is null");
            return (Criteria) this;
        }

        public Criteria andTbaModelIsNotNull() {
            addCriterion("tba_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbaModelEqualTo(String value) {
            addCriterion("tba_model =", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelNotEqualTo(String value) {
            addCriterion("tba_model <>", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelGreaterThan(String value) {
            addCriterion("tba_model >", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelGreaterThanOrEqualTo(String value) {
            addCriterion("tba_model >=", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelLessThan(String value) {
            addCriterion("tba_model <", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelLessThanOrEqualTo(String value) {
            addCriterion("tba_model <=", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelLike(String value) {
            addCriterion("tba_model like", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelNotLike(String value) {
            addCriterion("tba_model not like", value, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelIn(List<String> values) {
            addCriterion("tba_model in", values, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelNotIn(List<String> values) {
            addCriterion("tba_model not in", values, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelBetween(String value1, String value2) {
            addCriterion("tba_model between", value1, value2, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaModelNotBetween(String value1, String value2) {
            addCriterion("tba_model not between", value1, value2, "tbaModel");
            return (Criteria) this;
        }

        public Criteria andTbaFieldIsNull() {
            addCriterion("tba_field is null");
            return (Criteria) this;
        }

        public Criteria andTbaFieldIsNotNull() {
            addCriterion("tba_field is not null");
            return (Criteria) this;
        }

        public Criteria andTbaFieldEqualTo(String value) {
            addCriterion("tba_field =", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldNotEqualTo(String value) {
            addCriterion("tba_field <>", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldGreaterThan(String value) {
            addCriterion("tba_field >", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldGreaterThanOrEqualTo(String value) {
            addCriterion("tba_field >=", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldLessThan(String value) {
            addCriterion("tba_field <", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldLessThanOrEqualTo(String value) {
            addCriterion("tba_field <=", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldLike(String value) {
            addCriterion("tba_field like", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldNotLike(String value) {
            addCriterion("tba_field not like", value, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldIn(List<String> values) {
            addCriterion("tba_field in", values, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldNotIn(List<String> values) {
            addCriterion("tba_field not in", values, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldBetween(String value1, String value2) {
            addCriterion("tba_field between", value1, value2, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaFieldNotBetween(String value1, String value2) {
            addCriterion("tba_field not between", value1, value2, "tbaField");
            return (Criteria) this;
        }

        public Criteria andTbaProfileIsNull() {
            addCriterion("tba_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbaProfileIsNotNull() {
            addCriterion("tba_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbaProfileEqualTo(String value) {
            addCriterion("tba_profile =", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileNotEqualTo(String value) {
            addCriterion("tba_profile <>", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileGreaterThan(String value) {
            addCriterion("tba_profile >", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tba_profile >=", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileLessThan(String value) {
            addCriterion("tba_profile <", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileLessThanOrEqualTo(String value) {
            addCriterion("tba_profile <=", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileLike(String value) {
            addCriterion("tba_profile like", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileNotLike(String value) {
            addCriterion("tba_profile not like", value, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileIn(List<String> values) {
            addCriterion("tba_profile in", values, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileNotIn(List<String> values) {
            addCriterion("tba_profile not in", values, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileBetween(String value1, String value2) {
            addCriterion("tba_profile between", value1, value2, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaProfileNotBetween(String value1, String value2) {
            addCriterion("tba_profile not between", value1, value2, "tbaProfile");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeIsNull() {
            addCriterion("tba_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeIsNotNull() {
            addCriterion("tba_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeEqualTo(Date value) {
            addCriterion("tba_update_time =", value, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeNotEqualTo(Date value) {
            addCriterion("tba_update_time <>", value, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeGreaterThan(Date value) {
            addCriterion("tba_update_time >", value, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tba_update_time >=", value, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeLessThan(Date value) {
            addCriterion("tba_update_time <", value, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tba_update_time <=", value, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeIn(List<Date> values) {
            addCriterion("tba_update_time in", values, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeNotIn(List<Date> values) {
            addCriterion("tba_update_time not in", values, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tba_update_time between", value1, value2, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tba_update_time not between", value1, value2, "tbaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeIsNull() {
            addCriterion("tba_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeIsNotNull() {
            addCriterion("tba_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeEqualTo(Date value) {
            addCriterion("tba_add_time =", value, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeNotEqualTo(Date value) {
            addCriterion("tba_add_time <>", value, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeGreaterThan(Date value) {
            addCriterion("tba_add_time >", value, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tba_add_time >=", value, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeLessThan(Date value) {
            addCriterion("tba_add_time <", value, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tba_add_time <=", value, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeIn(List<Date> values) {
            addCriterion("tba_add_time in", values, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeNotIn(List<Date> values) {
            addCriterion("tba_add_time not in", values, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeBetween(Date value1, Date value2) {
            addCriterion("tba_add_time between", value1, value2, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tba_add_time not between", value1, value2, "tbaAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIsNull() {
            addCriterion("tba_status is null");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIsNotNull() {
            addCriterion("tba_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbaStatusEqualTo(Byte value) {
            addCriterion("tba_status =", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotEqualTo(Byte value) {
            addCriterion("tba_status <>", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusGreaterThan(Byte value) {
            addCriterion("tba_status >", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tba_status >=", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusLessThan(Byte value) {
            addCriterion("tba_status <", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tba_status <=", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIn(List<Byte> values) {
            addCriterion("tba_status in", values, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotIn(List<Byte> values) {
            addCriterion("tba_status not in", values, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusBetween(Byte value1, Byte value2) {
            addCriterion("tba_status between", value1, value2, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tba_status not between", value1, value2, "tbaStatus");
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