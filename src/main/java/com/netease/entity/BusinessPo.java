package com.netease.entity;

/**
 * @Description: Created with IntelliJ IDEA.
 * @Author: zhouwen
 * @Date: 2017/6/5 21:07
 */
public class BusinessPo {

    private Long id;

    private String imgFileName;

    private String title;

    private String subtitle;

    private Double price;

    private Integer distance;

    private Integer num;

    private String description;

    private String city;

    private String category;

    private Integer starTotalNum;

    private Integer commentTotalNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStarTotalNum() {
        return starTotalNum;
    }

    public void setStarTotalNum(Integer starTotalNum) {
        this.starTotalNum = starTotalNum;
    }

    public Integer getCommentTotalNum() {
        return commentTotalNum;
    }

    public void setCommentTotalNum(Integer commentTotalNum) {
        this.commentTotalNum = commentTotalNum;
    }

    @Override
    public String toString() {
        return "BusinessPo{" +
                "id=" + id +
                ", imgFileName='" + imgFileName + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", price=" + price +
                ", distance=" + distance +
                ", num=" + num +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", category='" + category + '\'' +
                ", starTotalNum=" + starTotalNum +
                ", commentTotalNum=" + commentTotalNum +
                '}';
    }
}
