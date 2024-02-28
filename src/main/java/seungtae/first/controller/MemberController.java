package seungtae.first.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import seungtae.first.member.Member;
import seungtae.first.member.MemberRepository;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

//    @GetMapping("/contact")
//    public String contact() {
//        return "page/contact";
//    }

    // 회원가입 매핑
    @GetMapping("/add")
    public String signup(@ModelAttribute Member member) {
        return "member/signupForm";
    }

    // 회원가입 검증 및 매핑
    @PostMapping("/add")
    public String signupVaild(@Validated @ModelAttribute Member member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "member/add";
        }

        memberRepository.save(member);
        log.info("Sign up Success!!! = {}", member);
        return "redirect:/";    // home
    }
}
