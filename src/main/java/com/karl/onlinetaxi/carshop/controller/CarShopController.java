package com.karl.onlinetaxi.carshop.controller;

import com.karl.onlinetaxi.carshop.entity.CarShop;
import com.karl.onlinetaxi.carshop.entity.ShopGoods;
import com.karl.onlinetaxi.carshop.service.ICarShopService;
import com.karl.onlinetaxi.carshop.service.IShopGoodsService;
import com.karl.onlinetaxi.util.BaseController;
import com.karl.onlinetaxi.util.JsonResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car_shops")
@Api(value = "商城接口", tags = {"商城接口"})
public class CarShopController extends BaseController {

    @Autowired(required = false)
    ICarShopService carShopService;

    @ApiOperation("商城列表")
    @GetMapping("")
    public JsonResult<List<CarShop>> listCarShops(){
        List<CarShop> carShopList = carShopService.listCarShops();
        return new JsonResult<List<CarShop>>(200, carShopList);
    }


}
