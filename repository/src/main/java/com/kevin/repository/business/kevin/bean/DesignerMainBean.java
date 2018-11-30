package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by dong.wang
 * Date: 2017/7/24
 * Time: 14:43
 * Description:
 */
public class DesignerMainBean {

    /**
     * headUrl : string
     * recommendShowVos : [{"objType":0,"showId":0,"coverUrl":"string","showTitle":"string","participateCounts":0,"cityName":"string","districtName":"string","address":"string","enterEndDate":"2017-08-31T05:59:08.302Z","isRegisted":0,"isEqualCity":0}]
     * showVos : {"pageNo":0,"pageSize":0,"count":0,"records":[{"showID":0,"showType":0,"showTitle":"string","cover":"string","showCityName":"string","districtName":"string","address":"string","startDate":"2017-08-31T05:59:08.302Z","endDate":"2017-08-31T05:59:08.302Z","start":"2017-08-31T05:59:08.302Z","endTime":"2017-08-31T05:59:08.302Z","showStatus":0,"applied":0,"isEqualCity":0}],"startIndex":0,"nearlyPageNum":[0],"hasNextPage":true,"totalPages":0,"hasPrePage":true,"currentPage":0}
     * existActivityTyps : [{"activityId":0,"activityName":"string","cnt":0}]
     */

    private String headUrl;
    private ShowVosBean showVos;
    private List<RecommendShowVosBean> recommendShowVos;
    private List<ExistActivityTypsBean> existActivityTyps;

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public ShowVosBean getShowVos() {
        return showVos;
    }

    public void setShowVos(ShowVosBean showVos) {
        this.showVos = showVos;
    }

    public List<RecommendShowVosBean> getRecommendShowVos() {
        return recommendShowVos;
    }

    public void setRecommendShowVos(List<RecommendShowVosBean> recommendShowVos) {
        this.recommendShowVos = recommendShowVos;
    }

    public List<ExistActivityTypsBean> getExistActivityTyps() {
        return existActivityTyps;
    }

    public void setExistActivityTyps(List<ExistActivityTypsBean> existActivityTyps) {
        this.existActivityTyps = existActivityTyps;
    }

    public static class ShowVosBean {
        /**
         * pageNo : 0
         * pageSize : 0
         * count : 0
         * records : [{"showID":0,"showType":0,"showTitle":"string","cover":"string","showCityName":"string","districtName":"string","address":"string","startDate":"2017-08-31T05:59:08.302Z","endDate":"2017-08-31T05:59:08.302Z","start":"2017-08-31T05:59:08.302Z","endTime":"2017-08-31T05:59:08.302Z","showStatus":0,"applied":0,"isEqualCity":0}]
         * startIndex : 0
         * nearlyPageNum : [0]
         * hasNextPage : true
         * totalPages : 0
         * hasPrePage : true
         * currentPage : 0
         */

        private int pageNo;
        private int pageSize;
        private int count;
        private int startIndex;
        private boolean hasNextPage;
        private int totalPages;
        private boolean hasPrePage;
        private int currentPage;
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

        public boolean isHasNextPage() {
            return hasNextPage;
        }

        public void setHasNextPage(boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
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
            /**
             * showID : 0
             * showType : 0
             * showTitle : string
             * cover : string
             * showCityName : string
             * districtName : string
             * address : string
             * startDate : 2017-08-31T05:59:08.302Z
             * endDate : 2017-08-31T05:59:08.302Z
             * start : 2017-08-31T05:59:08.302Z
             * endTime : 2017-08-31T05:59:08.302Z
             * showStatus : 0
             * applied : 0
             * isEqualCity : 0
             */

            private int showID;
            private int showType;
            private String showTitle;
            private String cover;
            private String showCityName;
            private String districtName;
            private String address;
            private String startDate;
            private String endDate;
            private String start;
            private String endTime;
            private int showStatus;
            private int applied;
            private int isEqualCity;
            private int isOr;
            private String nation;

            public int getShowID() {
                return showID;
            }

            public void setShowID(int showID) {
                this.showID = showID;
            }

            public int getShowType() {
                return showType;
            }

            public void setShowType(int showType) {
                this.showType = showType;
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

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getStartDate() {
                return startDate;
            }

            public void setStartDate(String startDate) {
                this.startDate = startDate;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public int getShowStatus() {
                return showStatus;
            }

            public void setShowStatus(int showStatus) {
                this.showStatus = showStatus;
            }

            public int getApplied() {
                return applied;
            }

            public void setApplied(int applied) {
                this.applied = applied;
            }

            public int getIsEqualCity() {
                return isEqualCity;
            }

            public void setIsEqualCity(int isEqualCity) {
                this.isEqualCity = isEqualCity;
            }

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
        }
    }

    public static class RecommendShowVosBean {
        /**
         * objType : 0
         * showId : 0
         * coverUrl : string
         * showTitle : string
         * participateCounts : 0
         * cityName : string
         * districtName : string
         * address : string
         * enterEndDate : 2017-08-31T05:59:08.302Z
         * isRegisted : 0
         * isEqualCity : 0
         */

        private int objType;
        private int showId;
        private String coverUrl;
        private String showTitle;
        private int participateCounts;
        private String cityName;
        private String districtName;
        private String address;
        private String enterEndDate;
        private int isRegisted;
        private int isEqualCity;
        private int isOr;
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

        public int getObjType() {
            return objType;
        }

        public void setObjType(int objType) {
            this.objType = objType;
        }

        public int getShowId() {
            return showId;
        }

        public void setShowId(int showId) {
            this.showId = showId;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getShowTitle() {
            return showTitle;
        }

        public void setShowTitle(String showTitle) {
            this.showTitle = showTitle;
        }

        public int getParticipateCounts() {
            return participateCounts;
        }

        public void setParticipateCounts(int participateCounts) {
            this.participateCounts = participateCounts;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getDistrictName() {
            return districtName;
        }

        public void setDistrictName(String districtName) {
            this.districtName = districtName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEnterEndDate() {
            return enterEndDate;
        }

        public void setEnterEndDate(String enterEndDate) {
            this.enterEndDate = enterEndDate;
        }

        public int getIsRegisted() {
            return isRegisted;
        }

        public void setIsRegisted(int isRegisted) {
            this.isRegisted = isRegisted;
        }

        public int getIsEqualCity() {
            return isEqualCity;
        }

        public void setIsEqualCity(int isEqualCity) {
            this.isEqualCity = isEqualCity;
        }
    }

    public static class ExistActivityTypsBean {
        /**
         * activityId : 0
         * activityName : string
         * cnt : 0
         */

        private String activityId;
        private String activityName;
        private int cnt;

        public String getActivityId() {
            return activityId;
        }

        public void setActivityId(String activityId) {
            this.activityId = activityId;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }
    }
}
