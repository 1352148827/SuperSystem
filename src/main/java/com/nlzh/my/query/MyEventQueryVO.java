package com.nlzh.my.query;


/**
 * 我的事件查询vo
 * @author 13521
 *
 */
public class MyEventQueryVO {

	private int pageNumber = 1;							//页码，默认是第一页
   
	private int pageSize = 10;
	
	private int startIndex;
    
    private String name;
    
    /**
     * 当前时间 （指定时间）
     */
    private String currentDate;

    /**
     * 开始时间：是当前时间的0点
     */
    private String startDate;

    /**
     * 结束时间：是当前时间的末点
     */
    private String endDate;

    private String startGmtCreate;

    private String endGmtCreate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartGmtCreate() {
		return startGmtCreate;
	}

	public void setStartGmtCreate(String startGmtCreate) {
		this.startGmtCreate = startGmtCreate;
	}

	public String getEndGmtCreate() {
		return endGmtCreate;
	}

	public void setEndGmtCreate(String endGmtCreate) {
		this.endGmtCreate = endGmtCreate;
	}

	
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
	

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public String toString() {
		return "MyEventQueryVO [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", startIndex=" + startIndex
				+ ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startGmtCreate="
				+ startGmtCreate + ", endGmtCreate=" + endGmtCreate + "]";
	}

	
	
	
    
    
}
