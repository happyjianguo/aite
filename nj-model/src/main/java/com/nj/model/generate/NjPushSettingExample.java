package com.nj.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NjPushSettingExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public NjPushSettingExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
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

		public Criteria andCreatebyIsNull() {
			addCriterion("createBy is null");
			return (Criteria) this;
		}

		public Criteria andCreatebyIsNotNull() {
			addCriterion("createBy is not null");
			return (Criteria) this;
		}

		public Criteria andCreatebyEqualTo(String value) {
			addCriterion("createBy =", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotEqualTo(String value) {
			addCriterion("createBy <>", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyGreaterThan(String value) {
			addCriterion("createBy >", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
			addCriterion("createBy >=", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLessThan(String value) {
			addCriterion("createBy <", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLessThanOrEqualTo(String value) {
			addCriterion("createBy <=", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLike(String value) {
			addCriterion("createBy like", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotLike(String value) {
			addCriterion("createBy not like", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyIn(List<String> values) {
			addCriterion("createBy in", values, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotIn(List<String> values) {
			addCriterion("createBy not in", values, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyBetween(String value1, String value2) {
			addCriterion("createBy between", value1, value2, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotBetween(String value1, String value2) {
			addCriterion("createBy not between", value1, value2, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("createTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("createTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(Date value) {
			addCriterion("createTime <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<Date> values) {
			addCriterion("createTime in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createTime not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(Date value1, Date value2) {
			addCriterion("createTime between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
			addCriterion("createTime not between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeIsNull() {
			addCriterion("deleteTime is null");
			return (Criteria) this;
		}

		public Criteria andDeletetimeIsNotNull() {
			addCriterion("deleteTime is not null");
			return (Criteria) this;
		}

		public Criteria andDeletetimeEqualTo(Date value) {
			addCriterion("deleteTime =", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeNotEqualTo(Date value) {
			addCriterion("deleteTime <>", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeGreaterThan(Date value) {
			addCriterion("deleteTime >", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("deleteTime >=", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeLessThan(Date value) {
			addCriterion("deleteTime <", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeLessThanOrEqualTo(Date value) {
			addCriterion("deleteTime <=", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeIn(List<Date> values) {
			addCriterion("deleteTime in", values, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeNotIn(List<Date> values) {
			addCriterion("deleteTime not in", values, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeBetween(Date value1, Date value2) {
			addCriterion("deleteTime between", value1, value2, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeNotBetween(Date value1, Date value2) {
			addCriterion("deleteTime not between", value1, value2, "deletetime");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNull() {
			addCriterion("isDeleted is null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNotNull() {
			addCriterion("isDeleted is not null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedEqualTo(Boolean value) {
			addCriterion("isDeleted =", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotEqualTo(Boolean value) {
			addCriterion("isDeleted <>", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThan(Boolean value) {
			addCriterion("isDeleted >", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("isDeleted >=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThan(Boolean value) {
			addCriterion("isDeleted <", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
			addCriterion("isDeleted <=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIn(List<Boolean> values) {
			addCriterion("isDeleted in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotIn(List<Boolean> values) {
			addCriterion("isDeleted not in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
			addCriterion("isDeleted between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("isDeleted not between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIsNull() {
			addCriterion("updateBy is null");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIsNotNull() {
			addCriterion("updateBy is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatebyEqualTo(String value) {
			addCriterion("updateBy =", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotEqualTo(String value) {
			addCriterion("updateBy <>", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThan(String value) {
			addCriterion("updateBy >", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
			addCriterion("updateBy >=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThan(String value) {
			addCriterion("updateBy <", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThanOrEqualTo(String value) {
			addCriterion("updateBy <=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLike(String value) {
			addCriterion("updateBy like", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotLike(String value) {
			addCriterion("updateBy not like", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIn(List<String> values) {
			addCriterion("updateBy in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotIn(List<String> values) {
			addCriterion("updateBy not in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyBetween(String value1, String value2) {
			addCriterion("updateBy between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotBetween(String value1, String value2) {
			addCriterion("updateBy not between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNull() {
			addCriterion("updateTime is null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNotNull() {
			addCriterion("updateTime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeEqualTo(Date value) {
			addCriterion("updateTime =", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotEqualTo(Date value) {
			addCriterion("updateTime <>", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThan(Date value) {
			addCriterion("updateTime >", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("updateTime >=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThan(Date value) {
			addCriterion("updateTime <", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("updateTime <=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIn(List<Date> values) {
			addCriterion("updateTime in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotIn(List<Date> values) {
			addCriterion("updateTime not in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeBetween(Date value1, Date value2) {
			addCriterion("updateTime between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("updateTime not between", value1, value2, "updatetime");
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

		public Criteria andIsopensmsIsNull() {
			addCriterion("isOpenSms is null");
			return (Criteria) this;
		}

		public Criteria andIsopensmsIsNotNull() {
			addCriterion("isOpenSms is not null");
			return (Criteria) this;
		}

		public Criteria andIsopensmsEqualTo(Integer value) {
			addCriterion("isOpenSms =", value, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsNotEqualTo(Integer value) {
			addCriterion("isOpenSms <>", value, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsGreaterThan(Integer value) {
			addCriterion("isOpenSms >", value, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsGreaterThanOrEqualTo(Integer value) {
			addCriterion("isOpenSms >=", value, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsLessThan(Integer value) {
			addCriterion("isOpenSms <", value, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsLessThanOrEqualTo(Integer value) {
			addCriterion("isOpenSms <=", value, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsIn(List<Integer> values) {
			addCriterion("isOpenSms in", values, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsNotIn(List<Integer> values) {
			addCriterion("isOpenSms not in", values, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsBetween(Integer value1, Integer value2) {
			addCriterion("isOpenSms between", value1, value2, "isopensms");
			return (Criteria) this;
		}

		public Criteria andIsopensmsNotBetween(Integer value1, Integer value2) {
			addCriterion("isOpenSms not between", value1, value2, "isopensms");
			return (Criteria) this;
		}

		public Criteria andSmspwdIsNull() {
			addCriterion("smsPwd is null");
			return (Criteria) this;
		}

		public Criteria andSmspwdIsNotNull() {
			addCriterion("smsPwd is not null");
			return (Criteria) this;
		}

		public Criteria andSmspwdEqualTo(String value) {
			addCriterion("smsPwd =", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdNotEqualTo(String value) {
			addCriterion("smsPwd <>", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdGreaterThan(String value) {
			addCriterion("smsPwd >", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdGreaterThanOrEqualTo(String value) {
			addCriterion("smsPwd >=", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdLessThan(String value) {
			addCriterion("smsPwd <", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdLessThanOrEqualTo(String value) {
			addCriterion("smsPwd <=", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdLike(String value) {
			addCriterion("smsPwd like", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdNotLike(String value) {
			addCriterion("smsPwd not like", value, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdIn(List<String> values) {
			addCriterion("smsPwd in", values, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdNotIn(List<String> values) {
			addCriterion("smsPwd not in", values, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdBetween(String value1, String value2) {
			addCriterion("smsPwd between", value1, value2, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmspwdNotBetween(String value1, String value2) {
			addCriterion("smsPwd not between", value1, value2, "smspwd");
			return (Criteria) this;
		}

		public Criteria andSmsurlIsNull() {
			addCriterion("smsUrl is null");
			return (Criteria) this;
		}

		public Criteria andSmsurlIsNotNull() {
			addCriterion("smsUrl is not null");
			return (Criteria) this;
		}

		public Criteria andSmsurlEqualTo(String value) {
			addCriterion("smsUrl =", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlNotEqualTo(String value) {
			addCriterion("smsUrl <>", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlGreaterThan(String value) {
			addCriterion("smsUrl >", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlGreaterThanOrEqualTo(String value) {
			addCriterion("smsUrl >=", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlLessThan(String value) {
			addCriterion("smsUrl <", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlLessThanOrEqualTo(String value) {
			addCriterion("smsUrl <=", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlLike(String value) {
			addCriterion("smsUrl like", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlNotLike(String value) {
			addCriterion("smsUrl not like", value, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlIn(List<String> values) {
			addCriterion("smsUrl in", values, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlNotIn(List<String> values) {
			addCriterion("smsUrl not in", values, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlBetween(String value1, String value2) {
			addCriterion("smsUrl between", value1, value2, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsurlNotBetween(String value1, String value2) {
			addCriterion("smsUrl not between", value1, value2, "smsurl");
			return (Criteria) this;
		}

		public Criteria andSmsusernameIsNull() {
			addCriterion("smsUserName is null");
			return (Criteria) this;
		}

		public Criteria andSmsusernameIsNotNull() {
			addCriterion("smsUserName is not null");
			return (Criteria) this;
		}

		public Criteria andSmsusernameEqualTo(String value) {
			addCriterion("smsUserName =", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameNotEqualTo(String value) {
			addCriterion("smsUserName <>", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameGreaterThan(String value) {
			addCriterion("smsUserName >", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameGreaterThanOrEqualTo(String value) {
			addCriterion("smsUserName >=", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameLessThan(String value) {
			addCriterion("smsUserName <", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameLessThanOrEqualTo(String value) {
			addCriterion("smsUserName <=", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameLike(String value) {
			addCriterion("smsUserName like", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameNotLike(String value) {
			addCriterion("smsUserName not like", value, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameIn(List<String> values) {
			addCriterion("smsUserName in", values, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameNotIn(List<String> values) {
			addCriterion("smsUserName not in", values, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameBetween(String value1, String value2) {
			addCriterion("smsUserName between", value1, value2, "smsusername");
			return (Criteria) this;
		}

		public Criteria andSmsusernameNotBetween(String value1, String value2) {
			addCriterion("smsUserName not between", value1, value2, "smsusername");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table nj_push_setting
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
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
     * This class corresponds to the database table nj_push_setting
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 15 14:14:51 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}