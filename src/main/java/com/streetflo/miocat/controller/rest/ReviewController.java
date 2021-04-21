package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// 페이지에 관련된 컨트롤러는 모두 여기에서 사용

@RequiredArgsConstructor
@Controller
public class ReviewController {


    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
    	
    	
    	
		return null;
    }




}
