package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentExample() {
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

        public Criteria andTbcIdIsNull() {
            addCriterion("tbc_id is null");
            return (Criteria) this;
        }

        public Criteria andTbcIdIsNotNull() {
            addCriterion("tbc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbcIdEqualTo(Integer value) {
            addCriterion("tbc_id =", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotEqualTo(Integer value) {
            addCriterion("tbc_id <>", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdGreaterThan(Integer value) {
            addCriterion("tbc_id >", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_id >=", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdLessThan(Integer value) {
            addCriterion("tbc_id <", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_id <=", value, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdIn(List<Integer> values) {
            addCriterion("tbc_id in", values, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotIn(List<Integer> values) {
            addCriterion("tbc_id not in", values, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdBetween(Integer value1, Integer value2) {
            addCriterion("tbc_id between", value1, value2, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_id not between", value1, value2, "tbcId");
            return (Criteria) this;
        }

        public Criteria andTbcTitleIsNull() {
            addCriterion("tbc_title is null");
            return (Criteria) this;
        }

        public Criteria andTbcTitleIsNotNull() {
            addCriterion("tbc_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbcTitleEqualTo(String value) {
            addCriterion("tbc_title =", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotEqualTo(String value) {
            addCriterion("tbc_title <>", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleGreaterThan(String value) {
            addCriterion("tbc_title >", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_title >=", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleLessThan(String value) {
            addCriterion("tbc_title <", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleLessThanOrEqualTo(String value) {
            addCriterion("tbc_title <=", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleLike(String value) {
            addCriterion("tbc_title like", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotLike(String value) {
            addCriterion("tbc_title not like", value, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleIn(List<String> values) {
            addCriterion("tbc_title in", values, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotIn(List<String> values) {
            addCriterion("tbc_title not in", values, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleBetween(String value1, String value2) {
            addCriterion("tbc_title between", value1, value2, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcTitleNotBetween(String value1, String value2) {
            addCriterion("tbc_title not between", value1, value2, "tbcTitle");
            return (Criteria) this;
        }

        public Criteria andTbcParentIsNull() {
            addCriterion("tbc_parent is null");
            return (Criteria) this;
        }

        public Criteria andTbcParentIsNotNull() {
            addCriterion("tbc_parent is not null");
            return (Criteria) this;
        }

        public Criteria andTbcParentEqualTo(Integer value) {
            addCriterion("tbc_parent =", value, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentNotEqualTo(Integer value) {
            addCriterion("tbc_parent <>", value, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentGreaterThan(Integer value) {
            addCriterion("tbc_parent >", value, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_parent >=", value, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentLessThan(Integer value) {
            addCriterion("tbc_parent <", value, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_parent <=", value, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentIn(List<Integer> values) {
            addCriterion("tbc_parent in", values, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentNotIn(List<Integer> values) {
            addCriterion("tbc_parent not in", values, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentBetween(Integer value1, Integer value2) {
            addCriterion("tbc_parent between", value1, value2, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcParentNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_parent not between", value1, value2, "tbcParent");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIsNull() {
            addCriterion("tbc_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIsNotNull() {
            addCriterion("tbc_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbcFlagEqualTo(String value) {
            addCriterion("tbc_flag =", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotEqualTo(String value) {
            addCriterion("tbc_flag <>", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagGreaterThan(String value) {
            addCriterion("tbc_flag >", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_flag >=", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLessThan(String value) {
            addCriterion("tbc_flag <", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLessThanOrEqualTo(String value) {
            addCriterion("tbc_flag <=", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagLike(String value) {
            addCriterion("tbc_flag like", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotLike(String value) {
            addCriterion("tbc_flag not like", value, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagIn(List<String> values) {
            addCriterion("tbc_flag in", values, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotIn(List<String> values) {
            addCriterion("tbc_flag not in", values, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagBetween(String value1, String value2) {
            addCriterion("tbc_flag between", value1, value2, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcFlagNotBetween(String value1, String value2) {
            addCriterion("tbc_flag not between", value1, value2, "tbcFlag");
            return (Criteria) this;
        }

        public Criteria andTbcOrderIsNull() {
            addCriterion("tbc_order is null");
            return (Criteria) this;
        }

        public Criteria andTbcOrderIsNotNull() {
            addCriterion("tbc_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbcOrderEqualTo(Integer value) {
            addCriterion("tbc_order =", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderNotEqualTo(Integer value) {
            addCriterion("tbc_order <>", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderGreaterThan(Integer value) {
            addCriterion("tbc_order >", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_order >=", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderLessThan(Integer value) {
            addCriterion("tbc_order <", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_order <=", value, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderIn(List<Integer> values) {
            addCriterion("tbc_order in", values, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderNotIn(List<Integer> values) {
            addCriterion("tbc_order not in", values, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderBetween(Integer value1, Integer value2) {
            addCriterion("tbc_order between", value1, value2, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_order not between", value1, value2, "tbcOrder");
            return (Criteria) this;
        }

        public Criteria andTbcThumIsNull() {
            addCriterion("tbc_thum is null");
            return (Criteria) this;
        }

        public Criteria andTbcThumIsNotNull() {
            addCriterion("tbc_thum is not null");
            return (Criteria) this;
        }

        public Criteria andTbcThumEqualTo(String value) {
            addCriterion("tbc_thum =", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumNotEqualTo(String value) {
            addCriterion("tbc_thum <>", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumGreaterThan(String value) {
            addCriterion("tbc_thum >", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_thum >=", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumLessThan(String value) {
            addCriterion("tbc_thum <", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumLessThanOrEqualTo(String value) {
            addCriterion("tbc_thum <=", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumLike(String value) {
            addCriterion("tbc_thum like", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumNotLike(String value) {
            addCriterion("tbc_thum not like", value, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumIn(List<String> values) {
            addCriterion("tbc_thum in", values, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumNotIn(List<String> values) {
            addCriterion("tbc_thum not in", values, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumBetween(String value1, String value2) {
            addCriterion("tbc_thum between", value1, value2, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcThumNotBetween(String value1, String value2) {
            addCriterion("tbc_thum not between", value1, value2, "tbcThum");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionIsNull() {
            addCriterion("tbc_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionIsNotNull() {
            addCriterion("tbc_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionEqualTo(String value) {
            addCriterion("tbc_introduction =", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionNotEqualTo(String value) {
            addCriterion("tbc_introduction <>", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionGreaterThan(String value) {
            addCriterion("tbc_introduction >", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_introduction >=", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionLessThan(String value) {
            addCriterion("tbc_introduction <", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionLessThanOrEqualTo(String value) {
            addCriterion("tbc_introduction <=", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionLike(String value) {
            addCriterion("tbc_introduction like", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionNotLike(String value) {
            addCriterion("tbc_introduction not like", value, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionIn(List<String> values) {
            addCriterion("tbc_introduction in", values, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionNotIn(List<String> values) {
            addCriterion("tbc_introduction not in", values, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionBetween(String value1, String value2) {
            addCriterion("tbc_introduction between", value1, value2, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcIntroductionNotBetween(String value1, String value2) {
            addCriterion("tbc_introduction not between", value1, value2, "tbcIntroduction");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsIsNull() {
            addCriterion("tbc_keywords is null");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsIsNotNull() {
            addCriterion("tbc_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsEqualTo(String value) {
            addCriterion("tbc_keywords =", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsNotEqualTo(String value) {
            addCriterion("tbc_keywords <>", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsGreaterThan(String value) {
            addCriterion("tbc_keywords >", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_keywords >=", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsLessThan(String value) {
            addCriterion("tbc_keywords <", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsLessThanOrEqualTo(String value) {
            addCriterion("tbc_keywords <=", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsLike(String value) {
            addCriterion("tbc_keywords like", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsNotLike(String value) {
            addCriterion("tbc_keywords not like", value, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsIn(List<String> values) {
            addCriterion("tbc_keywords in", values, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsNotIn(List<String> values) {
            addCriterion("tbc_keywords not in", values, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsBetween(String value1, String value2) {
            addCriterion("tbc_keywords between", value1, value2, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcKeywordsNotBetween(String value1, String value2) {
            addCriterion("tbc_keywords not between", value1, value2, "tbcKeywords");
            return (Criteria) this;
        }

        public Criteria andTbcImagesIsNull() {
            addCriterion("tbc_images is null");
            return (Criteria) this;
        }

        public Criteria andTbcImagesIsNotNull() {
            addCriterion("tbc_images is not null");
            return (Criteria) this;
        }

        public Criteria andTbcImagesEqualTo(String value) {
            addCriterion("tbc_images =", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesNotEqualTo(String value) {
            addCriterion("tbc_images <>", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesGreaterThan(String value) {
            addCriterion("tbc_images >", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_images >=", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesLessThan(String value) {
            addCriterion("tbc_images <", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesLessThanOrEqualTo(String value) {
            addCriterion("tbc_images <=", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesLike(String value) {
            addCriterion("tbc_images like", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesNotLike(String value) {
            addCriterion("tbc_images not like", value, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesIn(List<String> values) {
            addCriterion("tbc_images in", values, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesNotIn(List<String> values) {
            addCriterion("tbc_images not in", values, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesBetween(String value1, String value2) {
            addCriterion("tbc_images between", value1, value2, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcImagesNotBetween(String value1, String value2) {
            addCriterion("tbc_images not between", value1, value2, "tbcImages");
            return (Criteria) this;
        }

        public Criteria andTbcFileIsNull() {
            addCriterion("tbc_file is null");
            return (Criteria) this;
        }

        public Criteria andTbcFileIsNotNull() {
            addCriterion("tbc_file is not null");
            return (Criteria) this;
        }

        public Criteria andTbcFileEqualTo(String value) {
            addCriterion("tbc_file =", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileNotEqualTo(String value) {
            addCriterion("tbc_file <>", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileGreaterThan(String value) {
            addCriterion("tbc_file >", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_file >=", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileLessThan(String value) {
            addCriterion("tbc_file <", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileLessThanOrEqualTo(String value) {
            addCriterion("tbc_file <=", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileLike(String value) {
            addCriterion("tbc_file like", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileNotLike(String value) {
            addCriterion("tbc_file not like", value, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileIn(List<String> values) {
            addCriterion("tbc_file in", values, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileNotIn(List<String> values) {
            addCriterion("tbc_file not in", values, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileBetween(String value1, String value2) {
            addCriterion("tbc_file between", value1, value2, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcFileNotBetween(String value1, String value2) {
            addCriterion("tbc_file not between", value1, value2, "tbcFile");
            return (Criteria) this;
        }

        public Criteria andTbcLinkIsNull() {
            addCriterion("tbc_link is null");
            return (Criteria) this;
        }

        public Criteria andTbcLinkIsNotNull() {
            addCriterion("tbc_link is not null");
            return (Criteria) this;
        }

        public Criteria andTbcLinkEqualTo(String value) {
            addCriterion("tbc_link =", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkNotEqualTo(String value) {
            addCriterion("tbc_link <>", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkGreaterThan(String value) {
            addCriterion("tbc_link >", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkGreaterThanOrEqualTo(String value) {
            addCriterion("tbc_link >=", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkLessThan(String value) {
            addCriterion("tbc_link <", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkLessThanOrEqualTo(String value) {
            addCriterion("tbc_link <=", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkLike(String value) {
            addCriterion("tbc_link like", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkNotLike(String value) {
            addCriterion("tbc_link not like", value, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkIn(List<String> values) {
            addCriterion("tbc_link in", values, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkNotIn(List<String> values) {
            addCriterion("tbc_link not in", values, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkBetween(String value1, String value2) {
            addCriterion("tbc_link between", value1, value2, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcLinkNotBetween(String value1, String value2) {
            addCriterion("tbc_link not between", value1, value2, "tbcLink");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIsNull() {
            addCriterion("tbc_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIsNotNull() {
            addCriterion("tbc_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeEqualTo(Date value) {
            addCriterion("tbc_add_time =", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotEqualTo(Date value) {
            addCriterion("tbc_add_time <>", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeGreaterThan(Date value) {
            addCriterion("tbc_add_time >", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_add_time >=", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeLessThan(Date value) {
            addCriterion("tbc_add_time <", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_add_time <=", value, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeIn(List<Date> values) {
            addCriterion("tbc_add_time in", values, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotIn(List<Date> values) {
            addCriterion("tbc_add_time not in", values, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_add_time between", value1, value2, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_add_time not between", value1, value2, "tbcAddTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIsNull() {
            addCriterion("tbc_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIsNotNull() {
            addCriterion("tbc_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeEqualTo(Date value) {
            addCriterion("tbc_update_time =", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbc_update_time <>", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeGreaterThan(Date value) {
            addCriterion("tbc_update_time >", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbc_update_time >=", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeLessThan(Date value) {
            addCriterion("tbc_update_time <", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbc_update_time <=", value, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeIn(List<Date> values) {
            addCriterion("tbc_update_time in", values, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbc_update_time not in", values, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbc_update_time between", value1, value2, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbc_update_time not between", value1, value2, "tbcUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbcViewSIsNull() {
            addCriterion("tbc_view_s is null");
            return (Criteria) this;
        }

        public Criteria andTbcViewSIsNotNull() {
            addCriterion("tbc_view_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbcViewSEqualTo(Integer value) {
            addCriterion("tbc_view_s =", value, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSNotEqualTo(Integer value) {
            addCriterion("tbc_view_s <>", value, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSGreaterThan(Integer value) {
            addCriterion("tbc_view_s >", value, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_view_s >=", value, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSLessThan(Integer value) {
            addCriterion("tbc_view_s <", value, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_view_s <=", value, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSIn(List<Integer> values) {
            addCriterion("tbc_view_s in", values, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSNotIn(List<Integer> values) {
            addCriterion("tbc_view_s not in", values, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSBetween(Integer value1, Integer value2) {
            addCriterion("tbc_view_s between", value1, value2, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcViewSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_view_s not between", value1, value2, "tbcViewS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySIsNull() {
            addCriterion("tbc_reply_s is null");
            return (Criteria) this;
        }

        public Criteria andTbcReplySIsNotNull() {
            addCriterion("tbc_reply_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbcReplySEqualTo(Integer value) {
            addCriterion("tbc_reply_s =", value, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySNotEqualTo(Integer value) {
            addCriterion("tbc_reply_s <>", value, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySGreaterThan(Integer value) {
            addCriterion("tbc_reply_s >", value, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_reply_s >=", value, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySLessThan(Integer value) {
            addCriterion("tbc_reply_s <", value, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_reply_s <=", value, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySIn(List<Integer> values) {
            addCriterion("tbc_reply_s in", values, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySNotIn(List<Integer> values) {
            addCriterion("tbc_reply_s not in", values, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySBetween(Integer value1, Integer value2) {
            addCriterion("tbc_reply_s between", value1, value2, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcReplySNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_reply_s not between", value1, value2, "tbcReplyS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSIsNull() {
            addCriterion("tbc_collect_s is null");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSIsNotNull() {
            addCriterion("tbc_collect_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSEqualTo(Integer value) {
            addCriterion("tbc_collect_s =", value, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSNotEqualTo(Integer value) {
            addCriterion("tbc_collect_s <>", value, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSGreaterThan(Integer value) {
            addCriterion("tbc_collect_s >", value, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_collect_s >=", value, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSLessThan(Integer value) {
            addCriterion("tbc_collect_s <", value, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_collect_s <=", value, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSIn(List<Integer> values) {
            addCriterion("tbc_collect_s in", values, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSNotIn(List<Integer> values) {
            addCriterion("tbc_collect_s not in", values, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSBetween(Integer value1, Integer value2) {
            addCriterion("tbc_collect_s between", value1, value2, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcCollectSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_collect_s not between", value1, value2, "tbcCollectS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSIsNull() {
            addCriterion("tbc_praise_s is null");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSIsNotNull() {
            addCriterion("tbc_praise_s is not null");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSEqualTo(Integer value) {
            addCriterion("tbc_praise_s =", value, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSNotEqualTo(Integer value) {
            addCriterion("tbc_praise_s <>", value, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSGreaterThan(Integer value) {
            addCriterion("tbc_praise_s >", value, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbc_praise_s >=", value, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSLessThan(Integer value) {
            addCriterion("tbc_praise_s <", value, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSLessThanOrEqualTo(Integer value) {
            addCriterion("tbc_praise_s <=", value, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSIn(List<Integer> values) {
            addCriterion("tbc_praise_s in", values, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSNotIn(List<Integer> values) {
            addCriterion("tbc_praise_s not in", values, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSBetween(Integer value1, Integer value2) {
            addCriterion("tbc_praise_s between", value1, value2, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcPraiseSNotBetween(Integer value1, Integer value2) {
            addCriterion("tbc_praise_s not between", value1, value2, "tbcPraiseS");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIsNull() {
            addCriterion("tbc_status is null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIsNotNull() {
            addCriterion("tbc_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbcStatusEqualTo(Byte value) {
            addCriterion("tbc_status =", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotEqualTo(Byte value) {
            addCriterion("tbc_status <>", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusGreaterThan(Byte value) {
            addCriterion("tbc_status >", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbc_status >=", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusLessThan(Byte value) {
            addCriterion("tbc_status <", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbc_status <=", value, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusIn(List<Byte> values) {
            addCriterion("tbc_status in", values, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotIn(List<Byte> values) {
            addCriterion("tbc_status not in", values, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status between", value1, value2, "tbcStatus");
            return (Criteria) this;
        }

        public Criteria andTbcStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbc_status not between", value1, value2, "tbcStatus");
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