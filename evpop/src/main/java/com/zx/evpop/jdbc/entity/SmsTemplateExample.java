package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsTemplateExample() {
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

        public Criteria andTbstIdIsNull() {
            addCriterion("tbst_id is null");
            return (Criteria) this;
        }

        public Criteria andTbstIdIsNotNull() {
            addCriterion("tbst_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbstIdEqualTo(Integer value) {
            addCriterion("tbst_id =", value, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdNotEqualTo(Integer value) {
            addCriterion("tbst_id <>", value, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdGreaterThan(Integer value) {
            addCriterion("tbst_id >", value, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbst_id >=", value, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdLessThan(Integer value) {
            addCriterion("tbst_id <", value, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbst_id <=", value, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdIn(List<Integer> values) {
            addCriterion("tbst_id in", values, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdNotIn(List<Integer> values) {
            addCriterion("tbst_id not in", values, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdBetween(Integer value1, Integer value2) {
            addCriterion("tbst_id between", value1, value2, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbst_id not between", value1, value2, "tbstId");
            return (Criteria) this;
        }

        public Criteria andTbstHostIsNull() {
            addCriterion("tbst_host is null");
            return (Criteria) this;
        }

        public Criteria andTbstHostIsNotNull() {
            addCriterion("tbst_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbstHostEqualTo(Integer value) {
            addCriterion("tbst_host =", value, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostNotEqualTo(Integer value) {
            addCriterion("tbst_host <>", value, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostGreaterThan(Integer value) {
            addCriterion("tbst_host >", value, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbst_host >=", value, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostLessThan(Integer value) {
            addCriterion("tbst_host <", value, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostLessThanOrEqualTo(Integer value) {
            addCriterion("tbst_host <=", value, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostIn(List<Integer> values) {
            addCriterion("tbst_host in", values, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostNotIn(List<Integer> values) {
            addCriterion("tbst_host not in", values, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostBetween(Integer value1, Integer value2) {
            addCriterion("tbst_host between", value1, value2, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstHostNotBetween(Integer value1, Integer value2) {
            addCriterion("tbst_host not between", value1, value2, "tbstHost");
            return (Criteria) this;
        }

        public Criteria andTbstNameIsNull() {
            addCriterion("tbst_name is null");
            return (Criteria) this;
        }

        public Criteria andTbstNameIsNotNull() {
            addCriterion("tbst_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbstNameEqualTo(String value) {
            addCriterion("tbst_name =", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameNotEqualTo(String value) {
            addCriterion("tbst_name <>", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameGreaterThan(String value) {
            addCriterion("tbst_name >", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbst_name >=", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameLessThan(String value) {
            addCriterion("tbst_name <", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameLessThanOrEqualTo(String value) {
            addCriterion("tbst_name <=", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameLike(String value) {
            addCriterion("tbst_name like", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameNotLike(String value) {
            addCriterion("tbst_name not like", value, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameIn(List<String> values) {
            addCriterion("tbst_name in", values, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameNotIn(List<String> values) {
            addCriterion("tbst_name not in", values, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameBetween(String value1, String value2) {
            addCriterion("tbst_name between", value1, value2, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstNameNotBetween(String value1, String value2) {
            addCriterion("tbst_name not between", value1, value2, "tbstName");
            return (Criteria) this;
        }

        public Criteria andTbstContentIsNull() {
            addCriterion("tbst_content is null");
            return (Criteria) this;
        }

        public Criteria andTbstContentIsNotNull() {
            addCriterion("tbst_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbstContentEqualTo(String value) {
            addCriterion("tbst_content =", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentNotEqualTo(String value) {
            addCriterion("tbst_content <>", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentGreaterThan(String value) {
            addCriterion("tbst_content >", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbst_content >=", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentLessThan(String value) {
            addCriterion("tbst_content <", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentLessThanOrEqualTo(String value) {
            addCriterion("tbst_content <=", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentLike(String value) {
            addCriterion("tbst_content like", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentNotLike(String value) {
            addCriterion("tbst_content not like", value, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentIn(List<String> values) {
            addCriterion("tbst_content in", values, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentNotIn(List<String> values) {
            addCriterion("tbst_content not in", values, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentBetween(String value1, String value2) {
            addCriterion("tbst_content between", value1, value2, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstContentNotBetween(String value1, String value2) {
            addCriterion("tbst_content not between", value1, value2, "tbstContent");
            return (Criteria) this;
        }

        public Criteria andTbstTypeIsNull() {
            addCriterion("tbst_type is null");
            return (Criteria) this;
        }

        public Criteria andTbstTypeIsNotNull() {
            addCriterion("tbst_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbstTypeEqualTo(Byte value) {
            addCriterion("tbst_type =", value, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeNotEqualTo(Byte value) {
            addCriterion("tbst_type <>", value, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeGreaterThan(Byte value) {
            addCriterion("tbst_type >", value, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbst_type >=", value, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeLessThan(Byte value) {
            addCriterion("tbst_type <", value, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbst_type <=", value, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeIn(List<Byte> values) {
            addCriterion("tbst_type in", values, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeNotIn(List<Byte> values) {
            addCriterion("tbst_type not in", values, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbst_type between", value1, value2, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbst_type not between", value1, value2, "tbstType");
            return (Criteria) this;
        }

        public Criteria andTbstFlagIsNull() {
            addCriterion("tbst_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbstFlagIsNotNull() {
            addCriterion("tbst_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbstFlagEqualTo(String value) {
            addCriterion("tbst_flag =", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagNotEqualTo(String value) {
            addCriterion("tbst_flag <>", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagGreaterThan(String value) {
            addCriterion("tbst_flag >", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbst_flag >=", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagLessThan(String value) {
            addCriterion("tbst_flag <", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagLessThanOrEqualTo(String value) {
            addCriterion("tbst_flag <=", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagLike(String value) {
            addCriterion("tbst_flag like", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagNotLike(String value) {
            addCriterion("tbst_flag not like", value, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagIn(List<String> values) {
            addCriterion("tbst_flag in", values, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagNotIn(List<String> values) {
            addCriterion("tbst_flag not in", values, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagBetween(String value1, String value2) {
            addCriterion("tbst_flag between", value1, value2, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstFlagNotBetween(String value1, String value2) {
            addCriterion("tbst_flag not between", value1, value2, "tbstFlag");
            return (Criteria) this;
        }

        public Criteria andTbstEditorIsNull() {
            addCriterion("tbst_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbstEditorIsNotNull() {
            addCriterion("tbst_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbstEditorEqualTo(Integer value) {
            addCriterion("tbst_editor =", value, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorNotEqualTo(Integer value) {
            addCriterion("tbst_editor <>", value, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorGreaterThan(Integer value) {
            addCriterion("tbst_editor >", value, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbst_editor >=", value, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorLessThan(Integer value) {
            addCriterion("tbst_editor <", value, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbst_editor <=", value, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorIn(List<Integer> values) {
            addCriterion("tbst_editor in", values, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorNotIn(List<Integer> values) {
            addCriterion("tbst_editor not in", values, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbst_editor between", value1, value2, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbst_editor not between", value1, value2, "tbstEditor");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeIsNull() {
            addCriterion("tbst_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeIsNotNull() {
            addCriterion("tbst_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeEqualTo(Date value) {
            addCriterion("tbst_update_time =", value, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbst_update_time <>", value, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeGreaterThan(Date value) {
            addCriterion("tbst_update_time >", value, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbst_update_time >=", value, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeLessThan(Date value) {
            addCriterion("tbst_update_time <", value, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbst_update_time <=", value, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeIn(List<Date> values) {
            addCriterion("tbst_update_time in", values, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbst_update_time not in", values, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbst_update_time between", value1, value2, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbst_update_time not between", value1, value2, "tbstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeIsNull() {
            addCriterion("tbst_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeIsNotNull() {
            addCriterion("tbst_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeEqualTo(Date value) {
            addCriterion("tbst_add_time =", value, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeNotEqualTo(Date value) {
            addCriterion("tbst_add_time <>", value, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeGreaterThan(Date value) {
            addCriterion("tbst_add_time >", value, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbst_add_time >=", value, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeLessThan(Date value) {
            addCriterion("tbst_add_time <", value, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbst_add_time <=", value, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeIn(List<Date> values) {
            addCriterion("tbst_add_time in", values, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeNotIn(List<Date> values) {
            addCriterion("tbst_add_time not in", values, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbst_add_time between", value1, value2, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbst_add_time not between", value1, value2, "tbstAddTime");
            return (Criteria) this;
        }

        public Criteria andTbstStatusIsNull() {
            addCriterion("tbst_status is null");
            return (Criteria) this;
        }

        public Criteria andTbstStatusIsNotNull() {
            addCriterion("tbst_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbstStatusEqualTo(Byte value) {
            addCriterion("tbst_status =", value, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusNotEqualTo(Byte value) {
            addCriterion("tbst_status <>", value, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusGreaterThan(Byte value) {
            addCriterion("tbst_status >", value, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbst_status >=", value, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusLessThan(Byte value) {
            addCriterion("tbst_status <", value, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbst_status <=", value, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusIn(List<Byte> values) {
            addCriterion("tbst_status in", values, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusNotIn(List<Byte> values) {
            addCriterion("tbst_status not in", values, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbst_status between", value1, value2, "tbstStatus");
            return (Criteria) this;
        }

        public Criteria andTbstStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbst_status not between", value1, value2, "tbstStatus");
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