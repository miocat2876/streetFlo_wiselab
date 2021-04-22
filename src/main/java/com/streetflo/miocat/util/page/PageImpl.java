package com.streetflo.miocat.util.page;

public interface PageImpl {
	
	public abstract int getCurrentPage();
	public abstract int getViewData();
	public abstract String getSearchCondition();
	public abstract String getSearchValue();

}
