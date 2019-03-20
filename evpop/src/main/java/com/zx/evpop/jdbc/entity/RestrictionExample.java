package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RestrictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RestrictionExample() {
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

        public Criteria andTbrHostEqualTo(Long value) {
            addCriterion("tbr_host =", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotEqualTo(Long value) {
            addCriterion("tbr_host <>", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThan(Long value) {
            addCriterion("tbr_host >", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbr_host >=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThan(Long value) {
            addCriterion("tbr_host <", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostLessThanOrEqualTo(Long value) {
            addCriterion("tbr_host <=", value, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostIn(List<Long> values) {
            addCriterion("tbr_host in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotIn(List<Long> values) {
            addCriterion("tbr_host not in", values, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostBetween(Long value1, Long value2) {
            addCriterion("tbr_host between", value1, value2, "tbrHost");
            return (Criteria) this;
        }

        public Criteria andTbrHostNotBetween(Long value1, Long value2) {
            addCriterion("tbr_host not between", value1, value2, "tbrHost");
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

        public Criteria andTbrCarTypeIsNull() {
            addCriterion("tbr_car_type is null");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeIsNotNull() {
            addCriterion("tbr_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeEqualTo(String value) {
            addCriterion("tbr_car_type =", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeNotEqualTo(String value) {
            addCriterion("tbr_car_type <>", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeGreaterThan(String value) {
            addCriterion("tbr_car_type >", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_car_type >=", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeLessThan(String value) {
            addCriterion("tbr_car_type <", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeLessThanOrEqualTo(String value) {
            addCriterion("tbr_car_type <=", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeLike(String value) {
            addCriterion("tbr_car_type like", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeNotLike(String value) {
            addCriterion("tbr_car_type not like", value, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeIn(List<String> values) {
            addCriterion("tbr_car_type in", values, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeNotIn(List<String> values) {
            addCriterion("tbr_car_type not in", values, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeBetween(String value1, String value2) {
            addCriterion("tbr_car_type between", value1, value2, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrCarTypeNotBetween(String value1, String value2) {
            addCriterion("tbr_car_type not between", value1, value2, "tbrCarType");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartIsNull() {
            addCriterion("tbr_rest_time_start is null");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartIsNotNull() {
            addCriterion("tbr_rest_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartEqualTo(String value) {
            addCriterion("tbr_rest_time_start =", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartNotEqualTo(String value) {
            addCriterion("tbr_rest_time_start <>", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartGreaterThan(String value) {
            addCriterion("tbr_rest_time_start >", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_rest_time_start >=", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartLessThan(String value) {
            addCriterion("tbr_rest_time_start <", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartLessThanOrEqualTo(String value) {
            addCriterion("tbr_rest_time_start <=", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartLike(String value) {
            addCriterion("tbr_rest_time_start like", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartNotLike(String value) {
            addCriterion("tbr_rest_time_start not like", value, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartIn(List<String> values) {
            addCriterion("tbr_rest_time_start in", values, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartNotIn(List<String> values) {
            addCriterion("tbr_rest_time_start not in", values, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartBetween(String value1, String value2) {
            addCriterion("tbr_rest_time_start between", value1, value2, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeStartNotBetween(String value1, String value2) {
            addCriterion("tbr_rest_time_start not between", value1, value2, "tbrRestTimeStart");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndIsNull() {
            addCriterion("tbr_rest_time_end is null");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndIsNotNull() {
            addCriterion("tbr_rest_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndEqualTo(String value) {
            addCriterion("tbr_rest_time_end =", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndNotEqualTo(String value) {
            addCriterion("tbr_rest_time_end <>", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndGreaterThan(String value) {
            addCriterion("tbr_rest_time_end >", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_rest_time_end >=", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndLessThan(String value) {
            addCriterion("tbr_rest_time_end <", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndLessThanOrEqualTo(String value) {
            addCriterion("tbr_rest_time_end <=", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndLike(String value) {
            addCriterion("tbr_rest_time_end like", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndNotLike(String value) {
            addCriterion("tbr_rest_time_end not like", value, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndIn(List<String> values) {
            addCriterion("tbr_rest_time_end in", values, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndNotIn(List<String> values) {
            addCriterion("tbr_rest_time_end not in", values, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndBetween(String value1, String value2) {
            addCriterion("tbr_rest_time_end between", value1, value2, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrRestTimeEndNotBetween(String value1, String value2) {
            addCriterion("tbr_rest_time_end not between", value1, value2, "tbrRestTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartIsNull() {
            addCriterion("tbr_duration_start is null");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartIsNotNull() {
            addCriterion("tbr_duration_start is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_start =", value, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_start <>", value, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartGreaterThan(Date value) {
            addCriterionForJDBCDate("tbr_duration_start >", value, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_start >=", value, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartLessThan(Date value) {
            addCriterionForJDBCDate("tbr_duration_start <", value, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_start <=", value, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_duration_start in", values, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_duration_start not in", values, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_duration_start between", value1, value2, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_duration_start not between", value1, value2, "tbrDurationStart");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndIsNull() {
            addCriterion("tbr_duration_end is null");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndIsNotNull() {
            addCriterion("tbr_duration_end is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_end =", value, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_end <>", value, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndGreaterThan(Date value) {
            addCriterionForJDBCDate("tbr_duration_end >", value, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_end >=", value, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndLessThan(Date value) {
            addCriterionForJDBCDate("tbr_duration_end <", value, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbr_duration_end <=", value, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_duration_end in", values, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbr_duration_end not in", values, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_duration_end between", value1, value2, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrDurationEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbr_duration_end not between", value1, value2, "tbrDurationEnd");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextIsNull() {
            addCriterion("tbr_area_text is null");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextIsNotNull() {
            addCriterion("tbr_area_text is not null");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextEqualTo(String value) {
            addCriterion("tbr_area_text =", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextNotEqualTo(String value) {
            addCriterion("tbr_area_text <>", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextGreaterThan(String value) {
            addCriterion("tbr_area_text >", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_area_text >=", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextLessThan(String value) {
            addCriterion("tbr_area_text <", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextLessThanOrEqualTo(String value) {
            addCriterion("tbr_area_text <=", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextLike(String value) {
            addCriterion("tbr_area_text like", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextNotLike(String value) {
            addCriterion("tbr_area_text not like", value, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextIn(List<String> values) {
            addCriterion("tbr_area_text in", values, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextNotIn(List<String> values) {
            addCriterion("tbr_area_text not in", values, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextBetween(String value1, String value2) {
            addCriterion("tbr_area_text between", value1, value2, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrAreaTextNotBetween(String value1, String value2) {
            addCriterion("tbr_area_text not between", value1, value2, "tbrAreaText");
            return (Criteria) this;
        }

        public Criteria andTbrRulesIsNull() {
            addCriterion("tbr_rules is null");
            return (Criteria) this;
        }

        public Criteria andTbrRulesIsNotNull() {
            addCriterion("tbr_rules is not null");
            return (Criteria) this;
        }

        public Criteria andTbrRulesEqualTo(String value) {
            addCriterion("tbr_rules =", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesNotEqualTo(String value) {
            addCriterion("tbr_rules <>", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesGreaterThan(String value) {
            addCriterion("tbr_rules >", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesGreaterThanOrEqualTo(String value) {
            addCriterion("tbr_rules >=", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesLessThan(String value) {
            addCriterion("tbr_rules <", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesLessThanOrEqualTo(String value) {
            addCriterion("tbr_rules <=", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesLike(String value) {
            addCriterion("tbr_rules like", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesNotLike(String value) {
            addCriterion("tbr_rules not like", value, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesIn(List<String> values) {
            addCriterion("tbr_rules in", values, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesNotIn(List<String> values) {
            addCriterion("tbr_rules not in", values, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesBetween(String value1, String value2) {
            addCriterion("tbr_rules between", value1, value2, "tbrRules");
            return (Criteria) this;
        }

        public Criteria andTbrRulesNotBetween(String value1, String value2) {
            addCriterion("tbr_rules not between", value1, value2, "tbrRules");
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