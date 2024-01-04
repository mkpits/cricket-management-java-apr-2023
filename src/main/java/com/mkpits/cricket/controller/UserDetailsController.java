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
    public String saveUserDetails(@ModelAttribute("userdetails") UserDetails userdetails){
        cricketService.saveDetails(userdetails);
        return "redirect:/userDetails/displayUserDetails";
    }

    @GetMapping("/displayUserDetails")
    public String findAllDetails(Model model){
        List<UserDetails> userDetailsList = cricketService.findAllDetails();
        model.addAttribute("userdetails",userDetailsList);
        return "displayUserDetails";
    }

    @GetMapping("/updateUserDetails")
    public String userFormForUpdate(@RequestParam("user_id") int user_Id, Model model){
        UserDetails userDetails = cricketService.updateRecord(user_Id);
        model.addAttribute("userdetails",userDetails);
        return "getUserDetails";
    }

    @GetMapping("/deleteUserDetail")
    public String deleteUserDetail(@RequestParam("user_id") int user_Id){
        cricketService.deleteRecord(user_Id);
        return "redirect:/userDetails/displayUserDetails";
    }
}
