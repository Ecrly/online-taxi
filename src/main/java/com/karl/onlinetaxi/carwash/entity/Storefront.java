package com.karl.onlinetaxi.carwash.entity;

import com.karl.onlinetaxi.util.BaseEntity;

import java.util.Objects;

public class Storefront extends BaseEntity {

    /**
     * 店铺id
     */
    private Integer sid;

    /**
     * 商户Id
     */
    private Integer uid;

    /**
     * 店铺名
     */
    private String shopName;

    /**
     * 店铺描述
     */
    private String description;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 店铺照片
     */
    private String picture;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 订单状态
     */
    private String state;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Storefront that = (Storefront) o;
        return Objects.equals(sid, that.sid) && Objects.equals(uid, that.uid) && Objects.equals(shopName, that.shopName) && Objects.equals(description, that.description) && Objects.equals(address, that.address) && Objects.equals(picture, that.picture) && Objects.equals(longitude, that.longitude) && Objects.equals(latitude, that.latitude) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sid, uid, shopName, description, address, picture, longitude, latitude, state);
    }

    @Override
    public String toString() {
        return "Storefront{" +
                "sid=" + sid +
                ", uid=" + uid +
                ", shopName='" + shopName + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", picture='" + picture + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", state='" + state + '\'' +
                '}';
    }
}
