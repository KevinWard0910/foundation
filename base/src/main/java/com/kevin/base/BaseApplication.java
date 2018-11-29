package com.kevin.base;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

/**
 * Created by FJ on 2018/11/27.
 * descript：
 */

public class BaseApplication extends MultiDexApplication {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static Context getContext(){
        return mContext;
    }
}
