package com.kevin.base;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.kevin.base.utils.ActivityUtil;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

/**
 * Created by cody.yi on 2017/4/1.
 * 基础框架
 */
public class BaseFoundation {
    private static BaseFoundation sInstance;
    private Reference<BaseApplication> mAppRef;

    private BaseFoundation(BaseApplication application) {
        mAppRef = new SoftReference<>(application);
    }

    private static BaseFoundation getInstance() {
        if (sInstance == null) {
            throw new NullPointerException("You should call Foundation.install() in you application first!");
        } else {
            return sInstance;
        }
    }

    public static void install(BaseApplication application) {
        sInstance = new BaseFoundation(application);
        ActivityUtil.install();
    }

    public static void uninstall() {
        sInstance = null;
        ActivityUtil.uninstall();
    }

    /**
     * 获取系统上下文
     *
     * @return 系统上下文
     */
    public static BaseApplication getApp() {
        return getInstance().getXFApp();
    }

    /**
     * 获取系统上下文
     *
     * @return 系统上下文
     */
    public static Context getContext() {
        return getInstance().getXFApp().getApplicationContext();
    }

    private BaseApplication getXFApp() {
        if (mAppRef == null || mAppRef.get() == null) {
            throw new NullPointerException("You should call Foundation.install() in you application first!");
        } else {
            return mAppRef.get();
        }
    }

}
