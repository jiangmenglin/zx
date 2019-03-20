package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andTboIdIsNull() {
            addCriterion("tbo_id is null");
            return (Criteria) this;
        }

        public Criteria andTboIdIsNotNull() {
            addCriterion("tbo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTboIdEqualTo(Long value) {
            addCriterion("tbo_id =", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdNotEqualTo(Long value) {
            addCriterion("tbo_id <>", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdGreaterThan(Long value) {
            addCriterion("tbo_id >", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbo_id >=", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdLessThan(Long value) {
            addCriterion("tbo_id <", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdLessThanOrEqualTo(Long value) {
            addCriterion("tbo_id <=", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdIn(List<Long> values) {
            addCriterion("tbo_id in", values, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdNotIn(List<Long> values) {
            addCriterion("tbo_id not in", values, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdBetween(Long value1, Long value2) {
            addCriterion("tbo_id between", value1, value2, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdNotBetween(Long value1, Long value2) {
            addCriterion("tbo_id not between", value1, value2, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboHostIsNull() {
            addCriterion("tbo_host is null");
            return (Criteria) this;
        }

        public Criteria andTboHostIsNotNull() {
            addCriterion("tbo_host is not null");
            return (Criteria) this;
        }

        public Criteria andTboHostEqualTo(Integer value) {
            addCriterion("tbo_host =", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostNotEqualTo(Integer value) {
            addCriterion("tbo_host <>", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostGreaterThan(Integer value) {
            addCriterion("tbo_host >", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_host >=", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostLessThan(Integer value) {
            addCriterion("tbo_host <", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_host <=", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostIn(List<Integer> values) {
            addCriterion("tbo_host in", values, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostNotIn(List<Integer> values) {
            addCriterion("tbo_host not in", values, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostBetween(Integer value1, Integer value2) {
            addCriterion("tbo_host between", value1, value2, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_host not between", value1, value2, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberIsNull() {
            addCriterion("tbo_pay_member is null");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberIsNotNull() {
            addCriterion("tbo_pay_member is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberEqualTo(Integer value) {
            addCriterion("tbo_pay_member =", value, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberNotEqualTo(Integer value) {
            addCriterion("tbo_pay_member <>", value, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberGreaterThan(Integer value) {
            addCriterion("tbo_pay_member >", value, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_pay_member >=", value, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberLessThan(Integer value) {
            addCriterion("tbo_pay_member <", value, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_pay_member <=", value, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberIn(List<Integer> values) {
            addCriterion("tbo_pay_member in", values, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberNotIn(List<Integer> values) {
            addCriterion("tbo_pay_member not in", values, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbo_pay_member between", value1, value2, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboPayMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_pay_member not between", value1, value2, "tboPayMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberIsNull() {
            addCriterion("tbo_use_member is null");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberIsNotNull() {
            addCriterion("tbo_use_member is not null");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberEqualTo(Integer value) {
            addCriterion("tbo_use_member =", value, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberNotEqualTo(Integer value) {
            addCriterion("tbo_use_member <>", value, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberGreaterThan(Integer value) {
            addCriterion("tbo_use_member >", value, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_use_member >=", value, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberLessThan(Integer value) {
            addCriterion("tbo_use_member <", value, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_use_member <=", value, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberIn(List<Integer> values) {
            addCriterion("tbo_use_member in", values, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberNotIn(List<Integer> values) {
            addCriterion("tbo_use_member not in", values, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbo_use_member between", value1, value2, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUseMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_use_member not between", value1, value2, "tboUseMember");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeIsNull() {
            addCriterion("tbo_user_type is null");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeIsNotNull() {
            addCriterion("tbo_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeEqualTo(Integer value) {
            addCriterion("tbo_user_type =", value, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeNotEqualTo(Integer value) {
            addCriterion("tbo_user_type <>", value, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeGreaterThan(Integer value) {
            addCriterion("tbo_user_type >", value, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_user_type >=", value, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeLessThan(Integer value) {
            addCriterion("tbo_user_type <", value, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_user_type <=", value, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeIn(List<Integer> values) {
            addCriterion("tbo_user_type in", values, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeNotIn(List<Integer> values) {
            addCriterion("tbo_user_type not in", values, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("tbo_user_type between", value1, value2, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_user_type not between", value1, value2, "tboUserType");
            return (Criteria) this;
        }

        public Criteria andTboCompanyIsNull() {
            addCriterion("tbo_company is null");
            return (Criteria) this;
        }

        public Criteria andTboCompanyIsNotNull() {
            addCriterion("tbo_company is not null");
            return (Criteria) this;
        }

        public Criteria andTboCompanyEqualTo(Integer value) {
            addCriterion("tbo_company =", value, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyNotEqualTo(Integer value) {
            addCriterion("tbo_company <>", value, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyGreaterThan(Integer value) {
            addCriterion("tbo_company >", value, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_company >=", value, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyLessThan(Integer value) {
            addCriterion("tbo_company <", value, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_company <=", value, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyIn(List<Integer> values) {
            addCriterion("tbo_company in", values, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyNotIn(List<Integer> values) {
            addCriterion("tbo_company not in", values, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyBetween(Integer value1, Integer value2) {
            addCriterion("tbo_company between", value1, value2, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_company not between", value1, value2, "tboCompany");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeIsNull() {
            addCriterion("tbo_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeIsNotNull() {
            addCriterion("tbo_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeEqualTo(Integer value) {
            addCriterion("tbo_fee_type =", value, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeNotEqualTo(Integer value) {
            addCriterion("tbo_fee_type <>", value, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeGreaterThan(Integer value) {
            addCriterion("tbo_fee_type >", value, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_fee_type >=", value, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeLessThan(Integer value) {
            addCriterion("tbo_fee_type <", value, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_fee_type <=", value, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeIn(List<Integer> values) {
            addCriterion("tbo_fee_type in", values, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeNotIn(List<Integer> values) {
            addCriterion("tbo_fee_type not in", values, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("tbo_fee_type between", value1, value2, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboFeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_fee_type not between", value1, value2, "tboFeeType");
            return (Criteria) this;
        }

        public Criteria andTboAreaIsNull() {
            addCriterion("tbo_area is null");
            return (Criteria) this;
        }

        public Criteria andTboAreaIsNotNull() {
            addCriterion("tbo_area is not null");
            return (Criteria) this;
        }

        public Criteria andTboAreaEqualTo(Integer value) {
            addCriterion("tbo_area =", value, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaNotEqualTo(Integer value) {
            addCriterion("tbo_area <>", value, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaGreaterThan(Integer value) {
            addCriterion("tbo_area >", value, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_area >=", value, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaLessThan(Integer value) {
            addCriterion("tbo_area <", value, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_area <=", value, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaIn(List<Integer> values) {
            addCriterion("tbo_area in", values, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaNotIn(List<Integer> values) {
            addCriterion("tbo_area not in", values, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaBetween(Integer value1, Integer value2) {
            addCriterion("tbo_area between", value1, value2, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_area not between", value1, value2, "tboArea");
            return (Criteria) this;
        }

        public Criteria andTboOutletsIsNull() {
            addCriterion("tbo_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTboOutletsIsNotNull() {
            addCriterion("tbo_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTboOutletsEqualTo(Integer value) {
            addCriterion("tbo_outlets =", value, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsNotEqualTo(Integer value) {
            addCriterion("tbo_outlets <>", value, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsGreaterThan(Integer value) {
            addCriterion("tbo_outlets >", value, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_outlets >=", value, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsLessThan(Integer value) {
            addCriterion("tbo_outlets <", value, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_outlets <=", value, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsIn(List<Integer> values) {
            addCriterion("tbo_outlets in", values, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsNotIn(List<Integer> values) {
            addCriterion("tbo_outlets not in", values, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsBetween(Integer value1, Integer value2) {
            addCriterion("tbo_outlets between", value1, value2, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboOutletsNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_outlets not between", value1, value2, "tboOutlets");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaIsNull() {
            addCriterion("tbo_ret_area is null");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaIsNotNull() {
            addCriterion("tbo_ret_area is not null");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaEqualTo(Integer value) {
            addCriterion("tbo_ret_area =", value, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaNotEqualTo(Integer value) {
            addCriterion("tbo_ret_area <>", value, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaGreaterThan(Integer value) {
            addCriterion("tbo_ret_area >", value, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_ret_area >=", value, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaLessThan(Integer value) {
            addCriterion("tbo_ret_area <", value, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_ret_area <=", value, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaIn(List<Integer> values) {
            addCriterion("tbo_ret_area in", values, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaNotIn(List<Integer> values) {
            addCriterion("tbo_ret_area not in", values, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaBetween(Integer value1, Integer value2) {
            addCriterion("tbo_ret_area between", value1, value2, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboRetAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_ret_area not between", value1, value2, "tboRetArea");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetIsNull() {
            addCriterion("tbo_outlets_ret is null");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetIsNotNull() {
            addCriterion("tbo_outlets_ret is not null");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetEqualTo(Integer value) {
            addCriterion("tbo_outlets_ret =", value, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetNotEqualTo(Integer value) {
            addCriterion("tbo_outlets_ret <>", value, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetGreaterThan(Integer value) {
            addCriterion("tbo_outlets_ret >", value, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_outlets_ret >=", value, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetLessThan(Integer value) {
            addCriterion("tbo_outlets_ret <", value, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_outlets_ret <=", value, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetIn(List<Integer> values) {
            addCriterion("tbo_outlets_ret in", values, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetNotIn(List<Integer> values) {
            addCriterion("tbo_outlets_ret not in", values, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetBetween(Integer value1, Integer value2) {
            addCriterion("tbo_outlets_ret between", value1, value2, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboOutletsRetNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_outlets_ret not between", value1, value2, "tboOutletsRet");
            return (Criteria) this;
        }

        public Criteria andTboCarIsNull() {
            addCriterion("tbo_car is null");
            return (Criteria) this;
        }

        public Criteria andTboCarIsNotNull() {
            addCriterion("tbo_car is not null");
            return (Criteria) this;
        }

        public Criteria andTboCarEqualTo(Integer value) {
            addCriterion("tbo_car =", value, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarNotEqualTo(Integer value) {
            addCriterion("tbo_car <>", value, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarGreaterThan(Integer value) {
            addCriterion("tbo_car >", value, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_car >=", value, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarLessThan(Integer value) {
            addCriterion("tbo_car <", value, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_car <=", value, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarIn(List<Integer> values) {
            addCriterion("tbo_car in", values, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarNotIn(List<Integer> values) {
            addCriterion("tbo_car not in", values, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarBetween(Integer value1, Integer value2) {
            addCriterion("tbo_car between", value1, value2, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboCarNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_car not between", value1, value2, "tboCar");
            return (Criteria) this;
        }

        public Criteria andTboModelIsNull() {
            addCriterion("tbo_model is null");
            return (Criteria) this;
        }

        public Criteria andTboModelIsNotNull() {
            addCriterion("tbo_model is not null");
            return (Criteria) this;
        }

        public Criteria andTboModelEqualTo(Integer value) {
            addCriterion("tbo_model =", value, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelNotEqualTo(Integer value) {
            addCriterion("tbo_model <>", value, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelGreaterThan(Integer value) {
            addCriterion("tbo_model >", value, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_model >=", value, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelLessThan(Integer value) {
            addCriterion("tbo_model <", value, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_model <=", value, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelIn(List<Integer> values) {
            addCriterion("tbo_model in", values, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelNotIn(List<Integer> values) {
            addCriterion("tbo_model not in", values, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelBetween(Integer value1, Integer value2) {
            addCriterion("tbo_model between", value1, value2, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboModelNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_model not between", value1, value2, "tboModel");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeIsNull() {
            addCriterion("tbo_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeIsNotNull() {
            addCriterion("tbo_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeEqualTo(Date value) {
            addCriterion("tbo_start_time =", value, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeNotEqualTo(Date value) {
            addCriterion("tbo_start_time <>", value, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeGreaterThan(Date value) {
            addCriterion("tbo_start_time >", value, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_start_time >=", value, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeLessThan(Date value) {
            addCriterion("tbo_start_time <", value, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_start_time <=", value, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeIn(List<Date> values) {
            addCriterion("tbo_start_time in", values, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeNotIn(List<Date> values) {
            addCriterion("tbo_start_time not in", values, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_start_time between", value1, value2, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_start_time not between", value1, value2, "tboStartTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeIsNull() {
            addCriterion("tbo_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeIsNotNull() {
            addCriterion("tbo_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeEqualTo(Date value) {
            addCriterion("tbo_finish_time =", value, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeNotEqualTo(Date value) {
            addCriterion("tbo_finish_time <>", value, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeGreaterThan(Date value) {
            addCriterion("tbo_finish_time >", value, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_finish_time >=", value, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeLessThan(Date value) {
            addCriterion("tbo_finish_time <", value, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_finish_time <=", value, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeIn(List<Date> values) {
            addCriterion("tbo_finish_time in", values, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeNotIn(List<Date> values) {
            addCriterion("tbo_finish_time not in", values, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_finish_time between", value1, value2, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_finish_time not between", value1, value2, "tboFinishTime");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeIsNull() {
            addCriterion("tbo_use_type is null");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeIsNotNull() {
            addCriterion("tbo_use_type is not null");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeEqualTo(Byte value) {
            addCriterion("tbo_use_type =", value, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeNotEqualTo(Byte value) {
            addCriterion("tbo_use_type <>", value, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeGreaterThan(Byte value) {
            addCriterion("tbo_use_type >", value, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_use_type >=", value, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeLessThan(Byte value) {
            addCriterion("tbo_use_type <", value, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_use_type <=", value, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeIn(List<Byte> values) {
            addCriterion("tbo_use_type in", values, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeNotIn(List<Byte> values) {
            addCriterion("tbo_use_type not in", values, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbo_use_type between", value1, value2, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboUseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_use_type not between", value1, value2, "tboUseType");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeIsNull() {
            addCriterion("tbo_take_time is null");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeIsNotNull() {
            addCriterion("tbo_take_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeEqualTo(Date value) {
            addCriterion("tbo_take_time =", value, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeNotEqualTo(Date value) {
            addCriterion("tbo_take_time <>", value, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeGreaterThan(Date value) {
            addCriterion("tbo_take_time >", value, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_take_time >=", value, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeLessThan(Date value) {
            addCriterion("tbo_take_time <", value, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_take_time <=", value, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeIn(List<Date> values) {
            addCriterion("tbo_take_time in", values, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeNotIn(List<Date> values) {
            addCriterion("tbo_take_time not in", values, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_take_time between", value1, value2, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboTakeTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_take_time not between", value1, value2, "tboTakeTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeIsNull() {
            addCriterion("tbo_ret_time is null");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeIsNotNull() {
            addCriterion("tbo_ret_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeEqualTo(Date value) {
            addCriterion("tbo_ret_time =", value, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeNotEqualTo(Date value) {
            addCriterion("tbo_ret_time <>", value, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeGreaterThan(Date value) {
            addCriterion("tbo_ret_time >", value, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_ret_time >=", value, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeLessThan(Date value) {
            addCriterion("tbo_ret_time <", value, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_ret_time <=", value, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeIn(List<Date> values) {
            addCriterion("tbo_ret_time in", values, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeNotIn(List<Date> values) {
            addCriterion("tbo_ret_time not in", values, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_ret_time between", value1, value2, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboRetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_ret_time not between", value1, value2, "tboRetTime");
            return (Criteria) this;
        }

        public Criteria andTboDurationIsNull() {
            addCriterion("tbo_duration is null");
            return (Criteria) this;
        }

        public Criteria andTboDurationIsNotNull() {
            addCriterion("tbo_duration is not null");
            return (Criteria) this;
        }

        public Criteria andTboDurationEqualTo(Double value) {
            addCriterion("tbo_duration =", value, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationNotEqualTo(Double value) {
            addCriterion("tbo_duration <>", value, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationGreaterThan(Double value) {
            addCriterion("tbo_duration >", value, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_duration >=", value, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationLessThan(Double value) {
            addCriterion("tbo_duration <", value, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationLessThanOrEqualTo(Double value) {
            addCriterion("tbo_duration <=", value, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationIn(List<Double> values) {
            addCriterion("tbo_duration in", values, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationNotIn(List<Double> values) {
            addCriterion("tbo_duration not in", values, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationBetween(Double value1, Double value2) {
            addCriterion("tbo_duration between", value1, value2, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboDurationNotBetween(Double value1, Double value2) {
            addCriterion("tbo_duration not between", value1, value2, "tboDuration");
            return (Criteria) this;
        }

        public Criteria andTboKmIsNull() {
            addCriterion("tbo_km is null");
            return (Criteria) this;
        }

        public Criteria andTboKmIsNotNull() {
            addCriterion("tbo_km is not null");
            return (Criteria) this;
        }

        public Criteria andTboKmEqualTo(Double value) {
            addCriterion("tbo_km =", value, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmNotEqualTo(Double value) {
            addCriterion("tbo_km <>", value, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmGreaterThan(Double value) {
            addCriterion("tbo_km >", value, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_km >=", value, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmLessThan(Double value) {
            addCriterion("tbo_km <", value, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmLessThanOrEqualTo(Double value) {
            addCriterion("tbo_km <=", value, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmIn(List<Double> values) {
            addCriterion("tbo_km in", values, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmNotIn(List<Double> values) {
            addCriterion("tbo_km not in", values, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmBetween(Double value1, Double value2) {
            addCriterion("tbo_km between", value1, value2, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboKmNotBetween(Double value1, Double value2) {
            addCriterion("tbo_km not between", value1, value2, "tboKm");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardIsNull() {
            addCriterion("tbo_credit_card is null");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardIsNotNull() {
            addCriterion("tbo_credit_card is not null");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardEqualTo(Long value) {
            addCriterion("tbo_credit_card =", value, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardNotEqualTo(Long value) {
            addCriterion("tbo_credit_card <>", value, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardGreaterThan(Long value) {
            addCriterion("tbo_credit_card >", value, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardGreaterThanOrEqualTo(Long value) {
            addCriterion("tbo_credit_card >=", value, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardLessThan(Long value) {
            addCriterion("tbo_credit_card <", value, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardLessThanOrEqualTo(Long value) {
            addCriterion("tbo_credit_card <=", value, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardIn(List<Long> values) {
            addCriterion("tbo_credit_card in", values, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardNotIn(List<Long> values) {
            addCriterion("tbo_credit_card not in", values, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardBetween(Long value1, Long value2) {
            addCriterion("tbo_credit_card between", value1, value2, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditCardNotBetween(Long value1, Long value2) {
            addCriterion("tbo_credit_card not between", value1, value2, "tboCreditCard");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillIsNull() {
            addCriterion("tbo_credit_bill is null");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillIsNotNull() {
            addCriterion("tbo_credit_bill is not null");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillEqualTo(Long value) {
            addCriterion("tbo_credit_bill =", value, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillNotEqualTo(Long value) {
            addCriterion("tbo_credit_bill <>", value, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillGreaterThan(Long value) {
            addCriterion("tbo_credit_bill >", value, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillGreaterThanOrEqualTo(Long value) {
            addCriterion("tbo_credit_bill >=", value, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillLessThan(Long value) {
            addCriterion("tbo_credit_bill <", value, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillLessThanOrEqualTo(Long value) {
            addCriterion("tbo_credit_bill <=", value, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillIn(List<Long> values) {
            addCriterion("tbo_credit_bill in", values, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillNotIn(List<Long> values) {
            addCriterion("tbo_credit_bill not in", values, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillBetween(Long value1, Long value2) {
            addCriterion("tbo_credit_bill between", value1, value2, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboCreditBillNotBetween(Long value1, Long value2) {
            addCriterion("tbo_credit_bill not between", value1, value2, "tboCreditBill");
            return (Criteria) this;
        }

        public Criteria andTboRebateIsNull() {
            addCriterion("tbo_rebate is null");
            return (Criteria) this;
        }

        public Criteria andTboRebateIsNotNull() {
            addCriterion("tbo_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andTboRebateEqualTo(Double value) {
            addCriterion("tbo_rebate =", value, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateNotEqualTo(Double value) {
            addCriterion("tbo_rebate <>", value, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateGreaterThan(Double value) {
            addCriterion("tbo_rebate >", value, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_rebate >=", value, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateLessThan(Double value) {
            addCriterion("tbo_rebate <", value, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateLessThanOrEqualTo(Double value) {
            addCriterion("tbo_rebate <=", value, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateIn(List<Double> values) {
            addCriterion("tbo_rebate in", values, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateNotIn(List<Double> values) {
            addCriterion("tbo_rebate not in", values, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateBetween(Double value1, Double value2) {
            addCriterion("tbo_rebate between", value1, value2, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboRebateNotBetween(Double value1, Double value2) {
            addCriterion("tbo_rebate not between", value1, value2, "tboRebate");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedIsNull() {
            addCriterion("tbo_pay_need is null");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedIsNotNull() {
            addCriterion("tbo_pay_need is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedEqualTo(Double value) {
            addCriterion("tbo_pay_need =", value, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedNotEqualTo(Double value) {
            addCriterion("tbo_pay_need <>", value, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedGreaterThan(Double value) {
            addCriterion("tbo_pay_need >", value, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_need >=", value, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedLessThan(Double value) {
            addCriterion("tbo_pay_need <", value, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_need <=", value, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedIn(List<Double> values) {
            addCriterion("tbo_pay_need in", values, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedNotIn(List<Double> values) {
            addCriterion("tbo_pay_need not in", values, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_need between", value1, value2, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboPayNeedNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_need not between", value1, value2, "tboPayNeed");
            return (Criteria) this;
        }

        public Criteria andTboDiscountIsNull() {
            addCriterion("tbo_discount is null");
            return (Criteria) this;
        }

        public Criteria andTboDiscountIsNotNull() {
            addCriterion("tbo_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTboDiscountEqualTo(Double value) {
            addCriterion("tbo_discount =", value, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountNotEqualTo(Double value) {
            addCriterion("tbo_discount <>", value, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountGreaterThan(Double value) {
            addCriterion("tbo_discount >", value, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_discount >=", value, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountLessThan(Double value) {
            addCriterion("tbo_discount <", value, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountLessThanOrEqualTo(Double value) {
            addCriterion("tbo_discount <=", value, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountIn(List<Double> values) {
            addCriterion("tbo_discount in", values, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountNotIn(List<Double> values) {
            addCriterion("tbo_discount not in", values, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountBetween(Double value1, Double value2) {
            addCriterion("tbo_discount between", value1, value2, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountNotBetween(Double value1, Double value2) {
            addCriterion("tbo_discount not between", value1, value2, "tboDiscount");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescIsNull() {
            addCriterion("tbo_discount_desc is null");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescIsNotNull() {
            addCriterion("tbo_discount_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescEqualTo(String value) {
            addCriterion("tbo_discount_desc =", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescNotEqualTo(String value) {
            addCriterion("tbo_discount_desc <>", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescGreaterThan(String value) {
            addCriterion("tbo_discount_desc >", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_discount_desc >=", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescLessThan(String value) {
            addCriterion("tbo_discount_desc <", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescLessThanOrEqualTo(String value) {
            addCriterion("tbo_discount_desc <=", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescLike(String value) {
            addCriterion("tbo_discount_desc like", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescNotLike(String value) {
            addCriterion("tbo_discount_desc not like", value, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescIn(List<String> values) {
            addCriterion("tbo_discount_desc in", values, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescNotIn(List<String> values) {
            addCriterion("tbo_discount_desc not in", values, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescBetween(String value1, String value2) {
            addCriterion("tbo_discount_desc between", value1, value2, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboDiscountDescNotBetween(String value1, String value2) {
            addCriterion("tbo_discount_desc not between", value1, value2, "tboDiscountDesc");
            return (Criteria) this;
        }

        public Criteria andTboPayRealIsNull() {
            addCriterion("tbo_pay_real is null");
            return (Criteria) this;
        }

        public Criteria andTboPayRealIsNotNull() {
            addCriterion("tbo_pay_real is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayRealEqualTo(Double value) {
            addCriterion("tbo_pay_real =", value, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealNotEqualTo(Double value) {
            addCriterion("tbo_pay_real <>", value, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealGreaterThan(Double value) {
            addCriterion("tbo_pay_real >", value, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_real >=", value, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealLessThan(Double value) {
            addCriterion("tbo_pay_real <", value, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_real <=", value, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealIn(List<Double> values) {
            addCriterion("tbo_pay_real in", values, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealNotIn(List<Double> values) {
            addCriterion("tbo_pay_real not in", values, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_real between", value1, value2, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayRealNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_real not between", value1, value2, "tboPayReal");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyIsNull() {
            addCriterion("tbo_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyIsNotNull() {
            addCriterion("tbo_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyEqualTo(Double value) {
            addCriterion("tbo_pay_money =", value, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyNotEqualTo(Double value) {
            addCriterion("tbo_pay_money <>", value, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyGreaterThan(Double value) {
            addCriterion("tbo_pay_money >", value, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_money >=", value, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyLessThan(Double value) {
            addCriterion("tbo_pay_money <", value, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_money <=", value, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyIn(List<Double> values) {
            addCriterion("tbo_pay_money in", values, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyNotIn(List<Double> values) {
            addCriterion("tbo_pay_money not in", values, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_money between", value1, value2, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_money not between", value1, value2, "tboPayMoney");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponIsNull() {
            addCriterion("tbo_pay_coupon is null");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponIsNotNull() {
            addCriterion("tbo_pay_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponEqualTo(Double value) {
            addCriterion("tbo_pay_coupon =", value, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponNotEqualTo(Double value) {
            addCriterion("tbo_pay_coupon <>", value, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponGreaterThan(Double value) {
            addCriterion("tbo_pay_coupon >", value, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_coupon >=", value, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponLessThan(Double value) {
            addCriterion("tbo_pay_coupon <", value, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_coupon <=", value, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponIn(List<Double> values) {
            addCriterion("tbo_pay_coupon in", values, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponNotIn(List<Double> values) {
            addCriterion("tbo_pay_coupon not in", values, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_coupon between", value1, value2, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayCouponNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_coupon not between", value1, value2, "tboPayCoupon");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomIsNull() {
            addCriterion("tbo_pay_kilom is null");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomIsNotNull() {
            addCriterion("tbo_pay_kilom is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomEqualTo(Double value) {
            addCriterion("tbo_pay_kilom =", value, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomNotEqualTo(Double value) {
            addCriterion("tbo_pay_kilom <>", value, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomGreaterThan(Double value) {
            addCriterion("tbo_pay_kilom >", value, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_kilom >=", value, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomLessThan(Double value) {
            addCriterion("tbo_pay_kilom <", value, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_kilom <=", value, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomIn(List<Double> values) {
            addCriterion("tbo_pay_kilom in", values, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomNotIn(List<Double> values) {
            addCriterion("tbo_pay_kilom not in", values, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_kilom between", value1, value2, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayKilomNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_kilom not between", value1, value2, "tboPayKilom");
            return (Criteria) this;
        }

        public Criteria andTboPayRentIsNull() {
            addCriterion("tbo_pay_rent is null");
            return (Criteria) this;
        }

        public Criteria andTboPayRentIsNotNull() {
            addCriterion("tbo_pay_rent is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayRentEqualTo(Double value) {
            addCriterion("tbo_pay_rent =", value, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentNotEqualTo(Double value) {
            addCriterion("tbo_pay_rent <>", value, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentGreaterThan(Double value) {
            addCriterion("tbo_pay_rent >", value, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_rent >=", value, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentLessThan(Double value) {
            addCriterion("tbo_pay_rent <", value, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_rent <=", value, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentIn(List<Double> values) {
            addCriterion("tbo_pay_rent in", values, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentNotIn(List<Double> values) {
            addCriterion("tbo_pay_rent not in", values, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_rent between", value1, value2, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayRentNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_rent not between", value1, value2, "tboPayRent");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureIsNull() {
            addCriterion("tbo_pay_insure is null");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureIsNotNull() {
            addCriterion("tbo_pay_insure is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureEqualTo(Double value) {
            addCriterion("tbo_pay_insure =", value, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureNotEqualTo(Double value) {
            addCriterion("tbo_pay_insure <>", value, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureGreaterThan(Double value) {
            addCriterion("tbo_pay_insure >", value, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_insure >=", value, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureLessThan(Double value) {
            addCriterion("tbo_pay_insure <", value, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_insure <=", value, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureIn(List<Double> values) {
            addCriterion("tbo_pay_insure in", values, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureNotIn(List<Double> values) {
            addCriterion("tbo_pay_insure not in", values, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_insure between", value1, value2, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayInsureNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_insure not between", value1, value2, "tboPayInsure");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutIsNull() {
            addCriterion("tbo_pay_timeout is null");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutIsNotNull() {
            addCriterion("tbo_pay_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutEqualTo(Double value) {
            addCriterion("tbo_pay_timeout =", value, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutNotEqualTo(Double value) {
            addCriterion("tbo_pay_timeout <>", value, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutGreaterThan(Double value) {
            addCriterion("tbo_pay_timeout >", value, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_timeout >=", value, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutLessThan(Double value) {
            addCriterion("tbo_pay_timeout <", value, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutLessThanOrEqualTo(Double value) {
            addCriterion("tbo_pay_timeout <=", value, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutIn(List<Double> values) {
            addCriterion("tbo_pay_timeout in", values, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutNotIn(List<Double> values) {
            addCriterion("tbo_pay_timeout not in", values, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_timeout between", value1, value2, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeoutNotBetween(Double value1, Double value2) {
            addCriterion("tbo_pay_timeout not between", value1, value2, "tboPayTimeout");
            return (Criteria) this;
        }

        public Criteria andTboRefundIsNull() {
            addCriterion("tbo_refund is null");
            return (Criteria) this;
        }

        public Criteria andTboRefundIsNotNull() {
            addCriterion("tbo_refund is not null");
            return (Criteria) this;
        }

        public Criteria andTboRefundEqualTo(Double value) {
            addCriterion("tbo_refund =", value, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundNotEqualTo(Double value) {
            addCriterion("tbo_refund <>", value, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundGreaterThan(Double value) {
            addCriterion("tbo_refund >", value, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_refund >=", value, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundLessThan(Double value) {
            addCriterion("tbo_refund <", value, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundLessThanOrEqualTo(Double value) {
            addCriterion("tbo_refund <=", value, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundIn(List<Double> values) {
            addCriterion("tbo_refund in", values, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundNotIn(List<Double> values) {
            addCriterion("tbo_refund not in", values, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundBetween(Double value1, Double value2) {
            addCriterion("tbo_refund between", value1, value2, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundNotBetween(Double value1, Double value2) {
            addCriterion("tbo_refund not between", value1, value2, "tboRefund");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescIsNull() {
            addCriterion("tbo_refund_desc is null");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescIsNotNull() {
            addCriterion("tbo_refund_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescEqualTo(String value) {
            addCriterion("tbo_refund_desc =", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescNotEqualTo(String value) {
            addCriterion("tbo_refund_desc <>", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescGreaterThan(String value) {
            addCriterion("tbo_refund_desc >", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_refund_desc >=", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescLessThan(String value) {
            addCriterion("tbo_refund_desc <", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescLessThanOrEqualTo(String value) {
            addCriterion("tbo_refund_desc <=", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescLike(String value) {
            addCriterion("tbo_refund_desc like", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescNotLike(String value) {
            addCriterion("tbo_refund_desc not like", value, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescIn(List<String> values) {
            addCriterion("tbo_refund_desc in", values, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescNotIn(List<String> values) {
            addCriterion("tbo_refund_desc not in", values, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescBetween(String value1, String value2) {
            addCriterion("tbo_refund_desc between", value1, value2, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboRefundDescNotBetween(String value1, String value2) {
            addCriterion("tbo_refund_desc not between", value1, value2, "tboRefundDesc");
            return (Criteria) this;
        }

        public Criteria andTboIncomeIsNull() {
            addCriterion("tbo_income is null");
            return (Criteria) this;
        }

        public Criteria andTboIncomeIsNotNull() {
            addCriterion("tbo_income is not null");
            return (Criteria) this;
        }

        public Criteria andTboIncomeEqualTo(Byte value) {
            addCriterion("tbo_income =", value, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeNotEqualTo(Byte value) {
            addCriterion("tbo_income <>", value, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeGreaterThan(Byte value) {
            addCriterion("tbo_income >", value, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_income >=", value, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeLessThan(Byte value) {
            addCriterion("tbo_income <", value, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_income <=", value, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeIn(List<Byte> values) {
            addCriterion("tbo_income in", values, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeNotIn(List<Byte> values) {
            addCriterion("tbo_income not in", values, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeBetween(Byte value1, Byte value2) {
            addCriterion("tbo_income between", value1, value2, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboIncomeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_income not between", value1, value2, "tboIncome");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexIsNull() {
            addCriterion("tbo_use_index is null");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexIsNotNull() {
            addCriterion("tbo_use_index is not null");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexEqualTo(Integer value) {
            addCriterion("tbo_use_index =", value, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexNotEqualTo(Integer value) {
            addCriterion("tbo_use_index <>", value, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexGreaterThan(Integer value) {
            addCriterion("tbo_use_index >", value, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_use_index >=", value, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexLessThan(Integer value) {
            addCriterion("tbo_use_index <", value, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_use_index <=", value, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexIn(List<Integer> values) {
            addCriterion("tbo_use_index in", values, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexNotIn(List<Integer> values) {
            addCriterion("tbo_use_index not in", values, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexBetween(Integer value1, Integer value2) {
            addCriterion("tbo_use_index between", value1, value2, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboUseIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_use_index not between", value1, value2, "tboUseIndex");
            return (Criteria) this;
        }

        public Criteria andTboNoIsNull() {
            addCriterion("tbo_no is null");
            return (Criteria) this;
        }

        public Criteria andTboNoIsNotNull() {
            addCriterion("tbo_no is not null");
            return (Criteria) this;
        }

        public Criteria andTboNoEqualTo(String value) {
            addCriterion("tbo_no =", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoNotEqualTo(String value) {
            addCriterion("tbo_no <>", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoGreaterThan(String value) {
            addCriterion("tbo_no >", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_no >=", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoLessThan(String value) {
            addCriterion("tbo_no <", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoLessThanOrEqualTo(String value) {
            addCriterion("tbo_no <=", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoLike(String value) {
            addCriterion("tbo_no like", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoNotLike(String value) {
            addCriterion("tbo_no not like", value, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoIn(List<String> values) {
            addCriterion("tbo_no in", values, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoNotIn(List<String> values) {
            addCriterion("tbo_no not in", values, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoBetween(String value1, String value2) {
            addCriterion("tbo_no between", value1, value2, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboNoNotBetween(String value1, String value2) {
            addCriterion("tbo_no not between", value1, value2, "tboNo");
            return (Criteria) this;
        }

        public Criteria andTboFlagIsNull() {
            addCriterion("tbo_flag is null");
            return (Criteria) this;
        }

        public Criteria andTboFlagIsNotNull() {
            addCriterion("tbo_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTboFlagEqualTo(Long value) {
            addCriterion("tbo_flag =", value, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagNotEqualTo(Long value) {
            addCriterion("tbo_flag <>", value, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagGreaterThan(Long value) {
            addCriterion("tbo_flag >", value, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("tbo_flag >=", value, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagLessThan(Long value) {
            addCriterion("tbo_flag <", value, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagLessThanOrEqualTo(Long value) {
            addCriterion("tbo_flag <=", value, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagIn(List<Long> values) {
            addCriterion("tbo_flag in", values, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagNotIn(List<Long> values) {
            addCriterion("tbo_flag not in", values, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagBetween(Long value1, Long value2) {
            addCriterion("tbo_flag between", value1, value2, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboFlagNotBetween(Long value1, Long value2) {
            addCriterion("tbo_flag not between", value1, value2, "tboFlag");
            return (Criteria) this;
        }

        public Criteria andTboTagIsNull() {
            addCriterion("tbo_tag is null");
            return (Criteria) this;
        }

        public Criteria andTboTagIsNotNull() {
            addCriterion("tbo_tag is not null");
            return (Criteria) this;
        }

        public Criteria andTboTagEqualTo(String value) {
            addCriterion("tbo_tag =", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagNotEqualTo(String value) {
            addCriterion("tbo_tag <>", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagGreaterThan(String value) {
            addCriterion("tbo_tag >", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_tag >=", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagLessThan(String value) {
            addCriterion("tbo_tag <", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagLessThanOrEqualTo(String value) {
            addCriterion("tbo_tag <=", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagLike(String value) {
            addCriterion("tbo_tag like", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagNotLike(String value) {
            addCriterion("tbo_tag not like", value, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagIn(List<String> values) {
            addCriterion("tbo_tag in", values, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagNotIn(List<String> values) {
            addCriterion("tbo_tag not in", values, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagBetween(String value1, String value2) {
            addCriterion("tbo_tag between", value1, value2, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboTagNotBetween(String value1, String value2) {
            addCriterion("tbo_tag not between", value1, value2, "tboTag");
            return (Criteria) this;
        }

        public Criteria andTboSrcIsNull() {
            addCriterion("tbo_src is null");
            return (Criteria) this;
        }

        public Criteria andTboSrcIsNotNull() {
            addCriterion("tbo_src is not null");
            return (Criteria) this;
        }

        public Criteria andTboSrcEqualTo(String value) {
            addCriterion("tbo_src =", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcNotEqualTo(String value) {
            addCriterion("tbo_src <>", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcGreaterThan(String value) {
            addCriterion("tbo_src >", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_src >=", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcLessThan(String value) {
            addCriterion("tbo_src <", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcLessThanOrEqualTo(String value) {
            addCriterion("tbo_src <=", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcLike(String value) {
            addCriterion("tbo_src like", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcNotLike(String value) {
            addCriterion("tbo_src not like", value, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcIn(List<String> values) {
            addCriterion("tbo_src in", values, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcNotIn(List<String> values) {
            addCriterion("tbo_src not in", values, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcBetween(String value1, String value2) {
            addCriterion("tbo_src between", value1, value2, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboSrcNotBetween(String value1, String value2) {
            addCriterion("tbo_src not between", value1, value2, "tboSrc");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeIsNull() {
            addCriterion("tbo_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeIsNotNull() {
            addCriterion("tbo_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeEqualTo(Date value) {
            addCriterion("tbo_update_time =", value, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbo_update_time <>", value, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeGreaterThan(Date value) {
            addCriterion("tbo_update_time >", value, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_update_time >=", value, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeLessThan(Date value) {
            addCriterion("tbo_update_time <", value, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_update_time <=", value, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeIn(List<Date> values) {
            addCriterion("tbo_update_time in", values, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbo_update_time not in", values, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_update_time between", value1, value2, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_update_time not between", value1, value2, "tboUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeIsNull() {
            addCriterion("tbo_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeIsNotNull() {
            addCriterion("tbo_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeEqualTo(Date value) {
            addCriterion("tbo_add_time =", value, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeNotEqualTo(Date value) {
            addCriterion("tbo_add_time <>", value, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeGreaterThan(Date value) {
            addCriterion("tbo_add_time >", value, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_add_time >=", value, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeLessThan(Date value) {
            addCriterion("tbo_add_time <", value, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_add_time <=", value, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeIn(List<Date> values) {
            addCriterion("tbo_add_time in", values, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeNotIn(List<Date> values) {
            addCriterion("tbo_add_time not in", values, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_add_time between", value1, value2, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_add_time not between", value1, value2, "tboAddTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeIsNull() {
            addCriterion("tbo_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeIsNotNull() {
            addCriterion("tbo_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeEqualTo(Date value) {
            addCriterion("tbo_pay_time =", value, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeNotEqualTo(Date value) {
            addCriterion("tbo_pay_time <>", value, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeGreaterThan(Date value) {
            addCriterion("tbo_pay_time >", value, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbo_pay_time >=", value, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeLessThan(Date value) {
            addCriterion("tbo_pay_time <", value, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbo_pay_time <=", value, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeIn(List<Date> values) {
            addCriterion("tbo_pay_time in", values, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeNotIn(List<Date> values) {
            addCriterion("tbo_pay_time not in", values, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeBetween(Date value1, Date value2) {
            addCriterion("tbo_pay_time between", value1, value2, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbo_pay_time not between", value1, value2, "tboPayTime");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeIsNull() {
            addCriterion("tbo_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeIsNotNull() {
            addCriterion("tbo_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeEqualTo(Byte value) {
            addCriterion("tbo_pay_type =", value, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeNotEqualTo(Byte value) {
            addCriterion("tbo_pay_type <>", value, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeGreaterThan(Byte value) {
            addCriterion("tbo_pay_type >", value, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_pay_type >=", value, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeLessThan(Byte value) {
            addCriterion("tbo_pay_type <", value, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_pay_type <=", value, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeIn(List<Byte> values) {
            addCriterion("tbo_pay_type in", values, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeNotIn(List<Byte> values) {
            addCriterion("tbo_pay_type not in", values, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbo_pay_type between", value1, value2, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_pay_type not between", value1, value2, "tboPayType");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmIsNull() {
            addCriterion("tbo_take_km is null");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmIsNotNull() {
            addCriterion("tbo_take_km is not null");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmEqualTo(Integer value) {
            addCriterion("tbo_take_km =", value, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmNotEqualTo(Integer value) {
            addCriterion("tbo_take_km <>", value, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmGreaterThan(Integer value) {
            addCriterion("tbo_take_km >", value, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_take_km >=", value, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmLessThan(Integer value) {
            addCriterion("tbo_take_km <", value, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_take_km <=", value, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmIn(List<Integer> values) {
            addCriterion("tbo_take_km in", values, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmNotIn(List<Integer> values) {
            addCriterion("tbo_take_km not in", values, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmBetween(Integer value1, Integer value2) {
            addCriterion("tbo_take_km between", value1, value2, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeKmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_take_km not between", value1, value2, "tboTakeKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmIsNull() {
            addCriterion("tbo_ret_km is null");
            return (Criteria) this;
        }

        public Criteria andTboRetKmIsNotNull() {
            addCriterion("tbo_ret_km is not null");
            return (Criteria) this;
        }

        public Criteria andTboRetKmEqualTo(Integer value) {
            addCriterion("tbo_ret_km =", value, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmNotEqualTo(Integer value) {
            addCriterion("tbo_ret_km <>", value, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmGreaterThan(Integer value) {
            addCriterion("tbo_ret_km >", value, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_ret_km >=", value, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmLessThan(Integer value) {
            addCriterion("tbo_ret_km <", value, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_ret_km <=", value, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmIn(List<Integer> values) {
            addCriterion("tbo_ret_km in", values, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmNotIn(List<Integer> values) {
            addCriterion("tbo_ret_km not in", values, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmBetween(Integer value1, Integer value2) {
            addCriterion("tbo_ret_km between", value1, value2, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboRetKmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_ret_km not between", value1, value2, "tboRetKm");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryIsNull() {
            addCriterion("tbo_take_battery is null");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryIsNotNull() {
            addCriterion("tbo_take_battery is not null");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryEqualTo(Integer value) {
            addCriterion("tbo_take_battery =", value, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryNotEqualTo(Integer value) {
            addCriterion("tbo_take_battery <>", value, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryGreaterThan(Integer value) {
            addCriterion("tbo_take_battery >", value, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_take_battery >=", value, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryLessThan(Integer value) {
            addCriterion("tbo_take_battery <", value, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_take_battery <=", value, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryIn(List<Integer> values) {
            addCriterion("tbo_take_battery in", values, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryNotIn(List<Integer> values) {
            addCriterion("tbo_take_battery not in", values, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryBetween(Integer value1, Integer value2) {
            addCriterion("tbo_take_battery between", value1, value2, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeBatteryNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_take_battery not between", value1, value2, "tboTakeBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryIsNull() {
            addCriterion("tbo_ret_battery is null");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryIsNotNull() {
            addCriterion("tbo_ret_battery is not null");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryEqualTo(Integer value) {
            addCriterion("tbo_ret_battery =", value, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryNotEqualTo(Integer value) {
            addCriterion("tbo_ret_battery <>", value, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryGreaterThan(Integer value) {
            addCriterion("tbo_ret_battery >", value, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_ret_battery >=", value, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryLessThan(Integer value) {
            addCriterion("tbo_ret_battery <", value, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_ret_battery <=", value, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryIn(List<Integer> values) {
            addCriterion("tbo_ret_battery in", values, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryNotIn(List<Integer> values) {
            addCriterion("tbo_ret_battery not in", values, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryBetween(Integer value1, Integer value2) {
            addCriterion("tbo_ret_battery between", value1, value2, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboRetBatteryNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_ret_battery not between", value1, value2, "tboRetBattery");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngIsNull() {
            addCriterion("tbo_take_latlng is null");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngIsNotNull() {
            addCriterion("tbo_take_latlng is not null");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngEqualTo(String value) {
            addCriterion("tbo_take_latlng =", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngNotEqualTo(String value) {
            addCriterion("tbo_take_latlng <>", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngGreaterThan(String value) {
            addCriterion("tbo_take_latlng >", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_take_latlng >=", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngLessThan(String value) {
            addCriterion("tbo_take_latlng <", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngLessThanOrEqualTo(String value) {
            addCriterion("tbo_take_latlng <=", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngLike(String value) {
            addCriterion("tbo_take_latlng like", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngNotLike(String value) {
            addCriterion("tbo_take_latlng not like", value, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngIn(List<String> values) {
            addCriterion("tbo_take_latlng in", values, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngNotIn(List<String> values) {
            addCriterion("tbo_take_latlng not in", values, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngBetween(String value1, String value2) {
            addCriterion("tbo_take_latlng between", value1, value2, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboTakeLatlngNotBetween(String value1, String value2) {
            addCriterion("tbo_take_latlng not between", value1, value2, "tboTakeLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngIsNull() {
            addCriterion("tbo_ret_latlng is null");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngIsNotNull() {
            addCriterion("tbo_ret_latlng is not null");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngEqualTo(String value) {
            addCriterion("tbo_ret_latlng =", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngNotEqualTo(String value) {
            addCriterion("tbo_ret_latlng <>", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngGreaterThan(String value) {
            addCriterion("tbo_ret_latlng >", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_ret_latlng >=", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngLessThan(String value) {
            addCriterion("tbo_ret_latlng <", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngLessThanOrEqualTo(String value) {
            addCriterion("tbo_ret_latlng <=", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngLike(String value) {
            addCriterion("tbo_ret_latlng like", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngNotLike(String value) {
            addCriterion("tbo_ret_latlng not like", value, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngIn(List<String> values) {
            addCriterion("tbo_ret_latlng in", values, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngNotIn(List<String> values) {
            addCriterion("tbo_ret_latlng not in", values, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngBetween(String value1, String value2) {
            addCriterion("tbo_ret_latlng between", value1, value2, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboRetLatlngNotBetween(String value1, String value2) {
            addCriterion("tbo_ret_latlng not between", value1, value2, "tboRetLatlng");
            return (Criteria) this;
        }

        public Criteria andTboSerialIsNull() {
            addCriterion("tbo_serial is null");
            return (Criteria) this;
        }

        public Criteria andTboSerialIsNotNull() {
            addCriterion("tbo_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTboSerialEqualTo(String value) {
            addCriterion("tbo_serial =", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialNotEqualTo(String value) {
            addCriterion("tbo_serial <>", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialGreaterThan(String value) {
            addCriterion("tbo_serial >", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_serial >=", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialLessThan(String value) {
            addCriterion("tbo_serial <", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialLessThanOrEqualTo(String value) {
            addCriterion("tbo_serial <=", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialLike(String value) {
            addCriterion("tbo_serial like", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialNotLike(String value) {
            addCriterion("tbo_serial not like", value, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialIn(List<String> values) {
            addCriterion("tbo_serial in", values, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialNotIn(List<String> values) {
            addCriterion("tbo_serial not in", values, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialBetween(String value1, String value2) {
            addCriterion("tbo_serial between", value1, value2, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboSerialNotBetween(String value1, String value2) {
            addCriterion("tbo_serial not between", value1, value2, "tboSerial");
            return (Criteria) this;
        }

        public Criteria andTboCodeIsNull() {
            addCriterion("tbo_code is null");
            return (Criteria) this;
        }

        public Criteria andTboCodeIsNotNull() {
            addCriterion("tbo_code is not null");
            return (Criteria) this;
        }

        public Criteria andTboCodeEqualTo(String value) {
            addCriterion("tbo_code =", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeNotEqualTo(String value) {
            addCriterion("tbo_code <>", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeGreaterThan(String value) {
            addCriterion("tbo_code >", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_code >=", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeLessThan(String value) {
            addCriterion("tbo_code <", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeLessThanOrEqualTo(String value) {
            addCriterion("tbo_code <=", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeLike(String value) {
            addCriterion("tbo_code like", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeNotLike(String value) {
            addCriterion("tbo_code not like", value, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeIn(List<String> values) {
            addCriterion("tbo_code in", values, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeNotIn(List<String> values) {
            addCriterion("tbo_code not in", values, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeBetween(String value1, String value2) {
            addCriterion("tbo_code between", value1, value2, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboCodeNotBetween(String value1, String value2) {
            addCriterion("tbo_code not between", value1, value2, "tboCode");
            return (Criteria) this;
        }

        public Criteria andTboRemarkIsNull() {
            addCriterion("tbo_remark is null");
            return (Criteria) this;
        }

        public Criteria andTboRemarkIsNotNull() {
            addCriterion("tbo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTboRemarkEqualTo(String value) {
            addCriterion("tbo_remark =", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkNotEqualTo(String value) {
            addCriterion("tbo_remark <>", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkGreaterThan(String value) {
            addCriterion("tbo_remark >", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_remark >=", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkLessThan(String value) {
            addCriterion("tbo_remark <", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbo_remark <=", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkLike(String value) {
            addCriterion("tbo_remark like", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkNotLike(String value) {
            addCriterion("tbo_remark not like", value, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkIn(List<String> values) {
            addCriterion("tbo_remark in", values, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkNotIn(List<String> values) {
            addCriterion("tbo_remark not in", values, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkBetween(String value1, String value2) {
            addCriterion("tbo_remark between", value1, value2, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboRemarkNotBetween(String value1, String value2) {
            addCriterion("tbo_remark not between", value1, value2, "tboRemark");
            return (Criteria) this;
        }

        public Criteria andTboEditorIsNull() {
            addCriterion("tbo_editor is null");
            return (Criteria) this;
        }

        public Criteria andTboEditorIsNotNull() {
            addCriterion("tbo_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTboEditorEqualTo(Integer value) {
            addCriterion("tbo_editor =", value, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorNotEqualTo(Integer value) {
            addCriterion("tbo_editor <>", value, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorGreaterThan(Integer value) {
            addCriterion("tbo_editor >", value, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_editor >=", value, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorLessThan(Integer value) {
            addCriterion("tbo_editor <", value, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_editor <=", value, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorIn(List<Integer> values) {
            addCriterion("tbo_editor in", values, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorNotIn(List<Integer> values) {
            addCriterion("tbo_editor not in", values, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbo_editor between", value1, value2, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_editor not between", value1, value2, "tboEditor");
            return (Criteria) this;
        }

        public Criteria andTboStateIsNull() {
            addCriterion("tbo_state is null");
            return (Criteria) this;
        }

        public Criteria andTboStateIsNotNull() {
            addCriterion("tbo_state is not null");
            return (Criteria) this;
        }

        public Criteria andTboStateEqualTo(Byte value) {
            addCriterion("tbo_state =", value, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateNotEqualTo(Byte value) {
            addCriterion("tbo_state <>", value, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateGreaterThan(Byte value) {
            addCriterion("tbo_state >", value, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_state >=", value, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateLessThan(Byte value) {
            addCriterion("tbo_state <", value, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_state <=", value, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateIn(List<Byte> values) {
            addCriterion("tbo_state in", values, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateNotIn(List<Byte> values) {
            addCriterion("tbo_state not in", values, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateBetween(Byte value1, Byte value2) {
            addCriterion("tbo_state between", value1, value2, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboStateNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_state not between", value1, value2, "tboState");
            return (Criteria) this;
        }

        public Criteria andTboSettleIsNull() {
            addCriterion("tbo_settle is null");
            return (Criteria) this;
        }

        public Criteria andTboSettleIsNotNull() {
            addCriterion("tbo_settle is not null");
            return (Criteria) this;
        }

        public Criteria andTboSettleEqualTo(Byte value) {
            addCriterion("tbo_settle =", value, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleNotEqualTo(Byte value) {
            addCriterion("tbo_settle <>", value, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleGreaterThan(Byte value) {
            addCriterion("tbo_settle >", value, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_settle >=", value, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleLessThan(Byte value) {
            addCriterion("tbo_settle <", value, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_settle <=", value, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleIn(List<Byte> values) {
            addCriterion("tbo_settle in", values, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleNotIn(List<Byte> values) {
            addCriterion("tbo_settle not in", values, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleBetween(Byte value1, Byte value2) {
            addCriterion("tbo_settle between", value1, value2, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboSettleNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_settle not between", value1, value2, "tboSettle");
            return (Criteria) this;
        }

        public Criteria andTboStatusIsNull() {
            addCriterion("tbo_status is null");
            return (Criteria) this;
        }

        public Criteria andTboStatusIsNotNull() {
            addCriterion("tbo_status is not null");
            return (Criteria) this;
        }

        public Criteria andTboStatusEqualTo(Byte value) {
            addCriterion("tbo_status =", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusNotEqualTo(Byte value) {
            addCriterion("tbo_status <>", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusGreaterThan(Byte value) {
            addCriterion("tbo_status >", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_status >=", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusLessThan(Byte value) {
            addCriterion("tbo_status <", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_status <=", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusIn(List<Byte> values) {
            addCriterion("tbo_status in", values, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusNotIn(List<Byte> values) {
            addCriterion("tbo_status not in", values, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbo_status between", value1, value2, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_status not between", value1, value2, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
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