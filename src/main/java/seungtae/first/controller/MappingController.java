package seungtae.first.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
@RequiredArgsConstructor
public class MappingController {

    @GetMapping("/login")
    public String login() {
        return "page/login";
    }

    @GetMapping("/contact")
    public String contact() {
        return "page/contact";
    }

    @GetMapping("/signup")
    public String signup() {
        return "page/signup";
    }
}
