package com.kevin.handler.framework;

import com.kevin.base.utils.http.SimpleBean;

/**
 * Created by kevin on 2018/11/29.
 * descript：base activity and base fragment 需要实现的接口
 */

public interface IView {
    /**
     * update view 不要做耗时操作
     */
    void onUpdate(Object... args);

    /**
     * show loading message
     *
     * @param msg 需要显示的消息：正在加载。。。
     */
    void showLoading(String msg);

    /**
     * hide loading
     */
    void hideLoading();

    /**
     * 弹出消息 一般onFailure调用，需要用户知道的错误
     */
    void showFailure(SimpleBean msg);

    /**
     * 出错，一般只记录，只打log，用户不用关心的错误
     */
    void showError(SimpleBean msg);

    /**
     * show Progress
     */
    void onProgress(int progress, int max);

}
