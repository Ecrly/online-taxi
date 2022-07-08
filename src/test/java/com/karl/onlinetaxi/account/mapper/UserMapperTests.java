package com.karl.onlinetaxi.account.mapper;

import com.karl.onlinetaxi.OnlineTaxiApplication;
import com.karl.onlinetaxi.account.entity.User;
import com.karl.onlinetaxi.carwash.entity.Storefront;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {OnlineTaxiApplication.class})
@RunWith(SpringRunner.class)
public class UserMapperTests {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("new test 01");
        user.setPassword("123");
        Integer rows = userMapper.insert(user);
        if (rows == 1) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

}
