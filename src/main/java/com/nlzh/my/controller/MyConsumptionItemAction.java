package com.nlzh.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nlzh.common.util.Result;
import com.nlzh.my.pojo.MyConsumptionItem;
import com.nlzh.my.service.MyConsumptionItemService;

@Controller
@RequestMapping("/MyConsumptionItemAction")
public class MyConsumptionItemAction {

	
	@Autowired
	private MyConsumptionItemService myConsumptionItemService;
	
	/**
	 * 添加
	 */
	@RequestMapping(value="/insertMyConsumptionItem")
	@ResponseBody
	public Result insertMyConsumptionItem(MyConsumptionItem myConsumptionItem)throws Exception{
		
		myConsumptionItemService.insert(myConsumptionItem);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 删除
	 */
	@RequestMapping(value="/deleteMyConsumptionItem")
	@ResponseBody
	public Result deleteMyConsumptionItem(Long myConsumptionItemId)throws Exception{
		
		myConsumptionItemService.deleteByPrimaryKey(myConsumptionItemId);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/updateMyConsumptionItem")
	@ResponseBody
	public Result updateMyConsumptionItem(MyConsumptionItem myConsumptionItem)throws Exception{
		
		myConsumptionItemService.updateByPrimaryKey(myConsumptionItem);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 查询
	 */
	@RequestMapping(value="/selectMyConsumptionItem")
	@ResponseBody
	public MyConsumptionItem selectMyConsumptionItem(Long myConsumptionItemId)throws Exception{
		MyConsumptionItem myConsumptionItem=myConsumptionItemService.selectByPrimaryKey(myConsumptionItemId);
		return myConsumptionItem;
	}
	
}
