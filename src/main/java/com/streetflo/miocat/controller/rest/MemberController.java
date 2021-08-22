package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import com.streetflo.miocat.dto.rest.MemberDto;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


/* 회원 관련 컨트롤러
 * 
 * 
 * 
 */

@RequiredArgsConstructor
@RestController
public class MemberController {


	private final HttpSession httpSession;

    public String memberRead(Model model, @LoginUser SessionUser user) {


		return null;
    }

    public String memberDetail(Model model, @LoginUser SessionUser user) {
    	
    	
    	/* 1.회원 pk 받음
    	 * 2.회원 검증
    	 * 3.DB 조회
    	 * 4.Json타입으로 리턴
    	 * 
    	 */
    	
    	
    	
		return null;
    }


    @GetMapping("/join")
	public void join(@RequestParam("memType") String memType) {

    	MemberDto user = new MemberDto();
		user.setMemType(memType);

		System.out.println(user);

		httpSession.setAttribute("user", user);
    }


    public String memberUpdate(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 회원 pk받음
    	 * 2. 회원 검증
    	 * 3. DB 수정
    	 * 4. 성공값 반환
    	 */
    	
    	
    	
		return null;
    }
    

    public String memberDelete(Model model, @LoginUser SessionUser user) {
    	
    	
    	/* 1. 회원 pk받음
    	 * 2. 회원 검증
    	 * 3. DB 삭제
    	 * 4. 성공값 반환
    	 */
    	
    	
		return null;
    }


}
