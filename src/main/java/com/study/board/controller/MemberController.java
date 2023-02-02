package com.study.board.controller;

import com.study.board.entity.Member;
import com.study.board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 회원가입 화면으로 이동
    @GetMapping("/board/register")
    public String memberRegister(){
        return "register";
    }

    // 회원가입 처리
    @PostMapping("/board/registerPro")
    public String memberRegisterPro(Member member, Model model){

        memberService.register(member);

        model.addAttribute("message", "회원가입이 완료되었습니다");
        model.addAttribute("searchUrl", "/board/list");

        return "message";
    }

}
