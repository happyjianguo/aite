package com.nj.dao;

import com.nj.model.generate.NjLoanOrderCapitalChannel;
import com.nj.model.generate.NjLoanOrderCapitalChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjLoanOrderCapitalChannelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int countByExample(NjLoanOrderCapitalChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int deleteByExample(NjLoanOrderCapitalChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int insert(NjLoanOrderCapitalChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int insertSelective(NjLoanOrderCapitalChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    List<NjLoanOrderCapitalChannel> selectByExample(NjLoanOrderCapitalChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    NjLoanOrderCapitalChannel selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") NjLoanOrderCapitalChannel record, @Param("example") NjLoanOrderCapitalChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") NjLoanOrderCapitalChannel record, @Param("example") NjLoanOrderCapitalChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NjLoanOrderCapitalChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_loan_order_capital_channel
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NjLoanOrderCapitalChannel record);
}