package com.nlzh.architecture.service;


import com.nlzh.architecture.pojo.ArchitectureText;

public interface ArchitectureTextService {
	int deleteByPrimaryKey(Long architectureTextId);

    int insert(ArchitectureText architectureText);

    ArchitectureText selectByPrimaryKey(Long architectureTextId);

    int updateByPrimaryKey(ArchitectureText architectureText);

}
