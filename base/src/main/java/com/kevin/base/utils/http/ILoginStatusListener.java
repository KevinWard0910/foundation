package com.kevin.base.utils.http;

import java.util.Map;

/**
 * Created by kevin on 2018/11/29.
 * descript：登录状态监听接口
 */

public interface ILoginStatusListener {
    void onLogin(Map<String, String> header);

    void onLogOutByTime();// 超时需要重登

    void onLogOutByUser();// 用户主动退出

    void clearHeader();// 清空登录信息
}
