package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;

import java.util.List;

public interface TeamService {

    List<Team> findAllTeamsList();
    Team saveTeam(Team team);

    Team updateTeam(Integer teamId);
    Team updateTeamAsNull(Team team);
    void deleteTeam(Integer teamId);
    Team findByTeamId(Integer team_id);

    Team findPlayersList( Integer team_id);
}
