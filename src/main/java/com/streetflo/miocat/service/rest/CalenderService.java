package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.TestDto;
import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;

import java.util.List;

public interface CalenderService {

    List<CalenderDto> scheduleFind(CalenderDto calenderDto);

    int scheduleAdd(ScheduleDto dto);

}