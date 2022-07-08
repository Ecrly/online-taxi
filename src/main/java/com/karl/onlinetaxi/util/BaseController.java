package com.karl.onlinetaxi.util;

import com.karl.onlinetaxi.account.service.ex.UserNotLogin;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

/** 控制层类的基类 */
public class BaseController {
    //操作成功状态码
    public static final int OK = 200;

    //请求处理方法，这个方法的返回值就是需要传递给前端的数据
    //自动将异常对象传递给此方法的参数列表上

    /**
     * 处理自定义的Service层异常
     * @param e ServiceException
     * @return
     */
    @ExceptionHandler(ServiceException.class)//用于统一处理抛出的异常
    public JsonResult<Void> ServiceExceptionHandler(ServiceException e){
        JsonResult<Void> result = new JsonResult<>(e);
        result.setState(e.getState());
        result.setMessage(e.getMessage());
        return result;
    }

    @ExceptionHandler(Exception.class)
    public JsonResult<Void> ExceptionHandler(Exception e) {
        JsonResult<Void> result = new JsonResult<>(e);
        result.setState(6000);
        result.setMessage(e.getMessage());
        return result;
    }

    /**
     * 获取session对象中的uid
     * @param session session对象
     * @return 当前登录的用户的uid的值
     */
    protected final Integer getuidFromSession(HttpSession session){
        try {
            Integer uid = Integer.valueOf(session.getAttribute("uid").toString());
            return uid;
        } catch (Exception e) {
            throw new UserNotLogin();
        }
    }

    /**
     * 获取当前登录用户的username
     * @param session session对象
     * @return 当前登录用户的用户名
     */
    protected final String getUsernameFromSession(HttpSession session){
        try {
            String username = session.getAttribute("username").toString();
            System.out.println(username);
            return username;
        } catch (Exception e) {
            throw new UserNotLogin();
        }
    }
}

