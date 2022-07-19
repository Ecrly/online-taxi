package com.karl.onlinetaxi.util;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ShopBaseEntity extends BaseEntity implements Serializable {
    /**
     * 店铺id
     */
    @ApiModelProperty(hidden = true)
    private Integer sid;

    /**
     * 商户Id
     */
    @ApiModelProperty(hidden = true)
    private Integer uid;

    /**
     * 店铺名
     */
    @ApiModelProperty(value = "店铺名")
    private String shopName;

    /**
     * 店铺描述
     */
    @ApiModelProperty(value = "店铺描述信息")
    private String description;

    /**
     * 店铺地址
     */
    @ApiModelProperty(value = "店铺地址")
    private String address;

    /**
     * 店铺照片
     */
    @ApiModelProperty(value = "店铺照片")
    private String picture;

    /**
     * 营业执照
     */
    @ApiModelProperty(hidden = true)
    private String license;

    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private Double longitude;

    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private Double latitude;

    /**
     * 店铺状态
     */
    @ApiModelProperty(hidden = true)
    private String state;

    /**
     * 店铺评分
     */
    @ApiModelProperty(value = "店铺评分")
    private  Double shopScore;

    @ApiModelProperty(value = "营业时间-开始")
    private Date startTime;


    @ApiModelProperty(value = "营业时间-结束")
    private Date endTime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getShopScore() {
        return shopScore;
    }

    public void setShopScore(Double shopScore) {
        this.shopScore = shopScore;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShopBaseEntity that = (ShopBaseEntity) o;
        return Objects.equals(sid, that.sid) && Objects.equals(uid, that.uid) && Objects.equals(shopName, that.shopName) && Objects.equals(description, that.description) && Objects.equals(address, that.address) && Objects.equals(picture, that.picture) && Objects.equals(license, that.license) && Objects.equals(longitude, that.longitude) && Objects.equals(latitude, that.latitude) && Objects.equals(state, that.state) && Objects.equals(shopScore, that.shopScore) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sid, uid, shopName, description, address, picture, license, longitude, latitude, state, shopScore, startTime, endTime);
    }

    @Override
    public String toString() {
        return "ShopBaseEntity{" +
                "sid=" + sid +
                ", uid=" + uid +
                ", shopName='" + shopName + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", picture='" + picture + '\'' +
                ", license='" + license + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", state='" + state + '\'' +
                ", shopScore=" + shopScore +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                "} " + super.toString();
    }
}
