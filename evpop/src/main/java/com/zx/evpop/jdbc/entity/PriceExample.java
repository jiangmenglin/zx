package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class PriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceExample() {
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

        public Criteria andTbpIdIsNull() {
            addCriterion("tbp_id is null");
            return (Criteria) this;
        }

        public Criteria andTbpIdIsNotNull() {
            addCriterion("tbp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbpIdEqualTo(Long value) {
            addCriterion("tbp_id =", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotEqualTo(Long value) {
            addCriterion("tbp_id <>", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThan(Long value) {
            addCriterion("tbp_id >", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_id >=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThan(Long value) {
            addCriterion("tbp_id <", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdLessThanOrEqualTo(Long value) {
            addCriterion("tbp_id <=", value, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdIn(List<Long> values) {
            addCriterion("tbp_id in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotIn(List<Long> values) {
            addCriterion("tbp_id not in", values, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdBetween(Long value1, Long value2) {
            addCriterion("tbp_id between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpIdNotBetween(Long value1, Long value2) {
            addCriterion("tbp_id not between", value1, value2, "tbpId");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNull() {
            addCriterion("tbp_host is null");
            return (Criteria) this;
        }

        public Criteria andTbpHostIsNotNull() {
            addCriterion("tbp_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbpHostEqualTo(Long value) {
            addCriterion("tbp_host =", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotEqualTo(Long value) {
            addCriterion("tbp_host <>", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThan(Long value) {
            addCriterion("tbp_host >", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_host >=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThan(Long value) {
            addCriterion("tbp_host <", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostLessThanOrEqualTo(Long value) {
            addCriterion("tbp_host <=", value, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostIn(List<Long> values) {
            addCriterion("tbp_host in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotIn(List<Long> values) {
            addCriterion("tbp_host not in", values, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostBetween(Long value1, Long value2) {
            addCriterion("tbp_host between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpHostNotBetween(Long value1, Long value2) {
            addCriterion("tbp_host not between", value1, value2, "tbpHost");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeIsNull() {
            addCriterion("tbp_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeIsNotNull() {
            addCriterion("tbp_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeEqualTo(Long value) {
            addCriterion("tbp_fee_type =", value, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeNotEqualTo(Long value) {
            addCriterion("tbp_fee_type <>", value, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeGreaterThan(Long value) {
            addCriterion("tbp_fee_type >", value, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_fee_type >=", value, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeLessThan(Long value) {
            addCriterion("tbp_fee_type <", value, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeLessThanOrEqualTo(Long value) {
            addCriterion("tbp_fee_type <=", value, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeIn(List<Long> values) {
            addCriterion("tbp_fee_type in", values, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeNotIn(List<Long> values) {
            addCriterion("tbp_fee_type not in", values, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeBetween(Long value1, Long value2) {
            addCriterion("tbp_fee_type between", value1, value2, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpFeeTypeNotBetween(Long value1, Long value2) {
            addCriterion("tbp_fee_type not between", value1, value2, "tbpFeeType");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsIsNull() {
            addCriterion("tbp_goods is null");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsIsNotNull() {
            addCriterion("tbp_goods is not null");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsEqualTo(Long value) {
            addCriterion("tbp_goods =", value, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsNotEqualTo(Long value) {
            addCriterion("tbp_goods <>", value, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsGreaterThan(Long value) {
            addCriterion("tbp_goods >", value, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_goods >=", value, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsLessThan(Long value) {
            addCriterion("tbp_goods <", value, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsLessThanOrEqualTo(Long value) {
            addCriterion("tbp_goods <=", value, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsIn(List<Long> values) {
            addCriterion("tbp_goods in", values, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsNotIn(List<Long> values) {
            addCriterion("tbp_goods not in", values, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsBetween(Long value1, Long value2) {
            addCriterion("tbp_goods between", value1, value2, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpGoodsNotBetween(Long value1, Long value2) {
            addCriterion("tbp_goods not between", value1, value2, "tbpGoods");
            return (Criteria) this;
        }

        public Criteria andTbpModelIsNull() {
            addCriterion("tbp_model is null");
            return (Criteria) this;
        }

        public Criteria andTbpModelIsNotNull() {
            addCriterion("tbp_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbpModelEqualTo(Long value) {
            addCriterion("tbp_model =", value, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelNotEqualTo(Long value) {
            addCriterion("tbp_model <>", value, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelGreaterThan(Long value) {
            addCriterion("tbp_model >", value, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelGreaterThanOrEqualTo(Long value) {
            addCriterion("tbp_model >=", value, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelLessThan(Long value) {
            addCriterion("tbp_model <", value, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelLessThanOrEqualTo(Long value) {
            addCriterion("tbp_model <=", value, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelIn(List<Long> values) {
            addCriterion("tbp_model in", values, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelNotIn(List<Long> values) {
            addCriterion("tbp_model not in", values, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelBetween(Long value1, Long value2) {
            addCriterion("tbp_model between", value1, value2, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpModelNotBetween(Long value1, Long value2) {
            addCriterion("tbp_model not between", value1, value2, "tbpModel");
            return (Criteria) this;
        }

        public Criteria andTbpPriceIsNull() {
            addCriterion("tbp_price is null");
            return (Criteria) this;
        }

        public Criteria andTbpPriceIsNotNull() {
            addCriterion("tbp_price is not null");
            return (Criteria) this;
        }

        public Criteria andTbpPriceEqualTo(Double value) {
            addCriterion("tbp_price =", value, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceNotEqualTo(Double value) {
            addCriterion("tbp_price <>", value, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceGreaterThan(Double value) {
            addCriterion("tbp_price >", value, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tbp_price >=", value, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceLessThan(Double value) {
            addCriterion("tbp_price <", value, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceLessThanOrEqualTo(Double value) {
            addCriterion("tbp_price <=", value, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceIn(List<Double> values) {
            addCriterion("tbp_price in", values, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceNotIn(List<Double> values) {
            addCriterion("tbp_price not in", values, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceBetween(Double value1, Double value2) {
            addCriterion("tbp_price between", value1, value2, "tbpPrice");
            return (Criteria) this;
        }

        public Criteria andTbpPriceNotBetween(Double value1, Double value2) {
            addCriterion("tbp_price not between", value1, value2, "tbpPrice");
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