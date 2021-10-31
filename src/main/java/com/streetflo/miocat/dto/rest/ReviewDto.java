package com.streetflo.miocat.dto.rest;

import com.streetflo.miocat.util.page.PageDto;

import lombok.Data;

@Data
public class ReviewDto implements PageDto {

    private String test;

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