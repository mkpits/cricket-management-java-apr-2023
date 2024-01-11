package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;

import java.util.List;

public interface PlayersService {
 List<Players> findAllPlayers();
 Players save(Players players);
 List<Players> findByPlayer_id(List<Integer> player_ids);
void deleteSelectedPlayersTForTeam(List<Players> playersList);
// Players updatePlayers(Players players);
 List<Players> findPlayersWithIsAllotedZero();

}
