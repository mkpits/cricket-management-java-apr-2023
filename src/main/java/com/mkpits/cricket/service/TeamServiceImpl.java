package com.mkpits.cricket.service;

import com.mkpits.cricket.repository.TeamRepository;
import com.mkpits.cricket.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService{
    private TeamRepository teamRepository;
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
}
