package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.MatchDetails;
import com.mkpits.cricket.service.MatchDetailService;
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

    public ScheduleMatchController(MatchDetailService matchDetailService){
        this.matchDetailService=matchDetailService;
    }

    //Display Matches
    @GetMapping("/matches")
    public String matchSchedule(Model model){
        List<MatchDetails> matchList=matchDetailService.findAllMatches();
        model.addAttribute("model",matchList);
        return "matchSchedule";
    }

    //Adding Matches
    @GetMapping("/add")
    public String add(Model model){
        MatchDetails matchDetails=new MatchDetails();
        model.addAttribute("match",matchDetails);
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

//    @GetMapping("/delete")
//<<<<<<< HEAD
//    public String deleteRecord(@RequestParam("match_id") int matchId){
//        MatchDetails matchDetails=matchDetailService.findMatch(matchId);
//=======
//    public String deleteRecord(@RequestParam("match_id") int matchId,Model model){
//>>>>>>> 1ef1e35fd329b31482c5ead7f0045f4a3206a614
//        matchDetailService.delete(matchId);
//        return "redirect:/matches";
//    }
}
