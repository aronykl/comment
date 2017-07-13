package com.netease.entity;

/**
 * 广告
 * @Author: zhouwen
 * @Date: 2017/7/12 21:17
 */
public class AdPo {

    private Long id;
    private String title;
    private String imgFileName;
    private String link;
    private Integer weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AdPo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imgFileName='" + imgFileName + '\'' +
                ", link='" + link + '\'' +
                ", weight=" + weight +
                '}';
    }
}
