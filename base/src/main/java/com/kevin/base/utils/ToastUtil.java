package com.kevin.base.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.kevin.base.BaseApplication;
import com.kevin.base.common.Constant;


/**
 * Created by kevin on 2018/11/29.
 * descript：Toast工具类
 */
public class ToastUtil {
    private static Toast mToast;

    public static void showToast(String text) {
        showToast(BaseApplication.getContext(), text, Constant.IS_SHOT_TOAST);
    }

    public static void showToast(int resId) {
        showToast(BaseApplication.getContext(), resId, Constant.IS_SHOT_TOAST);
    }

    public static void showToast(String text, boolean isShowToast) {
        showToast(BaseApplication.getContext(), text, isShowToast);
    }

    public static void showToast(int resId, boolean isShowToast) {
        showToast(BaseApplication.getContext(), resId, isShowToast);
    }

    private static void showToast(Context context, String text, boolean isShowToast) {
        if (!isShowToast)return;
        if (mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            mToast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }

    private static void showToast(Context context, int resId, boolean isShowToast) {
        if (!isShowToast)return;
        if (mToast == null) {
            mToast = Toast.makeText(context, context.getString(resId), Toast.LENGTH_SHORT);
            mToast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            mToast.setText(context.getString(resId));
        }
        mToast.show();
    }
}
