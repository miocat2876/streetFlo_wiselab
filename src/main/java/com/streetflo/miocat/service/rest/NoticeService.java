package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.TestDto;

import java.util.List;

public interface NoticeService {

    List<NoticeDto> noticeFind(NoticeDto noticeDto);

    int NoticeAdd(NoticeDto dto);

}