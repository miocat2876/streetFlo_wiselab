package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.dto.rest.ProfileDto;
import com.streetflo.miocat.service.rest.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value = "/teacher/") -> 이 부분 학생 / 선생님 분리 고민 중
public class ProfileController {

/*
    선생님 마이 페이지 json 컨트롤러
*/

    @Autowired
    private ProfileService profileService;

    @RequestMapping("profileStudentAdd")
    public int profileStudentAdd(@RequestBody ProfileDto dto){
        return profileService.profileStudentAdd(dto);
    }






}

