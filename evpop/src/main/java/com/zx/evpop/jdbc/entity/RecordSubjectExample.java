package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class RecordSubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordSubjectExample() {
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

        public Criteria andTbrsIdIsNull() {
            addCriterion("tbrs_id is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIdIsNotNull() {
            addCriterion("tbrs_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIdEqualTo(Long value) {
            addCriterion("tbrs_id =", value, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdNotEqualTo(Long value) {
            addCriterion("tbrs_id <>", value, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdGreaterThan(Long value) {
            addCriterion("tbrs_id >", value, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbrs_id >=", value, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdLessThan(Long value) {
            addCriterion("tbrs_id <", value, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdLessThanOrEqualTo(Long value) {
            addCriterion("tbrs_id <=", value, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdIn(List<Long> values) {
            addCriterion("tbrs_id in", values, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdNotIn(List<Long> values) {
            addCriterion("tbrs_id not in", values, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdBetween(Long value1, Long value2) {
            addCriterion("tbrs_id between", value1, value2, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsIdNotBetween(Long value1, Long value2) {
            addCriterion("tbrs_id not between", value1, value2, "tbrsId");
            return (Criteria) this;
        }

        public Criteria andTbrsNameIsNull() {
            addCriterion("tbrs_name is null");
            return (Criteria) this;
        }

        public Criteria andTbrsNameIsNotNull() {
            addCriterion("tbrs_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsNameEqualTo(String value) {
            addCriterion("tbrs_name =", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameNotEqualTo(String value) {
            addCriterion("tbrs_name <>", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameGreaterThan(String value) {
            addCriterion("tbrs_name >", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbrs_name >=", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameLessThan(String value) {
            addCriterion("tbrs_name <", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameLessThanOrEqualTo(String value) {
            addCriterion("tbrs_name <=", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameLike(String value) {
            addCriterion("tbrs_name like", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameNotLike(String value) {
            addCriterion("tbrs_name not like", value, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameIn(List<String> values) {
            addCriterion("tbrs_name in", values, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameNotIn(List<String> values) {
            addCriterion("tbrs_name not in", values, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameBetween(String value1, String value2) {
            addCriterion("tbrs_name between", value1, value2, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsNameNotBetween(String value1, String value2) {
            addCriterion("tbrs_name not between", value1, value2, "tbrsName");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeIsNull() {
            addCriterion("tbrs_is_income is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeIsNotNull() {
            addCriterion("tbrs_is_income is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeEqualTo(Byte value) {
            addCriterion("tbrs_is_income =", value, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeNotEqualTo(Byte value) {
            addCriterion("tbrs_is_income <>", value, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeGreaterThan(Byte value) {
            addCriterion("tbrs_is_income >", value, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_income >=", value, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeLessThan(Byte value) {
            addCriterion("tbrs_is_income <", value, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_income <=", value, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeIn(List<Byte> values) {
            addCriterion("tbrs_is_income in", values, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeNotIn(List<Byte> values) {
            addCriterion("tbrs_is_income not in", values, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_income between", value1, value2, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsIncomeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_income not between", value1, value2, "tbrsIsIncome");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInIsNull() {
            addCriterion("tbrs_is_oper_in is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInIsNotNull() {
            addCriterion("tbrs_is_oper_in is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_in =", value, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInNotEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_in <>", value, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInGreaterThan(Byte value) {
            addCriterion("tbrs_is_oper_in >", value, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_in >=", value, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInLessThan(Byte value) {
            addCriterion("tbrs_is_oper_in <", value, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_in <=", value, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInIn(List<Byte> values) {
            addCriterion("tbrs_is_oper_in in", values, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInNotIn(List<Byte> values) {
            addCriterion("tbrs_is_oper_in not in", values, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_oper_in between", value1, value2, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperInNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_oper_in not between", value1, value2, "tbrsIsOperIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutIsNull() {
            addCriterion("tbrs_is_oper_out is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutIsNotNull() {
            addCriterion("tbrs_is_oper_out is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_out =", value, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutNotEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_out <>", value, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutGreaterThan(Byte value) {
            addCriterion("tbrs_is_oper_out >", value, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_out >=", value, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutLessThan(Byte value) {
            addCriterion("tbrs_is_oper_out <", value, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_oper_out <=", value, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutIn(List<Byte> values) {
            addCriterion("tbrs_is_oper_out in", values, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutNotIn(List<Byte> values) {
            addCriterion("tbrs_is_oper_out not in", values, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_oper_out between", value1, value2, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOperOutNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_oper_out not between", value1, value2, "tbrsIsOperOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInIsNull() {
            addCriterion("tbrs_is_user_in is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInIsNotNull() {
            addCriterion("tbrs_is_user_in is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInEqualTo(Byte value) {
            addCriterion("tbrs_is_user_in =", value, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInNotEqualTo(Byte value) {
            addCriterion("tbrs_is_user_in <>", value, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInGreaterThan(Byte value) {
            addCriterion("tbrs_is_user_in >", value, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_user_in >=", value, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInLessThan(Byte value) {
            addCriterion("tbrs_is_user_in <", value, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_user_in <=", value, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInIn(List<Byte> values) {
            addCriterion("tbrs_is_user_in in", values, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInNotIn(List<Byte> values) {
            addCriterion("tbrs_is_user_in not in", values, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_user_in between", value1, value2, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserInNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_user_in not between", value1, value2, "tbrsIsUserIn");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutIsNull() {
            addCriterion("tbrs_is_user_out is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutIsNotNull() {
            addCriterion("tbrs_is_user_out is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutEqualTo(Byte value) {
            addCriterion("tbrs_is_user_out =", value, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutNotEqualTo(Byte value) {
            addCriterion("tbrs_is_user_out <>", value, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutGreaterThan(Byte value) {
            addCriterion("tbrs_is_user_out >", value, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_user_out >=", value, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutLessThan(Byte value) {
            addCriterion("tbrs_is_user_out <", value, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_user_out <=", value, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutIn(List<Byte> values) {
            addCriterion("tbrs_is_user_out in", values, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutNotIn(List<Byte> values) {
            addCriterion("tbrs_is_user_out not in", values, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_user_out between", value1, value2, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsUserOutNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_user_out not between", value1, value2, "tbrsIsUserOut");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifIsNull() {
            addCriterion("tbrs_is_artif is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifIsNotNull() {
            addCriterion("tbrs_is_artif is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifEqualTo(Byte value) {
            addCriterion("tbrs_is_artif =", value, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifNotEqualTo(Byte value) {
            addCriterion("tbrs_is_artif <>", value, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifGreaterThan(Byte value) {
            addCriterion("tbrs_is_artif >", value, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_artif >=", value, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifLessThan(Byte value) {
            addCriterion("tbrs_is_artif <", value, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_artif <=", value, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifIn(List<Byte> values) {
            addCriterion("tbrs_is_artif in", values, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifNotIn(List<Byte> values) {
            addCriterion("tbrs_is_artif not in", values, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_artif between", value1, value2, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsArtifNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_artif not between", value1, value2, "tbrsIsArtif");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderIsNull() {
            addCriterion("tbrs_is_order is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderIsNotNull() {
            addCriterion("tbrs_is_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderEqualTo(Byte value) {
            addCriterion("tbrs_is_order =", value, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderNotEqualTo(Byte value) {
            addCriterion("tbrs_is_order <>", value, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderGreaterThan(Byte value) {
            addCriterion("tbrs_is_order >", value, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_order >=", value, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderLessThan(Byte value) {
            addCriterion("tbrs_is_order <", value, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_order <=", value, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderIn(List<Byte> values) {
            addCriterion("tbrs_is_order in", values, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderNotIn(List<Byte> values) {
            addCriterion("tbrs_is_order not in", values, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_order between", value1, value2, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_order not between", value1, value2, "tbrsIsOrder");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceIsNull() {
            addCriterion("tbrs_is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceIsNotNull() {
            addCriterion("tbrs_is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceEqualTo(Byte value) {
            addCriterion("tbrs_is_invoice =", value, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceNotEqualTo(Byte value) {
            addCriterion("tbrs_is_invoice <>", value, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceGreaterThan(Byte value) {
            addCriterion("tbrs_is_invoice >", value, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_invoice >=", value, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceLessThan(Byte value) {
            addCriterion("tbrs_is_invoice <", value, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceLessThanOrEqualTo(Byte value) {
            addCriterion("tbrs_is_invoice <=", value, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceIn(List<Byte> values) {
            addCriterion("tbrs_is_invoice in", values, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceNotIn(List<Byte> values) {
            addCriterion("tbrs_is_invoice not in", values, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_invoice between", value1, value2, "tbrsIsInvoice");
            return (Criteria) this;
        }

        public Criteria andTbrsIsInvoiceNotBetween(Byte value1, Byte value2) {
            addCriterion("tbrs_is_invoice not between", value1, value2, "tbrsIsInvoice");
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