package com.kevin.repository.business.kevin.bean;

/**
 * Created by shijia on 2018/1/6.
 */

public class IssueWrapperBean {
    private int type;
    private RecommendBean.RecordsBean data;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public RecommendBean.RecordsBean getData() {
        return data;
    }

    public void setData(RecommendBean.RecordsBean data) {
        this.data = data;
    }
}
