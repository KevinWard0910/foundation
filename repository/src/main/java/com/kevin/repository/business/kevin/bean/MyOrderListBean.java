package com.kevin.repository.business.kevin.bean;

import java.util.List;

/**
 * Created by jiquan.zhong on 2018/1/13.
 * 我的订单
 */

public class MyOrderListBean {

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

    public static class RecordsBean {
        private int id;//订单id
        private String ownerName;//业主姓名
        private String ownerTel;//业主电话
        private String provinceCode;//省code
        private String provinceName;//省名称
        private String cityCode;//城市code
        private String cityName;//城市名称
        private String districtCode;//区code
        private String districtName;//区名称
        private String address;//业主地址
        private String community;//小区
        private int orderType;//订单类型 1.活动需求2.定向需求3.装修保单 ,
        private long dispatchedTime;//派单时间
        private int orderStatus;//订单状态 0：待确认接单 1：确认接单 2：完成量房 3：上传初步方案 4:上传效果图 5：确认预算 6：确认施工图 7：签订施工合同 8：客服取消 ,
        private long confirmTime;//确认时间
        private long currentTime;//当前服务器时间
        public long getCurrentTime() {
            return currentTime;
        }
        public void setCurrentTime(long currentTime) {
            this.currentTime = currentTime;
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

        public long getDispatchedTime() {
            return dispatchedTime;
        }

        public void setDispatchedTime(long dispatchedTime) {
            this.dispatchedTime = dispatchedTime;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public long getConfirmTime() {
            return confirmTime;
        }

        public void setConfirmTime(long confirmTime) {
            this.confirmTime = confirmTime;
        }
    }
}
