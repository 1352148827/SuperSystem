package com.nlzh.my.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlzh.common.util.DateUtils;
import com.nlzh.common.util.Result;
import com.nlzh.common.util.bean.Page;
import com.nlzh.my.mapper.MyEventMapper;
import com.nlzh.my.pojo.MyEvent;
import com.nlzh.my.query.MyEventQueryVO;
import com.nlzh.my.service.MyEventService;

@Service
public class MyEventServiceImpl implements MyEventService {
	
	@Autowired
	private MyEventMapper myEventMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		MyEvent myEvent = myEventMapper.selectByPrimaryKey(id);
		myEvent.setDeleted(1);
		myEventMapper.updateByPrimaryKeySelective(myEvent);
		return 1;
	}

	@Override
	public int insert(MyEvent myEvent) {
		
		if(myEvent.getType()==null){
			myEvent.setType(1);
		}
		myEvent.setDeleted(0);
		myEvent.setGmtCreate(DateUtils.getCurrentDateStr());
		myEvent.setGmtModified(DateUtils.getCurrentDateStr());
		return myEventMapper.insertSelective(myEvent);
	}

	@Override
	public MyEvent selectByPrimaryKey(Long myEventId) {
		return myEventMapper.selectByPrimaryKey(myEventId);
	}

	@Override
	public int updateByPrimaryKey(MyEvent myEvent) {
		myEvent.setGmtModified(DateUtils.getCurrentDateStr());
		return myEventMapper.updateByPrimaryKeySelective(myEvent);
	}


	@Override
	public List<MyEvent> listAll() {
		return myEventMapper.listAll();
	}

	@Override
	public Page<MyEvent> listPage(MyEventQueryVO myEventQueryVO) {
		Page<MyEvent> page = new Page<MyEvent>();
		
		// 当前页记录
		List<MyEvent> list =myEventMapper.selectByQueryVO(myEventQueryVO);
		// 总记录数
		long count = myEventMapper.countByQueryVO(myEventQueryVO);
		
		page.setPageData(list);
		page.setTotal(count);
		return page;
	}

	/**
	 * 批量删除
	 */
	@Override
	public Result deleteBatchMyEvent(Long[] id) {
		Result result = new Result();
		
		if(id == null || id.length==0){
			result.setStatus(false);
			result.setMsg("请选择要删除的记录");
		}
		
		myEventMapper.deleteBatchMyEvent(id);
		
		result.setStatus(true);
		return result;
	}

}
