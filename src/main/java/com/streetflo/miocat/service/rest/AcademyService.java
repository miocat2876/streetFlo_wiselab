package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.util.page.ScrollPagingService;

import java.util.List;

public interface AcademyService {

	 List<AcademyDto> academyAddressFind(AcademyDto pagingDto);
}
