package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.MatchDetails;
import java.util.List;

public interface MatchDetailService {
    public void saveMatch(MatchDetails matchDetails);

    public MatchDetails findMatch(int matchId);
    public String deleteMatch(int matchId);
    public List<MatchDetails> findAllMatches();
    public MatchDetails update(int matchId);

    public void delete(int matchId);
}
