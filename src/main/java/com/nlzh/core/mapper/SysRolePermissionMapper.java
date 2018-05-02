package com.nlzh.core.mapper;

import com.nlzh.core.pojo.SysRolePermission;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}