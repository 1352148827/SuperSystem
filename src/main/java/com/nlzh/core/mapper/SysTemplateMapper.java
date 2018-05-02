package com.nlzh.core.mapper;

import java.util.List;

import com.nlzh.core.pojo.SysTemplate;

public interface SysTemplateMapper {
    int deleteByPrimaryKey(Long sysTemplateId);

    int insert(SysTemplate record);

    int insertSelective(SysTemplate record);

    SysTemplate selectByPrimaryKey(Long sysTemplateId);

    int updateByPrimaryKeySelective(SysTemplate record);

    int updateByPrimaryKey(SysTemplate record);

	List<SysTemplate> listAll();
}