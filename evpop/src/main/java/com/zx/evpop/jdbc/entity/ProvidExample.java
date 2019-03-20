package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvidExample() {
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

        public Criteria andTbpIdIsNull() {
            addCriterion("tbp_id is null");
            return (Criteria) this;
        }

        public Criteria andTbpIdIsNotNull() {
            addCriterion("tbp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbpIdEqualTo(Long value) {
            addCriterion("tbp_id =", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotEqualTo(Long value) {
            addCriterion("tbp_id <>", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThan(Long value) {
            addCriterion("tbp_id >", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_id >=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThan(Long value) {
            addCriterion("tbp_id <", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThanOrEqualTo(Long value) {
            addCriterion("tbp_id <=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdIn(List<Long> values) {
            addCriterion("tbp_id in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotIn(List<Long> values) {
            addCriterion("tbp_id not in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdBetween(Long value1, Long value2) {
            addCriterion("tbp_id between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotBetween(Long value1, Long value2) {
            addCriterion("tbp_id not between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNull() {
            addCriterion("tbp_host is null");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNotNull() {
            addCriterion("tbp_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbpHostEqualTo(Long value) {
            addCriterion("tbp_host =", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotEqualTo(Long value) {
            addCriterion("tbp_host <>", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThan(Long value) {
            addCriterion("tbp_host >", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_host >=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThan(Long value) {
            addCriterion("tbp_host <", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThanOrEqualTo(Long value) {
            addCriterion("tbp_host <=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostIn(List<Long> values) {
            addCriterion("tbp_host in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotIn(List<Long> values) {
            addCriterion("tbp_host not in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostBetween(Long value1, Long value2) {
            addCriterion("tbp_host between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotBetween(Long value1, Long value2) {
            addCriterion("tbp_host not between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpNameIsNull() {
            addCriterion("tbp_name is null");
            return (Criteria) this;
        }

        public Criteria andTbpNameIsNotNull() {
            addCriterion("tbp_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbpNameEqualTo(String value) {
            addCriterion("tbp_name =", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameNotEqualTo(String value) {
            addCriterion("tbp_name <>", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameGreaterThan(String value) {
            addCriterion("tbp_name >", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_name >=", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameLessThan(String value) {
            addCriterion("tbp_name <", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameLessThanOrEqualTo(String value) {
            addCriterion("tbp_name <=", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameLike(String value) {
            addCriterion("tbp_name like", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameNotLike(String value) {
            addCriterion("tbp_name not like", value, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameIn(List<String> values) {
            addCriterion("tbp_name in", values, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameNotIn(List<String> values) {
            addCriterion("tbp_name not in", values, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameBetween(String value1, String value2) {
            addCriterion("tbp_name between", value1, value2, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpNameNotBetween(String value1, String value2) {
            addCriterion("tbp_name not between", value1, value2, "tbpName");
            return (Criteria) this;
        }

        public Criteria andTbpPersonIsNull() {
            addCriterion("tbp_person is null");
            return (Criteria) this;
        }

        public Criteria andTbpPersonIsNotNull() {
            addCriterion("tbp_person is not null");
            return (Criteria) this;
        }

        public Criteria andTbpPersonEqualTo(String value) {
            addCriterion("tbp_person =", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonNotEqualTo(String value) {
            addCriterion("tbp_person <>", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonGreaterThan(String value) {
            addCriterion("tbp_person >", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_person >=", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonLessThan(String value) {
            addCriterion("tbp_person <", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonLessThanOrEqualTo(String value) {
            addCriterion("tbp_person <=", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonLike(String value) {
            addCriterion("tbp_person like", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonNotLike(String value) {
            addCriterion("tbp_person not like", value, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonIn(List<String> values) {
            addCriterion("tbp_person in", values, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonNotIn(List<String> values) {
            addCriterion("tbp_person not in", values, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonBetween(String value1, String value2) {
            addCriterion("tbp_person between", value1, value2, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpPersonNotBetween(String value1, String value2) {
            addCriterion("tbp_person not between", value1, value2, "tbpPerson");
            return (Criteria) this;
        }

        public Criteria andTbpConcatIsNull() {
            addCriterion("tbp_concat is null");
            return (Criteria) this;
        }

        public Criteria andTbpConcatIsNotNull() {
            addCriterion("tbp_concat is not null");
            return (Criteria) this;
        }

        public Criteria andTbpConcatEqualTo(String value) {
            addCriterion("tbp_concat =", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatNotEqualTo(String value) {
            addCriterion("tbp_concat <>", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatGreaterThan(String value) {
            addCriterion("tbp_concat >", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_concat >=", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatLessThan(String value) {
            addCriterion("tbp_concat <", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatLessThanOrEqualTo(String value) {
            addCriterion("tbp_concat <=", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatLike(String value) {
            addCriterion("tbp_concat like", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatNotLike(String value) {
            addCriterion("tbp_concat not like", value, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatIn(List<String> values) {
            addCriterion("tbp_concat in", values, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatNotIn(List<String> values) {
            addCriterion("tbp_concat not in", values, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatBetween(String value1, String value2) {
            addCriterion("tbp_concat between", value1, value2, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpConcatNotBetween(String value1, String value2) {
            addCriterion("tbp_concat not between", value1, value2, "tbpConcat");
            return (Criteria) this;
        }

        public Criteria andTbpFlagIsNull() {
            addCriterion("tbp_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbpFlagIsNotNull() {
            addCriterion("tbp_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbpFlagEqualTo(String value) {
            addCriterion("tbp_flag =", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagNotEqualTo(String value) {
            addCriterion("tbp_flag <>", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagGreaterThan(String value) {
            addCriterion("tbp_flag >", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_flag >=", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagLessThan(String value) {
            addCriterion("tbp_flag <", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagLessThanOrEqualTo(String value) {
            addCriterion("tbp_flag <=", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagLike(String value) {
            addCriterion("tbp_flag like", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagNotLike(String value) {
            addCriterion("tbp_flag not like", value, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagIn(List<String> values) {
            addCriterion("tbp_flag in", values, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagNotIn(List<String> values) {
            addCriterion("tbp_flag not in", values, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagBetween(String value1, String value2) {
            addCriterion("tbp_flag between", value1, value2, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpFlagNotBetween(String value1, String value2) {
            addCriterion("tbp_flag not between", value1, value2, "tbpFlag");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkIsNull() {
            addCriterion("tbp_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkIsNotNull() {
            addCriterion("tbp_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkEqualTo(String value) {
            addCriterion("tbp_remark =", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotEqualTo(String value) {
            addCriterion("tbp_remark <>", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkGreaterThan(String value) {
            addCriterion("tbp_remark >", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_remark >=", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkLessThan(String value) {
            addCriterion("tbp_remark <", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbp_remark <=", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkLike(String value) {
            addCriterion("tbp_remark like", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotLike(String value) {
            addCriterion("tbp_remark not like", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkIn(List<String> values) {
            addCriterion("tbp_remark in", values, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotIn(List<String> values) {
            addCriterion("tbp_remark not in", values, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkBetween(String value1, String value2) {
            addCriterion("tbp_remark between", value1, value2, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotBetween(String value1, String value2) {
            addCriterion("tbp_remark not between", value1, value2, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIsNull() {
            addCriterion("tbp_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIsNotNull() {
            addCriterion("tbp_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeEqualTo(Date value) {
            addCriterion("tbp_update_time =", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbp_update_time <>", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeGreaterThan(Date value) {
            addCriterion("tbp_update_time >", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_update_time >=", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeLessThan(Date value) {
            addCriterion("tbp_update_time <", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_update_time <=", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIn(List<Date> values) {
            addCriterion("tbp_update_time in", values, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbp_update_time not in", values, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_update_time between", value1, value2, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_update_time not between", value1, value2, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIsNull() {
            addCriterion("tbp_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIsNotNull() {
            addCriterion("tbp_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeEqualTo(Date value) {
            addCriterion("tbp_add_time =", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotEqualTo(Date value) {
            addCriterion("tbp_add_time <>", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeGreaterThan(Date value) {
            addCriterion("tbp_add_time >", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_add_time >=", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeLessThan(Date value) {
            addCriterion("tbp_add_time <", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_add_time <=", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIn(List<Date> values) {
            addCriterion("tbp_add_time in", values, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotIn(List<Date> values) {
            addCriterion("tbp_add_time not in", values, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_add_time between", value1, value2, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_add_time not between", value1, value2, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIsNull() {
            addCriterion("tbp_status is null");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIsNotNull() {
            addCriterion("tbp_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbpStatusEqualTo(Short value) {
            addCriterion("tbp_status =", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotEqualTo(Short value) {
            addCriterion("tbp_status <>", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusGreaterThan(Short value) {
            addCriterion("tbp_status >", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbp_status >=", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusLessThan(Short value) {
            addCriterion("tbp_status <", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbp_status <=", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIn(List<Short> values) {
            addCriterion("tbp_status in", values, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotIn(List<Short> values) {
            addCriterion("tbp_status not in", values, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusBetween(Short value1, Short value2) {
            addCriterion("tbp_status between", value1, value2, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbp_status not between", value1, value2, "tbpStatus");
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