package com.kevin.repository.business.local;

import com.kevin.repository.framework.local.BaseLocalKey;

/**
 * Created by kevin on 2018/11/29.
 * descript：本地数据存储
 * 目前只提供sharePreference方式
 */

public interface LocalKey extends BaseLocalKey {
    String IS_OLD_USER = BASE + "is_old_user";
    String PHONE_NUMBER = BASE + "phone_number";
    String REFORM_ITEMS = BASE + "reform_items";//数据字典取回来的整改区域
    String USER_LOCATION = "user_location";//用户地区信息
    String CITY_CODE = "city_code";// 城市code
    String DESIGNER_ID = "designer_id";// 城市code
    String DESIGNER_NAME = "designer_info";// 城市code
    String DESIGNER_MAIN_VIEW_MODEL = "designer_main_view_model";// 缓存首页数据
    String MY_ACTIVES_VIEW_MODEL = "my_actives_view_model";// 缓存我的活动数据
    String SEARCH_HISTORY = "search_history";//问答搜索历史
    String ALL_CITY = "all_city";//缓存城市数据
    String HOT_CITY = "hot_city";//缓存城市数据
}
