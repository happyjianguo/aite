package com.nj.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NjUserCertExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public NjUserCertExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andVersionIsNull() {
			addCriterion("version is null");
			return (Criteria) this;
		}

		public Criteria andVersionIsNotNull() {
			addCriterion("version is not null");
			return (Criteria) this;
		}

		public Criteria andVersionEqualTo(Integer value) {
			addCriterion("version =", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotEqualTo(Integer value) {
			addCriterion("version <>", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThan(Integer value) {
			addCriterion("version >", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
			addCriterion("version >=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThan(Integer value) {
			addCriterion("version <", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionLessThanOrEqualTo(Integer value) {
			addCriterion("version <=", value, "version");
			return (Criteria) this;
		}

		public Criteria andVersionIn(List<Integer> values) {
			addCriterion("version in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotIn(List<Integer> values) {
			addCriterion("version not in", values, "version");
			return (Criteria) this;
		}

		public Criteria andVersionBetween(Integer value1, Integer value2) {
			addCriterion("version between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andVersionNotBetween(Integer value1, Integer value2) {
			addCriterion("version not between", value1, value2, "version");
			return (Criteria) this;
		}

		public Criteria andDelFlagIsNull() {
			addCriterion("del_flag is null");
			return (Criteria) this;
		}

		public Criteria andDelFlagIsNotNull() {
			addCriterion("del_flag is not null");
			return (Criteria) this;
		}

		public Criteria andDelFlagEqualTo(Boolean value) {
			addCriterion("del_flag =", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagNotEqualTo(Boolean value) {
			addCriterion("del_flag <>", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagGreaterThan(Boolean value) {
			addCriterion("del_flag >", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("del_flag >=", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagLessThan(Boolean value) {
			addCriterion("del_flag <", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("del_flag <=", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagIn(List<Boolean> values) {
			addCriterion("del_flag in", values, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagNotIn(List<Boolean> values) {
			addCriterion("del_flag not in", values, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
			addCriterion("del_flag between", value1, value2, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
			addCriterion("del_flag not between", value1, value2, "delFlag");
			return (Criteria) this;
		}

		public Criteria andCheckStatusIsNull() {
			addCriterion("check_status is null");
			return (Criteria) this;
		}

		public Criteria andCheckStatusIsNotNull() {
			addCriterion("check_status is not null");
			return (Criteria) this;
		}

		public Criteria andCheckStatusEqualTo(Integer value) {
			addCriterion("check_status =", value, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusNotEqualTo(Integer value) {
			addCriterion("check_status <>", value, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusGreaterThan(Integer value) {
			addCriterion("check_status >", value, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("check_status >=", value, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusLessThan(Integer value) {
			addCriterion("check_status <", value, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
			addCriterion("check_status <=", value, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusIn(List<Integer> values) {
			addCriterion("check_status in", values, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusNotIn(List<Integer> values) {
			addCriterion("check_status not in", values, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
			addCriterion("check_status between", value1, value2, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("check_status not between", value1, value2, "checkStatus");
			return (Criteria) this;
		}

		public Criteria andCreateByIsNull() {
			addCriterion("create_by is null");
			return (Criteria) this;
		}

		public Criteria andCreateByIsNotNull() {
			addCriterion("create_by is not null");
			return (Criteria) this;
		}

		public Criteria andCreateByEqualTo(String value) {
			addCriterion("create_by =", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotEqualTo(String value) {
			addCriterion("create_by <>", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByGreaterThan(String value) {
			addCriterion("create_by >", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByGreaterThanOrEqualTo(String value) {
			addCriterion("create_by >=", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByLessThan(String value) {
			addCriterion("create_by <", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByLessThanOrEqualTo(String value) {
			addCriterion("create_by <=", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByLike(String value) {
			addCriterion("create_by like", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotLike(String value) {
			addCriterion("create_by not like", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByIn(List<String> values) {
			addCriterion("create_by in", values, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotIn(List<String> values) {
			addCriterion("create_by not in", values, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByBetween(String value1, String value2) {
			addCriterion("create_by between", value1, value2, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotBetween(String value1, String value2) {
			addCriterion("create_by not between", value1, value2, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andUpdateByIsNull() {
			addCriterion("update_by is null");
			return (Criteria) this;
		}

		public Criteria andUpdateByIsNotNull() {
			addCriterion("update_by is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateByEqualTo(String value) {
			addCriterion("update_by =", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotEqualTo(String value) {
			addCriterion("update_by <>", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByGreaterThan(String value) {
			addCriterion("update_by >", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
			addCriterion("update_by >=", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByLessThan(String value) {
			addCriterion("update_by <", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByLessThanOrEqualTo(String value) {
			addCriterion("update_by <=", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByLike(String value) {
			addCriterion("update_by like", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotLike(String value) {
			addCriterion("update_by not like", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByIn(List<String> values) {
			addCriterion("update_by in", values, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotIn(List<String> values) {
			addCriterion("update_by not in", values, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByBetween(String value1, String value2) {
			addCriterion("update_by between", value1, value2, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotBetween(String value1, String value2) {
			addCriterion("update_by not between", value1, value2, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andCheckResultIsNull() {
			addCriterion("check_result is null");
			return (Criteria) this;
		}

		public Criteria andCheckResultIsNotNull() {
			addCriterion("check_result is not null");
			return (Criteria) this;
		}

		public Criteria andCheckResultEqualTo(String value) {
			addCriterion("check_result =", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultNotEqualTo(String value) {
			addCriterion("check_result <>", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultGreaterThan(String value) {
			addCriterion("check_result >", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultGreaterThanOrEqualTo(String value) {
			addCriterion("check_result >=", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultLessThan(String value) {
			addCriterion("check_result <", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultLessThanOrEqualTo(String value) {
			addCriterion("check_result <=", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultLike(String value) {
			addCriterion("check_result like", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultNotLike(String value) {
			addCriterion("check_result not like", value, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultIn(List<String> values) {
			addCriterion("check_result in", values, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultNotIn(List<String> values) {
			addCriterion("check_result not in", values, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultBetween(String value1, String value2) {
			addCriterion("check_result between", value1, value2, "checkResult");
			return (Criteria) this;
		}

		public Criteria andCheckResultNotBetween(String value1, String value2) {
			addCriterion("check_result not between", value1, value2, "checkResult");
			return (Criteria) this;
		}

		public Criteria andFrontIdIsNull() {
			addCriterion("front_id is null");
			return (Criteria) this;
		}

		public Criteria andFrontIdIsNotNull() {
			addCriterion("front_id is not null");
			return (Criteria) this;
		}

		public Criteria andFrontIdEqualTo(String value) {
			addCriterion("front_id =", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdNotEqualTo(String value) {
			addCriterion("front_id <>", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdGreaterThan(String value) {
			addCriterion("front_id >", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdGreaterThanOrEqualTo(String value) {
			addCriterion("front_id >=", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdLessThan(String value) {
			addCriterion("front_id <", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdLessThanOrEqualTo(String value) {
			addCriterion("front_id <=", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdLike(String value) {
			addCriterion("front_id like", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdNotLike(String value) {
			addCriterion("front_id not like", value, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdIn(List<String> values) {
			addCriterion("front_id in", values, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdNotIn(List<String> values) {
			addCriterion("front_id not in", values, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdBetween(String value1, String value2) {
			addCriterion("front_id between", value1, value2, "frontId");
			return (Criteria) this;
		}

		public Criteria andFrontIdNotBetween(String value1, String value2) {
			addCriterion("front_id not between", value1, value2, "frontId");
			return (Criteria) this;
		}

		public Criteria andBackIdIsNull() {
			addCriterion("back_id is null");
			return (Criteria) this;
		}

		public Criteria andBackIdIsNotNull() {
			addCriterion("back_id is not null");
			return (Criteria) this;
		}

		public Criteria andBackIdEqualTo(String value) {
			addCriterion("back_id =", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdNotEqualTo(String value) {
			addCriterion("back_id <>", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdGreaterThan(String value) {
			addCriterion("back_id >", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdGreaterThanOrEqualTo(String value) {
			addCriterion("back_id >=", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdLessThan(String value) {
			addCriterion("back_id <", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdLessThanOrEqualTo(String value) {
			addCriterion("back_id <=", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdLike(String value) {
			addCriterion("back_id like", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdNotLike(String value) {
			addCriterion("back_id not like", value, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdIn(List<String> values) {
			addCriterion("back_id in", values, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdNotIn(List<String> values) {
			addCriterion("back_id not in", values, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdBetween(String value1, String value2) {
			addCriterion("back_id between", value1, value2, "backId");
			return (Criteria) this;
		}

		public Criteria andBackIdNotBetween(String value1, String value2) {
			addCriterion("back_id not between", value1, value2, "backId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdIsNull() {
			addCriterion("hand_cert_id is null");
			return (Criteria) this;
		}

		public Criteria andHandCertIdIsNotNull() {
			addCriterion("hand_cert_id is not null");
			return (Criteria) this;
		}

		public Criteria andHandCertIdEqualTo(String value) {
			addCriterion("hand_cert_id =", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdNotEqualTo(String value) {
			addCriterion("hand_cert_id <>", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdGreaterThan(String value) {
			addCriterion("hand_cert_id >", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdGreaterThanOrEqualTo(String value) {
			addCriterion("hand_cert_id >=", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdLessThan(String value) {
			addCriterion("hand_cert_id <", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdLessThanOrEqualTo(String value) {
			addCriterion("hand_cert_id <=", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdLike(String value) {
			addCriterion("hand_cert_id like", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdNotLike(String value) {
			addCriterion("hand_cert_id not like", value, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdIn(List<String> values) {
			addCriterion("hand_cert_id in", values, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdNotIn(List<String> values) {
			addCriterion("hand_cert_id not in", values, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdBetween(String value1, String value2) {
			addCriterion("hand_cert_id between", value1, value2, "handCertId");
			return (Criteria) this;
		}

		public Criteria andHandCertIdNotBetween(String value1, String value2) {
			addCriterion("hand_cert_id not between", value1, value2, "handCertId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table nj_user_cert
	 * @mbg.generated  Thu Jul 27 15:47:42 CST 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nj_user_cert
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 27 15:43:03 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}