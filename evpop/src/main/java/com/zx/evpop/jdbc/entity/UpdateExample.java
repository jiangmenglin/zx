package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpdateExample() {
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

        public Criteria andTbuIdIsNull() {
            addCriterion("tbu_id is null");
            return (Criteria) this;
        }

        public Criteria andTbuIdIsNotNull() {
            addCriterion("tbu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbuIdEqualTo(Integer value) {
            addCriterion("tbu_id =", value, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdNotEqualTo(Integer value) {
            addCriterion("tbu_id <>", value, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdGreaterThan(Integer value) {
            addCriterion("tbu_id >", value, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbu_id >=", value, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdLessThan(Integer value) {
            addCriterion("tbu_id <", value, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbu_id <=", value, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdIn(List<Integer> values) {
            addCriterion("tbu_id in", values, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdNotIn(List<Integer> values) {
            addCriterion("tbu_id not in", values, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdBetween(Integer value1, Integer value2) {
            addCriterion("tbu_id between", value1, value2, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbu_id not between", value1, value2, "tbuId");
            return (Criteria) this;
        }

        public Criteria andTbuNameIsNull() {
            addCriterion("tbu_name is null");
            return (Criteria) this;
        }

        public Criteria andTbuNameIsNotNull() {
            addCriterion("tbu_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbuNameEqualTo(String value) {
            addCriterion("tbu_name =", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameNotEqualTo(String value) {
            addCriterion("tbu_name <>", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameGreaterThan(String value) {
            addCriterion("tbu_name >", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbu_name >=", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameLessThan(String value) {
            addCriterion("tbu_name <", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameLessThanOrEqualTo(String value) {
            addCriterion("tbu_name <=", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameLike(String value) {
            addCriterion("tbu_name like", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameNotLike(String value) {
            addCriterion("tbu_name not like", value, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameIn(List<String> values) {
            addCriterion("tbu_name in", values, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameNotIn(List<String> values) {
            addCriterion("tbu_name not in", values, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameBetween(String value1, String value2) {
            addCriterion("tbu_name between", value1, value2, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuNameNotBetween(String value1, String value2) {
            addCriterion("tbu_name not between", value1, value2, "tbuName");
            return (Criteria) this;
        }

        public Criteria andTbuVersionIsNull() {
            addCriterion("tbu_version is null");
            return (Criteria) this;
        }

        public Criteria andTbuVersionIsNotNull() {
            addCriterion("tbu_version is not null");
            return (Criteria) this;
        }

        public Criteria andTbuVersionEqualTo(String value) {
            addCriterion("tbu_version =", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionNotEqualTo(String value) {
            addCriterion("tbu_version <>", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionGreaterThan(String value) {
            addCriterion("tbu_version >", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionGreaterThanOrEqualTo(String value) {
            addCriterion("tbu_version >=", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionLessThan(String value) {
            addCriterion("tbu_version <", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionLessThanOrEqualTo(String value) {
            addCriterion("tbu_version <=", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionLike(String value) {
            addCriterion("tbu_version like", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionNotLike(String value) {
            addCriterion("tbu_version not like", value, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionIn(List<String> values) {
            addCriterion("tbu_version in", values, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionNotIn(List<String> values) {
            addCriterion("tbu_version not in", values, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionBetween(String value1, String value2) {
            addCriterion("tbu_version between", value1, value2, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuVersionNotBetween(String value1, String value2) {
            addCriterion("tbu_version not between", value1, value2, "tbuVersion");
            return (Criteria) this;
        }

        public Criteria andTbuTypeIsNull() {
            addCriterion("tbu_type is null");
            return (Criteria) this;
        }

        public Criteria andTbuTypeIsNotNull() {
            addCriterion("tbu_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbuTypeEqualTo(Byte value) {
            addCriterion("tbu_type =", value, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeNotEqualTo(Byte value) {
            addCriterion("tbu_type <>", value, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeGreaterThan(Byte value) {
            addCriterion("tbu_type >", value, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbu_type >=", value, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeLessThan(Byte value) {
            addCriterion("tbu_type <", value, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tbu_type <=", value, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeIn(List<Byte> values) {
            addCriterion("tbu_type in", values, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeNotIn(List<Byte> values) {
            addCriterion("tbu_type not in", values, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeBetween(Byte value1, Byte value2) {
            addCriterion("tbu_type between", value1, value2, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbu_type not between", value1, value2, "tbuType");
            return (Criteria) this;
        }

        public Criteria andTbuModeIsNull() {
            addCriterion("tbu_mode is null");
            return (Criteria) this;
        }

        public Criteria andTbuModeIsNotNull() {
            addCriterion("tbu_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTbuModeEqualTo(Byte value) {
            addCriterion("tbu_mode =", value, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeNotEqualTo(Byte value) {
            addCriterion("tbu_mode <>", value, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeGreaterThan(Byte value) {
            addCriterion("tbu_mode >", value, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbu_mode >=", value, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeLessThan(Byte value) {
            addCriterion("tbu_mode <", value, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeLessThanOrEqualTo(Byte value) {
            addCriterion("tbu_mode <=", value, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeIn(List<Byte> values) {
            addCriterion("tbu_mode in", values, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeNotIn(List<Byte> values) {
            addCriterion("tbu_mode not in", values, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeBetween(Byte value1, Byte value2) {
            addCriterion("tbu_mode between", value1, value2, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuModeNotBetween(Byte value1, Byte value2) {
            addCriterion("tbu_mode not between", value1, value2, "tbuMode");
            return (Criteria) this;
        }

        public Criteria andTbuFileIsNull() {
            addCriterion("tbu_file is null");
            return (Criteria) this;
        }

        public Criteria andTbuFileIsNotNull() {
            addCriterion("tbu_file is not null");
            return (Criteria) this;
        }

        public Criteria andTbuFileEqualTo(String value) {
            addCriterion("tbu_file =", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileNotEqualTo(String value) {
            addCriterion("tbu_file <>", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileGreaterThan(String value) {
            addCriterion("tbu_file >", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileGreaterThanOrEqualTo(String value) {
            addCriterion("tbu_file >=", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileLessThan(String value) {
            addCriterion("tbu_file <", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileLessThanOrEqualTo(String value) {
            addCriterion("tbu_file <=", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileLike(String value) {
            addCriterion("tbu_file like", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileNotLike(String value) {
            addCriterion("tbu_file not like", value, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileIn(List<String> values) {
            addCriterion("tbu_file in", values, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileNotIn(List<String> values) {
            addCriterion("tbu_file not in", values, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileBetween(String value1, String value2) {
            addCriterion("tbu_file between", value1, value2, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuFileNotBetween(String value1, String value2) {
            addCriterion("tbu_file not between", value1, value2, "tbuFile");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptIsNull() {
            addCriterion("tbu_descript is null");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptIsNotNull() {
            addCriterion("tbu_descript is not null");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptEqualTo(String value) {
            addCriterion("tbu_descript =", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptNotEqualTo(String value) {
            addCriterion("tbu_descript <>", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptGreaterThan(String value) {
            addCriterion("tbu_descript >", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("tbu_descript >=", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptLessThan(String value) {
            addCriterion("tbu_descript <", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptLessThanOrEqualTo(String value) {
            addCriterion("tbu_descript <=", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptLike(String value) {
            addCriterion("tbu_descript like", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptNotLike(String value) {
            addCriterion("tbu_descript not like", value, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptIn(List<String> values) {
            addCriterion("tbu_descript in", values, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptNotIn(List<String> values) {
            addCriterion("tbu_descript not in", values, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptBetween(String value1, String value2) {
            addCriterion("tbu_descript between", value1, value2, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuDescriptNotBetween(String value1, String value2) {
            addCriterion("tbu_descript not between", value1, value2, "tbuDescript");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeIsNull() {
            addCriterion("tbu_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeIsNotNull() {
            addCriterion("tbu_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeEqualTo(Date value) {
            addCriterion("tbu_update_time =", value, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbu_update_time <>", value, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeGreaterThan(Date value) {
            addCriterion("tbu_update_time >", value, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbu_update_time >=", value, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeLessThan(Date value) {
            addCriterion("tbu_update_time <", value, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbu_update_time <=", value, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeIn(List<Date> values) {
            addCriterion("tbu_update_time in", values, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbu_update_time not in", values, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbu_update_time between", value1, value2, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbu_update_time not between", value1, value2, "tbuUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeIsNull() {
            addCriterion("tbu_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeIsNotNull() {
            addCriterion("tbu_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeEqualTo(Date value) {
            addCriterion("tbu_add_time =", value, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeNotEqualTo(Date value) {
            addCriterion("tbu_add_time <>", value, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeGreaterThan(Date value) {
            addCriterion("tbu_add_time >", value, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbu_add_time >=", value, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeLessThan(Date value) {
            addCriterion("tbu_add_time <", value, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbu_add_time <=", value, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeIn(List<Date> values) {
            addCriterion("tbu_add_time in", values, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeNotIn(List<Date> values) {
            addCriterion("tbu_add_time not in", values, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbu_add_time between", value1, value2, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbu_add_time not between", value1, value2, "tbuAddTime");
            return (Criteria) this;
        }

        public Criteria andTbuStatusIsNull() {
            addCriterion("tbu_status is null");
            return (Criteria) this;
        }

        public Criteria andTbuStatusIsNotNull() {
            addCriterion("tbu_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbuStatusEqualTo(Byte value) {
            addCriterion("tbu_status =", value, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusNotEqualTo(Byte value) {
            addCriterion("tbu_status <>", value, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusGreaterThan(Byte value) {
            addCriterion("tbu_status >", value, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbu_status >=", value, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusLessThan(Byte value) {
            addCriterion("tbu_status <", value, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbu_status <=", value, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusIn(List<Byte> values) {
            addCriterion("tbu_status in", values, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusNotIn(List<Byte> values) {
            addCriterion("tbu_status not in", values, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbu_status between", value1, value2, "tbuStatus");
            return (Criteria) this;
        }

        public Criteria andTbuStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbu_status not between", value1, value2, "tbuStatus");
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