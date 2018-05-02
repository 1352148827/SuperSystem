package com.nlzh.my.service;

import java.util.List;

import com.nlzh.common.util.Result;
import com.nlzh.common.util.bean.Page;
import com.nlzh.my.pojo.MyEvent;
import com.nlzh.my.query.MyEventQueryVO;

public interface MyEventService {
	
	int deleteByPrimaryKey(Long myEventId);

    int insert(MyEvent myEvent);

    MyEvent selectByPrimaryKey(Long myEventId);

    int updateByPrimaryKey(MyEvent myEvent);
    
	List<MyEvent> listAll();

	Page<MyEvent> listPage(MyEventQueryVO myEventQueryVO);

	/**
	 * 批量删除
	 * @param id
	 * @return
	 */
	Result deleteBatchMyEvent(Long[] id);
	
}
