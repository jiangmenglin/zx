package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitOrderExample() {
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

        public Criteria andTbuoIdIsNull() {
            addCriterion("tbuo_id is null");
            return (Criteria) this;
        }

        public Criteria andTbuoIdIsNotNull() {
            addCriterion("tbuo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoIdEqualTo(Long value) {
            addCriterion("tbuo_id =", value, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdNotEqualTo(Long value) {
            addCriterion("tbuo_id <>", value, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdGreaterThan(Long value) {
            addCriterion("tbuo_id >", value, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_id >=", value, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdLessThan(Long value) {
            addCriterion("tbuo_id <", value, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_id <=", value, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdIn(List<Long> values) {
            addCriterion("tbuo_id in", values, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdNotIn(List<Long> values) {
            addCriterion("tbuo_id not in", values, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdBetween(Long value1, Long value2) {
            addCriterion("tbuo_id between", value1, value2, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoIdNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_id not between", value1, value2, "tbuoId");
            return (Criteria) this;
        }

        public Criteria andTbuoHostIsNull() {
            addCriterion("tbuo_host is null");
            return (Criteria) this;
        }

        public Criteria andTbuoHostIsNotNull() {
            addCriterion("tbuo_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoHostEqualTo(Long value) {
            addCriterion("tbuo_host =", value, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostNotEqualTo(Long value) {
            addCriterion("tbuo_host <>", value, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostGreaterThan(Long value) {
            addCriterion("tbuo_host >", value, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_host >=", value, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostLessThan(Long value) {
            addCriterion("tbuo_host <", value, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_host <=", value, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostIn(List<Long> values) {
            addCriterion("tbuo_host in", values, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostNotIn(List<Long> values) {
            addCriterion("tbuo_host not in", values, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostBetween(Long value1, Long value2) {
            addCriterion("tbuo_host between", value1, value2, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoHostNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_host not between", value1, value2, "tbuoHost");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderIsNull() {
            addCriterion("tbuo_order is null");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderIsNotNull() {
            addCriterion("tbuo_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderEqualTo(Long value) {
            addCriterion("tbuo_order =", value, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderNotEqualTo(Long value) {
            addCriterion("tbuo_order <>", value, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderGreaterThan(Long value) {
            addCriterion("tbuo_order >", value, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_order >=", value, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderLessThan(Long value) {
            addCriterion("tbuo_order <", value, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_order <=", value, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderIn(List<Long> values) {
            addCriterion("tbuo_order in", values, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderNotIn(List<Long> values) {
            addCriterion("tbuo_order not in", values, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderBetween(Long value1, Long value2) {
            addCriterion("tbuo_order between", value1, value2, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoOrderNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_order not between", value1, value2, "tbuoOrder");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoIsNull() {
            addCriterion("tbuo_unit_info is null");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoIsNotNull() {
            addCriterion("tbuo_unit_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoEqualTo(Long value) {
            addCriterion("tbuo_unit_info =", value, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoNotEqualTo(Long value) {
            addCriterion("tbuo_unit_info <>", value, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoGreaterThan(Long value) {
            addCriterion("tbuo_unit_info >", value, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_unit_info >=", value, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoLessThan(Long value) {
            addCriterion("tbuo_unit_info <", value, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_unit_info <=", value, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoIn(List<Long> values) {
            addCriterion("tbuo_unit_info in", values, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoNotIn(List<Long> values) {
            addCriterion("tbuo_unit_info not in", values, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoBetween(Long value1, Long value2) {
            addCriterion("tbuo_unit_info between", value1, value2, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitInfoNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_unit_info not between", value1, value2, "tbuoUnitInfo");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupIsNull() {
            addCriterion("tbuo_unit_group is null");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupIsNotNull() {
            addCriterion("tbuo_unit_group is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupEqualTo(Long value) {
            addCriterion("tbuo_unit_group =", value, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupNotEqualTo(Long value) {
            addCriterion("tbuo_unit_group <>", value, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupGreaterThan(Long value) {
            addCriterion("tbuo_unit_group >", value, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_unit_group >=", value, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupLessThan(Long value) {
            addCriterion("tbuo_unit_group <", value, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_unit_group <=", value, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupIn(List<Long> values) {
            addCriterion("tbuo_unit_group in", values, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupNotIn(List<Long> values) {
            addCriterion("tbuo_unit_group not in", values, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupBetween(Long value1, Long value2) {
            addCriterion("tbuo_unit_group between", value1, value2, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoUnitGroupNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_unit_group not between", value1, value2, "tbuoUnitGroup");
            return (Criteria) this;
        }

        public Criteria andTbuoCarIsNull() {
            addCriterion("tbuo_car is null");
            return (Criteria) this;
        }

        public Criteria andTbuoCarIsNotNull() {
            addCriterion("tbuo_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoCarEqualTo(Long value) {
            addCriterion("tbuo_car =", value, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarNotEqualTo(Long value) {
            addCriterion("tbuo_car <>", value, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarGreaterThan(Long value) {
            addCriterion("tbuo_car >", value, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_car >=", value, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarLessThan(Long value) {
            addCriterion("tbuo_car <", value, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_car <=", value, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarIn(List<Long> values) {
            addCriterion("tbuo_car in", values, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarNotIn(List<Long> values) {
            addCriterion("tbuo_car not in", values, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarBetween(Long value1, Long value2) {
            addCriterion("tbuo_car between", value1, value2, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoCarNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_car not between", value1, value2, "tbuoCar");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonIsNull() {
            addCriterion("tbuo_person is null");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonIsNotNull() {
            addCriterion("tbuo_person is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonEqualTo(Long value) {
            addCriterion("tbuo_person =", value, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonNotEqualTo(Long value) {
            addCriterion("tbuo_person <>", value, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonGreaterThan(Long value) {
            addCriterion("tbuo_person >", value, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_person >=", value, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonLessThan(Long value) {
            addCriterion("tbuo_person <", value, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_person <=", value, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonIn(List<Long> values) {
            addCriterion("tbuo_person in", values, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonNotIn(List<Long> values) {
            addCriterion("tbuo_person not in", values, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonBetween(Long value1, Long value2) {
            addCriterion("tbuo_person between", value1, value2, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoPersonNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_person not between", value1, value2, "tbuoPerson");
            return (Criteria) this;
        }

        public Criteria andTbuoNameIsNull() {
            addCriterion("tbuo_name is null");
            return (Criteria) this;
        }

        public Criteria andTbuoNameIsNotNull() {
            addCriterion("tbuo_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoNameEqualTo(String value) {
            addCriterion("tbuo_name =", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameNotEqualTo(String value) {
            addCriterion("tbuo_name <>", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameGreaterThan(String value) {
            addCriterion("tbuo_name >", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_name >=", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameLessThan(String value) {
            addCriterion("tbuo_name <", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameLessThanOrEqualTo(String value) {
            addCriterion("tbuo_name <=", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameLike(String value) {
            addCriterion("tbuo_name like", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameNotLike(String value) {
            addCriterion("tbuo_name not like", value, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameIn(List<String> values) {
            addCriterion("tbuo_name in", values, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameNotIn(List<String> values) {
            addCriterion("tbuo_name not in", values, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameBetween(String value1, String value2) {
            addCriterion("tbuo_name between", value1, value2, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoNameNotBetween(String value1, String value2) {
            addCriterion("tbuo_name not between", value1, value2, "tbuoName");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasIsNull() {
            addCriterion("tbuo_alias is null");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasIsNotNull() {
            addCriterion("tbuo_alias is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasEqualTo(String value) {
            addCriterion("tbuo_alias =", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasNotEqualTo(String value) {
            addCriterion("tbuo_alias <>", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasGreaterThan(String value) {
            addCriterion("tbuo_alias >", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_alias >=", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasLessThan(String value) {
            addCriterion("tbuo_alias <", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasLessThanOrEqualTo(String value) {
            addCriterion("tbuo_alias <=", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasLike(String value) {
            addCriterion("tbuo_alias like", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasNotLike(String value) {
            addCriterion("tbuo_alias not like", value, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasIn(List<String> values) {
            addCriterion("tbuo_alias in", values, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasNotIn(List<String> values) {
            addCriterion("tbuo_alias not in", values, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasBetween(String value1, String value2) {
            addCriterion("tbuo_alias between", value1, value2, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoAliasNotBetween(String value1, String value2) {
            addCriterion("tbuo_alias not between", value1, value2, "tbuoAlias");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileIsNull() {
            addCriterion("tbuo_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileIsNotNull() {
            addCriterion("tbuo_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileEqualTo(String value) {
            addCriterion("tbuo_mobile =", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileNotEqualTo(String value) {
            addCriterion("tbuo_mobile <>", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileGreaterThan(String value) {
            addCriterion("tbuo_mobile >", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_mobile >=", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileLessThan(String value) {
            addCriterion("tbuo_mobile <", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileLessThanOrEqualTo(String value) {
            addCriterion("tbuo_mobile <=", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileLike(String value) {
            addCriterion("tbuo_mobile like", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileNotLike(String value) {
            addCriterion("tbuo_mobile not like", value, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileIn(List<String> values) {
            addCriterion("tbuo_mobile in", values, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileNotIn(List<String> values) {
            addCriterion("tbuo_mobile not in", values, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileBetween(String value1, String value2) {
            addCriterion("tbuo_mobile between", value1, value2, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoMobileNotBetween(String value1, String value2) {
            addCriterion("tbuo_mobile not between", value1, value2, "tbuoMobile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileIsNull() {
            addCriterion("tbuo_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileIsNotNull() {
            addCriterion("tbuo_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileEqualTo(String value) {
            addCriterion("tbuo_profile =", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileNotEqualTo(String value) {
            addCriterion("tbuo_profile <>", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileGreaterThan(String value) {
            addCriterion("tbuo_profile >", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_profile >=", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileLessThan(String value) {
            addCriterion("tbuo_profile <", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileLessThanOrEqualTo(String value) {
            addCriterion("tbuo_profile <=", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileLike(String value) {
            addCriterion("tbuo_profile like", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileNotLike(String value) {
            addCriterion("tbuo_profile not like", value, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileIn(List<String> values) {
            addCriterion("tbuo_profile in", values, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileNotIn(List<String> values) {
            addCriterion("tbuo_profile not in", values, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileBetween(String value1, String value2) {
            addCriterion("tbuo_profile between", value1, value2, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoProfileNotBetween(String value1, String value2) {
            addCriterion("tbuo_profile not between", value1, value2, "tbuoProfile");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardIsNull() {
            addCriterion("tbuo_idcard is null");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardIsNotNull() {
            addCriterion("tbuo_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardEqualTo(String value) {
            addCriterion("tbuo_idcard =", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardNotEqualTo(String value) {
            addCriterion("tbuo_idcard <>", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardGreaterThan(String value) {
            addCriterion("tbuo_idcard >", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_idcard >=", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardLessThan(String value) {
            addCriterion("tbuo_idcard <", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardLessThanOrEqualTo(String value) {
            addCriterion("tbuo_idcard <=", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardLike(String value) {
            addCriterion("tbuo_idcard like", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardNotLike(String value) {
            addCriterion("tbuo_idcard not like", value, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardIn(List<String> values) {
            addCriterion("tbuo_idcard in", values, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardNotIn(List<String> values) {
            addCriterion("tbuo_idcard not in", values, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardBetween(String value1, String value2) {
            addCriterion("tbuo_idcard between", value1, value2, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoIdcardNotBetween(String value1, String value2) {
            addCriterion("tbuo_idcard not between", value1, value2, "tbuoIdcard");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeIsNull() {
            addCriterion("tbuo_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeIsNotNull() {
            addCriterion("tbuo_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeEqualTo(Date value) {
            addCriterion("tbuo_start_time =", value, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeNotEqualTo(Date value) {
            addCriterion("tbuo_start_time <>", value, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeGreaterThan(Date value) {
            addCriterion("tbuo_start_time >", value, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuo_start_time >=", value, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeLessThan(Date value) {
            addCriterion("tbuo_start_time <", value, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuo_start_time <=", value, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeIn(List<Date> values) {
            addCriterion("tbuo_start_time in", values, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeNotIn(List<Date> values) {
            addCriterion("tbuo_start_time not in", values, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeBetween(Date value1, Date value2) {
            addCriterion("tbuo_start_time between", value1, value2, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuo_start_time not between", value1, value2, "tbuoStartTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeIsNull() {
            addCriterion("tbuo_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeIsNotNull() {
            addCriterion("tbuo_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeEqualTo(Date value) {
            addCriterion("tbuo_finish_time =", value, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeNotEqualTo(Date value) {
            addCriterion("tbuo_finish_time <>", value, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeGreaterThan(Date value) {
            addCriterion("tbuo_finish_time >", value, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuo_finish_time >=", value, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeLessThan(Date value) {
            addCriterion("tbuo_finish_time <", value, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuo_finish_time <=", value, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeIn(List<Date> values) {
            addCriterion("tbuo_finish_time in", values, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeNotIn(List<Date> values) {
            addCriterion("tbuo_finish_time not in", values, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeBetween(Date value1, Date value2) {
            addCriterion("tbuo_finish_time between", value1, value2, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuo_finish_time not between", value1, value2, "tbuoFinishTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeIsNull() {
            addCriterion("tbuo_ret_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeIsNotNull() {
            addCriterion("tbuo_ret_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeEqualTo(Date value) {
            addCriterion("tbuo_ret_time =", value, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeNotEqualTo(Date value) {
            addCriterion("tbuo_ret_time <>", value, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeGreaterThan(Date value) {
            addCriterion("tbuo_ret_time >", value, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuo_ret_time >=", value, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeLessThan(Date value) {
            addCriterion("tbuo_ret_time <", value, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuo_ret_time <=", value, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeIn(List<Date> values) {
            addCriterion("tbuo_ret_time in", values, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeNotIn(List<Date> values) {
            addCriterion("tbuo_ret_time not in", values, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeBetween(Date value1, Date value2) {
            addCriterion("tbuo_ret_time between", value1, value2, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuo_ret_time not between", value1, value2, "tbuoRetTime");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkIsNull() {
            addCriterion("tbuo_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkIsNotNull() {
            addCriterion("tbuo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkEqualTo(String value) {
            addCriterion("tbuo_remark =", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkNotEqualTo(String value) {
            addCriterion("tbuo_remark <>", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkGreaterThan(String value) {
            addCriterion("tbuo_remark >", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_remark >=", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkLessThan(String value) {
            addCriterion("tbuo_remark <", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbuo_remark <=", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkLike(String value) {
            addCriterion("tbuo_remark like", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkNotLike(String value) {
            addCriterion("tbuo_remark not like", value, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkIn(List<String> values) {
            addCriterion("tbuo_remark in", values, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkNotIn(List<String> values) {
            addCriterion("tbuo_remark not in", values, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkBetween(String value1, String value2) {
            addCriterion("tbuo_remark between", value1, value2, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoRemarkNotBetween(String value1, String value2) {
            addCriterion("tbuo_remark not between", value1, value2, "tbuoRemark");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeIsNull() {
            addCriterion("tbuo_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeIsNotNull() {
            addCriterion("tbuo_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeEqualTo(Date value) {
            addCriterion("tbuo_add_time =", value, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeNotEqualTo(Date value) {
            addCriterion("tbuo_add_time <>", value, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeGreaterThan(Date value) {
            addCriterion("tbuo_add_time >", value, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuo_add_time >=", value, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeLessThan(Date value) {
            addCriterion("tbuo_add_time <", value, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuo_add_time <=", value, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeIn(List<Date> values) {
            addCriterion("tbuo_add_time in", values, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeNotIn(List<Date> values) {
            addCriterion("tbuo_add_time not in", values, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbuo_add_time between", value1, value2, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuo_add_time not between", value1, value2, "tbuoAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeIsNull() {
            addCriterion("tbuo_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeIsNotNull() {
            addCriterion("tbuo_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeEqualTo(Date value) {
            addCriterion("tbuo_update_time =", value, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbuo_update_time <>", value, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeGreaterThan(Date value) {
            addCriterion("tbuo_update_time >", value, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuo_update_time >=", value, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeLessThan(Date value) {
            addCriterion("tbuo_update_time <", value, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuo_update_time <=", value, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeIn(List<Date> values) {
            addCriterion("tbuo_update_time in", values, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbuo_update_time not in", values, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbuo_update_time between", value1, value2, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuo_update_time not between", value1, value2, "tbuoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageIsNull() {
            addCriterion("tbuo_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageIsNotNull() {
            addCriterion("tbuo_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageEqualTo(Double value) {
            addCriterion("tbuo_mileage =", value, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageNotEqualTo(Double value) {
            addCriterion("tbuo_mileage <>", value, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageGreaterThan(Double value) {
            addCriterion("tbuo_mileage >", value, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageGreaterThanOrEqualTo(Double value) {
            addCriterion("tbuo_mileage >=", value, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageLessThan(Double value) {
            addCriterion("tbuo_mileage <", value, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageLessThanOrEqualTo(Double value) {
            addCriterion("tbuo_mileage <=", value, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageIn(List<Double> values) {
            addCriterion("tbuo_mileage in", values, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageNotIn(List<Double> values) {
            addCriterion("tbuo_mileage not in", values, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageBetween(Double value1, Double value2) {
            addCriterion("tbuo_mileage between", value1, value2, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoMileageNotBetween(Double value1, Double value2) {
            addCriterion("tbuo_mileage not between", value1, value2, "tbuoMileage");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementIsNull() {
            addCriterion("tbuo_settlement is null");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementIsNotNull() {
            addCriterion("tbuo_settlement is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementEqualTo(Double value) {
            addCriterion("tbuo_settlement =", value, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementNotEqualTo(Double value) {
            addCriterion("tbuo_settlement <>", value, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementGreaterThan(Double value) {
            addCriterion("tbuo_settlement >", value, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementGreaterThanOrEqualTo(Double value) {
            addCriterion("tbuo_settlement >=", value, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementLessThan(Double value) {
            addCriterion("tbuo_settlement <", value, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementLessThanOrEqualTo(Double value) {
            addCriterion("tbuo_settlement <=", value, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementIn(List<Double> values) {
            addCriterion("tbuo_settlement in", values, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementNotIn(List<Double> values) {
            addCriterion("tbuo_settlement not in", values, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementBetween(Double value1, Double value2) {
            addCriterion("tbuo_settlement between", value1, value2, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoSettlementNotBetween(Double value1, Double value2) {
            addCriterion("tbuo_settlement not between", value1, value2, "tbuoSettlement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementIsNull() {
            addCriterion("tbuo_statement is null");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementIsNotNull() {
            addCriterion("tbuo_statement is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementEqualTo(Long value) {
            addCriterion("tbuo_statement =", value, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementNotEqualTo(Long value) {
            addCriterion("tbuo_statement <>", value, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementGreaterThan(Long value) {
            addCriterion("tbuo_statement >", value, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuo_statement >=", value, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementLessThan(Long value) {
            addCriterion("tbuo_statement <", value, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementLessThanOrEqualTo(Long value) {
            addCriterion("tbuo_statement <=", value, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementIn(List<Long> values) {
            addCriterion("tbuo_statement in", values, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementNotIn(List<Long> values) {
            addCriterion("tbuo_statement not in", values, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementBetween(Long value1, Long value2) {
            addCriterion("tbuo_statement between", value1, value2, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoStatementNotBetween(Long value1, Long value2) {
            addCriterion("tbuo_statement not between", value1, value2, "tbuoStatement");
            return (Criteria) this;
        }

        public Criteria andTbuoFromIsNull() {
            addCriterion("tbuo_from is null");
            return (Criteria) this;
        }

        public Criteria andTbuoFromIsNotNull() {
            addCriterion("tbuo_from is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoFromEqualTo(String value) {
            addCriterion("tbuo_from =", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromNotEqualTo(String value) {
            addCriterion("tbuo_from <>", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromGreaterThan(String value) {
            addCriterion("tbuo_from >", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_from >=", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromLessThan(String value) {
            addCriterion("tbuo_from <", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromLessThanOrEqualTo(String value) {
            addCriterion("tbuo_from <=", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromLike(String value) {
            addCriterion("tbuo_from like", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromNotLike(String value) {
            addCriterion("tbuo_from not like", value, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromIn(List<String> values) {
            addCriterion("tbuo_from in", values, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromNotIn(List<String> values) {
            addCriterion("tbuo_from not in", values, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromBetween(String value1, String value2) {
            addCriterion("tbuo_from between", value1, value2, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoFromNotBetween(String value1, String value2) {
            addCriterion("tbuo_from not between", value1, value2, "tbuoFrom");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeIsNull() {
            addCriterion("tbuo_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeIsNotNull() {
            addCriterion("tbuo_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeEqualTo(Date value) {
            addCriterion("tbuo_check_time =", value, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeNotEqualTo(Date value) {
            addCriterion("tbuo_check_time <>", value, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeGreaterThan(Date value) {
            addCriterion("tbuo_check_time >", value, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuo_check_time >=", value, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeLessThan(Date value) {
            addCriterion("tbuo_check_time <", value, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuo_check_time <=", value, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeIn(List<Date> values) {
            addCriterion("tbuo_check_time in", values, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeNotIn(List<Date> values) {
            addCriterion("tbuo_check_time not in", values, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeBetween(Date value1, Date value2) {
            addCriterion("tbuo_check_time between", value1, value2, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuo_check_time not between", value1, value2, "tbuoCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerIsNull() {
            addCriterion("tbuo_checker is null");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerIsNotNull() {
            addCriterion("tbuo_checker is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerEqualTo(String value) {
            addCriterion("tbuo_checker =", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerNotEqualTo(String value) {
            addCriterion("tbuo_checker <>", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerGreaterThan(String value) {
            addCriterion("tbuo_checker >", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("tbuo_checker >=", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerLessThan(String value) {
            addCriterion("tbuo_checker <", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerLessThanOrEqualTo(String value) {
            addCriterion("tbuo_checker <=", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerLike(String value) {
            addCriterion("tbuo_checker like", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerNotLike(String value) {
            addCriterion("tbuo_checker not like", value, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerIn(List<String> values) {
            addCriterion("tbuo_checker in", values, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerNotIn(List<String> values) {
            addCriterion("tbuo_checker not in", values, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerBetween(String value1, String value2) {
            addCriterion("tbuo_checker between", value1, value2, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoCheckerNotBetween(String value1, String value2) {
            addCriterion("tbuo_checker not between", value1, value2, "tbuoChecker");
            return (Criteria) this;
        }

        public Criteria andTbuoStateIsNull() {
            addCriterion("tbuo_state is null");
            return (Criteria) this;
        }

        public Criteria andTbuoStateIsNotNull() {
            addCriterion("tbuo_state is not null");
            return (Criteria) this;
        }

        public Criteria andTbuoStateEqualTo(Short value) {
            addCriterion("tbuo_state =", value, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateNotEqualTo(Short value) {
            addCriterion("tbuo_state <>", value, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateGreaterThan(Short value) {
            addCriterion("tbuo_state >", value, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateGreaterThanOrEqualTo(Short value) {
            addCriterion("tbuo_state >=", value, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateLessThan(Short value) {
            addCriterion("tbuo_state <", value, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateLessThanOrEqualTo(Short value) {
            addCriterion("tbuo_state <=", value, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateIn(List<Short> values) {
            addCriterion("tbuo_state in", values, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateNotIn(List<Short> values) {
            addCriterion("tbuo_state not in", values, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateBetween(Short value1, Short value2) {
            addCriterion("tbuo_state between", value1, value2, "tbuoState");
            return (Criteria) this;
        }

        public Criteria andTbuoStateNotBetween(Short value1, Short value2) {
            addCriterion("tbuo_state not between", value1, value2, "tbuoState");
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