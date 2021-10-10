package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.CalenderDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.ScheduleDto;
import com.streetflo.miocat.dto.table.ScheduleSubscribeDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AcademyMapper {

	List<AcademyDto> academyAddressFind(AcademyDto dto);

}