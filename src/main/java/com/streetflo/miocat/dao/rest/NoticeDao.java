package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.util.page.ScrollPagingDao;
import com.streetflo.miocat.util.page.ScrollPagingDto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class NoticeDao implements ScrollPagingDao {

	@Override
	public List<?> paging(ScrollPagingDto pagingDto) {

		System.out.println(pagingDto);
		System.out.println(pagingDto.getStartData());
		System.out.println(pagingDto.getEndData());

		System.out.println("찍히나?");
		// TODO Auto-generated method stub
		return null;
	}
	

}