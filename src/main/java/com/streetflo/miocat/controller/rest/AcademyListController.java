package com.streetflo.miocat.controller.rest;

import com.google.gson.Gson;
import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import com.streetflo.miocat.dto.rest.AcademyLIstDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.ScheduleSubscribeDto;
import com.streetflo.miocat.service.rest.AcademyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/* 스케줄 조회
 * 스케줄 등록
 * 스케줄 삭제
 * 스케줄 업데이트
 */

@RequiredArgsConstructor
@RestController
public class AcademyListController {

	private final AcademyService academyService;


	//gson 사용법 구글 json 라이브러리
	//https://soft.plusblog.co.kr/61
	@RequestMapping("mapTest")
	public List<AcademyDto> mapTest(@RequestBody AcademyLIstDto dto){

		return academyService.academyAddressFind(dto);


//		List<String> list = new ArrayList<String>();
//		Gson gson = new Gson();
//		AcademyDto data = null;
//		for (int i = 0; i<5; i++){
//			data = new AcademyDto();
//			data.setSeq(i);
//			data.setAcademyName("제목"+i);
//			data.setAddressSido("제주특별자치도 ");
//			data.setAddressDong("제주시");
//			data.setAddressDetail("첨단로 24" + i);
//			String json = gson.toJson(data);
//			list.add(json);
//		}
//
//		System.out.println(list.toString());
//
//		return list.toString();


	}

//	@ResponseBody
//	@GetMapping("/test11")
//	public List<AcademyDto> test11(){
//
//		AcademyLIstDto dto = new AcademyLIstDto();
//
//		dto.setSeq(0);
//		dto.setParamCurrentPage(1);
//		dto.setParamSearchCondition("TEST");
//		dto.setParamSearchValue("TEST");
//
//		academyService.academyAddressFind(dto);
//
//		return academyService.academyAddressFind(dto);
//
//	}
//




}
