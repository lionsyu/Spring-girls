package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import com.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by yuxin on 2017/5/24.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int saveSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User getByTel(String tel){
        return userMapper.selectByTel(tel);
    }

    @Override
    public int updateByIdSelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
