package com.streetflo.miocat.util.page;

import java.util.List;

import com.streetflo.miocat.util.page.ScrollPagingDto.ScrollPageingBulider;


public class AbScrollPage<T extends PageDto> implements Page {
	
	
	// 현재페이지
	// 데이터개수
	// 몇개 보여줄지
	
	//검색
	//회원정보

	private final ScrollPagingService dao;
	private final T dto;
	
	public AbScrollPage(T dto, ScrollPagingService service) {
		this.dto = dto;
		this.dao = service;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PageDto> process() {
		return (List<PageDto>) dao.paging(bulid());
	}
	
	private T bulid() {

//		this.currentPage = bulider.currentPage == 0 ? 1 : bulider.currentPage;
//		this.viewData = bulider.viewData == 0 ? defaultViewData : bulider.viewData;
//		this.searchCondition = bulider.searchCondition == null ? "" : bulider.searchCondition;
//		this.searchValue = bulider.searchValue == null ? "" : bulider.searchValue;

		return dto;

	}


	// 시작데이터 ((현재페이지 - 1) * 몇개보여줄지) +1 1 ~ 20 21 ~ 40
	// 끝데이터 현재페이지 * 몇개보여줄지  
	

}
