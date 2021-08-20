package com.streetflo.miocat.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/test")
    public String test2(){

        System.out.println("테스트화면2");

        return "temp/index";

    }

    @GetMapping("/test2")
    public String test3(){

        System.out.println("테스트화면2");

        return "test";

    }

    @GetMapping("/test5")
    @ResponseBody
    public String test5(){

        System.out.println("테스트화면2");

        String data = "{'date' : '2021/02','schedule' : {'24': [{'startTime' : '12:00','endTime' : '14:00','genre' : '브레이크댄스 기초','level' : 'Beginer','subscribe' : 'n'},{'startTime' : '16:00','endTime' : '18:00','genre' : '브레이크댄스 고급','level' : 'Master','subscribe' : 'n'}]}}";

        return data;



    }

    @GetMapping("/test6")
    @ResponseBody
    public String test6(){

        System.out.println("테스트화면2");

        String data = "[{'noticeGenre' : '테스트 공지사항1','date' : '2021/04/11','content' : '테스트1'},{'noticeGenre' : '테스트 공지사항2','date' : '2021/04/11','content' : '테스트2'}]";

        return data;

    }

    @GetMapping("/test7")
    @ResponseBody
    public String test7(){

        System.out.println("테스트화면2");

        String data = "[{'name' : '김하연','genre' : '크럼핑','level' : 'Master','content1' : '유익한 수업 재밌는 커리큘럼','content2' : '다양한 강사 선생님','content3' : '좋은 시설'},{'name' : '김경민','genre' : '미어캣','level' : 'Master','content1' : '테스트','content2' : '','content3' : ''}]";

        return data;

    }



    @GetMapping("/test10")
    public String test10(HttpServletRequest request, @RequestParam("type") String type){

        HttpSession session = request.getSession();
        String value = "선생님";
        session.setAttribute("type", value);

        return "forward:/oauth2/authorization/kakao";

    }


}
