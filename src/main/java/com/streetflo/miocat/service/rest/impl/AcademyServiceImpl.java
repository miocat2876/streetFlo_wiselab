package com.streetflo.miocat.service.rest.impl;

import com.streetflo.miocat.dao.rest.AcademyMapper;
import com.streetflo.miocat.dao.rest.CalenderMapper;
import com.streetflo.miocat.dto.rest.AcademyLIstDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.service.rest.AcademyService;
import com.streetflo.miocat.util.page.PageDto;
import com.streetflo.miocat.util.page.ScrollPagingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademyServiceImpl implements AcademyService {

	@Autowired
	private AcademyMapper academyMapper;

	public List<AcademyDto> academyAddressFind(AcademyLIstDto pagingDto) {
		return academyMapper.academyAddressFind(pagingDto);
	}
}
