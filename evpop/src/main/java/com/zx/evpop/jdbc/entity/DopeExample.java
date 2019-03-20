package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DopeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DopeExample() {
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

        public Criteria andTbdIdIsNull() {
            addCriterion("tbd_id is null");
            return (Criteria) this;
        }

        public Criteria andTbdIdIsNotNull() {
            addCriterion("tbd_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbdIdEqualTo(Long value) {
            addCriterion("tbd_id =", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdNotEqualTo(Long value) {
            addCriterion("tbd_id <>", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdGreaterThan(Long value) {
            addCriterion("tbd_id >", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbd_id >=", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdLessThan(Long value) {
            addCriterion("tbd_id <", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdLessThanOrEqualTo(Long value) {
            addCriterion("tbd_id <=", value, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdIn(List<Long> values) {
            addCriterion("tbd_id in", values, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdNotIn(List<Long> values) {
            addCriterion("tbd_id not in", values, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdBetween(Long value1, Long value2) {
            addCriterion("tbd_id between", value1, value2, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdIdNotBetween(Long value1, Long value2) {
            addCriterion("tbd_id not between", value1, value2, "tbdId");
            return (Criteria) this;
        }

        public Criteria andTbdContentIsNull() {
            addCriterion("tbd_content is null");
            return (Criteria) this;
        }

        public Criteria andTbdContentIsNotNull() {
            addCriterion("tbd_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbdContentEqualTo(String value) {
            addCriterion("tbd_content =", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentNotEqualTo(String value) {
            addCriterion("tbd_content <>", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentGreaterThan(String value) {
            addCriterion("tbd_content >", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbd_content >=", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentLessThan(String value) {
            addCriterion("tbd_content <", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentLessThanOrEqualTo(String value) {
            addCriterion("tbd_content <=", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentLike(String value) {
            addCriterion("tbd_content like", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentNotLike(String value) {
            addCriterion("tbd_content not like", value, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentIn(List<String> values) {
            addCriterion("tbd_content in", values, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentNotIn(List<String> values) {
            addCriterion("tbd_content not in", values, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentBetween(String value1, String value2) {
            addCriterion("tbd_content between", value1, value2, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdContentNotBetween(String value1, String value2) {
            addCriterion("tbd_content not between", value1, value2, "tbdContent");
            return (Criteria) this;
        }

        public Criteria andTbdManageIsNull() {
            addCriterion("tbd_manage is null");
            return (Criteria) this;
        }

        public Criteria andTbdManageIsNotNull() {
            addCriterion("tbd_manage is not null");
            return (Criteria) this;
        }

        public Criteria andTbdManageEqualTo(Integer value) {
            addCriterion("tbd_manage =", value, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageNotEqualTo(Integer value) {
            addCriterion("tbd_manage <>", value, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageGreaterThan(Integer value) {
            addCriterion("tbd_manage >", value, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbd_manage >=", value, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageLessThan(Integer value) {
            addCriterion("tbd_manage <", value, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageLessThanOrEqualTo(Integer value) {
            addCriterion("tbd_manage <=", value, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageIn(List<Integer> values) {
            addCriterion("tbd_manage in", values, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageNotIn(List<Integer> values) {
            addCriterion("tbd_manage not in", values, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageBetween(Integer value1, Integer value2) {
            addCriterion("tbd_manage between", value1, value2, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdManageNotBetween(Integer value1, Integer value2) {
            addCriterion("tbd_manage not between", value1, value2, "tbdManage");
            return (Criteria) this;
        }

        public Criteria andTbdNameIsNull() {
            addCriterion("tbd_name is null");
            return (Criteria) this;
        }

        public Criteria andTbdNameIsNotNull() {
            addCriterion("tbd_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbdNameEqualTo(String value) {
            addCriterion("tbd_name =", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameNotEqualTo(String value) {
            addCriterion("tbd_name <>", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameGreaterThan(String value) {
            addCriterion("tbd_name >", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbd_name >=", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameLessThan(String value) {
            addCriterion("tbd_name <", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameLessThanOrEqualTo(String value) {
            addCriterion("tbd_name <=", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameLike(String value) {
            addCriterion("tbd_name like", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameNotLike(String value) {
            addCriterion("tbd_name not like", value, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameIn(List<String> values) {
            addCriterion("tbd_name in", values, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameNotIn(List<String> values) {
            addCriterion("tbd_name not in", values, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameBetween(String value1, String value2) {
            addCriterion("tbd_name between", value1, value2, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdNameNotBetween(String value1, String value2) {
            addCriterion("tbd_name not between", value1, value2, "tbdName");
            return (Criteria) this;
        }

        public Criteria andTbdTaskIsNull() {
            addCriterion("tbd_task is null");
            return (Criteria) this;
        }

        public Criteria andTbdTaskIsNotNull() {
            addCriterion("tbd_task is not null");
            return (Criteria) this;
        }

        public Criteria andTbdTaskEqualTo(Long value) {
            addCriterion("tbd_task =", value, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskNotEqualTo(Long value) {
            addCriterion("tbd_task <>", value, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskGreaterThan(Long value) {
            addCriterion("tbd_task >", value, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskGreaterThanOrEqualTo(Long value) {
            addCriterion("tbd_task >=", value, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskLessThan(Long value) {
            addCriterion("tbd_task <", value, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskLessThanOrEqualTo(Long value) {
            addCriterion("tbd_task <=", value, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskIn(List<Long> values) {
            addCriterion("tbd_task in", values, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskNotIn(List<Long> values) {
            addCriterion("tbd_task not in", values, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskBetween(Long value1, Long value2) {
            addCriterion("tbd_task between", value1, value2, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdTaskNotBetween(Long value1, Long value2) {
            addCriterion("tbd_task not between", value1, value2, "tbdTask");
            return (Criteria) this;
        }

        public Criteria andTbdFlagIsNull() {
            addCriterion("tbd_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbdFlagIsNotNull() {
            addCriterion("tbd_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbdFlagEqualTo(String value) {
            addCriterion("tbd_flag =", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagNotEqualTo(String value) {
            addCriterion("tbd_flag <>", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagGreaterThan(String value) {
            addCriterion("tbd_flag >", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbd_flag >=", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagLessThan(String value) {
            addCriterion("tbd_flag <", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagLessThanOrEqualTo(String value) {
            addCriterion("tbd_flag <=", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagLike(String value) {
            addCriterion("tbd_flag like", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagNotLike(String value) {
            addCriterion("tbd_flag not like", value, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagIn(List<String> values) {
            addCriterion("tbd_flag in", values, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagNotIn(List<String> values) {
            addCriterion("tbd_flag not in", values, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagBetween(String value1, String value2) {
            addCriterion("tbd_flag between", value1, value2, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdFlagNotBetween(String value1, String value2) {
            addCriterion("tbd_flag not between", value1, value2, "tbdFlag");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkIsNull() {
            addCriterion("tbd_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkIsNotNull() {
            addCriterion("tbd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkEqualTo(String value) {
            addCriterion("tbd_remark =", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkNotEqualTo(String value) {
            addCriterion("tbd_remark <>", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkGreaterThan(String value) {
            addCriterion("tbd_remark >", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbd_remark >=", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkLessThan(String value) {
            addCriterion("tbd_remark <", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbd_remark <=", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkLike(String value) {
            addCriterion("tbd_remark like", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkNotLike(String value) {
            addCriterion("tbd_remark not like", value, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkIn(List<String> values) {
            addCriterion("tbd_remark in", values, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkNotIn(List<String> values) {
            addCriterion("tbd_remark not in", values, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkBetween(String value1, String value2) {
            addCriterion("tbd_remark between", value1, value2, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdRemarkNotBetween(String value1, String value2) {
            addCriterion("tbd_remark not between", value1, value2, "tbdRemark");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeIsNull() {
            addCriterion("tbd_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeIsNotNull() {
            addCriterion("tbd_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeEqualTo(Date value) {
            addCriterion("tbd_update_time =", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbd_update_time <>", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeGreaterThan(Date value) {
            addCriterion("tbd_update_time >", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbd_update_time >=", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeLessThan(Date value) {
            addCriterion("tbd_update_time <", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbd_update_time <=", value, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeIn(List<Date> values) {
            addCriterion("tbd_update_time in", values, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbd_update_time not in", values, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbd_update_time between", value1, value2, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbd_update_time not between", value1, value2, "tbdUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeIsNull() {
            addCriterion("tbd_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeIsNotNull() {
            addCriterion("tbd_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeEqualTo(Date value) {
            addCriterion("tbd_add_time =", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeNotEqualTo(Date value) {
            addCriterion("tbd_add_time <>", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeGreaterThan(Date value) {
            addCriterion("tbd_add_time >", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbd_add_time >=", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeLessThan(Date value) {
            addCriterion("tbd_add_time <", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbd_add_time <=", value, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeIn(List<Date> values) {
            addCriterion("tbd_add_time in", values, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeNotIn(List<Date> values) {
            addCriterion("tbd_add_time not in", values, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbd_add_time between", value1, value2, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbd_add_time not between", value1, value2, "tbdAddTime");
            return (Criteria) this;
        }

        public Criteria andTbdStatusIsNull() {
            addCriterion("tbd_status is null");
            return (Criteria) this;
        }

        public Criteria andTbdStatusIsNotNull() {
            addCriterion("tbd_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbdStatusEqualTo(Byte value) {
            addCriterion("tbd_status =", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusNotEqualTo(Byte value) {
            addCriterion("tbd_status <>", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusGreaterThan(Byte value) {
            addCriterion("tbd_status >", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbd_status >=", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusLessThan(Byte value) {
            addCriterion("tbd_status <", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbd_status <=", value, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusIn(List<Byte> values) {
            addCriterion("tbd_status in", values, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusNotIn(List<Byte> values) {
            addCriterion("tbd_status not in", values, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbd_status between", value1, value2, "tbdStatus");
            return (Criteria) this;
        }

        public Criteria andTbdStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbd_status not between", value1, value2, "tbdStatus");
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