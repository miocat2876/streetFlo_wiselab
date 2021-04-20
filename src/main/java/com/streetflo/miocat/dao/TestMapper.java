package com.streetflo.miocat.dao;


import com.streetflo.miocat.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
    TestDto test2();
}