package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderIndemnifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderIndemnifyExample() {
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

        public Criteria andTboiIdIsNull() {
            addCriterion("tboi_id is null");
            return (Criteria) this;
        }

        public Criteria andTboiIdIsNotNull() {
            addCriterion("tboi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTboiIdEqualTo(Long value) {
            addCriterion("tboi_id =", value, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdNotEqualTo(Long value) {
            addCriterion("tboi_id <>", value, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdGreaterThan(Long value) {
            addCriterion("tboi_id >", value, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tboi_id >=", value, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdLessThan(Long value) {
            addCriterion("tboi_id <", value, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdLessThanOrEqualTo(Long value) {
            addCriterion("tboi_id <=", value, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdIn(List<Long> values) {
            addCriterion("tboi_id in", values, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdNotIn(List<Long> values) {
            addCriterion("tboi_id not in", values, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdBetween(Long value1, Long value2) {
            addCriterion("tboi_id between", value1, value2, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiIdNotBetween(Long value1, Long value2) {
            addCriterion("tboi_id not between", value1, value2, "tboiId");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidIsNull() {
            addCriterion("tboi_orderid is null");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidIsNotNull() {
            addCriterion("tboi_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidEqualTo(String value) {
            addCriterion("tboi_orderid =", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidNotEqualTo(String value) {
            addCriterion("tboi_orderid <>", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidGreaterThan(String value) {
            addCriterion("tboi_orderid >", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("tboi_orderid >=", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidLessThan(String value) {
            addCriterion("tboi_orderid <", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidLessThanOrEqualTo(String value) {
            addCriterion("tboi_orderid <=", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidLike(String value) {
            addCriterion("tboi_orderid like", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidNotLike(String value) {
            addCriterion("tboi_orderid not like", value, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidIn(List<String> values) {
            addCriterion("tboi_orderid in", values, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidNotIn(List<String> values) {
            addCriterion("tboi_orderid not in", values, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidBetween(String value1, String value2) {
            addCriterion("tboi_orderid between", value1, value2, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiOrderidNotBetween(String value1, String value2) {
            addCriterion("tboi_orderid not between", value1, value2, "tboiOrderid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridIsNull() {
            addCriterion("tboi_userid is null");
            return (Criteria) this;
        }

        public Criteria andTboiUseridIsNotNull() {
            addCriterion("tboi_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTboiUseridEqualTo(Long value) {
            addCriterion("tboi_userid =", value, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridNotEqualTo(Long value) {
            addCriterion("tboi_userid <>", value, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridGreaterThan(Long value) {
            addCriterion("tboi_userid >", value, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("tboi_userid >=", value, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridLessThan(Long value) {
            addCriterion("tboi_userid <", value, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridLessThanOrEqualTo(Long value) {
            addCriterion("tboi_userid <=", value, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridIn(List<Long> values) {
            addCriterion("tboi_userid in", values, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridNotIn(List<Long> values) {
            addCriterion("tboi_userid not in", values, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridBetween(Long value1, Long value2) {
            addCriterion("tboi_userid between", value1, value2, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiUseridNotBetween(Long value1, Long value2) {
            addCriterion("tboi_userid not between", value1, value2, "tboiUserid");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoIsNull() {
            addCriterion("tboi_carno is null");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoIsNotNull() {
            addCriterion("tboi_carno is not null");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoEqualTo(String value) {
            addCriterion("tboi_carno =", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoNotEqualTo(String value) {
            addCriterion("tboi_carno <>", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoGreaterThan(String value) {
            addCriterion("tboi_carno >", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("tboi_carno >=", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoLessThan(String value) {
            addCriterion("tboi_carno <", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoLessThanOrEqualTo(String value) {
            addCriterion("tboi_carno <=", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoLike(String value) {
            addCriterion("tboi_carno like", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoNotLike(String value) {
            addCriterion("tboi_carno not like", value, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoIn(List<String> values) {
            addCriterion("tboi_carno in", values, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoNotIn(List<String> values) {
            addCriterion("tboi_carno not in", values, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoBetween(String value1, String value2) {
            addCriterion("tboi_carno between", value1, value2, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiCarnoNotBetween(String value1, String value2) {
            addCriterion("tboi_carno not between", value1, value2, "tboiCarno");
            return (Criteria) this;
        }

        public Criteria andTboiFaultIsNull() {
            addCriterion("tboi_fault is null");
            return (Criteria) this;
        }

        public Criteria andTboiFaultIsNotNull() {
            addCriterion("tboi_fault is not null");
            return (Criteria) this;
        }

        public Criteria andTboiFaultEqualTo(Short value) {
            addCriterion("tboi_fault =", value, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultNotEqualTo(Short value) {
            addCriterion("tboi_fault <>", value, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultGreaterThan(Short value) {
            addCriterion("tboi_fault >", value, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultGreaterThanOrEqualTo(Short value) {
            addCriterion("tboi_fault >=", value, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultLessThan(Short value) {
            addCriterion("tboi_fault <", value, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultLessThanOrEqualTo(Short value) {
            addCriterion("tboi_fault <=", value, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultIn(List<Short> values) {
            addCriterion("tboi_fault in", values, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultNotIn(List<Short> values) {
            addCriterion("tboi_fault not in", values, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultBetween(Short value1, Short value2) {
            addCriterion("tboi_fault between", value1, value2, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiFaultNotBetween(Short value1, Short value2) {
            addCriterion("tboi_fault not between", value1, value2, "tboiFault");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyIsNull() {
            addCriterion("tboi_money is null");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyIsNotNull() {
            addCriterion("tboi_money is not null");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyEqualTo(Double value) {
            addCriterion("tboi_money =", value, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyNotEqualTo(Double value) {
            addCriterion("tboi_money <>", value, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyGreaterThan(Double value) {
            addCriterion("tboi_money >", value, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tboi_money >=", value, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyLessThan(Double value) {
            addCriterion("tboi_money <", value, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tboi_money <=", value, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyIn(List<Double> values) {
            addCriterion("tboi_money in", values, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyNotIn(List<Double> values) {
            addCriterion("tboi_money not in", values, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyBetween(Double value1, Double value2) {
            addCriterion("tboi_money between", value1, value2, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tboi_money not between", value1, value2, "tboiMoney");
            return (Criteria) this;
        }

        public Criteria andTboiHeadIsNull() {
            addCriterion("tboi_head is null");
            return (Criteria) this;
        }

        public Criteria andTboiHeadIsNotNull() {
            addCriterion("tboi_head is not null");
            return (Criteria) this;
        }

        public Criteria andTboiHeadEqualTo(String value) {
            addCriterion("tboi_head =", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadNotEqualTo(String value) {
            addCriterion("tboi_head <>", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadGreaterThan(String value) {
            addCriterion("tboi_head >", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadGreaterThanOrEqualTo(String value) {
            addCriterion("tboi_head >=", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadLessThan(String value) {
            addCriterion("tboi_head <", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadLessThanOrEqualTo(String value) {
            addCriterion("tboi_head <=", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadLike(String value) {
            addCriterion("tboi_head like", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadNotLike(String value) {
            addCriterion("tboi_head not like", value, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadIn(List<String> values) {
            addCriterion("tboi_head in", values, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadNotIn(List<String> values) {
            addCriterion("tboi_head not in", values, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadBetween(String value1, String value2) {
            addCriterion("tboi_head between", value1, value2, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiHeadNotBetween(String value1, String value2) {
            addCriterion("tboi_head not between", value1, value2, "tboiHead");
            return (Criteria) this;
        }

        public Criteria andTboiStimeIsNull() {
            addCriterion("tboi_stime is null");
            return (Criteria) this;
        }

        public Criteria andTboiStimeIsNotNull() {
            addCriterion("tboi_stime is not null");
            return (Criteria) this;
        }

        public Criteria andTboiStimeEqualTo(Date value) {
            addCriterion("tboi_stime =", value, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeNotEqualTo(Date value) {
            addCriterion("tboi_stime <>", value, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeGreaterThan(Date value) {
            addCriterion("tboi_stime >", value, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboi_stime >=", value, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeLessThan(Date value) {
            addCriterion("tboi_stime <", value, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeLessThanOrEqualTo(Date value) {
            addCriterion("tboi_stime <=", value, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeIn(List<Date> values) {
            addCriterion("tboi_stime in", values, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeNotIn(List<Date> values) {
            addCriterion("tboi_stime not in", values, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeBetween(Date value1, Date value2) {
            addCriterion("tboi_stime between", value1, value2, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiStimeNotBetween(Date value1, Date value2) {
            addCriterion("tboi_stime not between", value1, value2, "tboiStime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeIsNull() {
            addCriterion("tboi_paytime is null");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeIsNotNull() {
            addCriterion("tboi_paytime is not null");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeEqualTo(Date value) {
            addCriterion("tboi_paytime =", value, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeNotEqualTo(Date value) {
            addCriterion("tboi_paytime <>", value, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeGreaterThan(Date value) {
            addCriterion("tboi_paytime >", value, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboi_paytime >=", value, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeLessThan(Date value) {
            addCriterion("tboi_paytime <", value, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("tboi_paytime <=", value, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeIn(List<Date> values) {
            addCriterion("tboi_paytime in", values, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeNotIn(List<Date> values) {
            addCriterion("tboi_paytime not in", values, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeBetween(Date value1, Date value2) {
            addCriterion("tboi_paytime between", value1, value2, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("tboi_paytime not between", value1, value2, "tboiPaytime");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusIsNull() {
            addCriterion("tboi_paystatus is null");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusIsNotNull() {
            addCriterion("tboi_paystatus is not null");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusEqualTo(Short value) {
            addCriterion("tboi_paystatus =", value, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusNotEqualTo(Short value) {
            addCriterion("tboi_paystatus <>", value, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusGreaterThan(Short value) {
            addCriterion("tboi_paystatus >", value, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tboi_paystatus >=", value, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusLessThan(Short value) {
            addCriterion("tboi_paystatus <", value, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusLessThanOrEqualTo(Short value) {
            addCriterion("tboi_paystatus <=", value, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusIn(List<Short> values) {
            addCriterion("tboi_paystatus in", values, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusNotIn(List<Short> values) {
            addCriterion("tboi_paystatus not in", values, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusBetween(Short value1, Short value2) {
            addCriterion("tboi_paystatus between", value1, value2, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiPaystatusNotBetween(Short value1, Short value2) {
            addCriterion("tboi_paystatus not between", value1, value2, "tboiPaystatus");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageIsNull() {
            addCriterion("tboi_relationmessage is null");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageIsNotNull() {
            addCriterion("tboi_relationmessage is not null");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageEqualTo(Long value) {
            addCriterion("tboi_relationmessage =", value, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageNotEqualTo(Long value) {
            addCriterion("tboi_relationmessage <>", value, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageGreaterThan(Long value) {
            addCriterion("tboi_relationmessage >", value, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageGreaterThanOrEqualTo(Long value) {
            addCriterion("tboi_relationmessage >=", value, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageLessThan(Long value) {
            addCriterion("tboi_relationmessage <", value, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageLessThanOrEqualTo(Long value) {
            addCriterion("tboi_relationmessage <=", value, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageIn(List<Long> values) {
            addCriterion("tboi_relationmessage in", values, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageNotIn(List<Long> values) {
            addCriterion("tboi_relationmessage not in", values, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageBetween(Long value1, Long value2) {
            addCriterion("tboi_relationmessage between", value1, value2, "tboiRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTboiRelationmessageNotBetween(Long value1, Long value2) {
            addCriterion("tboi_relationmessage not between", value1, value2, "tboiRelationmessage");
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