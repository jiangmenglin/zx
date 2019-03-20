package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferManagerExample() {
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

        public Criteria andTbtmIdIsNull() {
            addCriterion("tbtm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbtmIdIsNotNull() {
            addCriterion("tbtm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmIdEqualTo(Long value) {
            addCriterion("tbtm_id =", value, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdNotEqualTo(Long value) {
            addCriterion("tbtm_id <>", value, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdGreaterThan(Long value) {
            addCriterion("tbtm_id >", value, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_id >=", value, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdLessThan(Long value) {
            addCriterion("tbtm_id <", value, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_id <=", value, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdIn(List<Long> values) {
            addCriterion("tbtm_id in", values, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdNotIn(List<Long> values) {
            addCriterion("tbtm_id not in", values, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdBetween(Long value1, Long value2) {
            addCriterion("tbtm_id between", value1, value2, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmIdNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_id not between", value1, value2, "tbtmId");
            return (Criteria) this;
        }

        public Criteria andTbtmHostIsNull() {
            addCriterion("tbtm_host is null");
            return (Criteria) this;
        }

        public Criteria andTbtmHostIsNotNull() {
            addCriterion("tbtm_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmHostEqualTo(Long value) {
            addCriterion("tbtm_host =", value, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostNotEqualTo(Long value) {
            addCriterion("tbtm_host <>", value, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostGreaterThan(Long value) {
            addCriterion("tbtm_host >", value, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_host >=", value, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostLessThan(Long value) {
            addCriterion("tbtm_host <", value, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_host <=", value, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostIn(List<Long> values) {
            addCriterion("tbtm_host in", values, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostNotIn(List<Long> values) {
            addCriterion("tbtm_host not in", values, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostBetween(Long value1, Long value2) {
            addCriterion("tbtm_host between", value1, value2, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmHostNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_host not between", value1, value2, "tbtmHost");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoIsNull() {
            addCriterion("tbtm_order_no is null");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoIsNotNull() {
            addCriterion("tbtm_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoEqualTo(Long value) {
            addCriterion("tbtm_order_no =", value, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoNotEqualTo(Long value) {
            addCriterion("tbtm_order_no <>", value, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoGreaterThan(Long value) {
            addCriterion("tbtm_order_no >", value, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_order_no >=", value, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoLessThan(Long value) {
            addCriterion("tbtm_order_no <", value, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_order_no <=", value, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoIn(List<Long> values) {
            addCriterion("tbtm_order_no in", values, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoNotIn(List<Long> values) {
            addCriterion("tbtm_order_no not in", values, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoBetween(Long value1, Long value2) {
            addCriterion("tbtm_order_no between", value1, value2, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmOrderNoNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_order_no not between", value1, value2, "tbtmOrderNo");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarIsNull() {
            addCriterion("tbtm_fault_car is null");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarIsNotNull() {
            addCriterion("tbtm_fault_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarEqualTo(Long value) {
            addCriterion("tbtm_fault_car =", value, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarNotEqualTo(Long value) {
            addCriterion("tbtm_fault_car <>", value, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarGreaterThan(Long value) {
            addCriterion("tbtm_fault_car >", value, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_fault_car >=", value, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarLessThan(Long value) {
            addCriterion("tbtm_fault_car <", value, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_fault_car <=", value, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarIn(List<Long> values) {
            addCriterion("tbtm_fault_car in", values, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarNotIn(List<Long> values) {
            addCriterion("tbtm_fault_car not in", values, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarBetween(Long value1, Long value2) {
            addCriterion("tbtm_fault_car between", value1, value2, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultCarNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_fault_car not between", value1, value2, "tbtmFaultCar");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultIsNull() {
            addCriterion("tbtm_fault is null");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultIsNotNull() {
            addCriterion("tbtm_fault is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultEqualTo(String value) {
            addCriterion("tbtm_fault =", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultNotEqualTo(String value) {
            addCriterion("tbtm_fault <>", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultGreaterThan(String value) {
            addCriterion("tbtm_fault >", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultGreaterThanOrEqualTo(String value) {
            addCriterion("tbtm_fault >=", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultLessThan(String value) {
            addCriterion("tbtm_fault <", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultLessThanOrEqualTo(String value) {
            addCriterion("tbtm_fault <=", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultLike(String value) {
            addCriterion("tbtm_fault like", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultNotLike(String value) {
            addCriterion("tbtm_fault not like", value, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultIn(List<String> values) {
            addCriterion("tbtm_fault in", values, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultNotIn(List<String> values) {
            addCriterion("tbtm_fault not in", values, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultBetween(String value1, String value2) {
            addCriterion("tbtm_fault between", value1, value2, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFaultNotBetween(String value1, String value2) {
            addCriterion("tbtm_fault not between", value1, value2, "tbtmFault");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeIsNull() {
            addCriterion("tbtm_failt_gettime is null");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeIsNotNull() {
            addCriterion("tbtm_failt_gettime is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeEqualTo(Date value) {
            addCriterion("tbtm_failt_gettime =", value, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeNotEqualTo(Date value) {
            addCriterion("tbtm_failt_gettime <>", value, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeGreaterThan(Date value) {
            addCriterion("tbtm_failt_gettime >", value, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtm_failt_gettime >=", value, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeLessThan(Date value) {
            addCriterion("tbtm_failt_gettime <", value, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtm_failt_gettime <=", value, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeIn(List<Date> values) {
            addCriterion("tbtm_failt_gettime in", values, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeNotIn(List<Date> values) {
            addCriterion("tbtm_failt_gettime not in", values, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeBetween(Date value1, Date value2) {
            addCriterion("tbtm_failt_gettime between", value1, value2, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFailtGettimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtm_failt_gettime not between", value1, value2, "tbtmFailtGettime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeIsNull() {
            addCriterion("tbtm_freturn_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeIsNotNull() {
            addCriterion("tbtm_freturn_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeEqualTo(Date value) {
            addCriterion("tbtm_freturn_time =", value, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeNotEqualTo(Date value) {
            addCriterion("tbtm_freturn_time <>", value, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeGreaterThan(Date value) {
            addCriterion("tbtm_freturn_time >", value, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtm_freturn_time >=", value, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeLessThan(Date value) {
            addCriterion("tbtm_freturn_time <", value, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtm_freturn_time <=", value, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeIn(List<Date> values) {
            addCriterion("tbtm_freturn_time in", values, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeNotIn(List<Date> values) {
            addCriterion("tbtm_freturn_time not in", values, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeBetween(Date value1, Date value2) {
            addCriterion("tbtm_freturn_time between", value1, value2, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmFreturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtm_freturn_time not between", value1, value2, "tbtmFreturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmCarIsNull() {
            addCriterion("tbtm_car is null");
            return (Criteria) this;
        }

        public Criteria andTbtmCarIsNotNull() {
            addCriterion("tbtm_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmCarEqualTo(Long value) {
            addCriterion("tbtm_car =", value, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarNotEqualTo(Long value) {
            addCriterion("tbtm_car <>", value, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarGreaterThan(Long value) {
            addCriterion("tbtm_car >", value, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_car >=", value, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarLessThan(Long value) {
            addCriterion("tbtm_car <", value, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_car <=", value, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarIn(List<Long> values) {
            addCriterion("tbtm_car in", values, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarNotIn(List<Long> values) {
            addCriterion("tbtm_car not in", values, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarBetween(Long value1, Long value2) {
            addCriterion("tbtm_car between", value1, value2, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmCarNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_car not between", value1, value2, "tbtmCar");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeIsNull() {
            addCriterion("tbtm_get_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeIsNotNull() {
            addCriterion("tbtm_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeEqualTo(Date value) {
            addCriterion("tbtm_get_time =", value, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeNotEqualTo(Date value) {
            addCriterion("tbtm_get_time <>", value, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeGreaterThan(Date value) {
            addCriterion("tbtm_get_time >", value, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtm_get_time >=", value, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeLessThan(Date value) {
            addCriterion("tbtm_get_time <", value, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtm_get_time <=", value, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeIn(List<Date> values) {
            addCriterion("tbtm_get_time in", values, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeNotIn(List<Date> values) {
            addCriterion("tbtm_get_time not in", values, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeBetween(Date value1, Date value2) {
            addCriterion("tbtm_get_time between", value1, value2, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtm_get_time not between", value1, value2, "tbtmGetTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeIsNull() {
            addCriterion("tbtm_return_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeIsNotNull() {
            addCriterion("tbtm_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeEqualTo(Date value) {
            addCriterion("tbtm_return_time =", value, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeNotEqualTo(Date value) {
            addCriterion("tbtm_return_time <>", value, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeGreaterThan(Date value) {
            addCriterion("tbtm_return_time >", value, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtm_return_time >=", value, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeLessThan(Date value) {
            addCriterion("tbtm_return_time <", value, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtm_return_time <=", value, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeIn(List<Date> values) {
            addCriterion("tbtm_return_time in", values, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeNotIn(List<Date> values) {
            addCriterion("tbtm_return_time not in", values, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeBetween(Date value1, Date value2) {
            addCriterion("tbtm_return_time between", value1, value2, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtm_return_time not between", value1, value2, "tbtmReturnTime");
            return (Criteria) this;
        }

        public Criteria andTbtmNameIsNull() {
            addCriterion("tbtm_name is null");
            return (Criteria) this;
        }

        public Criteria andTbtmNameIsNotNull() {
            addCriterion("tbtm_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmNameEqualTo(Long value) {
            addCriterion("tbtm_name =", value, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameNotEqualTo(Long value) {
            addCriterion("tbtm_name <>", value, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameGreaterThan(Long value) {
            addCriterion("tbtm_name >", value, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_name >=", value, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameLessThan(Long value) {
            addCriterion("tbtm_name <", value, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_name <=", value, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameIn(List<Long> values) {
            addCriterion("tbtm_name in", values, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameNotIn(List<Long> values) {
            addCriterion("tbtm_name not in", values, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameBetween(Long value1, Long value2) {
            addCriterion("tbtm_name between", value1, value2, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmNameNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_name not between", value1, value2, "tbtmName");
            return (Criteria) this;
        }

        public Criteria andTbtmUserIsNull() {
            addCriterion("tbtm_user is null");
            return (Criteria) this;
        }

        public Criteria andTbtmUserIsNotNull() {
            addCriterion("tbtm_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmUserEqualTo(Long value) {
            addCriterion("tbtm_user =", value, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserNotEqualTo(Long value) {
            addCriterion("tbtm_user <>", value, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserGreaterThan(Long value) {
            addCriterion("tbtm_user >", value, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_user >=", value, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserLessThan(Long value) {
            addCriterion("tbtm_user <", value, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_user <=", value, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserIn(List<Long> values) {
            addCriterion("tbtm_user in", values, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserNotIn(List<Long> values) {
            addCriterion("tbtm_user not in", values, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserBetween(Long value1, Long value2) {
            addCriterion("tbtm_user between", value1, value2, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmUserNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_user not between", value1, value2, "tbtmUser");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeIsNull() {
            addCriterion("tbtm_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeIsNotNull() {
            addCriterion("tbtm_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeEqualTo(Date value) {
            addCriterion("tbtm_add_time =", value, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeNotEqualTo(Date value) {
            addCriterion("tbtm_add_time <>", value, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeGreaterThan(Date value) {
            addCriterion("tbtm_add_time >", value, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtm_add_time >=", value, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeLessThan(Date value) {
            addCriterion("tbtm_add_time <", value, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtm_add_time <=", value, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeIn(List<Date> values) {
            addCriterion("tbtm_add_time in", values, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeNotIn(List<Date> values) {
            addCriterion("tbtm_add_time not in", values, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbtm_add_time between", value1, value2, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtm_add_time not between", value1, value2, "tbtmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleIsNull() {
            addCriterion("tbtm_handle is null");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleIsNotNull() {
            addCriterion("tbtm_handle is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleEqualTo(Long value) {
            addCriterion("tbtm_handle =", value, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleNotEqualTo(Long value) {
            addCriterion("tbtm_handle <>", value, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleGreaterThan(Long value) {
            addCriterion("tbtm_handle >", value, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtm_handle >=", value, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleLessThan(Long value) {
            addCriterion("tbtm_handle <", value, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleLessThanOrEqualTo(Long value) {
            addCriterion("tbtm_handle <=", value, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleIn(List<Long> values) {
            addCriterion("tbtm_handle in", values, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleNotIn(List<Long> values) {
            addCriterion("tbtm_handle not in", values, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleBetween(Long value1, Long value2) {
            addCriterion("tbtm_handle between", value1, value2, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmHandleNotBetween(Long value1, Long value2) {
            addCriterion("tbtm_handle not between", value1, value2, "tbtmHandle");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeIsNull() {
            addCriterion("tbtm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeIsNotNull() {
            addCriterion("tbtm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeEqualTo(Date value) {
            addCriterion("tbtm_update_time =", value, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbtm_update_time <>", value, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeGreaterThan(Date value) {
            addCriterion("tbtm_update_time >", value, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtm_update_time >=", value, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeLessThan(Date value) {
            addCriterion("tbtm_update_time <", value, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtm_update_time <=", value, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeIn(List<Date> values) {
            addCriterion("tbtm_update_time in", values, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbtm_update_time not in", values, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbtm_update_time between", value1, value2, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtm_update_time not between", value1, value2, "tbtmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusIsNull() {
            addCriterion("tbtm_status is null");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusIsNotNull() {
            addCriterion("tbtm_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusEqualTo(Short value) {
            addCriterion("tbtm_status =", value, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusNotEqualTo(Short value) {
            addCriterion("tbtm_status <>", value, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusGreaterThan(Short value) {
            addCriterion("tbtm_status >", value, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbtm_status >=", value, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusLessThan(Short value) {
            addCriterion("tbtm_status <", value, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbtm_status <=", value, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusIn(List<Short> values) {
            addCriterion("tbtm_status in", values, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusNotIn(List<Short> values) {
            addCriterion("tbtm_status not in", values, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusBetween(Short value1, Short value2) {
            addCriterion("tbtm_status between", value1, value2, "tbtmStatus");
            return (Criteria) this;
        }

        public Criteria andTbtmStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbtm_status not between", value1, value2, "tbtmStatus");
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