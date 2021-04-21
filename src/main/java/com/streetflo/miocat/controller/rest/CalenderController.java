package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/* 스케줄 조회
 * 스케줄 등록
 * 스케줄 삭제
 * 스케줄 업데이트
 */

@RequiredArgsConstructor
@Controller
public class CalenderController {


    @GetMapping("/")
    public String calenderRead(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 클라이언트에서 pk 와 검색할 month를 받음
    	 * 2. 회원 검증
    	 * 3. 스케줄 DB 조회 1달 기준
    	 * 4. json타입으로 리턴 (스케줄에 대한 상세 값 포함)
    	 */
    	
    	

		return null;
    }
    
    @GetMapping("/")
    public String calenderInsert(Model model, @LoginUser SessionUser user) {
    	
    	/* 1.클라이언트에서 pk 와 등록할 값을 받음
    	 * 2.회원 검증
    	 * 3.DB적재
    	 * 4.성공값 반환
    	 */
    	
    	

		return null;
    }
    
    @GetMapping("/")
    public String calenderDelete(Model model, @LoginUser SessionUser user) {
    	
    	/* 1.클라이언트에서 pk 와 등록할 값을 받음
    	 * 2.회원 검증
    	 * 3.DB 삭제
    	 * 4.성공값 반환
    	 */
    	
    	

		return null;
    }
    
    @GetMapping("/")
    public String calenderUpdate(Model model, @LoginUser SessionUser user) {
    	
    	
    	/* 1.클라이언트에서 pk 와 등록할 값을 받음
    	 * 2.회원 검증
    	 * 3.DB업데이트
    	 * 4.성공값 반환
    	 */
    	
    	

		return null;
    }
    




}
