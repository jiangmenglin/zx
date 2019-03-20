package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SecureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecureExample() {
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

        public Criteria andTbsIdIsNull() {
            addCriterion("tbs_id is null");
            return (Criteria) this;
        }

        public Criteria andTbsIdIsNotNull() {
            addCriterion("tbs_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbsIdEqualTo(Integer value) {
            addCriterion("tbs_id =", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotEqualTo(Integer value) {
            addCriterion("tbs_id <>", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdGreaterThan(Integer value) {
            addCriterion("tbs_id >", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_id >=", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdLessThan(Integer value) {
            addCriterion("tbs_id <", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_id <=", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdIn(List<Integer> values) {
            addCriterion("tbs_id in", values, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotIn(List<Integer> values) {
            addCriterion("tbs_id not in", values, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdBetween(Integer value1, Integer value2) {
            addCriterion("tbs_id between", value1, value2, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_id not between", value1, value2, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsHostIsNull() {
            addCriterion("tbs_host is null");
            return (Criteria) this;
        }

        public Criteria andTbsHostIsNotNull() {
            addCriterion("tbs_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbsHostEqualTo(Short value) {
            addCriterion("tbs_host =", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotEqualTo(Short value) {
            addCriterion("tbs_host <>", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostGreaterThan(Short value) {
            addCriterion("tbs_host >", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_host >=", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostLessThan(Short value) {
            addCriterion("tbs_host <", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostLessThanOrEqualTo(Short value) {
            addCriterion("tbs_host <=", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostIn(List<Short> values) {
            addCriterion("tbs_host in", values, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotIn(List<Short> values) {
            addCriterion("tbs_host not in", values, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostBetween(Short value1, Short value2) {
            addCriterion("tbs_host between", value1, value2, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotBetween(Short value1, Short value2) {
            addCriterion("tbs_host not between", value1, value2, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsCarIsNull() {
            addCriterion("tbs_car is null");
            return (Criteria) this;
        }

        public Criteria andTbsCarIsNotNull() {
            addCriterion("tbs_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCarEqualTo(Integer value) {
            addCriterion("tbs_car =", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotEqualTo(Integer value) {
            addCriterion("tbs_car <>", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarGreaterThan(Integer value) {
            addCriterion("tbs_car >", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_car >=", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarLessThan(Integer value) {
            addCriterion("tbs_car <", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_car <=", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarIn(List<Integer> values) {
            addCriterion("tbs_car in", values, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotIn(List<Integer> values) {
            addCriterion("tbs_car not in", values, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarBetween(Integer value1, Integer value2) {
            addCriterion("tbs_car between", value1, value2, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_car not between", value1, value2, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsVinIsNull() {
            addCriterion("tbs_VIN is null");
            return (Criteria) this;
        }

        public Criteria andTbsVinIsNotNull() {
            addCriterion("tbs_VIN is not null");
            return (Criteria) this;
        }

        public Criteria andTbsVinEqualTo(String value) {
            addCriterion("tbs_VIN =", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinNotEqualTo(String value) {
            addCriterion("tbs_VIN <>", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinGreaterThan(String value) {
            addCriterion("tbs_VIN >", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_VIN >=", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinLessThan(String value) {
            addCriterion("tbs_VIN <", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinLessThanOrEqualTo(String value) {
            addCriterion("tbs_VIN <=", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinLike(String value) {
            addCriterion("tbs_VIN like", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinNotLike(String value) {
            addCriterion("tbs_VIN not like", value, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinIn(List<String> values) {
            addCriterion("tbs_VIN in", values, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinNotIn(List<String> values) {
            addCriterion("tbs_VIN not in", values, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinBetween(String value1, String value2) {
            addCriterion("tbs_VIN between", value1, value2, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsVinNotBetween(String value1, String value2) {
            addCriterion("tbs_VIN not between", value1, value2, "tbsVin");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumIsNull() {
            addCriterion("tbs_cipnum is null");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumIsNotNull() {
            addCriterion("tbs_cipnum is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumEqualTo(String value) {
            addCriterion("tbs_cipnum =", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumNotEqualTo(String value) {
            addCriterion("tbs_cipnum <>", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumGreaterThan(String value) {
            addCriterion("tbs_cipnum >", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_cipnum >=", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumLessThan(String value) {
            addCriterion("tbs_cipnum <", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumLessThanOrEqualTo(String value) {
            addCriterion("tbs_cipnum <=", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumLike(String value) {
            addCriterion("tbs_cipnum like", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumNotLike(String value) {
            addCriterion("tbs_cipnum not like", value, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumIn(List<String> values) {
            addCriterion("tbs_cipnum in", values, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumNotIn(List<String> values) {
            addCriterion("tbs_cipnum not in", values, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumBetween(String value1, String value2) {
            addCriterion("tbs_cipnum between", value1, value2, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipnumNotBetween(String value1, String value2) {
            addCriterion("tbs_cipnum not between", value1, value2, "tbsCipnum");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyIsNull() {
            addCriterion("tbs_cipcompany is null");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyIsNotNull() {
            addCriterion("tbs_cipcompany is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyEqualTo(String value) {
            addCriterion("tbs_cipcompany =", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyNotEqualTo(String value) {
            addCriterion("tbs_cipcompany <>", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyGreaterThan(String value) {
            addCriterion("tbs_cipcompany >", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_cipcompany >=", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyLessThan(String value) {
            addCriterion("tbs_cipcompany <", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyLessThanOrEqualTo(String value) {
            addCriterion("tbs_cipcompany <=", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyLike(String value) {
            addCriterion("tbs_cipcompany like", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyNotLike(String value) {
            addCriterion("tbs_cipcompany not like", value, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyIn(List<String> values) {
            addCriterion("tbs_cipcompany in", values, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyNotIn(List<String> values) {
            addCriterion("tbs_cipcompany not in", values, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyBetween(String value1, String value2) {
            addCriterion("tbs_cipcompany between", value1, value2, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsCipcompanyNotBetween(String value1, String value2) {
            addCriterion("tbs_cipcompany not between", value1, value2, "tbsCipcompany");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitIsNull() {
            addCriterion("tbs_ti_unit is null");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitIsNotNull() {
            addCriterion("tbs_ti_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_ti_unit =", value, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_ti_unit <>", value, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitGreaterThan(Date value) {
            addCriterionForJDBCDate("tbs_ti_unit >", value, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_ti_unit >=", value, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitLessThan(Date value) {
            addCriterionForJDBCDate("tbs_ti_unit <", value, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_ti_unit <=", value, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitIn(List<Date> values) {
            addCriterionForJDBCDate("tbs_ti_unit in", values, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbs_ti_unit not in", values, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbs_ti_unit between", value1, value2, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsTiUnitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbs_ti_unit not between", value1, value2, "tbsTiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageIsNull() {
            addCriterion("tbs_cipimage is null");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageIsNotNull() {
            addCriterion("tbs_cipimage is not null");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageEqualTo(String value) {
            addCriterion("tbs_cipimage =", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageNotEqualTo(String value) {
            addCriterion("tbs_cipimage <>", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageGreaterThan(String value) {
            addCriterion("tbs_cipimage >", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_cipimage >=", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageLessThan(String value) {
            addCriterion("tbs_cipimage <", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageLessThanOrEqualTo(String value) {
            addCriterion("tbs_cipimage <=", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageLike(String value) {
            addCriterion("tbs_cipimage like", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageNotLike(String value) {
            addCriterion("tbs_cipimage not like", value, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageIn(List<String> values) {
            addCriterion("tbs_cipimage in", values, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageNotIn(List<String> values) {
            addCriterion("tbs_cipimage not in", values, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageBetween(String value1, String value2) {
            addCriterion("tbs_cipimage between", value1, value2, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsCipimageNotBetween(String value1, String value2) {
            addCriterion("tbs_cipimage not between", value1, value2, "tbsCipimage");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitIsNull() {
            addCriterion("tbs_bi_unit is null");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitIsNotNull() {
            addCriterion("tbs_bi_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_bi_unit =", value, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_bi_unit <>", value, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitGreaterThan(Date value) {
            addCriterionForJDBCDate("tbs_bi_unit >", value, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_bi_unit >=", value, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitLessThan(Date value) {
            addCriterionForJDBCDate("tbs_bi_unit <", value, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbs_bi_unit <=", value, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitIn(List<Date> values) {
            addCriterionForJDBCDate("tbs_bi_unit in", values, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbs_bi_unit not in", values, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbs_bi_unit between", value1, value2, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiUnitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbs_bi_unit not between", value1, value2, "tbsBiUnit");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageIsNull() {
            addCriterion("tbs_bi_image is null");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageIsNotNull() {
            addCriterion("tbs_bi_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageEqualTo(String value) {
            addCriterion("tbs_bi_image =", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageNotEqualTo(String value) {
            addCriterion("tbs_bi_image <>", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageGreaterThan(String value) {
            addCriterion("tbs_bi_image >", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_bi_image >=", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageLessThan(String value) {
            addCriterion("tbs_bi_image <", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageLessThanOrEqualTo(String value) {
            addCriterion("tbs_bi_image <=", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageLike(String value) {
            addCriterion("tbs_bi_image like", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageNotLike(String value) {
            addCriterion("tbs_bi_image not like", value, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageIn(List<String> values) {
            addCriterion("tbs_bi_image in", values, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageNotIn(List<String> values) {
            addCriterion("tbs_bi_image not in", values, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageBetween(String value1, String value2) {
            addCriterion("tbs_bi_image between", value1, value2, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiImageNotBetween(String value1, String value2) {
            addCriterion("tbs_bi_image not between", value1, value2, "tbsBiImage");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeIsNull() {
            addCriterion("tbs_bi_type is null");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeIsNotNull() {
            addCriterion("tbs_bi_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeEqualTo(String value) {
            addCriterion("tbs_bi_type =", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeNotEqualTo(String value) {
            addCriterion("tbs_bi_type <>", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeGreaterThan(String value) {
            addCriterion("tbs_bi_type >", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_bi_type >=", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeLessThan(String value) {
            addCriterion("tbs_bi_type <", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeLessThanOrEqualTo(String value) {
            addCriterion("tbs_bi_type <=", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeLike(String value) {
            addCriterion("tbs_bi_type like", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeNotLike(String value) {
            addCriterion("tbs_bi_type not like", value, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeIn(List<String> values) {
            addCriterion("tbs_bi_type in", values, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeNotIn(List<String> values) {
            addCriterion("tbs_bi_type not in", values, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeBetween(String value1, String value2) {
            addCriterion("tbs_bi_type between", value1, value2, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBiTypeNotBetween(String value1, String value2) {
            addCriterion("tbs_bi_type not between", value1, value2, "tbsBiType");
            return (Criteria) this;
        }

        public Criteria andTbsBinumIsNull() {
            addCriterion("tbs_binum is null");
            return (Criteria) this;
        }

        public Criteria andTbsBinumIsNotNull() {
            addCriterion("tbs_binum is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBinumEqualTo(String value) {
            addCriterion("tbs_binum =", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumNotEqualTo(String value) {
            addCriterion("tbs_binum <>", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumGreaterThan(String value) {
            addCriterion("tbs_binum >", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_binum >=", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumLessThan(String value) {
            addCriterion("tbs_binum <", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumLessThanOrEqualTo(String value) {
            addCriterion("tbs_binum <=", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumLike(String value) {
            addCriterion("tbs_binum like", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumNotLike(String value) {
            addCriterion("tbs_binum not like", value, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumIn(List<String> values) {
            addCriterion("tbs_binum in", values, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumNotIn(List<String> values) {
            addCriterion("tbs_binum not in", values, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumBetween(String value1, String value2) {
            addCriterion("tbs_binum between", value1, value2, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBinumNotBetween(String value1, String value2) {
            addCriterion("tbs_binum not between", value1, value2, "tbsBinum");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyIsNull() {
            addCriterion("tbs_bicompany is null");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyIsNotNull() {
            addCriterion("tbs_bicompany is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyEqualTo(String value) {
            addCriterion("tbs_bicompany =", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyNotEqualTo(String value) {
            addCriterion("tbs_bicompany <>", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyGreaterThan(String value) {
            addCriterion("tbs_bicompany >", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_bicompany >=", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyLessThan(String value) {
            addCriterion("tbs_bicompany <", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyLessThanOrEqualTo(String value) {
            addCriterion("tbs_bicompany <=", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyLike(String value) {
            addCriterion("tbs_bicompany like", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyNotLike(String value) {
            addCriterion("tbs_bicompany not like", value, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyIn(List<String> values) {
            addCriterion("tbs_bicompany in", values, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyNotIn(List<String> values) {
            addCriterion("tbs_bicompany not in", values, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyBetween(String value1, String value2) {
            addCriterion("tbs_bicompany between", value1, value2, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBicompanyNotBetween(String value1, String value2) {
            addCriterion("tbs_bicompany not between", value1, value2, "tbsBicompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitIsNull() {
            addCriterion("tbs_bi_limit is null");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitIsNotNull() {
            addCriterion("tbs_bi_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitEqualTo(Double value) {
            addCriterion("tbs_bi_limit =", value, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitNotEqualTo(Double value) {
            addCriterion("tbs_bi_limit <>", value, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitGreaterThan(Double value) {
            addCriterion("tbs_bi_limit >", value, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("tbs_bi_limit >=", value, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitLessThan(Double value) {
            addCriterion("tbs_bi_limit <", value, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitLessThanOrEqualTo(Double value) {
            addCriterion("tbs_bi_limit <=", value, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitIn(List<Double> values) {
            addCriterion("tbs_bi_limit in", values, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitNotIn(List<Double> values) {
            addCriterion("tbs_bi_limit not in", values, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitBetween(Double value1, Double value2) {
            addCriterion("tbs_bi_limit between", value1, value2, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiLimitNotBetween(Double value1, Double value2) {
            addCriterion("tbs_bi_limit not between", value1, value2, "tbsBiLimit");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyIsNull() {
            addCriterion("tbs_bi_company is null");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyIsNotNull() {
            addCriterion("tbs_bi_company is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyEqualTo(String value) {
            addCriterion("tbs_bi_company =", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyNotEqualTo(String value) {
            addCriterion("tbs_bi_company <>", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyGreaterThan(String value) {
            addCriterion("tbs_bi_company >", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_bi_company >=", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyLessThan(String value) {
            addCriterion("tbs_bi_company <", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyLessThanOrEqualTo(String value) {
            addCriterion("tbs_bi_company <=", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyLike(String value) {
            addCriterion("tbs_bi_company like", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyNotLike(String value) {
            addCriterion("tbs_bi_company not like", value, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyIn(List<String> values) {
            addCriterion("tbs_bi_company in", values, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyNotIn(List<String> values) {
            addCriterion("tbs_bi_company not in", values, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyBetween(String value1, String value2) {
            addCriterion("tbs_bi_company between", value1, value2, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsBiCompanyNotBetween(String value1, String value2) {
            addCriterion("tbs_bi_company not between", value1, value2, "tbsBiCompany");
            return (Criteria) this;
        }

        public Criteria andTbsEditorIsNull() {
            addCriterion("tbs_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbsEditorIsNotNull() {
            addCriterion("tbs_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEditorEqualTo(Integer value) {
            addCriterion("tbs_editor =", value, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorNotEqualTo(Integer value) {
            addCriterion("tbs_editor <>", value, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorGreaterThan(Integer value) {
            addCriterion("tbs_editor >", value, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbs_editor >=", value, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorLessThan(Integer value) {
            addCriterion("tbs_editor <", value, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbs_editor <=", value, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorIn(List<Integer> values) {
            addCriterion("tbs_editor in", values, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorNotIn(List<Integer> values) {
            addCriterion("tbs_editor not in", values, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbs_editor between", value1, value2, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs_editor not between", value1, value2, "tbsEditor");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeIsNull() {
            addCriterion("tbs_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeIsNotNull() {
            addCriterion("tbs_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeEqualTo(Date value) {
            addCriterion("tbs_update_time =", value, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbs_update_time <>", value, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeGreaterThan(Date value) {
            addCriterion("tbs_update_time >", value, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbs_update_time >=", value, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeLessThan(Date value) {
            addCriterion("tbs_update_time <", value, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbs_update_time <=", value, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeIn(List<Date> values) {
            addCriterion("tbs_update_time in", values, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbs_update_time not in", values, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbs_update_time between", value1, value2, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbs_update_time not between", value1, value2, "tbsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeIsNull() {
            addCriterion("tbs_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeIsNotNull() {
            addCriterion("tbs_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeEqualTo(Date value) {
            addCriterion("tbs_add_time =", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeNotEqualTo(Date value) {
            addCriterion("tbs_add_time <>", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeGreaterThan(Date value) {
            addCriterion("tbs_add_time >", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbs_add_time >=", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeLessThan(Date value) {
            addCriterion("tbs_add_time <", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbs_add_time <=", value, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeIn(List<Date> values) {
            addCriterion("tbs_add_time in", values, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeNotIn(List<Date> values) {
            addCriterion("tbs_add_time not in", values, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbs_add_time between", value1, value2, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbs_add_time not between", value1, value2, "tbsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkIsNull() {
            addCriterion("tbs_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkIsNotNull() {
            addCriterion("tbs_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkEqualTo(String value) {
            addCriterion("tbs_remark =", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkNotEqualTo(String value) {
            addCriterion("tbs_remark <>", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkGreaterThan(String value) {
            addCriterion("tbs_remark >", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_remark >=", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkLessThan(String value) {
            addCriterion("tbs_remark <", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbs_remark <=", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkLike(String value) {
            addCriterion("tbs_remark like", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkNotLike(String value) {
            addCriterion("tbs_remark not like", value, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkIn(List<String> values) {
            addCriterion("tbs_remark in", values, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkNotIn(List<String> values) {
            addCriterion("tbs_remark not in", values, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkBetween(String value1, String value2) {
            addCriterion("tbs_remark between", value1, value2, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsRemarkNotBetween(String value1, String value2) {
            addCriterion("tbs_remark not between", value1, value2, "tbsRemark");
            return (Criteria) this;
        }

        public Criteria andTbsStatusIsNull() {
            addCriterion("tbs_status is null");
            return (Criteria) this;
        }

        public Criteria andTbsStatusIsNotNull() {
            addCriterion("tbs_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbsStatusEqualTo(Byte value) {
            addCriterion("tbs_status =", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusNotEqualTo(Byte value) {
            addCriterion("tbs_status <>", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusGreaterThan(Byte value) {
            addCriterion("tbs_status >", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_status >=", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusLessThan(Byte value) {
            addCriterion("tbs_status <", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_status <=", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusIn(List<Byte> values) {
            addCriterion("tbs_status in", values, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusNotIn(List<Byte> values) {
            addCriterion("tbs_status not in", values, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbs_status between", value1, value2, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_status not between", value1, value2, "tbsStatus");
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