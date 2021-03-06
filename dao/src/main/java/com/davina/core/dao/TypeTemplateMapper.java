package com.davina.core.dao;

import com.davina.core.pojo.TypeTemplate;
import com.davina.core.pojo.TypeTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int countByExample(TypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int deleteByExample(TypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int insert(TypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int insertSelective(TypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    List<TypeTemplate> selectByExample(TypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    TypeTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TypeTemplate record, @Param("example") TypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TypeTemplate record, @Param("example") TypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TypeTemplate record);
}