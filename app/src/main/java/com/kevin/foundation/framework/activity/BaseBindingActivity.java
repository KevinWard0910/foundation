package com.kevin.foundation.framework.activity;

import android.content.DialogInterface;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;

import com.kevin.foundation.BR;
import com.kevin.handler.framework.IDataBinding;
import com.kevin.handler.framework.presenter.Presenter;
import com.kevin.handler.framework.viewmodel.IViewModel;

/**
 * Created by kevin on 2018/11/29.
 * descript：
 */

public abstract class BaseBindingActivity<P extends Presenter<VM>, VM extends IViewModel, B extends ViewDataBinding>
        extends BaseActivity implements View.OnClickListener, IDataBinding<P, VM, B> {

    private P mPresenter;
    private VM mViewModel;
    private B mBinding;

    /**
     * 子类提供有binding的资源ID
     */
    @LayoutRes
    protected abstract int getLayoutID();

    /**
     * 每个view保证只有一个Presenter
     */
    protected abstract P buildPresenter();

    /**
     * 每个view保证只有一个ViewModel，当包含其他ViewModel时使用根ViewModel包含子ViewModel
     * ViewModel可以在创建的时候进行初始化，也可以在正在进行绑定（#setBinding）的时候初始化
     */
    protected abstract VM buildViewModel(Bundle savedInstanceState);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 绑定view
         */
        mBinding = DataBindingUtil.setContentView(this, getLayoutID());
        mViewModel = buildViewModel(savedInstanceState);
        mPresenter = buildPresenter();

        if (mBinding != null && mViewModel != null) {
            mBinding.setVariable(BR.viewModel, mViewModel);
            mBinding.setVariable(BR.onClickListener, mViewModel);
        } else {
            setContentView(getLayoutID());
        }
        if (mPresenter != null)
            mPresenter.attachView(this, mViewModel);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.cancel(TAG);
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    public void onUpdate(Object... args) {
        super.onUpdate(args);
        if (mBinding != null && mViewModel != null) {
            mBinding.setVariable(BR.viewModel, mViewModel);
        }
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        if (mPresenter != null) {
            mPresenter.cancel(TAG);
        }
    }

    @Override
    public VM getViewModel() {
        if (mViewModel == null) {
            throw new NullPointerException("You should setViewModel first!");
        }
        return mViewModel;
    }

    @Override
    public B getBinding() {
        if (mBinding == null) {
            throw new NullPointerException("You should setBinding first!");
        }
        return mBinding;
    }

    @Override
    public P getPresenter() {
        if (this.mPresenter == null) {
            throw new NullPointerException("You should createPresenter first!");
        }
        return mPresenter;
    }

    /**
     * 是否已经设置bind
     */
    @Override
    public boolean isBound() {
        return mBinding != null;
    }

}
