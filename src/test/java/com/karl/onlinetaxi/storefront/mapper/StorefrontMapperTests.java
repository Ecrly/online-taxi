package com.karl.onlinetaxi.storefront.mapper;

import com.karl.onlinetaxi.OnlineTaxiApplication;
import com.karl.onlinetaxi.carwash.entity.Storefront;
import com.karl.onlinetaxi.carwash.mapper.StorefrontMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest()
@RunWith(SpringRunner.class)
public class StorefrontMapperTests {

    @Autowired(required = false)
    private StorefrontMapper storefrontMapper;

    @Test
    public void insert() {
        Storefront storefront = new Storefront();
        storefront.setUid(1);
        Date date = new Date();
        storefront.setCreatedTime(date);
        Integer rows = storefrontMapper.insert(storefront);
        if (rows == 1) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    @Test
    public void findStorefrontBySid() {
        Integer sid = 1;
        Storefront storefront = storefrontMapper.findStorefrontBySid(sid);
        if (storefront != null) {
            System.out.println(storefront.toString());
        } else {
            System.out.println("fail");
        }
    }

    @Test
    public void listStorefronts() {
        List<Storefront> list = storefrontMapper.listStorefronts();
        if (list.size() != 0) {
            for (Storefront storefront: list) {
                System.out.println(storefront.toString());
            }
        } else {
            System.out.println("fail");
        }
        int n = 10;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {

            }

        }
    }
}
