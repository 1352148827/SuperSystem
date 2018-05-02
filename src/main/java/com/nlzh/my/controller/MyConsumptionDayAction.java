package com.nlzh.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nlzh.common.util.Result;
import com.nlzh.my.pojo.MyConsumptionDay;
import com.nlzh.my.service.MyConsumptionDayService;

@Controller
@RequestMapping("/MyConsumptionDayAction")
public class MyConsumptionDayAction {

	@Autowired
	private MyConsumptionDayService myConsumptionDayService;
	
	/**
	 * 添加
	 */
	@RequestMapping(value="/insertMyConsumptionDay")
	@ResponseBody
	public Result insertMyConsumptionDay(MyConsumptionDay myConsumptionDay)throws Exception{
		
		myConsumptionDayService.insert(myConsumptionDay);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 删除
	 */
	@RequestMapping(value="/deleteMyConsumptionDay")
	@ResponseBody
	public Result deleteMyConsumptionDay(Long myConsumptionDayId)throws Exception{
		
		myConsumptionDayService.deleteByPrimaryKey(myConsumptionDayId);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/updateMyConsumptionDay")
	@ResponseBody
	public Result updateMyConsumptionDay(MyConsumptionDay myConsumptionDay)throws Exception{
		
		myConsumptionDayService.updateByPrimaryKey(myConsumptionDay);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 查询
	 */
	@RequestMapping(value="/selectMyConsumptionDay")
	@ResponseBody
	public MyConsumptionDay selectMyConsumptionDay(Long myConsumptionDayId)throws Exception{
		MyConsumptionDay myConsumptionDay=myConsumptionDayService.selectByPrimaryKey(myConsumptionDayId);
		return myConsumptionDay;
	}
	
}
