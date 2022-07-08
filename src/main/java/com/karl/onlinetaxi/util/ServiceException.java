package com.karl.onlinetaxi.util;

/** 业务层异常的基类: throws new ServiceException("业务层产生未知的异常") */
public class ServiceException extends RuntimeException{

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.state = errorCodeEnum.getState();
    }

    public ServiceException(Integer state, String message) {
        super(message);
        this.state = state;
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
