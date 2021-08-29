package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import com.streetflo.miocat.dto.table.ScheduleSubscribeDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CalenderMapper {
    List<CalenderDto> calenderFind(CalenderDto calenderDto);
    List<ScheduleDto> scheduleFind(CalenderDto calenderDto);

    int scheduleAdd(ScheduleDto dto);
    int scheduleWeekAdd(ScheduleDto dto);
    int scheduleSubscribeAdd(ScheduleSubscribeDto dto);
}