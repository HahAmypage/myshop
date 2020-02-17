package com.davina.core.dao;

import com.davina.core.pojo.GoodDesc;
import com.davina.core.pojo.GoodDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int countByExample(GoodDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int deleteByExample(GoodDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int insert(GoodDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int insertSelective(GoodDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    List<GoodDesc> selectByExample(GoodDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    GoodDesc selectByPrimaryKey(Long goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GoodDesc record, @Param("example") GoodDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GoodDesc record, @Param("example") GoodDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodDesc record);
}