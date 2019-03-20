package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitInfoExample() {
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

        public Criteria andTbuiIdIsNull() {
            addCriterion("tbui_id is null");
            return (Criteria) this;
        }

        public Criteria andTbuiIdIsNotNull() {
            addCriterion("tbui_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiIdEqualTo(Integer value) {
            addCriterion("tbui_id =", value, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdNotEqualTo(Integer value) {
            addCriterion("tbui_id <>", value, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdGreaterThan(Integer value) {
            addCriterion("tbui_id >", value, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbui_id >=", value, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdLessThan(Integer value) {
            addCriterion("tbui_id <", value, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbui_id <=", value, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdIn(List<Integer> values) {
            addCriterion("tbui_id in", values, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdNotIn(List<Integer> values) {
            addCriterion("tbui_id not in", values, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdBetween(Integer value1, Integer value2) {
            addCriterion("tbui_id between", value1, value2, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbui_id not between", value1, value2, "tbuiId");
            return (Criteria) this;
        }

        public Criteria andTbuiHostIsNull() {
            addCriterion("tbui_host is null");
            return (Criteria) this;
        }

        public Criteria andTbuiHostIsNotNull() {
            addCriterion("tbui_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiHostEqualTo(Short value) {
            addCriterion("tbui_host =", value, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostNotEqualTo(Short value) {
            addCriterion("tbui_host <>", value, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostGreaterThan(Short value) {
            addCriterion("tbui_host >", value, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbui_host >=", value, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostLessThan(Short value) {
            addCriterion("tbui_host <", value, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostLessThanOrEqualTo(Short value) {
            addCriterion("tbui_host <=", value, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostIn(List<Short> values) {
            addCriterion("tbui_host in", values, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostNotIn(List<Short> values) {
            addCriterion("tbui_host not in", values, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostBetween(Short value1, Short value2) {
            addCriterion("tbui_host between", value1, value2, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiHostNotBetween(Short value1, Short value2) {
            addCriterion("tbui_host not between", value1, value2, "tbuiHost");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameIsNull() {
            addCriterion("tbui_username is null");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameIsNotNull() {
            addCriterion("tbui_username is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameEqualTo(String value) {
            addCriterion("tbui_username =", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameNotEqualTo(String value) {
            addCriterion("tbui_username <>", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameGreaterThan(String value) {
            addCriterion("tbui_username >", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_username >=", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameLessThan(String value) {
            addCriterion("tbui_username <", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameLessThanOrEqualTo(String value) {
            addCriterion("tbui_username <=", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameLike(String value) {
            addCriterion("tbui_username like", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameNotLike(String value) {
            addCriterion("tbui_username not like", value, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameIn(List<String> values) {
            addCriterion("tbui_username in", values, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameNotIn(List<String> values) {
            addCriterion("tbui_username not in", values, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameBetween(String value1, String value2) {
            addCriterion("tbui_username between", value1, value2, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiUsernameNotBetween(String value1, String value2) {
            addCriterion("tbui_username not between", value1, value2, "tbuiUsername");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordIsNull() {
            addCriterion("tbui_password is null");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordIsNotNull() {
            addCriterion("tbui_password is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordEqualTo(String value) {
            addCriterion("tbui_password =", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordNotEqualTo(String value) {
            addCriterion("tbui_password <>", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordGreaterThan(String value) {
            addCriterion("tbui_password >", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_password >=", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordLessThan(String value) {
            addCriterion("tbui_password <", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordLessThanOrEqualTo(String value) {
            addCriterion("tbui_password <=", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordLike(String value) {
            addCriterion("tbui_password like", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordNotLike(String value) {
            addCriterion("tbui_password not like", value, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordIn(List<String> values) {
            addCriterion("tbui_password in", values, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordNotIn(List<String> values) {
            addCriterion("tbui_password not in", values, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordBetween(String value1, String value2) {
            addCriterion("tbui_password between", value1, value2, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiPasswordNotBetween(String value1, String value2) {
            addCriterion("tbui_password not between", value1, value2, "tbuiPassword");
            return (Criteria) this;
        }

        public Criteria andTbuiNameIsNull() {
            addCriterion("tbui_name is null");
            return (Criteria) this;
        }

        public Criteria andTbuiNameIsNotNull() {
            addCriterion("tbui_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiNameEqualTo(String value) {
            addCriterion("tbui_name =", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameNotEqualTo(String value) {
            addCriterion("tbui_name <>", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameGreaterThan(String value) {
            addCriterion("tbui_name >", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_name >=", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameLessThan(String value) {
            addCriterion("tbui_name <", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameLessThanOrEqualTo(String value) {
            addCriterion("tbui_name <=", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameLike(String value) {
            addCriterion("tbui_name like", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameNotLike(String value) {
            addCriterion("tbui_name not like", value, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameIn(List<String> values) {
            addCriterion("tbui_name in", values, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameNotIn(List<String> values) {
            addCriterion("tbui_name not in", values, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameBetween(String value1, String value2) {
            addCriterion("tbui_name between", value1, value2, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiNameNotBetween(String value1, String value2) {
            addCriterion("tbui_name not between", value1, value2, "tbuiName");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonIsNull() {
            addCriterion("tbui_person is null");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonIsNotNull() {
            addCriterion("tbui_person is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonEqualTo(String value) {
            addCriterion("tbui_person =", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonNotEqualTo(String value) {
            addCriterion("tbui_person <>", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonGreaterThan(String value) {
            addCriterion("tbui_person >", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_person >=", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonLessThan(String value) {
            addCriterion("tbui_person <", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonLessThanOrEqualTo(String value) {
            addCriterion("tbui_person <=", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonLike(String value) {
            addCriterion("tbui_person like", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonNotLike(String value) {
            addCriterion("tbui_person not like", value, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonIn(List<String> values) {
            addCriterion("tbui_person in", values, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonNotIn(List<String> values) {
            addCriterion("tbui_person not in", values, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonBetween(String value1, String value2) {
            addCriterion("tbui_person between", value1, value2, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiPersonNotBetween(String value1, String value2) {
            addCriterion("tbui_person not between", value1, value2, "tbuiPerson");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeIsNull() {
            addCriterion("tbui_type is null");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeIsNotNull() {
            addCriterion("tbui_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeEqualTo(Byte value) {
            addCriterion("tbui_type =", value, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeNotEqualTo(Byte value) {
            addCriterion("tbui_type <>", value, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeGreaterThan(Byte value) {
            addCriterion("tbui_type >", value, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbui_type >=", value, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeLessThan(Byte value) {
            addCriterion("tbui_type <", value, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbui_type <=", value, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeIn(List<Byte> values) {
            addCriterion("tbui_type in", values, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeNotIn(List<Byte> values) {
            addCriterion("tbui_type not in", values, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbui_type between", value1, value2, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbui_type not between", value1, value2, "tbuiType");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelIsNull() {
            addCriterion("tbui_level is null");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelIsNotNull() {
            addCriterion("tbui_level is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelEqualTo(Short value) {
            addCriterion("tbui_level =", value, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelNotEqualTo(Short value) {
            addCriterion("tbui_level <>", value, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelGreaterThan(Short value) {
            addCriterion("tbui_level >", value, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("tbui_level >=", value, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelLessThan(Short value) {
            addCriterion("tbui_level <", value, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelLessThanOrEqualTo(Short value) {
            addCriterion("tbui_level <=", value, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelIn(List<Short> values) {
            addCriterion("tbui_level in", values, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelNotIn(List<Short> values) {
            addCriterion("tbui_level not in", values, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelBetween(Short value1, Short value2) {
            addCriterion("tbui_level between", value1, value2, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiLevelNotBetween(Short value1, Short value2) {
            addCriterion("tbui_level not between", value1, value2, "tbuiLevel");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressIsNull() {
            addCriterion("tbui_address is null");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressIsNotNull() {
            addCriterion("tbui_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressEqualTo(String value) {
            addCriterion("tbui_address =", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressNotEqualTo(String value) {
            addCriterion("tbui_address <>", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressGreaterThan(String value) {
            addCriterion("tbui_address >", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_address >=", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressLessThan(String value) {
            addCriterion("tbui_address <", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressLessThanOrEqualTo(String value) {
            addCriterion("tbui_address <=", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressLike(String value) {
            addCriterion("tbui_address like", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressNotLike(String value) {
            addCriterion("tbui_address not like", value, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressIn(List<String> values) {
            addCriterion("tbui_address in", values, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressNotIn(List<String> values) {
            addCriterion("tbui_address not in", values, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressBetween(String value1, String value2) {
            addCriterion("tbui_address between", value1, value2, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiAddressNotBetween(String value1, String value2) {
            addCriterion("tbui_address not between", value1, value2, "tbuiAddress");
            return (Criteria) this;
        }

        public Criteria andTbuiContactIsNull() {
            addCriterion("tbui_contact is null");
            return (Criteria) this;
        }

        public Criteria andTbuiContactIsNotNull() {
            addCriterion("tbui_contact is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiContactEqualTo(String value) {
            addCriterion("tbui_contact =", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactNotEqualTo(String value) {
            addCriterion("tbui_contact <>", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactGreaterThan(String value) {
            addCriterion("tbui_contact >", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_contact >=", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactLessThan(String value) {
            addCriterion("tbui_contact <", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactLessThanOrEqualTo(String value) {
            addCriterion("tbui_contact <=", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactLike(String value) {
            addCriterion("tbui_contact like", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactNotLike(String value) {
            addCriterion("tbui_contact not like", value, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactIn(List<String> values) {
            addCriterion("tbui_contact in", values, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactNotIn(List<String> values) {
            addCriterion("tbui_contact not in", values, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactBetween(String value1, String value2) {
            addCriterion("tbui_contact between", value1, value2, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiContactNotBetween(String value1, String value2) {
            addCriterion("tbui_contact not between", value1, value2, "tbuiContact");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesIsNull() {
            addCriterion("tbui_images is null");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesIsNotNull() {
            addCriterion("tbui_images is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesEqualTo(String value) {
            addCriterion("tbui_images =", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesNotEqualTo(String value) {
            addCriterion("tbui_images <>", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesGreaterThan(String value) {
            addCriterion("tbui_images >", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_images >=", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesLessThan(String value) {
            addCriterion("tbui_images <", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesLessThanOrEqualTo(String value) {
            addCriterion("tbui_images <=", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesLike(String value) {
            addCriterion("tbui_images like", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesNotLike(String value) {
            addCriterion("tbui_images not like", value, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesIn(List<String> values) {
            addCriterion("tbui_images in", values, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesNotIn(List<String> values) {
            addCriterion("tbui_images not in", values, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesBetween(String value1, String value2) {
            addCriterion("tbui_images between", value1, value2, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiImagesNotBetween(String value1, String value2) {
            addCriterion("tbui_images not between", value1, value2, "tbuiImages");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberIsNull() {
            addCriterion("tbui_member is null");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberIsNotNull() {
            addCriterion("tbui_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberEqualTo(Integer value) {
            addCriterion("tbui_member =", value, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberNotEqualTo(Integer value) {
            addCriterion("tbui_member <>", value, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberGreaterThan(Integer value) {
            addCriterion("tbui_member >", value, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbui_member >=", value, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberLessThan(Integer value) {
            addCriterion("tbui_member <", value, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbui_member <=", value, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberIn(List<Integer> values) {
            addCriterion("tbui_member in", values, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberNotIn(List<Integer> values) {
            addCriterion("tbui_member not in", values, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbui_member between", value1, value2, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbui_member not between", value1, value2, "tbuiMember");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditIsNull() {
            addCriterion("tbui_credit is null");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditIsNotNull() {
            addCriterion("tbui_credit is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditEqualTo(Double value) {
            addCriterion("tbui_credit =", value, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditNotEqualTo(Double value) {
            addCriterion("tbui_credit <>", value, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditGreaterThan(Double value) {
            addCriterion("tbui_credit >", value, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("tbui_credit >=", value, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditLessThan(Double value) {
            addCriterion("tbui_credit <", value, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditLessThanOrEqualTo(Double value) {
            addCriterion("tbui_credit <=", value, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditIn(List<Double> values) {
            addCriterion("tbui_credit in", values, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditNotIn(List<Double> values) {
            addCriterion("tbui_credit not in", values, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditBetween(Double value1, Double value2) {
            addCriterion("tbui_credit between", value1, value2, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiCreditNotBetween(Double value1, Double value2) {
            addCriterion("tbui_credit not between", value1, value2, "tbuiCredit");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsIsNull() {
            addCriterion("tbui_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsIsNotNull() {
            addCriterion("tbui_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsEqualTo(Integer value) {
            addCriterion("tbui_outlets =", value, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsNotEqualTo(Integer value) {
            addCriterion("tbui_outlets <>", value, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsGreaterThan(Integer value) {
            addCriterion("tbui_outlets >", value, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbui_outlets >=", value, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsLessThan(Integer value) {
            addCriterion("tbui_outlets <", value, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsLessThanOrEqualTo(Integer value) {
            addCriterion("tbui_outlets <=", value, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsIn(List<Integer> values) {
            addCriterion("tbui_outlets in", values, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsNotIn(List<Integer> values) {
            addCriterion("tbui_outlets not in", values, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsBetween(Integer value1, Integer value2) {
            addCriterion("tbui_outlets between", value1, value2, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiOutletsNotBetween(Integer value1, Integer value2) {
            addCriterion("tbui_outlets not between", value1, value2, "tbuiOutlets");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeIsNull() {
            addCriterion("tbui_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeIsNotNull() {
            addCriterion("tbui_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeEqualTo(Integer value) {
            addCriterion("tbui_fee_type =", value, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeNotEqualTo(Integer value) {
            addCriterion("tbui_fee_type <>", value, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeGreaterThan(Integer value) {
            addCriterion("tbui_fee_type >", value, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbui_fee_type >=", value, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeLessThan(Integer value) {
            addCriterion("tbui_fee_type <", value, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tbui_fee_type <=", value, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeIn(List<Integer> values) {
            addCriterion("tbui_fee_type in", values, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeNotIn(List<Integer> values) {
            addCriterion("tbui_fee_type not in", values, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("tbui_fee_type between", value1, value2, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiFeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbui_fee_type not between", value1, value2, "tbuiFeeType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeIsNull() {
            addCriterion("tbui_use_type is null");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeIsNotNull() {
            addCriterion("tbui_use_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeEqualTo(Byte value) {
            addCriterion("tbui_use_type =", value, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeNotEqualTo(Byte value) {
            addCriterion("tbui_use_type <>", value, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeGreaterThan(Byte value) {
            addCriterion("tbui_use_type >", value, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbui_use_type >=", value, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeLessThan(Byte value) {
            addCriterion("tbui_use_type <", value, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbui_use_type <=", value, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeIn(List<Byte> values) {
            addCriterion("tbui_use_type in", values, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeNotIn(List<Byte> values) {
            addCriterion("tbui_use_type not in", values, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbui_use_type between", value1, value2, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbui_use_type not between", value1, value2, "tbuiUseType");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeIsNull() {
            addCriterion("tbui_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeIsNotNull() {
            addCriterion("tbui_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeEqualTo(Date value) {
            addCriterion("tbui_update_time =", value, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbui_update_time <>", value, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeGreaterThan(Date value) {
            addCriterion("tbui_update_time >", value, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbui_update_time >=", value, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeLessThan(Date value) {
            addCriterion("tbui_update_time <", value, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbui_update_time <=", value, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeIn(List<Date> values) {
            addCriterion("tbui_update_time in", values, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbui_update_time not in", values, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbui_update_time between", value1, value2, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbui_update_time not between", value1, value2, "tbuiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeIsNull() {
            addCriterion("tbui_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeIsNotNull() {
            addCriterion("tbui_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeEqualTo(Date value) {
            addCriterion("tbui_add_time =", value, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeNotEqualTo(Date value) {
            addCriterion("tbui_add_time <>", value, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeGreaterThan(Date value) {
            addCriterion("tbui_add_time >", value, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbui_add_time >=", value, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeLessThan(Date value) {
            addCriterion("tbui_add_time <", value, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbui_add_time <=", value, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeIn(List<Date> values) {
            addCriterion("tbui_add_time in", values, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeNotIn(List<Date> values) {
            addCriterion("tbui_add_time not in", values, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbui_add_time between", value1, value2, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbui_add_time not between", value1, value2, "tbuiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkIsNull() {
            addCriterion("tbui_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkIsNotNull() {
            addCriterion("tbui_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkEqualTo(String value) {
            addCriterion("tbui_remark =", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkNotEqualTo(String value) {
            addCriterion("tbui_remark <>", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkGreaterThan(String value) {
            addCriterion("tbui_remark >", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbui_remark >=", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkLessThan(String value) {
            addCriterion("tbui_remark <", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbui_remark <=", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkLike(String value) {
            addCriterion("tbui_remark like", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkNotLike(String value) {
            addCriterion("tbui_remark not like", value, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkIn(List<String> values) {
            addCriterion("tbui_remark in", values, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkNotIn(List<String> values) {
            addCriterion("tbui_remark not in", values, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkBetween(String value1, String value2) {
            addCriterion("tbui_remark between", value1, value2, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiRemarkNotBetween(String value1, String value2) {
            addCriterion("tbui_remark not between", value1, value2, "tbuiRemark");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusIsNull() {
            addCriterion("tbui_status is null");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusIsNotNull() {
            addCriterion("tbui_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusEqualTo(Byte value) {
            addCriterion("tbui_status =", value, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusNotEqualTo(Byte value) {
            addCriterion("tbui_status <>", value, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusGreaterThan(Byte value) {
            addCriterion("tbui_status >", value, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbui_status >=", value, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusLessThan(Byte value) {
            addCriterion("tbui_status <", value, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbui_status <=", value, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusIn(List<Byte> values) {
            addCriterion("tbui_status in", values, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusNotIn(List<Byte> values) {
            addCriterion("tbui_status not in", values, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbui_status between", value1, value2, "tbuiStatus");
            return (Criteria) this;
        }

        public Criteria andTbuiStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbui_status not between", value1, value2, "tbuiStatus");
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

        public Criteria andTbuiNeedDepositIsNull() {
            addCriterion("tbui_need_deposit is null");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositIsNotNull() {
            addCriterion("tbui_need_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositEqualTo(Byte value) {
            addCriterion("tbui_need_deposit =", value, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositNotEqualTo(Byte value) {
            addCriterion("tbui_need_deposit <>", value, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositGreaterThan(Byte value) {
            addCriterion("tbui_need_deposit >", value, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbui_need_deposit >=", value, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositLessThan(Byte value) {
            addCriterion("tbui_need_deposit <", value, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositLessThanOrEqualTo(Byte value) {
            addCriterion("tbui_need_deposit <=", value, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositIn(List<Byte> values) {
            addCriterion("tbui_need_deposit in", values, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositNotIn(List<Byte> values) {
            addCriterion("tbui_need_deposit not in", values, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositBetween(Byte value1, Byte value2) {
            addCriterion("tbui_need_deposit between", value1, value2, "tbuiNeedDeposit");
            return (Criteria) this;
        }

        public Criteria andTbuiNeedDepositNotBetween(Byte value1, Byte value2) {
            addCriterion("tbui_need_deposit not between", value1, value2, "tbuiNeedDeposit");
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