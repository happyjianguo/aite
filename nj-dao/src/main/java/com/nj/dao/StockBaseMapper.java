package com.nj.dao;

import com.nj.core.base.mapper.BaseMapper;
import com.nj.model.generate.StockBase;
import com.nj.model.generate.StockBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockBaseMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int countByExample(StockBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int deleteByExample(StockBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int insert(StockBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int insertSelective(StockBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    List<StockBase> selectByExample(StockBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    StockBase selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int updateByExampleSelective(@Param("record") StockBase record, @Param("example") StockBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int updateByExample(@Param("record") StockBase record, @Param("example") StockBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int updateByPrimaryKeySelective(StockBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_base
     *
     * @mbggenerated Mon Jul 27 14:39:54 CST 2020
     */
    int updateByPrimaryKey(StockBase record);
}