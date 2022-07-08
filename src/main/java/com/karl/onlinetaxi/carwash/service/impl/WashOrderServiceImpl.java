package com.karl.onlinetaxi.carwash.service.impl;

import com.karl.onlinetaxi.carwash.entity.Storefront;
import com.karl.onlinetaxi.carwash.entity.WashOrder;
import com.karl.onlinetaxi.carwash.mapper.StorefrontMapper;
import com.karl.onlinetaxi.carwash.mapper.WashOrderMapper;
import com.karl.onlinetaxi.carwash.service.IWashOrderService;
import com.karl.onlinetaxi.carwash.service.ex.StorefrontNotFoundException;
import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.InsertException;
import com.karl.onlinetaxi.util.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WashOrderServiceImpl implements IWashOrderService {

    @Autowired(required = false)
    WashOrderMapper washOrderMapper;

    @Autowired(required = false)
    StorefrontMapper storefrontMapper;

    @Override
    public void insertWashOrder(WashOrder washOrder) {
        Date date = new Date();
        washOrder.setCreatedTime(date);
        washOrder.setModifiedTime(date);
        Integer rows = washOrderMapper.insert(washOrder);
        if (rows != 1) {
            throw new InsertException(ErrorCodeEnum.WASHORDER_INSERT_ERROR);
        }
    }

    @Override
    public List<WashOrder> listWashOrders() {
        List<WashOrder> list = washOrderMapper.listWashOrders();
        if (list == null) {
            throw new SelectException(ErrorCodeEnum.SELECT_ERROR);
        }
        return list;
    }

    @Override
    public void createWashOrder(WashOrder washOrder, Integer sid) {
        // 确保店铺存在
        Storefront storefront = storefrontMapper.findStorefrontBySid(sid);
        if (storefront == null) {
            throw new StorefrontNotFoundException(ErrorCodeEnum.STOREFRONT_NOT_FOUND_ERROR);
        }

        // 直接插入订单即可
        insertWashOrder(washOrder);
    }
}
