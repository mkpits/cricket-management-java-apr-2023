package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.MatchVenue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<MatchVenue,Integer> {
}
