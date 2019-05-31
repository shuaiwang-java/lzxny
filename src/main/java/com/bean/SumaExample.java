package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SumaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SumaExample() {
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

        public Criteria andA129IsNull() {
            addCriterion("a129 is null");
            return (Criteria) this;
        }

        public Criteria andA129IsNotNull() {
            addCriterion("a129 is not null");
            return (Criteria) this;
        }

        public Criteria andA129EqualTo(Float value) {
            addCriterion("a129 =", value, "a129");
            return (Criteria) this;
        }

        public Criteria andA129NotEqualTo(Float value) {
            addCriterion("a129 <>", value, "a129");
            return (Criteria) this;
        }

        public Criteria andA129GreaterThan(Float value) {
            addCriterion("a129 >", value, "a129");
            return (Criteria) this;
        }

        public Criteria andA129GreaterThanOrEqualTo(Float value) {
            addCriterion("a129 >=", value, "a129");
            return (Criteria) this;
        }

        public Criteria andA129LessThan(Float value) {
            addCriterion("a129 <", value, "a129");
            return (Criteria) this;
        }

        public Criteria andA129LessThanOrEqualTo(Float value) {
            addCriterion("a129 <=", value, "a129");
            return (Criteria) this;
        }

        public Criteria andA129In(List<Float> values) {
            addCriterion("a129 in", values, "a129");
            return (Criteria) this;
        }

        public Criteria andA129NotIn(List<Float> values) {
            addCriterion("a129 not in", values, "a129");
            return (Criteria) this;
        }

        public Criteria andA129Between(Float value1, Float value2) {
            addCriterion("a129 between", value1, value2, "a129");
            return (Criteria) this;
        }

        public Criteria andA129NotBetween(Float value1, Float value2) {
            addCriterion("a129 not between", value1, value2, "a129");
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

        public Criteria andA132IsNull() {
            addCriterion("a132 is null");
            return (Criteria) this;
        }

        public Criteria andA132IsNotNull() {
            addCriterion("a132 is not null");
            return (Criteria) this;
        }

        public Criteria andA132EqualTo(Float value) {
            addCriterion("a132 =", value, "a132");
            return (Criteria) this;
        }

        public Criteria andA132NotEqualTo(Float value) {
            addCriterion("a132 <>", value, "a132");
            return (Criteria) this;
        }

        public Criteria andA132GreaterThan(Float value) {
            addCriterion("a132 >", value, "a132");
            return (Criteria) this;
        }

        public Criteria andA132GreaterThanOrEqualTo(Float value) {
            addCriterion("a132 >=", value, "a132");
            return (Criteria) this;
        }

        public Criteria andA132LessThan(Float value) {
            addCriterion("a132 <", value, "a132");
            return (Criteria) this;
        }

        public Criteria andA132LessThanOrEqualTo(Float value) {
            addCriterion("a132 <=", value, "a132");
            return (Criteria) this;
        }

        public Criteria andA132In(List<Float> values) {
            addCriterion("a132 in", values, "a132");
            return (Criteria) this;
        }

        public Criteria andA132NotIn(List<Float> values) {
            addCriterion("a132 not in", values, "a132");
            return (Criteria) this;
        }

        public Criteria andA132Between(Float value1, Float value2) {
            addCriterion("a132 between", value1, value2, "a132");
            return (Criteria) this;
        }

        public Criteria andA132NotBetween(Float value1, Float value2) {
            addCriterion("a132 not between", value1, value2, "a132");
            return (Criteria) this;
        }

        public Criteria andA133IsNull() {
            addCriterion("a133 is null");
            return (Criteria) this;
        }

        public Criteria andA133IsNotNull() {
            addCriterion("a133 is not null");
            return (Criteria) this;
        }

        public Criteria andA133EqualTo(Float value) {
            addCriterion("a133 =", value, "a133");
            return (Criteria) this;
        }

        public Criteria andA133NotEqualTo(Float value) {
            addCriterion("a133 <>", value, "a133");
            return (Criteria) this;
        }

        public Criteria andA133GreaterThan(Float value) {
            addCriterion("a133 >", value, "a133");
            return (Criteria) this;
        }

        public Criteria andA133GreaterThanOrEqualTo(Float value) {
            addCriterion("a133 >=", value, "a133");
            return (Criteria) this;
        }

        public Criteria andA133LessThan(Float value) {
            addCriterion("a133 <", value, "a133");
            return (Criteria) this;
        }

        public Criteria andA133LessThanOrEqualTo(Float value) {
            addCriterion("a133 <=", value, "a133");
            return (Criteria) this;
        }

        public Criteria andA133In(List<Float> values) {
            addCriterion("a133 in", values, "a133");
            return (Criteria) this;
        }

        public Criteria andA133NotIn(List<Float> values) {
            addCriterion("a133 not in", values, "a133");
            return (Criteria) this;
        }

        public Criteria andA133Between(Float value1, Float value2) {
            addCriterion("a133 between", value1, value2, "a133");
            return (Criteria) this;
        }

        public Criteria andA133NotBetween(Float value1, Float value2) {
            addCriterion("a133 not between", value1, value2, "a133");
            return (Criteria) this;
        }

        public Criteria andA53IsNull() {
            addCriterion("a53 is null");
            return (Criteria) this;
        }

        public Criteria andA53IsNotNull() {
            addCriterion("a53 is not null");
            return (Criteria) this;
        }

        public Criteria andA53EqualTo(Float value) {
            addCriterion("a53 =", value, "a53");
            return (Criteria) this;
        }

        public Criteria andA53NotEqualTo(Float value) {
            addCriterion("a53 <>", value, "a53");
            return (Criteria) this;
        }

        public Criteria andA53GreaterThan(Float value) {
            addCriterion("a53 >", value, "a53");
            return (Criteria) this;
        }

        public Criteria andA53GreaterThanOrEqualTo(Float value) {
            addCriterion("a53 >=", value, "a53");
            return (Criteria) this;
        }

        public Criteria andA53LessThan(Float value) {
            addCriterion("a53 <", value, "a53");
            return (Criteria) this;
        }

        public Criteria andA53LessThanOrEqualTo(Float value) {
            addCriterion("a53 <=", value, "a53");
            return (Criteria) this;
        }

        public Criteria andA53In(List<Float> values) {
            addCriterion("a53 in", values, "a53");
            return (Criteria) this;
        }

        public Criteria andA53NotIn(List<Float> values) {
            addCriterion("a53 not in", values, "a53");
            return (Criteria) this;
        }

        public Criteria andA53Between(Float value1, Float value2) {
            addCriterion("a53 between", value1, value2, "a53");
            return (Criteria) this;
        }

        public Criteria andA53NotBetween(Float value1, Float value2) {
            addCriterion("a53 not between", value1, value2, "a53");
            return (Criteria) this;
        }

        public Criteria andA54IsNull() {
            addCriterion("a54 is null");
            return (Criteria) this;
        }

        public Criteria andA54IsNotNull() {
            addCriterion("a54 is not null");
            return (Criteria) this;
        }

        public Criteria andA54EqualTo(Float value) {
            addCriterion("a54 =", value, "a54");
            return (Criteria) this;
        }

        public Criteria andA54NotEqualTo(Float value) {
            addCriterion("a54 <>", value, "a54");
            return (Criteria) this;
        }

        public Criteria andA54GreaterThan(Float value) {
            addCriterion("a54 >", value, "a54");
            return (Criteria) this;
        }

        public Criteria andA54GreaterThanOrEqualTo(Float value) {
            addCriterion("a54 >=", value, "a54");
            return (Criteria) this;
        }

        public Criteria andA54LessThan(Float value) {
            addCriterion("a54 <", value, "a54");
            return (Criteria) this;
        }

        public Criteria andA54LessThanOrEqualTo(Float value) {
            addCriterion("a54 <=", value, "a54");
            return (Criteria) this;
        }

        public Criteria andA54In(List<Float> values) {
            addCriterion("a54 in", values, "a54");
            return (Criteria) this;
        }

        public Criteria andA54NotIn(List<Float> values) {
            addCriterion("a54 not in", values, "a54");
            return (Criteria) this;
        }

        public Criteria andA54Between(Float value1, Float value2) {
            addCriterion("a54 between", value1, value2, "a54");
            return (Criteria) this;
        }

        public Criteria andA54NotBetween(Float value1, Float value2) {
            addCriterion("a54 not between", value1, value2, "a54");
            return (Criteria) this;
        }

        public Criteria andA55IsNull() {
            addCriterion("a55 is null");
            return (Criteria) this;
        }

        public Criteria andA55IsNotNull() {
            addCriterion("a55 is not null");
            return (Criteria) this;
        }

        public Criteria andA55EqualTo(Float value) {
            addCriterion("a55 =", value, "a55");
            return (Criteria) this;
        }

        public Criteria andA55NotEqualTo(Float value) {
            addCriterion("a55 <>", value, "a55");
            return (Criteria) this;
        }

        public Criteria andA55GreaterThan(Float value) {
            addCriterion("a55 >", value, "a55");
            return (Criteria) this;
        }

        public Criteria andA55GreaterThanOrEqualTo(Float value) {
            addCriterion("a55 >=", value, "a55");
            return (Criteria) this;
        }

        public Criteria andA55LessThan(Float value) {
            addCriterion("a55 <", value, "a55");
            return (Criteria) this;
        }

        public Criteria andA55LessThanOrEqualTo(Float value) {
            addCriterion("a55 <=", value, "a55");
            return (Criteria) this;
        }

        public Criteria andA55In(List<Float> values) {
            addCriterion("a55 in", values, "a55");
            return (Criteria) this;
        }

        public Criteria andA55NotIn(List<Float> values) {
            addCriterion("a55 not in", values, "a55");
            return (Criteria) this;
        }

        public Criteria andA55Between(Float value1, Float value2) {
            addCriterion("a55 between", value1, value2, "a55");
            return (Criteria) this;
        }

        public Criteria andA55NotBetween(Float value1, Float value2) {
            addCriterion("a55 not between", value1, value2, "a55");
            return (Criteria) this;
        }

        public Criteria andA56IsNull() {
            addCriterion("a56 is null");
            return (Criteria) this;
        }

        public Criteria andA56IsNotNull() {
            addCriterion("a56 is not null");
            return (Criteria) this;
        }

        public Criteria andA56EqualTo(Float value) {
            addCriterion("a56 =", value, "a56");
            return (Criteria) this;
        }

        public Criteria andA56NotEqualTo(Float value) {
            addCriterion("a56 <>", value, "a56");
            return (Criteria) this;
        }

        public Criteria andA56GreaterThan(Float value) {
            addCriterion("a56 >", value, "a56");
            return (Criteria) this;
        }

        public Criteria andA56GreaterThanOrEqualTo(Float value) {
            addCriterion("a56 >=", value, "a56");
            return (Criteria) this;
        }

        public Criteria andA56LessThan(Float value) {
            addCriterion("a56 <", value, "a56");
            return (Criteria) this;
        }

        public Criteria andA56LessThanOrEqualTo(Float value) {
            addCriterion("a56 <=", value, "a56");
            return (Criteria) this;
        }

        public Criteria andA56In(List<Float> values) {
            addCriterion("a56 in", values, "a56");
            return (Criteria) this;
        }

        public Criteria andA56NotIn(List<Float> values) {
            addCriterion("a56 not in", values, "a56");
            return (Criteria) this;
        }

        public Criteria andA56Between(Float value1, Float value2) {
            addCriterion("a56 between", value1, value2, "a56");
            return (Criteria) this;
        }

        public Criteria andA56NotBetween(Float value1, Float value2) {
            addCriterion("a56 not between", value1, value2, "a56");
            return (Criteria) this;
        }

        public Criteria andA57IsNull() {
            addCriterion("a57 is null");
            return (Criteria) this;
        }

        public Criteria andA57IsNotNull() {
            addCriterion("a57 is not null");
            return (Criteria) this;
        }

        public Criteria andA57EqualTo(Float value) {
            addCriterion("a57 =", value, "a57");
            return (Criteria) this;
        }

        public Criteria andA57NotEqualTo(Float value) {
            addCriterion("a57 <>", value, "a57");
            return (Criteria) this;
        }

        public Criteria andA57GreaterThan(Float value) {
            addCriterion("a57 >", value, "a57");
            return (Criteria) this;
        }

        public Criteria andA57GreaterThanOrEqualTo(Float value) {
            addCriterion("a57 >=", value, "a57");
            return (Criteria) this;
        }

        public Criteria andA57LessThan(Float value) {
            addCriterion("a57 <", value, "a57");
            return (Criteria) this;
        }

        public Criteria andA57LessThanOrEqualTo(Float value) {
            addCriterion("a57 <=", value, "a57");
            return (Criteria) this;
        }

        public Criteria andA57In(List<Float> values) {
            addCriterion("a57 in", values, "a57");
            return (Criteria) this;
        }

        public Criteria andA57NotIn(List<Float> values) {
            addCriterion("a57 not in", values, "a57");
            return (Criteria) this;
        }

        public Criteria andA57Between(Float value1, Float value2) {
            addCriterion("a57 between", value1, value2, "a57");
            return (Criteria) this;
        }

        public Criteria andA57NotBetween(Float value1, Float value2) {
            addCriterion("a57 not between", value1, value2, "a57");
            return (Criteria) this;
        }

        public Criteria andA58IsNull() {
            addCriterion("a58 is null");
            return (Criteria) this;
        }

        public Criteria andA58IsNotNull() {
            addCriterion("a58 is not null");
            return (Criteria) this;
        }

        public Criteria andA58EqualTo(Float value) {
            addCriterion("a58 =", value, "a58");
            return (Criteria) this;
        }

        public Criteria andA58NotEqualTo(Float value) {
            addCriterion("a58 <>", value, "a58");
            return (Criteria) this;
        }

        public Criteria andA58GreaterThan(Float value) {
            addCriterion("a58 >", value, "a58");
            return (Criteria) this;
        }

        public Criteria andA58GreaterThanOrEqualTo(Float value) {
            addCriterion("a58 >=", value, "a58");
            return (Criteria) this;
        }

        public Criteria andA58LessThan(Float value) {
            addCriterion("a58 <", value, "a58");
            return (Criteria) this;
        }

        public Criteria andA58LessThanOrEqualTo(Float value) {
            addCriterion("a58 <=", value, "a58");
            return (Criteria) this;
        }

        public Criteria andA58In(List<Float> values) {
            addCriterion("a58 in", values, "a58");
            return (Criteria) this;
        }

        public Criteria andA58NotIn(List<Float> values) {
            addCriterion("a58 not in", values, "a58");
            return (Criteria) this;
        }

        public Criteria andA58Between(Float value1, Float value2) {
            addCriterion("a58 between", value1, value2, "a58");
            return (Criteria) this;
        }

        public Criteria andA58NotBetween(Float value1, Float value2) {
            addCriterion("a58 not between", value1, value2, "a58");
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

        public Criteria andA9IsNull() {
            addCriterion("a9 is null");
            return (Criteria) this;
        }

        public Criteria andA9IsNotNull() {
            addCriterion("a9 is not null");
            return (Criteria) this;
        }

        public Criteria andA9EqualTo(Float value) {
            addCriterion("a9 =", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotEqualTo(Float value) {
            addCriterion("a9 <>", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9GreaterThan(Float value) {
            addCriterion("a9 >", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9GreaterThanOrEqualTo(Float value) {
            addCriterion("a9 >=", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9LessThan(Float value) {
            addCriterion("a9 <", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9LessThanOrEqualTo(Float value) {
            addCriterion("a9 <=", value, "a9");
            return (Criteria) this;
        }

        public Criteria andA9In(List<Float> values) {
            addCriterion("a9 in", values, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotIn(List<Float> values) {
            addCriterion("a9 not in", values, "a9");
            return (Criteria) this;
        }

        public Criteria andA9Between(Float value1, Float value2) {
            addCriterion("a9 between", value1, value2, "a9");
            return (Criteria) this;
        }

        public Criteria andA9NotBetween(Float value1, Float value2) {
            addCriterion("a9 not between", value1, value2, "a9");
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

        public Criteria andA10IsNull() {
            addCriterion("a10 is null");
            return (Criteria) this;
        }

        public Criteria andA10IsNotNull() {
            addCriterion("a10 is not null");
            return (Criteria) this;
        }

        public Criteria andA10EqualTo(Float value) {
            addCriterion("a10 =", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotEqualTo(Float value) {
            addCriterion("a10 <>", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10GreaterThan(Float value) {
            addCriterion("a10 >", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10GreaterThanOrEqualTo(Float value) {
            addCriterion("a10 >=", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10LessThan(Float value) {
            addCriterion("a10 <", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10LessThanOrEqualTo(Float value) {
            addCriterion("a10 <=", value, "a10");
            return (Criteria) this;
        }

        public Criteria andA10In(List<Float> values) {
            addCriterion("a10 in", values, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotIn(List<Float> values) {
            addCriterion("a10 not in", values, "a10");
            return (Criteria) this;
        }

        public Criteria andA10Between(Float value1, Float value2) {
            addCriterion("a10 between", value1, value2, "a10");
            return (Criteria) this;
        }

        public Criteria andA10NotBetween(Float value1, Float value2) {
            addCriterion("a10 not between", value1, value2, "a10");
            return (Criteria) this;
        }

        public Criteria andA11IsNull() {
            addCriterion("a11 is null");
            return (Criteria) this;
        }

        public Criteria andA11IsNotNull() {
            addCriterion("a11 is not null");
            return (Criteria) this;
        }

        public Criteria andA11EqualTo(Float value) {
            addCriterion("a11 =", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotEqualTo(Float value) {
            addCriterion("a11 <>", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11GreaterThan(Float value) {
            addCriterion("a11 >", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11GreaterThanOrEqualTo(Float value) {
            addCriterion("a11 >=", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11LessThan(Float value) {
            addCriterion("a11 <", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11LessThanOrEqualTo(Float value) {
            addCriterion("a11 <=", value, "a11");
            return (Criteria) this;
        }

        public Criteria andA11In(List<Float> values) {
            addCriterion("a11 in", values, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotIn(List<Float> values) {
            addCriterion("a11 not in", values, "a11");
            return (Criteria) this;
        }

        public Criteria andA11Between(Float value1, Float value2) {
            addCriterion("a11 between", value1, value2, "a11");
            return (Criteria) this;
        }

        public Criteria andA11NotBetween(Float value1, Float value2) {
            addCriterion("a11 not between", value1, value2, "a11");
            return (Criteria) this;
        }

        public Criteria andA12IsNull() {
            addCriterion("a12 is null");
            return (Criteria) this;
        }

        public Criteria andA12IsNotNull() {
            addCriterion("a12 is not null");
            return (Criteria) this;
        }

        public Criteria andA12EqualTo(Float value) {
            addCriterion("a12 =", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotEqualTo(Float value) {
            addCriterion("a12 <>", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12GreaterThan(Float value) {
            addCriterion("a12 >", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12GreaterThanOrEqualTo(Float value) {
            addCriterion("a12 >=", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12LessThan(Float value) {
            addCriterion("a12 <", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12LessThanOrEqualTo(Float value) {
            addCriterion("a12 <=", value, "a12");
            return (Criteria) this;
        }

        public Criteria andA12In(List<Float> values) {
            addCriterion("a12 in", values, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotIn(List<Float> values) {
            addCriterion("a12 not in", values, "a12");
            return (Criteria) this;
        }

        public Criteria andA12Between(Float value1, Float value2) {
            addCriterion("a12 between", value1, value2, "a12");
            return (Criteria) this;
        }

        public Criteria andA12NotBetween(Float value1, Float value2) {
            addCriterion("a12 not between", value1, value2, "a12");
            return (Criteria) this;
        }

        public Criteria andA59IsNull() {
            addCriterion("a59 is null");
            return (Criteria) this;
        }

        public Criteria andA59IsNotNull() {
            addCriterion("a59 is not null");
            return (Criteria) this;
        }

        public Criteria andA59EqualTo(Float value) {
            addCriterion("a59 =", value, "a59");
            return (Criteria) this;
        }

        public Criteria andA59NotEqualTo(Float value) {
            addCriterion("a59 <>", value, "a59");
            return (Criteria) this;
        }

        public Criteria andA59GreaterThan(Float value) {
            addCriterion("a59 >", value, "a59");
            return (Criteria) this;
        }

        public Criteria andA59GreaterThanOrEqualTo(Float value) {
            addCriterion("a59 >=", value, "a59");
            return (Criteria) this;
        }

        public Criteria andA59LessThan(Float value) {
            addCriterion("a59 <", value, "a59");
            return (Criteria) this;
        }

        public Criteria andA59LessThanOrEqualTo(Float value) {
            addCriterion("a59 <=", value, "a59");
            return (Criteria) this;
        }

        public Criteria andA59In(List<Float> values) {
            addCriterion("a59 in", values, "a59");
            return (Criteria) this;
        }

        public Criteria andA59NotIn(List<Float> values) {
            addCriterion("a59 not in", values, "a59");
            return (Criteria) this;
        }

        public Criteria andA59Between(Float value1, Float value2) {
            addCriterion("a59 between", value1, value2, "a59");
            return (Criteria) this;
        }

        public Criteria andA59NotBetween(Float value1, Float value2) {
            addCriterion("a59 not between", value1, value2, "a59");
            return (Criteria) this;
        }

        public Criteria andA13IsNull() {
            addCriterion("a13 is null");
            return (Criteria) this;
        }

        public Criteria andA13IsNotNull() {
            addCriterion("a13 is not null");
            return (Criteria) this;
        }

        public Criteria andA13EqualTo(Float value) {
            addCriterion("a13 =", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotEqualTo(Float value) {
            addCriterion("a13 <>", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13GreaterThan(Float value) {
            addCriterion("a13 >", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13GreaterThanOrEqualTo(Float value) {
            addCriterion("a13 >=", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13LessThan(Float value) {
            addCriterion("a13 <", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13LessThanOrEqualTo(Float value) {
            addCriterion("a13 <=", value, "a13");
            return (Criteria) this;
        }

        public Criteria andA13In(List<Float> values) {
            addCriterion("a13 in", values, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotIn(List<Float> values) {
            addCriterion("a13 not in", values, "a13");
            return (Criteria) this;
        }

        public Criteria andA13Between(Float value1, Float value2) {
            addCriterion("a13 between", value1, value2, "a13");
            return (Criteria) this;
        }

        public Criteria andA13NotBetween(Float value1, Float value2) {
            addCriterion("a13 not between", value1, value2, "a13");
            return (Criteria) this;
        }

        public Criteria andA14IsNull() {
            addCriterion("a14 is null");
            return (Criteria) this;
        }

        public Criteria andA14IsNotNull() {
            addCriterion("a14 is not null");
            return (Criteria) this;
        }

        public Criteria andA14EqualTo(Float value) {
            addCriterion("a14 =", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotEqualTo(Float value) {
            addCriterion("a14 <>", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14GreaterThan(Float value) {
            addCriterion("a14 >", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14GreaterThanOrEqualTo(Float value) {
            addCriterion("a14 >=", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14LessThan(Float value) {
            addCriterion("a14 <", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14LessThanOrEqualTo(Float value) {
            addCriterion("a14 <=", value, "a14");
            return (Criteria) this;
        }

        public Criteria andA14In(List<Float> values) {
            addCriterion("a14 in", values, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotIn(List<Float> values) {
            addCriterion("a14 not in", values, "a14");
            return (Criteria) this;
        }

        public Criteria andA14Between(Float value1, Float value2) {
            addCriterion("a14 between", value1, value2, "a14");
            return (Criteria) this;
        }

        public Criteria andA14NotBetween(Float value1, Float value2) {
            addCriterion("a14 not between", value1, value2, "a14");
            return (Criteria) this;
        }

        public Criteria andA15IsNull() {
            addCriterion("a15 is null");
            return (Criteria) this;
        }

        public Criteria andA15IsNotNull() {
            addCriterion("a15 is not null");
            return (Criteria) this;
        }

        public Criteria andA15EqualTo(Float value) {
            addCriterion("a15 =", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotEqualTo(Float value) {
            addCriterion("a15 <>", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15GreaterThan(Float value) {
            addCriterion("a15 >", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15GreaterThanOrEqualTo(Float value) {
            addCriterion("a15 >=", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15LessThan(Float value) {
            addCriterion("a15 <", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15LessThanOrEqualTo(Float value) {
            addCriterion("a15 <=", value, "a15");
            return (Criteria) this;
        }

        public Criteria andA15In(List<Float> values) {
            addCriterion("a15 in", values, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotIn(List<Float> values) {
            addCriterion("a15 not in", values, "a15");
            return (Criteria) this;
        }

        public Criteria andA15Between(Float value1, Float value2) {
            addCriterion("a15 between", value1, value2, "a15");
            return (Criteria) this;
        }

        public Criteria andA15NotBetween(Float value1, Float value2) {
            addCriterion("a15 not between", value1, value2, "a15");
            return (Criteria) this;
        }

        public Criteria andA16IsNull() {
            addCriterion("a16 is null");
            return (Criteria) this;
        }

        public Criteria andA16IsNotNull() {
            addCriterion("a16 is not null");
            return (Criteria) this;
        }

        public Criteria andA16EqualTo(Float value) {
            addCriterion("a16 =", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotEqualTo(Float value) {
            addCriterion("a16 <>", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16GreaterThan(Float value) {
            addCriterion("a16 >", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16GreaterThanOrEqualTo(Float value) {
            addCriterion("a16 >=", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16LessThan(Float value) {
            addCriterion("a16 <", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16LessThanOrEqualTo(Float value) {
            addCriterion("a16 <=", value, "a16");
            return (Criteria) this;
        }

        public Criteria andA16In(List<Float> values) {
            addCriterion("a16 in", values, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotIn(List<Float> values) {
            addCriterion("a16 not in", values, "a16");
            return (Criteria) this;
        }

        public Criteria andA16Between(Float value1, Float value2) {
            addCriterion("a16 between", value1, value2, "a16");
            return (Criteria) this;
        }

        public Criteria andA16NotBetween(Float value1, Float value2) {
            addCriterion("a16 not between", value1, value2, "a16");
            return (Criteria) this;
        }

        public Criteria andA17IsNull() {
            addCriterion("a17 is null");
            return (Criteria) this;
        }

        public Criteria andA17IsNotNull() {
            addCriterion("a17 is not null");
            return (Criteria) this;
        }

        public Criteria andA17EqualTo(Float value) {
            addCriterion("a17 =", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotEqualTo(Float value) {
            addCriterion("a17 <>", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17GreaterThan(Float value) {
            addCriterion("a17 >", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17GreaterThanOrEqualTo(Float value) {
            addCriterion("a17 >=", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17LessThan(Float value) {
            addCriterion("a17 <", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17LessThanOrEqualTo(Float value) {
            addCriterion("a17 <=", value, "a17");
            return (Criteria) this;
        }

        public Criteria andA17In(List<Float> values) {
            addCriterion("a17 in", values, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotIn(List<Float> values) {
            addCriterion("a17 not in", values, "a17");
            return (Criteria) this;
        }

        public Criteria andA17Between(Float value1, Float value2) {
            addCriterion("a17 between", value1, value2, "a17");
            return (Criteria) this;
        }

        public Criteria andA17NotBetween(Float value1, Float value2) {
            addCriterion("a17 not between", value1, value2, "a17");
            return (Criteria) this;
        }

        public Criteria andA18IsNull() {
            addCriterion("a18 is null");
            return (Criteria) this;
        }

        public Criteria andA18IsNotNull() {
            addCriterion("a18 is not null");
            return (Criteria) this;
        }

        public Criteria andA18EqualTo(Float value) {
            addCriterion("a18 =", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotEqualTo(Float value) {
            addCriterion("a18 <>", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18GreaterThan(Float value) {
            addCriterion("a18 >", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18GreaterThanOrEqualTo(Float value) {
            addCriterion("a18 >=", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18LessThan(Float value) {
            addCriterion("a18 <", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18LessThanOrEqualTo(Float value) {
            addCriterion("a18 <=", value, "a18");
            return (Criteria) this;
        }

        public Criteria andA18In(List<Float> values) {
            addCriterion("a18 in", values, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotIn(List<Float> values) {
            addCriterion("a18 not in", values, "a18");
            return (Criteria) this;
        }

        public Criteria andA18Between(Float value1, Float value2) {
            addCriterion("a18 between", value1, value2, "a18");
            return (Criteria) this;
        }

        public Criteria andA18NotBetween(Float value1, Float value2) {
            addCriterion("a18 not between", value1, value2, "a18");
            return (Criteria) this;
        }

        public Criteria andA19IsNull() {
            addCriterion("a19 is null");
            return (Criteria) this;
        }

        public Criteria andA19IsNotNull() {
            addCriterion("a19 is not null");
            return (Criteria) this;
        }

        public Criteria andA19EqualTo(Float value) {
            addCriterion("a19 =", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotEqualTo(Float value) {
            addCriterion("a19 <>", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19GreaterThan(Float value) {
            addCriterion("a19 >", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19GreaterThanOrEqualTo(Float value) {
            addCriterion("a19 >=", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19LessThan(Float value) {
            addCriterion("a19 <", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19LessThanOrEqualTo(Float value) {
            addCriterion("a19 <=", value, "a19");
            return (Criteria) this;
        }

        public Criteria andA19In(List<Float> values) {
            addCriterion("a19 in", values, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotIn(List<Float> values) {
            addCriterion("a19 not in", values, "a19");
            return (Criteria) this;
        }

        public Criteria andA19Between(Float value1, Float value2) {
            addCriterion("a19 between", value1, value2, "a19");
            return (Criteria) this;
        }

        public Criteria andA19NotBetween(Float value1, Float value2) {
            addCriterion("a19 not between", value1, value2, "a19");
            return (Criteria) this;
        }

        public Criteria andA25IsNull() {
            addCriterion("a25 is null");
            return (Criteria) this;
        }

        public Criteria andA25IsNotNull() {
            addCriterion("a25 is not null");
            return (Criteria) this;
        }

        public Criteria andA25EqualTo(Float value) {
            addCriterion("a25 =", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotEqualTo(Float value) {
            addCriterion("a25 <>", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25GreaterThan(Float value) {
            addCriterion("a25 >", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25GreaterThanOrEqualTo(Float value) {
            addCriterion("a25 >=", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25LessThan(Float value) {
            addCriterion("a25 <", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25LessThanOrEqualTo(Float value) {
            addCriterion("a25 <=", value, "a25");
            return (Criteria) this;
        }

        public Criteria andA25In(List<Float> values) {
            addCriterion("a25 in", values, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotIn(List<Float> values) {
            addCriterion("a25 not in", values, "a25");
            return (Criteria) this;
        }

        public Criteria andA25Between(Float value1, Float value2) {
            addCriterion("a25 between", value1, value2, "a25");
            return (Criteria) this;
        }

        public Criteria andA25NotBetween(Float value1, Float value2) {
            addCriterion("a25 not between", value1, value2, "a25");
            return (Criteria) this;
        }

        public Criteria andA26IsNull() {
            addCriterion("a26 is null");
            return (Criteria) this;
        }

        public Criteria andA26IsNotNull() {
            addCriterion("a26 is not null");
            return (Criteria) this;
        }

        public Criteria andA26EqualTo(Float value) {
            addCriterion("a26 =", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotEqualTo(Float value) {
            addCriterion("a26 <>", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26GreaterThan(Float value) {
            addCriterion("a26 >", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26GreaterThanOrEqualTo(Float value) {
            addCriterion("a26 >=", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26LessThan(Float value) {
            addCriterion("a26 <", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26LessThanOrEqualTo(Float value) {
            addCriterion("a26 <=", value, "a26");
            return (Criteria) this;
        }

        public Criteria andA26In(List<Float> values) {
            addCriterion("a26 in", values, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotIn(List<Float> values) {
            addCriterion("a26 not in", values, "a26");
            return (Criteria) this;
        }

        public Criteria andA26Between(Float value1, Float value2) {
            addCriterion("a26 between", value1, value2, "a26");
            return (Criteria) this;
        }

        public Criteria andA26NotBetween(Float value1, Float value2) {
            addCriterion("a26 not between", value1, value2, "a26");
            return (Criteria) this;
        }

        public Criteria andA101IsNull() {
            addCriterion("a101 is null");
            return (Criteria) this;
        }

        public Criteria andA101IsNotNull() {
            addCriterion("a101 is not null");
            return (Criteria) this;
        }

        public Criteria andA101EqualTo(Float value) {
            addCriterion("a101 =", value, "a101");
            return (Criteria) this;
        }

        public Criteria andA101NotEqualTo(Float value) {
            addCriterion("a101 <>", value, "a101");
            return (Criteria) this;
        }

        public Criteria andA101GreaterThan(Float value) {
            addCriterion("a101 >", value, "a101");
            return (Criteria) this;
        }

        public Criteria andA101GreaterThanOrEqualTo(Float value) {
            addCriterion("a101 >=", value, "a101");
            return (Criteria) this;
        }

        public Criteria andA101LessThan(Float value) {
            addCriterion("a101 <", value, "a101");
            return (Criteria) this;
        }

        public Criteria andA101LessThanOrEqualTo(Float value) {
            addCriterion("a101 <=", value, "a101");
            return (Criteria) this;
        }

        public Criteria andA101In(List<Float> values) {
            addCriterion("a101 in", values, "a101");
            return (Criteria) this;
        }

        public Criteria andA101NotIn(List<Float> values) {
            addCriterion("a101 not in", values, "a101");
            return (Criteria) this;
        }

        public Criteria andA101Between(Float value1, Float value2) {
            addCriterion("a101 between", value1, value2, "a101");
            return (Criteria) this;
        }

        public Criteria andA101NotBetween(Float value1, Float value2) {
            addCriterion("a101 not between", value1, value2, "a101");
            return (Criteria) this;
        }

        public Criteria andA115IsNull() {
            addCriterion("a115 is null");
            return (Criteria) this;
        }

        public Criteria andA115IsNotNull() {
            addCriterion("a115 is not null");
            return (Criteria) this;
        }

        public Criteria andA115EqualTo(Float value) {
            addCriterion("a115 =", value, "a115");
            return (Criteria) this;
        }

        public Criteria andA115NotEqualTo(Float value) {
            addCriterion("a115 <>", value, "a115");
            return (Criteria) this;
        }

        public Criteria andA115GreaterThan(Float value) {
            addCriterion("a115 >", value, "a115");
            return (Criteria) this;
        }

        public Criteria andA115GreaterThanOrEqualTo(Float value) {
            addCriterion("a115 >=", value, "a115");
            return (Criteria) this;
        }

        public Criteria andA115LessThan(Float value) {
            addCriterion("a115 <", value, "a115");
            return (Criteria) this;
        }

        public Criteria andA115LessThanOrEqualTo(Float value) {
            addCriterion("a115 <=", value, "a115");
            return (Criteria) this;
        }

        public Criteria andA115In(List<Float> values) {
            addCriterion("a115 in", values, "a115");
            return (Criteria) this;
        }

        public Criteria andA115NotIn(List<Float> values) {
            addCriterion("a115 not in", values, "a115");
            return (Criteria) this;
        }

        public Criteria andA115Between(Float value1, Float value2) {
            addCriterion("a115 between", value1, value2, "a115");
            return (Criteria) this;
        }

        public Criteria andA115NotBetween(Float value1, Float value2) {
            addCriterion("a115 not between", value1, value2, "a115");
            return (Criteria) this;
        }

        public Criteria andA27IsNull() {
            addCriterion("a27 is null");
            return (Criteria) this;
        }

        public Criteria andA27IsNotNull() {
            addCriterion("a27 is not null");
            return (Criteria) this;
        }

        public Criteria andA27EqualTo(Float value) {
            addCriterion("a27 =", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotEqualTo(Float value) {
            addCriterion("a27 <>", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27GreaterThan(Float value) {
            addCriterion("a27 >", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27GreaterThanOrEqualTo(Float value) {
            addCriterion("a27 >=", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27LessThan(Float value) {
            addCriterion("a27 <", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27LessThanOrEqualTo(Float value) {
            addCriterion("a27 <=", value, "a27");
            return (Criteria) this;
        }

        public Criteria andA27In(List<Float> values) {
            addCriterion("a27 in", values, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotIn(List<Float> values) {
            addCriterion("a27 not in", values, "a27");
            return (Criteria) this;
        }

        public Criteria andA27Between(Float value1, Float value2) {
            addCriterion("a27 between", value1, value2, "a27");
            return (Criteria) this;
        }

        public Criteria andA27NotBetween(Float value1, Float value2) {
            addCriterion("a27 not between", value1, value2, "a27");
            return (Criteria) this;
        }

        public Criteria andA28IsNull() {
            addCriterion("a28 is null");
            return (Criteria) this;
        }

        public Criteria andA28IsNotNull() {
            addCriterion("a28 is not null");
            return (Criteria) this;
        }

        public Criteria andA28EqualTo(Float value) {
            addCriterion("a28 =", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotEqualTo(Float value) {
            addCriterion("a28 <>", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28GreaterThan(Float value) {
            addCriterion("a28 >", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28GreaterThanOrEqualTo(Float value) {
            addCriterion("a28 >=", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28LessThan(Float value) {
            addCriterion("a28 <", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28LessThanOrEqualTo(Float value) {
            addCriterion("a28 <=", value, "a28");
            return (Criteria) this;
        }

        public Criteria andA28In(List<Float> values) {
            addCriterion("a28 in", values, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotIn(List<Float> values) {
            addCriterion("a28 not in", values, "a28");
            return (Criteria) this;
        }

        public Criteria andA28Between(Float value1, Float value2) {
            addCriterion("a28 between", value1, value2, "a28");
            return (Criteria) this;
        }

        public Criteria andA28NotBetween(Float value1, Float value2) {
            addCriterion("a28 not between", value1, value2, "a28");
            return (Criteria) this;
        }

        public Criteria andA102IsNull() {
            addCriterion("a102 is null");
            return (Criteria) this;
        }

        public Criteria andA102IsNotNull() {
            addCriterion("a102 is not null");
            return (Criteria) this;
        }

        public Criteria andA102EqualTo(Float value) {
            addCriterion("a102 =", value, "a102");
            return (Criteria) this;
        }

        public Criteria andA102NotEqualTo(Float value) {
            addCriterion("a102 <>", value, "a102");
            return (Criteria) this;
        }

        public Criteria andA102GreaterThan(Float value) {
            addCriterion("a102 >", value, "a102");
            return (Criteria) this;
        }

        public Criteria andA102GreaterThanOrEqualTo(Float value) {
            addCriterion("a102 >=", value, "a102");
            return (Criteria) this;
        }

        public Criteria andA102LessThan(Float value) {
            addCriterion("a102 <", value, "a102");
            return (Criteria) this;
        }

        public Criteria andA102LessThanOrEqualTo(Float value) {
            addCriterion("a102 <=", value, "a102");
            return (Criteria) this;
        }

        public Criteria andA102In(List<Float> values) {
            addCriterion("a102 in", values, "a102");
            return (Criteria) this;
        }

        public Criteria andA102NotIn(List<Float> values) {
            addCriterion("a102 not in", values, "a102");
            return (Criteria) this;
        }

        public Criteria andA102Between(Float value1, Float value2) {
            addCriterion("a102 between", value1, value2, "a102");
            return (Criteria) this;
        }

        public Criteria andA102NotBetween(Float value1, Float value2) {
            addCriterion("a102 not between", value1, value2, "a102");
            return (Criteria) this;
        }

        public Criteria andA116IsNull() {
            addCriterion("a116 is null");
            return (Criteria) this;
        }

        public Criteria andA116IsNotNull() {
            addCriterion("a116 is not null");
            return (Criteria) this;
        }

        public Criteria andA116EqualTo(Float value) {
            addCriterion("a116 =", value, "a116");
            return (Criteria) this;
        }

        public Criteria andA116NotEqualTo(Float value) {
            addCriterion("a116 <>", value, "a116");
            return (Criteria) this;
        }

        public Criteria andA116GreaterThan(Float value) {
            addCriterion("a116 >", value, "a116");
            return (Criteria) this;
        }

        public Criteria andA116GreaterThanOrEqualTo(Float value) {
            addCriterion("a116 >=", value, "a116");
            return (Criteria) this;
        }

        public Criteria andA116LessThan(Float value) {
            addCriterion("a116 <", value, "a116");
            return (Criteria) this;
        }

        public Criteria andA116LessThanOrEqualTo(Float value) {
            addCriterion("a116 <=", value, "a116");
            return (Criteria) this;
        }

        public Criteria andA116In(List<Float> values) {
            addCriterion("a116 in", values, "a116");
            return (Criteria) this;
        }

        public Criteria andA116NotIn(List<Float> values) {
            addCriterion("a116 not in", values, "a116");
            return (Criteria) this;
        }

        public Criteria andA116Between(Float value1, Float value2) {
            addCriterion("a116 between", value1, value2, "a116");
            return (Criteria) this;
        }

        public Criteria andA116NotBetween(Float value1, Float value2) {
            addCriterion("a116 not between", value1, value2, "a116");
            return (Criteria) this;
        }

        public Criteria andA29IsNull() {
            addCriterion("a29 is null");
            return (Criteria) this;
        }

        public Criteria andA29IsNotNull() {
            addCriterion("a29 is not null");
            return (Criteria) this;
        }

        public Criteria andA29EqualTo(Float value) {
            addCriterion("a29 =", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotEqualTo(Float value) {
            addCriterion("a29 <>", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29GreaterThan(Float value) {
            addCriterion("a29 >", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29GreaterThanOrEqualTo(Float value) {
            addCriterion("a29 >=", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29LessThan(Float value) {
            addCriterion("a29 <", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29LessThanOrEqualTo(Float value) {
            addCriterion("a29 <=", value, "a29");
            return (Criteria) this;
        }

        public Criteria andA29In(List<Float> values) {
            addCriterion("a29 in", values, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotIn(List<Float> values) {
            addCriterion("a29 not in", values, "a29");
            return (Criteria) this;
        }

        public Criteria andA29Between(Float value1, Float value2) {
            addCriterion("a29 between", value1, value2, "a29");
            return (Criteria) this;
        }

        public Criteria andA29NotBetween(Float value1, Float value2) {
            addCriterion("a29 not between", value1, value2, "a29");
            return (Criteria) this;
        }

        public Criteria andA30IsNull() {
            addCriterion("a30 is null");
            return (Criteria) this;
        }

        public Criteria andA30IsNotNull() {
            addCriterion("a30 is not null");
            return (Criteria) this;
        }

        public Criteria andA30EqualTo(Float value) {
            addCriterion("a30 =", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotEqualTo(Float value) {
            addCriterion("a30 <>", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30GreaterThan(Float value) {
            addCriterion("a30 >", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30GreaterThanOrEqualTo(Float value) {
            addCriterion("a30 >=", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30LessThan(Float value) {
            addCriterion("a30 <", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30LessThanOrEqualTo(Float value) {
            addCriterion("a30 <=", value, "a30");
            return (Criteria) this;
        }

        public Criteria andA30In(List<Float> values) {
            addCriterion("a30 in", values, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotIn(List<Float> values) {
            addCriterion("a30 not in", values, "a30");
            return (Criteria) this;
        }

        public Criteria andA30Between(Float value1, Float value2) {
            addCriterion("a30 between", value1, value2, "a30");
            return (Criteria) this;
        }

        public Criteria andA30NotBetween(Float value1, Float value2) {
            addCriterion("a30 not between", value1, value2, "a30");
            return (Criteria) this;
        }

        public Criteria andA103IsNull() {
            addCriterion("a103 is null");
            return (Criteria) this;
        }

        public Criteria andA103IsNotNull() {
            addCriterion("a103 is not null");
            return (Criteria) this;
        }

        public Criteria andA103EqualTo(Float value) {
            addCriterion("a103 =", value, "a103");
            return (Criteria) this;
        }

        public Criteria andA103NotEqualTo(Float value) {
            addCriterion("a103 <>", value, "a103");
            return (Criteria) this;
        }

        public Criteria andA103GreaterThan(Float value) {
            addCriterion("a103 >", value, "a103");
            return (Criteria) this;
        }

        public Criteria andA103GreaterThanOrEqualTo(Float value) {
            addCriterion("a103 >=", value, "a103");
            return (Criteria) this;
        }

        public Criteria andA103LessThan(Float value) {
            addCriterion("a103 <", value, "a103");
            return (Criteria) this;
        }

        public Criteria andA103LessThanOrEqualTo(Float value) {
            addCriterion("a103 <=", value, "a103");
            return (Criteria) this;
        }

        public Criteria andA103In(List<Float> values) {
            addCriterion("a103 in", values, "a103");
            return (Criteria) this;
        }

        public Criteria andA103NotIn(List<Float> values) {
            addCriterion("a103 not in", values, "a103");
            return (Criteria) this;
        }

        public Criteria andA103Between(Float value1, Float value2) {
            addCriterion("a103 between", value1, value2, "a103");
            return (Criteria) this;
        }

        public Criteria andA103NotBetween(Float value1, Float value2) {
            addCriterion("a103 not between", value1, value2, "a103");
            return (Criteria) this;
        }

        public Criteria andA117IsNull() {
            addCriterion("a117 is null");
            return (Criteria) this;
        }

        public Criteria andA117IsNotNull() {
            addCriterion("a117 is not null");
            return (Criteria) this;
        }

        public Criteria andA117EqualTo(Float value) {
            addCriterion("a117 =", value, "a117");
            return (Criteria) this;
        }

        public Criteria andA117NotEqualTo(Float value) {
            addCriterion("a117 <>", value, "a117");
            return (Criteria) this;
        }

        public Criteria andA117GreaterThan(Float value) {
            addCriterion("a117 >", value, "a117");
            return (Criteria) this;
        }

        public Criteria andA117GreaterThanOrEqualTo(Float value) {
            addCriterion("a117 >=", value, "a117");
            return (Criteria) this;
        }

        public Criteria andA117LessThan(Float value) {
            addCriterion("a117 <", value, "a117");
            return (Criteria) this;
        }

        public Criteria andA117LessThanOrEqualTo(Float value) {
            addCriterion("a117 <=", value, "a117");
            return (Criteria) this;
        }

        public Criteria andA117In(List<Float> values) {
            addCriterion("a117 in", values, "a117");
            return (Criteria) this;
        }

        public Criteria andA117NotIn(List<Float> values) {
            addCriterion("a117 not in", values, "a117");
            return (Criteria) this;
        }

        public Criteria andA117Between(Float value1, Float value2) {
            addCriterion("a117 between", value1, value2, "a117");
            return (Criteria) this;
        }

        public Criteria andA117NotBetween(Float value1, Float value2) {
            addCriterion("a117 not between", value1, value2, "a117");
            return (Criteria) this;
        }

        public Criteria andA31IsNull() {
            addCriterion("a31 is null");
            return (Criteria) this;
        }

        public Criteria andA31IsNotNull() {
            addCriterion("a31 is not null");
            return (Criteria) this;
        }

        public Criteria andA31EqualTo(Float value) {
            addCriterion("a31 =", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotEqualTo(Float value) {
            addCriterion("a31 <>", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31GreaterThan(Float value) {
            addCriterion("a31 >", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31GreaterThanOrEqualTo(Float value) {
            addCriterion("a31 >=", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31LessThan(Float value) {
            addCriterion("a31 <", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31LessThanOrEqualTo(Float value) {
            addCriterion("a31 <=", value, "a31");
            return (Criteria) this;
        }

        public Criteria andA31In(List<Float> values) {
            addCriterion("a31 in", values, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotIn(List<Float> values) {
            addCriterion("a31 not in", values, "a31");
            return (Criteria) this;
        }

        public Criteria andA31Between(Float value1, Float value2) {
            addCriterion("a31 between", value1, value2, "a31");
            return (Criteria) this;
        }

        public Criteria andA31NotBetween(Float value1, Float value2) {
            addCriterion("a31 not between", value1, value2, "a31");
            return (Criteria) this;
        }

        public Criteria andA32IsNull() {
            addCriterion("a32 is null");
            return (Criteria) this;
        }

        public Criteria andA32IsNotNull() {
            addCriterion("a32 is not null");
            return (Criteria) this;
        }

        public Criteria andA32EqualTo(Float value) {
            addCriterion("a32 =", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotEqualTo(Float value) {
            addCriterion("a32 <>", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32GreaterThan(Float value) {
            addCriterion("a32 >", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32GreaterThanOrEqualTo(Float value) {
            addCriterion("a32 >=", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32LessThan(Float value) {
            addCriterion("a32 <", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32LessThanOrEqualTo(Float value) {
            addCriterion("a32 <=", value, "a32");
            return (Criteria) this;
        }

        public Criteria andA32In(List<Float> values) {
            addCriterion("a32 in", values, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotIn(List<Float> values) {
            addCriterion("a32 not in", values, "a32");
            return (Criteria) this;
        }

        public Criteria andA32Between(Float value1, Float value2) {
            addCriterion("a32 between", value1, value2, "a32");
            return (Criteria) this;
        }

        public Criteria andA32NotBetween(Float value1, Float value2) {
            addCriterion("a32 not between", value1, value2, "a32");
            return (Criteria) this;
        }

        public Criteria andA104IsNull() {
            addCriterion("a104 is null");
            return (Criteria) this;
        }

        public Criteria andA104IsNotNull() {
            addCriterion("a104 is not null");
            return (Criteria) this;
        }

        public Criteria andA104EqualTo(Float value) {
            addCriterion("a104 =", value, "a104");
            return (Criteria) this;
        }

        public Criteria andA104NotEqualTo(Float value) {
            addCriterion("a104 <>", value, "a104");
            return (Criteria) this;
        }

        public Criteria andA104GreaterThan(Float value) {
            addCriterion("a104 >", value, "a104");
            return (Criteria) this;
        }

        public Criteria andA104GreaterThanOrEqualTo(Float value) {
            addCriterion("a104 >=", value, "a104");
            return (Criteria) this;
        }

        public Criteria andA104LessThan(Float value) {
            addCriterion("a104 <", value, "a104");
            return (Criteria) this;
        }

        public Criteria andA104LessThanOrEqualTo(Float value) {
            addCriterion("a104 <=", value, "a104");
            return (Criteria) this;
        }

        public Criteria andA104In(List<Float> values) {
            addCriterion("a104 in", values, "a104");
            return (Criteria) this;
        }

        public Criteria andA104NotIn(List<Float> values) {
            addCriterion("a104 not in", values, "a104");
            return (Criteria) this;
        }

        public Criteria andA104Between(Float value1, Float value2) {
            addCriterion("a104 between", value1, value2, "a104");
            return (Criteria) this;
        }

        public Criteria andA104NotBetween(Float value1, Float value2) {
            addCriterion("a104 not between", value1, value2, "a104");
            return (Criteria) this;
        }

        public Criteria andA118IsNull() {
            addCriterion("a118 is null");
            return (Criteria) this;
        }

        public Criteria andA118IsNotNull() {
            addCriterion("a118 is not null");
            return (Criteria) this;
        }

        public Criteria andA118EqualTo(Float value) {
            addCriterion("a118 =", value, "a118");
            return (Criteria) this;
        }

        public Criteria andA118NotEqualTo(Float value) {
            addCriterion("a118 <>", value, "a118");
            return (Criteria) this;
        }

        public Criteria andA118GreaterThan(Float value) {
            addCriterion("a118 >", value, "a118");
            return (Criteria) this;
        }

        public Criteria andA118GreaterThanOrEqualTo(Float value) {
            addCriterion("a118 >=", value, "a118");
            return (Criteria) this;
        }

        public Criteria andA118LessThan(Float value) {
            addCriterion("a118 <", value, "a118");
            return (Criteria) this;
        }

        public Criteria andA118LessThanOrEqualTo(Float value) {
            addCriterion("a118 <=", value, "a118");
            return (Criteria) this;
        }

        public Criteria andA118In(List<Float> values) {
            addCriterion("a118 in", values, "a118");
            return (Criteria) this;
        }

        public Criteria andA118NotIn(List<Float> values) {
            addCriterion("a118 not in", values, "a118");
            return (Criteria) this;
        }

        public Criteria andA118Between(Float value1, Float value2) {
            addCriterion("a118 between", value1, value2, "a118");
            return (Criteria) this;
        }

        public Criteria andA118NotBetween(Float value1, Float value2) {
            addCriterion("a118 not between", value1, value2, "a118");
            return (Criteria) this;
        }

        public Criteria andA33IsNull() {
            addCriterion("a33 is null");
            return (Criteria) this;
        }

        public Criteria andA33IsNotNull() {
            addCriterion("a33 is not null");
            return (Criteria) this;
        }

        public Criteria andA33EqualTo(Float value) {
            addCriterion("a33 =", value, "a33");
            return (Criteria) this;
        }

        public Criteria andA33NotEqualTo(Float value) {
            addCriterion("a33 <>", value, "a33");
            return (Criteria) this;
        }

        public Criteria andA33GreaterThan(Float value) {
            addCriterion("a33 >", value, "a33");
            return (Criteria) this;
        }

        public Criteria andA33GreaterThanOrEqualTo(Float value) {
            addCriterion("a33 >=", value, "a33");
            return (Criteria) this;
        }

        public Criteria andA33LessThan(Float value) {
            addCriterion("a33 <", value, "a33");
            return (Criteria) this;
        }

        public Criteria andA33LessThanOrEqualTo(Float value) {
            addCriterion("a33 <=", value, "a33");
            return (Criteria) this;
        }

        public Criteria andA33In(List<Float> values) {
            addCriterion("a33 in", values, "a33");
            return (Criteria) this;
        }

        public Criteria andA33NotIn(List<Float> values) {
            addCriterion("a33 not in", values, "a33");
            return (Criteria) this;
        }

        public Criteria andA33Between(Float value1, Float value2) {
            addCriterion("a33 between", value1, value2, "a33");
            return (Criteria) this;
        }

        public Criteria andA33NotBetween(Float value1, Float value2) {
            addCriterion("a33 not between", value1, value2, "a33");
            return (Criteria) this;
        }

        public Criteria andA34IsNull() {
            addCriterion("a34 is null");
            return (Criteria) this;
        }

        public Criteria andA34IsNotNull() {
            addCriterion("a34 is not null");
            return (Criteria) this;
        }

        public Criteria andA34EqualTo(Float value) {
            addCriterion("a34 =", value, "a34");
            return (Criteria) this;
        }

        public Criteria andA34NotEqualTo(Float value) {
            addCriterion("a34 <>", value, "a34");
            return (Criteria) this;
        }

        public Criteria andA34GreaterThan(Float value) {
            addCriterion("a34 >", value, "a34");
            return (Criteria) this;
        }

        public Criteria andA34GreaterThanOrEqualTo(Float value) {
            addCriterion("a34 >=", value, "a34");
            return (Criteria) this;
        }

        public Criteria andA34LessThan(Float value) {
            addCriterion("a34 <", value, "a34");
            return (Criteria) this;
        }

        public Criteria andA34LessThanOrEqualTo(Float value) {
            addCriterion("a34 <=", value, "a34");
            return (Criteria) this;
        }

        public Criteria andA34In(List<Float> values) {
            addCriterion("a34 in", values, "a34");
            return (Criteria) this;
        }

        public Criteria andA34NotIn(List<Float> values) {
            addCriterion("a34 not in", values, "a34");
            return (Criteria) this;
        }

        public Criteria andA34Between(Float value1, Float value2) {
            addCriterion("a34 between", value1, value2, "a34");
            return (Criteria) this;
        }

        public Criteria andA34NotBetween(Float value1, Float value2) {
            addCriterion("a34 not between", value1, value2, "a34");
            return (Criteria) this;
        }

        public Criteria andA105IsNull() {
            addCriterion("a105 is null");
            return (Criteria) this;
        }

        public Criteria andA105IsNotNull() {
            addCriterion("a105 is not null");
            return (Criteria) this;
        }

        public Criteria andA105EqualTo(Float value) {
            addCriterion("a105 =", value, "a105");
            return (Criteria) this;
        }

        public Criteria andA105NotEqualTo(Float value) {
            addCriterion("a105 <>", value, "a105");
            return (Criteria) this;
        }

        public Criteria andA105GreaterThan(Float value) {
            addCriterion("a105 >", value, "a105");
            return (Criteria) this;
        }

        public Criteria andA105GreaterThanOrEqualTo(Float value) {
            addCriterion("a105 >=", value, "a105");
            return (Criteria) this;
        }

        public Criteria andA105LessThan(Float value) {
            addCriterion("a105 <", value, "a105");
            return (Criteria) this;
        }

        public Criteria andA105LessThanOrEqualTo(Float value) {
            addCriterion("a105 <=", value, "a105");
            return (Criteria) this;
        }

        public Criteria andA105In(List<Float> values) {
            addCriterion("a105 in", values, "a105");
            return (Criteria) this;
        }

        public Criteria andA105NotIn(List<Float> values) {
            addCriterion("a105 not in", values, "a105");
            return (Criteria) this;
        }

        public Criteria andA105Between(Float value1, Float value2) {
            addCriterion("a105 between", value1, value2, "a105");
            return (Criteria) this;
        }

        public Criteria andA105NotBetween(Float value1, Float value2) {
            addCriterion("a105 not between", value1, value2, "a105");
            return (Criteria) this;
        }

        public Criteria andA119IsNull() {
            addCriterion("a119 is null");
            return (Criteria) this;
        }

        public Criteria andA119IsNotNull() {
            addCriterion("a119 is not null");
            return (Criteria) this;
        }

        public Criteria andA119EqualTo(Float value) {
            addCriterion("a119 =", value, "a119");
            return (Criteria) this;
        }

        public Criteria andA119NotEqualTo(Float value) {
            addCriterion("a119 <>", value, "a119");
            return (Criteria) this;
        }

        public Criteria andA119GreaterThan(Float value) {
            addCriterion("a119 >", value, "a119");
            return (Criteria) this;
        }

        public Criteria andA119GreaterThanOrEqualTo(Float value) {
            addCriterion("a119 >=", value, "a119");
            return (Criteria) this;
        }

        public Criteria andA119LessThan(Float value) {
            addCriterion("a119 <", value, "a119");
            return (Criteria) this;
        }

        public Criteria andA119LessThanOrEqualTo(Float value) {
            addCriterion("a119 <=", value, "a119");
            return (Criteria) this;
        }

        public Criteria andA119In(List<Float> values) {
            addCriterion("a119 in", values, "a119");
            return (Criteria) this;
        }

        public Criteria andA119NotIn(List<Float> values) {
            addCriterion("a119 not in", values, "a119");
            return (Criteria) this;
        }

        public Criteria andA119Between(Float value1, Float value2) {
            addCriterion("a119 between", value1, value2, "a119");
            return (Criteria) this;
        }

        public Criteria andA119NotBetween(Float value1, Float value2) {
            addCriterion("a119 not between", value1, value2, "a119");
            return (Criteria) this;
        }

        public Criteria andA35IsNull() {
            addCriterion("a35 is null");
            return (Criteria) this;
        }

        public Criteria andA35IsNotNull() {
            addCriterion("a35 is not null");
            return (Criteria) this;
        }

        public Criteria andA35EqualTo(Float value) {
            addCriterion("a35 =", value, "a35");
            return (Criteria) this;
        }

        public Criteria andA35NotEqualTo(Float value) {
            addCriterion("a35 <>", value, "a35");
            return (Criteria) this;
        }

        public Criteria andA35GreaterThan(Float value) {
            addCriterion("a35 >", value, "a35");
            return (Criteria) this;
        }

        public Criteria andA35GreaterThanOrEqualTo(Float value) {
            addCriterion("a35 >=", value, "a35");
            return (Criteria) this;
        }

        public Criteria andA35LessThan(Float value) {
            addCriterion("a35 <", value, "a35");
            return (Criteria) this;
        }

        public Criteria andA35LessThanOrEqualTo(Float value) {
            addCriterion("a35 <=", value, "a35");
            return (Criteria) this;
        }

        public Criteria andA35In(List<Float> values) {
            addCriterion("a35 in", values, "a35");
            return (Criteria) this;
        }

        public Criteria andA35NotIn(List<Float> values) {
            addCriterion("a35 not in", values, "a35");
            return (Criteria) this;
        }

        public Criteria andA35Between(Float value1, Float value2) {
            addCriterion("a35 between", value1, value2, "a35");
            return (Criteria) this;
        }

        public Criteria andA35NotBetween(Float value1, Float value2) {
            addCriterion("a35 not between", value1, value2, "a35");
            return (Criteria) this;
        }

        public Criteria andA36IsNull() {
            addCriterion("a36 is null");
            return (Criteria) this;
        }

        public Criteria andA36IsNotNull() {
            addCriterion("a36 is not null");
            return (Criteria) this;
        }

        public Criteria andA36EqualTo(Float value) {
            addCriterion("a36 =", value, "a36");
            return (Criteria) this;
        }

        public Criteria andA36NotEqualTo(Float value) {
            addCriterion("a36 <>", value, "a36");
            return (Criteria) this;
        }

        public Criteria andA36GreaterThan(Float value) {
            addCriterion("a36 >", value, "a36");
            return (Criteria) this;
        }

        public Criteria andA36GreaterThanOrEqualTo(Float value) {
            addCriterion("a36 >=", value, "a36");
            return (Criteria) this;
        }

        public Criteria andA36LessThan(Float value) {
            addCriterion("a36 <", value, "a36");
            return (Criteria) this;
        }

        public Criteria andA36LessThanOrEqualTo(Float value) {
            addCriterion("a36 <=", value, "a36");
            return (Criteria) this;
        }

        public Criteria andA36In(List<Float> values) {
            addCriterion("a36 in", values, "a36");
            return (Criteria) this;
        }

        public Criteria andA36NotIn(List<Float> values) {
            addCriterion("a36 not in", values, "a36");
            return (Criteria) this;
        }

        public Criteria andA36Between(Float value1, Float value2) {
            addCriterion("a36 between", value1, value2, "a36");
            return (Criteria) this;
        }

        public Criteria andA36NotBetween(Float value1, Float value2) {
            addCriterion("a36 not between", value1, value2, "a36");
            return (Criteria) this;
        }

        public Criteria andA106IsNull() {
            addCriterion("a106 is null");
            return (Criteria) this;
        }

        public Criteria andA106IsNotNull() {
            addCriterion("a106 is not null");
            return (Criteria) this;
        }

        public Criteria andA106EqualTo(Float value) {
            addCriterion("a106 =", value, "a106");
            return (Criteria) this;
        }

        public Criteria andA106NotEqualTo(Float value) {
            addCriterion("a106 <>", value, "a106");
            return (Criteria) this;
        }

        public Criteria andA106GreaterThan(Float value) {
            addCriterion("a106 >", value, "a106");
            return (Criteria) this;
        }

        public Criteria andA106GreaterThanOrEqualTo(Float value) {
            addCriterion("a106 >=", value, "a106");
            return (Criteria) this;
        }

        public Criteria andA106LessThan(Float value) {
            addCriterion("a106 <", value, "a106");
            return (Criteria) this;
        }

        public Criteria andA106LessThanOrEqualTo(Float value) {
            addCriterion("a106 <=", value, "a106");
            return (Criteria) this;
        }

        public Criteria andA106In(List<Float> values) {
            addCriterion("a106 in", values, "a106");
            return (Criteria) this;
        }

        public Criteria andA106NotIn(List<Float> values) {
            addCriterion("a106 not in", values, "a106");
            return (Criteria) this;
        }

        public Criteria andA106Between(Float value1, Float value2) {
            addCriterion("a106 between", value1, value2, "a106");
            return (Criteria) this;
        }

        public Criteria andA106NotBetween(Float value1, Float value2) {
            addCriterion("a106 not between", value1, value2, "a106");
            return (Criteria) this;
        }

        public Criteria andA120IsNull() {
            addCriterion("a120 is null");
            return (Criteria) this;
        }

        public Criteria andA120IsNotNull() {
            addCriterion("a120 is not null");
            return (Criteria) this;
        }

        public Criteria andA120EqualTo(Float value) {
            addCriterion("a120 =", value, "a120");
            return (Criteria) this;
        }

        public Criteria andA120NotEqualTo(Float value) {
            addCriterion("a120 <>", value, "a120");
            return (Criteria) this;
        }

        public Criteria andA120GreaterThan(Float value) {
            addCriterion("a120 >", value, "a120");
            return (Criteria) this;
        }

        public Criteria andA120GreaterThanOrEqualTo(Float value) {
            addCriterion("a120 >=", value, "a120");
            return (Criteria) this;
        }

        public Criteria andA120LessThan(Float value) {
            addCriterion("a120 <", value, "a120");
            return (Criteria) this;
        }

        public Criteria andA120LessThanOrEqualTo(Float value) {
            addCriterion("a120 <=", value, "a120");
            return (Criteria) this;
        }

        public Criteria andA120In(List<Float> values) {
            addCriterion("a120 in", values, "a120");
            return (Criteria) this;
        }

        public Criteria andA120NotIn(List<Float> values) {
            addCriterion("a120 not in", values, "a120");
            return (Criteria) this;
        }

        public Criteria andA120Between(Float value1, Float value2) {
            addCriterion("a120 between", value1, value2, "a120");
            return (Criteria) this;
        }

        public Criteria andA120NotBetween(Float value1, Float value2) {
            addCriterion("a120 not between", value1, value2, "a120");
            return (Criteria) this;
        }

        public Criteria andA37IsNull() {
            addCriterion("a37 is null");
            return (Criteria) this;
        }

        public Criteria andA37IsNotNull() {
            addCriterion("a37 is not null");
            return (Criteria) this;
        }

        public Criteria andA37EqualTo(Float value) {
            addCriterion("a37 =", value, "a37");
            return (Criteria) this;
        }

        public Criteria andA37NotEqualTo(Float value) {
            addCriterion("a37 <>", value, "a37");
            return (Criteria) this;
        }

        public Criteria andA37GreaterThan(Float value) {
            addCriterion("a37 >", value, "a37");
            return (Criteria) this;
        }

        public Criteria andA37GreaterThanOrEqualTo(Float value) {
            addCriterion("a37 >=", value, "a37");
            return (Criteria) this;
        }

        public Criteria andA37LessThan(Float value) {
            addCriterion("a37 <", value, "a37");
            return (Criteria) this;
        }

        public Criteria andA37LessThanOrEqualTo(Float value) {
            addCriterion("a37 <=", value, "a37");
            return (Criteria) this;
        }

        public Criteria andA37In(List<Float> values) {
            addCriterion("a37 in", values, "a37");
            return (Criteria) this;
        }

        public Criteria andA37NotIn(List<Float> values) {
            addCriterion("a37 not in", values, "a37");
            return (Criteria) this;
        }

        public Criteria andA37Between(Float value1, Float value2) {
            addCriterion("a37 between", value1, value2, "a37");
            return (Criteria) this;
        }

        public Criteria andA37NotBetween(Float value1, Float value2) {
            addCriterion("a37 not between", value1, value2, "a37");
            return (Criteria) this;
        }

        public Criteria andA38IsNull() {
            addCriterion("a38 is null");
            return (Criteria) this;
        }

        public Criteria andA38IsNotNull() {
            addCriterion("a38 is not null");
            return (Criteria) this;
        }

        public Criteria andA38EqualTo(Float value) {
            addCriterion("a38 =", value, "a38");
            return (Criteria) this;
        }

        public Criteria andA38NotEqualTo(Float value) {
            addCriterion("a38 <>", value, "a38");
            return (Criteria) this;
        }

        public Criteria andA38GreaterThan(Float value) {
            addCriterion("a38 >", value, "a38");
            return (Criteria) this;
        }

        public Criteria andA38GreaterThanOrEqualTo(Float value) {
            addCriterion("a38 >=", value, "a38");
            return (Criteria) this;
        }

        public Criteria andA38LessThan(Float value) {
            addCriterion("a38 <", value, "a38");
            return (Criteria) this;
        }

        public Criteria andA38LessThanOrEqualTo(Float value) {
            addCriterion("a38 <=", value, "a38");
            return (Criteria) this;
        }

        public Criteria andA38In(List<Float> values) {
            addCriterion("a38 in", values, "a38");
            return (Criteria) this;
        }

        public Criteria andA38NotIn(List<Float> values) {
            addCriterion("a38 not in", values, "a38");
            return (Criteria) this;
        }

        public Criteria andA38Between(Float value1, Float value2) {
            addCriterion("a38 between", value1, value2, "a38");
            return (Criteria) this;
        }

        public Criteria andA38NotBetween(Float value1, Float value2) {
            addCriterion("a38 not between", value1, value2, "a38");
            return (Criteria) this;
        }

        public Criteria andA107IsNull() {
            addCriterion("a107 is null");
            return (Criteria) this;
        }

        public Criteria andA107IsNotNull() {
            addCriterion("a107 is not null");
            return (Criteria) this;
        }

        public Criteria andA107EqualTo(Float value) {
            addCriterion("a107 =", value, "a107");
            return (Criteria) this;
        }

        public Criteria andA107NotEqualTo(Float value) {
            addCriterion("a107 <>", value, "a107");
            return (Criteria) this;
        }

        public Criteria andA107GreaterThan(Float value) {
            addCriterion("a107 >", value, "a107");
            return (Criteria) this;
        }

        public Criteria andA107GreaterThanOrEqualTo(Float value) {
            addCriterion("a107 >=", value, "a107");
            return (Criteria) this;
        }

        public Criteria andA107LessThan(Float value) {
            addCriterion("a107 <", value, "a107");
            return (Criteria) this;
        }

        public Criteria andA107LessThanOrEqualTo(Float value) {
            addCriterion("a107 <=", value, "a107");
            return (Criteria) this;
        }

        public Criteria andA107In(List<Float> values) {
            addCriterion("a107 in", values, "a107");
            return (Criteria) this;
        }

        public Criteria andA107NotIn(List<Float> values) {
            addCriterion("a107 not in", values, "a107");
            return (Criteria) this;
        }

        public Criteria andA107Between(Float value1, Float value2) {
            addCriterion("a107 between", value1, value2, "a107");
            return (Criteria) this;
        }

        public Criteria andA107NotBetween(Float value1, Float value2) {
            addCriterion("a107 not between", value1, value2, "a107");
            return (Criteria) this;
        }

        public Criteria andA121IsNull() {
            addCriterion("a121 is null");
            return (Criteria) this;
        }

        public Criteria andA121IsNotNull() {
            addCriterion("a121 is not null");
            return (Criteria) this;
        }

        public Criteria andA121EqualTo(Float value) {
            addCriterion("a121 =", value, "a121");
            return (Criteria) this;
        }

        public Criteria andA121NotEqualTo(Float value) {
            addCriterion("a121 <>", value, "a121");
            return (Criteria) this;
        }

        public Criteria andA121GreaterThan(Float value) {
            addCriterion("a121 >", value, "a121");
            return (Criteria) this;
        }

        public Criteria andA121GreaterThanOrEqualTo(Float value) {
            addCriterion("a121 >=", value, "a121");
            return (Criteria) this;
        }

        public Criteria andA121LessThan(Float value) {
            addCriterion("a121 <", value, "a121");
            return (Criteria) this;
        }

        public Criteria andA121LessThanOrEqualTo(Float value) {
            addCriterion("a121 <=", value, "a121");
            return (Criteria) this;
        }

        public Criteria andA121In(List<Float> values) {
            addCriterion("a121 in", values, "a121");
            return (Criteria) this;
        }

        public Criteria andA121NotIn(List<Float> values) {
            addCriterion("a121 not in", values, "a121");
            return (Criteria) this;
        }

        public Criteria andA121Between(Float value1, Float value2) {
            addCriterion("a121 between", value1, value2, "a121");
            return (Criteria) this;
        }

        public Criteria andA121NotBetween(Float value1, Float value2) {
            addCriterion("a121 not between", value1, value2, "a121");
            return (Criteria) this;
        }

        public Criteria andA39IsNull() {
            addCriterion("a39 is null");
            return (Criteria) this;
        }

        public Criteria andA39IsNotNull() {
            addCriterion("a39 is not null");
            return (Criteria) this;
        }

        public Criteria andA39EqualTo(Float value) {
            addCriterion("a39 =", value, "a39");
            return (Criteria) this;
        }

        public Criteria andA39NotEqualTo(Float value) {
            addCriterion("a39 <>", value, "a39");
            return (Criteria) this;
        }

        public Criteria andA39GreaterThan(Float value) {
            addCriterion("a39 >", value, "a39");
            return (Criteria) this;
        }

        public Criteria andA39GreaterThanOrEqualTo(Float value) {
            addCriterion("a39 >=", value, "a39");
            return (Criteria) this;
        }

        public Criteria andA39LessThan(Float value) {
            addCriterion("a39 <", value, "a39");
            return (Criteria) this;
        }

        public Criteria andA39LessThanOrEqualTo(Float value) {
            addCriterion("a39 <=", value, "a39");
            return (Criteria) this;
        }

        public Criteria andA39In(List<Float> values) {
            addCriterion("a39 in", values, "a39");
            return (Criteria) this;
        }

        public Criteria andA39NotIn(List<Float> values) {
            addCriterion("a39 not in", values, "a39");
            return (Criteria) this;
        }

        public Criteria andA39Between(Float value1, Float value2) {
            addCriterion("a39 between", value1, value2, "a39");
            return (Criteria) this;
        }

        public Criteria andA39NotBetween(Float value1, Float value2) {
            addCriterion("a39 not between", value1, value2, "a39");
            return (Criteria) this;
        }

        public Criteria andA40IsNull() {
            addCriterion("a40 is null");
            return (Criteria) this;
        }

        public Criteria andA40IsNotNull() {
            addCriterion("a40 is not null");
            return (Criteria) this;
        }

        public Criteria andA40EqualTo(Float value) {
            addCriterion("a40 =", value, "a40");
            return (Criteria) this;
        }

        public Criteria andA40NotEqualTo(Float value) {
            addCriterion("a40 <>", value, "a40");
            return (Criteria) this;
        }

        public Criteria andA40GreaterThan(Float value) {
            addCriterion("a40 >", value, "a40");
            return (Criteria) this;
        }

        public Criteria andA40GreaterThanOrEqualTo(Float value) {
            addCriterion("a40 >=", value, "a40");
            return (Criteria) this;
        }

        public Criteria andA40LessThan(Float value) {
            addCriterion("a40 <", value, "a40");
            return (Criteria) this;
        }

        public Criteria andA40LessThanOrEqualTo(Float value) {
            addCriterion("a40 <=", value, "a40");
            return (Criteria) this;
        }

        public Criteria andA40In(List<Float> values) {
            addCriterion("a40 in", values, "a40");
            return (Criteria) this;
        }

        public Criteria andA40NotIn(List<Float> values) {
            addCriterion("a40 not in", values, "a40");
            return (Criteria) this;
        }

        public Criteria andA40Between(Float value1, Float value2) {
            addCriterion("a40 between", value1, value2, "a40");
            return (Criteria) this;
        }

        public Criteria andA40NotBetween(Float value1, Float value2) {
            addCriterion("a40 not between", value1, value2, "a40");
            return (Criteria) this;
        }

        public Criteria andA108IsNull() {
            addCriterion("a108 is null");
            return (Criteria) this;
        }

        public Criteria andA108IsNotNull() {
            addCriterion("a108 is not null");
            return (Criteria) this;
        }

        public Criteria andA108EqualTo(Float value) {
            addCriterion("a108 =", value, "a108");
            return (Criteria) this;
        }

        public Criteria andA108NotEqualTo(Float value) {
            addCriterion("a108 <>", value, "a108");
            return (Criteria) this;
        }

        public Criteria andA108GreaterThan(Float value) {
            addCriterion("a108 >", value, "a108");
            return (Criteria) this;
        }

        public Criteria andA108GreaterThanOrEqualTo(Float value) {
            addCriterion("a108 >=", value, "a108");
            return (Criteria) this;
        }

        public Criteria andA108LessThan(Float value) {
            addCriterion("a108 <", value, "a108");
            return (Criteria) this;
        }

        public Criteria andA108LessThanOrEqualTo(Float value) {
            addCriterion("a108 <=", value, "a108");
            return (Criteria) this;
        }

        public Criteria andA108In(List<Float> values) {
            addCriterion("a108 in", values, "a108");
            return (Criteria) this;
        }

        public Criteria andA108NotIn(List<Float> values) {
            addCriterion("a108 not in", values, "a108");
            return (Criteria) this;
        }

        public Criteria andA108Between(Float value1, Float value2) {
            addCriterion("a108 between", value1, value2, "a108");
            return (Criteria) this;
        }

        public Criteria andA108NotBetween(Float value1, Float value2) {
            addCriterion("a108 not between", value1, value2, "a108");
            return (Criteria) this;
        }

        public Criteria andA122IsNull() {
            addCriterion("a122 is null");
            return (Criteria) this;
        }

        public Criteria andA122IsNotNull() {
            addCriterion("a122 is not null");
            return (Criteria) this;
        }

        public Criteria andA122EqualTo(Float value) {
            addCriterion("a122 =", value, "a122");
            return (Criteria) this;
        }

        public Criteria andA122NotEqualTo(Float value) {
            addCriterion("a122 <>", value, "a122");
            return (Criteria) this;
        }

        public Criteria andA122GreaterThan(Float value) {
            addCriterion("a122 >", value, "a122");
            return (Criteria) this;
        }

        public Criteria andA122GreaterThanOrEqualTo(Float value) {
            addCriterion("a122 >=", value, "a122");
            return (Criteria) this;
        }

        public Criteria andA122LessThan(Float value) {
            addCriterion("a122 <", value, "a122");
            return (Criteria) this;
        }

        public Criteria andA122LessThanOrEqualTo(Float value) {
            addCriterion("a122 <=", value, "a122");
            return (Criteria) this;
        }

        public Criteria andA122In(List<Float> values) {
            addCriterion("a122 in", values, "a122");
            return (Criteria) this;
        }

        public Criteria andA122NotIn(List<Float> values) {
            addCriterion("a122 not in", values, "a122");
            return (Criteria) this;
        }

        public Criteria andA122Between(Float value1, Float value2) {
            addCriterion("a122 between", value1, value2, "a122");
            return (Criteria) this;
        }

        public Criteria andA122NotBetween(Float value1, Float value2) {
            addCriterion("a122 not between", value1, value2, "a122");
            return (Criteria) this;
        }

        public Criteria andA41IsNull() {
            addCriterion("a41 is null");
            return (Criteria) this;
        }

        public Criteria andA41IsNotNull() {
            addCriterion("a41 is not null");
            return (Criteria) this;
        }

        public Criteria andA41EqualTo(Float value) {
            addCriterion("a41 =", value, "a41");
            return (Criteria) this;
        }

        public Criteria andA41NotEqualTo(Float value) {
            addCriterion("a41 <>", value, "a41");
            return (Criteria) this;
        }

        public Criteria andA41GreaterThan(Float value) {
            addCriterion("a41 >", value, "a41");
            return (Criteria) this;
        }

        public Criteria andA41GreaterThanOrEqualTo(Float value) {
            addCriterion("a41 >=", value, "a41");
            return (Criteria) this;
        }

        public Criteria andA41LessThan(Float value) {
            addCriterion("a41 <", value, "a41");
            return (Criteria) this;
        }

        public Criteria andA41LessThanOrEqualTo(Float value) {
            addCriterion("a41 <=", value, "a41");
            return (Criteria) this;
        }

        public Criteria andA41In(List<Float> values) {
            addCriterion("a41 in", values, "a41");
            return (Criteria) this;
        }

        public Criteria andA41NotIn(List<Float> values) {
            addCriterion("a41 not in", values, "a41");
            return (Criteria) this;
        }

        public Criteria andA41Between(Float value1, Float value2) {
            addCriterion("a41 between", value1, value2, "a41");
            return (Criteria) this;
        }

        public Criteria andA41NotBetween(Float value1, Float value2) {
            addCriterion("a41 not between", value1, value2, "a41");
            return (Criteria) this;
        }

        public Criteria andA42IsNull() {
            addCriterion("a42 is null");
            return (Criteria) this;
        }

        public Criteria andA42IsNotNull() {
            addCriterion("a42 is not null");
            return (Criteria) this;
        }

        public Criteria andA42EqualTo(Float value) {
            addCriterion("a42 =", value, "a42");
            return (Criteria) this;
        }

        public Criteria andA42NotEqualTo(Float value) {
            addCriterion("a42 <>", value, "a42");
            return (Criteria) this;
        }

        public Criteria andA42GreaterThan(Float value) {
            addCriterion("a42 >", value, "a42");
            return (Criteria) this;
        }

        public Criteria andA42GreaterThanOrEqualTo(Float value) {
            addCriterion("a42 >=", value, "a42");
            return (Criteria) this;
        }

        public Criteria andA42LessThan(Float value) {
            addCriterion("a42 <", value, "a42");
            return (Criteria) this;
        }

        public Criteria andA42LessThanOrEqualTo(Float value) {
            addCriterion("a42 <=", value, "a42");
            return (Criteria) this;
        }

        public Criteria andA42In(List<Float> values) {
            addCriterion("a42 in", values, "a42");
            return (Criteria) this;
        }

        public Criteria andA42NotIn(List<Float> values) {
            addCriterion("a42 not in", values, "a42");
            return (Criteria) this;
        }

        public Criteria andA42Between(Float value1, Float value2) {
            addCriterion("a42 between", value1, value2, "a42");
            return (Criteria) this;
        }

        public Criteria andA42NotBetween(Float value1, Float value2) {
            addCriterion("a42 not between", value1, value2, "a42");
            return (Criteria) this;
        }

        public Criteria andA109IsNull() {
            addCriterion("a109 is null");
            return (Criteria) this;
        }

        public Criteria andA109IsNotNull() {
            addCriterion("a109 is not null");
            return (Criteria) this;
        }

        public Criteria andA109EqualTo(Float value) {
            addCriterion("a109 =", value, "a109");
            return (Criteria) this;
        }

        public Criteria andA109NotEqualTo(Float value) {
            addCriterion("a109 <>", value, "a109");
            return (Criteria) this;
        }

        public Criteria andA109GreaterThan(Float value) {
            addCriterion("a109 >", value, "a109");
            return (Criteria) this;
        }

        public Criteria andA109GreaterThanOrEqualTo(Float value) {
            addCriterion("a109 >=", value, "a109");
            return (Criteria) this;
        }

        public Criteria andA109LessThan(Float value) {
            addCriterion("a109 <", value, "a109");
            return (Criteria) this;
        }

        public Criteria andA109LessThanOrEqualTo(Float value) {
            addCriterion("a109 <=", value, "a109");
            return (Criteria) this;
        }

        public Criteria andA109In(List<Float> values) {
            addCriterion("a109 in", values, "a109");
            return (Criteria) this;
        }

        public Criteria andA109NotIn(List<Float> values) {
            addCriterion("a109 not in", values, "a109");
            return (Criteria) this;
        }

        public Criteria andA109Between(Float value1, Float value2) {
            addCriterion("a109 between", value1, value2, "a109");
            return (Criteria) this;
        }

        public Criteria andA109NotBetween(Float value1, Float value2) {
            addCriterion("a109 not between", value1, value2, "a109");
            return (Criteria) this;
        }

        public Criteria andA123IsNull() {
            addCriterion("a123 is null");
            return (Criteria) this;
        }

        public Criteria andA123IsNotNull() {
            addCriterion("a123 is not null");
            return (Criteria) this;
        }

        public Criteria andA123EqualTo(Float value) {
            addCriterion("a123 =", value, "a123");
            return (Criteria) this;
        }

        public Criteria andA123NotEqualTo(Float value) {
            addCriterion("a123 <>", value, "a123");
            return (Criteria) this;
        }

        public Criteria andA123GreaterThan(Float value) {
            addCriterion("a123 >", value, "a123");
            return (Criteria) this;
        }

        public Criteria andA123GreaterThanOrEqualTo(Float value) {
            addCriterion("a123 >=", value, "a123");
            return (Criteria) this;
        }

        public Criteria andA123LessThan(Float value) {
            addCriterion("a123 <", value, "a123");
            return (Criteria) this;
        }

        public Criteria andA123LessThanOrEqualTo(Float value) {
            addCriterion("a123 <=", value, "a123");
            return (Criteria) this;
        }

        public Criteria andA123In(List<Float> values) {
            addCriterion("a123 in", values, "a123");
            return (Criteria) this;
        }

        public Criteria andA123NotIn(List<Float> values) {
            addCriterion("a123 not in", values, "a123");
            return (Criteria) this;
        }

        public Criteria andA123Between(Float value1, Float value2) {
            addCriterion("a123 between", value1, value2, "a123");
            return (Criteria) this;
        }

        public Criteria andA123NotBetween(Float value1, Float value2) {
            addCriterion("a123 not between", value1, value2, "a123");
            return (Criteria) this;
        }

        public Criteria andA43IsNull() {
            addCriterion("a43 is null");
            return (Criteria) this;
        }

        public Criteria andA43IsNotNull() {
            addCriterion("a43 is not null");
            return (Criteria) this;
        }

        public Criteria andA43EqualTo(Float value) {
            addCriterion("a43 =", value, "a43");
            return (Criteria) this;
        }

        public Criteria andA43NotEqualTo(Float value) {
            addCriterion("a43 <>", value, "a43");
            return (Criteria) this;
        }

        public Criteria andA43GreaterThan(Float value) {
            addCriterion("a43 >", value, "a43");
            return (Criteria) this;
        }

        public Criteria andA43GreaterThanOrEqualTo(Float value) {
            addCriterion("a43 >=", value, "a43");
            return (Criteria) this;
        }

        public Criteria andA43LessThan(Float value) {
            addCriterion("a43 <", value, "a43");
            return (Criteria) this;
        }

        public Criteria andA43LessThanOrEqualTo(Float value) {
            addCriterion("a43 <=", value, "a43");
            return (Criteria) this;
        }

        public Criteria andA43In(List<Float> values) {
            addCriterion("a43 in", values, "a43");
            return (Criteria) this;
        }

        public Criteria andA43NotIn(List<Float> values) {
            addCriterion("a43 not in", values, "a43");
            return (Criteria) this;
        }

        public Criteria andA43Between(Float value1, Float value2) {
            addCriterion("a43 between", value1, value2, "a43");
            return (Criteria) this;
        }

        public Criteria andA43NotBetween(Float value1, Float value2) {
            addCriterion("a43 not between", value1, value2, "a43");
            return (Criteria) this;
        }

        public Criteria andA44IsNull() {
            addCriterion("a44 is null");
            return (Criteria) this;
        }

        public Criteria andA44IsNotNull() {
            addCriterion("a44 is not null");
            return (Criteria) this;
        }

        public Criteria andA44EqualTo(Float value) {
            addCriterion("a44 =", value, "a44");
            return (Criteria) this;
        }

        public Criteria andA44NotEqualTo(Float value) {
            addCriterion("a44 <>", value, "a44");
            return (Criteria) this;
        }

        public Criteria andA44GreaterThan(Float value) {
            addCriterion("a44 >", value, "a44");
            return (Criteria) this;
        }

        public Criteria andA44GreaterThanOrEqualTo(Float value) {
            addCriterion("a44 >=", value, "a44");
            return (Criteria) this;
        }

        public Criteria andA44LessThan(Float value) {
            addCriterion("a44 <", value, "a44");
            return (Criteria) this;
        }

        public Criteria andA44LessThanOrEqualTo(Float value) {
            addCriterion("a44 <=", value, "a44");
            return (Criteria) this;
        }

        public Criteria andA44In(List<Float> values) {
            addCriterion("a44 in", values, "a44");
            return (Criteria) this;
        }

        public Criteria andA44NotIn(List<Float> values) {
            addCriterion("a44 not in", values, "a44");
            return (Criteria) this;
        }

        public Criteria andA44Between(Float value1, Float value2) {
            addCriterion("a44 between", value1, value2, "a44");
            return (Criteria) this;
        }

        public Criteria andA44NotBetween(Float value1, Float value2) {
            addCriterion("a44 not between", value1, value2, "a44");
            return (Criteria) this;
        }

        public Criteria andA110IsNull() {
            addCriterion("a110 is null");
            return (Criteria) this;
        }

        public Criteria andA110IsNotNull() {
            addCriterion("a110 is not null");
            return (Criteria) this;
        }

        public Criteria andA110EqualTo(Float value) {
            addCriterion("a110 =", value, "a110");
            return (Criteria) this;
        }

        public Criteria andA110NotEqualTo(Float value) {
            addCriterion("a110 <>", value, "a110");
            return (Criteria) this;
        }

        public Criteria andA110GreaterThan(Float value) {
            addCriterion("a110 >", value, "a110");
            return (Criteria) this;
        }

        public Criteria andA110GreaterThanOrEqualTo(Float value) {
            addCriterion("a110 >=", value, "a110");
            return (Criteria) this;
        }

        public Criteria andA110LessThan(Float value) {
            addCriterion("a110 <", value, "a110");
            return (Criteria) this;
        }

        public Criteria andA110LessThanOrEqualTo(Float value) {
            addCriterion("a110 <=", value, "a110");
            return (Criteria) this;
        }

        public Criteria andA110In(List<Float> values) {
            addCriterion("a110 in", values, "a110");
            return (Criteria) this;
        }

        public Criteria andA110NotIn(List<Float> values) {
            addCriterion("a110 not in", values, "a110");
            return (Criteria) this;
        }

        public Criteria andA110Between(Float value1, Float value2) {
            addCriterion("a110 between", value1, value2, "a110");
            return (Criteria) this;
        }

        public Criteria andA110NotBetween(Float value1, Float value2) {
            addCriterion("a110 not between", value1, value2, "a110");
            return (Criteria) this;
        }

        public Criteria andA124IsNull() {
            addCriterion("a124 is null");
            return (Criteria) this;
        }

        public Criteria andA124IsNotNull() {
            addCriterion("a124 is not null");
            return (Criteria) this;
        }

        public Criteria andA124EqualTo(Float value) {
            addCriterion("a124 =", value, "a124");
            return (Criteria) this;
        }

        public Criteria andA124NotEqualTo(Float value) {
            addCriterion("a124 <>", value, "a124");
            return (Criteria) this;
        }

        public Criteria andA124GreaterThan(Float value) {
            addCriterion("a124 >", value, "a124");
            return (Criteria) this;
        }

        public Criteria andA124GreaterThanOrEqualTo(Float value) {
            addCriterion("a124 >=", value, "a124");
            return (Criteria) this;
        }

        public Criteria andA124LessThan(Float value) {
            addCriterion("a124 <", value, "a124");
            return (Criteria) this;
        }

        public Criteria andA124LessThanOrEqualTo(Float value) {
            addCriterion("a124 <=", value, "a124");
            return (Criteria) this;
        }

        public Criteria andA124In(List<Float> values) {
            addCriterion("a124 in", values, "a124");
            return (Criteria) this;
        }

        public Criteria andA124NotIn(List<Float> values) {
            addCriterion("a124 not in", values, "a124");
            return (Criteria) this;
        }

        public Criteria andA124Between(Float value1, Float value2) {
            addCriterion("a124 between", value1, value2, "a124");
            return (Criteria) this;
        }

        public Criteria andA124NotBetween(Float value1, Float value2) {
            addCriterion("a124 not between", value1, value2, "a124");
            return (Criteria) this;
        }

        public Criteria andA45IsNull() {
            addCriterion("a45 is null");
            return (Criteria) this;
        }

        public Criteria andA45IsNotNull() {
            addCriterion("a45 is not null");
            return (Criteria) this;
        }

        public Criteria andA45EqualTo(Float value) {
            addCriterion("a45 =", value, "a45");
            return (Criteria) this;
        }

        public Criteria andA45NotEqualTo(Float value) {
            addCriterion("a45 <>", value, "a45");
            return (Criteria) this;
        }

        public Criteria andA45GreaterThan(Float value) {
            addCriterion("a45 >", value, "a45");
            return (Criteria) this;
        }

        public Criteria andA45GreaterThanOrEqualTo(Float value) {
            addCriterion("a45 >=", value, "a45");
            return (Criteria) this;
        }

        public Criteria andA45LessThan(Float value) {
            addCriterion("a45 <", value, "a45");
            return (Criteria) this;
        }

        public Criteria andA45LessThanOrEqualTo(Float value) {
            addCriterion("a45 <=", value, "a45");
            return (Criteria) this;
        }

        public Criteria andA45In(List<Float> values) {
            addCriterion("a45 in", values, "a45");
            return (Criteria) this;
        }

        public Criteria andA45NotIn(List<Float> values) {
            addCriterion("a45 not in", values, "a45");
            return (Criteria) this;
        }

        public Criteria andA45Between(Float value1, Float value2) {
            addCriterion("a45 between", value1, value2, "a45");
            return (Criteria) this;
        }

        public Criteria andA45NotBetween(Float value1, Float value2) {
            addCriterion("a45 not between", value1, value2, "a45");
            return (Criteria) this;
        }

        public Criteria andA46IsNull() {
            addCriterion("a46 is null");
            return (Criteria) this;
        }

        public Criteria andA46IsNotNull() {
            addCriterion("a46 is not null");
            return (Criteria) this;
        }

        public Criteria andA46EqualTo(Float value) {
            addCriterion("a46 =", value, "a46");
            return (Criteria) this;
        }

        public Criteria andA46NotEqualTo(Float value) {
            addCriterion("a46 <>", value, "a46");
            return (Criteria) this;
        }

        public Criteria andA46GreaterThan(Float value) {
            addCriterion("a46 >", value, "a46");
            return (Criteria) this;
        }

        public Criteria andA46GreaterThanOrEqualTo(Float value) {
            addCriterion("a46 >=", value, "a46");
            return (Criteria) this;
        }

        public Criteria andA46LessThan(Float value) {
            addCriterion("a46 <", value, "a46");
            return (Criteria) this;
        }

        public Criteria andA46LessThanOrEqualTo(Float value) {
            addCriterion("a46 <=", value, "a46");
            return (Criteria) this;
        }

        public Criteria andA46In(List<Float> values) {
            addCriterion("a46 in", values, "a46");
            return (Criteria) this;
        }

        public Criteria andA46NotIn(List<Float> values) {
            addCriterion("a46 not in", values, "a46");
            return (Criteria) this;
        }

        public Criteria andA46Between(Float value1, Float value2) {
            addCriterion("a46 between", value1, value2, "a46");
            return (Criteria) this;
        }

        public Criteria andA46NotBetween(Float value1, Float value2) {
            addCriterion("a46 not between", value1, value2, "a46");
            return (Criteria) this;
        }

        public Criteria andA111IsNull() {
            addCriterion("a111 is null");
            return (Criteria) this;
        }

        public Criteria andA111IsNotNull() {
            addCriterion("a111 is not null");
            return (Criteria) this;
        }

        public Criteria andA111EqualTo(Float value) {
            addCriterion("a111 =", value, "a111");
            return (Criteria) this;
        }

        public Criteria andA111NotEqualTo(Float value) {
            addCriterion("a111 <>", value, "a111");
            return (Criteria) this;
        }

        public Criteria andA111GreaterThan(Float value) {
            addCriterion("a111 >", value, "a111");
            return (Criteria) this;
        }

        public Criteria andA111GreaterThanOrEqualTo(Float value) {
            addCriterion("a111 >=", value, "a111");
            return (Criteria) this;
        }

        public Criteria andA111LessThan(Float value) {
            addCriterion("a111 <", value, "a111");
            return (Criteria) this;
        }

        public Criteria andA111LessThanOrEqualTo(Float value) {
            addCriterion("a111 <=", value, "a111");
            return (Criteria) this;
        }

        public Criteria andA111In(List<Float> values) {
            addCriterion("a111 in", values, "a111");
            return (Criteria) this;
        }

        public Criteria andA111NotIn(List<Float> values) {
            addCriterion("a111 not in", values, "a111");
            return (Criteria) this;
        }

        public Criteria andA111Between(Float value1, Float value2) {
            addCriterion("a111 between", value1, value2, "a111");
            return (Criteria) this;
        }

        public Criteria andA111NotBetween(Float value1, Float value2) {
            addCriterion("a111 not between", value1, value2, "a111");
            return (Criteria) this;
        }

        public Criteria andA125IsNull() {
            addCriterion("a125 is null");
            return (Criteria) this;
        }

        public Criteria andA125IsNotNull() {
            addCriterion("a125 is not null");
            return (Criteria) this;
        }

        public Criteria andA125EqualTo(Float value) {
            addCriterion("a125 =", value, "a125");
            return (Criteria) this;
        }

        public Criteria andA125NotEqualTo(Float value) {
            addCriterion("a125 <>", value, "a125");
            return (Criteria) this;
        }

        public Criteria andA125GreaterThan(Float value) {
            addCriterion("a125 >", value, "a125");
            return (Criteria) this;
        }

        public Criteria andA125GreaterThanOrEqualTo(Float value) {
            addCriterion("a125 >=", value, "a125");
            return (Criteria) this;
        }

        public Criteria andA125LessThan(Float value) {
            addCriterion("a125 <", value, "a125");
            return (Criteria) this;
        }

        public Criteria andA125LessThanOrEqualTo(Float value) {
            addCriterion("a125 <=", value, "a125");
            return (Criteria) this;
        }

        public Criteria andA125In(List<Float> values) {
            addCriterion("a125 in", values, "a125");
            return (Criteria) this;
        }

        public Criteria andA125NotIn(List<Float> values) {
            addCriterion("a125 not in", values, "a125");
            return (Criteria) this;
        }

        public Criteria andA125Between(Float value1, Float value2) {
            addCriterion("a125 between", value1, value2, "a125");
            return (Criteria) this;
        }

        public Criteria andA125NotBetween(Float value1, Float value2) {
            addCriterion("a125 not between", value1, value2, "a125");
            return (Criteria) this;
        }

        public Criteria andA47IsNull() {
            addCriterion("a47 is null");
            return (Criteria) this;
        }

        public Criteria andA47IsNotNull() {
            addCriterion("a47 is not null");
            return (Criteria) this;
        }

        public Criteria andA47EqualTo(Float value) {
            addCriterion("a47 =", value, "a47");
            return (Criteria) this;
        }

        public Criteria andA47NotEqualTo(Float value) {
            addCriterion("a47 <>", value, "a47");
            return (Criteria) this;
        }

        public Criteria andA47GreaterThan(Float value) {
            addCriterion("a47 >", value, "a47");
            return (Criteria) this;
        }

        public Criteria andA47GreaterThanOrEqualTo(Float value) {
            addCriterion("a47 >=", value, "a47");
            return (Criteria) this;
        }

        public Criteria andA47LessThan(Float value) {
            addCriterion("a47 <", value, "a47");
            return (Criteria) this;
        }

        public Criteria andA47LessThanOrEqualTo(Float value) {
            addCriterion("a47 <=", value, "a47");
            return (Criteria) this;
        }

        public Criteria andA47In(List<Float> values) {
            addCriterion("a47 in", values, "a47");
            return (Criteria) this;
        }

        public Criteria andA47NotIn(List<Float> values) {
            addCriterion("a47 not in", values, "a47");
            return (Criteria) this;
        }

        public Criteria andA47Between(Float value1, Float value2) {
            addCriterion("a47 between", value1, value2, "a47");
            return (Criteria) this;
        }

        public Criteria andA47NotBetween(Float value1, Float value2) {
            addCriterion("a47 not between", value1, value2, "a47");
            return (Criteria) this;
        }

        public Criteria andA48IsNull() {
            addCriterion("a48 is null");
            return (Criteria) this;
        }

        public Criteria andA48IsNotNull() {
            addCriterion("a48 is not null");
            return (Criteria) this;
        }

        public Criteria andA48EqualTo(Float value) {
            addCriterion("a48 =", value, "a48");
            return (Criteria) this;
        }

        public Criteria andA48NotEqualTo(Float value) {
            addCriterion("a48 <>", value, "a48");
            return (Criteria) this;
        }

        public Criteria andA48GreaterThan(Float value) {
            addCriterion("a48 >", value, "a48");
            return (Criteria) this;
        }

        public Criteria andA48GreaterThanOrEqualTo(Float value) {
            addCriterion("a48 >=", value, "a48");
            return (Criteria) this;
        }

        public Criteria andA48LessThan(Float value) {
            addCriterion("a48 <", value, "a48");
            return (Criteria) this;
        }

        public Criteria andA48LessThanOrEqualTo(Float value) {
            addCriterion("a48 <=", value, "a48");
            return (Criteria) this;
        }

        public Criteria andA48In(List<Float> values) {
            addCriterion("a48 in", values, "a48");
            return (Criteria) this;
        }

        public Criteria andA48NotIn(List<Float> values) {
            addCriterion("a48 not in", values, "a48");
            return (Criteria) this;
        }

        public Criteria andA48Between(Float value1, Float value2) {
            addCriterion("a48 between", value1, value2, "a48");
            return (Criteria) this;
        }

        public Criteria andA48NotBetween(Float value1, Float value2) {
            addCriterion("a48 not between", value1, value2, "a48");
            return (Criteria) this;
        }

        public Criteria andA112IsNull() {
            addCriterion("a112 is null");
            return (Criteria) this;
        }

        public Criteria andA112IsNotNull() {
            addCriterion("a112 is not null");
            return (Criteria) this;
        }

        public Criteria andA112EqualTo(Float value) {
            addCriterion("a112 =", value, "a112");
            return (Criteria) this;
        }

        public Criteria andA112NotEqualTo(Float value) {
            addCriterion("a112 <>", value, "a112");
            return (Criteria) this;
        }

        public Criteria andA112GreaterThan(Float value) {
            addCriterion("a112 >", value, "a112");
            return (Criteria) this;
        }

        public Criteria andA112GreaterThanOrEqualTo(Float value) {
            addCriterion("a112 >=", value, "a112");
            return (Criteria) this;
        }

        public Criteria andA112LessThan(Float value) {
            addCriterion("a112 <", value, "a112");
            return (Criteria) this;
        }

        public Criteria andA112LessThanOrEqualTo(Float value) {
            addCriterion("a112 <=", value, "a112");
            return (Criteria) this;
        }

        public Criteria andA112In(List<Float> values) {
            addCriterion("a112 in", values, "a112");
            return (Criteria) this;
        }

        public Criteria andA112NotIn(List<Float> values) {
            addCriterion("a112 not in", values, "a112");
            return (Criteria) this;
        }

        public Criteria andA112Between(Float value1, Float value2) {
            addCriterion("a112 between", value1, value2, "a112");
            return (Criteria) this;
        }

        public Criteria andA112NotBetween(Float value1, Float value2) {
            addCriterion("a112 not between", value1, value2, "a112");
            return (Criteria) this;
        }

        public Criteria andA126IsNull() {
            addCriterion("a126 is null");
            return (Criteria) this;
        }

        public Criteria andA126IsNotNull() {
            addCriterion("a126 is not null");
            return (Criteria) this;
        }

        public Criteria andA126EqualTo(Float value) {
            addCriterion("a126 =", value, "a126");
            return (Criteria) this;
        }

        public Criteria andA126NotEqualTo(Float value) {
            addCriterion("a126 <>", value, "a126");
            return (Criteria) this;
        }

        public Criteria andA126GreaterThan(Float value) {
            addCriterion("a126 >", value, "a126");
            return (Criteria) this;
        }

        public Criteria andA126GreaterThanOrEqualTo(Float value) {
            addCriterion("a126 >=", value, "a126");
            return (Criteria) this;
        }

        public Criteria andA126LessThan(Float value) {
            addCriterion("a126 <", value, "a126");
            return (Criteria) this;
        }

        public Criteria andA126LessThanOrEqualTo(Float value) {
            addCriterion("a126 <=", value, "a126");
            return (Criteria) this;
        }

        public Criteria andA126In(List<Float> values) {
            addCriterion("a126 in", values, "a126");
            return (Criteria) this;
        }

        public Criteria andA126NotIn(List<Float> values) {
            addCriterion("a126 not in", values, "a126");
            return (Criteria) this;
        }

        public Criteria andA126Between(Float value1, Float value2) {
            addCriterion("a126 between", value1, value2, "a126");
            return (Criteria) this;
        }

        public Criteria andA126NotBetween(Float value1, Float value2) {
            addCriterion("a126 not between", value1, value2, "a126");
            return (Criteria) this;
        }

        public Criteria andA49IsNull() {
            addCriterion("a49 is null");
            return (Criteria) this;
        }

        public Criteria andA49IsNotNull() {
            addCriterion("a49 is not null");
            return (Criteria) this;
        }

        public Criteria andA49EqualTo(Float value) {
            addCriterion("a49 =", value, "a49");
            return (Criteria) this;
        }

        public Criteria andA49NotEqualTo(Float value) {
            addCriterion("a49 <>", value, "a49");
            return (Criteria) this;
        }

        public Criteria andA49GreaterThan(Float value) {
            addCriterion("a49 >", value, "a49");
            return (Criteria) this;
        }

        public Criteria andA49GreaterThanOrEqualTo(Float value) {
            addCriterion("a49 >=", value, "a49");
            return (Criteria) this;
        }

        public Criteria andA49LessThan(Float value) {
            addCriterion("a49 <", value, "a49");
            return (Criteria) this;
        }

        public Criteria andA49LessThanOrEqualTo(Float value) {
            addCriterion("a49 <=", value, "a49");
            return (Criteria) this;
        }

        public Criteria andA49In(List<Float> values) {
            addCriterion("a49 in", values, "a49");
            return (Criteria) this;
        }

        public Criteria andA49NotIn(List<Float> values) {
            addCriterion("a49 not in", values, "a49");
            return (Criteria) this;
        }

        public Criteria andA49Between(Float value1, Float value2) {
            addCriterion("a49 between", value1, value2, "a49");
            return (Criteria) this;
        }

        public Criteria andA49NotBetween(Float value1, Float value2) {
            addCriterion("a49 not between", value1, value2, "a49");
            return (Criteria) this;
        }

        public Criteria andA50IsNull() {
            addCriterion("a50 is null");
            return (Criteria) this;
        }

        public Criteria andA50IsNotNull() {
            addCriterion("a50 is not null");
            return (Criteria) this;
        }

        public Criteria andA50EqualTo(Float value) {
            addCriterion("a50 =", value, "a50");
            return (Criteria) this;
        }

        public Criteria andA50NotEqualTo(Float value) {
            addCriterion("a50 <>", value, "a50");
            return (Criteria) this;
        }

        public Criteria andA50GreaterThan(Float value) {
            addCriterion("a50 >", value, "a50");
            return (Criteria) this;
        }

        public Criteria andA50GreaterThanOrEqualTo(Float value) {
            addCriterion("a50 >=", value, "a50");
            return (Criteria) this;
        }

        public Criteria andA50LessThan(Float value) {
            addCriterion("a50 <", value, "a50");
            return (Criteria) this;
        }

        public Criteria andA50LessThanOrEqualTo(Float value) {
            addCriterion("a50 <=", value, "a50");
            return (Criteria) this;
        }

        public Criteria andA50In(List<Float> values) {
            addCriterion("a50 in", values, "a50");
            return (Criteria) this;
        }

        public Criteria andA50NotIn(List<Float> values) {
            addCriterion("a50 not in", values, "a50");
            return (Criteria) this;
        }

        public Criteria andA50Between(Float value1, Float value2) {
            addCriterion("a50 between", value1, value2, "a50");
            return (Criteria) this;
        }

        public Criteria andA50NotBetween(Float value1, Float value2) {
            addCriterion("a50 not between", value1, value2, "a50");
            return (Criteria) this;
        }

        public Criteria andA113IsNull() {
            addCriterion("a113 is null");
            return (Criteria) this;
        }

        public Criteria andA113IsNotNull() {
            addCriterion("a113 is not null");
            return (Criteria) this;
        }

        public Criteria andA113EqualTo(Float value) {
            addCriterion("a113 =", value, "a113");
            return (Criteria) this;
        }

        public Criteria andA113NotEqualTo(Float value) {
            addCriterion("a113 <>", value, "a113");
            return (Criteria) this;
        }

        public Criteria andA113GreaterThan(Float value) {
            addCriterion("a113 >", value, "a113");
            return (Criteria) this;
        }

        public Criteria andA113GreaterThanOrEqualTo(Float value) {
            addCriterion("a113 >=", value, "a113");
            return (Criteria) this;
        }

        public Criteria andA113LessThan(Float value) {
            addCriterion("a113 <", value, "a113");
            return (Criteria) this;
        }

        public Criteria andA113LessThanOrEqualTo(Float value) {
            addCriterion("a113 <=", value, "a113");
            return (Criteria) this;
        }

        public Criteria andA113In(List<Float> values) {
            addCriterion("a113 in", values, "a113");
            return (Criteria) this;
        }

        public Criteria andA113NotIn(List<Float> values) {
            addCriterion("a113 not in", values, "a113");
            return (Criteria) this;
        }

        public Criteria andA113Between(Float value1, Float value2) {
            addCriterion("a113 between", value1, value2, "a113");
            return (Criteria) this;
        }

        public Criteria andA113NotBetween(Float value1, Float value2) {
            addCriterion("a113 not between", value1, value2, "a113");
            return (Criteria) this;
        }

        public Criteria andA127IsNull() {
            addCriterion("a127 is null");
            return (Criteria) this;
        }

        public Criteria andA127IsNotNull() {
            addCriterion("a127 is not null");
            return (Criteria) this;
        }

        public Criteria andA127EqualTo(Float value) {
            addCriterion("a127 =", value, "a127");
            return (Criteria) this;
        }

        public Criteria andA127NotEqualTo(Float value) {
            addCriterion("a127 <>", value, "a127");
            return (Criteria) this;
        }

        public Criteria andA127GreaterThan(Float value) {
            addCriterion("a127 >", value, "a127");
            return (Criteria) this;
        }

        public Criteria andA127GreaterThanOrEqualTo(Float value) {
            addCriterion("a127 >=", value, "a127");
            return (Criteria) this;
        }

        public Criteria andA127LessThan(Float value) {
            addCriterion("a127 <", value, "a127");
            return (Criteria) this;
        }

        public Criteria andA127LessThanOrEqualTo(Float value) {
            addCriterion("a127 <=", value, "a127");
            return (Criteria) this;
        }

        public Criteria andA127In(List<Float> values) {
            addCriterion("a127 in", values, "a127");
            return (Criteria) this;
        }

        public Criteria andA127NotIn(List<Float> values) {
            addCriterion("a127 not in", values, "a127");
            return (Criteria) this;
        }

        public Criteria andA127Between(Float value1, Float value2) {
            addCriterion("a127 between", value1, value2, "a127");
            return (Criteria) this;
        }

        public Criteria andA127NotBetween(Float value1, Float value2) {
            addCriterion("a127 not between", value1, value2, "a127");
            return (Criteria) this;
        }

        public Criteria andA51IsNull() {
            addCriterion("a51 is null");
            return (Criteria) this;
        }

        public Criteria andA51IsNotNull() {
            addCriterion("a51 is not null");
            return (Criteria) this;
        }

        public Criteria andA51EqualTo(Float value) {
            addCriterion("a51 =", value, "a51");
            return (Criteria) this;
        }

        public Criteria andA51NotEqualTo(Float value) {
            addCriterion("a51 <>", value, "a51");
            return (Criteria) this;
        }

        public Criteria andA51GreaterThan(Float value) {
            addCriterion("a51 >", value, "a51");
            return (Criteria) this;
        }

        public Criteria andA51GreaterThanOrEqualTo(Float value) {
            addCriterion("a51 >=", value, "a51");
            return (Criteria) this;
        }

        public Criteria andA51LessThan(Float value) {
            addCriterion("a51 <", value, "a51");
            return (Criteria) this;
        }

        public Criteria andA51LessThanOrEqualTo(Float value) {
            addCriterion("a51 <=", value, "a51");
            return (Criteria) this;
        }

        public Criteria andA51In(List<Float> values) {
            addCriterion("a51 in", values, "a51");
            return (Criteria) this;
        }

        public Criteria andA51NotIn(List<Float> values) {
            addCriterion("a51 not in", values, "a51");
            return (Criteria) this;
        }

        public Criteria andA51Between(Float value1, Float value2) {
            addCriterion("a51 between", value1, value2, "a51");
            return (Criteria) this;
        }

        public Criteria andA51NotBetween(Float value1, Float value2) {
            addCriterion("a51 not between", value1, value2, "a51");
            return (Criteria) this;
        }

        public Criteria andA52IsNull() {
            addCriterion("a52 is null");
            return (Criteria) this;
        }

        public Criteria andA52IsNotNull() {
            addCriterion("a52 is not null");
            return (Criteria) this;
        }

        public Criteria andA52EqualTo(Float value) {
            addCriterion("a52 =", value, "a52");
            return (Criteria) this;
        }

        public Criteria andA52NotEqualTo(Float value) {
            addCriterion("a52 <>", value, "a52");
            return (Criteria) this;
        }

        public Criteria andA52GreaterThan(Float value) {
            addCriterion("a52 >", value, "a52");
            return (Criteria) this;
        }

        public Criteria andA52GreaterThanOrEqualTo(Float value) {
            addCriterion("a52 >=", value, "a52");
            return (Criteria) this;
        }

        public Criteria andA52LessThan(Float value) {
            addCriterion("a52 <", value, "a52");
            return (Criteria) this;
        }

        public Criteria andA52LessThanOrEqualTo(Float value) {
            addCriterion("a52 <=", value, "a52");
            return (Criteria) this;
        }

        public Criteria andA52In(List<Float> values) {
            addCriterion("a52 in", values, "a52");
            return (Criteria) this;
        }

        public Criteria andA52NotIn(List<Float> values) {
            addCriterion("a52 not in", values, "a52");
            return (Criteria) this;
        }

        public Criteria andA52Between(Float value1, Float value2) {
            addCriterion("a52 between", value1, value2, "a52");
            return (Criteria) this;
        }

        public Criteria andA52NotBetween(Float value1, Float value2) {
            addCriterion("a52 not between", value1, value2, "a52");
            return (Criteria) this;
        }

        public Criteria andA114IsNull() {
            addCriterion("a114 is null");
            return (Criteria) this;
        }

        public Criteria andA114IsNotNull() {
            addCriterion("a114 is not null");
            return (Criteria) this;
        }

        public Criteria andA114EqualTo(Float value) {
            addCriterion("a114 =", value, "a114");
            return (Criteria) this;
        }

        public Criteria andA114NotEqualTo(Float value) {
            addCriterion("a114 <>", value, "a114");
            return (Criteria) this;
        }

        public Criteria andA114GreaterThan(Float value) {
            addCriterion("a114 >", value, "a114");
            return (Criteria) this;
        }

        public Criteria andA114GreaterThanOrEqualTo(Float value) {
            addCriterion("a114 >=", value, "a114");
            return (Criteria) this;
        }

        public Criteria andA114LessThan(Float value) {
            addCriterion("a114 <", value, "a114");
            return (Criteria) this;
        }

        public Criteria andA114LessThanOrEqualTo(Float value) {
            addCriterion("a114 <=", value, "a114");
            return (Criteria) this;
        }

        public Criteria andA114In(List<Float> values) {
            addCriterion("a114 in", values, "a114");
            return (Criteria) this;
        }

        public Criteria andA114NotIn(List<Float> values) {
            addCriterion("a114 not in", values, "a114");
            return (Criteria) this;
        }

        public Criteria andA114Between(Float value1, Float value2) {
            addCriterion("a114 between", value1, value2, "a114");
            return (Criteria) this;
        }

        public Criteria andA114NotBetween(Float value1, Float value2) {
            addCriterion("a114 not between", value1, value2, "a114");
            return (Criteria) this;
        }

        public Criteria andA128IsNull() {
            addCriterion("a128 is null");
            return (Criteria) this;
        }

        public Criteria andA128IsNotNull() {
            addCriterion("a128 is not null");
            return (Criteria) this;
        }

        public Criteria andA128EqualTo(Float value) {
            addCriterion("a128 =", value, "a128");
            return (Criteria) this;
        }

        public Criteria andA128NotEqualTo(Float value) {
            addCriterion("a128 <>", value, "a128");
            return (Criteria) this;
        }

        public Criteria andA128GreaterThan(Float value) {
            addCriterion("a128 >", value, "a128");
            return (Criteria) this;
        }

        public Criteria andA128GreaterThanOrEqualTo(Float value) {
            addCriterion("a128 >=", value, "a128");
            return (Criteria) this;
        }

        public Criteria andA128LessThan(Float value) {
            addCriterion("a128 <", value, "a128");
            return (Criteria) this;
        }

        public Criteria andA128LessThanOrEqualTo(Float value) {
            addCriterion("a128 <=", value, "a128");
            return (Criteria) this;
        }

        public Criteria andA128In(List<Float> values) {
            addCriterion("a128 in", values, "a128");
            return (Criteria) this;
        }

        public Criteria andA128NotIn(List<Float> values) {
            addCriterion("a128 not in", values, "a128");
            return (Criteria) this;
        }

        public Criteria andA128Between(Float value1, Float value2) {
            addCriterion("a128 between", value1, value2, "a128");
            return (Criteria) this;
        }

        public Criteria andA128NotBetween(Float value1, Float value2) {
            addCriterion("a128 not between", value1, value2, "a128");
            return (Criteria) this;
        }

        public Criteria andE1IsNull() {
            addCriterion("e1 is null");
            return (Criteria) this;
        }

        public Criteria andE1IsNotNull() {
            addCriterion("e1 is not null");
            return (Criteria) this;
        }

        public Criteria andE1EqualTo(Float value) {
            addCriterion("e1 =", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1NotEqualTo(Float value) {
            addCriterion("e1 <>", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1GreaterThan(Float value) {
            addCriterion("e1 >", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1GreaterThanOrEqualTo(Float value) {
            addCriterion("e1 >=", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1LessThan(Float value) {
            addCriterion("e1 <", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1LessThanOrEqualTo(Float value) {
            addCriterion("e1 <=", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1In(List<Float> values) {
            addCriterion("e1 in", values, "e1");
            return (Criteria) this;
        }

        public Criteria andE1NotIn(List<Float> values) {
            addCriterion("e1 not in", values, "e1");
            return (Criteria) this;
        }

        public Criteria andE1Between(Float value1, Float value2) {
            addCriterion("e1 between", value1, value2, "e1");
            return (Criteria) this;
        }

        public Criteria andE1NotBetween(Float value1, Float value2) {
            addCriterion("e1 not between", value1, value2, "e1");
            return (Criteria) this;
        }

        public Criteria andE2IsNull() {
            addCriterion("e2 is null");
            return (Criteria) this;
        }

        public Criteria andE2IsNotNull() {
            addCriterion("e2 is not null");
            return (Criteria) this;
        }

        public Criteria andE2EqualTo(Float value) {
            addCriterion("e2 =", value, "e2");
            return (Criteria) this;
        }

        public Criteria andE2NotEqualTo(Float value) {
            addCriterion("e2 <>", value, "e2");
            return (Criteria) this;
        }

        public Criteria andE2GreaterThan(Float value) {
            addCriterion("e2 >", value, "e2");
            return (Criteria) this;
        }

        public Criteria andE2GreaterThanOrEqualTo(Float value) {
            addCriterion("e2 >=", value, "e2");
            return (Criteria) this;
        }

        public Criteria andE2LessThan(Float value) {
            addCriterion("e2 <", value, "e2");
            return (Criteria) this;
        }

        public Criteria andE2LessThanOrEqualTo(Float value) {
            addCriterion("e2 <=", value, "e2");
            return (Criteria) this;
        }

        public Criteria andE2In(List<Float> values) {
            addCriterion("e2 in", values, "e2");
            return (Criteria) this;
        }

        public Criteria andE2NotIn(List<Float> values) {
            addCriterion("e2 not in", values, "e2");
            return (Criteria) this;
        }

        public Criteria andE2Between(Float value1, Float value2) {
            addCriterion("e2 between", value1, value2, "e2");
            return (Criteria) this;
        }

        public Criteria andE2NotBetween(Float value1, Float value2) {
            addCriterion("e2 not between", value1, value2, "e2");
            return (Criteria) this;
        }

        public Criteria andE3IsNull() {
            addCriterion("e3 is null");
            return (Criteria) this;
        }

        public Criteria andE3IsNotNull() {
            addCriterion("e3 is not null");
            return (Criteria) this;
        }

        public Criteria andE3EqualTo(Float value) {
            addCriterion("e3 =", value, "e3");
            return (Criteria) this;
        }

        public Criteria andE3NotEqualTo(Float value) {
            addCriterion("e3 <>", value, "e3");
            return (Criteria) this;
        }

        public Criteria andE3GreaterThan(Float value) {
            addCriterion("e3 >", value, "e3");
            return (Criteria) this;
        }

        public Criteria andE3GreaterThanOrEqualTo(Float value) {
            addCriterion("e3 >=", value, "e3");
            return (Criteria) this;
        }

        public Criteria andE3LessThan(Float value) {
            addCriterion("e3 <", value, "e3");
            return (Criteria) this;
        }

        public Criteria andE3LessThanOrEqualTo(Float value) {
            addCriterion("e3 <=", value, "e3");
            return (Criteria) this;
        }

        public Criteria andE3In(List<Float> values) {
            addCriterion("e3 in", values, "e3");
            return (Criteria) this;
        }

        public Criteria andE3NotIn(List<Float> values) {
            addCriterion("e3 not in", values, "e3");
            return (Criteria) this;
        }

        public Criteria andE3Between(Float value1, Float value2) {
            addCriterion("e3 between", value1, value2, "e3");
            return (Criteria) this;
        }

        public Criteria andE3NotBetween(Float value1, Float value2) {
            addCriterion("e3 not between", value1, value2, "e3");
            return (Criteria) this;
        }

        public Criteria andE4IsNull() {
            addCriterion("e4 is null");
            return (Criteria) this;
        }

        public Criteria andE4IsNotNull() {
            addCriterion("e4 is not null");
            return (Criteria) this;
        }

        public Criteria andE4EqualTo(Float value) {
            addCriterion("e4 =", value, "e4");
            return (Criteria) this;
        }

        public Criteria andE4NotEqualTo(Float value) {
            addCriterion("e4 <>", value, "e4");
            return (Criteria) this;
        }

        public Criteria andE4GreaterThan(Float value) {
            addCriterion("e4 >", value, "e4");
            return (Criteria) this;
        }

        public Criteria andE4GreaterThanOrEqualTo(Float value) {
            addCriterion("e4 >=", value, "e4");
            return (Criteria) this;
        }

        public Criteria andE4LessThan(Float value) {
            addCriterion("e4 <", value, "e4");
            return (Criteria) this;
        }

        public Criteria andE4LessThanOrEqualTo(Float value) {
            addCriterion("e4 <=", value, "e4");
            return (Criteria) this;
        }

        public Criteria andE4In(List<Float> values) {
            addCriterion("e4 in", values, "e4");
            return (Criteria) this;
        }

        public Criteria andE4NotIn(List<Float> values) {
            addCriterion("e4 not in", values, "e4");
            return (Criteria) this;
        }

        public Criteria andE4Between(Float value1, Float value2) {
            addCriterion("e4 between", value1, value2, "e4");
            return (Criteria) this;
        }

        public Criteria andE4NotBetween(Float value1, Float value2) {
            addCriterion("e4 not between", value1, value2, "e4");
            return (Criteria) this;
        }

        public Criteria andE5IsNull() {
            addCriterion("e5 is null");
            return (Criteria) this;
        }

        public Criteria andE5IsNotNull() {
            addCriterion("e5 is not null");
            return (Criteria) this;
        }

        public Criteria andE5EqualTo(Float value) {
            addCriterion("e5 =", value, "e5");
            return (Criteria) this;
        }

        public Criteria andE5NotEqualTo(Float value) {
            addCriterion("e5 <>", value, "e5");
            return (Criteria) this;
        }

        public Criteria andE5GreaterThan(Float value) {
            addCriterion("e5 >", value, "e5");
            return (Criteria) this;
        }

        public Criteria andE5GreaterThanOrEqualTo(Float value) {
            addCriterion("e5 >=", value, "e5");
            return (Criteria) this;
        }

        public Criteria andE5LessThan(Float value) {
            addCriterion("e5 <", value, "e5");
            return (Criteria) this;
        }

        public Criteria andE5LessThanOrEqualTo(Float value) {
            addCriterion("e5 <=", value, "e5");
            return (Criteria) this;
        }

        public Criteria andE5In(List<Float> values) {
            addCriterion("e5 in", values, "e5");
            return (Criteria) this;
        }

        public Criteria andE5NotIn(List<Float> values) {
            addCriterion("e5 not in", values, "e5");
            return (Criteria) this;
        }

        public Criteria andE5Between(Float value1, Float value2) {
            addCriterion("e5 between", value1, value2, "e5");
            return (Criteria) this;
        }

        public Criteria andE5NotBetween(Float value1, Float value2) {
            addCriterion("e5 not between", value1, value2, "e5");
            return (Criteria) this;
        }

        public Criteria andE6IsNull() {
            addCriterion("e6 is null");
            return (Criteria) this;
        }

        public Criteria andE6IsNotNull() {
            addCriterion("e6 is not null");
            return (Criteria) this;
        }

        public Criteria andE6EqualTo(Float value) {
            addCriterion("e6 =", value, "e6");
            return (Criteria) this;
        }

        public Criteria andE6NotEqualTo(Float value) {
            addCriterion("e6 <>", value, "e6");
            return (Criteria) this;
        }

        public Criteria andE6GreaterThan(Float value) {
            addCriterion("e6 >", value, "e6");
            return (Criteria) this;
        }

        public Criteria andE6GreaterThanOrEqualTo(Float value) {
            addCriterion("e6 >=", value, "e6");
            return (Criteria) this;
        }

        public Criteria andE6LessThan(Float value) {
            addCriterion("e6 <", value, "e6");
            return (Criteria) this;
        }

        public Criteria andE6LessThanOrEqualTo(Float value) {
            addCriterion("e6 <=", value, "e6");
            return (Criteria) this;
        }

        public Criteria andE6In(List<Float> values) {
            addCriterion("e6 in", values, "e6");
            return (Criteria) this;
        }

        public Criteria andE6NotIn(List<Float> values) {
            addCriterion("e6 not in", values, "e6");
            return (Criteria) this;
        }

        public Criteria andE6Between(Float value1, Float value2) {
            addCriterion("e6 between", value1, value2, "e6");
            return (Criteria) this;
        }

        public Criteria andE6NotBetween(Float value1, Float value2) {
            addCriterion("e6 not between", value1, value2, "e6");
            return (Criteria) this;
        }

        public Criteria andE7IsNull() {
            addCriterion("e7 is null");
            return (Criteria) this;
        }

        public Criteria andE7IsNotNull() {
            addCriterion("e7 is not null");
            return (Criteria) this;
        }

        public Criteria andE7EqualTo(Float value) {
            addCriterion("e7 =", value, "e7");
            return (Criteria) this;
        }

        public Criteria andE7NotEqualTo(Float value) {
            addCriterion("e7 <>", value, "e7");
            return (Criteria) this;
        }

        public Criteria andE7GreaterThan(Float value) {
            addCriterion("e7 >", value, "e7");
            return (Criteria) this;
        }

        public Criteria andE7GreaterThanOrEqualTo(Float value) {
            addCriterion("e7 >=", value, "e7");
            return (Criteria) this;
        }

        public Criteria andE7LessThan(Float value) {
            addCriterion("e7 <", value, "e7");
            return (Criteria) this;
        }

        public Criteria andE7LessThanOrEqualTo(Float value) {
            addCriterion("e7 <=", value, "e7");
            return (Criteria) this;
        }

        public Criteria andE7In(List<Float> values) {
            addCriterion("e7 in", values, "e7");
            return (Criteria) this;
        }

        public Criteria andE7NotIn(List<Float> values) {
            addCriterion("e7 not in", values, "e7");
            return (Criteria) this;
        }

        public Criteria andE7Between(Float value1, Float value2) {
            addCriterion("e7 between", value1, value2, "e7");
            return (Criteria) this;
        }

        public Criteria andE7NotBetween(Float value1, Float value2) {
            addCriterion("e7 not between", value1, value2, "e7");
            return (Criteria) this;
        }

        public Criteria andE8IsNull() {
            addCriterion("e8 is null");
            return (Criteria) this;
        }

        public Criteria andE8IsNotNull() {
            addCriterion("e8 is not null");
            return (Criteria) this;
        }

        public Criteria andE8EqualTo(Float value) {
            addCriterion("e8 =", value, "e8");
            return (Criteria) this;
        }

        public Criteria andE8NotEqualTo(Float value) {
            addCriterion("e8 <>", value, "e8");
            return (Criteria) this;
        }

        public Criteria andE8GreaterThan(Float value) {
            addCriterion("e8 >", value, "e8");
            return (Criteria) this;
        }

        public Criteria andE8GreaterThanOrEqualTo(Float value) {
            addCriterion("e8 >=", value, "e8");
            return (Criteria) this;
        }

        public Criteria andE8LessThan(Float value) {
            addCriterion("e8 <", value, "e8");
            return (Criteria) this;
        }

        public Criteria andE8LessThanOrEqualTo(Float value) {
            addCriterion("e8 <=", value, "e8");
            return (Criteria) this;
        }

        public Criteria andE8In(List<Float> values) {
            addCriterion("e8 in", values, "e8");
            return (Criteria) this;
        }

        public Criteria andE8NotIn(List<Float> values) {
            addCriterion("e8 not in", values, "e8");
            return (Criteria) this;
        }

        public Criteria andE8Between(Float value1, Float value2) {
            addCriterion("e8 between", value1, value2, "e8");
            return (Criteria) this;
        }

        public Criteria andE8NotBetween(Float value1, Float value2) {
            addCriterion("e8 not between", value1, value2, "e8");
            return (Criteria) this;
        }

        public Criteria andE9IsNull() {
            addCriterion("e9 is null");
            return (Criteria) this;
        }

        public Criteria andE9IsNotNull() {
            addCriterion("e9 is not null");
            return (Criteria) this;
        }

        public Criteria andE9EqualTo(Float value) {
            addCriterion("e9 =", value, "e9");
            return (Criteria) this;
        }

        public Criteria andE9NotEqualTo(Float value) {
            addCriterion("e9 <>", value, "e9");
            return (Criteria) this;
        }

        public Criteria andE9GreaterThan(Float value) {
            addCriterion("e9 >", value, "e9");
            return (Criteria) this;
        }

        public Criteria andE9GreaterThanOrEqualTo(Float value) {
            addCriterion("e9 >=", value, "e9");
            return (Criteria) this;
        }

        public Criteria andE9LessThan(Float value) {
            addCriterion("e9 <", value, "e9");
            return (Criteria) this;
        }

        public Criteria andE9LessThanOrEqualTo(Float value) {
            addCriterion("e9 <=", value, "e9");
            return (Criteria) this;
        }

        public Criteria andE9In(List<Float> values) {
            addCriterion("e9 in", values, "e9");
            return (Criteria) this;
        }

        public Criteria andE9NotIn(List<Float> values) {
            addCriterion("e9 not in", values, "e9");
            return (Criteria) this;
        }

        public Criteria andE9Between(Float value1, Float value2) {
            addCriterion("e9 between", value1, value2, "e9");
            return (Criteria) this;
        }

        public Criteria andE9NotBetween(Float value1, Float value2) {
            addCriterion("e9 not between", value1, value2, "e9");
            return (Criteria) this;
        }

        public Criteria andE10IsNull() {
            addCriterion("e10 is null");
            return (Criteria) this;
        }

        public Criteria andE10IsNotNull() {
            addCriterion("e10 is not null");
            return (Criteria) this;
        }

        public Criteria andE10EqualTo(Float value) {
            addCriterion("e10 =", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotEqualTo(Float value) {
            addCriterion("e10 <>", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10GreaterThan(Float value) {
            addCriterion("e10 >", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10GreaterThanOrEqualTo(Float value) {
            addCriterion("e10 >=", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10LessThan(Float value) {
            addCriterion("e10 <", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10LessThanOrEqualTo(Float value) {
            addCriterion("e10 <=", value, "e10");
            return (Criteria) this;
        }

        public Criteria andE10In(List<Float> values) {
            addCriterion("e10 in", values, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotIn(List<Float> values) {
            addCriterion("e10 not in", values, "e10");
            return (Criteria) this;
        }

        public Criteria andE10Between(Float value1, Float value2) {
            addCriterion("e10 between", value1, value2, "e10");
            return (Criteria) this;
        }

        public Criteria andE10NotBetween(Float value1, Float value2) {
            addCriterion("e10 not between", value1, value2, "e10");
            return (Criteria) this;
        }

        public Criteria andE11IsNull() {
            addCriterion("e11 is null");
            return (Criteria) this;
        }

        public Criteria andE11IsNotNull() {
            addCriterion("e11 is not null");
            return (Criteria) this;
        }

        public Criteria andE11EqualTo(Float value) {
            addCriterion("e11 =", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotEqualTo(Float value) {
            addCriterion("e11 <>", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11GreaterThan(Float value) {
            addCriterion("e11 >", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11GreaterThanOrEqualTo(Float value) {
            addCriterion("e11 >=", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11LessThan(Float value) {
            addCriterion("e11 <", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11LessThanOrEqualTo(Float value) {
            addCriterion("e11 <=", value, "e11");
            return (Criteria) this;
        }

        public Criteria andE11In(List<Float> values) {
            addCriterion("e11 in", values, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotIn(List<Float> values) {
            addCriterion("e11 not in", values, "e11");
            return (Criteria) this;
        }

        public Criteria andE11Between(Float value1, Float value2) {
            addCriterion("e11 between", value1, value2, "e11");
            return (Criteria) this;
        }

        public Criteria andE11NotBetween(Float value1, Float value2) {
            addCriterion("e11 not between", value1, value2, "e11");
            return (Criteria) this;
        }

        public Criteria andE12IsNull() {
            addCriterion("e12 is null");
            return (Criteria) this;
        }

        public Criteria andE12IsNotNull() {
            addCriterion("e12 is not null");
            return (Criteria) this;
        }

        public Criteria andE12EqualTo(Float value) {
            addCriterion("e12 =", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotEqualTo(Float value) {
            addCriterion("e12 <>", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12GreaterThan(Float value) {
            addCriterion("e12 >", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12GreaterThanOrEqualTo(Float value) {
            addCriterion("e12 >=", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12LessThan(Float value) {
            addCriterion("e12 <", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12LessThanOrEqualTo(Float value) {
            addCriterion("e12 <=", value, "e12");
            return (Criteria) this;
        }

        public Criteria andE12In(List<Float> values) {
            addCriterion("e12 in", values, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotIn(List<Float> values) {
            addCriterion("e12 not in", values, "e12");
            return (Criteria) this;
        }

        public Criteria andE12Between(Float value1, Float value2) {
            addCriterion("e12 between", value1, value2, "e12");
            return (Criteria) this;
        }

        public Criteria andE12NotBetween(Float value1, Float value2) {
            addCriterion("e12 not between", value1, value2, "e12");
            return (Criteria) this;
        }

        public Criteria andE13IsNull() {
            addCriterion("e13 is null");
            return (Criteria) this;
        }

        public Criteria andE13IsNotNull() {
            addCriterion("e13 is not null");
            return (Criteria) this;
        }

        public Criteria andE13EqualTo(Float value) {
            addCriterion("e13 =", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotEqualTo(Float value) {
            addCriterion("e13 <>", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13GreaterThan(Float value) {
            addCriterion("e13 >", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13GreaterThanOrEqualTo(Float value) {
            addCriterion("e13 >=", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13LessThan(Float value) {
            addCriterion("e13 <", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13LessThanOrEqualTo(Float value) {
            addCriterion("e13 <=", value, "e13");
            return (Criteria) this;
        }

        public Criteria andE13In(List<Float> values) {
            addCriterion("e13 in", values, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotIn(List<Float> values) {
            addCriterion("e13 not in", values, "e13");
            return (Criteria) this;
        }

        public Criteria andE13Between(Float value1, Float value2) {
            addCriterion("e13 between", value1, value2, "e13");
            return (Criteria) this;
        }

        public Criteria andE13NotBetween(Float value1, Float value2) {
            addCriterion("e13 not between", value1, value2, "e13");
            return (Criteria) this;
        }

        public Criteria andE14IsNull() {
            addCriterion("e14 is null");
            return (Criteria) this;
        }

        public Criteria andE14IsNotNull() {
            addCriterion("e14 is not null");
            return (Criteria) this;
        }

        public Criteria andE14EqualTo(Float value) {
            addCriterion("e14 =", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotEqualTo(Float value) {
            addCriterion("e14 <>", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14GreaterThan(Float value) {
            addCriterion("e14 >", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14GreaterThanOrEqualTo(Float value) {
            addCriterion("e14 >=", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14LessThan(Float value) {
            addCriterion("e14 <", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14LessThanOrEqualTo(Float value) {
            addCriterion("e14 <=", value, "e14");
            return (Criteria) this;
        }

        public Criteria andE14In(List<Float> values) {
            addCriterion("e14 in", values, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotIn(List<Float> values) {
            addCriterion("e14 not in", values, "e14");
            return (Criteria) this;
        }

        public Criteria andE14Between(Float value1, Float value2) {
            addCriterion("e14 between", value1, value2, "e14");
            return (Criteria) this;
        }

        public Criteria andE14NotBetween(Float value1, Float value2) {
            addCriterion("e14 not between", value1, value2, "e14");
            return (Criteria) this;
        }

        public Criteria andE15IsNull() {
            addCriterion("e15 is null");
            return (Criteria) this;
        }

        public Criteria andE15IsNotNull() {
            addCriterion("e15 is not null");
            return (Criteria) this;
        }

        public Criteria andE15EqualTo(Float value) {
            addCriterion("e15 =", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotEqualTo(Float value) {
            addCriterion("e15 <>", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15GreaterThan(Float value) {
            addCriterion("e15 >", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15GreaterThanOrEqualTo(Float value) {
            addCriterion("e15 >=", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15LessThan(Float value) {
            addCriterion("e15 <", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15LessThanOrEqualTo(Float value) {
            addCriterion("e15 <=", value, "e15");
            return (Criteria) this;
        }

        public Criteria andE15In(List<Float> values) {
            addCriterion("e15 in", values, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotIn(List<Float> values) {
            addCriterion("e15 not in", values, "e15");
            return (Criteria) this;
        }

        public Criteria andE15Between(Float value1, Float value2) {
            addCriterion("e15 between", value1, value2, "e15");
            return (Criteria) this;
        }

        public Criteria andE15NotBetween(Float value1, Float value2) {
            addCriterion("e15 not between", value1, value2, "e15");
            return (Criteria) this;
        }

        public Criteria andE16IsNull() {
            addCriterion("e16 is null");
            return (Criteria) this;
        }

        public Criteria andE16IsNotNull() {
            addCriterion("e16 is not null");
            return (Criteria) this;
        }

        public Criteria andE16EqualTo(Float value) {
            addCriterion("e16 =", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotEqualTo(Float value) {
            addCriterion("e16 <>", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16GreaterThan(Float value) {
            addCriterion("e16 >", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16GreaterThanOrEqualTo(Float value) {
            addCriterion("e16 >=", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16LessThan(Float value) {
            addCriterion("e16 <", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16LessThanOrEqualTo(Float value) {
            addCriterion("e16 <=", value, "e16");
            return (Criteria) this;
        }

        public Criteria andE16In(List<Float> values) {
            addCriterion("e16 in", values, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotIn(List<Float> values) {
            addCriterion("e16 not in", values, "e16");
            return (Criteria) this;
        }

        public Criteria andE16Between(Float value1, Float value2) {
            addCriterion("e16 between", value1, value2, "e16");
            return (Criteria) this;
        }

        public Criteria andE16NotBetween(Float value1, Float value2) {
            addCriterion("e16 not between", value1, value2, "e16");
            return (Criteria) this;
        }

        public Criteria andE17IsNull() {
            addCriterion("e17 is null");
            return (Criteria) this;
        }

        public Criteria andE17IsNotNull() {
            addCriterion("e17 is not null");
            return (Criteria) this;
        }

        public Criteria andE17EqualTo(Float value) {
            addCriterion("e17 =", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotEqualTo(Float value) {
            addCriterion("e17 <>", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17GreaterThan(Float value) {
            addCriterion("e17 >", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17GreaterThanOrEqualTo(Float value) {
            addCriterion("e17 >=", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17LessThan(Float value) {
            addCriterion("e17 <", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17LessThanOrEqualTo(Float value) {
            addCriterion("e17 <=", value, "e17");
            return (Criteria) this;
        }

        public Criteria andE17In(List<Float> values) {
            addCriterion("e17 in", values, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotIn(List<Float> values) {
            addCriterion("e17 not in", values, "e17");
            return (Criteria) this;
        }

        public Criteria andE17Between(Float value1, Float value2) {
            addCriterion("e17 between", value1, value2, "e17");
            return (Criteria) this;
        }

        public Criteria andE17NotBetween(Float value1, Float value2) {
            addCriterion("e17 not between", value1, value2, "e17");
            return (Criteria) this;
        }

        public Criteria andE18IsNull() {
            addCriterion("e18 is null");
            return (Criteria) this;
        }

        public Criteria andE18IsNotNull() {
            addCriterion("e18 is not null");
            return (Criteria) this;
        }

        public Criteria andE18EqualTo(Float value) {
            addCriterion("e18 =", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotEqualTo(Float value) {
            addCriterion("e18 <>", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18GreaterThan(Float value) {
            addCriterion("e18 >", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18GreaterThanOrEqualTo(Float value) {
            addCriterion("e18 >=", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18LessThan(Float value) {
            addCriterion("e18 <", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18LessThanOrEqualTo(Float value) {
            addCriterion("e18 <=", value, "e18");
            return (Criteria) this;
        }

        public Criteria andE18In(List<Float> values) {
            addCriterion("e18 in", values, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotIn(List<Float> values) {
            addCriterion("e18 not in", values, "e18");
            return (Criteria) this;
        }

        public Criteria andE18Between(Float value1, Float value2) {
            addCriterion("e18 between", value1, value2, "e18");
            return (Criteria) this;
        }

        public Criteria andE18NotBetween(Float value1, Float value2) {
            addCriterion("e18 not between", value1, value2, "e18");
            return (Criteria) this;
        }

        public Criteria andE19IsNull() {
            addCriterion("e19 is null");
            return (Criteria) this;
        }

        public Criteria andE19IsNotNull() {
            addCriterion("e19 is not null");
            return (Criteria) this;
        }

        public Criteria andE19EqualTo(Float value) {
            addCriterion("e19 =", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotEqualTo(Float value) {
            addCriterion("e19 <>", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19GreaterThan(Float value) {
            addCriterion("e19 >", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19GreaterThanOrEqualTo(Float value) {
            addCriterion("e19 >=", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19LessThan(Float value) {
            addCriterion("e19 <", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19LessThanOrEqualTo(Float value) {
            addCriterion("e19 <=", value, "e19");
            return (Criteria) this;
        }

        public Criteria andE19In(List<Float> values) {
            addCriterion("e19 in", values, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotIn(List<Float> values) {
            addCriterion("e19 not in", values, "e19");
            return (Criteria) this;
        }

        public Criteria andE19Between(Float value1, Float value2) {
            addCriterion("e19 between", value1, value2, "e19");
            return (Criteria) this;
        }

        public Criteria andE19NotBetween(Float value1, Float value2) {
            addCriterion("e19 not between", value1, value2, "e19");
            return (Criteria) this;
        }

        public Criteria andE20IsNull() {
            addCriterion("e20 is null");
            return (Criteria) this;
        }

        public Criteria andE20IsNotNull() {
            addCriterion("e20 is not null");
            return (Criteria) this;
        }

        public Criteria andE20EqualTo(Float value) {
            addCriterion("e20 =", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotEqualTo(Float value) {
            addCriterion("e20 <>", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20GreaterThan(Float value) {
            addCriterion("e20 >", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20GreaterThanOrEqualTo(Float value) {
            addCriterion("e20 >=", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20LessThan(Float value) {
            addCriterion("e20 <", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20LessThanOrEqualTo(Float value) {
            addCriterion("e20 <=", value, "e20");
            return (Criteria) this;
        }

        public Criteria andE20In(List<Float> values) {
            addCriterion("e20 in", values, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotIn(List<Float> values) {
            addCriterion("e20 not in", values, "e20");
            return (Criteria) this;
        }

        public Criteria andE20Between(Float value1, Float value2) {
            addCriterion("e20 between", value1, value2, "e20");
            return (Criteria) this;
        }

        public Criteria andE20NotBetween(Float value1, Float value2) {
            addCriterion("e20 not between", value1, value2, "e20");
            return (Criteria) this;
        }

        public Criteria andE21IsNull() {
            addCriterion("e21 is null");
            return (Criteria) this;
        }

        public Criteria andE21IsNotNull() {
            addCriterion("e21 is not null");
            return (Criteria) this;
        }

        public Criteria andE21EqualTo(Float value) {
            addCriterion("e21 =", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotEqualTo(Float value) {
            addCriterion("e21 <>", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21GreaterThan(Float value) {
            addCriterion("e21 >", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21GreaterThanOrEqualTo(Float value) {
            addCriterion("e21 >=", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21LessThan(Float value) {
            addCriterion("e21 <", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21LessThanOrEqualTo(Float value) {
            addCriterion("e21 <=", value, "e21");
            return (Criteria) this;
        }

        public Criteria andE21In(List<Float> values) {
            addCriterion("e21 in", values, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotIn(List<Float> values) {
            addCriterion("e21 not in", values, "e21");
            return (Criteria) this;
        }

        public Criteria andE21Between(Float value1, Float value2) {
            addCriterion("e21 between", value1, value2, "e21");
            return (Criteria) this;
        }

        public Criteria andE21NotBetween(Float value1, Float value2) {
            addCriterion("e21 not between", value1, value2, "e21");
            return (Criteria) this;
        }

        public Criteria andE22IsNull() {
            addCriterion("e22 is null");
            return (Criteria) this;
        }

        public Criteria andE22IsNotNull() {
            addCriterion("e22 is not null");
            return (Criteria) this;
        }

        public Criteria andE22EqualTo(Float value) {
            addCriterion("e22 =", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotEqualTo(Float value) {
            addCriterion("e22 <>", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22GreaterThan(Float value) {
            addCriterion("e22 >", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22GreaterThanOrEqualTo(Float value) {
            addCriterion("e22 >=", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22LessThan(Float value) {
            addCriterion("e22 <", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22LessThanOrEqualTo(Float value) {
            addCriterion("e22 <=", value, "e22");
            return (Criteria) this;
        }

        public Criteria andE22In(List<Float> values) {
            addCriterion("e22 in", values, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotIn(List<Float> values) {
            addCriterion("e22 not in", values, "e22");
            return (Criteria) this;
        }

        public Criteria andE22Between(Float value1, Float value2) {
            addCriterion("e22 between", value1, value2, "e22");
            return (Criteria) this;
        }

        public Criteria andE22NotBetween(Float value1, Float value2) {
            addCriterion("e22 not between", value1, value2, "e22");
            return (Criteria) this;
        }

        public Criteria andE23IsNull() {
            addCriterion("e23 is null");
            return (Criteria) this;
        }

        public Criteria andE23IsNotNull() {
            addCriterion("e23 is not null");
            return (Criteria) this;
        }

        public Criteria andE23EqualTo(Float value) {
            addCriterion("e23 =", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotEqualTo(Float value) {
            addCriterion("e23 <>", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23GreaterThan(Float value) {
            addCriterion("e23 >", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23GreaterThanOrEqualTo(Float value) {
            addCriterion("e23 >=", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23LessThan(Float value) {
            addCriterion("e23 <", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23LessThanOrEqualTo(Float value) {
            addCriterion("e23 <=", value, "e23");
            return (Criteria) this;
        }

        public Criteria andE23In(List<Float> values) {
            addCriterion("e23 in", values, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotIn(List<Float> values) {
            addCriterion("e23 not in", values, "e23");
            return (Criteria) this;
        }

        public Criteria andE23Between(Float value1, Float value2) {
            addCriterion("e23 between", value1, value2, "e23");
            return (Criteria) this;
        }

        public Criteria andE23NotBetween(Float value1, Float value2) {
            addCriterion("e23 not between", value1, value2, "e23");
            return (Criteria) this;
        }

        public Criteria andE24IsNull() {
            addCriterion("e24 is null");
            return (Criteria) this;
        }

        public Criteria andE24IsNotNull() {
            addCriterion("e24 is not null");
            return (Criteria) this;
        }

        public Criteria andE24EqualTo(Float value) {
            addCriterion("e24 =", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotEqualTo(Float value) {
            addCriterion("e24 <>", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24GreaterThan(Float value) {
            addCriterion("e24 >", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24GreaterThanOrEqualTo(Float value) {
            addCriterion("e24 >=", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24LessThan(Float value) {
            addCriterion("e24 <", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24LessThanOrEqualTo(Float value) {
            addCriterion("e24 <=", value, "e24");
            return (Criteria) this;
        }

        public Criteria andE24In(List<Float> values) {
            addCriterion("e24 in", values, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotIn(List<Float> values) {
            addCriterion("e24 not in", values, "e24");
            return (Criteria) this;
        }

        public Criteria andE24Between(Float value1, Float value2) {
            addCriterion("e24 between", value1, value2, "e24");
            return (Criteria) this;
        }

        public Criteria andE24NotBetween(Float value1, Float value2) {
            addCriterion("e24 not between", value1, value2, "e24");
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