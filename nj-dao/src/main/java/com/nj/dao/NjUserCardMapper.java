package com.nj.dao;

import com.nj.model.generate.NjUserCard;
import com.nj.model.generate.NjUserCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjUserCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int countByExample(NjUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int deleteByExample(NjUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int insert(NjUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int insertSelective(NjUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    List<NjUserCard> selectByExample(NjUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    NjUserCard selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") NjUserCard record, @Param("example") NjUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByExample(@Param("record") NjUserCard record, @Param("example") NjUserCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByPrimaryKeySelective(NjUserCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nj_user_card
     *
     * @mbggenerated Tue Nov 28 13:24:42 CST 2017
     */
    int updateByPrimaryKey(NjUserCard record);
}