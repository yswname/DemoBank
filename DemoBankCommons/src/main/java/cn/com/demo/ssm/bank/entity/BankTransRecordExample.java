package cn.com.demo.ssm.bank.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankTransRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankTransRecordExample() {
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

        public Criteria andTrnIdIsNull() {
            addCriterion("trn_id is null");
            return (Criteria) this;
        }

        public Criteria andTrnIdIsNotNull() {
            addCriterion("trn_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrnIdEqualTo(Integer value) {
            addCriterion("trn_id =", value, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdNotEqualTo(Integer value) {
            addCriterion("trn_id <>", value, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdGreaterThan(Integer value) {
            addCriterion("trn_id >", value, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trn_id >=", value, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdLessThan(Integer value) {
            addCriterion("trn_id <", value, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdLessThanOrEqualTo(Integer value) {
            addCriterion("trn_id <=", value, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdIn(List<Integer> values) {
            addCriterion("trn_id in", values, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdNotIn(List<Integer> values) {
            addCriterion("trn_id not in", values, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdBetween(Integer value1, Integer value2) {
            addCriterion("trn_id between", value1, value2, "trnId");
            return (Criteria) this;
        }

        public Criteria andTrnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trn_id not between", value1, value2, "trnId");
            return (Criteria) this;
        }

        public Criteria andAccCodeIsNull() {
            addCriterion("acc_code is null");
            return (Criteria) this;
        }

        public Criteria andAccCodeIsNotNull() {
            addCriterion("acc_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccCodeEqualTo(String value) {
            addCriterion("acc_code =", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotEqualTo(String value) {
            addCriterion("acc_code <>", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeGreaterThan(String value) {
            addCriterion("acc_code >", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("acc_code >=", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeLessThan(String value) {
            addCriterion("acc_code <", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeLessThanOrEqualTo(String value) {
            addCriterion("acc_code <=", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeLike(String value) {
            addCriterion("acc_code like", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotLike(String value) {
            addCriterion("acc_code not like", value, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeIn(List<String> values) {
            addCriterion("acc_code in", values, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotIn(List<String> values) {
            addCriterion("acc_code not in", values, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeBetween(String value1, String value2) {
            addCriterion("acc_code between", value1, value2, "accCode");
            return (Criteria) this;
        }

        public Criteria andAccCodeNotBetween(String value1, String value2) {
            addCriterion("acc_code not between", value1, value2, "accCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeIsNull() {
            addCriterion("bnk_acc_code is null");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeIsNotNull() {
            addCriterion("bnk_acc_code is not null");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeEqualTo(String value) {
            addCriterion("bnk_acc_code =", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeNotEqualTo(String value) {
            addCriterion("bnk_acc_code <>", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeGreaterThan(String value) {
            addCriterion("bnk_acc_code >", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bnk_acc_code >=", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeLessThan(String value) {
            addCriterion("bnk_acc_code <", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeLessThanOrEqualTo(String value) {
            addCriterion("bnk_acc_code <=", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeLike(String value) {
            addCriterion("bnk_acc_code like", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeNotLike(String value) {
            addCriterion("bnk_acc_code not like", value, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeIn(List<String> values) {
            addCriterion("bnk_acc_code in", values, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeNotIn(List<String> values) {
            addCriterion("bnk_acc_code not in", values, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeBetween(String value1, String value2) {
            addCriterion("bnk_acc_code between", value1, value2, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andBnkAccCodeNotBetween(String value1, String value2) {
            addCriterion("bnk_acc_code not between", value1, value2, "bnkAccCode");
            return (Criteria) this;
        }

        public Criteria andTrnTimeIsNull() {
            addCriterion("trn_time is null");
            return (Criteria) this;
        }

        public Criteria andTrnTimeIsNotNull() {
            addCriterion("trn_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrnTimeEqualTo(Date value) {
            addCriterion("trn_time =", value, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeNotEqualTo(Date value) {
            addCriterion("trn_time <>", value, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeGreaterThan(Date value) {
            addCriterion("trn_time >", value, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trn_time >=", value, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeLessThan(Date value) {
            addCriterion("trn_time <", value, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeLessThanOrEqualTo(Date value) {
            addCriterion("trn_time <=", value, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeIn(List<Date> values) {
            addCriterion("trn_time in", values, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeNotIn(List<Date> values) {
            addCriterion("trn_time not in", values, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeBetween(Date value1, Date value2) {
            addCriterion("trn_time between", value1, value2, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnTimeNotBetween(Date value1, Date value2) {
            addCriterion("trn_time not between", value1, value2, "trnTime");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyIsNull() {
            addCriterion("trn_money is null");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyIsNotNull() {
            addCriterion("trn_money is not null");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyEqualTo(BigDecimal value) {
            addCriterion("trn_money =", value, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyNotEqualTo(BigDecimal value) {
            addCriterion("trn_money <>", value, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyGreaterThan(BigDecimal value) {
            addCriterion("trn_money >", value, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trn_money >=", value, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyLessThan(BigDecimal value) {
            addCriterion("trn_money <", value, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trn_money <=", value, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyIn(List<BigDecimal> values) {
            addCriterion("trn_money in", values, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyNotIn(List<BigDecimal> values) {
            addCriterion("trn_money not in", values, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trn_money between", value1, value2, "trnMoney");
            return (Criteria) this;
        }

        public Criteria andTrnMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trn_money not between", value1, value2, "trnMoney");
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