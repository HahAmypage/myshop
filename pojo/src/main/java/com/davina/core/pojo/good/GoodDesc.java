package com.davina.core.pojo.good;

import java.io.Serializable;

public class GoodDesc implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.goods_id
     *
     * @mbggenerated
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.specification_items
     *
     * @mbggenerated
     */
    private String specificationItems;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.custom_attribute_items
     *
     * @mbggenerated
     */
    private String customAttributeItems;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.item_images
     *
     * @mbggenerated
     */
    private String itemImages;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.package_list
     *
     * @mbggenerated
     */
    private String packageList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods_desc.sale_service
     *
     * @mbggenerated
     */
    private String saleService;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.goods_id
     *
     * @return the value of tb_goods_desc.goods_id
     *
     * @mbggenerated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.goods_id
     *
     * @param goodsId the value for tb_goods_desc.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.introduction
     *
     * @return the value of tb_goods_desc.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.introduction
     *
     * @param introduction the value for tb_goods_desc.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.specification_items
     *
     * @return the value of tb_goods_desc.specification_items
     *
     * @mbggenerated
     */
    public String getSpecificationItems() {
        return specificationItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.specification_items
     *
     * @param specificationItems the value for tb_goods_desc.specification_items
     *
     * @mbggenerated
     */
    public void setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems == null ? null : specificationItems.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.custom_attribute_items
     *
     * @return the value of tb_goods_desc.custom_attribute_items
     *
     * @mbggenerated
     */
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.custom_attribute_items
     *
     * @param customAttributeItems the value for tb_goods_desc.custom_attribute_items
     *
     * @mbggenerated
     */
    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems == null ? null : customAttributeItems.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.item_images
     *
     * @return the value of tb_goods_desc.item_images
     *
     * @mbggenerated
     */
    public String getItemImages() {
        return itemImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.item_images
     *
     * @param itemImages the value for tb_goods_desc.item_images
     *
     * @mbggenerated
     */
    public void setItemImages(String itemImages) {
        this.itemImages = itemImages == null ? null : itemImages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.package_list
     *
     * @return the value of tb_goods_desc.package_list
     *
     * @mbggenerated
     */
    public String getPackageList() {
        return packageList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.package_list
     *
     * @param packageList the value for tb_goods_desc.package_list
     *
     * @mbggenerated
     */
    public void setPackageList(String packageList) {
        this.packageList = packageList == null ? null : packageList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods_desc.sale_service
     *
     * @return the value of tb_goods_desc.sale_service
     *
     * @mbggenerated
     */
    public String getSaleService() {
        return saleService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods_desc.sale_service
     *
     * @param saleService the value for tb_goods_desc.sale_service
     *
     * @mbggenerated
     */
    public void setSaleService(String saleService) {
        this.saleService = saleService == null ? null : saleService.trim();
    }
}