package seungtae.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class MappingController {

    @GetMapping("/login")
    public String login() {
        return "page/login";
    }

    @GetMapping("/contact")
    public String contact() {
        return "page/contact";
    }
}
