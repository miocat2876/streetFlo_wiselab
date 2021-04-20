package com.streetflo.miocat.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping(value = "/teacher/") -> 이 부분 학생 / 선생님 분리 고민 중
public class DataController {

/*
    선생님 마이 페이지 json 컨트롤러
*/


    @RequestMapping("noticelist")
//    public String noticeList(@LoginUser SessionUser user){
    public Map noticeList(){

        Map result = new HashMap<String, String>();
            result.put("noticeGenre", "테스트 공지사항1");
            result.put("date", "2021/04/11");
            result.put("content", "테스트1");

        return result;

    }


    @RequestMapping("tschedule")
//    public String tschedule(@LoginUser SessionUser user){
    public Map tschedule(){


        String data = "[{'noticeGenre' : '테스트 공지사항1','date' : '2021/04/11','content' : '테스트1'},{'noticeGenre' : '테스트 공지사항2','date' : '2021/04/11','content' : '테스트2'}]";

        Map result = new HashMap<String, String>();
        result.put("noticeGenre", "공지사항1");
        result.put("date", "2021/04/11");
        result.put("content", "테스트1");


        return result;

    }



    @RequestMapping("review")
//    public String noticeList(@LoginUser SessionUser user){
    public Map review(){

        String data = "[{'name' : '김하연','genre' : '크럼핑','level' : 'Master','content1' : '유익한 수업 재밌는 커리큘럼','content2' : '다양한 강사 선생님','content3' : '좋은 시설'},{'name' : '김경민','genre' : '미어캣','level' : 'Master','content1' : '테스트','content2' : '','content3' : ''}]";


        Map result = new HashMap<String, String>();
        result.put("name", "김하연");
        result.put("genre", "크럼핑");
        result.put("level", "Master");
        result.put("content1", "유익한 수업 재밌는 커리큘럼");


        return result;

    }

}

