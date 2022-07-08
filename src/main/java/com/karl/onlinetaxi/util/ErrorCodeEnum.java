package com.karl.onlinetaxi.util;

public enum ErrorCodeEnum {

    NOT_LOGIN(300, "用户未登录"),
    AUTH_ERROR(302, "没有权限"),
    PARAM_ERROR(400, "参数错误"),
    BIZ_ERROR(500, "业务异常"),
    BIZ_ERROR_OTHER(501, "业务异常:%s"),
    UNKNOWN_ERROR(600, "未知错误"),

    /**
     * 数据库异常
     */
    UNKNOWN_DB_ERROR(700, "数据库未知错误"),
    INSERT_ERROR(701, "数据库插入错误"),
    UPDATE_ERROR(702, "数据库更新错误"),
    DELETE_ERROR(703, "数据库删除错误"),
    SELECT_ERROR(704, "数据库查询错误"),

    /**
     * 用户中心业务异常
     */
    USER_NOT_FOUND(1000, "用户不存在"),
    PASSWORD_ERROR(1001, "密码错误"),
    REGISTER_ERROR(1002, "注册时发生异常"),
    USERNAME_DUPLICATED(1002, "用户名被占用"),

    /**
     * 商城中心业务异常
     */
    ARTICLE_NOT_EXIST(2000, "文章不存在"),

    /**
     * 洗车中心业务异常
     */
    STOREFRONT_INSERT_ERROR(3000, "门店创建失败"),
    STOREFRONT_NOT_FOUND_ERROR(3001, "门店不存在"),
    WASHORDER_INSERT_ERROR(3002, "洗车订单创建失败")


    ;

    private Integer state;
    private String message;

    ErrorCodeEnum(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
