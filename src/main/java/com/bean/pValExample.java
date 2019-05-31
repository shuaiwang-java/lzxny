package com.bean;

import java.util.ArrayList;
import java.util.List;

public class pValExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pValExample() {
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

        public Criteria andPushidIsNull() {
            addCriterion("pushId is null");
            return (Criteria) this;
        }

        public Criteria andPushidIsNotNull() {
            addCriterion("pushId is not null");
            return (Criteria) this;
        }

        public Criteria andPushidEqualTo(Integer value) {
            addCriterion("pushId =", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidNotEqualTo(Integer value) {
            addCriterion("pushId <>", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidGreaterThan(Integer value) {
            addCriterion("pushId >", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pushId >=", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidLessThan(Integer value) {
            addCriterion("pushId <", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidLessThanOrEqualTo(Integer value) {
            addCriterion("pushId <=", value, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidIn(List<Integer> values) {
            addCriterion("pushId in", values, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidNotIn(List<Integer> values) {
            addCriterion("pushId not in", values, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidBetween(Integer value1, Integer value2) {
            addCriterion("pushId between", value1, value2, "pushid");
            return (Criteria) this;
        }

        public Criteria andPushidNotBetween(Integer value1, Integer value2) {
            addCriterion("pushId not between", value1, value2, "pushid");
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

        public Criteria andCh4EqualTo(Float value) {
            addCriterion("ch4 =", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotEqualTo(Float value) {
            addCriterion("ch4 <>", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4GreaterThan(Float value) {
            addCriterion("ch4 >", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4GreaterThanOrEqualTo(Float value) {
            addCriterion("ch4 >=", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4LessThan(Float value) {
            addCriterion("ch4 <", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4LessThanOrEqualTo(Float value) {
            addCriterion("ch4 <=", value, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4In(List<Float> values) {
            addCriterion("ch4 in", values, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotIn(List<Float> values) {
            addCriterion("ch4 not in", values, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4Between(Float value1, Float value2) {
            addCriterion("ch4 between", value1, value2, "ch4");
            return (Criteria) this;
        }

        public Criteria andCh4NotBetween(Float value1, Float value2) {
            addCriterion("ch4 not between", value1, value2, "ch4");
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

        public Criteria andO2EqualTo(Float value) {
            addCriterion("o2 =", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotEqualTo(Float value) {
            addCriterion("o2 <>", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2GreaterThan(Float value) {
            addCriterion("o2 >", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2GreaterThanOrEqualTo(Float value) {
            addCriterion("o2 >=", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2LessThan(Float value) {
            addCriterion("o2 <", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2LessThanOrEqualTo(Float value) {
            addCriterion("o2 <=", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2In(List<Float> values) {
            addCriterion("o2 in", values, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotIn(List<Float> values) {
            addCriterion("o2 not in", values, "o2");
            return (Criteria) this;
        }

        public Criteria andO2Between(Float value1, Float value2) {
            addCriterion("o2 between", value1, value2, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotBetween(Float value1, Float value2) {
            addCriterion("o2 not between", value1, value2, "o2");
            return (Criteria) this;
        }

        public Criteria andKpaIsNull() {
            addCriterion("kpa is null");
            return (Criteria) this;
        }

        public Criteria andKpaIsNotNull() {
            addCriterion("kpa is not null");
            return (Criteria) this;
        }

        public Criteria andKpaEqualTo(Float value) {
            addCriterion("kpa =", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaNotEqualTo(Float value) {
            addCriterion("kpa <>", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaGreaterThan(Float value) {
            addCriterion("kpa >", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaGreaterThanOrEqualTo(Float value) {
            addCriterion("kpa >=", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaLessThan(Float value) {
            addCriterion("kpa <", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaLessThanOrEqualTo(Float value) {
            addCriterion("kpa <=", value, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaIn(List<Float> values) {
            addCriterion("kpa in", values, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaNotIn(List<Float> values) {
            addCriterion("kpa not in", values, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaBetween(Float value1, Float value2) {
            addCriterion("kpa between", value1, value2, "kpa");
            return (Criteria) this;
        }

        public Criteria andKpaNotBetween(Float value1, Float value2) {
            addCriterion("kpa not between", value1, value2, "kpa");
            return (Criteria) this;
        }

        public Criteria andHzIsNull() {
            addCriterion("hz is null");
            return (Criteria) this;
        }

        public Criteria andHzIsNotNull() {
            addCriterion("hz is not null");
            return (Criteria) this;
        }

        public Criteria andHzEqualTo(Float value) {
            addCriterion("hz =", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzNotEqualTo(Float value) {
            addCriterion("hz <>", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzGreaterThan(Float value) {
            addCriterion("hz >", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzGreaterThanOrEqualTo(Float value) {
            addCriterion("hz >=", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzLessThan(Float value) {
            addCriterion("hz <", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzLessThanOrEqualTo(Float value) {
            addCriterion("hz <=", value, "hz");
            return (Criteria) this;
        }

        public Criteria andHzIn(List<Float> values) {
            addCriterion("hz in", values, "hz");
            return (Criteria) this;
        }

        public Criteria andHzNotIn(List<Float> values) {
            addCriterion("hz not in", values, "hz");
            return (Criteria) this;
        }

        public Criteria andHzBetween(Float value1, Float value2) {
            addCriterion("hz between", value1, value2, "hz");
            return (Criteria) this;
        }

        public Criteria andHzNotBetween(Float value1, Float value2) {
            addCriterion("hz not between", value1, value2, "hz");
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