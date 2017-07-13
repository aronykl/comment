package com.netease.service.impl;

import com.netease.bean.Ad;
import com.netease.dao.AdDao;
import com.netease.entity.AdPo;
import com.netease.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Created with IntelliJ IDEA.
 * @Author: zhouwen
 * @Date: 2017/7/12 21:25
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdDao adDao;

    public List<Ad> getAllAd() {
        List<AdPo> poList = adDao.selectAll();
        final List<Ad> resultList = new ArrayList<Ad>();
        if (!CollectionUtils.isEmpty(poList)) {
            poList.forEach(po -> {
                Ad ad = new Ad();
                ad.setTitle(po.getTitle());
                ad.setImg(po.getImgFileName());
                ad.setLink(po.getLink());
                resultList.add(ad);
            });
        }
        return resultList;
    }
}
