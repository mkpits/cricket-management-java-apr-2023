package com.example.TeamManagementSystem.service;

import com.example.TeamManagementSystem.entity.Team;

import java.util.List;

public interface TeamService {

    List<Team> findAllTeamsList();
    Team saveTeam(Team team);
    Team updateTeam(Integer teamId);
}
