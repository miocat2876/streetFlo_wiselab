package com.streetflo.miocat.dto.rest;

import com.streetflo.miocat.util.page.PageDto;

import lombok.Data;

@Data
public class SearchDto implements PageDto {

    private String test;

	@Override
	public int getCurrentPage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getViewData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSearchCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSearchValue() {
		// TODO Auto-generated method stub
		return null;
	}
}