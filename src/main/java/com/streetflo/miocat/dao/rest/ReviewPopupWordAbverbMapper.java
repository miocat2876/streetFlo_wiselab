package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.rest.WordAbverbDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.ReviewKeywordDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReviewPopupWordAbverbMapper {

	List<WordAbverbDto> reviewPopupWordAbverbFind(WordAbverbDto dto);

}