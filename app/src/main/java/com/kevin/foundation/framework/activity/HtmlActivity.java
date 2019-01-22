package com.kevin.foundation.framework.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.KeyEvent;
import android.view.View;

import com.kevin.base.utils.ActivityUtil;
import com.kevin.base.utils.LogUtil;
import com.kevin.base.utils.StringUtil;
import com.kevin.base.utils.ToastUtil;
import com.kevin.foundation.R;
import com.kevin.foundation.databinding.FwActivityHtmlBinding;
import com.kevin.foundation.framework.hybrid.JsBridge;
import com.kevin.foundation.framework.hybrid.handler.JsHandlerCommonImpl;
import com.kevin.handler.framework.presenter.HtmlPresenter;
import com.kevin.handler.framework.presenter.Presenter;
import com.kevin.handler.framework.viewmodel.HeaderViewModel;
import com.kevin.handler.framework.viewmodel.HtmlViewModel;
import com.kevin.handler.framework.viewmodel.IViewModel;
import com.kevin.repository.framework.Repository;
import com.kevin.repository.framework.local.BaseLocalKey;
import com.kevin.repository.framework.local.LocalProfile;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class HtmlActivity extends WithHeaderActivity<HtmlPresenter, HtmlViewModel, FwActivityHtmlBinding> {

    /**
     * 跳转html页面统一使用此函数
     *
     * @param title title为空意味着不要原生的头部
     * @param url   地址
     */
    public static void startHtml(String title, String url) {
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("url", url);
        LogUtil.d("startHtml---------------" + url + "-------------------");
        ActivityUtil.navigateTo(HtmlActivity.class, bundle);
    }

    public static void startDialogHtml(String title, String url) {
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("url", url);
        ActivityUtil.navigateTo(WithDialogHtmlActivity.class, bundle);
    }


    /**
     * 创建标题
     * 返回空或者默认的HeaderViewModel不会显示头部，必须设置头部的visible
     *
     * @see HeaderViewModel#setVisible
     */
    @Override
    protected void initHeader(HeaderViewModel header) {
        header.setTitle(getString(R.string.app_name));
        header.setLeft(true);
        header.setVisible(!getViewModel().isHtmlWithHeader());
    }

    /**
     * 子类提供有binding的资源ID
     */
    @Override
    protected int getLayoutID() {
        return R.layout.fw_activity_html;
    }

    @Override
    protected HtmlPresenter buildPresenter() {
        return new HtmlPresenter();
    }

    @Override
    protected HtmlViewModel buildViewModel(Bundle savedInstanceState) {
        String url;
        String title;
        HtmlViewModel viewModel = new HtmlViewModel();
        if (getIntent().getExtras() != null) {
            url = getIntent().getExtras().getString("url");
            title = getIntent().getExtras().getString("title");
            if (StringUtil.isNotEmpty(url)) {
                viewModel.setUrl(url);
            } else {
                ToastUtil.showToast(getString(R.string.fw_html_url_null));
            }
            if (StringUtil.isNotEmpty(title)) {
                viewModel.getHeaderViewModel().setTitle(title);
            } else {
                // title为空意味着html页面自己处理头部，原生不需要显示头部
                viewModel.setHtmlWithHeader(true);
            }
        }
        return viewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        JsBridge.getInstance().addJsHandler(JsHandlerCommonImpl.class.getSimpleName(), JsHandlerCommonImpl.class)
                .syncCookie(this, getViewModel().getUrl(), Repository.getLocalMap(BaseLocalKey.HEADERS))
                .build(getBinding().fwWebView,getViewModel());
        LogUtil.i("----------------session----------------" + Repository.getLocalMap(BaseLocalKey.HEADERS));
        if (null != savedInstanceState) {
            getBinding().fwWebView.restoreState(savedInstanceState);
        } else {
            getBinding().fwWebView.loadUrl(getViewModel().getUrl());
        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getExtras()!=null){
            String url = getIntent().getExtras().getString("url");
            String title = getIntent().getExtras().getString("title");
            getViewModel().getHeaderViewModel().setTitle(title);
            getViewModel().setUrl(url);
            getBinding().fwWebView.loadUrl(url);
        }

    }

    @Override
    protected void onDestroy() {
        JsBridge.onDestroy();
        super.onDestroy();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        JsBridge.onActivityResult(requestCode, resultCode, data);

        /*
          QQ与新浪不需要添加Activity，但需要在使用QQ分享或者授权的Activity中，添加onActivityResult
          注意onActivityResult不可在fragment中实现，如果在fragment中调用登录或分享，需要在fragment依赖的Activity中实现
         */
//        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getBinding().fwWebView.saveState(outState);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.headerLeftBtn:
//                finish();
//                break;
//            case R.id.headerText:
//                getBinding().fwWebView.scrollTo(0, 0);
//                break;
            case R.id.refresh:
                getViewModel().setIsError(false);
                getBinding().fwWebView.loadUrl(getViewModel().getUrl());
                break;
        }
    }

    /**
     * 重写物理返回方法。如果html有上一页则跳转到html上一页，否则返回native
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            if (getBinding().fwWebView.canGoBack()) {
                getBinding().fwWebView.goBack();
            } else {
                finish();
            }

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        JsBridge.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

}
