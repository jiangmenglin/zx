package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongInstructionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongInstructionsExample() {
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

        public Criteria andTbliIdIsNull() {
            addCriterion("tbli_id is null");
            return (Criteria) this;
        }

        public Criteria andTbliIdIsNotNull() {
            addCriterion("tbli_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbliIdEqualTo(Long value) {
            addCriterion("tbli_id =", value, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdNotEqualTo(Long value) {
            addCriterion("tbli_id <>", value, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdGreaterThan(Long value) {
            addCriterion("tbli_id >", value, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbli_id >=", value, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdLessThan(Long value) {
            addCriterion("tbli_id <", value, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdLessThanOrEqualTo(Long value) {
            addCriterion("tbli_id <=", value, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdIn(List<Long> values) {
            addCriterion("tbli_id in", values, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdNotIn(List<Long> values) {
            addCriterion("tbli_id not in", values, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdBetween(Long value1, Long value2) {
            addCriterion("tbli_id between", value1, value2, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliIdNotBetween(Long value1, Long value2) {
            addCriterion("tbli_id not between", value1, value2, "tbliId");
            return (Criteria) this;
        }

        public Criteria andTbliHostIsNull() {
            addCriterion("tbli_host is null");
            return (Criteria) this;
        }

        public Criteria andTbliHostIsNotNull() {
            addCriterion("tbli_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbliHostEqualTo(Long value) {
            addCriterion("tbli_host =", value, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostNotEqualTo(Long value) {
            addCriterion("tbli_host <>", value, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostGreaterThan(Long value) {
            addCriterion("tbli_host >", value, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbli_host >=", value, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostLessThan(Long value) {
            addCriterion("tbli_host <", value, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostLessThanOrEqualTo(Long value) {
            addCriterion("tbli_host <=", value, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostIn(List<Long> values) {
            addCriterion("tbli_host in", values, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostNotIn(List<Long> values) {
            addCriterion("tbli_host not in", values, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostBetween(Long value1, Long value2) {
            addCriterion("tbli_host between", value1, value2, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliHostNotBetween(Long value1, Long value2) {
            addCriterion("tbli_host not between", value1, value2, "tbliHost");
            return (Criteria) this;
        }

        public Criteria andTbliNameIsNull() {
            addCriterion("tbli_name is null");
            return (Criteria) this;
        }

        public Criteria andTbliNameIsNotNull() {
            addCriterion("tbli_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbliNameEqualTo(String value) {
            addCriterion("tbli_name =", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameNotEqualTo(String value) {
            addCriterion("tbli_name <>", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameGreaterThan(String value) {
            addCriterion("tbli_name >", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbli_name >=", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameLessThan(String value) {
            addCriterion("tbli_name <", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameLessThanOrEqualTo(String value) {
            addCriterion("tbli_name <=", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameLike(String value) {
            addCriterion("tbli_name like", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameNotLike(String value) {
            addCriterion("tbli_name not like", value, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameIn(List<String> values) {
            addCriterion("tbli_name in", values, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameNotIn(List<String> values) {
            addCriterion("tbli_name not in", values, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameBetween(String value1, String value2) {
            addCriterion("tbli_name between", value1, value2, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliNameNotBetween(String value1, String value2) {
            addCriterion("tbli_name not between", value1, value2, "tbliName");
            return (Criteria) this;
        }

        public Criteria andTbliflagIsNull() {
            addCriterion("tbliFlag is null");
            return (Criteria) this;
        }

        public Criteria andTbliflagIsNotNull() {
            addCriterion("tbliFlag is not null");
            return (Criteria) this;
        }

        public Criteria andTbliflagEqualTo(String value) {
            addCriterion("tbliFlag =", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagNotEqualTo(String value) {
            addCriterion("tbliFlag <>", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagGreaterThan(String value) {
            addCriterion("tbliFlag >", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagGreaterThanOrEqualTo(String value) {
            addCriterion("tbliFlag >=", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagLessThan(String value) {
            addCriterion("tbliFlag <", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagLessThanOrEqualTo(String value) {
            addCriterion("tbliFlag <=", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagLike(String value) {
            addCriterion("tbliFlag like", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagNotLike(String value) {
            addCriterion("tbliFlag not like", value, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagIn(List<String> values) {
            addCriterion("tbliFlag in", values, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagNotIn(List<String> values) {
            addCriterion("tbliFlag not in", values, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagBetween(String value1, String value2) {
            addCriterion("tbliFlag between", value1, value2, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliflagNotBetween(String value1, String value2) {
            addCriterion("tbliFlag not between", value1, value2, "tbliflag");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeIsNull() {
            addCriterion("tbli_describe is null");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeIsNotNull() {
            addCriterion("tbli_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeEqualTo(String value) {
            addCriterion("tbli_describe =", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeNotEqualTo(String value) {
            addCriterion("tbli_describe <>", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeGreaterThan(String value) {
            addCriterion("tbli_describe >", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("tbli_describe >=", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeLessThan(String value) {
            addCriterion("tbli_describe <", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeLessThanOrEqualTo(String value) {
            addCriterion("tbli_describe <=", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeLike(String value) {
            addCriterion("tbli_describe like", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeNotLike(String value) {
            addCriterion("tbli_describe not like", value, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeIn(List<String> values) {
            addCriterion("tbli_describe in", values, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeNotIn(List<String> values) {
            addCriterion("tbli_describe not in", values, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeBetween(String value1, String value2) {
            addCriterion("tbli_describe between", value1, value2, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliDescribeNotBetween(String value1, String value2) {
            addCriterion("tbli_describe not between", value1, value2, "tbliDescribe");
            return (Criteria) this;
        }

        public Criteria andTbliNumberIsNull() {
            addCriterion("tbli_number is null");
            return (Criteria) this;
        }

        public Criteria andTbliNumberIsNotNull() {
            addCriterion("tbli_number is not null");
            return (Criteria) this;
        }

        public Criteria andTbliNumberEqualTo(String value) {
            addCriterion("tbli_number =", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberNotEqualTo(String value) {
            addCriterion("tbli_number <>", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberGreaterThan(String value) {
            addCriterion("tbli_number >", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tbli_number >=", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberLessThan(String value) {
            addCriterion("tbli_number <", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberLessThanOrEqualTo(String value) {
            addCriterion("tbli_number <=", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberLike(String value) {
            addCriterion("tbli_number like", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberNotLike(String value) {
            addCriterion("tbli_number not like", value, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberIn(List<String> values) {
            addCriterion("tbli_number in", values, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberNotIn(List<String> values) {
            addCriterion("tbli_number not in", values, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberBetween(String value1, String value2) {
            addCriterion("tbli_number between", value1, value2, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliNumberNotBetween(String value1, String value2) {
            addCriterion("tbli_number not between", value1, value2, "tbliNumber");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeIsNull() {
            addCriterion("tbli_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeIsNotNull() {
            addCriterion("tbli_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeEqualTo(Date value) {
            addCriterion("tbli_add_time =", value, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeNotEqualTo(Date value) {
            addCriterion("tbli_add_time <>", value, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeGreaterThan(Date value) {
            addCriterion("tbli_add_time >", value, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbli_add_time >=", value, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeLessThan(Date value) {
            addCriterion("tbli_add_time <", value, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbli_add_time <=", value, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeIn(List<Date> values) {
            addCriterion("tbli_add_time in", values, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeNotIn(List<Date> values) {
            addCriterion("tbli_add_time not in", values, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbli_add_time between", value1, value2, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbli_add_time not between", value1, value2, "tbliAddTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeIsNull() {
            addCriterion("tbli_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeIsNotNull() {
            addCriterion("tbli_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeEqualTo(Date value) {
            addCriterion("tbli_update_time =", value, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbli_update_time <>", value, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeGreaterThan(Date value) {
            addCriterion("tbli_update_time >", value, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbli_update_time >=", value, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeLessThan(Date value) {
            addCriterion("tbli_update_time <", value, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbli_update_time <=", value, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeIn(List<Date> values) {
            addCriterion("tbli_update_time in", values, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbli_update_time not in", values, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbli_update_time between", value1, value2, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbli_update_time not between", value1, value2, "tbliUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbliStatusIsNull() {
            addCriterion("tbli_status is null");
            return (Criteria) this;
        }

        public Criteria andTbliStatusIsNotNull() {
            addCriterion("tbli_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbliStatusEqualTo(Short value) {
            addCriterion("tbli_status =", value, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusNotEqualTo(Short value) {
            addCriterion("tbli_status <>", value, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusGreaterThan(Short value) {
            addCriterion("tbli_status >", value, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbli_status >=", value, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusLessThan(Short value) {
            addCriterion("tbli_status <", value, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbli_status <=", value, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusIn(List<Short> values) {
            addCriterion("tbli_status in", values, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusNotIn(List<Short> values) {
            addCriterion("tbli_status not in", values, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusBetween(Short value1, Short value2) {
            addCriterion("tbli_status between", value1, value2, "tbliStatus");
            return (Criteria) this;
        }

        public Criteria andTbliStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbli_status not between", value1, value2, "tbliStatus");
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