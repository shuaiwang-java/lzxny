package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class jtableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public jtableExample() {
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

        public Criteria andTiIsNull() {
            addCriterion("ti is null");
            return (Criteria) this;
        }

        public Criteria andTiIsNotNull() {
            addCriterion("ti is not null");
            return (Criteria) this;
        }

        public Criteria andTiEqualTo(Date value) {
            addCriterion("ti =", value, "ti");
            return (Criteria) this;
        }

        public Criteria andTiNotEqualTo(Date value) {
            addCriterion("ti <>", value, "ti");
            return (Criteria) this;
        }

        public Criteria andTiGreaterThan(Date value) {
            addCriterion("ti >", value, "ti");
            return (Criteria) this;
        }

        public Criteria andTiGreaterThanOrEqualTo(Date value) {
            addCriterion("ti >=", value, "ti");
            return (Criteria) this;
        }

        public Criteria andTiLessThan(Date value) {
            addCriterion("ti <", value, "ti");
            return (Criteria) this;
        }

        public Criteria andTiLessThanOrEqualTo(Date value) {
            addCriterion("ti <=", value, "ti");
            return (Criteria) this;
        }

        public Criteria andTiIn(List<Date> values) {
            addCriterion("ti in", values, "ti");
            return (Criteria) this;
        }

        public Criteria andTiNotIn(List<Date> values) {
            addCriterion("ti not in", values, "ti");
            return (Criteria) this;
        }

        public Criteria andTiBetween(Date value1, Date value2) {
            addCriterion("ti between", value1, value2, "ti");
            return (Criteria) this;
        }

        public Criteria andTiNotBetween(Date value1, Date value2) {
            addCriterion("ti not between", value1, value2, "ti");
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

        public Criteria andC1IsNull() {
            addCriterion("c1 is null");
            return (Criteria) this;
        }

        public Criteria andC1IsNotNull() {
            addCriterion("c1 is not null");
            return (Criteria) this;
        }

        public Criteria andC1EqualTo(Float value) {
            addCriterion("c1 =", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotEqualTo(Float value) {
            addCriterion("c1 <>", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1GreaterThan(Float value) {
            addCriterion("c1 >", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1GreaterThanOrEqualTo(Float value) {
            addCriterion("c1 >=", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1LessThan(Float value) {
            addCriterion("c1 <", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1LessThanOrEqualTo(Float value) {
            addCriterion("c1 <=", value, "c1");
            return (Criteria) this;
        }

        public Criteria andC1In(List<Float> values) {
            addCriterion("c1 in", values, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotIn(List<Float> values) {
            addCriterion("c1 not in", values, "c1");
            return (Criteria) this;
        }

        public Criteria andC1Between(Float value1, Float value2) {
            addCriterion("c1 between", value1, value2, "c1");
            return (Criteria) this;
        }

        public Criteria andC1NotBetween(Float value1, Float value2) {
            addCriterion("c1 not between", value1, value2, "c1");
            return (Criteria) this;
        }

        public Criteria andC2IsNull() {
            addCriterion("c2 is null");
            return (Criteria) this;
        }

        public Criteria andC2IsNotNull() {
            addCriterion("c2 is not null");
            return (Criteria) this;
        }

        public Criteria andC2EqualTo(Float value) {
            addCriterion("c2 =", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotEqualTo(Float value) {
            addCriterion("c2 <>", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2GreaterThan(Float value) {
            addCriterion("c2 >", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2GreaterThanOrEqualTo(Float value) {
            addCriterion("c2 >=", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2LessThan(Float value) {
            addCriterion("c2 <", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2LessThanOrEqualTo(Float value) {
            addCriterion("c2 <=", value, "c2");
            return (Criteria) this;
        }

        public Criteria andC2In(List<Float> values) {
            addCriterion("c2 in", values, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotIn(List<Float> values) {
            addCriterion("c2 not in", values, "c2");
            return (Criteria) this;
        }

        public Criteria andC2Between(Float value1, Float value2) {
            addCriterion("c2 between", value1, value2, "c2");
            return (Criteria) this;
        }

        public Criteria andC2NotBetween(Float value1, Float value2) {
            addCriterion("c2 not between", value1, value2, "c2");
            return (Criteria) this;
        }

        public Criteria andC3IsNull() {
            addCriterion("c3 is null");
            return (Criteria) this;
        }

        public Criteria andC3IsNotNull() {
            addCriterion("c3 is not null");
            return (Criteria) this;
        }

        public Criteria andC3EqualTo(Float value) {
            addCriterion("c3 =", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotEqualTo(Float value) {
            addCriterion("c3 <>", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThan(Float value) {
            addCriterion("c3 >", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThanOrEqualTo(Float value) {
            addCriterion("c3 >=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThan(Float value) {
            addCriterion("c3 <", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThanOrEqualTo(Float value) {
            addCriterion("c3 <=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3In(List<Float> values) {
            addCriterion("c3 in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotIn(List<Float> values) {
            addCriterion("c3 not in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3Between(Float value1, Float value2) {
            addCriterion("c3 between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotBetween(Float value1, Float value2) {
            addCriterion("c3 not between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC4IsNull() {
            addCriterion("c4 is null");
            return (Criteria) this;
        }

        public Criteria andC4IsNotNull() {
            addCriterion("c4 is not null");
            return (Criteria) this;
        }

        public Criteria andC4EqualTo(Float value) {
            addCriterion("c4 =", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotEqualTo(Float value) {
            addCriterion("c4 <>", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThan(Float value) {
            addCriterion("c4 >", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThanOrEqualTo(Float value) {
            addCriterion("c4 >=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThan(Float value) {
            addCriterion("c4 <", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThanOrEqualTo(Float value) {
            addCriterion("c4 <=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4In(List<Float> values) {
            addCriterion("c4 in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotIn(List<Float> values) {
            addCriterion("c4 not in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4Between(Float value1, Float value2) {
            addCriterion("c4 between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotBetween(Float value1, Float value2) {
            addCriterion("c4 not between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andD1IsNull() {
            addCriterion("d1 is null");
            return (Criteria) this;
        }

        public Criteria andD1IsNotNull() {
            addCriterion("d1 is not null");
            return (Criteria) this;
        }

        public Criteria andD1EqualTo(Float value) {
            addCriterion("d1 =", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotEqualTo(Float value) {
            addCriterion("d1 <>", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1GreaterThan(Float value) {
            addCriterion("d1 >", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1GreaterThanOrEqualTo(Float value) {
            addCriterion("d1 >=", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1LessThan(Float value) {
            addCriterion("d1 <", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1LessThanOrEqualTo(Float value) {
            addCriterion("d1 <=", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1In(List<Float> values) {
            addCriterion("d1 in", values, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotIn(List<Float> values) {
            addCriterion("d1 not in", values, "d1");
            return (Criteria) this;
        }

        public Criteria andD1Between(Float value1, Float value2) {
            addCriterion("d1 between", value1, value2, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotBetween(Float value1, Float value2) {
            addCriterion("d1 not between", value1, value2, "d1");
            return (Criteria) this;
        }

        public Criteria andD2IsNull() {
            addCriterion("d2 is null");
            return (Criteria) this;
        }

        public Criteria andD2IsNotNull() {
            addCriterion("d2 is not null");
            return (Criteria) this;
        }

        public Criteria andD2EqualTo(Float value) {
            addCriterion("d2 =", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotEqualTo(Float value) {
            addCriterion("d2 <>", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2GreaterThan(Float value) {
            addCriterion("d2 >", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2GreaterThanOrEqualTo(Float value) {
            addCriterion("d2 >=", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2LessThan(Float value) {
            addCriterion("d2 <", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2LessThanOrEqualTo(Float value) {
            addCriterion("d2 <=", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2In(List<Float> values) {
            addCriterion("d2 in", values, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotIn(List<Float> values) {
            addCriterion("d2 not in", values, "d2");
            return (Criteria) this;
        }

        public Criteria andD2Between(Float value1, Float value2) {
            addCriterion("d2 between", value1, value2, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotBetween(Float value1, Float value2) {
            addCriterion("d2 not between", value1, value2, "d2");
            return (Criteria) this;
        }

        public Criteria andD3IsNull() {
            addCriterion("d3 is null");
            return (Criteria) this;
        }

        public Criteria andD3IsNotNull() {
            addCriterion("d3 is not null");
            return (Criteria) this;
        }

        public Criteria andD3EqualTo(Float value) {
            addCriterion("d3 =", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotEqualTo(Float value) {
            addCriterion("d3 <>", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3GreaterThan(Float value) {
            addCriterion("d3 >", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3GreaterThanOrEqualTo(Float value) {
            addCriterion("d3 >=", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3LessThan(Float value) {
            addCriterion("d3 <", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3LessThanOrEqualTo(Float value) {
            addCriterion("d3 <=", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3In(List<Float> values) {
            addCriterion("d3 in", values, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotIn(List<Float> values) {
            addCriterion("d3 not in", values, "d3");
            return (Criteria) this;
        }

        public Criteria andD3Between(Float value1, Float value2) {
            addCriterion("d3 between", value1, value2, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotBetween(Float value1, Float value2) {
            addCriterion("d3 not between", value1, value2, "d3");
            return (Criteria) this;
        }

        public Criteria andD4IsNull() {
            addCriterion("d4 is null");
            return (Criteria) this;
        }

        public Criteria andD4IsNotNull() {
            addCriterion("d4 is not null");
            return (Criteria) this;
        }

        public Criteria andD4EqualTo(Float value) {
            addCriterion("d4 =", value, "d4");
            return (Criteria) this;
        }

        public Criteria andD4NotEqualTo(Float value) {
            addCriterion("d4 <>", value, "d4");
            return (Criteria) this;
        }

        public Criteria andD4GreaterThan(Float value) {
            addCriterion("d4 >", value, "d4");
            return (Criteria) this;
        }

        public Criteria andD4GreaterThanOrEqualTo(Float value) {
            addCriterion("d4 >=", value, "d4");
            return (Criteria) this;
        }

        public Criteria andD4LessThan(Float value) {
            addCriterion("d4 <", value, "d4");
            return (Criteria) this;
        }

        public Criteria andD4LessThanOrEqualTo(Float value) {
            addCriterion("d4 <=", value, "d4");
            return (Criteria) this;
        }

        public Criteria andD4In(List<Float> values) {
            addCriterion("d4 in", values, "d4");
            return (Criteria) this;
        }

        public Criteria andD4NotIn(List<Float> values) {
            addCriterion("d4 not in", values, "d4");
            return (Criteria) this;
        }

        public Criteria andD4Between(Float value1, Float value2) {
            addCriterion("d4 between", value1, value2, "d4");
            return (Criteria) this;
        }

        public Criteria andD4NotBetween(Float value1, Float value2) {
            addCriterion("d4 not between", value1, value2, "d4");
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

        public Criteria andF1IsNull() {
            addCriterion("f1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("f1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(Float value) {
            addCriterion("f1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(Float value) {
            addCriterion("f1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(Float value) {
            addCriterion("f1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(Float value) {
            addCriterion("f1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(Float value) {
            addCriterion("f1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(Float value) {
            addCriterion("f1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<Float> values) {
            addCriterion("f1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<Float> values) {
            addCriterion("f1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(Float value1, Float value2) {
            addCriterion("f1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(Float value1, Float value2) {
            addCriterion("f1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("f2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("f2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(Float value) {
            addCriterion("f2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(Float value) {
            addCriterion("f2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(Float value) {
            addCriterion("f2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(Float value) {
            addCriterion("f2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(Float value) {
            addCriterion("f2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(Float value) {
            addCriterion("f2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<Float> values) {
            addCriterion("f2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<Float> values) {
            addCriterion("f2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(Float value1, Float value2) {
            addCriterion("f2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(Float value1, Float value2) {
            addCriterion("f2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("f3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("f3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(Float value) {
            addCriterion("f3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(Float value) {
            addCriterion("f3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(Float value) {
            addCriterion("f3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(Float value) {
            addCriterion("f3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(Float value) {
            addCriterion("f3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(Float value) {
            addCriterion("f3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<Float> values) {
            addCriterion("f3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<Float> values) {
            addCriterion("f3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(Float value1, Float value2) {
            addCriterion("f3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(Float value1, Float value2) {
            addCriterion("f3 not between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF4IsNull() {
            addCriterion("f4 is null");
            return (Criteria) this;
        }

        public Criteria andF4IsNotNull() {
            addCriterion("f4 is not null");
            return (Criteria) this;
        }

        public Criteria andF4EqualTo(Float value) {
            addCriterion("f4 =", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotEqualTo(Float value) {
            addCriterion("f4 <>", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThan(Float value) {
            addCriterion("f4 >", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThanOrEqualTo(Float value) {
            addCriterion("f4 >=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThan(Float value) {
            addCriterion("f4 <", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThanOrEqualTo(Float value) {
            addCriterion("f4 <=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4In(List<Float> values) {
            addCriterion("f4 in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotIn(List<Float> values) {
            addCriterion("f4 not in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Between(Float value1, Float value2) {
            addCriterion("f4 between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotBetween(Float value1, Float value2) {
            addCriterion("f4 not between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andG1IsNull() {
            addCriterion("g1 is null");
            return (Criteria) this;
        }

        public Criteria andG1IsNotNull() {
            addCriterion("g1 is not null");
            return (Criteria) this;
        }

        public Criteria andG1EqualTo(Float value) {
            addCriterion("g1 =", value, "g1");
            return (Criteria) this;
        }

        public Criteria andG1NotEqualTo(Float value) {
            addCriterion("g1 <>", value, "g1");
            return (Criteria) this;
        }

        public Criteria andG1GreaterThan(Float value) {
            addCriterion("g1 >", value, "g1");
            return (Criteria) this;
        }

        public Criteria andG1GreaterThanOrEqualTo(Float value) {
            addCriterion("g1 >=", value, "g1");
            return (Criteria) this;
        }

        public Criteria andG1LessThan(Float value) {
            addCriterion("g1 <", value, "g1");
            return (Criteria) this;
        }

        public Criteria andG1LessThanOrEqualTo(Float value) {
            addCriterion("g1 <=", value, "g1");
            return (Criteria) this;
        }

        public Criteria andG1In(List<Float> values) {
            addCriterion("g1 in", values, "g1");
            return (Criteria) this;
        }

        public Criteria andG1NotIn(List<Float> values) {
            addCriterion("g1 not in", values, "g1");
            return (Criteria) this;
        }

        public Criteria andG1Between(Float value1, Float value2) {
            addCriterion("g1 between", value1, value2, "g1");
            return (Criteria) this;
        }

        public Criteria andG1NotBetween(Float value1, Float value2) {
            addCriterion("g1 not between", value1, value2, "g1");
            return (Criteria) this;
        }

        public Criteria andG2IsNull() {
            addCriterion("g2 is null");
            return (Criteria) this;
        }

        public Criteria andG2IsNotNull() {
            addCriterion("g2 is not null");
            return (Criteria) this;
        }

        public Criteria andG2EqualTo(Float value) {
            addCriterion("g2 =", value, "g2");
            return (Criteria) this;
        }

        public Criteria andG2NotEqualTo(Float value) {
            addCriterion("g2 <>", value, "g2");
            return (Criteria) this;
        }

        public Criteria andG2GreaterThan(Float value) {
            addCriterion("g2 >", value, "g2");
            return (Criteria) this;
        }

        public Criteria andG2GreaterThanOrEqualTo(Float value) {
            addCriterion("g2 >=", value, "g2");
            return (Criteria) this;
        }

        public Criteria andG2LessThan(Float value) {
            addCriterion("g2 <", value, "g2");
            return (Criteria) this;
        }

        public Criteria andG2LessThanOrEqualTo(Float value) {
            addCriterion("g2 <=", value, "g2");
            return (Criteria) this;
        }

        public Criteria andG2In(List<Float> values) {
            addCriterion("g2 in", values, "g2");
            return (Criteria) this;
        }

        public Criteria andG2NotIn(List<Float> values) {
            addCriterion("g2 not in", values, "g2");
            return (Criteria) this;
        }

        public Criteria andG2Between(Float value1, Float value2) {
            addCriterion("g2 between", value1, value2, "g2");
            return (Criteria) this;
        }

        public Criteria andG2NotBetween(Float value1, Float value2) {
            addCriterion("g2 not between", value1, value2, "g2");
            return (Criteria) this;
        }

        public Criteria andG3IsNull() {
            addCriterion("g3 is null");
            return (Criteria) this;
        }

        public Criteria andG3IsNotNull() {
            addCriterion("g3 is not null");
            return (Criteria) this;
        }

        public Criteria andG3EqualTo(Float value) {
            addCriterion("g3 =", value, "g3");
            return (Criteria) this;
        }

        public Criteria andG3NotEqualTo(Float value) {
            addCriterion("g3 <>", value, "g3");
            return (Criteria) this;
        }

        public Criteria andG3GreaterThan(Float value) {
            addCriterion("g3 >", value, "g3");
            return (Criteria) this;
        }

        public Criteria andG3GreaterThanOrEqualTo(Float value) {
            addCriterion("g3 >=", value, "g3");
            return (Criteria) this;
        }

        public Criteria andG3LessThan(Float value) {
            addCriterion("g3 <", value, "g3");
            return (Criteria) this;
        }

        public Criteria andG3LessThanOrEqualTo(Float value) {
            addCriterion("g3 <=", value, "g3");
            return (Criteria) this;
        }

        public Criteria andG3In(List<Float> values) {
            addCriterion("g3 in", values, "g3");
            return (Criteria) this;
        }

        public Criteria andG3NotIn(List<Float> values) {
            addCriterion("g3 not in", values, "g3");
            return (Criteria) this;
        }

        public Criteria andG3Between(Float value1, Float value2) {
            addCriterion("g3 between", value1, value2, "g3");
            return (Criteria) this;
        }

        public Criteria andG3NotBetween(Float value1, Float value2) {
            addCriterion("g3 not between", value1, value2, "g3");
            return (Criteria) this;
        }

        public Criteria andG4IsNull() {
            addCriterion("g4 is null");
            return (Criteria) this;
        }

        public Criteria andG4IsNotNull() {
            addCriterion("g4 is not null");
            return (Criteria) this;
        }

        public Criteria andG4EqualTo(Float value) {
            addCriterion("g4 =", value, "g4");
            return (Criteria) this;
        }

        public Criteria andG4NotEqualTo(Float value) {
            addCriterion("g4 <>", value, "g4");
            return (Criteria) this;
        }

        public Criteria andG4GreaterThan(Float value) {
            addCriterion("g4 >", value, "g4");
            return (Criteria) this;
        }

        public Criteria andG4GreaterThanOrEqualTo(Float value) {
            addCriterion("g4 >=", value, "g4");
            return (Criteria) this;
        }

        public Criteria andG4LessThan(Float value) {
            addCriterion("g4 <", value, "g4");
            return (Criteria) this;
        }

        public Criteria andG4LessThanOrEqualTo(Float value) {
            addCriterion("g4 <=", value, "g4");
            return (Criteria) this;
        }

        public Criteria andG4In(List<Float> values) {
            addCriterion("g4 in", values, "g4");
            return (Criteria) this;
        }

        public Criteria andG4NotIn(List<Float> values) {
            addCriterion("g4 not in", values, "g4");
            return (Criteria) this;
        }

        public Criteria andG4Between(Float value1, Float value2) {
            addCriterion("g4 between", value1, value2, "g4");
            return (Criteria) this;
        }

        public Criteria andG4NotBetween(Float value1, Float value2) {
            addCriterion("g4 not between", value1, value2, "g4");
            return (Criteria) this;
        }

        public Criteria andH1IsNull() {
            addCriterion("h1 is null");
            return (Criteria) this;
        }

        public Criteria andH1IsNotNull() {
            addCriterion("h1 is not null");
            return (Criteria) this;
        }

        public Criteria andH1EqualTo(Float value) {
            addCriterion("h1 =", value, "h1");
            return (Criteria) this;
        }

        public Criteria andH1NotEqualTo(Float value) {
            addCriterion("h1 <>", value, "h1");
            return (Criteria) this;
        }

        public Criteria andH1GreaterThan(Float value) {
            addCriterion("h1 >", value, "h1");
            return (Criteria) this;
        }

        public Criteria andH1GreaterThanOrEqualTo(Float value) {
            addCriterion("h1 >=", value, "h1");
            return (Criteria) this;
        }

        public Criteria andH1LessThan(Float value) {
            addCriterion("h1 <", value, "h1");
            return (Criteria) this;
        }

        public Criteria andH1LessThanOrEqualTo(Float value) {
            addCriterion("h1 <=", value, "h1");
            return (Criteria) this;
        }

        public Criteria andH1In(List<Float> values) {
            addCriterion("h1 in", values, "h1");
            return (Criteria) this;
        }

        public Criteria andH1NotIn(List<Float> values) {
            addCriterion("h1 not in", values, "h1");
            return (Criteria) this;
        }

        public Criteria andH1Between(Float value1, Float value2) {
            addCriterion("h1 between", value1, value2, "h1");
            return (Criteria) this;
        }

        public Criteria andH1NotBetween(Float value1, Float value2) {
            addCriterion("h1 not between", value1, value2, "h1");
            return (Criteria) this;
        }

        public Criteria andH2IsNull() {
            addCriterion("h2 is null");
            return (Criteria) this;
        }

        public Criteria andH2IsNotNull() {
            addCriterion("h2 is not null");
            return (Criteria) this;
        }

        public Criteria andH2EqualTo(Float value) {
            addCriterion("h2 =", value, "h2");
            return (Criteria) this;
        }

        public Criteria andH2NotEqualTo(Float value) {
            addCriterion("h2 <>", value, "h2");
            return (Criteria) this;
        }

        public Criteria andH2GreaterThan(Float value) {
            addCriterion("h2 >", value, "h2");
            return (Criteria) this;
        }

        public Criteria andH2GreaterThanOrEqualTo(Float value) {
            addCriterion("h2 >=", value, "h2");
            return (Criteria) this;
        }

        public Criteria andH2LessThan(Float value) {
            addCriterion("h2 <", value, "h2");
            return (Criteria) this;
        }

        public Criteria andH2LessThanOrEqualTo(Float value) {
            addCriterion("h2 <=", value, "h2");
            return (Criteria) this;
        }

        public Criteria andH2In(List<Float> values) {
            addCriterion("h2 in", values, "h2");
            return (Criteria) this;
        }

        public Criteria andH2NotIn(List<Float> values) {
            addCriterion("h2 not in", values, "h2");
            return (Criteria) this;
        }

        public Criteria andH2Between(Float value1, Float value2) {
            addCriterion("h2 between", value1, value2, "h2");
            return (Criteria) this;
        }

        public Criteria andH2NotBetween(Float value1, Float value2) {
            addCriterion("h2 not between", value1, value2, "h2");
            return (Criteria) this;
        }

        public Criteria andH3IsNull() {
            addCriterion("h3 is null");
            return (Criteria) this;
        }

        public Criteria andH3IsNotNull() {
            addCriterion("h3 is not null");
            return (Criteria) this;
        }

        public Criteria andH3EqualTo(Float value) {
            addCriterion("h3 =", value, "h3");
            return (Criteria) this;
        }

        public Criteria andH3NotEqualTo(Float value) {
            addCriterion("h3 <>", value, "h3");
            return (Criteria) this;
        }

        public Criteria andH3GreaterThan(Float value) {
            addCriterion("h3 >", value, "h3");
            return (Criteria) this;
        }

        public Criteria andH3GreaterThanOrEqualTo(Float value) {
            addCriterion("h3 >=", value, "h3");
            return (Criteria) this;
        }

        public Criteria andH3LessThan(Float value) {
            addCriterion("h3 <", value, "h3");
            return (Criteria) this;
        }

        public Criteria andH3LessThanOrEqualTo(Float value) {
            addCriterion("h3 <=", value, "h3");
            return (Criteria) this;
        }

        public Criteria andH3In(List<Float> values) {
            addCriterion("h3 in", values, "h3");
            return (Criteria) this;
        }

        public Criteria andH3NotIn(List<Float> values) {
            addCriterion("h3 not in", values, "h3");
            return (Criteria) this;
        }

        public Criteria andH3Between(Float value1, Float value2) {
            addCriterion("h3 between", value1, value2, "h3");
            return (Criteria) this;
        }

        public Criteria andH3NotBetween(Float value1, Float value2) {
            addCriterion("h3 not between", value1, value2, "h3");
            return (Criteria) this;
        }

        public Criteria andH4IsNull() {
            addCriterion("h4 is null");
            return (Criteria) this;
        }

        public Criteria andH4IsNotNull() {
            addCriterion("h4 is not null");
            return (Criteria) this;
        }

        public Criteria andH4EqualTo(Float value) {
            addCriterion("h4 =", value, "h4");
            return (Criteria) this;
        }

        public Criteria andH4NotEqualTo(Float value) {
            addCriterion("h4 <>", value, "h4");
            return (Criteria) this;
        }

        public Criteria andH4GreaterThan(Float value) {
            addCriterion("h4 >", value, "h4");
            return (Criteria) this;
        }

        public Criteria andH4GreaterThanOrEqualTo(Float value) {
            addCriterion("h4 >=", value, "h4");
            return (Criteria) this;
        }

        public Criteria andH4LessThan(Float value) {
            addCriterion("h4 <", value, "h4");
            return (Criteria) this;
        }

        public Criteria andH4LessThanOrEqualTo(Float value) {
            addCriterion("h4 <=", value, "h4");
            return (Criteria) this;
        }

        public Criteria andH4In(List<Float> values) {
            addCriterion("h4 in", values, "h4");
            return (Criteria) this;
        }

        public Criteria andH4NotIn(List<Float> values) {
            addCriterion("h4 not in", values, "h4");
            return (Criteria) this;
        }

        public Criteria andH4Between(Float value1, Float value2) {
            addCriterion("h4 between", value1, value2, "h4");
            return (Criteria) this;
        }

        public Criteria andH4NotBetween(Float value1, Float value2) {
            addCriterion("h4 not between", value1, value2, "h4");
            return (Criteria) this;
        }

        public Criteria andI1IsNull() {
            addCriterion("i1 is null");
            return (Criteria) this;
        }

        public Criteria andI1IsNotNull() {
            addCriterion("i1 is not null");
            return (Criteria) this;
        }

        public Criteria andI1EqualTo(Float value) {
            addCriterion("i1 =", value, "i1");
            return (Criteria) this;
        }

        public Criteria andI1NotEqualTo(Float value) {
            addCriterion("i1 <>", value, "i1");
            return (Criteria) this;
        }

        public Criteria andI1GreaterThan(Float value) {
            addCriterion("i1 >", value, "i1");
            return (Criteria) this;
        }

        public Criteria andI1GreaterThanOrEqualTo(Float value) {
            addCriterion("i1 >=", value, "i1");
            return (Criteria) this;
        }

        public Criteria andI1LessThan(Float value) {
            addCriterion("i1 <", value, "i1");
            return (Criteria) this;
        }

        public Criteria andI1LessThanOrEqualTo(Float value) {
            addCriterion("i1 <=", value, "i1");
            return (Criteria) this;
        }

        public Criteria andI1In(List<Float> values) {
            addCriterion("i1 in", values, "i1");
            return (Criteria) this;
        }

        public Criteria andI1NotIn(List<Float> values) {
            addCriterion("i1 not in", values, "i1");
            return (Criteria) this;
        }

        public Criteria andI1Between(Float value1, Float value2) {
            addCriterion("i1 between", value1, value2, "i1");
            return (Criteria) this;
        }

        public Criteria andI1NotBetween(Float value1, Float value2) {
            addCriterion("i1 not between", value1, value2, "i1");
            return (Criteria) this;
        }

        public Criteria andI2IsNull() {
            addCriterion("i2 is null");
            return (Criteria) this;
        }

        public Criteria andI2IsNotNull() {
            addCriterion("i2 is not null");
            return (Criteria) this;
        }

        public Criteria andI2EqualTo(Float value) {
            addCriterion("i2 =", value, "i2");
            return (Criteria) this;
        }

        public Criteria andI2NotEqualTo(Float value) {
            addCriterion("i2 <>", value, "i2");
            return (Criteria) this;
        }

        public Criteria andI2GreaterThan(Float value) {
            addCriterion("i2 >", value, "i2");
            return (Criteria) this;
        }

        public Criteria andI2GreaterThanOrEqualTo(Float value) {
            addCriterion("i2 >=", value, "i2");
            return (Criteria) this;
        }

        public Criteria andI2LessThan(Float value) {
            addCriterion("i2 <", value, "i2");
            return (Criteria) this;
        }

        public Criteria andI2LessThanOrEqualTo(Float value) {
            addCriterion("i2 <=", value, "i2");
            return (Criteria) this;
        }

        public Criteria andI2In(List<Float> values) {
            addCriterion("i2 in", values, "i2");
            return (Criteria) this;
        }

        public Criteria andI2NotIn(List<Float> values) {
            addCriterion("i2 not in", values, "i2");
            return (Criteria) this;
        }

        public Criteria andI2Between(Float value1, Float value2) {
            addCriterion("i2 between", value1, value2, "i2");
            return (Criteria) this;
        }

        public Criteria andI2NotBetween(Float value1, Float value2) {
            addCriterion("i2 not between", value1, value2, "i2");
            return (Criteria) this;
        }

        public Criteria andI3IsNull() {
            addCriterion("i3 is null");
            return (Criteria) this;
        }

        public Criteria andI3IsNotNull() {
            addCriterion("i3 is not null");
            return (Criteria) this;
        }

        public Criteria andI3EqualTo(Float value) {
            addCriterion("i3 =", value, "i3");
            return (Criteria) this;
        }

        public Criteria andI3NotEqualTo(Float value) {
            addCriterion("i3 <>", value, "i3");
            return (Criteria) this;
        }

        public Criteria andI3GreaterThan(Float value) {
            addCriterion("i3 >", value, "i3");
            return (Criteria) this;
        }

        public Criteria andI3GreaterThanOrEqualTo(Float value) {
            addCriterion("i3 >=", value, "i3");
            return (Criteria) this;
        }

        public Criteria andI3LessThan(Float value) {
            addCriterion("i3 <", value, "i3");
            return (Criteria) this;
        }

        public Criteria andI3LessThanOrEqualTo(Float value) {
            addCriterion("i3 <=", value, "i3");
            return (Criteria) this;
        }

        public Criteria andI3In(List<Float> values) {
            addCriterion("i3 in", values, "i3");
            return (Criteria) this;
        }

        public Criteria andI3NotIn(List<Float> values) {
            addCriterion("i3 not in", values, "i3");
            return (Criteria) this;
        }

        public Criteria andI3Between(Float value1, Float value2) {
            addCriterion("i3 between", value1, value2, "i3");
            return (Criteria) this;
        }

        public Criteria andI3NotBetween(Float value1, Float value2) {
            addCriterion("i3 not between", value1, value2, "i3");
            return (Criteria) this;
        }

        public Criteria andI4IsNull() {
            addCriterion("i4 is null");
            return (Criteria) this;
        }

        public Criteria andI4IsNotNull() {
            addCriterion("i4 is not null");
            return (Criteria) this;
        }

        public Criteria andI4EqualTo(Float value) {
            addCriterion("i4 =", value, "i4");
            return (Criteria) this;
        }

        public Criteria andI4NotEqualTo(Float value) {
            addCriterion("i4 <>", value, "i4");
            return (Criteria) this;
        }

        public Criteria andI4GreaterThan(Float value) {
            addCriterion("i4 >", value, "i4");
            return (Criteria) this;
        }

        public Criteria andI4GreaterThanOrEqualTo(Float value) {
            addCriterion("i4 >=", value, "i4");
            return (Criteria) this;
        }

        public Criteria andI4LessThan(Float value) {
            addCriterion("i4 <", value, "i4");
            return (Criteria) this;
        }

        public Criteria andI4LessThanOrEqualTo(Float value) {
            addCriterion("i4 <=", value, "i4");
            return (Criteria) this;
        }

        public Criteria andI4In(List<Float> values) {
            addCriterion("i4 in", values, "i4");
            return (Criteria) this;
        }

        public Criteria andI4NotIn(List<Float> values) {
            addCriterion("i4 not in", values, "i4");
            return (Criteria) this;
        }

        public Criteria andI4Between(Float value1, Float value2) {
            addCriterion("i4 between", value1, value2, "i4");
            return (Criteria) this;
        }

        public Criteria andI4NotBetween(Float value1, Float value2) {
            addCriterion("i4 not between", value1, value2, "i4");
            return (Criteria) this;
        }

        public Criteria andJ1IsNull() {
            addCriterion("j1 is null");
            return (Criteria) this;
        }

        public Criteria andJ1IsNotNull() {
            addCriterion("j1 is not null");
            return (Criteria) this;
        }

        public Criteria andJ1EqualTo(Float value) {
            addCriterion("j1 =", value, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1NotEqualTo(Float value) {
            addCriterion("j1 <>", value, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1GreaterThan(Float value) {
            addCriterion("j1 >", value, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1GreaterThanOrEqualTo(Float value) {
            addCriterion("j1 >=", value, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1LessThan(Float value) {
            addCriterion("j1 <", value, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1LessThanOrEqualTo(Float value) {
            addCriterion("j1 <=", value, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1In(List<Float> values) {
            addCriterion("j1 in", values, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1NotIn(List<Float> values) {
            addCriterion("j1 not in", values, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1Between(Float value1, Float value2) {
            addCriterion("j1 between", value1, value2, "j1");
            return (Criteria) this;
        }

        public Criteria andJ1NotBetween(Float value1, Float value2) {
            addCriterion("j1 not between", value1, value2, "j1");
            return (Criteria) this;
        }

        public Criteria andJ2IsNull() {
            addCriterion("j2 is null");
            return (Criteria) this;
        }

        public Criteria andJ2IsNotNull() {
            addCriterion("j2 is not null");
            return (Criteria) this;
        }

        public Criteria andJ2EqualTo(Float value) {
            addCriterion("j2 =", value, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2NotEqualTo(Float value) {
            addCriterion("j2 <>", value, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2GreaterThan(Float value) {
            addCriterion("j2 >", value, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2GreaterThanOrEqualTo(Float value) {
            addCriterion("j2 >=", value, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2LessThan(Float value) {
            addCriterion("j2 <", value, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2LessThanOrEqualTo(Float value) {
            addCriterion("j2 <=", value, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2In(List<Float> values) {
            addCriterion("j2 in", values, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2NotIn(List<Float> values) {
            addCriterion("j2 not in", values, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2Between(Float value1, Float value2) {
            addCriterion("j2 between", value1, value2, "j2");
            return (Criteria) this;
        }

        public Criteria andJ2NotBetween(Float value1, Float value2) {
            addCriterion("j2 not between", value1, value2, "j2");
            return (Criteria) this;
        }

        public Criteria andJ3IsNull() {
            addCriterion("j3 is null");
            return (Criteria) this;
        }

        public Criteria andJ3IsNotNull() {
            addCriterion("j3 is not null");
            return (Criteria) this;
        }

        public Criteria andJ3EqualTo(Float value) {
            addCriterion("j3 =", value, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3NotEqualTo(Float value) {
            addCriterion("j3 <>", value, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3GreaterThan(Float value) {
            addCriterion("j3 >", value, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3GreaterThanOrEqualTo(Float value) {
            addCriterion("j3 >=", value, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3LessThan(Float value) {
            addCriterion("j3 <", value, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3LessThanOrEqualTo(Float value) {
            addCriterion("j3 <=", value, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3In(List<Float> values) {
            addCriterion("j3 in", values, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3NotIn(List<Float> values) {
            addCriterion("j3 not in", values, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3Between(Float value1, Float value2) {
            addCriterion("j3 between", value1, value2, "j3");
            return (Criteria) this;
        }

        public Criteria andJ3NotBetween(Float value1, Float value2) {
            addCriterion("j3 not between", value1, value2, "j3");
            return (Criteria) this;
        }

        public Criteria andJ4IsNull() {
            addCriterion("j4 is null");
            return (Criteria) this;
        }

        public Criteria andJ4IsNotNull() {
            addCriterion("j4 is not null");
            return (Criteria) this;
        }

        public Criteria andJ4EqualTo(Float value) {
            addCriterion("j4 =", value, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4NotEqualTo(Float value) {
            addCriterion("j4 <>", value, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4GreaterThan(Float value) {
            addCriterion("j4 >", value, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4GreaterThanOrEqualTo(Float value) {
            addCriterion("j4 >=", value, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4LessThan(Float value) {
            addCriterion("j4 <", value, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4LessThanOrEqualTo(Float value) {
            addCriterion("j4 <=", value, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4In(List<Float> values) {
            addCriterion("j4 in", values, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4NotIn(List<Float> values) {
            addCriterion("j4 not in", values, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4Between(Float value1, Float value2) {
            addCriterion("j4 between", value1, value2, "j4");
            return (Criteria) this;
        }

        public Criteria andJ4NotBetween(Float value1, Float value2) {
            addCriterion("j4 not between", value1, value2, "j4");
            return (Criteria) this;
        }

        public Criteria andK1IsNull() {
            addCriterion("k1 is null");
            return (Criteria) this;
        }

        public Criteria andK1IsNotNull() {
            addCriterion("k1 is not null");
            return (Criteria) this;
        }

        public Criteria andK1EqualTo(Float value) {
            addCriterion("k1 =", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotEqualTo(Float value) {
            addCriterion("k1 <>", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1GreaterThan(Float value) {
            addCriterion("k1 >", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1GreaterThanOrEqualTo(Float value) {
            addCriterion("k1 >=", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1LessThan(Float value) {
            addCriterion("k1 <", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1LessThanOrEqualTo(Float value) {
            addCriterion("k1 <=", value, "k1");
            return (Criteria) this;
        }

        public Criteria andK1In(List<Float> values) {
            addCriterion("k1 in", values, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotIn(List<Float> values) {
            addCriterion("k1 not in", values, "k1");
            return (Criteria) this;
        }

        public Criteria andK1Between(Float value1, Float value2) {
            addCriterion("k1 between", value1, value2, "k1");
            return (Criteria) this;
        }

        public Criteria andK1NotBetween(Float value1, Float value2) {
            addCriterion("k1 not between", value1, value2, "k1");
            return (Criteria) this;
        }

        public Criteria andK2IsNull() {
            addCriterion("k2 is null");
            return (Criteria) this;
        }

        public Criteria andK2IsNotNull() {
            addCriterion("k2 is not null");
            return (Criteria) this;
        }

        public Criteria andK2EqualTo(Float value) {
            addCriterion("k2 =", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotEqualTo(Float value) {
            addCriterion("k2 <>", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2GreaterThan(Float value) {
            addCriterion("k2 >", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2GreaterThanOrEqualTo(Float value) {
            addCriterion("k2 >=", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2LessThan(Float value) {
            addCriterion("k2 <", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2LessThanOrEqualTo(Float value) {
            addCriterion("k2 <=", value, "k2");
            return (Criteria) this;
        }

        public Criteria andK2In(List<Float> values) {
            addCriterion("k2 in", values, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotIn(List<Float> values) {
            addCriterion("k2 not in", values, "k2");
            return (Criteria) this;
        }

        public Criteria andK2Between(Float value1, Float value2) {
            addCriterion("k2 between", value1, value2, "k2");
            return (Criteria) this;
        }

        public Criteria andK2NotBetween(Float value1, Float value2) {
            addCriterion("k2 not between", value1, value2, "k2");
            return (Criteria) this;
        }

        public Criteria andK3IsNull() {
            addCriterion("k3 is null");
            return (Criteria) this;
        }

        public Criteria andK3IsNotNull() {
            addCriterion("k3 is not null");
            return (Criteria) this;
        }

        public Criteria andK3EqualTo(Float value) {
            addCriterion("k3 =", value, "k3");
            return (Criteria) this;
        }

        public Criteria andK3NotEqualTo(Float value) {
            addCriterion("k3 <>", value, "k3");
            return (Criteria) this;
        }

        public Criteria andK3GreaterThan(Float value) {
            addCriterion("k3 >", value, "k3");
            return (Criteria) this;
        }

        public Criteria andK3GreaterThanOrEqualTo(Float value) {
            addCriterion("k3 >=", value, "k3");
            return (Criteria) this;
        }

        public Criteria andK3LessThan(Float value) {
            addCriterion("k3 <", value, "k3");
            return (Criteria) this;
        }

        public Criteria andK3LessThanOrEqualTo(Float value) {
            addCriterion("k3 <=", value, "k3");
            return (Criteria) this;
        }

        public Criteria andK3In(List<Float> values) {
            addCriterion("k3 in", values, "k3");
            return (Criteria) this;
        }

        public Criteria andK3NotIn(List<Float> values) {
            addCriterion("k3 not in", values, "k3");
            return (Criteria) this;
        }

        public Criteria andK3Between(Float value1, Float value2) {
            addCriterion("k3 between", value1, value2, "k3");
            return (Criteria) this;
        }

        public Criteria andK3NotBetween(Float value1, Float value2) {
            addCriterion("k3 not between", value1, value2, "k3");
            return (Criteria) this;
        }

        public Criteria andK4IsNull() {
            addCriterion("k4 is null");
            return (Criteria) this;
        }

        public Criteria andK4IsNotNull() {
            addCriterion("k4 is not null");
            return (Criteria) this;
        }

        public Criteria andK4EqualTo(Float value) {
            addCriterion("k4 =", value, "k4");
            return (Criteria) this;
        }

        public Criteria andK4NotEqualTo(Float value) {
            addCriterion("k4 <>", value, "k4");
            return (Criteria) this;
        }

        public Criteria andK4GreaterThan(Float value) {
            addCriterion("k4 >", value, "k4");
            return (Criteria) this;
        }

        public Criteria andK4GreaterThanOrEqualTo(Float value) {
            addCriterion("k4 >=", value, "k4");
            return (Criteria) this;
        }

        public Criteria andK4LessThan(Float value) {
            addCriterion("k4 <", value, "k4");
            return (Criteria) this;
        }

        public Criteria andK4LessThanOrEqualTo(Float value) {
            addCriterion("k4 <=", value, "k4");
            return (Criteria) this;
        }

        public Criteria andK4In(List<Float> values) {
            addCriterion("k4 in", values, "k4");
            return (Criteria) this;
        }

        public Criteria andK4NotIn(List<Float> values) {
            addCriterion("k4 not in", values, "k4");
            return (Criteria) this;
        }

        public Criteria andK4Between(Float value1, Float value2) {
            addCriterion("k4 between", value1, value2, "k4");
            return (Criteria) this;
        }

        public Criteria andK4NotBetween(Float value1, Float value2) {
            addCriterion("k4 not between", value1, value2, "k4");
            return (Criteria) this;
        }

        public Criteria andL1IsNull() {
            addCriterion("l1 is null");
            return (Criteria) this;
        }

        public Criteria andL1IsNotNull() {
            addCriterion("l1 is not null");
            return (Criteria) this;
        }

        public Criteria andL1EqualTo(Float value) {
            addCriterion("l1 =", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotEqualTo(Float value) {
            addCriterion("l1 <>", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1GreaterThan(Float value) {
            addCriterion("l1 >", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1GreaterThanOrEqualTo(Float value) {
            addCriterion("l1 >=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1LessThan(Float value) {
            addCriterion("l1 <", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1LessThanOrEqualTo(Float value) {
            addCriterion("l1 <=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1In(List<Float> values) {
            addCriterion("l1 in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotIn(List<Float> values) {
            addCriterion("l1 not in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andL1Between(Float value1, Float value2) {
            addCriterion("l1 between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotBetween(Float value1, Float value2) {
            addCriterion("l1 not between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andL2IsNull() {
            addCriterion("l2 is null");
            return (Criteria) this;
        }

        public Criteria andL2IsNotNull() {
            addCriterion("l2 is not null");
            return (Criteria) this;
        }

        public Criteria andL2EqualTo(Float value) {
            addCriterion("l2 =", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotEqualTo(Float value) {
            addCriterion("l2 <>", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2GreaterThan(Float value) {
            addCriterion("l2 >", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2GreaterThanOrEqualTo(Float value) {
            addCriterion("l2 >=", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2LessThan(Float value) {
            addCriterion("l2 <", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2LessThanOrEqualTo(Float value) {
            addCriterion("l2 <=", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2In(List<Float> values) {
            addCriterion("l2 in", values, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotIn(List<Float> values) {
            addCriterion("l2 not in", values, "l2");
            return (Criteria) this;
        }

        public Criteria andL2Between(Float value1, Float value2) {
            addCriterion("l2 between", value1, value2, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotBetween(Float value1, Float value2) {
            addCriterion("l2 not between", value1, value2, "l2");
            return (Criteria) this;
        }

        public Criteria andL3IsNull() {
            addCriterion("l3 is null");
            return (Criteria) this;
        }

        public Criteria andL3IsNotNull() {
            addCriterion("l3 is not null");
            return (Criteria) this;
        }

        public Criteria andL3EqualTo(Float value) {
            addCriterion("l3 =", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotEqualTo(Float value) {
            addCriterion("l3 <>", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3GreaterThan(Float value) {
            addCriterion("l3 >", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3GreaterThanOrEqualTo(Float value) {
            addCriterion("l3 >=", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3LessThan(Float value) {
            addCriterion("l3 <", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3LessThanOrEqualTo(Float value) {
            addCriterion("l3 <=", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3In(List<Float> values) {
            addCriterion("l3 in", values, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotIn(List<Float> values) {
            addCriterion("l3 not in", values, "l3");
            return (Criteria) this;
        }

        public Criteria andL3Between(Float value1, Float value2) {
            addCriterion("l3 between", value1, value2, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotBetween(Float value1, Float value2) {
            addCriterion("l3 not between", value1, value2, "l3");
            return (Criteria) this;
        }

        public Criteria andL4IsNull() {
            addCriterion("l4 is null");
            return (Criteria) this;
        }

        public Criteria andL4IsNotNull() {
            addCriterion("l4 is not null");
            return (Criteria) this;
        }

        public Criteria andL4EqualTo(Float value) {
            addCriterion("l4 =", value, "l4");
            return (Criteria) this;
        }

        public Criteria andL4NotEqualTo(Float value) {
            addCriterion("l4 <>", value, "l4");
            return (Criteria) this;
        }

        public Criteria andL4GreaterThan(Float value) {
            addCriterion("l4 >", value, "l4");
            return (Criteria) this;
        }

        public Criteria andL4GreaterThanOrEqualTo(Float value) {
            addCriterion("l4 >=", value, "l4");
            return (Criteria) this;
        }

        public Criteria andL4LessThan(Float value) {
            addCriterion("l4 <", value, "l4");
            return (Criteria) this;
        }

        public Criteria andL4LessThanOrEqualTo(Float value) {
            addCriterion("l4 <=", value, "l4");
            return (Criteria) this;
        }

        public Criteria andL4In(List<Float> values) {
            addCriterion("l4 in", values, "l4");
            return (Criteria) this;
        }

        public Criteria andL4NotIn(List<Float> values) {
            addCriterion("l4 not in", values, "l4");
            return (Criteria) this;
        }

        public Criteria andL4Between(Float value1, Float value2) {
            addCriterion("l4 between", value1, value2, "l4");
            return (Criteria) this;
        }

        public Criteria andL4NotBetween(Float value1, Float value2) {
            addCriterion("l4 not between", value1, value2, "l4");
            return (Criteria) this;
        }

        public Criteria andM1IsNull() {
            addCriterion("m1 is null");
            return (Criteria) this;
        }

        public Criteria andM1IsNotNull() {
            addCriterion("m1 is not null");
            return (Criteria) this;
        }

        public Criteria andM1EqualTo(Float value) {
            addCriterion("m1 =", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotEqualTo(Float value) {
            addCriterion("m1 <>", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThan(Float value) {
            addCriterion("m1 >", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThanOrEqualTo(Float value) {
            addCriterion("m1 >=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThan(Float value) {
            addCriterion("m1 <", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThanOrEqualTo(Float value) {
            addCriterion("m1 <=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1In(List<Float> values) {
            addCriterion("m1 in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotIn(List<Float> values) {
            addCriterion("m1 not in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Between(Float value1, Float value2) {
            addCriterion("m1 between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotBetween(Float value1, Float value2) {
            addCriterion("m1 not between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM2IsNull() {
            addCriterion("m2 is null");
            return (Criteria) this;
        }

        public Criteria andM2IsNotNull() {
            addCriterion("m2 is not null");
            return (Criteria) this;
        }

        public Criteria andM2EqualTo(Float value) {
            addCriterion("m2 =", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotEqualTo(Float value) {
            addCriterion("m2 <>", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThan(Float value) {
            addCriterion("m2 >", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThanOrEqualTo(Float value) {
            addCriterion("m2 >=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThan(Float value) {
            addCriterion("m2 <", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThanOrEqualTo(Float value) {
            addCriterion("m2 <=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2In(List<Float> values) {
            addCriterion("m2 in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotIn(List<Float> values) {
            addCriterion("m2 not in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Between(Float value1, Float value2) {
            addCriterion("m2 between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotBetween(Float value1, Float value2) {
            addCriterion("m2 not between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM3IsNull() {
            addCriterion("m3 is null");
            return (Criteria) this;
        }

        public Criteria andM3IsNotNull() {
            addCriterion("m3 is not null");
            return (Criteria) this;
        }

        public Criteria andM3EqualTo(Float value) {
            addCriterion("m3 =", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotEqualTo(Float value) {
            addCriterion("m3 <>", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3GreaterThan(Float value) {
            addCriterion("m3 >", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3GreaterThanOrEqualTo(Float value) {
            addCriterion("m3 >=", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3LessThan(Float value) {
            addCriterion("m3 <", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3LessThanOrEqualTo(Float value) {
            addCriterion("m3 <=", value, "m3");
            return (Criteria) this;
        }

        public Criteria andM3In(List<Float> values) {
            addCriterion("m3 in", values, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotIn(List<Float> values) {
            addCriterion("m3 not in", values, "m3");
            return (Criteria) this;
        }

        public Criteria andM3Between(Float value1, Float value2) {
            addCriterion("m3 between", value1, value2, "m3");
            return (Criteria) this;
        }

        public Criteria andM3NotBetween(Float value1, Float value2) {
            addCriterion("m3 not between", value1, value2, "m3");
            return (Criteria) this;
        }

        public Criteria andM4IsNull() {
            addCriterion("m4 is null");
            return (Criteria) this;
        }

        public Criteria andM4IsNotNull() {
            addCriterion("m4 is not null");
            return (Criteria) this;
        }

        public Criteria andM4EqualTo(Float value) {
            addCriterion("m4 =", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotEqualTo(Float value) {
            addCriterion("m4 <>", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4GreaterThan(Float value) {
            addCriterion("m4 >", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4GreaterThanOrEqualTo(Float value) {
            addCriterion("m4 >=", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4LessThan(Float value) {
            addCriterion("m4 <", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4LessThanOrEqualTo(Float value) {
            addCriterion("m4 <=", value, "m4");
            return (Criteria) this;
        }

        public Criteria andM4In(List<Float> values) {
            addCriterion("m4 in", values, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotIn(List<Float> values) {
            addCriterion("m4 not in", values, "m4");
            return (Criteria) this;
        }

        public Criteria andM4Between(Float value1, Float value2) {
            addCriterion("m4 between", value1, value2, "m4");
            return (Criteria) this;
        }

        public Criteria andM4NotBetween(Float value1, Float value2) {
            addCriterion("m4 not between", value1, value2, "m4");
            return (Criteria) this;
        }

        public Criteria andN1IsNull() {
            addCriterion("n1 is null");
            return (Criteria) this;
        }

        public Criteria andN1IsNotNull() {
            addCriterion("n1 is not null");
            return (Criteria) this;
        }

        public Criteria andN1EqualTo(Float value) {
            addCriterion("n1 =", value, "n1");
            return (Criteria) this;
        }

        public Criteria andN1NotEqualTo(Float value) {
            addCriterion("n1 <>", value, "n1");
            return (Criteria) this;
        }

        public Criteria andN1GreaterThan(Float value) {
            addCriterion("n1 >", value, "n1");
            return (Criteria) this;
        }

        public Criteria andN1GreaterThanOrEqualTo(Float value) {
            addCriterion("n1 >=", value, "n1");
            return (Criteria) this;
        }

        public Criteria andN1LessThan(Float value) {
            addCriterion("n1 <", value, "n1");
            return (Criteria) this;
        }

        public Criteria andN1LessThanOrEqualTo(Float value) {
            addCriterion("n1 <=", value, "n1");
            return (Criteria) this;
        }

        public Criteria andN1In(List<Float> values) {
            addCriterion("n1 in", values, "n1");
            return (Criteria) this;
        }

        public Criteria andN1NotIn(List<Float> values) {
            addCriterion("n1 not in", values, "n1");
            return (Criteria) this;
        }

        public Criteria andN1Between(Float value1, Float value2) {
            addCriterion("n1 between", value1, value2, "n1");
            return (Criteria) this;
        }

        public Criteria andN1NotBetween(Float value1, Float value2) {
            addCriterion("n1 not between", value1, value2, "n1");
            return (Criteria) this;
        }

        public Criteria andN2IsNull() {
            addCriterion("n2 is null");
            return (Criteria) this;
        }

        public Criteria andN2IsNotNull() {
            addCriterion("n2 is not null");
            return (Criteria) this;
        }

        public Criteria andN2EqualTo(Float value) {
            addCriterion("n2 =", value, "n2");
            return (Criteria) this;
        }

        public Criteria andN2NotEqualTo(Float value) {
            addCriterion("n2 <>", value, "n2");
            return (Criteria) this;
        }

        public Criteria andN2GreaterThan(Float value) {
            addCriterion("n2 >", value, "n2");
            return (Criteria) this;
        }

        public Criteria andN2GreaterThanOrEqualTo(Float value) {
            addCriterion("n2 >=", value, "n2");
            return (Criteria) this;
        }

        public Criteria andN2LessThan(Float value) {
            addCriterion("n2 <", value, "n2");
            return (Criteria) this;
        }

        public Criteria andN2LessThanOrEqualTo(Float value) {
            addCriterion("n2 <=", value, "n2");
            return (Criteria) this;
        }

        public Criteria andN2In(List<Float> values) {
            addCriterion("n2 in", values, "n2");
            return (Criteria) this;
        }

        public Criteria andN2NotIn(List<Float> values) {
            addCriterion("n2 not in", values, "n2");
            return (Criteria) this;
        }

        public Criteria andN2Between(Float value1, Float value2) {
            addCriterion("n2 between", value1, value2, "n2");
            return (Criteria) this;
        }

        public Criteria andN2NotBetween(Float value1, Float value2) {
            addCriterion("n2 not between", value1, value2, "n2");
            return (Criteria) this;
        }

        public Criteria andN3IsNull() {
            addCriterion("n3 is null");
            return (Criteria) this;
        }

        public Criteria andN3IsNotNull() {
            addCriterion("n3 is not null");
            return (Criteria) this;
        }

        public Criteria andN3EqualTo(Float value) {
            addCriterion("n3 =", value, "n3");
            return (Criteria) this;
        }

        public Criteria andN3NotEqualTo(Float value) {
            addCriterion("n3 <>", value, "n3");
            return (Criteria) this;
        }

        public Criteria andN3GreaterThan(Float value) {
            addCriterion("n3 >", value, "n3");
            return (Criteria) this;
        }

        public Criteria andN3GreaterThanOrEqualTo(Float value) {
            addCriterion("n3 >=", value, "n3");
            return (Criteria) this;
        }

        public Criteria andN3LessThan(Float value) {
            addCriterion("n3 <", value, "n3");
            return (Criteria) this;
        }

        public Criteria andN3LessThanOrEqualTo(Float value) {
            addCriterion("n3 <=", value, "n3");
            return (Criteria) this;
        }

        public Criteria andN3In(List<Float> values) {
            addCriterion("n3 in", values, "n3");
            return (Criteria) this;
        }

        public Criteria andN3NotIn(List<Float> values) {
            addCriterion("n3 not in", values, "n3");
            return (Criteria) this;
        }

        public Criteria andN3Between(Float value1, Float value2) {
            addCriterion("n3 between", value1, value2, "n3");
            return (Criteria) this;
        }

        public Criteria andN3NotBetween(Float value1, Float value2) {
            addCriterion("n3 not between", value1, value2, "n3");
            return (Criteria) this;
        }

        public Criteria andN4IsNull() {
            addCriterion("n4 is null");
            return (Criteria) this;
        }

        public Criteria andN4IsNotNull() {
            addCriterion("n4 is not null");
            return (Criteria) this;
        }

        public Criteria andN4EqualTo(Float value) {
            addCriterion("n4 =", value, "n4");
            return (Criteria) this;
        }

        public Criteria andN4NotEqualTo(Float value) {
            addCriterion("n4 <>", value, "n4");
            return (Criteria) this;
        }

        public Criteria andN4GreaterThan(Float value) {
            addCriterion("n4 >", value, "n4");
            return (Criteria) this;
        }

        public Criteria andN4GreaterThanOrEqualTo(Float value) {
            addCriterion("n4 >=", value, "n4");
            return (Criteria) this;
        }

        public Criteria andN4LessThan(Float value) {
            addCriterion("n4 <", value, "n4");
            return (Criteria) this;
        }

        public Criteria andN4LessThanOrEqualTo(Float value) {
            addCriterion("n4 <=", value, "n4");
            return (Criteria) this;
        }

        public Criteria andN4In(List<Float> values) {
            addCriterion("n4 in", values, "n4");
            return (Criteria) this;
        }

        public Criteria andN4NotIn(List<Float> values) {
            addCriterion("n4 not in", values, "n4");
            return (Criteria) this;
        }

        public Criteria andN4Between(Float value1, Float value2) {
            addCriterion("n4 between", value1, value2, "n4");
            return (Criteria) this;
        }

        public Criteria andN4NotBetween(Float value1, Float value2) {
            addCriterion("n4 not between", value1, value2, "n4");
            return (Criteria) this;
        }

        public Criteria andO1IsNull() {
            addCriterion("o1 is null");
            return (Criteria) this;
        }

        public Criteria andO1IsNotNull() {
            addCriterion("o1 is not null");
            return (Criteria) this;
        }

        public Criteria andO1EqualTo(Float value) {
            addCriterion("o1 =", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotEqualTo(Float value) {
            addCriterion("o1 <>", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1GreaterThan(Float value) {
            addCriterion("o1 >", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1GreaterThanOrEqualTo(Float value) {
            addCriterion("o1 >=", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1LessThan(Float value) {
            addCriterion("o1 <", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1LessThanOrEqualTo(Float value) {
            addCriterion("o1 <=", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1In(List<Float> values) {
            addCriterion("o1 in", values, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotIn(List<Float> values) {
            addCriterion("o1 not in", values, "o1");
            return (Criteria) this;
        }

        public Criteria andO1Between(Float value1, Float value2) {
            addCriterion("o1 between", value1, value2, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotBetween(Float value1, Float value2) {
            addCriterion("o1 not between", value1, value2, "o1");
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

        public Criteria andO3IsNull() {
            addCriterion("o3 is null");
            return (Criteria) this;
        }

        public Criteria andO3IsNotNull() {
            addCriterion("o3 is not null");
            return (Criteria) this;
        }

        public Criteria andO3EqualTo(Float value) {
            addCriterion("o3 =", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotEqualTo(Float value) {
            addCriterion("o3 <>", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThan(Float value) {
            addCriterion("o3 >", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThanOrEqualTo(Float value) {
            addCriterion("o3 >=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThan(Float value) {
            addCriterion("o3 <", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThanOrEqualTo(Float value) {
            addCriterion("o3 <=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3In(List<Float> values) {
            addCriterion("o3 in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotIn(List<Float> values) {
            addCriterion("o3 not in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3Between(Float value1, Float value2) {
            addCriterion("o3 between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotBetween(Float value1, Float value2) {
            addCriterion("o3 not between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andO4IsNull() {
            addCriterion("o4 is null");
            return (Criteria) this;
        }

        public Criteria andO4IsNotNull() {
            addCriterion("o4 is not null");
            return (Criteria) this;
        }

        public Criteria andO4EqualTo(Float value) {
            addCriterion("o4 =", value, "o4");
            return (Criteria) this;
        }

        public Criteria andO4NotEqualTo(Float value) {
            addCriterion("o4 <>", value, "o4");
            return (Criteria) this;
        }

        public Criteria andO4GreaterThan(Float value) {
            addCriterion("o4 >", value, "o4");
            return (Criteria) this;
        }

        public Criteria andO4GreaterThanOrEqualTo(Float value) {
            addCriterion("o4 >=", value, "o4");
            return (Criteria) this;
        }

        public Criteria andO4LessThan(Float value) {
            addCriterion("o4 <", value, "o4");
            return (Criteria) this;
        }

        public Criteria andO4LessThanOrEqualTo(Float value) {
            addCriterion("o4 <=", value, "o4");
            return (Criteria) this;
        }

        public Criteria andO4In(List<Float> values) {
            addCriterion("o4 in", values, "o4");
            return (Criteria) this;
        }

        public Criteria andO4NotIn(List<Float> values) {
            addCriterion("o4 not in", values, "o4");
            return (Criteria) this;
        }

        public Criteria andO4Between(Float value1, Float value2) {
            addCriterion("o4 between", value1, value2, "o4");
            return (Criteria) this;
        }

        public Criteria andO4NotBetween(Float value1, Float value2) {
            addCriterion("o4 not between", value1, value2, "o4");
            return (Criteria) this;
        }

        public Criteria andP1IsNull() {
            addCriterion("p1 is null");
            return (Criteria) this;
        }

        public Criteria andP1IsNotNull() {
            addCriterion("p1 is not null");
            return (Criteria) this;
        }

        public Criteria andP1EqualTo(Float value) {
            addCriterion("p1 =", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotEqualTo(Float value) {
            addCriterion("p1 <>", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1GreaterThan(Float value) {
            addCriterion("p1 >", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1GreaterThanOrEqualTo(Float value) {
            addCriterion("p1 >=", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1LessThan(Float value) {
            addCriterion("p1 <", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1LessThanOrEqualTo(Float value) {
            addCriterion("p1 <=", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1In(List<Float> values) {
            addCriterion("p1 in", values, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotIn(List<Float> values) {
            addCriterion("p1 not in", values, "p1");
            return (Criteria) this;
        }

        public Criteria andP1Between(Float value1, Float value2) {
            addCriterion("p1 between", value1, value2, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotBetween(Float value1, Float value2) {
            addCriterion("p1 not between", value1, value2, "p1");
            return (Criteria) this;
        }

        public Criteria andP2IsNull() {
            addCriterion("p2 is null");
            return (Criteria) this;
        }

        public Criteria andP2IsNotNull() {
            addCriterion("p2 is not null");
            return (Criteria) this;
        }

        public Criteria andP2EqualTo(Float value) {
            addCriterion("p2 =", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotEqualTo(Float value) {
            addCriterion("p2 <>", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2GreaterThan(Float value) {
            addCriterion("p2 >", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2GreaterThanOrEqualTo(Float value) {
            addCriterion("p2 >=", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2LessThan(Float value) {
            addCriterion("p2 <", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2LessThanOrEqualTo(Float value) {
            addCriterion("p2 <=", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2In(List<Float> values) {
            addCriterion("p2 in", values, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotIn(List<Float> values) {
            addCriterion("p2 not in", values, "p2");
            return (Criteria) this;
        }

        public Criteria andP2Between(Float value1, Float value2) {
            addCriterion("p2 between", value1, value2, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotBetween(Float value1, Float value2) {
            addCriterion("p2 not between", value1, value2, "p2");
            return (Criteria) this;
        }

        public Criteria andP3IsNull() {
            addCriterion("p3 is null");
            return (Criteria) this;
        }

        public Criteria andP3IsNotNull() {
            addCriterion("p3 is not null");
            return (Criteria) this;
        }

        public Criteria andP3EqualTo(Float value) {
            addCriterion("p3 =", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotEqualTo(Float value) {
            addCriterion("p3 <>", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3GreaterThan(Float value) {
            addCriterion("p3 >", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3GreaterThanOrEqualTo(Float value) {
            addCriterion("p3 >=", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3LessThan(Float value) {
            addCriterion("p3 <", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3LessThanOrEqualTo(Float value) {
            addCriterion("p3 <=", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3In(List<Float> values) {
            addCriterion("p3 in", values, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotIn(List<Float> values) {
            addCriterion("p3 not in", values, "p3");
            return (Criteria) this;
        }

        public Criteria andP3Between(Float value1, Float value2) {
            addCriterion("p3 between", value1, value2, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotBetween(Float value1, Float value2) {
            addCriterion("p3 not between", value1, value2, "p3");
            return (Criteria) this;
        }

        public Criteria andP4IsNull() {
            addCriterion("p4 is null");
            return (Criteria) this;
        }

        public Criteria andP4IsNotNull() {
            addCriterion("p4 is not null");
            return (Criteria) this;
        }

        public Criteria andP4EqualTo(Float value) {
            addCriterion("p4 =", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotEqualTo(Float value) {
            addCriterion("p4 <>", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4GreaterThan(Float value) {
            addCriterion("p4 >", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4GreaterThanOrEqualTo(Float value) {
            addCriterion("p4 >=", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4LessThan(Float value) {
            addCriterion("p4 <", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4LessThanOrEqualTo(Float value) {
            addCriterion("p4 <=", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4In(List<Float> values) {
            addCriterion("p4 in", values, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotIn(List<Float> values) {
            addCriterion("p4 not in", values, "p4");
            return (Criteria) this;
        }

        public Criteria andP4Between(Float value1, Float value2) {
            addCriterion("p4 between", value1, value2, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotBetween(Float value1, Float value2) {
            addCriterion("p4 not between", value1, value2, "p4");
            return (Criteria) this;
        }

        public Criteria andQ1IsNull() {
            addCriterion("q1 is null");
            return (Criteria) this;
        }

        public Criteria andQ1IsNotNull() {
            addCriterion("q1 is not null");
            return (Criteria) this;
        }

        public Criteria andQ1EqualTo(Float value) {
            addCriterion("q1 =", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotEqualTo(Float value) {
            addCriterion("q1 <>", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThan(Float value) {
            addCriterion("q1 >", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1GreaterThanOrEqualTo(Float value) {
            addCriterion("q1 >=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThan(Float value) {
            addCriterion("q1 <", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1LessThanOrEqualTo(Float value) {
            addCriterion("q1 <=", value, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1In(List<Float> values) {
            addCriterion("q1 in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotIn(List<Float> values) {
            addCriterion("q1 not in", values, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1Between(Float value1, Float value2) {
            addCriterion("q1 between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ1NotBetween(Float value1, Float value2) {
            addCriterion("q1 not between", value1, value2, "q1");
            return (Criteria) this;
        }

        public Criteria andQ2IsNull() {
            addCriterion("q2 is null");
            return (Criteria) this;
        }

        public Criteria andQ2IsNotNull() {
            addCriterion("q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQ2EqualTo(Float value) {
            addCriterion("q2 =", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotEqualTo(Float value) {
            addCriterion("q2 <>", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThan(Float value) {
            addCriterion("q2 >", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2GreaterThanOrEqualTo(Float value) {
            addCriterion("q2 >=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThan(Float value) {
            addCriterion("q2 <", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2LessThanOrEqualTo(Float value) {
            addCriterion("q2 <=", value, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2In(List<Float> values) {
            addCriterion("q2 in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotIn(List<Float> values) {
            addCriterion("q2 not in", values, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2Between(Float value1, Float value2) {
            addCriterion("q2 between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ2NotBetween(Float value1, Float value2) {
            addCriterion("q2 not between", value1, value2, "q2");
            return (Criteria) this;
        }

        public Criteria andQ3IsNull() {
            addCriterion("q3 is null");
            return (Criteria) this;
        }

        public Criteria andQ3IsNotNull() {
            addCriterion("q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQ3EqualTo(Float value) {
            addCriterion("q3 =", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotEqualTo(Float value) {
            addCriterion("q3 <>", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThan(Float value) {
            addCriterion("q3 >", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3GreaterThanOrEqualTo(Float value) {
            addCriterion("q3 >=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThan(Float value) {
            addCriterion("q3 <", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3LessThanOrEqualTo(Float value) {
            addCriterion("q3 <=", value, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3In(List<Float> values) {
            addCriterion("q3 in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotIn(List<Float> values) {
            addCriterion("q3 not in", values, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3Between(Float value1, Float value2) {
            addCriterion("q3 between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ3NotBetween(Float value1, Float value2) {
            addCriterion("q3 not between", value1, value2, "q3");
            return (Criteria) this;
        }

        public Criteria andQ4IsNull() {
            addCriterion("q4 is null");
            return (Criteria) this;
        }

        public Criteria andQ4IsNotNull() {
            addCriterion("q4 is not null");
            return (Criteria) this;
        }

        public Criteria andQ4EqualTo(Float value) {
            addCriterion("q4 =", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotEqualTo(Float value) {
            addCriterion("q4 <>", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThan(Float value) {
            addCriterion("q4 >", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4GreaterThanOrEqualTo(Float value) {
            addCriterion("q4 >=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThan(Float value) {
            addCriterion("q4 <", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4LessThanOrEqualTo(Float value) {
            addCriterion("q4 <=", value, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4In(List<Float> values) {
            addCriterion("q4 in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotIn(List<Float> values) {
            addCriterion("q4 not in", values, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4Between(Float value1, Float value2) {
            addCriterion("q4 between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andQ4NotBetween(Float value1, Float value2) {
            addCriterion("q4 not between", value1, value2, "q4");
            return (Criteria) this;
        }

        public Criteria andR1IsNull() {
            addCriterion("r1 is null");
            return (Criteria) this;
        }

        public Criteria andR1IsNotNull() {
            addCriterion("r1 is not null");
            return (Criteria) this;
        }

        public Criteria andR1EqualTo(Float value) {
            addCriterion("r1 =", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotEqualTo(Float value) {
            addCriterion("r1 <>", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThan(Float value) {
            addCriterion("r1 >", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThanOrEqualTo(Float value) {
            addCriterion("r1 >=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThan(Float value) {
            addCriterion("r1 <", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThanOrEqualTo(Float value) {
            addCriterion("r1 <=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1In(List<Float> values) {
            addCriterion("r1 in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotIn(List<Float> values) {
            addCriterion("r1 not in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Between(Float value1, Float value2) {
            addCriterion("r1 between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotBetween(Float value1, Float value2) {
            addCriterion("r1 not between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR2IsNull() {
            addCriterion("r2 is null");
            return (Criteria) this;
        }

        public Criteria andR2IsNotNull() {
            addCriterion("r2 is not null");
            return (Criteria) this;
        }

        public Criteria andR2EqualTo(Float value) {
            addCriterion("r2 =", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotEqualTo(Float value) {
            addCriterion("r2 <>", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThan(Float value) {
            addCriterion("r2 >", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThanOrEqualTo(Float value) {
            addCriterion("r2 >=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThan(Float value) {
            addCriterion("r2 <", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThanOrEqualTo(Float value) {
            addCriterion("r2 <=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2In(List<Float> values) {
            addCriterion("r2 in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotIn(List<Float> values) {
            addCriterion("r2 not in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Between(Float value1, Float value2) {
            addCriterion("r2 between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotBetween(Float value1, Float value2) {
            addCriterion("r2 not between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR3IsNull() {
            addCriterion("r3 is null");
            return (Criteria) this;
        }

        public Criteria andR3IsNotNull() {
            addCriterion("r3 is not null");
            return (Criteria) this;
        }

        public Criteria andR3EqualTo(Float value) {
            addCriterion("r3 =", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotEqualTo(Float value) {
            addCriterion("r3 <>", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThan(Float value) {
            addCriterion("r3 >", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThanOrEqualTo(Float value) {
            addCriterion("r3 >=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThan(Float value) {
            addCriterion("r3 <", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThanOrEqualTo(Float value) {
            addCriterion("r3 <=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3In(List<Float> values) {
            addCriterion("r3 in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotIn(List<Float> values) {
            addCriterion("r3 not in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Between(Float value1, Float value2) {
            addCriterion("r3 between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotBetween(Float value1, Float value2) {
            addCriterion("r3 not between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR4IsNull() {
            addCriterion("r4 is null");
            return (Criteria) this;
        }

        public Criteria andR4IsNotNull() {
            addCriterion("r4 is not null");
            return (Criteria) this;
        }

        public Criteria andR4EqualTo(Float value) {
            addCriterion("r4 =", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotEqualTo(Float value) {
            addCriterion("r4 <>", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4GreaterThan(Float value) {
            addCriterion("r4 >", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4GreaterThanOrEqualTo(Float value) {
            addCriterion("r4 >=", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4LessThan(Float value) {
            addCriterion("r4 <", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4LessThanOrEqualTo(Float value) {
            addCriterion("r4 <=", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4In(List<Float> values) {
            addCriterion("r4 in", values, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotIn(List<Float> values) {
            addCriterion("r4 not in", values, "r4");
            return (Criteria) this;
        }

        public Criteria andR4Between(Float value1, Float value2) {
            addCriterion("r4 between", value1, value2, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotBetween(Float value1, Float value2) {
            addCriterion("r4 not between", value1, value2, "r4");
            return (Criteria) this;
        }

        public Criteria andS1IsNull() {
            addCriterion("s1 is null");
            return (Criteria) this;
        }

        public Criteria andS1IsNotNull() {
            addCriterion("s1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1EqualTo(Float value) {
            addCriterion("s1 =", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotEqualTo(Float value) {
            addCriterion("s1 <>", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThan(Float value) {
            addCriterion("s1 >", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThanOrEqualTo(Float value) {
            addCriterion("s1 >=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThan(Float value) {
            addCriterion("s1 <", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThanOrEqualTo(Float value) {
            addCriterion("s1 <=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1In(List<Float> values) {
            addCriterion("s1 in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotIn(List<Float> values) {
            addCriterion("s1 not in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Between(Float value1, Float value2) {
            addCriterion("s1 between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotBetween(Float value1, Float value2) {
            addCriterion("s1 not between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS2IsNull() {
            addCriterion("s2 is null");
            return (Criteria) this;
        }

        public Criteria andS2IsNotNull() {
            addCriterion("s2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2EqualTo(Float value) {
            addCriterion("s2 =", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotEqualTo(Float value) {
            addCriterion("s2 <>", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThan(Float value) {
            addCriterion("s2 >", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThanOrEqualTo(Float value) {
            addCriterion("s2 >=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThan(Float value) {
            addCriterion("s2 <", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThanOrEqualTo(Float value) {
            addCriterion("s2 <=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2In(List<Float> values) {
            addCriterion("s2 in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotIn(List<Float> values) {
            addCriterion("s2 not in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Between(Float value1, Float value2) {
            addCriterion("s2 between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotBetween(Float value1, Float value2) {
            addCriterion("s2 not between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS3IsNull() {
            addCriterion("s3 is null");
            return (Criteria) this;
        }

        public Criteria andS3IsNotNull() {
            addCriterion("s3 is not null");
            return (Criteria) this;
        }

        public Criteria andS3EqualTo(Float value) {
            addCriterion("s3 =", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotEqualTo(Float value) {
            addCriterion("s3 <>", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThan(Float value) {
            addCriterion("s3 >", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThanOrEqualTo(Float value) {
            addCriterion("s3 >=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThan(Float value) {
            addCriterion("s3 <", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThanOrEqualTo(Float value) {
            addCriterion("s3 <=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3In(List<Float> values) {
            addCriterion("s3 in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotIn(List<Float> values) {
            addCriterion("s3 not in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Between(Float value1, Float value2) {
            addCriterion("s3 between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotBetween(Float value1, Float value2) {
            addCriterion("s3 not between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS4IsNull() {
            addCriterion("s4 is null");
            return (Criteria) this;
        }

        public Criteria andS4IsNotNull() {
            addCriterion("s4 is not null");
            return (Criteria) this;
        }

        public Criteria andS4EqualTo(Float value) {
            addCriterion("s4 =", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotEqualTo(Float value) {
            addCriterion("s4 <>", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThan(Float value) {
            addCriterion("s4 >", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThanOrEqualTo(Float value) {
            addCriterion("s4 >=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThan(Float value) {
            addCriterion("s4 <", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThanOrEqualTo(Float value) {
            addCriterion("s4 <=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4In(List<Float> values) {
            addCriterion("s4 in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotIn(List<Float> values) {
            addCriterion("s4 not in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Between(Float value1, Float value2) {
            addCriterion("s4 between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotBetween(Float value1, Float value2) {
            addCriterion("s4 not between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andT1IsNull() {
            addCriterion("t1 is null");
            return (Criteria) this;
        }

        public Criteria andT1IsNotNull() {
            addCriterion("t1 is not null");
            return (Criteria) this;
        }

        public Criteria andT1EqualTo(Float value) {
            addCriterion("t1 =", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1NotEqualTo(Float value) {
            addCriterion("t1 <>", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1GreaterThan(Float value) {
            addCriterion("t1 >", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1GreaterThanOrEqualTo(Float value) {
            addCriterion("t1 >=", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1LessThan(Float value) {
            addCriterion("t1 <", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1LessThanOrEqualTo(Float value) {
            addCriterion("t1 <=", value, "t1");
            return (Criteria) this;
        }

        public Criteria andT1In(List<Float> values) {
            addCriterion("t1 in", values, "t1");
            return (Criteria) this;
        }

        public Criteria andT1NotIn(List<Float> values) {
            addCriterion("t1 not in", values, "t1");
            return (Criteria) this;
        }

        public Criteria andT1Between(Float value1, Float value2) {
            addCriterion("t1 between", value1, value2, "t1");
            return (Criteria) this;
        }

        public Criteria andT1NotBetween(Float value1, Float value2) {
            addCriterion("t1 not between", value1, value2, "t1");
            return (Criteria) this;
        }

        public Criteria andT2IsNull() {
            addCriterion("t2 is null");
            return (Criteria) this;
        }

        public Criteria andT2IsNotNull() {
            addCriterion("t2 is not null");
            return (Criteria) this;
        }

        public Criteria andT2EqualTo(Float value) {
            addCriterion("t2 =", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2NotEqualTo(Float value) {
            addCriterion("t2 <>", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2GreaterThan(Float value) {
            addCriterion("t2 >", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2GreaterThanOrEqualTo(Float value) {
            addCriterion("t2 >=", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2LessThan(Float value) {
            addCriterion("t2 <", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2LessThanOrEqualTo(Float value) {
            addCriterion("t2 <=", value, "t2");
            return (Criteria) this;
        }

        public Criteria andT2In(List<Float> values) {
            addCriterion("t2 in", values, "t2");
            return (Criteria) this;
        }

        public Criteria andT2NotIn(List<Float> values) {
            addCriterion("t2 not in", values, "t2");
            return (Criteria) this;
        }

        public Criteria andT2Between(Float value1, Float value2) {
            addCriterion("t2 between", value1, value2, "t2");
            return (Criteria) this;
        }

        public Criteria andT2NotBetween(Float value1, Float value2) {
            addCriterion("t2 not between", value1, value2, "t2");
            return (Criteria) this;
        }

        public Criteria andT3IsNull() {
            addCriterion("t3 is null");
            return (Criteria) this;
        }

        public Criteria andT3IsNotNull() {
            addCriterion("t3 is not null");
            return (Criteria) this;
        }

        public Criteria andT3EqualTo(Float value) {
            addCriterion("t3 =", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3NotEqualTo(Float value) {
            addCriterion("t3 <>", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3GreaterThan(Float value) {
            addCriterion("t3 >", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3GreaterThanOrEqualTo(Float value) {
            addCriterion("t3 >=", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3LessThan(Float value) {
            addCriterion("t3 <", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3LessThanOrEqualTo(Float value) {
            addCriterion("t3 <=", value, "t3");
            return (Criteria) this;
        }

        public Criteria andT3In(List<Float> values) {
            addCriterion("t3 in", values, "t3");
            return (Criteria) this;
        }

        public Criteria andT3NotIn(List<Float> values) {
            addCriterion("t3 not in", values, "t3");
            return (Criteria) this;
        }

        public Criteria andT3Between(Float value1, Float value2) {
            addCriterion("t3 between", value1, value2, "t3");
            return (Criteria) this;
        }

        public Criteria andT3NotBetween(Float value1, Float value2) {
            addCriterion("t3 not between", value1, value2, "t3");
            return (Criteria) this;
        }

        public Criteria andT4IsNull() {
            addCriterion("t4 is null");
            return (Criteria) this;
        }

        public Criteria andT4IsNotNull() {
            addCriterion("t4 is not null");
            return (Criteria) this;
        }

        public Criteria andT4EqualTo(Float value) {
            addCriterion("t4 =", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4NotEqualTo(Float value) {
            addCriterion("t4 <>", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4GreaterThan(Float value) {
            addCriterion("t4 >", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4GreaterThanOrEqualTo(Float value) {
            addCriterion("t4 >=", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4LessThan(Float value) {
            addCriterion("t4 <", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4LessThanOrEqualTo(Float value) {
            addCriterion("t4 <=", value, "t4");
            return (Criteria) this;
        }

        public Criteria andT4In(List<Float> values) {
            addCriterion("t4 in", values, "t4");
            return (Criteria) this;
        }

        public Criteria andT4NotIn(List<Float> values) {
            addCriterion("t4 not in", values, "t4");
            return (Criteria) this;
        }

        public Criteria andT4Between(Float value1, Float value2) {
            addCriterion("t4 between", value1, value2, "t4");
            return (Criteria) this;
        }

        public Criteria andT4NotBetween(Float value1, Float value2) {
            addCriterion("t4 not between", value1, value2, "t4");
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