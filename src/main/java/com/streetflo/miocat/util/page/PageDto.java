package com.streetflo.miocat.util.page;

public interface PageDto {

	int defaultViewData = 20;
	public abstract int getParamCurrentPage();
	public abstract int getParamViewData();
	public abstract String getParamSearchCondition();
	public abstract String getParamSearchValue();

	default public int getStartData() {
		int currentPage = getParamCurrentPage() == 0 ? 1 : getParamCurrentPage();
		int viewData = getParamViewData() == 0 ? defaultViewData : getParamViewData();
		return (currentPage - 1) * viewData + 1;
	}
	default public int getEndData() {
		int currentPage = getParamCurrentPage() == 0 ? 1 : getParamCurrentPage();
		int viewData = getParamViewData() == 0 ? defaultViewData : getParamViewData();
		return currentPage * viewData;
	}
	default public int getViewData() {
		return getParamViewData() == 0 ? defaultViewData : getParamViewData();
	}
	default public String getSearchCondition() {
		return getParamSearchCondition();
	}
	default public String getSearchValue() {
		return getParamSearchValue();
	}



}
