package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andTbaIdIsNull() {
            addCriterion("tba_id is null");
            return (Criteria) this;
        }

        public Criteria andTbaIdIsNotNull() {
            addCriterion("tba_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbaIdEqualTo(Integer value) {
            addCriterion("tba_id =", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotEqualTo(Integer value) {
            addCriterion("tba_id <>", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdGreaterThan(Integer value) {
            addCriterion("tba_id >", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_id >=", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdLessThan(Integer value) {
            addCriterion("tba_id <", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tba_id <=", value, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdIn(List<Integer> values) {
            addCriterion("tba_id in", values, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotIn(List<Integer> values) {
            addCriterion("tba_id not in", values, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdBetween(Integer value1, Integer value2) {
            addCriterion("tba_id between", value1, value2, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_id not between", value1, value2, "tbaId");
            return (Criteria) this;
        }

        public Criteria andTbaHostIsNull() {
            addCriterion("tba_host is null");
            return (Criteria) this;
        }

        public Criteria andTbaHostIsNotNull() {
            addCriterion("tba_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbaHostEqualTo(Short value) {
            addCriterion("tba_host =", value, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostNotEqualTo(Short value) {
            addCriterion("tba_host <>", value, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostGreaterThan(Short value) {
            addCriterion("tba_host >", value, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tba_host >=", value, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostLessThan(Short value) {
            addCriterion("tba_host <", value, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostLessThanOrEqualTo(Short value) {
            addCriterion("tba_host <=", value, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostIn(List<Short> values) {
            addCriterion("tba_host in", values, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostNotIn(List<Short> values) {
            addCriterion("tba_host not in", values, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostBetween(Short value1, Short value2) {
            addCriterion("tba_host between", value1, value2, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaHostNotBetween(Short value1, Short value2) {
            addCriterion("tba_host not between", value1, value2, "tbaHost");
            return (Criteria) this;
        }

        public Criteria andTbaNameIsNull() {
            addCriterion("tba_name is null");
            return (Criteria) this;
        }

        public Criteria andTbaNameIsNotNull() {
            addCriterion("tba_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbaNameEqualTo(String value) {
            addCriterion("tba_name =", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotEqualTo(String value) {
            addCriterion("tba_name <>", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameGreaterThan(String value) {
            addCriterion("tba_name >", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tba_name >=", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameLessThan(String value) {
            addCriterion("tba_name <", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameLessThanOrEqualTo(String value) {
            addCriterion("tba_name <=", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameLike(String value) {
            addCriterion("tba_name like", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotLike(String value) {
            addCriterion("tba_name not like", value, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameIn(List<String> values) {
            addCriterion("tba_name in", values, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotIn(List<String> values) {
            addCriterion("tba_name not in", values, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameBetween(String value1, String value2) {
            addCriterion("tba_name between", value1, value2, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaNameNotBetween(String value1, String value2) {
            addCriterion("tba_name not between", value1, value2, "tbaName");
            return (Criteria) this;
        }

        public Criteria andTbaContactIsNull() {
            addCriterion("tba_contact is null");
            return (Criteria) this;
        }

        public Criteria andTbaContactIsNotNull() {
            addCriterion("tba_contact is not null");
            return (Criteria) this;
        }

        public Criteria andTbaContactEqualTo(String value) {
            addCriterion("tba_contact =", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactNotEqualTo(String value) {
            addCriterion("tba_contact <>", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactGreaterThan(String value) {
            addCriterion("tba_contact >", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactGreaterThanOrEqualTo(String value) {
            addCriterion("tba_contact >=", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactLessThan(String value) {
            addCriterion("tba_contact <", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactLessThanOrEqualTo(String value) {
            addCriterion("tba_contact <=", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactLike(String value) {
            addCriterion("tba_contact like", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactNotLike(String value) {
            addCriterion("tba_contact not like", value, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactIn(List<String> values) {
            addCriterion("tba_contact in", values, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactNotIn(List<String> values) {
            addCriterion("tba_contact not in", values, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactBetween(String value1, String value2) {
            addCriterion("tba_contact between", value1, value2, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaContactNotBetween(String value1, String value2) {
            addCriterion("tba_contact not between", value1, value2, "tbaContact");
            return (Criteria) this;
        }

        public Criteria andTbaAddressIsNull() {
            addCriterion("tba_address is null");
            return (Criteria) this;
        }

        public Criteria andTbaAddressIsNotNull() {
            addCriterion("tba_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbaAddressEqualTo(String value) {
            addCriterion("tba_address =", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressNotEqualTo(String value) {
            addCriterion("tba_address <>", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressGreaterThan(String value) {
            addCriterion("tba_address >", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tba_address >=", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressLessThan(String value) {
            addCriterion("tba_address <", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressLessThanOrEqualTo(String value) {
            addCriterion("tba_address <=", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressLike(String value) {
            addCriterion("tba_address like", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressNotLike(String value) {
            addCriterion("tba_address not like", value, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressIn(List<String> values) {
            addCriterion("tba_address in", values, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressNotIn(List<String> values) {
            addCriterion("tba_address not in", values, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressBetween(String value1, String value2) {
            addCriterion("tba_address between", value1, value2, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaAddressNotBetween(String value1, String value2) {
            addCriterion("tba_address not between", value1, value2, "tbaAddress");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountIsNull() {
            addCriterion("tba_pos_count is null");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountIsNotNull() {
            addCriterion("tba_pos_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountEqualTo(Integer value) {
            addCriterion("tba_pos_count =", value, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountNotEqualTo(Integer value) {
            addCriterion("tba_pos_count <>", value, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountGreaterThan(Integer value) {
            addCriterion("tba_pos_count >", value, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_pos_count >=", value, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountLessThan(Integer value) {
            addCriterion("tba_pos_count <", value, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountLessThanOrEqualTo(Integer value) {
            addCriterion("tba_pos_count <=", value, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountIn(List<Integer> values) {
            addCriterion("tba_pos_count in", values, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountNotIn(List<Integer> values) {
            addCriterion("tba_pos_count not in", values, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountBetween(Integer value1, Integer value2) {
            addCriterion("tba_pos_count between", value1, value2, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaPosCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_pos_count not between", value1, value2, "tbaPosCount");
            return (Criteria) this;
        }

        public Criteria andTbaLonIsNull() {
            addCriterion("tba_lon is null");
            return (Criteria) this;
        }

        public Criteria andTbaLonIsNotNull() {
            addCriterion("tba_lon is not null");
            return (Criteria) this;
        }

        public Criteria andTbaLonEqualTo(BigDecimal value) {
            addCriterion("tba_lon =", value, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonNotEqualTo(BigDecimal value) {
            addCriterion("tba_lon <>", value, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonGreaterThan(BigDecimal value) {
            addCriterion("tba_lon >", value, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_lon >=", value, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonLessThan(BigDecimal value) {
            addCriterion("tba_lon <", value, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_lon <=", value, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonIn(List<BigDecimal> values) {
            addCriterion("tba_lon in", values, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonNotIn(List<BigDecimal> values) {
            addCriterion("tba_lon not in", values, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_lon between", value1, value2, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_lon not between", value1, value2, "tbaLon");
            return (Criteria) this;
        }

        public Criteria andTbaLatIsNull() {
            addCriterion("tba_lat is null");
            return (Criteria) this;
        }

        public Criteria andTbaLatIsNotNull() {
            addCriterion("tba_lat is not null");
            return (Criteria) this;
        }

        public Criteria andTbaLatEqualTo(BigDecimal value) {
            addCriterion("tba_lat =", value, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatNotEqualTo(BigDecimal value) {
            addCriterion("tba_lat <>", value, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatGreaterThan(BigDecimal value) {
            addCriterion("tba_lat >", value, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_lat >=", value, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatLessThan(BigDecimal value) {
            addCriterion("tba_lat <", value, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tba_lat <=", value, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatIn(List<BigDecimal> values) {
            addCriterion("tba_lat in", values, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatNotIn(List<BigDecimal> values) {
            addCriterion("tba_lat not in", values, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_lat between", value1, value2, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tba_lat not between", value1, value2, "tbaLat");
            return (Criteria) this;
        }

        public Criteria andTbaRangeIsNull() {
            addCriterion("tba_range is null");
            return (Criteria) this;
        }

        public Criteria andTbaRangeIsNotNull() {
            addCriterion("tba_range is not null");
            return (Criteria) this;
        }

        public Criteria andTbaRangeEqualTo(String value) {
            addCriterion("tba_range =", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeNotEqualTo(String value) {
            addCriterion("tba_range <>", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeGreaterThan(String value) {
            addCriterion("tba_range >", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeGreaterThanOrEqualTo(String value) {
            addCriterion("tba_range >=", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeLessThan(String value) {
            addCriterion("tba_range <", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeLessThanOrEqualTo(String value) {
            addCriterion("tba_range <=", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeLike(String value) {
            addCriterion("tba_range like", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeNotLike(String value) {
            addCriterion("tba_range not like", value, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeIn(List<String> values) {
            addCriterion("tba_range in", values, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeNotIn(List<String> values) {
            addCriterion("tba_range not in", values, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeBetween(String value1, String value2) {
            addCriterion("tba_range between", value1, value2, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaRangeNotBetween(String value1, String value2) {
            addCriterion("tba_range not between", value1, value2, "tbaRange");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIsNull() {
            addCriterion("tba_status is null");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIsNotNull() {
            addCriterion("tba_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbaStatusEqualTo(Byte value) {
            addCriterion("tba_status =", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotEqualTo(Byte value) {
            addCriterion("tba_status <>", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusGreaterThan(Byte value) {
            addCriterion("tba_status >", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tba_status >=", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusLessThan(Byte value) {
            addCriterion("tba_status <", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tba_status <=", value, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusIn(List<Byte> values) {
            addCriterion("tba_status in", values, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotIn(List<Byte> values) {
            addCriterion("tba_status not in", values, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusBetween(Byte value1, Byte value2) {
            addCriterion("tba_status between", value1, value2, "tbaStatus");
            return (Criteria) this;
        }

        public Criteria andTbaStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tba_status not between", value1, value2, "tbaStatus");
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