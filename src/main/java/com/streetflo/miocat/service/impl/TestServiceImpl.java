package com.streetflo.miocat.service.impl;

import com.streetflo.miocat.dto.TestDto;
import com.streetflo.miocat.mapper.TestMapper;
import com.streetflo.miocat.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public TestDto test() {


        return testMapper.test2();
    }
}
