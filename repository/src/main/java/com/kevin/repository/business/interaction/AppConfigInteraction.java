package com.kevin.repository.business.interaction;

import com.google.gson.JsonObject;
import com.kevin.repository.Domain;
import com.kevin.repository.business.bean.UpdateWrapBean;
import com.kevin.repository.business.interaction.constant.AppConfigUrl;
import com.kevin.repository.framework.interaction.ICallback;
import com.kevin.repository.framework.interaction.QueryCallBack;
import com.kevin.repository.framework.interaction.QueryClass;
import com.kevin.repository.framework.interaction.QueryJson;
import com.kevin.repository.framework.interaction.QueryTag;
import com.kevin.repository.framework.interaction.RequestMapping;
import com.kevin.repository.framework.interaction.RequestMethod;
import com.kevin.repository.framework.interaction.ResultType;
import com.kevin.repository.framework.interaction.Server;

/**
 * Created by kevin on 2018/11/29.
 * descript：App 配置
 */
@Server(Domain.APP_CONFIG_URL)
public interface AppConfigInteraction {

    @RequestMapping(
            value = AppConfigUrl.APP_UPDATE_INFO,
            method = RequestMethod.POST,
            type = ResultType.BEAN)
    void checkVersion(@QueryTag Object tag, @QueryJson JsonObject params, @QueryClass Class<?> clazz, @QueryCallBack ICallback<UpdateWrapBean> callback);
}