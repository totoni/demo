package com.bw.util;

public class PageUtil {
	private String page;//页面的请求页
	
	private Integer pageSize;//每页展示的数据记录数
	private Integer count;//查询出来的总记录数
	
	private Integer currentPage;//处理后的当前页
	private Integer prevPage;//上一页
	private Integer nextPage;//下一页
	private Integer lastPage;//总页数
	private Integer startIndex;//每页的起始索引值
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(Integer prevPage) {
		this.prevPage = prevPage;
	}
	public Integer getNextPage() {
		return nextPage;
	}
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}
	public Integer getLastPage() {
		return lastPage;
	}
	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}
	public Integer getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	@Override
	public String toString() {
		return "PageUtil [page=" + page + ", pageSize=" + pageSize + ", count="
				+ count + ", currentPage=" + currentPage + ", prevPage="
				+ prevPage + ", nextPage=" + nextPage + ", lastPage="
				+ lastPage + ", startIndex=" + startIndex + "]";
	}
	public PageUtil() {
		
	}
	public PageUtil(String page, Integer pageSize, Integer count) {
		this.page = page;
		this.pageSize = pageSize;
		this.count = count;
		this.currentPage = page == null ? 1 : Integer.valueOf(page);//处理后的当前页
		this.startIndex = (currentPage - 1) * pageSize;//计算每页起始索引值
		this.prevPage = currentPage == 1 ? 1 : (currentPage - 1);//计算的上一页
		this.lastPage = count % pageSize == 0 ? (count / pageSize) : (count / pageSize + 1);//计算的最后一页
		if(this.count==0){
			this.lastPage = 1;
		}
		this.nextPage = currentPage == lastPage ? lastPage : (currentPage + 1);
	}
	
}
