package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayLogExample() {
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

        public Criteria andTbplIdIsNull() {
            addCriterion("tbpl_id is null");
            return (Criteria) this;
        }

        public Criteria andTbplIdIsNotNull() {
            addCriterion("tbpl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbplIdEqualTo(Long value) {
            addCriterion("tbpl_id =", value, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdNotEqualTo(Long value) {
            addCriterion("tbpl_id <>", value, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdGreaterThan(Long value) {
            addCriterion("tbpl_id >", value, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpl_id >=", value, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdLessThan(Long value) {
            addCriterion("tbpl_id <", value, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdLessThanOrEqualTo(Long value) {
            addCriterion("tbpl_id <=", value, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdIn(List<Long> values) {
            addCriterion("tbpl_id in", values, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdNotIn(List<Long> values) {
            addCriterion("tbpl_id not in", values, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdBetween(Long value1, Long value2) {
            addCriterion("tbpl_id between", value1, value2, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplIdNotBetween(Long value1, Long value2) {
            addCriterion("tbpl_id not between", value1, value2, "tbplId");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeIsNull() {
            addCriterion("tbpl_bank_type is null");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeIsNotNull() {
            addCriterion("tbpl_bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeEqualTo(Short value) {
            addCriterion("tbpl_bank_type =", value, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeNotEqualTo(Short value) {
            addCriterion("tbpl_bank_type <>", value, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeGreaterThan(Short value) {
            addCriterion("tbpl_bank_type >", value, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbpl_bank_type >=", value, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeLessThan(Short value) {
            addCriterion("tbpl_bank_type <", value, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbpl_bank_type <=", value, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeIn(List<Short> values) {
            addCriterion("tbpl_bank_type in", values, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeNotIn(List<Short> values) {
            addCriterion("tbpl_bank_type not in", values, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeBetween(Short value1, Short value2) {
            addCriterion("tbpl_bank_type between", value1, value2, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplBankTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbpl_bank_type not between", value1, value2, "tbplBankType");
            return (Criteria) this;
        }

        public Criteria andTbplRecordIsNull() {
            addCriterion("tbpl_record is null");
            return (Criteria) this;
        }

        public Criteria andTbplRecordIsNotNull() {
            addCriterion("tbpl_record is not null");
            return (Criteria) this;
        }

        public Criteria andTbplRecordEqualTo(Long value) {
            addCriterion("tbpl_record =", value, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordNotEqualTo(Long value) {
            addCriterion("tbpl_record <>", value, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordGreaterThan(Long value) {
            addCriterion("tbpl_record >", value, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpl_record >=", value, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordLessThan(Long value) {
            addCriterion("tbpl_record <", value, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordLessThanOrEqualTo(Long value) {
            addCriterion("tbpl_record <=", value, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordIn(List<Long> values) {
            addCriterion("tbpl_record in", values, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordNotIn(List<Long> values) {
            addCriterion("tbpl_record not in", values, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordBetween(Long value1, Long value2) {
            addCriterion("tbpl_record between", value1, value2, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRecordNotBetween(Long value1, Long value2) {
            addCriterion("tbpl_record not between", value1, value2, "tbplRecord");
            return (Criteria) this;
        }

        public Criteria andTbplRefundIsNull() {
            addCriterion("tbpl_refund is null");
            return (Criteria) this;
        }

        public Criteria andTbplRefundIsNotNull() {
            addCriterion("tbpl_refund is not null");
            return (Criteria) this;
        }

        public Criteria andTbplRefundEqualTo(Long value) {
            addCriterion("tbpl_refund =", value, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundNotEqualTo(Long value) {
            addCriterion("tbpl_refund <>", value, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundGreaterThan(Long value) {
            addCriterion("tbpl_refund >", value, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundGreaterThanOrEqualTo(Long value) {
            addCriterion("tbpl_refund >=", value, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundLessThan(Long value) {
            addCriterion("tbpl_refund <", value, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundLessThanOrEqualTo(Long value) {
            addCriterion("tbpl_refund <=", value, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundIn(List<Long> values) {
            addCriterion("tbpl_refund in", values, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundNotIn(List<Long> values) {
            addCriterion("tbpl_refund not in", values, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundBetween(Long value1, Long value2) {
            addCriterion("tbpl_refund between", value1, value2, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRefundNotBetween(Long value1, Long value2) {
            addCriterion("tbpl_refund not between", value1, value2, "tbplRefund");
            return (Criteria) this;
        }

        public Criteria andTbplRelateIsNull() {
            addCriterion("tbpl_relate is null");
            return (Criteria) this;
        }

        public Criteria andTbplRelateIsNotNull() {
            addCriterion("tbpl_relate is not null");
            return (Criteria) this;
        }

        public Criteria andTbplRelateEqualTo(String value) {
            addCriterion("tbpl_relate =", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateNotEqualTo(String value) {
            addCriterion("tbpl_relate <>", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateGreaterThan(String value) {
            addCriterion("tbpl_relate >", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateGreaterThanOrEqualTo(String value) {
            addCriterion("tbpl_relate >=", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateLessThan(String value) {
            addCriterion("tbpl_relate <", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateLessThanOrEqualTo(String value) {
            addCriterion("tbpl_relate <=", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateLike(String value) {
            addCriterion("tbpl_relate like", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateNotLike(String value) {
            addCriterion("tbpl_relate not like", value, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateIn(List<String> values) {
            addCriterion("tbpl_relate in", values, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateNotIn(List<String> values) {
            addCriterion("tbpl_relate not in", values, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateBetween(String value1, String value2) {
            addCriterion("tbpl_relate between", value1, value2, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplRelateNotBetween(String value1, String value2) {
            addCriterion("tbpl_relate not between", value1, value2, "tbplRelate");
            return (Criteria) this;
        }

        public Criteria andTbplTypeIsNull() {
            addCriterion("tbpl_type is null");
            return (Criteria) this;
        }

        public Criteria andTbplTypeIsNotNull() {
            addCriterion("tbpl_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbplTypeEqualTo(Short value) {
            addCriterion("tbpl_type =", value, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeNotEqualTo(Short value) {
            addCriterion("tbpl_type <>", value, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeGreaterThan(Short value) {
            addCriterion("tbpl_type >", value, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbpl_type >=", value, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeLessThan(Short value) {
            addCriterion("tbpl_type <", value, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbpl_type <=", value, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeIn(List<Short> values) {
            addCriterion("tbpl_type in", values, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeNotIn(List<Short> values) {
            addCriterion("tbpl_type not in", values, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeBetween(Short value1, Short value2) {
            addCriterion("tbpl_type between", value1, value2, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbpl_type not between", value1, value2, "tbplType");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeIsNull() {
            addCriterion("tbpl_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeIsNotNull() {
            addCriterion("tbpl_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeEqualTo(Date value) {
            addCriterion("tbpl_add_time =", value, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeNotEqualTo(Date value) {
            addCriterion("tbpl_add_time <>", value, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeGreaterThan(Date value) {
            addCriterion("tbpl_add_time >", value, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbpl_add_time >=", value, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeLessThan(Date value) {
            addCriterion("tbpl_add_time <", value, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbpl_add_time <=", value, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeIn(List<Date> values) {
            addCriterion("tbpl_add_time in", values, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeNotIn(List<Date> values) {
            addCriterion("tbpl_add_time not in", values, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbpl_add_time between", value1, value2, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbpl_add_time not between", value1, value2, "tbplAddTime");
            return (Criteria) this;
        }

        public Criteria andTbplStatusIsNull() {
            addCriterion("tbpl_status is null");
            return (Criteria) this;
        }

        public Criteria andTbplStatusIsNotNull() {
            addCriterion("tbpl_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbplStatusEqualTo(Short value) {
            addCriterion("tbpl_status =", value, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusNotEqualTo(Short value) {
            addCriterion("tbpl_status <>", value, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusGreaterThan(Short value) {
            addCriterion("tbpl_status >", value, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbpl_status >=", value, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusLessThan(Short value) {
            addCriterion("tbpl_status <", value, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbpl_status <=", value, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusIn(List<Short> values) {
            addCriterion("tbpl_status in", values, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusNotIn(List<Short> values) {
            addCriterion("tbpl_status not in", values, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusBetween(Short value1, Short value2) {
            addCriterion("tbpl_status between", value1, value2, "tbplStatus");
            return (Criteria) this;
        }

        public Criteria andTbplStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbpl_status not between", value1, value2, "tbplStatus");
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