package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Yj1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Yj1Example() {
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

        public Criteria andYj1IdIsNull() {
            addCriterion("yj1_Id is null");
            return (Criteria) this;
        }

        public Criteria andYj1IdIsNotNull() {
            addCriterion("yj1_Id is not null");
            return (Criteria) this;
        }

        public Criteria andYj1IdEqualTo(Integer value) {
            addCriterion("yj1_Id =", value, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdNotEqualTo(Integer value) {
            addCriterion("yj1_Id <>", value, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdGreaterThan(Integer value) {
            addCriterion("yj1_Id >", value, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yj1_Id >=", value, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdLessThan(Integer value) {
            addCriterion("yj1_Id <", value, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdLessThanOrEqualTo(Integer value) {
            addCriterion("yj1_Id <=", value, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdIn(List<Integer> values) {
            addCriterion("yj1_Id in", values, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdNotIn(List<Integer> values) {
            addCriterion("yj1_Id not in", values, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdBetween(Integer value1, Integer value2) {
            addCriterion("yj1_Id between", value1, value2, "yj1Id");
            return (Criteria) this;
        }

        public Criteria andYj1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("yj1_Id not between", value1, value2, "yj1Id");
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

        public Criteria andIqSIsNull() {
            addCriterion("Iq_s is null");
            return (Criteria) this;
        }

        public Criteria andIqSIsNotNull() {
            addCriterion("Iq_s is not null");
            return (Criteria) this;
        }

        public Criteria andIqSEqualTo(Float value) {
            addCriterion("Iq_s =", value, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSNotEqualTo(Float value) {
            addCriterion("Iq_s <>", value, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSGreaterThan(Float value) {
            addCriterion("Iq_s >", value, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSGreaterThanOrEqualTo(Float value) {
            addCriterion("Iq_s >=", value, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSLessThan(Float value) {
            addCriterion("Iq_s <", value, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSLessThanOrEqualTo(Float value) {
            addCriterion("Iq_s <=", value, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSIn(List<Float> values) {
            addCriterion("Iq_s in", values, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSNotIn(List<Float> values) {
            addCriterion("Iq_s not in", values, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSBetween(Float value1, Float value2) {
            addCriterion("Iq_s between", value1, value2, "iqS");
            return (Criteria) this;
        }

        public Criteria andIqSNotBetween(Float value1, Float value2) {
            addCriterion("Iq_s not between", value1, value2, "iqS");
            return (Criteria) this;
        }

        public Criteria andIiqSIsNull() {
            addCriterion("IIq_s is null");
            return (Criteria) this;
        }

        public Criteria andIiqSIsNotNull() {
            addCriterion("IIq_s is not null");
            return (Criteria) this;
        }

        public Criteria andIiqSEqualTo(Float value) {
            addCriterion("IIq_s =", value, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSNotEqualTo(Float value) {
            addCriterion("IIq_s <>", value, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSGreaterThan(Float value) {
            addCriterion("IIq_s >", value, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSGreaterThanOrEqualTo(Float value) {
            addCriterion("IIq_s >=", value, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSLessThan(Float value) {
            addCriterion("IIq_s <", value, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSLessThanOrEqualTo(Float value) {
            addCriterion("IIq_s <=", value, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSIn(List<Float> values) {
            addCriterion("IIq_s in", values, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSNotIn(List<Float> values) {
            addCriterion("IIq_s not in", values, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSBetween(Float value1, Float value2) {
            addCriterion("IIq_s between", value1, value2, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIiqSNotBetween(Float value1, Float value2) {
            addCriterion("IIq_s not between", value1, value2, "iiqS");
            return (Criteria) this;
        }

        public Criteria andIqYIsNull() {
            addCriterion("Iq_y is null");
            return (Criteria) this;
        }

        public Criteria andIqYIsNotNull() {
            addCriterion("Iq_y is not null");
            return (Criteria) this;
        }

        public Criteria andIqYEqualTo(Float value) {
            addCriterion("Iq_y =", value, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYNotEqualTo(Float value) {
            addCriterion("Iq_y <>", value, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYGreaterThan(Float value) {
            addCriterion("Iq_y >", value, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYGreaterThanOrEqualTo(Float value) {
            addCriterion("Iq_y >=", value, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYLessThan(Float value) {
            addCriterion("Iq_y <", value, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYLessThanOrEqualTo(Float value) {
            addCriterion("Iq_y <=", value, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYIn(List<Float> values) {
            addCriterion("Iq_y in", values, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYNotIn(List<Float> values) {
            addCriterion("Iq_y not in", values, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYBetween(Float value1, Float value2) {
            addCriterion("Iq_y between", value1, value2, "iqY");
            return (Criteria) this;
        }

        public Criteria andIqYNotBetween(Float value1, Float value2) {
            addCriterion("Iq_y not between", value1, value2, "iqY");
            return (Criteria) this;
        }

        public Criteria andIiqYIsNull() {
            addCriterion("IIq_y is null");
            return (Criteria) this;
        }

        public Criteria andIiqYIsNotNull() {
            addCriterion("IIq_y is not null");
            return (Criteria) this;
        }

        public Criteria andIiqYEqualTo(Float value) {
            addCriterion("IIq_y =", value, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYNotEqualTo(Float value) {
            addCriterion("IIq_y <>", value, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYGreaterThan(Float value) {
            addCriterion("IIq_y >", value, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYGreaterThanOrEqualTo(Float value) {
            addCriterion("IIq_y >=", value, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYLessThan(Float value) {
            addCriterion("IIq_y <", value, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYLessThanOrEqualTo(Float value) {
            addCriterion("IIq_y <=", value, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYIn(List<Float> values) {
            addCriterion("IIq_y in", values, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYNotIn(List<Float> values) {
            addCriterion("IIq_y not in", values, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYBetween(Float value1, Float value2) {
            addCriterion("IIq_y between", value1, value2, "iiqY");
            return (Criteria) this;
        }

        public Criteria andIiqYNotBetween(Float value1, Float value2) {
            addCriterion("IIq_y not between", value1, value2, "iiqY");
            return (Criteria) this;
        }

        public Criteria andNumYIsNull() {
            addCriterion("num_y is null");
            return (Criteria) this;
        }

        public Criteria andNumYIsNotNull() {
            addCriterion("num_y is not null");
            return (Criteria) this;
        }

        public Criteria andNumYEqualTo(Float value) {
            addCriterion("num_y =", value, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYNotEqualTo(Float value) {
            addCriterion("num_y <>", value, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYGreaterThan(Float value) {
            addCriterion("num_y >", value, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYGreaterThanOrEqualTo(Float value) {
            addCriterion("num_y >=", value, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYLessThan(Float value) {
            addCriterion("num_y <", value, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYLessThanOrEqualTo(Float value) {
            addCriterion("num_y <=", value, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYIn(List<Float> values) {
            addCriterion("num_y in", values, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYNotIn(List<Float> values) {
            addCriterion("num_y not in", values, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYBetween(Float value1, Float value2) {
            addCriterion("num_y between", value1, value2, "numY");
            return (Criteria) this;
        }

        public Criteria andNumYNotBetween(Float value1, Float value2) {
            addCriterion("num_y not between", value1, value2, "numY");
            return (Criteria) this;
        }

        public Criteria andNumSIsNull() {
            addCriterion("num_s is null");
            return (Criteria) this;
        }

        public Criteria andNumSIsNotNull() {
            addCriterion("num_s is not null");
            return (Criteria) this;
        }

        public Criteria andNumSEqualTo(Float value) {
            addCriterion("num_s =", value, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSNotEqualTo(Float value) {
            addCriterion("num_s <>", value, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSGreaterThan(Float value) {
            addCriterion("num_s >", value, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSGreaterThanOrEqualTo(Float value) {
            addCriterion("num_s >=", value, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSLessThan(Float value) {
            addCriterion("num_s <", value, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSLessThanOrEqualTo(Float value) {
            addCriterion("num_s <=", value, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSIn(List<Float> values) {
            addCriterion("num_s in", values, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSNotIn(List<Float> values) {
            addCriterion("num_s not in", values, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSBetween(Float value1, Float value2) {
            addCriterion("num_s between", value1, value2, "numS");
            return (Criteria) this;
        }

        public Criteria andNumSNotBetween(Float value1, Float value2) {
            addCriterion("num_s not between", value1, value2, "numS");
            return (Criteria) this;
        }

        public Criteria andLiuliangIsNull() {
            addCriterion("liuliang is null");
            return (Criteria) this;
        }

        public Criteria andLiuliangIsNotNull() {
            addCriterion("liuliang is not null");
            return (Criteria) this;
        }

        public Criteria andLiuliangEqualTo(Float value) {
            addCriterion("liuliang =", value, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangNotEqualTo(Float value) {
            addCriterion("liuliang <>", value, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangGreaterThan(Float value) {
            addCriterion("liuliang >", value, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangGreaterThanOrEqualTo(Float value) {
            addCriterion("liuliang >=", value, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangLessThan(Float value) {
            addCriterion("liuliang <", value, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangLessThanOrEqualTo(Float value) {
            addCriterion("liuliang <=", value, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangIn(List<Float> values) {
            addCriterion("liuliang in", values, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangNotIn(List<Float> values) {
            addCriterion("liuliang not in", values, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangBetween(Float value1, Float value2) {
            addCriterion("liuliang between", value1, value2, "liuliang");
            return (Criteria) this;
        }

        public Criteria andLiuliangNotBetween(Float value1, Float value2) {
            addCriterion("liuliang not between", value1, value2, "liuliang");
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