package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.UserEntity;
import com.mkpits.cricket.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class UserController {
    private Userservice userservice;
    @Autowired
    public UserController(Userservice userservice) {
        this.userservice = userservice;
    }
    @GetMapping("/updateprofile/{id}")
    public String update(@PathVariable int id, Model model){
        Optional<UserEntity> optional=userservice.update(id);
        if (optional.isPresent()){
            model.addAttribute(optional);
        }
        return "profile_updated";

    }
}
