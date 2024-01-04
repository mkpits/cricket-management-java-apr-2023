package com.mkpits.cricket.service;

import com.mkpits.cricket.repository.MatchRepository;
import com.mkpits.cricket.entity.MatchDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchDetailServiceImpl implements MatchDetailService{
    private MatchRepository matchRepository;

    @Autowired
    public MatchDetailServiceImpl(MatchRepository matchRepository){
        this.matchRepository = matchRepository;
    }
    @Override
    public void saveMatch(MatchDetails matchDetails){
        matchRepository.save(matchDetails);
    }

    @Override
    public MatchDetails findMatch(int matchId) {
        return matchRepository.findById(matchId).get();
    }
    @Override
    public String deleteMatch(int matchId){
        matchRepository.deleteById(matchId);
        return "record deleted";
    }

    @Override
    public List<MatchDetails> findAllMatches(){
        return matchRepository.findAll();
    }

    @Override

    public MatchDetails update(int matchId) {
        MatchDetails matchDetails= matchRepository.findById(matchId).get();
        return matchDetails;
    }

    @Override
    public void delete(int matchId){
        MatchDetails matchDetails= matchRepository.findById(matchId).get();
        matchRepository.delete(matchDetails);
    }
}
