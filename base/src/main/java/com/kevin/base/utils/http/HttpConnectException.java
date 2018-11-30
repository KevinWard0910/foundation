package com.kevin.base.utils.http;

/**
 * Created by kevin on 2018/11/29.
 * descript：
 */

public class HttpConnectException extends RuntimeException {
    private String mCode;
    private String mMessage;

    public HttpConnectException() {
        super();
    }

    public HttpConnectException(String message) {
        super(message);
        this.mMessage = mMessage;
    }

    public HttpConnectException(String code, String message) {
        super(message);
        this.mCode = code;
        this.mMessage = message;
    }

    public String getCode() {
        return mCode;
    }

    public String getMessage() {
        return mMessage;
    }
}
