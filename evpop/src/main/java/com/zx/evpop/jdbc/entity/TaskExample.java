package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTbtIdIsNull() {
            addCriterion("tbt_id is null");
            return (Criteria) this;
        }

        public Criteria andTbtIdIsNotNull() {
            addCriterion("tbt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbtIdEqualTo(Long value) {
            addCriterion("tbt_id =", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdNotEqualTo(Long value) {
            addCriterion("tbt_id <>", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdGreaterThan(Long value) {
            addCriterion("tbt_id >", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_id >=", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdLessThan(Long value) {
            addCriterion("tbt_id <", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdLessThanOrEqualTo(Long value) {
            addCriterion("tbt_id <=", value, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdIn(List<Long> values) {
            addCriterion("tbt_id in", values, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdNotIn(List<Long> values) {
            addCriterion("tbt_id not in", values, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdBetween(Long value1, Long value2) {
            addCriterion("tbt_id between", value1, value2, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtIdNotBetween(Long value1, Long value2) {
            addCriterion("tbt_id not between", value1, value2, "tbtId");
            return (Criteria) this;
        }

        public Criteria andTbtHostIsNull() {
            addCriterion("tbt_host is null");
            return (Criteria) this;
        }

        public Criteria andTbtHostIsNotNull() {
            addCriterion("tbt_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbtHostEqualTo(Long value) {
            addCriterion("tbt_host =", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostNotEqualTo(Long value) {
            addCriterion("tbt_host <>", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostGreaterThan(Long value) {
            addCriterion("tbt_host >", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_host >=", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostLessThan(Long value) {
            addCriterion("tbt_host <", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostLessThanOrEqualTo(Long value) {
            addCriterion("tbt_host <=", value, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostIn(List<Long> values) {
            addCriterion("tbt_host in", values, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostNotIn(List<Long> values) {
            addCriterion("tbt_host not in", values, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostBetween(Long value1, Long value2) {
            addCriterion("tbt_host between", value1, value2, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtHostNotBetween(Long value1, Long value2) {
            addCriterion("tbt_host not between", value1, value2, "tbtHost");
            return (Criteria) this;
        }

        public Criteria andTbtTypeIsNull() {
            addCriterion("tbt_type is null");
            return (Criteria) this;
        }

        public Criteria andTbtTypeIsNotNull() {
            addCriterion("tbt_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbtTypeEqualTo(Byte value) {
            addCriterion("tbt_type =", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeNotEqualTo(Byte value) {
            addCriterion("tbt_type <>", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeGreaterThan(Byte value) {
            addCriterion("tbt_type >", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_type >=", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeLessThan(Byte value) {
            addCriterion("tbt_type <", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_type <=", value, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeIn(List<Byte> values) {
            addCriterion("tbt_type in", values, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeNotIn(List<Byte> values) {
            addCriterion("tbt_type not in", values, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbt_type between", value1, value2, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_type not between", value1, value2, "tbtType");
            return (Criteria) this;
        }

        public Criteria andTbtCarIsNull() {
            addCriterion("tbt_car is null");
            return (Criteria) this;
        }

        public Criteria andTbtCarIsNotNull() {
            addCriterion("tbt_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbtCarEqualTo(Long value) {
            addCriterion("tbt_car =", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarNotEqualTo(Long value) {
            addCriterion("tbt_car <>", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarGreaterThan(Long value) {
            addCriterion("tbt_car >", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_car >=", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarLessThan(Long value) {
            addCriterion("tbt_car <", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarLessThanOrEqualTo(Long value) {
            addCriterion("tbt_car <=", value, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarIn(List<Long> values) {
            addCriterion("tbt_car in", values, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarNotIn(List<Long> values) {
            addCriterion("tbt_car not in", values, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarBetween(Long value1, Long value2) {
            addCriterion("tbt_car between", value1, value2, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtCarNotBetween(Long value1, Long value2) {
            addCriterion("tbt_car not between", value1, value2, "tbtCar");
            return (Criteria) this;
        }

        public Criteria andTbtUserIsNull() {
            addCriterion("tbt_user is null");
            return (Criteria) this;
        }

        public Criteria andTbtUserIsNotNull() {
            addCriterion("tbt_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbtUserEqualTo(Integer value) {
            addCriterion("tbt_user =", value, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserNotEqualTo(Integer value) {
            addCriterion("tbt_user <>", value, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserGreaterThan(Integer value) {
            addCriterion("tbt_user >", value, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbt_user >=", value, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserLessThan(Integer value) {
            addCriterion("tbt_user <", value, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserLessThanOrEqualTo(Integer value) {
            addCriterion("tbt_user <=", value, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserIn(List<Integer> values) {
            addCriterion("tbt_user in", values, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserNotIn(List<Integer> values) {
            addCriterion("tbt_user not in", values, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserBetween(Integer value1, Integer value2) {
            addCriterion("tbt_user between", value1, value2, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtUserNotBetween(Integer value1, Integer value2) {
            addCriterion("tbt_user not between", value1, value2, "tbtUser");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskIsNull() {
            addCriterion("tbt_area_task is null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskIsNotNull() {
            addCriterion("tbt_area_task is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskEqualTo(Long value) {
            addCriterion("tbt_area_task =", value, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskNotEqualTo(Long value) {
            addCriterion("tbt_area_task <>", value, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskGreaterThan(Long value) {
            addCriterion("tbt_area_task >", value, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_area_task >=", value, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskLessThan(Long value) {
            addCriterion("tbt_area_task <", value, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskLessThanOrEqualTo(Long value) {
            addCriterion("tbt_area_task <=", value, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskIn(List<Long> values) {
            addCriterion("tbt_area_task in", values, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskNotIn(List<Long> values) {
            addCriterion("tbt_area_task not in", values, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskBetween(Long value1, Long value2) {
            addCriterion("tbt_area_task between", value1, value2, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaTaskNotBetween(Long value1, Long value2) {
            addCriterion("tbt_area_task not between", value1, value2, "tbtAreaTask");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromIsNull() {
            addCriterion("tbt_area_from is null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromIsNotNull() {
            addCriterion("tbt_area_from is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromEqualTo(Long value) {
            addCriterion("tbt_area_from =", value, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromNotEqualTo(Long value) {
            addCriterion("tbt_area_from <>", value, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromGreaterThan(Long value) {
            addCriterion("tbt_area_from >", value, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_area_from >=", value, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromLessThan(Long value) {
            addCriterion("tbt_area_from <", value, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromLessThanOrEqualTo(Long value) {
            addCriterion("tbt_area_from <=", value, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromIn(List<Long> values) {
            addCriterion("tbt_area_from in", values, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromNotIn(List<Long> values) {
            addCriterion("tbt_area_from not in", values, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromBetween(Long value1, Long value2) {
            addCriterion("tbt_area_from between", value1, value2, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaFromNotBetween(Long value1, Long value2) {
            addCriterion("tbt_area_from not between", value1, value2, "tbtAreaFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromIsNull() {
            addCriterion("tbt_outlets_from is null");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromIsNotNull() {
            addCriterion("tbt_outlets_from is not null");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromEqualTo(Long value) {
            addCriterion("tbt_outlets_from =", value, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromNotEqualTo(Long value) {
            addCriterion("tbt_outlets_from <>", value, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromGreaterThan(Long value) {
            addCriterion("tbt_outlets_from >", value, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_outlets_from >=", value, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromLessThan(Long value) {
            addCriterion("tbt_outlets_from <", value, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromLessThanOrEqualTo(Long value) {
            addCriterion("tbt_outlets_from <=", value, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromIn(List<Long> values) {
            addCriterion("tbt_outlets_from in", values, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromNotIn(List<Long> values) {
            addCriterion("tbt_outlets_from not in", values, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromBetween(Long value1, Long value2) {
            addCriterion("tbt_outlets_from between", value1, value2, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsFromNotBetween(Long value1, Long value2) {
            addCriterion("tbt_outlets_from not between", value1, value2, "tbtOutletsFrom");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToIsNull() {
            addCriterion("tbt_area_to is null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToIsNotNull() {
            addCriterion("tbt_area_to is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToEqualTo(Long value) {
            addCriterion("tbt_area_to =", value, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToNotEqualTo(Long value) {
            addCriterion("tbt_area_to <>", value, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToGreaterThan(Long value) {
            addCriterion("tbt_area_to >", value, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_area_to >=", value, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToLessThan(Long value) {
            addCriterion("tbt_area_to <", value, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToLessThanOrEqualTo(Long value) {
            addCriterion("tbt_area_to <=", value, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToIn(List<Long> values) {
            addCriterion("tbt_area_to in", values, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToNotIn(List<Long> values) {
            addCriterion("tbt_area_to not in", values, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToBetween(Long value1, Long value2) {
            addCriterion("tbt_area_to between", value1, value2, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtAreaToNotBetween(Long value1, Long value2) {
            addCriterion("tbt_area_to not between", value1, value2, "tbtAreaTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToIsNull() {
            addCriterion("tbt_outlets_to is null");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToIsNotNull() {
            addCriterion("tbt_outlets_to is not null");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToEqualTo(Long value) {
            addCriterion("tbt_outlets_to =", value, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToNotEqualTo(Long value) {
            addCriterion("tbt_outlets_to <>", value, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToGreaterThan(Long value) {
            addCriterion("tbt_outlets_to >", value, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToGreaterThanOrEqualTo(Long value) {
            addCriterion("tbt_outlets_to >=", value, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToLessThan(Long value) {
            addCriterion("tbt_outlets_to <", value, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToLessThanOrEqualTo(Long value) {
            addCriterion("tbt_outlets_to <=", value, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToIn(List<Long> values) {
            addCriterion("tbt_outlets_to in", values, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToNotIn(List<Long> values) {
            addCriterion("tbt_outlets_to not in", values, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToBetween(Long value1, Long value2) {
            addCriterion("tbt_outlets_to between", value1, value2, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtOutletsToNotBetween(Long value1, Long value2) {
            addCriterion("tbt_outlets_to not between", value1, value2, "tbtOutletsTo");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkIsNull() {
            addCriterion("tbt_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkIsNotNull() {
            addCriterion("tbt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkEqualTo(String value) {
            addCriterion("tbt_remark =", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotEqualTo(String value) {
            addCriterion("tbt_remark <>", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkGreaterThan(String value) {
            addCriterion("tbt_remark >", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_remark >=", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkLessThan(String value) {
            addCriterion("tbt_remark <", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbt_remark <=", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkLike(String value) {
            addCriterion("tbt_remark like", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotLike(String value) {
            addCriterion("tbt_remark not like", value, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkIn(List<String> values) {
            addCriterion("tbt_remark in", values, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotIn(List<String> values) {
            addCriterion("tbt_remark not in", values, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkBetween(String value1, String value2) {
            addCriterion("tbt_remark between", value1, value2, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtRemarkNotBetween(String value1, String value2) {
            addCriterion("tbt_remark not between", value1, value2, "tbtRemark");
            return (Criteria) this;
        }

        public Criteria andTbtImagesIsNull() {
            addCriterion("tbt_images is null");
            return (Criteria) this;
        }

        public Criteria andTbtImagesIsNotNull() {
            addCriterion("tbt_images is not null");
            return (Criteria) this;
        }

        public Criteria andTbtImagesEqualTo(String value) {
            addCriterion("tbt_images =", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesNotEqualTo(String value) {
            addCriterion("tbt_images <>", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesGreaterThan(String value) {
            addCriterion("tbt_images >", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_images >=", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesLessThan(String value) {
            addCriterion("tbt_images <", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesLessThanOrEqualTo(String value) {
            addCriterion("tbt_images <=", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesLike(String value) {
            addCriterion("tbt_images like", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesNotLike(String value) {
            addCriterion("tbt_images not like", value, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesIn(List<String> values) {
            addCriterion("tbt_images in", values, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesNotIn(List<String> values) {
            addCriterion("tbt_images not in", values, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesBetween(String value1, String value2) {
            addCriterion("tbt_images between", value1, value2, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtImagesNotBetween(String value1, String value2) {
            addCriterion("tbt_images not between", value1, value2, "tbtImages");
            return (Criteria) this;
        }

        public Criteria andTbtChannelIsNull() {
            addCriterion("tbt_channel is null");
            return (Criteria) this;
        }

        public Criteria andTbtChannelIsNotNull() {
            addCriterion("tbt_channel is not null");
            return (Criteria) this;
        }

        public Criteria andTbtChannelEqualTo(Byte value) {
            addCriterion("tbt_channel =", value, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelNotEqualTo(Byte value) {
            addCriterion("tbt_channel <>", value, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelGreaterThan(Byte value) {
            addCriterion("tbt_channel >", value, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_channel >=", value, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelLessThan(Byte value) {
            addCriterion("tbt_channel <", value, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_channel <=", value, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelIn(List<Byte> values) {
            addCriterion("tbt_channel in", values, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelNotIn(List<Byte> values) {
            addCriterion("tbt_channel not in", values, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelBetween(Byte value1, Byte value2) {
            addCriterion("tbt_channel between", value1, value2, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_channel not between", value1, value2, "tbtChannel");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeIsNull() {
            addCriterion("tbt_recv_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeIsNotNull() {
            addCriterion("tbt_recv_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeEqualTo(Date value) {
            addCriterion("tbt_recv_time =", value, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeNotEqualTo(Date value) {
            addCriterion("tbt_recv_time <>", value, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeGreaterThan(Date value) {
            addCriterion("tbt_recv_time >", value, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_recv_time >=", value, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeLessThan(Date value) {
            addCriterion("tbt_recv_time <", value, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_recv_time <=", value, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeIn(List<Date> values) {
            addCriterion("tbt_recv_time in", values, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeNotIn(List<Date> values) {
            addCriterion("tbt_recv_time not in", values, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_recv_time between", value1, value2, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtRecvTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_recv_time not between", value1, value2, "tbtRecvTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeIsNull() {
            addCriterion("tbt_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeIsNotNull() {
            addCriterion("tbt_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeEqualTo(Date value) {
            addCriterion("tbt_end_time =", value, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeNotEqualTo(Date value) {
            addCriterion("tbt_end_time <>", value, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeGreaterThan(Date value) {
            addCriterion("tbt_end_time >", value, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_end_time >=", value, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeLessThan(Date value) {
            addCriterion("tbt_end_time <", value, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_end_time <=", value, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeIn(List<Date> values) {
            addCriterion("tbt_end_time in", values, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeNotIn(List<Date> values) {
            addCriterion("tbt_end_time not in", values, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_end_time between", value1, value2, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_end_time not between", value1, value2, "tbtEndTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeIsNull() {
            addCriterion("tbt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeIsNotNull() {
            addCriterion("tbt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeEqualTo(Date value) {
            addCriterion("tbt_update_time =", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbt_update_time <>", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeGreaterThan(Date value) {
            addCriterion("tbt_update_time >", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_update_time >=", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeLessThan(Date value) {
            addCriterion("tbt_update_time <", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_update_time <=", value, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeIn(List<Date> values) {
            addCriterion("tbt_update_time in", values, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbt_update_time not in", values, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_update_time between", value1, value2, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_update_time not between", value1, value2, "tbtUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeIsNull() {
            addCriterion("tbt_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeIsNotNull() {
            addCriterion("tbt_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeEqualTo(Date value) {
            addCriterion("tbt_add_time =", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeNotEqualTo(Date value) {
            addCriterion("tbt_add_time <>", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeGreaterThan(Date value) {
            addCriterion("tbt_add_time >", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbt_add_time >=", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeLessThan(Date value) {
            addCriterion("tbt_add_time <", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbt_add_time <=", value, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeIn(List<Date> values) {
            addCriterion("tbt_add_time in", values, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeNotIn(List<Date> values) {
            addCriterion("tbt_add_time not in", values, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbt_add_time between", value1, value2, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbt_add_time not between", value1, value2, "tbtAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtLogIsNull() {
            addCriterion("tbt_log is null");
            return (Criteria) this;
        }

        public Criteria andTbtLogIsNotNull() {
            addCriterion("tbt_log is not null");
            return (Criteria) this;
        }

        public Criteria andTbtLogEqualTo(String value) {
            addCriterion("tbt_log =", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogNotEqualTo(String value) {
            addCriterion("tbt_log <>", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogGreaterThan(String value) {
            addCriterion("tbt_log >", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogGreaterThanOrEqualTo(String value) {
            addCriterion("tbt_log >=", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogLessThan(String value) {
            addCriterion("tbt_log <", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogLessThanOrEqualTo(String value) {
            addCriterion("tbt_log <=", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogLike(String value) {
            addCriterion("tbt_log like", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogNotLike(String value) {
            addCriterion("tbt_log not like", value, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogIn(List<String> values) {
            addCriterion("tbt_log in", values, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogNotIn(List<String> values) {
            addCriterion("tbt_log not in", values, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogBetween(String value1, String value2) {
            addCriterion("tbt_log between", value1, value2, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtLogNotBetween(String value1, String value2) {
            addCriterion("tbt_log not between", value1, value2, "tbtLog");
            return (Criteria) this;
        }

        public Criteria andTbtStatusIsNull() {
            addCriterion("tbt_status is null");
            return (Criteria) this;
        }

        public Criteria andTbtStatusIsNotNull() {
            addCriterion("tbt_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbtStatusEqualTo(Byte value) {
            addCriterion("tbt_status =", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusNotEqualTo(Byte value) {
            addCriterion("tbt_status <>", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusGreaterThan(Byte value) {
            addCriterion("tbt_status >", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbt_status >=", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusLessThan(Byte value) {
            addCriterion("tbt_status <", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbt_status <=", value, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusIn(List<Byte> values) {
            addCriterion("tbt_status in", values, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusNotIn(List<Byte> values) {
            addCriterion("tbt_status not in", values, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbt_status between", value1, value2, "tbtStatus");
            return (Criteria) this;
        }

        public Criteria andTbtStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbt_status not between", value1, value2, "tbtStatus");
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