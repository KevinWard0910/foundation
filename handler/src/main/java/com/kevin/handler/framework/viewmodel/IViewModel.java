package com.kevin.handler.framework.viewmodel;

import android.databinding.ObservableBoolean;

import java.io.Serializable;

/**
 * Created by kevin on 2018/11/29.
 * descript：IViewModel
 */

public interface IViewModel extends Serializable {
    Object getId();

    void setId(Object id);

    /**
     * 是否可用，可用控制界面显示默认界面
     *
     * @return valid
     */
    ObservableBoolean isValid();
}
