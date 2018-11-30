package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by shijia on 2017/7/26.
 */

public class MyActivesListBean {

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
        private int showID;
        private String showTitle;
        private String cover;
        private String address;
        private String showCityName;
        private String districtName;
        private String endDate;
        private int applied;
//        1:未开始，2：进行中，3：已结束
        private int showStatus;
        private int  isOr;
        private String nation;

        public int getIsOr() {
            return isOr;
        }

        public void setIsOr(int isOr) {
            this.isOr = isOr;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public int getShowID() {
            return showID;
        }

        public void setShowID(int showID) {
            this.showID = showID;
        }

        public String getShowTitle() {
            return showTitle;
        }

        public void setShowTitle(String showTitle) {
            this.showTitle = showTitle;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getShowCityName() {
            return showCityName;
        }

        public void setShowCityName(String showCityName) {
            this.showCityName = showCityName;
        }

        public String getDistrictName() {
            return districtName;
        }

        public void setDistrictName(String districtName) {
            this.districtName = districtName;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public int getApplied() {
            return applied;
        }

        public void setApplied(int applied) {
            this.applied = applied;
        }

        public int getShowStatus() {
            return showStatus;
        }

        public void setShowStatus(int showStatus) {
            this.showStatus = showStatus;
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
