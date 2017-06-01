package com.spring.mapper;

import com.spring.entity.Cherry;
import org.springframework.stereotype.Repository;

@Repository
public interface CherryMapper {
    int insert(Cherry record);

    int insertSelective(Cherry record);

    Cherry selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cherry record);

}