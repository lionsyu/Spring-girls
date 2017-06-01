package com.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.spring.common.baseResult.JsonFactory;
import com.spring.common.baseResult.ResultEnum;
import com.spring.common.util.TelUtils;
import com.spring.entity.Cherry;
import com.spring.service.CherryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuxin on 2017/5/31.
 */
@RestController
public class CherryController {

    @Autowired
    CherryService cherryService;

    //樱桃下单
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public JSONObject orderCherry(Cherry cherry) {
        if (StringUtils.isEmpty(cherry.getConsumer_name())
                || StringUtils.isEmpty(cherry.getConsumer_addr())
                || StringUtils.isEmpty(cherry.getConsumer_tel())
                || null == cherry.getCherry_type()
                || null == cherry.getWeight()
                || StringUtils.isEmpty(cherry.getUser())
                || null == cherry.getSell_price()) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.PARAM_ERROR);
        }
        if (!TelUtils.isChinaTel(cherry.getConsumer_tel())) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.TEL_ERROR);
        }
        cherryService.order(cherry);
        return new JsonFactory<Void>().successFactory();

    }
}
