package com.kevin.repository.business.kevin.bean;

/**
 * Created by shijia on 2018/1/11.
 */

public class AnswersDetailsBean {

    private int id;
    private String name;
    private String avatar;
    private int hasIdentified;
    private int concernStatus;
    private String concept;
    private int likeTotalNum;
    private int followedNum;
    private int hasFollowedNum;
    private int askingNum;
    private int answerNum;
    private int hasFollowMe;

    public int getHasFollowMe() {
        return hasFollowMe;
    }

    public void setHasFollowMe(int hasFollowMe) {
        this.hasFollowMe = hasFollowMe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getHasIdentified() {
        return hasIdentified;
    }

    public void setHasIdentified(int hasIdentified) {
        this.hasIdentified = hasIdentified;
    }

    public int getConcernStatus() {
        return concernStatus;
    }

    public void setConcernStatus(int concernStatus) {
        this.concernStatus = concernStatus;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public int getLikeTotalNum() {
        return likeTotalNum;
    }

    public void setLikeTotalNum(int likeTotalNum) {
        this.likeTotalNum = likeTotalNum;
    }

    public int getFollowedNum() {
        return followedNum;
    }

    public void setFollowedNum(int followedNum) {
        this.followedNum = followedNum;
    }

    public int getHasFollowedNum() {
        return hasFollowedNum;
    }

    public void setHasFollowedNum(int hasFollowedNum) {
        this.hasFollowedNum = hasFollowedNum;
    }

    public int getAskingNum() {
        return askingNum;
    }

    public void setAskingNum(int askingNum) {
        this.askingNum = askingNum;
    }

    public int getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(int answerNum) {
        this.answerNum = answerNum;
    }
}
