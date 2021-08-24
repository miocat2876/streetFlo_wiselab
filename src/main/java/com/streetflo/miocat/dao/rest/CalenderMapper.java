package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CalenderMapper {
    List<ScheduleDto> scheduleFind(CalenderDto calenderDto);
}