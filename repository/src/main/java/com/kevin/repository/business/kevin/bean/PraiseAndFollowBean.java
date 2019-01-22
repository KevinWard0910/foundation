package com.kevin.repository.business.kevin.bean;

/**
 * Created by jiquan.zhong on 2018/1/12.
 * 点赞关注返回的结果
 */

public class PraiseAndFollowBean {
    private int status;//点赞/关注状态 0：未点赞/关注 1：已点赞/关注
    private int totalNum;//点赞/关注总数

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
