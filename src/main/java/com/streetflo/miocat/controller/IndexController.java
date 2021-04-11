package com.streetflo.miocat.controller;

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
public class IndexController {

//    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {

//        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        // annoation 인터페이스 생성 후 반복 코드 개선

        System.out.println(user);

        if(user!=null){
            model.addAttribute("userName", user.getName());
            System.out.println(user.getName());
        }


        return "index.tile";
    }


}
