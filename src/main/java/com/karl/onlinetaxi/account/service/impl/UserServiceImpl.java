package com.karl.onlinetaxi.account.service.impl;

import com.karl.onlinetaxi.account.entity.User;
import com.karl.onlinetaxi.account.mapper.UserMapper;
import com.karl.onlinetaxi.account.service.IUserService;
import com.karl.onlinetaxi.account.service.ex.PasswordNotMatchException;
import com.karl.onlinetaxi.account.service.ex.UserNotFoundException;
import com.karl.onlinetaxi.account.service.ex.UsernameDuplicatedException;
import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;

/** 用户模块业务层的实现类 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public void reg(User user) {

        //通过user参数来获取传递过来的username
        String username = user.getUserName();
        //调用findByUsername(username) 判断用户是否被注册过
        User result = userMapper.findByUsername(username);

        //判断结果是否为NULL
        if(result != null){
            //抛出异常
            throw  new UsernameDuplicatedException(ErrorCodeEnum.USERNAME_DUPLICATED);
        }

        //密码加密处理的实现:md5算法的形式
        String oldPassword = user.getPassword();
        //获取盐值(随机生成)
        String salt = UUID.randomUUID().toString().toUpperCase();
        user.setSalt(salt);
        String md5Password = getMD5Password(oldPassword,salt);
        user.setPassword(md5Password);

        //补全数据：日志字段信息
        user.setCreatedUser(user.getUserName());
        user.setModifiedUser(user.getUserName());
        Date date = new Date();
        user.setCreatedTime(date);
        user.setModifiedTime(date);

        //执行业务注册功能的实现(rows == 1)
        Integer rows = userMapper.insert(user);
        if(rows != 1){
            throw new InsertException(ErrorCodeEnum.REGISTER_ERROR);
        }

    }

    @Override
    public User login(String username, String password) {

        User result = userMapper.findByUsername(username);

        if(result == null){
            throw new UserNotFoundException(ErrorCodeEnum.NOT_LOGIN);
        }

        String oldPassword = result.getPassword();
        String salt = result.getSalt();
        String newMd5Password = getMD5Password(password,salt);

        if(!oldPassword.equals(newMd5Password)){
            throw new PasswordNotMatchException(ErrorCodeEnum.PASSWORD_ERROR);
        }

        return userMapper.findByUsername(username);
    }

    /** 定义一个md5算法的加密处理 */
    private String getMD5Password(String password,String salt){
        //md5加密算法方法的调用(进行三次加密)
        for(int i=0;i<3;i++){
            password = DigestUtils.md5DigestAsHex((salt+password+salt).getBytes()).toUpperCase();
        }
        return password;
    }
}
