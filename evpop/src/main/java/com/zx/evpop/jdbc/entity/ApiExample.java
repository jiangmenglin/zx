package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiExample() {
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

        public Criteria andSaIdIsNull() {
            addCriterion("sa_id is null");
            return (Criteria) this;
        }

        public Criteria andSaIdIsNotNull() {
            addCriterion("sa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaIdEqualTo(Long value) {
            addCriterion("sa_id =", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotEqualTo(Long value) {
            addCriterion("sa_id <>", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThan(Long value) {
            addCriterion("sa_id >", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sa_id >=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThan(Long value) {
            addCriterion("sa_id <", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdLessThanOrEqualTo(Long value) {
            addCriterion("sa_id <=", value, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdIn(List<Long> values) {
            addCriterion("sa_id in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotIn(List<Long> values) {
            addCriterion("sa_id not in", values, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdBetween(Long value1, Long value2) {
            addCriterion("sa_id between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaIdNotBetween(Long value1, Long value2) {
            addCriterion("sa_id not between", value1, value2, "saId");
            return (Criteria) this;
        }

        public Criteria andSaNameIsNull() {
            addCriterion("sa_name is null");
            return (Criteria) this;
        }

        public Criteria andSaNameIsNotNull() {
            addCriterion("sa_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaNameEqualTo(String value) {
            addCriterion("sa_name =", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotEqualTo(String value) {
            addCriterion("sa_name <>", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameGreaterThan(String value) {
            addCriterion("sa_name >", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameGreaterThanOrEqualTo(String value) {
            addCriterion("sa_name >=", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameLessThan(String value) {
            addCriterion("sa_name <", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameLessThanOrEqualTo(String value) {
            addCriterion("sa_name <=", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameLike(String value) {
            addCriterion("sa_name like", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotLike(String value) {
            addCriterion("sa_name not like", value, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameIn(List<String> values) {
            addCriterion("sa_name in", values, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotIn(List<String> values) {
            addCriterion("sa_name not in", values, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameBetween(String value1, String value2) {
            addCriterion("sa_name between", value1, value2, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNameNotBetween(String value1, String value2) {
            addCriterion("sa_name not between", value1, value2, "saName");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceIsNull() {
            addCriterion("sa_namespace is null");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceIsNotNull() {
            addCriterion("sa_namespace is not null");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceEqualTo(String value) {
            addCriterion("sa_namespace =", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceNotEqualTo(String value) {
            addCriterion("sa_namespace <>", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceGreaterThan(String value) {
            addCriterion("sa_namespace >", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceGreaterThanOrEqualTo(String value) {
            addCriterion("sa_namespace >=", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceLessThan(String value) {
            addCriterion("sa_namespace <", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceLessThanOrEqualTo(String value) {
            addCriterion("sa_namespace <=", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceLike(String value) {
            addCriterion("sa_namespace like", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceNotLike(String value) {
            addCriterion("sa_namespace not like", value, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceIn(List<String> values) {
            addCriterion("sa_namespace in", values, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceNotIn(List<String> values) {
            addCriterion("sa_namespace not in", values, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceBetween(String value1, String value2) {
            addCriterion("sa_namespace between", value1, value2, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaNamespaceNotBetween(String value1, String value2) {
            addCriterion("sa_namespace not between", value1, value2, "saNamespace");
            return (Criteria) this;
        }

        public Criteria andSaTypeIsNull() {
            addCriterion("sa_type is null");
            return (Criteria) this;
        }

        public Criteria andSaTypeIsNotNull() {
            addCriterion("sa_type is not null");
            return (Criteria) this;
        }

        public Criteria andSaTypeEqualTo(Long value) {
            addCriterion("sa_type =", value, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeNotEqualTo(Long value) {
            addCriterion("sa_type <>", value, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeGreaterThan(Long value) {
            addCriterion("sa_type >", value, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("sa_type >=", value, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeLessThan(Long value) {
            addCriterion("sa_type <", value, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeLessThanOrEqualTo(Long value) {
            addCriterion("sa_type <=", value, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeIn(List<Long> values) {
            addCriterion("sa_type in", values, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeNotIn(List<Long> values) {
            addCriterion("sa_type not in", values, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeBetween(Long value1, Long value2) {
            addCriterion("sa_type between", value1, value2, "saType");
            return (Criteria) this;
        }

        public Criteria andSaTypeNotBetween(Long value1, Long value2) {
            addCriterion("sa_type not between", value1, value2, "saType");
            return (Criteria) this;
        }

        public Criteria andSaVersionIsNull() {
            addCriterion("sa_version is null");
            return (Criteria) this;
        }

        public Criteria andSaVersionIsNotNull() {
            addCriterion("sa_version is not null");
            return (Criteria) this;
        }

        public Criteria andSaVersionEqualTo(Short value) {
            addCriterion("sa_version =", value, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionNotEqualTo(Short value) {
            addCriterion("sa_version <>", value, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionGreaterThan(Short value) {
            addCriterion("sa_version >", value, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("sa_version >=", value, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionLessThan(Short value) {
            addCriterion("sa_version <", value, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionLessThanOrEqualTo(Short value) {
            addCriterion("sa_version <=", value, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionIn(List<Short> values) {
            addCriterion("sa_version in", values, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionNotIn(List<Short> values) {
            addCriterion("sa_version not in", values, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionBetween(Short value1, Short value2) {
            addCriterion("sa_version between", value1, value2, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaVersionNotBetween(Short value1, Short value2) {
            addCriterion("sa_version not between", value1, value2, "saVersion");
            return (Criteria) this;
        }

        public Criteria andSaOpenIsNull() {
            addCriterion("sa_open is null");
            return (Criteria) this;
        }

        public Criteria andSaOpenIsNotNull() {
            addCriterion("sa_open is not null");
            return (Criteria) this;
        }

        public Criteria andSaOpenEqualTo(Short value) {
            addCriterion("sa_open =", value, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenNotEqualTo(Short value) {
            addCriterion("sa_open <>", value, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenGreaterThan(Short value) {
            addCriterion("sa_open >", value, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenGreaterThanOrEqualTo(Short value) {
            addCriterion("sa_open >=", value, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenLessThan(Short value) {
            addCriterion("sa_open <", value, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenLessThanOrEqualTo(Short value) {
            addCriterion("sa_open <=", value, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenIn(List<Short> values) {
            addCriterion("sa_open in", values, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenNotIn(List<Short> values) {
            addCriterion("sa_open not in", values, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenBetween(Short value1, Short value2) {
            addCriterion("sa_open between", value1, value2, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOpenNotBetween(Short value1, Short value2) {
            addCriterion("sa_open not between", value1, value2, "saOpen");
            return (Criteria) this;
        }

        public Criteria andSaOauthIsNull() {
            addCriterion("sa_oauth is null");
            return (Criteria) this;
        }

        public Criteria andSaOauthIsNotNull() {
            addCriterion("sa_oauth is not null");
            return (Criteria) this;
        }

        public Criteria andSaOauthEqualTo(Short value) {
            addCriterion("sa_oauth =", value, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthNotEqualTo(Short value) {
            addCriterion("sa_oauth <>", value, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthGreaterThan(Short value) {
            addCriterion("sa_oauth >", value, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthGreaterThanOrEqualTo(Short value) {
            addCriterion("sa_oauth >=", value, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthLessThan(Short value) {
            addCriterion("sa_oauth <", value, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthLessThanOrEqualTo(Short value) {
            addCriterion("sa_oauth <=", value, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthIn(List<Short> values) {
            addCriterion("sa_oauth in", values, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthNotIn(List<Short> values) {
            addCriterion("sa_oauth not in", values, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthBetween(Short value1, Short value2) {
            addCriterion("sa_oauth between", value1, value2, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaOauthNotBetween(Short value1, Short value2) {
            addCriterion("sa_oauth not between", value1, value2, "saOauth");
            return (Criteria) this;
        }

        public Criteria andSaDescriptIsNull() {
            addCriterion("sa_descript is null");
            return (Criteria) this;
        }

        public Criteria andSaDescriptIsNotNull() {
            addCriterion("sa_descript is not null");
            return (Criteria) this;
        }

        public Criteria andSaDescriptEqualTo(String value) {
            addCriterion("sa_descript =", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptNotEqualTo(String value) {
            addCriterion("sa_descript <>", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptGreaterThan(String value) {
            addCriterion("sa_descript >", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("sa_descript >=", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptLessThan(String value) {
            addCriterion("sa_descript <", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptLessThanOrEqualTo(String value) {
            addCriterion("sa_descript <=", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptLike(String value) {
            addCriterion("sa_descript like", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptNotLike(String value) {
            addCriterion("sa_descript not like", value, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptIn(List<String> values) {
            addCriterion("sa_descript in", values, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptNotIn(List<String> values) {
            addCriterion("sa_descript not in", values, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptBetween(String value1, String value2) {
            addCriterion("sa_descript between", value1, value2, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaDescriptNotBetween(String value1, String value2) {
            addCriterion("sa_descript not between", value1, value2, "saDescript");
            return (Criteria) this;
        }

        public Criteria andSaClassIsNull() {
            addCriterion("sa_class is null");
            return (Criteria) this;
        }

        public Criteria andSaClassIsNotNull() {
            addCriterion("sa_class is not null");
            return (Criteria) this;
        }

        public Criteria andSaClassEqualTo(String value) {
            addCriterion("sa_class =", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassNotEqualTo(String value) {
            addCriterion("sa_class <>", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassGreaterThan(String value) {
            addCriterion("sa_class >", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassGreaterThanOrEqualTo(String value) {
            addCriterion("sa_class >=", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassLessThan(String value) {
            addCriterion("sa_class <", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassLessThanOrEqualTo(String value) {
            addCriterion("sa_class <=", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassLike(String value) {
            addCriterion("sa_class like", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassNotLike(String value) {
            addCriterion("sa_class not like", value, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassIn(List<String> values) {
            addCriterion("sa_class in", values, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassNotIn(List<String> values) {
            addCriterion("sa_class not in", values, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassBetween(String value1, String value2) {
            addCriterion("sa_class between", value1, value2, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaClassNotBetween(String value1, String value2) {
            addCriterion("sa_class not between", value1, value2, "saClass");
            return (Criteria) this;
        }

        public Criteria andSaDirIsNull() {
            addCriterion("sa_dir is null");
            return (Criteria) this;
        }

        public Criteria andSaDirIsNotNull() {
            addCriterion("sa_dir is not null");
            return (Criteria) this;
        }

        public Criteria andSaDirEqualTo(Short value) {
            addCriterion("sa_dir =", value, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirNotEqualTo(Short value) {
            addCriterion("sa_dir <>", value, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirGreaterThan(Short value) {
            addCriterion("sa_dir >", value, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirGreaterThanOrEqualTo(Short value) {
            addCriterion("sa_dir >=", value, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirLessThan(Short value) {
            addCriterion("sa_dir <", value, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirLessThanOrEqualTo(Short value) {
            addCriterion("sa_dir <=", value, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirIn(List<Short> values) {
            addCriterion("sa_dir in", values, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirNotIn(List<Short> values) {
            addCriterion("sa_dir not in", values, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirBetween(Short value1, Short value2) {
            addCriterion("sa_dir between", value1, value2, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaDirNotBetween(Short value1, Short value2) {
            addCriterion("sa_dir not between", value1, value2, "saDir");
            return (Criteria) this;
        }

        public Criteria andSaMethodIsNull() {
            addCriterion("sa_method is null");
            return (Criteria) this;
        }

        public Criteria andSaMethodIsNotNull() {
            addCriterion("sa_method is not null");
            return (Criteria) this;
        }

        public Criteria andSaMethodEqualTo(String value) {
            addCriterion("sa_method =", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodNotEqualTo(String value) {
            addCriterion("sa_method <>", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodGreaterThan(String value) {
            addCriterion("sa_method >", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodGreaterThanOrEqualTo(String value) {
            addCriterion("sa_method >=", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodLessThan(String value) {
            addCriterion("sa_method <", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodLessThanOrEqualTo(String value) {
            addCriterion("sa_method <=", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodLike(String value) {
            addCriterion("sa_method like", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodNotLike(String value) {
            addCriterion("sa_method not like", value, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodIn(List<String> values) {
            addCriterion("sa_method in", values, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodNotIn(List<String> values) {
            addCriterion("sa_method not in", values, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodBetween(String value1, String value2) {
            addCriterion("sa_method between", value1, value2, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaMethodNotBetween(String value1, String value2) {
            addCriterion("sa_method not between", value1, value2, "saMethod");
            return (Criteria) this;
        }

        public Criteria andSaParamsIsNull() {
            addCriterion("sa_params is null");
            return (Criteria) this;
        }

        public Criteria andSaParamsIsNotNull() {
            addCriterion("sa_params is not null");
            return (Criteria) this;
        }

        public Criteria andSaParamsEqualTo(String value) {
            addCriterion("sa_params =", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsNotEqualTo(String value) {
            addCriterion("sa_params <>", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsGreaterThan(String value) {
            addCriterion("sa_params >", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsGreaterThanOrEqualTo(String value) {
            addCriterion("sa_params >=", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsLessThan(String value) {
            addCriterion("sa_params <", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsLessThanOrEqualTo(String value) {
            addCriterion("sa_params <=", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsLike(String value) {
            addCriterion("sa_params like", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsNotLike(String value) {
            addCriterion("sa_params not like", value, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsIn(List<String> values) {
            addCriterion("sa_params in", values, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsNotIn(List<String> values) {
            addCriterion("sa_params not in", values, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsBetween(String value1, String value2) {
            addCriterion("sa_params between", value1, value2, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaParamsNotBetween(String value1, String value2) {
            addCriterion("sa_params not between", value1, value2, "saParams");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructIsNull() {
            addCriterion("sa_return_struct is null");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructIsNotNull() {
            addCriterion("sa_return_struct is not null");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructEqualTo(String value) {
            addCriterion("sa_return_struct =", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructNotEqualTo(String value) {
            addCriterion("sa_return_struct <>", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructGreaterThan(String value) {
            addCriterion("sa_return_struct >", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructGreaterThanOrEqualTo(String value) {
            addCriterion("sa_return_struct >=", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructLessThan(String value) {
            addCriterion("sa_return_struct <", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructLessThanOrEqualTo(String value) {
            addCriterion("sa_return_struct <=", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructLike(String value) {
            addCriterion("sa_return_struct like", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructNotLike(String value) {
            addCriterion("sa_return_struct not like", value, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructIn(List<String> values) {
            addCriterion("sa_return_struct in", values, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructNotIn(List<String> values) {
            addCriterion("sa_return_struct not in", values, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructBetween(String value1, String value2) {
            addCriterion("sa_return_struct between", value1, value2, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaReturnStructNotBetween(String value1, String value2) {
            addCriterion("sa_return_struct not between", value1, value2, "saReturnStruct");
            return (Criteria) this;
        }

        public Criteria andSaErrorIsNull() {
            addCriterion("sa_error is null");
            return (Criteria) this;
        }

        public Criteria andSaErrorIsNotNull() {
            addCriterion("sa_error is not null");
            return (Criteria) this;
        }

        public Criteria andSaErrorEqualTo(String value) {
            addCriterion("sa_error =", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorNotEqualTo(String value) {
            addCriterion("sa_error <>", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorGreaterThan(String value) {
            addCriterion("sa_error >", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorGreaterThanOrEqualTo(String value) {
            addCriterion("sa_error >=", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorLessThan(String value) {
            addCriterion("sa_error <", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorLessThanOrEqualTo(String value) {
            addCriterion("sa_error <=", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorLike(String value) {
            addCriterion("sa_error like", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorNotLike(String value) {
            addCriterion("sa_error not like", value, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorIn(List<String> values) {
            addCriterion("sa_error in", values, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorNotIn(List<String> values) {
            addCriterion("sa_error not in", values, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorBetween(String value1, String value2) {
            addCriterion("sa_error between", value1, value2, "saError");
            return (Criteria) this;
        }

        public Criteria andSaErrorNotBetween(String value1, String value2) {
            addCriterion("sa_error not between", value1, value2, "saError");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogIsNull() {
            addCriterion("sa_save_log is null");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogIsNotNull() {
            addCriterion("sa_save_log is not null");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogEqualTo(Short value) {
            addCriterion("sa_save_log =", value, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogNotEqualTo(Short value) {
            addCriterion("sa_save_log <>", value, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogGreaterThan(Short value) {
            addCriterion("sa_save_log >", value, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogGreaterThanOrEqualTo(Short value) {
            addCriterion("sa_save_log >=", value, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogLessThan(Short value) {
            addCriterion("sa_save_log <", value, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogLessThanOrEqualTo(Short value) {
            addCriterion("sa_save_log <=", value, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogIn(List<Short> values) {
            addCriterion("sa_save_log in", values, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogNotIn(List<Short> values) {
            addCriterion("sa_save_log not in", values, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogBetween(Short value1, Short value2) {
            addCriterion("sa_save_log between", value1, value2, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaSaveLogNotBetween(Short value1, Short value2) {
            addCriterion("sa_save_log not between", value1, value2, "saSaveLog");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeIsNull() {
            addCriterion("sa_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeIsNotNull() {
            addCriterion("sa_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeEqualTo(Date value) {
            addCriterion("sa_update_time =", value, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeNotEqualTo(Date value) {
            addCriterion("sa_update_time <>", value, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeGreaterThan(Date value) {
            addCriterion("sa_update_time >", value, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sa_update_time >=", value, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeLessThan(Date value) {
            addCriterion("sa_update_time <", value, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sa_update_time <=", value, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeIn(List<Date> values) {
            addCriterion("sa_update_time in", values, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeNotIn(List<Date> values) {
            addCriterion("sa_update_time not in", values, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sa_update_time between", value1, value2, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sa_update_time not between", value1, value2, "saUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeIsNull() {
            addCriterion("sa_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeIsNotNull() {
            addCriterion("sa_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeEqualTo(Date value) {
            addCriterion("sa_add_time =", value, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeNotEqualTo(Date value) {
            addCriterion("sa_add_time <>", value, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeGreaterThan(Date value) {
            addCriterion("sa_add_time >", value, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sa_add_time >=", value, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeLessThan(Date value) {
            addCriterion("sa_add_time <", value, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("sa_add_time <=", value, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeIn(List<Date> values) {
            addCriterion("sa_add_time in", values, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeNotIn(List<Date> values) {
            addCriterion("sa_add_time not in", values, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeBetween(Date value1, Date value2) {
            addCriterion("sa_add_time between", value1, value2, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("sa_add_time not between", value1, value2, "saAddTime");
            return (Criteria) this;
        }

        public Criteria andSaStatusIsNull() {
            addCriterion("sa_status is null");
            return (Criteria) this;
        }

        public Criteria andSaStatusIsNotNull() {
            addCriterion("sa_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaStatusEqualTo(Short value) {
            addCriterion("sa_status =", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusNotEqualTo(Short value) {
            addCriterion("sa_status <>", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusGreaterThan(Short value) {
            addCriterion("sa_status >", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("sa_status >=", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusLessThan(Short value) {
            addCriterion("sa_status <", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusLessThanOrEqualTo(Short value) {
            addCriterion("sa_status <=", value, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusIn(List<Short> values) {
            addCriterion("sa_status in", values, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusNotIn(List<Short> values) {
            addCriterion("sa_status not in", values, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusBetween(Short value1, Short value2) {
            addCriterion("sa_status between", value1, value2, "saStatus");
            return (Criteria) this;
        }

        public Criteria andSaStatusNotBetween(Short value1, Short value2) {
            addCriterion("sa_status not between", value1, value2, "saStatus");
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