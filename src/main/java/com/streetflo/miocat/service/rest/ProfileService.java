package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.rest.ProfileDto;

public interface ProfileService{

    int profileStudentAdd(ProfileDto dto);

    int profileTeacherAdd(ProfileDto dto);

    int profileTeacherInstaAdd(ProfileDto dto);

}