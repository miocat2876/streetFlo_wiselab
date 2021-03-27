package com.streetflo.miocat.controller;


import com.streetflo.miocat.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private TestService test;

    @GetMapping("/test")
    @ResponseBody
    public String test(){

        System.out.println("테스트화면");

        logger.info("로그나옵니까?");

        return "성공";
    }


}
