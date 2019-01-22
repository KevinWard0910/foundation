package com.kevin.repository.framework;

import android.app.Application;
import android.content.Context;

import com.kevin.base.utils.StringUtil;
import com.kevin.repository.framework.interaction.CallAdapter;
import com.kevin.repository.framework.interaction.InteractionProxy;
import com.kevin.repository.framework.local.LocalProfile;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kevin on 2018/11/29.
 * descript：数据仓库，所有数据通过此类进行管理
 */

public class Repository {
    private static Repository mRepository;
    private final Map<String,String> mLocalStringCache = new ConcurrentHashMap<>();
    private final Map<String,Integer> mLocalIntegerCache = new ConcurrentHashMap<>();
    private final Map<String,Boolean> mLocalBooleanCache = new ConcurrentHashMap<>();
    private final Map<String, Float> mLocalFloatCache = new ConcurrentHashMap<>();
    private final Map<String, Map<String, String>> mLocalMapCache = new ConcurrentHashMap<>();
    private final Map<String, List<String>> mLocalListCache = new ConcurrentHashMap<>();

    private LocalProfile mProfile;
    private CallAdapter mCallAdapter;

    private Repository(LocalProfile profile) {
        mProfile = profile;
    }

    private static Repository getRepository() {
        if (mRepository == null) {
            throw new NullPointerException("you should call Repository.install(context) in you Application first.");
        } else {
            return mRepository;
        }
    }

    /**
     * 定义自己的CallAdapter
     */
    public static void installWithCallAdapter(Context context, CallAdapter callAdapter) {
        install(context);
        getRepository().mCallAdapter = callAdapter;
    }

    public static void install(Context context) {
        if (mRepository != null) {
            throw new NullPointerException("please only call install Repository one time.");
        } else if (context != null && context instanceof Application) {
            mRepository = new Repository(new LocalProfile(context.getApplicationContext()));
        } else {
            throw new NullPointerException("context is invalid when call Repository.install.");
        }
    }

    public static <T> T getInteraction(final Class<T> clazz) {
        return new InteractionProxy().setCallAdapter(getRepository().mCallAdapter).create(clazz);
    }

    public static String getLocalValue(String localKey) {
        String value;
        if (!getRepository().mLocalStringCache.containsKey(localKey)) {
            value = getRepository().mProfile.getValue(localKey, "");
            getRepository().mLocalStringCache.put(localKey, value);
        } else {
            value = getRepository().mLocalStringCache.get(localKey);
        }
        return value;
    }

    public static void setLocalValue(String localKey, String localValue) {
        if (StringUtil.isEmpty(localValue)) {
            getRepository().mLocalStringCache.remove(localKey);
            getRepository().mProfile.remove(localKey);
        } else {
            getRepository().mLocalStringCache.put(localKey, localValue);
            getRepository().mProfile.setValue(localKey, localValue);
        }
    }

    public static int getLocalInt(String localKey) {
        int value;
        if (!getRepository().mLocalIntegerCache.containsKey(localKey)) {
            value = getRepository().mProfile.getValue(localKey, 0);
            getRepository().mLocalIntegerCache.put(localKey, value);
        } else {
            value = getRepository().mLocalIntegerCache.get(localKey);
        }
        return value;
    }

    public static void setLocalInt(String localKey, int localValue) {
        getRepository().mLocalIntegerCache.put(localKey, localValue);
        if (localValue == 0) {
            getRepository().mProfile.remove(localKey);
        } else {
            getRepository().mProfile.setValue(localKey, localValue);
        }
    }

    public static float getLocalFloat(String localKey) {
        float value;
        if (!getRepository().mLocalFloatCache.containsKey(localKey)) {
            value = getRepository().mProfile.getValue(localKey, 0f);
            getRepository().mLocalFloatCache.put(localKey, value);
        } else {
            value = getRepository().mLocalIntegerCache.get(localKey);
        }
        return value;
    }

    public static void setLocalFloat(String localKey, float localValue) {
        getRepository().mLocalFloatCache.put(localKey, localValue);
        if (localValue == 0f) {
            getRepository().mProfile.remove(localKey);
        } else {
            getRepository().mProfile.setValue(localKey, localValue);
        }
    }

    public static boolean getLocalBoolean(String localKey) {
        boolean value;
        if (!getRepository().mLocalBooleanCache.containsKey(localKey)) {
            value = getRepository().mProfile.getValue(localKey, false);
            getRepository().mLocalBooleanCache.put(localKey, value);
        } else {
            value = getRepository().mLocalBooleanCache.get(localKey);
        }
        return value;
    }

    public static boolean getLocalBoolean(String localKey, boolean defaultValue) {
        boolean value;
        if (!getRepository().mLocalBooleanCache.containsKey(localKey)) {
            value = getRepository().mProfile.getValue(localKey, defaultValue);
            getRepository().mLocalBooleanCache.put(localKey, value);
        } else {
            value = getRepository().mLocalBooleanCache.get(localKey);
        }
        return value;
    }

    public static void setLocalBoolean(String localKey, boolean localValue) {
        getRepository().mLocalBooleanCache.put(localKey, localValue);
        if (!localValue) {
            getRepository().mProfile.remove(localKey);
        } else {
            getRepository().mProfile.setValue(localKey, true);
        }
    }

    /*false 不移除键*/
    public static void setBoolean(String localKey, boolean localValue) {
        getRepository().mLocalBooleanCache.put(localKey, localValue);
        getRepository().mProfile.setValue(localKey, localValue);

    }

    public static Map<String, String> getLocalMap(String localKey) {
        Map<String, String> value;
        if (!getRepository().mLocalMapCache.containsKey(localKey)) {
            value = getRepository().mProfile.getMap(localKey);
            if (value != null && !value.isEmpty()) {
                getRepository().mLocalMapCache.put(localKey, value);
            }
        } else {
            value = getRepository().mLocalMapCache.get(localKey);
        }
        return value;
    }

    public static void setLocalMap(String localKey, Map<String, String> localMap) {
        if (localMap == null) {
            getRepository().mLocalMapCache.remove(localKey);
            getRepository().mProfile.remove(localKey);
        } else {
            getRepository().mLocalMapCache.put(localKey, localMap);
            getRepository().mProfile.setMap(localKey, localMap);
        }
    }

    public static <T> void setViewModel(String localKey, T viewModel) {
        getRepository().mProfile.setViewModel(localKey, viewModel);
    }

    public static <T> T getViewModel(String localKey, Class viewModel) {
        return getRepository().mProfile.getViewModel(localKey, viewModel);
    }

    public static List<String> getLocalList(String localKey) {
        List<String> value;
        if (!getRepository().mLocalListCache.containsKey(localKey)) {
            value = getRepository().mProfile.getList(localKey);
            if (value != null && !value.isEmpty()) {
                getRepository().mLocalListCache.put(localKey, value);
            }
        } else {
            value = getRepository().mLocalListCache.get(localKey);
        }
        return value;
    }

    public static void setLocalList(String localKey, List<String> localList) {
        if (localKey == null) {
            return;
        }
        if (localList == null) {
            getRepository().mLocalListCache.remove(localKey);
            getRepository().mProfile.remove(localKey);
        } else {
            getRepository().mLocalListCache.put(localKey, localList);
            getRepository().mProfile.setList(localKey, localList);
        }
    }

}
