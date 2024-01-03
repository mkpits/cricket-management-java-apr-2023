package com.example.TeamManagementSystem.managementController;

import com.example.TeamManagementSystem.entity.Players;
import com.example.TeamManagementSystem.entity.Team;
import com.example.TeamManagementSystem.service.PlayersService;
import com.example.TeamManagementSystem.service.TeamService;
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

/** --------------------------- Admin Login form --------------------------- */

    @GetMapping("/adminLoginForm")
    public String admin_Login(){
        return "adminLoginForm";
    }

/** --------------------------- Menu page call when we that end point of "/Dashboard" --------------------------- */

    @GetMapping("/Dashboard")
    public  String menu_Page(){
        return "menuPage";
    }

/** ------------- find list of players ----------------- */

    @GetMapping("/listOfPlayers")
    public String findListOfPlayers(Model model){
        List<Players> playersList=playersService.findAllPlayers();
        model.addAttribute("listOfPlayers",playersList);
        return "displayPlayersList";
    }

/** ---------------------------- save method for register players ------------------------- **/

    @GetMapping("/Players")
    public String playersInfo(Model model){
        Players players = new Players();
        model.addAttribute("players" , players);
        return "registerPlayersInformation";
    }

    @PostMapping("/Save")
    public String save(@ModelAttribute("players") Players newPlayers ){
        playersService.save(newPlayers);
        return "redirect:/listOfPlayers";
    }

/** -------------------------- update player -------------------------------------------- **/
//    @GetMapping("/updatePlayer")
//    public String updatePlayer(@RequestParam("player_id") int playerId, Model model) {
//        Players players = playersService.updatePlayers(playerId);
//        model.addAttribute("players", players);
//        return "registerPlayersInformation";
//    }

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


/** ------------------------ Allot players to the team ---------------------------------------  */


    @GetMapping("/allotPlayer")
    public String allotPlayer(Model model){
        Players players = new Players();
        model.addAttribute("players" , players);
        List list = teamService.findAllTeamsList();
        model.addAttribute("teamList" ,list);
        return "allotTeamPlayer";
    }





















}
