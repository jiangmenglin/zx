package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTbmIdIsNull() {
            addCriterion("tbm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdIsNotNull() {
            addCriterion("tbm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdEqualTo(Integer value) {
            addCriterion("tbm_id =", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotEqualTo(Integer value) {
            addCriterion("tbm_id <>", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThan(Integer value) {
            addCriterion("tbm_id >", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_id >=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThan(Integer value) {
            addCriterion("tbm_id <", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_id <=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdIn(List<Integer> values) {
            addCriterion("tbm_id in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotIn(List<Integer> values) {
            addCriterion("tbm_id not in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id not between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmHostIsNull() {
            addCriterion("tbm_host is null");
            return (Criteria) this;
        }

        public Criteria andTbmHostIsNotNull() {
            addCriterion("tbm_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbmHostEqualTo(Short value) {
            addCriterion("tbm_host =", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotEqualTo(Short value) {
            addCriterion("tbm_host <>", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThan(Short value) {
            addCriterion("tbm_host >", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_host >=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThan(Short value) {
            addCriterion("tbm_host <", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThanOrEqualTo(Short value) {
            addCriterion("tbm_host <=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostIn(List<Short> values) {
            addCriterion("tbm_host in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotIn(List<Short> values) {
            addCriterion("tbm_host not in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostBetween(Short value1, Short value2) {
            addCriterion("tbm_host between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotBetween(Short value1, Short value2) {
            addCriterion("tbm_host not between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmMobileIsNull() {
            addCriterion("tbm_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTbmMobileIsNotNull() {
            addCriterion("tbm_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTbmMobileEqualTo(String value) {
            addCriterion("tbm_mobile =", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotEqualTo(String value) {
            addCriterion("tbm_mobile <>", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileGreaterThan(String value) {
            addCriterion("tbm_mobile >", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_mobile >=", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileLessThan(String value) {
            addCriterion("tbm_mobile <", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileLessThanOrEqualTo(String value) {
            addCriterion("tbm_mobile <=", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileLike(String value) {
            addCriterion("tbm_mobile like", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotLike(String value) {
            addCriterion("tbm_mobile not like", value, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileIn(List<String> values) {
            addCriterion("tbm_mobile in", values, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotIn(List<String> values) {
            addCriterion("tbm_mobile not in", values, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileBetween(String value1, String value2) {
            addCriterion("tbm_mobile between", value1, value2, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmMobileNotBetween(String value1, String value2) {
            addCriterion("tbm_mobile not between", value1, value2, "tbmMobile");
            return (Criteria) this;
        }

        public Criteria andTbmNameIsNull() {
            addCriterion("tbm_name is null");
            return (Criteria) this;
        }

        public Criteria andTbmNameIsNotNull() {
            addCriterion("tbm_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbmNameEqualTo(String value) {
            addCriterion("tbm_name =", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotEqualTo(String value) {
            addCriterion("tbm_name <>", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameGreaterThan(String value) {
            addCriterion("tbm_name >", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_name >=", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLessThan(String value) {
            addCriterion("tbm_name <", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLessThanOrEqualTo(String value) {
            addCriterion("tbm_name <=", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLike(String value) {
            addCriterion("tbm_name like", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotLike(String value) {
            addCriterion("tbm_name not like", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameIn(List<String> values) {
            addCriterion("tbm_name in", values, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotIn(List<String> values) {
            addCriterion("tbm_name not in", values, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameBetween(String value1, String value2) {
            addCriterion("tbm_name between", value1, value2, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotBetween(String value1, String value2) {
            addCriterion("tbm_name not between", value1, value2, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNull() {
            addCriterion("tbm_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNotNull() {
            addCriterion("tbm_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeEqualTo(Byte value) {
            addCriterion("tbm_type =", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotEqualTo(Byte value) {
            addCriterion("tbm_type <>", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThan(Byte value) {
            addCriterion("tbm_type >", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_type >=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThan(Byte value) {
            addCriterion("tbm_type <", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_type <=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIn(List<Byte> values) {
            addCriterion("tbm_type in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotIn(List<Byte> values) {
            addCriterion("tbm_type not in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type not between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeIsNull() {
            addCriterion("tbm_user_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeIsNotNull() {
            addCriterion("tbm_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeEqualTo(Short value) {
            addCriterion("tbm_user_type =", value, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeNotEqualTo(Short value) {
            addCriterion("tbm_user_type <>", value, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeGreaterThan(Short value) {
            addCriterion("tbm_user_type >", value, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_user_type >=", value, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeLessThan(Short value) {
            addCriterion("tbm_user_type <", value, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbm_user_type <=", value, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeIn(List<Short> values) {
            addCriterion("tbm_user_type in", values, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeNotIn(List<Short> values) {
            addCriterion("tbm_user_type not in", values, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeBetween(Short value1, Short value2) {
            addCriterion("tbm_user_type between", value1, value2, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbm_user_type not between", value1, value2, "tbmUserType");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeIsNull() {
            addCriterion("tbm_income is null");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeIsNotNull() {
            addCriterion("tbm_income is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeEqualTo(Byte value) {
            addCriterion("tbm_income =", value, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeNotEqualTo(Byte value) {
            addCriterion("tbm_income <>", value, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeGreaterThan(Byte value) {
            addCriterion("tbm_income >", value, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_income >=", value, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeLessThan(Byte value) {
            addCriterion("tbm_income <", value, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_income <=", value, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeIn(List<Byte> values) {
            addCriterion("tbm_income in", values, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeNotIn(List<Byte> values) {
            addCriterion("tbm_income not in", values, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeBetween(Byte value1, Byte value2) {
            addCriterion("tbm_income between", value1, value2, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmIncomeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_income not between", value1, value2, "tbmIncome");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderIsNull() {
            addCriterion("tbm_header is null");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderIsNotNull() {
            addCriterion("tbm_header is not null");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderEqualTo(String value) {
            addCriterion("tbm_header =", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderNotEqualTo(String value) {
            addCriterion("tbm_header <>", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderGreaterThan(String value) {
            addCriterion("tbm_header >", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_header >=", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderLessThan(String value) {
            addCriterion("tbm_header <", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderLessThanOrEqualTo(String value) {
            addCriterion("tbm_header <=", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderLike(String value) {
            addCriterion("tbm_header like", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderNotLike(String value) {
            addCriterion("tbm_header not like", value, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderIn(List<String> values) {
            addCriterion("tbm_header in", values, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderNotIn(List<String> values) {
            addCriterion("tbm_header not in", values, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderBetween(String value1, String value2) {
            addCriterion("tbm_header between", value1, value2, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmHeaderNotBetween(String value1, String value2) {
            addCriterion("tbm_header not between", value1, value2, "tbmHeader");
            return (Criteria) this;
        }

        public Criteria andTbmEmailIsNull() {
            addCriterion("tbm_email is null");
            return (Criteria) this;
        }

        public Criteria andTbmEmailIsNotNull() {
            addCriterion("tbm_email is not null");
            return (Criteria) this;
        }

        public Criteria andTbmEmailEqualTo(String value) {
            addCriterion("tbm_email =", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailNotEqualTo(String value) {
            addCriterion("tbm_email <>", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailGreaterThan(String value) {
            addCriterion("tbm_email >", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_email >=", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailLessThan(String value) {
            addCriterion("tbm_email <", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailLessThanOrEqualTo(String value) {
            addCriterion("tbm_email <=", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailLike(String value) {
            addCriterion("tbm_email like", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailNotLike(String value) {
            addCriterion("tbm_email not like", value, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailIn(List<String> values) {
            addCriterion("tbm_email in", values, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailNotIn(List<String> values) {
            addCriterion("tbm_email not in", values, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailBetween(String value1, String value2) {
            addCriterion("tbm_email between", value1, value2, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmEmailNotBetween(String value1, String value2) {
            addCriterion("tbm_email not between", value1, value2, "tbmEmail");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeIsNull() {
            addCriterion("tbm_invite_code is null");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeIsNotNull() {
            addCriterion("tbm_invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeEqualTo(String value) {
            addCriterion("tbm_invite_code =", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeNotEqualTo(String value) {
            addCriterion("tbm_invite_code <>", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeGreaterThan(String value) {
            addCriterion("tbm_invite_code >", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_invite_code >=", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeLessThan(String value) {
            addCriterion("tbm_invite_code <", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("tbm_invite_code <=", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeLike(String value) {
            addCriterion("tbm_invite_code like", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeNotLike(String value) {
            addCriterion("tbm_invite_code not like", value, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeIn(List<String> values) {
            addCriterion("tbm_invite_code in", values, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeNotIn(List<String> values) {
            addCriterion("tbm_invite_code not in", values, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeBetween(String value1, String value2) {
            addCriterion("tbm_invite_code between", value1, value2, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteCodeNotBetween(String value1, String value2) {
            addCriterion("tbm_invite_code not between", value1, value2, "tbmInviteCode");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserIsNull() {
            addCriterion("tbm_invite_user is null");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserIsNotNull() {
            addCriterion("tbm_invite_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserEqualTo(Integer value) {
            addCriterion("tbm_invite_user =", value, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserNotEqualTo(Integer value) {
            addCriterion("tbm_invite_user <>", value, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserGreaterThan(Integer value) {
            addCriterion("tbm_invite_user >", value, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_invite_user >=", value, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserLessThan(Integer value) {
            addCriterion("tbm_invite_user <", value, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_invite_user <=", value, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserIn(List<Integer> values) {
            addCriterion("tbm_invite_user in", values, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserNotIn(List<Integer> values) {
            addCriterion("tbm_invite_user not in", values, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserBetween(Integer value1, Integer value2) {
            addCriterion("tbm_invite_user between", value1, value2, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmInviteUserNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_invite_user not between", value1, value2, "tbmInviteUser");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNull() {
            addCriterion("tbm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNotNull() {
            addCriterion("tbm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeEqualTo(Date value) {
            addCriterion("tbm_update_time =", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbm_update_time <>", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThan(Date value) {
            addCriterion("tbm_update_time >", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time >=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThan(Date value) {
            addCriterion("tbm_update_time <", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time <=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIn(List<Date> values) {
            addCriterion("tbm_update_time in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbm_update_time not in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time not between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNull() {
            addCriterion("tbm_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNotNull() {
            addCriterion("tbm_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeEqualTo(Date value) {
            addCriterion("tbm_add_time =", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotEqualTo(Date value) {
            addCriterion("tbm_add_time <>", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThan(Date value) {
            addCriterion("tbm_add_time >", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time >=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThan(Date value) {
            addCriterion("tbm_add_time <", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time <=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIn(List<Date> values) {
            addCriterion("tbm_add_time in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotIn(List<Date> values) {
            addCriterion("tbm_add_time not in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time not between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeIsNull() {
            addCriterion("tbm_deposit_addtime is null");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeIsNotNull() {
            addCriterion("tbm_deposit_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeEqualTo(Date value) {
            addCriterion("tbm_deposit_addtime =", value, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeNotEqualTo(Date value) {
            addCriterion("tbm_deposit_addtime <>", value, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeGreaterThan(Date value) {
            addCriterion("tbm_deposit_addtime >", value, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_deposit_addtime >=", value, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeLessThan(Date value) {
            addCriterion("tbm_deposit_addtime <", value, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_deposit_addtime <=", value, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeIn(List<Date> values) {
            addCriterion("tbm_deposit_addtime in", values, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeNotIn(List<Date> values) {
            addCriterion("tbm_deposit_addtime not in", values, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeBetween(Date value1, Date value2) {
            addCriterion("tbm_deposit_addtime between", value1, value2, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmDepositAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_deposit_addtime not between", value1, value2, "tbmDepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeIsNull() {
            addCriterion("tbm_ldeposit_addtime is null");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeIsNotNull() {
            addCriterion("tbm_ldeposit_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeEqualTo(Date value) {
            addCriterion("tbm_ldeposit_addtime =", value, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeNotEqualTo(Date value) {
            addCriterion("tbm_ldeposit_addtime <>", value, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeGreaterThan(Date value) {
            addCriterion("tbm_ldeposit_addtime >", value, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_ldeposit_addtime >=", value, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeLessThan(Date value) {
            addCriterion("tbm_ldeposit_addtime <", value, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_ldeposit_addtime <=", value, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeIn(List<Date> values) {
            addCriterion("tbm_ldeposit_addtime in", values, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeNotIn(List<Date> values) {
            addCriterion("tbm_ldeposit_addtime not in", values, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeBetween(Date value1, Date value2) {
            addCriterion("tbm_ldeposit_addtime between", value1, value2, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmLdepositAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_ldeposit_addtime not between", value1, value2, "tbmLdepositAddtime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeIsNull() {
            addCriterion("tbm_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeIsNotNull() {
            addCriterion("tbm_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeEqualTo(Date value) {
            addCriterion("tbm_check_time =", value, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeNotEqualTo(Date value) {
            addCriterion("tbm_check_time <>", value, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeGreaterThan(Date value) {
            addCriterion("tbm_check_time >", value, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_check_time >=", value, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeLessThan(Date value) {
            addCriterion("tbm_check_time <", value, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_check_time <=", value, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeIn(List<Date> values) {
            addCriterion("tbm_check_time in", values, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeNotIn(List<Date> values) {
            addCriterion("tbm_check_time not in", values, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_check_time between", value1, value2, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_check_time not between", value1, value2, "tbmCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeIsNull() {
            addCriterion("tbm_last_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeIsNotNull() {
            addCriterion("tbm_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeEqualTo(Date value) {
            addCriterion("tbm_last_time =", value, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeNotEqualTo(Date value) {
            addCriterion("tbm_last_time <>", value, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeGreaterThan(Date value) {
            addCriterion("tbm_last_time >", value, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_last_time >=", value, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeLessThan(Date value) {
            addCriterion("tbm_last_time <", value, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_last_time <=", value, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeIn(List<Date> values) {
            addCriterion("tbm_last_time in", values, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeNotIn(List<Date> values) {
            addCriterion("tbm_last_time not in", values, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_last_time between", value1, value2, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_last_time not between", value1, value2, "tbmLastTime");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSIsNull() {
            addCriterion("tbm_login_s is null");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSIsNotNull() {
            addCriterion("tbm_login_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSEqualTo(Integer value) {
            addCriterion("tbm_login_s =", value, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSNotEqualTo(Integer value) {
            addCriterion("tbm_login_s <>", value, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSGreaterThan(Integer value) {
            addCriterion("tbm_login_s >", value, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_login_s >=", value, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSLessThan(Integer value) {
            addCriterion("tbm_login_s <", value, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_login_s <=", value, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSIn(List<Integer> values) {
            addCriterion("tbm_login_s in", values, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSNotIn(List<Integer> values) {
            addCriterion("tbm_login_s not in", values, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSBetween(Integer value1, Integer value2) {
            addCriterion("tbm_login_s between", value1, value2, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLoginSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_login_s not between", value1, value2, "tbmLoginS");
            return (Criteria) this;
        }

        public Criteria andTbmLatIsNull() {
            addCriterion("tbm_lat is null");
            return (Criteria) this;
        }

        public Criteria andTbmLatIsNotNull() {
            addCriterion("tbm_lat is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLatEqualTo(BigDecimal value) {
            addCriterion("tbm_lat =", value, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatNotEqualTo(BigDecimal value) {
            addCriterion("tbm_lat <>", value, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatGreaterThan(BigDecimal value) {
            addCriterion("tbm_lat >", value, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_lat >=", value, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatLessThan(BigDecimal value) {
            addCriterion("tbm_lat <", value, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_lat <=", value, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatIn(List<BigDecimal> values) {
            addCriterion("tbm_lat in", values, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatNotIn(List<BigDecimal> values) {
            addCriterion("tbm_lat not in", values, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_lat between", value1, value2, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_lat not between", value1, value2, "tbmLat");
            return (Criteria) this;
        }

        public Criteria andTbmLngIsNull() {
            addCriterion("tbm_lng is null");
            return (Criteria) this;
        }

        public Criteria andTbmLngIsNotNull() {
            addCriterion("tbm_lng is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLngEqualTo(BigDecimal value) {
            addCriterion("tbm_lng =", value, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngNotEqualTo(BigDecimal value) {
            addCriterion("tbm_lng <>", value, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngGreaterThan(BigDecimal value) {
            addCriterion("tbm_lng >", value, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_lng >=", value, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngLessThan(BigDecimal value) {
            addCriterion("tbm_lng <", value, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_lng <=", value, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngIn(List<BigDecimal> values) {
            addCriterion("tbm_lng in", values, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngNotIn(List<BigDecimal> values) {
            addCriterion("tbm_lng not in", values, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_lng between", value1, value2, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_lng not between", value1, value2, "tbmLng");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseIsNull() {
            addCriterion("tbm_first_use is null");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseIsNotNull() {
            addCriterion("tbm_first_use is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseEqualTo(Date value) {
            addCriterion("tbm_first_use =", value, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseNotEqualTo(Date value) {
            addCriterion("tbm_first_use <>", value, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseGreaterThan(Date value) {
            addCriterion("tbm_first_use >", value, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_first_use >=", value, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseLessThan(Date value) {
            addCriterion("tbm_first_use <", value, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseLessThanOrEqualTo(Date value) {
            addCriterion("tbm_first_use <=", value, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseIn(List<Date> values) {
            addCriterion("tbm_first_use in", values, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseNotIn(List<Date> values) {
            addCriterion("tbm_first_use not in", values, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseBetween(Date value1, Date value2) {
            addCriterion("tbm_first_use between", value1, value2, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmFirstUseNotBetween(Date value1, Date value2) {
            addCriterion("tbm_first_use not between", value1, value2, "tbmFirstUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseIsNull() {
            addCriterion("tbm_last_use is null");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseIsNotNull() {
            addCriterion("tbm_last_use is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseEqualTo(Date value) {
            addCriterion("tbm_last_use =", value, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseNotEqualTo(Date value) {
            addCriterion("tbm_last_use <>", value, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseGreaterThan(Date value) {
            addCriterion("tbm_last_use >", value, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_last_use >=", value, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseLessThan(Date value) {
            addCriterion("tbm_last_use <", value, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseLessThanOrEqualTo(Date value) {
            addCriterion("tbm_last_use <=", value, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseIn(List<Date> values) {
            addCriterion("tbm_last_use in", values, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseNotIn(List<Date> values) {
            addCriterion("tbm_last_use not in", values, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseBetween(Date value1, Date value2) {
            addCriterion("tbm_last_use between", value1, value2, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmLastUseNotBetween(Date value1, Date value2) {
            addCriterion("tbm_last_use not between", value1, value2, "tbmLastUse");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeIsNull() {
            addCriterion("tbm_all_recharge is null");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeIsNotNull() {
            addCriterion("tbm_all_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeEqualTo(BigDecimal value) {
            addCriterion("tbm_all_recharge =", value, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeNotEqualTo(BigDecimal value) {
            addCriterion("tbm_all_recharge <>", value, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeGreaterThan(BigDecimal value) {
            addCriterion("tbm_all_recharge >", value, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_all_recharge >=", value, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeLessThan(BigDecimal value) {
            addCriterion("tbm_all_recharge <", value, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_all_recharge <=", value, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeIn(List<BigDecimal> values) {
            addCriterion("tbm_all_recharge in", values, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeNotIn(List<BigDecimal> values) {
            addCriterion("tbm_all_recharge not in", values, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_all_recharge between", value1, value2, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_all_recharge not between", value1, value2, "tbmAllRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSIsNull() {
            addCriterion("tbm_all_order_s is null");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSIsNotNull() {
            addCriterion("tbm_all_order_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSEqualTo(Integer value) {
            addCriterion("tbm_all_order_s =", value, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSNotEqualTo(Integer value) {
            addCriterion("tbm_all_order_s <>", value, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSGreaterThan(Integer value) {
            addCriterion("tbm_all_order_s >", value, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_all_order_s >=", value, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSLessThan(Integer value) {
            addCriterion("tbm_all_order_s <", value, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_all_order_s <=", value, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSIn(List<Integer> values) {
            addCriterion("tbm_all_order_s in", values, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSNotIn(List<Integer> values) {
            addCriterion("tbm_all_order_s not in", values, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSBetween(Integer value1, Integer value2) {
            addCriterion("tbm_all_order_s between", value1, value2, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllOrderSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_all_order_s not between", value1, value2, "tbmAllOrderS");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsIsNull() {
            addCriterion("tbm_allamounts is null");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsIsNotNull() {
            addCriterion("tbm_allamounts is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsEqualTo(Integer value) {
            addCriterion("tbm_allamounts =", value, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsNotEqualTo(Integer value) {
            addCriterion("tbm_allamounts <>", value, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsGreaterThan(Integer value) {
            addCriterion("tbm_allamounts >", value, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_allamounts >=", value, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsLessThan(Integer value) {
            addCriterion("tbm_allamounts <", value, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_allamounts <=", value, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsIn(List<Integer> values) {
            addCriterion("tbm_allamounts in", values, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsNotIn(List<Integer> values) {
            addCriterion("tbm_allamounts not in", values, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsBetween(Integer value1, Integer value2) {
            addCriterion("tbm_allamounts between", value1, value2, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllamountsNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_allamounts not between", value1, value2, "tbmAllamounts");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeIsNull() {
            addCriterion("tbm_all_use_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeIsNotNull() {
            addCriterion("tbm_all_use_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeEqualTo(BigDecimal value) {
            addCriterion("tbm_all_use_time =", value, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeNotEqualTo(BigDecimal value) {
            addCriterion("tbm_all_use_time <>", value, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeGreaterThan(BigDecimal value) {
            addCriterion("tbm_all_use_time >", value, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_all_use_time >=", value, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeLessThan(BigDecimal value) {
            addCriterion("tbm_all_use_time <", value, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbm_all_use_time <=", value, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeIn(List<BigDecimal> values) {
            addCriterion("tbm_all_use_time in", values, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeNotIn(List<BigDecimal> values) {
            addCriterion("tbm_all_use_time not in", values, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_all_use_time between", value1, value2, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllUseTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbm_all_use_time not between", value1, value2, "tbmAllUseTime");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSIsNull() {
            addCriterion("tbm_all_violat_s is null");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSIsNotNull() {
            addCriterion("tbm_all_violat_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSEqualTo(Integer value) {
            addCriterion("tbm_all_violat_s =", value, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSNotEqualTo(Integer value) {
            addCriterion("tbm_all_violat_s <>", value, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSGreaterThan(Integer value) {
            addCriterion("tbm_all_violat_s >", value, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_all_violat_s >=", value, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSLessThan(Integer value) {
            addCriterion("tbm_all_violat_s <", value, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_all_violat_s <=", value, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSIn(List<Integer> values) {
            addCriterion("tbm_all_violat_s in", values, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSNotIn(List<Integer> values) {
            addCriterion("tbm_all_violat_s not in", values, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSBetween(Integer value1, Integer value2) {
            addCriterion("tbm_all_violat_s between", value1, value2, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllViolatSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_all_violat_s not between", value1, value2, "tbmAllViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSIsNull() {
            addCriterion("tbm_un_violat_s is null");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSIsNotNull() {
            addCriterion("tbm_un_violat_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSEqualTo(Integer value) {
            addCriterion("tbm_un_violat_s =", value, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSNotEqualTo(Integer value) {
            addCriterion("tbm_un_violat_s <>", value, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSGreaterThan(Integer value) {
            addCriterion("tbm_un_violat_s >", value, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_un_violat_s >=", value, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSLessThan(Integer value) {
            addCriterion("tbm_un_violat_s <", value, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_un_violat_s <=", value, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSIn(List<Integer> values) {
            addCriterion("tbm_un_violat_s in", values, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSNotIn(List<Integer> values) {
            addCriterion("tbm_un_violat_s not in", values, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSBetween(Integer value1, Integer value2) {
            addCriterion("tbm_un_violat_s between", value1, value2, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmUnViolatSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_un_violat_s not between", value1, value2, "tbmUnViolatS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSIsNull() {
            addCriterion("tbm_all_trouble_s is null");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSIsNotNull() {
            addCriterion("tbm_all_trouble_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSEqualTo(Integer value) {
            addCriterion("tbm_all_trouble_s =", value, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSNotEqualTo(Integer value) {
            addCriterion("tbm_all_trouble_s <>", value, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSGreaterThan(Integer value) {
            addCriterion("tbm_all_trouble_s >", value, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_all_trouble_s >=", value, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSLessThan(Integer value) {
            addCriterion("tbm_all_trouble_s <", value, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_all_trouble_s <=", value, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSIn(List<Integer> values) {
            addCriterion("tbm_all_trouble_s in", values, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSNotIn(List<Integer> values) {
            addCriterion("tbm_all_trouble_s not in", values, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSBetween(Integer value1, Integer value2) {
            addCriterion("tbm_all_trouble_s between", value1, value2, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmAllTroubleSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_all_trouble_s not between", value1, value2, "tbmAllTroubleS");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeIsNull() {
            addCriterion("tbm_first_recharge is null");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeIsNotNull() {
            addCriterion("tbm_first_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeEqualTo(Date value) {
            addCriterion("tbm_first_recharge =", value, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeNotEqualTo(Date value) {
            addCriterion("tbm_first_recharge <>", value, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeGreaterThan(Date value) {
            addCriterion("tbm_first_recharge >", value, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_first_recharge >=", value, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeLessThan(Date value) {
            addCriterion("tbm_first_recharge <", value, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_first_recharge <=", value, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeIn(List<Date> values) {
            addCriterion("tbm_first_recharge in", values, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeNotIn(List<Date> values) {
            addCriterion("tbm_first_recharge not in", values, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeBetween(Date value1, Date value2) {
            addCriterion("tbm_first_recharge between", value1, value2, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmFirstRechargeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_first_recharge not between", value1, value2, "tbmFirstRecharge");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeIsNull() {
            addCriterion("tbm_refund_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeIsNotNull() {
            addCriterion("tbm_refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeEqualTo(Date value) {
            addCriterion("tbm_refund_time =", value, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeNotEqualTo(Date value) {
            addCriterion("tbm_refund_time <>", value, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeGreaterThan(Date value) {
            addCriterion("tbm_refund_time >", value, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_refund_time >=", value, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeLessThan(Date value) {
            addCriterion("tbm_refund_time <", value, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_refund_time <=", value, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeIn(List<Date> values) {
            addCriterion("tbm_refund_time in", values, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeNotIn(List<Date> values) {
            addCriterion("tbm_refund_time not in", values, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_refund_time between", value1, value2, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_refund_time not between", value1, value2, "tbmRefundTime");
            return (Criteria) this;
        }

        public Criteria andTbmFromIsNull() {
            addCriterion("tbm_from is null");
            return (Criteria) this;
        }

        public Criteria andTbmFromIsNotNull() {
            addCriterion("tbm_from is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFromEqualTo(Byte value) {
            addCriterion("tbm_from =", value, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromNotEqualTo(Byte value) {
            addCriterion("tbm_from <>", value, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromGreaterThan(Byte value) {
            addCriterion("tbm_from >", value, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_from >=", value, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromLessThan(Byte value) {
            addCriterion("tbm_from <", value, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_from <=", value, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromIn(List<Byte> values) {
            addCriterion("tbm_from in", values, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromNotIn(List<Byte> values) {
            addCriterion("tbm_from not in", values, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromBetween(Byte value1, Byte value2) {
            addCriterion("tbm_from between", value1, value2, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmFromNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_from not between", value1, value2, "tbmFrom");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeIsNull() {
            addCriterion("tbm_certify_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeIsNotNull() {
            addCriterion("tbm_certify_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeEqualTo(Byte value) {
            addCriterion("tbm_certify_type =", value, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeNotEqualTo(Byte value) {
            addCriterion("tbm_certify_type <>", value, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeGreaterThan(Byte value) {
            addCriterion("tbm_certify_type >", value, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_certify_type >=", value, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeLessThan(Byte value) {
            addCriterion("tbm_certify_type <", value, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_certify_type <=", value, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeIn(List<Byte> values) {
            addCriterion("tbm_certify_type in", values, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeNotIn(List<Byte> values) {
            addCriterion("tbm_certify_type not in", values, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbm_certify_type between", value1, value2, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_certify_type not between", value1, value2, "tbmCertifyType");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumIsNull() {
            addCriterion("tbm_certify_num is null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumIsNotNull() {
            addCriterion("tbm_certify_num is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumEqualTo(String value) {
            addCriterion("tbm_certify_num =", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumNotEqualTo(String value) {
            addCriterion("tbm_certify_num <>", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumGreaterThan(String value) {
            addCriterion("tbm_certify_num >", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_certify_num >=", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumLessThan(String value) {
            addCriterion("tbm_certify_num <", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumLessThanOrEqualTo(String value) {
            addCriterion("tbm_certify_num <=", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumLike(String value) {
            addCriterion("tbm_certify_num like", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumNotLike(String value) {
            addCriterion("tbm_certify_num not like", value, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumIn(List<String> values) {
            addCriterion("tbm_certify_num in", values, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumNotIn(List<String> values) {
            addCriterion("tbm_certify_num not in", values, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumBetween(String value1, String value2) {
            addCriterion("tbm_certify_num between", value1, value2, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyNumNotBetween(String value1, String value2) {
            addCriterion("tbm_certify_num not between", value1, value2, "tbmCertifyNum");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageIsNull() {
            addCriterion("tbm_certify_image is null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageIsNotNull() {
            addCriterion("tbm_certify_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageEqualTo(String value) {
            addCriterion("tbm_certify_image =", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageNotEqualTo(String value) {
            addCriterion("tbm_certify_image <>", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageGreaterThan(String value) {
            addCriterion("tbm_certify_image >", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_certify_image >=", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageLessThan(String value) {
            addCriterion("tbm_certify_image <", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageLessThanOrEqualTo(String value) {
            addCriterion("tbm_certify_image <=", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageLike(String value) {
            addCriterion("tbm_certify_image like", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageNotLike(String value) {
            addCriterion("tbm_certify_image not like", value, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageIn(List<String> values) {
            addCriterion("tbm_certify_image in", values, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageNotIn(List<String> values) {
            addCriterion("tbm_certify_image not in", values, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageBetween(String value1, String value2) {
            addCriterion("tbm_certify_image between", value1, value2, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyImageNotBetween(String value1, String value2) {
            addCriterion("tbm_certify_image not between", value1, value2, "tbmCertifyImage");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireIsNull() {
            addCriterion("tbm_certify_expire is null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireIsNotNull() {
            addCriterion("tbm_certify_expire is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireEqualTo(Date value) {
            addCriterion("tbm_certify_expire =", value, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireNotEqualTo(Date value) {
            addCriterion("tbm_certify_expire <>", value, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireGreaterThan(Date value) {
            addCriterion("tbm_certify_expire >", value, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_certify_expire >=", value, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireLessThan(Date value) {
            addCriterion("tbm_certify_expire <", value, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireLessThanOrEqualTo(Date value) {
            addCriterion("tbm_certify_expire <=", value, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireIn(List<Date> values) {
            addCriterion("tbm_certify_expire in", values, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireNotIn(List<Date> values) {
            addCriterion("tbm_certify_expire not in", values, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireBetween(Date value1, Date value2) {
            addCriterion("tbm_certify_expire between", value1, value2, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyExpireNotBetween(Date value1, Date value2) {
            addCriterion("tbm_certify_expire not between", value1, value2, "tbmCertifyExpire");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontIsNull() {
            addCriterion("tbm_id_front is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontIsNotNull() {
            addCriterion("tbm_id_front is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontEqualTo(String value) {
            addCriterion("tbm_id_front =", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontNotEqualTo(String value) {
            addCriterion("tbm_id_front <>", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontGreaterThan(String value) {
            addCriterion("tbm_id_front >", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_id_front >=", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontLessThan(String value) {
            addCriterion("tbm_id_front <", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontLessThanOrEqualTo(String value) {
            addCriterion("tbm_id_front <=", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontLike(String value) {
            addCriterion("tbm_id_front like", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontNotLike(String value) {
            addCriterion("tbm_id_front not like", value, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontIn(List<String> values) {
            addCriterion("tbm_id_front in", values, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontNotIn(List<String> values) {
            addCriterion("tbm_id_front not in", values, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontBetween(String value1, String value2) {
            addCriterion("tbm_id_front between", value1, value2, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdFrontNotBetween(String value1, String value2) {
            addCriterion("tbm_id_front not between", value1, value2, "tbmIdFront");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackIsNull() {
            addCriterion("tbm_id_back is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackIsNotNull() {
            addCriterion("tbm_id_back is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackEqualTo(String value) {
            addCriterion("tbm_id_back =", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackNotEqualTo(String value) {
            addCriterion("tbm_id_back <>", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackGreaterThan(String value) {
            addCriterion("tbm_id_back >", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_id_back >=", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackLessThan(String value) {
            addCriterion("tbm_id_back <", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackLessThanOrEqualTo(String value) {
            addCriterion("tbm_id_back <=", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackLike(String value) {
            addCriterion("tbm_id_back like", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackNotLike(String value) {
            addCriterion("tbm_id_back not like", value, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackIn(List<String> values) {
            addCriterion("tbm_id_back in", values, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackNotIn(List<String> values) {
            addCriterion("tbm_id_back not in", values, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackBetween(String value1, String value2) {
            addCriterion("tbm_id_back between", value1, value2, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmIdBackNotBetween(String value1, String value2) {
            addCriterion("tbm_id_back not between", value1, value2, "tbmIdBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontIsNull() {
            addCriterion("tbm_driver_front is null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontIsNotNull() {
            addCriterion("tbm_driver_front is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontEqualTo(String value) {
            addCriterion("tbm_driver_front =", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontNotEqualTo(String value) {
            addCriterion("tbm_driver_front <>", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontGreaterThan(String value) {
            addCriterion("tbm_driver_front >", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_driver_front >=", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontLessThan(String value) {
            addCriterion("tbm_driver_front <", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontLessThanOrEqualTo(String value) {
            addCriterion("tbm_driver_front <=", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontLike(String value) {
            addCriterion("tbm_driver_front like", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontNotLike(String value) {
            addCriterion("tbm_driver_front not like", value, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontIn(List<String> values) {
            addCriterion("tbm_driver_front in", values, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontNotIn(List<String> values) {
            addCriterion("tbm_driver_front not in", values, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontBetween(String value1, String value2) {
            addCriterion("tbm_driver_front between", value1, value2, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverFrontNotBetween(String value1, String value2) {
            addCriterion("tbm_driver_front not between", value1, value2, "tbmDriverFront");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackIsNull() {
            addCriterion("tbm_driver_back is null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackIsNotNull() {
            addCriterion("tbm_driver_back is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackEqualTo(String value) {
            addCriterion("tbm_driver_back =", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackNotEqualTo(String value) {
            addCriterion("tbm_driver_back <>", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackGreaterThan(String value) {
            addCriterion("tbm_driver_back >", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_driver_back >=", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackLessThan(String value) {
            addCriterion("tbm_driver_back <", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackLessThanOrEqualTo(String value) {
            addCriterion("tbm_driver_back <=", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackLike(String value) {
            addCriterion("tbm_driver_back like", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackNotLike(String value) {
            addCriterion("tbm_driver_back not like", value, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackIn(List<String> values) {
            addCriterion("tbm_driver_back in", values, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackNotIn(List<String> values) {
            addCriterion("tbm_driver_back not in", values, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackBetween(String value1, String value2) {
            addCriterion("tbm_driver_back between", value1, value2, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmDriverBackNotBetween(String value1, String value2) {
            addCriterion("tbm_driver_back not between", value1, value2, "tbmDriverBack");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageIsNull() {
            addCriterion("tbm_check_image is null");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageIsNotNull() {
            addCriterion("tbm_check_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageEqualTo(String value) {
            addCriterion("tbm_check_image =", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageNotEqualTo(String value) {
            addCriterion("tbm_check_image <>", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageGreaterThan(String value) {
            addCriterion("tbm_check_image >", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_check_image >=", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageLessThan(String value) {
            addCriterion("tbm_check_image <", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageLessThanOrEqualTo(String value) {
            addCriterion("tbm_check_image <=", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageLike(String value) {
            addCriterion("tbm_check_image like", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageNotLike(String value) {
            addCriterion("tbm_check_image not like", value, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageIn(List<String> values) {
            addCriterion("tbm_check_image in", values, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageNotIn(List<String> values) {
            addCriterion("tbm_check_image not in", values, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageBetween(String value1, String value2) {
            addCriterion("tbm_check_image between", value1, value2, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCheckImageNotBetween(String value1, String value2) {
            addCriterion("tbm_check_image not between", value1, value2, "tbmCheckImage");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyIsNull() {
            addCriterion("tbm_company is null");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyIsNotNull() {
            addCriterion("tbm_company is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyEqualTo(String value) {
            addCriterion("tbm_company =", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyNotEqualTo(String value) {
            addCriterion("tbm_company <>", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyGreaterThan(String value) {
            addCriterion("tbm_company >", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_company >=", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyLessThan(String value) {
            addCriterion("tbm_company <", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyLessThanOrEqualTo(String value) {
            addCriterion("tbm_company <=", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyLike(String value) {
            addCriterion("tbm_company like", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyNotLike(String value) {
            addCriterion("tbm_company not like", value, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyIn(List<String> values) {
            addCriterion("tbm_company in", values, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyNotIn(List<String> values) {
            addCriterion("tbm_company not in", values, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyBetween(String value1, String value2) {
            addCriterion("tbm_company between", value1, value2, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCompanyNotBetween(String value1, String value2) {
            addCriterion("tbm_company not between", value1, value2, "tbmCompany");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoIsNull() {
            addCriterion("tbm_certify_info is null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoIsNotNull() {
            addCriterion("tbm_certify_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoEqualTo(String value) {
            addCriterion("tbm_certify_info =", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoNotEqualTo(String value) {
            addCriterion("tbm_certify_info <>", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoGreaterThan(String value) {
            addCriterion("tbm_certify_info >", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_certify_info >=", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoLessThan(String value) {
            addCriterion("tbm_certify_info <", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoLessThanOrEqualTo(String value) {
            addCriterion("tbm_certify_info <=", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoLike(String value) {
            addCriterion("tbm_certify_info like", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoNotLike(String value) {
            addCriterion("tbm_certify_info not like", value, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoIn(List<String> values) {
            addCriterion("tbm_certify_info in", values, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoNotIn(List<String> values) {
            addCriterion("tbm_certify_info not in", values, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoBetween(String value1, String value2) {
            addCriterion("tbm_certify_info between", value1, value2, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyInfoNotBetween(String value1, String value2) {
            addCriterion("tbm_certify_info not between", value1, value2, "tbmCertifyInfo");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageIsNull() {
            addCriterion("tbm_hold_image is null");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageIsNotNull() {
            addCriterion("tbm_hold_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageEqualTo(String value) {
            addCriterion("tbm_hold_image =", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageNotEqualTo(String value) {
            addCriterion("tbm_hold_image <>", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageGreaterThan(String value) {
            addCriterion("tbm_hold_image >", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_hold_image >=", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageLessThan(String value) {
            addCriterion("tbm_hold_image <", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageLessThanOrEqualTo(String value) {
            addCriterion("tbm_hold_image <=", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageLike(String value) {
            addCriterion("tbm_hold_image like", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageNotLike(String value) {
            addCriterion("tbm_hold_image not like", value, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageIn(List<String> values) {
            addCriterion("tbm_hold_image in", values, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageNotIn(List<String> values) {
            addCriterion("tbm_hold_image not in", values, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageBetween(String value1, String value2) {
            addCriterion("tbm_hold_image between", value1, value2, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmHoldImageNotBetween(String value1, String value2) {
            addCriterion("tbm_hold_image not between", value1, value2, "tbmHoldImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageIsNull() {
            addCriterion("tbm_driver_image is null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageIsNotNull() {
            addCriterion("tbm_driver_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageEqualTo(String value) {
            addCriterion("tbm_driver_image =", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageNotEqualTo(String value) {
            addCriterion("tbm_driver_image <>", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageGreaterThan(String value) {
            addCriterion("tbm_driver_image >", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_driver_image >=", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageLessThan(String value) {
            addCriterion("tbm_driver_image <", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageLessThanOrEqualTo(String value) {
            addCriterion("tbm_driver_image <=", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageLike(String value) {
            addCriterion("tbm_driver_image like", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageNotLike(String value) {
            addCriterion("tbm_driver_image not like", value, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageIn(List<String> values) {
            addCriterion("tbm_driver_image in", values, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageNotIn(List<String> values) {
            addCriterion("tbm_driver_image not in", values, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageBetween(String value1, String value2) {
            addCriterion("tbm_driver_image between", value1, value2, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverImageNotBetween(String value1, String value2) {
            addCriterion("tbm_driver_image not between", value1, value2, "tbmDriverImage");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireIsNull() {
            addCriterion("tbm_driver_expire is null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireIsNotNull() {
            addCriterion("tbm_driver_expire is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireEqualTo(Date value) {
            addCriterion("tbm_driver_expire =", value, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireNotEqualTo(Date value) {
            addCriterion("tbm_driver_expire <>", value, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireGreaterThan(Date value) {
            addCriterion("tbm_driver_expire >", value, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_driver_expire >=", value, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireLessThan(Date value) {
            addCriterion("tbm_driver_expire <", value, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireLessThanOrEqualTo(Date value) {
            addCriterion("tbm_driver_expire <=", value, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireIn(List<Date> values) {
            addCriterion("tbm_driver_expire in", values, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireNotIn(List<Date> values) {
            addCriterion("tbm_driver_expire not in", values, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireBetween(Date value1, Date value2) {
            addCriterion("tbm_driver_expire between", value1, value2, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverExpireNotBetween(Date value1, Date value2) {
            addCriterion("tbm_driver_expire not between", value1, value2, "tbmDriverExpire");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeIsNull() {
            addCriterion("tbm_driver_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeIsNotNull() {
            addCriterion("tbm_driver_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeEqualTo(String value) {
            addCriterion("tbm_driver_type =", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeNotEqualTo(String value) {
            addCriterion("tbm_driver_type <>", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeGreaterThan(String value) {
            addCriterion("tbm_driver_type >", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_driver_type >=", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeLessThan(String value) {
            addCriterion("tbm_driver_type <", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeLessThanOrEqualTo(String value) {
            addCriterion("tbm_driver_type <=", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeLike(String value) {
            addCriterion("tbm_driver_type like", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeNotLike(String value) {
            addCriterion("tbm_driver_type not like", value, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeIn(List<String> values) {
            addCriterion("tbm_driver_type in", values, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeNotIn(List<String> values) {
            addCriterion("tbm_driver_type not in", values, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeBetween(String value1, String value2) {
            addCriterion("tbm_driver_type between", value1, value2, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverTypeNotBetween(String value1, String value2) {
            addCriterion("tbm_driver_type not between", value1, value2, "tbmDriverType");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoIsNull() {
            addCriterion("tbm_driver_info is null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoIsNotNull() {
            addCriterion("tbm_driver_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoEqualTo(String value) {
            addCriterion("tbm_driver_info =", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoNotEqualTo(String value) {
            addCriterion("tbm_driver_info <>", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoGreaterThan(String value) {
            addCriterion("tbm_driver_info >", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_driver_info >=", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoLessThan(String value) {
            addCriterion("tbm_driver_info <", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoLessThanOrEqualTo(String value) {
            addCriterion("tbm_driver_info <=", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoLike(String value) {
            addCriterion("tbm_driver_info like", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoNotLike(String value) {
            addCriterion("tbm_driver_info not like", value, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoIn(List<String> values) {
            addCriterion("tbm_driver_info in", values, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoNotIn(List<String> values) {
            addCriterion("tbm_driver_info not in", values, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoBetween(String value1, String value2) {
            addCriterion("tbm_driver_info between", value1, value2, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmDriverInfoNotBetween(String value1, String value2) {
            addCriterion("tbm_driver_info not between", value1, value2, "tbmDriverInfo");
            return (Criteria) this;
        }

        public Criteria andTbmSexIsNull() {
            addCriterion("tbm_sex is null");
            return (Criteria) this;
        }

        public Criteria andTbmSexIsNotNull() {
            addCriterion("tbm_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTbmSexEqualTo(Byte value) {
            addCriterion("tbm_sex =", value, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexNotEqualTo(Byte value) {
            addCriterion("tbm_sex <>", value, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexGreaterThan(Byte value) {
            addCriterion("tbm_sex >", value, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_sex >=", value, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexLessThan(Byte value) {
            addCriterion("tbm_sex <", value, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_sex <=", value, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexIn(List<Byte> values) {
            addCriterion("tbm_sex in", values, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexNotIn(List<Byte> values) {
            addCriterion("tbm_sex not in", values, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexBetween(Byte value1, Byte value2) {
            addCriterion("tbm_sex between", value1, value2, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmSexNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_sex not between", value1, value2, "tbmSex");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayIsNull() {
            addCriterion("tbm_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayIsNotNull() {
            addCriterion("tbm_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_birthday =", value, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_birthday <>", value, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("tbm_birthday >", value, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_birthday >=", value, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("tbm_birthday <", value, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbm_birthday <=", value, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_birthday in", values, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbm_birthday not in", values, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_birthday between", value1, value2, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbm_birthday not between", value1, value2, "tbmBirthday");
            return (Criteria) this;
        }

        public Criteria andTbmNationIsNull() {
            addCriterion("tbm_nation is null");
            return (Criteria) this;
        }

        public Criteria andTbmNationIsNotNull() {
            addCriterion("tbm_nation is not null");
            return (Criteria) this;
        }

        public Criteria andTbmNationEqualTo(String value) {
            addCriterion("tbm_nation =", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationNotEqualTo(String value) {
            addCriterion("tbm_nation <>", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationGreaterThan(String value) {
            addCriterion("tbm_nation >", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_nation >=", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationLessThan(String value) {
            addCriterion("tbm_nation <", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationLessThanOrEqualTo(String value) {
            addCriterion("tbm_nation <=", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationLike(String value) {
            addCriterion("tbm_nation like", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationNotLike(String value) {
            addCriterion("tbm_nation not like", value, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationIn(List<String> values) {
            addCriterion("tbm_nation in", values, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationNotIn(List<String> values) {
            addCriterion("tbm_nation not in", values, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationBetween(String value1, String value2) {
            addCriterion("tbm_nation between", value1, value2, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmNationNotBetween(String value1, String value2) {
            addCriterion("tbm_nation not between", value1, value2, "tbmNation");
            return (Criteria) this;
        }

        public Criteria andTbmAddressIsNull() {
            addCriterion("tbm_address is null");
            return (Criteria) this;
        }

        public Criteria andTbmAddressIsNotNull() {
            addCriterion("tbm_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAddressEqualTo(String value) {
            addCriterion("tbm_address =", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressNotEqualTo(String value) {
            addCriterion("tbm_address <>", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressGreaterThan(String value) {
            addCriterion("tbm_address >", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_address >=", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressLessThan(String value) {
            addCriterion("tbm_address <", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressLessThanOrEqualTo(String value) {
            addCriterion("tbm_address <=", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressLike(String value) {
            addCriterion("tbm_address like", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressNotLike(String value) {
            addCriterion("tbm_address not like", value, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressIn(List<String> values) {
            addCriterion("tbm_address in", values, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressNotIn(List<String> values) {
            addCriterion("tbm_address not in", values, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressBetween(String value1, String value2) {
            addCriterion("tbm_address between", value1, value2, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmAddressNotBetween(String value1, String value2) {
            addCriterion("tbm_address not between", value1, value2, "tbmAddress");
            return (Criteria) this;
        }

        public Criteria andTbmPostilIsNull() {
            addCriterion("tbm_postil is null");
            return (Criteria) this;
        }

        public Criteria andTbmPostilIsNotNull() {
            addCriterion("tbm_postil is not null");
            return (Criteria) this;
        }

        public Criteria andTbmPostilEqualTo(String value) {
            addCriterion("tbm_postil =", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilNotEqualTo(String value) {
            addCriterion("tbm_postil <>", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilGreaterThan(String value) {
            addCriterion("tbm_postil >", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_postil >=", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilLessThan(String value) {
            addCriterion("tbm_postil <", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilLessThanOrEqualTo(String value) {
            addCriterion("tbm_postil <=", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilLike(String value) {
            addCriterion("tbm_postil like", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilNotLike(String value) {
            addCriterion("tbm_postil not like", value, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilIn(List<String> values) {
            addCriterion("tbm_postil in", values, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilNotIn(List<String> values) {
            addCriterion("tbm_postil not in", values, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilBetween(String value1, String value2) {
            addCriterion("tbm_postil between", value1, value2, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmPostilNotBetween(String value1, String value2) {
            addCriterion("tbm_postil not between", value1, value2, "tbmPostil");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkIsNull() {
            addCriterion("tbm_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkIsNotNull() {
            addCriterion("tbm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkEqualTo(String value) {
            addCriterion("tbm_remark =", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotEqualTo(String value) {
            addCriterion("tbm_remark <>", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkGreaterThan(String value) {
            addCriterion("tbm_remark >", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_remark >=", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkLessThan(String value) {
            addCriterion("tbm_remark <", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbm_remark <=", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkLike(String value) {
            addCriterion("tbm_remark like", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotLike(String value) {
            addCriterion("tbm_remark not like", value, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkIn(List<String> values) {
            addCriterion("tbm_remark in", values, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotIn(List<String> values) {
            addCriterion("tbm_remark not in", values, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkBetween(String value1, String value2) {
            addCriterion("tbm_remark between", value1, value2, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmRemarkNotBetween(String value1, String value2) {
            addCriterion("tbm_remark not between", value1, value2, "tbmRemark");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderIsNull() {
            addCriterion("tbm_can_order is null");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderIsNotNull() {
            addCriterion("tbm_can_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderEqualTo(Byte value) {
            addCriterion("tbm_can_order =", value, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderNotEqualTo(Byte value) {
            addCriterion("tbm_can_order <>", value, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderGreaterThan(Byte value) {
            addCriterion("tbm_can_order >", value, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_can_order >=", value, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderLessThan(Byte value) {
            addCriterion("tbm_can_order <", value, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_can_order <=", value, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderIn(List<Byte> values) {
            addCriterion("tbm_can_order in", values, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderNotIn(List<Byte> values) {
            addCriterion("tbm_can_order not in", values, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderBetween(Byte value1, Byte value2) {
            addCriterion("tbm_can_order between", value1, value2, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmCanOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_can_order not between", value1, value2, "tbmCanOrder");
            return (Criteria) this;
        }

        public Criteria andTbmStateIsNull() {
            addCriterion("tbm_state is null");
            return (Criteria) this;
        }

        public Criteria andTbmStateIsNotNull() {
            addCriterion("tbm_state is not null");
            return (Criteria) this;
        }

        public Criteria andTbmStateEqualTo(Byte value) {
            addCriterion("tbm_state =", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateNotEqualTo(Byte value) {
            addCriterion("tbm_state <>", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateGreaterThan(Byte value) {
            addCriterion("tbm_state >", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_state >=", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateLessThan(Byte value) {
            addCriterion("tbm_state <", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_state <=", value, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateIn(List<Byte> values) {
            addCriterion("tbm_state in", values, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateNotIn(List<Byte> values) {
            addCriterion("tbm_state not in", values, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateBetween(Byte value1, Byte value2) {
            addCriterion("tbm_state between", value1, value2, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStateNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_state not between", value1, value2, "tbmState");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNull() {
            addCriterion("tbm_status is null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNotNull() {
            addCriterion("tbm_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusEqualTo(Byte value) {
            addCriterion("tbm_status =", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotEqualTo(Byte value) {
            addCriterion("tbm_status <>", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThan(Byte value) {
            addCriterion("tbm_status >", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_status >=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThan(Byte value) {
            addCriterion("tbm_status <", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_status <=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIn(List<Byte> values) {
            addCriterion("tbm_status in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotIn(List<Byte> values) {
            addCriterion("tbm_status not in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status not between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformIsNull() {
            addCriterion("tbm_mobile_platform is null");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformIsNotNull() {
            addCriterion("tbm_mobile_platform is not null");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformEqualTo(String value) {
            addCriterion("tbm_mobile_platform =", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformNotEqualTo(String value) {
            addCriterion("tbm_mobile_platform <>", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformGreaterThan(String value) {
            addCriterion("tbm_mobile_platform >", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_mobile_platform >=", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformLessThan(String value) {
            addCriterion("tbm_mobile_platform <", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformLessThanOrEqualTo(String value) {
            addCriterion("tbm_mobile_platform <=", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformLike(String value) {
            addCriterion("tbm_mobile_platform like", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformNotLike(String value) {
            addCriterion("tbm_mobile_platform not like", value, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformIn(List<String> values) {
            addCriterion("tbm_mobile_platform in", values, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformNotIn(List<String> values) {
            addCriterion("tbm_mobile_platform not in", values, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformBetween(String value1, String value2) {
            addCriterion("tbm_mobile_platform between", value1, value2, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmMobilePlatformNotBetween(String value1, String value2) {
            addCriterion("tbm_mobile_platform not between", value1, value2, "tbmMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionIsNull() {
            addCriterion("tbm_system_version is null");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionIsNotNull() {
            addCriterion("tbm_system_version is not null");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionEqualTo(String value) {
            addCriterion("tbm_system_version =", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionNotEqualTo(String value) {
            addCriterion("tbm_system_version <>", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionGreaterThan(String value) {
            addCriterion("tbm_system_version >", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_system_version >=", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionLessThan(String value) {
            addCriterion("tbm_system_version <", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("tbm_system_version <=", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionLike(String value) {
            addCriterion("tbm_system_version like", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionNotLike(String value) {
            addCriterion("tbm_system_version not like", value, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionIn(List<String> values) {
            addCriterion("tbm_system_version in", values, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionNotIn(List<String> values) {
            addCriterion("tbm_system_version not in", values, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionBetween(String value1, String value2) {
            addCriterion("tbm_system_version between", value1, value2, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmSystemVersionNotBetween(String value1, String value2) {
            addCriterion("tbm_system_version not between", value1, value2, "tbmSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionIsNull() {
            addCriterion("tbm_app_version is null");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionIsNotNull() {
            addCriterion("tbm_app_version is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionEqualTo(String value) {
            addCriterion("tbm_app_version =", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionNotEqualTo(String value) {
            addCriterion("tbm_app_version <>", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionGreaterThan(String value) {
            addCriterion("tbm_app_version >", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_app_version >=", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionLessThan(String value) {
            addCriterion("tbm_app_version <", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionLessThanOrEqualTo(String value) {
            addCriterion("tbm_app_version <=", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionLike(String value) {
            addCriterion("tbm_app_version like", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionNotLike(String value) {
            addCriterion("tbm_app_version not like", value, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionIn(List<String> values) {
            addCriterion("tbm_app_version in", values, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionNotIn(List<String> values) {
            addCriterion("tbm_app_version not in", values, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionBetween(String value1, String value2) {
            addCriterion("tbm_app_version between", value1, value2, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmAppVersionNotBetween(String value1, String value2) {
            addCriterion("tbm_app_version not between", value1, value2, "tbmAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsIsNull() {
            addCriterion("tbm_protocol_ids is null");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsIsNotNull() {
            addCriterion("tbm_protocol_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsEqualTo(String value) {
            addCriterion("tbm_protocol_ids =", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsNotEqualTo(String value) {
            addCriterion("tbm_protocol_ids <>", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsGreaterThan(String value) {
            addCriterion("tbm_protocol_ids >", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_protocol_ids >=", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsLessThan(String value) {
            addCriterion("tbm_protocol_ids <", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsLessThanOrEqualTo(String value) {
            addCriterion("tbm_protocol_ids <=", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsLike(String value) {
            addCriterion("tbm_protocol_ids like", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsNotLike(String value) {
            addCriterion("tbm_protocol_ids not like", value, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsIn(List<String> values) {
            addCriterion("tbm_protocol_ids in", values, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsNotIn(List<String> values) {
            addCriterion("tbm_protocol_ids not in", values, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsBetween(String value1, String value2) {
            addCriterion("tbm_protocol_ids between", value1, value2, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmProtocolIdsNotBetween(String value1, String value2) {
            addCriterion("tbm_protocol_ids not between", value1, value2, "tbmProtocolIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsIsNull() {
            addCriterion("tbm_sys_msg_ids is null");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsIsNotNull() {
            addCriterion("tbm_sys_msg_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsEqualTo(String value) {
            addCriterion("tbm_sys_msg_ids =", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsNotEqualTo(String value) {
            addCriterion("tbm_sys_msg_ids <>", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsGreaterThan(String value) {
            addCriterion("tbm_sys_msg_ids >", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_sys_msg_ids >=", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsLessThan(String value) {
            addCriterion("tbm_sys_msg_ids <", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsLessThanOrEqualTo(String value) {
            addCriterion("tbm_sys_msg_ids <=", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsLike(String value) {
            addCriterion("tbm_sys_msg_ids like", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsNotLike(String value) {
            addCriterion("tbm_sys_msg_ids not like", value, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsIn(List<String> values) {
            addCriterion("tbm_sys_msg_ids in", values, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsNotIn(List<String> values) {
            addCriterion("tbm_sys_msg_ids not in", values, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsBetween(String value1, String value2) {
            addCriterion("tbm_sys_msg_ids between", value1, value2, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmSysMsgIdsNotBetween(String value1, String value2) {
            addCriterion("tbm_sys_msg_ids not between", value1, value2, "tbmSysMsgIds");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountIsNull() {
            addCriterion("tbm_certify_count is null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountIsNotNull() {
            addCriterion("tbm_certify_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountEqualTo(Integer value) {
            addCriterion("tbm_certify_count =", value, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountNotEqualTo(Integer value) {
            addCriterion("tbm_certify_count <>", value, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountGreaterThan(Integer value) {
            addCriterion("tbm_certify_count >", value, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_certify_count >=", value, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountLessThan(Integer value) {
            addCriterion("tbm_certify_count <", value, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_certify_count <=", value, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountIn(List<Integer> values) {
            addCriterion("tbm_certify_count in", values, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountNotIn(List<Integer> values) {
            addCriterion("tbm_certify_count not in", values, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountBetween(Integer value1, Integer value2) {
            addCriterion("tbm_certify_count between", value1, value2, "tbmCertifyCount");
            return (Criteria) this;
        }

        public Criteria andTbmCertifyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_certify_count not between", value1, value2, "tbmCertifyCount");
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

        public Criteria andTbmInfoIsNull() {
            addCriterion("tbm_info is null");
            return (Criteria) this;
        }

        public Criteria andTbmInfoIsNotNull() {
            addCriterion("tbm_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbmInfoEqualTo(Long value) {
            addCriterion("tbm_info =", value, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoNotEqualTo(Long value) {
            addCriterion("tbm_info <>", value, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoGreaterThan(Long value) {
            addCriterion("tbm_info >", value, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_info >=", value, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoLessThan(Long value) {
            addCriterion("tbm_info <", value, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoLessThanOrEqualTo(Long value) {
            addCriterion("tbm_info <=", value, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoIn(List<Long> values) {
            addCriterion("tbm_info in", values, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoNotIn(List<Long> values) {
            addCriterion("tbm_info not in", values, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoBetween(Long value1, Long value2) {
            addCriterion("tbm_info between", value1, value2, "tbmInfo");
            return (Criteria) this;
        }

        public Criteria andTbmInfoNotBetween(Long value1, Long value2) {
            addCriterion("tbm_info not between", value1, value2, "tbmInfo");
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