package com.karl.onlinetaxi.carwash.controller;

import com.karl.onlinetaxi.carwash.entity.WashOrder;
import com.karl.onlinetaxi.carwash.service.IWashOrderService;
import com.karl.onlinetaxi.carwash.service.impl.WashOrderServiceImpl;
import com.karl.onlinetaxi.util.BaseController;
import com.karl.onlinetaxi.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("wash_orders")
public class WashOrderController extends BaseController {

    @Autowired
    private WashOrderServiceImpl washOrderService;

    @GetMapping("")
    public JsonResult<List<WashOrder>> listGoods(){
        List<WashOrder> goodsList = washOrderService.listWashOrders();
        return new JsonResult<List<WashOrder>>(200, goodsList);
    }

    @PostMapping("")
    public JsonResult<Void> addGoods(WashOrder washOrder, HttpSession session) {

        // 补充操作用户
        String username = getUsernameFromSession(session);
        washOrder.setCreatedUser(username);
        washOrder.setModifiedUser(username);

        washOrderService.insertWashOrder(washOrder);
        return new JsonResult<Void>(200);
    }
}
