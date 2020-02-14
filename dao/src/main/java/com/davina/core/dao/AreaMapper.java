package com.davina.core.dao;

import com.davina.core.pojo.address.Area;
import java.util.List;

public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated
     */
    Area selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated
     */
    List<Area> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Area record);
}