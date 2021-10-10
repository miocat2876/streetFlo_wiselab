package com.streetflo.miocat.dto.rest;

import com.streetflo.miocat.util.page.PageDto;

import lombok.Data;

@Data
public class SearchDto implements PageDto {

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
}