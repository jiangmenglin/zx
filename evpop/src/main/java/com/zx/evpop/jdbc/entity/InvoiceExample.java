package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceExample() {
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

        public Criteria andTbiIdIsNull() {
            addCriterion("tbi_id is null");
            return (Criteria) this;
        }

        public Criteria andTbiIdIsNotNull() {
            addCriterion("tbi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbiIdEqualTo(Integer value) {
            addCriterion("tbi_id =", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdNotEqualTo(Integer value) {
            addCriterion("tbi_id <>", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdGreaterThan(Integer value) {
            addCriterion("tbi_id >", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_id >=", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdLessThan(Integer value) {
            addCriterion("tbi_id <", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_id <=", value, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdIn(List<Integer> values) {
            addCriterion("tbi_id in", values, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdNotIn(List<Integer> values) {
            addCriterion("tbi_id not in", values, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdBetween(Integer value1, Integer value2) {
            addCriterion("tbi_id between", value1, value2, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_id not between", value1, value2, "tbiId");
            return (Criteria) this;
        }

        public Criteria andTbiHostIsNull() {
            addCriterion("tbi_host is null");
            return (Criteria) this;
        }

        public Criteria andTbiHostIsNotNull() {
            addCriterion("tbi_host is not null");
            return (Criteria) this;
        }

        public Criteria andTbiHostEqualTo(Short value) {
            addCriterion("tbi_host =", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostNotEqualTo(Short value) {
            addCriterion("tbi_host <>", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostGreaterThan(Short value) {
            addCriterion("tbi_host >", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostGreaterThanOrEqualTo(Short value) {
            addCriterion("tbi_host >=", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostLessThan(Short value) {
            addCriterion("tbi_host <", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostLessThanOrEqualTo(Short value) {
            addCriterion("tbi_host <=", value, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostIn(List<Short> values) {
            addCriterion("tbi_host in", values, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostNotIn(List<Short> values) {
            addCriterion("tbi_host not in", values, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostBetween(Short value1, Short value2) {
            addCriterion("tbi_host between", value1, value2, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiHostNotBetween(Short value1, Short value2) {
            addCriterion("tbi_host not between", value1, value2, "tbiHost");
            return (Criteria) this;
        }

        public Criteria andTbiTitleIsNull() {
            addCriterion("tbi_title is null");
            return (Criteria) this;
        }

        public Criteria andTbiTitleIsNotNull() {
            addCriterion("tbi_title is not null");
            return (Criteria) this;
        }

        public Criteria andTbiTitleEqualTo(String value) {
            addCriterion("tbi_title =", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleNotEqualTo(String value) {
            addCriterion("tbi_title <>", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleGreaterThan(String value) {
            addCriterion("tbi_title >", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_title >=", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleLessThan(String value) {
            addCriterion("tbi_title <", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleLessThanOrEqualTo(String value) {
            addCriterion("tbi_title <=", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleLike(String value) {
            addCriterion("tbi_title like", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleNotLike(String value) {
            addCriterion("tbi_title not like", value, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleIn(List<String> values) {
            addCriterion("tbi_title in", values, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleNotIn(List<String> values) {
            addCriterion("tbi_title not in", values, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleBetween(String value1, String value2) {
            addCriterion("tbi_title between", value1, value2, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTitleNotBetween(String value1, String value2) {
            addCriterion("tbi_title not between", value1, value2, "tbiTitle");
            return (Criteria) this;
        }

        public Criteria andTbiTypeIsNull() {
            addCriterion("tbi_type is null");
            return (Criteria) this;
        }

        public Criteria andTbiTypeIsNotNull() {
            addCriterion("tbi_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbiTypeEqualTo(Short value) {
            addCriterion("tbi_type =", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeNotEqualTo(Short value) {
            addCriterion("tbi_type <>", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeGreaterThan(Short value) {
            addCriterion("tbi_type >", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("tbi_type >=", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeLessThan(Short value) {
            addCriterion("tbi_type <", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeLessThanOrEqualTo(Short value) {
            addCriterion("tbi_type <=", value, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeIn(List<Short> values) {
            addCriterion("tbi_type in", values, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeNotIn(List<Short> values) {
            addCriterion("tbi_type not in", values, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeBetween(Short value1, Short value2) {
            addCriterion("tbi_type between", value1, value2, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTypeNotBetween(Short value1, Short value2) {
            addCriterion("tbi_type not between", value1, value2, "tbiType");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoIsNull() {
            addCriterion("tbi_tariff_no is null");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoIsNotNull() {
            addCriterion("tbi_tariff_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoEqualTo(String value) {
            addCriterion("tbi_tariff_no =", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoNotEqualTo(String value) {
            addCriterion("tbi_tariff_no <>", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoGreaterThan(String value) {
            addCriterion("tbi_tariff_no >", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_tariff_no >=", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoLessThan(String value) {
            addCriterion("tbi_tariff_no <", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoLessThanOrEqualTo(String value) {
            addCriterion("tbi_tariff_no <=", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoLike(String value) {
            addCriterion("tbi_tariff_no like", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoNotLike(String value) {
            addCriterion("tbi_tariff_no not like", value, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoIn(List<String> values) {
            addCriterion("tbi_tariff_no in", values, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoNotIn(List<String> values) {
            addCriterion("tbi_tariff_no not in", values, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoBetween(String value1, String value2) {
            addCriterion("tbi_tariff_no between", value1, value2, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiTariffNoNotBetween(String value1, String value2) {
            addCriterion("tbi_tariff_no not between", value1, value2, "tbiTariffNo");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyIsNull() {
            addCriterion("tbi_money is null");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyIsNotNull() {
            addCriterion("tbi_money is not null");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyEqualTo(Double value) {
            addCriterion("tbi_money =", value, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyNotEqualTo(Double value) {
            addCriterion("tbi_money <>", value, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyGreaterThan(Double value) {
            addCriterion("tbi_money >", value, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tbi_money >=", value, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyLessThan(Double value) {
            addCriterion("tbi_money <", value, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tbi_money <=", value, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyIn(List<Double> values) {
            addCriterion("tbi_money in", values, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyNotIn(List<Double> values) {
            addCriterion("tbi_money not in", values, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyBetween(Double value1, Double value2) {
            addCriterion("tbi_money between", value1, value2, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tbi_money not between", value1, value2, "tbiMoney");
            return (Criteria) this;
        }

        public Criteria andTbiMemberIsNull() {
            addCriterion("tbi_member is null");
            return (Criteria) this;
        }

        public Criteria andTbiMemberIsNotNull() {
            addCriterion("tbi_member is not null");
            return (Criteria) this;
        }

        public Criteria andTbiMemberEqualTo(Integer value) {
            addCriterion("tbi_member =", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberNotEqualTo(Integer value) {
            addCriterion("tbi_member <>", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberGreaterThan(Integer value) {
            addCriterion("tbi_member >", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_member >=", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberLessThan(Integer value) {
            addCriterion("tbi_member <", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_member <=", value, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberIn(List<Integer> values) {
            addCriterion("tbi_member in", values, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberNotIn(List<Integer> values) {
            addCriterion("tbi_member not in", values, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberBetween(Integer value1, Integer value2) {
            addCriterion("tbi_member between", value1, value2, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_member not between", value1, value2, "tbiMember");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeIsNull() {
            addCriterion("tbi_send_type is null");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeIsNotNull() {
            addCriterion("tbi_send_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeEqualTo(Byte value) {
            addCriterion("tbi_send_type =", value, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeNotEqualTo(Byte value) {
            addCriterion("tbi_send_type <>", value, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeGreaterThan(Byte value) {
            addCriterion("tbi_send_type >", value, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbi_send_type >=", value, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeLessThan(Byte value) {
            addCriterion("tbi_send_type <", value, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbi_send_type <=", value, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeIn(List<Byte> values) {
            addCriterion("tbi_send_type in", values, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeNotIn(List<Byte> values) {
            addCriterion("tbi_send_type not in", values, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbi_send_type between", value1, value2, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiSendTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbi_send_type not between", value1, value2, "tbiSendType");
            return (Criteria) this;
        }

        public Criteria andTbiNameIsNull() {
            addCriterion("tbi_name is null");
            return (Criteria) this;
        }

        public Criteria andTbiNameIsNotNull() {
            addCriterion("tbi_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbiNameEqualTo(String value) {
            addCriterion("tbi_name =", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameNotEqualTo(String value) {
            addCriterion("tbi_name <>", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameGreaterThan(String value) {
            addCriterion("tbi_name >", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_name >=", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameLessThan(String value) {
            addCriterion("tbi_name <", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameLessThanOrEqualTo(String value) {
            addCriterion("tbi_name <=", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameLike(String value) {
            addCriterion("tbi_name like", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameNotLike(String value) {
            addCriterion("tbi_name not like", value, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameIn(List<String> values) {
            addCriterion("tbi_name in", values, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameNotIn(List<String> values) {
            addCriterion("tbi_name not in", values, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameBetween(String value1, String value2) {
            addCriterion("tbi_name between", value1, value2, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiNameNotBetween(String value1, String value2) {
            addCriterion("tbi_name not between", value1, value2, "tbiName");
            return (Criteria) this;
        }

        public Criteria andTbiContactIsNull() {
            addCriterion("tbi_contact is null");
            return (Criteria) this;
        }

        public Criteria andTbiContactIsNotNull() {
            addCriterion("tbi_contact is not null");
            return (Criteria) this;
        }

        public Criteria andTbiContactEqualTo(String value) {
            addCriterion("tbi_contact =", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactNotEqualTo(String value) {
            addCriterion("tbi_contact <>", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactGreaterThan(String value) {
            addCriterion("tbi_contact >", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_contact >=", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactLessThan(String value) {
            addCriterion("tbi_contact <", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactLessThanOrEqualTo(String value) {
            addCriterion("tbi_contact <=", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactLike(String value) {
            addCriterion("tbi_contact like", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactNotLike(String value) {
            addCriterion("tbi_contact not like", value, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactIn(List<String> values) {
            addCriterion("tbi_contact in", values, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactNotIn(List<String> values) {
            addCriterion("tbi_contact not in", values, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactBetween(String value1, String value2) {
            addCriterion("tbi_contact between", value1, value2, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiContactNotBetween(String value1, String value2) {
            addCriterion("tbi_contact not between", value1, value2, "tbiContact");
            return (Criteria) this;
        }

        public Criteria andTbiAddressIsNull() {
            addCriterion("tbi_address is null");
            return (Criteria) this;
        }

        public Criteria andTbiAddressIsNotNull() {
            addCriterion("tbi_address is not null");
            return (Criteria) this;
        }

        public Criteria andTbiAddressEqualTo(String value) {
            addCriterion("tbi_address =", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressNotEqualTo(String value) {
            addCriterion("tbi_address <>", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressGreaterThan(String value) {
            addCriterion("tbi_address >", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_address >=", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressLessThan(String value) {
            addCriterion("tbi_address <", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressLessThanOrEqualTo(String value) {
            addCriterion("tbi_address <=", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressLike(String value) {
            addCriterion("tbi_address like", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressNotLike(String value) {
            addCriterion("tbi_address not like", value, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressIn(List<String> values) {
            addCriterion("tbi_address in", values, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressNotIn(List<String> values) {
            addCriterion("tbi_address not in", values, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressBetween(String value1, String value2) {
            addCriterion("tbi_address between", value1, value2, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiAddressNotBetween(String value1, String value2) {
            addCriterion("tbi_address not between", value1, value2, "tbiAddress");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerIsNull() {
            addCriterion("tbi_checker is null");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerIsNotNull() {
            addCriterion("tbi_checker is not null");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerEqualTo(Integer value) {
            addCriterion("tbi_checker =", value, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerNotEqualTo(Integer value) {
            addCriterion("tbi_checker <>", value, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerGreaterThan(Integer value) {
            addCriterion("tbi_checker >", value, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_checker >=", value, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerLessThan(Integer value) {
            addCriterion("tbi_checker <", value, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_checker <=", value, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerIn(List<Integer> values) {
            addCriterion("tbi_checker in", values, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerNotIn(List<Integer> values) {
            addCriterion("tbi_checker not in", values, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerBetween(Integer value1, Integer value2) {
            addCriterion("tbi_checker between", value1, value2, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiCheckerNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_checker not between", value1, value2, "tbiChecker");
            return (Criteria) this;
        }

        public Criteria andTbiEditorIsNull() {
            addCriterion("tbi_editor is null");
            return (Criteria) this;
        }

        public Criteria andTbiEditorIsNotNull() {
            addCriterion("tbi_editor is not null");
            return (Criteria) this;
        }

        public Criteria andTbiEditorEqualTo(Integer value) {
            addCriterion("tbi_editor =", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorNotEqualTo(Integer value) {
            addCriterion("tbi_editor <>", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorGreaterThan(Integer value) {
            addCriterion("tbi_editor >", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_editor >=", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorLessThan(Integer value) {
            addCriterion("tbi_editor <", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_editor <=", value, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorIn(List<Integer> values) {
            addCriterion("tbi_editor in", values, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorNotIn(List<Integer> values) {
            addCriterion("tbi_editor not in", values, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorBetween(Integer value1, Integer value2) {
            addCriterion("tbi_editor between", value1, value2, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiEditorNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_editor not between", value1, value2, "tbiEditor");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeIsNull() {
            addCriterion("tbi_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeIsNotNull() {
            addCriterion("tbi_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeEqualTo(String value) {
            addCriterion("tbi_zipcode =", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeNotEqualTo(String value) {
            addCriterion("tbi_zipcode <>", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeGreaterThan(String value) {
            addCriterion("tbi_zipcode >", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_zipcode >=", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeLessThan(String value) {
            addCriterion("tbi_zipcode <", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeLessThanOrEqualTo(String value) {
            addCriterion("tbi_zipcode <=", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeLike(String value) {
            addCriterion("tbi_zipcode like", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeNotLike(String value) {
            addCriterion("tbi_zipcode not like", value, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeIn(List<String> values) {
            addCriterion("tbi_zipcode in", values, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeNotIn(List<String> values) {
            addCriterion("tbi_zipcode not in", values, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeBetween(String value1, String value2) {
            addCriterion("tbi_zipcode between", value1, value2, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiZipcodeNotBetween(String value1, String value2) {
            addCriterion("tbi_zipcode not between", value1, value2, "tbiZipcode");
            return (Criteria) this;
        }

        public Criteria andTbiAdderIsNull() {
            addCriterion("tbi_adder is null");
            return (Criteria) this;
        }

        public Criteria andTbiAdderIsNotNull() {
            addCriterion("tbi_adder is not null");
            return (Criteria) this;
        }

        public Criteria andTbiAdderEqualTo(Integer value) {
            addCriterion("tbi_adder =", value, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderNotEqualTo(Integer value) {
            addCriterion("tbi_adder <>", value, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderGreaterThan(Integer value) {
            addCriterion("tbi_adder >", value, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbi_adder >=", value, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderLessThan(Integer value) {
            addCriterion("tbi_adder <", value, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderLessThanOrEqualTo(Integer value) {
            addCriterion("tbi_adder <=", value, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderIn(List<Integer> values) {
            addCriterion("tbi_adder in", values, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderNotIn(List<Integer> values) {
            addCriterion("tbi_adder not in", values, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderBetween(Integer value1, Integer value2) {
            addCriterion("tbi_adder between", value1, value2, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiAdderNotBetween(Integer value1, Integer value2) {
            addCriterion("tbi_adder not between", value1, value2, "tbiAdder");
            return (Criteria) this;
        }

        public Criteria andTbiPostilIsNull() {
            addCriterion("tbi_postil is null");
            return (Criteria) this;
        }

        public Criteria andTbiPostilIsNotNull() {
            addCriterion("tbi_postil is not null");
            return (Criteria) this;
        }

        public Criteria andTbiPostilEqualTo(String value) {
            addCriterion("tbi_postil =", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilNotEqualTo(String value) {
            addCriterion("tbi_postil <>", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilGreaterThan(String value) {
            addCriterion("tbi_postil >", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_postil >=", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilLessThan(String value) {
            addCriterion("tbi_postil <", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilLessThanOrEqualTo(String value) {
            addCriterion("tbi_postil <=", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilLike(String value) {
            addCriterion("tbi_postil like", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilNotLike(String value) {
            addCriterion("tbi_postil not like", value, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilIn(List<String> values) {
            addCriterion("tbi_postil in", values, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilNotIn(List<String> values) {
            addCriterion("tbi_postil not in", values, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilBetween(String value1, String value2) {
            addCriterion("tbi_postil between", value1, value2, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiPostilNotBetween(String value1, String value2) {
            addCriterion("tbi_postil not between", value1, value2, "tbiPostil");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkIsNull() {
            addCriterion("tbi_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkIsNotNull() {
            addCriterion("tbi_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkEqualTo(String value) {
            addCriterion("tbi_remark =", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotEqualTo(String value) {
            addCriterion("tbi_remark <>", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkGreaterThan(String value) {
            addCriterion("tbi_remark >", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_remark >=", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkLessThan(String value) {
            addCriterion("tbi_remark <", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbi_remark <=", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkLike(String value) {
            addCriterion("tbi_remark like", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotLike(String value) {
            addCriterion("tbi_remark not like", value, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkIn(List<String> values) {
            addCriterion("tbi_remark in", values, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotIn(List<String> values) {
            addCriterion("tbi_remark not in", values, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkBetween(String value1, String value2) {
            addCriterion("tbi_remark between", value1, value2, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiRemarkNotBetween(String value1, String value2) {
            addCriterion("tbi_remark not between", value1, value2, "tbiRemark");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeIsNull() {
            addCriterion("tbi_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeIsNotNull() {
            addCriterion("tbi_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeEqualTo(Date value) {
            addCriterion("tbi_check_time =", value, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeNotEqualTo(Date value) {
            addCriterion("tbi_check_time <>", value, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeGreaterThan(Date value) {
            addCriterion("tbi_check_time >", value, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbi_check_time >=", value, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeLessThan(Date value) {
            addCriterion("tbi_check_time <", value, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbi_check_time <=", value, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeIn(List<Date> values) {
            addCriterion("tbi_check_time in", values, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeNotIn(List<Date> values) {
            addCriterion("tbi_check_time not in", values, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeBetween(Date value1, Date value2) {
            addCriterion("tbi_check_time between", value1, value2, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbi_check_time not between", value1, value2, "tbiCheckTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoIsNull() {
            addCriterion("tbi_invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoIsNotNull() {
            addCriterion("tbi_invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoEqualTo(String value) {
            addCriterion("tbi_invoice_no =", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoNotEqualTo(String value) {
            addCriterion("tbi_invoice_no <>", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoGreaterThan(String value) {
            addCriterion("tbi_invoice_no >", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("tbi_invoice_no >=", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoLessThan(String value) {
            addCriterion("tbi_invoice_no <", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("tbi_invoice_no <=", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoLike(String value) {
            addCriterion("tbi_invoice_no like", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoNotLike(String value) {
            addCriterion("tbi_invoice_no not like", value, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoIn(List<String> values) {
            addCriterion("tbi_invoice_no in", values, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoNotIn(List<String> values) {
            addCriterion("tbi_invoice_no not in", values, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoBetween(String value1, String value2) {
            addCriterion("tbi_invoice_no between", value1, value2, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("tbi_invoice_no not between", value1, value2, "tbiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeIsNull() {
            addCriterion("tbi_invoice_time is null");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeIsNotNull() {
            addCriterion("tbi_invoice_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeEqualTo(Date value) {
            addCriterion("tbi_invoice_time =", value, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeNotEqualTo(Date value) {
            addCriterion("tbi_invoice_time <>", value, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeGreaterThan(Date value) {
            addCriterion("tbi_invoice_time >", value, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbi_invoice_time >=", value, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeLessThan(Date value) {
            addCriterion("tbi_invoice_time <", value, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbi_invoice_time <=", value, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeIn(List<Date> values) {
            addCriterion("tbi_invoice_time in", values, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeNotIn(List<Date> values) {
            addCriterion("tbi_invoice_time not in", values, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeBetween(Date value1, Date value2) {
            addCriterion("tbi_invoice_time between", value1, value2, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiInvoiceTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbi_invoice_time not between", value1, value2, "tbiInvoiceTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeIsNull() {
            addCriterion("tbi_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeIsNotNull() {
            addCriterion("tbi_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeEqualTo(Date value) {
            addCriterion("tbi_update_time =", value, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbi_update_time <>", value, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeGreaterThan(Date value) {
            addCriterion("tbi_update_time >", value, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbi_update_time >=", value, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeLessThan(Date value) {
            addCriterion("tbi_update_time <", value, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbi_update_time <=", value, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeIn(List<Date> values) {
            addCriterion("tbi_update_time in", values, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbi_update_time not in", values, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbi_update_time between", value1, value2, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbi_update_time not between", value1, value2, "tbiUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeIsNull() {
            addCriterion("tbi_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeIsNotNull() {
            addCriterion("tbi_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeEqualTo(Date value) {
            addCriterion("tbi_add_time =", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeNotEqualTo(Date value) {
            addCriterion("tbi_add_time <>", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeGreaterThan(Date value) {
            addCriterion("tbi_add_time >", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbi_add_time >=", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeLessThan(Date value) {
            addCriterion("tbi_add_time <", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbi_add_time <=", value, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeIn(List<Date> values) {
            addCriterion("tbi_add_time in", values, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeNotIn(List<Date> values) {
            addCriterion("tbi_add_time not in", values, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbi_add_time between", value1, value2, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbi_add_time not between", value1, value2, "tbiAddTime");
            return (Criteria) this;
        }

        public Criteria andTbiStatusIsNull() {
            addCriterion("tbi_status is null");
            return (Criteria) this;
        }

        public Criteria andTbiStatusIsNotNull() {
            addCriterion("tbi_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbiStatusEqualTo(Byte value) {
            addCriterion("tbi_status =", value, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusNotEqualTo(Byte value) {
            addCriterion("tbi_status <>", value, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusGreaterThan(Byte value) {
            addCriterion("tbi_status >", value, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbi_status >=", value, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusLessThan(Byte value) {
            addCriterion("tbi_status <", value, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbi_status <=", value, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusIn(List<Byte> values) {
            addCriterion("tbi_status in", values, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusNotIn(List<Byte> values) {
            addCriterion("tbi_status not in", values, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbi_status between", value1, value2, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andTbiStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbi_status not between", value1, value2, "tbiStatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
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