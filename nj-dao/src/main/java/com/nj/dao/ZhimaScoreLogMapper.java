package com.nj.dao;

import com.nj.model.generate.ZhimaScoreLog;
import com.nj.model.generate.ZhimaScoreLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhimaScoreLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    long countByExample(ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int deleteByExample(ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int insert(ZhimaScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int insertSelective(ZhimaScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    List<ZhimaScoreLog> selectByExampleWithBLOBs(ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    List<ZhimaScoreLog> selectByExample(ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    ZhimaScoreLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int updateByExampleSelective(@Param("record") ZhimaScoreLog record, @Param("example") ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") ZhimaScoreLog record, @Param("example") ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int updateByExample(@Param("record") ZhimaScoreLog record, @Param("example") ZhimaScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int updateByPrimaryKeySelective(ZhimaScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(ZhimaScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhima_score_log
     *
     * @mbg.generated Tue Mar 14 19:03:45 CST 2017
     */
    int updateByPrimaryKey(ZhimaScoreLog record);
}