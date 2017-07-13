package com.netease.bean;

/**
 * 每一条商户信息的详细
 * @Author: zhouwen
 * @Date: 2017/6/4 15:37
 */
public class Business {

    private String img;

    private String title;

    private String subTitle;

    private String price;

    private String distance;

    private int mumber;

    private long id;


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getMumber() {
        return mumber;
    }

    public void setMumber(int mumber) {
        this.mumber = mumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
