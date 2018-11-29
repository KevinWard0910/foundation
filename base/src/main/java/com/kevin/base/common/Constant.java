package com.kevin.base.common;

/**
 * Created by FJ on 2018/11/29.
 * descript： 常量
 */

public class Constant {
    /**
     * 是否是debug状态
     * */
    public static final boolean DEBUG = true;
    /**
     * 是否显示Toast
     * */
    public static final boolean IS_SHOT_TOAST = false;

    /**
     * 运行模式 DEBUG = 1; INFO = 2; WARN = 3; ERROR = 4; 优先级DEBUG < INFO < WARN <
     * ERROR
     * RUNNING_MODE大于4时Log关闭
     */
    public static final int RUNNING_MODE = 1;

}
