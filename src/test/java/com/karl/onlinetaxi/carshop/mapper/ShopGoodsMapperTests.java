package com.karl.onlinetaxi.carshop.mapper;

import com.karl.onlinetaxi.OnlineTaxiApplication;
import com.karl.onlinetaxi.carshop.entity.ShopGoods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {OnlineTaxiApplication.class})
@RunWith(SpringRunner.class)
public class ShopGoodsMapperTests {

    @Autowired(required = false)
    ShopGoodsMapper shopGoodsMapper;

    @Test
    public void listShopGoods() {
        List<ShopGoods> shopGoodsList = shopGoodsMapper.listShopGoods();
        if (shopGoodsList == null) {
            System.out.println("fail");
        } else {
            for (ShopGoods shopGoods : shopGoodsList) {
                System.out.println(shopGoods);
            }
        }
    }

}
