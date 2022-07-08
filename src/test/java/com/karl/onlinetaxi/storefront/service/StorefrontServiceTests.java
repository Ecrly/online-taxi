package com.karl.onlinetaxi.storefront.service;

import com.karl.onlinetaxi.carwash.entity.Storefront;
import com.karl.onlinetaxi.carwash.service.impl.StorefrontServiceImpl;
import com.karl.onlinetaxi.util.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StorefrontServiceTests {

    @Autowired(required = false)
    StorefrontServiceImpl storefrontService;

    @Test
    public void insert() {
        Storefront storefront = new Storefront();
        storefront.setShopName("test store name");
        Integer uid = 1;
        storefront.setUid(uid);
        try {
            storefrontService.insertStorefront(storefront);
            System.out.println("success");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void listStorefront() {
        try {
            List<Storefront> list = storefrontService.listStorefronts();
            for (Storefront storefront : list) {
                System.out.println(storefront.toString());
            }
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }

    }

}
