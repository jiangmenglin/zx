package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeExample() {
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

        public Criteria andTbrNameIsNull() {
            addCriterion("tbr_name is null");
            return (Criteria) this;
        }

        public Criteria andTbrNameIsNotNull() {
            addCriterion("tbr_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbrNameEqualTo(String value) {
            addCriterion("tbr_name =", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotEqualTo(String value) {
            addCriterion("tbr_name <>", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameGreaterThan(String value) {
            addCriterion("tbr_name >", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_name >=", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLessThan(String value) {
            addCriterion("tbr_name <", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLessThanOrEqualTo(String value) {
            addCriterion("tbr_name <=", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameLike(String value) {
            addCriterion("tbr_name like", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotLike(String value) {
            addCriterion("tbr_name not like", value, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameIn(List<String> values) {
            addCriterion("tbr_name in", values, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotIn(List<String> values) {
            addCriterion("tbr_name not in", values, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameBetween(String value1, String value2) {
            addCriterion("tbr_name between", value1, value2, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrNameNotBetween(String value1, String value2) {
            addCriterion("tbr_name not between", value1, value2, "tbrName");
            return (Criteria) this;
        }

        public Criteria andTbrFlgIsNull() {
            addCriterion("tbr_flg is null");
            return (Criteria) this;
        }

        public Criteria andTbrFlgIsNotNull() {
            addCriterion("tbr_flg is not null");
            return (Criteria) this;
        }

        public Criteria andTbrFlgEqualTo(Byte value) {
            addCriterion("tbr_flg =", value, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgNotEqualTo(Byte value) {
            addCriterion("tbr_flg <>", value, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgGreaterThan(Byte value) {
            addCriterion("tbr_flg >", value, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbr_flg >=", value, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgLessThan(Byte value) {
            addCriterion("tbr_flg <", value, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgLessThanOrEqualTo(Byte value) {
            addCriterion("tbr_flg <=", value, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgIn(List<Byte> values) {
            addCriterion("tbr_flg in", values, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgNotIn(List<Byte> values) {
            addCriterion("tbr_flg not in", values, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgBetween(Byte value1, Byte value2) {
            addCriterion("tbr_flg between", value1, value2, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrFlgNotBetween(Byte value1, Byte value2) {
            addCriterion("tbr_flg not between", value1, value2, "tbrFlg");
            return (Criteria) this;
        }

        public Criteria andTbrContentIsNull() {
            addCriterion("tbr_content is null");
            return (Criteria) this;
        }

        public Criteria andTbrContentIsNotNull() {
            addCriterion("tbr_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbrContentEqualTo(String value) {
            addCriterion("tbr_content =", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentNotEqualTo(String value) {
            addCriterion("tbr_content <>", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentGreaterThan(String value) {
            addCriterion("tbr_content >", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_content >=", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentLessThan(String value) {
            addCriterion("tbr_content <", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentLessThanOrEqualTo(String value) {
            addCriterion("tbr_content <=", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentLike(String value) {
            addCriterion("tbr_content like", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentNotLike(String value) {
            addCriterion("tbr_content not like", value, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentIn(List<String> values) {
            addCriterion("tbr_content in", values, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentNotIn(List<String> values) {
            addCriterion("tbr_content not in", values, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentBetween(String value1, String value2) {
            addCriterion("tbr_content between", value1, value2, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrContentNotBetween(String value1, String value2) {
            addCriterion("tbr_content not between", value1, value2, "tbrContent");
            return (Criteria) this;
        }

        public Criteria andTbrListIsNull() {
            addCriterion("tbr_list is null");
            return (Criteria) this;
        }

        public Criteria andTbrListIsNotNull() {
            addCriterion("tbr_list is not null");
            return (Criteria) this;
        }

        public Criteria andTbrListEqualTo(String value) {
            addCriterion("tbr_list =", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListNotEqualTo(String value) {
            addCriterion("tbr_list <>", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListGreaterThan(String value) {
            addCriterion("tbr_list >", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_list >=", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListLessThan(String value) {
            addCriterion("tbr_list <", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListLessThanOrEqualTo(String value) {
            addCriterion("tbr_list <=", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListLike(String value) {
            addCriterion("tbr_list like", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListNotLike(String value) {
            addCriterion("tbr_list not like", value, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListIn(List<String> values) {
            addCriterion("tbr_list in", values, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListNotIn(List<String> values) {
            addCriterion("tbr_list not in", values, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListBetween(String value1, String value2) {
            addCriterion("tbr_list between", value1, value2, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrListNotBetween(String value1, String value2) {
            addCriterion("tbr_list not between", value1, value2, "tbrList");
            return (Criteria) this;
        }

        public Criteria andTbrRatioIsNull() {
            addCriterion("tbr_ratio is null");
            return (Criteria) this;
        }

        public Criteria andTbrRatioIsNotNull() {
            addCriterion("tbr_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRatioEqualTo(Double value) {
            addCriterion("tbr_ratio =", value, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioNotEqualTo(Double value) {
            addCriterion("tbr_ratio <>", value, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioGreaterThan(Double value) {
            addCriterion("tbr_ratio >", value, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("tbr_ratio >=", value, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioLessThan(Double value) {
            addCriterion("tbr_ratio <", value, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioLessThanOrEqualTo(Double value) {
            addCriterion("tbr_ratio <=", value, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioIn(List<Double> values) {
            addCriterion("tbr_ratio in", values, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioNotIn(List<Double> values) {
            addCriterion("tbr_ratio not in", values, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioBetween(Double value1, Double value2) {
            addCriterion("tbr_ratio between", value1, value2, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrRatioNotBetween(Double value1, Double value2) {
            addCriterion("tbr_ratio not between", value1, value2, "tbrRatio");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserIsNull() {
            addCriterion("tbr_update_user is null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserIsNotNull() {
            addCriterion("tbr_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserEqualTo(Long value) {
            addCriterion("tbr_update_user =", value, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserNotEqualTo(Long value) {
            addCriterion("tbr_update_user <>", value, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserGreaterThan(Long value) {
            addCriterion("tbr_update_user >", value, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_update_user >=", value, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserLessThan(Long value) {
            addCriterion("tbr_update_user <", value, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("tbr_update_user <=", value, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserIn(List<Long> values) {
            addCriterion("tbr_update_user in", values, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserNotIn(List<Long> values) {
            addCriterion("tbr_update_user not in", values, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserBetween(Long value1, Long value2) {
            addCriterion("tbr_update_user between", value1, value2, "tbrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andTbrUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("tbr_update_user not between", value1, value2, "tbrUpdateUser");
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

        public Criteria andTbrAddUserIsNull() {
            addCriterion("tbr_add_user is null");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserIsNotNull() {
            addCriterion("tbr_add_user is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserEqualTo(Long value) {
            addCriterion("tbr_add_user =", value, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserNotEqualTo(Long value) {
            addCriterion("tbr_add_user <>", value, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserGreaterThan(Long value) {
            addCriterion("tbr_add_user >", value, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_add_user >=", value, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserLessThan(Long value) {
            addCriterion("tbr_add_user <", value, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserLessThanOrEqualTo(Long value) {
            addCriterion("tbr_add_user <=", value, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserIn(List<Long> values) {
            addCriterion("tbr_add_user in", values, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserNotIn(List<Long> values) {
            addCriterion("tbr_add_user not in", values, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserBetween(Long value1, Long value2) {
            addCriterion("tbr_add_user between", value1, value2, "tbrAddUser");
            return (Criteria) this;
        }

        public Criteria andTbrAddUserNotBetween(Long value1, Long value2) {
            addCriterion("tbr_add_user not between", value1, value2, "tbrAddUser");
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

        public Criteria andTbrStatusIsNull() {
            addCriterion("tbr_status is null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIsNotNull() {
            addCriterion("tbr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbrStatusEqualTo(Short value) {
            addCriterion("tbr_status =", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotEqualTo(Short value) {
            addCriterion("tbr_status <>", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThan(Short value) {
            addCriterion("tbr_status >", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbr_status >=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThan(Short value) {
            addCriterion("tbr_status <", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbr_status <=", value, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusIn(List<Short> values) {
            addCriterion("tbr_status in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotIn(List<Short> values) {
            addCriterion("tbr_status not in", values, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusBetween(Short value1, Short value2) {
            addCriterion("tbr_status between", value1, value2, "tbrStatus");
            return (Criteria) this;
        }

        public Criteria andTbrStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbr_status not between", value1, value2, "tbrStatus");
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