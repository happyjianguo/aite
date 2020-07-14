package com.nj.dao;

import com.nj.model.generate.SysArea;
import com.nj.model.generate.SysAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAreaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	long countByExample(SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int deleteByExample(SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int insert(SysArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int insertSelective(SysArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	List<SysArea> selectByExample(SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	SysArea selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByPrimaryKeySelective(SysArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByPrimaryKey(SysArea record);
}