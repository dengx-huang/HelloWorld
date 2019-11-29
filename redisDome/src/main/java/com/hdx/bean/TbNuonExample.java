package com.hdx.bean;

import java.util.ArrayList;
import java.util.List;

public class TbNuonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbNuonExample() {
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

        public Criteria andNuonIdIsNull() {
            addCriterion("NUON_ID is null");
            return (Criteria) this;
        }

        public Criteria andNuonIdIsNotNull() {
            addCriterion("NUON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNuonIdEqualTo(String value) {
            addCriterion("NUON_ID =", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdNotEqualTo(String value) {
            addCriterion("NUON_ID <>", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdGreaterThan(String value) {
            addCriterion("NUON_ID >", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdGreaterThanOrEqualTo(String value) {
            addCriterion("NUON_ID >=", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdLessThan(String value) {
            addCriterion("NUON_ID <", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdLessThanOrEqualTo(String value) {
            addCriterion("NUON_ID <=", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdLike(String value) {
            addCriterion("NUON_ID like", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdNotLike(String value) {
            addCriterion("NUON_ID not like", value, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdIn(List<String> values) {
            addCriterion("NUON_ID in", values, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdNotIn(List<String> values) {
            addCriterion("NUON_ID not in", values, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdBetween(String value1, String value2) {
            addCriterion("NUON_ID between", value1, value2, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonIdNotBetween(String value1, String value2) {
            addCriterion("NUON_ID not between", value1, value2, "nuonId");
            return (Criteria) this;
        }

        public Criteria andNuonNameIsNull() {
            addCriterion("NUON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNuonNameIsNotNull() {
            addCriterion("NUON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNuonNameEqualTo(String value) {
            addCriterion("NUON_NAME =", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameNotEqualTo(String value) {
            addCriterion("NUON_NAME <>", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameGreaterThan(String value) {
            addCriterion("NUON_NAME >", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameGreaterThanOrEqualTo(String value) {
            addCriterion("NUON_NAME >=", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameLessThan(String value) {
            addCriterion("NUON_NAME <", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameLessThanOrEqualTo(String value) {
            addCriterion("NUON_NAME <=", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameLike(String value) {
            addCriterion("NUON_NAME like", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameNotLike(String value) {
            addCriterion("NUON_NAME not like", value, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameIn(List<String> values) {
            addCriterion("NUON_NAME in", values, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameNotIn(List<String> values) {
            addCriterion("NUON_NAME not in", values, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameBetween(String value1, String value2) {
            addCriterion("NUON_NAME between", value1, value2, "nuonName");
            return (Criteria) this;
        }

        public Criteria andNuonNameNotBetween(String value1, String value2) {
            addCriterion("NUON_NAME not between", value1, value2, "nuonName");
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