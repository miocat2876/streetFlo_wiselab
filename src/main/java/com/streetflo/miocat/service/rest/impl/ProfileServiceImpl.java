package com.streetflo.miocat.service.rest.impl;


import com.streetflo.miocat.dto.rest.ProfileDto;
import com.streetflo.miocat.service.rest.CalenderService;
import org.springframework.beans.factory.annotation.Autowired;


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