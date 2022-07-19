package com.karl.onlinetaxi.carshop.controller;

import com.karl.onlinetaxi.carshop.entity.ShopGoods;
import com.karl.onlinetaxi.carshop.service.IShopGoodsService;
import com.karl.onlinetaxi.util.BaseController;
import com.karl.onlinetaxi.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop_goods")
public class ShopGoodsController extends BaseController {

    @Autowired(required = false)
    IShopGoodsService shopGoodsService;

    @GetMapping("")
    public JsonResult<List<ShopGoods>> listGoods(){
        List<ShopGoods> goodsList = shopGoodsService.listGoods();
        return new JsonResult<List<ShopGoods>>(200, goodsList);
    }

}
