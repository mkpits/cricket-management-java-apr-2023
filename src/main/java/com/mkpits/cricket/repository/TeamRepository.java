package com.example.TeamManagementSystem.dao;

import com.example.TeamManagementSystem.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Integer> {
}
