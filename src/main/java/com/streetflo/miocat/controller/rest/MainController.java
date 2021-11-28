package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.dto.rest.AcademyLIstDto;
import com.streetflo.miocat.dto.rest.WordAbverbDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.CommonCodeDto;
import com.streetflo.miocat.service.rest.AcademyService;
import com.streetflo.miocat.service.rest.CommonCodeService;
import com.streetflo.miocat.service.rest.ReviewPopupWordAbverbService;
import com.streetflo.miocat.service.rest.impl.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


/* 스케줄 조회
 * 스케줄 등록
 * 스케줄 삭제
 * 스케줄 업데이트
 */

@RequiredArgsConstructor
@RestController
public class MainController {

	private final CommonCodeService commonCodeService;

	private final ReviewPopupWordAbverbService reviewPopupWordAbverbService;

	@PostMapping("/commonFind")
	public Map<String,List<String>> mapTest(@RequestBody @Nullable CommonCodeDto dto){

		return commonCodeService.CommonCodeFind(dto);

	}

	@GetMapping("/test1123")
	public String test(WordAbverbDto dto){

		System.out.println(dto);

		System.out.println(reviewPopupWordAbverbService.reviewPopupWordAbverbFind(dto));

		return reviewPopupWordAbverbService.reviewPopupWordAbverbFind(dto).toString();

	}



}
