package com.karl.onlinetaxi.util;

public class SelectException extends ServiceException {

    public SelectException() {
        super();
    }

    public SelectException(String message) {
        super(message);
    }

    public SelectException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public SelectException(Integer state, String message) {
        super(state, message);
    }

    public SelectException(String message, Throwable cause) {
        super(message, cause);
    }

    public SelectException(Throwable cause) {
        super(cause);
    }

    protected SelectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
