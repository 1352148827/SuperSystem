package com.nlzh.my.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Array;
import com.nlzh.common.util.DateUtils;
import com.nlzh.common.util.Result;
import com.nlzh.common.util.bean.Page;
import com.nlzh.my.pojo.MyEvent;
import com.nlzh.my.query.MyEventQueryVO;
import com.nlzh.my.service.MyEventService;

@Controller
@RequestMapping(value="/MyEventAction")
public class MyEventAction {

	@Autowired
	private MyEventService myEventService;
	
	/**
	 * 添加
	 */
	@RequestMapping(value="/insertMyEvent")
	@ResponseBody
	public Result insertMyEvent(MyEvent myEvent)throws Exception{
		
		myEventService.insert(myEvent);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 删除
	 */
	@RequestMapping(value="/deleteMyEvent")
	@ResponseBody
	public Result deleteMyEvent(Long id)throws Exception{
		
		myEventService.deleteByPrimaryKey(id);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 批量删除
	 */
	@RequestMapping(value="/deleteBatchMyEvent")
	@ResponseBody
	public Result deleteBatchMyEvent(@RequestParam(value = "id[]")Long[] id)throws Exception{
		Result result = myEventService.deleteBatchMyEvent(id);
		return result;
	}
	
	
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/updateMyEvent")
	@ResponseBody
	public Result updateMyEvent(MyEvent myEvent)throws Exception{
		myEventService.updateByPrimaryKey(myEvent);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 查询
	 */
	@RequestMapping(value="/selectMyEvent")
	@ResponseBody
	public MyEvent selectMyEvent(Long id)throws Exception{
		MyEvent myEvent=myEventService.selectByPrimaryKey(id);
		return myEvent;
	}
	
	/**
	 * 查询所有
	 * 	 需求：
	 * 		1 只有一个currentDate时，查询当天的开始和结束时间（0点和尾点） 以实现
	 * 		2 多条件查询（因为currentDate，未实现）
	 */
	@RequestMapping(value="/listPage")
	@ResponseBody
	public Page<MyEvent> listPage(MyEventQueryVO myEventQueryVO)throws Exception{
		// 设置当前时间,多条件查询的开始时间和结束时间（开始和结束时间为当前时间的0点和尾点）
 		String currentDate = myEventQueryVO.getCurrentDate();
		// 如果当前时间不存在，就用当前时间查询
		if(currentDate == null || currentDate.trim().equals("")){
			currentDate = DateUtils.getCurrentDateStr();
			myEventQueryVO.setStartDate(DateUtils.getStartTimeOfDay(currentDate));
			myEventQueryVO.setEndDate(DateUtils.getEndTimeOfDay(currentDate));
		}else{
			myEventQueryVO.setStartDate(DateUtils.getStartTimeOfDay(currentDate));
			myEventQueryVO.setEndDate(DateUtils.getEndTimeOfDay(currentDate));
		}
		
		Page<MyEvent> result = myEventService.listPage(myEventQueryVO);
		
		return result;
	}
	
	//==================跳转页面start===================================================
	/**
	 * 跳转到myEventList页面
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toMyEventList")
	public String toMyEventList()throws Exception{
		return "my/myEvent/myEventList";
	}
	
	/**
	 * 跳转到myEventAdd页面
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toMyEventAdd")
	public String toMyEventAdd()throws Exception{
		return "my/myEvent/myEventAdd";
	}
	
	/**
	 * 跳转到myEventUpdate页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toMyEventUpdate")
	public String toMyEventUpdate(Long id,Model model)throws Exception{
		MyEvent myEvent = myEventService.selectByPrimaryKey(id);
		model.addAttribute("myEvent",myEvent);
		return "my/myEvent/myEventUpdate";
	}
	
	//==================跳转页面end===================================================
}
