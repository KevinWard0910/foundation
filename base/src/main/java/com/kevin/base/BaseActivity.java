package com.kevin.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import pub.devrel.easypermissions.EasyPermissions;

/**
 * Created by FJ on 2018/11/28.
 * descript：
 */

public class BaseActivity extends AppCompatActivity {
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
    private boolean mIsSwitchFragmenting = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();

    }

    /**
     * 替换fragment
     * @param resLayoutId containerId
     * @param showFragment fragment
     * @param anim          切换动画
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
