package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yuxin on 2017/5/24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int register(User user) {
        user.setCreate_time(new Date());
        return userDao.save(user);
    }

    @Override
    public int root(Long id) {
        User user = new User();
        user.setId(id);
        user.setRole(User.RoleTypes.root);
        return userDao.updateByIdSelective(user);
    }

    @Override
    public User getByTel(String tel) {
        return userDao.getByTel(tel);
    }


}
