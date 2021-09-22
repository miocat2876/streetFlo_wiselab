package com.streetflo.miocat.service.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper NoticeMapper;

    @Override
    public List<NoticeDto> NoticeList(NoticeDto NoticeDto) {
        List<NoticeDto> NoticeList = NoticeMapper.NoticeFind(NoticeDto);
        return NoticeList;
    }

    @Override
    public int NoticeAdd(NoticeDto dto) {
        int result = 0;
        if(NoticeMapper.NoticeAdd(dto) != 0){
            result = NoticeMapper.NoticeAdd(dto);
        }
        return result;
    }



}