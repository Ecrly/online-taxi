package com.karl.onlinetaxi.carshop.service;

import com.karl.onlinetaxi.carshop.entity.ShopGoods;

import java.util.List;

public interface IShopGoodsService {

    /**
     * 添加商品
     * @param goods 商品信息
     */
    void insert(ShopGoods goods);

    /**
     * 删除商品
     * @param gid 商品id
     */
    void delete(Integer gid);

    /**
     * 更新商品
     * @param goods 商品信息
     */
    void update(ShopGoods goods);

    /**
     * 列举所有商品
     * @return 商品列表
     */
    List<ShopGoods> listShopGoods();

    /**
     * 查询某商品详细信息
     * @param gid 商品id
     * @return 商品对象即所有信息
     */
    ShopGoods findGoodsByGid(Integer gid);

}
