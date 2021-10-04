package com.streetflo.miocat.controller;

import com.streetflo.miocat.service.rest.EmailService;
import com.streetflo.miocat.service.rest.impl.EmailServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Log4j2
@Controller
@RequestMapping("/service/*")
public class EmailController<OtherService> {

	@Autowired
	EmailService service;

	@PostMapping("/mail")
	@ResponseBody
	public void emailConfirm(String userId)throws Exception{
		log.info("post emailConfirm");
		System.out.println("전달 받은 이메일 : "+userId);
		service.sendSimpleMessage(userId);
	}
	@PostMapping("/verifyCode")
	@ResponseBody
	public int verifyCode(String code) {
		log.info("Post verifyCode");

		int result = 0;
		System.out.println("code : "+code);
		System.out.println("code match : "+ EmailServiceImpl.ePw.equals(code));
		if(EmailServiceImpl.ePw.equals(code)) {
			result =1;
		}

		return result;
	}
}