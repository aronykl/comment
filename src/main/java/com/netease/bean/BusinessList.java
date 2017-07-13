package com.netease.bean;

import java.util.List;

/**
 * 返回给前端的商户信息
 * @Author: zhouwen
 * @Date: 2017/6/4 15:36
 */
public class BusinessList {

    private boolean hasMore;

    private List<Business> data;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<Business> getData() {
        return data;
    }

    public void setData(List<Business> data) {
        this.data = data;
    }
}
