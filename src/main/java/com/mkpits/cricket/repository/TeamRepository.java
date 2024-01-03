package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Integer> {
}
