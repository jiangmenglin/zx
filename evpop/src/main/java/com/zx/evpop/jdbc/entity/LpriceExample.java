package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class LpriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LpriceExample() {
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

        public Criteria andTblIdIsNull() {
            addCriterion("tbl_id is null");
            return (Criteria) this;
        }

        public Criteria andTblIdIsNotNull() {
            addCriterion("tbl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblIdEqualTo(Long value) {
            addCriterion("tbl_id =", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdNotEqualTo(Long value) {
            addCriterion("tbl_id <>", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdGreaterThan(Long value) {
            addCriterion("tbl_id >", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_id >=", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdLessThan(Long value) {
            addCriterion("tbl_id <", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdLessThanOrEqualTo(Long value) {
            addCriterion("tbl_id <=", value, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdIn(List<Long> values) {
            addCriterion("tbl_id in", values, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdNotIn(List<Long> values) {
            addCriterion("tbl_id not in", values, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdBetween(Long value1, Long value2) {
            addCriterion("tbl_id between", value1, value2, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblIdNotBetween(Long value1, Long value2) {
            addCriterion("tbl_id not between", value1, value2, "tblId");
            return (Criteria) this;
        }

        public Criteria andTblHostIsNull() {
            addCriterion("tbl_host is null");
            return (Criteria) this;
        }

        public Criteria andTblHostIsNotNull() {
            addCriterion("tbl_host is not null");
            return (Criteria) this;
        }

        public Criteria andTblHostEqualTo(Long value) {
            addCriterion("tbl_host =", value, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostNotEqualTo(Long value) {
            addCriterion("tbl_host <>", value, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostGreaterThan(Long value) {
            addCriterion("tbl_host >", value, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_host >=", value, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostLessThan(Long value) {
            addCriterion("tbl_host <", value, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostLessThanOrEqualTo(Long value) {
            addCriterion("tbl_host <=", value, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostIn(List<Long> values) {
            addCriterion("tbl_host in", values, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostNotIn(List<Long> values) {
            addCriterion("tbl_host not in", values, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostBetween(Long value1, Long value2) {
            addCriterion("tbl_host between", value1, value2, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblHostNotBetween(Long value1, Long value2) {
            addCriterion("tbl_host not between", value1, value2, "tblHost");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeIsNull() {
            addCriterion("tbl_fee_type is null");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeIsNotNull() {
            addCriterion("tbl_fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeEqualTo(Long value) {
            addCriterion("tbl_fee_type =", value, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeNotEqualTo(Long value) {
            addCriterion("tbl_fee_type <>", value, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeGreaterThan(Long value) {
            addCriterion("tbl_fee_type >", value, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_fee_type >=", value, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeLessThan(Long value) {
            addCriterion("tbl_fee_type <", value, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeLessThanOrEqualTo(Long value) {
            addCriterion("tbl_fee_type <=", value, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeIn(List<Long> values) {
            addCriterion("tbl_fee_type in", values, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeNotIn(List<Long> values) {
            addCriterion("tbl_fee_type not in", values, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeBetween(Long value1, Long value2) {
            addCriterion("tbl_fee_type between", value1, value2, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblFeeTypeNotBetween(Long value1, Long value2) {
            addCriterion("tbl_fee_type not between", value1, value2, "tblFeeType");
            return (Criteria) this;
        }

        public Criteria andTblGoodsIsNull() {
            addCriterion("tbl_goods is null");
            return (Criteria) this;
        }

        public Criteria andTblGoodsIsNotNull() {
            addCriterion("tbl_goods is not null");
            return (Criteria) this;
        }

        public Criteria andTblGoodsEqualTo(Long value) {
            addCriterion("tbl_goods =", value, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsNotEqualTo(Long value) {
            addCriterion("tbl_goods <>", value, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsGreaterThan(Long value) {
            addCriterion("tbl_goods >", value, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_goods >=", value, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsLessThan(Long value) {
            addCriterion("tbl_goods <", value, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsLessThanOrEqualTo(Long value) {
            addCriterion("tbl_goods <=", value, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsIn(List<Long> values) {
            addCriterion("tbl_goods in", values, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsNotIn(List<Long> values) {
            addCriterion("tbl_goods not in", values, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsBetween(Long value1, Long value2) {
            addCriterion("tbl_goods between", value1, value2, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblGoodsNotBetween(Long value1, Long value2) {
            addCriterion("tbl_goods not between", value1, value2, "tblGoods");
            return (Criteria) this;
        }

        public Criteria andTblModelIsNull() {
            addCriterion("tbl_model is null");
            return (Criteria) this;
        }

        public Criteria andTblModelIsNotNull() {
            addCriterion("tbl_model is not null");
            return (Criteria) this;
        }

        public Criteria andTblModelEqualTo(Long value) {
            addCriterion("tbl_model =", value, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelNotEqualTo(Long value) {
            addCriterion("tbl_model <>", value, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelGreaterThan(Long value) {
            addCriterion("tbl_model >", value, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_model >=", value, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelLessThan(Long value) {
            addCriterion("tbl_model <", value, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelLessThanOrEqualTo(Long value) {
            addCriterion("tbl_model <=", value, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelIn(List<Long> values) {
            addCriterion("tbl_model in", values, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelNotIn(List<Long> values) {
            addCriterion("tbl_model not in", values, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelBetween(Long value1, Long value2) {
            addCriterion("tbl_model between", value1, value2, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblModelNotBetween(Long value1, Long value2) {
            addCriterion("tbl_model not between", value1, value2, "tblModel");
            return (Criteria) this;
        }

        public Criteria andTblPriceIsNull() {
            addCriterion("tbl_price is null");
            return (Criteria) this;
        }

        public Criteria andTblPriceIsNotNull() {
            addCriterion("tbl_price is not null");
            return (Criteria) this;
        }

        public Criteria andTblPriceEqualTo(Double value) {
            addCriterion("tbl_price =", value, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceNotEqualTo(Double value) {
            addCriterion("tbl_price <>", value, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceGreaterThan(Double value) {
            addCriterion("tbl_price >", value, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tbl_price >=", value, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceLessThan(Double value) {
            addCriterion("tbl_price <", value, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceLessThanOrEqualTo(Double value) {
            addCriterion("tbl_price <=", value, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceIn(List<Double> values) {
            addCriterion("tbl_price in", values, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceNotIn(List<Double> values) {
            addCriterion("tbl_price not in", values, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceBetween(Double value1, Double value2) {
            addCriterion("tbl_price between", value1, value2, "tblPrice");
            return (Criteria) this;
        }

        public Criteria andTblPriceNotBetween(Double value1, Double value2) {
            addCriterion("tbl_price not between", value1, value2, "tblPrice");
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