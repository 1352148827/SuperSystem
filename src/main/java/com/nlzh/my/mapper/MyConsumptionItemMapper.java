package com.nlzh.my.mapper;

import com.nlzh.my.pojo.MyConsumptionItem;

public interface MyConsumptionItemMapper {
    int deleteByPrimaryKey(Long consumptionItemId);

    int insert(MyConsumptionItem record);

    int insertSelective(MyConsumptionItem record);

    MyConsumptionItem selectByPrimaryKey(Long consumptionItemId);

    int updateByPrimaryKeySelective(MyConsumptionItem record);

    int updateByPrimaryKey(MyConsumptionItem record);
}