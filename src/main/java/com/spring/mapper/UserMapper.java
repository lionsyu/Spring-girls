package com.spring.mapper;

import com.spring.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    User selectByTel(String tel);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}