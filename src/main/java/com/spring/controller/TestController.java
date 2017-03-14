package com.spring.controller;

import com.spring.common.UserProperties;
import com.spring.dao.TestDao;
import com.spring.entity.Test;
import com.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuxin on 2017/3/2.
 */
@RestController
public class TestController {

//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private UserProperties userProperties;

    @Autowired
    TestService testService;


    @RequestMapping(value = "/hello／{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return id+userProperties.getName()+userProperties.getAge().toString();
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String testGet(@RequestParam("id") Integer myId){
        return myId.toString();
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(@RequestParam Long id){
        Test test = testService.test(id);
        return test.getInfo();
    }
}
