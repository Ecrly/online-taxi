package com.karl.onlinetaxi.util;

public class DeleteException extends ServiceException {
    public DeleteException() {
        super();
    }

    public DeleteException(String message) {
        super(message);
    }

    public DeleteException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public DeleteException(Integer state, String message) {
        super(state, message);
    }

    public DeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteException(Throwable cause) {
        super(cause);
    }

    protected DeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
