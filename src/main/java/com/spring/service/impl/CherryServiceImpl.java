package com.spring.service.impl;

import com.spring.entity.Cherry;
import com.spring.mapper.CherryMapper;
import com.spring.service.CherryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yuxin on 2017/5/31.
 */
@Service
public class CherryServiceImpl implements CherryService {

    @Autowired
    CherryMapper cherryMapper;

    @Override
    public int order(Cherry cherry){
        cherry.setCreate_time(new Date());
        return cherryMapper.insertSelective(cherry);
    }
}
