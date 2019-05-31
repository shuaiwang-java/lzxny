package com.bean;

import java.util.ArrayList;
import java.util.List;

public class YjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjExample() {
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

        public Criteria andYidIsNull() {
            addCriterion("yId is null");
            return (Criteria) this;
        }

        public Criteria andYidIsNotNull() {
            addCriterion("yId is not null");
            return (Criteria) this;
        }

        public Criteria andYidEqualTo(Integer value) {
            addCriterion("yId =", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotEqualTo(Integer value) {
            addCriterion("yId <>", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThan(Integer value) {
            addCriterion("yId >", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yId >=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThan(Integer value) {
            addCriterion("yId <", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThanOrEqualTo(Integer value) {
            addCriterion("yId <=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidIn(List<Integer> values) {
            addCriterion("yId in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotIn(List<Integer> values) {
            addCriterion("yId not in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidBetween(Integer value1, Integer value2) {
            addCriterion("yId between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotBetween(Integer value1, Integer value2) {
            addCriterion("yId not between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("date1 is null");
            return (Criteria) this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("date1 is not null");
            return (Criteria) this;
        }

        public Criteria andDate1EqualTo(String value) {
            addCriterion("date1 =", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotEqualTo(String value) {
            addCriterion("date1 <>", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThan(String value) {
            addCriterion("date1 >", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(String value) {
            addCriterion("date1 >=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThan(String value) {
            addCriterion("date1 <", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThanOrEqualTo(String value) {
            addCriterion("date1 <=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Like(String value) {
            addCriterion("date1 like", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotLike(String value) {
            addCriterion("date1 not like", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1In(List<String> values) {
            addCriterion("date1 in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotIn(List<String> values) {
            addCriterion("date1 not in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Between(String value1, String value2) {
            addCriterion("date1 between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotBetween(String value1, String value2) {
            addCriterion("date1 not between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andTime1IsNull() {
            addCriterion("time1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("time1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(String value) {
            addCriterion("time1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(String value) {
            addCriterion("time1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(String value) {
            addCriterion("time1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(String value) {
            addCriterion("time1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(String value) {
            addCriterion("time1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(String value) {
            addCriterion("time1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Like(String value) {
            addCriterion("time1 like", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotLike(String value) {
            addCriterion("time1 not like", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<String> values) {
            addCriterion("time1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<String> values) {
            addCriterion("time1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(String value1, String value2) {
            addCriterion("time1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(String value1, String value2) {
            addCriterion("time1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("c is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("c is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(Float value) {
            addCriterion("c =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(Float value) {
            addCriterion("c <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(Float value) {
            addCriterion("c >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(Float value) {
            addCriterion("c >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(Float value) {
            addCriterion("c <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(Float value) {
            addCriterion("c <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<Float> values) {
            addCriterion("c in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<Float> values) {
            addCriterion("c not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(Float value1, Float value2) {
            addCriterion("c between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(Float value1, Float value2) {
            addCriterion("c not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andQtIsNull() {
            addCriterion("qt is null");
            return (Criteria) this;
        }

        public Criteria andQtIsNotNull() {
            addCriterion("qt is not null");
            return (Criteria) this;
        }

        public Criteria andQtEqualTo(Float value) {
            addCriterion("qt =", value, "qt");
            return (Criteria) this;
        }

        public Criteria andQtNotEqualTo(Float value) {
            addCriterion("qt <>", value, "qt");
            return (Criteria) this;
        }

        public Criteria andQtGreaterThan(Float value) {
            addCriterion("qt >", value, "qt");
            return (Criteria) this;
        }

        public Criteria andQtGreaterThanOrEqualTo(Float value) {
            addCriterion("qt >=", value, "qt");
            return (Criteria) this;
        }

        public Criteria andQtLessThan(Float value) {
            addCriterion("qt <", value, "qt");
            return (Criteria) this;
        }

        public Criteria andQtLessThanOrEqualTo(Float value) {
            addCriterion("qt <=", value, "qt");
            return (Criteria) this;
        }

        public Criteria andQtIn(List<Float> values) {
            addCriterion("qt in", values, "qt");
            return (Criteria) this;
        }

        public Criteria andQtNotIn(List<Float> values) {
            addCriterion("qt not in", values, "qt");
            return (Criteria) this;
        }

        public Criteria andQtBetween(Float value1, Float value2) {
            addCriterion("qt between", value1, value2, "qt");
            return (Criteria) this;
        }

        public Criteria andQtNotBetween(Float value1, Float value2) {
            addCriterion("qt not between", value1, value2, "qt");
            return (Criteria) this;
        }

        public Criteria andChIsNull() {
            addCriterion("ch is null");
            return (Criteria) this;
        }

        public Criteria andChIsNotNull() {
            addCriterion("ch is not null");
            return (Criteria) this;
        }

        public Criteria andChEqualTo(Float value) {
            addCriterion("ch =", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotEqualTo(Float value) {
            addCriterion("ch <>", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThan(Float value) {
            addCriterion("ch >", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThanOrEqualTo(Float value) {
            addCriterion("ch >=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThan(Float value) {
            addCriterion("ch <", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThanOrEqualTo(Float value) {
            addCriterion("ch <=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChIn(List<Float> values) {
            addCriterion("ch in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotIn(List<Float> values) {
            addCriterion("ch not in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChBetween(Float value1, Float value2) {
            addCriterion("ch between", value1, value2, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotBetween(Float value1, Float value2) {
            addCriterion("ch not between", value1, value2, "ch");
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

        public Criteria andFqIsNull() {
            addCriterion("fq is null");
            return (Criteria) this;
        }

        public Criteria andFqIsNotNull() {
            addCriterion("fq is not null");
            return (Criteria) this;
        }

        public Criteria andFqEqualTo(Float value) {
            addCriterion("fq =", value, "fq");
            return (Criteria) this;
        }

        public Criteria andFqNotEqualTo(Float value) {
            addCriterion("fq <>", value, "fq");
            return (Criteria) this;
        }

        public Criteria andFqGreaterThan(Float value) {
            addCriterion("fq >", value, "fq");
            return (Criteria) this;
        }

        public Criteria andFqGreaterThanOrEqualTo(Float value) {
            addCriterion("fq >=", value, "fq");
            return (Criteria) this;
        }

        public Criteria andFqLessThan(Float value) {
            addCriterion("fq <", value, "fq");
            return (Criteria) this;
        }

        public Criteria andFqLessThanOrEqualTo(Float value) {
            addCriterion("fq <=", value, "fq");
            return (Criteria) this;
        }

        public Criteria andFqIn(List<Float> values) {
            addCriterion("fq in", values, "fq");
            return (Criteria) this;
        }

        public Criteria andFqNotIn(List<Float> values) {
            addCriterion("fq not in", values, "fq");
            return (Criteria) this;
        }

        public Criteria andFqBetween(Float value1, Float value2) {
            addCriterion("fq between", value1, value2, "fq");
            return (Criteria) this;
        }

        public Criteria andFqNotBetween(Float value1, Float value2) {
            addCriterion("fq not between", value1, value2, "fq");
            return (Criteria) this;
        }

        public Criteria andA20IsNull() {
            addCriterion("a_20 is null");
            return (Criteria) this;
        }

        public Criteria andA20IsNotNull() {
            addCriterion("a_20 is not null");
            return (Criteria) this;
        }

        public Criteria andA20EqualTo(Float value) {
            addCriterion("a_20 =", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotEqualTo(Float value) {
            addCriterion("a_20 <>", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20GreaterThan(Float value) {
            addCriterion("a_20 >", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20GreaterThanOrEqualTo(Float value) {
            addCriterion("a_20 >=", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20LessThan(Float value) {
            addCriterion("a_20 <", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20LessThanOrEqualTo(Float value) {
            addCriterion("a_20 <=", value, "a20");
            return (Criteria) this;
        }

        public Criteria andA20In(List<Float> values) {
            addCriterion("a_20 in", values, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotIn(List<Float> values) {
            addCriterion("a_20 not in", values, "a20");
            return (Criteria) this;
        }

        public Criteria andA20Between(Float value1, Float value2) {
            addCriterion("a_20 between", value1, value2, "a20");
            return (Criteria) this;
        }

        public Criteria andA20NotBetween(Float value1, Float value2) {
            addCriterion("a_20 not between", value1, value2, "a20");
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