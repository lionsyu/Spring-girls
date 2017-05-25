package com.spring.dao;

import com.spring.entity.User;

/**
 * Created by yuxin on 2017/5/24.
 */
public interface UserDao {

    int save(User user);

    int saveSelective(User user);

    User getById(Long id);

    User getByTel(String tel);

    int updateByIdSelective(User user);

    int updateById(User user);
}
