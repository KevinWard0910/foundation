package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by shijia on 2018/1/6.
 */

public class HomeListBean {


    private ArticleAppVosBean articleAppVos;
    private List<BannerListBean> bannerList;
    private List<ShowAppVosBean> showAppVos;
    private List<HotArticlesBean> hotArticles;
    private List<AskingAppVosBean> askingAppVos;

    public ArticleAppVosBean getArticleAppVos() {
        return articleAppVos;
    }

    public void setArticleAppVos(ArticleAppVosBean articleAppVos) {
        this.articleAppVos = articleAppVos;
    }

    public List<BannerListBean> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<BannerListBean> bannerList) {
        this.bannerList = bannerList;
    }

    public List<ShowAppVosBean> getShowAppVos() {
        return showAppVos;
    }

    public void setShowAppVos(List<ShowAppVosBean> showAppVos) {
        this.showAppVos = showAppVos;
    }

    public List<HotArticlesBean> getHotArticles() {
        return hotArticles;
    }

    public void setHotArticles(List<HotArticlesBean> hotArticles) {
        this.hotArticles = hotArticles;
    }

    public List<AskingAppVosBean> getAskingAppVos() {
        return askingAppVos;
    }

    public void setAskingAppVos(List<AskingAppVosBean> askingAppVos) {
        this.askingAppVos = askingAppVos;
    }

    public static class ArticleAppVosBean {
        private int pageNo;
        private int pageSize;
        private int count;
        private int startIndex;
        private int totalPages;
        private boolean hasNextPage;
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
            private int id;
            private String title;
            private String imageUrl;
            private String releaseTime;
            private List<String> tags;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }
        }
    }

    public static class BannerListBean {
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

    public static class ShowAppVosBean {
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

    public static class HotArticlesBean {
        private int id;
        private String title;
        private String imageUrl;
        private String releaseTime;
        private List<String> tags;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
    }

    public static class AskingAppVosBean {
        private int askId;
        private String content;
        private int attentions;
        private int answerCounts;
        private List<String> tags;
        private List<String> askImages;

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

        public int getAttentions() {
            return attentions;
        }

        public void setAttentions(int attentions) {
            this.attentions = attentions;
        }

        public int getAnswerCounts() {
            return answerCounts;
        }

        public void setAnswerCounts(int answerCounts) {
            this.answerCounts = answerCounts;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public List<String> getAskImages() {
            return askImages;
        }

        public void setAskImages(List<String> askImages) {
            this.askImages = askImages;
        }
    }
}
