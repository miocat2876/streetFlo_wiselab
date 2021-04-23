package com.streetflo.miocat.util.page;

import java.util.List;

import com.streetflo.miocat.util.page.ScrollPagingDto.ScrollPageingBulider;


public class AbScrollPage<E> implements Page<E> {
	
	
	// 현재페이지
	// 데이터개수
	// 몇개 보여줄지
	
	//검색
	//회원정보

	private ScrollPagingDao dao;
	private PageDto dto;
	
	public AbScrollPage(PageDto dto,ScrollPagingDao dao) {
		this.dto = dto;
		this.dao = dao;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<E> process() {
		return (List<E>) dao.paging(bulid());
	}
	
	private ScrollPagingDto bulid() {
		
		ScrollPageingBulider bulider = new ScrollPageingBulider();
		
		bulider.setCurrentPage(dto.getCurrentPage());
		bulider.setViewData(dto.getViewData());
		bulider.setSearchCondition(dto.getSearchCondition());
		bulider.setSearchValue(dto.getSearchValue());
		return bulider.bulid();

	}


	// 시작데이터 ((현재페이지 - 1) * 몇개보여줄지) +1 1 ~ 20 21 ~ 40
	// 끝데이터 현재페이지 * 몇개보여줄지  
	

}
