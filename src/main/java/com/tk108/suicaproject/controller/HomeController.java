package com.tk108.suicaproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "suica/home/suica-home";
    }

    @GetMapping("/newhome")
    public String newHome(){
        return "suica/home/suica-home";
    }
}
