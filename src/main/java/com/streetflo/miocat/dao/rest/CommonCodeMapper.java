package com.streetflo.miocat.dao.rest;


import com.streetflo.miocat.dto.table.CommonCodeDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommonCodeMapper {

	List<CommonCodeDto> commonCodeFind(CommonCodeDto dto);

}