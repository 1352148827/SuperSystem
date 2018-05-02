package com.nlzh.common.util;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.nlzh.common.util.bean.VerifyCodeVO;
import com.nlzh.core.pojo.Logininfo;
import com.nlzh.core.pojo.SysMemo;



/**
 * 存取当前登录用户的工具类
 * @author Administrator
 * 
 */
public class UserContextUtils {

	

	private static HttpSession getSession() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest().getSession();
	}

	/**
	 * 设置SysMemo
	 * @param current
	 */
	public static void putSysMemo(SysMemo sysMemo) {
		getSession().setAttribute(SysConstantUtils.SYS_MEMO, sysMemo);
	}
	
	/**
	 * 获取SysMemo
	 * @return
	 */
	public static SysMemo getSysMemo() {
		return (SysMemo) getSession().getAttribute(
				SysConstantUtils.SYS_MEMO);
	}
	/**
	 * 添加loggininfo对象
	 * @param current
	 */
	public static void putCurrent(Logininfo current) {
		getSession().setAttribute(SysConstantUtils.LOGININFO_IN_SESSION, current);
	}

	/**
	 * 获取loggininfo对象
	 * @return
	 */
	public static Logininfo getCurrent() {
		return (Logininfo) getSession().getAttribute(
				SysConstantUtils.LOGININFO_IN_SESSION);
	}

	/**
	 * 存放当前发送的验证码信息
	 * @param vc
	 */
	public static void putVerifyCode(VerifyCodeVO vc) {
		getSession().setAttribute(SysConstantUtils.VERIFYCODE_IN_SESSION, vc);
	}

	/**
	 * 获取最后发送的验证码信息
	 * @return
	 */
	public static VerifyCodeVO getVerifyCode() {
		return (VerifyCodeVO) getSession().getAttribute(
				SysConstantUtils.VERIFYCODE_IN_SESSION);
	}

}
