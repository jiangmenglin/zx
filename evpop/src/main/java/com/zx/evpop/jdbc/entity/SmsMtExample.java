package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsMtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsMtExample() {
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

        public Criteria andTbsmIdIsNull() {
            addCriterion("tbsm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbsmIdIsNotNull() {
            addCriterion("tbsm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmIdEqualTo(Long value) {
            addCriterion("tbsm_id =", value, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdNotEqualTo(Long value) {
            addCriterion("tbsm_id <>", value, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdGreaterThan(Long value) {
            addCriterion("tbsm_id >", value, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbsm_id >=", value, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdLessThan(Long value) {
            addCriterion("tbsm_id <", value, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdLessThanOrEqualTo(Long value) {
            addCriterion("tbsm_id <=", value, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdIn(List<Long> values) {
            addCriterion("tbsm_id in", values, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdNotIn(List<Long> values) {
            addCriterion("tbsm_id not in", values, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdBetween(Long value1, Long value2) {
            addCriterion("tbsm_id between", value1, value2, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmIdNotBetween(Long value1, Long value2) {
            addCriterion("tbsm_id not between", value1, value2, "tbsmId");
            return (Criteria) this;
        }

        public Criteria andTbsmHostIsNull() {
            addCriterion("tbsm_host is null");
            return (Criteria) this;
        }

        public Criteria andTbsmHostIsNotNull() {
            addCriterion("tbsm_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmHostEqualTo(Long value) {
            addCriterion("tbsm_host =", value, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostNotEqualTo(Long value) {
            addCriterion("tbsm_host <>", value, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostGreaterThan(Long value) {
            addCriterion("tbsm_host >", value, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbsm_host >=", value, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostLessThan(Long value) {
            addCriterion("tbsm_host <", value, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostLessThanOrEqualTo(Long value) {
            addCriterion("tbsm_host <=", value, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostIn(List<Long> values) {
            addCriterion("tbsm_host in", values, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostNotIn(List<Long> values) {
            addCriterion("tbsm_host not in", values, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostBetween(Long value1, Long value2) {
            addCriterion("tbsm_host between", value1, value2, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmHostNotBetween(Long value1, Long value2) {
            addCriterion("tbsm_host not between", value1, value2, "tbsmHost");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeIsNull() {
            addCriterion("tbsm_type is null");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeIsNotNull() {
            addCriterion("tbsm_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeEqualTo(Short value) {
            addCriterion("tbsm_type =", value, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeNotEqualTo(Short value) {
            addCriterion("tbsm_type <>", value, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeGreaterThan(Short value) {
            addCriterion("tbsm_type >", value, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbsm_type >=", value, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeLessThan(Short value) {
            addCriterion("tbsm_type <", value, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbsm_type <=", value, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeIn(List<Short> values) {
            addCriterion("tbsm_type in", values, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeNotIn(List<Short> values) {
            addCriterion("tbsm_type not in", values, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeBetween(Short value1, Short value2) {
            addCriterion("tbsm_type between", value1, value2, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbsm_type not between", value1, value2, "tbsmType");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileIsNull() {
            addCriterion("tbsm_mobile is null");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileIsNotNull() {
            addCriterion("tbsm_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileEqualTo(String value) {
            addCriterion("tbsm_mobile =", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileNotEqualTo(String value) {
            addCriterion("tbsm_mobile <>", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileGreaterThan(String value) {
            addCriterion("tbsm_mobile >", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileGreaterThanOrEqualTo(String value) {
            addCriterion("tbsm_mobile >=", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileLessThan(String value) {
            addCriterion("tbsm_mobile <", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileLessThanOrEqualTo(String value) {
            addCriterion("tbsm_mobile <=", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileLike(String value) {
            addCriterion("tbsm_mobile like", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileNotLike(String value) {
            addCriterion("tbsm_mobile not like", value, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileIn(List<String> values) {
            addCriterion("tbsm_mobile in", values, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileNotIn(List<String> values) {
            addCriterion("tbsm_mobile not in", values, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileBetween(String value1, String value2) {
            addCriterion("tbsm_mobile between", value1, value2, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmMobileNotBetween(String value1, String value2) {
            addCriterion("tbsm_mobile not between", value1, value2, "tbsmMobile");
            return (Criteria) this;
        }

        public Criteria andTbsmContentIsNull() {
            addCriterion("tbsm_content is null");
            return (Criteria) this;
        }

        public Criteria andTbsmContentIsNotNull() {
            addCriterion("tbsm_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmContentEqualTo(String value) {
            addCriterion("tbsm_content =", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentNotEqualTo(String value) {
            addCriterion("tbsm_content <>", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentGreaterThan(String value) {
            addCriterion("tbsm_content >", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbsm_content >=", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentLessThan(String value) {
            addCriterion("tbsm_content <", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentLessThanOrEqualTo(String value) {
            addCriterion("tbsm_content <=", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentLike(String value) {
            addCriterion("tbsm_content like", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentNotLike(String value) {
            addCriterion("tbsm_content not like", value, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentIn(List<String> values) {
            addCriterion("tbsm_content in", values, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentNotIn(List<String> values) {
            addCriterion("tbsm_content not in", values, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentBetween(String value1, String value2) {
            addCriterion("tbsm_content between", value1, value2, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmContentNotBetween(String value1, String value2) {
            addCriterion("tbsm_content not between", value1, value2, "tbsmContent");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorIsNull() {
            addCriterion("tbsm_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorIsNotNull() {
            addCriterion("tbsm_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorEqualTo(Long value) {
            addCriterion("tbsm_editor =", value, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorNotEqualTo(Long value) {
            addCriterion("tbsm_editor <>", value, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorGreaterThan(Long value) {
            addCriterion("tbsm_editor >", value, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("tbsm_editor >=", value, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorLessThan(Long value) {
            addCriterion("tbsm_editor <", value, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorLessThanOrEqualTo(Long value) {
            addCriterion("tbsm_editor <=", value, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorIn(List<Long> values) {
            addCriterion("tbsm_editor in", values, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorNotIn(List<Long> values) {
            addCriterion("tbsm_editor not in", values, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorBetween(Long value1, Long value2) {
            addCriterion("tbsm_editor between", value1, value2, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmEditorNotBetween(Long value1, Long value2) {
            addCriterion("tbsm_editor not between", value1, value2, "tbsmEditor");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelIsNull() {
            addCriterion("tbsm_channel is null");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelIsNotNull() {
            addCriterion("tbsm_channel is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelEqualTo(Long value) {
            addCriterion("tbsm_channel =", value, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelNotEqualTo(Long value) {
            addCriterion("tbsm_channel <>", value, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelGreaterThan(Long value) {
            addCriterion("tbsm_channel >", value, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelGreaterThanOrEqualTo(Long value) {
            addCriterion("tbsm_channel >=", value, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelLessThan(Long value) {
            addCriterion("tbsm_channel <", value, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelLessThanOrEqualTo(Long value) {
            addCriterion("tbsm_channel <=", value, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelIn(List<Long> values) {
            addCriterion("tbsm_channel in", values, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelNotIn(List<Long> values) {
            addCriterion("tbsm_channel not in", values, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelBetween(Long value1, Long value2) {
            addCriterion("tbsm_channel between", value1, value2, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmChannelNotBetween(Long value1, Long value2) {
            addCriterion("tbsm_channel not between", value1, value2, "tbsmChannel");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeIsNull() {
            addCriterion("tbsm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeIsNotNull() {
            addCriterion("tbsm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeEqualTo(Date value) {
            addCriterion("tbsm_update_time =", value, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbsm_update_time <>", value, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeGreaterThan(Date value) {
            addCriterion("tbsm_update_time >", value, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbsm_update_time >=", value, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeLessThan(Date value) {
            addCriterion("tbsm_update_time <", value, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbsm_update_time <=", value, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeIn(List<Date> values) {
            addCriterion("tbsm_update_time in", values, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbsm_update_time not in", values, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbsm_update_time between", value1, value2, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbsm_update_time not between", value1, value2, "tbsmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeIsNull() {
            addCriterion("tbsm_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeIsNotNull() {
            addCriterion("tbsm_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeEqualTo(Date value) {
            addCriterion("tbsm_add_time =", value, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeNotEqualTo(Date value) {
            addCriterion("tbsm_add_time <>", value, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeGreaterThan(Date value) {
            addCriterion("tbsm_add_time >", value, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbsm_add_time >=", value, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeLessThan(Date value) {
            addCriterion("tbsm_add_time <", value, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbsm_add_time <=", value, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeIn(List<Date> values) {
            addCriterion("tbsm_add_time in", values, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeNotIn(List<Date> values) {
            addCriterion("tbsm_add_time not in", values, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbsm_add_time between", value1, value2, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbsm_add_time not between", value1, value2, "tbsmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkIsNull() {
            addCriterion("tbsm_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkIsNotNull() {
            addCriterion("tbsm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkEqualTo(String value) {
            addCriterion("tbsm_remark =", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkNotEqualTo(String value) {
            addCriterion("tbsm_remark <>", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkGreaterThan(String value) {
            addCriterion("tbsm_remark >", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbsm_remark >=", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkLessThan(String value) {
            addCriterion("tbsm_remark <", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbsm_remark <=", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkLike(String value) {
            addCriterion("tbsm_remark like", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkNotLike(String value) {
            addCriterion("tbsm_remark not like", value, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkIn(List<String> values) {
            addCriterion("tbsm_remark in", values, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkNotIn(List<String> values) {
            addCriterion("tbsm_remark not in", values, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkBetween(String value1, String value2) {
            addCriterion("tbsm_remark between", value1, value2, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmRemarkNotBetween(String value1, String value2) {
            addCriterion("tbsm_remark not between", value1, value2, "tbsmRemark");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusIsNull() {
            addCriterion("tbsm_status is null");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusIsNotNull() {
            addCriterion("tbsm_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusEqualTo(Short value) {
            addCriterion("tbsm_status =", value, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusNotEqualTo(Short value) {
            addCriterion("tbsm_status <>", value, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusGreaterThan(Short value) {
            addCriterion("tbsm_status >", value, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbsm_status >=", value, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusLessThan(Short value) {
            addCriterion("tbsm_status <", value, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbsm_status <=", value, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusIn(List<Short> values) {
            addCriterion("tbsm_status in", values, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusNotIn(List<Short> values) {
            addCriterion("tbsm_status not in", values, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusBetween(Short value1, Short value2) {
            addCriterion("tbsm_status between", value1, value2, "tbsmStatus");
            return (Criteria) this;
        }

        public Criteria andTbsmStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbsm_status not between", value1, value2, "tbsmStatus");
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