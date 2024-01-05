package com.mkpits.cricket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class City_Master {
    private City_Master cityMaster;

    @Autowired
    public City_Master(City_Master cityMaster) {
        this.cityMaster = cityMaster;
    }
}
