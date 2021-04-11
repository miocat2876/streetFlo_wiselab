package com.streetflo.miocat.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/main")
    public String test(){

        System.out.println("테스트화면");

        return "index.tile";
        
    }

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

        return "성공!";

    }


}
