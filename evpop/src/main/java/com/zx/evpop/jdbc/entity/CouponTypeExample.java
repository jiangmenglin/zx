package com.zx.evpop.jdbc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponTypeExample() {
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

        public Criteria andTbctIdIsNull() {
            addCriterion("tbct_id is null");
            return (Criteria) this;
        }

        public Criteria andTbctIdIsNotNull() {
            addCriterion("tbct_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbctIdEqualTo(Integer value) {
            addCriterion("tbct_id =", value, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdNotEqualTo(Integer value) {
            addCriterion("tbct_id <>", value, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdGreaterThan(Integer value) {
            addCriterion("tbct_id >", value, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbct_id >=", value, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdLessThan(Integer value) {
            addCriterion("tbct_id <", value, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdLessThanOrEqualTo(Integer value) {
            addCriterion("tbct_id <=", value, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdIn(List<Integer> values) {
            addCriterion("tbct_id in", values, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdNotIn(List<Integer> values) {
            addCriterion("tbct_id not in", values, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdBetween(Integer value1, Integer value2) {
            addCriterion("tbct_id between", value1, value2, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbct_id not between", value1, value2, "tbctId");
            return (Criteria) this;
        }

        public Criteria andTbctNameIsNull() {
            addCriterion("tbct_name is null");
            return (Criteria) this;
        }

        public Criteria andTbctNameIsNotNull() {
            addCriterion("tbct_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbctNameEqualTo(String value) {
            addCriterion("tbct_name =", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameNotEqualTo(String value) {
            addCriterion("tbct_name <>", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameGreaterThan(String value) {
            addCriterion("tbct_name >", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbct_name >=", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameLessThan(String value) {
            addCriterion("tbct_name <", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameLessThanOrEqualTo(String value) {
            addCriterion("tbct_name <=", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameLike(String value) {
            addCriterion("tbct_name like", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameNotLike(String value) {
            addCriterion("tbct_name not like", value, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameIn(List<String> values) {
            addCriterion("tbct_name in", values, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameNotIn(List<String> values) {
            addCriterion("tbct_name not in", values, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameBetween(String value1, String value2) {
            addCriterion("tbct_name between", value1, value2, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctNameNotBetween(String value1, String value2) {
            addCriterion("tbct_name not between", value1, value2, "tbctName");
            return (Criteria) this;
        }

        public Criteria andTbctFlagIsNull() {
            addCriterion("tbct_flag is null");
            return (Criteria) this;
        }

        public Criteria andTbctFlagIsNotNull() {
            addCriterion("tbct_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTbctFlagEqualTo(String value) {
            addCriterion("tbct_flag =", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagNotEqualTo(String value) {
            addCriterion("tbct_flag <>", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagGreaterThan(String value) {
            addCriterion("tbct_flag >", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagGreaterThanOrEqualTo(String value) {
            addCriterion("tbct_flag >=", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagLessThan(String value) {
            addCriterion("tbct_flag <", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagLessThanOrEqualTo(String value) {
            addCriterion("tbct_flag <=", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagLike(String value) {
            addCriterion("tbct_flag like", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagNotLike(String value) {
            addCriterion("tbct_flag not like", value, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagIn(List<String> values) {
            addCriterion("tbct_flag in", values, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagNotIn(List<String> values) {
            addCriterion("tbct_flag not in", values, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagBetween(String value1, String value2) {
            addCriterion("tbct_flag between", value1, value2, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctFlagNotBetween(String value1, String value2) {
            addCriterion("tbct_flag not between", value1, value2, "tbctFlag");
            return (Criteria) this;
        }

        public Criteria andTbctSystemIsNull() {
            addCriterion("tbct_system is null");
            return (Criteria) this;
        }

        public Criteria andTbctSystemIsNotNull() {
            addCriterion("tbct_system is not null");
            return (Criteria) this;
        }

        public Criteria andTbctSystemEqualTo(Byte value) {
            addCriterion("tbct_system =", value, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemNotEqualTo(Byte value) {
            addCriterion("tbct_system <>", value, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemGreaterThan(Byte value) {
            addCriterion("tbct_system >", value, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbct_system >=", value, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemLessThan(Byte value) {
            addCriterion("tbct_system <", value, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemLessThanOrEqualTo(Byte value) {
            addCriterion("tbct_system <=", value, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemIn(List<Byte> values) {
            addCriterion("tbct_system in", values, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemNotIn(List<Byte> values) {
            addCriterion("tbct_system not in", values, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemBetween(Byte value1, Byte value2) {
            addCriterion("tbct_system between", value1, value2, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctSystemNotBetween(Byte value1, Byte value2) {
            addCriterion("tbct_system not between", value1, value2, "tbctSystem");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeIsNull() {
            addCriterion("tbct_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeIsNotNull() {
            addCriterion("tbct_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeEqualTo(Date value) {
            addCriterion("tbct_update_time =", value, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeNotEqualTo(Date value) {
            addCriterion("tbct_update_time <>", value, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeGreaterThan(Date value) {
            addCriterion("tbct_update_time >", value, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbct_update_time >=", value, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeLessThan(Date value) {
            addCriterion("tbct_update_time <", value, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbct_update_time <=", value, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeIn(List<Date> values) {
            addCriterion("tbct_update_time in", values, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeNotIn(List<Date> values) {
            addCriterion("tbct_update_time not in", values, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tbct_update_time between", value1, value2, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbct_update_time not between", value1, value2, "tbctUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTbctStartIsNull() {
            addCriterion("tbct_start is null");
            return (Criteria) this;
        }

        public Criteria andTbctStartIsNotNull() {
            addCriterion("tbct_start is not null");
            return (Criteria) this;
        }

        public Criteria andTbctStartEqualTo(Date value) {
            addCriterion("tbct_start =", value, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartNotEqualTo(Date value) {
            addCriterion("tbct_start <>", value, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartGreaterThan(Date value) {
            addCriterion("tbct_start >", value, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartGreaterThanOrEqualTo(Date value) {
            addCriterion("tbct_start >=", value, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartLessThan(Date value) {
            addCriterion("tbct_start <", value, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartLessThanOrEqualTo(Date value) {
            addCriterion("tbct_start <=", value, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartIn(List<Date> values) {
            addCriterion("tbct_start in", values, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartNotIn(List<Date> values) {
            addCriterion("tbct_start not in", values, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartBetween(Date value1, Date value2) {
            addCriterion("tbct_start between", value1, value2, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctStartNotBetween(Date value1, Date value2) {
            addCriterion("tbct_start not between", value1, value2, "tbctStart");
            return (Criteria) this;
        }

        public Criteria andTbctEndIsNull() {
            addCriterion("tbct_end is null");
            return (Criteria) this;
        }

        public Criteria andTbctEndIsNotNull() {
            addCriterion("tbct_end is not null");
            return (Criteria) this;
        }

        public Criteria andTbctEndEqualTo(Date value) {
            addCriterion("tbct_end =", value, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndNotEqualTo(Date value) {
            addCriterion("tbct_end <>", value, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndGreaterThan(Date value) {
            addCriterion("tbct_end >", value, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndGreaterThanOrEqualTo(Date value) {
            addCriterion("tbct_end >=", value, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndLessThan(Date value) {
            addCriterion("tbct_end <", value, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndLessThanOrEqualTo(Date value) {
            addCriterion("tbct_end <=", value, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndIn(List<Date> values) {
            addCriterion("tbct_end in", values, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndNotIn(List<Date> values) {
            addCriterion("tbct_end not in", values, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndBetween(Date value1, Date value2) {
            addCriterion("tbct_end between", value1, value2, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctEndNotBetween(Date value1, Date value2) {
            addCriterion("tbct_end not between", value1, value2, "tbctEnd");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkIsNull() {
            addCriterion("tbct_remark is null");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkIsNotNull() {
            addCriterion("tbct_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkEqualTo(String value) {
            addCriterion("tbct_remark =", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkNotEqualTo(String value) {
            addCriterion("tbct_remark <>", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkGreaterThan(String value) {
            addCriterion("tbct_remark >", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tbct_remark >=", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkLessThan(String value) {
            addCriterion("tbct_remark <", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkLessThanOrEqualTo(String value) {
            addCriterion("tbct_remark <=", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkLike(String value) {
            addCriterion("tbct_remark like", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkNotLike(String value) {
            addCriterion("tbct_remark not like", value, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkIn(List<String> values) {
            addCriterion("tbct_remark in", values, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkNotIn(List<String> values) {
            addCriterion("tbct_remark not in", values, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkBetween(String value1, String value2) {
            addCriterion("tbct_remark between", value1, value2, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctRemarkNotBetween(String value1, String value2) {
            addCriterion("tbct_remark not between", value1, value2, "tbctRemark");
            return (Criteria) this;
        }

        public Criteria andTbctCountIsNull() {
            addCriterion("tbct_count is null");
            return (Criteria) this;
        }

        public Criteria andTbctCountIsNotNull() {
            addCriterion("tbct_count is not null");
            return (Criteria) this;
        }

        public Criteria andTbctCountEqualTo(Integer value) {
            addCriterion("tbct_count =", value, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountNotEqualTo(Integer value) {
            addCriterion("tbct_count <>", value, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountGreaterThan(Integer value) {
            addCriterion("tbct_count >", value, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbct_count >=", value, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountLessThan(Integer value) {
            addCriterion("tbct_count <", value, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountLessThanOrEqualTo(Integer value) {
            addCriterion("tbct_count <=", value, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountIn(List<Integer> values) {
            addCriterion("tbct_count in", values, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountNotIn(List<Integer> values) {
            addCriterion("tbct_count not in", values, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountBetween(Integer value1, Integer value2) {
            addCriterion("tbct_count between", value1, value2, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tbct_count not between", value1, value2, "tbctCount");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutIsNull() {
            addCriterion("tbct_amout is null");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutIsNotNull() {
            addCriterion("tbct_amout is not null");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutEqualTo(Integer value) {
            addCriterion("tbct_amout =", value, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutNotEqualTo(Integer value) {
            addCriterion("tbct_amout <>", value, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutGreaterThan(Integer value) {
            addCriterion("tbct_amout >", value, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbct_amout >=", value, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutLessThan(Integer value) {
            addCriterion("tbct_amout <", value, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutLessThanOrEqualTo(Integer value) {
            addCriterion("tbct_amout <=", value, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutIn(List<Integer> values) {
            addCriterion("tbct_amout in", values, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutNotIn(List<Integer> values) {
            addCriterion("tbct_amout not in", values, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutBetween(Integer value1, Integer value2) {
            addCriterion("tbct_amout between", value1, value2, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctAmoutNotBetween(Integer value1, Integer value2) {
            addCriterion("tbct_amout not between", value1, value2, "tbctAmout");
            return (Criteria) this;
        }

        public Criteria andTbctLimitIsNull() {
            addCriterion("tbct_limit is null");
            return (Criteria) this;
        }

        public Criteria andTbctLimitIsNotNull() {
            addCriterion("tbct_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTbctLimitEqualTo(Byte value) {
            addCriterion("tbct_limit =", value, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitNotEqualTo(Byte value) {
            addCriterion("tbct_limit <>", value, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitGreaterThan(Byte value) {
            addCriterion("tbct_limit >", value, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbct_limit >=", value, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitLessThan(Byte value) {
            addCriterion("tbct_limit <", value, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitLessThanOrEqualTo(Byte value) {
            addCriterion("tbct_limit <=", value, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitIn(List<Byte> values) {
            addCriterion("tbct_limit in", values, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitNotIn(List<Byte> values) {
            addCriterion("tbct_limit not in", values, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitBetween(Byte value1, Byte value2) {
            addCriterion("tbct_limit between", value1, value2, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("tbct_limit not between", value1, value2, "tbctLimit");
            return (Criteria) this;
        }

        public Criteria andTbctMinIsNull() {
            addCriterion("tbct_min is null");
            return (Criteria) this;
        }

        public Criteria andTbctMinIsNotNull() {
            addCriterion("tbct_min is not null");
            return (Criteria) this;
        }

        public Criteria andTbctMinEqualTo(BigDecimal value) {
            addCriterion("tbct_min =", value, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinNotEqualTo(BigDecimal value) {
            addCriterion("tbct_min <>", value, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinGreaterThan(BigDecimal value) {
            addCriterion("tbct_min >", value, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tbct_min >=", value, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinLessThan(BigDecimal value) {
            addCriterion("tbct_min <", value, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tbct_min <=", value, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinIn(List<BigDecimal> values) {
            addCriterion("tbct_min in", values, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinNotIn(List<BigDecimal> values) {
            addCriterion("tbct_min not in", values, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbct_min between", value1, value2, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tbct_min not between", value1, value2, "tbctMin");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsIsNull() {
            addCriterion("tbct_order_params is null");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsIsNotNull() {
            addCriterion("tbct_order_params is not null");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsEqualTo(String value) {
            addCriterion("tbct_order_params =", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsNotEqualTo(String value) {
            addCriterion("tbct_order_params <>", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsGreaterThan(String value) {
            addCriterion("tbct_order_params >", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsGreaterThanOrEqualTo(String value) {
            addCriterion("tbct_order_params >=", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsLessThan(String value) {
            addCriterion("tbct_order_params <", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsLessThanOrEqualTo(String value) {
            addCriterion("tbct_order_params <=", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsLike(String value) {
            addCriterion("tbct_order_params like", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsNotLike(String value) {
            addCriterion("tbct_order_params not like", value, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsIn(List<String> values) {
            addCriterion("tbct_order_params in", values, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsNotIn(List<String> values) {
            addCriterion("tbct_order_params not in", values, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsBetween(String value1, String value2) {
            addCriterion("tbct_order_params between", value1, value2, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderParamsNotBetween(String value1, String value2) {
            addCriterion("tbct_order_params not between", value1, value2, "tbctOrderParams");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileIsNull() {
            addCriterion("tbct_order_profile is null");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileIsNotNull() {
            addCriterion("tbct_order_profile is not null");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileEqualTo(String value) {
            addCriterion("tbct_order_profile =", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileNotEqualTo(String value) {
            addCriterion("tbct_order_profile <>", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileGreaterThan(String value) {
            addCriterion("tbct_order_profile >", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileGreaterThanOrEqualTo(String value) {
            addCriterion("tbct_order_profile >=", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileLessThan(String value) {
            addCriterion("tbct_order_profile <", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileLessThanOrEqualTo(String value) {
            addCriterion("tbct_order_profile <=", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileLike(String value) {
            addCriterion("tbct_order_profile like", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileNotLike(String value) {
            addCriterion("tbct_order_profile not like", value, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileIn(List<String> values) {
            addCriterion("tbct_order_profile in", values, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileNotIn(List<String> values) {
            addCriterion("tbct_order_profile not in", values, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileBetween(String value1, String value2) {
            addCriterion("tbct_order_profile between", value1, value2, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctOrderProfileNotBetween(String value1, String value2) {
            addCriterion("tbct_order_profile not between", value1, value2, "tbctOrderProfile");
            return (Criteria) this;
        }

        public Criteria andTbctValidityIsNull() {
            addCriterion("tbct_validity is null");
            return (Criteria) this;
        }

        public Criteria andTbctValidityIsNotNull() {
            addCriterion("tbct_validity is not null");
            return (Criteria) this;
        }

        public Criteria andTbctValidityEqualTo(Byte value) {
            addCriterion("tbct_validity =", value, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityNotEqualTo(Byte value) {
            addCriterion("tbct_validity <>", value, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityGreaterThan(Byte value) {
            addCriterion("tbct_validity >", value, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbct_validity >=", value, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityLessThan(Byte value) {
            addCriterion("tbct_validity <", value, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityLessThanOrEqualTo(Byte value) {
            addCriterion("tbct_validity <=", value, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityIn(List<Byte> values) {
            addCriterion("tbct_validity in", values, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityNotIn(List<Byte> values) {
            addCriterion("tbct_validity not in", values, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityBetween(Byte value1, Byte value2) {
            addCriterion("tbct_validity between", value1, value2, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctValidityNotBetween(Byte value1, Byte value2) {
            addCriterion("tbct_validity not between", value1, value2, "tbctValidity");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeIsNull() {
            addCriterion("tbct_add_time is null");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeIsNotNull() {
            addCriterion("tbct_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeEqualTo(Date value) {
            addCriterion("tbct_add_time =", value, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeNotEqualTo(Date value) {
            addCriterion("tbct_add_time <>", value, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeGreaterThan(Date value) {
            addCriterion("tbct_add_time >", value, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tbct_add_time >=", value, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeLessThan(Date value) {
            addCriterion("tbct_add_time <", value, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("tbct_add_time <=", value, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeIn(List<Date> values) {
            addCriterion("tbct_add_time in", values, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeNotIn(List<Date> values) {
            addCriterion("tbct_add_time not in", values, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeBetween(Date value1, Date value2) {
            addCriterion("tbct_add_time between", value1, value2, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("tbct_add_time not between", value1, value2, "tbctAddTime");
            return (Criteria) this;
        }

        public Criteria andTbctStatusIsNull() {
            addCriterion("tbct_status is null");
            return (Criteria) this;
        }

        public Criteria andTbctStatusIsNotNull() {
            addCriterion("tbct_status is not null");
            return (Criteria) this;
        }

        public Criteria andTbctStatusEqualTo(Byte value) {
            addCriterion("tbct_status =", value, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusNotEqualTo(Byte value) {
            addCriterion("tbct_status <>", value, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusGreaterThan(Byte value) {
            addCriterion("tbct_status >", value, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("tbct_status >=", value, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusLessThan(Byte value) {
            addCriterion("tbct_status <", value, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusLessThanOrEqualTo(Byte value) {
            addCriterion("tbct_status <=", value, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusIn(List<Byte> values) {
            addCriterion("tbct_status in", values, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusNotIn(List<Byte> values) {
            addCriterion("tbct_status not in", values, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusBetween(Byte value1, Byte value2) {
            addCriterion("tbct_status between", value1, value2, "tbctStatus");
            return (Criteria) this;
        }

        public Criteria andTbctStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("tbct_status not between", value1, value2, "tbctStatus");
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