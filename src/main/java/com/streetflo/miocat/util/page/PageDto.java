package com.streetflo.miocat.util.page;

public interface PageDto {

	public abstract int getParamCurrentPage();
	public abstract int getParamViewData();
	public abstract String getParamSearchCondition();
	public abstract String getParamSearchValue();


//			this.currentPage = bulider.currentPage == 0 ? 1 : bulider.currentPage;
//		this.viewData = bulider.viewData == 0 ? defaultViewData : bulider.viewData;
//		this.searchCondition = bulider.searchCondition == null ? "" : bulider.searchCondition;
//		this.searchValue = bulider.searchValue == null ? "" : bulider.searchValue;

	default public int getStartData() {
		int defaultViewData = 20;
		int currentPage = getParamCurrentPage() == 0 ? 1 : getParamCurrentPage();
		int viewData = getParamViewData() == 0 ? defaultViewData : getParamViewData();
		return (currentPage - 1) * viewData + 1;
	}
	default public int getEndData() {
		int defaultViewData = 20;
		int currentPage = getParamCurrentPage() == 0 ? 1 : getParamCurrentPage();
		int viewData = getParamViewData() == 0 ? defaultViewData : getParamViewData();

		return currentPage * viewData;
	}
	default public int getViewData() {
		int defaultViewData = 20;
		return getParamViewData() == 0 ? defaultViewData : getParamViewData();
	}
	default public String getSearchCondition() {
		return getParamSearchCondition();
	}
	default public String getSearchValue() {
		return getParamSearchValue();
	}



}
