package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shijia on 2017/7/26.
 */

public class DesignerInfoBean implements Parcelable {
    private String openId;
    private int designerId;
    private String designerImage;
    private String designerName;
    private String positions;
    private String mobile;
    private String workStart;
    private int companyId;
    private int score;
    private String companyName;
    private String percentCompletion; // 个人资料完成百分比
    private int authentication; // 认证状态(0,未认证;1,认证中;2,已认证;3,认证驳回;4,已认证待审核;5,已认证,被驳回;6,已认证,审核通过)
    private int stepStatus;

    public int getScore() {
        return score;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getDesignerId() {
        return designerId;
    }

    public void setDesignerId(int designerId) {
        this.designerId = designerId;
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

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWorkStart() {
        return workStart;
    }

    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

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

    public int getStepStatus() {
        return stepStatus;
    }

    public void setStepStatus(int stepStatus) {
        this.stepStatus = stepStatus;
    }

    public String getPercentCompletion() {
        return percentCompletion;
    }

    public void setPercentCompletion(String percentCompletion) {
        this.percentCompletion = percentCompletion;
    }

    public int getAuthentication() {
        return authentication;
    }

    public void setAuthentication(int authentication) {
        this.authentication = authentication;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.openId);
        dest.writeInt(this.designerId);
        dest.writeString(this.designerImage);
        dest.writeString(this.designerName);
        dest.writeString(this.positions);
        dest.writeString(this.mobile);
        dest.writeString(this.workStart);
        dest.writeInt(this.companyId);
        dest.writeString(this.companyName);
        dest.writeString(this.percentCompletion);
        dest.writeInt(this.authentication);
        dest.writeInt(this.stepStatus);
    }

    public DesignerInfoBean() {
    }

    protected DesignerInfoBean(Parcel in) {
        this.openId = in.readString();
        this.designerId = in.readInt();
        this.designerImage = in.readString();
        this.designerName = in.readString();
        this.positions = in.readString();
        this.mobile = in.readString();
        this.workStart = in.readString();
        this.companyId = in.readInt();
        this.companyName = in.readString();
        this.percentCompletion = in.readString();
        this.authentication = in.readInt();
        this.stepStatus = in.readInt();
    }

    public static final Parcelable.Creator<DesignerInfoBean> CREATOR = new Parcelable.Creator<DesignerInfoBean>() {
        @Override
        public DesignerInfoBean createFromParcel(Parcel source) {
            return new DesignerInfoBean(source);
        }

        @Override
        public DesignerInfoBean[] newArray(int size) {
            return new DesignerInfoBean[size];
        }
    };
}
