package com.karl.onlinetaxi.carshop.controller;

import com.karl.onlinetaxi.carshop.entity.ShopGoods;
import com.karl.onlinetaxi.carshop.service.IShopGoodsService;
import com.karl.onlinetaxi.util.BaseController;
import com.karl.onlinetaxi.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop_goods")
@Api(value = "商城接口", tags = {"商城接口"})
public class ShopGoodsController extends BaseController {

    @Autowired(required = false)
    IShopGoodsService shopGoodsService;


    @ApiOperation("商品列表")
    @GetMapping("")
    public JsonResult<List<ShopGoods>> listGoods(){
        List<ShopGoods> goodsList = shopGoodsService.listShopGoods();
        return new JsonResult<List<ShopGoods>>(200, goodsList);
    }

}
