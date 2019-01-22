package com.kevin.handler.framework;

/**
 * Created by kevin on 2018/11/29.
 * descript：    base activity and base fragment 需要实现的接口
 */

public interface IDataBinding<P, VM, B> {
    boolean isBound();

    P getPresenter();

    VM getViewModel();

    B getBinding();
}
