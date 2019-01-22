package com.kevin.repository.business.interaction;

import com.google.gson.JsonObject;
import com.kevin.base.utils.http.SimpleBean;
import com.kevin.repository.Domain;
import com.kevin.repository.business.interaction.constant.DesignerUrl;
import com.kevin.repository.business.kevin.bean.ActiveInfoListBean;
import com.kevin.repository.business.kevin.bean.AnswersDetailsBean;
import com.kevin.repository.business.kevin.bean.AuditedDesignerInfoBean;
import com.kevin.repository.business.kevin.bean.AuthorDetailBean;
import com.kevin.repository.business.kevin.bean.DesignCompanyBean;
import com.kevin.repository.business.kevin.bean.DesignerAnswerListBean;
import com.kevin.repository.business.kevin.bean.DesignerInfoBean;
import com.kevin.repository.business.kevin.bean.DesignerLoginResultBean;
import com.kevin.repository.business.kevin.bean.DesignerMainBean;
import com.kevin.repository.business.kevin.bean.DesignerQuestionListBean;
import com.kevin.repository.business.kevin.bean.HomeListBean;
import com.kevin.repository.business.kevin.bean.IssueTagBean;
import com.kevin.repository.business.kevin.bean.JoinActivesResultBean;
import com.kevin.repository.business.kevin.bean.LocationBean;
import com.kevin.repository.business.kevin.bean.MallBean;
import com.kevin.repository.business.kevin.bean.MessageListBean;
import com.kevin.repository.business.kevin.bean.MyActivesListBean;
import com.kevin.repository.business.kevin.bean.MyAttentionBean;
import com.kevin.repository.business.kevin.bean.MyOrderListBean;
import com.kevin.repository.business.kevin.bean.NewestBean;
import com.kevin.repository.business.kevin.bean.OrderDetailsBean;
import com.kevin.repository.business.kevin.bean.RecommendBean;
import com.kevin.repository.business.kevin.bean.SponsorInfoBean;
import com.kevin.repository.business.kevin.bean.StarCoinLogsBean;
import com.kevin.repository.business.kevin.bean.StarCoinTaskBean;
import com.kevin.repository.framework.interaction.ICallback;
import com.kevin.repository.framework.interaction.QueryCallBack;
import com.kevin.repository.framework.interaction.QueryClass;
import com.kevin.repository.framework.interaction.QueryJson;
import com.kevin.repository.framework.interaction.QueryMap;
import com.kevin.repository.framework.interaction.QueryString;
import com.kevin.repository.framework.interaction.QueryTag;
import com.kevin.repository.framework.interaction.RequestMapping;
import com.kevin.repository.framework.interaction.RequestMethod;
import com.kevin.repository.framework.interaction.ResultType;
import com.kevin.repository.framework.interaction.Server;

import java.util.List;
import java.util.Map;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */
@Server(Domain.APP_CONFIG_URL)
public interface DesignerInteraction {

    //设计师入驻
    @RequestMapping(
            value = DesignerUrl.POST_RESIDENT_DESIGNER,
            method = RequestMethod.POST,
            type = ResultType.BEAN)
    void postResidentDesigner(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                              @QueryCallBack ICallback<DesignerLoginResultBean> callback);

    //首页
    @RequestMapping(
            value = DesignerUrl.GET_DESIGNER_MAIN,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getDesignerMain(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                         @QueryCallBack ICallback<DesignerMainBean> callback);

    //问答首页-获取问题标签
    @RequestMapping(
            value = DesignerUrl.GET_ISSUE_LABEL_LIST,
            method = RequestMethod.GET,
            type = ResultType.LIST_BEAN)
    void getIssueLabelList(@QueryTag Object tag, @QueryClass Class<?> clazz, @QueryCallBack
            ICallback<List<IssueTagBean>> callback);

    //问答首页-最新
    @RequestMapping(
            value = DesignerUrl.GET_ISSUE_NEWEST_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getIssueNewestList(@QueryTag Object tag, @QueryMap Map<String, String> params
            , @QueryClass Class<?> clazz, @QueryCallBack ICallback<NewestBean> callback);

    //活动报名
    @RequestMapping(
            value = DesignerUrl.joinActives,
            method = RequestMethod.POST,
            type = ResultType.BEAN)
    void joinActives(@QueryTag Object tag, @QueryString("showId") String showId, @QueryClass Class<?> clazz,
                     @QueryCallBack ICallback<JoinActivesResultBean> callback);

    //取消报名
    @RequestMapping(
            value = DesignerUrl.cancelActives,
            method = RequestMethod.POST,
            type = ResultType.SIMPLE)
    void cancelActives(@QueryTag Object tag, @QueryString("showId") String showId, @QueryClass Class<?> clazz,
                       @QueryCallBack ICallback<SimpleBean> callback);

    //我的活动列表
    @RequestMapping(
            value = DesignerUrl.myActivesList,
            method = RequestMethod.POST,
            type = ResultType.BEAN)
    void myActivesList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                       @QueryCallBack ICallback<MyActivesListBean> callback);

    //设计师资料
    @RequestMapping(
            value = DesignerUrl.designerInfo,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getDesignerInfo(@QueryTag Object tag, @QueryClass Class<?> clazz, @QueryCallBack ICallback<DesignerInfoBean>
            callback);

    //认证后的设计师信息
    @RequestMapping(
            value = DesignerUrl.GET_AUDITED_DESIGNER_INFO,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getAuditedDesignerInfo(@QueryTag Object tag, @QueryClass Class<?> clazz, @QueryCallBack
            ICallback<AuditedDesignerInfoBean> callback);

    // 编辑设计师(我的)信息
    @RequestMapping(
            value = DesignerUrl.POST_EDIT_DESIGNER_INFO,
            method = RequestMethod.POST,
            type = ResultType.SIMPLE)
    void postDesignerInfo(@QueryTag Object tag, @QueryJson JsonObject jsonObject, @QueryClass Class<?> clazz,
                          @QueryCallBack ICallback<SimpleBean> callback);

    // 提交设计师审核信息
    @RequestMapping(
            value = DesignerUrl.POST_SUBMIT_DESIGNER_INFO,
            method = RequestMethod.POST,
            type = ResultType.SIMPLE)
    void submitDesignerInfo(@QueryTag Object tag, @QueryJson JsonObject jsonObject, @QueryClass Class<?> clazz,
                            @QueryCallBack ICallback<SimpleBean> callback);

    @RequestMapping(
            value = DesignerUrl.cityList,
            method = RequestMethod.GET,
            type = ResultType.LIST_BEAN)
    void getCity(@QueryTag Object tag, @QueryClass Class<?> clazz, @QueryCallBack ICallback<List<LocationBean>>
            callback);

    //星币详情
    @RequestMapping(
            value = DesignerUrl.SCORE_AND_TASK_DETAIL,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void scoreAndTaskDetail(@QueryTag Object tag, @QueryClass Class<?> clazz, @QueryCallBack
            ICallback<StarCoinTaskBean> callback);

    //星币收支明细
    @RequestMapping(
            value = DesignerUrl.STAR_COIN_LOG,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getStarCoinLogs(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                         @QueryCallBack ICallback<StarCoinLogsBean> callback);

    //添加星币
    @RequestMapping(
            value = DesignerUrl.ADD_DESIGNER_SCORE,
            method = RequestMethod.POST,
            type = ResultType.SIMPLE)
    void addDesignerScore(@QueryTag Object tag, @QueryString("type") String type, @QueryClass Class<?> clazz,
                          @QueryCallBack ICallback<SimpleBean> callback);

    @RequestMapping(
            value = DesignerUrl.ISSUE_RECOMMEND,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getIssueRecommendList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?>
            clazz, @QueryCallBack ICallback<RecommendBean> callback);
//
//    //数据字典
//    @RequestMapping(
//            value = DesignerUrl.DICTIONARY_LIST,
//            method = RequestMethod.GET,
//            type = ResultType.LIST_BEAN)
//    void getDictionaryList(@QueryTag Object tag, @QueryString("typeIds") String typeIds, @QueryClass Class<?> clazz,
//                           @QueryCallBack ICallback<List<DictionaryBean>> callback);

    //公司列表
    @RequestMapping(
            value = DesignerUrl.COMPANY_LIST,
            method = RequestMethod.GET,
            type = ResultType.LIST_BEAN)
    void getCompanyList(@QueryTag Object tag, @QueryString("keyWord") String keyWord, @QueryClass Class<?> clazz,
                        @QueryCallBack ICallback<List<DesignCompanyBean>> callback);

    //商场列表
    @RequestMapping(
            value = DesignerUrl.MALL_LIST,
            method = RequestMethod.GET,
            type = ResultType.LIST_BEAN)
    void getMallList(@QueryTag Object tag, @QueryString("keyWord") String keyWord, @QueryClass Class<?> clazz,
                     @QueryCallBack ICallback<List<MallBean>> callback);

    //热门商场
    @RequestMapping(
            value = DesignerUrl.MALL_LIST,
            method = RequestMethod.GET,
            type = ResultType.LIST_BEAN)
    void getHotList(@QueryTag Object tag, @QueryClass Class<?> clazz, @QueryCallBack ICallback<List<MallBean>>
            callback);

    //首页
    @RequestMapping(
            value = DesignerUrl.GET_DESIGNER_MAIN,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getHomeList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                     @QueryCallBack ICallback<HomeListBean> callback);

    //回答人详情
    @RequestMapping(
            value = DesignerUrl.ANSWERS_DETAILS,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getAnswersDetails(@QueryTag Object tag, @QueryString("id") String id, @QueryClass Class<?> clazz,
                           @QueryCallBack ICallback<AnswersDetailsBean> callback);

    //设计师回答列表
    @RequestMapping(
            value = DesignerUrl.DESIGNER_ANSWER_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getDesignerAnswerList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?>
            clazz, @QueryCallBack ICallback<DesignerAnswerListBean> callback);

    //设计师问题列表
    @RequestMapping(
            value = DesignerUrl.GET_ISSUE_NEWEST_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getDesignerQuestionList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?>
            clazz, @QueryCallBack ICallback<DesignerQuestionListBean> callback);

    /*活动列表信息*/
    @RequestMapping(
            value = DesignerUrl.GET_STAR_SHOW_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getactivitiesList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                           @QueryCallBack ICallback<ActiveInfoListBean> callback);

    /*赛事举办方信息*/
    @RequestMapping(
            value = DesignerUrl.GET_SPONSOR_INFO,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getSponsorInfo(@QueryTag Object tag, @QueryString("sponsorId") String sponsorId, @QueryClass Class<?> clazz,
                        @QueryCallBack ICallback<SponsorInfoBean> callback);

    //作者详情
    @RequestMapping(
            value = DesignerUrl.AUTHOR_DETAIL,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getAuthorDetail(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                         @QueryCallBack ICallback<AuthorDetailBean> callback);

    //新增提问
    @RequestMapping(
            value = DesignerUrl.ASKING_ADD,
            method = RequestMethod.POST,
            type = ResultType.SIMPLE)
    void askingAdd(@QueryTag Object tag
            , @QueryJson JsonObject jsonObject
            , @QueryClass Class<?> clazz
            , @QueryCallBack ICallback<SimpleBean> callback);

    //新增回答
    @RequestMapping(
            value = DesignerUrl.ANSWER_ADD,
            method = RequestMethod.POST,
            type = ResultType.SIMPLE)
    void answerAdd(@QueryTag Object tag
            , @QueryJson JsonObject jsonObject
            , @QueryClass Class<?> clazz
            , @QueryCallBack ICallback<SimpleBean> callback);

//    //标签信息
//    @RequestMapping(
//            value = DesignerUrl.LABELINFO,
//            method = RequestMethod.GET,
//            type = ResultType.BEAN)
//    void getLabelInfo(@QueryTag Object tag, @QueryString("labelId") String labelId, @QueryClass Class<?> clazz,
//                      @QueryCallBack ICallback<TagDetailBean> callback);

    //个人中心--我的订单
    @RequestMapping(
            value = DesignerUrl.MY_ORDER_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getMyOrderList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                        @QueryCallBack ICallback<MyOrderListBean> callback);

    //消息列表
    @RequestMapping(
            value = DesignerUrl.MESSAGE_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getMessageList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                        @QueryCallBack ICallback<MessageListBean> callback);

    //订单详情
    @RequestMapping(
            value = DesignerUrl.ORDER_DETAIL,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getOrderDetails(@QueryTag Object tag, @QueryString("id") String id, @QueryClass Class<?> clazz,
                         @QueryCallBack ICallback<OrderDetailsBean> callback);

    //获取我的关注
    @RequestMapping(
            value = DesignerUrl.MY_ATTENTION,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getMyAttention(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                        @QueryCallBack ICallback<MyAttentionBean> callback);

    //获取设计师的关注
    @RequestMapping(
            value = DesignerUrl.DESIGNER_ATTENTION,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getDesignerAttention(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                              @QueryCallBack ICallback<MyAttentionBean> callback);

    //获取关注某个对象的用户列表
    @RequestMapping(
            value = DesignerUrl.FOLLOWEE_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getFolloweeList(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz,
                         @QueryCallBack ICallback<MyAttentionBean> callback);

    //我参与的活动
    @RequestMapping(
            value = DesignerUrl.GET_MY_LIST,
            method = RequestMethod.GET,
            type = ResultType.BEAN)
    void getMyActiviesInfo(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz, @QueryCallBack ICallback<ActiveInfoListBean> callback);

    //更新订单状态
    @RequestMapping(
            value = DesignerUrl.UPDATE_STATUS,
            method = RequestMethod.GET,
            type = ResultType.SIMPLE)
    void updateStatus(@QueryTag Object tag, @QueryMap Map<String, String> params, @QueryClass Class<?> clazz, @QueryCallBack ICallback<SimpleBean> callback);



}
