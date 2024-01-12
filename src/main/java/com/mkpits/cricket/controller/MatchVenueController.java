package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.MatchVenue;
import com.mkpits.cricket.service.VenueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/venue")
public class MatchVenueController {
    private VenueService venueService;

    public MatchVenueController(VenueService venueService) {
        this.venueService = venueService;
    }


    @GetMapping("/show")
    public String showVenues(org.springframework.ui.Model model){
        List<MatchVenue> matchVenues=venueService.showAllVenues();
        model.addAttribute("venueModel",matchVenues);
        return "allVenues";
    }

    @GetMapping("/addvenue")
    public String add(org.springframework.ui.Model model){
        MatchVenue matchVenue=new MatchVenue();
        model.addAttribute("mvenue",matchVenue);
        return "addVenue";
    }

    @PostMapping("/savevenue")
    public String saveVenue(@ModelAttribute("mvenue") MatchVenue theVenue, Model model){
        MatchVenue matchVenue=new MatchVenue();
        model.addAttribute("mvenue",theVenue);
        venueService.save(theVenue);
        return "redirect:/venue/show";
    }

    @GetMapping("/showall")
    public List<MatchVenue> showAll(){
        return venueService.showAllVenues();
    }

}
