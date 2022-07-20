package com.karl.onlinetaxi.carinsurance;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.karl.onlinetaxi.util.BaseEntity;

import java.io.Serializable;
import java.util.Date;

public class InsuranceGoods extends BaseEntity implements Serializable {

    /**
     * 商品id
     */
    private Integer iid;

    /**
     * 商品名称
     */
    private String insuranceName;

    /**
     * 主图（一个url地址）
     */
    private String insurancePicture;

    /**
     * 其他图片（此处格式存疑）
     */
    private String pictures;

    /**
     * 险种
     */
    private String insuranceType;

    /**
     * 保额
     */
    private String insuranceAmount;

    /**
     * 保费
     */
    private String insurancePremium;

    /**
     * 商品价格
     */
    private Double goodsPrice;

    /**
     * 起始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;


    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 商品销量
     */
    private Integer salesVolume;

    /**
     * 商品状态（上架、下架等）
     */
    private String goodsState;

    /**
     * 商品详情
     */
    private String details;

}
