package com.kevin.repository.framework.binding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.kevin.base.utils.LogUtil;
import com.kevin.base.utils.StringUtil;
import com.kevin.repository.business.local.LocalKey;
import com.kevin.repository.framework.Repository;

import java.util.Map;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by kevin on 2018/11/29.
 * descript：图片加载绑定
 */

public class DataBindingAdapters {
    @BindingAdapter({"android:src"})
    public static void setImageResource(ImageView imageView,int resource){
        imageView.setImageResource(resource);
    }

    @BindingAdapter({"gifSrc"})
    public static void setGifSrc(ImageView imageView ,int gif){
        Glide.with(imageView.getContext()).load(gif).asGif().diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }

    @BindingAdapter(value = {"imageUrl", "error", "placeholder"}, requireAll = false)
    public static void setImageUrl(ImageView view, String imageUrl, Drawable error, Drawable placeholder) {
        Context context = view.getContext();
        //考虑C端有第三方授权登录，所以头像由后台统一处理
/*        if (StringUtil.isNotEmpty(imageUrl) && imageUrl.startsWith("http")) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (imageUrl.endsWith("!")) {
                imageUrl = imageUrl.substring(0, imageUrl.length() - 1);
            }
            imageUrl = imageUrl + "." + (layoutParams.width > 0 ? layoutParams.width : view.getWidth()) + "x" +
                    (layoutParams.height > 0 ? layoutParams.height : view.getHeight()) + ".jpg!";//头像加感叹号去掉水印
        }*/
        LogUtil.d("setImageUrl = " + imageUrl);
        Glide.with(context)
                .load(imageUrl)      //设置图片路径
                .error(error)           //设置错误图片
                .placeholder(placeholder)     //设置占位图片
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .bitmapTransform(new CropCircleTransformation(context))
                .into(view);
    }

    @BindingAdapter(value = {"imageCodeUrl", "error", "placeholder"}, requireAll = false)
    public static void setImageCodeUrl(final ImageView view, String imageCodeUrl, Drawable error, Drawable placeholder) {
        if (StringUtil.isEmpty(imageCodeUrl)) return;
        Context context = view.getContext();
        GlideUrl glideUrl = null;
        final Map<String, String> headers = Repository.getLocalMap(LocalKey.X_TOKEN);
        LogUtil.d("setImageCodeUrl = " + imageCodeUrl);

        if (imageCodeUrl.startsWith("http") && (headers != null)) {
            glideUrl = new GlideUrl(imageCodeUrl, new Headers() {
                @Override
                public Map<String, String> getHeaders() {
                    return headers;
                }
            });
        }

        Glide.with(context)
                .load(glideUrl == null ? imageCodeUrl : glideUrl)      //设置图片路径
                .error(error)           //设置错误图片
                .placeholder(placeholder)     //设置占位图片
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(view);
    }


}
