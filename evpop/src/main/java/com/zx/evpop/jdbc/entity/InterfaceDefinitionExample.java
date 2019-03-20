package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterfaceDefinitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterfaceDefinitionExample() {
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

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("serial_no like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("serial_no not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andTxNoIsNull() {
            addCriterion("tx_no is null");
            return (Criteria) this;
        }

        public Criteria andTxNoIsNotNull() {
            addCriterion("tx_no is not null");
            return (Criteria) this;
        }

        public Criteria andTxNoEqualTo(String value) {
            addCriterion("tx_no =", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotEqualTo(String value) {
            addCriterion("tx_no <>", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoGreaterThan(String value) {
            addCriterion("tx_no >", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoGreaterThanOrEqualTo(String value) {
            addCriterion("tx_no >=", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoLessThan(String value) {
            addCriterion("tx_no <", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoLessThanOrEqualTo(String value) {
            addCriterion("tx_no <=", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoLike(String value) {
            addCriterion("tx_no like", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotLike(String value) {
            addCriterion("tx_no not like", value, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoIn(List<String> values) {
            addCriterion("tx_no in", values, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotIn(List<String> values) {
            addCriterion("tx_no not in", values, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoBetween(String value1, String value2) {
            addCriterion("tx_no between", value1, value2, "txNo");
            return (Criteria) this;
        }

        public Criteria andTxNoNotBetween(String value1, String value2) {
            addCriterion("tx_no not between", value1, value2, "txNo");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("interface_type is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("interface_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(String value) {
            addCriterion("interface_type =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(String value) {
            addCriterion("interface_type <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(String value) {
            addCriterion("interface_type >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("interface_type >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(String value) {
            addCriterion("interface_type <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(String value) {
            addCriterion("interface_type <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLike(String value) {
            addCriterion("interface_type like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotLike(String value) {
            addCriterion("interface_type not like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<String> values) {
            addCriterion("interface_type in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<String> values) {
            addCriterion("interface_type not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(String value1, String value2) {
            addCriterion("interface_type between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(String value1, String value2) {
            addCriterion("interface_type not between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionIsNull() {
            addCriterion("interface_direction is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionIsNotNull() {
            addCriterion("interface_direction is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionEqualTo(String value) {
            addCriterion("interface_direction =", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionNotEqualTo(String value) {
            addCriterion("interface_direction <>", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionGreaterThan(String value) {
            addCriterion("interface_direction >", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("interface_direction >=", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionLessThan(String value) {
            addCriterion("interface_direction <", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionLessThanOrEqualTo(String value) {
            addCriterion("interface_direction <=", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionLike(String value) {
            addCriterion("interface_direction like", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionNotLike(String value) {
            addCriterion("interface_direction not like", value, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionIn(List<String> values) {
            addCriterion("interface_direction in", values, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionNotIn(List<String> values) {
            addCriterion("interface_direction not in", values, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionBetween(String value1, String value2) {
            addCriterion("interface_direction between", value1, value2, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andInterfaceDirectionNotBetween(String value1, String value2) {
            addCriterion("interface_direction not between", value1, value2, "interfaceDirection");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlIsNull() {
            addCriterion("gateway_url is null");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlIsNotNull() {
            addCriterion("gateway_url is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlEqualTo(String value) {
            addCriterion("gateway_url =", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlNotEqualTo(String value) {
            addCriterion("gateway_url <>", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlGreaterThan(String value) {
            addCriterion("gateway_url >", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_url >=", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlLessThan(String value) {
            addCriterion("gateway_url <", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlLessThanOrEqualTo(String value) {
            addCriterion("gateway_url <=", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlLike(String value) {
            addCriterion("gateway_url like", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlNotLike(String value) {
            addCriterion("gateway_url not like", value, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlIn(List<String> values) {
            addCriterion("gateway_url in", values, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlNotIn(List<String> values) {
            addCriterion("gateway_url not in", values, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlBetween(String value1, String value2) {
            addCriterion("gateway_url between", value1, value2, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andGatewayUrlNotBetween(String value1, String value2) {
            addCriterion("gateway_url not between", value1, value2, "gatewayUrl");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondIsNull() {
            addCriterion("http_timeout_second is null");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondIsNotNull() {
            addCriterion("http_timeout_second is not null");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondEqualTo(Integer value) {
            addCriterion("http_timeout_second =", value, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondNotEqualTo(Integer value) {
            addCriterion("http_timeout_second <>", value, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondGreaterThan(Integer value) {
            addCriterion("http_timeout_second >", value, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("http_timeout_second >=", value, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondLessThan(Integer value) {
            addCriterion("http_timeout_second <", value, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondLessThanOrEqualTo(Integer value) {
            addCriterion("http_timeout_second <=", value, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondIn(List<Integer> values) {
            addCriterion("http_timeout_second in", values, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondNotIn(List<Integer> values) {
            addCriterion("http_timeout_second not in", values, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondBetween(Integer value1, Integer value2) {
            addCriterion("http_timeout_second between", value1, value2, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andHttpTimeoutSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("http_timeout_second not between", value1, value2, "httpTimeoutSecond");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameIsNull() {
            addCriterion("service_class_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameIsNotNull() {
            addCriterion("service_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameEqualTo(String value) {
            addCriterion("service_class_name =", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameNotEqualTo(String value) {
            addCriterion("service_class_name <>", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameGreaterThan(String value) {
            addCriterion("service_class_name >", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_class_name >=", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameLessThan(String value) {
            addCriterion("service_class_name <", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameLessThanOrEqualTo(String value) {
            addCriterion("service_class_name <=", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameLike(String value) {
            addCriterion("service_class_name like", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameNotLike(String value) {
            addCriterion("service_class_name not like", value, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameIn(List<String> values) {
            addCriterion("service_class_name in", values, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameNotIn(List<String> values) {
            addCriterion("service_class_name not in", values, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameBetween(String value1, String value2) {
            addCriterion("service_class_name between", value1, value2, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andServiceClassNameNotBetween(String value1, String value2) {
            addCriterion("service_class_name not between", value1, value2, "serviceClassName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("method_name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("method_name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("method_name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("method_name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("method_name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("method_name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("method_name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("method_name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("method_name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("method_name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("method_name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("method_name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("method_name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("method_name not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmIsNull() {
            addCriterion("encrypt_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmIsNotNull() {
            addCriterion("encrypt_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmEqualTo(String value) {
            addCriterion("encrypt_algorithm =", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotEqualTo(String value) {
            addCriterion("encrypt_algorithm <>", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmGreaterThan(String value) {
            addCriterion("encrypt_algorithm >", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("encrypt_algorithm >=", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmLessThan(String value) {
            addCriterion("encrypt_algorithm <", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("encrypt_algorithm <=", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmLike(String value) {
            addCriterion("encrypt_algorithm like", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotLike(String value) {
            addCriterion("encrypt_algorithm not like", value, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmIn(List<String> values) {
            addCriterion("encrypt_algorithm in", values, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotIn(List<String> values) {
            addCriterion("encrypt_algorithm not in", values, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmBetween(String value1, String value2) {
            addCriterion("encrypt_algorithm between", value1, value2, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andEncryptAlgorithmNotBetween(String value1, String value2) {
            addCriterion("encrypt_algorithm not between", value1, value2, "encryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmIsNull() {
            addCriterion("decrypt_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmIsNotNull() {
            addCriterion("decrypt_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmEqualTo(String value) {
            addCriterion("decrypt_algorithm =", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmNotEqualTo(String value) {
            addCriterion("decrypt_algorithm <>", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmGreaterThan(String value) {
            addCriterion("decrypt_algorithm >", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("decrypt_algorithm >=", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmLessThan(String value) {
            addCriterion("decrypt_algorithm <", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("decrypt_algorithm <=", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmLike(String value) {
            addCriterion("decrypt_algorithm like", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmNotLike(String value) {
            addCriterion("decrypt_algorithm not like", value, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmIn(List<String> values) {
            addCriterion("decrypt_algorithm in", values, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmNotIn(List<String> values) {
            addCriterion("decrypt_algorithm not in", values, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmBetween(String value1, String value2) {
            addCriterion("decrypt_algorithm between", value1, value2, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andDecryptAlgorithmNotBetween(String value1, String value2) {
            addCriterion("decrypt_algorithm not between", value1, value2, "decryptAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmIsNull() {
            addCriterion("sign_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmIsNotNull() {
            addCriterion("sign_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmEqualTo(String value) {
            addCriterion("sign_algorithm =", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmNotEqualTo(String value) {
            addCriterion("sign_algorithm <>", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmGreaterThan(String value) {
            addCriterion("sign_algorithm >", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("sign_algorithm >=", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmLessThan(String value) {
            addCriterion("sign_algorithm <", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("sign_algorithm <=", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmLike(String value) {
            addCriterion("sign_algorithm like", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmNotLike(String value) {
            addCriterion("sign_algorithm not like", value, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmIn(List<String> values) {
            addCriterion("sign_algorithm in", values, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmNotIn(List<String> values) {
            addCriterion("sign_algorithm not in", values, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmBetween(String value1, String value2) {
            addCriterion("sign_algorithm between", value1, value2, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignAlgorithmNotBetween(String value1, String value2) {
            addCriterion("sign_algorithm not between", value1, value2, "signAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmIsNull() {
            addCriterion("verify_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmIsNotNull() {
            addCriterion("verify_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmEqualTo(String value) {
            addCriterion("verify_algorithm =", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmNotEqualTo(String value) {
            addCriterion("verify_algorithm <>", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmGreaterThan(String value) {
            addCriterion("verify_algorithm >", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("verify_algorithm >=", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmLessThan(String value) {
            addCriterion("verify_algorithm <", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("verify_algorithm <=", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmLike(String value) {
            addCriterion("verify_algorithm like", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmNotLike(String value) {
            addCriterion("verify_algorithm not like", value, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmIn(List<String> values) {
            addCriterion("verify_algorithm in", values, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmNotIn(List<String> values) {
            addCriterion("verify_algorithm not in", values, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmBetween(String value1, String value2) {
            addCriterion("verify_algorithm between", value1, value2, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andVerifyAlgorithmNotBetween(String value1, String value2) {
            addCriterion("verify_algorithm not between", value1, value2, "verifyAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordIsNull() {
            addCriterion("use_token_as_password is null");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordIsNotNull() {
            addCriterion("use_token_as_password is not null");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordEqualTo(Byte value) {
            addCriterion("use_token_as_password =", value, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordNotEqualTo(Byte value) {
            addCriterion("use_token_as_password <>", value, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordGreaterThan(Byte value) {
            addCriterion("use_token_as_password >", value, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_token_as_password >=", value, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordLessThan(Byte value) {
            addCriterion("use_token_as_password <", value, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordLessThanOrEqualTo(Byte value) {
            addCriterion("use_token_as_password <=", value, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordIn(List<Byte> values) {
            addCriterion("use_token_as_password in", values, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordNotIn(List<Byte> values) {
            addCriterion("use_token_as_password not in", values, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordBetween(Byte value1, Byte value2) {
            addCriterion("use_token_as_password between", value1, value2, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andUseTokenAsPasswordNotBetween(Byte value1, Byte value2) {
            addCriterion("use_token_as_password not between", value1, value2, "useTokenAsPassword");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptIsNull() {
            addCriterion("first_sign_second_encrypt is null");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptIsNotNull() {
            addCriterion("first_sign_second_encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptEqualTo(Byte value) {
            addCriterion("first_sign_second_encrypt =", value, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptNotEqualTo(Byte value) {
            addCriterion("first_sign_second_encrypt <>", value, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptGreaterThan(Byte value) {
            addCriterion("first_sign_second_encrypt >", value, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptGreaterThanOrEqualTo(Byte value) {
            addCriterion("first_sign_second_encrypt >=", value, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptLessThan(Byte value) {
            addCriterion("first_sign_second_encrypt <", value, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptLessThanOrEqualTo(Byte value) {
            addCriterion("first_sign_second_encrypt <=", value, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptIn(List<Byte> values) {
            addCriterion("first_sign_second_encrypt in", values, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptNotIn(List<Byte> values) {
            addCriterion("first_sign_second_encrypt not in", values, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptBetween(Byte value1, Byte value2) {
            addCriterion("first_sign_second_encrypt between", value1, value2, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstSignSecondEncryptNotBetween(Byte value1, Byte value2) {
            addCriterion("first_sign_second_encrypt not between", value1, value2, "firstSignSecondEncrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptIsNull() {
            addCriterion("first_verify_second_decrypt is null");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptIsNotNull() {
            addCriterion("first_verify_second_decrypt is not null");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptEqualTo(Byte value) {
            addCriterion("first_verify_second_decrypt =", value, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptNotEqualTo(Byte value) {
            addCriterion("first_verify_second_decrypt <>", value, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptGreaterThan(Byte value) {
            addCriterion("first_verify_second_decrypt >", value, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptGreaterThanOrEqualTo(Byte value) {
            addCriterion("first_verify_second_decrypt >=", value, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptLessThan(Byte value) {
            addCriterion("first_verify_second_decrypt <", value, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptLessThanOrEqualTo(Byte value) {
            addCriterion("first_verify_second_decrypt <=", value, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptIn(List<Byte> values) {
            addCriterion("first_verify_second_decrypt in", values, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptNotIn(List<Byte> values) {
            addCriterion("first_verify_second_decrypt not in", values, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptBetween(Byte value1, Byte value2) {
            addCriterion("first_verify_second_decrypt between", value1, value2, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andFirstVerifySecondDecryptNotBetween(Byte value1, Byte value2) {
            addCriterion("first_verify_second_decrypt not between", value1, value2, "firstVerifySecondDecrypt");
            return (Criteria) this;
        }

        public Criteria andValidateTokenIsNull() {
            addCriterion("validate_token is null");
            return (Criteria) this;
        }

        public Criteria andValidateTokenIsNotNull() {
            addCriterion("validate_token is not null");
            return (Criteria) this;
        }

        public Criteria andValidateTokenEqualTo(Byte value) {
            addCriterion("validate_token =", value, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenNotEqualTo(Byte value) {
            addCriterion("validate_token <>", value, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenGreaterThan(Byte value) {
            addCriterion("validate_token >", value, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenGreaterThanOrEqualTo(Byte value) {
            addCriterion("validate_token >=", value, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenLessThan(Byte value) {
            addCriterion("validate_token <", value, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenLessThanOrEqualTo(Byte value) {
            addCriterion("validate_token <=", value, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenIn(List<Byte> values) {
            addCriterion("validate_token in", values, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenNotIn(List<Byte> values) {
            addCriterion("validate_token not in", values, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenBetween(Byte value1, Byte value2) {
            addCriterion("validate_token between", value1, value2, "validateToken");
            return (Criteria) this;
        }

        public Criteria andValidateTokenNotBetween(Byte value1, Byte value2) {
            addCriterion("validate_token not between", value1, value2, "validateToken");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoIsNull() {
            addCriterion("idempotent_redo is null");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoIsNotNull() {
            addCriterion("idempotent_redo is not null");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoEqualTo(Byte value) {
            addCriterion("idempotent_redo =", value, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoNotEqualTo(Byte value) {
            addCriterion("idempotent_redo <>", value, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoGreaterThan(Byte value) {
            addCriterion("idempotent_redo >", value, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoGreaterThanOrEqualTo(Byte value) {
            addCriterion("idempotent_redo >=", value, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoLessThan(Byte value) {
            addCriterion("idempotent_redo <", value, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoLessThanOrEqualTo(Byte value) {
            addCriterion("idempotent_redo <=", value, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoIn(List<Byte> values) {
            addCriterion("idempotent_redo in", values, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoNotIn(List<Byte> values) {
            addCriterion("idempotent_redo not in", values, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoBetween(Byte value1, Byte value2) {
            addCriterion("idempotent_redo between", value1, value2, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andIdempotentRedoNotBetween(Byte value1, Byte value2) {
            addCriterion("idempotent_redo not between", value1, value2, "idempotentRedo");
            return (Criteria) this;
        }

        public Criteria andWriteMessageIsNull() {
            addCriterion("write_message is null");
            return (Criteria) this;
        }

        public Criteria andWriteMessageIsNotNull() {
            addCriterion("write_message is not null");
            return (Criteria) this;
        }

        public Criteria andWriteMessageEqualTo(Byte value) {
            addCriterion("write_message =", value, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageNotEqualTo(Byte value) {
            addCriterion("write_message <>", value, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageGreaterThan(Byte value) {
            addCriterion("write_message >", value, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageGreaterThanOrEqualTo(Byte value) {
            addCriterion("write_message >=", value, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageLessThan(Byte value) {
            addCriterion("write_message <", value, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageLessThanOrEqualTo(Byte value) {
            addCriterion("write_message <=", value, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageIn(List<Byte> values) {
            addCriterion("write_message in", values, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageNotIn(List<Byte> values) {
            addCriterion("write_message not in", values, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageBetween(Byte value1, Byte value2) {
            addCriterion("write_message between", value1, value2, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteMessageNotBetween(Byte value1, Byte value2) {
            addCriterion("write_message not between", value1, value2, "writeMessage");
            return (Criteria) this;
        }

        public Criteria andWriteModeIsNull() {
            addCriterion("write_mode is null");
            return (Criteria) this;
        }

        public Criteria andWriteModeIsNotNull() {
            addCriterion("write_mode is not null");
            return (Criteria) this;
        }

        public Criteria andWriteModeEqualTo(String value) {
            addCriterion("write_mode =", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeNotEqualTo(String value) {
            addCriterion("write_mode <>", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeGreaterThan(String value) {
            addCriterion("write_mode >", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeGreaterThanOrEqualTo(String value) {
            addCriterion("write_mode >=", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeLessThan(String value) {
            addCriterion("write_mode <", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeLessThanOrEqualTo(String value) {
            addCriterion("write_mode <=", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeLike(String value) {
            addCriterion("write_mode like", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeNotLike(String value) {
            addCriterion("write_mode not like", value, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeIn(List<String> values) {
            addCriterion("write_mode in", values, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeNotIn(List<String> values) {
            addCriterion("write_mode not in", values, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeBetween(String value1, String value2) {
            addCriterion("write_mode between", value1, value2, "writeMode");
            return (Criteria) this;
        }

        public Criteria andWriteModeNotBetween(String value1, String value2) {
            addCriterion("write_mode not between", value1, value2, "writeMode");
            return (Criteria) this;
        }

        public Criteria andKeyVectorIsNull() {
            addCriterion("key_vector is null");
            return (Criteria) this;
        }

        public Criteria andKeyVectorIsNotNull() {
            addCriterion("key_vector is not null");
            return (Criteria) this;
        }

        public Criteria andKeyVectorEqualTo(String value) {
            addCriterion("key_vector =", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorNotEqualTo(String value) {
            addCriterion("key_vector <>", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorGreaterThan(String value) {
            addCriterion("key_vector >", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorGreaterThanOrEqualTo(String value) {
            addCriterion("key_vector >=", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorLessThan(String value) {
            addCriterion("key_vector <", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorLessThanOrEqualTo(String value) {
            addCriterion("key_vector <=", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorLike(String value) {
            addCriterion("key_vector like", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorNotLike(String value) {
            addCriterion("key_vector not like", value, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorIn(List<String> values) {
            addCriterion("key_vector in", values, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorNotIn(List<String> values) {
            addCriterion("key_vector not in", values, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorBetween(String value1, String value2) {
            addCriterion("key_vector between", value1, value2, "keyVector");
            return (Criteria) this;
        }

        public Criteria andKeyVectorNotBetween(String value1, String value2) {
            addCriterion("key_vector not between", value1, value2, "keyVector");
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