package com.kevin.repository.business.kevin.bean;

/**
 * Created by jiquan.zhong on 2018/1/9.
 * 问答搜索结果
 */

public class QASearchBean {

    private int askId;
    private String askContent;
    private int answerCounts;
    private String tags;
    private String createDate;
    private int isAnswer;//是否回答过该问题:0,否;1,是 ,
    private int isAsk;// 是否提问过此问题:0,否;1,是

    public int getAskId() {
        return askId;
    }

    public void setAskId(int askId) {
        this.askId = askId;
    }

    public String getAskContent() {
        return askContent;
    }

    public void setAskContent(String askContent) {
        this.askContent = askContent;
    }

    public int getAnswerCounts() {
        return answerCounts;
    }

    public void setAnswerCounts(int answerCounts) {
        this.answerCounts = answerCounts;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(int isAnswer) {
        this.isAnswer = isAnswer;
    }

    public int getIsAsk() {
        return isAsk;
    }

    public void setIsAsk(int isAsk) {
        this.isAsk = isAsk;
    }
}
