package com.karl.onlinetaxi.storefront.mapper;

import com.karl.onlinetaxi.carwash.entity.WashOrder;
import com.karl.onlinetaxi.carwash.mapper.WashOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.WrongAdapterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WashOrderMapperTests {

    @Autowired(required = false)
    WashOrderMapper washOrderMapper;

    @Test
    public void insert() {
        Integer sid = 1;
        Integer uid = 1;
        WashOrder washOrder = new WashOrder();
        washOrder.setSid(sid);
        washOrder.setUid(uid);
        Integer rows = washOrderMapper.insert(washOrder);
        if (rows != 1) {
            System.out.println("fail");
        } else {
            System.out.println("success");
        }
    }

    @Test
    public void listWashOrders() {
        List<WashOrder> list = washOrderMapper.listWashOrders();
        if (list == null) {
            System.out.println("fail");
        } else {
            for (WashOrder washOrder : list) {
                System.out.println(washOrder.toString());
            }
        }
    }
}
