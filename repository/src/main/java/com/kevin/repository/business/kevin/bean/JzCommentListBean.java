package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by jiquan.zhong on 2018/1/8.
 * jz评论列表
 */

public class JzCommentListBean {

    private int pageNo;
    private int pageSize;
    private int count;
    private int startIndex;
    private boolean hasPrePage;
    private int currentPage;
    private int totalPages;
    private boolean hasNextPage;
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

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
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
        private int id;//评论ID ,
        private int commentObjType;//评论对象类型 0星设计比赛;1星设计沙龙;2星设计文章;3回答 ,
        private int commentObjId;//评论对象ID
        private int askingId;//问题ID 评论对象为 3 时返回 ,
        private String commentContent;//评论内容
        private String createDate;//评论时间
        private int likeCount;//点赞数 ,
        private int desigenrId;//设计师ID ,
        private String designerAvatar;// 设计师头像 ,
        private String designerName;//设计师名称
        private int hasIdentified;// 是否已认证 默认0 0：否 1：是
        private int hasParsed;//("是否已点赞 默认0 0：否 1：是")

        public int getHasParsed() {
            return hasParsed;
        }

        public void setHasParsed(int hasParsed) {
            this.hasParsed = hasParsed;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCommentObjType() {
            return commentObjType;
        }

        public void setCommentObjType(int commentObjType) {
            this.commentObjType = commentObjType;
        }

        public int getCommentObjId() {
            return commentObjId;
        }

        public void setCommentObjId(int commentObjId) {
            this.commentObjId = commentObjId;
        }

        public int getAskingId() {
            return askingId;
        }

        public void setAskingId(int askingId) {
            this.askingId = askingId;
        }

        public String getCommentContent() {
            return commentContent;
        }

        public void setCommentContent(String commentContent) {
            this.commentContent = commentContent;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public int getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(int likeCount) {
            this.likeCount = likeCount;
        }

        public int getDesigenrId() {
            return desigenrId;
        }

        public void setDesigenrId(int desigenrId) {
            this.desigenrId = desigenrId;
        }

        public String getDesignerAvatar() {
            return designerAvatar;
        }

        public void setDesignerAvatar(String designerAvatar) {
            this.designerAvatar = designerAvatar;
        }

        public String getDesignerName() {
            return designerName;
        }

        public void setDesignerName(String designerName) {
            this.designerName = designerName;
        }

        public int getHasIdentified() {
            return hasIdentified;
        }

        public void setHasIdentified(int hasIdentified) {
            this.hasIdentified = hasIdentified;
        }
    }
}
