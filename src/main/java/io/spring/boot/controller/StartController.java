package io.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    public String startPage(){
        return "login";
    }

    @RequestMapping("/hello")
    public String helloPage(){
        return "hello";
    }

    @RequestMapping("/registration")
    public String registrationPage(){
        return "registration";
    }
}