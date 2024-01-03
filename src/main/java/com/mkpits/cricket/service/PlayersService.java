package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;

import java.util.List;

public interface PlayersService {
 List<Players> findAllPlayers();
 Players save(Players players);
 Players updatePlayers(Integer playerId);
}
