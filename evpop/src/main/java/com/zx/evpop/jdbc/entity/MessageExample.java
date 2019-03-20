package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andTbmIdIsNull() {
            addCriterion("tbm_id is null");
            return (Criteria) this;
        }

        public Criteria andTbmIdIsNotNull() {
            addCriterion("tbm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbmIdEqualTo(Integer value) {
            addCriterion("tbm_id =", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotEqualTo(Integer value) {
            addCriterion("tbm_id <>", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThan(Integer value) {
            addCriterion("tbm_id >", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_id >=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThan(Integer value) {
            addCriterion("tbm_id <", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_id <=", value, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdIn(List<Integer> values) {
            addCriterion("tbm_id in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotIn(List<Integer> values) {
            addCriterion("tbm_id not in", values, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_id not between", value1, value2, "tbmId");
            return (Criteria) this;
        }

        public Criteria andTbmHostIsNull() {
            addCriterion("tbm_host is null");
            return (Criteria) this;
        }

        public Criteria andTbmHostIsNotNull() {
            addCriterion("tbm_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbmHostEqualTo(Short value) {
            addCriterion("tbm_host =", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotEqualTo(Short value) {
            addCriterion("tbm_host <>", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThan(Short value) {
            addCriterion("tbm_host >", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_host >=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThan(Short value) {
            addCriterion("tbm_host <", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostLessThanOrEqualTo(Short value) {
            addCriterion("tbm_host <=", value, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostIn(List<Short> values) {
            addCriterion("tbm_host in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotIn(List<Short> values) {
            addCriterion("tbm_host not in", values, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostBetween(Short value1, Short value2) {
            addCriterion("tbm_host between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmHostNotBetween(Short value1, Short value2) {
            addCriterion("tbm_host not between", value1, value2, "tbmHost");
            return (Criteria) this;
        }

        public Criteria andTbmTitleIsNull() {
            addCriterion("tbm_title is null");
            return (Criteria) this;
        }

        public Criteria andTbmTitleIsNotNull() {
            addCriterion("tbm_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbmTitleEqualTo(String value) {
            addCriterion("tbm_title =", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleNotEqualTo(String value) {
            addCriterion("tbm_title <>", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleGreaterThan(String value) {
            addCriterion("tbm_title >", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_title >=", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleLessThan(String value) {
            addCriterion("tbm_title <", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleLessThanOrEqualTo(String value) {
            addCriterion("tbm_title <=", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleLike(String value) {
            addCriterion("tbm_title like", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleNotLike(String value) {
            addCriterion("tbm_title not like", value, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleIn(List<String> values) {
            addCriterion("tbm_title in", values, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleNotIn(List<String> values) {
            addCriterion("tbm_title not in", values, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleBetween(String value1, String value2) {
            addCriterion("tbm_title between", value1, value2, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmTitleNotBetween(String value1, String value2) {
            addCriterion("tbm_title not between", value1, value2, "tbmTitle");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderIsNull() {
            addCriterion("tbm_rentcarorder is null");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderIsNotNull() {
            addCriterion("tbm_rentcarorder is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderEqualTo(String value) {
            addCriterion("tbm_rentcarorder =", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderNotEqualTo(String value) {
            addCriterion("tbm_rentcarorder <>", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderGreaterThan(String value) {
            addCriterion("tbm_rentcarorder >", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_rentcarorder >=", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderLessThan(String value) {
            addCriterion("tbm_rentcarorder <", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderLessThanOrEqualTo(String value) {
            addCriterion("tbm_rentcarorder <=", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderLike(String value) {
            addCriterion("tbm_rentcarorder like", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderNotLike(String value) {
            addCriterion("tbm_rentcarorder not like", value, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderIn(List<String> values) {
            addCriterion("tbm_rentcarorder in", values, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderNotIn(List<String> values) {
            addCriterion("tbm_rentcarorder not in", values, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderBetween(String value1, String value2) {
            addCriterion("tbm_rentcarorder between", value1, value2, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmRentcarorderNotBetween(String value1, String value2) {
            addCriterion("tbm_rentcarorder not between", value1, value2, "tbmRentcarorder");
            return (Criteria) this;
        }

        public Criteria andTbmHeadIsNull() {
            addCriterion("tbm_head is null");
            return (Criteria) this;
        }

        public Criteria andTbmHeadIsNotNull() {
            addCriterion("tbm_head is not null");
            return (Criteria) this;
        }

        public Criteria andTbmHeadEqualTo(String value) {
            addCriterion("tbm_head =", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadNotEqualTo(String value) {
            addCriterion("tbm_head <>", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadGreaterThan(String value) {
            addCriterion("tbm_head >", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_head >=", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadLessThan(String value) {
            addCriterion("tbm_head <", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadLessThanOrEqualTo(String value) {
            addCriterion("tbm_head <=", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadLike(String value) {
            addCriterion("tbm_head like", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadNotLike(String value) {
            addCriterion("tbm_head not like", value, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadIn(List<String> values) {
            addCriterion("tbm_head in", values, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadNotIn(List<String> values) {
            addCriterion("tbm_head not in", values, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadBetween(String value1, String value2) {
            addCriterion("tbm_head between", value1, value2, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmHeadNotBetween(String value1, String value2) {
            addCriterion("tbm_head not between", value1, value2, "tbmHead");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderIsNull() {
            addCriterion("tbm_cdorder is null");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderIsNotNull() {
            addCriterion("tbm_cdorder is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderEqualTo(String value) {
            addCriterion("tbm_cdorder =", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderNotEqualTo(String value) {
            addCriterion("tbm_cdorder <>", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderGreaterThan(String value) {
            addCriterion("tbm_cdorder >", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_cdorder >=", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderLessThan(String value) {
            addCriterion("tbm_cdorder <", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderLessThanOrEqualTo(String value) {
            addCriterion("tbm_cdorder <=", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderLike(String value) {
            addCriterion("tbm_cdorder like", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderNotLike(String value) {
            addCriterion("tbm_cdorder not like", value, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderIn(List<String> values) {
            addCriterion("tbm_cdorder in", values, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderNotIn(List<String> values) {
            addCriterion("tbm_cdorder not in", values, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderBetween(String value1, String value2) {
            addCriterion("tbm_cdorder between", value1, value2, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdorderNotBetween(String value1, String value2) {
            addCriterion("tbm_cdorder not between", value1, value2, "tbmCdorder");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyIsNull() {
            addCriterion("tbm_cdmoney is null");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyIsNotNull() {
            addCriterion("tbm_cdmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyEqualTo(Double value) {
            addCriterion("tbm_cdmoney =", value, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyNotEqualTo(Double value) {
            addCriterion("tbm_cdmoney <>", value, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyGreaterThan(Double value) {
            addCriterion("tbm_cdmoney >", value, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tbm_cdmoney >=", value, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyLessThan(Double value) {
            addCriterion("tbm_cdmoney <", value, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyLessThanOrEqualTo(Double value) {
            addCriterion("tbm_cdmoney <=", value, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyIn(List<Double> values) {
            addCriterion("tbm_cdmoney in", values, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyNotIn(List<Double> values) {
            addCriterion("tbm_cdmoney not in", values, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyBetween(Double value1, Double value2) {
            addCriterion("tbm_cdmoney between", value1, value2, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmCdmoneyNotBetween(Double value1, Double value2) {
            addCriterion("tbm_cdmoney not between", value1, value2, "tbmCdmoney");
            return (Criteria) this;
        }

        public Criteria andTbmContentIsNull() {
            addCriterion("tbm_content is null");
            return (Criteria) this;
        }

        public Criteria andTbmContentIsNotNull() {
            addCriterion("tbm_content is not null");
            return (Criteria) this;
        }

        public Criteria andTbmContentEqualTo(String value) {
            addCriterion("tbm_content =", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentNotEqualTo(String value) {
            addCriterion("tbm_content <>", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentGreaterThan(String value) {
            addCriterion("tbm_content >", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_content >=", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentLessThan(String value) {
            addCriterion("tbm_content <", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentLessThanOrEqualTo(String value) {
            addCriterion("tbm_content <=", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentLike(String value) {
            addCriterion("tbm_content like", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentNotLike(String value) {
            addCriterion("tbm_content not like", value, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentIn(List<String> values) {
            addCriterion("tbm_content in", values, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentNotIn(List<String> values) {
            addCriterion("tbm_content not in", values, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentBetween(String value1, String value2) {
            addCriterion("tbm_content between", value1, value2, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmContentNotBetween(String value1, String value2) {
            addCriterion("tbm_content not between", value1, value2, "tbmContent");
            return (Criteria) this;
        }

        public Criteria andTbmFlagIsNull() {
            addCriterion("tbm_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbmFlagIsNotNull() {
            addCriterion("tbm_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbmFlagEqualTo(String value) {
            addCriterion("tbm_flag =", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotEqualTo(String value) {
            addCriterion("tbm_flag <>", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagGreaterThan(String value) {
            addCriterion("tbm_flag >", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_flag >=", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagLessThan(String value) {
            addCriterion("tbm_flag <", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagLessThanOrEqualTo(String value) {
            addCriterion("tbm_flag <=", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagLike(String value) {
            addCriterion("tbm_flag like", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotLike(String value) {
            addCriterion("tbm_flag not like", value, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagIn(List<String> values) {
            addCriterion("tbm_flag in", values, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotIn(List<String> values) {
            addCriterion("tbm_flag not in", values, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagBetween(String value1, String value2) {
            addCriterion("tbm_flag between", value1, value2, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmFlagNotBetween(String value1, String value2) {
            addCriterion("tbm_flag not between", value1, value2, "tbmFlag");
            return (Criteria) this;
        }

        public Criteria andTbmLinkIsNull() {
            addCriterion("tbm_link is null");
            return (Criteria) this;
        }

        public Criteria andTbmLinkIsNotNull() {
            addCriterion("tbm_link is not null");
            return (Criteria) this;
        }

        public Criteria andTbmLinkEqualTo(String value) {
            addCriterion("tbm_link =", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkNotEqualTo(String value) {
            addCriterion("tbm_link <>", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkGreaterThan(String value) {
            addCriterion("tbm_link >", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_link >=", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkLessThan(String value) {
            addCriterion("tbm_link <", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkLessThanOrEqualTo(String value) {
            addCriterion("tbm_link <=", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkLike(String value) {
            addCriterion("tbm_link like", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkNotLike(String value) {
            addCriterion("tbm_link not like", value, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkIn(List<String> values) {
            addCriterion("tbm_link in", values, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkNotIn(List<String> values) {
            addCriterion("tbm_link not in", values, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkBetween(String value1, String value2) {
            addCriterion("tbm_link between", value1, value2, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmLinkNotBetween(String value1, String value2) {
            addCriterion("tbm_link not between", value1, value2, "tbmLink");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorIsNull() {
            addCriterion("tbm_operator is null");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorIsNotNull() {
            addCriterion("tbm_operator is not null");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorEqualTo(Integer value) {
            addCriterion("tbm_operator =", value, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorNotEqualTo(Integer value) {
            addCriterion("tbm_operator <>", value, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorGreaterThan(Integer value) {
            addCriterion("tbm_operator >", value, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_operator >=", value, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorLessThan(Integer value) {
            addCriterion("tbm_operator <", value, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_operator <=", value, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorIn(List<Integer> values) {
            addCriterion("tbm_operator in", values, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorNotIn(List<Integer> values) {
            addCriterion("tbm_operator not in", values, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorBetween(Integer value1, Integer value2) {
            addCriterion("tbm_operator between", value1, value2, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_operator not between", value1, value2, "tbmOperator");
            return (Criteria) this;
        }

        public Criteria andTbmMemberIsNull() {
            addCriterion("tbm_member is null");
            return (Criteria) this;
        }

        public Criteria andTbmMemberIsNotNull() {
            addCriterion("tbm_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbmMemberEqualTo(Integer value) {
            addCriterion("tbm_member =", value, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberNotEqualTo(Integer value) {
            addCriterion("tbm_member <>", value, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberGreaterThan(Integer value) {
            addCriterion("tbm_member >", value, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_member >=", value, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberLessThan(Integer value) {
            addCriterion("tbm_member <", value, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_member <=", value, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberIn(List<Integer> values) {
            addCriterion("tbm_member in", values, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberNotIn(List<Integer> values) {
            addCriterion("tbm_member not in", values, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbm_member between", value1, value2, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_member not between", value1, value2, "tbmMember");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeIsNull() {
            addCriterion("tbm_rcv_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeIsNotNull() {
            addCriterion("tbm_rcv_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeEqualTo(Date value) {
            addCriterion("tbm_rcv_time =", value, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeNotEqualTo(Date value) {
            addCriterion("tbm_rcv_time <>", value, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeGreaterThan(Date value) {
            addCriterion("tbm_rcv_time >", value, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_rcv_time >=", value, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeLessThan(Date value) {
            addCriterion("tbm_rcv_time <", value, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_rcv_time <=", value, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeIn(List<Date> values) {
            addCriterion("tbm_rcv_time in", values, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeNotIn(List<Date> values) {
            addCriterion("tbm_rcv_time not in", values, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_rcv_time between", value1, value2, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmRcvTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_rcv_time not between", value1, value2, "tbmRcvTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeIsNull() {
            addCriterion("tbm_snd_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeIsNotNull() {
            addCriterion("tbm_snd_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeEqualTo(Date value) {
            addCriterion("tbm_snd_time =", value, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeNotEqualTo(Date value) {
            addCriterion("tbm_snd_time <>", value, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeGreaterThan(Date value) {
            addCriterion("tbm_snd_time >", value, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_snd_time >=", value, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeLessThan(Date value) {
            addCriterion("tbm_snd_time <", value, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_snd_time <=", value, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeIn(List<Date> values) {
            addCriterion("tbm_snd_time in", values, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeNotIn(List<Date> values) {
            addCriterion("tbm_snd_time not in", values, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_snd_time between", value1, value2, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmSndTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_snd_time not between", value1, value2, "tbmSndTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNull() {
            addCriterion("tbm_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIsNotNull() {
            addCriterion("tbm_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeEqualTo(Date value) {
            addCriterion("tbm_add_time =", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotEqualTo(Date value) {
            addCriterion("tbm_add_time <>", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThan(Date value) {
            addCriterion("tbm_add_time >", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time >=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThan(Date value) {
            addCriterion("tbm_add_time <", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_add_time <=", value, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeIn(List<Date> values) {
            addCriterion("tbm_add_time in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotIn(List<Date> values) {
            addCriterion("tbm_add_time not in", values, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_add_time not between", value1, value2, "tbmAddTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNull() {
            addCriterion("tbm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIsNotNull() {
            addCriterion("tbm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeEqualTo(Date value) {
            addCriterion("tbm_update_time =", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbm_update_time <>", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThan(Date value) {
            addCriterion("tbm_update_time >", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time >=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThan(Date value) {
            addCriterion("tbm_update_time <", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbm_update_time <=", value, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeIn(List<Date> values) {
            addCriterion("tbm_update_time in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbm_update_time not in", values, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbm_update_time not between", value1, value2, "tbmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNull() {
            addCriterion("tbm_status is null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIsNotNull() {
            addCriterion("tbm_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbmStatusEqualTo(Byte value) {
            addCriterion("tbm_status =", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotEqualTo(Byte value) {
            addCriterion("tbm_status <>", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThan(Byte value) {
            addCriterion("tbm_status >", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_status >=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThan(Byte value) {
            addCriterion("tbm_status <", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_status <=", value, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusIn(List<Byte> values) {
            addCriterion("tbm_status in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotIn(List<Byte> values) {
            addCriterion("tbm_status not in", values, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_status not between", value1, value2, "tbmStatus");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageIsNull() {
            addCriterion("tbm_relationmessage is null");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageIsNotNull() {
            addCriterion("tbm_relationmessage is not null");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageEqualTo(Long value) {
            addCriterion("tbm_relationmessage =", value, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageNotEqualTo(Long value) {
            addCriterion("tbm_relationmessage <>", value, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageGreaterThan(Long value) {
            addCriterion("tbm_relationmessage >", value, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageGreaterThanOrEqualTo(Long value) {
            addCriterion("tbm_relationmessage >=", value, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageLessThan(Long value) {
            addCriterion("tbm_relationmessage <", value, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageLessThanOrEqualTo(Long value) {
            addCriterion("tbm_relationmessage <=", value, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageIn(List<Long> values) {
            addCriterion("tbm_relationmessage in", values, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageNotIn(List<Long> values) {
            addCriterion("tbm_relationmessage not in", values, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageBetween(Long value1, Long value2) {
            addCriterion("tbm_relationmessage between", value1, value2, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmRelationmessageNotBetween(Long value1, Long value2) {
            addCriterion("tbm_relationmessage not between", value1, value2, "tbmRelationmessage");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameIsNull() {
            addCriterion("tbm_operatorname is null");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameIsNotNull() {
            addCriterion("tbm_operatorname is not null");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameEqualTo(String value) {
            addCriterion("tbm_operatorname =", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameNotEqualTo(String value) {
            addCriterion("tbm_operatorname <>", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameGreaterThan(String value) {
            addCriterion("tbm_operatorname >", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_operatorname >=", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameLessThan(String value) {
            addCriterion("tbm_operatorname <", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameLessThanOrEqualTo(String value) {
            addCriterion("tbm_operatorname <=", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameLike(String value) {
            addCriterion("tbm_operatorname like", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameNotLike(String value) {
            addCriterion("tbm_operatorname not like", value, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameIn(List<String> values) {
            addCriterion("tbm_operatorname in", values, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameNotIn(List<String> values) {
            addCriterion("tbm_operatorname not in", values, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameBetween(String value1, String value2) {
            addCriterion("tbm_operatorname between", value1, value2, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmOperatornameNotBetween(String value1, String value2) {
            addCriterion("tbm_operatorname not between", value1, value2, "tbmOperatorname");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNull() {
            addCriterion("tbm_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNotNull() {
            addCriterion("tbm_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeEqualTo(Byte value) {
            addCriterion("tbm_type =", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotEqualTo(Byte value) {
            addCriterion("tbm_type <>", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThan(Byte value) {
            addCriterion("tbm_type >", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbm_type >=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThan(Byte value) {
            addCriterion("tbm_type <", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbm_type <=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIn(List<Byte> values) {
            addCriterion("tbm_type in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotIn(List<Byte> values) {
            addCriterion("tbm_type not in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbm_type not between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryIsNull() {
            addCriterion("tbm_category is null");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryIsNotNull() {
            addCriterion("tbm_category is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryEqualTo(Short value) {
            addCriterion("tbm_category =", value, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryNotEqualTo(Short value) {
            addCriterion("tbm_category <>", value, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryGreaterThan(Short value) {
            addCriterion("tbm_category >", value, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_category >=", value, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryLessThan(Short value) {
            addCriterion("tbm_category <", value, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryLessThanOrEqualTo(Short value) {
            addCriterion("tbm_category <=", value, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryIn(List<Short> values) {
            addCriterion("tbm_category in", values, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryNotIn(List<Short> values) {
            addCriterion("tbm_category not in", values, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryBetween(Short value1, Short value2) {
            addCriterion("tbm_category between", value1, value2, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCategoryNotBetween(Short value1, Short value2) {
            addCriterion("tbm_category not between", value1, value2, "tbmCategory");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeIsNull() {
            addCriterion("tbm_ctype is null");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeIsNotNull() {
            addCriterion("tbm_ctype is not null");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeEqualTo(Short value) {
            addCriterion("tbm_ctype =", value, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeNotEqualTo(Short value) {
            addCriterion("tbm_ctype <>", value, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeGreaterThan(Short value) {
            addCriterion("tbm_ctype >", value, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbm_ctype >=", value, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeLessThan(Short value) {
            addCriterion("tbm_ctype <", value, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeLessThanOrEqualTo(Short value) {
            addCriterion("tbm_ctype <=", value, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeIn(List<Short> values) {
            addCriterion("tbm_ctype in", values, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeNotIn(List<Short> values) {
            addCriterion("tbm_ctype not in", values, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeBetween(Short value1, Short value2) {
            addCriterion("tbm_ctype between", value1, value2, "tbmCtype");
            return (Criteria) this;
        }

        public Criteria andTbmCtypeNotBetween(Short value1, Short value2) {
            addCriterion("tbm_ctype not between", value1, value2, "tbmCtype");
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