package com.karl.onlinetaxi.account.service.ex;

import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.ServiceException;

public class UserNotLogin extends ServiceException {
    public UserNotLogin() {
        super();
    }

    public UserNotLogin(String message) {
        super(message);
    }

    public UserNotLogin(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public UserNotLogin(Integer state, String message) {
        super(state, message);
    }

    public UserNotLogin(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotLogin(Throwable cause) {
        super(cause);
    }

    protected UserNotLogin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

