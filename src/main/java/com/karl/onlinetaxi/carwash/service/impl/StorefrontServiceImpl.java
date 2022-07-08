package com.karl.onlinetaxi.carwash.service.impl;

import com.karl.onlinetaxi.carwash.entity.Storefront;
import com.karl.onlinetaxi.carwash.mapper.StorefrontMapper;
import com.karl.onlinetaxi.carwash.service.IStorefrontService;
import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.InsertException;
import com.karl.onlinetaxi.util.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StorefrontServiceImpl implements IStorefrontService {

    @Autowired(required = false)
    private StorefrontMapper storefrontMapper;

    @Override
    public void insertStorefront(Storefront storefront) {
        // 补充创建和修改时间
        Date date = new Date();
        storefront.setCreatedTime(date);
        storefront.setModifiedTime(date);

        Integer rows = storefrontMapper.insert(storefront);
        if (rows != 1) {
            throw new InsertException(ErrorCodeEnum.STOREFRONT_INSERT_ERROR);
        }
    }

    @Override
    public List<Storefront> listStorefronts() {
        List<Storefront> list = storefrontMapper.listStorefronts();
        if (list == null) {
            throw new SelectException(ErrorCodeEnum.SELECT_ERROR);
        }
        return list;
    }
}
