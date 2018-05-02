package com.nlzh.architecture.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlzh.architecture.mapper.ArchitectureTextMapper;
import com.nlzh.architecture.pojo.ArchitectureText;
import com.nlzh.architecture.service.ArchitectureTextService;

/**
 * 架构师之路的资料
 * @author 13521
 *
 */
@Service
public class ArchitectureTextServiceImpl implements ArchitectureTextService {
	
	@Autowired
	private ArchitectureTextMapper architectureTextMapper;

	@Override
	public int deleteByPrimaryKey(Long architectureTextId) {
		return architectureTextMapper.deleteByPrimaryKey(architectureTextId);
	}

	@Override
	public int insert(ArchitectureText architectureText) {
		return architectureTextMapper.insertSelective(architectureText);
	}

	@Override
	public ArchitectureText selectByPrimaryKey(Long architectureTextId) {
		return architectureTextMapper.selectByPrimaryKey(architectureTextId);
	}

	@Override
	public int updateByPrimaryKey(ArchitectureText architectureText) {
		return architectureTextMapper.updateByPrimaryKeySelective(architectureText);
	}


}
