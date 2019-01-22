package com.kevin.repository.business.kevin.bean;

/**
 * Author: qiaoping.xiao  on 2018/1/10.
 * 赛事发起方信息Bean
 */

public class SponsorInfoBean {

    /**
     * isPraise : 0
     * showSponsorVo : {"sponsorId":0,"sponsorName":"string","sponsorLogo":"string","briefInfo":"string","attentions":0,"showCounts":0}
     */

    private int isPraise;
    private ShowSponsorVoBean showSponsorVo;

    public int getIsPraise() {
        return isPraise;
    }

    public void setIsPraise(int isPraise) {
        this.isPraise = isPraise;
    }

    public ShowSponsorVoBean getShowSponsorVo() {
        return showSponsorVo;
    }

    public void setShowSponsorVo(ShowSponsorVoBean showSponsorVo) {
        this.showSponsorVo = showSponsorVo;
    }

    public static class ShowSponsorVoBean {
        /**
         * sponsorId : 0
         * sponsorName : string
         * sponsorLogo : string
         * briefInfo : string
         * attentions : 0
         * showCounts : 0
         */

        private int sponsorId;
        private String sponsorName;
        private String sponsorLogo;
        private String briefInfo;
        private int attentions;
        private int showCounts;

        public int getSponsorId() {
            return sponsorId;
        }

        public void setSponsorId(int sponsorId) {
            this.sponsorId = sponsorId;
        }

        public String getSponsorName() {
            return sponsorName;
        }

        public void setSponsorName(String sponsorName) {
            this.sponsorName = sponsorName;
        }

        public String getSponsorLogo() {
            return sponsorLogo;
        }

        public void setSponsorLogo(String sponsorLogo) {
            this.sponsorLogo = sponsorLogo;
        }

        public String getBriefInfo() {
            return briefInfo;
        }

        public void setBriefInfo(String briefInfo) {
            this.briefInfo = briefInfo;
        }

        public int getAttentions() {
            return attentions;
        }

        public void setAttentions(int attentions) {
            this.attentions = attentions;
        }

        public int getShowCounts() {
            return showCounts;
        }

        public void setShowCounts(int showCounts) {
            this.showCounts = showCounts;
        }
    }
}
