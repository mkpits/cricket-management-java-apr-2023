package com.mkpits.cricket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CricketManagent {
    @GetMapping("/index")
    public  String getMessage(){
        return "index";
    }
}
