package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andTbaIdIsNull() {
            addCriterion("tba_id is null");
            return (Criteria) this;
        }

        public Criteria andTbaIdIsNotNull() {
            addCriterion("tba_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbaIdEqualTo(Integer value) {
            addCriterion("tba_id =", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotEqualTo(Integer value) {
            addCriterion("tba_id <>", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdGreaterThan(Integer value) {
            addCriterion("tba_id >", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_id >=", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdLessThan(Integer value) {
            addCriterion("tba_id <", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tba_id <=", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdIn(List<Integer> values) {
            addCriterion("tba_id in", values, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotIn(List<Integer> values) {
            addCriterion("tba_id not in", values, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdBetween(Integer value1, Integer value2) {
            addCriterion("tba_id between", value1, value2, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_id not between", value1, value2, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaMemberIsNull() {
            addCriterion("tba_member is null");
            return (Criteria) this;
        }

        public Criteria andTbaMemberIsNotNull() {
            addCriterion("tba_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbaMemberEqualTo(Integer value) {
            addCriterion("tba_member =", value, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberNotEqualTo(Integer value) {
            addCriterion("tba_member <>", value, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberGreaterThan(Integer value) {
            addCriterion("tba_member >", value, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_member >=", value, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberLessThan(Integer value) {
            addCriterion("tba_member <", value, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tba_member <=", value, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberIn(List<Integer> values) {
            addCriterion("tba_member in", values, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberNotIn(List<Integer> values) {
            addCriterion("tba_member not in", values, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberBetween(Integer value1, Integer value2) {
            addCriterion("tba_member between", value1, value2, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_member not between", value1, value2, "tbaMember");
            return (Criteria) this;
        }

        public Criteria andTbaDepositIsNull() {
            addCriterion("tba_deposit is null");
            return (Criteria) this;
        }

        public Criteria andTbaDepositIsNotNull() {
            addCriterion("tba_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andTbaDepositEqualTo(BigDecimal value) {
            addCriterion("tba_deposit =", value, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositNotEqualTo(BigDecimal value) {
            addCriterion("tba_deposit <>", value, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositGreaterThan(BigDecimal value) {
            addCriterion("tba_deposit >", value, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_deposit >=", value, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositLessThan(BigDecimal value) {
            addCriterion("tba_deposit <", value, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_deposit <=", value, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositIn(List<BigDecimal> values) {
            addCriterion("tba_deposit in", values, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositNotIn(List<BigDecimal> values) {
            addCriterion("tba_deposit not in", values, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_deposit between", value1, value2, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_deposit not between", value1, value2, "tbaDeposit");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyIsNull() {
            addCriterion("tba_money is null");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyIsNotNull() {
            addCriterion("tba_money is not null");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyEqualTo(BigDecimal value) {
            addCriterion("tba_money =", value, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyNotEqualTo(BigDecimal value) {
            addCriterion("tba_money <>", value, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyGreaterThan(BigDecimal value) {
            addCriterion("tba_money >", value, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_money >=", value, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyLessThan(BigDecimal value) {
            addCriterion("tba_money <", value, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_money <=", value, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyIn(List<BigDecimal> values) {
            addCriterion("tba_money in", values, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyNotIn(List<BigDecimal> values) {
            addCriterion("tba_money not in", values, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_money between", value1, value2, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_money not between", value1, value2, "tbaMoney");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitIsNull() {
            addCriterion("tba_long_depsit is null");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitIsNotNull() {
            addCriterion("tba_long_depsit is not null");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitEqualTo(Double value) {
            addCriterion("tba_long_depsit =", value, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitNotEqualTo(Double value) {
            addCriterion("tba_long_depsit <>", value, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitGreaterThan(Double value) {
            addCriterion("tba_long_depsit >", value, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitGreaterThanOrEqualTo(Double value) {
            addCriterion("tba_long_depsit >=", value, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitLessThan(Double value) {
            addCriterion("tba_long_depsit <", value, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitLessThanOrEqualTo(Double value) {
            addCriterion("tba_long_depsit <=", value, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitIn(List<Double> values) {
            addCriterion("tba_long_depsit in", values, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitNotIn(List<Double> values) {
            addCriterion("tba_long_depsit not in", values, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitBetween(Double value1, Double value2) {
            addCriterion("tba_long_depsit between", value1, value2, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaLongDepsitNotBetween(Double value1, Double value2) {
            addCriterion("tba_long_depsit not between", value1, value2, "tbaLongDepsit");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralIsNull() {
            addCriterion("tba_integral is null");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralIsNotNull() {
            addCriterion("tba_integral is not null");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralEqualTo(Integer value) {
            addCriterion("tba_integral =", value, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralNotEqualTo(Integer value) {
            addCriterion("tba_integral <>", value, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralGreaterThan(Integer value) {
            addCriterion("tba_integral >", value, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_integral >=", value, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralLessThan(Integer value) {
            addCriterion("tba_integral <", value, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("tba_integral <=", value, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralIn(List<Integer> values) {
            addCriterion("tba_integral in", values, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralNotIn(List<Integer> values) {
            addCriterion("tba_integral not in", values, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralBetween(Integer value1, Integer value2) {
            addCriterion("tba_integral between", value1, value2, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_integral not between", value1, value2, "tbaIntegral");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkIsNull() {
            addCriterion("tba_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkIsNotNull() {
            addCriterion("tba_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkEqualTo(String value) {
            addCriterion("tba_remark =", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkNotEqualTo(String value) {
            addCriterion("tba_remark <>", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkGreaterThan(String value) {
            addCriterion("tba_remark >", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tba_remark >=", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkLessThan(String value) {
            addCriterion("tba_remark <", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkLessThanOrEqualTo(String value) {
            addCriterion("tba_remark <=", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkLike(String value) {
            addCriterion("tba_remark like", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkNotLike(String value) {
            addCriterion("tba_remark not like", value, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkIn(List<String> values) {
            addCriterion("tba_remark in", values, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkNotIn(List<String> values) {
            addCriterion("tba_remark not in", values, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkBetween(String value1, String value2) {
            addCriterion("tba_remark between", value1, value2, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaRemarkNotBetween(String value1, String value2) {
            addCriterion("tba_remark not between", value1, value2, "tbaRemark");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIsNull() {
            addCriterion("tba_status is null");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIsNotNull() {
            addCriterion("tba_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbaStatusEqualTo(Byte value) {
            addCriterion("tba_status =", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotEqualTo(Byte value) {
            addCriterion("tba_status <>", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusGreaterThan(Byte value) {
            addCriterion("tba_status >", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tba_status >=", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusLessThan(Byte value) {
            addCriterion("tba_status <", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tba_status <=", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIn(List<Byte> values) {
            addCriterion("tba_status in", values, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotIn(List<Byte> values) {
            addCriterion("tba_status not in", values, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusBetween(Byte value1, Byte value2) {
            addCriterion("tba_status between", value1, value2, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tba_status not between", value1, value2, "tbaStatus");
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