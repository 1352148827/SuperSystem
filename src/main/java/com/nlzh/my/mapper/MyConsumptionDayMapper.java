package com.nlzh.my.mapper;

import com.nlzh.my.pojo.MyConsumptionDay;

public interface MyConsumptionDayMapper {
    int deleteByPrimaryKey(Long consumptionDayId);

    int insert(MyConsumptionDay record);

    int insertSelective(MyConsumptionDay record);

    MyConsumptionDay selectByPrimaryKey(Long consumptionDayId);

    int updateByPrimaryKeySelective(MyConsumptionDay record);

    int updateByPrimaryKey(MyConsumptionDay record);
}