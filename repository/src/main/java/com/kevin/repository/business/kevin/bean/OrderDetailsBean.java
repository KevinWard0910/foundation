package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shijia on 2018/1/15.
 */

public class OrderDetailsBean {

    private int id;
    private String ownerName;
    private String ownerTel;
    private String provinceCode;
    private String provinceName;
    private String cityCode;
    private String cityName;
    private String districtCode;
    private String districtName;
    private String address;
    private String visitDate;
    private String community;
    private int orderType;
    private String houseType;
    private int area;
    private int budget;
    private String remark;
    private String dispatchedTime;
    private int orderStatus;
    private int nextStatus;
    private List<HistoryVosBean> historyVos;

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
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

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDispatchedTime() {
        return dispatchedTime;
    }

    public void setDispatchedTime(String dispatchedTime) {
        this.dispatchedTime = dispatchedTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getNextStatus() {
        return nextStatus;
    }

    public void setNextStatus(int nextStatus) {
        this.nextStatus = nextStatus;
    }

    public List<HistoryVosBean> getHistoryVos() {
        return historyVos;
    }

    public void setHistoryVos(List<HistoryVosBean> historyVos) {
        this.historyVos = historyVos;
    }

    public static class HistoryVosBean {
        private int orderFollowStatus;
        private String followTime;
        private List<CaseListVosBean> caseListVos;
        private List<ImageListVosBeanX> imageListVos;

        public int getOrderFollowStatus() {
            return orderFollowStatus;
        }

        public void setOrderFollowStatus(int orderFollowStatus) {
            this.orderFollowStatus = orderFollowStatus;
        }

        public String getFollowTime() {
            return followTime;
        }

        public void setFollowTime(String followTime) {
            this.followTime = followTime;
        }

        public List<CaseListVosBean> getCaseListVos() {
            return caseListVos;
        }

        public void setCaseListVos(List<CaseListVosBean> caseListVos) {
            this.caseListVos = caseListVos;
        }

        public List<ImageListVosBeanX> getImageListVos() {
            return imageListVos;
        }

        public void setImageListVos(List<ImageListVosBeanX> imageListVos) {
            this.imageListVos = imageListVos;
        }

        public static class CaseListVosBean implements Parcelable {
            private int id;
            private String caseName;
            private String createTime;
            private List<ImageListVosBean> imageListVos;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCaseName() {
                return caseName;
            }

            public void setCaseName(String caseName) {
                this.caseName = caseName;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public List<ImageListVosBean> getImageListVos() {
                return imageListVos;
            }

            public void setImageListVos(List<ImageListVosBean> imageListVos) {
                this.imageListVos = imageListVos;
            }

            public static class ImageListVosBean implements Parcelable {
                private int id;
                private String imageUrl;
                private String description;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getImageUrl() {
                    return imageUrl;
                }

                public void setImageUrl(String imageUrl) {
                    this.imageUrl = imageUrl;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.id);
                    dest.writeString(this.imageUrl);
                    dest.writeString(this.description);
                }

                public ImageListVosBean() {
                }

                protected ImageListVosBean(Parcel in) {
                    this.id = in.readInt();
                    this.imageUrl = in.readString();
                    this.description = in.readString();
                }

                public static final Creator<ImageListVosBean> CREATOR = new Creator<ImageListVosBean>() {
                    @Override
                    public ImageListVosBean createFromParcel(Parcel source) {
                        return new ImageListVosBean(source);
                    }

                    @Override
                    public ImageListVosBean[] newArray(int size) {
                        return new ImageListVosBean[size];
                    }
                };
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.id);
                dest.writeString(this.caseName);
                dest.writeString(this.createTime);
                dest.writeList(this.imageListVos);
            }

            public CaseListVosBean() {
            }

            protected CaseListVosBean(Parcel in) {
                this.id = in.readInt();
                this.caseName = in.readString();
                this.createTime = in.readString();
                this.imageListVos = new ArrayList<ImageListVosBean>();
                in.readList(this.imageListVos, ImageListVosBean.class.getClassLoader());
            }

            public static final Parcelable.Creator<CaseListVosBean> CREATOR = new Parcelable.Creator<CaseListVosBean>() {
                @Override
                public CaseListVosBean createFromParcel(Parcel source) {
                    return new CaseListVosBean(source);
                }

                @Override
                public CaseListVosBean[] newArray(int size) {
                    return new CaseListVosBean[size];
                }
            };
        }

        public static class ImageListVosBeanX {
            private int id;
            private String imageUrl;
            private String description;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}
