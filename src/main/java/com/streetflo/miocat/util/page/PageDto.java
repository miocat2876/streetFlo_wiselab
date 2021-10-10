package com.streetflo.miocat.util.page;

public interface PageDto {

	public abstract int getParamCurrentPage();
	public abstract int getParamViewData();
	public abstract String getParamSearchCondition();
	public abstract String getParamSearchValue();

	default public int getStartData() {
		return (getParamCurrentPage() - 1) * getParamViewData() + 1;
	}
	default public int getEndData() {
		return getParamCurrentPage() * getParamViewData();
	}
	default public int getViewData() {
		return getParamViewData();
	}
	default public String getSearchCondition() {
		return getParamSearchCondition();
	}
	default public String getSearchValue() {
		return getParamSearchValue();
	}



}
