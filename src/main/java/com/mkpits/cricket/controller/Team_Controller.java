package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;
import com.mkpits.cricket.service.PlayersService;
import com.mkpits.cricket.service.PlayersServiceImpl;
import com.mkpits.cricket.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
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
    public String deleteTeamOfPlayersList(@RequestParam("team_id") int teamId){
        Team team=teamService.findPlayersList(teamId);
        List<Players> getPlayersList=team.getPlayersList();

        for(Players players:getPlayersList){
            players.setIs_alloted(0);
        }
        team.setPlayersList(null);
        teamService.updateTeamAsNull(team);

        System.out.println( " team after deleting = " +team);
        return "redirect:/listOfTeams";
    }


    /** ------------------------ Allot players to the team ---------------------------------------  */

    @PostMapping("/insertTeamsAndPlayers")
    public String saveTeamsAndPlayers(@ModelAttribute("team") Team newTeams ,@RequestParam("selectedPlayers") List<Integer> player_ids){
        // Retrieve the selected players from the database
        List<Players> selectedPlayers = playersService.findByPlayer_id(player_ids);
        // Set the selected players to the team
        newTeams.setPlayersList(selectedPlayers);
        // Update the is_alloted field to 1 for the selected players
        for(Players players:selectedPlayers){
            players.setIs_alloted(1);
        }
        // Save the team with the selected players
        teamService.saveTeam(newTeams);
        // Print team with their players
        System.out.println(newTeams);
        return "redirect:/listOfTeams";
    }

    @GetMapping("/allotTeamAndPlayer")
    public String allot(@RequestParam("team_id") int teamId, Model model){
        Team team = teamService.updateTeam(teamId);
        model.addAttribute("team" , team);
//        List<Players> playersList=playersService.findAllPlayers();
        List<Players> playersList=playersService.findPlayersWithIsAllotedZero();
        model.addAttribute("listOfPlayers",playersList);
        return "allotTeamPlayer";
    }

    @GetMapping("/teamPlayersList")
    public  String team_Player_List(@RequestParam("team_id") int teamId,Model model){
        Team team=teamService.findPlayersList(teamId);
//        playersService.findAllPlayers();
        model.addAttribute("team" , team);

        return "team_Players_List_Info";
    }






















}
