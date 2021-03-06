package com.nj.dao;

import com.nj.model.generate.NjUserContact;
import com.nj.model.generate.NjUserContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjUserContactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    long countByExample(NjUserContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int deleteByExample(NjUserContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int insert(NjUserContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int insertSelective(NjUserContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    List<NjUserContact> selectByExample(NjUserContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    NjUserContact selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") NjUserContact record, @Param("example") NjUserContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int updateByExample(@Param("record") NjUserContact record, @Param("example") NjUserContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int updateByPrimaryKeySelective(NjUserContact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_contact
     *
     * @mbg.generated Sat Apr 01 09:30:31 CST 2017
     */
    int updateByPrimaryKey(NjUserContact record);
}