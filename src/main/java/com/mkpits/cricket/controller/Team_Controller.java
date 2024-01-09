package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;
import com.mkpits.cricket.service.PlayersService;
import com.mkpits.cricket.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Team_Controller {

    @Autowired
    private PlayersService playersService;
    @Autowired
    private TeamService teamService;

    public Team_Controller(PlayersService playersService,TeamService teamService){
        this.playersService=playersService;
        this.teamService=teamService;
    }


/** ------------- find list of Teams ----------------- */

    @GetMapping("/listOfTeams")
    public String findListOfTeams(Model model){
    List<Team> teamList=teamService.findAllTeamsList();
    model.addAttribute("listOfTeam",teamList);
    return "displayTeamList";
}

/** --------------------------- save method for create Teams ------------------------------ **/

    @GetMapping("/Teams")
    public String teamsInfo(Model model){
        Team team = new Team();
        model.addAttribute("team" , team);
        return "teamInformation";
    }

    @PostMapping("/insertTeams")
    public String saveTeams(@ModelAttribute("team") Team newTeam){
        teamService.saveTeam(newTeam);
        return "redirect:/listOfTeams";
    }

/** ------------------------ update Teams on team id ---------------------------------------  */

    @GetMapping("/updateTeam")
    public String update(@RequestParam("team_id") int teamId, Model model){
    Team team = teamService.updateTeam(teamId);
    model.addAttribute("team" , team);
    return "teamInformation";
    }

/** ------------------------ delete Teams on team id -------------------------------------- */

    @GetMapping("/deleteTeam")
    public String deleteTeam(@RequestParam("team_id") int teamId){
        teamService.deleteTeam(teamId);
        return "redirect:/listOfTeams";
    }


    /** ------------------------ Allot players to the team ---------------------------------------  */

    @PostMapping("/insertTeamsAndPlayers")
    public String saveTeamsAndPlayers(@ModelAttribute("team") Team newTeams ,@RequestParam("selectedPlayers") List<Integer> player_ids){
        List<Players> selectedPlayers = playersService.findByPlayer_id(player_ids);
        newTeams.setPlayersList(selectedPlayers);
        teamService.saveTeam(newTeams);
        System.out.println(newTeams);
        return "redirect:/listOfTeams";
    }

    @GetMapping("/allotTeamAndPlayer")
    public String allot(@RequestParam("team_id") int teamId, Model model){
        Team team = teamService.updateTeam(teamId);
        model.addAttribute("team" , team);
        List<Players> playersList=playersService.findAllPlayers();
        model.addAttribute("listOfPlayers",playersList);
        return "allotTeamPlayer";
    }




















}
