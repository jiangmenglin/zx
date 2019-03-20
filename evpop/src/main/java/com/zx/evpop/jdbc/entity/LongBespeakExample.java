package com.zx.evpop.jdbc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongBespeakExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongBespeakExample() {
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

        public Criteria andTblbIdIsNull() {
            addCriterion("tblb_id is null");
            return (Criteria) this;
        }

        public Criteria andTblbIdIsNotNull() {
            addCriterion("tblb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblbIdEqualTo(Long value) {
            addCriterion("tblb_id =", value, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdNotEqualTo(Long value) {
            addCriterion("tblb_id <>", value, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdGreaterThan(Long value) {
            addCriterion("tblb_id >", value, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tblb_id >=", value, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdLessThan(Long value) {
            addCriterion("tblb_id <", value, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdLessThanOrEqualTo(Long value) {
            addCriterion("tblb_id <=", value, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdIn(List<Long> values) {
            addCriterion("tblb_id in", values, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdNotIn(List<Long> values) {
            addCriterion("tblb_id not in", values, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdBetween(Long value1, Long value2) {
            addCriterion("tblb_id between", value1, value2, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbIdNotBetween(Long value1, Long value2) {
            addCriterion("tblb_id not between", value1, value2, "tblbId");
            return (Criteria) this;
        }

        public Criteria andTblbHostIsNull() {
            addCriterion("tblb_host is null");
            return (Criteria) this;
        }

        public Criteria andTblbHostIsNotNull() {
            addCriterion("tblb_host is not null");
            return (Criteria) this;
        }

        public Criteria andTblbHostEqualTo(Long value) {
            addCriterion("tblb_host =", value, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostNotEqualTo(Long value) {
            addCriterion("tblb_host <>", value, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostGreaterThan(Long value) {
            addCriterion("tblb_host >", value, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostGreaterThanOrEqualTo(Long value) {
            addCriterion("tblb_host >=", value, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostLessThan(Long value) {
            addCriterion("tblb_host <", value, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostLessThanOrEqualTo(Long value) {
            addCriterion("tblb_host <=", value, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostIn(List<Long> values) {
            addCriterion("tblb_host in", values, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostNotIn(List<Long> values) {
            addCriterion("tblb_host not in", values, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostBetween(Long value1, Long value2) {
            addCriterion("tblb_host between", value1, value2, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbHostNotBetween(Long value1, Long value2) {
            addCriterion("tblb_host not between", value1, value2, "tblbHost");
            return (Criteria) this;
        }

        public Criteria andTblbMemberIsNull() {
            addCriterion("tblb_member is null");
            return (Criteria) this;
        }

        public Criteria andTblbMemberIsNotNull() {
            addCriterion("tblb_member is not null");
            return (Criteria) this;
        }

        public Criteria andTblbMemberEqualTo(Long value) {
            addCriterion("tblb_member =", value, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberNotEqualTo(Long value) {
            addCriterion("tblb_member <>", value, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberGreaterThan(Long value) {
            addCriterion("tblb_member >", value, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("tblb_member >=", value, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberLessThan(Long value) {
            addCriterion("tblb_member <", value, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberLessThanOrEqualTo(Long value) {
            addCriterion("tblb_member <=", value, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberIn(List<Long> values) {
            addCriterion("tblb_member in", values, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberNotIn(List<Long> values) {
            addCriterion("tblb_member not in", values, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberBetween(Long value1, Long value2) {
            addCriterion("tblb_member between", value1, value2, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbMemberNotBetween(Long value1, Long value2) {
            addCriterion("tblb_member not between", value1, value2, "tblbMember");
            return (Criteria) this;
        }

        public Criteria andTblbModelIsNull() {
            addCriterion("tblb_model is null");
            return (Criteria) this;
        }

        public Criteria andTblbModelIsNotNull() {
            addCriterion("tblb_model is not null");
            return (Criteria) this;
        }

        public Criteria andTblbModelEqualTo(Long value) {
            addCriterion("tblb_model =", value, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelNotEqualTo(Long value) {
            addCriterion("tblb_model <>", value, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelGreaterThan(Long value) {
            addCriterion("tblb_model >", value, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelGreaterThanOrEqualTo(Long value) {
            addCriterion("tblb_model >=", value, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelLessThan(Long value) {
            addCriterion("tblb_model <", value, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelLessThanOrEqualTo(Long value) {
            addCriterion("tblb_model <=", value, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelIn(List<Long> values) {
            addCriterion("tblb_model in", values, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelNotIn(List<Long> values) {
            addCriterion("tblb_model not in", values, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelBetween(Long value1, Long value2) {
            addCriterion("tblb_model between", value1, value2, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbModelNotBetween(Long value1, Long value2) {
            addCriterion("tblb_model not between", value1, value2, "tblbModel");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeIsNull() {
            addCriterion("tblb_gettime is null");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeIsNotNull() {
            addCriterion("tblb_gettime is not null");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeEqualTo(Date value) {
            addCriterion("tblb_gettime =", value, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeNotEqualTo(Date value) {
            addCriterion("tblb_gettime <>", value, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeGreaterThan(Date value) {
            addCriterion("tblb_gettime >", value, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblb_gettime >=", value, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeLessThan(Date value) {
            addCriterion("tblb_gettime <", value, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeLessThanOrEqualTo(Date value) {
            addCriterion("tblb_gettime <=", value, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeIn(List<Date> values) {
            addCriterion("tblb_gettime in", values, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeNotIn(List<Date> values) {
            addCriterion("tblb_gettime not in", values, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeBetween(Date value1, Date value2) {
            addCriterion("tblb_gettime between", value1, value2, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbGettimeNotBetween(Date value1, Date value2) {
            addCriterion("tblb_gettime not between", value1, value2, "tblbGettime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeIsNull() {
            addCriterion("tblb_packagetime is null");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeIsNotNull() {
            addCriterion("tblb_packagetime is not null");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeEqualTo(Integer value) {
            addCriterion("tblb_packagetime =", value, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeNotEqualTo(Integer value) {
            addCriterion("tblb_packagetime <>", value, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeGreaterThan(Integer value) {
            addCriterion("tblb_packagetime >", value, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tblb_packagetime >=", value, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeLessThan(Integer value) {
            addCriterion("tblb_packagetime <", value, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeLessThanOrEqualTo(Integer value) {
            addCriterion("tblb_packagetime <=", value, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeIn(List<Integer> values) {
            addCriterion("tblb_packagetime in", values, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeNotIn(List<Integer> values) {
            addCriterion("tblb_packagetime not in", values, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeBetween(Integer value1, Integer value2) {
            addCriterion("tblb_packagetime between", value1, value2, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbPackagetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tblb_packagetime not between", value1, value2, "tblbPackagetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeIsNull() {
            addCriterion("tblb_createtime is null");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeIsNotNull() {
            addCriterion("tblb_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeEqualTo(Date value) {
            addCriterion("tblb_createtime =", value, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeNotEqualTo(Date value) {
            addCriterion("tblb_createtime <>", value, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeGreaterThan(Date value) {
            addCriterion("tblb_createtime >", value, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblb_createtime >=", value, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeLessThan(Date value) {
            addCriterion("tblb_createtime <", value, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("tblb_createtime <=", value, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeIn(List<Date> values) {
            addCriterion("tblb_createtime in", values, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeNotIn(List<Date> values) {
            addCriterion("tblb_createtime not in", values, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeBetween(Date value1, Date value2) {
            addCriterion("tblb_createtime between", value1, value2, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("tblb_createtime not between", value1, value2, "tblbCreatetime");
            return (Criteria) this;
        }

        public Criteria andTblbFounderIsNull() {
            addCriterion("tblb_founder is null");
            return (Criteria) this;
        }

        public Criteria andTblbFounderIsNotNull() {
            addCriterion("tblb_founder is not null");
            return (Criteria) this;
        }

        public Criteria andTblbFounderEqualTo(Long value) {
            addCriterion("tblb_founder =", value, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderNotEqualTo(Long value) {
            addCriterion("tblb_founder <>", value, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderGreaterThan(Long value) {
            addCriterion("tblb_founder >", value, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderGreaterThanOrEqualTo(Long value) {
            addCriterion("tblb_founder >=", value, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderLessThan(Long value) {
            addCriterion("tblb_founder <", value, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderLessThanOrEqualTo(Long value) {
            addCriterion("tblb_founder <=", value, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderIn(List<Long> values) {
            addCriterion("tblb_founder in", values, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderNotIn(List<Long> values) {
            addCriterion("tblb_founder not in", values, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderBetween(Long value1, Long value2) {
            addCriterion("tblb_founder between", value1, value2, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbFounderNotBetween(Long value1, Long value2) {
            addCriterion("tblb_founder not between", value1, value2, "tblbFounder");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeIsNull() {
            addCriterion("tblb_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeIsNotNull() {
            addCriterion("tblb_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeEqualTo(Date value) {
            addCriterion("tblb_updatetime =", value, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeNotEqualTo(Date value) {
            addCriterion("tblb_updatetime <>", value, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeGreaterThan(Date value) {
            addCriterion("tblb_updatetime >", value, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tblb_updatetime >=", value, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeLessThan(Date value) {
            addCriterion("tblb_updatetime <", value, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("tblb_updatetime <=", value, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeIn(List<Date> values) {
            addCriterion("tblb_updatetime in", values, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeNotIn(List<Date> values) {
            addCriterion("tblb_updatetime not in", values, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("tblb_updatetime between", value1, value2, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("tblb_updatetime not between", value1, value2, "tblbUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTblbModifierIsNull() {
            addCriterion("tblb_modifier is null");
            return (Criteria) this;
        }

        public Criteria andTblbModifierIsNotNull() {
            addCriterion("tblb_modifier is not null");
            return (Criteria) this;
        }

        public Criteria andTblbModifierEqualTo(Long value) {
            addCriterion("tblb_modifier =", value, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierNotEqualTo(Long value) {
            addCriterion("tblb_modifier <>", value, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierGreaterThan(Long value) {
            addCriterion("tblb_modifier >", value, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierGreaterThanOrEqualTo(Long value) {
            addCriterion("tblb_modifier >=", value, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierLessThan(Long value) {
            addCriterion("tblb_modifier <", value, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierLessThanOrEqualTo(Long value) {
            addCriterion("tblb_modifier <=", value, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierIn(List<Long> values) {
            addCriterion("tblb_modifier in", values, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierNotIn(List<Long> values) {
            addCriterion("tblb_modifier not in", values, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierBetween(Long value1, Long value2) {
            addCriterion("tblb_modifier between", value1, value2, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbModifierNotBetween(Long value1, Long value2) {
            addCriterion("tblb_modifier not between", value1, value2, "tblbModifier");
            return (Criteria) this;
        }

        public Criteria andTblbNoteIsNull() {
            addCriterion("tblb_note is null");
            return (Criteria) this;
        }

        public Criteria andTblbNoteIsNotNull() {
            addCriterion("tblb_note is not null");
            return (Criteria) this;
        }

        public Criteria andTblbNoteEqualTo(String value) {
            addCriterion("tblb_note =", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteNotEqualTo(String value) {
            addCriterion("tblb_note <>", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteGreaterThan(String value) {
            addCriterion("tblb_note >", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteGreaterThanOrEqualTo(String value) {
            addCriterion("tblb_note >=", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteLessThan(String value) {
            addCriterion("tblb_note <", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteLessThanOrEqualTo(String value) {
            addCriterion("tblb_note <=", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteLike(String value) {
            addCriterion("tblb_note like", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteNotLike(String value) {
            addCriterion("tblb_note not like", value, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteIn(List<String> values) {
            addCriterion("tblb_note in", values, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteNotIn(List<String> values) {
            addCriterion("tblb_note not in", values, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteBetween(String value1, String value2) {
            addCriterion("tblb_note between", value1, value2, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbNoteNotBetween(String value1, String value2) {
            addCriterion("tblb_note not between", value1, value2, "tblbNote");
            return (Criteria) this;
        }

        public Criteria andTblbStatusIsNull() {
            addCriterion("tblb_status is null");
            return (Criteria) this;
        }

        public Criteria andTblbStatusIsNotNull() {
            addCriterion("tblb_status is not null");
            return (Criteria) this;
        }

        public Criteria andTblbStatusEqualTo(Short value) {
            addCriterion("tblb_status =", value, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusNotEqualTo(Short value) {
            addCriterion("tblb_status <>", value, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusGreaterThan(Short value) {
            addCriterion("tblb_status >", value, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("tblb_status >=", value, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusLessThan(Short value) {
            addCriterion("tblb_status <", value, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusLessThanOrEqualTo(Short value) {
            addCriterion("tblb_status <=", value, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusIn(List<Short> values) {
            addCriterion("tblb_status in", values, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusNotIn(List<Short> values) {
            addCriterion("tblb_status not in", values, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusBetween(Short value1, Short value2) {
            addCriterion("tblb_status between", value1, value2, "tblbStatus");
            return (Criteria) this;
        }

        public Criteria andTblbStatusNotBetween(Short value1, Short value2) {
            addCriterion("tblb_status not between", value1, value2, "tblbStatus");
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