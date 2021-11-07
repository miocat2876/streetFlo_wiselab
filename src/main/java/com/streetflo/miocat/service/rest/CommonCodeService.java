package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.rest.AcademyLIstDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.CommonCodeDto;

import java.util.List;
import java.util.Map;

public interface CommonCodeService {

	Map<String,List<String>> CommonCodeFind(CommonCodeDto dto);
}
