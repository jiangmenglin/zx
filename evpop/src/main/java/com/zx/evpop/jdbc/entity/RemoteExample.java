package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemoteExample() {
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

        public Criteria andTbrIdIsNull() {
            addCriterion("tbr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbrIdIsNotNull() {
            addCriterion("tbr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbrIdEqualTo(Long value) {
            addCriterion("tbr_id =", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotEqualTo(Long value) {
            addCriterion("tbr_id <>", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThan(Long value) {
            addCriterion("tbr_id >", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_id >=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThan(Long value) {
            addCriterion("tbr_id <", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdLessThanOrEqualTo(Long value) {
            addCriterion("tbr_id <=", value, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdIn(List<Long> values) {
            addCriterion("tbr_id in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotIn(List<Long> values) {
            addCriterion("tbr_id not in", values, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdBetween(Long value1, Long value2) {
            addCriterion("tbr_id between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrIdNotBetween(Long value1, Long value2) {
            addCriterion("tbr_id not between", value1, value2, "tbrId");
            return (Criteria) this;
        }

        public Criteria andTbrHostIsNull() {
            addCriterion("tbr_host is null");
            return (Criteria) this;
        }

        public Criteria andTbrHostIsNotNull() {
            addCriterion("tbr_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbrHostEqualTo(Short value) {
            addCriterion("tbr_host =", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotEqualTo(Short value) {
            addCriterion("tbr_host <>", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThan(Short value) {
            addCriterion("tbr_host >", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbr_host >=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThan(Short value) {
            addCriterion("tbr_host <", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThanOrEqualTo(Short value) {
            addCriterion("tbr_host <=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostIn(List<Short> values) {
            addCriterion("tbr_host in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotIn(List<Short> values) {
            addCriterion("tbr_host not in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostBetween(Short value1, Short value2) {
            addCriterion("tbr_host between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotBetween(Short value1, Short value2) {
            addCriterion("tbr_host not between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrCarIsNull() {
            addCriterion("tbr_car is null");
            return (Criteria) this;
        }

        public Criteria andTbrCarIsNotNull() {
            addCriterion("tbr_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCarEqualTo(Integer value) {
            addCriterion("tbr_car =", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarNotEqualTo(Integer value) {
            addCriterion("tbr_car <>", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarGreaterThan(Integer value) {
            addCriterion("tbr_car >", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbr_car >=", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarLessThan(Integer value) {
            addCriterion("tbr_car <", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarLessThanOrEqualTo(Integer value) {
            addCriterion("tbr_car <=", value, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarIn(List<Integer> values) {
            addCriterion("tbr_car in", values, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarNotIn(List<Integer> values) {
            addCriterion("tbr_car not in", values, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarBetween(Integer value1, Integer value2) {
            addCriterion("tbr_car between", value1, value2, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrCarNotBetween(Integer value1, Integer value2) {
            addCriterion("tbr_car not between", value1, value2, "tbrCar");
            return (Criteria) this;
        }

        public Criteria andTbrTypeIsNull() {
            addCriterion("tbr_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrTypeIsNotNull() {
            addCriterion("tbr_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrTypeEqualTo(Short value) {
            addCriterion("tbr_type =", value, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeNotEqualTo(Short value) {
            addCriterion("tbr_type <>", value, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeGreaterThan(Short value) {
            addCriterion("tbr_type >", value, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbr_type >=", value, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeLessThan(Short value) {
            addCriterion("tbr_type <", value, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbr_type <=", value, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeIn(List<Short> values) {
            addCriterion("tbr_type in", values, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeNotIn(List<Short> values) {
            addCriterion("tbr_type not in", values, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeBetween(Short value1, Short value2) {
            addCriterion("tbr_type between", value1, value2, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbr_type not between", value1, value2, "tbrType");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIsNull() {
            addCriterion("tbr_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIsNotNull() {
            addCriterion("tbr_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEditorEqualTo(String value) {
            addCriterion("tbr_editor =", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotEqualTo(String value) {
            addCriterion("tbr_editor <>", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorGreaterThan(String value) {
            addCriterion("tbr_editor >", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_editor >=", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLessThan(String value) {
            addCriterion("tbr_editor <", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLessThanOrEqualTo(String value) {
            addCriterion("tbr_editor <=", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorLike(String value) {
            addCriterion("tbr_editor like", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotLike(String value) {
            addCriterion("tbr_editor not like", value, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorIn(List<String> values) {
            addCriterion("tbr_editor in", values, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotIn(List<String> values) {
            addCriterion("tbr_editor not in", values, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorBetween(String value1, String value2) {
            addCriterion("tbr_editor between", value1, value2, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrEditorNotBetween(String value1, String value2) {
            addCriterion("tbr_editor not between", value1, value2, "tbrEditor");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNull() {
            addCriterion("tbr_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIsNotNull() {
            addCriterion("tbr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkEqualTo(String value) {
            addCriterion("tbr_remark =", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotEqualTo(String value) {
            addCriterion("tbr_remark <>", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThan(String value) {
            addCriterion("tbr_remark >", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_remark >=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThan(String value) {
            addCriterion("tbr_remark <", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbr_remark <=", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkLike(String value) {
            addCriterion("tbr_remark like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotLike(String value) {
            addCriterion("tbr_remark not like", value, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkIn(List<String> values) {
            addCriterion("tbr_remark in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotIn(List<String> values) {
            addCriterion("tbr_remark not in", values, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkBetween(String value1, String value2) {
            addCriterion("tbr_remark between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrRemarkNotBetween(String value1, String value2) {
            addCriterion("tbr_remark not between", value1, value2, "tbrRemark");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNull() {
            addCriterion("tbr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIsNotNull() {
            addCriterion("tbr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeEqualTo(Date value) {
            addCriterion("tbr_update_time =", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbr_update_time <>", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThan(Date value) {
            addCriterion("tbr_update_time >", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time >=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThan(Date value) {
            addCriterion("tbr_update_time <", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_update_time <=", value, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeIn(List<Date> values) {
            addCriterion("tbr_update_time in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbr_update_time not in", values, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_update_time not between", value1, value2, "tbrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNull() {
            addCriterion("tbr_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIsNotNull() {
            addCriterion("tbr_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeEqualTo(Date value) {
            addCriterion("tbr_add_time =", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotEqualTo(Date value) {
            addCriterion("tbr_add_time <>", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThan(Date value) {
            addCriterion("tbr_add_time >", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time >=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThan(Date value) {
            addCriterion("tbr_add_time <", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_add_time <=", value, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeIn(List<Date> values) {
            addCriterion("tbr_add_time in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotIn(List<Date> values) {
            addCriterion("tbr_add_time not in", values, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_add_time not between", value1, value2, "tbrAddTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeIsNull() {
            addCriterion("tbr_ret_time is null");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeIsNotNull() {
            addCriterion("tbr_ret_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeEqualTo(Date value) {
            addCriterion("tbr_ret_time =", value, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeNotEqualTo(Date value) {
            addCriterion("tbr_ret_time <>", value, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeGreaterThan(Date value) {
            addCriterion("tbr_ret_time >", value, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbr_ret_time >=", value, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeLessThan(Date value) {
            addCriterion("tbr_ret_time <", value, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbr_ret_time <=", value, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeIn(List<Date> values) {
            addCriterion("tbr_ret_time in", values, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeNotIn(List<Date> values) {
            addCriterion("tbr_ret_time not in", values, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeBetween(Date value1, Date value2) {
            addCriterion("tbr_ret_time between", value1, value2, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrRetTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbr_ret_time not between", value1, value2, "tbrRetTime");
            return (Criteria) this;
        }

        public Criteria andTbrMessageIsNull() {
            addCriterion("tbr_message is null");
            return (Criteria) this;
        }

        public Criteria andTbrMessageIsNotNull() {
            addCriterion("tbr_message is not null");
            return (Criteria) this;
        }

        public Criteria andTbrMessageEqualTo(String value) {
            addCriterion("tbr_message =", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageNotEqualTo(String value) {
            addCriterion("tbr_message <>", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageGreaterThan(String value) {
            addCriterion("tbr_message >", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_message >=", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageLessThan(String value) {
            addCriterion("tbr_message <", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageLessThanOrEqualTo(String value) {
            addCriterion("tbr_message <=", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageLike(String value) {
            addCriterion("tbr_message like", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageNotLike(String value) {
            addCriterion("tbr_message not like", value, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageIn(List<String> values) {
            addCriterion("tbr_message in", values, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageNotIn(List<String> values) {
            addCriterion("tbr_message not in", values, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageBetween(String value1, String value2) {
            addCriterion("tbr_message between", value1, value2, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrMessageNotBetween(String value1, String value2) {
            addCriterion("tbr_message not between", value1, value2, "tbrMessage");
            return (Criteria) this;
        }

        public Criteria andTbrCodeIsNull() {
            addCriterion("tbr_code is null");
            return (Criteria) this;
        }

        public Criteria andTbrCodeIsNotNull() {
            addCriterion("tbr_code is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCodeEqualTo(String value) {
            addCriterion("tbr_code =", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeNotEqualTo(String value) {
            addCriterion("tbr_code <>", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeGreaterThan(String value) {
            addCriterion("tbr_code >", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_code >=", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeLessThan(String value) {
            addCriterion("tbr_code <", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeLessThanOrEqualTo(String value) {
            addCriterion("tbr_code <=", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeLike(String value) {
            addCriterion("tbr_code like", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeNotLike(String value) {
            addCriterion("tbr_code not like", value, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeIn(List<String> values) {
            addCriterion("tbr_code in", values, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeNotIn(List<String> values) {
            addCriterion("tbr_code not in", values, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeBetween(String value1, String value2) {
            addCriterion("tbr_code between", value1, value2, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrCodeNotBetween(String value1, String value2) {
            addCriterion("tbr_code not between", value1, value2, "tbrCode");
            return (Criteria) this;
        }

        public Criteria andTbrResultIsNull() {
            addCriterion("tbr_result is null");
            return (Criteria) this;
        }

        public Criteria andTbrResultIsNotNull() {
            addCriterion("tbr_result is not null");
            return (Criteria) this;
        }

        public Criteria andTbrResultEqualTo(String value) {
            addCriterion("tbr_result =", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultNotEqualTo(String value) {
            addCriterion("tbr_result <>", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultGreaterThan(String value) {
            addCriterion("tbr_result >", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_result >=", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultLessThan(String value) {
            addCriterion("tbr_result <", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultLessThanOrEqualTo(String value) {
            addCriterion("tbr_result <=", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultLike(String value) {
            addCriterion("tbr_result like", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultNotLike(String value) {
            addCriterion("tbr_result not like", value, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultIn(List<String> values) {
            addCriterion("tbr_result in", values, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultNotIn(List<String> values) {
            addCriterion("tbr_result not in", values, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultBetween(String value1, String value2) {
            addCriterion("tbr_result between", value1, value2, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrResultNotBetween(String value1, String value2) {
            addCriterion("tbr_result not between", value1, value2, "tbrResult");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNull() {
            addCriterion("tbr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNotNull() {
            addCriterion("tbr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusEqualTo(Byte value) {
            addCriterion("tbr_status =", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotEqualTo(Byte value) {
            addCriterion("tbr_status <>", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThan(Byte value) {
            addCriterion("tbr_status >", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_status >=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThan(Byte value) {
            addCriterion("tbr_status <", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_status <=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIn(List<Byte> values) {
            addCriterion("tbr_status in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotIn(List<Byte> values) {
            addCriterion("tbr_status not in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbr_status between", value1, value2, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_status not between", value1, value2, "tbrStatus");
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