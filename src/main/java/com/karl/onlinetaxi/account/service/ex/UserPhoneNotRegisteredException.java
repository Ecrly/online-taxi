package com.karl.onlinetaxi.account.service.ex;

import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.ServiceException;

public class UserPhoneNotRegisteredException extends ServiceException {
    public UserPhoneNotRegisteredException() {
        super();
    }

    public UserPhoneNotRegisteredException(String message) {
        super(message);
    }

    public UserPhoneNotRegisteredException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public UserPhoneNotRegisteredException(Integer state, String message) {
        super(state, message);
    }

    public UserPhoneNotRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserPhoneNotRegisteredException(Throwable cause) {
        super(cause);
    }

    protected UserPhoneNotRegisteredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
