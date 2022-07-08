package com.karl.onlinetaxi.carwash.mapper;


import com.karl.onlinetaxi.carwash.entity.Storefront;

import java.util.List;

public interface StorefrontMapper {

    /**
     * 插入店铺
     * @param storefront 店铺详细信息
     * @return 受影响行数
     */
    Integer insert(Storefront storefront);

    /**
     * 根据id寻找店铺
     * @param sid 店铺id
     * @return 店铺具体信息
     */
    Storefront findStorefrontBySid(Integer sid);

    /**
     * 查询店铺列表
     * @return 店铺列表
     */
    List<Storefront> listStorefronts();

}
