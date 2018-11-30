package com.kevin.repository.framework.interaction;

import android.util.ArrayMap;

import com.google.gson.JsonObject;
import com.kevin.base.BaseFoundation;
import com.kevin.base.common.LoginBroadcastReceiver;
import com.kevin.base.utils.HttpUtil;
import com.kevin.base.utils.StringUtil;
import com.kevin.base.utils.http.HttpCode;
import com.kevin.base.utils.http.SimpleBean;
import com.kevin.repository.business.interaction.constant.Constant;
import com.kevin.repository.business.local.LocalKey;
import com.kevin.repository.framework.Repository;
import com.kevin.repository.framework.local.BaseLocalKey;

import java.util.List;
import java.util.Map;

import static com.kevin.repository.business.interaction.constant.Constant.UPLOAD_FILE_NAME;

/**
 * Created by kevin on 2018/11/29.
 * descript： 默认请求适配器
 */
@SuppressWarnings("unchecked")
public class DefaultCallAdapter extends CallAdapter {
    public DefaultCallAdapter(InteractionMethod interactionMethod) {
        super(interactionMethod);
        if (interactionMethod == null) {
            throw new IllegalArgumentException("interactionMethod cannot be null.", null);
        }
    }

    @Override
    public void invokeSimple() {
        if (mMethod.getCallback() == null) return;

        mMethod.getCallback().onBegin(mMethod.getTag());
        Map<String, String> token = setRequestHeader();
        HttpUtil.getResult(mMethod.getTag(),
                mMethod.getRequestMethod().ordinal(),
                mMethod.getDomain() + mMethod.getUrl(),
                token,
                mMethod.getParams(), mMethod.getJsonObject(),
                mMethod.getHeaderListener(),
                new HttpUtil.Callback() {
                    @Override
                    public void onSuccess(Object data) {
                        mMethod.getCallback().onSuccess(data);
                    }

                    @Override
                    public void onFailure(SimpleBean result) {
                        mMethod.getCallback().onFailure(result);
                        checkToken(mMethod, result);
                    }

                    @Override
                    public void onError(SimpleBean error) {
                        mMethod.getCallback().onError(error);
                    }

                    @Override
                    public void onProgress(int progress, int max) {
                        mMethod.getCallback().onProgress(progress, max);
                    }
                });
    }

    @Override
    public void invokeOriginal() {
        if (mMethod.getCallback() == null) return;

        mMethod.getCallback().onBegin(mMethod.getTag());
        Map<String, String> token = setRequestHeader();
        HttpUtil.getOriginalResult(mMethod.getTag(),
                mMethod.getRequestMethod().ordinal(),
                mMethod.getDomain() + mMethod.getUrl(),
                token,
                mMethod.getParams(), mMethod.getJsonObject(),
                JsonObject.class,
                mMethod.getHeaderListener(),
                new HttpUtil.Callback<JsonObject>() {
                    @Override
                    public void onSuccess(JsonObject data) {
                        mMethod.getCallback().onSuccess(data);
                    }

                    @Override
                    public void onFailure(SimpleBean result) {
                        mMethod.getCallback().onFailure(result);
                        checkToken(mMethod, result);
                    }

                    @Override
                    public void onError(SimpleBean error) {
                        mMethod.getCallback().onError(error);
                    }

                    @Override
                    public void onProgress(int progress, int max) {
                        mMethod.getCallback().onProgress(progress, max);
                    }
                });
    }

    @Override
    public void invokeBean() {
        if (mMethod.getCallback() == null) return;
        mMethod.getCallback().onBegin(mMethod.getTag());
        Map<String, String> token = setRequestHeader();

        HttpUtil.getData(mMethod.getTag(),
                mMethod.getRequestMethod().ordinal(),
                mMethod.getDomain() + mMethod.getUrl(),
                token, mMethod.getParams(),
                mMethod.getJsonObject(), mMethod.getClazz(),
                mMethod.getHeaderListener(),
                new HttpUtil.Callback() {
                    @Override
                    public void onSuccess(Object data) {
                        mMethod.getCallback().onSuccess(data);
                    }

                    @Override
                    public void onFailure(SimpleBean result) {
                        mMethod.getCallback().onFailure(result);
                        checkToken(mMethod, result);
                    }

                    @Override
                    public void onError(SimpleBean error) {
                        mMethod.getCallback().onError(error);
                    }

                    @Override
                    public void onProgress(int progress, int max) {
                        mMethod.getCallback().onProgress(progress, max);
                    }
                });
    }

    @Override
    public void invokeListBean() {
        if (mMethod.getCallback() == null) return;

        mMethod.getCallback().onBegin(mMethod.getTag());
        Map<String, String> token = setRequestHeader();
        HttpUtil.getListData(mMethod.getTag(),
                mMethod.getRequestMethod().ordinal(),
                mMethod.getDomain() + mMethod.getUrl(),
                token, mMethod.getParams(),
                mMethod.getJsonObject(), mMethod.getClazz(),
                mMethod.getHeaderListener(),
                new HttpUtil.Callback() {
                    @Override
                    public void onSuccess(Object data) {
                        mMethod.getCallback().onSuccess(data);
                    }

                    @Override
                    public void onFailure(SimpleBean result) {
                        mMethod.getCallback().onFailure(result);
                        checkToken(mMethod, result);
                    }

                    @Override
                    public void onError(SimpleBean error) {
                        mMethod.getCallback().onError(error);
                    }

                    @Override
                    public void onProgress(int progress, int max) {
                        mMethod.getCallback().onProgress(progress, max);
                    }
                });
    }

    /**
     * 上传单张图片
     * 返回Result里面的DataMap对象，且DataMap为JsonObject
     *
     * @see SimpleBean
     */
    @Override
    void invokeUploadImage() {
        if (mMethod.getCallback() == null) return;
        mMethod.getCallback().onBegin(mMethod.getTag());
        String path = mMethod.getImage();
        if (StringUtil.isEmpty(path)) return;
        Map<String, String> token = setRequestHeader();

        HttpUtil.uploadImageMultipart(mMethod.getTag(),
                mMethod.getDomain() + mMethod.getUrl(),
                UPLOAD_FILE_NAME,
                path,
                token,
                mMethod.getParams(),
                mMethod.getClazz(),
                new HttpUtil.Callback() {
                    @Override
                    public void onSuccess(Object data) {
                        mMethod.getCallback().onSuccess(data);
                    }

                    @Override
                    public void onFailure(SimpleBean result) {
                        mMethod.getCallback().onFailure(result);
                        checkToken(mMethod, result);
                    }

                    @Override
                    public void onError(SimpleBean error) {
                        mMethod.getCallback().onError(error);
                    }

                    @Override
                    public void onProgress(int progress, int max) {
                        mMethod.getCallback().onProgress(progress, max);
                    }
                });
    }

    /**
     * 上传多张图片
     * 返回Result里面的DataMap对象，且DataMap为JsonObject
     *
     * @see SimpleBean
     */
    @Override
    void invokeUploadImages() {
        if (mMethod.getCallback() == null) return;
        mMethod.getCallback().onBegin(mMethod.getTag());
        List<String> pathList = mMethod.getImages();
        if (pathList == null) return;

        Map<String, String> token = setRequestHeader();
        HttpUtil.uploadImagesWithUrlsMultipart(mMethod.getTag(),
                mMethod.getDomain() + mMethod.getUrl(),
                Constant.UPLOAD_FILES_NAME,
                pathList,
                token,
                mMethod.getParams(),
                mMethod.getClazz(),
                new HttpUtil.Callback() {
                    @Override
                    public void onSuccess(Object data) {
                        mMethod.getCallback().onSuccess(data);
                    }

                    @Override
                    public void onFailure(SimpleBean result) {
                        mMethod.getCallback().onFailure(result);
                        checkToken(mMethod, result);
                    }

                    @Override
                    public void onError(SimpleBean error) {
                        mMethod.getCallback().onError(error);
                    }

                    @Override
                    public void onProgress(int progress, int max) {
                        mMethod.getCallback().onProgress(progress, max);
                    }
                });
    }

    /**
     * 未登录统一处理，登录成功后重新发起请求
     */
    private void checkToken(final InteractionMethod method, SimpleBean result) {
        if (result != null && HttpCode.UN_LOGIN.equals(result.getCode())) {
            BaseFoundation.getApp().onLogOutByTime();
            LoginBroadcastReceiver.addListener(new LoginBroadcastReceiver.LoginListener() {
                @Override
                public void onSuccess() {
                    switch (method.getResultType()) {
                        case SIMPLE:
                            invokeSimple();
                            break;
                        case ORIGINAL:
                            invokeOriginal();
                            break;
                        case BEAN:
                            invokeBean();
                            break;
                        case LIST_BEAN:
                            invokeListBean();
                            break;
                        case UPLOAD_BEAN:
                            invokeUploadImage();
                            break;
                        case UPLOAD_LIST_BEAN:
                            invokeUploadImages();
                            break;
                    }
                }
            });
        }
    }

    /**
     * 设置请求头信息
     */
    private Map<String, String> setRequestHeader() {
        Map<String, String> token = Repository.getLocalMap(BaseLocalKey.X_TOKEN);
        if (token == null) {
            token = new ArrayMap<>();
        }
        String cityCode = Repository.getLocalValue(LocalKey.CITY_CODE);
        token.put("locationCode", cityCode);
        return token;
    }
}
