package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeeTypeExample() {
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

        public Criteria andTbftIdIsNull() {
            addCriterion("tbft_id is null");
            return (Criteria) this;
        }

        public Criteria andTbftIdIsNotNull() {
            addCriterion("tbft_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbftIdEqualTo(Integer value) {
            addCriterion("tbft_id =", value, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdNotEqualTo(Integer value) {
            addCriterion("tbft_id <>", value, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdGreaterThan(Integer value) {
            addCriterion("tbft_id >", value, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbft_id >=", value, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdLessThan(Integer value) {
            addCriterion("tbft_id <", value, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbft_id <=", value, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdIn(List<Integer> values) {
            addCriterion("tbft_id in", values, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdNotIn(List<Integer> values) {
            addCriterion("tbft_id not in", values, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdBetween(Integer value1, Integer value2) {
            addCriterion("tbft_id between", value1, value2, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbft_id not between", value1, value2, "tbftId");
            return (Criteria) this;
        }

        public Criteria andTbftHostIsNull() {
            addCriterion("tbft_host is null");
            return (Criteria) this;
        }

        public Criteria andTbftHostIsNotNull() {
            addCriterion("tbft_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbftHostEqualTo(Short value) {
            addCriterion("tbft_host =", value, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostNotEqualTo(Short value) {
            addCriterion("tbft_host <>", value, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostGreaterThan(Short value) {
            addCriterion("tbft_host >", value, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbft_host >=", value, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostLessThan(Short value) {
            addCriterion("tbft_host <", value, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostLessThanOrEqualTo(Short value) {
            addCriterion("tbft_host <=", value, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostIn(List<Short> values) {
            addCriterion("tbft_host in", values, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostNotIn(List<Short> values) {
            addCriterion("tbft_host not in", values, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostBetween(Short value1, Short value2) {
            addCriterion("tbft_host between", value1, value2, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftHostNotBetween(Short value1, Short value2) {
            addCriterion("tbft_host not between", value1, value2, "tbftHost");
            return (Criteria) this;
        }

        public Criteria andTbftNameIsNull() {
            addCriterion("tbft_name is null");
            return (Criteria) this;
        }

        public Criteria andTbftNameIsNotNull() {
            addCriterion("tbft_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbftNameEqualTo(String value) {
            addCriterion("tbft_name =", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameNotEqualTo(String value) {
            addCriterion("tbft_name <>", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameGreaterThan(String value) {
            addCriterion("tbft_name >", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbft_name >=", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameLessThan(String value) {
            addCriterion("tbft_name <", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameLessThanOrEqualTo(String value) {
            addCriterion("tbft_name <=", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameLike(String value) {
            addCriterion("tbft_name like", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameNotLike(String value) {
            addCriterion("tbft_name not like", value, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameIn(List<String> values) {
            addCriterion("tbft_name in", values, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameNotIn(List<String> values) {
            addCriterion("tbft_name not in", values, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameBetween(String value1, String value2) {
            addCriterion("tbft_name between", value1, value2, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftNameNotBetween(String value1, String value2) {
            addCriterion("tbft_name not between", value1, value2, "tbftName");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsIsNull() {
            addCriterion("tbft_goods is null");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsIsNotNull() {
            addCriterion("tbft_goods is not null");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsEqualTo(String value) {
            addCriterion("tbft_goods =", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsNotEqualTo(String value) {
            addCriterion("tbft_goods <>", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsGreaterThan(String value) {
            addCriterion("tbft_goods >", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("tbft_goods >=", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsLessThan(String value) {
            addCriterion("tbft_goods <", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsLessThanOrEqualTo(String value) {
            addCriterion("tbft_goods <=", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsLike(String value) {
            addCriterion("tbft_goods like", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsNotLike(String value) {
            addCriterion("tbft_goods not like", value, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsIn(List<String> values) {
            addCriterion("tbft_goods in", values, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsNotIn(List<String> values) {
            addCriterion("tbft_goods not in", values, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsBetween(String value1, String value2) {
            addCriterion("tbft_goods between", value1, value2, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftGoodsNotBetween(String value1, String value2) {
            addCriterion("tbft_goods not between", value1, value2, "tbftGoods");
            return (Criteria) this;
        }

        public Criteria andTbftModelsIsNull() {
            addCriterion("tbft_models is null");
            return (Criteria) this;
        }

        public Criteria andTbftModelsIsNotNull() {
            addCriterion("tbft_models is not null");
            return (Criteria) this;
        }

        public Criteria andTbftModelsEqualTo(String value) {
            addCriterion("tbft_models =", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsNotEqualTo(String value) {
            addCriterion("tbft_models <>", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsGreaterThan(String value) {
            addCriterion("tbft_models >", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsGreaterThanOrEqualTo(String value) {
            addCriterion("tbft_models >=", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsLessThan(String value) {
            addCriterion("tbft_models <", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsLessThanOrEqualTo(String value) {
            addCriterion("tbft_models <=", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsLike(String value) {
            addCriterion("tbft_models like", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsNotLike(String value) {
            addCriterion("tbft_models not like", value, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsIn(List<String> values) {
            addCriterion("tbft_models in", values, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsNotIn(List<String> values) {
            addCriterion("tbft_models not in", values, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsBetween(String value1, String value2) {
            addCriterion("tbft_models between", value1, value2, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftModelsNotBetween(String value1, String value2) {
            addCriterion("tbft_models not between", value1, value2, "tbftModels");
            return (Criteria) this;
        }

        public Criteria andTbftOnIsNull() {
            addCriterion("tbft_on is null");
            return (Criteria) this;
        }

        public Criteria andTbftOnIsNotNull() {
            addCriterion("tbft_on is not null");
            return (Criteria) this;
        }

        public Criteria andTbftOnEqualTo(Double value) {
            addCriterion("tbft_on =", value, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnNotEqualTo(Double value) {
            addCriterion("tbft_on <>", value, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnGreaterThan(Double value) {
            addCriterion("tbft_on >", value, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnGreaterThanOrEqualTo(Double value) {
            addCriterion("tbft_on >=", value, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnLessThan(Double value) {
            addCriterion("tbft_on <", value, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnLessThanOrEqualTo(Double value) {
            addCriterion("tbft_on <=", value, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnIn(List<Double> values) {
            addCriterion("tbft_on in", values, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnNotIn(List<Double> values) {
            addCriterion("tbft_on not in", values, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnBetween(Double value1, Double value2) {
            addCriterion("tbft_on between", value1, value2, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOnNotBetween(Double value1, Double value2) {
            addCriterion("tbft_on not between", value1, value2, "tbftOn");
            return (Criteria) this;
        }

        public Criteria andTbftOffIsNull() {
            addCriterion("tbft_off is null");
            return (Criteria) this;
        }

        public Criteria andTbftOffIsNotNull() {
            addCriterion("tbft_off is not null");
            return (Criteria) this;
        }

        public Criteria andTbftOffEqualTo(Double value) {
            addCriterion("tbft_off =", value, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffNotEqualTo(Double value) {
            addCriterion("tbft_off <>", value, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffGreaterThan(Double value) {
            addCriterion("tbft_off >", value, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffGreaterThanOrEqualTo(Double value) {
            addCriterion("tbft_off >=", value, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffLessThan(Double value) {
            addCriterion("tbft_off <", value, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffLessThanOrEqualTo(Double value) {
            addCriterion("tbft_off <=", value, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffIn(List<Double> values) {
            addCriterion("tbft_off in", values, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffNotIn(List<Double> values) {
            addCriterion("tbft_off not in", values, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffBetween(Double value1, Double value2) {
            addCriterion("tbft_off between", value1, value2, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftOffNotBetween(Double value1, Double value2) {
            addCriterion("tbft_off not between", value1, value2, "tbftOff");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeIsNull() {
            addCriterion("tbft_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeIsNotNull() {
            addCriterion("tbft_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeEqualTo(Date value) {
            addCriterion("tbft_update_time =", value, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbft_update_time <>", value, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeGreaterThan(Date value) {
            addCriterion("tbft_update_time >", value, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbft_update_time >=", value, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeLessThan(Date value) {
            addCriterion("tbft_update_time <", value, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbft_update_time <=", value, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeIn(List<Date> values) {
            addCriterion("tbft_update_time in", values, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbft_update_time not in", values, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbft_update_time between", value1, value2, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbft_update_time not between", value1, value2, "tbftUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeIsNull() {
            addCriterion("tbft_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeIsNotNull() {
            addCriterion("tbft_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeEqualTo(Date value) {
            addCriterion("tbft_add_time =", value, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeNotEqualTo(Date value) {
            addCriterion("tbft_add_time <>", value, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeGreaterThan(Date value) {
            addCriterion("tbft_add_time >", value, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbft_add_time >=", value, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeLessThan(Date value) {
            addCriterion("tbft_add_time <", value, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbft_add_time <=", value, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeIn(List<Date> values) {
            addCriterion("tbft_add_time in", values, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeNotIn(List<Date> values) {
            addCriterion("tbft_add_time not in", values, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbft_add_time between", value1, value2, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbft_add_time not between", value1, value2, "tbftAddTime");
            return (Criteria) this;
        }

        public Criteria andTbftStatusIsNull() {
            addCriterion("tbft_status is null");
            return (Criteria) this;
        }

        public Criteria andTbftStatusIsNotNull() {
            addCriterion("tbft_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbftStatusEqualTo(Byte value) {
            addCriterion("tbft_status =", value, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusNotEqualTo(Byte value) {
            addCriterion("tbft_status <>", value, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusGreaterThan(Byte value) {
            addCriterion("tbft_status >", value, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbft_status >=", value, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusLessThan(Byte value) {
            addCriterion("tbft_status <", value, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbft_status <=", value, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusIn(List<Byte> values) {
            addCriterion("tbft_status in", values, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusNotIn(List<Byte> values) {
            addCriterion("tbft_status not in", values, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbft_status between", value1, value2, "tbftStatus");
            return (Criteria) this;
        }

        public Criteria andTbftStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbft_status not between", value1, value2, "tbftStatus");
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