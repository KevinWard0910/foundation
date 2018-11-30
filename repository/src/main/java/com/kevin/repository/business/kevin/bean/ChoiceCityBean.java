package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chen.huarong on 2017/9/29.
 */

public class ChoiceCityBean implements Parcelable {

    /**
     * cityCode : 340100
     * cityName : 合肥
     * cityNameOfPY : hefei
     * provinceCode : 340000
     * provinceName : 安徽省
     */

    private int id;
    private String cityCode;
    private String cityName;
    private String cityNameOfPY;
    private String provinceCode;
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCityNameOfPY() {
        return cityNameOfPY;
    }

    public void setCityNameOfPY(String cityNameOfPY) {
        this.cityNameOfPY = cityNameOfPY;
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


    public ChoiceCityBean() {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.cityCode);
        dest.writeString(this.cityName);
        dest.writeString(this.cityNameOfPY);
        dest.writeString(this.provinceCode);
        dest.writeString(this.provinceName);
    }

    protected ChoiceCityBean(Parcel in) {
        this.id = in.readInt();
        this.cityCode = in.readString();
        this.cityName = in.readString();
        this.cityNameOfPY = in.readString();
        this.provinceCode = in.readString();
        this.provinceName = in.readString();
    }

    public static final Creator<ChoiceCityBean> CREATOR = new Creator<ChoiceCityBean>() {
        @Override
        public ChoiceCityBean createFromParcel(Parcel source) {
            return new ChoiceCityBean(source);
        }

        @Override
        public ChoiceCityBean[] newArray(int size) {
            return new ChoiceCityBean[size];
        }
    };
}
