package com.netease.dao;

import com.netease.entity.AdPo;

import java.util.List;

/**
 * 广告dao
 * @Author: zhouwen
 * @Date: 2017/7/12 21:20
 */
public interface AdDao {

    List<AdPo> selectAll();
}
