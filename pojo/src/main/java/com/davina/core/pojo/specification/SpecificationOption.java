package com.davina.core.pojo.specification;

public class SpecificationOption {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.option_name
     *
     * @mbggenerated
     */
    private String optionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.spec_id
     *
     * @mbggenerated
     */
    private Long specId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.orders
     *
     * @mbggenerated
     */
    private Integer orders;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.id
     *
     * @return the value of tb_specification_option.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.id
     *
     * @param id the value for tb_specification_option.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.option_name
     *
     * @return the value of tb_specification_option.option_name
     *
     * @mbggenerated
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.option_name
     *
     * @param optionName the value for tb_specification_option.option_name
     *
     * @mbggenerated
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.spec_id
     *
     * @return the value of tb_specification_option.spec_id
     *
     * @mbggenerated
     */
    public Long getSpecId() {
        return specId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.spec_id
     *
     * @param specId the value for tb_specification_option.spec_id
     *
     * @mbggenerated
     */
    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.orders
     *
     * @return the value of tb_specification_option.orders
     *
     * @mbggenerated
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.orders
     *
     * @param orders the value for tb_specification_option.orders
     *
     * @mbggenerated
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}