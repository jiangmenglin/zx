package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCommentExample() {
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

        public Criteria andTbocIdIsNull() {
            addCriterion("tboc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbocIdIsNotNull() {
            addCriterion("tboc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbocIdEqualTo(Integer value) {
            addCriterion("tboc_id =", value, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdNotEqualTo(Integer value) {
            addCriterion("tboc_id <>", value, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdGreaterThan(Integer value) {
            addCriterion("tboc_id >", value, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tboc_id >=", value, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdLessThan(Integer value) {
            addCriterion("tboc_id <", value, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdLessThanOrEqualTo(Integer value) {
            addCriterion("tboc_id <=", value, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdIn(List<Integer> values) {
            addCriterion("tboc_id in", values, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdNotIn(List<Integer> values) {
            addCriterion("tboc_id not in", values, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdBetween(Integer value1, Integer value2) {
            addCriterion("tboc_id between", value1, value2, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tboc_id not between", value1, value2, "tbocId");
            return (Criteria) this;
        }

        public Criteria andTbocHostIsNull() {
            addCriterion("tboc_host is null");
            return (Criteria) this;
        }

        public Criteria andTbocHostIsNotNull() {
            addCriterion("tboc_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbocHostEqualTo(Short value) {
            addCriterion("tboc_host =", value, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostNotEqualTo(Short value) {
            addCriterion("tboc_host <>", value, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostGreaterThan(Short value) {
            addCriterion("tboc_host >", value, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tboc_host >=", value, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostLessThan(Short value) {
            addCriterion("tboc_host <", value, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostLessThanOrEqualTo(Short value) {
            addCriterion("tboc_host <=", value, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostIn(List<Short> values) {
            addCriterion("tboc_host in", values, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostNotIn(List<Short> values) {
            addCriterion("tboc_host not in", values, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostBetween(Short value1, Short value2) {
            addCriterion("tboc_host between", value1, value2, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocHostNotBetween(Short value1, Short value2) {
            addCriterion("tboc_host not between", value1, value2, "tbocHost");
            return (Criteria) this;
        }

        public Criteria andTbocContentIsNull() {
            addCriterion("tboc_content is null");
            return (Criteria) this;
        }

        public Criteria andTbocContentIsNotNull() {
            addCriterion("tboc_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbocContentEqualTo(String value) {
            addCriterion("tboc_content =", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentNotEqualTo(String value) {
            addCriterion("tboc_content <>", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentGreaterThan(String value) {
            addCriterion("tboc_content >", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentGreaterThanOrEqualTo(String value) {
            addCriterion("tboc_content >=", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentLessThan(String value) {
            addCriterion("tboc_content <", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentLessThanOrEqualTo(String value) {
            addCriterion("tboc_content <=", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentLike(String value) {
            addCriterion("tboc_content like", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentNotLike(String value) {
            addCriterion("tboc_content not like", value, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentIn(List<String> values) {
            addCriterion("tboc_content in", values, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentNotIn(List<String> values) {
            addCriterion("tboc_content not in", values, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentBetween(String value1, String value2) {
            addCriterion("tboc_content between", value1, value2, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocContentNotBetween(String value1, String value2) {
            addCriterion("tboc_content not between", value1, value2, "tbocContent");
            return (Criteria) this;
        }

        public Criteria andTbocImageIsNull() {
            addCriterion("tboc_image is null");
            return (Criteria) this;
        }

        public Criteria andTbocImageIsNotNull() {
            addCriterion("tboc_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbocImageEqualTo(String value) {
            addCriterion("tboc_image =", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageNotEqualTo(String value) {
            addCriterion("tboc_image <>", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageGreaterThan(String value) {
            addCriterion("tboc_image >", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageGreaterThanOrEqualTo(String value) {
            addCriterion("tboc_image >=", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageLessThan(String value) {
            addCriterion("tboc_image <", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageLessThanOrEqualTo(String value) {
            addCriterion("tboc_image <=", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageLike(String value) {
            addCriterion("tboc_image like", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageNotLike(String value) {
            addCriterion("tboc_image not like", value, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageIn(List<String> values) {
            addCriterion("tboc_image in", values, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageNotIn(List<String> values) {
            addCriterion("tboc_image not in", values, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageBetween(String value1, String value2) {
            addCriterion("tboc_image between", value1, value2, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocImageNotBetween(String value1, String value2) {
            addCriterion("tboc_image not between", value1, value2, "tbocImage");
            return (Criteria) this;
        }

        public Criteria andTbocMemberIsNull() {
            addCriterion("tboc_member is null");
            return (Criteria) this;
        }

        public Criteria andTbocMemberIsNotNull() {
            addCriterion("tboc_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbocMemberEqualTo(Integer value) {
            addCriterion("tboc_member =", value, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberNotEqualTo(Integer value) {
            addCriterion("tboc_member <>", value, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberGreaterThan(Integer value) {
            addCriterion("tboc_member >", value, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tboc_member >=", value, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberLessThan(Integer value) {
            addCriterion("tboc_member <", value, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tboc_member <=", value, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberIn(List<Integer> values) {
            addCriterion("tboc_member in", values, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberNotIn(List<Integer> values) {
            addCriterion("tboc_member not in", values, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberBetween(Integer value1, Integer value2) {
            addCriterion("tboc_member between", value1, value2, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tboc_member not between", value1, value2, "tbocMember");
            return (Criteria) this;
        }

        public Criteria andTbocOrderIsNull() {
            addCriterion("tboc_order is null");
            return (Criteria) this;
        }

        public Criteria andTbocOrderIsNotNull() {
            addCriterion("tboc_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbocOrderEqualTo(Long value) {
            addCriterion("tboc_order =", value, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderNotEqualTo(Long value) {
            addCriterion("tboc_order <>", value, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderGreaterThan(Long value) {
            addCriterion("tboc_order >", value, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("tboc_order >=", value, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderLessThan(Long value) {
            addCriterion("tboc_order <", value, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderLessThanOrEqualTo(Long value) {
            addCriterion("tboc_order <=", value, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderIn(List<Long> values) {
            addCriterion("tboc_order in", values, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderNotIn(List<Long> values) {
            addCriterion("tboc_order not in", values, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderBetween(Long value1, Long value2) {
            addCriterion("tboc_order between", value1, value2, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocOrderNotBetween(Long value1, Long value2) {
            addCriterion("tboc_order not between", value1, value2, "tbocOrder");
            return (Criteria) this;
        }

        public Criteria andTbocScoreIsNull() {
            addCriterion("tboc_score is null");
            return (Criteria) this;
        }

        public Criteria andTbocScoreIsNotNull() {
            addCriterion("tboc_score is not null");
            return (Criteria) this;
        }

        public Criteria andTbocScoreEqualTo(Short value) {
            addCriterion("tboc_score =", value, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreNotEqualTo(Short value) {
            addCriterion("tboc_score <>", value, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreGreaterThan(Short value) {
            addCriterion("tboc_score >", value, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("tboc_score >=", value, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreLessThan(Short value) {
            addCriterion("tboc_score <", value, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreLessThanOrEqualTo(Short value) {
            addCriterion("tboc_score <=", value, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreIn(List<Short> values) {
            addCriterion("tboc_score in", values, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreNotIn(List<Short> values) {
            addCriterion("tboc_score not in", values, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreBetween(Short value1, Short value2) {
            addCriterion("tboc_score between", value1, value2, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocScoreNotBetween(Short value1, Short value2) {
            addCriterion("tboc_score not between", value1, value2, "tbocScore");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeIsNull() {
            addCriterion("tboc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeIsNotNull() {
            addCriterion("tboc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeEqualTo(Date value) {
            addCriterion("tboc_update_time =", value, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeNotEqualTo(Date value) {
            addCriterion("tboc_update_time <>", value, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeGreaterThan(Date value) {
            addCriterion("tboc_update_time >", value, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboc_update_time >=", value, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeLessThan(Date value) {
            addCriterion("tboc_update_time <", value, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboc_update_time <=", value, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeIn(List<Date> values) {
            addCriterion("tboc_update_time in", values, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeNotIn(List<Date> values) {
            addCriterion("tboc_update_time not in", values, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tboc_update_time between", value1, value2, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboc_update_time not between", value1, value2, "tbocUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeIsNull() {
            addCriterion("tboc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeIsNotNull() {
            addCriterion("tboc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeEqualTo(Date value) {
            addCriterion("tboc_add_time =", value, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeNotEqualTo(Date value) {
            addCriterion("tboc_add_time <>", value, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeGreaterThan(Date value) {
            addCriterion("tboc_add_time >", value, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tboc_add_time >=", value, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeLessThan(Date value) {
            addCriterion("tboc_add_time <", value, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tboc_add_time <=", value, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeIn(List<Date> values) {
            addCriterion("tboc_add_time in", values, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeNotIn(List<Date> values) {
            addCriterion("tboc_add_time not in", values, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeBetween(Date value1, Date value2) {
            addCriterion("tboc_add_time between", value1, value2, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tboc_add_time not between", value1, value2, "tbocAddTime");
            return (Criteria) this;
        }

        public Criteria andTbocStatusIsNull() {
            addCriterion("tboc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbocStatusIsNotNull() {
            addCriterion("tboc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbocStatusEqualTo(Byte value) {
            addCriterion("tboc_status =", value, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusNotEqualTo(Byte value) {
            addCriterion("tboc_status <>", value, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusGreaterThan(Byte value) {
            addCriterion("tboc_status >", value, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tboc_status >=", value, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusLessThan(Byte value) {
            addCriterion("tboc_status <", value, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tboc_status <=", value, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusIn(List<Byte> values) {
            addCriterion("tboc_status in", values, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusNotIn(List<Byte> values) {
            addCriterion("tboc_status not in", values, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusBetween(Byte value1, Byte value2) {
            addCriterion("tboc_status between", value1, value2, "tbocStatus");
            return (Criteria) this;
        }

        public Criteria andTbocStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tboc_status not between", value1, value2, "tbocStatus");
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