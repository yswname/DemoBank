package cn.com.demo.ssm.bank.entity;

import java.util.ArrayList;
import java.util.List;

public class BankOperatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankOperatorExample() {
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

        public Criteria andOpIdIsNull() {
            addCriterion("op_id is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("op_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(Integer value) {
            addCriterion("op_id =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(Integer value) {
            addCriterion("op_id <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(Integer value) {
            addCriterion("op_id >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_id >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(Integer value) {
            addCriterion("op_id <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_id <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<Integer> values) {
            addCriterion("op_id in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<Integer> values) {
            addCriterion("op_id not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(Integer value1, Integer value2) {
            addCriterion("op_id between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_id not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpUserNameIsNull() {
            addCriterion("op_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOpUserNameIsNotNull() {
            addCriterion("op_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserNameEqualTo(String value) {
            addCriterion("op_user_name =", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotEqualTo(String value) {
            addCriterion("op_user_name <>", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameGreaterThan(String value) {
            addCriterion("op_user_name >", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("op_user_name >=", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameLessThan(String value) {
            addCriterion("op_user_name <", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameLessThanOrEqualTo(String value) {
            addCriterion("op_user_name <=", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameLike(String value) {
            addCriterion("op_user_name like", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotLike(String value) {
            addCriterion("op_user_name not like", value, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameIn(List<String> values) {
            addCriterion("op_user_name in", values, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotIn(List<String> values) {
            addCriterion("op_user_name not in", values, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameBetween(String value1, String value2) {
            addCriterion("op_user_name between", value1, value2, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpUserNameNotBetween(String value1, String value2) {
            addCriterion("op_user_name not between", value1, value2, "opUserName");
            return (Criteria) this;
        }

        public Criteria andOpPasswordIsNull() {
            addCriterion("op_password is null");
            return (Criteria) this;
        }

        public Criteria andOpPasswordIsNotNull() {
            addCriterion("op_password is not null");
            return (Criteria) this;
        }

        public Criteria andOpPasswordEqualTo(String value) {
            addCriterion("op_password =", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordNotEqualTo(String value) {
            addCriterion("op_password <>", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordGreaterThan(String value) {
            addCriterion("op_password >", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("op_password >=", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordLessThan(String value) {
            addCriterion("op_password <", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordLessThanOrEqualTo(String value) {
            addCriterion("op_password <=", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordLike(String value) {
            addCriterion("op_password like", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordNotLike(String value) {
            addCriterion("op_password not like", value, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordIn(List<String> values) {
            addCriterion("op_password in", values, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordNotIn(List<String> values) {
            addCriterion("op_password not in", values, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordBetween(String value1, String value2) {
            addCriterion("op_password between", value1, value2, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpPasswordNotBetween(String value1, String value2) {
            addCriterion("op_password not between", value1, value2, "opPassword");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNull() {
            addCriterion("op_status is null");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNotNull() {
            addCriterion("op_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpStatusEqualTo(Integer value) {
            addCriterion("op_status =", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotEqualTo(Integer value) {
            addCriterion("op_status <>", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThan(Integer value) {
            addCriterion("op_status >", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_status >=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThan(Integer value) {
            addCriterion("op_status <", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("op_status <=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusIn(List<Integer> values) {
            addCriterion("op_status in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotIn(List<Integer> values) {
            addCriterion("op_status not in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusBetween(Integer value1, Integer value2) {
            addCriterion("op_status between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("op_status not between", value1, value2, "opStatus");
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