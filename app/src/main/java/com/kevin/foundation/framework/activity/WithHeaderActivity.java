package com.kevin.foundation.framework.activity;

import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.kevin.handler.framework.presenter.Presenter;
import com.kevin.handler.framework.viewmodel.HeaderViewModel;
import com.kevin.handler.framework.viewmodel.IWithHeaderViewModel;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public abstract class WithHeaderActivity<P extends Presenter<VM> ,VM extends IWithHeaderViewModel,B extends ViewDataBinding>
                                        extends BaseBindingActivity<P,VM,B> {

    /**
     * 创建标题
     * 返回空或者默认的HeaderViewModel不会显示头部，必须设置头部的visible
     *
     * @see HeaderViewModel#setVisible
     */
    protected abstract void initHeader(HeaderViewModel header);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initHeader(getViewModel().getHeaderViewModel());
    }

}
