package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.MatchDetails;
import com.mkpits.cricket.entity.MatchVenue;
import com.mkpits.cricket.service.MatchDetailService;
import com.mkpits.cricket.service.VenueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ScheduleMatchController {
    private MatchDetailService matchDetailService;

    private VenueService venueService;

    public ScheduleMatchController(MatchDetailService matchDetailService,VenueService venueService){
        this.matchDetailService=matchDetailService;
        this.venueService=venueService;
    }

    public MatchDetails md;


    //Display Matches
    @GetMapping("/matches")
    public String matchSchedule(Model model){
        List<MatchDetails> matchList=matchDetailService.findAllMatches();
        model.addAttribute("listModel",matchList);
        return "matchSchedule";
    }

    //Adding Matches
    @GetMapping("/add")
    public String add(Model model){
        MatchDetails matchDetails=new MatchDetails();
        model.addAttribute("match",matchDetails);
//        List<MatchVenue> list=venueService.showAllVenues();
//        model.addAttribute("allVenues",list);
        return "addmatch";
    }

    @PostMapping("/addmatch")
    public String addMatch(@ModelAttribute("match") MatchDetails theMatchDetails){
        matchDetailService.saveMatch(theMatchDetails);
        return "redirect:/matches";
    }

    @GetMapping("/update")
    public String updateMatch(@RequestParam("match_id") int matchId,Model model) {
        MatchDetails matchDetails = matchDetailService.update(matchId);
        model.addAttribute("match", matchDetails);
        return "addmatch";
    }

    @GetMapping("/delete")
    public String deleteRecord(@RequestParam("match_id") int matchId){
        matchDetailService.delete(matchId);
        return "redirect:/matches";
    }
}
