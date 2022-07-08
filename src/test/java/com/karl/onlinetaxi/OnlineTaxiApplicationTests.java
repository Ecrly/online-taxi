package com.karl.onlinetaxi;

import com.karl.onlinetaxi.util.IDGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnlineTaxiApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 测试订单编号生成
     */
    @Test
    void getOrderNum() {
        String orderNum = IDGenerator.getOrderNum(001);
        System.out.println(orderNum);
    }

}
