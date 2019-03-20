package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralExample() {
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

        public Criteria andTbiIdIsNull() {
            addCriterion("tbi_id is null");
            return (Criteria) this;
        }

        public Criteria andTbiIdIsNotNull() {
            addCriterion("tbi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbiIdEqualTo(Integer value) {
            addCriterion("tbi_id =", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdNotEqualTo(Integer value) {
            addCriterion("tbi_id <>", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdGreaterThan(Integer value) {
            addCriterion("tbi_id >", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_id >=", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdLessThan(Integer value) {
            addCriterion("tbi_id <", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_id <=", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdIn(List<Integer> values) {
            addCriterion("tbi_id in", values, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdNotIn(List<Integer> values) {
            addCriterion("tbi_id not in", values, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdBetween(Integer value1, Integer value2) {
            addCriterion("tbi_id between", value1, value2, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_id not between", value1, value2, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiHostIsNull() {
            addCriterion("tbi_host is null");
            return (Criteria) this;
        }

        public Criteria andTbiHostIsNotNull() {
            addCriterion("tbi_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbiHostEqualTo(Short value) {
            addCriterion("tbi_host =", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostNotEqualTo(Short value) {
            addCriterion("tbi_host <>", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostGreaterThan(Short value) {
            addCriterion("tbi_host >", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbi_host >=", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostLessThan(Short value) {
            addCriterion("tbi_host <", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostLessThanOrEqualTo(Short value) {
            addCriterion("tbi_host <=", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostIn(List<Short> values) {
            addCriterion("tbi_host in", values, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostNotIn(List<Short> values) {
            addCriterion("tbi_host not in", values, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostBetween(Short value1, Short value2) {
            addCriterion("tbi_host between", value1, value2, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostNotBetween(Short value1, Short value2) {
            addCriterion("tbi_host not between", value1, value2, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiMemberIsNull() {
            addCriterion("tbi_member is null");
            return (Criteria) this;
        }

        public Criteria andTbiMemberIsNotNull() {
            addCriterion("tbi_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbiMemberEqualTo(Integer value) {
            addCriterion("tbi_member =", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberNotEqualTo(Integer value) {
            addCriterion("tbi_member <>", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberGreaterThan(Integer value) {
            addCriterion("tbi_member >", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_member >=", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberLessThan(Integer value) {
            addCriterion("tbi_member <", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_member <=", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberIn(List<Integer> values) {
            addCriterion("tbi_member in", values, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberNotIn(List<Integer> values) {
            addCriterion("tbi_member not in", values, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbi_member between", value1, value2, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_member not between", value1, value2, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiTypeIsNull() {
            addCriterion("tbi_type is null");
            return (Criteria) this;
        }

        public Criteria andTbiTypeIsNotNull() {
            addCriterion("tbi_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbiTypeEqualTo(Byte value) {
            addCriterion("tbi_type =", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeNotEqualTo(Byte value) {
            addCriterion("tbi_type <>", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeGreaterThan(Byte value) {
            addCriterion("tbi_type >", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbi_type >=", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeLessThan(Byte value) {
            addCriterion("tbi_type <", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbi_type <=", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeIn(List<Byte> values) {
            addCriterion("tbi_type in", values, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeNotIn(List<Byte> values) {
            addCriterion("tbi_type not in", values, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbi_type between", value1, value2, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbi_type not between", value1, value2, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiAmountIsNull() {
            addCriterion("tbi_amount is null");
            return (Criteria) this;
        }

        public Criteria andTbiAmountIsNotNull() {
            addCriterion("tbi_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTbiAmountEqualTo(Double value) {
            addCriterion("tbi_amount =", value, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountNotEqualTo(Double value) {
            addCriterion("tbi_amount <>", value, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountGreaterThan(Double value) {
            addCriterion("tbi_amount >", value, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbi_amount >=", value, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountLessThan(Double value) {
            addCriterion("tbi_amount <", value, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountLessThanOrEqualTo(Double value) {
            addCriterion("tbi_amount <=", value, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountIn(List<Double> values) {
            addCriterion("tbi_amount in", values, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountNotIn(List<Double> values) {
            addCriterion("tbi_amount not in", values, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountBetween(Double value1, Double value2) {
            addCriterion("tbi_amount between", value1, value2, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiAmountNotBetween(Double value1, Double value2) {
            addCriterion("tbi_amount not between", value1, value2, "tbiAmount");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkIsNull() {
            addCriterion("tbi_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkIsNotNull() {
            addCriterion("tbi_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkEqualTo(String value) {
            addCriterion("tbi_remark =", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotEqualTo(String value) {
            addCriterion("tbi_remark <>", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkGreaterThan(String value) {
            addCriterion("tbi_remark >", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_remark >=", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkLessThan(String value) {
            addCriterion("tbi_remark <", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbi_remark <=", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkLike(String value) {
            addCriterion("tbi_remark like", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotLike(String value) {
            addCriterion("tbi_remark not like", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkIn(List<String> values) {
            addCriterion("tbi_remark in", values, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotIn(List<String> values) {
            addCriterion("tbi_remark not in", values, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkBetween(String value1, String value2) {
            addCriterion("tbi_remark between", value1, value2, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotBetween(String value1, String value2) {
            addCriterion("tbi_remark not between", value1, value2, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeIsNull() {
            addCriterion("tbi_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeIsNotNull() {
            addCriterion("tbi_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeEqualTo(Date value) {
            addCriterion("tbi_add_time =", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeNotEqualTo(Date value) {
            addCriterion("tbi_add_time <>", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeGreaterThan(Date value) {
            addCriterion("tbi_add_time >", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbi_add_time >=", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeLessThan(Date value) {
            addCriterion("tbi_add_time <", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbi_add_time <=", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeIn(List<Date> values) {
            addCriterion("tbi_add_time in", values, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeNotIn(List<Date> values) {
            addCriterion("tbi_add_time not in", values, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbi_add_time between", value1, value2, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbi_add_time not between", value1, value2, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiRelateIsNull() {
            addCriterion("tbi_relate is null");
            return (Criteria) this;
        }

        public Criteria andTbiRelateIsNotNull() {
            addCriterion("tbi_relate is not null");
            return (Criteria) this;
        }

        public Criteria andTbiRelateEqualTo(String value) {
            addCriterion("tbi_relate =", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateNotEqualTo(String value) {
            addCriterion("tbi_relate <>", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateGreaterThan(String value) {
            addCriterion("tbi_relate >", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_relate >=", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateLessThan(String value) {
            addCriterion("tbi_relate <", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateLessThanOrEqualTo(String value) {
            addCriterion("tbi_relate <=", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateLike(String value) {
            addCriterion("tbi_relate like", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateNotLike(String value) {
            addCriterion("tbi_relate not like", value, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateIn(List<String> values) {
            addCriterion("tbi_relate in", values, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateNotIn(List<String> values) {
            addCriterion("tbi_relate not in", values, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateBetween(String value1, String value2) {
            addCriterion("tbi_relate between", value1, value2, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiRelateNotBetween(String value1, String value2) {
            addCriterion("tbi_relate not between", value1, value2, "tbiRelate");
            return (Criteria) this;
        }

        public Criteria andTbiSerialIsNull() {
            addCriterion("tbi_serial is null");
            return (Criteria) this;
        }

        public Criteria andTbiSerialIsNotNull() {
            addCriterion("tbi_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTbiSerialEqualTo(String value) {
            addCriterion("tbi_serial =", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialNotEqualTo(String value) {
            addCriterion("tbi_serial <>", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialGreaterThan(String value) {
            addCriterion("tbi_serial >", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_serial >=", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialLessThan(String value) {
            addCriterion("tbi_serial <", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialLessThanOrEqualTo(String value) {
            addCriterion("tbi_serial <=", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialLike(String value) {
            addCriterion("tbi_serial like", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialNotLike(String value) {
            addCriterion("tbi_serial not like", value, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialIn(List<String> values) {
            addCriterion("tbi_serial in", values, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialNotIn(List<String> values) {
            addCriterion("tbi_serial not in", values, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialBetween(String value1, String value2) {
            addCriterion("tbi_serial between", value1, value2, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiSerialNotBetween(String value1, String value2) {
            addCriterion("tbi_serial not between", value1, value2, "tbiSerial");
            return (Criteria) this;
        }

        public Criteria andTbiEditorIsNull() {
            addCriterion("tbi_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbiEditorIsNotNull() {
            addCriterion("tbi_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbiEditorEqualTo(Integer value) {
            addCriterion("tbi_editor =", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorNotEqualTo(Integer value) {
            addCriterion("tbi_editor <>", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorGreaterThan(Integer value) {
            addCriterion("tbi_editor >", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_editor >=", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorLessThan(Integer value) {
            addCriterion("tbi_editor <", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_editor <=", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorIn(List<Integer> values) {
            addCriterion("tbi_editor in", values, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorNotIn(List<Integer> values) {
            addCriterion("tbi_editor not in", values, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbi_editor between", value1, value2, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_editor not between", value1, value2, "tbiEditor");
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