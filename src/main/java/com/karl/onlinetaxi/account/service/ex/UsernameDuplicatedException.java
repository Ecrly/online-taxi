package com.karl.onlinetaxi.account.service.ex;

import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.ServiceException;

public class UsernameDuplicatedException extends ServiceException {
    public UsernameDuplicatedException() {
        super();
    }

    public UsernameDuplicatedException(String message) {
        super(message);
    }

    public UsernameDuplicatedException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public UsernameDuplicatedException(Integer state, String message) {
        super(state, message);
    }

    public UsernameDuplicatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameDuplicatedException(Throwable cause) {
        super(cause);
    }

    protected UsernameDuplicatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
