package com.karl.onlinetaxi.carshop.service.impl;

import com.karl.onlinetaxi.carshop.entity.ShopGoods;
import com.karl.onlinetaxi.carshop.mapper.ShopGoodsMapper;
import com.karl.onlinetaxi.carshop.service.IShopGoodsService;
import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.InsertException;
import com.karl.onlinetaxi.util.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShopGoodsServiceImpl implements IShopGoodsService {

    @Autowired(required = false)
    private ShopGoodsMapper goodsMapper;

    @Override
    public void insert(ShopGoods goods) {
        // 补充创建时间和修改时间
        Date now = new Date();
        goods.setModifiedTime(now);
        goods.setCreatedTime(now);

        Integer rows = goodsMapper.insert(goods);
        if (rows != 1) {
            throw new InsertException("商品插入失败");
        }
    }

    @Override
    public void delete(Integer gid) {

    }

    @Override
    public void update(ShopGoods goods) {


    }

    @Override
    public List<ShopGoods> listShopGoods() {
        List<ShopGoods> goodsList = goodsMapper.listShopGoods();
        if (goodsList == null) {
            throw new SelectException(ErrorCodeEnum.SELECT_ERROR);
        }
        return goodsList;
    }

    @Override
    public ShopGoods findGoodsByGid(Integer gid) {
        return null;
    }
}
