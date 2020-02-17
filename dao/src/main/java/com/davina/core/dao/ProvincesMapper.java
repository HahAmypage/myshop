package com.davina.core.dao;

import com.davina.core.pojo.Provinces;
import com.davina.core.pojo.ProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvincesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int countByExample(ProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int deleteByExample(ProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int insert(Provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int insertSelective(Provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    List<Provinces> selectByExample(ProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    Provinces selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Provinces record);
}