package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileClassExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fId is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fId is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fId =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fId <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fId >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fId >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fId <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fId <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fId in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fId not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fId between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fId not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fName is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fName is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fName =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fName <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fName >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fName >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fName <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fName <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fName like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fName not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fName in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fName not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fName between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fName not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFtimeIsNull() {
            addCriterion("fTime is null");
            return (Criteria) this;
        }

        public Criteria andFtimeIsNotNull() {
            addCriterion("fTime is not null");
            return (Criteria) this;
        }

        public Criteria andFtimeEqualTo(Date value) {
            addCriterion("fTime =", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotEqualTo(Date value) {
            addCriterion("fTime <>", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeGreaterThan(Date value) {
            addCriterion("fTime >", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fTime >=", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeLessThan(Date value) {
            addCriterion("fTime <", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeLessThanOrEqualTo(Date value) {
            addCriterion("fTime <=", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeIn(List<Date> values) {
            addCriterion("fTime in", values, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotIn(List<Date> values) {
            addCriterion("fTime not in", values, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeBetween(Date value1, Date value2) {
            addCriterion("fTime between", value1, value2, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotBetween(Date value1, Date value2) {
            addCriterion("fTime not between", value1, value2, "ftime");
            return (Criteria) this;
        }

        public Criteria andFuserIsNull() {
            addCriterion("fUser is null");
            return (Criteria) this;
        }

        public Criteria andFuserIsNotNull() {
            addCriterion("fUser is not null");
            return (Criteria) this;
        }

        public Criteria andFuserEqualTo(String value) {
            addCriterion("fUser =", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserNotEqualTo(String value) {
            addCriterion("fUser <>", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserGreaterThan(String value) {
            addCriterion("fUser >", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserGreaterThanOrEqualTo(String value) {
            addCriterion("fUser >=", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserLessThan(String value) {
            addCriterion("fUser <", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserLessThanOrEqualTo(String value) {
            addCriterion("fUser <=", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserLike(String value) {
            addCriterion("fUser like", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserNotLike(String value) {
            addCriterion("fUser not like", value, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserIn(List<String> values) {
            addCriterion("fUser in", values, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserNotIn(List<String> values) {
            addCriterion("fUser not in", values, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserBetween(String value1, String value2) {
            addCriterion("fUser between", value1, value2, "fuser");
            return (Criteria) this;
        }

        public Criteria andFuserNotBetween(String value1, String value2) {
            addCriterion("fUser not between", value1, value2, "fuser");
            return (Criteria) this;
        }

        public Criteria andFstateIsNull() {
            addCriterion("fState is null");
            return (Criteria) this;
        }

        public Criteria andFstateIsNotNull() {
            addCriterion("fState is not null");
            return (Criteria) this;
        }

        public Criteria andFstateEqualTo(String value) {
            addCriterion("fState =", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateNotEqualTo(String value) {
            addCriterion("fState <>", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateGreaterThan(String value) {
            addCriterion("fState >", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateGreaterThanOrEqualTo(String value) {
            addCriterion("fState >=", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateLessThan(String value) {
            addCriterion("fState <", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateLessThanOrEqualTo(String value) {
            addCriterion("fState <=", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateLike(String value) {
            addCriterion("fState like", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateNotLike(String value) {
            addCriterion("fState not like", value, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateIn(List<String> values) {
            addCriterion("fState in", values, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateNotIn(List<String> values) {
            addCriterion("fState not in", values, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateBetween(String value1, String value2) {
            addCriterion("fState between", value1, value2, "fstate");
            return (Criteria) this;
        }

        public Criteria andFstateNotBetween(String value1, String value2) {
            addCriterion("fState not between", value1, value2, "fstate");
            return (Criteria) this;
        }

        public Criteria andFsizeIsNull() {
            addCriterion("fSize is null");
            return (Criteria) this;
        }

        public Criteria andFsizeIsNotNull() {
            addCriterion("fSize is not null");
            return (Criteria) this;
        }

        public Criteria andFsizeEqualTo(String value) {
            addCriterion("fSize =", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotEqualTo(String value) {
            addCriterion("fSize <>", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeGreaterThan(String value) {
            addCriterion("fSize >", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeGreaterThanOrEqualTo(String value) {
            addCriterion("fSize >=", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeLessThan(String value) {
            addCriterion("fSize <", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeLessThanOrEqualTo(String value) {
            addCriterion("fSize <=", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeLike(String value) {
            addCriterion("fSize like", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotLike(String value) {
            addCriterion("fSize not like", value, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeIn(List<String> values) {
            addCriterion("fSize in", values, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotIn(List<String> values) {
            addCriterion("fSize not in", values, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeBetween(String value1, String value2) {
            addCriterion("fSize between", value1, value2, "fsize");
            return (Criteria) this;
        }

        public Criteria andFsizeNotBetween(String value1, String value2) {
            addCriterion("fSize not between", value1, value2, "fsize");
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