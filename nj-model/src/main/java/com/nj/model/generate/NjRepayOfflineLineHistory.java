package com.nj.model.generate;

import java.math.BigDecimal;
import java.util.Date;

public class NjRepayOfflineLineHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.offline_history_id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String offlineHistoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.offline_repay_line_id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String offlineRepayLineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.change_oper
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String changeOper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.plan_repay_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private Date planRepayDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.actual_repay_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private Date actualRepayDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.overdue_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private Integer overdueDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.total_amount
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private BigDecimal totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.principal
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private BigDecimal principal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.interest
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private BigDecimal interest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.status
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.repay_type
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private Integer repayType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.actual_people
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String actualPeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_repay_offline_line_history.remark
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.id
     *
     * @return the value of nj_repay_offline_line_history.id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.id
     *
     * @param id the value for nj_repay_offline_line_history.id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.offline_history_id
     *
     * @return the value of nj_repay_offline_line_history.offline_history_id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getOfflineHistoryId() {
        return offlineHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.offline_history_id
     *
     * @param offlineHistoryId the value for nj_repay_offline_line_history.offline_history_id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setOfflineHistoryId(String offlineHistoryId) {
        this.offlineHistoryId = offlineHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.offline_repay_line_id
     *
     * @return the value of nj_repay_offline_line_history.offline_repay_line_id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getOfflineRepayLineId() {
        return offlineRepayLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.offline_repay_line_id
     *
     * @param offlineRepayLineId the value for nj_repay_offline_line_history.offline_repay_line_id
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setOfflineRepayLineId(String offlineRepayLineId) {
        this.offlineRepayLineId = offlineRepayLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.change_oper
     *
     * @return the value of nj_repay_offline_line_history.change_oper
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getChangeOper() {
        return changeOper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.change_oper
     *
     * @param changeOper the value for nj_repay_offline_line_history.change_oper
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setChangeOper(String changeOper) {
        this.changeOper = changeOper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.plan_repay_day
     *
     * @return the value of nj_repay_offline_line_history.plan_repay_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public Date getPlanRepayDay() {
        return planRepayDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.plan_repay_day
     *
     * @param planRepayDay the value for nj_repay_offline_line_history.plan_repay_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setPlanRepayDay(Date planRepayDay) {
        this.planRepayDay = planRepayDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.actual_repay_day
     *
     * @return the value of nj_repay_offline_line_history.actual_repay_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public Date getActualRepayDay() {
        return actualRepayDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.actual_repay_day
     *
     * @param actualRepayDay the value for nj_repay_offline_line_history.actual_repay_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setActualRepayDay(Date actualRepayDay) {
        this.actualRepayDay = actualRepayDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.overdue_day
     *
     * @return the value of nj_repay_offline_line_history.overdue_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public Integer getOverdueDay() {
        return overdueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.overdue_day
     *
     * @param overdueDay the value for nj_repay_offline_line_history.overdue_day
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.total_amount
     *
     * @return the value of nj_repay_offline_line_history.total_amount
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.total_amount
     *
     * @param totalAmount the value for nj_repay_offline_line_history.total_amount
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.principal
     *
     * @return the value of nj_repay_offline_line_history.principal
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.principal
     *
     * @param principal the value for nj_repay_offline_line_history.principal
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.interest
     *
     * @return the value of nj_repay_offline_line_history.interest
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.interest
     *
     * @param interest the value for nj_repay_offline_line_history.interest
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.status
     *
     * @return the value of nj_repay_offline_line_history.status
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.status
     *
     * @param status the value for nj_repay_offline_line_history.status
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.repay_type
     *
     * @return the value of nj_repay_offline_line_history.repay_type
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public Integer getRepayType() {
        return repayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.repay_type
     *
     * @param repayType the value for nj_repay_offline_line_history.repay_type
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setRepayType(Integer repayType) {
        this.repayType = repayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.actual_people
     *
     * @return the value of nj_repay_offline_line_history.actual_people
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getActualPeople() {
        return actualPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.actual_people
     *
     * @param actualPeople the value for nj_repay_offline_line_history.actual_people
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setActualPeople(String actualPeople) {
        this.actualPeople = actualPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_repay_offline_line_history.remark
     *
     * @return the value of nj_repay_offline_line_history.remark
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_repay_offline_line_history.remark
     *
     * @param remark the value for nj_repay_offline_line_history.remark
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}