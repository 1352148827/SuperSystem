package com.nlzh.architecture.mapper;

import com.nlzh.architecture.pojo.ArchitectureText;

public interface ArchitectureTextMapper {
    int deleteByPrimaryKey(Long architectureTextId);

    int insert(ArchitectureText record);

    int insertSelective(ArchitectureText record);

    ArchitectureText selectByPrimaryKey(Long architectureTextId);

    int updateByPrimaryKeySelective(ArchitectureText record);

    int updateByPrimaryKeyWithBLOBs(ArchitectureText record);

    int updateByPrimaryKey(ArchitectureText record);
}