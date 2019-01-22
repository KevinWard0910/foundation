package com.kevin.base.utils.http;

/**
 * Created by kevin on 2018/11/29.
 * descript：
 */

public class SimpleBean extends Result<Object> {
    public SimpleBean(String code, String message) {
        super(code, message, null);
    }
}
