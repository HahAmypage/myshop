package com.davina.core.dao;

import com.davina.core.pojo.SeckillGoods;
import com.davina.core.pojo.SeckillGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int countByExample(SeckillGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int deleteByExample(SeckillGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int insert(SeckillGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int insertSelective(SeckillGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    List<SeckillGoods> selectByExample(SeckillGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    SeckillGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SeckillGoods record, @Param("example") SeckillGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SeckillGoods record, @Param("example") SeckillGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SeckillGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SeckillGoods record);
}