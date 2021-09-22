package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


/* 리뷰
 * 리뷰 조회
 * 리뷰 등록
 * 리뷰 삭제
 */

@RequiredArgsConstructor
@RestController
public class ReviewController {


	@GetMapping("/reviewTest")
	public List<Map> reviewReadTest(Model model) {


		List<Map> list = new ArrayList<>(2);

		Map<String, String> result1 = new HashMap<String, String>();
        result1.put("name", "김하연");
        result1.put("genre", "크럼핑");
        result1.put("level", "Master");
        result1.put("content1", "유익한 수업 재밌는 커리큘럼");

		Map<String, String> result2 = new HashMap<String, String>();
		result2.put("name", "장하연");
		result2.put("genre", "크럼핑");
		result2.put("level", "Master");
		result2.put("content1", "유익한 수업 재밌는 커리큘럼");

		list.add(result1);
		list.add(result2);

        return list;

	}


    public String reviewRead(Model model) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. DB 조회(10건씩 페이징처리) 
    	 * 4. Json타입으로 반환
    	 */
    	
    	
    	
		return null;
    }

    public String reviewInsert(Model model) {
    	
    	/* 1.회원 pk받음
    	 * 2.회원 검증
    	 * 3.리뷰 필수값 검증
    	 * 4.DB 적재
    	 * 5.성공값 반환
    	 */
    	
    	
    	
		return null;
    }

    public String reviewDelete(Model model) {
    	
    	
    	/* 1.회원 pk받음
    	 * 2.회원 검증
    	 * 3.DB 삭제
    	 * 4.성공값 반환
    	 */
    	
    	
    	
		return null;
    }
    




}
