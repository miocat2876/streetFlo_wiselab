package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.config.auth.dto.OAuthAttributes;
import com.streetflo.miocat.domain.user.User;
import com.streetflo.miocat.util.page.ScrollPagingDao;
import com.streetflo.miocat.util.page.ScrollPagingDto;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class MemberDao implements ScrollPagingDao {

	private SqlSession sql;

	private static String namespace = "com.streetflo.miocat.dao.rest.MemberDao";

	@Override
	public ArrayList<?> paging(ScrollPagingDto pagingDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public User saveOrUpdate(OAuthAttributes attributes) {
		if (sql.selectOne(namespace + ".idCheck", attributes)== null) {
			sql.insert(namespace + ".join", attributes);
		}else{
			sql.update(namespace + ".update", attributes);
		}
		return sql.selectOne(namespace + ".getInfo", attributes);
	}
}