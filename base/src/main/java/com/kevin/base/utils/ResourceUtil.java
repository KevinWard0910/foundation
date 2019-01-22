/*
 * Copyright (c)  Created by Cody.yi on 2016/9/1.
 */
package com.kevin.base.utils;

import com.kevin.base.BaseApplication;
import com.kevin.base.BaseFoundation;

/**
 * Created by kevin on 2018/11/29.
 * descript：资源获取工具类
 *
 */
public class ResourceUtil {
    /**
     * 根据ID获取字符串
     *
     * @param id 资源id
     * @return 资源id对应的字符串
     */
    public static String getString(int id) {
        return BaseFoundation.getContext().getString(id);
    }

    /**
     * 根据ID获取字符串数组
     *
     * @param id 资源id
     * @return 资源id对应的字符串数组
     */
    public static String[] getStringArray(int id) {
        return BaseFoundation.getContext().getResources().getStringArray(id);
    }

    /**
     * 根据ID获取字符串数组
     *
     * @param id 资源id
     * @return 资源id对应的字符串数组
     */
    public static int getDimension(int id) {
        return BaseFoundation.getContext().getResources().getDimensionPixelSize(id);
    }
}
