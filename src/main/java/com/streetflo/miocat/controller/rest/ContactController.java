package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/* 구독 관련 컨트롤러
 * 
 * 구독 조회
 * 구독 업데이트
 */




@RequiredArgsConstructor
@RestController
public class ContactController {


    @GetMapping("/")
    public String contactRead(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. 구독 상태값 조회
    	 * 4. 성공값 리턴
    	 */
    	
    	
    	
    	
    	
		return null;
    }
    
    @GetMapping("/")
    public String contactUpdate(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. 구독 상태값 변경
    	 * 4. 성공값 리턴
    	 */
    	
    	
    	
		return null;
    }




}
