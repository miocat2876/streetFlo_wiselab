package com.streetflo.miocat.service.rest.impl;

import com.streetflo.miocat.dao.rest.CalenderMapper;
import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import com.streetflo.miocat.service.rest.CalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CalenderService")
public class CalenderServiceImpl implements CalenderService {

    @Autowired
    private CalenderMapper calenderMapper;


    @Override
    public List<ScheduleDto> scheduleFind(CalenderDto calenderDto) {
        return calenderMapper.scheduleFind(calenderDto);
    }

    @Override
    public int scheduleAdd(ScheduleDto dto) {
        return calenderMapper.scheduleAdd(dto);
    }
}