package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.UserLogin;
import com.mkpits.cricket.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LoginController {
    private LoginService loginService;
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/checkLoginCredential")
    public String checkLoginCredential(Model model){
        UserLogin userLogin = new UserLogin();
        model.addAttribute("login",userLogin);
        return "/user/index";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("login") UserLogin userLogin, @RequestParam("username") String username, @RequestParam("password") String password){
        if(loginService.loginCredential(username,password)){
            return "Login successful";
        }else{
            return "redirect:/helperMessage/error.html";
        }
    }
}
