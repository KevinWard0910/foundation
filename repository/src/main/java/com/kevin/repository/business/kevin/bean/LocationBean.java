package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shijia on 2017/7/20.
 */

public class LocationBean implements Parcelable {
    private double longitude;//经度
    private double Latitude;//纬度
    private int cityCode;//区域码
    private String cityName;//城市

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.longitude);
        dest.writeDouble(this.Latitude);
        dest.writeInt(this.cityCode);
        dest.writeString(this.cityName);
    }

    public LocationBean() {
    }

    protected LocationBean(Parcel in) {
        this.longitude = in.readDouble();
        this.Latitude = in.readDouble();
        this.cityCode = in.readInt();
        this.cityName = in.readString();
    }

    public static final Parcelable.Creator<LocationBean> CREATOR = new Parcelable.Creator<LocationBean>() {
        @Override
        public LocationBean createFromParcel(Parcel source) {
            return new LocationBean(source);
        }

        @Override
        public LocationBean[] newArray(int size) {
            return new LocationBean[size];
        }
    };
}
