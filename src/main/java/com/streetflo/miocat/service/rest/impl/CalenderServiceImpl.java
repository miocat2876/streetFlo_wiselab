package com.streetflo.miocat.service.rest.impl;

import com.streetflo.miocat.dao.rest.CalenderMapper;
import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import com.streetflo.miocat.dto.table.ScheduleSubscribeDto;
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


    @Override
    public List<CalenderDto> scheduleFind(CalenderDto calenderDto) {
        List<CalenderDto> CalenderList = calenderMapper.calenderFind(calenderDto);
        List<ScheduleDto> ScheduleList = calenderMapper.scheduleFind(calenderDto);

        int size = -1;
        for (CalenderDto cDto:CalenderList) {
            if(cDto.getDay().equals("")){
                size++;
            }else{
                break;
            }
        }

        for ( ScheduleDto sDto: ScheduleList) {
            CalenderDto cDto = CalenderList.get(sDto.getDay() + size);
            if(cDto.getSchedule() == null){
                cDto.setSchedule(new ArrayList<>());
            }
            cDto.getSchedule().add(sDto);
        }

        return CalenderList;
    }

    @Transactional
    @Override
    public int scheduleAdd(ScheduleDto dto) {

        int result = 0;
        if(calenderMapper.scheduleAdd(dto) != 0){
            result = calenderMapper.scheduleWeekAdd(dto);
        }
        return result;
    }

    @Transactional
    @Override
    public int scheduleSubscribeAdd(ScheduleSubscribeDto dto) {
        return calenderMapper.scheduleSubscribeAdd(dto);
    }


}