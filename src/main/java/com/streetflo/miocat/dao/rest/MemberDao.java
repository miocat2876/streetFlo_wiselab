package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.MemberDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sql;

	private static String namespace = "com.streetflo.mapper.rest.member";

	public void save(MemberDto n) {
		System.out.println(n.getEmail());
		sql.insert(namespace + ".join", n);
	}

	public MemberDto select(MemberDto n) {
		return sql.selectOne(namespace + ".getInfo", n.getEmail());
	}


}