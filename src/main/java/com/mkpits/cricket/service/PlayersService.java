package com.example.TeamManagementSystem.service;

import com.example.TeamManagementSystem.entity.Players;
import com.example.TeamManagementSystem.entity.Team;

import java.util.List;

public interface PlayersService {
 List<Players> findAllPlayers();
 Players save(Players players);
 Players updatePlayers(Integer playerId);
}
