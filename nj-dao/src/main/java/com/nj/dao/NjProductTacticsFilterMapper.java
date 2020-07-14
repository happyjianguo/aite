package com.nj.dao;

import com.nj.model.generate.NjProductTacticsFilter;
import com.nj.model.generate.NjProductTacticsFilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjProductTacticsFilterMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	long countByExample(NjProductTacticsFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int deleteByExample(NjProductTacticsFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int insert(NjProductTacticsFilter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int insertSelective(NjProductTacticsFilter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	List<NjProductTacticsFilter> selectByExample(NjProductTacticsFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	NjProductTacticsFilter selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByExampleSelective(@Param("record") NjProductTacticsFilter record,
			@Param("example") NjProductTacticsFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByExample(@Param("record") NjProductTacticsFilter record,
			@Param("example") NjProductTacticsFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByPrimaryKeySelective(NjProductTacticsFilter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_product_tactics_filter
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByPrimaryKey(NjProductTacticsFilter record);
}