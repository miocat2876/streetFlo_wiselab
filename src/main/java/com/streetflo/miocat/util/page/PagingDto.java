package com.streetflo.miocat.util.page;

public class PagingDto {
	
	private final static int defaultViewData = 20;
	private int viewData;
	private int currentPage;
	private String searchCondition;
	private String searchValue;
	
	public PagingDto(PageingBulider bulider) {
		
		//필수값없으면 에러처리.
		
		this.currentPage = bulider.currentPage == 0 ? 1 : bulider.currentPage;
		this.viewData = bulider.viewData == 0 ? defaultViewData : bulider.viewData;
		this.searchCondition = bulider.searchCondition == null ? "" : bulider.searchCondition;
		this.searchValue = bulider.searchValue == null ? "" : bulider.searchValue;

	}
	
	public int getStartData() {
		
		return (currentPage - 1) * viewData + 1;
	}
	public int getEndData() {
		
		return currentPage * viewData;
	}
	
	public String getSearchCondition() {
		return searchCondition;
	}

	public String getSearchValue() {
		return searchValue;
	}


	public static class PageingBulider{
		
		private int viewData;
		private int currentPage;
		private String searchCondition;
		private String searchValue;
		
		public PageingBulider setViewData(int viewData) {
			this.viewData = viewData;
			return this;
		}
		public PageingBulider setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
			return this;
		}
		public PageingBulider setSearchCondition(String searchCondition) {
			this.searchCondition = searchCondition;
			return this;
		}
		public PageingBulider setSearchValue(String searchValue) {
			this.searchValue = searchValue;
			return this;
		}
		
		public PagingDto bulid() {
			
			return new PagingDto(this);
		}
		
		
	}
	
	
	

}
