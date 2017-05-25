package com.spring.service;

import com.spring.entity.User;

/**
 * Created by yuxin on 2017/5/24.
 */
public interface UserService {

    int register(User user);

    int root(Long id);

    User getByTel(String tel);

}
