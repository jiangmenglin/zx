package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LfeeTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LfeeTypeExample() {
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

        public Criteria andTbltIdIsNull() {
            addCriterion("tblt_id is null");
            return (Criteria) this;
        }

        public Criteria andTbltIdIsNotNull() {
            addCriterion("tblt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbltIdEqualTo(Long value) {
            addCriterion("tblt_id =", value, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdNotEqualTo(Long value) {
            addCriterion("tblt_id <>", value, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdGreaterThan(Long value) {
            addCriterion("tblt_id >", value, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblt_id >=", value, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdLessThan(Long value) {
            addCriterion("tblt_id <", value, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdLessThanOrEqualTo(Long value) {
            addCriterion("tblt_id <=", value, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdIn(List<Long> values) {
            addCriterion("tblt_id in", values, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdNotIn(List<Long> values) {
            addCriterion("tblt_id not in", values, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdBetween(Long value1, Long value2) {
            addCriterion("tblt_id between", value1, value2, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltIdNotBetween(Long value1, Long value2) {
            addCriterion("tblt_id not between", value1, value2, "tbltId");
            return (Criteria) this;
        }

        public Criteria andTbltHostIsNull() {
            addCriterion("tblt_host is null");
            return (Criteria) this;
        }

        public Criteria andTbltHostIsNotNull() {
            addCriterion("tblt_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbltHostEqualTo(Long value) {
            addCriterion("tblt_host =", value, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostNotEqualTo(Long value) {
            addCriterion("tblt_host <>", value, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostGreaterThan(Long value) {
            addCriterion("tblt_host >", value, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tblt_host >=", value, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostLessThan(Long value) {
            addCriterion("tblt_host <", value, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostLessThanOrEqualTo(Long value) {
            addCriterion("tblt_host <=", value, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostIn(List<Long> values) {
            addCriterion("tblt_host in", values, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostNotIn(List<Long> values) {
            addCriterion("tblt_host not in", values, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostBetween(Long value1, Long value2) {
            addCriterion("tblt_host between", value1, value2, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltHostNotBetween(Long value1, Long value2) {
            addCriterion("tblt_host not between", value1, value2, "tbltHost");
            return (Criteria) this;
        }

        public Criteria andTbltNameIsNull() {
            addCriterion("tblt_name is null");
            return (Criteria) this;
        }

        public Criteria andTbltNameIsNotNull() {
            addCriterion("tblt_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbltNameEqualTo(String value) {
            addCriterion("tblt_name =", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameNotEqualTo(String value) {
            addCriterion("tblt_name <>", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameGreaterThan(String value) {
            addCriterion("tblt_name >", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameGreaterThanOrEqualTo(String value) {
            addCriterion("tblt_name >=", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameLessThan(String value) {
            addCriterion("tblt_name <", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameLessThanOrEqualTo(String value) {
            addCriterion("tblt_name <=", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameLike(String value) {
            addCriterion("tblt_name like", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameNotLike(String value) {
            addCriterion("tblt_name not like", value, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameIn(List<String> values) {
            addCriterion("tblt_name in", values, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameNotIn(List<String> values) {
            addCriterion("tblt_name not in", values, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameBetween(String value1, String value2) {
            addCriterion("tblt_name between", value1, value2, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltNameNotBetween(String value1, String value2) {
            addCriterion("tblt_name not between", value1, value2, "tbltName");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsIsNull() {
            addCriterion("tblt_goods is null");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsIsNotNull() {
            addCriterion("tblt_goods is not null");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsEqualTo(String value) {
            addCriterion("tblt_goods =", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsNotEqualTo(String value) {
            addCriterion("tblt_goods <>", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsGreaterThan(String value) {
            addCriterion("tblt_goods >", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("tblt_goods >=", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsLessThan(String value) {
            addCriterion("tblt_goods <", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsLessThanOrEqualTo(String value) {
            addCriterion("tblt_goods <=", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsLike(String value) {
            addCriterion("tblt_goods like", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsNotLike(String value) {
            addCriterion("tblt_goods not like", value, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsIn(List<String> values) {
            addCriterion("tblt_goods in", values, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsNotIn(List<String> values) {
            addCriterion("tblt_goods not in", values, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsBetween(String value1, String value2) {
            addCriterion("tblt_goods between", value1, value2, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltGoodsNotBetween(String value1, String value2) {
            addCriterion("tblt_goods not between", value1, value2, "tbltGoods");
            return (Criteria) this;
        }

        public Criteria andTbltModelsIsNull() {
            addCriterion("tblt_models is null");
            return (Criteria) this;
        }

        public Criteria andTbltModelsIsNotNull() {
            addCriterion("tblt_models is not null");
            return (Criteria) this;
        }

        public Criteria andTbltModelsEqualTo(String value) {
            addCriterion("tblt_models =", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsNotEqualTo(String value) {
            addCriterion("tblt_models <>", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsGreaterThan(String value) {
            addCriterion("tblt_models >", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsGreaterThanOrEqualTo(String value) {
            addCriterion("tblt_models >=", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsLessThan(String value) {
            addCriterion("tblt_models <", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsLessThanOrEqualTo(String value) {
            addCriterion("tblt_models <=", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsLike(String value) {
            addCriterion("tblt_models like", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsNotLike(String value) {
            addCriterion("tblt_models not like", value, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsIn(List<String> values) {
            addCriterion("tblt_models in", values, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsNotIn(List<String> values) {
            addCriterion("tblt_models not in", values, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsBetween(String value1, String value2) {
            addCriterion("tblt_models between", value1, value2, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltModelsNotBetween(String value1, String value2) {
            addCriterion("tblt_models not between", value1, value2, "tbltModels");
            return (Criteria) this;
        }

        public Criteria andTbltOnIsNull() {
            addCriterion("tblt_on is null");
            return (Criteria) this;
        }

        public Criteria andTbltOnIsNotNull() {
            addCriterion("tblt_on is not null");
            return (Criteria) this;
        }

        public Criteria andTbltOnEqualTo(Double value) {
            addCriterion("tblt_on =", value, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnNotEqualTo(Double value) {
            addCriterion("tblt_on <>", value, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnGreaterThan(Double value) {
            addCriterion("tblt_on >", value, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnGreaterThanOrEqualTo(Double value) {
            addCriterion("tblt_on >=", value, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnLessThan(Double value) {
            addCriterion("tblt_on <", value, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnLessThanOrEqualTo(Double value) {
            addCriterion("tblt_on <=", value, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnIn(List<Double> values) {
            addCriterion("tblt_on in", values, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnNotIn(List<Double> values) {
            addCriterion("tblt_on not in", values, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnBetween(Double value1, Double value2) {
            addCriterion("tblt_on between", value1, value2, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOnNotBetween(Double value1, Double value2) {
            addCriterion("tblt_on not between", value1, value2, "tbltOn");
            return (Criteria) this;
        }

        public Criteria andTbltOffIsNull() {
            addCriterion("tblt_off is null");
            return (Criteria) this;
        }

        public Criteria andTbltOffIsNotNull() {
            addCriterion("tblt_off is not null");
            return (Criteria) this;
        }

        public Criteria andTbltOffEqualTo(Double value) {
            addCriterion("tblt_off =", value, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffNotEqualTo(Double value) {
            addCriterion("tblt_off <>", value, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffGreaterThan(Double value) {
            addCriterion("tblt_off >", value, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffGreaterThanOrEqualTo(Double value) {
            addCriterion("tblt_off >=", value, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffLessThan(Double value) {
            addCriterion("tblt_off <", value, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffLessThanOrEqualTo(Double value) {
            addCriterion("tblt_off <=", value, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffIn(List<Double> values) {
            addCriterion("tblt_off in", values, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffNotIn(List<Double> values) {
            addCriterion("tblt_off not in", values, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffBetween(Double value1, Double value2) {
            addCriterion("tblt_off between", value1, value2, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltOffNotBetween(Double value1, Double value2) {
            addCriterion("tblt_off not between", value1, value2, "tbltOff");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeIsNull() {
            addCriterion("tblt_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeIsNotNull() {
            addCriterion("tblt_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeEqualTo(Date value) {
            addCriterion("tblt_update_time =", value, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeNotEqualTo(Date value) {
            addCriterion("tblt_update_time <>", value, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeGreaterThan(Date value) {
            addCriterion("tblt_update_time >", value, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblt_update_time >=", value, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeLessThan(Date value) {
            addCriterion("tblt_update_time <", value, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblt_update_time <=", value, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeIn(List<Date> values) {
            addCriterion("tblt_update_time in", values, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeNotIn(List<Date> values) {
            addCriterion("tblt_update_time not in", values, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tblt_update_time between", value1, value2, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblt_update_time not between", value1, value2, "tbltUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeIsNull() {
            addCriterion("tblt_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeIsNotNull() {
            addCriterion("tblt_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeEqualTo(Date value) {
            addCriterion("tblt_add_time =", value, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeNotEqualTo(Date value) {
            addCriterion("tblt_add_time <>", value, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeGreaterThan(Date value) {
            addCriterion("tblt_add_time >", value, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblt_add_time >=", value, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeLessThan(Date value) {
            addCriterion("tblt_add_time <", value, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tblt_add_time <=", value, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeIn(List<Date> values) {
            addCriterion("tblt_add_time in", values, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeNotIn(List<Date> values) {
            addCriterion("tblt_add_time not in", values, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeBetween(Date value1, Date value2) {
            addCriterion("tblt_add_time between", value1, value2, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tblt_add_time not between", value1, value2, "tbltAddTime");
            return (Criteria) this;
        }

        public Criteria andTbltStatusIsNull() {
            addCriterion("tblt_status is null");
            return (Criteria) this;
        }

        public Criteria andTbltStatusIsNotNull() {
            addCriterion("tblt_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbltStatusEqualTo(Short value) {
            addCriterion("tblt_status =", value, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusNotEqualTo(Short value) {
            addCriterion("tblt_status <>", value, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusGreaterThan(Short value) {
            addCriterion("tblt_status >", value, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tblt_status >=", value, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusLessThan(Short value) {
            addCriterion("tblt_status <", value, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusLessThanOrEqualTo(Short value) {
            addCriterion("tblt_status <=", value, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusIn(List<Short> values) {
            addCriterion("tblt_status in", values, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusNotIn(List<Short> values) {
            addCriterion("tblt_status not in", values, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusBetween(Short value1, Short value2) {
            addCriterion("tblt_status between", value1, value2, "tbltStatus");
            return (Criteria) this;
        }

        public Criteria andTbltStatusNotBetween(Short value1, Short value2) {
            addCriterion("tblt_status not between", value1, value2, "tbltStatus");
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