package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;

import java.util.List;

public interface TeamService {

    List<Team> findAllTeamsList();
    Team saveTeam(Team team);

    Team updateTeam(Integer teamId);
    void deleteTeam(Integer teamId);

    Team findPlayersList( Integer team_id);
}
