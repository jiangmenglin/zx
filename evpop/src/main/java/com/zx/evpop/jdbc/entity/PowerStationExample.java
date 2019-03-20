package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowerStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerStationExample() {
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

        public Criteria andTbpsIdIsNull() {
            addCriterion("tbps_id is null");
            return (Criteria) this;
        }

        public Criteria andTbpsIdIsNotNull() {
            addCriterion("tbps_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsIdEqualTo(Long value) {
            addCriterion("tbps_id =", value, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdNotEqualTo(Long value) {
            addCriterion("tbps_id <>", value, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdGreaterThan(Long value) {
            addCriterion("tbps_id >", value, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbps_id >=", value, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdLessThan(Long value) {
            addCriterion("tbps_id <", value, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdLessThanOrEqualTo(Long value) {
            addCriterion("tbps_id <=", value, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdIn(List<Long> values) {
            addCriterion("tbps_id in", values, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdNotIn(List<Long> values) {
            addCriterion("tbps_id not in", values, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdBetween(Long value1, Long value2) {
            addCriterion("tbps_id between", value1, value2, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsIdNotBetween(Long value1, Long value2) {
            addCriterion("tbps_id not between", value1, value2, "tbpsId");
            return (Criteria) this;
        }

        public Criteria andTbpsHostIsNull() {
            addCriterion("tbps_host is null");
            return (Criteria) this;
        }

        public Criteria andTbpsHostIsNotNull() {
            addCriterion("tbps_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsHostEqualTo(Long value) {
            addCriterion("tbps_host =", value, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostNotEqualTo(Long value) {
            addCriterion("tbps_host <>", value, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostGreaterThan(Long value) {
            addCriterion("tbps_host >", value, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbps_host >=", value, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostLessThan(Long value) {
            addCriterion("tbps_host <", value, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostLessThanOrEqualTo(Long value) {
            addCriterion("tbps_host <=", value, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostIn(List<Long> values) {
            addCriterion("tbps_host in", values, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostNotIn(List<Long> values) {
            addCriterion("tbps_host not in", values, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostBetween(Long value1, Long value2) {
            addCriterion("tbps_host between", value1, value2, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsHostNotBetween(Long value1, Long value2) {
            addCriterion("tbps_host not between", value1, value2, "tbpsHost");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaIsNull() {
            addCriterion("tbps_area is null");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaIsNotNull() {
            addCriterion("tbps_area is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaEqualTo(Long value) {
            addCriterion("tbps_area =", value, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaNotEqualTo(Long value) {
            addCriterion("tbps_area <>", value, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaGreaterThan(Long value) {
            addCriterion("tbps_area >", value, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("tbps_area >=", value, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaLessThan(Long value) {
            addCriterion("tbps_area <", value, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaLessThanOrEqualTo(Long value) {
            addCriterion("tbps_area <=", value, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaIn(List<Long> values) {
            addCriterion("tbps_area in", values, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaNotIn(List<Long> values) {
            addCriterion("tbps_area not in", values, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaBetween(Long value1, Long value2) {
            addCriterion("tbps_area between", value1, value2, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsAreaNotBetween(Long value1, Long value2) {
            addCriterion("tbps_area not between", value1, value2, "tbpsArea");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsIsNull() {
            addCriterion("tbps_outlets is null");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsIsNotNull() {
            addCriterion("tbps_outlets is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsEqualTo(Long value) {
            addCriterion("tbps_outlets =", value, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsNotEqualTo(Long value) {
            addCriterion("tbps_outlets <>", value, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsGreaterThan(Long value) {
            addCriterion("tbps_outlets >", value, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsGreaterThanOrEqualTo(Long value) {
            addCriterion("tbps_outlets >=", value, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsLessThan(Long value) {
            addCriterion("tbps_outlets <", value, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsLessThanOrEqualTo(Long value) {
            addCriterion("tbps_outlets <=", value, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsIn(List<Long> values) {
            addCriterion("tbps_outlets in", values, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsNotIn(List<Long> values) {
            addCriterion("tbps_outlets not in", values, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsBetween(Long value1, Long value2) {
            addCriterion("tbps_outlets between", value1, value2, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsOutletsNotBetween(Long value1, Long value2) {
            addCriterion("tbps_outlets not between", value1, value2, "tbpsOutlets");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierIsNull() {
            addCriterion("tbps_supplier is null");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierIsNotNull() {
            addCriterion("tbps_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierEqualTo(Long value) {
            addCriterion("tbps_supplier =", value, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierNotEqualTo(Long value) {
            addCriterion("tbps_supplier <>", value, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierGreaterThan(Long value) {
            addCriterion("tbps_supplier >", value, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierGreaterThanOrEqualTo(Long value) {
            addCriterion("tbps_supplier >=", value, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierLessThan(Long value) {
            addCriterion("tbps_supplier <", value, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierLessThanOrEqualTo(Long value) {
            addCriterion("tbps_supplier <=", value, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierIn(List<Long> values) {
            addCriterion("tbps_supplier in", values, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierNotIn(List<Long> values) {
            addCriterion("tbps_supplier not in", values, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierBetween(Long value1, Long value2) {
            addCriterion("tbps_supplier between", value1, value2, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsSupplierNotBetween(Long value1, Long value2) {
            addCriterion("tbps_supplier not between", value1, value2, "tbpsSupplier");
            return (Criteria) this;
        }

        public Criteria andTbpsNameIsNull() {
            addCriterion("tbps_name is null");
            return (Criteria) this;
        }

        public Criteria andTbpsNameIsNotNull() {
            addCriterion("tbps_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsNameEqualTo(String value) {
            addCriterion("tbps_name =", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameNotEqualTo(String value) {
            addCriterion("tbps_name <>", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameGreaterThan(String value) {
            addCriterion("tbps_name >", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_name >=", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameLessThan(String value) {
            addCriterion("tbps_name <", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameLessThanOrEqualTo(String value) {
            addCriterion("tbps_name <=", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameLike(String value) {
            addCriterion("tbps_name like", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameNotLike(String value) {
            addCriterion("tbps_name not like", value, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameIn(List<String> values) {
            addCriterion("tbps_name in", values, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameNotIn(List<String> values) {
            addCriterion("tbps_name not in", values, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameBetween(String value1, String value2) {
            addCriterion("tbps_name between", value1, value2, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsNameNotBetween(String value1, String value2) {
            addCriterion("tbps_name not between", value1, value2, "tbpsName");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagIsNull() {
            addCriterion("tbps_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagIsNotNull() {
            addCriterion("tbps_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagEqualTo(String value) {
            addCriterion("tbps_flag =", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagNotEqualTo(String value) {
            addCriterion("tbps_flag <>", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagGreaterThan(String value) {
            addCriterion("tbps_flag >", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_flag >=", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagLessThan(String value) {
            addCriterion("tbps_flag <", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagLessThanOrEqualTo(String value) {
            addCriterion("tbps_flag <=", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagLike(String value) {
            addCriterion("tbps_flag like", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagNotLike(String value) {
            addCriterion("tbps_flag not like", value, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagIn(List<String> values) {
            addCriterion("tbps_flag in", values, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagNotIn(List<String> values) {
            addCriterion("tbps_flag not in", values, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagBetween(String value1, String value2) {
            addCriterion("tbps_flag between", value1, value2, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsFlagNotBetween(String value1, String value2) {
            addCriterion("tbps_flag not between", value1, value2, "tbpsFlag");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressIsNull() {
            addCriterion("tbps_address is null");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressIsNotNull() {
            addCriterion("tbps_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressEqualTo(String value) {
            addCriterion("tbps_address =", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressNotEqualTo(String value) {
            addCriterion("tbps_address <>", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressGreaterThan(String value) {
            addCriterion("tbps_address >", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_address >=", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressLessThan(String value) {
            addCriterion("tbps_address <", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressLessThanOrEqualTo(String value) {
            addCriterion("tbps_address <=", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressLike(String value) {
            addCriterion("tbps_address like", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressNotLike(String value) {
            addCriterion("tbps_address not like", value, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressIn(List<String> values) {
            addCriterion("tbps_address in", values, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressNotIn(List<String> values) {
            addCriterion("tbps_address not in", values, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressBetween(String value1, String value2) {
            addCriterion("tbps_address between", value1, value2, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsAddressNotBetween(String value1, String value2) {
            addCriterion("tbps_address not between", value1, value2, "tbpsAddress");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeIsNull() {
            addCriterion("tbps_longitude is null");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeIsNotNull() {
            addCriterion("tbps_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeEqualTo(Double value) {
            addCriterion("tbps_longitude =", value, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeNotEqualTo(Double value) {
            addCriterion("tbps_longitude <>", value, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeGreaterThan(Double value) {
            addCriterion("tbps_longitude >", value, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbps_longitude >=", value, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeLessThan(Double value) {
            addCriterion("tbps_longitude <", value, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("tbps_longitude <=", value, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeIn(List<Double> values) {
            addCriterion("tbps_longitude in", values, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeNotIn(List<Double> values) {
            addCriterion("tbps_longitude not in", values, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeBetween(Double value1, Double value2) {
            addCriterion("tbps_longitude between", value1, value2, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("tbps_longitude not between", value1, value2, "tbpsLongitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeIsNull() {
            addCriterion("tbps_latitude is null");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeIsNotNull() {
            addCriterion("tbps_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeEqualTo(Double value) {
            addCriterion("tbps_latitude =", value, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeNotEqualTo(Double value) {
            addCriterion("tbps_latitude <>", value, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeGreaterThan(Double value) {
            addCriterion("tbps_latitude >", value, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("tbps_latitude >=", value, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeLessThan(Double value) {
            addCriterion("tbps_latitude <", value, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("tbps_latitude <=", value, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeIn(List<Double> values) {
            addCriterion("tbps_latitude in", values, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeNotIn(List<Double> values) {
            addCriterion("tbps_latitude not in", values, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeBetween(Double value1, Double value2) {
            addCriterion("tbps_latitude between", value1, value2, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("tbps_latitude not between", value1, value2, "tbpsLatitude");
            return (Criteria) this;
        }

        public Criteria andTbpsFastIsNull() {
            addCriterion("tbps_fast is null");
            return (Criteria) this;
        }

        public Criteria andTbpsFastIsNotNull() {
            addCriterion("tbps_fast is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsFastEqualTo(Integer value) {
            addCriterion("tbps_fast =", value, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastNotEqualTo(Integer value) {
            addCriterion("tbps_fast <>", value, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastGreaterThan(Integer value) {
            addCriterion("tbps_fast >", value, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbps_fast >=", value, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastLessThan(Integer value) {
            addCriterion("tbps_fast <", value, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastLessThanOrEqualTo(Integer value) {
            addCriterion("tbps_fast <=", value, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastIn(List<Integer> values) {
            addCriterion("tbps_fast in", values, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastNotIn(List<Integer> values) {
            addCriterion("tbps_fast not in", values, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastBetween(Integer value1, Integer value2) {
            addCriterion("tbps_fast between", value1, value2, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsFastNotBetween(Integer value1, Integer value2) {
            addCriterion("tbps_fast not between", value1, value2, "tbpsFast");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowIsNull() {
            addCriterion("tbps_slow is null");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowIsNotNull() {
            addCriterion("tbps_slow is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowEqualTo(Integer value) {
            addCriterion("tbps_slow =", value, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowNotEqualTo(Integer value) {
            addCriterion("tbps_slow <>", value, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowGreaterThan(Integer value) {
            addCriterion("tbps_slow >", value, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbps_slow >=", value, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowLessThan(Integer value) {
            addCriterion("tbps_slow <", value, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowLessThanOrEqualTo(Integer value) {
            addCriterion("tbps_slow <=", value, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowIn(List<Integer> values) {
            addCriterion("tbps_slow in", values, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowNotIn(List<Integer> values) {
            addCriterion("tbps_slow not in", values, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowBetween(Integer value1, Integer value2) {
            addCriterion("tbps_slow between", value1, value2, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsSlowNotBetween(Integer value1, Integer value2) {
            addCriterion("tbps_slow not between", value1, value2, "tbpsSlow");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonIsNull() {
            addCriterion("tbps_person is null");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonIsNotNull() {
            addCriterion("tbps_person is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonEqualTo(String value) {
            addCriterion("tbps_person =", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonNotEqualTo(String value) {
            addCriterion("tbps_person <>", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonGreaterThan(String value) {
            addCriterion("tbps_person >", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_person >=", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonLessThan(String value) {
            addCriterion("tbps_person <", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonLessThanOrEqualTo(String value) {
            addCriterion("tbps_person <=", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonLike(String value) {
            addCriterion("tbps_person like", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonNotLike(String value) {
            addCriterion("tbps_person not like", value, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonIn(List<String> values) {
            addCriterion("tbps_person in", values, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonNotIn(List<String> values) {
            addCriterion("tbps_person not in", values, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonBetween(String value1, String value2) {
            addCriterion("tbps_person between", value1, value2, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsPersonNotBetween(String value1, String value2) {
            addCriterion("tbps_person not between", value1, value2, "tbpsPerson");
            return (Criteria) this;
        }

        public Criteria andTbpsTelIsNull() {
            addCriterion("tbps_tel is null");
            return (Criteria) this;
        }

        public Criteria andTbpsTelIsNotNull() {
            addCriterion("tbps_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsTelEqualTo(String value) {
            addCriterion("tbps_tel =", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelNotEqualTo(String value) {
            addCriterion("tbps_tel <>", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelGreaterThan(String value) {
            addCriterion("tbps_tel >", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_tel >=", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelLessThan(String value) {
            addCriterion("tbps_tel <", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelLessThanOrEqualTo(String value) {
            addCriterion("tbps_tel <=", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelLike(String value) {
            addCriterion("tbps_tel like", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelNotLike(String value) {
            addCriterion("tbps_tel not like", value, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelIn(List<String> values) {
            addCriterion("tbps_tel in", values, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelNotIn(List<String> values) {
            addCriterion("tbps_tel not in", values, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelBetween(String value1, String value2) {
            addCriterion("tbps_tel between", value1, value2, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTelNotBetween(String value1, String value2) {
            addCriterion("tbps_tel not between", value1, value2, "tbpsTel");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescIsNull() {
            addCriterion("tbps_time_desc is null");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescIsNotNull() {
            addCriterion("tbps_time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescEqualTo(String value) {
            addCriterion("tbps_time_desc =", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescNotEqualTo(String value) {
            addCriterion("tbps_time_desc <>", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescGreaterThan(String value) {
            addCriterion("tbps_time_desc >", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_time_desc >=", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescLessThan(String value) {
            addCriterion("tbps_time_desc <", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescLessThanOrEqualTo(String value) {
            addCriterion("tbps_time_desc <=", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescLike(String value) {
            addCriterion("tbps_time_desc like", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescNotLike(String value) {
            addCriterion("tbps_time_desc not like", value, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescIn(List<String> values) {
            addCriterion("tbps_time_desc in", values, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescNotIn(List<String> values) {
            addCriterion("tbps_time_desc not in", values, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescBetween(String value1, String value2) {
            addCriterion("tbps_time_desc between", value1, value2, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsTimeDescNotBetween(String value1, String value2) {
            addCriterion("tbps_time_desc not between", value1, value2, "tbpsTimeDesc");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerIsNull() {
            addCriterion("tbps_fee_server is null");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerIsNotNull() {
            addCriterion("tbps_fee_server is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerEqualTo(String value) {
            addCriterion("tbps_fee_server =", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerNotEqualTo(String value) {
            addCriterion("tbps_fee_server <>", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerGreaterThan(String value) {
            addCriterion("tbps_fee_server >", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_fee_server >=", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerLessThan(String value) {
            addCriterion("tbps_fee_server <", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerLessThanOrEqualTo(String value) {
            addCriterion("tbps_fee_server <=", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerLike(String value) {
            addCriterion("tbps_fee_server like", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerNotLike(String value) {
            addCriterion("tbps_fee_server not like", value, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerIn(List<String> values) {
            addCriterion("tbps_fee_server in", values, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerNotIn(List<String> values) {
            addCriterion("tbps_fee_server not in", values, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerBetween(String value1, String value2) {
            addCriterion("tbps_fee_server between", value1, value2, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeServerNotBetween(String value1, String value2) {
            addCriterion("tbps_fee_server not between", value1, value2, "tbpsFeeServer");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkIsNull() {
            addCriterion("tbps_fee_park is null");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkIsNotNull() {
            addCriterion("tbps_fee_park is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkEqualTo(String value) {
            addCriterion("tbps_fee_park =", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkNotEqualTo(String value) {
            addCriterion("tbps_fee_park <>", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkGreaterThan(String value) {
            addCriterion("tbps_fee_park >", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_fee_park >=", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkLessThan(String value) {
            addCriterion("tbps_fee_park <", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkLessThanOrEqualTo(String value) {
            addCriterion("tbps_fee_park <=", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkLike(String value) {
            addCriterion("tbps_fee_park like", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkNotLike(String value) {
            addCriterion("tbps_fee_park not like", value, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkIn(List<String> values) {
            addCriterion("tbps_fee_park in", values, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkNotIn(List<String> values) {
            addCriterion("tbps_fee_park not in", values, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkBetween(String value1, String value2) {
            addCriterion("tbps_fee_park between", value1, value2, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsFeeParkNotBetween(String value1, String value2) {
            addCriterion("tbps_fee_park not between", value1, value2, "tbpsFeePark");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileIsNull() {
            addCriterion("tbps_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileIsNotNull() {
            addCriterion("tbps_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileEqualTo(String value) {
            addCriterion("tbps_profile =", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileNotEqualTo(String value) {
            addCriterion("tbps_profile <>", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileGreaterThan(String value) {
            addCriterion("tbps_profile >", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_profile >=", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileLessThan(String value) {
            addCriterion("tbps_profile <", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileLessThanOrEqualTo(String value) {
            addCriterion("tbps_profile <=", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileLike(String value) {
            addCriterion("tbps_profile like", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileNotLike(String value) {
            addCriterion("tbps_profile not like", value, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileIn(List<String> values) {
            addCriterion("tbps_profile in", values, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileNotIn(List<String> values) {
            addCriterion("tbps_profile not in", values, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileBetween(String value1, String value2) {
            addCriterion("tbps_profile between", value1, value2, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsProfileNotBetween(String value1, String value2) {
            addCriterion("tbps_profile not between", value1, value2, "tbpsProfile");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkIsNull() {
            addCriterion("tbps_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkIsNotNull() {
            addCriterion("tbps_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkEqualTo(String value) {
            addCriterion("tbps_remark =", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkNotEqualTo(String value) {
            addCriterion("tbps_remark <>", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkGreaterThan(String value) {
            addCriterion("tbps_remark >", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbps_remark >=", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkLessThan(String value) {
            addCriterion("tbps_remark <", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbps_remark <=", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkLike(String value) {
            addCriterion("tbps_remark like", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkNotLike(String value) {
            addCriterion("tbps_remark not like", value, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkIn(List<String> values) {
            addCriterion("tbps_remark in", values, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkNotIn(List<String> values) {
            addCriterion("tbps_remark not in", values, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkBetween(String value1, String value2) {
            addCriterion("tbps_remark between", value1, value2, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsRemarkNotBetween(String value1, String value2) {
            addCriterion("tbps_remark not between", value1, value2, "tbpsRemark");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeIsNull() {
            addCriterion("tbps_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeIsNotNull() {
            addCriterion("tbps_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeEqualTo(Date value) {
            addCriterion("tbps_update_time =", value, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbps_update_time <>", value, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeGreaterThan(Date value) {
            addCriterion("tbps_update_time >", value, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbps_update_time >=", value, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeLessThan(Date value) {
            addCriterion("tbps_update_time <", value, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbps_update_time <=", value, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeIn(List<Date> values) {
            addCriterion("tbps_update_time in", values, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbps_update_time not in", values, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbps_update_time between", value1, value2, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbps_update_time not between", value1, value2, "tbpsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeIsNull() {
            addCriterion("tbps_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeIsNotNull() {
            addCriterion("tbps_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeEqualTo(Date value) {
            addCriterion("tbps_add_time =", value, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeNotEqualTo(Date value) {
            addCriterion("tbps_add_time <>", value, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeGreaterThan(Date value) {
            addCriterion("tbps_add_time >", value, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbps_add_time >=", value, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeLessThan(Date value) {
            addCriterion("tbps_add_time <", value, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbps_add_time <=", value, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeIn(List<Date> values) {
            addCriterion("tbps_add_time in", values, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeNotIn(List<Date> values) {
            addCriterion("tbps_add_time not in", values, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbps_add_time between", value1, value2, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbps_add_time not between", value1, value2, "tbpsAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusIsNull() {
            addCriterion("tbps_status is null");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusIsNotNull() {
            addCriterion("tbps_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusEqualTo(Short value) {
            addCriterion("tbps_status =", value, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusNotEqualTo(Short value) {
            addCriterion("tbps_status <>", value, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusGreaterThan(Short value) {
            addCriterion("tbps_status >", value, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbps_status >=", value, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusLessThan(Short value) {
            addCriterion("tbps_status <", value, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbps_status <=", value, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusIn(List<Short> values) {
            addCriterion("tbps_status in", values, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusNotIn(List<Short> values) {
            addCriterion("tbps_status not in", values, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusBetween(Short value1, Short value2) {
            addCriterion("tbps_status between", value1, value2, "tbpsStatus");
            return (Criteria) this;
        }

        public Criteria andTbpsStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbps_status not between", value1, value2, "tbpsStatus");
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