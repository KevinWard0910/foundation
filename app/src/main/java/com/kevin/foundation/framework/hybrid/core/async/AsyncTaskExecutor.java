package com.kevin.foundation.framework.hybrid.core.async;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class AsyncTaskExecutor {
    private static final int JS_BRIDGE_TASK_THREAD_NUM = 3;
    private static final ThreadPoolExecutor ASYNC_THREAD_POOL;

    static {
        ASYNC_THREAD_POOL = new ThreadPoolExecutor(
                JS_BRIDGE_TASK_THREAD_NUM,
                JS_BRIDGE_TASK_THREAD_NUM,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<Runnable>(),
                new AsyncTaskThreadFactory());
    }

    public static void runOnAsyncThread(Runnable runnable) {
        if (runnable == null) return;
        ASYNC_THREAD_POOL.execute(runnable);
    }

    public static void runOnMainThread(Runnable runnable) {
        if (runnable == null) return;
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void shutDown() {
        if (ASYNC_THREAD_POOL != null && !ASYNC_THREAD_POOL.isShutdown() && !ASYNC_THREAD_POOL.isShutdown()) {
            ASYNC_THREAD_POOL.shutdown();
        }

    }
}
