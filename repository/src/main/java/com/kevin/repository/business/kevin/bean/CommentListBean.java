package com.kevin.repository.business.kevin.bean;

import java.util.ArrayList;

/**
 * Created by shijia on 2017/8/30.
 */

public class CommentListBean {
    private int page;
    private int totalElements;
    private ArrayList<ListBean> data;
    private int totalPage;

   public static class ListBean{
        private int id;
        private String createDate;
        private String objectType;
        private String objectId;//点评对象的业务ID
        private String objectName;
        private Float score;//该评价的总分数
        private String userObject;//用户来源
        private String userId;//用户ID
        private String nickName;//用户昵称
        private float totalScore;
        private boolean showData;
        private String comment;//评价内容
        private String picture;//评价图片
        private int likedNumber;//该评论的点赞数
        private String headerUrl;// 用户头像的URL 由用户中心提供的相对路径.使用请补全URL
        private String extendColumnOne;//扩展字段
        private String extendColumnTwo;
        private String extendColumnThree;
        private String extendColumnFour;
        private String extendColumnFive;
        private boolean auth;
//        private ArrayList<ReviewDetailsBean> redstarReviewDetails;//评价标签明细
//        private ArrayList<ReviewRepliesBean> redstarReviewReplies;//点评回复列表
//        private List<RedstarAppendReviewsBean> redstarAppendReviews;//商品追评
//        private ReviewObjectBean reviewObject;//评论对象的一些数据
        private boolean userLiked;

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public String getCreateDate() {
           return createDate;
       }

       public void setCreateDate(String createDate) {
           this.createDate = createDate;
       }

       public String getObjectType() {
           return objectType;
       }

       public void setObjectType(String objectType) {
           this.objectType = objectType;
       }

       public String getObjectId() {
           return objectId;
       }

       public void setObjectId(String objectId) {
           this.objectId = objectId;
       }

       public String getObjectName() {
           return objectName;
       }

       public void setObjectName(String objectName) {
           this.objectName = objectName;
       }

       public Float getScore() {
           return score;
       }

       public void setScore(Float score) {
           this.score = score;
       }

       public String getUserObject() {
           return userObject;
       }

       public void setUserObject(String userObject) {
           this.userObject = userObject;
       }

       public String getUserId() {
           return userId;
       }

       public void setUserId(String userId) {
           this.userId = userId;
       }

       public String getNickName() {
           return nickName;
       }

       public void setNickName(String nickName) {
           this.nickName = nickName;
       }

       public float getTotalScore() {
           return totalScore;
       }

       public void setTotalScore(float totalScore) {
           this.totalScore = totalScore;
       }

       public boolean isShowData() {
           return showData;
       }

       public void setShowData(boolean showData) {
           this.showData = showData;
       }

       public String getComment() {
           return comment;
       }

       public void setComment(String comment) {
           this.comment = comment;
       }

       public String getPicture() {
           return picture;
       }

       public void setPicture(String picture) {
           this.picture = picture;
       }

       public int getLikedNumber() {
           return likedNumber;
       }

       public void setLikedNumber(int likedNumber) {
           this.likedNumber = likedNumber;
       }

       public String getHeaderUrl() {
           return headerUrl;
       }

       public void setHeaderUrl(String headerUrl) {
           this.headerUrl = headerUrl;
       }

       public String getExtendColumnOne() {
           return extendColumnOne;
       }

       public void setExtendColumnOne(String extendColumnOne) {
           this.extendColumnOne = extendColumnOne;
       }

       public String getExtendColumnTwo() {
           return extendColumnTwo;
       }

       public void setExtendColumnTwo(String extendColumnTwo) {
           this.extendColumnTwo = extendColumnTwo;
       }

       public String getExtendColumnThree() {
           return extendColumnThree;
       }

       public void setExtendColumnThree(String extendColumnThree) {
           this.extendColumnThree = extendColumnThree;
       }

       public String getExtendColumnFour() {
           return extendColumnFour;
       }

       public void setExtendColumnFour(String extendColumnFour) {
           this.extendColumnFour = extendColumnFour;
       }

       public String getExtendColumnFive() {
           return extendColumnFive;
       }

       public void setExtendColumnFive(String extendColumnFive) {
           this.extendColumnFive = extendColumnFive;
       }

       public boolean isAuth() {
           return auth;
       }

       public void setAuth(boolean auth) {
           this.auth = auth;
       }

       public boolean isUserLiked() {
           return userLiked;
       }

       public void setUserLiked(boolean userLiked) {
           this.userLiked = userLiked;
       }
   }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public ArrayList<ListBean> getData() {
        return data;
    }

    public void setData(ArrayList<ListBean> data) {
        this.data = data;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
