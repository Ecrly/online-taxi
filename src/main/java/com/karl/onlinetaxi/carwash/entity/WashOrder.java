package com.karl.onlinetaxi.carwash.entity;

import com.karl.onlinetaxi.util.BaseEntity;

import java.util.Date;
import java.util.Objects;

public class WashOrder extends BaseEntity {

    /**
     * 订单Id
     */
    private Integer oid;

    /**
     * 下单用户id
     */
    private Integer uid;

    /**
     * 下单门店id
     */
    private Integer sid;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 用户手机号，用于通知
     */
    private String userPhone;

    /**
     * 用户名
     */
    private String username;

    /**
     * 车类型
     */
    private String carType;

    /**
     * 车照片
     */
    private String carPicture;

    /**
     * 订单金额
     */
    private Double price;

    /**
     * 订单状态
     */
    private String state;

    /**
     * 洗车工
     */
    private String worker;

    /**
     * 立即服务or预约
     */
    private String washType;

    /**
     * 预约时间
     */
    private Date appointment;

    /**
     * 备注
     */
    private String remarks;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarPicture() {
        return carPicture;
    }

    public void setCarPicture(String carPicture) {
        this.carPicture = carPicture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getWashType() {
        return washType;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WashOrder washOrder = (WashOrder) o;
        return Objects.equals(oid, washOrder.oid) && Objects.equals(uid, washOrder.uid) && Objects.equals(sid, washOrder.sid) && Objects.equals(orderNumber, washOrder.orderNumber) && Objects.equals(userPhone, washOrder.userPhone) && Objects.equals(username, washOrder.username) && Objects.equals(carType, washOrder.carType) && Objects.equals(carPicture, washOrder.carPicture) && Objects.equals(price, washOrder.price) && Objects.equals(state, washOrder.state) && Objects.equals(worker, washOrder.worker) && Objects.equals(washType, washOrder.washType) && Objects.equals(appointment, washOrder.appointment) && Objects.equals(remarks, washOrder.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), oid, uid, sid, orderNumber, userPhone, username, carType, carPicture, price, state, worker, washType, appointment, remarks);
    }

    @Override
    public String toString() {
        return "WashOrder{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", sid=" + sid +
                ", orderNumber='" + orderNumber + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", username='" + username + '\'' +
                ", carType='" + carType + '\'' +
                ", carPicture='" + carPicture + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", worker='" + worker + '\'' +
                ", washType='" + washType + '\'' +
                ", appointment=" + appointment +
                ", remarks='" + remarks + '\'' +
                '}';
    }

}
