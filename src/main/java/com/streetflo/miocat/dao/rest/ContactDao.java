package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.TestDto;
import com.streetflo.miocat.util.page.PagingDto;
import com.streetflo.miocat.util.page.ScrollPagingDao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class ContactDao implements ScrollPagingDao {

	@Override
	public ArrayList<?> paging(PagingDto pagingDto) {
		// TODO Auto-generated method stub
		return null;
	} {
}