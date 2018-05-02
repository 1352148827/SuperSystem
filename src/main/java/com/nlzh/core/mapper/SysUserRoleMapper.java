package com.nlzh.core.mapper;

import com.nlzh.core.pojo.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long userRoleId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long userRoleId);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}