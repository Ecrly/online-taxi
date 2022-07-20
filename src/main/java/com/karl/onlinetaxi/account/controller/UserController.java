package com.karl.onlinetaxi.account.controller;


import com.karl.onlinetaxi.account.entity.User;
import com.karl.onlinetaxi.account.service.IUserService;
import com.karl.onlinetaxi.util.BaseController;
import com.karl.onlinetaxi.util.JsonResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("users")
@Api(value = "用户接口", tags = {"用户接口"})
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;


    @ApiOperation(value = "用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userPhone", value="手机号", required=true, dataType = "String"),
            @ApiImplicitParam(name="password", value="密码", required=true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 1002, message = "注册异常"),
            @ApiResponse(code = 1005, message = "手机号已经被注册")
    })
    @PostMapping("reg")
    public JsonResult<Void> reg(User user){
        userService.reg(user);
        return new JsonResult<>(OK);
    }


    @ApiOperation("用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userPhone", value="手机号", required=true, dataType = "String"),
            @ApiImplicitParam(name="password", value="密码", required=true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 1001, message = "密码错误"),
            @ApiResponse(code = 1004, message = "手机号未注册")
    })
    @PostMapping("login")
    public JsonResult<Void> login(String userPhone, String password, @ApiIgnore HttpSession session){
        User data = userService.loginByUserPhone(userPhone, password);
        //向session对象中完成数据的绑定
        session.setAttribute("uid",data.getUid());
        session.setAttribute("userPhone",data.getUserPhone());
        //获取session中的绑定的数据
        System.out.println(getuidFromSession(session));
        System.out.println(session.getAttribute("userPhone"));
        System.out.println(getUsernameFromSession(session));

        return new JsonResult<Void>(OK);
    }

    /*
    @RequestMapping("reg")
    public JsonResult<Void> reg(User user){
        //创建响应结果对象
        JsonResult<Void> result = new JsonResult<>();
        try {
            userService.reg(user);
            result.setState(200);
            result.setMessage("用户注册成功");
        }catch (UsernameDuplicatedException e){
            result.setState(4000);
            result.setMessage("用户名被占用");
        }catch (InsertException e){
            result.setState(5000);
            result.setMessage("注册时产生未知的异常");
        }
        return result;
    }*/
}

