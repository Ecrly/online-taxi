package com.karl.onlinetaxi.carrepair.entity;

import com.karl.onlinetaxi.util.BaseEntity;

import java.io.Serializable;

public class RepairOrder extends BaseEntity implements Serializable {

    Integer oid;

    Integer uid;

    String username;

    String phoneNumber;

    String address;

    /**
     * 行驶证
     */
    String drivingPermit;

    /**
     * 驾驶证
     */
    String drivingLicense;

    /**
     * 车辆归属
     */
    String ownership;

    /**
     * 是否有责任
     */
    Boolean responsible;

    /**
     * 是否授权赔款
     */
    Boolean compensated;

    /**
     * 受损凭证
     */
    String damagedVoucher;

    /**
     * 是否有保险报案单号
     */
    Boolean hasInsuranceReport;

    /**
     * 现场是否处理完成
     */
    Boolean onSiteProcessed;

}
