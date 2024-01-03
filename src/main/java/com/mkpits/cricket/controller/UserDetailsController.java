package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.UserDetails;
import com.mkpits.cricket.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/userDetails")
public class UserDetailsController {
    private CricketService cricketService;
    @Autowired
    public UserDetailsController(CricketService cricketService) {
        this.cricketService = cricketService;
    }


    @RequestMapping(value = "/getUserDetailsForm" ,method = RequestMethod.GET)
    public String getUserDetails(Model model){
        UserDetails userDetails = new UserDetails();
        model.addAttribute("userdetails",userDetails);
        return "getUserDetails";
    }

    @PostMapping("/saveUserDetails")
    public String saveUserDetails(UserDetails userDetails){
        cricketService.saveDetails(userDetails);
        return "redirect:/userDetails/displayUserDetails";
    }

    @GetMapping("/displayUserDetails")
    public String findAllDetails(Model model){
        List<UserDetails> userDetailsList = cricketService.findAllDetails();
        model.addAttribute("userdetail",userDetailsList);
        return "displayUserDetails";
    }

    @GetMapping("/updateUserDetails")
    public String userFormForUpdate(@RequestParam("user_id") int userId, Model model){
        UserDetails userDetails = cricketService.updateRecord(userId);
        model.addAttribute("userdetail",userDetails);
        return "getUserDetails";
    }
}
