package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.repository.PlayersRepository;
import com.mkpits.cricket.repository.TeamRepository;
import com.mkpits.cricket.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService{
    private TeamRepository teamRepository;
    private PlayersRepository playersRepository;
    @Autowired

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> findAllTeamsList() {
        return teamRepository.findAll();
    }

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updateTeam(Integer teamId) {
        Optional<Team> teamOptional =teamRepository.findById(teamId);
            return teamOptional.get();
    }

    @Override
    public void deleteTeam(Integer teamId) {
        Team team = teamRepository.findById(teamId).get();
        teamRepository.delete(team);
    }

    @Override
    public Team findPlayersList(Integer team_id) {
        return teamRepository.findById(team_id).get();
    }
}
