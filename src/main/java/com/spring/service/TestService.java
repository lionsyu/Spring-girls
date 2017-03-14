package com.spring.service;

import com.spring.dao.TestDao;
import com.spring.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuxin on 2017/3/14.
 */
@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public Test test(Long id){
        return testDao.test(id);
    }
}
