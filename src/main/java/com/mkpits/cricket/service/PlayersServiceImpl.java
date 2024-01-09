package com.mkpits.cricket.service;


import com.mkpits.cricket.repository.PlayersRepository;
import com.mkpits.cricket.entity.Players;
import com.mkpits.cricket.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayersServiceImpl implements PlayersService {

    @Autowired
    private PlayersRepository playersRepository;

    public PlayersServiceImpl(PlayersRepository playersRepository){
        this.playersRepository=playersRepository;
    }

/** --------------------- Find List of Players -------------------------- */
    @Override
    public List<Players> findAllPlayers() {
      return playersRepository.findAll();
    }

/** ---------------------- insert players into database (save players) ------------------ */
    @Override
    public Players save(Players players) {
        return playersRepository.save(players);
    }

    @Override
    public Players updatePlayers(Integer playerId) {
       Optional<Players> playersOptional =playersRepository.findById(playerId);
       return playersOptional.get();
    }

    @Override
    public List<Players> findByPlayer_id(List<Integer> player_ids) {
        return playersRepository.findAllById(player_ids);
    }


}
