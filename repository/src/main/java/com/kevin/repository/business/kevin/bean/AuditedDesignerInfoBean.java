package com.kevin.repository.business.kevin.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by dong.wang
 * Date: 2017/7/26
 * Time: 11:13
 * Description:
 */

public class AuditedDesignerInfoBean implements Parcelable {


    /**
     * id : 0
     * designerName : string
     * designerImgUrl : string
     * nation : 0
     * companyId : string
     * companyName : string
     * cityAddress : string
     * cityCode : string
     * district : ["string"]
     * districtCode : ["string"]
     * designerBudget : string
     * market : string
     * marketCode : string
     * knowledgeStyle : ["string"]
     * knowledgeStyleIds : string
     * workStart : string
     * certificateImage : string
     * postcard : string
     * concept : string
     * personalBrightSpot : string
     */

    private int id;
    private String designerName;
    private String designerImgUrl;
    private int nation;
    private String companyId;
    private String companyName;
    private String cityAddress;
    private String cityCode;
    private String designerBudget;
    private String market;
    private String marketCode;
    private String knowledgeStyleIds;
    private String workStart;
    private String certificateImage;
    private String postcard;
    private String concept;
    private String personalBrightSpot;
    private List<String> district;
    private List<String> districtCode;
    private List<String> knowledgeStyle;

    public AuditedDesignerInfoBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }

    public String getDesignerImgUrl() {
        return designerImgUrl;
    }

    public void setDesignerImgUrl(String designerImgUrl) {
        this.designerImgUrl = designerImgUrl;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDesignerBudget() {
        return designerBudget;
    }

    public void setDesignerBudget(String designerBudget) {
        this.designerBudget = designerBudget;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getKnowledgeStyleIds() {
        return knowledgeStyleIds;
    }

    public void setKnowledgeStyleIds(String knowledgeStyleIds) {
        this.knowledgeStyleIds = knowledgeStyleIds;
    }

    public String getWorkStart() {
        return workStart;
    }

    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

    public String getCertificateImage() {
        return certificateImage;
    }

    public void setCertificateImage(String certificateImage) {
        this.certificateImage = certificateImage;
    }

    public String getPostcard() {
        return postcard;
    }

    public void setPostcard(String postcard) {
        this.postcard = postcard;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getPersonalBrightSpot() {
        return personalBrightSpot;
    }

    public void setPersonalBrightSpot(String personalBrightSpot) {
        this.personalBrightSpot = personalBrightSpot;
    }

    public List<String> getDistrict() {
        return district;
    }

    public void setDistrict(List<String> district) {
        this.district = district;
    }

    public List<String> getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(List<String> districtCode) {
        this.districtCode = districtCode;
    }

    public List<String> getKnowledgeStyle() {
        return knowledgeStyle;
    }

    public void setKnowledgeStyle(List<String> knowledgeStyle) {
        this.knowledgeStyle = knowledgeStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.designerName);
        dest.writeString(this.designerImgUrl);
        dest.writeInt(this.nation);
        dest.writeString(this.companyId);
        dest.writeString(this.companyName);
        dest.writeString(this.cityAddress);
        dest.writeString(this.cityCode);
        dest.writeString(this.designerBudget);
        dest.writeString(this.market);
        dest.writeString(this.marketCode);
        dest.writeString(this.knowledgeStyleIds);
        dest.writeString(this.workStart);
        dest.writeString(this.certificateImage);
        dest.writeString(this.postcard);
        dest.writeString(this.concept);
        dest.writeString(this.personalBrightSpot);
        dest.writeStringList(this.district);
        dest.writeStringList(this.districtCode);
        dest.writeStringList(this.knowledgeStyle);
    }

    protected AuditedDesignerInfoBean(Parcel in) {
        this.id = in.readInt();
        this.designerName = in.readString();
        this.designerImgUrl = in.readString();
        this.nation = in.readInt();
        this.companyId = in.readString();
        this.companyName = in.readString();
        this.cityAddress = in.readString();
        this.cityCode = in.readString();
        this.designerBudget = in.readString();
        this.market = in.readString();
        this.marketCode = in.readString();
        this.knowledgeStyleIds = in.readString();
        this.workStart = in.readString();
        this.certificateImage = in.readString();
        this.postcard = in.readString();
        this.concept = in.readString();
        this.personalBrightSpot = in.readString();
        this.district = in.createStringArrayList();
        this.districtCode = in.createStringArrayList();
        this.knowledgeStyle = in.createStringArrayList();
    }

    public static final Parcelable.Creator<AuditedDesignerInfoBean> CREATOR = new Parcelable.Creator<AuditedDesignerInfoBean>() {
        @Override
        public AuditedDesignerInfoBean createFromParcel(Parcel source) {
            return new AuditedDesignerInfoBean(source);
        }

        @Override
        public AuditedDesignerInfoBean[] newArray(int size) {
            return new AuditedDesignerInfoBean[size];
        }
    };
}
