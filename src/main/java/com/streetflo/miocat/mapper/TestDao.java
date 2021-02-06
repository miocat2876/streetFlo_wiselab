package com.streetflo.miocat.mapper;


import com.streetflo.miocat.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestDao {
    TestDto test2();
}
