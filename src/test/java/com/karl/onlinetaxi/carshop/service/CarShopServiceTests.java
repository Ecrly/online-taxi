package com.karl.onlinetaxi.carshop.service;


import com.karl.onlinetaxi.OnlineTaxiApplication;
import com.karl.onlinetaxi.carshop.entity.CarShop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {OnlineTaxiApplication.class})
@RunWith(SpringRunner.class)
public class CarShopServiceTests {

    @Autowired(required = false)
    ICarShopService carShopService;

    @Test
    public void listCarShops() {
        List<CarShop> carShopList = carShopService.listCarShops();
        if (carShopList == null) {
            System.out.println("fail");
        } else {
            for (CarShop carShop : carShopList) {
                System.out.println(carShop.toString());
            }
        }
    }

}
