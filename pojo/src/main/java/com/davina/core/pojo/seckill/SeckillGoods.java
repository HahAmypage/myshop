package com.davina.core.pojo.seckill;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SeckillGoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.goods_id
     *
     * @mbggenerated
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.item_id
     *
     * @mbggenerated
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.small_pic
     *
     * @mbggenerated
     */
    private String smallPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.cost_price
     *
     * @mbggenerated
     */
    private BigDecimal costPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.seller_id
     *
     * @mbggenerated
     */
    private String sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.check_time
     *
     * @mbggenerated
     */
    private Date checkTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.num
     *
     * @mbggenerated
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.stock_count
     *
     * @mbggenerated
     */
    private Integer stockCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_goods.introduction
     *
     * @mbggenerated
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.id
     *
     * @return the value of tb_seckill_goods.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.id
     *
     * @param id the value for tb_seckill_goods.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.goods_id
     *
     * @return the value of tb_seckill_goods.goods_id
     *
     * @mbggenerated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.goods_id
     *
     * @param goodsId the value for tb_seckill_goods.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.item_id
     *
     * @return the value of tb_seckill_goods.item_id
     *
     * @mbggenerated
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.item_id
     *
     * @param itemId the value for tb_seckill_goods.item_id
     *
     * @mbggenerated
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.title
     *
     * @return the value of tb_seckill_goods.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.title
     *
     * @param title the value for tb_seckill_goods.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.small_pic
     *
     * @return the value of tb_seckill_goods.small_pic
     *
     * @mbggenerated
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.small_pic
     *
     * @param smallPic the value for tb_seckill_goods.small_pic
     *
     * @mbggenerated
     */
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic == null ? null : smallPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.price
     *
     * @return the value of tb_seckill_goods.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.price
     *
     * @param price the value for tb_seckill_goods.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.cost_price
     *
     * @return the value of tb_seckill_goods.cost_price
     *
     * @mbggenerated
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.cost_price
     *
     * @param costPrice the value for tb_seckill_goods.cost_price
     *
     * @mbggenerated
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.seller_id
     *
     * @return the value of tb_seckill_goods.seller_id
     *
     * @mbggenerated
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.seller_id
     *
     * @param sellerId the value for tb_seckill_goods.seller_id
     *
     * @mbggenerated
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.create_time
     *
     * @return the value of tb_seckill_goods.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.create_time
     *
     * @param createTime the value for tb_seckill_goods.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.check_time
     *
     * @return the value of tb_seckill_goods.check_time
     *
     * @mbggenerated
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.check_time
     *
     * @param checkTime the value for tb_seckill_goods.check_time
     *
     * @mbggenerated
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.status
     *
     * @return the value of tb_seckill_goods.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.status
     *
     * @param status the value for tb_seckill_goods.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.start_time
     *
     * @return the value of tb_seckill_goods.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.start_time
     *
     * @param startTime the value for tb_seckill_goods.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.end_time
     *
     * @return the value of tb_seckill_goods.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.end_time
     *
     * @param endTime the value for tb_seckill_goods.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.num
     *
     * @return the value of tb_seckill_goods.num
     *
     * @mbggenerated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.num
     *
     * @param num the value for tb_seckill_goods.num
     *
     * @mbggenerated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.stock_count
     *
     * @return the value of tb_seckill_goods.stock_count
     *
     * @mbggenerated
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.stock_count
     *
     * @param stockCount the value for tb_seckill_goods.stock_count
     *
     * @mbggenerated
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_goods.introduction
     *
     * @return the value of tb_seckill_goods.introduction
     *
     * @mbggenerated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_goods.introduction
     *
     * @param introduction the value for tb_seckill_goods.introduction
     *
     * @mbggenerated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}