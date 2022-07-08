package com.karl.onlinetaxi.storefront.service;

import com.karl.onlinetaxi.carwash.entity.WashOrder;
import com.karl.onlinetaxi.carwash.service.impl.WashOrderServiceImpl;
import com.karl.onlinetaxi.util.ServiceException;
import com.karl.onlinetaxi.util.UpdateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WashOrderServiceTests {

    @Autowired(required = false)
    WashOrderServiceImpl washOrderService;

    @Test
    public void insert() {
        try {
            WashOrder washOrder = new WashOrder();
            Integer sid = 1;
            Integer uid = 1;
            washOrder.setSid(sid);
            washOrder.setUid(uid);
            washOrderService.insertWashOrder(washOrder);
        } catch (UpdateException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void listWashOrders() {
        try {
            List<WashOrder> list = washOrderService.listWashOrders();
            for (WashOrder washOrder : list) {
                System.out.println(washOrder.toString());
            }
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

}
