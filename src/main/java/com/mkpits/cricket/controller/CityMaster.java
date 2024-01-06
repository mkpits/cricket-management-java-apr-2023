package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.City;
import com.mkpits.cricket.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return "redirect:/cities/displayCities";
    }

    @GetMapping("/displayCities")
    public String findAllCities(Model model){
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("cities",cityList);
        return "/admin/displayAllCities";
    }

    @GetMapping("/updateCity")
    public String updateCity(@RequestParam("city_id") Integer city_Id,Model model){
        City city = cityService.updateCityRecord(city_Id);
        model.addAttribute("cities",city);
        return "/admin/insertCity";
    }

    @GetMapping("/deleteCity")
    public String deleteCityRecord(@RequestParam("city_id") int city_Id){
        cityService.deleteCityRecord(city_Id);
        return "redirect:/cities/displayCities";
    }
}
