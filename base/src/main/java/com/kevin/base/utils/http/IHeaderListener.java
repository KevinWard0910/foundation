package com.kevin.base.utils.http;

/**
 * Created by kevin on 2018/11/29.
 * descript：
 */

import java.util.Map;

/**
 * Called when a response header is received.
 */
public interface IHeaderListener {
    void onHeaderResponse(Map<String, String> header);
}
