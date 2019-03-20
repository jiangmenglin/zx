package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactUserRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactUserRecordsExample() {
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

        public Criteria andTbcurIdIsNull() {
            addCriterion("tbcur_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcurIdIsNotNull() {
            addCriterion("tbcur_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurIdEqualTo(Long value) {
            addCriterion("tbcur_id =", value, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdNotEqualTo(Long value) {
            addCriterion("tbcur_id <>", value, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdGreaterThan(Long value) {
            addCriterion("tbcur_id >", value, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcur_id >=", value, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdLessThan(Long value) {
            addCriterion("tbcur_id <", value, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdLessThanOrEqualTo(Long value) {
            addCriterion("tbcur_id <=", value, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdIn(List<Long> values) {
            addCriterion("tbcur_id in", values, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdNotIn(List<Long> values) {
            addCriterion("tbcur_id not in", values, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdBetween(Long value1, Long value2) {
            addCriterion("tbcur_id between", value1, value2, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurIdNotBetween(Long value1, Long value2) {
            addCriterion("tbcur_id not between", value1, value2, "tbcurId");
            return (Criteria) this;
        }

        public Criteria andTbcurHostIsNull() {
            addCriterion("tbcur_host is null");
            return (Criteria) this;
        }

        public Criteria andTbcurHostIsNotNull() {
            addCriterion("tbcur_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurHostEqualTo(Long value) {
            addCriterion("tbcur_host =", value, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostNotEqualTo(Long value) {
            addCriterion("tbcur_host <>", value, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostGreaterThan(Long value) {
            addCriterion("tbcur_host >", value, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcur_host >=", value, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostLessThan(Long value) {
            addCriterion("tbcur_host <", value, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostLessThanOrEqualTo(Long value) {
            addCriterion("tbcur_host <=", value, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostIn(List<Long> values) {
            addCriterion("tbcur_host in", values, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostNotIn(List<Long> values) {
            addCriterion("tbcur_host not in", values, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostBetween(Long value1, Long value2) {
            addCriterion("tbcur_host between", value1, value2, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurHostNotBetween(Long value1, Long value2) {
            addCriterion("tbcur_host not between", value1, value2, "tbcurHost");
            return (Criteria) this;
        }

        public Criteria andTbcurUserIsNull() {
            addCriterion("tbcur_user is null");
            return (Criteria) this;
        }

        public Criteria andTbcurUserIsNotNull() {
            addCriterion("tbcur_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurUserEqualTo(Long value) {
            addCriterion("tbcur_user =", value, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserNotEqualTo(Long value) {
            addCriterion("tbcur_user <>", value, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserGreaterThan(Long value) {
            addCriterion("tbcur_user >", value, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcur_user >=", value, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserLessThan(Long value) {
            addCriterion("tbcur_user <", value, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserLessThanOrEqualTo(Long value) {
            addCriterion("tbcur_user <=", value, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserIn(List<Long> values) {
            addCriterion("tbcur_user in", values, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserNotIn(List<Long> values) {
            addCriterion("tbcur_user not in", values, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserBetween(Long value1, Long value2) {
            addCriterion("tbcur_user between", value1, value2, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurUserNotBetween(Long value1, Long value2) {
            addCriterion("tbcur_user not between", value1, value2, "tbcurUser");
            return (Criteria) this;
        }

        public Criteria andTbcurManageIsNull() {
            addCriterion("tbcur_manage is null");
            return (Criteria) this;
        }

        public Criteria andTbcurManageIsNotNull() {
            addCriterion("tbcur_manage is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurManageEqualTo(Long value) {
            addCriterion("tbcur_manage =", value, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageNotEqualTo(Long value) {
            addCriterion("tbcur_manage <>", value, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageGreaterThan(Long value) {
            addCriterion("tbcur_manage >", value, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcur_manage >=", value, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageLessThan(Long value) {
            addCriterion("tbcur_manage <", value, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageLessThanOrEqualTo(Long value) {
            addCriterion("tbcur_manage <=", value, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageIn(List<Long> values) {
            addCriterion("tbcur_manage in", values, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageNotIn(List<Long> values) {
            addCriterion("tbcur_manage not in", values, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageBetween(Long value1, Long value2) {
            addCriterion("tbcur_manage between", value1, value2, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurManageNotBetween(Long value1, Long value2) {
            addCriterion("tbcur_manage not between", value1, value2, "tbcurManage");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderIsNull() {
            addCriterion("tbcur_order is null");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderIsNotNull() {
            addCriterion("tbcur_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderEqualTo(Long value) {
            addCriterion("tbcur_order =", value, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderNotEqualTo(Long value) {
            addCriterion("tbcur_order <>", value, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderGreaterThan(Long value) {
            addCriterion("tbcur_order >", value, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcur_order >=", value, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderLessThan(Long value) {
            addCriterion("tbcur_order <", value, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbcur_order <=", value, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderIn(List<Long> values) {
            addCriterion("tbcur_order in", values, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderNotIn(List<Long> values) {
            addCriterion("tbcur_order not in", values, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderBetween(Long value1, Long value2) {
            addCriterion("tbcur_order between", value1, value2, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbcur_order not between", value1, value2, "tbcurOrder");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoIsNull() {
            addCriterion("tbcur_car_no is null");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoIsNotNull() {
            addCriterion("tbcur_car_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoEqualTo(Long value) {
            addCriterion("tbcur_car_no =", value, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoNotEqualTo(Long value) {
            addCriterion("tbcur_car_no <>", value, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoGreaterThan(Long value) {
            addCriterion("tbcur_car_no >", value, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoGreaterThanOrEqualTo(Long value) {
            addCriterion("tbcur_car_no >=", value, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoLessThan(Long value) {
            addCriterion("tbcur_car_no <", value, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoLessThanOrEqualTo(Long value) {
            addCriterion("tbcur_car_no <=", value, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoIn(List<Long> values) {
            addCriterion("tbcur_car_no in", values, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoNotIn(List<Long> values) {
            addCriterion("tbcur_car_no not in", values, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoBetween(Long value1, Long value2) {
            addCriterion("tbcur_car_no between", value1, value2, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurCarNoNotBetween(Long value1, Long value2) {
            addCriterion("tbcur_car_no not between", value1, value2, "tbcurCarNo");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeIsNull() {
            addCriterion("tbcur_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeIsNotNull() {
            addCriterion("tbcur_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeEqualTo(Date value) {
            addCriterion("tbcur_add_time =", value, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeNotEqualTo(Date value) {
            addCriterion("tbcur_add_time <>", value, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeGreaterThan(Date value) {
            addCriterion("tbcur_add_time >", value, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbcur_add_time >=", value, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeLessThan(Date value) {
            addCriterion("tbcur_add_time <", value, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbcur_add_time <=", value, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeIn(List<Date> values) {
            addCriterion("tbcur_add_time in", values, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeNotIn(List<Date> values) {
            addCriterion("tbcur_add_time not in", values, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbcur_add_time between", value1, value2, "tbcurAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcurAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbcur_add_time not between", value1, value2, "tbcurAddTime");
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