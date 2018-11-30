package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.huarong on 2018/1/5.
 */

public class AuthorDetailBean implements Parcelable {

    /**
     * id : 0
     * authorAvatar : string
     * authorName : string
     * hasIdentified : 0
     * attentionNum : 0
     * articleNum : 0
     * articleAppVos : {"pageNo":0,"pageSize":0,"count":0,"records":[{"id":0,"title":"string","imageUrl":"string",
     * "tags":["string"],"releaseTime":"2018-01-05T09:19:03.437Z"}],"startIndex":0,"nearlyPageNum":[0],
     * "totalPages":0,"hasNextPage":true,"hasPrePage":true,"currentPage":0}
     */

    private int id;
    private String authorAvatar;
    private String authorName;
    private int hasIdentified;
    private int attentionNum;
    private int articleNum;
    private int hasConcerned;//是否已关注 默认0 0：否 1：是 ,
    private ArticleAppVosBean articleAppVos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArticleAppVosBean getArticleAppVos() {
        return articleAppVos;
    }

    public void setArticleAppVos(ArticleAppVosBean articleAppVos) {
        this.articleAppVos = articleAppVos;
    }

    public int isHasConcerned() {
        return hasConcerned;
    }

    public void setHasConcerned(int hasConcerned) {
        this.hasConcerned = hasConcerned;
    }

    public static class ArticleAppVosBean implements Parcelable {
        /**
         * pageNo : 0
         * pageSize : 0
         * count : 0
         * records : [{"id":0,"title":"string","imageUrl":"string","tags":["string"],
         * "releaseTime":"2018-01-05T09:19:03.437Z"}]
         * startIndex : 0
         * nearlyPageNum : [0]
         * totalPages : 0
         * hasNextPage : true
         * hasPrePage : true
         * currentPage : 0
         */

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


        public static class RecordsBean implements Parcelable {
            /**
             * id : 0
             * title : string
             * imageUrl : string
             * tags : ["string"]
             * releaseTime : 2018-01-05T09:19:03.437Z
             */

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


            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.id);
                dest.writeString(this.title);
                dest.writeString(this.imageUrl);
                dest.writeString(this.releaseTime);
                dest.writeStringList(this.tags);
            }

            public RecordsBean() {
            }

            protected RecordsBean(Parcel in) {
                this.id = in.readInt();
                this.title = in.readString();
                this.imageUrl = in.readString();
                this.releaseTime = in.readString();
                this.tags = in.createStringArrayList();
            }

            public static final Creator<RecordsBean> CREATOR = new Creator<RecordsBean>() {
                @Override
                public RecordsBean createFromParcel(Parcel source) {
                    return new RecordsBean(source);
                }

                @Override
                public RecordsBean[] newArray(int size) {
                    return new RecordsBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.pageNo);
            dest.writeInt(this.pageSize);
            dest.writeInt(this.count);
            dest.writeInt(this.startIndex);
            dest.writeInt(this.totalPages);
            dest.writeByte(this.hasNextPage ? (byte) 1 : (byte) 0);
            dest.writeByte(this.hasPrePage ? (byte) 1 : (byte) 0);
            dest.writeInt(this.currentPage);
            dest.writeTypedList(this.records);
            dest.writeList(this.nearlyPageNum);
        }

        public ArticleAppVosBean() {
        }

        protected ArticleAppVosBean(Parcel in) {
            this.pageNo = in.readInt();
            this.pageSize = in.readInt();
            this.count = in.readInt();
            this.startIndex = in.readInt();
            this.totalPages = in.readInt();
            this.hasNextPage = in.readByte() != 0;
            this.hasPrePage = in.readByte() != 0;
            this.currentPage = in.readInt();
            this.records = in.createTypedArrayList(RecordsBean.CREATOR);
            this.nearlyPageNum = new ArrayList<Integer>();
            in.readList(this.nearlyPageNum, Integer.class.getClassLoader());
        }

        public static final Creator<ArticleAppVosBean> CREATOR = new Creator<ArticleAppVosBean>() {
            @Override
            public ArticleAppVosBean createFromParcel(Parcel source) {
                return new ArticleAppVosBean(source);
            }

            @Override
            public ArticleAppVosBean[] newArray(int size) {
                return new ArticleAppVosBean[size];
            }
        };
    }


    public AuthorDetailBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.authorAvatar);
        dest.writeString(this.authorName);
        dest.writeInt(this.hasIdentified);
        dest.writeInt(this.attentionNum);
        dest.writeInt(this.articleNum);
        dest.writeInt(this.hasConcerned);
        dest.writeParcelable(this.articleAppVos, flags);
    }

    protected AuthorDetailBean(Parcel in) {
        this.id = in.readInt();
        this.authorAvatar = in.readString();
        this.authorName = in.readString();
        this.hasIdentified = in.readInt();
        this.attentionNum = in.readInt();
        this.articleNum = in.readInt();
        this.hasConcerned = in.readInt();
        this.articleAppVos = in.readParcelable(ArticleAppVosBean.class.getClassLoader());
    }

    public static final Creator<AuthorDetailBean> CREATOR = new Creator<AuthorDetailBean>() {
        @Override
        public AuthorDetailBean createFromParcel(Parcel source) {
            return new AuthorDetailBean(source);
        }

        @Override
        public AuthorDetailBean[] newArray(int size) {
            return new AuthorDetailBean[size];
        }
    };
}
