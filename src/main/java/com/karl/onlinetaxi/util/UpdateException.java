package com.karl.onlinetaxi.util;

public class UpdateException extends ServiceException {
    public UpdateException() {
        super();
    }

    public UpdateException(String message) {
        super(message);
    }

    public UpdateException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public UpdateException(Integer state, String message) {
        super(state, message);
    }

    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateException(Throwable cause) {
        super(cause);
    }

    protected UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
