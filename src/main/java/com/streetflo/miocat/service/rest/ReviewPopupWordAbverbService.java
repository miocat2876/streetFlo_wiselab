package com.streetflo.miocat.service.rest;

import com.streetflo.miocat.dto.rest.AcademyLIstDto;
import com.streetflo.miocat.dto.rest.WordAbverbDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.ReviewKeywordDto;

import java.util.List;

public interface ReviewPopupWordAbverbService {

	 List<WordAbverbDto> reviewPopupWordAbverbFind(WordAbverbDto dto);
}
