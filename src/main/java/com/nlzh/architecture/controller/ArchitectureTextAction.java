package com.nlzh.architecture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nlzh.architecture.pojo.ArchitectureText;
import com.nlzh.architecture.service.ArchitectureTextService;
import com.nlzh.common.util.Result;
import com.nlzh.common.util.UserContextUtils;

/**
 * 架构师之路的资料
 * @author 13521
 *
 */
@Controller
@RequestMapping("/ArchitectureTextAction")
public class ArchitectureTextAction {

	@Autowired
	private ArchitectureTextService architectureTextService;
	
	/**
	 * 添加
	 */
	@RequestMapping(value="/insertArchitectureText")
	@ResponseBody
	public Result insertArchitectureText(ArchitectureText architectureText)throws Exception{
		
		architectureTextService.insert(architectureText);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 删除
	 */
	@RequestMapping(value="/deleteArchitectureText")
	@ResponseBody
	public Result deleteArchitectureText(Long architectureTextId)throws Exception{
		
		architectureTextService.deleteByPrimaryKey(architectureTextId);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/updateArchitectureText")
	@ResponseBody
	public Result updateArchitectureText(ArchitectureText architectureText)throws Exception{
		
		architectureTextService.updateByPrimaryKey(architectureText);
		
		Result result = new Result();
		result.setStatus(true);
		return result;
	}
	
	/**
	 * 查询
	 */
	@RequestMapping(value="/selectArchitectureText")
	@ResponseBody
	public ArchitectureText selectArchitectureText(Long architectureTextId)throws Exception{
		ArchitectureText architectureText=architectureTextService.selectByPrimaryKey(architectureTextId);
		return architectureText;
	}
	
	
	/**
	 * 跳转到main页面
	 * @param architectureTextId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/toMain")
	public String toMain(Long architectureTextId,Model model)throws Exception{
		ArchitectureText architectureText=architectureTextService.selectByPrimaryKey(architectureTextId);
		model.addAttribute("result", architectureText);
		String result =UserContextUtils.getSysMemo().getSysMemoAnothername()+"/main";
		return result;
	}
	
	
}
