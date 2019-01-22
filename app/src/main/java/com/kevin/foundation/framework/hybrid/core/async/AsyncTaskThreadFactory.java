package com.kevin.foundation.framework.hybrid.core.async;

import android.os.Process;
import android.support.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class AsyncTaskThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(@NonNull final Runnable runnable) {
        Runnable wrapper = new Runnable() {
            @Override
            public void run() {
                Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);

                runnable.run();
            }
        };
        Thread thread = new Thread(wrapper,"JsBridge AsyncTaskExecutor");
        if (thread.isDaemon()){
            thread.setDaemon(false);
        }
        return thread;
    }
}
