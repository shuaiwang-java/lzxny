package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SumInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SumInfoExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSumaIsNull() {
            addCriterion("suma is null");
            return (Criteria) this;
        }

        public Criteria andSumaIsNotNull() {
            addCriterion("suma is not null");
            return (Criteria) this;
        }

        public Criteria andSumaEqualTo(Float value) {
            addCriterion("suma =", value, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaNotEqualTo(Float value) {
            addCriterion("suma <>", value, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaGreaterThan(Float value) {
            addCriterion("suma >", value, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaGreaterThanOrEqualTo(Float value) {
            addCriterion("suma >=", value, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaLessThan(Float value) {
            addCriterion("suma <", value, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaLessThanOrEqualTo(Float value) {
            addCriterion("suma <=", value, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaIn(List<Float> values) {
            addCriterion("suma in", values, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaNotIn(List<Float> values) {
            addCriterion("suma not in", values, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaBetween(Float value1, Float value2) {
            addCriterion("suma between", value1, value2, "suma");
            return (Criteria) this;
        }

        public Criteria andSumaNotBetween(Float value1, Float value2) {
            addCriterion("suma not between", value1, value2, "suma");
            return (Criteria) this;
        }

        public Criteria andSumbIsNull() {
            addCriterion("sumb is null");
            return (Criteria) this;
        }

        public Criteria andSumbIsNotNull() {
            addCriterion("sumb is not null");
            return (Criteria) this;
        }

        public Criteria andSumbEqualTo(Float value) {
            addCriterion("sumb =", value, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbNotEqualTo(Float value) {
            addCriterion("sumb <>", value, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbGreaterThan(Float value) {
            addCriterion("sumb >", value, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbGreaterThanOrEqualTo(Float value) {
            addCriterion("sumb >=", value, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbLessThan(Float value) {
            addCriterion("sumb <", value, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbLessThanOrEqualTo(Float value) {
            addCriterion("sumb <=", value, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbIn(List<Float> values) {
            addCriterion("sumb in", values, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbNotIn(List<Float> values) {
            addCriterion("sumb not in", values, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbBetween(Float value1, Float value2) {
            addCriterion("sumb between", value1, value2, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumbNotBetween(Float value1, Float value2) {
            addCriterion("sumb not between", value1, value2, "sumb");
            return (Criteria) this;
        }

        public Criteria andSumdIsNull() {
            addCriterion("sumd is null");
            return (Criteria) this;
        }

        public Criteria andSumdIsNotNull() {
            addCriterion("sumd is not null");
            return (Criteria) this;
        }

        public Criteria andSumdEqualTo(Float value) {
            addCriterion("sumd =", value, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdNotEqualTo(Float value) {
            addCriterion("sumd <>", value, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdGreaterThan(Float value) {
            addCriterion("sumd >", value, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdGreaterThanOrEqualTo(Float value) {
            addCriterion("sumd >=", value, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdLessThan(Float value) {
            addCriterion("sumd <", value, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdLessThanOrEqualTo(Float value) {
            addCriterion("sumd <=", value, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdIn(List<Float> values) {
            addCriterion("sumd in", values, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdNotIn(List<Float> values) {
            addCriterion("sumd not in", values, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdBetween(Float value1, Float value2) {
            addCriterion("sumd between", value1, value2, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumdNotBetween(Float value1, Float value2) {
            addCriterion("sumd not between", value1, value2, "sumd");
            return (Criteria) this;
        }

        public Criteria andSumeIsNull() {
            addCriterion("sume is null");
            return (Criteria) this;
        }

        public Criteria andSumeIsNotNull() {
            addCriterion("sume is not null");
            return (Criteria) this;
        }

        public Criteria andSumeEqualTo(Float value) {
            addCriterion("sume =", value, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeNotEqualTo(Float value) {
            addCriterion("sume <>", value, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeGreaterThan(Float value) {
            addCriterion("sume >", value, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeGreaterThanOrEqualTo(Float value) {
            addCriterion("sume >=", value, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeLessThan(Float value) {
            addCriterion("sume <", value, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeLessThanOrEqualTo(Float value) {
            addCriterion("sume <=", value, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeIn(List<Float> values) {
            addCriterion("sume in", values, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeNotIn(List<Float> values) {
            addCriterion("sume not in", values, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeBetween(Float value1, Float value2) {
            addCriterion("sume between", value1, value2, "sume");
            return (Criteria) this;
        }

        public Criteria andSumeNotBetween(Float value1, Float value2) {
            addCriterion("sume not between", value1, value2, "sume");
            return (Criteria) this;
        }

        public Criteria andSumfIsNull() {
            addCriterion("sumf is null");
            return (Criteria) this;
        }

        public Criteria andSumfIsNotNull() {
            addCriterion("sumf is not null");
            return (Criteria) this;
        }

        public Criteria andSumfEqualTo(Float value) {
            addCriterion("sumf =", value, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfNotEqualTo(Float value) {
            addCriterion("sumf <>", value, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfGreaterThan(Float value) {
            addCriterion("sumf >", value, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfGreaterThanOrEqualTo(Float value) {
            addCriterion("sumf >=", value, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfLessThan(Float value) {
            addCriterion("sumf <", value, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfLessThanOrEqualTo(Float value) {
            addCriterion("sumf <=", value, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfIn(List<Float> values) {
            addCriterion("sumf in", values, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfNotIn(List<Float> values) {
            addCriterion("sumf not in", values, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfBetween(Float value1, Float value2) {
            addCriterion("sumf between", value1, value2, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumfNotBetween(Float value1, Float value2) {
            addCriterion("sumf not between", value1, value2, "sumf");
            return (Criteria) this;
        }

        public Criteria andSumhIsNull() {
            addCriterion("sumh is null");
            return (Criteria) this;
        }

        public Criteria andSumhIsNotNull() {
            addCriterion("sumh is not null");
            return (Criteria) this;
        }

        public Criteria andSumhEqualTo(Float value) {
            addCriterion("sumh =", value, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhNotEqualTo(Float value) {
            addCriterion("sumh <>", value, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhGreaterThan(Float value) {
            addCriterion("sumh >", value, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhGreaterThanOrEqualTo(Float value) {
            addCriterion("sumh >=", value, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhLessThan(Float value) {
            addCriterion("sumh <", value, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhLessThanOrEqualTo(Float value) {
            addCriterion("sumh <=", value, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhIn(List<Float> values) {
            addCriterion("sumh in", values, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhNotIn(List<Float> values) {
            addCriterion("sumh not in", values, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhBetween(Float value1, Float value2) {
            addCriterion("sumh between", value1, value2, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumhNotBetween(Float value1, Float value2) {
            addCriterion("sumh not between", value1, value2, "sumh");
            return (Criteria) this;
        }

        public Criteria andSumiIsNull() {
            addCriterion("sumi is null");
            return (Criteria) this;
        }

        public Criteria andSumiIsNotNull() {
            addCriterion("sumi is not null");
            return (Criteria) this;
        }

        public Criteria andSumiEqualTo(Float value) {
            addCriterion("sumi =", value, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiNotEqualTo(Float value) {
            addCriterion("sumi <>", value, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiGreaterThan(Float value) {
            addCriterion("sumi >", value, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiGreaterThanOrEqualTo(Float value) {
            addCriterion("sumi >=", value, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiLessThan(Float value) {
            addCriterion("sumi <", value, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiLessThanOrEqualTo(Float value) {
            addCriterion("sumi <=", value, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiIn(List<Float> values) {
            addCriterion("sumi in", values, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiNotIn(List<Float> values) {
            addCriterion("sumi not in", values, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiBetween(Float value1, Float value2) {
            addCriterion("sumi between", value1, value2, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumiNotBetween(Float value1, Float value2) {
            addCriterion("sumi not between", value1, value2, "sumi");
            return (Criteria) this;
        }

        public Criteria andSumgIsNull() {
            addCriterion("sumg is null");
            return (Criteria) this;
        }

        public Criteria andSumgIsNotNull() {
            addCriterion("sumg is not null");
            return (Criteria) this;
        }

        public Criteria andSumgEqualTo(Float value) {
            addCriterion("sumg =", value, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgNotEqualTo(Float value) {
            addCriterion("sumg <>", value, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgGreaterThan(Float value) {
            addCriterion("sumg >", value, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgGreaterThanOrEqualTo(Float value) {
            addCriterion("sumg >=", value, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgLessThan(Float value) {
            addCriterion("sumg <", value, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgLessThanOrEqualTo(Float value) {
            addCriterion("sumg <=", value, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgIn(List<Float> values) {
            addCriterion("sumg in", values, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgNotIn(List<Float> values) {
            addCriterion("sumg not in", values, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgBetween(Float value1, Float value2) {
            addCriterion("sumg between", value1, value2, "sumg");
            return (Criteria) this;
        }

        public Criteria andSumgNotBetween(Float value1, Float value2) {
            addCriterion("sumg not between", value1, value2, "sumg");
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