package com.kevin.repository.business.interaction.constant;

/**
 * Created by cody.yi on 2017/5/17.
 * 家装 url
 */
public interface DesignerUrl {
    String GET_DESIGNER_MAIN = "/designerApp/index/list"; // 星设计app首页详情获取

    String GET_LOCATION_CITY_LIST = "/common/hxCityList"; // 城市列表
    String GET_SPONSOR_INFO = "/designerApp/sponsor/info"; // 赛事发起方详情
    String PRAISEORFOLLOW = "/designerApp/tendency/praiseOrFollow"; // 点赞/取消点赞操作


    /* user 路径下接口 */
    String ANSWERS_DETAILS = "/designerApp/user/userDetail"; // 回答人详情页
    String MY_ATTENTION = "/designerApp/user/myAttention"; // 获取我的关注
    String DESIGNER_ATTENTION = "/designerApp/user/designerAttention"; // 获取设计师的关注
    String FOLLOWEE_LIST = "/designerApp/user/userList"; // 获取关注某个对象的用户列表
    String USER_LIST = "/designerApp/user/userList"; // 获取关注某个对象的用户列表
    String MY_DETAIL = "/designerApp/user/myDetail"; // 我的问答详情
    String MY_ORDER_LIST = "/designerApp/order/orderList";

    /* starShow */
    String GET_STAR_SHOW_LIST = "/designerApp/starShow/list"; // 赛事/沙龙列表信息
    String GET_MY_LIST = "/designerApp/starShow/myList"; // 获取我参与的活动
    String GET_STARSHOW_INFO = "/designerApp/starShow/info"; // 赛事/沙龙详情
    String STARSHOW_ENTER = "/designerApp/starShow/enter"; // 活动报名

    /* designerApp 路径下接口 */
    String COMPANY_LIST = "/designerApp/companyList";//公司列表
    String MALL_LIST = "/designerApp/mallInfo";//商场列表

    /* asking 路径下接口 */
    String DESIGNER_ANSWER_LIST = "/designerApp/asking/designerAnswerList"; // 设计师回答列表
    String ISSUE_RECOMMEND = "/designerApp/asking/recommendList"; // 问答首页-推荐
    String GET_ISSUE_LABEL_LIST = "/designerApp/asking/lableList"; // 问答首页-获取问题标签
    String GET_ISSUE_NEWEST_LIST = "/designerApp/asking/newList"; // 问答首页-最新
    String ASKING_ADD = "/designerApp/asking/askingAdd"; // 新增问题
    String ASKING_INFO = "/designerApp/asking/askingInfo"; // 问题描述
    String ANSWER_ADD = "/designerApp/asking/answerAdd"; // 新增回答
    String ANSWER_LIST = "/designerApp/asking/answerList"; // 问题-回答列表
    String LABELINFO = "/designerApp/asking/labelInfo"; // 标签详情
    String ANSWER_SEARCH = "/designerApp/asking/search"; // 问题搜索

    /* comment 路径下接口 */
    String ADD_COMMENT = "/designerApp/comment/addComment"; // 留言评论新增
    String COMMENT_LIST = "/designerApp/comment/commentList"; // 留言评论列表

    /* article 路径下接口 */
    String AUTHOR_DETAIL = "/designerApp/article/authorDetail"; // 获取作者详情
    String ARTICLE_DETAIL = "/designerApp/article/detail"; // 获取文章详情
    String ARTICLE_LIST = "/designerApp/article/list"; // 获取文章列表

    /* activity 路径下接口 */
    String cityList = "/designerApp/activity/city"; // 城市列表
    String joinActives = "/designerApp/activity/enter"; // 报名
    String myActivesList = "/designerApp/activity/myList"; // 我的活动列表
    String cancelActives = "/designerApp/activity/cancel"; // 取消报名

    /* designer 路径下接口 */
    String POST_RESIDENT_DESIGNER = "/designerApp/designer/add"; // 设计师入驻
    String designerInfo = "/designerApp/designer/myDetail"; // 设计师资料
    String POST_EDIT_DESIGNER_INFO = "/designerApp/designer/edit"; // 编辑设计师(我的)信息
    String POST_SUBMIT_DESIGNER_INFO = "/designerApp/designer/addInfo"; // 提交设计师审核信息
    String GET_AUDITED_DESIGNER_INFO = "/designerApp/designer/info"; // 获取设计师信息

    /* score 路径下接口 */
    String SCORE_AND_TASK_DETAIL = "/designerApp/score/scoreAndTaskDetail";
    String STAR_COIN_LOG = "/designerApp/score/log";
    String ADD_DESIGNER_SCORE = "/designerApp/score/addDesignerScore";

    /* order 路径下接口 */
    String ORDER_DETAIL = "/designerApp/order/orderDetail"; // 我的订单详情
    String ORDER_LIST = "/designerApp/order/orderList"; // 获取我的订单列表
    String UPDATE_STATUS = "/designerApp/order/updateStatus"; // 更新订单状态


    /* 主App 端接口 */
    String HX_CITY_LIST = "/common/hxCityList"; // 热门城市列表
    String SERVICE_AREA_LIST = "/designerService/show"; // 服务区域列表
    String DICTIONARY_LIST = "/c/data/list"; // 数据字典
    /* 消息 */
    String MESSAGE_LIST = "/designerApp/message/list";//首页-消息列表
    // 推送
    String PUSH_USER_CENTER = "/message/city/register";
}
