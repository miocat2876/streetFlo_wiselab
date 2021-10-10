package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import com.streetflo.miocat.dao.rest.NoticeDao;
import com.streetflo.miocat.dto.rest.NoticeDto;
import com.streetflo.miocat.util.page.AbScrollPage;
import com.streetflo.miocat.util.page.Page;


import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/* 공지사항
 * 공지 조회
 * 공지 등록
 * 공지 삭제
 */

@RequiredArgsConstructor
@RestController
public class NoticeController {


	@GetMapping("/noticeTest")
	public List<Map> reviewReadTest(Model model) {


		List<Map> list = new ArrayList<>(2);

		Map<String, String> result1 = new HashMap<String, String>();
		result1.put("lect", "어떤 수업~");
		result1.put("cont", "공지 내용~~");

		Map<String, String> result2 = new HashMap<String, String>();
		result2.put("lect", "어떤 수업!!");
		result2.put("cont", "공지 내용!!");

		list.add(result1);
		list.add(result2);

		return list;

	}


// 	@PostMapping(path = "/noticeInsertTest")
// 	public String noticeInsert(Model model) {


// 		return null;
// 	}



	@GetMapping(path = "/test8")
    public String noticeRead(NoticeDto dto, Model model) {
    	
    	
    	//https://gracelove91.tistory.com/24 프로퍼티 세팅하기
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. DB 조회(공지 10건씩 페이징처리)
    	 * 4. json타입으로 반환
    	 */
    	
    	//Page page = new AbScrollPage(dto, new NoticeDao());

		//page.process().toString()
		return "";
    }




    public String noticeInsert(Model model, String userId) {
    	
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. 필수값 검증
    	 * 4. DB 입력
    	 * 5. 성공값 반환
    	 */


    	
    	
		return null;
    }

    public String noticeDelete(Model model) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. DB 삭제
    	 * 4. 성공값 반환
    	 */
    	
		return null;
    }




}
