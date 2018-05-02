package com.nlzh.my.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlzh.my.mapper.MyConsumptionDayMapper;
import com.nlzh.my.pojo.MyConsumptionDay;
import com.nlzh.my.service.MyConsumptionDayService;

/**
 * 我的每日消费记录
 * @author 13521
 *
 */
@Service
public class MyConsumptionDayServiceImpl implements MyConsumptionDayService{

	@Autowired
	private MyConsumptionDayMapper myConsumptionDayMapper;


	@Override
	public int deleteByPrimaryKey(Long myConsumptionDayId) {
		return myConsumptionDayMapper.deleteByPrimaryKey(myConsumptionDayId);
	}

	@Override
	public int insert(MyConsumptionDay myConsumptionDay) {
		return myConsumptionDayMapper.insertSelective(myConsumptionDay);
	}

	@Override
	public MyConsumptionDay selectByPrimaryKey(Long myConsumptionDayId) {
		return myConsumptionDayMapper.selectByPrimaryKey(myConsumptionDayId);
	}

	@Override
	public int updateByPrimaryKey(MyConsumptionDay myConsumptionDay) {
		return myConsumptionDayMapper.updateByPrimaryKeySelective(myConsumptionDay);
	}


}
