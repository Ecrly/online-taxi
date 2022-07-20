package com.karl.onlinetaxi.carshop.service.impl;

import com.karl.onlinetaxi.carshop.entity.CarShop;
import com.karl.onlinetaxi.carshop.mapper.CarShopMapper;
import com.karl.onlinetaxi.carshop.service.ICarShopService;
import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarShopServiceImpl implements ICarShopService {

    @Autowired(required = false)
    private CarShopMapper carShopMapper;

    @Override
    public List<CarShop> listCarShops() {
        List<CarShop> carShopList = carShopMapper.listCarShops();
        if (carShopList == null) {
            throw new SelectException(ErrorCodeEnum.SELECT_ERROR);
        }
        return carShopList;
    }
}
