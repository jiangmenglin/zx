package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperExample() {
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

        public Criteria andTboNameIsNull() {
            addCriterion("tbo_name is null");
            return (Criteria) this;
        }

        public Criteria andTboNameIsNotNull() {
            addCriterion("tbo_name is not null");
            return (Criteria) this;
        }

        public Criteria andTboNameEqualTo(String value) {
            addCriterion("tbo_name =", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameNotEqualTo(String value) {
            addCriterion("tbo_name <>", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameGreaterThan(String value) {
            addCriterion("tbo_name >", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_name >=", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameLessThan(String value) {
            addCriterion("tbo_name <", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameLessThanOrEqualTo(String value) {
            addCriterion("tbo_name <=", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameLike(String value) {
            addCriterion("tbo_name like", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameNotLike(String value) {
            addCriterion("tbo_name not like", value, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameIn(List<String> values) {
            addCriterion("tbo_name in", values, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameNotIn(List<String> values) {
            addCriterion("tbo_name not in", values, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameBetween(String value1, String value2) {
            addCriterion("tbo_name between", value1, value2, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboNameNotBetween(String value1, String value2) {
            addCriterion("tbo_name not between", value1, value2, "tboName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameIsNull() {
            addCriterion("tbo_full_name is null");
            return (Criteria) this;
        }

        public Criteria andTboFullNameIsNotNull() {
            addCriterion("tbo_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andTboFullNameEqualTo(String value) {
            addCriterion("tbo_full_name =", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameNotEqualTo(String value) {
            addCriterion("tbo_full_name <>", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameGreaterThan(String value) {
            addCriterion("tbo_full_name >", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_full_name >=", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameLessThan(String value) {
            addCriterion("tbo_full_name <", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameLessThanOrEqualTo(String value) {
            addCriterion("tbo_full_name <=", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameLike(String value) {
            addCriterion("tbo_full_name like", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameNotLike(String value) {
            addCriterion("tbo_full_name not like", value, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameIn(List<String> values) {
            addCriterion("tbo_full_name in", values, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameNotIn(List<String> values) {
            addCriterion("tbo_full_name not in", values, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameBetween(String value1, String value2) {
            addCriterion("tbo_full_name between", value1, value2, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboFullNameNotBetween(String value1, String value2) {
            addCriterion("tbo_full_name not between", value1, value2, "tboFullName");
            return (Criteria) this;
        }

        public Criteria andTboIconIsNull() {
            addCriterion("tbo_icon is null");
            return (Criteria) this;
        }

        public Criteria andTboIconIsNotNull() {
            addCriterion("tbo_icon is not null");
            return (Criteria) this;
        }

        public Criteria andTboIconEqualTo(String value) {
            addCriterion("tbo_icon =", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconNotEqualTo(String value) {
            addCriterion("tbo_icon <>", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconGreaterThan(String value) {
            addCriterion("tbo_icon >", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_icon >=", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconLessThan(String value) {
            addCriterion("tbo_icon <", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconLessThanOrEqualTo(String value) {
            addCriterion("tbo_icon <=", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconLike(String value) {
            addCriterion("tbo_icon like", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconNotLike(String value) {
            addCriterion("tbo_icon not like", value, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconIn(List<String> values) {
            addCriterion("tbo_icon in", values, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconNotIn(List<String> values) {
            addCriterion("tbo_icon not in", values, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconBetween(String value1, String value2) {
            addCriterion("tbo_icon between", value1, value2, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboIconNotBetween(String value1, String value2) {
            addCriterion("tbo_icon not between", value1, value2, "tboIcon");
            return (Criteria) this;
        }

        public Criteria andTboSignIsNull() {
            addCriterion("tbo_sign is null");
            return (Criteria) this;
        }

        public Criteria andTboSignIsNotNull() {
            addCriterion("tbo_sign is not null");
            return (Criteria) this;
        }

        public Criteria andTboSignEqualTo(String value) {
            addCriterion("tbo_sign =", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignNotEqualTo(String value) {
            addCriterion("tbo_sign <>", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignGreaterThan(String value) {
            addCriterion("tbo_sign >", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_sign >=", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignLessThan(String value) {
            addCriterion("tbo_sign <", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignLessThanOrEqualTo(String value) {
            addCriterion("tbo_sign <=", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignLike(String value) {
            addCriterion("tbo_sign like", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignNotLike(String value) {
            addCriterion("tbo_sign not like", value, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignIn(List<String> values) {
            addCriterion("tbo_sign in", values, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignNotIn(List<String> values) {
            addCriterion("tbo_sign not in", values, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignBetween(String value1, String value2) {
            addCriterion("tbo_sign between", value1, value2, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboSignNotBetween(String value1, String value2) {
            addCriterion("tbo_sign not between", value1, value2, "tboSign");
            return (Criteria) this;
        }

        public Criteria andTboPersonIsNull() {
            addCriterion("tbo_person is null");
            return (Criteria) this;
        }

        public Criteria andTboPersonIsNotNull() {
            addCriterion("tbo_person is not null");
            return (Criteria) this;
        }

        public Criteria andTboPersonEqualTo(String value) {
            addCriterion("tbo_person =", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonNotEqualTo(String value) {
            addCriterion("tbo_person <>", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonGreaterThan(String value) {
            addCriterion("tbo_person >", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_person >=", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonLessThan(String value) {
            addCriterion("tbo_person <", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonLessThanOrEqualTo(String value) {
            addCriterion("tbo_person <=", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonLike(String value) {
            addCriterion("tbo_person like", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonNotLike(String value) {
            addCriterion("tbo_person not like", value, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonIn(List<String> values) {
            addCriterion("tbo_person in", values, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonNotIn(List<String> values) {
            addCriterion("tbo_person not in", values, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonBetween(String value1, String value2) {
            addCriterion("tbo_person between", value1, value2, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboPersonNotBetween(String value1, String value2) {
            addCriterion("tbo_person not between", value1, value2, "tboPerson");
            return (Criteria) this;
        }

        public Criteria andTboAddressIsNull() {
            addCriterion("tbo_address is null");
            return (Criteria) this;
        }

        public Criteria andTboAddressIsNotNull() {
            addCriterion("tbo_address is not null");
            return (Criteria) this;
        }

        public Criteria andTboAddressEqualTo(String value) {
            addCriterion("tbo_address =", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressNotEqualTo(String value) {
            addCriterion("tbo_address <>", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressGreaterThan(String value) {
            addCriterion("tbo_address >", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_address >=", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressLessThan(String value) {
            addCriterion("tbo_address <", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressLessThanOrEqualTo(String value) {
            addCriterion("tbo_address <=", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressLike(String value) {
            addCriterion("tbo_address like", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressNotLike(String value) {
            addCriterion("tbo_address not like", value, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressIn(List<String> values) {
            addCriterion("tbo_address in", values, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressNotIn(List<String> values) {
            addCriterion("tbo_address not in", values, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressBetween(String value1, String value2) {
            addCriterion("tbo_address between", value1, value2, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboAddressNotBetween(String value1, String value2) {
            addCriterion("tbo_address not between", value1, value2, "tboAddress");
            return (Criteria) this;
        }

        public Criteria andTboContactsIsNull() {
            addCriterion("tbo_contacts is null");
            return (Criteria) this;
        }

        public Criteria andTboContactsIsNotNull() {
            addCriterion("tbo_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andTboContactsEqualTo(String value) {
            addCriterion("tbo_contacts =", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsNotEqualTo(String value) {
            addCriterion("tbo_contacts <>", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsGreaterThan(String value) {
            addCriterion("tbo_contacts >", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_contacts >=", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsLessThan(String value) {
            addCriterion("tbo_contacts <", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsLessThanOrEqualTo(String value) {
            addCriterion("tbo_contacts <=", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsLike(String value) {
            addCriterion("tbo_contacts like", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsNotLike(String value) {
            addCriterion("tbo_contacts not like", value, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsIn(List<String> values) {
            addCriterion("tbo_contacts in", values, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsNotIn(List<String> values) {
            addCriterion("tbo_contacts not in", values, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsBetween(String value1, String value2) {
            addCriterion("tbo_contacts between", value1, value2, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboContactsNotBetween(String value1, String value2) {
            addCriterion("tbo_contacts not between", value1, value2, "tboContacts");
            return (Criteria) this;
        }

        public Criteria andTboAdderIsNull() {
            addCriterion("tbo_adder is null");
            return (Criteria) this;
        }

        public Criteria andTboAdderIsNotNull() {
            addCriterion("tbo_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTboAdderEqualTo(Long value) {
            addCriterion("tbo_adder =", value, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderNotEqualTo(Long value) {
            addCriterion("tbo_adder <>", value, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderGreaterThan(Long value) {
            addCriterion("tbo_adder >", value, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbo_adder >=", value, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderLessThan(Long value) {
            addCriterion("tbo_adder <", value, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbo_adder <=", value, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderIn(List<Long> values) {
            addCriterion("tbo_adder in", values, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderNotIn(List<Long> values) {
            addCriterion("tbo_adder not in", values, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderBetween(Long value1, Long value2) {
            addCriterion("tbo_adder between", value1, value2, "tboAdder");
            return (Criteria) this;
        }

        public Criteria andTboAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbo_adder not between", value1, value2, "tboAdder");
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

        public Criteria andTboStatusIsNull() {
            addCriterion("tbo_status is null");
            return (Criteria) this;
        }

        public Criteria andTboStatusIsNotNull() {
            addCriterion("tbo_status is not null");
            return (Criteria) this;
        }

        public Criteria andTboStatusEqualTo(Short value) {
            addCriterion("tbo_status =", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusNotEqualTo(Short value) {
            addCriterion("tbo_status <>", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusGreaterThan(Short value) {
            addCriterion("tbo_status >", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbo_status >=", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusLessThan(Short value) {
            addCriterion("tbo_status <", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbo_status <=", value, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusIn(List<Short> values) {
            addCriterion("tbo_status in", values, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusNotIn(List<Short> values) {
            addCriterion("tbo_status not in", values, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusBetween(Short value1, Short value2) {
            addCriterion("tbo_status between", value1, value2, "tboStatus");
            return (Criteria) this;
        }

        public Criteria andTboStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbo_status not between", value1, value2, "tboStatus");
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