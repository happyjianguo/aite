package com.nj.dao;

import com.nj.model.generate.NjMerchant;
import com.nj.model.generate.NjMerchantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjMerchantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int countByExample(NjMerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int deleteByExample(NjMerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int insert(NjMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int insertSelective(NjMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    List<NjMerchant> selectByExample(NjMerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    NjMerchant selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") NjMerchant record, @Param("example") NjMerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByExample(@Param("record") NjMerchant record, @Param("example") NjMerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByPrimaryKeySelective(NjMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_merchant
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByPrimaryKey(NjMerchant record);
}