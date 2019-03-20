package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperOrderExample() {
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

        public Criteria andTbooIdIsNull() {
            addCriterion("tboo_id is null");
            return (Criteria) this;
        }

        public Criteria andTbooIdIsNotNull() {
            addCriterion("tboo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbooIdEqualTo(Long value) {
            addCriterion("tboo_id =", value, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdNotEqualTo(Long value) {
            addCriterion("tboo_id <>", value, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdGreaterThan(Long value) {
            addCriterion("tboo_id >", value, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_id >=", value, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdLessThan(Long value) {
            addCriterion("tboo_id <", value, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdLessThanOrEqualTo(Long value) {
            addCriterion("tboo_id <=", value, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdIn(List<Long> values) {
            addCriterion("tboo_id in", values, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdNotIn(List<Long> values) {
            addCriterion("tboo_id not in", values, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdBetween(Long value1, Long value2) {
            addCriterion("tboo_id between", value1, value2, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooIdNotBetween(Long value1, Long value2) {
            addCriterion("tboo_id not between", value1, value2, "tbooId");
            return (Criteria) this;
        }

        public Criteria andTbooHostIsNull() {
            addCriterion("tboo_host is null");
            return (Criteria) this;
        }

        public Criteria andTbooHostIsNotNull() {
            addCriterion("tboo_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbooHostEqualTo(Long value) {
            addCriterion("tboo_host =", value, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostNotEqualTo(Long value) {
            addCriterion("tboo_host <>", value, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostGreaterThan(Long value) {
            addCriterion("tboo_host >", value, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_host >=", value, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostLessThan(Long value) {
            addCriterion("tboo_host <", value, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostLessThanOrEqualTo(Long value) {
            addCriterion("tboo_host <=", value, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostIn(List<Long> values) {
            addCriterion("tboo_host in", values, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostNotIn(List<Long> values) {
            addCriterion("tboo_host not in", values, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostBetween(Long value1, Long value2) {
            addCriterion("tboo_host between", value1, value2, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooHostNotBetween(Long value1, Long value2) {
            addCriterion("tboo_host not between", value1, value2, "tbooHost");
            return (Criteria) this;
        }

        public Criteria andTbooUserIsNull() {
            addCriterion("tboo_user is null");
            return (Criteria) this;
        }

        public Criteria andTbooUserIsNotNull() {
            addCriterion("tboo_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbooUserEqualTo(Long value) {
            addCriterion("tboo_user =", value, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserNotEqualTo(Long value) {
            addCriterion("tboo_user <>", value, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserGreaterThan(Long value) {
            addCriterion("tboo_user >", value, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_user >=", value, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserLessThan(Long value) {
            addCriterion("tboo_user <", value, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserLessThanOrEqualTo(Long value) {
            addCriterion("tboo_user <=", value, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserIn(List<Long> values) {
            addCriterion("tboo_user in", values, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserNotIn(List<Long> values) {
            addCriterion("tboo_user not in", values, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserBetween(Long value1, Long value2) {
            addCriterion("tboo_user between", value1, value2, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooUserNotBetween(Long value1, Long value2) {
            addCriterion("tboo_user not between", value1, value2, "tbooUser");
            return (Criteria) this;
        }

        public Criteria andTbooAreaIsNull() {
            addCriterion("tboo_area is null");
            return (Criteria) this;
        }

        public Criteria andTbooAreaIsNotNull() {
            addCriterion("tboo_area is not null");
            return (Criteria) this;
        }

        public Criteria andTbooAreaEqualTo(Long value) {
            addCriterion("tboo_area =", value, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaNotEqualTo(Long value) {
            addCriterion("tboo_area <>", value, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaGreaterThan(Long value) {
            addCriterion("tboo_area >", value, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_area >=", value, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaLessThan(Long value) {
            addCriterion("tboo_area <", value, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaLessThanOrEqualTo(Long value) {
            addCriterion("tboo_area <=", value, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaIn(List<Long> values) {
            addCriterion("tboo_area in", values, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaNotIn(List<Long> values) {
            addCriterion("tboo_area not in", values, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaBetween(Long value1, Long value2) {
            addCriterion("tboo_area between", value1, value2, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooAreaNotBetween(Long value1, Long value2) {
            addCriterion("tboo_area not between", value1, value2, "tbooArea");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromIsNull() {
            addCriterion("tboo_outlets_from is null");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromIsNotNull() {
            addCriterion("tboo_outlets_from is not null");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromEqualTo(Long value) {
            addCriterion("tboo_outlets_from =", value, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromNotEqualTo(Long value) {
            addCriterion("tboo_outlets_from <>", value, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromGreaterThan(Long value) {
            addCriterion("tboo_outlets_from >", value, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_outlets_from >=", value, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromLessThan(Long value) {
            addCriterion("tboo_outlets_from <", value, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromLessThanOrEqualTo(Long value) {
            addCriterion("tboo_outlets_from <=", value, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromIn(List<Long> values) {
            addCriterion("tboo_outlets_from in", values, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromNotIn(List<Long> values) {
            addCriterion("tboo_outlets_from not in", values, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromBetween(Long value1, Long value2) {
            addCriterion("tboo_outlets_from between", value1, value2, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsFromNotBetween(Long value1, Long value2) {
            addCriterion("tboo_outlets_from not between", value1, value2, "tbooOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToIsNull() {
            addCriterion("tboo_outlets_to is null");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToIsNotNull() {
            addCriterion("tboo_outlets_to is not null");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToEqualTo(Long value) {
            addCriterion("tboo_outlets_to =", value, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToNotEqualTo(Long value) {
            addCriterion("tboo_outlets_to <>", value, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToGreaterThan(Long value) {
            addCriterion("tboo_outlets_to >", value, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_outlets_to >=", value, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToLessThan(Long value) {
            addCriterion("tboo_outlets_to <", value, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToLessThanOrEqualTo(Long value) {
            addCriterion("tboo_outlets_to <=", value, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToIn(List<Long> values) {
            addCriterion("tboo_outlets_to in", values, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToNotIn(List<Long> values) {
            addCriterion("tboo_outlets_to not in", values, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToBetween(Long value1, Long value2) {
            addCriterion("tboo_outlets_to between", value1, value2, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooOutletsToNotBetween(Long value1, Long value2) {
            addCriterion("tboo_outlets_to not between", value1, value2, "tbooOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbooCarIsNull() {
            addCriterion("tboo_car is null");
            return (Criteria) this;
        }

        public Criteria andTbooCarIsNotNull() {
            addCriterion("tboo_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbooCarEqualTo(Long value) {
            addCriterion("tboo_car =", value, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarNotEqualTo(Long value) {
            addCriterion("tboo_car <>", value, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarGreaterThan(Long value) {
            addCriterion("tboo_car >", value, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_car >=", value, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarLessThan(Long value) {
            addCriterion("tboo_car <", value, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarLessThanOrEqualTo(Long value) {
            addCriterion("tboo_car <=", value, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarIn(List<Long> values) {
            addCriterion("tboo_car in", values, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarNotIn(List<Long> values) {
            addCriterion("tboo_car not in", values, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarBetween(Long value1, Long value2) {
            addCriterion("tboo_car between", value1, value2, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooCarNotBetween(Long value1, Long value2) {
            addCriterion("tboo_car not between", value1, value2, "tbooCar");
            return (Criteria) this;
        }

        public Criteria andTbooTypeIsNull() {
            addCriterion("tboo_type is null");
            return (Criteria) this;
        }

        public Criteria andTbooTypeIsNotNull() {
            addCriterion("tboo_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbooTypeEqualTo(Short value) {
            addCriterion("tboo_type =", value, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeNotEqualTo(Short value) {
            addCriterion("tboo_type <>", value, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeGreaterThan(Short value) {
            addCriterion("tboo_type >", value, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tboo_type >=", value, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeLessThan(Short value) {
            addCriterion("tboo_type <", value, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeLessThanOrEqualTo(Short value) {
            addCriterion("tboo_type <=", value, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeIn(List<Short> values) {
            addCriterion("tboo_type in", values, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeNotIn(List<Short> values) {
            addCriterion("tboo_type not in", values, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeBetween(Short value1, Short value2) {
            addCriterion("tboo_type between", value1, value2, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooTypeNotBetween(Short value1, Short value2) {
            addCriterion("tboo_type not between", value1, value2, "tbooType");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeIsNull() {
            addCriterion("tboo_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeIsNotNull() {
            addCriterion("tboo_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeEqualTo(Date value) {
            addCriterion("tboo_start_time =", value, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeNotEqualTo(Date value) {
            addCriterion("tboo_start_time <>", value, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeGreaterThan(Date value) {
            addCriterion("tboo_start_time >", value, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_start_time >=", value, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeLessThan(Date value) {
            addCriterion("tboo_start_time <", value, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_start_time <=", value, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeIn(List<Date> values) {
            addCriterion("tboo_start_time in", values, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeNotIn(List<Date> values) {
            addCriterion("tboo_start_time not in", values, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_start_time between", value1, value2, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_start_time not between", value1, value2, "tbooStartTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeIsNull() {
            addCriterion("tboo_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeIsNotNull() {
            addCriterion("tboo_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeEqualTo(Date value) {
            addCriterion("tboo_finish_time =", value, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeNotEqualTo(Date value) {
            addCriterion("tboo_finish_time <>", value, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeGreaterThan(Date value) {
            addCriterion("tboo_finish_time >", value, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_finish_time >=", value, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeLessThan(Date value) {
            addCriterion("tboo_finish_time <", value, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_finish_time <=", value, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeIn(List<Date> values) {
            addCriterion("tboo_finish_time in", values, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeNotIn(List<Date> values) {
            addCriterion("tboo_finish_time not in", values, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_finish_time between", value1, value2, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_finish_time not between", value1, value2, "tbooFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeIsNull() {
            addCriterion("tboo_take_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeIsNotNull() {
            addCriterion("tboo_take_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeEqualTo(Date value) {
            addCriterion("tboo_take_time =", value, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeNotEqualTo(Date value) {
            addCriterion("tboo_take_time <>", value, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeGreaterThan(Date value) {
            addCriterion("tboo_take_time >", value, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_take_time >=", value, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeLessThan(Date value) {
            addCriterion("tboo_take_time <", value, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_take_time <=", value, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeIn(List<Date> values) {
            addCriterion("tboo_take_time in", values, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeNotIn(List<Date> values) {
            addCriterion("tboo_take_time not in", values, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_take_time between", value1, value2, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooTakeTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_take_time not between", value1, value2, "tbooTakeTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeIsNull() {
            addCriterion("tboo_ret_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeIsNotNull() {
            addCriterion("tboo_ret_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeEqualTo(Date value) {
            addCriterion("tboo_ret_time =", value, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeNotEqualTo(Date value) {
            addCriterion("tboo_ret_time <>", value, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeGreaterThan(Date value) {
            addCriterion("tboo_ret_time >", value, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_ret_time >=", value, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeLessThan(Date value) {
            addCriterion("tboo_ret_time <", value, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_ret_time <=", value, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeIn(List<Date> values) {
            addCriterion("tboo_ret_time in", values, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeNotIn(List<Date> values) {
            addCriterion("tboo_ret_time not in", values, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_ret_time between", value1, value2, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooRetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_ret_time not between", value1, value2, "tbooRetTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeIsNull() {
            addCriterion("tboo_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeIsNotNull() {
            addCriterion("tboo_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeEqualTo(Date value) {
            addCriterion("tboo_begin_time =", value, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeNotEqualTo(Date value) {
            addCriterion("tboo_begin_time <>", value, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeGreaterThan(Date value) {
            addCriterion("tboo_begin_time >", value, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_begin_time >=", value, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeLessThan(Date value) {
            addCriterion("tboo_begin_time <", value, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_begin_time <=", value, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeIn(List<Date> values) {
            addCriterion("tboo_begin_time in", values, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeNotIn(List<Date> values) {
            addCriterion("tboo_begin_time not in", values, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_begin_time between", value1, value2, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_begin_time not between", value1, value2, "tbooBeginTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeIsNull() {
            addCriterion("tboo_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeIsNotNull() {
            addCriterion("tboo_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeEqualTo(Date value) {
            addCriterion("tboo_end_time =", value, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeNotEqualTo(Date value) {
            addCriterion("tboo_end_time <>", value, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeGreaterThan(Date value) {
            addCriterion("tboo_end_time >", value, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_end_time >=", value, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeLessThan(Date value) {
            addCriterion("tboo_end_time <", value, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_end_time <=", value, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeIn(List<Date> values) {
            addCriterion("tboo_end_time in", values, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeNotIn(List<Date> values) {
            addCriterion("tboo_end_time not in", values, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_end_time between", value1, value2, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_end_time not between", value1, value2, "tbooEndTime");
            return (Criteria) this;
        }

        public Criteria andTbooDurationIsNull() {
            addCriterion("tboo_duration is null");
            return (Criteria) this;
        }

        public Criteria andTbooDurationIsNotNull() {
            addCriterion("tboo_duration is not null");
            return (Criteria) this;
        }

        public Criteria andTbooDurationEqualTo(Double value) {
            addCriterion("tboo_duration =", value, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationNotEqualTo(Double value) {
            addCriterion("tboo_duration <>", value, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationGreaterThan(Double value) {
            addCriterion("tboo_duration >", value, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("tboo_duration >=", value, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationLessThan(Double value) {
            addCriterion("tboo_duration <", value, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationLessThanOrEqualTo(Double value) {
            addCriterion("tboo_duration <=", value, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationIn(List<Double> values) {
            addCriterion("tboo_duration in", values, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationNotIn(List<Double> values) {
            addCriterion("tboo_duration not in", values, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationBetween(Double value1, Double value2) {
            addCriterion("tboo_duration between", value1, value2, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooDurationNotBetween(Double value1, Double value2) {
            addCriterion("tboo_duration not between", value1, value2, "tbooDuration");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeIsNull() {
            addCriterion("tboo_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeIsNotNull() {
            addCriterion("tboo_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeEqualTo(Date value) {
            addCriterion("tboo_update_time =", value, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeNotEqualTo(Date value) {
            addCriterion("tboo_update_time <>", value, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeGreaterThan(Date value) {
            addCriterion("tboo_update_time >", value, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_update_time >=", value, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeLessThan(Date value) {
            addCriterion("tboo_update_time <", value, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_update_time <=", value, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeIn(List<Date> values) {
            addCriterion("tboo_update_time in", values, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeNotIn(List<Date> values) {
            addCriterion("tboo_update_time not in", values, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_update_time between", value1, value2, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_update_time not between", value1, value2, "tbooUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeIsNull() {
            addCriterion("tboo_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeIsNotNull() {
            addCriterion("tboo_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeEqualTo(Date value) {
            addCriterion("tboo_add_time =", value, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeNotEqualTo(Date value) {
            addCriterion("tboo_add_time <>", value, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeGreaterThan(Date value) {
            addCriterion("tboo_add_time >", value, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboo_add_time >=", value, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeLessThan(Date value) {
            addCriterion("tboo_add_time <", value, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboo_add_time <=", value, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeIn(List<Date> values) {
            addCriterion("tboo_add_time in", values, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeNotIn(List<Date> values) {
            addCriterion("tboo_add_time not in", values, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeBetween(Date value1, Date value2) {
            addCriterion("tboo_add_time between", value1, value2, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboo_add_time not between", value1, value2, "tbooAddTime");
            return (Criteria) this;
        }

        public Criteria andTbooCodeIsNull() {
            addCriterion("tboo_code is null");
            return (Criteria) this;
        }

        public Criteria andTbooCodeIsNotNull() {
            addCriterion("tboo_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbooCodeEqualTo(String value) {
            addCriterion("tboo_code =", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeNotEqualTo(String value) {
            addCriterion("tboo_code <>", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeGreaterThan(String value) {
            addCriterion("tboo_code >", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tboo_code >=", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeLessThan(String value) {
            addCriterion("tboo_code <", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeLessThanOrEqualTo(String value) {
            addCriterion("tboo_code <=", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeLike(String value) {
            addCriterion("tboo_code like", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeNotLike(String value) {
            addCriterion("tboo_code not like", value, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeIn(List<String> values) {
            addCriterion("tboo_code in", values, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeNotIn(List<String> values) {
            addCriterion("tboo_code not in", values, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeBetween(String value1, String value2) {
            addCriterion("tboo_code between", value1, value2, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooCodeNotBetween(String value1, String value2) {
            addCriterion("tboo_code not between", value1, value2, "tbooCode");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkIsNull() {
            addCriterion("tboo_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkIsNotNull() {
            addCriterion("tboo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkEqualTo(String value) {
            addCriterion("tboo_remark =", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkNotEqualTo(String value) {
            addCriterion("tboo_remark <>", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkGreaterThan(String value) {
            addCriterion("tboo_remark >", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tboo_remark >=", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkLessThan(String value) {
            addCriterion("tboo_remark <", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkLessThanOrEqualTo(String value) {
            addCriterion("tboo_remark <=", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkLike(String value) {
            addCriterion("tboo_remark like", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkNotLike(String value) {
            addCriterion("tboo_remark not like", value, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkIn(List<String> values) {
            addCriterion("tboo_remark in", values, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkNotIn(List<String> values) {
            addCriterion("tboo_remark not in", values, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkBetween(String value1, String value2) {
            addCriterion("tboo_remark between", value1, value2, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooRemarkNotBetween(String value1, String value2) {
            addCriterion("tboo_remark not between", value1, value2, "tbooRemark");
            return (Criteria) this;
        }

        public Criteria andTbooLogIsNull() {
            addCriterion("tboo_log is null");
            return (Criteria) this;
        }

        public Criteria andTbooLogIsNotNull() {
            addCriterion("tboo_log is not null");
            return (Criteria) this;
        }

        public Criteria andTbooLogEqualTo(String value) {
            addCriterion("tboo_log =", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogNotEqualTo(String value) {
            addCriterion("tboo_log <>", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogGreaterThan(String value) {
            addCriterion("tboo_log >", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogGreaterThanOrEqualTo(String value) {
            addCriterion("tboo_log >=", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogLessThan(String value) {
            addCriterion("tboo_log <", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogLessThanOrEqualTo(String value) {
            addCriterion("tboo_log <=", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogLike(String value) {
            addCriterion("tboo_log like", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogNotLike(String value) {
            addCriterion("tboo_log not like", value, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogIn(List<String> values) {
            addCriterion("tboo_log in", values, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogNotIn(List<String> values) {
            addCriterion("tboo_log not in", values, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogBetween(String value1, String value2) {
            addCriterion("tboo_log between", value1, value2, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooLogNotBetween(String value1, String value2) {
            addCriterion("tboo_log not between", value1, value2, "tbooLog");
            return (Criteria) this;
        }

        public Criteria andTbooEditorIsNull() {
            addCriterion("tboo_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbooEditorIsNotNull() {
            addCriterion("tboo_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbooEditorEqualTo(Long value) {
            addCriterion("tboo_editor =", value, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorNotEqualTo(Long value) {
            addCriterion("tboo_editor <>", value, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorGreaterThan(Long value) {
            addCriterion("tboo_editor >", value, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("tboo_editor >=", value, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorLessThan(Long value) {
            addCriterion("tboo_editor <", value, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorLessThanOrEqualTo(Long value) {
            addCriterion("tboo_editor <=", value, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorIn(List<Long> values) {
            addCriterion("tboo_editor in", values, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorNotIn(List<Long> values) {
            addCriterion("tboo_editor not in", values, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorBetween(Long value1, Long value2) {
            addCriterion("tboo_editor between", value1, value2, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooEditorNotBetween(Long value1, Long value2) {
            addCriterion("tboo_editor not between", value1, value2, "tbooEditor");
            return (Criteria) this;
        }

        public Criteria andTbooStateIsNull() {
            addCriterion("tboo_state is null");
            return (Criteria) this;
        }

        public Criteria andTbooStateIsNotNull() {
            addCriterion("tboo_state is not null");
            return (Criteria) this;
        }

        public Criteria andTbooStateEqualTo(Short value) {
            addCriterion("tboo_state =", value, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateNotEqualTo(Short value) {
            addCriterion("tboo_state <>", value, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateGreaterThan(Short value) {
            addCriterion("tboo_state >", value, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateGreaterThanOrEqualTo(Short value) {
            addCriterion("tboo_state >=", value, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateLessThan(Short value) {
            addCriterion("tboo_state <", value, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateLessThanOrEqualTo(Short value) {
            addCriterion("tboo_state <=", value, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateIn(List<Short> values) {
            addCriterion("tboo_state in", values, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateNotIn(List<Short> values) {
            addCriterion("tboo_state not in", values, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateBetween(Short value1, Short value2) {
            addCriterion("tboo_state between", value1, value2, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStateNotBetween(Short value1, Short value2) {
            addCriterion("tboo_state not between", value1, value2, "tbooState");
            return (Criteria) this;
        }

        public Criteria andTbooStatusIsNull() {
            addCriterion("tboo_status is null");
            return (Criteria) this;
        }

        public Criteria andTbooStatusIsNotNull() {
            addCriterion("tboo_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbooStatusEqualTo(Short value) {
            addCriterion("tboo_status =", value, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusNotEqualTo(Short value) {
            addCriterion("tboo_status <>", value, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusGreaterThan(Short value) {
            addCriterion("tboo_status >", value, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tboo_status >=", value, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusLessThan(Short value) {
            addCriterion("tboo_status <", value, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusLessThanOrEqualTo(Short value) {
            addCriterion("tboo_status <=", value, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusIn(List<Short> values) {
            addCriterion("tboo_status in", values, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusNotIn(List<Short> values) {
            addCriterion("tboo_status not in", values, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusBetween(Short value1, Short value2) {
            addCriterion("tboo_status between", value1, value2, "tbooStatus");
            return (Criteria) this;
        }

        public Criteria andTbooStatusNotBetween(Short value1, Short value2) {
            addCriterion("tboo_status not between", value1, value2, "tbooStatus");
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