package com.davina.core.dao;

import com.davina.core.pojo.ContentCategory;
import com.davina.core.pojo.ContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int countByExample(ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int deleteByExample(ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int insert(ContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int insertSelective(ContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    List<ContentCategory> selectByExample(ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    ContentCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ContentCategory record);
}