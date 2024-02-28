package seungtae.first.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import seungtae.first.member.Member;
import seungtae.first.member.MemberRepository;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    // 로그인 매핑
    @GetMapping("/login")
    public String login() {
        return "member/login";
    }

//    @GetMapping("/contact")
//    public String contact() {
//        return "page/contact";
//    }

    // 회원가입 매핑
    @GetMapping("/add")
    public String signup(@ModelAttribute Member member) {
        return "member/signup";
    }

    // 회원가입 검증 및 매핑
    @PostMapping("/add")
    public String signupVaild(@Validated @ModelAttribute Member member, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "member/add";
        }

        memberRepository.save(member);
        return "redirect:/";
    }
}
