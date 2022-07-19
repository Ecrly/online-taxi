package com.karl.onlinetaxi.account.service.ex;

import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.ServiceException;

public class UserPhoneDuplicatedException extends ServiceException {

    public UserPhoneDuplicatedException() {
        super();
    }

    public UserPhoneDuplicatedException(String message) {
        super(message);
    }

    public UserPhoneDuplicatedException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public UserPhoneDuplicatedException(Integer state, String message) {
        super(state, message);
    }

    public UserPhoneDuplicatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserPhoneDuplicatedException(Throwable cause) {
        super(cause);
    }

    protected UserPhoneDuplicatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
