package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.MatchDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchDetails,Integer> {
}
