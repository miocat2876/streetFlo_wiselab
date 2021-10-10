package com.streetflo.miocat.dto.rest;

import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.util.page.PageDto;

public class AcademyLIstDto extends AcademyDto implements PageDto {

	private int getCurrentPage;
	private String searchCondition;
	private String searchValue;

	public void setGetCurrentPage(int getCurrentPage) {
		this.getCurrentPage = getCurrentPage;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public int getParamCurrentPage() {
		return this.getCurrentPage;
	}

	@Override
	public int getParamViewData() {
		return 10;
	}

	@Override
	public String getParamSearchCondition() {
		return this.searchCondition;
	}

	@Override
	public String getParamSearchValue() {
		return this.searchValue;
	}
}
