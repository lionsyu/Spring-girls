package com.spring.dao;

import com.spring.entity.Test;
import com.spring.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yuxin on 2017/3/13.
 */
@Component
public class TestDao {

    @Autowired
    private TestMapper testMapper;

    public Test test(Long id){
        return testMapper.selectByPrimaryKey(id.intValue());
    }

}
