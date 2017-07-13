package com.netease.controller.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netease.bean.Ad;
import com.netease.bean.BusinessList;
import com.netease.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @Description: Created with IntelliJ IDEA.
 * @Author: zhouwen
 * @Date: 2017/6/4 15:09
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private AdService adService;

    @RequestMapping(value = "/homead", method = RequestMethod.GET)
    public List<Ad> homead() throws IOException {

//        System.out.println(adService.getAllAd());
        return adService.getAllAd();

    }


    @RequestMapping(value = "/homelist/{city}/{page}", method = RequestMethod.GET)
    public BusinessList homelist() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonStr = "{\"hasMore\":true,\"data\":[{\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016201638030-473660627.png\",\"title\":\"汉堡大大\",\"subTitle\":\"叫我汉堡大大，还你多彩口味\",\"price\":\"28\",\"distance\":\"120m\",\"mumber\":\"389\",\"id\":\"7319141311867845\"},{\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016201645858-1342445625.png\",\"title\":\"北京开源饭店\",\"subTitle\":\"[望京]自助晚餐\",\"price\":\"98\",\"distance\":\"140m\",\"mumber\":\"689\",\"id\":\"026480873021239804\"},{\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016201652952-1050532278.png\",\"title\":\"服装定制\",\"subTitle\":\"原价xx元，现价xx元，可修改一次\",\"price\":\"1980\",\"distance\":\"160\",\"mumber\":\"106\",\"id\":\"8811883256439494\"},{\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016201700186-1351787273.png\",\"title\":\"婚纱摄影\",\"subTitle\":\"免费试穿，拍照留念\",\"price\":\"2899\",\"distance\":\"160\",\"mumber\":\"58\",\"id\":\"998319158714438\"},{\"img\":\"http://images2015.cnblogs.com/blog/138012/201610/138012-20161016201708124-1116595594.png\",\"title\":\"麻辣串串烧\",\"subTitle\":\"双人免费套餐等你抢购\",\"price\":\"0\",\"distance\":\"160\",\"mumber\":\"1426\",\"id\":\"9113180845679774\"}]}";

        return objectMapper.readValue(jsonStr, new TypeReference<BusinessList>() {});
    }



}
