package cn.com.demo.ssm.bank.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankOperateLogExample() {
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

        public Criteria andOpLgIdIsNull() {
            addCriterion("op_lg_id is null");
            return (Criteria) this;
        }

        public Criteria andOpLgIdIsNotNull() {
            addCriterion("op_lg_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpLgIdEqualTo(Integer value) {
            addCriterion("op_lg_id =", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdNotEqualTo(Integer value) {
            addCriterion("op_lg_id <>", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdGreaterThan(Integer value) {
            addCriterion("op_lg_id >", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_lg_id >=", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdLessThan(Integer value) {
            addCriterion("op_lg_id <", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_lg_id <=", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdIn(List<Integer> values) {
            addCriterion("op_lg_id in", values, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdNotIn(List<Integer> values) {
            addCriterion("op_lg_id not in", values, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_id between", value1, value2, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_id not between", value1, value2, "opLgId");
            return (Criteria) this;
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

        public Criteria andOpLgTimeIsNull() {
            addCriterion("op_lg_time is null");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeIsNotNull() {
            addCriterion("op_lg_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeEqualTo(Date value) {
            addCriterion("op_lg_time =", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeNotEqualTo(Date value) {
            addCriterion("op_lg_time <>", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeGreaterThan(Date value) {
            addCriterion("op_lg_time >", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_lg_time >=", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeLessThan(Date value) {
            addCriterion("op_lg_time <", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_lg_time <=", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeIn(List<Date> values) {
            addCriterion("op_lg_time in", values, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeNotIn(List<Date> values) {
            addCriterion("op_lg_time not in", values, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeBetween(Date value1, Date value2) {
            addCriterion("op_lg_time between", value1, value2, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_lg_time not between", value1, value2, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeIsNull() {
            addCriterion("op_lg_type is null");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeIsNotNull() {
            addCriterion("op_lg_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeEqualTo(Integer value) {
            addCriterion("op_lg_type =", value, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeNotEqualTo(Integer value) {
            addCriterion("op_lg_type <>", value, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeGreaterThan(Integer value) {
            addCriterion("op_lg_type >", value, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_lg_type >=", value, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeLessThan(Integer value) {
            addCriterion("op_lg_type <", value, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("op_lg_type <=", value, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeIn(List<Integer> values) {
            addCriterion("op_lg_type in", values, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeNotIn(List<Integer> values) {
            addCriterion("op_lg_type not in", values, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_type between", value1, value2, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_type not between", value1, value2, "opLgType");
            return (Criteria) this;
        }

        public Criteria andOpLgResultIsNull() {
            addCriterion("op_lg_result is null");
            return (Criteria) this;
        }

        public Criteria andOpLgResultIsNotNull() {
            addCriterion("op_lg_result is not null");
            return (Criteria) this;
        }

        public Criteria andOpLgResultEqualTo(Integer value) {
            addCriterion("op_lg_result =", value, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultNotEqualTo(Integer value) {
            addCriterion("op_lg_result <>", value, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultGreaterThan(Integer value) {
            addCriterion("op_lg_result >", value, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_lg_result >=", value, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultLessThan(Integer value) {
            addCriterion("op_lg_result <", value, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultLessThanOrEqualTo(Integer value) {
            addCriterion("op_lg_result <=", value, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultIn(List<Integer> values) {
            addCriterion("op_lg_result in", values, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultNotIn(List<Integer> values) {
            addCriterion("op_lg_result not in", values, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_result between", value1, value2, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpLgResultNotBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_result not between", value1, value2, "opLgResult");
            return (Criteria) this;
        }

        public Criteria andOpDescIsNull() {
            addCriterion("op_desc is null");
            return (Criteria) this;
        }

        public Criteria andOpDescIsNotNull() {
            addCriterion("op_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOpDescEqualTo(String value) {
            addCriterion("op_desc =", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotEqualTo(String value) {
            addCriterion("op_desc <>", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescGreaterThan(String value) {
            addCriterion("op_desc >", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescGreaterThanOrEqualTo(String value) {
            addCriterion("op_desc >=", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLessThan(String value) {
            addCriterion("op_desc <", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLessThanOrEqualTo(String value) {
            addCriterion("op_desc <=", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLike(String value) {
            addCriterion("op_desc like", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotLike(String value) {
            addCriterion("op_desc not like", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescIn(List<String> values) {
            addCriterion("op_desc in", values, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotIn(List<String> values) {
            addCriterion("op_desc not in", values, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescBetween(String value1, String value2) {
            addCriterion("op_desc between", value1, value2, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotBetween(String value1, String value2) {
            addCriterion("op_desc not between", value1, value2, "opDesc");
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