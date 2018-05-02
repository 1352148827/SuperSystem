package com.nlzh.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nlzh.common.util.Result;
import com.nlzh.common.util.bean.Page;
import com.nlzh.core.pojo.SysMemo;
import com.nlzh.core.query.SysMemoQuery;
import com.nlzh.core.service.SysMemoService;
import com.nlzh.my.pojo.MyEvent;

/**
 * 系统菜单
 * @author 13521
 *
 */
@Controller
@RequestMapping(value="/SysMemoAction")
public class SysMemoAction {
	
	@Autowired
	private SysMemoService sysMemoService;
	
	/**
	 * 添加
	 */
	@RequestMapping(value="/insertSysMemo")
	@ResponseBody
	public Result insertSysMemo(SysMemo sysMemo)throws Exception{
		
		sysMemoService.insert(sysMemo);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 删除
	 */
	@RequestMapping(value="/deleteSysMemo")
	@ResponseBody
	public Result deleteSysMemo(Long sysMemoId)throws Exception{
		
		sysMemoService.deleteByPrimaryKey(sysMemoId);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/updateSysMemo")
	@ResponseBody
	public Result updateSysMemo(SysMemo sysMemo)throws Exception{
		
		sysMemoService.updateByPrimaryKey(sysMemo);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 查询
	 */
	@RequestMapping(value="/selectSysMemo")
	@ResponseBody
	public SysMemo selectSysMemo(Long sysMemoId)throws Exception{
		SysMemo sysMemo=sysMemoService.selectByPrimaryKey(sysMemoId);
		return sysMemo;
	}
	
	/**
	 * 通过系统菜单别名查询系统菜单对象
	 */
	@RequestMapping(value="/selectBySysMemoAnothername")
	@ResponseBody
	public SysMemo selectBySysMemoAnothername (String sysMemoAnothername)throws Exception{
		SysMemo sysMemo=sysMemoService.selectBySysmemoanothername(sysMemoAnothername);
		return sysMemo;
	}
	
	/**
	 * 分页查询
	 */
	@RequestMapping(value="/listPage")
	@ResponseBody
	public Page<SysMemo> listPage(SysMemoQuery sysMemoQuery)throws Exception{
		System.out.println(sysMemoQuery);
		Page<SysMemo> page = sysMemoService.listPage(sysMemoQuery);
		System.out.println(page);
		return page;
	}
	
	/**
	 * 批量删除
	 * @param sysMemoQuery
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/deleteBatchSysMemo")
	@ResponseBody
	public Result deleteBatchSysMemot(Long[] sysMemoId)throws Exception{
		Result result = sysMemoService.deleteBatchSysMemot(sysMemoId);
		return result;
	}
	
	/**
	 * 跳转toSysMemoList.jsp页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toSysMemoList")
	public String toSysMemoList()throws Exception{
		return "system/sysMemo/sysMemoList";
	}
	
	/**
	 * 跳转toSysMemoAdd.jsp页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toSysMemoAdd")
	public String toSysMemoAdd()throws Exception{
		return "system/sysMemo/sysMemoAdd";
	}
	
	/**
	 * 跳转toSysMemoUpdate.jsp页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toSysMemoUpdate")
	public String toSysMemoUpdate(Long sysMemoId)throws Exception{
		return "system/sysMemo/sysMemoUpdate";
	}
}
