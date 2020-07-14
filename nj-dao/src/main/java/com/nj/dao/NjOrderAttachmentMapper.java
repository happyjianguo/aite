package com.nj.dao;

import com.nj.model.generate.NjOrderAttachment;
import com.nj.model.generate.NjOrderAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjOrderAttachmentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	long countByExample(NjOrderAttachmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int deleteByExample(NjOrderAttachmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int insert(NjOrderAttachment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int insertSelective(NjOrderAttachment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	List<NjOrderAttachment> selectByExample(NjOrderAttachmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	NjOrderAttachment selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByExampleSelective(@Param("record") NjOrderAttachment record,
			@Param("example") NjOrderAttachmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByExample(@Param("record") NjOrderAttachment record, @Param("example") NjOrderAttachmentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByPrimaryKeySelective(NjOrderAttachment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table nj_order_attachment
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	int updateByPrimaryKey(NjOrderAttachment record);
}