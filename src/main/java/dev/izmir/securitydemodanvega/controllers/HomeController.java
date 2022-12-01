package dev.izmir.securitydemodanvega.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

        @GetMapping
        public String home() {
            return "Hello Izmir";
        }
    @GetMapping("/user")
    public String user() {
        return "Hello Izmir";
    }
    @GetMapping("/admin")
    public String admin() {
        return "Hello admin";
    }
}
