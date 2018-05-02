package com.nlzh.my.service;

import com.nlzh.my.pojo.MyConsumptionDay;

public interface MyConsumptionDayService {
	
	 int deleteByPrimaryKey(Long myConsumptionDayId);

    int insert(MyConsumptionDay myConsumptionDay);

    MyConsumptionDay selectByPrimaryKey(Long myConsumptionDayId);

    int updateByPrimaryKey(MyConsumptionDay myConsumptionDay);
    


}
