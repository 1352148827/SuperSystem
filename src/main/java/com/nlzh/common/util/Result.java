package com.nlzh.common.util;

public class Result {
	
	/**
	 * 提示信息
	 */
	private String msg;
	
	private boolean status;
	
	/**
	 * 需要传给前端的对象
	 */
	private Object obj;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Result [msg=" + msg + ", status=" + status + ", obj=" + obj + "]";
	}
	
	
}
