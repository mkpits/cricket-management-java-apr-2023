package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players,Integer> {
}
