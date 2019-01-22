package com.kevin.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;

import com.kevin.base.BaseApplication;
import com.kevin.base.BaseFoundation;

/**
 * Created by kevin on 2018/11/29.
 * descript：
 */

public class DeviceUtil {

    private static int sDensityDpi;
    private static float sDensity;
    private static float sScreenHeight;
    private static float sScreenWidth;
    private static float sScreenWidthDpi;
    private static float sScreenHeightDpi;

    /**
     * dp---> px
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * px-->dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


    private static void getInfoFromDisplayMetrics() {
        DisplayMetrics display = BaseFoundation.getContext().getResources()
                .getDisplayMetrics();
        sDensityDpi = display.densityDpi;
        sDensity = display.density;
        sScreenHeight = display.heightPixels;
        sScreenWidth = display.widthPixels;
        sScreenWidthDpi = (sScreenWidth / sDensity);
        sScreenHeightDpi = (sScreenHeight / sDensity);
    }

    public static float getDensity() {
        return sDensity;
    }

    public static float getScreenWidth() {
        getInfoFromDisplayMetrics();
        return sScreenWidth;
    }

    public static float getScreenHeight() {
        getInfoFromDisplayMetrics();
        return sScreenHeight;
    }

    public static Float getScreenWidthDpi() {
        if (sScreenWidthDpi == 0) {
            getInfoFromDisplayMetrics();
        }
        return sScreenWidthDpi;
    }

    public static Float getScreenHeightDpi() {
        if (sScreenHeightDpi == 0) {
            getInfoFromDisplayMetrics();
        }
        return sScreenHeightDpi;
    }

    /**
     * 获取IMEI号
     */
    @SuppressLint("MissingPermission")
    public static String getDeviceId(Context context) {
        TelephonyManager mTm = (TelephonyManager) context.getSystemService(context.TELEPHONY_SERVICE);
        return mTm.getDeviceId();
    }

    //版本名
    public static String getVersionName(Context context) {
        return getPackageInfo(context).versionName;
    }

    //版本号
    public static int getVersionCode(Context context) {
        return getPackageInfo(context).versionCode;
    }

    private static PackageInfo getPackageInfo(Context context) {
        PackageInfo pi = null;

        try {
            PackageManager pm = context.getPackageManager();
            pi = pm.getPackageInfo(context.getPackageName(),
                    PackageManager.GET_CONFIGURATIONS);

            return pi;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pi;
    }

    public static boolean isWifi(Context mContext) {
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetInfo != null
                && activeNetInfo.getType() == ConnectivityManager.TYPE_WIFI) {
            return true;
        }
        return false;
    }

    /**
     * 手机系统版本
     */
    public static String getSdkVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    /**
     * 测量View的宽高
     *
     * @param view View
     */
    public static void measureWidthAndHeight(View view) {
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(widthMeasureSpec, heightMeasureSpec);
    }

}
