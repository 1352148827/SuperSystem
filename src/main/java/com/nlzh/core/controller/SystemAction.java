package com.nlzh.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nlzh.core.pojo.SysMemo;
import com.nlzh.core.service.SysMemoService;

@Controller
@RequestMapping(value="/SystemAction")
public class SystemAction {
	
	@Autowired
	private SysMemoService sysMemoService;
	
	/**
	 * 查询所有菜单
	 */
	@RequestMapping(value="/listAll")
	@ResponseBody
	public List<SysMemo> listAll()throws Exception{
		List<SysMemo> list = sysMemoService.listAll();
		System.out.println(list);
		return list;
	}

}
