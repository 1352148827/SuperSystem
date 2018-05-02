package com.nlzh.my.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlzh.my.mapper.MyConsumptionItemMapper;
import com.nlzh.my.pojo.MyConsumptionItem;
import com.nlzh.my.service.MyConsumptionItemService;


/**
 * 每日消费项目
 * @author 13521
 *
 */
@Service
public class MyConsumptionItemServiceImpl implements MyConsumptionItemService {
	
	@Autowired
	private MyConsumptionItemMapper myConsumptionItemMapper;

	@Override
	public int deleteByPrimaryKey(Long myConsumptionItemId) {
		return myConsumptionItemMapper.deleteByPrimaryKey(myConsumptionItemId);
	}

	@Override
	public int insert(MyConsumptionItem myConsumptionItem) {
		return myConsumptionItemMapper.insertSelective(myConsumptionItem);
	}

	@Override
	public MyConsumptionItem selectByPrimaryKey(Long myConsumptionItemId) {
		return myConsumptionItemMapper.selectByPrimaryKey(myConsumptionItemId);
	}

	@Override
	public int updateByPrimaryKey(MyConsumptionItem myConsumptionItem) {
		return myConsumptionItemMapper.updateByPrimaryKeySelective(myConsumptionItem);
	}


}
