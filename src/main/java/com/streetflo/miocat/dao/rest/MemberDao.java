package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.MemberDto;
import com.streetflo.miocat.util.page.PageDto;
import com.streetflo.miocat.util.page.ScrollPagingService;
import com.streetflo.miocat.util.page.ScrollPagingDto;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class MemberDao {

	@Autowired
	private SqlSession sql;

	private static String namespace = "com.streetflo.miocat.dao.rest.MemberDao";

	public void save(MemberDto n) {
		sql.insert(namespace + ".join", n);
	}

	public MemberDto select(MemberDto n) {
		return sql.selectOne(namespace + ".getInfo", n.getEmail());
	}


}