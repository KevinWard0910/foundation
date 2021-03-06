package com.kevin.handler.framework.viewmodel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.kevin.base.utils.ResourceUtil;
import com.kevin.handler.R;

/**
 * Created by kevin on 2018/11/29.
 * descript：action bar 头部ViewModel，可以保护进其他ViewModel，当有头部是进行设置，没有时可以不用管
 * 如果头部ViewModel不会变更，也可以单独使用
 */

public class HeaderViewModel extends ViewModel {
    private ObservableBoolean mVisible = new ObservableBoolean(false);//是否有头部
    private ObservableBoolean mLeft = new ObservableBoolean(false);//左边图标 -大部分情况是返回图标
    private ObservableBoolean mRight = new ObservableBoolean(false);//右边图标
    private ObservableBoolean mRightIsText = new ObservableBoolean(false);//右边文字
    private ObservableInt mLeftResId = new ObservableInt();//左边图标 返回
    private ObservableInt mRightResId = new ObservableInt();//右边图标 设置
    private ObservableField<String> mRightText = new ObservableField<>("");//右边文字 保存
    private ObservableInt mRightColorId = new ObservableInt();//右边文字颜色
    private ObservableField<String> mTitle = new ObservableField<>("");//标题资源id
    private ObservableBoolean mRightIsTextAndDrawable = new ObservableBoolean(false);//右边文字（带小图标）
    private ObservableBoolean lineVisibility = new ObservableBoolean(true);//底部灰线是否显示

    private HeaderViewModel() {
        mVisible.set(true);//是否有头部
        mLeft.set(false);//左边图标 -大部分情况是返回图标
        mRight.set(false);//右边图标
        mRightIsText.set(false);//右边文字
        mRightIsTextAndDrawable.set(false);
        mLeftResId.set(R.mipmap.xf_back_arrow);//左边图标 返回
        mRightResId.set(R.mipmap.xf_setting);//右边图标 设置
        mRightText.set(ResourceUtil.getString(R.string.xf_save_now));//右边文字 保存
        mTitle.set(ResourceUtil.getString(R.string.xf_title)); //标题资源id
    }

    public static HeaderViewModel createDefaultHeader() {
        return new HeaderViewModel();
    }

    public ObservableBoolean isVisible() {
        return mVisible;
    }

    public void setVisible(boolean visible) {
        mVisible.set(visible);
    }

    public ObservableField<String> getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle.set(title);
    }

    public ObservableBoolean isLeft() {
        return mLeft;
    }

    public void setLeft(boolean left) {
        mLeft.set(left);
    }

    public ObservableBoolean isRight() {
        return mRight;
    }

    public void setRight(boolean right) {
        mRight.set(right);
    }

    public ObservableBoolean isRightIsText() {
        return mRightIsText;
    }

    public void setRightIsText(boolean rightIsText) {
        mRightIsText.set(rightIsText);
    }

    public ObservableBoolean isRightIsTextAndDrawable() {
        return mRightIsTextAndDrawable;
    }

    public void setRightIsTextAndDrawable(boolean rightIsTextAndDrawable) {
        mRightIsTextAndDrawable.set(rightIsTextAndDrawable);
    }

    public ObservableInt getLeftResId() {
        return mLeftResId;
    }

    public void setLeftResId(int leftResId) {
        mLeftResId.set(leftResId);
    }

    public ObservableInt getRightResId() {
        return mRightResId;
    }

    public void setRightResId(int rightResId) {
        mRightResId.set(rightResId);
    }

    public ObservableField<String> getRightText() {
        return mRightText;
    }

    public void setRightText(String rightText) {
        mRightText.set(rightText);
    }

    public ObservableInt getRightColorId() {
        return mRightColorId;
    }

    public void setLineVisible(boolean lineVisibility) {
        this.lineVisibility.set(lineVisibility);
    }

    public ObservableBoolean getLineVisibility() {
        return lineVisibility;
    }

    public void setRightColorId(int rightColorId) {
        mRightColorId.set(rightColorId);
    }
}
