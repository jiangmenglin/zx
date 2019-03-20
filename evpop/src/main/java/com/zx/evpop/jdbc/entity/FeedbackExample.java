package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
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

        public Criteria andTbtfIdIsNull() {
            addCriterion("tbtf_id is null");
            return (Criteria) this;
        }

        public Criteria andTbtfIdIsNotNull() {
            addCriterion("tbtf_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfIdEqualTo(Long value) {
            addCriterion("tbtf_id =", value, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdNotEqualTo(Long value) {
            addCriterion("tbtf_id <>", value, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdGreaterThan(Long value) {
            addCriterion("tbtf_id >", value, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtf_id >=", value, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdLessThan(Long value) {
            addCriterion("tbtf_id <", value, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdLessThanOrEqualTo(Long value) {
            addCriterion("tbtf_id <=", value, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdIn(List<Long> values) {
            addCriterion("tbtf_id in", values, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdNotIn(List<Long> values) {
            addCriterion("tbtf_id not in", values, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdBetween(Long value1, Long value2) {
            addCriterion("tbtf_id between", value1, value2, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfIdNotBetween(Long value1, Long value2) {
            addCriterion("tbtf_id not between", value1, value2, "tbtfId");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleIsNull() {
            addCriterion("tbtf_title is null");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleIsNotNull() {
            addCriterion("tbtf_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleEqualTo(String value) {
            addCriterion("tbtf_title =", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleNotEqualTo(String value) {
            addCriterion("tbtf_title <>", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleGreaterThan(String value) {
            addCriterion("tbtf_title >", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbtf_title >=", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleLessThan(String value) {
            addCriterion("tbtf_title <", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleLessThanOrEqualTo(String value) {
            addCriterion("tbtf_title <=", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleLike(String value) {
            addCriterion("tbtf_title like", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleNotLike(String value) {
            addCriterion("tbtf_title not like", value, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleIn(List<String> values) {
            addCriterion("tbtf_title in", values, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleNotIn(List<String> values) {
            addCriterion("tbtf_title not in", values, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleBetween(String value1, String value2) {
            addCriterion("tbtf_title between", value1, value2, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTitleNotBetween(String value1, String value2) {
            addCriterion("tbtf_title not between", value1, value2, "tbtfTitle");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeIsNull() {
            addCriterion("tbtf_type is null");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeIsNotNull() {
            addCriterion("tbtf_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeEqualTo(Short value) {
            addCriterion("tbtf_type =", value, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeNotEqualTo(Short value) {
            addCriterion("tbtf_type <>", value, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeGreaterThan(Short value) {
            addCriterion("tbtf_type >", value, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbtf_type >=", value, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeLessThan(Short value) {
            addCriterion("tbtf_type <", value, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbtf_type <=", value, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeIn(List<Short> values) {
            addCriterion("tbtf_type in", values, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeNotIn(List<Short> values) {
            addCriterion("tbtf_type not in", values, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeBetween(Short value1, Short value2) {
            addCriterion("tbtf_type between", value1, value2, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbtf_type not between", value1, value2, "tbtfType");
            return (Criteria) this;
        }

        public Criteria andTbtfContentIsNull() {
            addCriterion("tbtf_content is null");
            return (Criteria) this;
        }

        public Criteria andTbtfContentIsNotNull() {
            addCriterion("tbtf_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfContentEqualTo(String value) {
            addCriterion("tbtf_content =", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentNotEqualTo(String value) {
            addCriterion("tbtf_content <>", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentGreaterThan(String value) {
            addCriterion("tbtf_content >", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbtf_content >=", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentLessThan(String value) {
            addCriterion("tbtf_content <", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentLessThanOrEqualTo(String value) {
            addCriterion("tbtf_content <=", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentLike(String value) {
            addCriterion("tbtf_content like", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentNotLike(String value) {
            addCriterion("tbtf_content not like", value, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentIn(List<String> values) {
            addCriterion("tbtf_content in", values, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentNotIn(List<String> values) {
            addCriterion("tbtf_content not in", values, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentBetween(String value1, String value2) {
            addCriterion("tbtf_content between", value1, value2, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfContentNotBetween(String value1, String value2) {
            addCriterion("tbtf_content not between", value1, value2, "tbtfContent");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkIsNull() {
            addCriterion("tbtf_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkIsNotNull() {
            addCriterion("tbtf_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkEqualTo(String value) {
            addCriterion("tbtf_remark =", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkNotEqualTo(String value) {
            addCriterion("tbtf_remark <>", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkGreaterThan(String value) {
            addCriterion("tbtf_remark >", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbtf_remark >=", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkLessThan(String value) {
            addCriterion("tbtf_remark <", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbtf_remark <=", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkLike(String value) {
            addCriterion("tbtf_remark like", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkNotLike(String value) {
            addCriterion("tbtf_remark not like", value, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkIn(List<String> values) {
            addCriterion("tbtf_remark in", values, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkNotIn(List<String> values) {
            addCriterion("tbtf_remark not in", values, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkBetween(String value1, String value2) {
            addCriterion("tbtf_remark between", value1, value2, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfRemarkNotBetween(String value1, String value2) {
            addCriterion("tbtf_remark not between", value1, value2, "tbtfRemark");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderIsNull() {
            addCriterion("tbtf_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderIsNotNull() {
            addCriterion("tbtf_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderEqualTo(Long value) {
            addCriterion("tbtf_adder =", value, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderNotEqualTo(Long value) {
            addCriterion("tbtf_adder <>", value, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderGreaterThan(Long value) {
            addCriterion("tbtf_adder >", value, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderGreaterThanOrEqualTo(Long value) {
            addCriterion("tbtf_adder >=", value, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderLessThan(Long value) {
            addCriterion("tbtf_adder <", value, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderLessThanOrEqualTo(Long value) {
            addCriterion("tbtf_adder <=", value, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderIn(List<Long> values) {
            addCriterion("tbtf_adder in", values, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderNotIn(List<Long> values) {
            addCriterion("tbtf_adder not in", values, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderBetween(Long value1, Long value2) {
            addCriterion("tbtf_adder between", value1, value2, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfAdderNotBetween(Long value1, Long value2) {
            addCriterion("tbtf_adder not between", value1, value2, "tbtfAdder");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeIsNull() {
            addCriterion("tbtf_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeIsNotNull() {
            addCriterion("tbtf_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeEqualTo(Date value) {
            addCriterion("tbtf_update_time =", value, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbtf_update_time <>", value, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeGreaterThan(Date value) {
            addCriterion("tbtf_update_time >", value, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtf_update_time >=", value, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeLessThan(Date value) {
            addCriterion("tbtf_update_time <", value, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtf_update_time <=", value, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeIn(List<Date> values) {
            addCriterion("tbtf_update_time in", values, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbtf_update_time not in", values, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbtf_update_time between", value1, value2, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtf_update_time not between", value1, value2, "tbtfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeIsNull() {
            addCriterion("tbtf_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeIsNotNull() {
            addCriterion("tbtf_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeEqualTo(Date value) {
            addCriterion("tbtf_add_time =", value, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeNotEqualTo(Date value) {
            addCriterion("tbtf_add_time <>", value, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeGreaterThan(Date value) {
            addCriterion("tbtf_add_time >", value, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbtf_add_time >=", value, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeLessThan(Date value) {
            addCriterion("tbtf_add_time <", value, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbtf_add_time <=", value, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeIn(List<Date> values) {
            addCriterion("tbtf_add_time in", values, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeNotIn(List<Date> values) {
            addCriterion("tbtf_add_time not in", values, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbtf_add_time between", value1, value2, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbtf_add_time not between", value1, value2, "tbtfAddTime");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusIsNull() {
            addCriterion("tbtf_status is null");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusIsNotNull() {
            addCriterion("tbtf_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusEqualTo(Short value) {
            addCriterion("tbtf_status =", value, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusNotEqualTo(Short value) {
            addCriterion("tbtf_status <>", value, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusGreaterThan(Short value) {
            addCriterion("tbtf_status >", value, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tbtf_status >=", value, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusLessThan(Short value) {
            addCriterion("tbtf_status <", value, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusLessThanOrEqualTo(Short value) {
            addCriterion("tbtf_status <=", value, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusIn(List<Short> values) {
            addCriterion("tbtf_status in", values, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusNotIn(List<Short> values) {
            addCriterion("tbtf_status not in", values, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusBetween(Short value1, Short value2) {
            addCriterion("tbtf_status between", value1, value2, "tbtfStatus");
            return (Criteria) this;
        }

        public Criteria andTbtfStatusNotBetween(Short value1, Short value2) {
            addCriterion("tbtf_status not between", value1, value2, "tbtfStatus");
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