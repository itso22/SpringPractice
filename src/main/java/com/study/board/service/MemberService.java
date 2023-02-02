package com.study.board.service;

import com.study.board.entity.Member;
import com.study.board.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;
    //회원 가입 처리
    public void register(Member member){
        memberRepository.save(member);
    }
}
