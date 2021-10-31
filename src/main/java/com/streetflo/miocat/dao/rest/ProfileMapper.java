package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.ProfileDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProfileMapper {

    // 학생정보 추가
    int profileStudentAdd(ProfileDto dto);

    // 선생님정보 추가
    int profileTeacherAdd(ProfileDto dto);

    // 선생님사이트 추가
    int profileTeacherInstaAdd(ProfileDto dto);

}