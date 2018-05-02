package com.nlzh.core.query;

public class SysMemoQuery {
	
	private int pageNumber = 1;							//页码，默认是第一页
	   
	private int pageSize = 10;
	
	private int startIndex;
	
	/**
	 * 模板id
	 */
	private Long sysTemplateId;
	
	/**
	 * 系统名称
	 */
	private String sysMemoName;
	
	/**
	 * 系统
	 */
	private String sysMemoAnothername;
	
	public int getStartIndex() {
		if(pageNumber ==0){
			return 0;
		}
		
		startIndex = (pageNumber -1 ) * pageSize;
		return startIndex;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getSysTemplateId() {
		return sysTemplateId;
	}

	public void setSysTemplateId(Long sysTemplateId) {
		this.sysTemplateId = sysTemplateId;
	}

	public String getSysMemoName() {
		return sysMemoName;
	}

	public void setSysMemoName(String sysMemoName) {
		this.sysMemoName = sysMemoName;
	}

	public String getSysMemoAnothername() {
		return sysMemoAnothername;
	}

	public void setSysMemoAnothername(String sysMemoAnothername) {
		this.sysMemoAnothername = sysMemoAnothername;
	}

	@Override
	public String toString() {
		return "SysMemoQuery [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", startIndex=" + startIndex
				+ ", sysTemplateId=" + sysTemplateId + ", sysMemoName=" + sysMemoName + ", sysMemoAnothername="
				+ sysMemoAnothername + "]";
	}
	
	
	
	
	
}
