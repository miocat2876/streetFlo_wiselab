package com.streetflo.miocat.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/test")
    public String test(){

        System.out.println("테스트화면");

        return "index.tile";
        
    }

    @GetMapping("/test2")
    public String test2(){

        System.out.println("테스트화면2");

        return "index";

    }


}
