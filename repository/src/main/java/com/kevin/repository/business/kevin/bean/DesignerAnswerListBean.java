package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by shijia on 2018/1/11.
 */

public class DesignerAnswerListBean {

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
        private String tag;
        private int answerId;
        private String answerContent;
        private String askImages;
        private int designerId;
        private int hasIdentified;
        private String designerImage;
        private String designerName;
        private int likeCnt;
        private String createDate;

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

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public int getAnswerId() {
            return answerId;
        }

        public void setAnswerId(int answerId) {
            this.answerId = answerId;
        }

        public String getAnswerContent() {
            return answerContent;
        }

        public void setAnswerContent(String answerContent) {
            this.answerContent = answerContent;
        }

        public String getAskImages() {
            return askImages;
        }

        public void setAskImages(String askImages) {
            this.askImages = askImages;
        }

        public int getDesignerId() {
            return designerId;
        }

        public void setDesignerId(int designerId) {
            this.designerId = designerId;
        }

        public int getHasIdentified() {
            return hasIdentified;
        }

        public void setHasIdentified(int hasIdentified) {
            this.hasIdentified = hasIdentified;
        }

        public String getDesignerImage() {
            return designerImage;
        }

        public void setDesignerImage(String designerImage) {
            this.designerImage = designerImage;
        }

        public String getDesignerName() {
            return designerName;
        }

        public void setDesignerName(String designerName) {
            this.designerName = designerName;
        }

        public int getLikeCnt() {
            return likeCnt;
        }

        public void setLikeCnt(int likeCnt) {
            this.likeCnt = likeCnt;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }
    }
}
