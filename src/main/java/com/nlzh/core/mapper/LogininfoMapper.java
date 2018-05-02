package com.nlzh.core.mapper;

import com.nlzh.core.pojo.Logininfo;

public interface LogininfoMapper {
    int deleteByPrimaryKey(Long loginid);

    int insert(Logininfo record);

    int insertSelective(Logininfo record);

    Logininfo selectByPrimaryKey(Long loginid);

    int updateByPrimaryKeySelective(Logininfo record);

    int updateByPrimaryKey(Logininfo record);
}