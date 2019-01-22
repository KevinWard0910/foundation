package com.kevin.foundation.framework.activity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.kevin.base.utils.ActivityUtil;
import com.kevin.base.utils.LogUtil;
import com.kevin.base.utils.ResourceUtil;
import com.kevin.base.utils.StringUtil;
import com.kevin.base.utils.http.SimpleBean;
import com.kevin.foundation.R;
import com.kevin.handler.framework.IView;

import pub.devrel.easypermissions.EasyPermissions;

/**
 * Created by FJ on 2018/11/28.
 * descript：
 */

public  abstract class BaseActivity extends AppCompatActivity
        implements IView, DialogInterface.OnCancelListener {
    private final static int[] ANIMATION_IN = new int[]{
            R.anim.fw_fade_in,
            R.anim.fw_left_in,
            R.anim.fw_right_in
    };
    private final static int ANIMATION_OUT[] = new int[]{
            R.anim.fw_fade_out,
            R.anim.fw_right_out,
            R.anim.fw_left_out,
    };

    protected String TAG = null;
    private ProgressDialog mLoading;
    private ProgressDialog mProgressDialog;
    private boolean mIsFirstVisible = true;
    /*是否正在切换Fragment*/
    private boolean mIsSwitchFragmenting = false;
    private boolean mIsMoving = false;


    /**
     * 可以做初始化一次的操作
     */
    protected void onFirstUserVisible() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        ActivityUtil.setCurrentActivity(this);
        initLoading();
    }

    private void initLoading() {
        if (mLoading == null) {
            mLoading = new ProgressDialog(this);
            mLoading.setCanceledOnTouchOutside(false);
            mLoading.setCancelable(true);
            mLoading.setMessage(getString(R.string.fw_html_loading));
            mLoading.setOnCancelListener(this);
        }
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setTitle(ResourceUtil.getString(R.string.image_upload));
            mProgressDialog.setProgressNumberFormat(null);
            mProgressDialog.setCanceledOnTouchOutside(false);
            mProgressDialog.setCancelable(true);
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            mProgressDialog.setOnCancelListener(this);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        ActivityUtil.setCurrentActivity(this);
        if (mIsFirstVisible) {
            mIsFirstVisible = false;
            onFirstUserVisible();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        hideLoading();
        super.onDestroy();
    }



    /**
     * 替换fragment
     *
     * @param resLayoutId    containerId
     * @param showFragment   fragment
     * @param anim           切换动画
     * @param isAddBackStack 是否加入返回栈
     */
    public void replaceFragment(int resLayoutId, Fragment showFragment, AnimationEnum anim, boolean isAddBackStack) {
        if (mIsSwitchFragmenting) return;
        mIsSwitchFragmenting = true;

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (AnimationEnum.WITHOUT.getValue() != anim.getValue()) {
            fragmentTransaction.setCustomAnimations(ANIMATION_IN[anim.getValue()], ANIMATION_OUT[anim.getValue()],
                    ANIMATION_IN[anim.getValue()], ANIMATION_OUT[anim.getValue()]);
        }

        fragmentTransaction.replace(resLayoutId, showFragment);
        if (isAddBackStack) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
        mIsSwitchFragmenting = false;
    }

    /**
     * 添加Fragment
     *
     * @param resLayId       container id
     * @param showFragment   fragment
     * @param animation      animation
     * @param isAddBackStack stack
     * @param hideFragments  要隐藏的Fragment数组
     */
    public void addFragment(int resLayId, Fragment showFragment,
                            AnimationEnum animation, boolean isAddBackStack,
                            Fragment... hideFragments) {
        if (mIsSwitchFragmenting) {
            return;
        }
        mIsSwitchFragmenting = true;
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction();
        if (animation.getValue() != AnimationEnum.WITHOUT.getValue()) {
            fragmentTransaction.setCustomAnimations(ANIMATION_IN[animation.getValue()],
                    ANIMATION_OUT[animation.getValue()], ANIMATION_IN[animation.getValue()],
                    ANIMATION_OUT[animation.getValue()]);
        }
        if (hideFragments != null) {
            for (Fragment hideFragment : hideFragments) {
                if (hideFragment != null && hideFragment != showFragment)
                    fragmentTransaction.hide(hideFragment);
            }
        }
        fragmentTransaction.add(resLayId, showFragment);
        if (isAddBackStack) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
        mIsSwitchFragmenting = false;
    }

    /**
     * 显示隐藏Fragment
     *
     * @param showFragment   显示的fragment
     * @param hideFragments  要隐藏的Fragment数组
     * @param isAddBackStack 是否加入返回栈
     */
    public void showHideFragment(Fragment showFragment, AnimationEnum animation,
                                 boolean isAddBackStack, Fragment... hideFragments) {
        if (mIsSwitchFragmenting) {
            return;
        }
        mIsSwitchFragmenting = true;
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction();
        if (animation.getValue() != AnimationEnum.WITHOUT.getValue()) {
            fragmentTransaction.setCustomAnimations(ANIMATION_IN[animation.getValue()],
                    ANIMATION_OUT[animation.getValue()], ANIMATION_IN[animation.getValue()],
                    ANIMATION_OUT[animation.getValue()]);
        }
        if (hideFragments != null) {
            for (Fragment hideFragment : hideFragments) {
                if (hideFragment != null && hideFragment.isAdded() && hideFragment != showFragment)
                    fragmentTransaction.hide(hideFragment);
            }
        }
        if (showFragment != null) {
            fragmentTransaction.show(showFragment);
        }
        if (isAddBackStack) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
        mIsSwitchFragmenting = false;
    }

    @Override
    public void onUpdate(Object... args) {
        this.hideLoading();
        LogUtil.d(TAG, "BaseActivity ++ onUpdate");
    }

    @Override
    public void showLoading(String msg) {
        LogUtil.d(TAG, "BaseActivity ++ showLoading");
        if (StringUtil.isEmpty(msg)) {
            mLoading.setMessage(getString(R.string.fw_html_loading));
        } else {
            mLoading.setMessage(msg);
        }
        if (!mLoading.isShowing()) {
            mLoading.show();
        }
    }

    @Override
    public void hideLoading() {
        LogUtil.d(TAG, "BaseActivity ++ hideLoading");
        if (mLoading.isShowing()) {
            mLoading.dismiss();
        }
        if (mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void showFailure(SimpleBean msg) {
        this.hideLoading();
        LogUtil.d(TAG, "BaseFragment ++ showFailure msg = " + msg);
    }

    @Override
    public void showError(SimpleBean msg) {
        this.hideLoading();
        LogUtil.d(TAG, "BaseFragment ++ showError msg = " + msg);
    }

    @Override
    public void onProgress(int progress, int max) {
        LogUtil.d(TAG, "BaseActivity ++ onProgress");
        mProgressDialog.setMax(max);
        mProgressDialog.setProgress(progress);
        if (!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
        if (progress == max && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        this.hideLoading();
        LogUtil.d(TAG, "BaseActivity ++ onCancel");
    }


    public enum AnimationEnum {
        WITHOUT(-1),
        DEFAULT_TYPE(0),
        LEFT_IN(1),
        RIGHT_IN(2);

        private int mValue;

        AnimationEnum(int value) {
            mValue = value;
        }

        public int getValue() {
            return mValue;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }
}
