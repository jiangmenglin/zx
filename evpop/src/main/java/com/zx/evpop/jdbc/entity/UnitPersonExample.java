package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitPersonExample() {
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

        public Criteria andTbupIdIsNull() {
            addCriterion("tbup_id is null");
            return (Criteria) this;
        }

        public Criteria andTbupIdIsNotNull() {
            addCriterion("tbup_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbupIdEqualTo(Integer value) {
            addCriterion("tbup_id =", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdNotEqualTo(Integer value) {
            addCriterion("tbup_id <>", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdGreaterThan(Integer value) {
            addCriterion("tbup_id >", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbup_id >=", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdLessThan(Integer value) {
            addCriterion("tbup_id <", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbup_id <=", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdIn(List<Integer> values) {
            addCriterion("tbup_id in", values, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdNotIn(List<Integer> values) {
            addCriterion("tbup_id not in", values, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdBetween(Integer value1, Integer value2) {
            addCriterion("tbup_id between", value1, value2, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbup_id not between", value1, value2, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupHostIsNull() {
            addCriterion("tbup_host is null");
            return (Criteria) this;
        }

        public Criteria andTbupHostIsNotNull() {
            addCriterion("tbup_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbupHostEqualTo(Short value) {
            addCriterion("tbup_host =", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostNotEqualTo(Short value) {
            addCriterion("tbup_host <>", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostGreaterThan(Short value) {
            addCriterion("tbup_host >", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbup_host >=", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostLessThan(Short value) {
            addCriterion("tbup_host <", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostLessThanOrEqualTo(Short value) {
            addCriterion("tbup_host <=", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostIn(List<Short> values) {
            addCriterion("tbup_host in", values, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostNotIn(List<Short> values) {
            addCriterion("tbup_host not in", values, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostBetween(Short value1, Short value2) {
            addCriterion("tbup_host between", value1, value2, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostNotBetween(Short value1, Short value2) {
            addCriterion("tbup_host not between", value1, value2, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupInfoIsNull() {
            addCriterion("tbup_info is null");
            return (Criteria) this;
        }

        public Criteria andTbupInfoIsNotNull() {
            addCriterion("tbup_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbupInfoEqualTo(Integer value) {
            addCriterion("tbup_info =", value, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoNotEqualTo(Integer value) {
            addCriterion("tbup_info <>", value, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoGreaterThan(Integer value) {
            addCriterion("tbup_info >", value, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbup_info >=", value, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoLessThan(Integer value) {
            addCriterion("tbup_info <", value, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoLessThanOrEqualTo(Integer value) {
            addCriterion("tbup_info <=", value, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoIn(List<Integer> values) {
            addCriterion("tbup_info in", values, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoNotIn(List<Integer> values) {
            addCriterion("tbup_info not in", values, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoBetween(Integer value1, Integer value2) {
            addCriterion("tbup_info between", value1, value2, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("tbup_info not between", value1, value2, "tbupInfo");
            return (Criteria) this;
        }

        public Criteria andTbupGroupIsNull() {
            addCriterion("tbup_group is null");
            return (Criteria) this;
        }

        public Criteria andTbupGroupIsNotNull() {
            addCriterion("tbup_group is not null");
            return (Criteria) this;
        }

        public Criteria andTbupGroupEqualTo(Long value) {
            addCriterion("tbup_group =", value, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupNotEqualTo(Long value) {
            addCriterion("tbup_group <>", value, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupGreaterThan(Long value) {
            addCriterion("tbup_group >", value, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("tbup_group >=", value, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupLessThan(Long value) {
            addCriterion("tbup_group <", value, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupLessThanOrEqualTo(Long value) {
            addCriterion("tbup_group <=", value, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupIn(List<Long> values) {
            addCriterion("tbup_group in", values, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupNotIn(List<Long> values) {
            addCriterion("tbup_group not in", values, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupBetween(Long value1, Long value2) {
            addCriterion("tbup_group between", value1, value2, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupGroupNotBetween(Long value1, Long value2) {
            addCriterion("tbup_group not between", value1, value2, "tbupGroup");
            return (Criteria) this;
        }

        public Criteria andTbupMemberIsNull() {
            addCriterion("tbup_member is null");
            return (Criteria) this;
        }

        public Criteria andTbupMemberIsNotNull() {
            addCriterion("tbup_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbupMemberEqualTo(Integer value) {
            addCriterion("tbup_member =", value, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberNotEqualTo(Integer value) {
            addCriterion("tbup_member <>", value, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberGreaterThan(Integer value) {
            addCriterion("tbup_member >", value, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbup_member >=", value, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberLessThan(Integer value) {
            addCriterion("tbup_member <", value, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbup_member <=", value, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberIn(List<Integer> values) {
            addCriterion("tbup_member in", values, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberNotIn(List<Integer> values) {
            addCriterion("tbup_member not in", values, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbup_member between", value1, value2, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbup_member not between", value1, value2, "tbupMember");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaIsNull() {
            addCriterion("tbup_quota is null");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaIsNotNull() {
            addCriterion("tbup_quota is not null");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaEqualTo(BigDecimal value) {
            addCriterion("tbup_quota =", value, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaNotEqualTo(BigDecimal value) {
            addCriterion("tbup_quota <>", value, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaGreaterThan(BigDecimal value) {
            addCriterion("tbup_quota >", value, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbup_quota >=", value, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaLessThan(BigDecimal value) {
            addCriterion("tbup_quota <", value, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbup_quota <=", value, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaIn(List<BigDecimal> values) {
            addCriterion("tbup_quota in", values, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaNotIn(List<BigDecimal> values) {
            addCriterion("tbup_quota not in", values, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbup_quota between", value1, value2, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupQuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbup_quota not between", value1, value2, "tbupQuota");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeIsNull() {
            addCriterion("tbup_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeIsNotNull() {
            addCriterion("tbup_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeEqualTo(Date value) {
            addCriterion("tbup_update_time =", value, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbup_update_time <>", value, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeGreaterThan(Date value) {
            addCriterion("tbup_update_time >", value, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbup_update_time >=", value, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeLessThan(Date value) {
            addCriterion("tbup_update_time <", value, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbup_update_time <=", value, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeIn(List<Date> values) {
            addCriterion("tbup_update_time in", values, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbup_update_time not in", values, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbup_update_time between", value1, value2, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbup_update_time not between", value1, value2, "tbupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeIsNull() {
            addCriterion("tbup_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeIsNotNull() {
            addCriterion("tbup_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeEqualTo(Date value) {
            addCriterion("tbup_add_time =", value, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeNotEqualTo(Date value) {
            addCriterion("tbup_add_time <>", value, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeGreaterThan(Date value) {
            addCriterion("tbup_add_time >", value, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbup_add_time >=", value, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeLessThan(Date value) {
            addCriterion("tbup_add_time <", value, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbup_add_time <=", value, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeIn(List<Date> values) {
            addCriterion("tbup_add_time in", values, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeNotIn(List<Date> values) {
            addCriterion("tbup_add_time not in", values, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbup_add_time between", value1, value2, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbup_add_time not between", value1, value2, "tbupAddTime");
            return (Criteria) this;
        }

        public Criteria andTbupStatusIsNull() {
            addCriterion("tbup_status is null");
            return (Criteria) this;
        }

        public Criteria andTbupStatusIsNotNull() {
            addCriterion("tbup_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbupStatusEqualTo(Byte value) {
            addCriterion("tbup_status =", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusNotEqualTo(Byte value) {
            addCriterion("tbup_status <>", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusGreaterThan(Byte value) {
            addCriterion("tbup_status >", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbup_status >=", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusLessThan(Byte value) {
            addCriterion("tbup_status <", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbup_status <=", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusIn(List<Byte> values) {
            addCriterion("tbup_status in", values, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusNotIn(List<Byte> values) {
            addCriterion("tbup_status not in", values, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbup_status between", value1, value2, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbup_status not between", value1, value2, "tbupStatus");
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