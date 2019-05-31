package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ytableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ytableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTIsNull() {
            addCriterion("t is null");
            return (Criteria) this;
        }

        public Criteria andTIsNotNull() {
            addCriterion("t is not null");
            return (Criteria) this;
        }

        public Criteria andTEqualTo(Date value) {
            addCriterion("t =", value, "t");
            return (Criteria) this;
        }

        public Criteria andTNotEqualTo(Date value) {
            addCriterion("t <>", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThan(Date value) {
            addCriterion("t >", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThanOrEqualTo(Date value) {
            addCriterion("t >=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThan(Date value) {
            addCriterion("t <", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThanOrEqualTo(Date value) {
            addCriterion("t <=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTIn(List<Date> values) {
            addCriterion("t in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTNotIn(List<Date> values) {
            addCriterion("t not in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTBetween(Date value1, Date value2) {
            addCriterion("t between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andTNotBetween(Date value1, Date value2) {
            addCriterion("t not between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andFIsNull() {
            addCriterion("f is null");
            return (Criteria) this;
        }

        public Criteria andFIsNotNull() {
            addCriterion("f is not null");
            return (Criteria) this;
        }

        public Criteria andFEqualTo(Float value) {
            addCriterion("f =", value, "f");
            return (Criteria) this;
        }

        public Criteria andFNotEqualTo(Float value) {
            addCriterion("f <>", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThan(Float value) {
            addCriterion("f >", value, "f");
            return (Criteria) this;
        }

        public Criteria andFGreaterThanOrEqualTo(Float value) {
            addCriterion("f >=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThan(Float value) {
            addCriterion("f <", value, "f");
            return (Criteria) this;
        }

        public Criteria andFLessThanOrEqualTo(Float value) {
            addCriterion("f <=", value, "f");
            return (Criteria) this;
        }

        public Criteria andFIn(List<Float> values) {
            addCriterion("f in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFNotIn(List<Float> values) {
            addCriterion("f not in", values, "f");
            return (Criteria) this;
        }

        public Criteria andFBetween(Float value1, Float value2) {
            addCriterion("f between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andFNotBetween(Float value1, Float value2) {
            addCriterion("f not between", value1, value2, "f");
            return (Criteria) this;
        }

        public Criteria andA1IsNull() {
            addCriterion("a1 is null");
            return (Criteria) this;
        }

        public Criteria andA1IsNotNull() {
            addCriterion("a1 is not null");
            return (Criteria) this;
        }

        public Criteria andA1EqualTo(Float value) {
            addCriterion("a1 =", value, "a1");
            return (Criteria) this;
        }

        public Criteria andA1NotEqualTo(Float value) {
            addCriterion("a1 <>", value, "a1");
            return (Criteria) this;
        }

        public Criteria andA1GreaterThan(Float value) {
            addCriterion("a1 >", value, "a1");
            return (Criteria) this;
        }

        public Criteria andA1GreaterThanOrEqualTo(Float value) {
            addCriterion("a1 >=", value, "a1");
            return (Criteria) this;
        }

        public Criteria andA1LessThan(Float value) {
            addCriterion("a1 <", value, "a1");
            return (Criteria) this;
        }

        public Criteria andA1LessThanOrEqualTo(Float value) {
            addCriterion("a1 <=", value, "a1");
            return (Criteria) this;
        }

        public Criteria andA1In(List<Float> values) {
            addCriterion("a1 in", values, "a1");
            return (Criteria) this;
        }

        public Criteria andA1NotIn(List<Float> values) {
            addCriterion("a1 not in", values, "a1");
            return (Criteria) this;
        }

        public Criteria andA1Between(Float value1, Float value2) {
            addCriterion("a1 between", value1, value2, "a1");
            return (Criteria) this;
        }

        public Criteria andA1NotBetween(Float value1, Float value2) {
            addCriterion("a1 not between", value1, value2, "a1");
            return (Criteria) this;
        }

        public Criteria andA2IsNull() {
            addCriterion("a2 is null");
            return (Criteria) this;
        }

        public Criteria andA2IsNotNull() {
            addCriterion("a2 is not null");
            return (Criteria) this;
        }

        public Criteria andA2EqualTo(Float value) {
            addCriterion("a2 =", value, "a2");
            return (Criteria) this;
        }

        public Criteria andA2NotEqualTo(Float value) {
            addCriterion("a2 <>", value, "a2");
            return (Criteria) this;
        }

        public Criteria andA2GreaterThan(Float value) {
            addCriterion("a2 >", value, "a2");
            return (Criteria) this;
        }

        public Criteria andA2GreaterThanOrEqualTo(Float value) {
            addCriterion("a2 >=", value, "a2");
            return (Criteria) this;
        }

        public Criteria andA2LessThan(Float value) {
            addCriterion("a2 <", value, "a2");
            return (Criteria) this;
        }

        public Criteria andA2LessThanOrEqualTo(Float value) {
            addCriterion("a2 <=", value, "a2");
            return (Criteria) this;
        }

        public Criteria andA2In(List<Float> values) {
            addCriterion("a2 in", values, "a2");
            return (Criteria) this;
        }

        public Criteria andA2NotIn(List<Float> values) {
            addCriterion("a2 not in", values, "a2");
            return (Criteria) this;
        }

        public Criteria andA2Between(Float value1, Float value2) {
            addCriterion("a2 between", value1, value2, "a2");
            return (Criteria) this;
        }

        public Criteria andA2NotBetween(Float value1, Float value2) {
            addCriterion("a2 not between", value1, value2, "a2");
            return (Criteria) this;
        }

        public Criteria andA3IsNull() {
            addCriterion("a3 is null");
            return (Criteria) this;
        }

        public Criteria andA3IsNotNull() {
            addCriterion("a3 is not null");
            return (Criteria) this;
        }

        public Criteria andA3EqualTo(Float value) {
            addCriterion("a3 =", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotEqualTo(Float value) {
            addCriterion("a3 <>", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3GreaterThan(Float value) {
            addCriterion("a3 >", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3GreaterThanOrEqualTo(Float value) {
            addCriterion("a3 >=", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3LessThan(Float value) {
            addCriterion("a3 <", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3LessThanOrEqualTo(Float value) {
            addCriterion("a3 <=", value, "a3");
            return (Criteria) this;
        }

        public Criteria andA3In(List<Float> values) {
            addCriterion("a3 in", values, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotIn(List<Float> values) {
            addCriterion("a3 not in", values, "a3");
            return (Criteria) this;
        }

        public Criteria andA3Between(Float value1, Float value2) {
            addCriterion("a3 between", value1, value2, "a3");
            return (Criteria) this;
        }

        public Criteria andA3NotBetween(Float value1, Float value2) {
            addCriterion("a3 not between", value1, value2, "a3");
            return (Criteria) this;
        }

        public Criteria andA4IsNull() {
            addCriterion("a4 is null");
            return (Criteria) this;
        }

        public Criteria andA4IsNotNull() {
            addCriterion("a4 is not null");
            return (Criteria) this;
        }

        public Criteria andA4EqualTo(Float value) {
            addCriterion("a4 =", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotEqualTo(Float value) {
            addCriterion("a4 <>", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4GreaterThan(Float value) {
            addCriterion("a4 >", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4GreaterThanOrEqualTo(Float value) {
            addCriterion("a4 >=", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4LessThan(Float value) {
            addCriterion("a4 <", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4LessThanOrEqualTo(Float value) {
            addCriterion("a4 <=", value, "a4");
            return (Criteria) this;
        }

        public Criteria andA4In(List<Float> values) {
            addCriterion("a4 in", values, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotIn(List<Float> values) {
            addCriterion("a4 not in", values, "a4");
            return (Criteria) this;
        }

        public Criteria andA4Between(Float value1, Float value2) {
            addCriterion("a4 between", value1, value2, "a4");
            return (Criteria) this;
        }

        public Criteria andA4NotBetween(Float value1, Float value2) {
            addCriterion("a4 not between", value1, value2, "a4");
            return (Criteria) this;
        }

        public Criteria andA5IsNull() {
            addCriterion("a5 is null");
            return (Criteria) this;
        }

        public Criteria andA5IsNotNull() {
            addCriterion("a5 is not null");
            return (Criteria) this;
        }

        public Criteria andA5EqualTo(Float value) {
            addCriterion("a5 =", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotEqualTo(Float value) {
            addCriterion("a5 <>", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5GreaterThan(Float value) {
            addCriterion("a5 >", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5GreaterThanOrEqualTo(Float value) {
            addCriterion("a5 >=", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5LessThan(Float value) {
            addCriterion("a5 <", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5LessThanOrEqualTo(Float value) {
            addCriterion("a5 <=", value, "a5");
            return (Criteria) this;
        }

        public Criteria andA5In(List<Float> values) {
            addCriterion("a5 in", values, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotIn(List<Float> values) {
            addCriterion("a5 not in", values, "a5");
            return (Criteria) this;
        }

        public Criteria andA5Between(Float value1, Float value2) {
            addCriterion("a5 between", value1, value2, "a5");
            return (Criteria) this;
        }

        public Criteria andA5NotBetween(Float value1, Float value2) {
            addCriterion("a5 not between", value1, value2, "a5");
            return (Criteria) this;
        }

        public Criteria andA6IsNull() {
            addCriterion("a6 is null");
            return (Criteria) this;
        }

        public Criteria andA6IsNotNull() {
            addCriterion("a6 is not null");
            return (Criteria) this;
        }

        public Criteria andA6EqualTo(Float value) {
            addCriterion("a6 =", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotEqualTo(Float value) {
            addCriterion("a6 <>", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6GreaterThan(Float value) {
            addCriterion("a6 >", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6GreaterThanOrEqualTo(Float value) {
            addCriterion("a6 >=", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6LessThan(Float value) {
            addCriterion("a6 <", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6LessThanOrEqualTo(Float value) {
            addCriterion("a6 <=", value, "a6");
            return (Criteria) this;
        }

        public Criteria andA6In(List<Float> values) {
            addCriterion("a6 in", values, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotIn(List<Float> values) {
            addCriterion("a6 not in", values, "a6");
            return (Criteria) this;
        }

        public Criteria andA6Between(Float value1, Float value2) {
            addCriterion("a6 between", value1, value2, "a6");
            return (Criteria) this;
        }

        public Criteria andA6NotBetween(Float value1, Float value2) {
            addCriterion("a6 not between", value1, value2, "a6");
            return (Criteria) this;
        }

        public Criteria andA7IsNull() {
            addCriterion("a7 is null");
            return (Criteria) this;
        }

        public Criteria andA7IsNotNull() {
            addCriterion("a7 is not null");
            return (Criteria) this;
        }

        public Criteria andA7EqualTo(Float value) {
            addCriterion("a7 =", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotEqualTo(Float value) {
            addCriterion("a7 <>", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7GreaterThan(Float value) {
            addCriterion("a7 >", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7GreaterThanOrEqualTo(Float value) {
            addCriterion("a7 >=", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7LessThan(Float value) {
            addCriterion("a7 <", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7LessThanOrEqualTo(Float value) {
            addCriterion("a7 <=", value, "a7");
            return (Criteria) this;
        }

        public Criteria andA7In(List<Float> values) {
            addCriterion("a7 in", values, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotIn(List<Float> values) {
            addCriterion("a7 not in", values, "a7");
            return (Criteria) this;
        }

        public Criteria andA7Between(Float value1, Float value2) {
            addCriterion("a7 between", value1, value2, "a7");
            return (Criteria) this;
        }

        public Criteria andA7NotBetween(Float value1, Float value2) {
            addCriterion("a7 not between", value1, value2, "a7");
            return (Criteria) this;
        }

        public Criteria andA8IsNull() {
            addCriterion("a8 is null");
            return (Criteria) this;
        }

        public Criteria andA8IsNotNull() {
            addCriterion("a8 is not null");
            return (Criteria) this;
        }

        public Criteria andA8EqualTo(Float value) {
            addCriterion("a8 =", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotEqualTo(Float value) {
            addCriterion("a8 <>", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8GreaterThan(Float value) {
            addCriterion("a8 >", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8GreaterThanOrEqualTo(Float value) {
            addCriterion("a8 >=", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8LessThan(Float value) {
            addCriterion("a8 <", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8LessThanOrEqualTo(Float value) {
            addCriterion("a8 <=", value, "a8");
            return (Criteria) this;
        }

        public Criteria andA8In(List<Float> values) {
            addCriterion("a8 in", values, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotIn(List<Float> values) {
            addCriterion("a8 not in", values, "a8");
            return (Criteria) this;
        }

        public Criteria andA8Between(Float value1, Float value2) {
            addCriterion("a8 between", value1, value2, "a8");
            return (Criteria) this;
        }

        public Criteria andA8NotBetween(Float value1, Float value2) {
            addCriterion("a8 not between", value1, value2, "a8");
            return (Criteria) this;
        }

        public Criteria andB1IsNull() {
            addCriterion("b1 is null");
            return (Criteria) this;
        }

        public Criteria andB1IsNotNull() {
            addCriterion("b1 is not null");
            return (Criteria) this;
        }

        public Criteria andB1EqualTo(Float value) {
            addCriterion("b1 =", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotEqualTo(Float value) {
            addCriterion("b1 <>", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThan(Float value) {
            addCriterion("b1 >", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThanOrEqualTo(Float value) {
            addCriterion("b1 >=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThan(Float value) {
            addCriterion("b1 <", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThanOrEqualTo(Float value) {
            addCriterion("b1 <=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1In(List<Float> values) {
            addCriterion("b1 in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotIn(List<Float> values) {
            addCriterion("b1 not in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1Between(Float value1, Float value2) {
            addCriterion("b1 between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotBetween(Float value1, Float value2) {
            addCriterion("b1 not between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB2IsNull() {
            addCriterion("b2 is null");
            return (Criteria) this;
        }

        public Criteria andB2IsNotNull() {
            addCriterion("b2 is not null");
            return (Criteria) this;
        }

        public Criteria andB2EqualTo(Float value) {
            addCriterion("b2 =", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotEqualTo(Float value) {
            addCriterion("b2 <>", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2GreaterThan(Float value) {
            addCriterion("b2 >", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2GreaterThanOrEqualTo(Float value) {
            addCriterion("b2 >=", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2LessThan(Float value) {
            addCriterion("b2 <", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2LessThanOrEqualTo(Float value) {
            addCriterion("b2 <=", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2In(List<Float> values) {
            addCriterion("b2 in", values, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotIn(List<Float> values) {
            addCriterion("b2 not in", values, "b2");
            return (Criteria) this;
        }

        public Criteria andB2Between(Float value1, Float value2) {
            addCriterion("b2 between", value1, value2, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotBetween(Float value1, Float value2) {
            addCriterion("b2 not between", value1, value2, "b2");
            return (Criteria) this;
        }

        public Criteria andB3IsNull() {
            addCriterion("b3 is null");
            return (Criteria) this;
        }

        public Criteria andB3IsNotNull() {
            addCriterion("b3 is not null");
            return (Criteria) this;
        }

        public Criteria andB3EqualTo(Float value) {
            addCriterion("b3 =", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotEqualTo(Float value) {
            addCriterion("b3 <>", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3GreaterThan(Float value) {
            addCriterion("b3 >", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3GreaterThanOrEqualTo(Float value) {
            addCriterion("b3 >=", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3LessThan(Float value) {
            addCriterion("b3 <", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3LessThanOrEqualTo(Float value) {
            addCriterion("b3 <=", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3In(List<Float> values) {
            addCriterion("b3 in", values, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotIn(List<Float> values) {
            addCriterion("b3 not in", values, "b3");
            return (Criteria) this;
        }

        public Criteria andB3Between(Float value1, Float value2) {
            addCriterion("b3 between", value1, value2, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotBetween(Float value1, Float value2) {
            addCriterion("b3 not between", value1, value2, "b3");
            return (Criteria) this;
        }

        public Criteria andB4IsNull() {
            addCriterion("b4 is null");
            return (Criteria) this;
        }

        public Criteria andB4IsNotNull() {
            addCriterion("b4 is not null");
            return (Criteria) this;
        }

        public Criteria andB4EqualTo(Float value) {
            addCriterion("b4 =", value, "b4");
            return (Criteria) this;
        }

        public Criteria andB4NotEqualTo(Float value) {
            addCriterion("b4 <>", value, "b4");
            return (Criteria) this;
        }

        public Criteria andB4GreaterThan(Float value) {
            addCriterion("b4 >", value, "b4");
            return (Criteria) this;
        }

        public Criteria andB4GreaterThanOrEqualTo(Float value) {
            addCriterion("b4 >=", value, "b4");
            return (Criteria) this;
        }

        public Criteria andB4LessThan(Float value) {
            addCriterion("b4 <", value, "b4");
            return (Criteria) this;
        }

        public Criteria andB4LessThanOrEqualTo(Float value) {
            addCriterion("b4 <=", value, "b4");
            return (Criteria) this;
        }

        public Criteria andB4In(List<Float> values) {
            addCriterion("b4 in", values, "b4");
            return (Criteria) this;
        }

        public Criteria andB4NotIn(List<Float> values) {
            addCriterion("b4 not in", values, "b4");
            return (Criteria) this;
        }

        public Criteria andB4Between(Float value1, Float value2) {
            addCriterion("b4 between", value1, value2, "b4");
            return (Criteria) this;
        }

        public Criteria andB4NotBetween(Float value1, Float value2) {
            addCriterion("b4 not between", value1, value2, "b4");
            return (Criteria) this;
        }

        public Criteria andB5IsNull() {
            addCriterion("b5 is null");
            return (Criteria) this;
        }

        public Criteria andB5IsNotNull() {
            addCriterion("b5 is not null");
            return (Criteria) this;
        }

        public Criteria andB5EqualTo(Float value) {
            addCriterion("b5 =", value, "b5");
            return (Criteria) this;
        }

        public Criteria andB5NotEqualTo(Float value) {
            addCriterion("b5 <>", value, "b5");
            return (Criteria) this;
        }

        public Criteria andB5GreaterThan(Float value) {
            addCriterion("b5 >", value, "b5");
            return (Criteria) this;
        }

        public Criteria andB5GreaterThanOrEqualTo(Float value) {
            addCriterion("b5 >=", value, "b5");
            return (Criteria) this;
        }

        public Criteria andB5LessThan(Float value) {
            addCriterion("b5 <", value, "b5");
            return (Criteria) this;
        }

        public Criteria andB5LessThanOrEqualTo(Float value) {
            addCriterion("b5 <=", value, "b5");
            return (Criteria) this;
        }

        public Criteria andB5In(List<Float> values) {
            addCriterion("b5 in", values, "b5");
            return (Criteria) this;
        }

        public Criteria andB5NotIn(List<Float> values) {
            addCriterion("b5 not in", values, "b5");
            return (Criteria) this;
        }

        public Criteria andB5Between(Float value1, Float value2) {
            addCriterion("b5 between", value1, value2, "b5");
            return (Criteria) this;
        }

        public Criteria andB5NotBetween(Float value1, Float value2) {
            addCriterion("b5 not between", value1, value2, "b5");
            return (Criteria) this;
        }

        public Criteria andB6IsNull() {
            addCriterion("b6 is null");
            return (Criteria) this;
        }

        public Criteria andB6IsNotNull() {
            addCriterion("b6 is not null");
            return (Criteria) this;
        }

        public Criteria andB6EqualTo(Float value) {
            addCriterion("b6 =", value, "b6");
            return (Criteria) this;
        }

        public Criteria andB6NotEqualTo(Float value) {
            addCriterion("b6 <>", value, "b6");
            return (Criteria) this;
        }

        public Criteria andB6GreaterThan(Float value) {
            addCriterion("b6 >", value, "b6");
            return (Criteria) this;
        }

        public Criteria andB6GreaterThanOrEqualTo(Float value) {
            addCriterion("b6 >=", value, "b6");
            return (Criteria) this;
        }

        public Criteria andB6LessThan(Float value) {
            addCriterion("b6 <", value, "b6");
            return (Criteria) this;
        }

        public Criteria andB6LessThanOrEqualTo(Float value) {
            addCriterion("b6 <=", value, "b6");
            return (Criteria) this;
        }

        public Criteria andB6In(List<Float> values) {
            addCriterion("b6 in", values, "b6");
            return (Criteria) this;
        }

        public Criteria andB6NotIn(List<Float> values) {
            addCriterion("b6 not in", values, "b6");
            return (Criteria) this;
        }

        public Criteria andB6Between(Float value1, Float value2) {
            addCriterion("b6 between", value1, value2, "b6");
            return (Criteria) this;
        }

        public Criteria andB6NotBetween(Float value1, Float value2) {
            addCriterion("b6 not between", value1, value2, "b6");
            return (Criteria) this;
        }

        public Criteria andB7IsNull() {
            addCriterion("b7 is null");
            return (Criteria) this;
        }

        public Criteria andB7IsNotNull() {
            addCriterion("b7 is not null");
            return (Criteria) this;
        }

        public Criteria andB7EqualTo(Float value) {
            addCriterion("b7 =", value, "b7");
            return (Criteria) this;
        }

        public Criteria andB7NotEqualTo(Float value) {
            addCriterion("b7 <>", value, "b7");
            return (Criteria) this;
        }

        public Criteria andB7GreaterThan(Float value) {
            addCriterion("b7 >", value, "b7");
            return (Criteria) this;
        }

        public Criteria andB7GreaterThanOrEqualTo(Float value) {
            addCriterion("b7 >=", value, "b7");
            return (Criteria) this;
        }

        public Criteria andB7LessThan(Float value) {
            addCriterion("b7 <", value, "b7");
            return (Criteria) this;
        }

        public Criteria andB7LessThanOrEqualTo(Float value) {
            addCriterion("b7 <=", value, "b7");
            return (Criteria) this;
        }

        public Criteria andB7In(List<Float> values) {
            addCriterion("b7 in", values, "b7");
            return (Criteria) this;
        }

        public Criteria andB7NotIn(List<Float> values) {
            addCriterion("b7 not in", values, "b7");
            return (Criteria) this;
        }

        public Criteria andB7Between(Float value1, Float value2) {
            addCriterion("b7 between", value1, value2, "b7");
            return (Criteria) this;
        }

        public Criteria andB7NotBetween(Float value1, Float value2) {
            addCriterion("b7 not between", value1, value2, "b7");
            return (Criteria) this;
        }

        public Criteria andB8IsNull() {
            addCriterion("b8 is null");
            return (Criteria) this;
        }

        public Criteria andB8IsNotNull() {
            addCriterion("b8 is not null");
            return (Criteria) this;
        }

        public Criteria andB8EqualTo(Float value) {
            addCriterion("b8 =", value, "b8");
            return (Criteria) this;
        }

        public Criteria andB8NotEqualTo(Float value) {
            addCriterion("b8 <>", value, "b8");
            return (Criteria) this;
        }

        public Criteria andB8GreaterThan(Float value) {
            addCriterion("b8 >", value, "b8");
            return (Criteria) this;
        }

        public Criteria andB8GreaterThanOrEqualTo(Float value) {
            addCriterion("b8 >=", value, "b8");
            return (Criteria) this;
        }

        public Criteria andB8LessThan(Float value) {
            addCriterion("b8 <", value, "b8");
            return (Criteria) this;
        }

        public Criteria andB8LessThanOrEqualTo(Float value) {
            addCriterion("b8 <=", value, "b8");
            return (Criteria) this;
        }

        public Criteria andB8In(List<Float> values) {
            addCriterion("b8 in", values, "b8");
            return (Criteria) this;
        }

        public Criteria andB8NotIn(List<Float> values) {
            addCriterion("b8 not in", values, "b8");
            return (Criteria) this;
        }

        public Criteria andB8Between(Float value1, Float value2) {
            addCriterion("b8 between", value1, value2, "b8");
            return (Criteria) this;
        }

        public Criteria andB8NotBetween(Float value1, Float value2) {
            addCriterion("b8 not between", value1, value2, "b8");
            return (Criteria) this;
        }

        public Criteria andHIsNull() {
            addCriterion("h is null");
            return (Criteria) this;
        }

        public Criteria andHIsNotNull() {
            addCriterion("h is not null");
            return (Criteria) this;
        }

        public Criteria andHEqualTo(Float value) {
            addCriterion("h =", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotEqualTo(Float value) {
            addCriterion("h <>", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThan(Float value) {
            addCriterion("h >", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThanOrEqualTo(Float value) {
            addCriterion("h >=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThan(Float value) {
            addCriterion("h <", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThanOrEqualTo(Float value) {
            addCriterion("h <=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHIn(List<Float> values) {
            addCriterion("h in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHNotIn(List<Float> values) {
            addCriterion("h not in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHBetween(Float value1, Float value2) {
            addCriterion("h between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andHNotBetween(Float value1, Float value2) {
            addCriterion("h not between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andOIsNull() {
            addCriterion("o is null");
            return (Criteria) this;
        }

        public Criteria andOIsNotNull() {
            addCriterion("o is not null");
            return (Criteria) this;
        }

        public Criteria andOEqualTo(Float value) {
            addCriterion("o =", value, "o");
            return (Criteria) this;
        }

        public Criteria andONotEqualTo(Float value) {
            addCriterion("o <>", value, "o");
            return (Criteria) this;
        }

        public Criteria andOGreaterThan(Float value) {
            addCriterion("o >", value, "o");
            return (Criteria) this;
        }

        public Criteria andOGreaterThanOrEqualTo(Float value) {
            addCriterion("o >=", value, "o");
            return (Criteria) this;
        }

        public Criteria andOLessThan(Float value) {
            addCriterion("o <", value, "o");
            return (Criteria) this;
        }

        public Criteria andOLessThanOrEqualTo(Float value) {
            addCriterion("o <=", value, "o");
            return (Criteria) this;
        }

        public Criteria andOIn(List<Float> values) {
            addCriterion("o in", values, "o");
            return (Criteria) this;
        }

        public Criteria andONotIn(List<Float> values) {
            addCriterion("o not in", values, "o");
            return (Criteria) this;
        }

        public Criteria andOBetween(Float value1, Float value2) {
            addCriterion("o between", value1, value2, "o");
            return (Criteria) this;
        }

        public Criteria andONotBetween(Float value1, Float value2) {
            addCriterion("o not between", value1, value2, "o");
            return (Criteria) this;
        }

        public Criteria andDsumIsNull() {
            addCriterion("dsum is null");
            return (Criteria) this;
        }

        public Criteria andDsumIsNotNull() {
            addCriterion("dsum is not null");
            return (Criteria) this;
        }

        public Criteria andDsumEqualTo(Float value) {
            addCriterion("dsum =", value, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumNotEqualTo(Float value) {
            addCriterion("dsum <>", value, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumGreaterThan(Float value) {
            addCriterion("dsum >", value, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumGreaterThanOrEqualTo(Float value) {
            addCriterion("dsum >=", value, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumLessThan(Float value) {
            addCriterion("dsum <", value, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumLessThanOrEqualTo(Float value) {
            addCriterion("dsum <=", value, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumIn(List<Float> values) {
            addCriterion("dsum in", values, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumNotIn(List<Float> values) {
            addCriterion("dsum not in", values, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumBetween(Float value1, Float value2) {
            addCriterion("dsum between", value1, value2, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumNotBetween(Float value1, Float value2) {
            addCriterion("dsum not between", value1, value2, "dsum");
            return (Criteria) this;
        }

        public Criteria andDsumsIsNull() {
            addCriterion("dsums is null");
            return (Criteria) this;
        }

        public Criteria andDsumsIsNotNull() {
            addCriterion("dsums is not null");
            return (Criteria) this;
        }

        public Criteria andDsumsEqualTo(Float value) {
            addCriterion("dsums =", value, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsNotEqualTo(Float value) {
            addCriterion("dsums <>", value, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsGreaterThan(Float value) {
            addCriterion("dsums >", value, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsGreaterThanOrEqualTo(Float value) {
            addCriterion("dsums >=", value, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsLessThan(Float value) {
            addCriterion("dsums <", value, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsLessThanOrEqualTo(Float value) {
            addCriterion("dsums <=", value, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsIn(List<Float> values) {
            addCriterion("dsums in", values, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsNotIn(List<Float> values) {
            addCriterion("dsums not in", values, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsBetween(Float value1, Float value2) {
            addCriterion("dsums between", value1, value2, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumsNotBetween(Float value1, Float value2) {
            addCriterion("dsums not between", value1, value2, "dsums");
            return (Criteria) this;
        }

        public Criteria andDsumlIsNull() {
            addCriterion("dsuml is null");
            return (Criteria) this;
        }

        public Criteria andDsumlIsNotNull() {
            addCriterion("dsuml is not null");
            return (Criteria) this;
        }

        public Criteria andDsumlEqualTo(Float value) {
            addCriterion("dsuml =", value, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlNotEqualTo(Float value) {
            addCriterion("dsuml <>", value, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlGreaterThan(Float value) {
            addCriterion("dsuml >", value, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlGreaterThanOrEqualTo(Float value) {
            addCriterion("dsuml >=", value, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlLessThan(Float value) {
            addCriterion("dsuml <", value, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlLessThanOrEqualTo(Float value) {
            addCriterion("dsuml <=", value, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlIn(List<Float> values) {
            addCriterion("dsuml in", values, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlNotIn(List<Float> values) {
            addCriterion("dsuml not in", values, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlBetween(Float value1, Float value2) {
            addCriterion("dsuml between", value1, value2, "dsuml");
            return (Criteria) this;
        }

        public Criteria andDsumlNotBetween(Float value1, Float value2) {
            addCriterion("dsuml not between", value1, value2, "dsuml");
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