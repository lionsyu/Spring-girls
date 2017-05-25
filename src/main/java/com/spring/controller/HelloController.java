package com.spring.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.spring.common.baseResult.JsonFactory;
import com.spring.common.baseResult.ResultEnum;
import com.spring.common.util.TelUtils;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


/**
 * Created by yuxin on 2017/3/15.
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册借口
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JSONObject register(@RequestBody User user) {

        if (StringUtils.isEmpty(user.getUsername())
                || StringUtils.isEmpty(user.getTel())
                || StringUtils.isEmpty(user.getPassword())) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.PARAM_ERROR);
        }
        if (!TelUtils.isChinaTel(user.getTel())) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.TEL_ERROR);
        }
        userService.register(user);
        return new JsonFactory<Void>().successFactory();
    }

    /**
     * 用户权限变为root（此接口不可对外开放，需spring security做权限）
     *
     * @param tel
     * @return
     */
    @RequestMapping(value = "/root", method = RequestMethod.PATCH)
    public JSONObject register(String tel) {
        if (StringUtils.isEmpty(tel)) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.PARAM_ERROR);
        }
        if (!TelUtils.isChinaTel(tel)) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.TEL_ERROR);
        }
        User user = userService.getByTel(tel);
        if (null == user) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.USER_NOT_EXIST);
        }
        if (User.RoleTypes.root != user.getRole()) {
            return new JsonFactory<Void>().errorFactory(ResultEnum.NO_ACCESS);
        }
        userService.root(user.getId());
        return new JsonFactory<Void>().successFactory();
    }
}
