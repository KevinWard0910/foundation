package com.kevin.repository.framework.local;

/**
 * Created by kevin on 2018/11/29.
 * descript：本地数据存储
 * 目前只提供sharePreference方式
 */

public interface BaseLocalKey {
    String BASE = "R_";
    String VERSION_CODE = BASE + "version_code";
    String HEADERS = BASE + "headers";
    String X_TOKEN = BASE + "x_token";
    String OPEN_ID = BASE + "x_open_id";
    String FIRST_OPEN = BASE + "first_open";
}
