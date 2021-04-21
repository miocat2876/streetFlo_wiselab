package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/* 학원,강사 검색
 * 학원 검색
 * 강사 검색 
 */

@RequiredArgsConstructor
@Controller
public class SearchController {

    
    @GetMapping("/")
    public String searchAcademy(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 검색값 받음
    	 * 2. 검색값 검증
    	 * 3. DB 조회(20건 페이징처리)
    	 * 4. Json타입르오 반환
    	 */
    	
		return null;
    }
    
    @GetMapping("/")
    public String searchTeacher(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 검색값 받음
    	 * 2. 검색값 검증
    	 * 3. DB 조회(5건 페이징처리)
    	 * 4. Json타입르오 반환
    	 */
    	
    	
    	
		return null;
    }

    


}
