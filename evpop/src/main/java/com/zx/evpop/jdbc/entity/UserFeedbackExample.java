package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFeedbackExample() {
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

        public Criteria andTbufIdIsNull() {
            addCriterion("tbuf_id is null");
            return (Criteria) this;
        }

        public Criteria andTbufIdIsNotNull() {
            addCriterion("tbuf_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbufIdEqualTo(Long value) {
            addCriterion("tbuf_id =", value, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdNotEqualTo(Long value) {
            addCriterion("tbuf_id <>", value, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdGreaterThan(Long value) {
            addCriterion("tbuf_id >", value, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuf_id >=", value, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdLessThan(Long value) {
            addCriterion("tbuf_id <", value, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdLessThanOrEqualTo(Long value) {
            addCriterion("tbuf_id <=", value, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdIn(List<Long> values) {
            addCriterion("tbuf_id in", values, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdNotIn(List<Long> values) {
            addCriterion("tbuf_id not in", values, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdBetween(Long value1, Long value2) {
            addCriterion("tbuf_id between", value1, value2, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufIdNotBetween(Long value1, Long value2) {
            addCriterion("tbuf_id not between", value1, value2, "tbufId");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeIsNull() {
            addCriterion("tbuf_back_type is null");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeIsNotNull() {
            addCriterion("tbuf_back_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeEqualTo(String value) {
            addCriterion("tbuf_back_type =", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeNotEqualTo(String value) {
            addCriterion("tbuf_back_type <>", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeGreaterThan(String value) {
            addCriterion("tbuf_back_type >", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_back_type >=", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeLessThan(String value) {
            addCriterion("tbuf_back_type <", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeLessThanOrEqualTo(String value) {
            addCriterion("tbuf_back_type <=", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeLike(String value) {
            addCriterion("tbuf_back_type like", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeNotLike(String value) {
            addCriterion("tbuf_back_type not like", value, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeIn(List<String> values) {
            addCriterion("tbuf_back_type in", values, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeNotIn(List<String> values) {
            addCriterion("tbuf_back_type not in", values, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeBetween(String value1, String value2) {
            addCriterion("tbuf_back_type between", value1, value2, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackTypeNotBetween(String value1, String value2) {
            addCriterion("tbuf_back_type not between", value1, value2, "tbufBackType");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentIsNull() {
            addCriterion("tbuf_back_content is null");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentIsNotNull() {
            addCriterion("tbuf_back_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentEqualTo(String value) {
            addCriterion("tbuf_back_content =", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentNotEqualTo(String value) {
            addCriterion("tbuf_back_content <>", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentGreaterThan(String value) {
            addCriterion("tbuf_back_content >", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_back_content >=", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentLessThan(String value) {
            addCriterion("tbuf_back_content <", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentLessThanOrEqualTo(String value) {
            addCriterion("tbuf_back_content <=", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentLike(String value) {
            addCriterion("tbuf_back_content like", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentNotLike(String value) {
            addCriterion("tbuf_back_content not like", value, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentIn(List<String> values) {
            addCriterion("tbuf_back_content in", values, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentNotIn(List<String> values) {
            addCriterion("tbuf_back_content not in", values, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentBetween(String value1, String value2) {
            addCriterion("tbuf_back_content between", value1, value2, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufBackContentNotBetween(String value1, String value2) {
            addCriterion("tbuf_back_content not between", value1, value2, "tbufBackContent");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailIsNull() {
            addCriterion("tbuf_deal_detail is null");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailIsNotNull() {
            addCriterion("tbuf_deal_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailEqualTo(String value) {
            addCriterion("tbuf_deal_detail =", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailNotEqualTo(String value) {
            addCriterion("tbuf_deal_detail <>", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailGreaterThan(String value) {
            addCriterion("tbuf_deal_detail >", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_deal_detail >=", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailLessThan(String value) {
            addCriterion("tbuf_deal_detail <", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailLessThanOrEqualTo(String value) {
            addCriterion("tbuf_deal_detail <=", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailLike(String value) {
            addCriterion("tbuf_deal_detail like", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailNotLike(String value) {
            addCriterion("tbuf_deal_detail not like", value, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailIn(List<String> values) {
            addCriterion("tbuf_deal_detail in", values, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailNotIn(List<String> values) {
            addCriterion("tbuf_deal_detail not in", values, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailBetween(String value1, String value2) {
            addCriterion("tbuf_deal_detail between", value1, value2, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufDealDetailNotBetween(String value1, String value2) {
            addCriterion("tbuf_deal_detail not between", value1, value2, "tbufDealDetail");
            return (Criteria) this;
        }

        public Criteria andTbufMemberIsNull() {
            addCriterion("tbuf_member is null");
            return (Criteria) this;
        }

        public Criteria andTbufMemberIsNotNull() {
            addCriterion("tbuf_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbufMemberEqualTo(Long value) {
            addCriterion("tbuf_member =", value, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberNotEqualTo(Long value) {
            addCriterion("tbuf_member <>", value, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberGreaterThan(Long value) {
            addCriterion("tbuf_member >", value, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("tbuf_member >=", value, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberLessThan(Long value) {
            addCriterion("tbuf_member <", value, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberLessThanOrEqualTo(Long value) {
            addCriterion("tbuf_member <=", value, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberIn(List<Long> values) {
            addCriterion("tbuf_member in", values, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberNotIn(List<Long> values) {
            addCriterion("tbuf_member not in", values, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberBetween(Long value1, Long value2) {
            addCriterion("tbuf_member between", value1, value2, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufMemberNotBetween(Long value1, Long value2) {
            addCriterion("tbuf_member not between", value1, value2, "tbufMember");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeIsNull() {
            addCriterion("tbuf_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeIsNotNull() {
            addCriterion("tbuf_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeEqualTo(Date value) {
            addCriterion("tbuf_add_time =", value, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeNotEqualTo(Date value) {
            addCriterion("tbuf_add_time <>", value, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeGreaterThan(Date value) {
            addCriterion("tbuf_add_time >", value, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuf_add_time >=", value, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeLessThan(Date value) {
            addCriterion("tbuf_add_time <", value, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuf_add_time <=", value, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeIn(List<Date> values) {
            addCriterion("tbuf_add_time in", values, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeNotIn(List<Date> values) {
            addCriterion("tbuf_add_time not in", values, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbuf_add_time between", value1, value2, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuf_add_time not between", value1, value2, "tbufAddTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeIsNull() {
            addCriterion("tbuf_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeIsNotNull() {
            addCriterion("tbuf_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeEqualTo(Date value) {
            addCriterion("tbuf_update_time =", value, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbuf_update_time <>", value, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeGreaterThan(Date value) {
            addCriterion("tbuf_update_time >", value, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbuf_update_time >=", value, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeLessThan(Date value) {
            addCriterion("tbuf_update_time <", value, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbuf_update_time <=", value, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeIn(List<Date> values) {
            addCriterion("tbuf_update_time in", values, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbuf_update_time not in", values, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbuf_update_time between", value1, value2, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbuf_update_time not between", value1, value2, "tbufUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbufStatusIsNull() {
            addCriterion("tbuf_status is null");
            return (Criteria) this;
        }

        public Criteria andTbufStatusIsNotNull() {
            addCriterion("tbuf_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbufStatusEqualTo(Byte value) {
            addCriterion("tbuf_status =", value, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusNotEqualTo(Byte value) {
            addCriterion("tbuf_status <>", value, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusGreaterThan(Byte value) {
            addCriterion("tbuf_status >", value, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbuf_status >=", value, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusLessThan(Byte value) {
            addCriterion("tbuf_status <", value, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbuf_status <=", value, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusIn(List<Byte> values) {
            addCriterion("tbuf_status in", values, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusNotIn(List<Byte> values) {
            addCriterion("tbuf_status not in", values, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbuf_status between", value1, value2, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbuf_status not between", value1, value2, "tbufStatus");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformIsNull() {
            addCriterion("tbuf_mobile_platform is null");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformIsNotNull() {
            addCriterion("tbuf_mobile_platform is not null");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformEqualTo(String value) {
            addCriterion("tbuf_mobile_platform =", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformNotEqualTo(String value) {
            addCriterion("tbuf_mobile_platform <>", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformGreaterThan(String value) {
            addCriterion("tbuf_mobile_platform >", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_mobile_platform >=", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformLessThan(String value) {
            addCriterion("tbuf_mobile_platform <", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformLessThanOrEqualTo(String value) {
            addCriterion("tbuf_mobile_platform <=", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformLike(String value) {
            addCriterion("tbuf_mobile_platform like", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformNotLike(String value) {
            addCriterion("tbuf_mobile_platform not like", value, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformIn(List<String> values) {
            addCriterion("tbuf_mobile_platform in", values, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformNotIn(List<String> values) {
            addCriterion("tbuf_mobile_platform not in", values, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformBetween(String value1, String value2) {
            addCriterion("tbuf_mobile_platform between", value1, value2, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufMobilePlatformNotBetween(String value1, String value2) {
            addCriterion("tbuf_mobile_platform not between", value1, value2, "tbufMobilePlatform");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionIsNull() {
            addCriterion("tbuf_system_version is null");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionIsNotNull() {
            addCriterion("tbuf_system_version is not null");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionEqualTo(String value) {
            addCriterion("tbuf_system_version =", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionNotEqualTo(String value) {
            addCriterion("tbuf_system_version <>", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionGreaterThan(String value) {
            addCriterion("tbuf_system_version >", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_system_version >=", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionLessThan(String value) {
            addCriterion("tbuf_system_version <", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("tbuf_system_version <=", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionLike(String value) {
            addCriterion("tbuf_system_version like", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionNotLike(String value) {
            addCriterion("tbuf_system_version not like", value, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionIn(List<String> values) {
            addCriterion("tbuf_system_version in", values, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionNotIn(List<String> values) {
            addCriterion("tbuf_system_version not in", values, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionBetween(String value1, String value2) {
            addCriterion("tbuf_system_version between", value1, value2, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSystemVersionNotBetween(String value1, String value2) {
            addCriterion("tbuf_system_version not between", value1, value2, "tbufSystemVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionIsNull() {
            addCriterion("tbuf_app_version is null");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionIsNotNull() {
            addCriterion("tbuf_app_version is not null");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionEqualTo(String value) {
            addCriterion("tbuf_app_version =", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionNotEqualTo(String value) {
            addCriterion("tbuf_app_version <>", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionGreaterThan(String value) {
            addCriterion("tbuf_app_version >", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_app_version >=", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionLessThan(String value) {
            addCriterion("tbuf_app_version <", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionLessThanOrEqualTo(String value) {
            addCriterion("tbuf_app_version <=", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionLike(String value) {
            addCriterion("tbuf_app_version like", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionNotLike(String value) {
            addCriterion("tbuf_app_version not like", value, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionIn(List<String> values) {
            addCriterion("tbuf_app_version in", values, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionNotIn(List<String> values) {
            addCriterion("tbuf_app_version not in", values, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionBetween(String value1, String value2) {
            addCriterion("tbuf_app_version between", value1, value2, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufAppVersionNotBetween(String value1, String value2) {
            addCriterion("tbuf_app_version not between", value1, value2, "tbufAppVersion");
            return (Criteria) this;
        }

        public Criteria andTbufSourceIsNull() {
            addCriterion("tbuf_source is null");
            return (Criteria) this;
        }

        public Criteria andTbufSourceIsNotNull() {
            addCriterion("tbuf_source is not null");
            return (Criteria) this;
        }

        public Criteria andTbufSourceEqualTo(Byte value) {
            addCriterion("tbuf_source =", value, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceNotEqualTo(Byte value) {
            addCriterion("tbuf_source <>", value, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceGreaterThan(Byte value) {
            addCriterion("tbuf_source >", value, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbuf_source >=", value, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceLessThan(Byte value) {
            addCriterion("tbuf_source <", value, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceLessThanOrEqualTo(Byte value) {
            addCriterion("tbuf_source <=", value, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceIn(List<Byte> values) {
            addCriterion("tbuf_source in", values, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceNotIn(List<Byte> values) {
            addCriterion("tbuf_source not in", values, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceBetween(Byte value1, Byte value2) {
            addCriterion("tbuf_source between", value1, value2, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("tbuf_source not between", value1, value2, "tbufSource");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressIsNull() {
            addCriterion("tbuf_hardwareAddress is null");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressIsNotNull() {
            addCriterion("tbuf_hardwareAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressEqualTo(String value) {
            addCriterion("tbuf_hardwareAddress =", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressNotEqualTo(String value) {
            addCriterion("tbuf_hardwareAddress <>", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressGreaterThan(String value) {
            addCriterion("tbuf_hardwareAddress >", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_hardwareAddress >=", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressLessThan(String value) {
            addCriterion("tbuf_hardwareAddress <", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressLessThanOrEqualTo(String value) {
            addCriterion("tbuf_hardwareAddress <=", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressLike(String value) {
            addCriterion("tbuf_hardwareAddress like", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressNotLike(String value) {
            addCriterion("tbuf_hardwareAddress not like", value, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressIn(List<String> values) {
            addCriterion("tbuf_hardwareAddress in", values, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressNotIn(List<String> values) {
            addCriterion("tbuf_hardwareAddress not in", values, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressBetween(String value1, String value2) {
            addCriterion("tbuf_hardwareAddress between", value1, value2, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufHardwareaddressNotBetween(String value1, String value2) {
            addCriterion("tbuf_hardwareAddress not between", value1, value2, "tbufHardwareaddress");
            return (Criteria) this;
        }

        public Criteria andTbufUicIsNull() {
            addCriterion("tbuf_uic is null");
            return (Criteria) this;
        }

        public Criteria andTbufUicIsNotNull() {
            addCriterion("tbuf_uic is not null");
            return (Criteria) this;
        }

        public Criteria andTbufUicEqualTo(String value) {
            addCriterion("tbuf_uic =", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicNotEqualTo(String value) {
            addCriterion("tbuf_uic <>", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicGreaterThan(String value) {
            addCriterion("tbuf_uic >", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicGreaterThanOrEqualTo(String value) {
            addCriterion("tbuf_uic >=", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicLessThan(String value) {
            addCriterion("tbuf_uic <", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicLessThanOrEqualTo(String value) {
            addCriterion("tbuf_uic <=", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicLike(String value) {
            addCriterion("tbuf_uic like", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicNotLike(String value) {
            addCriterion("tbuf_uic not like", value, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicIn(List<String> values) {
            addCriterion("tbuf_uic in", values, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicNotIn(List<String> values) {
            addCriterion("tbuf_uic not in", values, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicBetween(String value1, String value2) {
            addCriterion("tbuf_uic between", value1, value2, "tbufUic");
            return (Criteria) this;
        }

        public Criteria andTbufUicNotBetween(String value1, String value2) {
            addCriterion("tbuf_uic not between", value1, value2, "tbufUic");
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