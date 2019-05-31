package com.bean;

import java.util.ArrayList;
import java.util.List;

public class pSumUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pSumUserExample() {
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

        public Criteria andPuseridIsNull() {
            addCriterion("pUserId is null");
            return (Criteria) this;
        }

        public Criteria andPuseridIsNotNull() {
            addCriterion("pUserId is not null");
            return (Criteria) this;
        }

        public Criteria andPuseridEqualTo(Integer value) {
            addCriterion("pUserId =", value, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridNotEqualTo(Integer value) {
            addCriterion("pUserId <>", value, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridGreaterThan(Integer value) {
            addCriterion("pUserId >", value, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("pUserId >=", value, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridLessThan(Integer value) {
            addCriterion("pUserId <", value, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridLessThanOrEqualTo(Integer value) {
            addCriterion("pUserId <=", value, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridIn(List<Integer> values) {
            addCriterion("pUserId in", values, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridNotIn(List<Integer> values) {
            addCriterion("pUserId not in", values, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridBetween(Integer value1, Integer value2) {
            addCriterion("pUserId between", value1, value2, "puserid");
            return (Criteria) this;
        }

        public Criteria andPuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("pUserId not between", value1, value2, "puserid");
            return (Criteria) this;
        }

        public Criteria andPusernameIsNull() {
            addCriterion("pUserName is null");
            return (Criteria) this;
        }

        public Criteria andPusernameIsNotNull() {
            addCriterion("pUserName is not null");
            return (Criteria) this;
        }

        public Criteria andPusernameEqualTo(String value) {
            addCriterion("pUserName =", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotEqualTo(String value) {
            addCriterion("pUserName <>", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameGreaterThan(String value) {
            addCriterion("pUserName >", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameGreaterThanOrEqualTo(String value) {
            addCriterion("pUserName >=", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameLessThan(String value) {
            addCriterion("pUserName <", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameLessThanOrEqualTo(String value) {
            addCriterion("pUserName <=", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameLike(String value) {
            addCriterion("pUserName like", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotLike(String value) {
            addCriterion("pUserName not like", value, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameIn(List<String> values) {
            addCriterion("pUserName in", values, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotIn(List<String> values) {
            addCriterion("pUserName not in", values, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameBetween(String value1, String value2) {
            addCriterion("pUserName between", value1, value2, "pusername");
            return (Criteria) this;
        }

        public Criteria andPusernameNotBetween(String value1, String value2) {
            addCriterion("pUserName not between", value1, value2, "pusername");
            return (Criteria) this;
        }

        public Criteria andPuserphoneIsNull() {
            addCriterion("pUserPhone is null");
            return (Criteria) this;
        }

        public Criteria andPuserphoneIsNotNull() {
            addCriterion("pUserPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPuserphoneEqualTo(String value) {
            addCriterion("pUserPhone =", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneNotEqualTo(String value) {
            addCriterion("pUserPhone <>", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneGreaterThan(String value) {
            addCriterion("pUserPhone >", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("pUserPhone >=", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneLessThan(String value) {
            addCriterion("pUserPhone <", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneLessThanOrEqualTo(String value) {
            addCriterion("pUserPhone <=", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneLike(String value) {
            addCriterion("pUserPhone like", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneNotLike(String value) {
            addCriterion("pUserPhone not like", value, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneIn(List<String> values) {
            addCriterion("pUserPhone in", values, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneNotIn(List<String> values) {
            addCriterion("pUserPhone not in", values, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneBetween(String value1, String value2) {
            addCriterion("pUserPhone between", value1, value2, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserphoneNotBetween(String value1, String value2) {
            addCriterion("pUserPhone not between", value1, value2, "puserphone");
            return (Criteria) this;
        }

        public Criteria andPuserdeptIsNull() {
            addCriterion("pUserDept is null");
            return (Criteria) this;
        }

        public Criteria andPuserdeptIsNotNull() {
            addCriterion("pUserDept is not null");
            return (Criteria) this;
        }

        public Criteria andPuserdeptEqualTo(String value) {
            addCriterion("pUserDept =", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptNotEqualTo(String value) {
            addCriterion("pUserDept <>", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptGreaterThan(String value) {
            addCriterion("pUserDept >", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptGreaterThanOrEqualTo(String value) {
            addCriterion("pUserDept >=", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptLessThan(String value) {
            addCriterion("pUserDept <", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptLessThanOrEqualTo(String value) {
            addCriterion("pUserDept <=", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptLike(String value) {
            addCriterion("pUserDept like", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptNotLike(String value) {
            addCriterion("pUserDept not like", value, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptIn(List<String> values) {
            addCriterion("pUserDept in", values, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptNotIn(List<String> values) {
            addCriterion("pUserDept not in", values, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptBetween(String value1, String value2) {
            addCriterion("pUserDept between", value1, value2, "puserdept");
            return (Criteria) this;
        }

        public Criteria andPuserdeptNotBetween(String value1, String value2) {
            addCriterion("pUserDept not between", value1, value2, "puserdept");
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