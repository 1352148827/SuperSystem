package com.nlzh.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlzh.core.mapper.SysTemplateMapper;
import com.nlzh.core.pojo.SysTemplate;
import com.nlzh.core.service.SysTemplateService;

@Service
public class SysTemplateServiceImpl implements SysTemplateService {

	@Autowired
	private SysTemplateMapper sysTemplateMapper;

	@Override
	public int deleteByPrimaryKey(Long sysTemplateId) {
		return sysTemplateMapper.deleteByPrimaryKey(sysTemplateId);
	}

	@Override
	public int insert(SysTemplate sysTemplate) {
		return sysTemplateMapper.insertSelective(sysTemplate);
	}

	@Override
	public SysTemplate selectByPrimaryKey(Long sysTemplateId) {
		return sysTemplateMapper.selectByPrimaryKey(sysTemplateId);
	}

	@Override
	public int updateByPrimaryKey(SysTemplate sysTemplate) {
		return sysTemplateMapper.updateByPrimaryKeySelective(sysTemplate);
	}
	
	@Override
	public List<SysTemplate> listAll() {
		return sysTemplateMapper.listAll();
	}

}
