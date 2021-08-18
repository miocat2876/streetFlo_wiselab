package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.util.page.ScrollPagingDao;
import com.streetflo.miocat.util.page.ScrollPagingDto;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class ContactDao implements ScrollPagingDao {

	@Override
	public ArrayList<?> paging(ScrollPagingDto pagingDto) {
		// TODO Auto-generated method stub
		return null;
	} 
}