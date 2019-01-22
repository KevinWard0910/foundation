package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shijia on 2017/9/27.
 */

public class DesignCompanyBean implements Parcelable {
    private int companyId;
    private String companyName ;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.companyId);
        dest.writeString(this.companyName);
    }

    public DesignCompanyBean() {
    }

    protected DesignCompanyBean(Parcel in) {
        this.companyId = in.readInt();
        this.companyName = in.readString();
    }

    public static final Parcelable.Creator<DesignCompanyBean> CREATOR = new Parcelable.Creator<DesignCompanyBean>() {
        @Override
        public DesignCompanyBean createFromParcel(Parcel source) {
            return new DesignCompanyBean(source);
        }

        @Override
        public DesignCompanyBean[] newArray(int size) {
            return new DesignCompanyBean[size];
        }
    };
}
