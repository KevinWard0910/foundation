package com.kevin.foundation.framework.hybrid.handler;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebView;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.kevin.base.common.NotProguard;
import com.kevin.base.utils.CommonUtil;
import com.kevin.base.utils.LogUtil;
import com.kevin.base.utils.ToastUtil;
import com.kevin.foundation.framework.hybrid.core.JsCallback;
import com.kevin.foundation.framework.hybrid.core.JsHandler;
import com.kevin.repository.business.interaction.constant.Account;
import com.kevin.repository.business.local.LocalKey;
import com.kevin.repository.framework.Repository;

import java.util.Map;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */
@NotProguard
public final class JsHandlerCommonImpl implements JsHandler {

    public static void showToast(WebView webView, JsonObject params, JsCallback callback) {
        ToastUtil.showToast(params.toString());
        callback.success(params);
    }

    public static void getIMSI(WebView webView, JsonObject params, JsCallback callback) {
        TelephonyManager telephonyManager = ((TelephonyManager) webView.getContext().getSystemService(Context.TELEPHONY_SERVICE));
        String imsi = telephonyManager.getSubscriberId();
        if (TextUtils.isEmpty(imsi)) {
            imsi = telephonyManager.getDeviceId();
        }
        JsonObject data = new JsonObject();
        data.addProperty("imsi", imsi);
        callback.success(data);
    }

    public static void getAppName(WebView webView, JsonObject params, JsCallback callback) {
        String appName;
        try {
            PackageManager packageManager = webView.getContext().getApplicationContext().getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(webView.getContext().getApplicationContext().getPackageName(), 0);
            appName = packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (Exception e) {
            e.printStackTrace();
            appName = "";
        }
        JsonObject data = new JsonObject();
        data.addProperty("result", appName);
        callback.success(data);
    }

    public static void getOsSdk(WebView webView, JsonObject params, JsCallback callback) {
        JsonObject data = new JsonObject();
        data.addProperty("os_sdk", Build.VERSION.SDK_INT);
        callback.success(data);
    }

    public static void share(final WebView webView, JsonObject params, final JsCallback callback) {
        String title = "This is title";
        String description = "This is description";
        String url = "https://mobile.umeng.com/";
        String thumbUrl = "https://mobile.umeng.com/images/pic/home/social/img-1.png";
        String type = "";
//        {
//            "url":"",//分享链接
//                "title":"",//分享标题
//                "desc":"",//副标题
//                "imgUrl":""//分享图片链接
//        }

        JsonPrimitive urlElement = params.getAsJsonPrimitive("url");
        if (urlElement != null)
            url = urlElement.getAsString();
        JsonPrimitive titleElement = params.getAsJsonPrimitive("title");
        if (titleElement != null)
            title = titleElement.getAsString();
        JsonPrimitive descElement = params.getAsJsonPrimitive("desc");
        if (descElement != null)
            description = descElement.getAsString();
        JsonPrimitive imgUrlElement = params.getAsJsonPrimitive("imgUrl");
        if (imgUrlElement != null)
            thumbUrl = imgUrlElement.getAsString();
        JsonPrimitive typeElement = params.getAsJsonPrimitive("type");
        if (typeElement != null)
            type = typeElement.getAsString();

        //TODO 分享
//        final ShareBean bean = new ShareBean();
//        bean.setUrl(url);
//        bean.setTitle(title);
//        bean.setDesc(description);
//        bean.setImgUrl(thumbUrl);
//        final String finalType = type;
//        ShareBlock.share((Activity) webView.getContext(), bean, new ShareBlock.ShareListener() {
//            @Override
//            public void onStart(SHARE_MEDIA var1) {
//
//            }
//
//            @Override
//            public void onResult(SHARE_MEDIA var1) {
//                if (finalType != null && LoginBlock.isLogin()){
//                    PhotoBrowserDetailsPresenter presenter = new PhotoBrowserDetailsPresenter();
//                    presenter.shareAddStarCoin(((Activity) webView.getContext()).getClass().getSimpleName(), finalType);
//                }
//            }
//
//            @Override
//            public void onError(SHARE_MEDIA var1, Throwable var2) {
//
//            }
//
//            @Override
//            public void onCancel(SHARE_MEDIA var1) {
//
//            }
//        });
//
//        String[] permissions = new String[]{
//                Manifest.permission.WRITE_EXTERNAL_STORAGE,
//                Manifest.permission.ACCESS_FINE_LOCATION,
//                Manifest.permission.CALL_PHONE,
//                Manifest.permission.READ_PHONE_STATE};
//
//        if (webView.getContext() instanceof Activity) {
//            if (!EasyPermissions.hasPermissions(webView.getContext(), permissions)) {
//                JsBridge.requestPermissions(ResourceUtil.getString(R.string.permission_request),
//                        new EasyPermissions.PermissionCallbacks() {
//                            @Override
//                            public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//                                LogUtil.d("onRequestPermissionsResult" + requestCode);
//                            }
//
//                            @Override
//                            public void onPermissionsGranted(int requestCode, List<String> perms) {
//                                ShareBlock.share((Activity) webView.getContext(), bean,null);
//                            }
//
//                            @Override
//                            public void onPermissionsDenied(int requestCode, List<String> perms) {
//                                ToastUtil.showToast(R.string.some_permission_not_grant);
//                            }
//                        }, permissions);
//            } else {
//                ShareBlock.share((Activity) webView.getContext(), bean,null);
//            }
//        }
    }
    public static void finish(WebView webView, JsonObject params, JsCallback callback) {
        if (webView.getContext() instanceof Activity) {
            ((Activity) webView.getContext()).finish();
        }
    }

    public static void getDeviceInfo(WebView webView, JsonObject params, JsCallback callback) {
        /*
            device:""(iOS/Android),
            openid:""(登录openid) ,
            sessionid:""(登录openid) ,
            mobile:""(登录手机号)，
            isLogin:1登录,2未登录，
            longitude:"",
            latitude:""
        */
        try {
            JsonObject subJsonObject = new JsonObject();
            Map<String, String> x_token = Repository.getLocalMap(LocalKey.X_TOKEN);
            subJsonObject.addProperty("openid", Repository.getLocalValue(LocalKey.OPEN_ID));
            subJsonObject.addProperty("mobile", Repository.getLocalValue(LocalKey.PHONE_NUMBER));
            subJsonObject.addProperty("sessionid", x_token == null ? "" : x_token.get(Account.KEY_TOKEN));
            subJsonObject.addProperty("device", "Android");
            subJsonObject.addProperty("hxiphoneUUID", CommonUtil.getUUID());
            subJsonObject.addProperty("isLogin", x_token == null ? 2 : 1);
            //TODO 定位
//            LocationBean userLocation = LocationBlock.getUserLocation();
//            subJsonObject.addProperty("longitude", userLocation == null ? 0 : userLocation.getLongitude());
//            subJsonObject.addProperty("latitude", userLocation == null ? 0 : userLocation.getLatitude());
            callback.success(subJsonObject);
            LogUtil.d("device_info", subJsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
            callback.failure(e.getMessage());
        }
    }

}
