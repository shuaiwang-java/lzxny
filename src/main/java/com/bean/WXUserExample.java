package com.bean;

import java.util.ArrayList;
import java.util.List;

public class WXUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WXUserExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andPushaIsNull() {
            addCriterion("pusha is null");
            return (Criteria) this;
        }

        public Criteria andPushaIsNotNull() {
            addCriterion("pusha is not null");
            return (Criteria) this;
        }

        public Criteria andPushaEqualTo(String value) {
            addCriterion("pusha =", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaNotEqualTo(String value) {
            addCriterion("pusha <>", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaGreaterThan(String value) {
            addCriterion("pusha >", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaGreaterThanOrEqualTo(String value) {
            addCriterion("pusha >=", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaLessThan(String value) {
            addCriterion("pusha <", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaLessThanOrEqualTo(String value) {
            addCriterion("pusha <=", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaLike(String value) {
            addCriterion("pusha like", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaNotLike(String value) {
            addCriterion("pusha not like", value, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaIn(List<String> values) {
            addCriterion("pusha in", values, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaNotIn(List<String> values) {
            addCriterion("pusha not in", values, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaBetween(String value1, String value2) {
            addCriterion("pusha between", value1, value2, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushaNotBetween(String value1, String value2) {
            addCriterion("pusha not between", value1, value2, "pusha");
            return (Criteria) this;
        }

        public Criteria andPushbIsNull() {
            addCriterion("pushb is null");
            return (Criteria) this;
        }

        public Criteria andPushbIsNotNull() {
            addCriterion("pushb is not null");
            return (Criteria) this;
        }

        public Criteria andPushbEqualTo(String value) {
            addCriterion("pushb =", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbNotEqualTo(String value) {
            addCriterion("pushb <>", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbGreaterThan(String value) {
            addCriterion("pushb >", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbGreaterThanOrEqualTo(String value) {
            addCriterion("pushb >=", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbLessThan(String value) {
            addCriterion("pushb <", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbLessThanOrEqualTo(String value) {
            addCriterion("pushb <=", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbLike(String value) {
            addCriterion("pushb like", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbNotLike(String value) {
            addCriterion("pushb not like", value, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbIn(List<String> values) {
            addCriterion("pushb in", values, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbNotIn(List<String> values) {
            addCriterion("pushb not in", values, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbBetween(String value1, String value2) {
            addCriterion("pushb between", value1, value2, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushbNotBetween(String value1, String value2) {
            addCriterion("pushb not between", value1, value2, "pushb");
            return (Criteria) this;
        }

        public Criteria andPushcIsNull() {
            addCriterion("pushc is null");
            return (Criteria) this;
        }

        public Criteria andPushcIsNotNull() {
            addCriterion("pushc is not null");
            return (Criteria) this;
        }

        public Criteria andPushcEqualTo(String value) {
            addCriterion("pushc =", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcNotEqualTo(String value) {
            addCriterion("pushc <>", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcGreaterThan(String value) {
            addCriterion("pushc >", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcGreaterThanOrEqualTo(String value) {
            addCriterion("pushc >=", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcLessThan(String value) {
            addCriterion("pushc <", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcLessThanOrEqualTo(String value) {
            addCriterion("pushc <=", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcLike(String value) {
            addCriterion("pushc like", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcNotLike(String value) {
            addCriterion("pushc not like", value, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcIn(List<String> values) {
            addCriterion("pushc in", values, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcNotIn(List<String> values) {
            addCriterion("pushc not in", values, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcBetween(String value1, String value2) {
            addCriterion("pushc between", value1, value2, "pushc");
            return (Criteria) this;
        }

        public Criteria andPushcNotBetween(String value1, String value2) {
            addCriterion("pushc not between", value1, value2, "pushc");
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