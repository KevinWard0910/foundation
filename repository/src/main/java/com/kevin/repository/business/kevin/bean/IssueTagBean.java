package com.kevin.repository.business.kevin.bean;

/**
 * Created by dong.wang
 * Date: 2017/8/30
 * Time: 10:14
 * Description:
 */

public class IssueTagBean {

    /**
     * id : 788
     * name : 营销谈单
     * hasConcerned : 0
     * imageUrl : string
     */

    private int id;
    private String name;
    private int hasConcerned;
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHasConcerned() {
        return hasConcerned;
    }

    public void setHasConcerned(int hasConcerned) {
        this.hasConcerned = hasConcerned;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
