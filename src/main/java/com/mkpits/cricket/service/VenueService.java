package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.MatchVenue;
import java.util.List;

public interface VenueService {
    public List<MatchVenue> showAllVenues();

    public void save(MatchVenue matchVenue);
}
