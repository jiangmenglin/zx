package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Long value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Long value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Long value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Long value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Long value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Long> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Long> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Long value1, Long value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Long value1, Long value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNull() {
            addCriterion("sp_name is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("sp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("sp_name =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("sp_name <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("sp_name >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_name >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("sp_name <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("sp_name <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("sp_name like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("sp_name not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("sp_name in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("sp_name not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("sp_name between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("sp_name not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpParentIdIsNull() {
            addCriterion("sp_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andSpParentIdIsNotNull() {
            addCriterion("sp_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpParentIdEqualTo(Long value) {
            addCriterion("sp_parent_id =", value, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdNotEqualTo(Long value) {
            addCriterion("sp_parent_id <>", value, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdGreaterThan(Long value) {
            addCriterion("sp_parent_id >", value, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_parent_id >=", value, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdLessThan(Long value) {
            addCriterion("sp_parent_id <", value, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdLessThanOrEqualTo(Long value) {
            addCriterion("sp_parent_id <=", value, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdIn(List<Long> values) {
            addCriterion("sp_parent_id in", values, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdNotIn(List<Long> values) {
            addCriterion("sp_parent_id not in", values, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdBetween(Long value1, Long value2) {
            addCriterion("sp_parent_id between", value1, value2, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpParentIdNotBetween(Long value1, Long value2) {
            addCriterion("sp_parent_id not between", value1, value2, "spParentId");
            return (Criteria) this;
        }

        public Criteria andSpFamilyIsNull() {
            addCriterion("sp_family is null");
            return (Criteria) this;
        }

        public Criteria andSpFamilyIsNotNull() {
            addCriterion("sp_family is not null");
            return (Criteria) this;
        }

        public Criteria andSpFamilyEqualTo(String value) {
            addCriterion("sp_family =", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyNotEqualTo(String value) {
            addCriterion("sp_family <>", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyGreaterThan(String value) {
            addCriterion("sp_family >", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("sp_family >=", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyLessThan(String value) {
            addCriterion("sp_family <", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyLessThanOrEqualTo(String value) {
            addCriterion("sp_family <=", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyLike(String value) {
            addCriterion("sp_family like", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyNotLike(String value) {
            addCriterion("sp_family not like", value, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyIn(List<String> values) {
            addCriterion("sp_family in", values, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyNotIn(List<String> values) {
            addCriterion("sp_family not in", values, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyBetween(String value1, String value2) {
            addCriterion("sp_family between", value1, value2, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpFamilyNotBetween(String value1, String value2) {
            addCriterion("sp_family not between", value1, value2, "spFamily");
            return (Criteria) this;
        }

        public Criteria andSpUrlIsNull() {
            addCriterion("sp_url is null");
            return (Criteria) this;
        }

        public Criteria andSpUrlIsNotNull() {
            addCriterion("sp_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpUrlEqualTo(String value) {
            addCriterion("sp_url =", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotEqualTo(String value) {
            addCriterion("sp_url <>", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlGreaterThan(String value) {
            addCriterion("sp_url >", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sp_url >=", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlLessThan(String value) {
            addCriterion("sp_url <", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlLessThanOrEqualTo(String value) {
            addCriterion("sp_url <=", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlLike(String value) {
            addCriterion("sp_url like", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotLike(String value) {
            addCriterion("sp_url not like", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlIn(List<String> values) {
            addCriterion("sp_url in", values, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotIn(List<String> values) {
            addCriterion("sp_url not in", values, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlBetween(String value1, String value2) {
            addCriterion("sp_url between", value1, value2, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotBetween(String value1, String value2) {
            addCriterion("sp_url not between", value1, value2, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpLogoIsNull() {
            addCriterion("sp_logo is null");
            return (Criteria) this;
        }

        public Criteria andSpLogoIsNotNull() {
            addCriterion("sp_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSpLogoEqualTo(String value) {
            addCriterion("sp_logo =", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoNotEqualTo(String value) {
            addCriterion("sp_logo <>", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoGreaterThan(String value) {
            addCriterion("sp_logo >", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_logo >=", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoLessThan(String value) {
            addCriterion("sp_logo <", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoLessThanOrEqualTo(String value) {
            addCriterion("sp_logo <=", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoLike(String value) {
            addCriterion("sp_logo like", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoNotLike(String value) {
            addCriterion("sp_logo not like", value, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoIn(List<String> values) {
            addCriterion("sp_logo in", values, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoNotIn(List<String> values) {
            addCriterion("sp_logo not in", values, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoBetween(String value1, String value2) {
            addCriterion("sp_logo between", value1, value2, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpLogoNotBetween(String value1, String value2) {
            addCriterion("sp_logo not between", value1, value2, "spLogo");
            return (Criteria) this;
        }

        public Criteria andSpDescriptIsNull() {
            addCriterion("sp_descript is null");
            return (Criteria) this;
        }

        public Criteria andSpDescriptIsNotNull() {
            addCriterion("sp_descript is not null");
            return (Criteria) this;
        }

        public Criteria andSpDescriptEqualTo(String value) {
            addCriterion("sp_descript =", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptNotEqualTo(String value) {
            addCriterion("sp_descript <>", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptGreaterThan(String value) {
            addCriterion("sp_descript >", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("sp_descript >=", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptLessThan(String value) {
            addCriterion("sp_descript <", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptLessThanOrEqualTo(String value) {
            addCriterion("sp_descript <=", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptLike(String value) {
            addCriterion("sp_descript like", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptNotLike(String value) {
            addCriterion("sp_descript not like", value, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptIn(List<String> values) {
            addCriterion("sp_descript in", values, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptNotIn(List<String> values) {
            addCriterion("sp_descript not in", values, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptBetween(String value1, String value2) {
            addCriterion("sp_descript between", value1, value2, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpDescriptNotBetween(String value1, String value2) {
            addCriterion("sp_descript not between", value1, value2, "spDescript");
            return (Criteria) this;
        }

        public Criteria andSpLevelIsNull() {
            addCriterion("sp_level is null");
            return (Criteria) this;
        }

        public Criteria andSpLevelIsNotNull() {
            addCriterion("sp_level is not null");
            return (Criteria) this;
        }

        public Criteria andSpLevelEqualTo(Integer value) {
            addCriterion("sp_level =", value, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelNotEqualTo(Integer value) {
            addCriterion("sp_level <>", value, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelGreaterThan(Integer value) {
            addCriterion("sp_level >", value, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_level >=", value, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelLessThan(Integer value) {
            addCriterion("sp_level <", value, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelLessThanOrEqualTo(Integer value) {
            addCriterion("sp_level <=", value, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelIn(List<Integer> values) {
            addCriterion("sp_level in", values, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelNotIn(List<Integer> values) {
            addCriterion("sp_level not in", values, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelBetween(Integer value1, Integer value2) {
            addCriterion("sp_level between", value1, value2, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_level not between", value1, value2, "spLevel");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpIsNull() {
            addCriterion("sp_limit_exp is null");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpIsNotNull() {
            addCriterion("sp_limit_exp is not null");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpEqualTo(String value) {
            addCriterion("sp_limit_exp =", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpNotEqualTo(String value) {
            addCriterion("sp_limit_exp <>", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpGreaterThan(String value) {
            addCriterion("sp_limit_exp >", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpGreaterThanOrEqualTo(String value) {
            addCriterion("sp_limit_exp >=", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpLessThan(String value) {
            addCriterion("sp_limit_exp <", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpLessThanOrEqualTo(String value) {
            addCriterion("sp_limit_exp <=", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpLike(String value) {
            addCriterion("sp_limit_exp like", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpNotLike(String value) {
            addCriterion("sp_limit_exp not like", value, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpIn(List<String> values) {
            addCriterion("sp_limit_exp in", values, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpNotIn(List<String> values) {
            addCriterion("sp_limit_exp not in", values, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpBetween(String value1, String value2) {
            addCriterion("sp_limit_exp between", value1, value2, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpLimitExpNotBetween(String value1, String value2) {
            addCriterion("sp_limit_exp not between", value1, value2, "spLimitExp");
            return (Criteria) this;
        }

        public Criteria andSpGroupIsNull() {
            addCriterion("sp_group is null");
            return (Criteria) this;
        }

        public Criteria andSpGroupIsNotNull() {
            addCriterion("sp_group is not null");
            return (Criteria) this;
        }

        public Criteria andSpGroupEqualTo(String value) {
            addCriterion("sp_group =", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupNotEqualTo(String value) {
            addCriterion("sp_group <>", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupGreaterThan(String value) {
            addCriterion("sp_group >", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupGreaterThanOrEqualTo(String value) {
            addCriterion("sp_group >=", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupLessThan(String value) {
            addCriterion("sp_group <", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupLessThanOrEqualTo(String value) {
            addCriterion("sp_group <=", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupLike(String value) {
            addCriterion("sp_group like", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupNotLike(String value) {
            addCriterion("sp_group not like", value, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupIn(List<String> values) {
            addCriterion("sp_group in", values, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupNotIn(List<String> values) {
            addCriterion("sp_group not in", values, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupBetween(String value1, String value2) {
            addCriterion("sp_group between", value1, value2, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpGroupNotBetween(String value1, String value2) {
            addCriterion("sp_group not between", value1, value2, "spGroup");
            return (Criteria) this;
        }

        public Criteria andSpStatusIsNull() {
            addCriterion("sp_status is null");
            return (Criteria) this;
        }

        public Criteria andSpStatusIsNotNull() {
            addCriterion("sp_status is not null");
            return (Criteria) this;
        }

        public Criteria andSpStatusEqualTo(Short value) {
            addCriterion("sp_status =", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotEqualTo(Short value) {
            addCriterion("sp_status <>", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusGreaterThan(Short value) {
            addCriterion("sp_status >", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sp_status >=", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusLessThan(Short value) {
            addCriterion("sp_status <", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusLessThanOrEqualTo(Short value) {
            addCriterion("sp_status <=", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusIn(List<Short> values) {
            addCriterion("sp_status in", values, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotIn(List<Short> values) {
            addCriterion("sp_status not in", values, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusBetween(Short value1, Short value2) {
            addCriterion("sp_status between", value1, value2, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotBetween(Short value1, Short value2) {
            addCriterion("sp_status not between", value1, value2, "spStatus");
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