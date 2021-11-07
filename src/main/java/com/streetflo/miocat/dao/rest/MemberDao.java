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

	public String idCheck(String uniqueId) {
		System.out.println();
		return sql.selectOne(namespace + ".idCheck", uniqueId);
	}

	public MemberDto getInfo(String uniqueId) {
		System.out.println();
		return sql.selectOne(namespace + ".getInfo", uniqueId);
	}

	public void setInfo(MemberDto n) {
		sql.update(namespace + ".setInfo", n);
	}

	public void save(MemberDto n) {
		System.out.println(n.getEmail());
		sql.insert(namespace + ".join", n);
	}



}