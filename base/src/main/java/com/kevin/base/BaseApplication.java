package com.kevin.base;

import android.support.multidex.MultiDexApplication;

import com.kevin.base.utils.http.ILoginStatusListener;

/**
 * Created by kevin on 2018/11/27.
 * descript：Application 基类
 */

public abstract class BaseApplication extends MultiDexApplication implements ILoginStatusListener {

    @Override
    public void onCreate() {
        super.onCreate();
        BaseFoundation.install(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        BaseFoundation.uninstall();
    }

}
