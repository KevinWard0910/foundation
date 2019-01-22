package com.kevin.repository.business.kevin.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dong.wang
 * Date: 2017/9/1
 * Time: 12:19
 * Description:
 */

public class StarDesignBean {

    /**
     * bannerVos : [{"cover":"string","title":"string","description":"string","linkUrl":"string","linkTitle":"string"}]
     * advisoryVos : {"pageNo":0,"pageSize":0,"count":0,"records":[{"advisoryId":0,"advisoryType":"string","secondTag":"string","title":"string","passTime":"2017-09-02T04:11:06.787Z","smallImage":"string","bigImage":"string"}],"startIndex":0,"hasPrePage":true,"hasNextPage":true,"totalPages":0,"currentPage":0,"nearlyPageNum":[0]}
     */

    private AdvisoryVosBean advisoryVos;
    private List<BannerVosBean> bannerVos;

    public AdvisoryVosBean getAdvisoryVos() {
        return advisoryVos;
    }

    public void setAdvisoryVos(AdvisoryVosBean advisoryVos) {
        this.advisoryVos = advisoryVos;
    }

    public List<BannerVosBean> getBannerVos() {
        return bannerVos;
    }

    public void setBannerVos(List<BannerVosBean> bannerVos) {
        this.bannerVos = bannerVos;
    }

    public static class AdvisoryVosBean {
        /**
         * pageNo : 0
         * pageSize : 0
         * count : 0
         * records : [{"advisoryId":0,"advisoryType":"string","secondTag":"string","title":"string","passTime":"2017-09-02T04:11:06.787Z","smallImage":"string","bigImage":"string"}]
         * startIndex : 0
         * hasPrePage : true
         * hasNextPage : true
         * totalPages : 0
         * currentPage : 0
         * nearlyPageNum : [0]
         */

        @SerializedName("pageNo")
        private int pageNoX;
        @SerializedName("pageSize")
        private int pageSizeX;
        @SerializedName("count")
        private int countX;
        @SerializedName("startIndex")
        private int startIndexX;
        @SerializedName("hasPrePage")
        private boolean hasPrePageX;
        @SerializedName("hasNextPage")
        private boolean hasNextPageX;
        @SerializedName("totalPages")
        private int totalPagesX;
        @SerializedName("currentPage")
        private int currentPageX;
        @SerializedName("records")
        private List<RecordsBean> recordsX;
        @SerializedName("nearlyPageNum")
        private List<Integer> nearlyPageNumX;

        public int getPageNoX() {
            return pageNoX;
        }

        public void setPageNoX(int pageNoX) {
            this.pageNoX = pageNoX;
        }

        public int getPageSizeX() {
            return pageSizeX;
        }

        public void setPageSizeX(int pageSizeX) {
            this.pageSizeX = pageSizeX;
        }

        public int getCountX() {
            return countX;
        }

        public void setCountX(int countX) {
            this.countX = countX;
        }

        public int getStartIndexX() {
            return startIndexX;
        }

        public void setStartIndexX(int startIndexX) {
            this.startIndexX = startIndexX;
        }

        public boolean isHasPrePageX() {
            return hasPrePageX;
        }

        public void setHasPrePageX(boolean hasPrePageX) {
            this.hasPrePageX = hasPrePageX;
        }

        public boolean isHasNextPageX() {
            return hasNextPageX;
        }

        public void setHasNextPageX(boolean hasNextPageX) {
            this.hasNextPageX = hasNextPageX;
        }

        public int getTotalPagesX() {
            return totalPagesX;
        }

        public void setTotalPagesX(int totalPagesX) {
            this.totalPagesX = totalPagesX;
        }

        public int getCurrentPageX() {
            return currentPageX;
        }

        public void setCurrentPageX(int currentPageX) {
            this.currentPageX = currentPageX;
        }

        public List<RecordsBean> getRecordsX() {
            return recordsX;
        }

        public void setRecordsX(List<RecordsBean> recordsX) {
            this.recordsX = recordsX;
        }

        public List<Integer> getNearlyPageNumX() {
            return nearlyPageNumX;
        }

        public void setNearlyPageNumX(List<Integer> nearlyPageNumX) {
            this.nearlyPageNumX = nearlyPageNumX;
        }

        public static class RecordsBean {
            /**
             * advisoryId : 0
             * advisoryType : string
             * secondTag : string
             * title : string
             * passTime : 2017-09-02T04:11:06.787Z
             * smallImage : string
             * bigImage : string
             */

            private int advisoryId;
            private String advisoryType;
            private String secondTag;
            private String title;
            private String passTime;
            private String smallImage;
            private String bigImage;
            private int displayImgType;

            public int getAdvisoryId() {
                return advisoryId;
            }

            public void setAdvisoryId(int advisoryId) {
                this.advisoryId = advisoryId;
            }

            public String getAdvisoryType() {
                return advisoryType;
            }

            public void setAdvisoryType(String advisoryType) {
                this.advisoryType = advisoryType;
            }

            public String getSecondTag() {
                return secondTag;
            }

            public void setSecondTag(String secondTag) {
                this.secondTag = secondTag;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPassTime() {
                return passTime;
            }

            public void setPassTime(String passTime) {
                this.passTime = passTime;
            }

            public String getSmallImage() {
                return smallImage;
            }

            public void setSmallImage(String smallImage) {
                this.smallImage = smallImage;
            }

            public String getBigImage() {
                return bigImage;
            }

            public void setBigImage(String bigImage) {
                this.bigImage = bigImage;
            }

            public int getDisplayImgType() {
                return displayImgType;
            }

            public void setDisplayImgType(int displayImgType) {
                this.displayImgType = displayImgType;
            }
        }
    }

    public static class BannerVosBean {
        /**
         * cover : string
         * title : string
         * description : string
         * linkUrl : string
         * linkTitle : string
         */

        private String cover;
        private String title;
        private String description;
        private String linkUrl;
        private String linkTitle;

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLinkUrl() {
            return linkUrl;
        }

        public void setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
        }

        public String getLinkTitle() {
            return linkTitle;
        }

        public void setLinkTitle(String linkTitle) {
            this.linkTitle = linkTitle;
        }
    }
}
