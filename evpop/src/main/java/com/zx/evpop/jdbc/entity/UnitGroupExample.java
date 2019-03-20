package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitGroupExample() {
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

        public Criteria andTbugIdIsNull() {
            addCriterion("tbug_id is null");
            return (Criteria) this;
        }

        public Criteria andTbugIdIsNotNull() {
            addCriterion("tbug_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbugIdEqualTo(Integer value) {
            addCriterion("tbug_id =", value, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdNotEqualTo(Integer value) {
            addCriterion("tbug_id <>", value, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdGreaterThan(Integer value) {
            addCriterion("tbug_id >", value, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbug_id >=", value, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdLessThan(Integer value) {
            addCriterion("tbug_id <", value, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbug_id <=", value, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdIn(List<Integer> values) {
            addCriterion("tbug_id in", values, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdNotIn(List<Integer> values) {
            addCriterion("tbug_id not in", values, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdBetween(Integer value1, Integer value2) {
            addCriterion("tbug_id between", value1, value2, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbug_id not between", value1, value2, "tbugId");
            return (Criteria) this;
        }

        public Criteria andTbugHostIsNull() {
            addCriterion("tbug_host is null");
            return (Criteria) this;
        }

        public Criteria andTbugHostIsNotNull() {
            addCriterion("tbug_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbugHostEqualTo(Short value) {
            addCriterion("tbug_host =", value, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostNotEqualTo(Short value) {
            addCriterion("tbug_host <>", value, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostGreaterThan(Short value) {
            addCriterion("tbug_host >", value, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbug_host >=", value, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostLessThan(Short value) {
            addCriterion("tbug_host <", value, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostLessThanOrEqualTo(Short value) {
            addCriterion("tbug_host <=", value, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostIn(List<Short> values) {
            addCriterion("tbug_host in", values, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostNotIn(List<Short> values) {
            addCriterion("tbug_host not in", values, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostBetween(Short value1, Short value2) {
            addCriterion("tbug_host between", value1, value2, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugHostNotBetween(Short value1, Short value2) {
            addCriterion("tbug_host not between", value1, value2, "tbugHost");
            return (Criteria) this;
        }

        public Criteria andTbugInfoIsNull() {
            addCriterion("tbug_info is null");
            return (Criteria) this;
        }

        public Criteria andTbugInfoIsNotNull() {
            addCriterion("tbug_info is not null");
            return (Criteria) this;
        }

        public Criteria andTbugInfoEqualTo(Integer value) {
            addCriterion("tbug_info =", value, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoNotEqualTo(Integer value) {
            addCriterion("tbug_info <>", value, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoGreaterThan(Integer value) {
            addCriterion("tbug_info >", value, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbug_info >=", value, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoLessThan(Integer value) {
            addCriterion("tbug_info <", value, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoLessThanOrEqualTo(Integer value) {
            addCriterion("tbug_info <=", value, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoIn(List<Integer> values) {
            addCriterion("tbug_info in", values, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoNotIn(List<Integer> values) {
            addCriterion("tbug_info not in", values, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoBetween(Integer value1, Integer value2) {
            addCriterion("tbug_info between", value1, value2, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("tbug_info not between", value1, value2, "tbugInfo");
            return (Criteria) this;
        }

        public Criteria andTbugPersonIsNull() {
            addCriterion("tbug_person is null");
            return (Criteria) this;
        }

        public Criteria andTbugPersonIsNotNull() {
            addCriterion("tbug_person is not null");
            return (Criteria) this;
        }

        public Criteria andTbugPersonEqualTo(Integer value) {
            addCriterion("tbug_person =", value, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonNotEqualTo(Integer value) {
            addCriterion("tbug_person <>", value, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonGreaterThan(Integer value) {
            addCriterion("tbug_person >", value, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbug_person >=", value, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonLessThan(Integer value) {
            addCriterion("tbug_person <", value, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonLessThanOrEqualTo(Integer value) {
            addCriterion("tbug_person <=", value, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonIn(List<Integer> values) {
            addCriterion("tbug_person in", values, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonNotIn(List<Integer> values) {
            addCriterion("tbug_person not in", values, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonBetween(Integer value1, Integer value2) {
            addCriterion("tbug_person between", value1, value2, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("tbug_person not between", value1, value2, "tbugPerson");
            return (Criteria) this;
        }

        public Criteria andTbugNameIsNull() {
            addCriterion("tbug_name is null");
            return (Criteria) this;
        }

        public Criteria andTbugNameIsNotNull() {
            addCriterion("tbug_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbugNameEqualTo(String value) {
            addCriterion("tbug_name =", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameNotEqualTo(String value) {
            addCriterion("tbug_name <>", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameGreaterThan(String value) {
            addCriterion("tbug_name >", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbug_name >=", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameLessThan(String value) {
            addCriterion("tbug_name <", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameLessThanOrEqualTo(String value) {
            addCriterion("tbug_name <=", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameLike(String value) {
            addCriterion("tbug_name like", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameNotLike(String value) {
            addCriterion("tbug_name not like", value, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameIn(List<String> values) {
            addCriterion("tbug_name in", values, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameNotIn(List<String> values) {
            addCriterion("tbug_name not in", values, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameBetween(String value1, String value2) {
            addCriterion("tbug_name between", value1, value2, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugNameNotBetween(String value1, String value2) {
            addCriterion("tbug_name not between", value1, value2, "tbugName");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaIsNull() {
            addCriterion("tbug_quota is null");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaIsNotNull() {
            addCriterion("tbug_quota is not null");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaEqualTo(BigDecimal value) {
            addCriterion("tbug_quota =", value, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaNotEqualTo(BigDecimal value) {
            addCriterion("tbug_quota <>", value, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaGreaterThan(BigDecimal value) {
            addCriterion("tbug_quota >", value, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbug_quota >=", value, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaLessThan(BigDecimal value) {
            addCriterion("tbug_quota <", value, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbug_quota <=", value, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaIn(List<BigDecimal> values) {
            addCriterion("tbug_quota in", values, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaNotIn(List<BigDecimal> values) {
            addCriterion("tbug_quota not in", values, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbug_quota between", value1, value2, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugQuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbug_quota not between", value1, value2, "tbugQuota");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkIsNull() {
            addCriterion("tbug_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkIsNotNull() {
            addCriterion("tbug_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkEqualTo(String value) {
            addCriterion("tbug_remark =", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkNotEqualTo(String value) {
            addCriterion("tbug_remark <>", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkGreaterThan(String value) {
            addCriterion("tbug_remark >", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbug_remark >=", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkLessThan(String value) {
            addCriterion("tbug_remark <", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbug_remark <=", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkLike(String value) {
            addCriterion("tbug_remark like", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkNotLike(String value) {
            addCriterion("tbug_remark not like", value, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkIn(List<String> values) {
            addCriterion("tbug_remark in", values, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkNotIn(List<String> values) {
            addCriterion("tbug_remark not in", values, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkBetween(String value1, String value2) {
            addCriterion("tbug_remark between", value1, value2, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugRemarkNotBetween(String value1, String value2) {
            addCriterion("tbug_remark not between", value1, value2, "tbugRemark");
            return (Criteria) this;
        }

        public Criteria andTbugMemoIsNull() {
            addCriterion("tbug_memo is null");
            return (Criteria) this;
        }

        public Criteria andTbugMemoIsNotNull() {
            addCriterion("tbug_memo is not null");
            return (Criteria) this;
        }

        public Criteria andTbugMemoEqualTo(String value) {
            addCriterion("tbug_memo =", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoNotEqualTo(String value) {
            addCriterion("tbug_memo <>", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoGreaterThan(String value) {
            addCriterion("tbug_memo >", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoGreaterThanOrEqualTo(String value) {
            addCriterion("tbug_memo >=", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoLessThan(String value) {
            addCriterion("tbug_memo <", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoLessThanOrEqualTo(String value) {
            addCriterion("tbug_memo <=", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoLike(String value) {
            addCriterion("tbug_memo like", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoNotLike(String value) {
            addCriterion("tbug_memo not like", value, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoIn(List<String> values) {
            addCriterion("tbug_memo in", values, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoNotIn(List<String> values) {
            addCriterion("tbug_memo not in", values, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoBetween(String value1, String value2) {
            addCriterion("tbug_memo between", value1, value2, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugMemoNotBetween(String value1, String value2) {
            addCriterion("tbug_memo not between", value1, value2, "tbugMemo");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeIsNull() {
            addCriterion("tbug_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeIsNotNull() {
            addCriterion("tbug_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeEqualTo(Date value) {
            addCriterion("tbug_update_time =", value, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbug_update_time <>", value, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeGreaterThan(Date value) {
            addCriterion("tbug_update_time >", value, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbug_update_time >=", value, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeLessThan(Date value) {
            addCriterion("tbug_update_time <", value, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbug_update_time <=", value, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeIn(List<Date> values) {
            addCriterion("tbug_update_time in", values, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbug_update_time not in", values, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbug_update_time between", value1, value2, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbug_update_time not between", value1, value2, "tbugUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeIsNull() {
            addCriterion("tbug_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeIsNotNull() {
            addCriterion("tbug_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeEqualTo(Date value) {
            addCriterion("tbug_add_time =", value, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeNotEqualTo(Date value) {
            addCriterion("tbug_add_time <>", value, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeGreaterThan(Date value) {
            addCriterion("tbug_add_time >", value, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbug_add_time >=", value, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeLessThan(Date value) {
            addCriterion("tbug_add_time <", value, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbug_add_time <=", value, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeIn(List<Date> values) {
            addCriterion("tbug_add_time in", values, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeNotIn(List<Date> values) {
            addCriterion("tbug_add_time not in", values, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbug_add_time between", value1, value2, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbug_add_time not between", value1, value2, "tbugAddTime");
            return (Criteria) this;
        }

        public Criteria andTbugStatusIsNull() {
            addCriterion("tbug_status is null");
            return (Criteria) this;
        }

        public Criteria andTbugStatusIsNotNull() {
            addCriterion("tbug_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbugStatusEqualTo(Byte value) {
            addCriterion("tbug_status =", value, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusNotEqualTo(Byte value) {
            addCriterion("tbug_status <>", value, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusGreaterThan(Byte value) {
            addCriterion("tbug_status >", value, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbug_status >=", value, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusLessThan(Byte value) {
            addCriterion("tbug_status <", value, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbug_status <=", value, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusIn(List<Byte> values) {
            addCriterion("tbug_status in", values, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusNotIn(List<Byte> values) {
            addCriterion("tbug_status not in", values, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbug_status between", value1, value2, "tbugStatus");
            return (Criteria) this;
        }

        public Criteria andTbugStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbug_status not between", value1, value2, "tbugStatus");
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