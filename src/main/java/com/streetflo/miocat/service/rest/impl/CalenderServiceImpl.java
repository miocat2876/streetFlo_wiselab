package com.streetflo.miocat.service.rest.impl;

import com.streetflo.miocat.dao.rest.CalenderMapper;
import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import com.streetflo.miocat.service.rest.CalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("CalenderService")
public class CalenderServiceImpl implements CalenderService {

    @Autowired
    private CalenderMapper calenderMapper;


    @Transactional
    @Override
    public List<CalenderDto> scheduleFind(CalenderDto calenderDto) {
        List<CalenderDto> CalenderList = calenderMapper.calenderFind(calenderDto);
        List<ScheduleDto> ScheduleList = calenderMapper.scheduleFind(calenderDto);

        System.out.println(ScheduleList.size());
        for ( ScheduleDto dto: ScheduleList) {
            System.out.println(dto);
        }

        ArrayList<ScheduleDto> list2 = new ArrayList<>();
        ScheduleDto dto = new ScheduleDto();


        return CalenderList;
    }

    @Override
    public int scheduleAdd(ScheduleDto dto) {
        return calenderMapper.scheduleAdd(dto);
    }
}