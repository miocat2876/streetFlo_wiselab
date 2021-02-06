package com.streetflo.miocat.controller;


import com.streetflo.miocat.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private TestService test;

    @GetMapping("/test")
    public String test(){

        System.out.println("테스트화면");

       // System.out.println(test.test().getTest());

        return "test/test";
    }


}
