package com.streetflo.miocat.util.page;

import java.util.List;

import com.streetflo.miocat.util.page.PagingDto.PageingBulider;

import oracle.net.aso.p;

public class ScrollPage<E> implements Page<E> {
	
	
	// 현재페이지
	// 데이터개수
	// 몇개 보여줄지
	
	//검색
	//회원정보

	private ScrollPagingDao dao;
	private PageDtoImpl dto;
	
	public ScrollPage(PageDtoImpl dto,ScrollPagingDao dao) {
		this.dto = dto;
		this.dao = dao;
	}
	
	@Override
	public List<E> process() {
		return bulid();
	}
	
	@SuppressWarnings("unchecked")
	private List<E> bulid() {
		
		PageingBulider bulider = new PageingBulider();
		
		bulider.setCurrentPage(dto.getCurrentPage());
		bulider.setViewData(dto.getViewData());
		bulider.setSearchCondition(dto.getSearchCondition());
		bulider.setSearchValue(dto.getSearchValue());
		return (List<E>) dao.paging(bulider.bulid());

	}


	// 시작데이터 ((현재페이지 - 1) * 몇개보여줄지) +1 1 ~ 20 21 ~ 40
	// 끝데이터 현재페이지 * 몇개보여줄지  
	

}
