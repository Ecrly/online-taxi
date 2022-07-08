package com.karl.onlinetaxi.carwash.service;

import com.karl.onlinetaxi.carwash.entity.WashOrder;

import java.util.List;

public interface IWashOrderService {

    /**
     * 插入订单
     * @param washOrder 订单详细信息
     */
    void insertWashOrder(WashOrder washOrder);

    /**
     * 查询订单列表
     * @return 订单列表信息
     */
    List<WashOrder> listWashOrders();

    /**
     * 创建订单
     * @param washOrder 订单详情
     * @param sid 门店id
     */
    void createWashOrder(WashOrder washOrder, Integer sid);
}
