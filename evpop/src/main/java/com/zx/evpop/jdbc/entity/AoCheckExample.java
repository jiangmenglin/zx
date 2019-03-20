package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AoCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AoCheckExample() {
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

        public Criteria andTbacIdIsNull() {
            addCriterion("tbac_id is null");
            return (Criteria) this;
        }

        public Criteria andTbacIdIsNotNull() {
            addCriterion("tbac_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbacIdEqualTo(Integer value) {
            addCriterion("tbac_id =", value, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdNotEqualTo(Integer value) {
            addCriterion("tbac_id <>", value, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdGreaterThan(Integer value) {
            addCriterion("tbac_id >", value, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbac_id >=", value, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdLessThan(Integer value) {
            addCriterion("tbac_id <", value, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbac_id <=", value, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdIn(List<Integer> values) {
            addCriterion("tbac_id in", values, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdNotIn(List<Integer> values) {
            addCriterion("tbac_id not in", values, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdBetween(Integer value1, Integer value2) {
            addCriterion("tbac_id between", value1, value2, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbac_id not between", value1, value2, "tbacId");
            return (Criteria) this;
        }

        public Criteria andTbacTitleIsNull() {
            addCriterion("tbac_title is null");
            return (Criteria) this;
        }

        public Criteria andTbacTitleIsNotNull() {
            addCriterion("tbac_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbacTitleEqualTo(String value) {
            addCriterion("tbac_title =", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleNotEqualTo(String value) {
            addCriterion("tbac_title <>", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleGreaterThan(String value) {
            addCriterion("tbac_title >", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbac_title >=", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleLessThan(String value) {
            addCriterion("tbac_title <", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleLessThanOrEqualTo(String value) {
            addCriterion("tbac_title <=", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleLike(String value) {
            addCriterion("tbac_title like", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleNotLike(String value) {
            addCriterion("tbac_title not like", value, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleIn(List<String> values) {
            addCriterion("tbac_title in", values, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleNotIn(List<String> values) {
            addCriterion("tbac_title not in", values, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleBetween(String value1, String value2) {
            addCriterion("tbac_title between", value1, value2, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacTitleNotBetween(String value1, String value2) {
            addCriterion("tbac_title not between", value1, value2, "tbacTitle");
            return (Criteria) this;
        }

        public Criteria andTbacUserIsNull() {
            addCriterion("tbac_user is null");
            return (Criteria) this;
        }

        public Criteria andTbacUserIsNotNull() {
            addCriterion("tbac_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbacUserEqualTo(Integer value) {
            addCriterion("tbac_user =", value, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserNotEqualTo(Integer value) {
            addCriterion("tbac_user <>", value, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserGreaterThan(Integer value) {
            addCriterion("tbac_user >", value, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbac_user >=", value, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserLessThan(Integer value) {
            addCriterion("tbac_user <", value, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserLessThanOrEqualTo(Integer value) {
            addCriterion("tbac_user <=", value, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserIn(List<Integer> values) {
            addCriterion("tbac_user in", values, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserNotIn(List<Integer> values) {
            addCriterion("tbac_user not in", values, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserBetween(Integer value1, Integer value2) {
            addCriterion("tbac_user between", value1, value2, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacUserNotBetween(Integer value1, Integer value2) {
            addCriterion("tbac_user not between", value1, value2, "tbacUser");
            return (Criteria) this;
        }

        public Criteria andTbacInPosIsNull() {
            addCriterion("tbac_in_pos is null");
            return (Criteria) this;
        }

        public Criteria andTbacInPosIsNotNull() {
            addCriterion("tbac_in_pos is not null");
            return (Criteria) this;
        }

        public Criteria andTbacInPosEqualTo(String value) {
            addCriterion("tbac_in_pos =", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosNotEqualTo(String value) {
            addCriterion("tbac_in_pos <>", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosGreaterThan(String value) {
            addCriterion("tbac_in_pos >", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosGreaterThanOrEqualTo(String value) {
            addCriterion("tbac_in_pos >=", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosLessThan(String value) {
            addCriterion("tbac_in_pos <", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosLessThanOrEqualTo(String value) {
            addCriterion("tbac_in_pos <=", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosLike(String value) {
            addCriterion("tbac_in_pos like", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosNotLike(String value) {
            addCriterion("tbac_in_pos not like", value, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosIn(List<String> values) {
            addCriterion("tbac_in_pos in", values, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosNotIn(List<String> values) {
            addCriterion("tbac_in_pos not in", values, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosBetween(String value1, String value2) {
            addCriterion("tbac_in_pos between", value1, value2, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInPosNotBetween(String value1, String value2) {
            addCriterion("tbac_in_pos not between", value1, value2, "tbacInPos");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressIsNull() {
            addCriterion("tbac_in_address is null");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressIsNotNull() {
            addCriterion("tbac_in_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressEqualTo(String value) {
            addCriterion("tbac_in_address =", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressNotEqualTo(String value) {
            addCriterion("tbac_in_address <>", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressGreaterThan(String value) {
            addCriterion("tbac_in_address >", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbac_in_address >=", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressLessThan(String value) {
            addCriterion("tbac_in_address <", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressLessThanOrEqualTo(String value) {
            addCriterion("tbac_in_address <=", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressLike(String value) {
            addCriterion("tbac_in_address like", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressNotLike(String value) {
            addCriterion("tbac_in_address not like", value, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressIn(List<String> values) {
            addCriterion("tbac_in_address in", values, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressNotIn(List<String> values) {
            addCriterion("tbac_in_address not in", values, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressBetween(String value1, String value2) {
            addCriterion("tbac_in_address between", value1, value2, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInAddressNotBetween(String value1, String value2) {
            addCriterion("tbac_in_address not between", value1, value2, "tbacInAddress");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeIsNull() {
            addCriterion("tbac_in_time is null");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeIsNotNull() {
            addCriterion("tbac_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeEqualTo(Date value) {
            addCriterion("tbac_in_time =", value, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeNotEqualTo(Date value) {
            addCriterion("tbac_in_time <>", value, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeGreaterThan(Date value) {
            addCriterion("tbac_in_time >", value, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbac_in_time >=", value, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeLessThan(Date value) {
            addCriterion("tbac_in_time <", value, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbac_in_time <=", value, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeIn(List<Date> values) {
            addCriterion("tbac_in_time in", values, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeNotIn(List<Date> values) {
            addCriterion("tbac_in_time not in", values, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeBetween(Date value1, Date value2) {
            addCriterion("tbac_in_time between", value1, value2, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacInTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbac_in_time not between", value1, value2, "tbacInTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosIsNull() {
            addCriterion("tbac_out_pos is null");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosIsNotNull() {
            addCriterion("tbac_out_pos is not null");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosEqualTo(String value) {
            addCriterion("tbac_out_pos =", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosNotEqualTo(String value) {
            addCriterion("tbac_out_pos <>", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosGreaterThan(String value) {
            addCriterion("tbac_out_pos >", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosGreaterThanOrEqualTo(String value) {
            addCriterion("tbac_out_pos >=", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosLessThan(String value) {
            addCriterion("tbac_out_pos <", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosLessThanOrEqualTo(String value) {
            addCriterion("tbac_out_pos <=", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosLike(String value) {
            addCriterion("tbac_out_pos like", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosNotLike(String value) {
            addCriterion("tbac_out_pos not like", value, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosIn(List<String> values) {
            addCriterion("tbac_out_pos in", values, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosNotIn(List<String> values) {
            addCriterion("tbac_out_pos not in", values, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosBetween(String value1, String value2) {
            addCriterion("tbac_out_pos between", value1, value2, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutPosNotBetween(String value1, String value2) {
            addCriterion("tbac_out_pos not between", value1, value2, "tbacOutPos");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressIsNull() {
            addCriterion("tbac_out_address is null");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressIsNotNull() {
            addCriterion("tbac_out_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressEqualTo(String value) {
            addCriterion("tbac_out_address =", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressNotEqualTo(String value) {
            addCriterion("tbac_out_address <>", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressGreaterThan(String value) {
            addCriterion("tbac_out_address >", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbac_out_address >=", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressLessThan(String value) {
            addCriterion("tbac_out_address <", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressLessThanOrEqualTo(String value) {
            addCriterion("tbac_out_address <=", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressLike(String value) {
            addCriterion("tbac_out_address like", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressNotLike(String value) {
            addCriterion("tbac_out_address not like", value, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressIn(List<String> values) {
            addCriterion("tbac_out_address in", values, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressNotIn(List<String> values) {
            addCriterion("tbac_out_address not in", values, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressBetween(String value1, String value2) {
            addCriterion("tbac_out_address between", value1, value2, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutAddressNotBetween(String value1, String value2) {
            addCriterion("tbac_out_address not between", value1, value2, "tbacOutAddress");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeIsNull() {
            addCriterion("tbac_out_time is null");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeIsNotNull() {
            addCriterion("tbac_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeEqualTo(Date value) {
            addCriterion("tbac_out_time =", value, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeNotEqualTo(Date value) {
            addCriterion("tbac_out_time <>", value, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeGreaterThan(Date value) {
            addCriterion("tbac_out_time >", value, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbac_out_time >=", value, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeLessThan(Date value) {
            addCriterion("tbac_out_time <", value, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbac_out_time <=", value, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeIn(List<Date> values) {
            addCriterion("tbac_out_time in", values, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeNotIn(List<Date> values) {
            addCriterion("tbac_out_time not in", values, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeBetween(Date value1, Date value2) {
            addCriterion("tbac_out_time between", value1, value2, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbac_out_time not between", value1, value2, "tbacOutTime");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongIsNull() {
            addCriterion("tbac_time_long is null");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongIsNotNull() {
            addCriterion("tbac_time_long is not null");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongEqualTo(Integer value) {
            addCriterion("tbac_time_long =", value, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongNotEqualTo(Integer value) {
            addCriterion("tbac_time_long <>", value, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongGreaterThan(Integer value) {
            addCriterion("tbac_time_long >", value, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbac_time_long >=", value, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongLessThan(Integer value) {
            addCriterion("tbac_time_long <", value, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongLessThanOrEqualTo(Integer value) {
            addCriterion("tbac_time_long <=", value, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongIn(List<Integer> values) {
            addCriterion("tbac_time_long in", values, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongNotIn(List<Integer> values) {
            addCriterion("tbac_time_long not in", values, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongBetween(Integer value1, Integer value2) {
            addCriterion("tbac_time_long between", value1, value2, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacTimeLongNotBetween(Integer value1, Integer value2) {
            addCriterion("tbac_time_long not between", value1, value2, "tbacTimeLong");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkIsNull() {
            addCriterion("tbac_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkIsNotNull() {
            addCriterion("tbac_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkEqualTo(String value) {
            addCriterion("tbac_remark =", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkNotEqualTo(String value) {
            addCriterion("tbac_remark <>", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkGreaterThan(String value) {
            addCriterion("tbac_remark >", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbac_remark >=", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkLessThan(String value) {
            addCriterion("tbac_remark <", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbac_remark <=", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkLike(String value) {
            addCriterion("tbac_remark like", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkNotLike(String value) {
            addCriterion("tbac_remark not like", value, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkIn(List<String> values) {
            addCriterion("tbac_remark in", values, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkNotIn(List<String> values) {
            addCriterion("tbac_remark not in", values, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkBetween(String value1, String value2) {
            addCriterion("tbac_remark between", value1, value2, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacRemarkNotBetween(String value1, String value2) {
            addCriterion("tbac_remark not between", value1, value2, "tbacRemark");
            return (Criteria) this;
        }

        public Criteria andTbacStatusIsNull() {
            addCriterion("tbac_status is null");
            return (Criteria) this;
        }

        public Criteria andTbacStatusIsNotNull() {
            addCriterion("tbac_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbacStatusEqualTo(Byte value) {
            addCriterion("tbac_status =", value, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusNotEqualTo(Byte value) {
            addCriterion("tbac_status <>", value, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusGreaterThan(Byte value) {
            addCriterion("tbac_status >", value, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbac_status >=", value, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusLessThan(Byte value) {
            addCriterion("tbac_status <", value, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbac_status <=", value, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusIn(List<Byte> values) {
            addCriterion("tbac_status in", values, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusNotIn(List<Byte> values) {
            addCriterion("tbac_status not in", values, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbac_status between", value1, value2, "tbacStatus");
            return (Criteria) this;
        }

        public Criteria andTbacStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbac_status not between", value1, value2, "tbacStatus");
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