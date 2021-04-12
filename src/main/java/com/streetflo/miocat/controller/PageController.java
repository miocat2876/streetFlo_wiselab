package com.streetflo.miocat.controller;

import com.streetflo.miocat.config.auth.LoginUser;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// 페이지에 관련된 컨트롤러는 모두 여기에서 사용

/* 없는 페이지
학원리스트
학원상세페이지
소개페이지
학생마이페이지
학생스케줄
FAQ
 */
@Controller
public class PageController {

    @GetMapping("/main")
    public String main(Model model, @LoginUser SessionUser user) {

        System.out.println("메인화면");

        if(user!=null){
            model.addAttribute("userName", user.getName());
            System.out.println(user.getName());
        }

        return "index.tile";

    }

    @GetMapping("instructorList")
    public String instructorList() {

        System.out.println("강사리스트");

        return "instructor_list.tile";

    }

    @GetMapping("instructorInfo")
    public String instructorInfo() {

        System.out.println("강사상세페이지");

        return "instructor_info.tile";

    }
    //없음
    @GetMapping("academyList")
    public String academyList() {

        System.out.println("학원리스트");

        return "index.tile";

    }
    //없음
    @GetMapping("academyInfo")
    public String academyInfo() {

        System.out.println("학원상세페이지");

        return "index.tile";

    }

    @GetMapping("calendar")
    public String calendar() {

        System.out.println("강사마이페이지");

        return "calendar.tile";

    }

    @GetMapping("calendarTeacher")
    public String calendarTeacher() {

        System.out.println("강사스케줄");

        return "calendar_teacher.tile";

    }
    //없음
    @GetMapping("profileStudent")
    public String profileStudent() {

        System.out.println("학생마이페이지");

        return "profile_student.tile";

    }
    //없음
    @GetMapping("calendarStudent")
    public String calendarStudent() {

        System.out.println("학생스케줄");

        return "calendar_student.tile";

    }

    //없음
    @GetMapping("introduce")
    public String introduce() {

        System.out.println("소개페이지");

        return "index.tile";

    }




}
