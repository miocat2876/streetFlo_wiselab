package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.ProfileDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProfileMapper {

    int profileStudentAdd(ProfileDto dto);

}