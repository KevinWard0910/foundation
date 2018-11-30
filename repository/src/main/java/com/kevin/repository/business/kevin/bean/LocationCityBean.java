package com.kevin.repository.business.kevin.bean;


/**
 * Author: qiaoping.xiao  on 2018/1/4.
 */

public class LocationCityBean  {
    /**
     * cityCode : 310100
     * cityName : 上海市
     * cityNameOfPY : shanghaishi
     * provinceCode : 310000
     * provinceName : 上海市
     */

    private String cityCode;
    private String cityName;
    private String cityNameOfPY;
    private String provinceCode;
    private String provinceName;

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


//    public String cityCode;
//    public String parentCode;
//    public String cityName;
//    public String cityNameOfPY;
//    public String provinceCode;
//    public String provinceName;
}
