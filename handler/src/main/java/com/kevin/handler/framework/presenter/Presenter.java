package com.kevin.handler.framework.presenter;

import com.kevin.base.utils.HttpUtil;
import com.kevin.handler.framework.IView;
import com.kevin.handler.framework.viewmodel.IViewModel;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by kevin on 2018/11/29.
 * descript：
 */

public class Presenter<VM extends IViewModel> implements IPresenter<VM>{
    private Reference<IView> mViewRef;
    private Reference<VM> mViewModelRef;

    @Override
    public void cancel(Object tag) {
        HttpUtil.cancel(tag);
    }

    @Override
    public void attachView(IView view, VM viewModel) {
        mViewRef = new WeakReference<>(view);
        mViewModelRef = new WeakReference<>(viewModel);
    }

    @Override
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    @Override
    public IView getView() {
        if (isViewAttached()) {
            return mViewRef.get();
        }
        return null;
    }

    @Override
    public VM getViewModel() {
        if (isViewAttached()) {
            return mViewModelRef.get();
        }
        return null;
    }

    /**
     * 刷新界面，并不是必须调用的，如果ViewModel不是observable变量需要调用强制刷新，否则不需要调用，框架会自动刷新
     */
    @Override
    public void refreshUI(Object... args) {
        if (isViewAttached()) {
            mViewRef.get().onUpdate(args);
        }
    }

    @Override
    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }
}
