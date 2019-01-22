package com.kevin.foundation.framework.hybrid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.kevin.base.utils.LogUtil;
import com.kevin.foundation.framework.hybrid.core.JsCallback;
import com.kevin.foundation.framework.hybrid.core.JsHandler;
import com.kevin.foundation.framework.hybrid.core.JsHandlerFactory;
import com.kevin.foundation.framework.hybrid.core.JsInteract;
import com.kevin.foundation.framework.hybrid.core.JsWebChromeClient;
import com.kevin.foundation.framework.hybrid.core.JsWebViewClient;
import com.kevin.handler.framework.viewmodel.HtmlViewModel;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;

import pub.devrel.easypermissions.EasyPermissions;

/**
 * Created by kevin on 2018/11/30.
 * descript：JsBridge
 */

public class JsBridge {
    private final static String USER_AGENT =";android;kevin";
    private volatile static JsBridge sInstance;
    private JsHandlerFactory mJsHandlerFactory;
    private SparseArray<OnActivityResultListener> mResultListener;
    private SparseArray<EasyPermissions.PermissionCallbacks> mPermissionsListener;
    private WeakReference<WebView> mWebViewRef;

    private JsBridge() {
        mJsHandlerFactory = new JsHandlerFactory();
        mResultListener = new SparseArray<>();
        mPermissionsListener = new SparseArray<>();
    }


    public static JsBridge getInstance() {
        if (sInstance == null) {
            synchronized (JsBridge.class) {
                if (sInstance == null) {
                    sInstance = new JsBridge();
                }
            }
        }
        return sInstance;
    }

    /**
     * 查找处理js处理方法
     */
    public static Method findMethod(String handlerName, String methodName) {
        return getInstance().mJsHandlerFactory.findMethod(handlerName, methodName);
    }

    /**
     * 调用Native方法
     */
    public static void callNative(WebView webView, String message) {
        JsInteract.newInstance().callNative(webView, message);
    }

    public static JsCallback getJsCallback(WebView webView, String port) {
        return JsCallback.newInstance(webView, port);
    }

    /**
     * 替换Activity中的startActivityForResult
     */
    public static void startActivityForResult(Intent intent, OnActivityResultListener listener) {
        int requestCode = getInstance().mResultListener.size();
        getInstance().mResultListener.put(requestCode, listener);
        if (getInstance().mWebViewRef != null && getInstance().mWebViewRef.get() != null) {
            WebView webView = getInstance().mWebViewRef.get();
            if (webView.getContext() instanceof Activity) {
                ((Activity) webView.getContext()).startActivityForResult(intent, requestCode);
            }
        } else {
            LogUtil.d("webView is recycled.");
        }
    }

    /**
     * 需要用到startActivityForResult的时候需要调用此回调
     */
    public static void onActivityResult(int requestCode, int resultCode, Intent data) {
        OnActivityResultListener listener = getInstance().mResultListener.get(requestCode);
        if (listener != null) {
            listener.onActivityResult(resultCode, data);
            getInstance().mResultListener.remove(requestCode);
        }
    }

    /**
     * 6.0以上需要动态请求权限的时候需要调用此函数
     */
    public static void requestPermissions(@NonNull String rationale, EasyPermissions.PermissionCallbacks listener, @NonNull String... perms) {
        int requestCode = getInstance().mPermissionsListener.size();
        getInstance().mPermissionsListener.put(requestCode, listener);
        if (getInstance().mWebViewRef != null && getInstance().mWebViewRef.get() != null) {
            WebView webView = getInstance().mWebViewRef.get();
            if (webView.getContext() instanceof Activity) {
                EasyPermissions.requestPermissions(((Activity) webView.getContext()), rationale, requestCode, perms);
            }
        } else {
            LogUtil.d("webView is recycled.");
        }
    }

    public static void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        EasyPermissions.PermissionCallbacks listener = getInstance().mPermissionsListener.get(requestCode);
        if (listener != null) {
            // EasyPermissions handles the request result.
            EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, listener);
            getInstance().mPermissionsListener.remove(requestCode);
        }
    }

    /**
     * 需要在包含webView的Activity中调用，用来回收webView数据
     */
    public static void onDestroy() {
        if (getInstance().mWebViewRef != null && getInstance().mWebViewRef.get() != null) {
            WebView webView = getInstance().mWebViewRef.get();
            webView.stopLoading();
            webView.removeAllViews();
            webView.setTag(null);
            webView.clearHistory();
            webView.removeAllViews();
            webView.destroy();
        }
        getInstance().mResultListener.clear();
    }

    /**
     * 添加Js处理类，可以使用连缀的方式添加多个处理类，最后需要调用build方法使处理类生效
     *
     * @param handlerName 处理类名
     * @param clazz       处理类类型
     */
    public JsBridge addJsHandler(String handlerName, Class<? extends JsHandler> clazz) {
        sInstance.mJsHandlerFactory.register(handlerName, clazz);
        return this;
    }

    /**
     * 同步指定地址的cookie到webView
     */
    public JsBridge syncCookie(Context context, String url, Map<String, String> cookies) {
        if (context == null || TextUtils.isEmpty(url) || cookies == null) {
            return this;
        }

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeSessionCookie();
        cookieManager.setAcceptCookie(true);
        for (Map.Entry<String, String> entry : cookies.entrySet()) {
            cookieManager.setCookie(url, entry.getKey() + "=" + entry.getValue());
        }

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            CookieSyncManager cookieSyncManager = CookieSyncManager.createInstance(context);
            cookieSyncManager.sync();
        }
        return this;
    }

    /**
     * 构建已经注册的处理类
     */
    @SuppressLint("SetJavaScriptEnabled")
    public void build(WebView webView, HtmlViewModel viewModel) {
        if (webView == null) {
            throw new NullPointerException("webView is null,can't build js handler!");
        }
        mWebViewRef = new WeakReference<>(webView);
        getInstance().mJsHandlerFactory.build();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        String userAgentString = settings.getUserAgentString();
        settings.setUserAgentString(userAgentString + USER_AGENT);
//		settings.setPluginState(PluginState.ON_DEMAND);
        settings.setAllowFileAccess(true);
        // 设置 缓存模式
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        // 开启 DOM storage API 功能
        settings.setDomStorageEnabled(true);
        String cacheDirPath = webView.getContext().getFilesDir().getAbsolutePath() + "/webView";
        //设置  Application Caches 缓存目录
        settings.setAppCachePath(cacheDirPath);
        //开启 Application Caches 功能
        settings.setAppCacheEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        //5.0之后h5内支持混合模式
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            settings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        if (viewModel == null) {
            viewModel = new HtmlViewModel();
        }
        webView.setWebViewClient(new JsWebViewClient(viewModel));
        webView.setWebChromeClient(new JsWebChromeClient(viewModel));
    }


    public interface OnActivityResultListener {
        void onActivityResult(int resultCode, Intent data);
    }

    public interface OnProgressListener {
        void onProgress(int progress);
    }
}
