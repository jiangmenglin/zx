package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andSuIdIsNull() {
            addCriterion("su_id is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("su_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(Integer value) {
            addCriterion("su_id =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(Integer value) {
            addCriterion("su_id <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(Integer value) {
            addCriterion("su_id >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_id >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(Integer value) {
            addCriterion("su_id <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(Integer value) {
            addCriterion("su_id <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<Integer> values) {
            addCriterion("su_id in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<Integer> values) {
            addCriterion("su_id not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(Integer value1, Integer value2) {
            addCriterion("su_id between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("su_id not between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuHostIsNull() {
            addCriterion("su_host is null");
            return (Criteria) this;
        }

        public Criteria andSuHostIsNotNull() {
            addCriterion("su_host is not null");
            return (Criteria) this;
        }

        public Criteria andSuHostEqualTo(String value) {
            addCriterion("su_host =", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotEqualTo(String value) {
            addCriterion("su_host <>", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostGreaterThan(String value) {
            addCriterion("su_host >", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostGreaterThanOrEqualTo(String value) {
            addCriterion("su_host >=", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostLessThan(String value) {
            addCriterion("su_host <", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostLessThanOrEqualTo(String value) {
            addCriterion("su_host <=", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostLike(String value) {
            addCriterion("su_host like", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotLike(String value) {
            addCriterion("su_host not like", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostIn(List<String> values) {
            addCriterion("su_host in", values, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotIn(List<String> values) {
            addCriterion("su_host not in", values, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostBetween(String value1, String value2) {
            addCriterion("su_host between", value1, value2, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotBetween(String value1, String value2) {
            addCriterion("su_host not between", value1, value2, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuGroupIsNull() {
            addCriterion("su_group is null");
            return (Criteria) this;
        }

        public Criteria andSuGroupIsNotNull() {
            addCriterion("su_group is not null");
            return (Criteria) this;
        }

        public Criteria andSuGroupEqualTo(Integer value) {
            addCriterion("su_group =", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupNotEqualTo(Integer value) {
            addCriterion("su_group <>", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupGreaterThan(Integer value) {
            addCriterion("su_group >", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_group >=", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupLessThan(Integer value) {
            addCriterion("su_group <", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupLessThanOrEqualTo(Integer value) {
            addCriterion("su_group <=", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupIn(List<Integer> values) {
            addCriterion("su_group in", values, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupNotIn(List<Integer> values) {
            addCriterion("su_group not in", values, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupBetween(Integer value1, Integer value2) {
            addCriterion("su_group between", value1, value2, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("su_group not between", value1, value2, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIsNull() {
            addCriterion("su_username is null");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIsNotNull() {
            addCriterion("su_username is not null");
            return (Criteria) this;
        }

        public Criteria andSuUsernameEqualTo(String value) {
            addCriterion("su_username =", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotEqualTo(String value) {
            addCriterion("su_username <>", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameGreaterThan(String value) {
            addCriterion("su_username >", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("su_username >=", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLessThan(String value) {
            addCriterion("su_username <", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLessThanOrEqualTo(String value) {
            addCriterion("su_username <=", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLike(String value) {
            addCriterion("su_username like", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotLike(String value) {
            addCriterion("su_username not like", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIn(List<String> values) {
            addCriterion("su_username in", values, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotIn(List<String> values) {
            addCriterion("su_username not in", values, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameBetween(String value1, String value2) {
            addCriterion("su_username between", value1, value2, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotBetween(String value1, String value2) {
            addCriterion("su_username not between", value1, value2, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNull() {
            addCriterion("su_password is null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNotNull() {
            addCriterion("su_password is not null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordEqualTo(String value) {
            addCriterion("su_password =", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotEqualTo(String value) {
            addCriterion("su_password <>", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThan(String value) {
            addCriterion("su_password >", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("su_password >=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThan(String value) {
            addCriterion("su_password <", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThanOrEqualTo(String value) {
            addCriterion("su_password <=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLike(String value) {
            addCriterion("su_password like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotLike(String value) {
            addCriterion("su_password not like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIn(List<String> values) {
            addCriterion("su_password in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotIn(List<String> values) {
            addCriterion("su_password not in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordBetween(String value1, String value2) {
            addCriterion("su_password between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotBetween(String value1, String value2) {
            addCriterion("su_password not between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuRealNameIsNull() {
            addCriterion("su_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSuRealNameIsNotNull() {
            addCriterion("su_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuRealNameEqualTo(String value) {
            addCriterion("su_real_name =", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotEqualTo(String value) {
            addCriterion("su_real_name <>", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameGreaterThan(String value) {
            addCriterion("su_real_name >", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("su_real_name >=", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameLessThan(String value) {
            addCriterion("su_real_name <", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameLessThanOrEqualTo(String value) {
            addCriterion("su_real_name <=", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameLike(String value) {
            addCriterion("su_real_name like", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotLike(String value) {
            addCriterion("su_real_name not like", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameIn(List<String> values) {
            addCriterion("su_real_name in", values, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotIn(List<String> values) {
            addCriterion("su_real_name not in", values, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameBetween(String value1, String value2) {
            addCriterion("su_real_name between", value1, value2, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotBetween(String value1, String value2) {
            addCriterion("su_real_name not between", value1, value2, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNull() {
            addCriterion("su_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNotNull() {
            addCriterion("su_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSuMobileEqualTo(String value) {
            addCriterion("su_mobile =", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotEqualTo(String value) {
            addCriterion("su_mobile <>", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThan(String value) {
            addCriterion("su_mobile >", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("su_mobile >=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThan(String value) {
            addCriterion("su_mobile <", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThanOrEqualTo(String value) {
            addCriterion("su_mobile <=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLike(String value) {
            addCriterion("su_mobile like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotLike(String value) {
            addCriterion("su_mobile not like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileIn(List<String> values) {
            addCriterion("su_mobile in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotIn(List<String> values) {
            addCriterion("su_mobile not in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileBetween(String value1, String value2) {
            addCriterion("su_mobile between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotBetween(String value1, String value2) {
            addCriterion("su_mobile not between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuEmailIsNull() {
            addCriterion("su_email is null");
            return (Criteria) this;
        }

        public Criteria andSuEmailIsNotNull() {
            addCriterion("su_email is not null");
            return (Criteria) this;
        }

        public Criteria andSuEmailEqualTo(String value) {
            addCriterion("su_email =", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotEqualTo(String value) {
            addCriterion("su_email <>", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailGreaterThan(String value) {
            addCriterion("su_email >", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("su_email >=", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailLessThan(String value) {
            addCriterion("su_email <", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailLessThanOrEqualTo(String value) {
            addCriterion("su_email <=", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailLike(String value) {
            addCriterion("su_email like", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotLike(String value) {
            addCriterion("su_email not like", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailIn(List<String> values) {
            addCriterion("su_email in", values, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotIn(List<String> values) {
            addCriterion("su_email not in", values, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailBetween(String value1, String value2) {
            addCriterion("su_email between", value1, value2, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotBetween(String value1, String value2) {
            addCriterion("su_email not between", value1, value2, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuShortcutIsNull() {
            addCriterion("su_shortcut is null");
            return (Criteria) this;
        }

        public Criteria andSuShortcutIsNotNull() {
            addCriterion("su_shortcut is not null");
            return (Criteria) this;
        }

        public Criteria andSuShortcutEqualTo(String value) {
            addCriterion("su_shortcut =", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutNotEqualTo(String value) {
            addCriterion("su_shortcut <>", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutGreaterThan(String value) {
            addCriterion("su_shortcut >", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("su_shortcut >=", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutLessThan(String value) {
            addCriterion("su_shortcut <", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutLessThanOrEqualTo(String value) {
            addCriterion("su_shortcut <=", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutLike(String value) {
            addCriterion("su_shortcut like", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutNotLike(String value) {
            addCriterion("su_shortcut not like", value, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutIn(List<String> values) {
            addCriterion("su_shortcut in", values, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutNotIn(List<String> values) {
            addCriterion("su_shortcut not in", values, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutBetween(String value1, String value2) {
            addCriterion("su_shortcut between", value1, value2, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuShortcutNotBetween(String value1, String value2) {
            addCriterion("su_shortcut not between", value1, value2, "suShortcut");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeIsNull() {
            addCriterion("su_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeIsNotNull() {
            addCriterion("su_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeEqualTo(Date value) {
            addCriterion("su_add_time =", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeNotEqualTo(Date value) {
            addCriterion("su_add_time <>", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeGreaterThan(Date value) {
            addCriterion("su_add_time >", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("su_add_time >=", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeLessThan(Date value) {
            addCriterion("su_add_time <", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("su_add_time <=", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeIn(List<Date> values) {
            addCriterion("su_add_time in", values, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeNotIn(List<Date> values) {
            addCriterion("su_add_time not in", values, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeBetween(Date value1, Date value2) {
            addCriterion("su_add_time between", value1, value2, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("su_add_time not between", value1, value2, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeIsNull() {
            addCriterion("su_last_time is null");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeIsNotNull() {
            addCriterion("su_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeEqualTo(Date value) {
            addCriterion("su_last_time =", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeNotEqualTo(Date value) {
            addCriterion("su_last_time <>", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeGreaterThan(Date value) {
            addCriterion("su_last_time >", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("su_last_time >=", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeLessThan(Date value) {
            addCriterion("su_last_time <", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("su_last_time <=", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeIn(List<Date> values) {
            addCriterion("su_last_time in", values, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeNotIn(List<Date> values) {
            addCriterion("su_last_time not in", values, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeBetween(Date value1, Date value2) {
            addCriterion("su_last_time between", value1, value2, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("su_last_time not between", value1, value2, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastIpIsNull() {
            addCriterion("su_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andSuLastIpIsNotNull() {
            addCriterion("su_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSuLastIpEqualTo(String value) {
            addCriterion("su_last_ip =", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotEqualTo(String value) {
            addCriterion("su_last_ip <>", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpGreaterThan(String value) {
            addCriterion("su_last_ip >", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("su_last_ip >=", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpLessThan(String value) {
            addCriterion("su_last_ip <", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpLessThanOrEqualTo(String value) {
            addCriterion("su_last_ip <=", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpLike(String value) {
            addCriterion("su_last_ip like", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotLike(String value) {
            addCriterion("su_last_ip not like", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpIn(List<String> values) {
            addCriterion("su_last_ip in", values, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotIn(List<String> values) {
            addCriterion("su_last_ip not in", values, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpBetween(String value1, String value2) {
            addCriterion("su_last_ip between", value1, value2, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotBetween(String value1, String value2) {
            addCriterion("su_last_ip not between", value1, value2, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNull() {
            addCriterion("su_status is null");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNotNull() {
            addCriterion("su_status is not null");
            return (Criteria) this;
        }

        public Criteria andSuStatusEqualTo(Byte value) {
            addCriterion("su_status =", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotEqualTo(Byte value) {
            addCriterion("su_status <>", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThan(Byte value) {
            addCriterion("su_status >", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("su_status >=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThan(Byte value) {
            addCriterion("su_status <", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThanOrEqualTo(Byte value) {
            addCriterion("su_status <=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusIn(List<Byte> values) {
            addCriterion("su_status in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotIn(List<Byte> values) {
            addCriterion("su_status not in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusBetween(Byte value1, Byte value2) {
            addCriterion("su_status between", value1, value2, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("su_status not between", value1, value2, "suStatus");
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