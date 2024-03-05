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
import seungtae.first.Service.LoginService;
import seungtae.first.member.LoginForm;
import seungtae.first.member.Member;

@Slf4j
@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping
    public String login(@ModelAttribute("loginForm") LoginForm loginform) {
        return "member/loginForm";
    }

    @PostMapping
    public String login(@Validated @ModelAttribute LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("Login Fail!!!!");
            return "member/loginForm";
        }

        Member loginMember = loginService.login(loginForm.getId(), loginForm.getPassword());

        if (loginMember == null) {
            bindingResult.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            log.info("Login Fail!!!!");
            return "member/loginForm";
        }

        log.info("Login Success!!! = {}", loginMember);
        return "redirect:/";
    }
}
