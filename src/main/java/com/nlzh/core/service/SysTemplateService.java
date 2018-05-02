package com.nlzh.core.service;

import java.util.List;

import com.nlzh.core.pojo.SysTemplate;

public interface SysTemplateService {

	int deleteByPrimaryKey(Long SysTemplateId);

    int insert(SysTemplate SysTemplate);

    SysTemplate selectByPrimaryKey(Long SysTemplateId);

    int updateByPrimaryKey(SysTemplate SysTemplate);
    
	List<SysTemplate> listAll();
}
