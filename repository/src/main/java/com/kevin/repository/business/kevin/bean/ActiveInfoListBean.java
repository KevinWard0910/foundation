package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Author: qiaoping.xiao  on 2018/1/10.
 * 活动信息bean
 */

public class ActiveInfoListBean {
    /**
     * pageNo : 1
     * pageSize : 10
     * count : 6
     * records : [{"showType":8,"showId":77,"showName":"B端创建第二个","showImage":"http://img1.dev.rs.com/g1/M00/01/26/wKh6ylpTGQqAd8MIAACp84Fzn-A422.png","showStatus":2},{"showType":8,"showId":78,"showName":"cece","showImage":"http://img1.dev.rs.com/g1/M00/01/26/wKh6y1pTGcyAd26VAACp84Fzn-A063.png","showStatus":2},{"showType":8,"showId":1,"showName":"第一个活动","showImage":"http://img1.uat1.rs.com/g1/M00/00/F0/wKh8y1l236CASuGTAACV6Ae_SSs579.jpg","showStatus":2},{"showType":8,"showId":75,"showName":"2","showImage":"http://img1.dev.rs.com/g1/M00/01/26/wKh6ylpPYjmABGnlAACp84Fzn-A851.png","showStatus":2},{"showType":9,"showId":19,"showName":"活动19","showImage":"http://img1.uat1.rs.com/g1/M00/01/00/wKh8y1l8IhqAEErdAAClVATMza8369.jpg","showStatus":3},{"showType":9,"showId":71,"showName":"沙龙","showStatus":3}]
     * startIndex : 0
     * hasPrePage : false
     * currentPage : 1
     * nearlyPageNum : []
     * totalPages : 1
     * hasNextPage : false
     */
    private int pageNo;
    private int pageSize;
    private int count;
    private int startIndex;
    private boolean hasPrePage;
    private int currentPage;
    private int totalPages;
    private boolean hasNextPage;
    private List<RecordsBean> records;
    private List<?> nearlyPageNum;

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

    public List<?> getNearlyPageNum() {
        return nearlyPageNum;
    }

    public void setNearlyPageNum(List<?> nearlyPageNum) {
        this.nearlyPageNum = nearlyPageNum;
    }

    public static class RecordsBean {
        /**
         * showType : 8
         * showId : 77
         * showName : B端创建第二个
         * showImage : http://img1.dev.rs.com/g1/M00/01/26/wKh6ylpTGQqAd8MIAACp84Fzn-A422.png
         * showStatus : 2
         */

        private int showType;
        private int showId;
        private String showName;
        private String showImage;
        private int showStatus;

        public int getShowType() {
            return showType;
        }

        public void setShowType(int showType) {
            this.showType = showType;
        }

        public int getShowId() {
            return showId;
        }

        public void setShowId(int showId) {
            this.showId = showId;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getShowImage() {
            return showImage;
        }

        public void setShowImage(String showImage) {
            this.showImage = showImage;
        }

        public int getShowStatus() {
            return showStatus;
        }

        public void setShowStatus(int showStatus) {
            this.showStatus = showStatus;
        }
    }
}
