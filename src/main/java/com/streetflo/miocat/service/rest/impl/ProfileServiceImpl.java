package com.streetflo.miocat.service.rest.impl;


import com.streetflo.miocat.dao.rest.ProfileMapper;
import com.streetflo.miocat.dto.rest.ProfileDto;
import com.streetflo.miocat.service.rest.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("ProfileService")
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileMapper profileMapper;

    @Transactional

    @Override
    public int profileStudentAdd(ProfileDto dto) {
        return profileMapper.profileStudentAdd(dto);
    }


}