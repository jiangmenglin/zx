package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OutletsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutletsExample() {
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

        public Criteria andTboIdIsNull() {
            addCriterion("tbo_id is null");
            return (Criteria) this;
        }

        public Criteria andTboIdIsNotNull() {
            addCriterion("tbo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTboIdEqualTo(Integer value) {
            addCriterion("tbo_id =", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdNotEqualTo(Integer value) {
            addCriterion("tbo_id <>", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdGreaterThan(Integer value) {
            addCriterion("tbo_id >", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_id >=", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdLessThan(Integer value) {
            addCriterion("tbo_id <", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_id <=", value, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdIn(List<Integer> values) {
            addCriterion("tbo_id in", values, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdNotIn(List<Integer> values) {
            addCriterion("tbo_id not in", values, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdBetween(Integer value1, Integer value2) {
            addCriterion("tbo_id between", value1, value2, "tboId");
            return (Criteria) this;
        }

        public Criteria andTboIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTboHostEqualTo(Short value) {
            addCriterion("tbo_host =", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostNotEqualTo(Short value) {
            addCriterion("tbo_host <>", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostGreaterThan(Short value) {
            addCriterion("tbo_host >", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbo_host >=", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostLessThan(Short value) {
            addCriterion("tbo_host <", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostLessThanOrEqualTo(Short value) {
            addCriterion("tbo_host <=", value, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostIn(List<Short> values) {
            addCriterion("tbo_host in", values, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostNotIn(List<Short> values) {
            addCriterion("tbo_host not in", values, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostBetween(Short value1, Short value2) {
            addCriterion("tbo_host between", value1, value2, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboHostNotBetween(Short value1, Short value2) {
            addCriterion("tbo_host not between", value1, value2, "tboHost");
            return (Criteria) this;
        }

        public Criteria andTboDistrictIsNull() {
            addCriterion("tbo_district is null");
            return (Criteria) this;
        }

        public Criteria andTboDistrictIsNotNull() {
            addCriterion("tbo_district is not null");
            return (Criteria) this;
        }

        public Criteria andTboDistrictEqualTo(Long value) {
            addCriterion("tbo_district =", value, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictNotEqualTo(Long value) {
            addCriterion("tbo_district <>", value, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictGreaterThan(Long value) {
            addCriterion("tbo_district >", value, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictGreaterThanOrEqualTo(Long value) {
            addCriterion("tbo_district >=", value, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictLessThan(Long value) {
            addCriterion("tbo_district <", value, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictLessThanOrEqualTo(Long value) {
            addCriterion("tbo_district <=", value, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictIn(List<Long> values) {
            addCriterion("tbo_district in", values, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictNotIn(List<Long> values) {
            addCriterion("tbo_district not in", values, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictBetween(Long value1, Long value2) {
            addCriterion("tbo_district between", value1, value2, "tboDistrict");
            return (Criteria) this;
        }

        public Criteria andTboDistrictNotBetween(Long value1, Long value2) {
            addCriterion("tbo_district not between", value1, value2, "tboDistrict");
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

        public Criteria andTboLongitudeIsNull() {
            addCriterion("tbo_longitude is null");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeIsNotNull() {
            addCriterion("tbo_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeEqualTo(BigDecimal value) {
            addCriterion("tbo_longitude =", value, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("tbo_longitude <>", value, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeGreaterThan(BigDecimal value) {
            addCriterion("tbo_longitude >", value, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbo_longitude >=", value, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeLessThan(BigDecimal value) {
            addCriterion("tbo_longitude <", value, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbo_longitude <=", value, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeIn(List<BigDecimal> values) {
            addCriterion("tbo_longitude in", values, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("tbo_longitude not in", values, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbo_longitude between", value1, value2, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbo_longitude not between", value1, value2, "tboLongitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeIsNull() {
            addCriterion("tbo_latitude is null");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeIsNotNull() {
            addCriterion("tbo_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeEqualTo(BigDecimal value) {
            addCriterion("tbo_latitude =", value, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("tbo_latitude <>", value, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeGreaterThan(BigDecimal value) {
            addCriterion("tbo_latitude >", value, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbo_latitude >=", value, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeLessThan(BigDecimal value) {
            addCriterion("tbo_latitude <", value, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbo_latitude <=", value, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeIn(List<BigDecimal> values) {
            addCriterion("tbo_latitude in", values, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("tbo_latitude not in", values, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbo_latitude between", value1, value2, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbo_latitude not between", value1, value2, "tboLatitude");
            return (Criteria) this;
        }

        public Criteria andTboRangeIsNull() {
            addCriterion("tbo_range is null");
            return (Criteria) this;
        }

        public Criteria andTboRangeIsNotNull() {
            addCriterion("tbo_range is not null");
            return (Criteria) this;
        }

        public Criteria andTboRangeEqualTo(String value) {
            addCriterion("tbo_range =", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeNotEqualTo(String value) {
            addCriterion("tbo_range <>", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeGreaterThan(String value) {
            addCriterion("tbo_range >", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_range >=", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeLessThan(String value) {
            addCriterion("tbo_range <", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeLessThanOrEqualTo(String value) {
            addCriterion("tbo_range <=", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeLike(String value) {
            addCriterion("tbo_range like", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeNotLike(String value) {
            addCriterion("tbo_range not like", value, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeIn(List<String> values) {
            addCriterion("tbo_range in", values, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeNotIn(List<String> values) {
            addCriterion("tbo_range not in", values, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeBetween(String value1, String value2) {
            addCriterion("tbo_range between", value1, value2, "tboRange");
            return (Criteria) this;
        }

        public Criteria andTboRangeNotBetween(String value1, String value2) {
            addCriterion("tbo_range not between", value1, value2, "tboRange");
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

        public Criteria andTboSpaceIsNull() {
            addCriterion("tbo_space is null");
            return (Criteria) this;
        }

        public Criteria andTboSpaceIsNotNull() {
            addCriterion("tbo_space is not null");
            return (Criteria) this;
        }

        public Criteria andTboSpaceEqualTo(String value) {
            addCriterion("tbo_space =", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceNotEqualTo(String value) {
            addCriterion("tbo_space <>", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceGreaterThan(String value) {
            addCriterion("tbo_space >", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_space >=", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceLessThan(String value) {
            addCriterion("tbo_space <", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceLessThanOrEqualTo(String value) {
            addCriterion("tbo_space <=", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceLike(String value) {
            addCriterion("tbo_space like", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceNotLike(String value) {
            addCriterion("tbo_space not like", value, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceIn(List<String> values) {
            addCriterion("tbo_space in", values, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceNotIn(List<String> values) {
            addCriterion("tbo_space not in", values, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceBetween(String value1, String value2) {
            addCriterion("tbo_space between", value1, value2, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboSpaceNotBetween(String value1, String value2) {
            addCriterion("tbo_space not between", value1, value2, "tboSpace");
            return (Criteria) this;
        }

        public Criteria andTboDetailsIsNull() {
            addCriterion("tbo_details is null");
            return (Criteria) this;
        }

        public Criteria andTboDetailsIsNotNull() {
            addCriterion("tbo_details is not null");
            return (Criteria) this;
        }

        public Criteria andTboDetailsEqualTo(String value) {
            addCriterion("tbo_details =", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsNotEqualTo(String value) {
            addCriterion("tbo_details <>", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsGreaterThan(String value) {
            addCriterion("tbo_details >", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_details >=", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsLessThan(String value) {
            addCriterion("tbo_details <", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsLessThanOrEqualTo(String value) {
            addCriterion("tbo_details <=", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsLike(String value) {
            addCriterion("tbo_details like", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsNotLike(String value) {
            addCriterion("tbo_details not like", value, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsIn(List<String> values) {
            addCriterion("tbo_details in", values, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsNotIn(List<String> values) {
            addCriterion("tbo_details not in", values, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsBetween(String value1, String value2) {
            addCriterion("tbo_details between", value1, value2, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDetailsNotBetween(String value1, String value2) {
            addCriterion("tbo_details not between", value1, value2, "tboDetails");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeIsNull() {
            addCriterion("tbo_door_time is null");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeIsNotNull() {
            addCriterion("tbo_door_time is not null");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeEqualTo(String value) {
            addCriterion("tbo_door_time =", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeNotEqualTo(String value) {
            addCriterion("tbo_door_time <>", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeGreaterThan(String value) {
            addCriterion("tbo_door_time >", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_door_time >=", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeLessThan(String value) {
            addCriterion("tbo_door_time <", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeLessThanOrEqualTo(String value) {
            addCriterion("tbo_door_time <=", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeLike(String value) {
            addCriterion("tbo_door_time like", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeNotLike(String value) {
            addCriterion("tbo_door_time not like", value, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeIn(List<String> values) {
            addCriterion("tbo_door_time in", values, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeNotIn(List<String> values) {
            addCriterion("tbo_door_time not in", values, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeBetween(String value1, String value2) {
            addCriterion("tbo_door_time between", value1, value2, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboDoorTimeNotBetween(String value1, String value2) {
            addCriterion("tbo_door_time not between", value1, value2, "tboDoorTime");
            return (Criteria) this;
        }

        public Criteria andTboCostIsNull() {
            addCriterion("tbo_cost is null");
            return (Criteria) this;
        }

        public Criteria andTboCostIsNotNull() {
            addCriterion("tbo_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTboCostEqualTo(Double value) {
            addCriterion("tbo_cost =", value, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostNotEqualTo(Double value) {
            addCriterion("tbo_cost <>", value, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostGreaterThan(Double value) {
            addCriterion("tbo_cost >", value, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostGreaterThanOrEqualTo(Double value) {
            addCriterion("tbo_cost >=", value, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostLessThan(Double value) {
            addCriterion("tbo_cost <", value, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostLessThanOrEqualTo(Double value) {
            addCriterion("tbo_cost <=", value, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostIn(List<Double> values) {
            addCriterion("tbo_cost in", values, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostNotIn(List<Double> values) {
            addCriterion("tbo_cost not in", values, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostBetween(Double value1, Double value2) {
            addCriterion("tbo_cost between", value1, value2, "tboCost");
            return (Criteria) this;
        }

        public Criteria andTboCostNotBetween(Double value1, Double value2) {
            addCriterion("tbo_cost not between", value1, value2, "tboCost");
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

        public Criteria andTboContactIsNull() {
            addCriterion("tbo_contact is null");
            return (Criteria) this;
        }

        public Criteria andTboContactIsNotNull() {
            addCriterion("tbo_contact is not null");
            return (Criteria) this;
        }

        public Criteria andTboContactEqualTo(String value) {
            addCriterion("tbo_contact =", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactNotEqualTo(String value) {
            addCriterion("tbo_contact <>", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactGreaterThan(String value) {
            addCriterion("tbo_contact >", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_contact >=", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactLessThan(String value) {
            addCriterion("tbo_contact <", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactLessThanOrEqualTo(String value) {
            addCriterion("tbo_contact <=", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactLike(String value) {
            addCriterion("tbo_contact like", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactNotLike(String value) {
            addCriterion("tbo_contact not like", value, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactIn(List<String> values) {
            addCriterion("tbo_contact in", values, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactNotIn(List<String> values) {
            addCriterion("tbo_contact not in", values, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactBetween(String value1, String value2) {
            addCriterion("tbo_contact between", value1, value2, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboContactNotBetween(String value1, String value2) {
            addCriterion("tbo_contact not between", value1, value2, "tboContact");
            return (Criteria) this;
        }

        public Criteria andTboUntilIsNull() {
            addCriterion("tbo_until is null");
            return (Criteria) this;
        }

        public Criteria andTboUntilIsNotNull() {
            addCriterion("tbo_until is not null");
            return (Criteria) this;
        }

        public Criteria andTboUntilEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_until =", value, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_until <>", value, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilGreaterThan(Date value) {
            addCriterionForJDBCDate("tbo_until >", value, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_until >=", value, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilLessThan(Date value) {
            addCriterionForJDBCDate("tbo_until <", value, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_until <=", value, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilIn(List<Date> values) {
            addCriterionForJDBCDate("tbo_until in", values, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbo_until not in", values, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbo_until between", value1, value2, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboUntilNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbo_until not between", value1, value2, "tboUntil");
            return (Criteria) this;
        }

        public Criteria andTboExpireIsNull() {
            addCriterion("tbo_expire is null");
            return (Criteria) this;
        }

        public Criteria andTboExpireIsNotNull() {
            addCriterion("tbo_expire is not null");
            return (Criteria) this;
        }

        public Criteria andTboExpireEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_expire =", value, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_expire <>", value, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireGreaterThan(Date value) {
            addCriterionForJDBCDate("tbo_expire >", value, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_expire >=", value, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireLessThan(Date value) {
            addCriterionForJDBCDate("tbo_expire <", value, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbo_expire <=", value, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireIn(List<Date> values) {
            addCriterionForJDBCDate("tbo_expire in", values, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbo_expire not in", values, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbo_expire between", value1, value2, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboExpireNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbo_expire not between", value1, value2, "tboExpire");
            return (Criteria) this;
        }

        public Criteria andTboCarSIsNull() {
            addCriterion("tbo_car_s is null");
            return (Criteria) this;
        }

        public Criteria andTboCarSIsNotNull() {
            addCriterion("tbo_car_s is not null");
            return (Criteria) this;
        }

        public Criteria andTboCarSEqualTo(Integer value) {
            addCriterion("tbo_car_s =", value, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSNotEqualTo(Integer value) {
            addCriterion("tbo_car_s <>", value, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSGreaterThan(Integer value) {
            addCriterion("tbo_car_s >", value, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_car_s >=", value, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSLessThan(Integer value) {
            addCriterion("tbo_car_s <", value, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_car_s <=", value, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSIn(List<Integer> values) {
            addCriterion("tbo_car_s in", values, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSNotIn(List<Integer> values) {
            addCriterion("tbo_car_s not in", values, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSBetween(Integer value1, Integer value2) {
            addCriterion("tbo_car_s between", value1, value2, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboCarSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_car_s not between", value1, value2, "tboCarS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSIsNull() {
            addCriterion("tbo_position_s is null");
            return (Criteria) this;
        }

        public Criteria andTboPositionSIsNotNull() {
            addCriterion("tbo_position_s is not null");
            return (Criteria) this;
        }

        public Criteria andTboPositionSEqualTo(Integer value) {
            addCriterion("tbo_position_s =", value, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSNotEqualTo(Integer value) {
            addCriterion("tbo_position_s <>", value, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSGreaterThan(Integer value) {
            addCriterion("tbo_position_s >", value, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_position_s >=", value, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSLessThan(Integer value) {
            addCriterion("tbo_position_s <", value, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_position_s <=", value, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSIn(List<Integer> values) {
            addCriterion("tbo_position_s in", values, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSNotIn(List<Integer> values) {
            addCriterion("tbo_position_s not in", values, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSBetween(Integer value1, Integer value2) {
            addCriterion("tbo_position_s between", value1, value2, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboPositionSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_position_s not between", value1, value2, "tboPositionS");
            return (Criteria) this;
        }

        public Criteria andTboImageIsNull() {
            addCriterion("tbo_image is null");
            return (Criteria) this;
        }

        public Criteria andTboImageIsNotNull() {
            addCriterion("tbo_image is not null");
            return (Criteria) this;
        }

        public Criteria andTboImageEqualTo(String value) {
            addCriterion("tbo_image =", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageNotEqualTo(String value) {
            addCriterion("tbo_image <>", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageGreaterThan(String value) {
            addCriterion("tbo_image >", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_image >=", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageLessThan(String value) {
            addCriterion("tbo_image <", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageLessThanOrEqualTo(String value) {
            addCriterion("tbo_image <=", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageLike(String value) {
            addCriterion("tbo_image like", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageNotLike(String value) {
            addCriterion("tbo_image not like", value, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageIn(List<String> values) {
            addCriterion("tbo_image in", values, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageNotIn(List<String> values) {
            addCriterion("tbo_image not in", values, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageBetween(String value1, String value2) {
            addCriterion("tbo_image between", value1, value2, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboImageNotBetween(String value1, String value2) {
            addCriterion("tbo_image not between", value1, value2, "tboImage");
            return (Criteria) this;
        }

        public Criteria andTboCanAIsNull() {
            addCriterion("tbo_can_a is null");
            return (Criteria) this;
        }

        public Criteria andTboCanAIsNotNull() {
            addCriterion("tbo_can_a is not null");
            return (Criteria) this;
        }

        public Criteria andTboCanAEqualTo(Byte value) {
            addCriterion("tbo_can_a =", value, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanANotEqualTo(Byte value) {
            addCriterion("tbo_can_a <>", value, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanAGreaterThan(Byte value) {
            addCriterion("tbo_can_a >", value, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanAGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_can_a >=", value, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanALessThan(Byte value) {
            addCriterion("tbo_can_a <", value, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanALessThanOrEqualTo(Byte value) {
            addCriterion("tbo_can_a <=", value, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanAIn(List<Byte> values) {
            addCriterion("tbo_can_a in", values, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanANotIn(List<Byte> values) {
            addCriterion("tbo_can_a not in", values, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanABetween(Byte value1, Byte value2) {
            addCriterion("tbo_can_a between", value1, value2, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanANotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_can_a not between", value1, value2, "tboCanA");
            return (Criteria) this;
        }

        public Criteria andTboCanBIsNull() {
            addCriterion("tbo_can_b is null");
            return (Criteria) this;
        }

        public Criteria andTboCanBIsNotNull() {
            addCriterion("tbo_can_b is not null");
            return (Criteria) this;
        }

        public Criteria andTboCanBEqualTo(Byte value) {
            addCriterion("tbo_can_b =", value, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBNotEqualTo(Byte value) {
            addCriterion("tbo_can_b <>", value, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBGreaterThan(Byte value) {
            addCriterion("tbo_can_b >", value, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbo_can_b >=", value, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBLessThan(Byte value) {
            addCriterion("tbo_can_b <", value, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBLessThanOrEqualTo(Byte value) {
            addCriterion("tbo_can_b <=", value, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBIn(List<Byte> values) {
            addCriterion("tbo_can_b in", values, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBNotIn(List<Byte> values) {
            addCriterion("tbo_can_b not in", values, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBBetween(Byte value1, Byte value2) {
            addCriterion("tbo_can_b between", value1, value2, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboCanBNotBetween(Byte value1, Byte value2) {
            addCriterion("tbo_can_b not between", value1, value2, "tboCanB");
            return (Criteria) this;
        }

        public Criteria andTboPriorityIsNull() {
            addCriterion("tbo_priority is null");
            return (Criteria) this;
        }

        public Criteria andTboPriorityIsNotNull() {
            addCriterion("tbo_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTboPriorityEqualTo(Integer value) {
            addCriterion("tbo_priority =", value, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityNotEqualTo(Integer value) {
            addCriterion("tbo_priority <>", value, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityGreaterThan(Integer value) {
            addCriterion("tbo_priority >", value, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_priority >=", value, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityLessThan(Integer value) {
            addCriterion("tbo_priority <", value, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_priority <=", value, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityIn(List<Integer> values) {
            addCriterion("tbo_priority in", values, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityNotIn(List<Integer> values) {
            addCriterion("tbo_priority not in", values, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityBetween(Integer value1, Integer value2) {
            addCriterion("tbo_priority between", value1, value2, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_priority not between", value1, value2, "tboPriority");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeIsNull() {
            addCriterion("tbo_outlets_type is null");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeIsNotNull() {
            addCriterion("tbo_outlets_type is not null");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeEqualTo(Short value) {
            addCriterion("tbo_outlets_type =", value, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeNotEqualTo(Short value) {
            addCriterion("tbo_outlets_type <>", value, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeGreaterThan(Short value) {
            addCriterion("tbo_outlets_type >", value, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbo_outlets_type >=", value, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeLessThan(Short value) {
            addCriterion("tbo_outlets_type <", value, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbo_outlets_type <=", value, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeIn(List<Short> values) {
            addCriterion("tbo_outlets_type in", values, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeNotIn(List<Short> values) {
            addCriterion("tbo_outlets_type not in", values, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeBetween(Short value1, Short value2) {
            addCriterion("tbo_outlets_type between", value1, value2, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboOutletsTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbo_outlets_type not between", value1, value2, "tboOutletsType");
            return (Criteria) this;
        }

        public Criteria andTboVoteSIsNull() {
            addCriterion("tbo_vote_s is null");
            return (Criteria) this;
        }

        public Criteria andTboVoteSIsNotNull() {
            addCriterion("tbo_vote_s is not null");
            return (Criteria) this;
        }

        public Criteria andTboVoteSEqualTo(Integer value) {
            addCriterion("tbo_vote_s =", value, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSNotEqualTo(Integer value) {
            addCriterion("tbo_vote_s <>", value, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSGreaterThan(Integer value) {
            addCriterion("tbo_vote_s >", value, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbo_vote_s >=", value, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSLessThan(Integer value) {
            addCriterion("tbo_vote_s <", value, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSLessThanOrEqualTo(Integer value) {
            addCriterion("tbo_vote_s <=", value, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSIn(List<Integer> values) {
            addCriterion("tbo_vote_s in", values, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSNotIn(List<Integer> values) {
            addCriterion("tbo_vote_s not in", values, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSBetween(Integer value1, Integer value2) {
            addCriterion("tbo_vote_s between", value1, value2, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboVoteSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbo_vote_s not between", value1, value2, "tboVoteS");
            return (Criteria) this;
        }

        public Criteria andTboProfileIsNull() {
            addCriterion("tbo_profile is null");
            return (Criteria) this;
        }

        public Criteria andTboProfileIsNotNull() {
            addCriterion("tbo_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTboProfileEqualTo(String value) {
            addCriterion("tbo_profile =", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileNotEqualTo(String value) {
            addCriterion("tbo_profile <>", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileGreaterThan(String value) {
            addCriterion("tbo_profile >", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbo_profile >=", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileLessThan(String value) {
            addCriterion("tbo_profile <", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileLessThanOrEqualTo(String value) {
            addCriterion("tbo_profile <=", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileLike(String value) {
            addCriterion("tbo_profile like", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileNotLike(String value) {
            addCriterion("tbo_profile not like", value, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileIn(List<String> values) {
            addCriterion("tbo_profile in", values, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileNotIn(List<String> values) {
            addCriterion("tbo_profile not in", values, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileBetween(String value1, String value2) {
            addCriterion("tbo_profile between", value1, value2, "tboProfile");
            return (Criteria) this;
        }

        public Criteria andTboProfileNotBetween(String value1, String value2) {
            addCriterion("tbo_profile not between", value1, value2, "tboProfile");
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