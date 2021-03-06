package com.kevin.handler.framework.viewmodel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.kevin.handler.R;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class HtmlViewModel extends WithHeaderViewModel {
    public final static int MAX_PROGRESS = 100;
    private boolean mHtmlWithHeader = false;// html 是否已经包含头部
    private final ObservableBoolean mIsError = new ObservableBoolean(false);//是否加载出错
    private final ObservableField<String> mError = new ObservableField<>();//是否加载出错
    private final ObservableBoolean mIsLoaded = new ObservableBoolean(false);//是否加载完成
    private final ObservableInt mProgress = new ObservableInt(0);//加载进度

    private String mUrl;
    private int loadingResId = R.drawable.h_fw_ic_loading_color;

    public boolean isHtmlWithHeader() {
        return mHtmlWithHeader;
    }

    public void setHtmlWithHeader(boolean htmlWithHeader) {
        mHtmlWithHeader = htmlWithHeader;
    }

    public ObservableInt getProgress() {
        return mProgress;
    }

    public ObservableBoolean getIsError() {
        return mIsError;
    }

    public void setIsError(boolean error) {
        mIsError.set(error);
        if (mHtmlWithHeader){// html 出错需要添加原生的头部，用于返回
            getHeaderViewModel().setVisible(error);
        }
    }

    public ObservableField<String> getError() {
        return mError;
    }

    public void setError(String error) {
        mError.set(error);
    }

    public ObservableBoolean getIsLoaded() {
        return mIsLoaded;
    }

    public void setIsLoaded(boolean isLoaded) {
        mIsLoaded.set(isLoaded);
    }

    public int getLoadingResId() {
        return loadingResId;
    }

    public void setLoadingResId(int loadingResId) {
        this.loadingResId = loadingResId;
    }

    public void setProgress(int progress) {
        mProgress.set(progress);
        setIsLoaded(progress >= MAX_PROGRESS);
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
