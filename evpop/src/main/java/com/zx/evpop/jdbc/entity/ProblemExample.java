package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andTbpIdIsNull() {
            addCriterion("tbp_id is null");
            return (Criteria) this;
        }

        public Criteria andTbpIdIsNotNull() {
            addCriterion("tbp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbpIdEqualTo(Long value) {
            addCriterion("tbp_id =", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotEqualTo(Long value) {
            addCriterion("tbp_id <>", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThan(Long value) {
            addCriterion("tbp_id >", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_id >=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThan(Long value) {
            addCriterion("tbp_id <", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThanOrEqualTo(Long value) {
            addCriterion("tbp_id <=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdIn(List<Long> values) {
            addCriterion("tbp_id in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotIn(List<Long> values) {
            addCriterion("tbp_id not in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdBetween(Long value1, Long value2) {
            addCriterion("tbp_id between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotBetween(Long value1, Long value2) {
            addCriterion("tbp_id not between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNull() {
            addCriterion("tbp_host is null");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNotNull() {
            addCriterion("tbp_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbpHostEqualTo(Long value) {
            addCriterion("tbp_host =", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotEqualTo(Long value) {
            addCriterion("tbp_host <>", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThan(Long value) {
            addCriterion("tbp_host >", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_host >=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThan(Long value) {
            addCriterion("tbp_host <", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThanOrEqualTo(Long value) {
            addCriterion("tbp_host <=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostIn(List<Long> values) {
            addCriterion("tbp_host in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotIn(List<Long> values) {
            addCriterion("tbp_host not in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostBetween(Long value1, Long value2) {
            addCriterion("tbp_host between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotBetween(Long value1, Long value2) {
            addCriterion("tbp_host not between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpCarIsNull() {
            addCriterion("tbp_car is null");
            return (Criteria) this;
        }

        public Criteria andTbpCarIsNotNull() {
            addCriterion("tbp_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbpCarEqualTo(Long value) {
            addCriterion("tbp_car =", value, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarNotEqualTo(Long value) {
            addCriterion("tbp_car <>", value, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarGreaterThan(Long value) {
            addCriterion("tbp_car >", value, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_car >=", value, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarLessThan(Long value) {
            addCriterion("tbp_car <", value, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarLessThanOrEqualTo(Long value) {
            addCriterion("tbp_car <=", value, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarIn(List<Long> values) {
            addCriterion("tbp_car in", values, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarNotIn(List<Long> values) {
            addCriterion("tbp_car not in", values, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarBetween(Long value1, Long value2) {
            addCriterion("tbp_car between", value1, value2, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpCarNotBetween(Long value1, Long value2) {
            addCriterion("tbp_car not between", value1, value2, "tbpCar");
            return (Criteria) this;
        }

        public Criteria andTbpTypeIsNull() {
            addCriterion("tbp_type is null");
            return (Criteria) this;
        }

        public Criteria andTbpTypeIsNotNull() {
            addCriterion("tbp_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbpTypeEqualTo(Byte value) {
            addCriterion("tbp_type =", value, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeNotEqualTo(Byte value) {
            addCriterion("tbp_type <>", value, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeGreaterThan(Byte value) {
            addCriterion("tbp_type >", value, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbp_type >=", value, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeLessThan(Byte value) {
            addCriterion("tbp_type <", value, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbp_type <=", value, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeIn(List<Byte> values) {
            addCriterion("tbp_type in", values, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeNotIn(List<Byte> values) {
            addCriterion("tbp_type not in", values, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbp_type between", value1, value2, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbp_type not between", value1, value2, "tbpType");
            return (Criteria) this;
        }

        public Criteria andTbpProfileIsNull() {
            addCriterion("tbp_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbpProfileIsNotNull() {
            addCriterion("tbp_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbpProfileEqualTo(String value) {
            addCriterion("tbp_profile =", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileNotEqualTo(String value) {
            addCriterion("tbp_profile <>", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileGreaterThan(String value) {
            addCriterion("tbp_profile >", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_profile >=", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileLessThan(String value) {
            addCriterion("tbp_profile <", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileLessThanOrEqualTo(String value) {
            addCriterion("tbp_profile <=", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileLike(String value) {
            addCriterion("tbp_profile like", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileNotLike(String value) {
            addCriterion("tbp_profile not like", value, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileIn(List<String> values) {
            addCriterion("tbp_profile in", values, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileNotIn(List<String> values) {
            addCriterion("tbp_profile not in", values, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileBetween(String value1, String value2) {
            addCriterion("tbp_profile between", value1, value2, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpProfileNotBetween(String value1, String value2) {
            addCriterion("tbp_profile not between", value1, value2, "tbpProfile");
            return (Criteria) this;
        }

        public Criteria andTbpImagesIsNull() {
            addCriterion("tbp_images is null");
            return (Criteria) this;
        }

        public Criteria andTbpImagesIsNotNull() {
            addCriterion("tbp_images is not null");
            return (Criteria) this;
        }

        public Criteria andTbpImagesEqualTo(String value) {
            addCriterion("tbp_images =", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesNotEqualTo(String value) {
            addCriterion("tbp_images <>", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesGreaterThan(String value) {
            addCriterion("tbp_images >", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_images >=", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesLessThan(String value) {
            addCriterion("tbp_images <", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesLessThanOrEqualTo(String value) {
            addCriterion("tbp_images <=", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesLike(String value) {
            addCriterion("tbp_images like", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesNotLike(String value) {
            addCriterion("tbp_images not like", value, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesIn(List<String> values) {
            addCriterion("tbp_images in", values, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesNotIn(List<String> values) {
            addCriterion("tbp_images not in", values, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesBetween(String value1, String value2) {
            addCriterion("tbp_images between", value1, value2, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpImagesNotBetween(String value1, String value2) {
            addCriterion("tbp_images not between", value1, value2, "tbpImages");
            return (Criteria) this;
        }

        public Criteria andTbpManageIsNull() {
            addCriterion("tbp_manage is null");
            return (Criteria) this;
        }

        public Criteria andTbpManageIsNotNull() {
            addCriterion("tbp_manage is not null");
            return (Criteria) this;
        }

        public Criteria andTbpManageEqualTo(Long value) {
            addCriterion("tbp_manage =", value, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageNotEqualTo(Long value) {
            addCriterion("tbp_manage <>", value, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageGreaterThan(Long value) {
            addCriterion("tbp_manage >", value, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_manage >=", value, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageLessThan(Long value) {
            addCriterion("tbp_manage <", value, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageLessThanOrEqualTo(Long value) {
            addCriterion("tbp_manage <=", value, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageIn(List<Long> values) {
            addCriterion("tbp_manage in", values, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageNotIn(List<Long> values) {
            addCriterion("tbp_manage not in", values, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageBetween(Long value1, Long value2) {
            addCriterion("tbp_manage between", value1, value2, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpManageNotBetween(Long value1, Long value2) {
            addCriterion("tbp_manage not between", value1, value2, "tbpManage");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeIsNull() {
            addCriterion("tbp_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeIsNotNull() {
            addCriterion("tbp_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeEqualTo(Date value) {
            addCriterion("tbp_check_time =", value, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeNotEqualTo(Date value) {
            addCriterion("tbp_check_time <>", value, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeGreaterThan(Date value) {
            addCriterion("tbp_check_time >", value, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_check_time >=", value, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeLessThan(Date value) {
            addCriterion("tbp_check_time <", value, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_check_time <=", value, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeIn(List<Date> values) {
            addCriterion("tbp_check_time in", values, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeNotIn(List<Date> values) {
            addCriterion("tbp_check_time not in", values, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_check_time between", value1, value2, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_check_time not between", value1, value2, "tbpCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkIsNull() {
            addCriterion("tbp_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkIsNotNull() {
            addCriterion("tbp_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkEqualTo(String value) {
            addCriterion("tbp_remark =", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotEqualTo(String value) {
            addCriterion("tbp_remark <>", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkGreaterThan(String value) {
            addCriterion("tbp_remark >", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbp_remark >=", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkLessThan(String value) {
            addCriterion("tbp_remark <", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbp_remark <=", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkLike(String value) {
            addCriterion("tbp_remark like", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotLike(String value) {
            addCriterion("tbp_remark not like", value, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkIn(List<String> values) {
            addCriterion("tbp_remark in", values, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotIn(List<String> values) {
            addCriterion("tbp_remark not in", values, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkBetween(String value1, String value2) {
            addCriterion("tbp_remark between", value1, value2, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpRemarkNotBetween(String value1, String value2) {
            addCriterion("tbp_remark not between", value1, value2, "tbpRemark");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIsNull() {
            addCriterion("tbp_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIsNotNull() {
            addCriterion("tbp_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeEqualTo(Date value) {
            addCriterion("tbp_update_time =", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbp_update_time <>", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeGreaterThan(Date value) {
            addCriterion("tbp_update_time >", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_update_time >=", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeLessThan(Date value) {
            addCriterion("tbp_update_time <", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_update_time <=", value, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeIn(List<Date> values) {
            addCriterion("tbp_update_time in", values, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbp_update_time not in", values, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_update_time between", value1, value2, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_update_time not between", value1, value2, "tbpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIsNull() {
            addCriterion("tbp_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIsNotNull() {
            addCriterion("tbp_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeEqualTo(Date value) {
            addCriterion("tbp_add_time =", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotEqualTo(Date value) {
            addCriterion("tbp_add_time <>", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeGreaterThan(Date value) {
            addCriterion("tbp_add_time >", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbp_add_time >=", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeLessThan(Date value) {
            addCriterion("tbp_add_time <", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbp_add_time <=", value, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeIn(List<Date> values) {
            addCriterion("tbp_add_time in", values, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotIn(List<Date> values) {
            addCriterion("tbp_add_time not in", values, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbp_add_time between", value1, value2, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbp_add_time not between", value1, value2, "tbpAddTime");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIsNull() {
            addCriterion("tbp_status is null");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIsNotNull() {
            addCriterion("tbp_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbpStatusEqualTo(Byte value) {
            addCriterion("tbp_status =", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotEqualTo(Byte value) {
            addCriterion("tbp_status <>", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusGreaterThan(Byte value) {
            addCriterion("tbp_status >", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbp_status >=", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusLessThan(Byte value) {
            addCriterion("tbp_status <", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbp_status <=", value, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusIn(List<Byte> values) {
            addCriterion("tbp_status in", values, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotIn(List<Byte> values) {
            addCriterion("tbp_status not in", values, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbp_status between", value1, value2, "tbpStatus");
            return (Criteria) this;
        }

        public Criteria andTbpStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbp_status not between", value1, value2, "tbpStatus");
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