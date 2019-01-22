package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by dong.wang
 * Date: 2017/8/30
 * Time: 10:14
 * Description:
 */

public class MyAttentionBean {

    private int pageNo;
    private int pageSize;
    private int count;
    private int startIndex;
    private boolean hasNextPage;
    private boolean hasPrePage;
    private int currentPage;
    private int totalPages;
    private List<RecordsBean> records;
    private List<Integer> nearlyPageNum;

    public static class RecordsBean {
        /*标签*/
        private int id; // 作者ID 用户ID 标签ID
        private String name; // 用户名称 标签名称
        private int hasConcerned; // (integer, optional): 是否已关注 默认0 0：否 1：是
        private String imageUrl; // 标签图片

        /*主办方信息*/
        private int sponsorId; // (integer, optional):主办方id
        private String sponsorName; // (string, optional):主办方名称
        private String sponsorLogo; // (string, optional):主办方头像
        private String briefInfo; // (string, optional):主办方简介
        private int attentions; // (integer, optional):关注用户数
        private int showCounts; // (integer, optional):在办活动数

        /*提问列表*/
        private int askId; // (integer, optional): 提问id
        private String content; // (string, optional): 提问内容
        private List<String> tags; // (Array[string], optional): 提问标签
        //     private int   attentions; // (integer, optional): 关注用户数
        private int answerCounts; // (integer, optional): 提问回答数
        private String askTime; // (string, optional): 提问时间
        private List<String> askImages; // (Array[string], optional): 提问图片

        /*文章作者详情*/
//    private int id; // (integer, optional): 作者ID
        private String authorAvatar; // (string, optional): 作者头像
        private String authorName; // (string, optional): 作者名称
        private int hasIdentified; // (integer, optional): 是否认证 是否已认证 默认1 0：否 1：是
        private int attentionNum; // (integer, optional): 关注数
        //    private int hasConcerned; // (integer, optional): 是否已关注 默认0 0：否 1：是
        private int articleNum; // (integer, optional): 文章数

        /*设计师用户列表*/
//    private String id; // (integer, optional): 用户ID
        private String openId; // (string, optional): 用户openId
        //    private String name; // (string, optional): 用户名称
        private String avatar; // (string, optional): 用户头像
        private int concernStatus; // (integer, optional): 关注状态 默认0 0：未关注 1：已关注 2：互相关注

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

        public int getHasConcerned() {
            return hasConcerned;
        }

        public void setHasConcerned(int hasConcerned) {
            this.hasConcerned = hasConcerned;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public int getSponsorId() {
            return sponsorId;
        }

        public void setSponsorId(int sponsorId) {
            this.sponsorId = sponsorId;
        }

        public String getSponsorName() {
            return sponsorName;
        }

        public void setSponsorName(String sponsorName) {
            this.sponsorName = sponsorName;
        }

        public String getSponsorLogo() {
            return sponsorLogo;
        }

        public void setSponsorLogo(String sponsorLogo) {
            this.sponsorLogo = sponsorLogo;
        }

        public String getBriefInfo() {
            return briefInfo;
        }

        public void setBriefInfo(String briefInfo) {
            this.briefInfo = briefInfo;
        }

        public int getAttentions() {
            return attentions;
        }

        public void setAttentions(int attentions) {
            this.attentions = attentions;
        }

        public int getShowCounts() {
            return showCounts;
        }

        public void setShowCounts(int showCounts) {
            this.showCounts = showCounts;
        }

        public int getAskId() {
            return askId;
        }

        public void setAskId(int askId) {
            this.askId = askId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public int getAnswerCounts() {
            return answerCounts;
        }

        public void setAnswerCounts(int answerCounts) {
            this.answerCounts = answerCounts;
        }

        public String getAskTime() {
            return askTime;
        }

        public void setAskTime(String askTime) {
            this.askTime = askTime;
        }

        public List<String> getAskImages() {
            return askImages;
        }

        public void setAskImages(List<String> askImages) {
            this.askImages = askImages;
        }

        public String getAuthorAvatar() {
            return authorAvatar;
        }

        public void setAuthorAvatar(String authorAvatar) {
            this.authorAvatar = authorAvatar;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public int getHasIdentified() {
            return hasIdentified;
        }

        public void setHasIdentified(int hasIdentified) {
            this.hasIdentified = hasIdentified;
        }

        public int getAttentionNum() {
            return attentionNum;
        }

        public void setAttentionNum(int attentionNum) {
            this.attentionNum = attentionNum;
        }

        public int getArticleNum() {
            return articleNum;
        }

        public void setArticleNum(int articleNum) {
            this.articleNum = articleNum;
        }

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getConcernStatus() {
            return concernStatus;
        }

        public void setConcernStatus(int concernStatus) {
            this.concernStatus = concernStatus;
        }
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean isHasPrePage() {
        return hasPrePage;
    }

    public void setHasPrePage(boolean hasPrePage) {
        this.hasPrePage = hasPrePage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public List<Integer> getNearlyPageNum() {
        return nearlyPageNum;
    }

    public void setNearlyPageNum(List<Integer> nearlyPageNum) {
        this.nearlyPageNum = nearlyPageNum;
    }
}
