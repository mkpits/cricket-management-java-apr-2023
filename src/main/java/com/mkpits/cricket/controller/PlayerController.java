package com.mkpits.cricket.controller;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PlayerController {

    private PlayersService playersService;
    @Autowired
    public PlayerController(PlayersService playersService) {
        this.playersService = playersService;
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
}
