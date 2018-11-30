package com.kevin.repository.framework.interaction;

/**
 * Created by kevin on 2018/11/29.
 * descript：可以根据具体项目需求实现自己的CallAdapter
 */

public abstract class CallAdapter {
    public final InteractionMethod mMethod;

    public CallAdapter(InteractionMethod interactionMethod) {
        mMethod = interactionMethod;
    }

    /**
     * 返回服务器定义的原始对象，且原始对象为simpleBean
     *
     * @see com.kevin.base.utils.http.SimpleBean
     */
    abstract void invokeSimple();

    /**
     * 返回服务器定义的原始对象
     */
    abstract void invokeOriginal();

    /**
     * 返回Result里面的DataMap对象，且DataMap为JsonObject
     */
    abstract void invokeBean();

    /**
     * 返回Result里面的DataMap对象List，且DataMap为JsonArray
     */
    abstract void invokeListBean();

    /**
     * 上传单张图片
     * 返回Result里面的DataMap对象，且DataMap为JsonObject
     *
     * @see com.kevin.base.utils.http.SimpleBean
     */
    abstract void invokeUploadImage();

    /**
     * 上传多张图片
     * 返回Result里面的DataMap对象，且DataMap为JsonObject
     *
     * @see SimpleBean
     */
    abstract void invokeUploadImages();
}
