package com.nj.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NjDebitRecordLineExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public NjDebitRecordLineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdIsNull() {
            addCriterion("debit_record_id is null");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdIsNotNull() {
            addCriterion("debit_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdEqualTo(String value) {
            addCriterion("debit_record_id =", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdNotEqualTo(String value) {
            addCriterion("debit_record_id <>", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdGreaterThan(String value) {
            addCriterion("debit_record_id >", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("debit_record_id >=", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdLessThan(String value) {
            addCriterion("debit_record_id <", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdLessThanOrEqualTo(String value) {
            addCriterion("debit_record_id <=", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdLike(String value) {
            addCriterion("debit_record_id like", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdNotLike(String value) {
            addCriterion("debit_record_id not like", value, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdIn(List<String> values) {
            addCriterion("debit_record_id in", values, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdNotIn(List<String> values) {
            addCriterion("debit_record_id not in", values, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdBetween(String value1, String value2) {
            addCriterion("debit_record_id between", value1, value2, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andDebitRecordIdNotBetween(String value1, String value2) {
            addCriterion("debit_record_id not between", value1, value2, "debitRecordId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdIsNull() {
            addCriterion("repay_offline_line_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdIsNotNull() {
            addCriterion("repay_offline_line_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdEqualTo(String value) {
            addCriterion("repay_offline_line_id =", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdNotEqualTo(String value) {
            addCriterion("repay_offline_line_id <>", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdGreaterThan(String value) {
            addCriterion("repay_offline_line_id >", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdGreaterThanOrEqualTo(String value) {
            addCriterion("repay_offline_line_id >=", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdLessThan(String value) {
            addCriterion("repay_offline_line_id <", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdLessThanOrEqualTo(String value) {
            addCriterion("repay_offline_line_id <=", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdLike(String value) {
            addCriterion("repay_offline_line_id like", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdNotLike(String value) {
            addCriterion("repay_offline_line_id not like", value, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdIn(List<String> values) {
            addCriterion("repay_offline_line_id in", values, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdNotIn(List<String> values) {
            addCriterion("repay_offline_line_id not in", values, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdBetween(String value1, String value2) {
            addCriterion("repay_offline_line_id between", value1, value2, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andRepayOfflineLineIdNotBetween(String value1, String value2) {
            addCriterion("repay_offline_line_id not between", value1, value2, "repayOfflineLineId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated do_not_delete_during_merge Tue Dec 26 13:49:18 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nj_debit_record_line
     *
     * @mbg.generated Tue Dec 26 13:49:18 CST 2017
     */
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