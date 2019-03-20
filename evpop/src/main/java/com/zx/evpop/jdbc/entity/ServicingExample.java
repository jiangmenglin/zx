package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicingExample() {
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

        public Criteria andTbsIdIsNull() {
            addCriterion("tbs_id is null");
            return (Criteria) this;
        }

        public Criteria andTbsIdIsNotNull() {
            addCriterion("tbs_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbsIdEqualTo(Long value) {
            addCriterion("tbs_id =", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotEqualTo(Long value) {
            addCriterion("tbs_id <>", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdGreaterThan(Long value) {
            addCriterion("tbs_id >", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbs_id >=", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdLessThan(Long value) {
            addCriterion("tbs_id <", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdLessThanOrEqualTo(Long value) {
            addCriterion("tbs_id <=", value, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdIn(List<Long> values) {
            addCriterion("tbs_id in", values, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotIn(List<Long> values) {
            addCriterion("tbs_id not in", values, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdBetween(Long value1, Long value2) {
            addCriterion("tbs_id between", value1, value2, "tbsId");
            return (Criteria) this;
        }

        public Criteria andTbsIdNotBetween(Long value1, Long value2) {
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

        public Criteria andTbsHostEqualTo(Long value) {
            addCriterion("tbs_host =", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotEqualTo(Long value) {
            addCriterion("tbs_host <>", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostGreaterThan(Long value) {
            addCriterion("tbs_host >", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbs_host >=", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostLessThan(Long value) {
            addCriterion("tbs_host <", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostLessThanOrEqualTo(Long value) {
            addCriterion("tbs_host <=", value, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostIn(List<Long> values) {
            addCriterion("tbs_host in", values, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotIn(List<Long> values) {
            addCriterion("tbs_host not in", values, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostBetween(Long value1, Long value2) {
            addCriterion("tbs_host between", value1, value2, "tbsHost");
            return (Criteria) this;
        }

        public Criteria andTbsHostNotBetween(Long value1, Long value2) {
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

        public Criteria andTbsCarEqualTo(Long value) {
            addCriterion("tbs_car =", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotEqualTo(Long value) {
            addCriterion("tbs_car <>", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarGreaterThan(Long value) {
            addCriterion("tbs_car >", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbs_car >=", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarLessThan(Long value) {
            addCriterion("tbs_car <", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarLessThanOrEqualTo(Long value) {
            addCriterion("tbs_car <=", value, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarIn(List<Long> values) {
            addCriterion("tbs_car in", values, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotIn(List<Long> values) {
            addCriterion("tbs_car not in", values, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarBetween(Long value1, Long value2) {
            addCriterion("tbs_car between", value1, value2, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsCarNotBetween(Long value1, Long value2) {
            addCriterion("tbs_car not between", value1, value2, "tbsCar");
            return (Criteria) this;
        }

        public Criteria andTbsTypeIsNull() {
            addCriterion("tbs_type is null");
            return (Criteria) this;
        }

        public Criteria andTbsTypeIsNotNull() {
            addCriterion("tbs_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbsTypeEqualTo(Byte value) {
            addCriterion("tbs_type =", value, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeNotEqualTo(Byte value) {
            addCriterion("tbs_type <>", value, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeGreaterThan(Byte value) {
            addCriterion("tbs_type >", value, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbs_type >=", value, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeLessThan(Byte value) {
            addCriterion("tbs_type <", value, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbs_type <=", value, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeIn(List<Byte> values) {
            addCriterion("tbs_type in", values, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeNotIn(List<Byte> values) {
            addCriterion("tbs_type not in", values, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbs_type between", value1, value2, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbs_type not between", value1, value2, "tbsType");
            return (Criteria) this;
        }

        public Criteria andTbsUserIsNull() {
            addCriterion("tbs_user is null");
            return (Criteria) this;
        }

        public Criteria andTbsUserIsNotNull() {
            addCriterion("tbs_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbsUserEqualTo(Long value) {
            addCriterion("tbs_user =", value, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserNotEqualTo(Long value) {
            addCriterion("tbs_user <>", value, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserGreaterThan(Long value) {
            addCriterion("tbs_user >", value, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbs_user >=", value, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserLessThan(Long value) {
            addCriterion("tbs_user <", value, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserLessThanOrEqualTo(Long value) {
            addCriterion("tbs_user <=", value, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserIn(List<Long> values) {
            addCriterion("tbs_user in", values, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserNotIn(List<Long> values) {
            addCriterion("tbs_user not in", values, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserBetween(Long value1, Long value2) {
            addCriterion("tbs_user between", value1, value2, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsUserNotBetween(Long value1, Long value2) {
            addCriterion("tbs_user not between", value1, value2, "tbsUser");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanIsNull() {
            addCriterion("tbs_outclean is null");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanIsNotNull() {
            addCriterion("tbs_outclean is not null");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanEqualTo(Short value) {
            addCriterion("tbs_outclean =", value, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanNotEqualTo(Short value) {
            addCriterion("tbs_outclean <>", value, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanGreaterThan(Short value) {
            addCriterion("tbs_outclean >", value, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_outclean >=", value, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanLessThan(Short value) {
            addCriterion("tbs_outclean <", value, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanLessThanOrEqualTo(Short value) {
            addCriterion("tbs_outclean <=", value, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanIn(List<Short> values) {
            addCriterion("tbs_outclean in", values, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanNotIn(List<Short> values) {
            addCriterion("tbs_outclean not in", values, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanBetween(Short value1, Short value2) {
            addCriterion("tbs_outclean between", value1, value2, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsOutcleanNotBetween(Short value1, Short value2) {
            addCriterion("tbs_outclean not between", value1, value2, "tbsOutclean");
            return (Criteria) this;
        }

        public Criteria andTbsStickerIsNull() {
            addCriterion("tbs_sticker is null");
            return (Criteria) this;
        }

        public Criteria andTbsStickerIsNotNull() {
            addCriterion("tbs_sticker is not null");
            return (Criteria) this;
        }

        public Criteria andTbsStickerEqualTo(Short value) {
            addCriterion("tbs_sticker =", value, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerNotEqualTo(Short value) {
            addCriterion("tbs_sticker <>", value, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerGreaterThan(Short value) {
            addCriterion("tbs_sticker >", value, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_sticker >=", value, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerLessThan(Short value) {
            addCriterion("tbs_sticker <", value, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerLessThanOrEqualTo(Short value) {
            addCriterion("tbs_sticker <=", value, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerIn(List<Short> values) {
            addCriterion("tbs_sticker in", values, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerNotIn(List<Short> values) {
            addCriterion("tbs_sticker not in", values, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerBetween(Short value1, Short value2) {
            addCriterion("tbs_sticker between", value1, value2, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsStickerNotBetween(Short value1, Short value2) {
            addCriterion("tbs_sticker not between", value1, value2, "tbsSticker");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureIsNull() {
            addCriterion("tbs_tirepressure is null");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureIsNotNull() {
            addCriterion("tbs_tirepressure is not null");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureEqualTo(Short value) {
            addCriterion("tbs_tirepressure =", value, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureNotEqualTo(Short value) {
            addCriterion("tbs_tirepressure <>", value, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureGreaterThan(Short value) {
            addCriterion("tbs_tirepressure >", value, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_tirepressure >=", value, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureLessThan(Short value) {
            addCriterion("tbs_tirepressure <", value, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureLessThanOrEqualTo(Short value) {
            addCriterion("tbs_tirepressure <=", value, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureIn(List<Short> values) {
            addCriterion("tbs_tirepressure in", values, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureNotIn(List<Short> values) {
            addCriterion("tbs_tirepressure not in", values, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureBetween(Short value1, Short value2) {
            addCriterion("tbs_tirepressure between", value1, value2, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsTirepressureNotBetween(Short value1, Short value2) {
            addCriterion("tbs_tirepressure not between", value1, value2, "tbsTirepressure");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesIsNull() {
            addCriterion("tbs_buckles is null");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesIsNotNull() {
            addCriterion("tbs_buckles is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesEqualTo(Short value) {
            addCriterion("tbs_buckles =", value, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesNotEqualTo(Short value) {
            addCriterion("tbs_buckles <>", value, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesGreaterThan(Short value) {
            addCriterion("tbs_buckles >", value, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_buckles >=", value, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesLessThan(Short value) {
            addCriterion("tbs_buckles <", value, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesLessThanOrEqualTo(Short value) {
            addCriterion("tbs_buckles <=", value, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesIn(List<Short> values) {
            addCriterion("tbs_buckles in", values, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesNotIn(List<Short> values) {
            addCriterion("tbs_buckles not in", values, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesBetween(Short value1, Short value2) {
            addCriterion("tbs_buckles between", value1, value2, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsBucklesNotBetween(Short value1, Short value2) {
            addCriterion("tbs_buckles not between", value1, value2, "tbsBuckles");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellIsNull() {
            addCriterion("tbs_nosmell is null");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellIsNotNull() {
            addCriterion("tbs_nosmell is not null");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellEqualTo(Short value) {
            addCriterion("tbs_nosmell =", value, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellNotEqualTo(Short value) {
            addCriterion("tbs_nosmell <>", value, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellGreaterThan(Short value) {
            addCriterion("tbs_nosmell >", value, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_nosmell >=", value, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellLessThan(Short value) {
            addCriterion("tbs_nosmell <", value, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellLessThanOrEqualTo(Short value) {
            addCriterion("tbs_nosmell <=", value, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellIn(List<Short> values) {
            addCriterion("tbs_nosmell in", values, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellNotIn(List<Short> values) {
            addCriterion("tbs_nosmell not in", values, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellBetween(Short value1, Short value2) {
            addCriterion("tbs_nosmell between", value1, value2, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsNosmellNotBetween(Short value1, Short value2) {
            addCriterion("tbs_nosmell not between", value1, value2, "tbsNosmell");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanIsNull() {
            addCriterion("tbs_inclean is null");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanIsNotNull() {
            addCriterion("tbs_inclean is not null");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanEqualTo(Short value) {
            addCriterion("tbs_inclean =", value, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanNotEqualTo(Short value) {
            addCriterion("tbs_inclean <>", value, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanGreaterThan(Short value) {
            addCriterion("tbs_inclean >", value, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_inclean >=", value, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanLessThan(Short value) {
            addCriterion("tbs_inclean <", value, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanLessThanOrEqualTo(Short value) {
            addCriterion("tbs_inclean <=", value, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanIn(List<Short> values) {
            addCriterion("tbs_inclean in", values, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanNotIn(List<Short> values) {
            addCriterion("tbs_inclean not in", values, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanBetween(Short value1, Short value2) {
            addCriterion("tbs_inclean between", value1, value2, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsIncleanNotBetween(Short value1, Short value2) {
            addCriterion("tbs_inclean not between", value1, value2, "tbsInclean");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseIsNull() {
            addCriterion("tbs_vehiclelicense is null");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseIsNotNull() {
            addCriterion("tbs_vehiclelicense is not null");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseEqualTo(Short value) {
            addCriterion("tbs_vehiclelicense =", value, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseNotEqualTo(Short value) {
            addCriterion("tbs_vehiclelicense <>", value, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseGreaterThan(Short value) {
            addCriterion("tbs_vehiclelicense >", value, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_vehiclelicense >=", value, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseLessThan(Short value) {
            addCriterion("tbs_vehiclelicense <", value, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseLessThanOrEqualTo(Short value) {
            addCriterion("tbs_vehiclelicense <=", value, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseIn(List<Short> values) {
            addCriterion("tbs_vehiclelicense in", values, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseNotIn(List<Short> values) {
            addCriterion("tbs_vehiclelicense not in", values, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseBetween(Short value1, Short value2) {
            addCriterion("tbs_vehiclelicense between", value1, value2, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsVehiclelicenseNotBetween(Short value1, Short value2) {
            addCriterion("tbs_vehiclelicense not between", value1, value2, "tbsVehiclelicense");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandIsNull() {
            addCriterion("tbs_trianglebrand is null");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandIsNotNull() {
            addCriterion("tbs_trianglebrand is not null");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandEqualTo(Short value) {
            addCriterion("tbs_trianglebrand =", value, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandNotEqualTo(Short value) {
            addCriterion("tbs_trianglebrand <>", value, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandGreaterThan(Short value) {
            addCriterion("tbs_trianglebrand >", value, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_trianglebrand >=", value, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandLessThan(Short value) {
            addCriterion("tbs_trianglebrand <", value, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandLessThanOrEqualTo(Short value) {
            addCriterion("tbs_trianglebrand <=", value, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandIn(List<Short> values) {
            addCriterion("tbs_trianglebrand in", values, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandNotIn(List<Short> values) {
            addCriterion("tbs_trianglebrand not in", values, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandBetween(Short value1, Short value2) {
            addCriterion("tbs_trianglebrand between", value1, value2, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsTrianglebrandNotBetween(Short value1, Short value2) {
            addCriterion("tbs_trianglebrand not between", value1, value2, "tbsTrianglebrand");
            return (Criteria) this;
        }

        public Criteria andTbsMastIsNull() {
            addCriterion("tbs_mast is null");
            return (Criteria) this;
        }

        public Criteria andTbsMastIsNotNull() {
            addCriterion("tbs_mast is not null");
            return (Criteria) this;
        }

        public Criteria andTbsMastEqualTo(Short value) {
            addCriterion("tbs_mast =", value, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastNotEqualTo(Short value) {
            addCriterion("tbs_mast <>", value, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastGreaterThan(Short value) {
            addCriterion("tbs_mast >", value, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_mast >=", value, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastLessThan(Short value) {
            addCriterion("tbs_mast <", value, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastLessThanOrEqualTo(Short value) {
            addCriterion("tbs_mast <=", value, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastIn(List<Short> values) {
            addCriterion("tbs_mast in", values, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastNotIn(List<Short> values) {
            addCriterion("tbs_mast not in", values, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastBetween(Short value1, Short value2) {
            addCriterion("tbs_mast between", value1, value2, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsMastNotBetween(Short value1, Short value2) {
            addCriterion("tbs_mast not between", value1, value2, "tbsMast");
            return (Criteria) this;
        }

        public Criteria andTbsAirIsNull() {
            addCriterion("tbs_air is null");
            return (Criteria) this;
        }

        public Criteria andTbsAirIsNotNull() {
            addCriterion("tbs_air is not null");
            return (Criteria) this;
        }

        public Criteria andTbsAirEqualTo(Short value) {
            addCriterion("tbs_air =", value, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirNotEqualTo(Short value) {
            addCriterion("tbs_air <>", value, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirGreaterThan(Short value) {
            addCriterion("tbs_air >", value, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_air >=", value, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirLessThan(Short value) {
            addCriterion("tbs_air <", value, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirLessThanOrEqualTo(Short value) {
            addCriterion("tbs_air <=", value, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirIn(List<Short> values) {
            addCriterion("tbs_air in", values, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirNotIn(List<Short> values) {
            addCriterion("tbs_air not in", values, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirBetween(Short value1, Short value2) {
            addCriterion("tbs_air between", value1, value2, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsAirNotBetween(Short value1, Short value2) {
            addCriterion("tbs_air not between", value1, value2, "tbsAir");
            return (Criteria) this;
        }

        public Criteria andTbsSeatIsNull() {
            addCriterion("tbs_seat is null");
            return (Criteria) this;
        }

        public Criteria andTbsSeatIsNotNull() {
            addCriterion("tbs_seat is not null");
            return (Criteria) this;
        }

        public Criteria andTbsSeatEqualTo(Short value) {
            addCriterion("tbs_seat =", value, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatNotEqualTo(Short value) {
            addCriterion("tbs_seat <>", value, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatGreaterThan(Short value) {
            addCriterion("tbs_seat >", value, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_seat >=", value, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatLessThan(Short value) {
            addCriterion("tbs_seat <", value, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatLessThanOrEqualTo(Short value) {
            addCriterion("tbs_seat <=", value, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatIn(List<Short> values) {
            addCriterion("tbs_seat in", values, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatNotIn(List<Short> values) {
            addCriterion("tbs_seat not in", values, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatBetween(Short value1, Short value2) {
            addCriterion("tbs_seat between", value1, value2, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsSeatNotBetween(Short value1, Short value2) {
            addCriterion("tbs_seat not between", value1, value2, "tbsSeat");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorIsNull() {
            addCriterion("tbs_mirror is null");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorIsNotNull() {
            addCriterion("tbs_mirror is not null");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorEqualTo(Short value) {
            addCriterion("tbs_mirror =", value, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorNotEqualTo(Short value) {
            addCriterion("tbs_mirror <>", value, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorGreaterThan(Short value) {
            addCriterion("tbs_mirror >", value, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_mirror >=", value, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorLessThan(Short value) {
            addCriterion("tbs_mirror <", value, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorLessThanOrEqualTo(Short value) {
            addCriterion("tbs_mirror <=", value, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorIn(List<Short> values) {
            addCriterion("tbs_mirror in", values, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorNotIn(List<Short> values) {
            addCriterion("tbs_mirror not in", values, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorBetween(Short value1, Short value2) {
            addCriterion("tbs_mirror between", value1, value2, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsMirrorNotBetween(Short value1, Short value2) {
            addCriterion("tbs_mirror not between", value1, value2, "tbsMirror");
            return (Criteria) this;
        }

        public Criteria andTbsWindowIsNull() {
            addCriterion("tbs_window is null");
            return (Criteria) this;
        }

        public Criteria andTbsWindowIsNotNull() {
            addCriterion("tbs_window is not null");
            return (Criteria) this;
        }

        public Criteria andTbsWindowEqualTo(Short value) {
            addCriterion("tbs_window =", value, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowNotEqualTo(Short value) {
            addCriterion("tbs_window <>", value, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowGreaterThan(Short value) {
            addCriterion("tbs_window >", value, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_window >=", value, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowLessThan(Short value) {
            addCriterion("tbs_window <", value, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowLessThanOrEqualTo(Short value) {
            addCriterion("tbs_window <=", value, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowIn(List<Short> values) {
            addCriterion("tbs_window in", values, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowNotIn(List<Short> values) {
            addCriterion("tbs_window not in", values, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowBetween(Short value1, Short value2) {
            addCriterion("tbs_window between", value1, value2, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWindowNotBetween(Short value1, Short value2) {
            addCriterion("tbs_window not between", value1, value2, "tbsWindow");
            return (Criteria) this;
        }

        public Criteria andTbsWiperIsNull() {
            addCriterion("tbs_wiper is null");
            return (Criteria) this;
        }

        public Criteria andTbsWiperIsNotNull() {
            addCriterion("tbs_wiper is not null");
            return (Criteria) this;
        }

        public Criteria andTbsWiperEqualTo(Short value) {
            addCriterion("tbs_wiper =", value, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperNotEqualTo(Short value) {
            addCriterion("tbs_wiper <>", value, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperGreaterThan(Short value) {
            addCriterion("tbs_wiper >", value, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_wiper >=", value, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperLessThan(Short value) {
            addCriterion("tbs_wiper <", value, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperLessThanOrEqualTo(Short value) {
            addCriterion("tbs_wiper <=", value, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperIn(List<Short> values) {
            addCriterion("tbs_wiper in", values, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperNotIn(List<Short> values) {
            addCriterion("tbs_wiper not in", values, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperBetween(Short value1, Short value2) {
            addCriterion("tbs_wiper between", value1, value2, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsWiperNotBetween(Short value1, Short value2) {
            addCriterion("tbs_wiper not between", value1, value2, "tbsWiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperIsNull() {
            addCriterion("tbs_rainwiper is null");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperIsNotNull() {
            addCriterion("tbs_rainwiper is not null");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperEqualTo(Short value) {
            addCriterion("tbs_rainwiper =", value, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperNotEqualTo(Short value) {
            addCriterion("tbs_rainwiper <>", value, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperGreaterThan(Short value) {
            addCriterion("tbs_rainwiper >", value, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_rainwiper >=", value, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperLessThan(Short value) {
            addCriterion("tbs_rainwiper <", value, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperLessThanOrEqualTo(Short value) {
            addCriterion("tbs_rainwiper <=", value, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperIn(List<Short> values) {
            addCriterion("tbs_rainwiper in", values, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperNotIn(List<Short> values) {
            addCriterion("tbs_rainwiper not in", values, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperBetween(Short value1, Short value2) {
            addCriterion("tbs_rainwiper between", value1, value2, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsRainwiperNotBetween(Short value1, Short value2) {
            addCriterion("tbs_rainwiper not between", value1, value2, "tbsRainwiper");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelIsNull() {
            addCriterion("tbs_steeringwheel is null");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelIsNotNull() {
            addCriterion("tbs_steeringwheel is not null");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelEqualTo(Short value) {
            addCriterion("tbs_steeringwheel =", value, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelNotEqualTo(Short value) {
            addCriterion("tbs_steeringwheel <>", value, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelGreaterThan(Short value) {
            addCriterion("tbs_steeringwheel >", value, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_steeringwheel >=", value, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelLessThan(Short value) {
            addCriterion("tbs_steeringwheel <", value, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelLessThanOrEqualTo(Short value) {
            addCriterion("tbs_steeringwheel <=", value, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelIn(List<Short> values) {
            addCriterion("tbs_steeringwheel in", values, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelNotIn(List<Short> values) {
            addCriterion("tbs_steeringwheel not in", values, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelBetween(Short value1, Short value2) {
            addCriterion("tbs_steeringwheel between", value1, value2, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsSteeringwheelNotBetween(Short value1, Short value2) {
            addCriterion("tbs_steeringwheel not between", value1, value2, "tbsSteeringwheel");
            return (Criteria) this;
        }

        public Criteria andTbsLightIsNull() {
            addCriterion("tbs_light is null");
            return (Criteria) this;
        }

        public Criteria andTbsLightIsNotNull() {
            addCriterion("tbs_light is not null");
            return (Criteria) this;
        }

        public Criteria andTbsLightEqualTo(Short value) {
            addCriterion("tbs_light =", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightNotEqualTo(Short value) {
            addCriterion("tbs_light <>", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightGreaterThan(Short value) {
            addCriterion("tbs_light >", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_light >=", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightLessThan(Short value) {
            addCriterion("tbs_light <", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightLessThanOrEqualTo(Short value) {
            addCriterion("tbs_light <=", value, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightIn(List<Short> values) {
            addCriterion("tbs_light in", values, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightNotIn(List<Short> values) {
            addCriterion("tbs_light not in", values, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightBetween(Short value1, Short value2) {
            addCriterion("tbs_light between", value1, value2, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsLightNotBetween(Short value1, Short value2) {
            addCriterion("tbs_light not between", value1, value2, "tbsLight");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeIsNull() {
            addCriterion("tbs_brake is null");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeIsNotNull() {
            addCriterion("tbs_brake is not null");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeEqualTo(Short value) {
            addCriterion("tbs_brake =", value, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeNotEqualTo(Short value) {
            addCriterion("tbs_brake <>", value, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeGreaterThan(Short value) {
            addCriterion("tbs_brake >", value, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_brake >=", value, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeLessThan(Short value) {
            addCriterion("tbs_brake <", value, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeLessThanOrEqualTo(Short value) {
            addCriterion("tbs_brake <=", value, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeIn(List<Short> values) {
            addCriterion("tbs_brake in", values, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeNotIn(List<Short> values) {
            addCriterion("tbs_brake not in", values, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeBetween(Short value1, Short value2) {
            addCriterion("tbs_brake between", value1, value2, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsBrakeNotBetween(Short value1, Short value2) {
            addCriterion("tbs_brake not between", value1, value2, "tbsBrake");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingIsNull() {
            addCriterion("tbs_honking is null");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingIsNotNull() {
            addCriterion("tbs_honking is not null");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingEqualTo(Short value) {
            addCriterion("tbs_honking =", value, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingNotEqualTo(Short value) {
            addCriterion("tbs_honking <>", value, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingGreaterThan(Short value) {
            addCriterion("tbs_honking >", value, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_honking >=", value, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingLessThan(Short value) {
            addCriterion("tbs_honking <", value, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingLessThanOrEqualTo(Short value) {
            addCriterion("tbs_honking <=", value, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingIn(List<Short> values) {
            addCriterion("tbs_honking in", values, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingNotIn(List<Short> values) {
            addCriterion("tbs_honking not in", values, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingBetween(Short value1, Short value2) {
            addCriterion("tbs_honking between", value1, value2, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsHonkingNotBetween(Short value1, Short value2) {
            addCriterion("tbs_honking not between", value1, value2, "tbsHonking");
            return (Criteria) this;
        }

        public Criteria andTbsEcoIsNull() {
            addCriterion("tbs_eco is null");
            return (Criteria) this;
        }

        public Criteria andTbsEcoIsNotNull() {
            addCriterion("tbs_eco is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEcoEqualTo(Short value) {
            addCriterion("tbs_eco =", value, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoNotEqualTo(Short value) {
            addCriterion("tbs_eco <>", value, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoGreaterThan(Short value) {
            addCriterion("tbs_eco >", value, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_eco >=", value, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoLessThan(Short value) {
            addCriterion("tbs_eco <", value, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoLessThanOrEqualTo(Short value) {
            addCriterion("tbs_eco <=", value, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoIn(List<Short> values) {
            addCriterion("tbs_eco in", values, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoNotIn(List<Short> values) {
            addCriterion("tbs_eco not in", values, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoBetween(Short value1, Short value2) {
            addCriterion("tbs_eco between", value1, value2, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsEcoNotBetween(Short value1, Short value2) {
            addCriterion("tbs_eco not between", value1, value2, "tbsEco");
            return (Criteria) this;
        }

        public Criteria andTbsImageIsNull() {
            addCriterion("tbs_image is null");
            return (Criteria) this;
        }

        public Criteria andTbsImageIsNotNull() {
            addCriterion("tbs_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbsImageEqualTo(Short value) {
            addCriterion("tbs_image =", value, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageNotEqualTo(Short value) {
            addCriterion("tbs_image <>", value, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageGreaterThan(Short value) {
            addCriterion("tbs_image >", value, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_image >=", value, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageLessThan(Short value) {
            addCriterion("tbs_image <", value, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageLessThanOrEqualTo(Short value) {
            addCriterion("tbs_image <=", value, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageIn(List<Short> values) {
            addCriterion("tbs_image in", values, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageNotIn(List<Short> values) {
            addCriterion("tbs_image not in", values, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageBetween(Short value1, Short value2) {
            addCriterion("tbs_image between", value1, value2, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsImageNotBetween(Short value1, Short value2) {
            addCriterion("tbs_image not between", value1, value2, "tbsImage");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightIsNull() {
            addCriterion("tbs_notroublelight is null");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightIsNotNull() {
            addCriterion("tbs_notroublelight is not null");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightEqualTo(Short value) {
            addCriterion("tbs_notroublelight =", value, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightNotEqualTo(Short value) {
            addCriterion("tbs_notroublelight <>", value, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightGreaterThan(Short value) {
            addCriterion("tbs_notroublelight >", value, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_notroublelight >=", value, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightLessThan(Short value) {
            addCriterion("tbs_notroublelight <", value, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightLessThanOrEqualTo(Short value) {
            addCriterion("tbs_notroublelight <=", value, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightIn(List<Short> values) {
            addCriterion("tbs_notroublelight in", values, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightNotIn(List<Short> values) {
            addCriterion("tbs_notroublelight not in", values, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightBetween(Short value1, Short value2) {
            addCriterion("tbs_notroublelight between", value1, value2, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsNotroublelightNotBetween(Short value1, Short value2) {
            addCriterion("tbs_notroublelight not between", value1, value2, "tbsNotroublelight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightIsNull() {
            addCriterion("tbs_daylight is null");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightIsNotNull() {
            addCriterion("tbs_daylight is not null");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightEqualTo(Short value) {
            addCriterion("tbs_daylight =", value, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightNotEqualTo(Short value) {
            addCriterion("tbs_daylight <>", value, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightGreaterThan(Short value) {
            addCriterion("tbs_daylight >", value, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_daylight >=", value, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightLessThan(Short value) {
            addCriterion("tbs_daylight <", value, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightLessThanOrEqualTo(Short value) {
            addCriterion("tbs_daylight <=", value, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightIn(List<Short> values) {
            addCriterion("tbs_daylight in", values, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightNotIn(List<Short> values) {
            addCriterion("tbs_daylight not in", values, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightBetween(Short value1, Short value2) {
            addCriterion("tbs_daylight between", value1, value2, "tbsDaylight");
            return (Criteria) this;
        }

        public Criteria andTbsDaylightNotBetween(Short value1, Short value2) {
            addCriterion("tbs_daylight not between", value1, value2, "tbsDaylight");
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

        public Criteria andTbsLogIsNull() {
            addCriterion("tbs_log is null");
            return (Criteria) this;
        }

        public Criteria andTbsLogIsNotNull() {
            addCriterion("tbs_log is not null");
            return (Criteria) this;
        }

        public Criteria andTbsLogEqualTo(String value) {
            addCriterion("tbs_log =", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogNotEqualTo(String value) {
            addCriterion("tbs_log <>", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogGreaterThan(String value) {
            addCriterion("tbs_log >", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogGreaterThanOrEqualTo(String value) {
            addCriterion("tbs_log >=", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogLessThan(String value) {
            addCriterion("tbs_log <", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogLessThanOrEqualTo(String value) {
            addCriterion("tbs_log <=", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogLike(String value) {
            addCriterion("tbs_log like", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogNotLike(String value) {
            addCriterion("tbs_log not like", value, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogIn(List<String> values) {
            addCriterion("tbs_log in", values, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogNotIn(List<String> values) {
            addCriterion("tbs_log not in", values, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogBetween(String value1, String value2) {
            addCriterion("tbs_log between", value1, value2, "tbsLog");
            return (Criteria) this;
        }

        public Criteria andTbsLogNotBetween(String value1, String value2) {
            addCriterion("tbs_log not between", value1, value2, "tbsLog");
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

        public Criteria andTbsStatusEqualTo(Short value) {
            addCriterion("tbs_status =", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusNotEqualTo(Short value) {
            addCriterion("tbs_status <>", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusGreaterThan(Short value) {
            addCriterion("tbs_status >", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbs_status >=", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusLessThan(Short value) {
            addCriterion("tbs_status <", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbs_status <=", value, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusIn(List<Short> values) {
            addCriterion("tbs_status in", values, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusNotIn(List<Short> values) {
            addCriterion("tbs_status not in", values, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusBetween(Short value1, Short value2) {
            addCriterion("tbs_status between", value1, value2, "tbsStatus");
            return (Criteria) this;
        }

        public Criteria andTbsStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbs_status not between", value1, value2, "tbsStatus");
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