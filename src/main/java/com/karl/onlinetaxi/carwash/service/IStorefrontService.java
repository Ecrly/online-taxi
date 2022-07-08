package com.karl.onlinetaxi.carwash.service;

import com.karl.onlinetaxi.carwash.entity.Storefront;

import java.util.List;

public interface IStorefrontService {

    /**
     * 新增门店
     * @param storefront 门店信息
     */
    void insertStorefront(Storefront storefront);

    /**
     * 查询所有门店
     * @return 门店列表
     */
    List<Storefront> listStorefronts();

}
