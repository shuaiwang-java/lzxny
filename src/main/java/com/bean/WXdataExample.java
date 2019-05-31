package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WXdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WXdataExample() {
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

        public Criteria andDatedataIsNull() {
            addCriterion("dateData is null");
            return (Criteria) this;
        }

        public Criteria andDatedataIsNotNull() {
            addCriterion("dateData is not null");
            return (Criteria) this;
        }

        public Criteria andDatedataEqualTo(Date value) {
            addCriterion("dateData =", value, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataNotEqualTo(Date value) {
            addCriterion("dateData <>", value, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataGreaterThan(Date value) {
            addCriterion("dateData >", value, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataGreaterThanOrEqualTo(Date value) {
            addCriterion("dateData >=", value, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataLessThan(Date value) {
            addCriterion("dateData <", value, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataLessThanOrEqualTo(Date value) {
            addCriterion("dateData <=", value, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataIn(List<Date> values) {
            addCriterion("dateData in", values, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataNotIn(List<Date> values) {
            addCriterion("dateData not in", values, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataBetween(Date value1, Date value2) {
            addCriterion("dateData between", value1, value2, "datedata");
            return (Criteria) this;
        }

        public Criteria andDatedataNotBetween(Date value1, Date value2) {
            addCriterion("dateData not between", value1, value2, "datedata");
            return (Criteria) this;
        }

        public Criteria andObjaIsNull() {
            addCriterion("obja is null");
            return (Criteria) this;
        }

        public Criteria andObjaIsNotNull() {
            addCriterion("obja is not null");
            return (Criteria) this;
        }

        public Criteria andObjaEqualTo(Float value) {
            addCriterion("obja =", value, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaNotEqualTo(Float value) {
            addCriterion("obja <>", value, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaGreaterThan(Float value) {
            addCriterion("obja >", value, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaGreaterThanOrEqualTo(Float value) {
            addCriterion("obja >=", value, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaLessThan(Float value) {
            addCriterion("obja <", value, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaLessThanOrEqualTo(Float value) {
            addCriterion("obja <=", value, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaIn(List<Float> values) {
            addCriterion("obja in", values, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaNotIn(List<Float> values) {
            addCriterion("obja not in", values, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaBetween(Float value1, Float value2) {
            addCriterion("obja between", value1, value2, "obja");
            return (Criteria) this;
        }

        public Criteria andObjaNotBetween(Float value1, Float value2) {
            addCriterion("obja not between", value1, value2, "obja");
            return (Criteria) this;
        }

        public Criteria andObjbIsNull() {
            addCriterion("objb is null");
            return (Criteria) this;
        }

        public Criteria andObjbIsNotNull() {
            addCriterion("objb is not null");
            return (Criteria) this;
        }

        public Criteria andObjbEqualTo(Float value) {
            addCriterion("objb =", value, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbNotEqualTo(Float value) {
            addCriterion("objb <>", value, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbGreaterThan(Float value) {
            addCriterion("objb >", value, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbGreaterThanOrEqualTo(Float value) {
            addCriterion("objb >=", value, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbLessThan(Float value) {
            addCriterion("objb <", value, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbLessThanOrEqualTo(Float value) {
            addCriterion("objb <=", value, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbIn(List<Float> values) {
            addCriterion("objb in", values, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbNotIn(List<Float> values) {
            addCriterion("objb not in", values, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbBetween(Float value1, Float value2) {
            addCriterion("objb between", value1, value2, "objb");
            return (Criteria) this;
        }

        public Criteria andObjbNotBetween(Float value1, Float value2) {
            addCriterion("objb not between", value1, value2, "objb");
            return (Criteria) this;
        }

        public Criteria andObjcIsNull() {
            addCriterion("objc is null");
            return (Criteria) this;
        }

        public Criteria andObjcIsNotNull() {
            addCriterion("objc is not null");
            return (Criteria) this;
        }

        public Criteria andObjcEqualTo(Float value) {
            addCriterion("objc =", value, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcNotEqualTo(Float value) {
            addCriterion("objc <>", value, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcGreaterThan(Float value) {
            addCriterion("objc >", value, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcGreaterThanOrEqualTo(Float value) {
            addCriterion("objc >=", value, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcLessThan(Float value) {
            addCriterion("objc <", value, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcLessThanOrEqualTo(Float value) {
            addCriterion("objc <=", value, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcIn(List<Float> values) {
            addCriterion("objc in", values, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcNotIn(List<Float> values) {
            addCriterion("objc not in", values, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcBetween(Float value1, Float value2) {
            addCriterion("objc between", value1, value2, "objc");
            return (Criteria) this;
        }

        public Criteria andObjcNotBetween(Float value1, Float value2) {
            addCriterion("objc not between", value1, value2, "objc");
            return (Criteria) this;
        }

        public Criteria andObjdIsNull() {
            addCriterion("objd is null");
            return (Criteria) this;
        }

        public Criteria andObjdIsNotNull() {
            addCriterion("objd is not null");
            return (Criteria) this;
        }

        public Criteria andObjdEqualTo(Float value) {
            addCriterion("objd =", value, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdNotEqualTo(Float value) {
            addCriterion("objd <>", value, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdGreaterThan(Float value) {
            addCriterion("objd >", value, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdGreaterThanOrEqualTo(Float value) {
            addCriterion("objd >=", value, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdLessThan(Float value) {
            addCriterion("objd <", value, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdLessThanOrEqualTo(Float value) {
            addCriterion("objd <=", value, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdIn(List<Float> values) {
            addCriterion("objd in", values, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdNotIn(List<Float> values) {
            addCriterion("objd not in", values, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdBetween(Float value1, Float value2) {
            addCriterion("objd between", value1, value2, "objd");
            return (Criteria) this;
        }

        public Criteria andObjdNotBetween(Float value1, Float value2) {
            addCriterion("objd not between", value1, value2, "objd");
            return (Criteria) this;
        }

        public Criteria andObjeIsNull() {
            addCriterion("obje is null");
            return (Criteria) this;
        }

        public Criteria andObjeIsNotNull() {
            addCriterion("obje is not null");
            return (Criteria) this;
        }

        public Criteria andObjeEqualTo(Float value) {
            addCriterion("obje =", value, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeNotEqualTo(Float value) {
            addCriterion("obje <>", value, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeGreaterThan(Float value) {
            addCriterion("obje >", value, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeGreaterThanOrEqualTo(Float value) {
            addCriterion("obje >=", value, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeLessThan(Float value) {
            addCriterion("obje <", value, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeLessThanOrEqualTo(Float value) {
            addCriterion("obje <=", value, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeIn(List<Float> values) {
            addCriterion("obje in", values, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeNotIn(List<Float> values) {
            addCriterion("obje not in", values, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeBetween(Float value1, Float value2) {
            addCriterion("obje between", value1, value2, "obje");
            return (Criteria) this;
        }

        public Criteria andObjeNotBetween(Float value1, Float value2) {
            addCriterion("obje not between", value1, value2, "obje");
            return (Criteria) this;
        }

        public Criteria andObjfIsNull() {
            addCriterion("objf is null");
            return (Criteria) this;
        }

        public Criteria andObjfIsNotNull() {
            addCriterion("objf is not null");
            return (Criteria) this;
        }

        public Criteria andObjfEqualTo(Float value) {
            addCriterion("objf =", value, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfNotEqualTo(Float value) {
            addCriterion("objf <>", value, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfGreaterThan(Float value) {
            addCriterion("objf >", value, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfGreaterThanOrEqualTo(Float value) {
            addCriterion("objf >=", value, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfLessThan(Float value) {
            addCriterion("objf <", value, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfLessThanOrEqualTo(Float value) {
            addCriterion("objf <=", value, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfIn(List<Float> values) {
            addCriterion("objf in", values, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfNotIn(List<Float> values) {
            addCriterion("objf not in", values, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfBetween(Float value1, Float value2) {
            addCriterion("objf between", value1, value2, "objf");
            return (Criteria) this;
        }

        public Criteria andObjfNotBetween(Float value1, Float value2) {
            addCriterion("objf not between", value1, value2, "objf");
            return (Criteria) this;
        }

        public Criteria andObjgIsNull() {
            addCriterion("objg is null");
            return (Criteria) this;
        }

        public Criteria andObjgIsNotNull() {
            addCriterion("objg is not null");
            return (Criteria) this;
        }

        public Criteria andObjgEqualTo(Float value) {
            addCriterion("objg =", value, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgNotEqualTo(Float value) {
            addCriterion("objg <>", value, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgGreaterThan(Float value) {
            addCriterion("objg >", value, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgGreaterThanOrEqualTo(Float value) {
            addCriterion("objg >=", value, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgLessThan(Float value) {
            addCriterion("objg <", value, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgLessThanOrEqualTo(Float value) {
            addCriterion("objg <=", value, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgIn(List<Float> values) {
            addCriterion("objg in", values, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgNotIn(List<Float> values) {
            addCriterion("objg not in", values, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgBetween(Float value1, Float value2) {
            addCriterion("objg between", value1, value2, "objg");
            return (Criteria) this;
        }

        public Criteria andObjgNotBetween(Float value1, Float value2) {
            addCriterion("objg not between", value1, value2, "objg");
            return (Criteria) this;
        }

        public Criteria andObjhIsNull() {
            addCriterion("objh is null");
            return (Criteria) this;
        }

        public Criteria andObjhIsNotNull() {
            addCriterion("objh is not null");
            return (Criteria) this;
        }

        public Criteria andObjhEqualTo(Float value) {
            addCriterion("objh =", value, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhNotEqualTo(Float value) {
            addCriterion("objh <>", value, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhGreaterThan(Float value) {
            addCriterion("objh >", value, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhGreaterThanOrEqualTo(Float value) {
            addCriterion("objh >=", value, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhLessThan(Float value) {
            addCriterion("objh <", value, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhLessThanOrEqualTo(Float value) {
            addCriterion("objh <=", value, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhIn(List<Float> values) {
            addCriterion("objh in", values, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhNotIn(List<Float> values) {
            addCriterion("objh not in", values, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhBetween(Float value1, Float value2) {
            addCriterion("objh between", value1, value2, "objh");
            return (Criteria) this;
        }

        public Criteria andObjhNotBetween(Float value1, Float value2) {
            addCriterion("objh not between", value1, value2, "objh");
            return (Criteria) this;
        }

        public Criteria andObjiIsNull() {
            addCriterion("obji is null");
            return (Criteria) this;
        }

        public Criteria andObjiIsNotNull() {
            addCriterion("obji is not null");
            return (Criteria) this;
        }

        public Criteria andObjiEqualTo(Float value) {
            addCriterion("obji =", value, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiNotEqualTo(Float value) {
            addCriterion("obji <>", value, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiGreaterThan(Float value) {
            addCriterion("obji >", value, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiGreaterThanOrEqualTo(Float value) {
            addCriterion("obji >=", value, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiLessThan(Float value) {
            addCriterion("obji <", value, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiLessThanOrEqualTo(Float value) {
            addCriterion("obji <=", value, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiIn(List<Float> values) {
            addCriterion("obji in", values, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiNotIn(List<Float> values) {
            addCriterion("obji not in", values, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiBetween(Float value1, Float value2) {
            addCriterion("obji between", value1, value2, "obji");
            return (Criteria) this;
        }

        public Criteria andObjiNotBetween(Float value1, Float value2) {
            addCriterion("obji not between", value1, value2, "obji");
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