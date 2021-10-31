package com.streetflo.miocat.dto.rest;

import com.streetflo.miocat.util.page.PageDto;

public class NoticeDto implements PageDto {


	@Override
	public int getParamCurrentPage() {
		return 0;
	}

	@Override
	public int getParamViewData() {
		return 0;
	}

	@Override
	public String getParamSearchCondition() {
		return null;
	}

	@Override
	public String getParamSearchValue() {
		return null;
	}

	@Override
	public void setParamCurrentPage(int getCurrentPage) {

	}

	@Override
	public void setParamSearchCondition(String searchCondition) {

	}

	@Override
	public void setParamSearchValue(String searchValue) {

	}
}