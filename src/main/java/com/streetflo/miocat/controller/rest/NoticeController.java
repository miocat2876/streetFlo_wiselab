package com.streetflo.miocat.controller.rest;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import com.streetflo.miocat.dao.rest.NoticeDao;
import com.streetflo.miocat.dto.rest.NoticeDto;
import com.streetflo.miocat.util.page.AbScrollPage;
import com.streetflo.miocat.util.page.Page;


import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/* 공지사항
 * 공지 조회
 * 공지 등록
 * 공지 삭제
 */

@RequiredArgsConstructor
@RestController
public class NoticeController {


    @GetMapping("/")
    public String noticeRead(NoticeDto dto, Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. DB 조회(공지 10건씩 페이징처리)
    	 * 4. json타입으로 반환
    	 */
    	
    	Page<NoticeDto> page = new AbScrollPage<>(dto, new NoticeDao());
    	
    	
		return page.process().toString();
    }
    
    @GetMapping("/")
    public String noticeInsert(Model model, @LoginUser SessionUser user) {
    	
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. 필수값 검증
    	 * 4. DB 입력
    	 * 5. 성공값 반환
    	 */
    	
    	
		return null;
    }
    
    @GetMapping("/")
    public String noticeDelete(Model model, @LoginUser SessionUser user) {
    	
    	/* 1. 회원 pk 받음
    	 * 2. 회원 검증
    	 * 3. DB 삭제
    	 * 4. 성공값 반환
    	 */
    	
		return null;
    }




}
