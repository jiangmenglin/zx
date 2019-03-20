package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterfaceResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterfaceResponseExample() {
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

        public Criteria andResponseNoIsNull() {
            addCriterion("response_no is null");
            return (Criteria) this;
        }

        public Criteria andResponseNoIsNotNull() {
            addCriterion("response_no is not null");
            return (Criteria) this;
        }

        public Criteria andResponseNoEqualTo(String value) {
            addCriterion("response_no =", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoNotEqualTo(String value) {
            addCriterion("response_no <>", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoGreaterThan(String value) {
            addCriterion("response_no >", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoGreaterThanOrEqualTo(String value) {
            addCriterion("response_no >=", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoLessThan(String value) {
            addCriterion("response_no <", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoLessThanOrEqualTo(String value) {
            addCriterion("response_no <=", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoLike(String value) {
            addCriterion("response_no like", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoNotLike(String value) {
            addCriterion("response_no not like", value, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoIn(List<String> values) {
            addCriterion("response_no in", values, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoNotIn(List<String> values) {
            addCriterion("response_no not in", values, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoBetween(String value1, String value2) {
            addCriterion("response_no between", value1, value2, "responseNo");
            return (Criteria) this;
        }

        public Criteria andResponseNoNotBetween(String value1, String value2) {
            addCriterion("response_no not between", value1, value2, "responseNo");
            return (Criteria) this;
        }

        public Criteria andRspTypeIsNull() {
            addCriterion("rsp_type is null");
            return (Criteria) this;
        }

        public Criteria andRspTypeIsNotNull() {
            addCriterion("rsp_type is not null");
            return (Criteria) this;
        }

        public Criteria andRspTypeEqualTo(Integer value) {
            addCriterion("rsp_type =", value, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeNotEqualTo(Integer value) {
            addCriterion("rsp_type <>", value, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeGreaterThan(Integer value) {
            addCriterion("rsp_type >", value, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rsp_type >=", value, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeLessThan(Integer value) {
            addCriterion("rsp_type <", value, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rsp_type <=", value, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeIn(List<Integer> values) {
            addCriterion("rsp_type in", values, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeNotIn(List<Integer> values) {
            addCriterion("rsp_type not in", values, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeBetween(Integer value1, Integer value2) {
            addCriterion("rsp_type between", value1, value2, "rspType");
            return (Criteria) this;
        }

        public Criteria andRspTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rsp_type not between", value1, value2, "rspType");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeIsNull() {
            addCriterion("inner_rsp_code is null");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeIsNotNull() {
            addCriterion("inner_rsp_code is not null");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeEqualTo(String value) {
            addCriterion("inner_rsp_code =", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeNotEqualTo(String value) {
            addCriterion("inner_rsp_code <>", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeGreaterThan(String value) {
            addCriterion("inner_rsp_code >", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inner_rsp_code >=", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeLessThan(String value) {
            addCriterion("inner_rsp_code <", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeLessThanOrEqualTo(String value) {
            addCriterion("inner_rsp_code <=", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeLike(String value) {
            addCriterion("inner_rsp_code like", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeNotLike(String value) {
            addCriterion("inner_rsp_code not like", value, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeIn(List<String> values) {
            addCriterion("inner_rsp_code in", values, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeNotIn(List<String> values) {
            addCriterion("inner_rsp_code not in", values, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeBetween(String value1, String value2) {
            addCriterion("inner_rsp_code between", value1, value2, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspCodeNotBetween(String value1, String value2) {
            addCriterion("inner_rsp_code not between", value1, value2, "innerRspCode");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescIsNull() {
            addCriterion("inner_rsp_desc is null");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescIsNotNull() {
            addCriterion("inner_rsp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescEqualTo(String value) {
            addCriterion("inner_rsp_desc =", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescNotEqualTo(String value) {
            addCriterion("inner_rsp_desc <>", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescGreaterThan(String value) {
            addCriterion("inner_rsp_desc >", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescGreaterThanOrEqualTo(String value) {
            addCriterion("inner_rsp_desc >=", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescLessThan(String value) {
            addCriterion("inner_rsp_desc <", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescLessThanOrEqualTo(String value) {
            addCriterion("inner_rsp_desc <=", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescLike(String value) {
            addCriterion("inner_rsp_desc like", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescNotLike(String value) {
            addCriterion("inner_rsp_desc not like", value, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescIn(List<String> values) {
            addCriterion("inner_rsp_desc in", values, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescNotIn(List<String> values) {
            addCriterion("inner_rsp_desc not in", values, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescBetween(String value1, String value2) {
            addCriterion("inner_rsp_desc between", value1, value2, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andInnerRspDescNotBetween(String value1, String value2) {
            addCriterion("inner_rsp_desc not between", value1, value2, "innerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeIsNull() {
            addCriterion("outer_rsp_code is null");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeIsNotNull() {
            addCriterion("outer_rsp_code is not null");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeEqualTo(String value) {
            addCriterion("outer_rsp_code =", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeNotEqualTo(String value) {
            addCriterion("outer_rsp_code <>", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeGreaterThan(String value) {
            addCriterion("outer_rsp_code >", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeGreaterThanOrEqualTo(String value) {
            addCriterion("outer_rsp_code >=", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeLessThan(String value) {
            addCriterion("outer_rsp_code <", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeLessThanOrEqualTo(String value) {
            addCriterion("outer_rsp_code <=", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeLike(String value) {
            addCriterion("outer_rsp_code like", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeNotLike(String value) {
            addCriterion("outer_rsp_code not like", value, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeIn(List<String> values) {
            addCriterion("outer_rsp_code in", values, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeNotIn(List<String> values) {
            addCriterion("outer_rsp_code not in", values, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeBetween(String value1, String value2) {
            addCriterion("outer_rsp_code between", value1, value2, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspCodeNotBetween(String value1, String value2) {
            addCriterion("outer_rsp_code not between", value1, value2, "outerRspCode");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescIsNull() {
            addCriterion("outer_rsp_desc is null");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescIsNotNull() {
            addCriterion("outer_rsp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescEqualTo(String value) {
            addCriterion("outer_rsp_desc =", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescNotEqualTo(String value) {
            addCriterion("outer_rsp_desc <>", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescGreaterThan(String value) {
            addCriterion("outer_rsp_desc >", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescGreaterThanOrEqualTo(String value) {
            addCriterion("outer_rsp_desc >=", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescLessThan(String value) {
            addCriterion("outer_rsp_desc <", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescLessThanOrEqualTo(String value) {
            addCriterion("outer_rsp_desc <=", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescLike(String value) {
            addCriterion("outer_rsp_desc like", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescNotLike(String value) {
            addCriterion("outer_rsp_desc not like", value, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescIn(List<String> values) {
            addCriterion("outer_rsp_desc in", values, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescNotIn(List<String> values) {
            addCriterion("outer_rsp_desc not in", values, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescBetween(String value1, String value2) {
            addCriterion("outer_rsp_desc between", value1, value2, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andOuterRspDescNotBetween(String value1, String value2) {
            addCriterion("outer_rsp_desc not between", value1, value2, "outerRspDesc");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNull() {
            addCriterion("request_no is null");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNotNull() {
            addCriterion("request_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequestNoEqualTo(String value) {
            addCriterion("request_no =", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotEqualTo(String value) {
            addCriterion("request_no <>", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThan(String value) {
            addCriterion("request_no >", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThanOrEqualTo(String value) {
            addCriterion("request_no >=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThan(String value) {
            addCriterion("request_no <", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThanOrEqualTo(String value) {
            addCriterion("request_no <=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLike(String value) {
            addCriterion("request_no like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotLike(String value) {
            addCriterion("request_no not like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoIn(List<String> values) {
            addCriterion("request_no in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotIn(List<String> values) {
            addCriterion("request_no not in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoBetween(String value1, String value2) {
            addCriterion("request_no between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotBetween(String value1, String value2) {
            addCriterion("request_no not between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
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