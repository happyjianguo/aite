package com.nj.dao.activiti.mapper.base;

import com.nj.model.activiti.base.ProcessTemplate;
import com.nj.model.activiti.base.ProcessTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int countByExample(ProcessTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int deleteByExample(ProcessTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int insert(ProcessTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int insertSelective(ProcessTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    List<ProcessTemplate> selectByExample(ProcessTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    ProcessTemplate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") ProcessTemplate record, @Param("example") ProcessTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int updateByExample(@Param("record") ProcessTemplate record, @Param("example") ProcessTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int updateByPrimaryKeySelective(ProcessTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table process_template
     *
     * @mbggenerated Fri Jul 28 10:42:09 CST 2017
     */
    int updateByPrimaryKey(ProcessTemplate record);
}