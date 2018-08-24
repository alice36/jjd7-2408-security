package pl.javastart.sechello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class ExampleController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        System.out.println("Użytkownik: " + principal.getName());
        return "hello";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/login")
    public String login() {
        return "loginform";
    }

    @PostMapping("/przelew")
    public String przelew(@RequestParam String from,
                          @RequestParam String to,
                          @RequestParam double money) {
        System.out.printf("Wykonano przelew z %s na %s w kwocie %f", from, to, money);
        return "success";
    }

}
