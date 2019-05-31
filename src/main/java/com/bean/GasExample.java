package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GasExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gName is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gName is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gName =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gName <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gName >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gName >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gName <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gName <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gName like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gName not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gName in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gName not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gName between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gName not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andCh4IsNull() {
            addCriterion("ch4 is null");
            return (Criteria) this;
        }

        public Criteria andCh4IsNotNull() {
            addCriterion("ch4 is not null");
            return (Criteria) this;
        }

        public Criteria andCh4EqualTo(String value) {
            addCriterion("ch4 =", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotEqualTo(String value) {
            addCriterion("ch4 <>", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4GreaterThan(String value) {
            addCriterion("ch4 >", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4GreaterThanOrEqualTo(String value) {
            addCriterion("ch4 >=", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4LessThan(String value) {
            addCriterion("ch4 <", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4LessThanOrEqualTo(String value) {
            addCriterion("ch4 <=", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4Like(String value) {
            addCriterion("ch4 like", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotLike(String value) {
            addCriterion("ch4 not like", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4In(List<String> values) {
            addCriterion("ch4 in", values, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotIn(List<String> values) {
            addCriterion("ch4 not in", values, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4Between(String value1, String value2) {
            addCriterion("ch4 between", value1, value2, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotBetween(String value1, String value2) {
            addCriterion("ch4 not between", value1, value2, "ch4");
            return (Criteria) this;
        }

        public Criteria andCo2IsNull() {
            addCriterion("co2 is null");
            return (Criteria) this;
        }

        public Criteria andCo2IsNotNull() {
            addCriterion("co2 is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EqualTo(String value) {
            addCriterion("co2 =", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotEqualTo(String value) {
            addCriterion("co2 <>", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThan(String value) {
            addCriterion("co2 >", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThanOrEqualTo(String value) {
            addCriterion("co2 >=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThan(String value) {
            addCriterion("co2 <", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThanOrEqualTo(String value) {
            addCriterion("co2 <=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Like(String value) {
            addCriterion("co2 like", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotLike(String value) {
            addCriterion("co2 not like", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2In(List<String> values) {
            addCriterion("co2 in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotIn(List<String> values) {
            addCriterion("co2 not in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Between(String value1, String value2) {
            addCriterion("co2 between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotBetween(String value1, String value2) {
            addCriterion("co2 not between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andO2IsNull() {
            addCriterion("o2 is null");
            return (Criteria) this;
        }

        public Criteria andO2IsNotNull() {
            addCriterion("o2 is not null");
            return (Criteria) this;
        }

        public Criteria andO2EqualTo(String value) {
            addCriterion("o2 =", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotEqualTo(String value) {
            addCriterion("o2 <>", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2GreaterThan(String value) {
            addCriterion("o2 >", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2GreaterThanOrEqualTo(String value) {
            addCriterion("o2 >=", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2LessThan(String value) {
            addCriterion("o2 <", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2LessThanOrEqualTo(String value) {
            addCriterion("o2 <=", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2Like(String value) {
            addCriterion("o2 like", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotLike(String value) {
            addCriterion("o2 not like", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2In(List<String> values) {
            addCriterion("o2 in", values, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotIn(List<String> values) {
            addCriterion("o2 not in", values, "o2");
            return (Criteria) this;
        }

        public Criteria andO2Between(String value1, String value2) {
            addCriterion("o2 between", value1, value2, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotBetween(String value1, String value2) {
            addCriterion("o2 not between", value1, value2, "o2");
            return (Criteria) this;
        }

        public Criteria andH2sIsNull() {
            addCriterion("h2s is null");
            return (Criteria) this;
        }

        public Criteria andH2sIsNotNull() {
            addCriterion("h2s is not null");
            return (Criteria) this;
        }

        public Criteria andH2sEqualTo(String value) {
            addCriterion("h2s =", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sNotEqualTo(String value) {
            addCriterion("h2s <>", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sGreaterThan(String value) {
            addCriterion("h2s >", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sGreaterThanOrEqualTo(String value) {
            addCriterion("h2s >=", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sLessThan(String value) {
            addCriterion("h2s <", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sLessThanOrEqualTo(String value) {
            addCriterion("h2s <=", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sLike(String value) {
            addCriterion("h2s like", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sNotLike(String value) {
            addCriterion("h2s not like", value, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sIn(List<String> values) {
            addCriterion("h2s in", values, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sNotIn(List<String> values) {
            addCriterion("h2s not in", values, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sBetween(String value1, String value2) {
            addCriterion("h2s between", value1, value2, "h2s");
            return (Criteria) this;
        }

        public Criteria andH2sNotBetween(String value1, String value2) {
            addCriterion("h2s not between", value1, value2, "h2s");
            return (Criteria) this;
        }

        public Criteria andBalIsNull() {
            addCriterion("bal is null");
            return (Criteria) this;
        }

        public Criteria andBalIsNotNull() {
            addCriterion("bal is not null");
            return (Criteria) this;
        }

        public Criteria andBalEqualTo(String value) {
            addCriterion("bal =", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotEqualTo(String value) {
            addCriterion("bal <>", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalGreaterThan(String value) {
            addCriterion("bal >", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalGreaterThanOrEqualTo(String value) {
            addCriterion("bal >=", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalLessThan(String value) {
            addCriterion("bal <", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalLessThanOrEqualTo(String value) {
            addCriterion("bal <=", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalLike(String value) {
            addCriterion("bal like", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotLike(String value) {
            addCriterion("bal not like", value, "bal");
            return (Criteria) this;
        }

        public Criteria andBalIn(List<String> values) {
            addCriterion("bal in", values, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotIn(List<String> values) {
            addCriterion("bal not in", values, "bal");
            return (Criteria) this;
        }

        public Criteria andBalBetween(String value1, String value2) {
            addCriterion("bal between", value1, value2, "bal");
            return (Criteria) this;
        }

        public Criteria andBalNotBetween(String value1, String value2) {
            addCriterion("bal not between", value1, value2, "bal");
            return (Criteria) this;
        }

        public Criteria andGtimeIsNull() {
            addCriterion("gTime is null");
            return (Criteria) this;
        }

        public Criteria andGtimeIsNotNull() {
            addCriterion("gTime is not null");
            return (Criteria) this;
        }

        public Criteria andGtimeEqualTo(Date value) {
            addCriterion("gTime =", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeNotEqualTo(Date value) {
            addCriterion("gTime <>", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeGreaterThan(Date value) {
            addCriterion("gTime >", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gTime >=", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeLessThan(Date value) {
            addCriterion("gTime <", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeLessThanOrEqualTo(Date value) {
            addCriterion("gTime <=", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeIn(List<Date> values) {
            addCriterion("gTime in", values, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeNotIn(List<Date> values) {
            addCriterion("gTime not in", values, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeBetween(Date value1, Date value2) {
            addCriterion("gTime between", value1, value2, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeNotBetween(Date value1, Date value2) {
            addCriterion("gTime not between", value1, value2, "gtime");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uName is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uName is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uName =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uName <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uName >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uName >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uName <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uName <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uName like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uName not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uName in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uName not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uName between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uName not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPressureIsNull() {
            addCriterion("pressure is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("pressure is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(String value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(String value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(String value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(String value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(String value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(String value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLike(String value) {
            addCriterion("pressure like", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotLike(String value) {
            addCriterion("pressure not like", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<String> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<String> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(String value1, String value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(String value1, String value2) {
            addCriterion("pressure not between", value1, value2, "pressure");
            return (Criteria) this;
        }
        
        
        public Criteria andLIsNull() {
            addCriterion("l is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("l is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(String value) {
            addCriterion("l =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(String value) {
            addCriterion("l <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(String value) {
            addCriterion("l >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(String value) {
            addCriterion("l >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(String value) {
            addCriterion("l <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(String value) {
            addCriterion("l <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLike(String value) {
            addCriterion("l like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotLike(String value) {
            addCriterion("l not like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<String> values) {
            addCriterion("l in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<String> values) {
            addCriterion("l not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(String value1, String value2) {
            addCriterion("l between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(String value1, String value2) {
            addCriterion("l not between", value1, value2, "l");
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