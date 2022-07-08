package com.karl.onlinetaxi.carwash.service.ex;

import com.karl.onlinetaxi.util.ErrorCodeEnum;
import com.karl.onlinetaxi.util.ServiceException;

public class StorefrontNotFoundException extends ServiceException {
    public StorefrontNotFoundException() {
        super();
    }

    public StorefrontNotFoundException(String message) {
        super(message);
    }

    public StorefrontNotFoundException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public StorefrontNotFoundException(Integer state, String message) {
        super(state, message);
    }

    public StorefrontNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorefrontNotFoundException(Throwable cause) {
        super(cause);
    }

    protected StorefrontNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
