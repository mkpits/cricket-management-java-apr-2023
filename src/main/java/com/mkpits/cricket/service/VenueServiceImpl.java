package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.MatchVenue;
import com.mkpits.cricket.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VenueServiceImpl implements VenueService{
    private VenueRepository venueRepository;

    @Autowired
    public VenueServiceImpl(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public List<MatchVenue> showAllVenues() {
        List<MatchVenue> venueList=venueRepository.findAll();
        return venueList;
    }
    @Override
    public void save(MatchVenue matchVenue) {
        venueRepository.save(matchVenue);
    }

}
