package com.nlzh.common.util.bean;
import java.util.List;
 
/**
 * 分页辅助类：对分页的基本数据进行一个简单的封装
 * 用来传递分页参数和查询参数params
 */
public class Page<T> {
    private int pageNumber = 1;							//页码，默认是第一页
    private int pageSize = 10;	//每页显示的记录数，默认是10
    private long total;						//总记录数
    private int totalPage;							//总页数
    private List<T> pageData;						//对应的当前页记录
    
    private int startIndex;
    
    private String msg;

    private boolean suc = true;
    
    public void setMsg(String msg) {
		this.msg = msg;
	}

    
    public boolean isSuc() {
		return suc;
	}

	public void setSuc(boolean suc) {
		this.suc = suc;
	}

	public String getMsg() {
		return "查询成功111";
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

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getPageData() {
		return pageData;
	}

	public void setPageData(List<T> pageData) {
		this.pageData = pageData;
	}

	@Override
	public String toString() {
		return "Page [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", total=" + total + ", totalPage="
				+ totalPage + ", pageData=" + pageData + ", startIndex=" + startIndex + ", msg=" + msg + "]";
	}

	
	
	


	
    
    

}