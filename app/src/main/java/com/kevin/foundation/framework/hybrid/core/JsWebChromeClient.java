package com.kevin.foundation.framework.hybrid.core;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.kevin.base.utils.LogUtil;
import com.kevin.foundation.framework.hybrid.JsBridge;
import com.kevin.handler.framework.viewmodel.HtmlViewModel;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class JsWebChromeClient extends WebChromeClient {
    private HtmlViewModel mViewModel;

    public JsWebChromeClient(HtmlViewModel mViewModel) {
        this.mViewModel = mViewModel;
    }

//    处理prompt弹出框
    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        result.confirm();
        JsBridge.callNative(view,message);
        LogUtil.d(message);
        return true;
    }

    @Override
    public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
        return super.onJsConfirm(view, url, message, result);
    }

    @Override
    public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
        return super.onJsAlert(view, url, message, result);
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        super.onProgressChanged(view, newProgress);
        mViewModel.setProgress(newProgress);
    }
}
