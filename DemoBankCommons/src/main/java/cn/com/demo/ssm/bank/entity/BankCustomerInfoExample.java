package cn.com.demo.ssm.bank.entity;

import java.util.ArrayList;
import java.util.List;

public class BankCustomerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankCustomerInfoExample() {
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

        public Criteria andCmIdIsNull() {
            addCriterion("cm_id is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("cm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_id >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNull() {
            addCriterion("cm_name is null");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNotNull() {
            addCriterion("cm_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmNameEqualTo(String value) {
            addCriterion("cm_name =", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotEqualTo(String value) {
            addCriterion("cm_name <>", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThan(String value) {
            addCriterion("cm_name >", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThanOrEqualTo(String value) {
            addCriterion("cm_name >=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThan(String value) {
            addCriterion("cm_name <", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThanOrEqualTo(String value) {
            addCriterion("cm_name <=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLike(String value) {
            addCriterion("cm_name like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotLike(String value) {
            addCriterion("cm_name not like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameIn(List<String> values) {
            addCriterion("cm_name in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotIn(List<String> values) {
            addCriterion("cm_name not in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameBetween(String value1, String value2) {
            addCriterion("cm_name between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotBetween(String value1, String value2) {
            addCriterion("cm_name not between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIsNull() {
            addCriterion("cm_phone is null");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIsNotNull() {
            addCriterion("cm_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCmPhoneEqualTo(String value) {
            addCriterion("cm_phone =", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotEqualTo(String value) {
            addCriterion("cm_phone <>", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneGreaterThan(String value) {
            addCriterion("cm_phone >", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cm_phone >=", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLessThan(String value) {
            addCriterion("cm_phone <", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLessThanOrEqualTo(String value) {
            addCriterion("cm_phone <=", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLike(String value) {
            addCriterion("cm_phone like", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotLike(String value) {
            addCriterion("cm_phone not like", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIn(List<String> values) {
            addCriterion("cm_phone in", values, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotIn(List<String> values) {
            addCriterion("cm_phone not in", values, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneBetween(String value1, String value2) {
            addCriterion("cm_phone between", value1, value2, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotBetween(String value1, String value2) {
            addCriterion("cm_phone not between", value1, value2, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgIsNull() {
            addCriterion("cm_header_img is null");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgIsNotNull() {
            addCriterion("cm_header_img is not null");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgEqualTo(String value) {
            addCriterion("cm_header_img =", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgNotEqualTo(String value) {
            addCriterion("cm_header_img <>", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgGreaterThan(String value) {
            addCriterion("cm_header_img >", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgGreaterThanOrEqualTo(String value) {
            addCriterion("cm_header_img >=", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgLessThan(String value) {
            addCriterion("cm_header_img <", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgLessThanOrEqualTo(String value) {
            addCriterion("cm_header_img <=", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgLike(String value) {
            addCriterion("cm_header_img like", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgNotLike(String value) {
            addCriterion("cm_header_img not like", value, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgIn(List<String> values) {
            addCriterion("cm_header_img in", values, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgNotIn(List<String> values) {
            addCriterion("cm_header_img not in", values, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgBetween(String value1, String value2) {
            addCriterion("cm_header_img between", value1, value2, "cmHeaderImg");
            return (Criteria) this;
        }

        public Criteria andCmHeaderImgNotBetween(String value1, String value2) {
            addCriterion("cm_header_img not between", value1, value2, "cmHeaderImg");
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