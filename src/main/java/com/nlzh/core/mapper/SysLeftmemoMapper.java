package com.nlzh.core.mapper;

import com.nlzh.core.pojo.SysLeftmemo;

public interface SysLeftmemoMapper {
    int deleteByPrimaryKey(Long sysLeftmemoId);

    int insert(SysLeftmemo record);

    int insertSelective(SysLeftmemo record);

    SysLeftmemo selectByPrimaryKey(Long sysLeftmemoId);

    int updateByPrimaryKeySelective(SysLeftmemo record);

    int updateByPrimaryKey(SysLeftmemo record);
}