package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AnnualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnualExample() {
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

        public Criteria andTbaiIdIsNull() {
            addCriterion("tbai_id is null");
            return (Criteria) this;
        }

        public Criteria andTbaiIdIsNotNull() {
            addCriterion("tbai_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiIdEqualTo(Integer value) {
            addCriterion("tbai_id =", value, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdNotEqualTo(Integer value) {
            addCriterion("tbai_id <>", value, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdGreaterThan(Integer value) {
            addCriterion("tbai_id >", value, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbai_id >=", value, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdLessThan(Integer value) {
            addCriterion("tbai_id <", value, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbai_id <=", value, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdIn(List<Integer> values) {
            addCriterion("tbai_id in", values, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdNotIn(List<Integer> values) {
            addCriterion("tbai_id not in", values, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdBetween(Integer value1, Integer value2) {
            addCriterion("tbai_id between", value1, value2, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbai_id not between", value1, value2, "tbaiId");
            return (Criteria) this;
        }

        public Criteria andTbaiHostIsNull() {
            addCriterion("tbai_host is null");
            return (Criteria) this;
        }

        public Criteria andTbaiHostIsNotNull() {
            addCriterion("tbai_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiHostEqualTo(Short value) {
            addCriterion("tbai_host =", value, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostNotEqualTo(Short value) {
            addCriterion("tbai_host <>", value, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostGreaterThan(Short value) {
            addCriterion("tbai_host >", value, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbai_host >=", value, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostLessThan(Short value) {
            addCriterion("tbai_host <", value, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostLessThanOrEqualTo(Short value) {
            addCriterion("tbai_host <=", value, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostIn(List<Short> values) {
            addCriterion("tbai_host in", values, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostNotIn(List<Short> values) {
            addCriterion("tbai_host not in", values, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostBetween(Short value1, Short value2) {
            addCriterion("tbai_host between", value1, value2, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaiHostNotBetween(Short value1, Short value2) {
            addCriterion("tbai_host not between", value1, value2, "tbaiHost");
            return (Criteria) this;
        }

        public Criteria andTbaCarIsNull() {
            addCriterion("tba_car is null");
            return (Criteria) this;
        }

        public Criteria andTbaCarIsNotNull() {
            addCriterion("tba_car is not null");
            return (Criteria) this;
        }

        public Criteria andTbaCarEqualTo(Integer value) {
            addCriterion("tba_car =", value, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarNotEqualTo(Integer value) {
            addCriterion("tba_car <>", value, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarGreaterThan(Integer value) {
            addCriterion("tba_car >", value, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("tba_car >=", value, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarLessThan(Integer value) {
            addCriterion("tba_car <", value, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarLessThanOrEqualTo(Integer value) {
            addCriterion("tba_car <=", value, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarIn(List<Integer> values) {
            addCriterion("tba_car in", values, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarNotIn(List<Integer> values) {
            addCriterion("tba_car not in", values, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarBetween(Integer value1, Integer value2) {
            addCriterion("tba_car between", value1, value2, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaCarNotBetween(Integer value1, Integer value2) {
            addCriterion("tba_car not between", value1, value2, "tbaCar");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateIsNull() {
            addCriterion("tbai_annual_date is null");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateIsNotNull() {
            addCriterion("tbai_annual_date is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_date =", value, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_date <>", value, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tbai_annual_date >", value, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_date >=", value, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateLessThan(Date value) {
            addCriterionForJDBCDate("tbai_annual_date <", value, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_date <=", value, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateIn(List<Date> values) {
            addCriterionForJDBCDate("tbai_annual_date in", values, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbai_annual_date not in", values, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbai_annual_date between", value1, value2, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbai_annual_date not between", value1, value2, "tbaiAnnualDate");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealIsNull() {
            addCriterion("tbai_annual_real is null");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealIsNotNull() {
            addCriterion("tbai_annual_real is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_real =", value, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealNotEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_real <>", value, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealGreaterThan(Date value) {
            addCriterionForJDBCDate("tbai_annual_real >", value, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_real >=", value, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealLessThan(Date value) {
            addCriterionForJDBCDate("tbai_annual_real <", value, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tbai_annual_real <=", value, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealIn(List<Date> values) {
            addCriterionForJDBCDate("tbai_annual_real in", values, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealNotIn(List<Date> values) {
            addCriterionForJDBCDate("tbai_annual_real not in", values, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbai_annual_real between", value1, value2, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiAnnualRealNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tbai_annual_real not between", value1, value2, "tbaiAnnualReal");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorIsNull() {
            addCriterion("tbai_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorIsNotNull() {
            addCriterion("tbai_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorEqualTo(Integer value) {
            addCriterion("tbai_editor =", value, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorNotEqualTo(Integer value) {
            addCriterion("tbai_editor <>", value, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorGreaterThan(Integer value) {
            addCriterion("tbai_editor >", value, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbai_editor >=", value, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorLessThan(Integer value) {
            addCriterion("tbai_editor <", value, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbai_editor <=", value, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorIn(List<Integer> values) {
            addCriterion("tbai_editor in", values, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorNotIn(List<Integer> values) {
            addCriterion("tbai_editor not in", values, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbai_editor between", value1, value2, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbai_editor not between", value1, value2, "tbaiEditor");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeIsNull() {
            addCriterion("tbai_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeIsNotNull() {
            addCriterion("tbai_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeEqualTo(Date value) {
            addCriterion("tbai_update_time =", value, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbai_update_time <>", value, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeGreaterThan(Date value) {
            addCriterion("tbai_update_time >", value, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbai_update_time >=", value, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeLessThan(Date value) {
            addCriterion("tbai_update_time <", value, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbai_update_time <=", value, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeIn(List<Date> values) {
            addCriterion("tbai_update_time in", values, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbai_update_time not in", values, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbai_update_time between", value1, value2, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbai_update_time not between", value1, value2, "tbaiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeIsNull() {
            addCriterion("tbai_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeIsNotNull() {
            addCriterion("tbai_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeEqualTo(Date value) {
            addCriterion("tbai_add_time =", value, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeNotEqualTo(Date value) {
            addCriterion("tbai_add_time <>", value, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeGreaterThan(Date value) {
            addCriterion("tbai_add_time >", value, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbai_add_time >=", value, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeLessThan(Date value) {
            addCriterion("tbai_add_time <", value, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbai_add_time <=", value, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeIn(List<Date> values) {
            addCriterion("tbai_add_time in", values, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeNotIn(List<Date> values) {
            addCriterion("tbai_add_time not in", values, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbai_add_time between", value1, value2, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbai_add_time not between", value1, value2, "tbaiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkIsNull() {
            addCriterion("tbai_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkIsNotNull() {
            addCriterion("tbai_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkEqualTo(String value) {
            addCriterion("tbai_remark =", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkNotEqualTo(String value) {
            addCriterion("tbai_remark <>", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkGreaterThan(String value) {
            addCriterion("tbai_remark >", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbai_remark >=", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkLessThan(String value) {
            addCriterion("tbai_remark <", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbai_remark <=", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkLike(String value) {
            addCriterion("tbai_remark like", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkNotLike(String value) {
            addCriterion("tbai_remark not like", value, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkIn(List<String> values) {
            addCriterion("tbai_remark in", values, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkNotIn(List<String> values) {
            addCriterion("tbai_remark not in", values, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkBetween(String value1, String value2) {
            addCriterion("tbai_remark between", value1, value2, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiRemarkNotBetween(String value1, String value2) {
            addCriterion("tbai_remark not between", value1, value2, "tbaiRemark");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusIsNull() {
            addCriterion("tbai_status is null");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusIsNotNull() {
            addCriterion("tbai_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusEqualTo(Byte value) {
            addCriterion("tbai_status =", value, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusNotEqualTo(Byte value) {
            addCriterion("tbai_status <>", value, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusGreaterThan(Byte value) {
            addCriterion("tbai_status >", value, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbai_status >=", value, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusLessThan(Byte value) {
            addCriterion("tbai_status <", value, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbai_status <=", value, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusIn(List<Byte> values) {
            addCriterion("tbai_status in", values, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusNotIn(List<Byte> values) {
            addCriterion("tbai_status not in", values, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbai_status between", value1, value2, "tbaiStatus");
            return (Criteria) this;
        }

        public Criteria andTbaiStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbai_status not between", value1, value2, "tbaiStatus");
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