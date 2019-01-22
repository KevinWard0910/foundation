package com.kevin.handler.framework.viewmodel;

/**
 * Created by kevin on 2018/11/29.
 * descript：包含头部的ViewModel
 */

public class WithHeaderViewModel extends ViewModel implements IWithHeaderViewModel {
    private final HeaderViewModel mHeaderViewModel = HeaderViewModel.createDefaultHeader();//list view的头部

    @Override
    public HeaderViewModel getHeaderViewModel() {
        return null;
    }
}
