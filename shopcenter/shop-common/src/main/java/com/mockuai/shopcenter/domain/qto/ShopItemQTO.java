package com.mockuai.shopcenter.domain.qto;

import com.mockuai.shopcenter.page.PageInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ShopItemQTO extends PageInfo implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private Long id;


    private List<Long> idList;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.shop_id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private Long shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.seller_id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private Long sellerId;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.icon_url
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private String iconUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.delete_mark
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private Integer deleteMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.gmt_created
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.gmt_modified
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_item.biz_code
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    private String bizCode;


    private Long itemId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getIdList() {
        return idList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.shop_id
     *
     * @return the value of shop_item.shop_id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.shop_id
     *
     * @param shopId the value for shop_item.shop_id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.seller_id
     *
     * @return the value of shop_item.seller_id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.seller_id
     *
     * @param sellerId the value for shop_item.seller_id
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.icon_url
     *
     * @return the value of shop_item.icon_url
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.icon_url
     *
     * @param iconUrl the value for shop_item.icon_url
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.delete_mark
     *
     * @return the value of shop_item.delete_mark
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.delete_mark
     *
     * @param deleteMark the value for shop_item.delete_mark
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.gmt_created
     *
     * @return the value of shop_item.gmt_created
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.gmt_created
     *
     * @param gmtCreated the value for shop_item.gmt_created
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.gmt_modified
     *
     * @return the value of shop_item.gmt_modified
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.gmt_modified
     *
     * @param gmtModified the value for shop_item.gmt_modified
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_item.biz_code
     *
     * @return the value of shop_item.biz_code
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_item.biz_code
     *
     * @param bizCode the value for shop_item.biz_code
     *
     * @mbggenerated Tue Jan 12 14:54:30 CST 2016
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }
}