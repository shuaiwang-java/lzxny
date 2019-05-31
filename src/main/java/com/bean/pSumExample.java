package com.bean;

import java.util.ArrayList;
import java.util.List;

public class pSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pSumExample() {
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

        public Criteria andPsumidIsNull() {
            addCriterion("pSumId is null");
            return (Criteria) this;
        }

        public Criteria andPsumidIsNotNull() {
            addCriterion("pSumId is not null");
            return (Criteria) this;
        }

        public Criteria andPsumidEqualTo(Integer value) {
            addCriterion("pSumId =", value, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidNotEqualTo(Integer value) {
            addCriterion("pSumId <>", value, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidGreaterThan(Integer value) {
            addCriterion("pSumId >", value, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pSumId >=", value, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidLessThan(Integer value) {
            addCriterion("pSumId <", value, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidLessThanOrEqualTo(Integer value) {
            addCriterion("pSumId <=", value, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidIn(List<Integer> values) {
            addCriterion("pSumId in", values, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidNotIn(List<Integer> values) {
            addCriterion("pSumId not in", values, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidBetween(Integer value1, Integer value2) {
            addCriterion("pSumId between", value1, value2, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumidNotBetween(Integer value1, Integer value2) {
            addCriterion("pSumId not between", value1, value2, "psumid");
            return (Criteria) this;
        }

        public Criteria andPsumvalIsNull() {
            addCriterion("pSumVal is null");
            return (Criteria) this;
        }

        public Criteria andPsumvalIsNotNull() {
            addCriterion("pSumVal is not null");
            return (Criteria) this;
        }

        public Criteria andPsumvalEqualTo(Float value) {
            addCriterion("pSumVal =", value, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalNotEqualTo(Float value) {
            addCriterion("pSumVal <>", value, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalGreaterThan(Float value) {
            addCriterion("pSumVal >", value, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalGreaterThanOrEqualTo(Float value) {
            addCriterion("pSumVal >=", value, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalLessThan(Float value) {
            addCriterion("pSumVal <", value, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalLessThanOrEqualTo(Float value) {
            addCriterion("pSumVal <=", value, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalIn(List<Float> values) {
            addCriterion("pSumVal in", values, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalNotIn(List<Float> values) {
            addCriterion("pSumVal not in", values, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalBetween(Float value1, Float value2) {
            addCriterion("pSumVal between", value1, value2, "psumval");
            return (Criteria) this;
        }

        public Criteria andPsumvalNotBetween(Float value1, Float value2) {
            addCriterion("pSumVal not between", value1, value2, "psumval");
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