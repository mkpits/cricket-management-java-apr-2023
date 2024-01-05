package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.City;
import com.mkpits.cricket.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CityMaster {
    private CityService cityService;

    @Autowired
    public CityMaster(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getCityForm")
    public String getCityForm(Model model){
        City city = new City();
        model.addAttribute("cities",city);
        return "/admin/insertCity";
    }

    @PostMapping("/saveCity")
    public String saveCityRecord(@ModelAttribute("cities") City city){
        cityService.insertCity(city);
        return "redirect:/admin/insertCity";
    }
}
