package com.nlzh.core.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nlzh.common.util.SysConstantUtils;
import com.nlzh.core.pojo.SysMemo;
import com.nlzh.core.pojo.SysTemplate;
import com.nlzh.core.service.SysMemoService;
import com.nlzh.core.service.SysTemplateService;

/**
 * 主页
 * @author 13521
 *
 */
@Controller
public class HomeAction {
	
	@Autowired
	private SysMemoService sysMemoService;
	
	@Autowired
	private SysTemplateService sysTemplateService;
	
	@RequestMapping(value="homeAction_fmain")
	public String fmain(String moduleName)throws Exception{
		return "forward:/WEB-INF/jsp/home/fmain.jsp";
	}

	@RequestMapping("homeAction_title")
	public String title(String moduleName)throws Exception{
		return "forward:/WEB-INF/jsp/home/title.jsp";
	}

	
	/**
	 * 跳转中视图
	 * @param moduleName
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("homeAction_tomain")
	public String tomain(String moduleName)throws Exception{
		return "forward:/WEB-INF/jsp/"+moduleName+"/main.jsp";
	}
	
	/**
	 * 跳转左视图时保存模板对象
	 * @param moduleName
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("homeAction_toleft")
	public String toleft(String moduleName,HttpSession httpSession)throws Exception{
		if(!moduleName.equals("home")){
			SysMemo sysMemo = sysMemoService.selectRelationBySysmemoanothername(moduleName);
			httpSession.setAttribute(SysConstantUtils.SYS_MEMO, sysMemo);
		}
		
		return "forward:/WEB-INF/jsp/"+moduleName+"/left.jsp";
	}

}
