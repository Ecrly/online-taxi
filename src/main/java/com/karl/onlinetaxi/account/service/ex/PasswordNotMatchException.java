package com.karl.onlinetaxi.account.service.ex;

import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.ServiceException;

public class PasswordNotMatchException extends ServiceException {
    public PasswordNotMatchException() {
        super();
    }

    public PasswordNotMatchException(String message) {
        super(message);
    }

    public PasswordNotMatchException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public PasswordNotMatchException(Integer state, String message) {
        super(state, message);
    }

    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotMatchException(Throwable cause) {
        super(cause);
    }

    protected PasswordNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
