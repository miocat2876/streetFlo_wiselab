package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/* 리뷰
 * 리뷰 조회
 * 리뷰 등록
 * 리뷰 삭제
 */

@RequiredArgsConstructor
@RestController
public class ReviewController {


    public String reviewRead(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. DB 조회(10건씩 페이징처리) 
    	 * 4. Json타입으로 반환
    	 */
    	
    	
    	
		return null;
    }

    public String reviewInsert(Model model, @LoginUser SessionUser user) {
    	
    	/* 1.회원 pk받음
    	 * 2.회원 검증
    	 * 3.리뷰 필수값 검증
    	 * 4.DB 적재
    	 * 5.성공값 반환
    	 */
    	
    	
    	
		return null;
    }

    public String reviewDelete(Model model, @LoginUser SessionUser user) {
    	
    	
    	/* 1.회원 pk받음
    	 * 2.회원 검증
    	 * 3.DB 삭제
    	 * 4.성공값 반환
    	 */
    	
    	
    	
		return null;
    }
    




}
