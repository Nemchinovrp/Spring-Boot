package io.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/start")
    public String startPage(){
        System.out.println("start");
        return "login";
    }

    @RequestMapping("/hello")
    public String helloPage(){
        System.out.println("Hello");
        return "hello";
    }
}