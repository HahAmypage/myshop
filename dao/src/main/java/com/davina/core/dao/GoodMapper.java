package com.davina.core.dao;

import com.davina.core.pojo.Good;
import com.davina.core.pojo.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int countByExample(GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int deleteByExample(GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int insert(Good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int insertSelective(Good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    List<Good> selectByExample(GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    Good selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Good record);
}