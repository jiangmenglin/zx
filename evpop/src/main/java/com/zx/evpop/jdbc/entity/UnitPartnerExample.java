package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitPartnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitPartnerExample() {
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

        public Criteria andTbupIdEqualTo(Long value) {
            addCriterion("tbup_id =", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdNotEqualTo(Long value) {
            addCriterion("tbup_id <>", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdGreaterThan(Long value) {
            addCriterion("tbup_id >", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbup_id >=", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdLessThan(Long value) {
            addCriterion("tbup_id <", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdLessThanOrEqualTo(Long value) {
            addCriterion("tbup_id <=", value, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdIn(List<Long> values) {
            addCriterion("tbup_id in", values, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdNotIn(List<Long> values) {
            addCriterion("tbup_id not in", values, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdBetween(Long value1, Long value2) {
            addCriterion("tbup_id between", value1, value2, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupIdNotBetween(Long value1, Long value2) {
            addCriterion("tbup_id not between", value1, value2, "tbupId");
            return (Criteria) this;
        }

        public Criteria andTbupNameIsNull() {
            addCriterion("tbup_name is null");
            return (Criteria) this;
        }

        public Criteria andTbupNameIsNotNull() {
            addCriterion("tbup_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbupNameEqualTo(String value) {
            addCriterion("tbup_name =", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameNotEqualTo(String value) {
            addCriterion("tbup_name <>", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameGreaterThan(String value) {
            addCriterion("tbup_name >", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbup_name >=", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameLessThan(String value) {
            addCriterion("tbup_name <", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameLessThanOrEqualTo(String value) {
            addCriterion("tbup_name <=", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameLike(String value) {
            addCriterion("tbup_name like", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameNotLike(String value) {
            addCriterion("tbup_name not like", value, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameIn(List<String> values) {
            addCriterion("tbup_name in", values, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameNotIn(List<String> values) {
            addCriterion("tbup_name not in", values, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameBetween(String value1, String value2) {
            addCriterion("tbup_name between", value1, value2, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupNameNotBetween(String value1, String value2) {
            addCriterion("tbup_name not between", value1, value2, "tbupName");
            return (Criteria) this;
        }

        public Criteria andTbupAddressIsNull() {
            addCriterion("tbup_address is null");
            return (Criteria) this;
        }

        public Criteria andTbupAddressIsNotNull() {
            addCriterion("tbup_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbupAddressEqualTo(String value) {
            addCriterion("tbup_address =", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressNotEqualTo(String value) {
            addCriterion("tbup_address <>", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressGreaterThan(String value) {
            addCriterion("tbup_address >", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbup_address >=", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressLessThan(String value) {
            addCriterion("tbup_address <", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressLessThanOrEqualTo(String value) {
            addCriterion("tbup_address <=", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressLike(String value) {
            addCriterion("tbup_address like", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressNotLike(String value) {
            addCriterion("tbup_address not like", value, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressIn(List<String> values) {
            addCriterion("tbup_address in", values, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressNotIn(List<String> values) {
            addCriterion("tbup_address not in", values, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressBetween(String value1, String value2) {
            addCriterion("tbup_address between", value1, value2, "tbupAddress");
            return (Criteria) this;
        }

        public Criteria andTbupAddressNotBetween(String value1, String value2) {
            addCriterion("tbup_address not between", value1, value2, "tbupAddress");
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

        public Criteria andTbupHostEqualTo(Long value) {
            addCriterion("tbup_host =", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostNotEqualTo(Long value) {
            addCriterion("tbup_host <>", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostGreaterThan(Long value) {
            addCriterion("tbup_host >", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbup_host >=", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostLessThan(Long value) {
            addCriterion("tbup_host <", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostLessThanOrEqualTo(Long value) {
            addCriterion("tbup_host <=", value, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostIn(List<Long> values) {
            addCriterion("tbup_host in", values, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostNotIn(List<Long> values) {
            addCriterion("tbup_host not in", values, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostBetween(Long value1, Long value2) {
            addCriterion("tbup_host between", value1, value2, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupHostNotBetween(Long value1, Long value2) {
            addCriterion("tbup_host not between", value1, value2, "tbupHost");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureIsNull() {
            addCriterion("tbup_cooperate_nature is null");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureIsNotNull() {
            addCriterion("tbup_cooperate_nature is not null");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureEqualTo(Byte value) {
            addCriterion("tbup_cooperate_nature =", value, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureNotEqualTo(Byte value) {
            addCriterion("tbup_cooperate_nature <>", value, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureGreaterThan(Byte value) {
            addCriterion("tbup_cooperate_nature >", value, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbup_cooperate_nature >=", value, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureLessThan(Byte value) {
            addCriterion("tbup_cooperate_nature <", value, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureLessThanOrEqualTo(Byte value) {
            addCriterion("tbup_cooperate_nature <=", value, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureIn(List<Byte> values) {
            addCriterion("tbup_cooperate_nature in", values, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureNotIn(List<Byte> values) {
            addCriterion("tbup_cooperate_nature not in", values, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureBetween(Byte value1, Byte value2) {
            addCriterion("tbup_cooperate_nature between", value1, value2, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupCooperateNatureNotBetween(Byte value1, Byte value2) {
            addCriterion("tbup_cooperate_nature not between", value1, value2, "tbupCooperateNature");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdIsNull() {
            addCriterion("tbup_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdIsNotNull() {
            addCriterion("tbup_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdEqualTo(Long value) {
            addCriterion("tbup_parent_id =", value, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdNotEqualTo(Long value) {
            addCriterion("tbup_parent_id <>", value, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdGreaterThan(Long value) {
            addCriterion("tbup_parent_id >", value, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbup_parent_id >=", value, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdLessThan(Long value) {
            addCriterion("tbup_parent_id <", value, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdLessThanOrEqualTo(Long value) {
            addCriterion("tbup_parent_id <=", value, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdIn(List<Long> values) {
            addCriterion("tbup_parent_id in", values, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdNotIn(List<Long> values) {
            addCriterion("tbup_parent_id not in", values, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdBetween(Long value1, Long value2) {
            addCriterion("tbup_parent_id between", value1, value2, "tbupParentId");
            return (Criteria) this;
        }

        public Criteria andTbupParentIdNotBetween(Long value1, Long value2) {
            addCriterion("tbup_parent_id not between", value1, value2, "tbupParentId");
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

        public Criteria andTbupStatusEqualTo(Short value) {
            addCriterion("tbup_status =", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusNotEqualTo(Short value) {
            addCriterion("tbup_status <>", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusGreaterThan(Short value) {
            addCriterion("tbup_status >", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbup_status >=", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusLessThan(Short value) {
            addCriterion("tbup_status <", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbup_status <=", value, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusIn(List<Short> values) {
            addCriterion("tbup_status in", values, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusNotIn(List<Short> values) {
            addCriterion("tbup_status not in", values, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusBetween(Short value1, Short value2) {
            addCriterion("tbup_status between", value1, value2, "tbupStatus");
            return (Criteria) this;
        }

        public Criteria andTbupStatusNotBetween(Short value1, Short value2) {
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