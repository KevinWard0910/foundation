package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by dong.wang
 * Date: 2017/9/1
 * Time: 12:19
 * Description:
 */

public class RecommendBean {

    /**
     * listTypeAppVo : {"type":"string","listAppVos":[{"askId":0,"askContent":"string","tag":"string","answerId":0,"answerContent":"string","askImages":"string","designerId":0,"hasIdentified":0,"designerImage":"string","designerName":"string","likeCnt":0,"createDate":"2018-01-09T08:34:17.000Z"}]}
     * askingTypeVo : {"type":"string","listAppVos":[{"askId":0,"askContent":"string","tag":"string","answerId":0,"answerContent":"string","askImages":"string","designerId":0,"hasIdentified":0,"designerImage":"string","designerName":"string","likeCnt":0,"createDate":"2018-01-09T08:34:17.000Z"}]}
     * appVoPagination : {"pageNo":0,"pageSize":0,"count":0,"records":[{"askId":0,"askContent":"string","tag":"string","answerId":0,"answerContent":"string","askImages":"string","designerId":0,"hasIdentified":0,"designerImage":"string","designerName":"string","likeCnt":0,"createDate":"2018-01-09T08:34:17.000Z"}],"startIndex":0,"hasPrePage":true,"currentPage":0,"nearlyPageNum":[0],"totalPages":0,"hasNextPage":true}
     */

    private ListTypeAppVoBean listTypeAppVo;
    private AskingTypeVoBean askingTypeVo;
    private AppVoPaginationBean appVoPagination;

    public ListTypeAppVoBean getListTypeAppVo() {
        return listTypeAppVo;
    }

    public void setListTypeAppVo(ListTypeAppVoBean listTypeAppVo) {
        this.listTypeAppVo = listTypeAppVo;
    }

    public AskingTypeVoBean getAskingTypeVo() {
        return askingTypeVo;
    }

    public void setAskingTypeVo(AskingTypeVoBean askingTypeVo) {
        this.askingTypeVo = askingTypeVo;
    }

    public AppVoPaginationBean getAppVoPagination() {
        return appVoPagination;
    }

    public void setAppVoPagination(AppVoPaginationBean appVoPagination) {
        this.appVoPagination = appVoPagination;
    }

    public static class ListTypeAppVoBean {
        /**
         * type : string
         * listAppVos : [{"askId":0,"askContent":"string","tag":"string","answerId":0,"answerContent":"string","askImages":"string","designerId":0,"hasIdentified":0,"designerImage":"string","designerName":"string","likeCnt":0,"createDate":"2018-01-09T08:34:17.000Z"}]
         */

        private String type;
        private List<RecordsBean> listAppVos;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<RecordsBean> getListAppVos() {
            return listAppVos;
        }

        public void setListAppVos(List<RecordsBean> listAppVos) {
            this.listAppVos = listAppVos;
        }
    }

    public static class AskingTypeVoBean {
        /**
         * type : string
         * listAppVos : [{"askId":0,"askContent":"string","tag":"string","answerId":0,"answerContent":"string","askImages":"string","designerId":0,"hasIdentified":0,"designerImage":"string","designerName":"string","likeCnt":0,"createDate":"2018-01-09T08:34:17.000Z"}]
         */

        private String type;
        private List<RecordsBean> listAppVos;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<RecordsBean> getListAppVos() {
            return listAppVos;
        }

        public void setListAppVos(List<RecordsBean> listAppVos) {
            this.listAppVos = listAppVos;
        }
    }

    public static class AppVoPaginationBean {
        /**
         * pageNo : 0
         * pageSize : 0
         * count : 0
         * records : [{"askId":0,"askContent":"string","tag":"string","answerId":0,"answerContent":"string","askImages":"string","designerId":0,"hasIdentified":0,"designerImage":"string","designerName":"string","likeCnt":0,"createDate":"2018-01-09T08:34:17.000Z"}]
         * startIndex : 0
         * hasPrePage : true
         * currentPage : 0
         * nearlyPageNum : [0]
         * totalPages : 0
         * hasNextPage : true
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
    }

    public static class RecordsBean {
        /**
         * askId : 0
         * askContent : string
         * tag : string
         * answerId : 0
         * answerContent : string
         * askImages : string
         * designerId : 0
         * hasIdentified : 0
         * designerImage : string
         * designerName : string
         * likeCnt : 0
         * createDate : 2018-01-09T08:34:17.000Z
         */

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
        private long createDate;
        private boolean isVisibleLine;
        private int itemType;

        public int getItemType() {
            return itemType;
        }

        public void setItemType(int itemType) {
            this.itemType = itemType;
        }

        public boolean isVisibleLine() {
            return isVisibleLine;
        }

        public void setVisibleLine(boolean visibleLine) {
            isVisibleLine = visibleLine;
        }

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

        public long getCreateDate() {
            return createDate;
        }

        public void setCreateDate(long createDate) {
            this.createDate = createDate;
        }
    }
}
