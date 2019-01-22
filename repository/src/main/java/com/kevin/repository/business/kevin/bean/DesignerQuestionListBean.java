package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by shijia on 2018/1/11.
 */

public class DesignerQuestionListBean {

    private int pageNo;
    private int pageSize;
    private int count;
    private boolean hasPrePage;
    private int currentPage;
    private int totalPages;
    private boolean hasNextPage;
    private int startIndex;
    private List<RecordsBean> records;
    private List<Integer> nearlyPageNum;

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

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
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

    public static class RecordsBean {
        private int askId;
        private String askContent;
        private String askImages;
        private int followedNum;
        private int answerCounts;
        private String tags;
        private String createDate;
        private int isAnswer;
        private int isAsk;

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

        public String getAskImages() {
            return askImages;
        }

        public void setAskImages(String askImages) {
            this.askImages = askImages;
        }

        public int getFollowedNum() {
            return followedNum;
        }

        public void setFollowedNum(int followedNum) {
            this.followedNum = followedNum;
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
}
