package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelExample() {
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

        public Criteria andTbmIdIsNull() {
            addCriterion("tbm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdIsNotNull() {
            addCriterion("tbm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdEqualTo(Integer value) {
            addCriterion("tbm_id =", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotEqualTo(Integer value) {
            addCriterion("tbm_id <>", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThan(Integer value) {
            addCriterion("tbm_id >", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_id >=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThan(Integer value) {
            addCriterion("tbm_id <", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_id <=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdIn(List<Integer> values) {
            addCriterion("tbm_id in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotIn(List<Integer> values) {
            addCriterion("tbm_id not in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id not between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmNameIsNull() {
            addCriterion("tbm_name is null");
            return (Criteria) this;
        }

        public Criteria andTbmNameIsNotNull() {
            addCriterion("tbm_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbmNameEqualTo(String value) {
            addCriterion("tbm_name =", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotEqualTo(String value) {
            addCriterion("tbm_name <>", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameGreaterThan(String value) {
            addCriterion("tbm_name >", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_name >=", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLessThan(String value) {
            addCriterion("tbm_name <", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLessThanOrEqualTo(String value) {
            addCriterion("tbm_name <=", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameLike(String value) {
            addCriterion("tbm_name like", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotLike(String value) {
            addCriterion("tbm_name not like", value, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameIn(List<String> values) {
            addCriterion("tbm_name in", values, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotIn(List<String> values) {
            addCriterion("tbm_name not in", values, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameBetween(String value1, String value2) {
            addCriterion("tbm_name between", value1, value2, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmNameNotBetween(String value1, String value2) {
            addCriterion("tbm_name not between", value1, value2, "tbmName");
            return (Criteria) this;
        }

        public Criteria andTbmFlagIsNull() {
            addCriterion("tbm_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbmFlagIsNotNull() {
            addCriterion("tbm_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFlagEqualTo(String value) {
            addCriterion("tbm_flag =", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotEqualTo(String value) {
            addCriterion("tbm_flag <>", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagGreaterThan(String value) {
            addCriterion("tbm_flag >", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_flag >=", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagLessThan(String value) {
            addCriterion("tbm_flag <", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagLessThanOrEqualTo(String value) {
            addCriterion("tbm_flag <=", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagLike(String value) {
            addCriterion("tbm_flag like", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotLike(String value) {
            addCriterion("tbm_flag not like", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagIn(List<String> values) {
            addCriterion("tbm_flag in", values, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotIn(List<String> values) {
            addCriterion("tbm_flag not in", values, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagBetween(String value1, String value2) {
            addCriterion("tbm_flag between", value1, value2, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotBetween(String value1, String value2) {
            addCriterion("tbm_flag not between", value1, value2, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNull() {
            addCriterion("tbm_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNotNull() {
            addCriterion("tbm_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeEqualTo(Byte value) {
            addCriterion("tbm_type =", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotEqualTo(Byte value) {
            addCriterion("tbm_type <>", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThan(Byte value) {
            addCriterion("tbm_type >", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_type >=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThan(Byte value) {
            addCriterion("tbm_type <", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_type <=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIn(List<Byte> values) {
            addCriterion("tbm_type in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotIn(List<Byte> values) {
            addCriterion("tbm_type not in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type not between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmFileIsNull() {
            addCriterion("tbm_file is null");
            return (Criteria) this;
        }

        public Criteria andTbmFileIsNotNull() {
            addCriterion("tbm_file is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFileEqualTo(Byte value) {
            addCriterion("tbm_file =", value, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileNotEqualTo(Byte value) {
            addCriterion("tbm_file <>", value, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileGreaterThan(Byte value) {
            addCriterion("tbm_file >", value, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_file >=", value, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileLessThan(Byte value) {
            addCriterion("tbm_file <", value, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_file <=", value, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileIn(List<Byte> values) {
            addCriterion("tbm_file in", values, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileNotIn(List<Byte> values) {
            addCriterion("tbm_file not in", values, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileBetween(Byte value1, Byte value2) {
            addCriterion("tbm_file between", value1, value2, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmFileNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_file not between", value1, value2, "tbmFile");
            return (Criteria) this;
        }

        public Criteria andTbmImageIsNull() {
            addCriterion("tbm_image is null");
            return (Criteria) this;
        }

        public Criteria andTbmImageIsNotNull() {
            addCriterion("tbm_image is not null");
            return (Criteria) this;
        }

        public Criteria andTbmImageEqualTo(String value) {
            addCriterion("tbm_image =", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageNotEqualTo(String value) {
            addCriterion("tbm_image <>", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageGreaterThan(String value) {
            addCriterion("tbm_image >", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_image >=", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageLessThan(String value) {
            addCriterion("tbm_image <", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageLessThanOrEqualTo(String value) {
            addCriterion("tbm_image <=", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageLike(String value) {
            addCriterion("tbm_image like", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageNotLike(String value) {
            addCriterion("tbm_image not like", value, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageIn(List<String> values) {
            addCriterion("tbm_image in", values, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageNotIn(List<String> values) {
            addCriterion("tbm_image not in", values, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageBetween(String value1, String value2) {
            addCriterion("tbm_image between", value1, value2, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmImageNotBetween(String value1, String value2) {
            addCriterion("tbm_image not between", value1, value2, "tbmImage");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalIsNull() {
            addCriterion("tbm_pedestal is null");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalIsNotNull() {
            addCriterion("tbm_pedestal is not null");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalEqualTo(Integer value) {
            addCriterion("tbm_pedestal =", value, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalNotEqualTo(Integer value) {
            addCriterion("tbm_pedestal <>", value, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalGreaterThan(Integer value) {
            addCriterion("tbm_pedestal >", value, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_pedestal >=", value, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalLessThan(Integer value) {
            addCriterion("tbm_pedestal <", value, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_pedestal <=", value, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalIn(List<Integer> values) {
            addCriterion("tbm_pedestal in", values, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalNotIn(List<Integer> values) {
            addCriterion("tbm_pedestal not in", values, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalBetween(Integer value1, Integer value2) {
            addCriterion("tbm_pedestal between", value1, value2, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmPedestalNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_pedestal not between", value1, value2, "tbmPedestal");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmIsNull() {
            addCriterion("tbm_alarm is null");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmIsNotNull() {
            addCriterion("tbm_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmEqualTo(Integer value) {
            addCriterion("tbm_alarm =", value, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmNotEqualTo(Integer value) {
            addCriterion("tbm_alarm <>", value, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmGreaterThan(Integer value) {
            addCriterion("tbm_alarm >", value, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_alarm >=", value, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmLessThan(Integer value) {
            addCriterion("tbm_alarm <", value, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_alarm <=", value, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmIn(List<Integer> values) {
            addCriterion("tbm_alarm in", values, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmNotIn(List<Integer> values) {
            addCriterion("tbm_alarm not in", values, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmBetween(Integer value1, Integer value2) {
            addCriterion("tbm_alarm between", value1, value2, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_alarm not between", value1, value2, "tbmAlarm");
            return (Criteria) this;
        }

        public Criteria andTbmMileageIsNull() {
            addCriterion("tbm_mileage is null");
            return (Criteria) this;
        }

        public Criteria andTbmMileageIsNotNull() {
            addCriterion("tbm_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andTbmMileageEqualTo(Integer value) {
            addCriterion("tbm_mileage =", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageNotEqualTo(Integer value) {
            addCriterion("tbm_mileage <>", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageGreaterThan(Integer value) {
            addCriterion("tbm_mileage >", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_mileage >=", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageLessThan(Integer value) {
            addCriterion("tbm_mileage <", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_mileage <=", value, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageIn(List<Integer> values) {
            addCriterion("tbm_mileage in", values, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageNotIn(List<Integer> values) {
            addCriterion("tbm_mileage not in", values, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageBetween(Integer value1, Integer value2) {
            addCriterion("tbm_mileage between", value1, value2, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_mileage not between", value1, value2, "tbmMileage");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNull() {
            addCriterion("tbm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNotNull() {
            addCriterion("tbm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeEqualTo(Date value) {
            addCriterion("tbm_update_time =", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbm_update_time <>", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThan(Date value) {
            addCriterion("tbm_update_time >", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time >=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThan(Date value) {
            addCriterion("tbm_update_time <", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time <=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIn(List<Date> values) {
            addCriterion("tbm_update_time in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbm_update_time not in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time not between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNull() {
            addCriterion("tbm_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNotNull() {
            addCriterion("tbm_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeEqualTo(Date value) {
            addCriterion("tbm_add_time =", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotEqualTo(Date value) {
            addCriterion("tbm_add_time <>", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThan(Date value) {
            addCriterion("tbm_add_time >", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time >=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThan(Date value) {
            addCriterion("tbm_add_time <", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time <=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIn(List<Date> values) {
            addCriterion("tbm_add_time in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotIn(List<Date> values) {
            addCriterion("tbm_add_time not in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time not between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNull() {
            addCriterion("tbm_status is null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNotNull() {
            addCriterion("tbm_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusEqualTo(Byte value) {
            addCriterion("tbm_status =", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotEqualTo(Byte value) {
            addCriterion("tbm_status <>", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThan(Byte value) {
            addCriterion("tbm_status >", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_status >=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThan(Byte value) {
            addCriterion("tbm_status <", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_status <=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIn(List<Byte> values) {
            addCriterion("tbm_status in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotIn(List<Byte> values) {
            addCriterion("tbm_status not in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status not between", value1, value2, "tbmStatus");
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