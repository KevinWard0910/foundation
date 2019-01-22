package com.kevin.foundation.kevin.main;


import android.os.Bundle;
import android.view.View;

import com.kevin.foundation.R;
import com.kevin.foundation.databinding.ActivityMainBinding;
import com.kevin.foundation.framework.activity.BaseBindingActivity;
import com.kevin.handler.business.presenter.DefaultPresenter;
import com.kevin.handler.business.viewmodel.DefaultViewModel;

public class MainActivity extends BaseBindingActivity<DefaultPresenter,DefaultViewModel,ActivityMainBinding> {

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected DefaultPresenter buildPresenter() {
        return null;
    }

    @Override
    protected DefaultViewModel buildViewModel(Bundle savedInstanceState) {
        return null;
    }

    @Override
    public void onClick(View view) {

    }
}