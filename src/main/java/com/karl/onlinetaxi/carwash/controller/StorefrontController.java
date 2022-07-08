package com.karl.onlinetaxi.carwash.controller;

import com.karl.onlinetaxi.carwash.entity.Storefront;
import com.karl.onlinetaxi.carwash.service.impl.StorefrontServiceImpl;
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
@RequestMapping("/storefronts")
public class StorefrontController extends BaseController {

    @Autowired
    StorefrontServiceImpl storefrontService;

    @GetMapping()
    public JsonResult<List<Storefront>> listGoods(){
        List<Storefront> goodsList = storefrontService.listStorefronts();
        return new JsonResult<List<Storefront>>(200, goodsList);
    }

    @PostMapping("")
    public JsonResult<Void> addStorefronts(Storefront storefront, HttpSession session) {

        // 补充操作用户
        String username = getUsernameFromSession(session);
        storefront.setCreatedUser(username);
        storefront.setModifiedUser(username);

        storefrontService.insertStorefront(storefront);
        return new JsonResult<Void>(200);
    }

}
