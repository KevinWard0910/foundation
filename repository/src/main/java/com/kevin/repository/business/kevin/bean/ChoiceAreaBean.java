package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chen.huarong on 2017/9/30.
 */

public class ChoiceAreaBean implements Parcelable {

    /**
     * address : 瑶海区
     * code : 340102
     */

    private String address;
    private String code;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.address);
        dest.writeString(this.code);
    }

    public ChoiceAreaBean() {
    }

    protected ChoiceAreaBean(Parcel in) {
        this.address = in.readString();
        this.code = in.readString();
    }

    public static final Parcelable.Creator<ChoiceAreaBean> CREATOR = new Parcelable.Creator<ChoiceAreaBean>() {
        @Override
        public ChoiceAreaBean createFromParcel(Parcel source) {
            return new ChoiceAreaBean(source);
        }

        @Override
        public ChoiceAreaBean[] newArray(int size) {
            return new ChoiceAreaBean[size];
        }
    };
}
