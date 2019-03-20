package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UpgradeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpgradeLogExample() {
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

        public Criteria andTbulIdIsNull() {
            addCriterion("tbul_id is null");
            return (Criteria) this;
        }

        public Criteria andTbulIdIsNotNull() {
            addCriterion("tbul_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbulIdEqualTo(Integer value) {
            addCriterion("tbul_id =", value, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdNotEqualTo(Integer value) {
            addCriterion("tbul_id <>", value, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdGreaterThan(Integer value) {
            addCriterion("tbul_id >", value, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbul_id >=", value, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdLessThan(Integer value) {
            addCriterion("tbul_id <", value, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbul_id <=", value, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdIn(List<Integer> values) {
            addCriterion("tbul_id in", values, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdNotIn(List<Integer> values) {
            addCriterion("tbul_id not in", values, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdBetween(Integer value1, Integer value2) {
            addCriterion("tbul_id between", value1, value2, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbul_id not between", value1, value2, "tbulId");
            return (Criteria) this;
        }

        public Criteria andTbulTitleIsNull() {
            addCriterion("tbul_title is null");
            return (Criteria) this;
        }

        public Criteria andTbulTitleIsNotNull() {
            addCriterion("tbul_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbulTitleEqualTo(String value) {
            addCriterion("tbul_title =", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleNotEqualTo(String value) {
            addCriterion("tbul_title <>", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleGreaterThan(String value) {
            addCriterion("tbul_title >", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbul_title >=", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleLessThan(String value) {
            addCriterion("tbul_title <", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleLessThanOrEqualTo(String value) {
            addCriterion("tbul_title <=", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleLike(String value) {
            addCriterion("tbul_title like", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleNotLike(String value) {
            addCriterion("tbul_title not like", value, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleIn(List<String> values) {
            addCriterion("tbul_title in", values, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleNotIn(List<String> values) {
            addCriterion("tbul_title not in", values, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleBetween(String value1, String value2) {
            addCriterion("tbul_title between", value1, value2, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTitleNotBetween(String value1, String value2) {
            addCriterion("tbul_title not between", value1, value2, "tbulTitle");
            return (Criteria) this;
        }

        public Criteria andTbulTypeIsNull() {
            addCriterion("tbul_type is null");
            return (Criteria) this;
        }

        public Criteria andTbulTypeIsNotNull() {
            addCriterion("tbul_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbulTypeEqualTo(Byte value) {
            addCriterion("tbul_type =", value, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeNotEqualTo(Byte value) {
            addCriterion("tbul_type <>", value, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeGreaterThan(Byte value) {
            addCriterion("tbul_type >", value, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbul_type >=", value, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeLessThan(Byte value) {
            addCriterion("tbul_type <", value, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbul_type <=", value, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeIn(List<Byte> values) {
            addCriterion("tbul_type in", values, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeNotIn(List<Byte> values) {
            addCriterion("tbul_type not in", values, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbul_type between", value1, value2, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbul_type not between", value1, value2, "tbulType");
            return (Criteria) this;
        }

        public Criteria andTbulVersionIsNull() {
            addCriterion("tbul_version is null");
            return (Criteria) this;
        }

        public Criteria andTbulVersionIsNotNull() {
            addCriterion("tbul_version is not null");
            return (Criteria) this;
        }

        public Criteria andTbulVersionEqualTo(String value) {
            addCriterion("tbul_version =", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionNotEqualTo(String value) {
            addCriterion("tbul_version <>", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionGreaterThan(String value) {
            addCriterion("tbul_version >", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionGreaterThanOrEqualTo(String value) {
            addCriterion("tbul_version >=", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionLessThan(String value) {
            addCriterion("tbul_version <", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionLessThanOrEqualTo(String value) {
            addCriterion("tbul_version <=", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionLike(String value) {
            addCriterion("tbul_version like", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionNotLike(String value) {
            addCriterion("tbul_version not like", value, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionIn(List<String> values) {
            addCriterion("tbul_version in", values, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionNotIn(List<String> values) {
            addCriterion("tbul_version not in", values, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionBetween(String value1, String value2) {
            addCriterion("tbul_version between", value1, value2, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulVersionNotBetween(String value1, String value2) {
            addCriterion("tbul_version not between", value1, value2, "tbulVersion");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeIsNull() {
            addCriterion("tbul_describe is null");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeIsNotNull() {
            addCriterion("tbul_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeEqualTo(String value) {
            addCriterion("tbul_describe =", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeNotEqualTo(String value) {
            addCriterion("tbul_describe <>", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeGreaterThan(String value) {
            addCriterion("tbul_describe >", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("tbul_describe >=", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeLessThan(String value) {
            addCriterion("tbul_describe <", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeLessThanOrEqualTo(String value) {
            addCriterion("tbul_describe <=", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeLike(String value) {
            addCriterion("tbul_describe like", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeNotLike(String value) {
            addCriterion("tbul_describe not like", value, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeIn(List<String> values) {
            addCriterion("tbul_describe in", values, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeNotIn(List<String> values) {
            addCriterion("tbul_describe not in", values, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeBetween(String value1, String value2) {
            addCriterion("tbul_describe between", value1, value2, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulDescribeNotBetween(String value1, String value2) {
            addCriterion("tbul_describe not between", value1, value2, "tbulDescribe");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeIsNull() {
            addCriterion("tbul_on_time is null");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeIsNotNull() {
            addCriterion("tbul_on_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("tbul_on_time =", value, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbul_on_time <>", value, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tbul_on_time >", value, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbul_on_time >=", value, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeLessThan(Date value) {
            addCriterionForJDBCDate("tbul_on_time <", value, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbul_on_time <=", value, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tbul_on_time in", values, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbul_on_time not in", values, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbul_on_time between", value1, value2, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulOnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbul_on_time not between", value1, value2, "tbulOnTime");
            return (Criteria) this;
        }

        public Criteria andTbulAdderIsNull() {
            addCriterion("tbul_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbulAdderIsNotNull() {
            addCriterion("tbul_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbulAdderEqualTo(Integer value) {
            addCriterion("tbul_adder =", value, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderNotEqualTo(Integer value) {
            addCriterion("tbul_adder <>", value, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderGreaterThan(Integer value) {
            addCriterion("tbul_adder >", value, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbul_adder >=", value, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderLessThan(Integer value) {
            addCriterion("tbul_adder <", value, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderLessThanOrEqualTo(Integer value) {
            addCriterion("tbul_adder <=", value, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderIn(List<Integer> values) {
            addCriterion("tbul_adder in", values, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderNotIn(List<Integer> values) {
            addCriterion("tbul_adder not in", values, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderBetween(Integer value1, Integer value2) {
            addCriterion("tbul_adder between", value1, value2, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulAdderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbul_adder not between", value1, value2, "tbulAdder");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeIsNull() {
            addCriterion("tbul_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeIsNotNull() {
            addCriterion("tbul_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeEqualTo(Date value) {
            addCriterion("tbul_update_time =", value, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbul_update_time <>", value, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeGreaterThan(Date value) {
            addCriterion("tbul_update_time >", value, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbul_update_time >=", value, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeLessThan(Date value) {
            addCriterion("tbul_update_time <", value, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbul_update_time <=", value, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeIn(List<Date> values) {
            addCriterion("tbul_update_time in", values, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbul_update_time not in", values, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbul_update_time between", value1, value2, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbul_update_time not between", value1, value2, "tbulUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeIsNull() {
            addCriterion("tbul_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeIsNotNull() {
            addCriterion("tbul_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeEqualTo(Date value) {
            addCriterion("tbul_add_time =", value, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeNotEqualTo(Date value) {
            addCriterion("tbul_add_time <>", value, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeGreaterThan(Date value) {
            addCriterion("tbul_add_time >", value, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbul_add_time >=", value, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeLessThan(Date value) {
            addCriterion("tbul_add_time <", value, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbul_add_time <=", value, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeIn(List<Date> values) {
            addCriterion("tbul_add_time in", values, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeNotIn(List<Date> values) {
            addCriterion("tbul_add_time not in", values, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbul_add_time between", value1, value2, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbul_add_time not between", value1, value2, "tbulAddTime");
            return (Criteria) this;
        }

        public Criteria andTbulStatusIsNull() {
            addCriterion("tbul_status is null");
            return (Criteria) this;
        }

        public Criteria andTbulStatusIsNotNull() {
            addCriterion("tbul_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbulStatusEqualTo(Byte value) {
            addCriterion("tbul_status =", value, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusNotEqualTo(Byte value) {
            addCriterion("tbul_status <>", value, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusGreaterThan(Byte value) {
            addCriterion("tbul_status >", value, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbul_status >=", value, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusLessThan(Byte value) {
            addCriterion("tbul_status <", value, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbul_status <=", value, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusIn(List<Byte> values) {
            addCriterion("tbul_status in", values, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusNotIn(List<Byte> values) {
            addCriterion("tbul_status not in", values, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbul_status between", value1, value2, "tbulStatus");
            return (Criteria) this;
        }

        public Criteria andTbulStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbul_status not between", value1, value2, "tbulStatus");
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