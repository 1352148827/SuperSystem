package com.nlzh.my.service;

import com.nlzh.my.pojo.MyConsumptionItem;

public interface MyConsumptionItemService {
	
	int deleteByPrimaryKey(Long myConsumptionItemId);

    int insert(MyConsumptionItem myConsumptionItem);

    MyConsumptionItem selectByPrimaryKey(Long myConsumptionItemId);

    int updateByPrimaryKey(MyConsumptionItem myConsumptionItem);
    

	

}
