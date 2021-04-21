package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NoticeDao {
    TestDto test2();
}