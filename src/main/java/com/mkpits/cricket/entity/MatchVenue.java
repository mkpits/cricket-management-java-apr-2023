package com.mkpits.cricket.entity;

import jakarta.persistence.*;

@Entity
@Table(name="venue_info")
public class MatchVenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venue_id")
    private int venue_id;
    private String venue;

    public MatchVenue() {
    }

    public int getVenue_id() {
        return venue_id;
    }

    public void setVenue_id(int venue_id) {
        this.venue_id = venue_id;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public MatchVenue(int venue_id, String venue) {
        this.venue_id = venue_id;
        this.venue = venue;
    }
}
