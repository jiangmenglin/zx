package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongOrderFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongOrderFeeExample() {
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

        public Criteria andTblofIdIsNull() {
            addCriterion("tblof_id is null");
            return (Criteria) this;
        }

        public Criteria andTblofIdIsNotNull() {
            addCriterion("tblof_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblofIdEqualTo(Long value) {
            addCriterion("tblof_id =", value, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdNotEqualTo(Long value) {
            addCriterion("tblof_id <>", value, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdGreaterThan(Long value) {
            addCriterion("tblof_id >", value, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblof_id >=", value, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdLessThan(Long value) {
            addCriterion("tblof_id <", value, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdLessThanOrEqualTo(Long value) {
            addCriterion("tblof_id <=", value, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdIn(List<Long> values) {
            addCriterion("tblof_id in", values, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdNotIn(List<Long> values) {
            addCriterion("tblof_id not in", values, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdBetween(Long value1, Long value2) {
            addCriterion("tblof_id between", value1, value2, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofIdNotBetween(Long value1, Long value2) {
            addCriterion("tblof_id not between", value1, value2, "tblofId");
            return (Criteria) this;
        }

        public Criteria andTblofHostIsNull() {
            addCriterion("tblof_host is null");
            return (Criteria) this;
        }

        public Criteria andTblofHostIsNotNull() {
            addCriterion("tblof_host is not null");
            return (Criteria) this;
        }

        public Criteria andTblofHostEqualTo(Long value) {
            addCriterion("tblof_host =", value, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostNotEqualTo(Long value) {
            addCriterion("tblof_host <>", value, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostGreaterThan(Long value) {
            addCriterion("tblof_host >", value, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tblof_host >=", value, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostLessThan(Long value) {
            addCriterion("tblof_host <", value, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostLessThanOrEqualTo(Long value) {
            addCriterion("tblof_host <=", value, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostIn(List<Long> values) {
            addCriterion("tblof_host in", values, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostNotIn(List<Long> values) {
            addCriterion("tblof_host not in", values, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostBetween(Long value1, Long value2) {
            addCriterion("tblof_host between", value1, value2, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofHostNotBetween(Long value1, Long value2) {
            addCriterion("tblof_host not between", value1, value2, "tblofHost");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderIsNull() {
            addCriterion("tblof_longorder is null");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderIsNotNull() {
            addCriterion("tblof_longorder is not null");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderEqualTo(Long value) {
            addCriterion("tblof_longorder =", value, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderNotEqualTo(Long value) {
            addCriterion("tblof_longorder <>", value, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderGreaterThan(Long value) {
            addCriterion("tblof_longorder >", value, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderGreaterThanOrEqualTo(Long value) {
            addCriterion("tblof_longorder >=", value, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderLessThan(Long value) {
            addCriterion("tblof_longorder <", value, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderLessThanOrEqualTo(Long value) {
            addCriterion("tblof_longorder <=", value, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderIn(List<Long> values) {
            addCriterion("tblof_longorder in", values, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderNotIn(List<Long> values) {
            addCriterion("tblof_longorder not in", values, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderBetween(Long value1, Long value2) {
            addCriterion("tblof_longorder between", value1, value2, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofLongorderNotBetween(Long value1, Long value2) {
            addCriterion("tblof_longorder not between", value1, value2, "tblofLongorder");
            return (Criteria) this;
        }

        public Criteria andTblofNameIsNull() {
            addCriterion("tblof_name is null");
            return (Criteria) this;
        }

        public Criteria andTblofNameIsNotNull() {
            addCriterion("tblof_name is not null");
            return (Criteria) this;
        }

        public Criteria andTblofNameEqualTo(String value) {
            addCriterion("tblof_name =", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameNotEqualTo(String value) {
            addCriterion("tblof_name <>", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameGreaterThan(String value) {
            addCriterion("tblof_name >", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameGreaterThanOrEqualTo(String value) {
            addCriterion("tblof_name >=", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameLessThan(String value) {
            addCriterion("tblof_name <", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameLessThanOrEqualTo(String value) {
            addCriterion("tblof_name <=", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameLike(String value) {
            addCriterion("tblof_name like", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameNotLike(String value) {
            addCriterion("tblof_name not like", value, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameIn(List<String> values) {
            addCriterion("tblof_name in", values, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameNotIn(List<String> values) {
            addCriterion("tblof_name not in", values, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameBetween(String value1, String value2) {
            addCriterion("tblof_name between", value1, value2, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofNameNotBetween(String value1, String value2) {
            addCriterion("tblof_name not between", value1, value2, "tblofName");
            return (Criteria) this;
        }

        public Criteria andTblofTypeIsNull() {
            addCriterion("tblof_type is null");
            return (Criteria) this;
        }

        public Criteria andTblofTypeIsNotNull() {
            addCriterion("tblof_type is not null");
            return (Criteria) this;
        }

        public Criteria andTblofTypeEqualTo(Short value) {
            addCriterion("tblof_type =", value, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeNotEqualTo(Short value) {
            addCriterion("tblof_type <>", value, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeGreaterThan(Short value) {
            addCriterion("tblof_type >", value, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tblof_type >=", value, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeLessThan(Short value) {
            addCriterion("tblof_type <", value, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeLessThanOrEqualTo(Short value) {
            addCriterion("tblof_type <=", value, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeIn(List<Short> values) {
            addCriterion("tblof_type in", values, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeNotIn(List<Short> values) {
            addCriterion("tblof_type not in", values, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeBetween(Short value1, Short value2) {
            addCriterion("tblof_type between", value1, value2, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofTypeNotBetween(Short value1, Short value2) {
            addCriterion("tblof_type not between", value1, value2, "tblofType");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountIsNull() {
            addCriterion("tblof_ammount is null");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountIsNotNull() {
            addCriterion("tblof_ammount is not null");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountEqualTo(Double value) {
            addCriterion("tblof_ammount =", value, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountNotEqualTo(Double value) {
            addCriterion("tblof_ammount <>", value, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountGreaterThan(Double value) {
            addCriterion("tblof_ammount >", value, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountGreaterThanOrEqualTo(Double value) {
            addCriterion("tblof_ammount >=", value, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountLessThan(Double value) {
            addCriterion("tblof_ammount <", value, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountLessThanOrEqualTo(Double value) {
            addCriterion("tblof_ammount <=", value, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountIn(List<Double> values) {
            addCriterion("tblof_ammount in", values, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountNotIn(List<Double> values) {
            addCriterion("tblof_ammount not in", values, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountBetween(Double value1, Double value2) {
            addCriterion("tblof_ammount between", value1, value2, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofAmmountNotBetween(Double value1, Double value2) {
            addCriterion("tblof_ammount not between", value1, value2, "tblofAmmount");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordIsNull() {
            addCriterion("tblof_pay_record is null");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordIsNotNull() {
            addCriterion("tblof_pay_record is not null");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordEqualTo(Long value) {
            addCriterion("tblof_pay_record =", value, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordNotEqualTo(Long value) {
            addCriterion("tblof_pay_record <>", value, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordGreaterThan(Long value) {
            addCriterion("tblof_pay_record >", value, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordGreaterThanOrEqualTo(Long value) {
            addCriterion("tblof_pay_record >=", value, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordLessThan(Long value) {
            addCriterion("tblof_pay_record <", value, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordLessThanOrEqualTo(Long value) {
            addCriterion("tblof_pay_record <=", value, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordIn(List<Long> values) {
            addCriterion("tblof_pay_record in", values, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordNotIn(List<Long> values) {
            addCriterion("tblof_pay_record not in", values, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordBetween(Long value1, Long value2) {
            addCriterion("tblof_pay_record between", value1, value2, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofPayRecordNotBetween(Long value1, Long value2) {
            addCriterion("tblof_pay_record not between", value1, value2, "tblofPayRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordIsNull() {
            addCriterion("tblof_ret_record is null");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordIsNotNull() {
            addCriterion("tblof_ret_record is not null");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordEqualTo(Long value) {
            addCriterion("tblof_ret_record =", value, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordNotEqualTo(Long value) {
            addCriterion("tblof_ret_record <>", value, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordGreaterThan(Long value) {
            addCriterion("tblof_ret_record >", value, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordGreaterThanOrEqualTo(Long value) {
            addCriterion("tblof_ret_record >=", value, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordLessThan(Long value) {
            addCriterion("tblof_ret_record <", value, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordLessThanOrEqualTo(Long value) {
            addCriterion("tblof_ret_record <=", value, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordIn(List<Long> values) {
            addCriterion("tblof_ret_record in", values, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordNotIn(List<Long> values) {
            addCriterion("tblof_ret_record not in", values, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordBetween(Long value1, Long value2) {
            addCriterion("tblof_ret_record between", value1, value2, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRetRecordNotBetween(Long value1, Long value2) {
            addCriterion("tblof_ret_record not between", value1, value2, "tblofRetRecord");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkIsNull() {
            addCriterion("tblof_remark is null");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkIsNotNull() {
            addCriterion("tblof_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkEqualTo(String value) {
            addCriterion("tblof_remark =", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkNotEqualTo(String value) {
            addCriterion("tblof_remark <>", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkGreaterThan(String value) {
            addCriterion("tblof_remark >", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tblof_remark >=", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkLessThan(String value) {
            addCriterion("tblof_remark <", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkLessThanOrEqualTo(String value) {
            addCriterion("tblof_remark <=", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkLike(String value) {
            addCriterion("tblof_remark like", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkNotLike(String value) {
            addCriterion("tblof_remark not like", value, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkIn(List<String> values) {
            addCriterion("tblof_remark in", values, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkNotIn(List<String> values) {
            addCriterion("tblof_remark not in", values, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkBetween(String value1, String value2) {
            addCriterion("tblof_remark between", value1, value2, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofRemarkNotBetween(String value1, String value2) {
            addCriterion("tblof_remark not between", value1, value2, "tblofRemark");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeIsNull() {
            addCriterion("tblof_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeIsNotNull() {
            addCriterion("tblof_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeEqualTo(Date value) {
            addCriterion("tblof_update_time =", value, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeNotEqualTo(Date value) {
            addCriterion("tblof_update_time <>", value, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeGreaterThan(Date value) {
            addCriterion("tblof_update_time >", value, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblof_update_time >=", value, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeLessThan(Date value) {
            addCriterion("tblof_update_time <", value, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblof_update_time <=", value, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeIn(List<Date> values) {
            addCriterion("tblof_update_time in", values, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeNotIn(List<Date> values) {
            addCriterion("tblof_update_time not in", values, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tblof_update_time between", value1, value2, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblof_update_time not between", value1, value2, "tblofUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeIsNull() {
            addCriterion("tblof_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeIsNotNull() {
            addCriterion("tblof_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeEqualTo(Date value) {
            addCriterion("tblof_add_time =", value, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeNotEqualTo(Date value) {
            addCriterion("tblof_add_time <>", value, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeGreaterThan(Date value) {
            addCriterion("tblof_add_time >", value, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblof_add_time >=", value, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeLessThan(Date value) {
            addCriterion("tblof_add_time <", value, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblof_add_time <=", value, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeIn(List<Date> values) {
            addCriterion("tblof_add_time in", values, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeNotIn(List<Date> values) {
            addCriterion("tblof_add_time not in", values, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeBetween(Date value1, Date value2) {
            addCriterion("tblof_add_time between", value1, value2, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblof_add_time not between", value1, value2, "tblofAddTime");
            return (Criteria) this;
        }

        public Criteria andTblofStatusIsNull() {
            addCriterion("tblof_status is null");
            return (Criteria) this;
        }

        public Criteria andTblofStatusIsNotNull() {
            addCriterion("tblof_status is not null");
            return (Criteria) this;
        }

        public Criteria andTblofStatusEqualTo(Short value) {
            addCriterion("tblof_status =", value, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusNotEqualTo(Short value) {
            addCriterion("tblof_status <>", value, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusGreaterThan(Short value) {
            addCriterion("tblof_status >", value, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tblof_status >=", value, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusLessThan(Short value) {
            addCriterion("tblof_status <", value, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusLessThanOrEqualTo(Short value) {
            addCriterion("tblof_status <=", value, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusIn(List<Short> values) {
            addCriterion("tblof_status in", values, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusNotIn(List<Short> values) {
            addCriterion("tblof_status not in", values, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusBetween(Short value1, Short value2) {
            addCriterion("tblof_status between", value1, value2, "tblofStatus");
            return (Criteria) this;
        }

        public Criteria andTblofStatusNotBetween(Short value1, Short value2) {
            addCriterion("tblof_status not between", value1, value2, "tblofStatus");
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