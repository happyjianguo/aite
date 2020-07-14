package com.nj.dao;

import com.nj.model.generate.NjFaceidRequireLog;
import com.nj.model.generate.NjFaceidRequireLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjFaceidRequireLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    long countByExample(NjFaceidRequireLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int deleteByExample(NjFaceidRequireLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int insert(NjFaceidRequireLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int insertSelective(NjFaceidRequireLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    List<NjFaceidRequireLog> selectByExample(NjFaceidRequireLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    NjFaceidRequireLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") NjFaceidRequireLog record, @Param("example") NjFaceidRequireLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int updateByExample(@Param("record") NjFaceidRequireLog record, @Param("example") NjFaceidRequireLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int updateByPrimaryKeySelective(NjFaceidRequireLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_faceid_require_log
     *
     * @mbg.generated Wed Mar 29 16:01:04 CST 2017
     */
    int updateByPrimaryKey(NjFaceidRequireLog record);
}