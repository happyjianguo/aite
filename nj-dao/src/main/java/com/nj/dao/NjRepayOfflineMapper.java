package com.nj.dao;

import com.nj.model.generate.NjRepayOffline;
import com.nj.model.generate.NjRepayOfflineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjRepayOfflineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int countByExample(NjRepayOfflineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int deleteByExample(NjRepayOfflineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int insert(NjRepayOffline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int insertSelective(NjRepayOffline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    List<NjRepayOffline> selectByExample(NjRepayOfflineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    NjRepayOffline selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int updateByExampleSelective(@Param("record") NjRepayOffline record, @Param("example") NjRepayOfflineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int updateByExample(@Param("record") NjRepayOffline record, @Param("example") NjRepayOfflineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int updateByPrimaryKeySelective(NjRepayOffline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_repay_offline
     *
     * @mbggenerated Mon Nov 06 15:12:38 CST 2017
     */
    int updateByPrimaryKey(NjRepayOffline record);
}