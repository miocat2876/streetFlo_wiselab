package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.TestDto;
import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import com.streetflo.miocat.dto.table.ScheduleSubscribeDto;

import java.util.List;

public interface CalenderService {

    List<CalenderDto> scheduleFind(CalenderDto calenderDto);

    int scheduleAdd(ScheduleDto dto);

    int scheduleSubscribeAdd(ScheduleSubscribeDto dto);

}