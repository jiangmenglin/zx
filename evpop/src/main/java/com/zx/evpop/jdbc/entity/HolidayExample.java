package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HolidayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolidayExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTbhIdIsNull() {
            addCriterion("tbh_id is null");
            return (Criteria) this;
        }

        public Criteria andTbhIdIsNotNull() {
            addCriterion("tbh_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbhIdEqualTo(Long value) {
            addCriterion("tbh_id =", value, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdNotEqualTo(Long value) {
            addCriterion("tbh_id <>", value, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdGreaterThan(Long value) {
            addCriterion("tbh_id >", value, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbh_id >=", value, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdLessThan(Long value) {
            addCriterion("tbh_id <", value, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdLessThanOrEqualTo(Long value) {
            addCriterion("tbh_id <=", value, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdIn(List<Long> values) {
            addCriterion("tbh_id in", values, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdNotIn(List<Long> values) {
            addCriterion("tbh_id not in", values, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdBetween(Long value1, Long value2) {
            addCriterion("tbh_id between", value1, value2, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhIdNotBetween(Long value1, Long value2) {
            addCriterion("tbh_id not between", value1, value2, "tbhId");
            return (Criteria) this;
        }

        public Criteria andTbhHostIsNull() {
            addCriterion("tbh_host is null");
            return (Criteria) this;
        }

        public Criteria andTbhHostIsNotNull() {
            addCriterion("tbh_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbhHostEqualTo(Long value) {
            addCriterion("tbh_host =", value, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostNotEqualTo(Long value) {
            addCriterion("tbh_host <>", value, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostGreaterThan(Long value) {
            addCriterion("tbh_host >", value, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbh_host >=", value, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostLessThan(Long value) {
            addCriterion("tbh_host <", value, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostLessThanOrEqualTo(Long value) {
            addCriterion("tbh_host <=", value, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostIn(List<Long> values) {
            addCriterion("tbh_host in", values, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostNotIn(List<Long> values) {
            addCriterion("tbh_host not in", values, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostBetween(Long value1, Long value2) {
            addCriterion("tbh_host between", value1, value2, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhHostNotBetween(Long value1, Long value2) {
            addCriterion("tbh_host not between", value1, value2, "tbhHost");
            return (Criteria) this;
        }

        public Criteria andTbhNameIsNull() {
            addCriterion("tbh_name is null");
            return (Criteria) this;
        }

        public Criteria andTbhNameIsNotNull() {
            addCriterion("tbh_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbhNameEqualTo(String value) {
            addCriterion("tbh_name =", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameNotEqualTo(String value) {
            addCriterion("tbh_name <>", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameGreaterThan(String value) {
            addCriterion("tbh_name >", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbh_name >=", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameLessThan(String value) {
            addCriterion("tbh_name <", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameLessThanOrEqualTo(String value) {
            addCriterion("tbh_name <=", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameLike(String value) {
            addCriterion("tbh_name like", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameNotLike(String value) {
            addCriterion("tbh_name not like", value, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameIn(List<String> values) {
            addCriterion("tbh_name in", values, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameNotIn(List<String> values) {
            addCriterion("tbh_name not in", values, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameBetween(String value1, String value2) {
            addCriterion("tbh_name between", value1, value2, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhNameNotBetween(String value1, String value2) {
            addCriterion("tbh_name not between", value1, value2, "tbhName");
            return (Criteria) this;
        }

        public Criteria andTbhDateIsNull() {
            addCriterion("tbh_date is null");
            return (Criteria) this;
        }

        public Criteria andTbhDateIsNotNull() {
            addCriterion("tbh_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbhDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbh_date =", value, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbh_date <>", value, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbh_date >", value, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbh_date >=", value, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateLessThan(Date value) {
            addCriterionForJDBCDate("tbh_date <", value, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbh_date <=", value, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbh_date in", values, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbh_date not in", values, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbh_date between", value1, value2, "tbhDate");
            return (Criteria) this;
        }

        public Criteria andTbhDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbh_date not between", value1, value2, "tbhDate");
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