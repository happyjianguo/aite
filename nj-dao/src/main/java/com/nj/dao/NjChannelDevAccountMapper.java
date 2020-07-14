package com.nj.dao;

import com.nj.model.generate.NjChannelDevAccount;
import com.nj.model.generate.NjChannelDevAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjChannelDevAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    long countByExample(NjChannelDevAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int deleteByExample(NjChannelDevAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int insert(NjChannelDevAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int insertSelective(NjChannelDevAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    List<NjChannelDevAccount> selectByExample(NjChannelDevAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    NjChannelDevAccount selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int updateByExampleSelective(@Param("record") NjChannelDevAccount record, @Param("example") NjChannelDevAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int updateByExample(@Param("record") NjChannelDevAccount record, @Param("example") NjChannelDevAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int updateByPrimaryKeySelective(NjChannelDevAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_channel_dev_account
     *
     * @mbg.generated Thu Jul 20 09:41:48 CST 2017
     */
    int updateByPrimaryKey(NjChannelDevAccount record);
}