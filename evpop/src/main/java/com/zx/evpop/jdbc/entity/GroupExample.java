package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExample() {
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

        public Criteria andSgIdIsNull() {
            addCriterion("sg_id is null");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNotNull() {
            addCriterion("sg_id is not null");
            return (Criteria) this;
        }

        public Criteria andSgIdEqualTo(Integer value) {
            addCriterion("sg_id =", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotEqualTo(Integer value) {
            addCriterion("sg_id <>", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThan(Integer value) {
            addCriterion("sg_id >", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg_id >=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThan(Integer value) {
            addCriterion("sg_id <", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThanOrEqualTo(Integer value) {
            addCriterion("sg_id <=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdIn(List<Integer> values) {
            addCriterion("sg_id in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotIn(List<Integer> values) {
            addCriterion("sg_id not in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdBetween(Integer value1, Integer value2) {
            addCriterion("sg_id between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sg_id not between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgNameIsNull() {
            addCriterion("sg_name is null");
            return (Criteria) this;
        }

        public Criteria andSgNameIsNotNull() {
            addCriterion("sg_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgNameEqualTo(String value) {
            addCriterion("sg_name =", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotEqualTo(String value) {
            addCriterion("sg_name <>", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameGreaterThan(String value) {
            addCriterion("sg_name >", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameGreaterThanOrEqualTo(String value) {
            addCriterion("sg_name >=", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameLessThan(String value) {
            addCriterion("sg_name <", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameLessThanOrEqualTo(String value) {
            addCriterion("sg_name <=", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameLike(String value) {
            addCriterion("sg_name like", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotLike(String value) {
            addCriterion("sg_name not like", value, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameIn(List<String> values) {
            addCriterion("sg_name in", values, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotIn(List<String> values) {
            addCriterion("sg_name not in", values, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameBetween(String value1, String value2) {
            addCriterion("sg_name between", value1, value2, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgNameNotBetween(String value1, String value2) {
            addCriterion("sg_name not between", value1, value2, "sgName");
            return (Criteria) this;
        }

        public Criteria andSgParentIsNull() {
            addCriterion("sg_parent is null");
            return (Criteria) this;
        }

        public Criteria andSgParentIsNotNull() {
            addCriterion("sg_parent is not null");
            return (Criteria) this;
        }

        public Criteria andSgParentEqualTo(Integer value) {
            addCriterion("sg_parent =", value, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentNotEqualTo(Integer value) {
            addCriterion("sg_parent <>", value, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentGreaterThan(Integer value) {
            addCriterion("sg_parent >", value, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg_parent >=", value, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentLessThan(Integer value) {
            addCriterion("sg_parent <", value, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentLessThanOrEqualTo(Integer value) {
            addCriterion("sg_parent <=", value, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentIn(List<Integer> values) {
            addCriterion("sg_parent in", values, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentNotIn(List<Integer> values) {
            addCriterion("sg_parent not in", values, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentBetween(Integer value1, Integer value2) {
            addCriterion("sg_parent between", value1, value2, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgParentNotBetween(Integer value1, Integer value2) {
            addCriterion("sg_parent not between", value1, value2, "sgParent");
            return (Criteria) this;
        }

        public Criteria andSgFamilyIsNull() {
            addCriterion("sg_family is null");
            return (Criteria) this;
        }

        public Criteria andSgFamilyIsNotNull() {
            addCriterion("sg_family is not null");
            return (Criteria) this;
        }

        public Criteria andSgFamilyEqualTo(String value) {
            addCriterion("sg_family =", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyNotEqualTo(String value) {
            addCriterion("sg_family <>", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyGreaterThan(String value) {
            addCriterion("sg_family >", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("sg_family >=", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyLessThan(String value) {
            addCriterion("sg_family <", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyLessThanOrEqualTo(String value) {
            addCriterion("sg_family <=", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyLike(String value) {
            addCriterion("sg_family like", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyNotLike(String value) {
            addCriterion("sg_family not like", value, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyIn(List<String> values) {
            addCriterion("sg_family in", values, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyNotIn(List<String> values) {
            addCriterion("sg_family not in", values, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyBetween(String value1, String value2) {
            addCriterion("sg_family between", value1, value2, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFamilyNotBetween(String value1, String value2) {
            addCriterion("sg_family not between", value1, value2, "sgFamily");
            return (Criteria) this;
        }

        public Criteria andSgFlagIsNull() {
            addCriterion("sg_flag is null");
            return (Criteria) this;
        }

        public Criteria andSgFlagIsNotNull() {
            addCriterion("sg_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSgFlagEqualTo(String value) {
            addCriterion("sg_flag =", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagNotEqualTo(String value) {
            addCriterion("sg_flag <>", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagGreaterThan(String value) {
            addCriterion("sg_flag >", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sg_flag >=", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagLessThan(String value) {
            addCriterion("sg_flag <", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagLessThanOrEqualTo(String value) {
            addCriterion("sg_flag <=", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagLike(String value) {
            addCriterion("sg_flag like", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagNotLike(String value) {
            addCriterion("sg_flag not like", value, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagIn(List<String> values) {
            addCriterion("sg_flag in", values, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagNotIn(List<String> values) {
            addCriterion("sg_flag not in", values, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagBetween(String value1, String value2) {
            addCriterion("sg_flag between", value1, value2, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgFlagNotBetween(String value1, String value2) {
            addCriterion("sg_flag not between", value1, value2, "sgFlag");
            return (Criteria) this;
        }

        public Criteria andSgStatusIsNull() {
            addCriterion("sg_status is null");
            return (Criteria) this;
        }

        public Criteria andSgStatusIsNotNull() {
            addCriterion("sg_status is not null");
            return (Criteria) this;
        }

        public Criteria andSgStatusEqualTo(Byte value) {
            addCriterion("sg_status =", value, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusNotEqualTo(Byte value) {
            addCriterion("sg_status <>", value, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusGreaterThan(Byte value) {
            addCriterion("sg_status >", value, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sg_status >=", value, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusLessThan(Byte value) {
            addCriterion("sg_status <", value, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sg_status <=", value, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusIn(List<Byte> values) {
            addCriterion("sg_status in", values, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusNotIn(List<Byte> values) {
            addCriterion("sg_status not in", values, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusBetween(Byte value1, Byte value2) {
            addCriterion("sg_status between", value1, value2, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sg_status not between", value1, value2, "sgStatus");
            return (Criteria) this;
        }

        public Criteria andSgUserIsNull() {
            addCriterion("sg_user is null");
            return (Criteria) this;
        }

        public Criteria andSgUserIsNotNull() {
            addCriterion("sg_user is not null");
            return (Criteria) this;
        }

        public Criteria andSgUserEqualTo(Integer value) {
            addCriterion("sg_user =", value, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserNotEqualTo(Integer value) {
            addCriterion("sg_user <>", value, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserGreaterThan(Integer value) {
            addCriterion("sg_user >", value, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg_user >=", value, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserLessThan(Integer value) {
            addCriterion("sg_user <", value, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserLessThanOrEqualTo(Integer value) {
            addCriterion("sg_user <=", value, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserIn(List<Integer> values) {
            addCriterion("sg_user in", values, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserNotIn(List<Integer> values) {
            addCriterion("sg_user not in", values, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserBetween(Integer value1, Integer value2) {
            addCriterion("sg_user between", value1, value2, "sgUser");
            return (Criteria) this;
        }

        public Criteria andSgUserNotBetween(Integer value1, Integer value2) {
            addCriterion("sg_user not between", value1, value2, "sgUser");
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