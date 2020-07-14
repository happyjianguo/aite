package com.nj.dao.activiti.mapper.base;

import com.nj.model.activiti.base.ProcessTaskinsUser;
import com.nj.model.activiti.base.ProcessTaskinsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessTaskinsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    int countByExample(ProcessTaskinsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    int deleteByExample(ProcessTaskinsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    int insert(ProcessTaskinsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    int insertSelective(ProcessTaskinsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    List<ProcessTaskinsUser> selectByExample(ProcessTaskinsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    int updateByExampleSelective(@Param("record") ProcessTaskinsUser record, @Param("example") ProcessTaskinsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_taskins_user
     *
     * @mbggenerated Thu Sep 14 10:20:38 CST 2017
     */
    int updateByExample(@Param("record") ProcessTaskinsUser record, @Param("example") ProcessTaskinsUserExample example);
}