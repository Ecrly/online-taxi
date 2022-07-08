package com.karl.onlinetaxi.carwash.mapper;

import com.karl.onlinetaxi.carwash.entity.WashOrder;

import java.util.List;

public interface WashOrderMapper {

    /**
     * 插入订单
     * @param washOrder 订单详情
     * @return 影响条目
     */
    Integer insert(WashOrder washOrder);

    /**
     * 查询订单列表
     * @return 订单列表
     */
    List<WashOrder> listWashOrders();

}
