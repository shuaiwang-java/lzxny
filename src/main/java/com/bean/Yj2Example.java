package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Yj2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Yj2Example() {
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

        public Criteria andYj2IdIsNull() {
            addCriterion("yj2_Id is null");
            return (Criteria) this;
        }

        public Criteria andYj2IdIsNotNull() {
            addCriterion("yj2_Id is not null");
            return (Criteria) this;
        }

        public Criteria andYj2IdEqualTo(Integer value) {
            addCriterion("yj2_Id =", value, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdNotEqualTo(Integer value) {
            addCriterion("yj2_Id <>", value, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdGreaterThan(Integer value) {
            addCriterion("yj2_Id >", value, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yj2_Id >=", value, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdLessThan(Integer value) {
            addCriterion("yj2_Id <", value, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdLessThanOrEqualTo(Integer value) {
            addCriterion("yj2_Id <=", value, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdIn(List<Integer> values) {
            addCriterion("yj2_Id in", values, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdNotIn(List<Integer> values) {
            addCriterion("yj2_Id not in", values, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdBetween(Integer value1, Integer value2) {
            addCriterion("yj2_Id between", value1, value2, "yj2Id");
            return (Criteria) this;
        }

        public Criteria andYj2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("yj2_Id not between", value1, value2, "yj2Id");
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

        public Criteria andYidlIsNull() {
            addCriterion("yidl is null");
            return (Criteria) this;
        }

        public Criteria andYidlIsNotNull() {
            addCriterion("yidl is not null");
            return (Criteria) this;
        }

        public Criteria andYidlEqualTo(Float value) {
            addCriterion("yidl =", value, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlNotEqualTo(Float value) {
            addCriterion("yidl <>", value, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlGreaterThan(Float value) {
            addCriterion("yidl >", value, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlGreaterThanOrEqualTo(Float value) {
            addCriterion("yidl >=", value, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlLessThan(Float value) {
            addCriterion("yidl <", value, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlLessThanOrEqualTo(Float value) {
            addCriterion("yidl <=", value, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlIn(List<Float> values) {
            addCriterion("yidl in", values, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlNotIn(List<Float> values) {
            addCriterion("yidl not in", values, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlBetween(Float value1, Float value2) {
            addCriterion("yidl between", value1, value2, "yidl");
            return (Criteria) this;
        }

        public Criteria andYidlNotBetween(Float value1, Float value2) {
            addCriterion("yidl not between", value1, value2, "yidl");
            return (Criteria) this;
        }

        public Criteria andErdlIsNull() {
            addCriterion("erdl is null");
            return (Criteria) this;
        }

        public Criteria andErdlIsNotNull() {
            addCriterion("erdl is not null");
            return (Criteria) this;
        }

        public Criteria andErdlEqualTo(Float value) {
            addCriterion("erdl =", value, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlNotEqualTo(Float value) {
            addCriterion("erdl <>", value, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlGreaterThan(Float value) {
            addCriterion("erdl >", value, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlGreaterThanOrEqualTo(Float value) {
            addCriterion("erdl >=", value, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlLessThan(Float value) {
            addCriterion("erdl <", value, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlLessThanOrEqualTo(Float value) {
            addCriterion("erdl <=", value, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlIn(List<Float> values) {
            addCriterion("erdl in", values, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlNotIn(List<Float> values) {
            addCriterion("erdl not in", values, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlBetween(Float value1, Float value2) {
            addCriterion("erdl between", value1, value2, "erdl");
            return (Criteria) this;
        }

        public Criteria andErdlNotBetween(Float value1, Float value2) {
            addCriterion("erdl not between", value1, value2, "erdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlIsNull() {
            addCriterion("numsdl is null");
            return (Criteria) this;
        }

        public Criteria andNumsdlIsNotNull() {
            addCriterion("numsdl is not null");
            return (Criteria) this;
        }

        public Criteria andNumsdlEqualTo(Float value) {
            addCriterion("numsdl =", value, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlNotEqualTo(Float value) {
            addCriterion("numsdl <>", value, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlGreaterThan(Float value) {
            addCriterion("numsdl >", value, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlGreaterThanOrEqualTo(Float value) {
            addCriterion("numsdl >=", value, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlLessThan(Float value) {
            addCriterion("numsdl <", value, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlLessThanOrEqualTo(Float value) {
            addCriterion("numsdl <=", value, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlIn(List<Float> values) {
            addCriterion("numsdl in", values, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlNotIn(List<Float> values) {
            addCriterion("numsdl not in", values, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlBetween(Float value1, Float value2) {
            addCriterion("numsdl between", value1, value2, "numsdl");
            return (Criteria) this;
        }

        public Criteria andNumsdlNotBetween(Float value1, Float value2) {
            addCriterion("numsdl not between", value1, value2, "numsdl");
            return (Criteria) this;
        }

        public Criteria andUyidlIsNull() {
            addCriterion("uyidl is null");
            return (Criteria) this;
        }

        public Criteria andUyidlIsNotNull() {
            addCriterion("uyidl is not null");
            return (Criteria) this;
        }

        public Criteria andUyidlEqualTo(Float value) {
            addCriterion("uyidl =", value, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlNotEqualTo(Float value) {
            addCriterion("uyidl <>", value, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlGreaterThan(Float value) {
            addCriterion("uyidl >", value, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlGreaterThanOrEqualTo(Float value) {
            addCriterion("uyidl >=", value, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlLessThan(Float value) {
            addCriterion("uyidl <", value, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlLessThanOrEqualTo(Float value) {
            addCriterion("uyidl <=", value, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlIn(List<Float> values) {
            addCriterion("uyidl in", values, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlNotIn(List<Float> values) {
            addCriterion("uyidl not in", values, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlBetween(Float value1, Float value2) {
            addCriterion("uyidl between", value1, value2, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUyidlNotBetween(Float value1, Float value2) {
            addCriterion("uyidl not between", value1, value2, "uyidl");
            return (Criteria) this;
        }

        public Criteria andUerdlIsNull() {
            addCriterion("uerdl is null");
            return (Criteria) this;
        }

        public Criteria andUerdlIsNotNull() {
            addCriterion("uerdl is not null");
            return (Criteria) this;
        }

        public Criteria andUerdlEqualTo(Float value) {
            addCriterion("uerdl =", value, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlNotEqualTo(Float value) {
            addCriterion("uerdl <>", value, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlGreaterThan(Float value) {
            addCriterion("uerdl >", value, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlGreaterThanOrEqualTo(Float value) {
            addCriterion("uerdl >=", value, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlLessThan(Float value) {
            addCriterion("uerdl <", value, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlLessThanOrEqualTo(Float value) {
            addCriterion("uerdl <=", value, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlIn(List<Float> values) {
            addCriterion("uerdl in", values, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlNotIn(List<Float> values) {
            addCriterion("uerdl not in", values, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlBetween(Float value1, Float value2) {
            addCriterion("uerdl between", value1, value2, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUerdlNotBetween(Float value1, Float value2) {
            addCriterion("uerdl not between", value1, value2, "uerdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlIsNull() {
            addCriterion("unumdl is null");
            return (Criteria) this;
        }

        public Criteria andUnumdlIsNotNull() {
            addCriterion("unumdl is not null");
            return (Criteria) this;
        }

        public Criteria andUnumdlEqualTo(Float value) {
            addCriterion("unumdl =", value, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlNotEqualTo(Float value) {
            addCriterion("unumdl <>", value, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlGreaterThan(Float value) {
            addCriterion("unumdl >", value, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlGreaterThanOrEqualTo(Float value) {
            addCriterion("unumdl >=", value, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlLessThan(Float value) {
            addCriterion("unumdl <", value, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlLessThanOrEqualTo(Float value) {
            addCriterion("unumdl <=", value, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlIn(List<Float> values) {
            addCriterion("unumdl in", values, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlNotIn(List<Float> values) {
            addCriterion("unumdl not in", values, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlBetween(Float value1, Float value2) {
            addCriterion("unumdl between", value1, value2, "unumdl");
            return (Criteria) this;
        }

        public Criteria andUnumdlNotBetween(Float value1, Float value2) {
            addCriterion("unumdl not between", value1, value2, "unumdl");
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