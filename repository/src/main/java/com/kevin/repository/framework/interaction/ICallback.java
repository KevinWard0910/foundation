package com.kevin.repository.framework.interaction;

import com.kevin.base.utils.http.SimpleBean;

/**
 * Created by kevin on 2018/11/29.
 * descript：所有View和ViewModel，ViewModel和Presenter之间的回调使用这个Callback
 */

public interface ICallback<T> {
    // 操作执行前
    void onBegin(Object tag);

    //操作执行结束
    void onSuccess(T bean);

    //执行出错
    void onFailure(SimpleBean simpleBean);

    //执行出错并取消
    void onError(SimpleBean simpleBean);

    //执行进度
    void onProgress(int progress, int max);
}
