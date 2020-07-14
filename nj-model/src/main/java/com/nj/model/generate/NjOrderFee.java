package com.nj.model.generate;

import java.math.BigDecimal;
import java.util.Date;

public class NjOrderFee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.product_id
     *
     * @mbggenerated
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.order_id
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.business_fee_code
     *
     * @mbggenerated
     */
    private String businessFeeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.business_fee_code_name
     *
     * @mbggenerated
     */
    private String businessFeeCodeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.amount
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.create_by
     *
     * @mbggenerated
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.update_date
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nj_order_fee.update_by
     *
     * @mbggenerated
     */
    private String updateBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.id
     *
     * @return the value of nj_order_fee.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.id
     *
     * @param id the value for nj_order_fee.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.product_id
     *
     * @return the value of nj_order_fee.product_id
     *
     * @mbggenerated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.product_id
     *
     * @param productId the value for nj_order_fee.product_id
     *
     * @mbggenerated
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.order_id
     *
     * @return the value of nj_order_fee.order_id
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.order_id
     *
     * @param orderId the value for nj_order_fee.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.business_fee_code
     *
     * @return the value of nj_order_fee.business_fee_code
     *
     * @mbggenerated
     */
    public String getBusinessFeeCode() {
        return businessFeeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.business_fee_code
     *
     * @param businessFeeCode the value for nj_order_fee.business_fee_code
     *
     * @mbggenerated
     */
    public void setBusinessFeeCode(String businessFeeCode) {
        this.businessFeeCode = businessFeeCode == null ? null : businessFeeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.business_fee_code_name
     *
     * @return the value of nj_order_fee.business_fee_code_name
     *
     * @mbggenerated
     */
    public String getBusinessFeeCodeName() {
        return businessFeeCodeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.business_fee_code_name
     *
     * @param businessFeeCodeName the value for nj_order_fee.business_fee_code_name
     *
     * @mbggenerated
     */
    public void setBusinessFeeCodeName(String businessFeeCodeName) {
        this.businessFeeCodeName = businessFeeCodeName == null ? null : businessFeeCodeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.amount
     *
     * @return the value of nj_order_fee.amount
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.amount
     *
     * @param amount the value for nj_order_fee.amount
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.create_date
     *
     * @return the value of nj_order_fee.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.create_date
     *
     * @param createDate the value for nj_order_fee.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.create_by
     *
     * @return the value of nj_order_fee.create_by
     *
     * @mbggenerated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.create_by
     *
     * @param createBy the value for nj_order_fee.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.update_date
     *
     * @return the value of nj_order_fee.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.update_date
     *
     * @param updateDate the value for nj_order_fee.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nj_order_fee.update_by
     *
     * @return the value of nj_order_fee.update_by
     *
     * @mbggenerated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nj_order_fee.update_by
     *
     * @param updateBy the value for nj_order_fee.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}