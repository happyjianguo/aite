package com.nj.mongoModel.after;

import java.math.BigDecimal;

import org.springframework.data.annotation.Transient;

import com.nj.mongoModel.MongoEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 回款计划明细表
 */
@ApiModel(description="回款计划明细表")
public class MoneyBackDetaileNew extends MongoEntity{

	@ApiModelProperty(value = "订单编号")
	private String orderNo;
	
	@ApiModelProperty(value = "期数")
	private Integer period;
	
	@ApiModelProperty(value = "业务费用的code")
	private String businessFeeCode;				//对应枚举EBusinessFee的code
	
	@ApiModelProperty(value = "业务费用的值")
	private BigDecimal businessFeeValue;
	
	@ApiModelProperty(value = "业务费用的名称")
	@Transient
	private String businessFeeName;
	
	@ApiModelProperty(value = "数据类型：his 的时候为历史数据")
	private  String  dataFlag;
	
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getBusinessFeeCode() {
		return businessFeeCode;
	}

	public void setBusinessFeeCode(String businessFeeCode) {
		this.businessFeeCode = businessFeeCode;
	}

	public BigDecimal getBusinessFeeValue() {
		return businessFeeValue;
	}

	public void setBusinessFeeValue(BigDecimal businessFeeValue) {
		this.businessFeeValue = businessFeeValue;
	}
	
	public String getDataFlag() {
		return dataFlag;
	}
	public void setDataFlag(String dataFlag) {
		this.dataFlag = dataFlag;
	}

	public String getBusinessFeeName() {
		return businessFeeName;
	}

	public void setBusinessFeeName(String businessFeeName) {
		this.businessFeeName = businessFeeName;
	}
	
	
}
