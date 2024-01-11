package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayersRepository extends JpaRepository<Players,Integer> {
    @Query("SELECT p FROM Players p WHERE p.is_alloted = 0")
    List<Players> findPlayersWithIsAllotedZero();

}
