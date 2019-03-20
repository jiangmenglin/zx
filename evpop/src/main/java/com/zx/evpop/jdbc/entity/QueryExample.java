package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueryExample() {
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

        public Criteria andSqIdIsNull() {
            addCriterion("sq_id is null");
            return (Criteria) this;
        }

        public Criteria andSqIdIsNotNull() {
            addCriterion("sq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSqIdEqualTo(Long value) {
            addCriterion("sq_id =", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotEqualTo(Long value) {
            addCriterion("sq_id <>", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdGreaterThan(Long value) {
            addCriterion("sq_id >", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sq_id >=", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLessThan(Long value) {
            addCriterion("sq_id <", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLessThanOrEqualTo(Long value) {
            addCriterion("sq_id <=", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdIn(List<Long> values) {
            addCriterion("sq_id in", values, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotIn(List<Long> values) {
            addCriterion("sq_id not in", values, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdBetween(Long value1, Long value2) {
            addCriterion("sq_id between", value1, value2, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotBetween(Long value1, Long value2) {
            addCriterion("sq_id not between", value1, value2, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqNameIsNull() {
            addCriterion("sq_name is null");
            return (Criteria) this;
        }

        public Criteria andSqNameIsNotNull() {
            addCriterion("sq_name is not null");
            return (Criteria) this;
        }

        public Criteria andSqNameEqualTo(String value) {
            addCriterion("sq_name =", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameNotEqualTo(String value) {
            addCriterion("sq_name <>", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameGreaterThan(String value) {
            addCriterion("sq_name >", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameGreaterThanOrEqualTo(String value) {
            addCriterion("sq_name >=", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameLessThan(String value) {
            addCriterion("sq_name <", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameLessThanOrEqualTo(String value) {
            addCriterion("sq_name <=", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameLike(String value) {
            addCriterion("sq_name like", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameNotLike(String value) {
            addCriterion("sq_name not like", value, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameIn(List<String> values) {
            addCriterion("sq_name in", values, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameNotIn(List<String> values) {
            addCriterion("sq_name not in", values, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameBetween(String value1, String value2) {
            addCriterion("sq_name between", value1, value2, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqNameNotBetween(String value1, String value2) {
            addCriterion("sq_name not between", value1, value2, "sqName");
            return (Criteria) this;
        }

        public Criteria andSqIconIsNull() {
            addCriterion("sq_icon is null");
            return (Criteria) this;
        }

        public Criteria andSqIconIsNotNull() {
            addCriterion("sq_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSqIconEqualTo(String value) {
            addCriterion("sq_icon =", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconNotEqualTo(String value) {
            addCriterion("sq_icon <>", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconGreaterThan(String value) {
            addCriterion("sq_icon >", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconGreaterThanOrEqualTo(String value) {
            addCriterion("sq_icon >=", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconLessThan(String value) {
            addCriterion("sq_icon <", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconLessThanOrEqualTo(String value) {
            addCriterion("sq_icon <=", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconLike(String value) {
            addCriterion("sq_icon like", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconNotLike(String value) {
            addCriterion("sq_icon not like", value, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconIn(List<String> values) {
            addCriterion("sq_icon in", values, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconNotIn(List<String> values) {
            addCriterion("sq_icon not in", values, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconBetween(String value1, String value2) {
            addCriterion("sq_icon between", value1, value2, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqIconNotBetween(String value1, String value2) {
            addCriterion("sq_icon not between", value1, value2, "sqIcon");
            return (Criteria) this;
        }

        public Criteria andSqPathIsNull() {
            addCriterion("sq_path is null");
            return (Criteria) this;
        }

        public Criteria andSqPathIsNotNull() {
            addCriterion("sq_path is not null");
            return (Criteria) this;
        }

        public Criteria andSqPathEqualTo(String value) {
            addCriterion("sq_path =", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathNotEqualTo(String value) {
            addCriterion("sq_path <>", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathGreaterThan(String value) {
            addCriterion("sq_path >", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathGreaterThanOrEqualTo(String value) {
            addCriterion("sq_path >=", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathLessThan(String value) {
            addCriterion("sq_path <", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathLessThanOrEqualTo(String value) {
            addCriterion("sq_path <=", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathLike(String value) {
            addCriterion("sq_path like", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathNotLike(String value) {
            addCriterion("sq_path not like", value, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathIn(List<String> values) {
            addCriterion("sq_path in", values, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathNotIn(List<String> values) {
            addCriterion("sq_path not in", values, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathBetween(String value1, String value2) {
            addCriterion("sq_path between", value1, value2, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqPathNotBetween(String value1, String value2) {
            addCriterion("sq_path not between", value1, value2, "sqPath");
            return (Criteria) this;
        }

        public Criteria andSqEditorIsNull() {
            addCriterion("sq_editor is null");
            return (Criteria) this;
        }

        public Criteria andSqEditorIsNotNull() {
            addCriterion("sq_editor is not null");
            return (Criteria) this;
        }

        public Criteria andSqEditorEqualTo(Long value) {
            addCriterion("sq_editor =", value, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorNotEqualTo(Long value) {
            addCriterion("sq_editor <>", value, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorGreaterThan(Long value) {
            addCriterion("sq_editor >", value, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorGreaterThanOrEqualTo(Long value) {
            addCriterion("sq_editor >=", value, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorLessThan(Long value) {
            addCriterion("sq_editor <", value, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorLessThanOrEqualTo(Long value) {
            addCriterion("sq_editor <=", value, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorIn(List<Long> values) {
            addCriterion("sq_editor in", values, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorNotIn(List<Long> values) {
            addCriterion("sq_editor not in", values, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorBetween(Long value1, Long value2) {
            addCriterion("sq_editor between", value1, value2, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqEditorNotBetween(Long value1, Long value2) {
            addCriterion("sq_editor not between", value1, value2, "sqEditor");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeIsNull() {
            addCriterion("sq_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeIsNotNull() {
            addCriterion("sq_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeEqualTo(Date value) {
            addCriterion("sq_update_time =", value, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeNotEqualTo(Date value) {
            addCriterion("sq_update_time <>", value, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeGreaterThan(Date value) {
            addCriterion("sq_update_time >", value, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sq_update_time >=", value, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeLessThan(Date value) {
            addCriterion("sq_update_time <", value, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sq_update_time <=", value, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeIn(List<Date> values) {
            addCriterion("sq_update_time in", values, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeNotIn(List<Date> values) {
            addCriterion("sq_update_time not in", values, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sq_update_time between", value1, value2, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sq_update_time not between", value1, value2, "sqUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeIsNull() {
            addCriterion("sq_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeIsNotNull() {
            addCriterion("sq_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeEqualTo(Date value) {
            addCriterion("sq_add_time =", value, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeNotEqualTo(Date value) {
            addCriterion("sq_add_time <>", value, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeGreaterThan(Date value) {
            addCriterion("sq_add_time >", value, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sq_add_time >=", value, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeLessThan(Date value) {
            addCriterion("sq_add_time <", value, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("sq_add_time <=", value, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeIn(List<Date> values) {
            addCriterion("sq_add_time in", values, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeNotIn(List<Date> values) {
            addCriterion("sq_add_time not in", values, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeBetween(Date value1, Date value2) {
            addCriterion("sq_add_time between", value1, value2, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("sq_add_time not between", value1, value2, "sqAddTime");
            return (Criteria) this;
        }

        public Criteria andSqStatusIsNull() {
            addCriterion("sq_status is null");
            return (Criteria) this;
        }

        public Criteria andSqStatusIsNotNull() {
            addCriterion("sq_status is not null");
            return (Criteria) this;
        }

        public Criteria andSqStatusEqualTo(Short value) {
            addCriterion("sq_status =", value, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusNotEqualTo(Short value) {
            addCriterion("sq_status <>", value, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusGreaterThan(Short value) {
            addCriterion("sq_status >", value, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sq_status >=", value, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusLessThan(Short value) {
            addCriterion("sq_status <", value, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusLessThanOrEqualTo(Short value) {
            addCriterion("sq_status <=", value, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusIn(List<Short> values) {
            addCriterion("sq_status in", values, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusNotIn(List<Short> values) {
            addCriterion("sq_status not in", values, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusBetween(Short value1, Short value2) {
            addCriterion("sq_status between", value1, value2, "sqStatus");
            return (Criteria) this;
        }

        public Criteria andSqStatusNotBetween(Short value1, Short value2) {
            addCriterion("sq_status not between", value1, value2, "sqStatus");
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