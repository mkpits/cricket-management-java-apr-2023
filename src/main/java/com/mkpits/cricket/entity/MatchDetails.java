package com.mkpits.cricket.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name="match_info")
public class MatchDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="match_id")
    private int match_id;
    private String match_name;
    private String team1;
    private String team2;
    private Date match_date;
    private Time match_time;
//    private int venue_id;

    @ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "venue_id")
    private MatchVenue matchVenue ;


    public MatchDetails() {
    }


    public MatchDetails(String match_name, String team1, String team2, Date match_date, Time match_time, MatchVenue matchVenue) {
        this.match_name = match_name;
        this.team1 = team1;
        this.team2 = team2;
        this.match_date = match_date;
        this.match_time = match_time;
        this.matchVenue = matchVenue;
    }


//    ---------------getter---------------

    public int getMatch_id() {
        return match_id;
    }

    public String getMatch_name() {
        return match_name;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public Date getMatch_date() {
        return match_date;
    }

    public Time getMatch_time() {
        return match_time;
    }

    public MatchVenue getMatchVenue() {
        return matchVenue;
    }




//    ---------------setter---------------

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public void setMatch_name(String match_name) {
        this.match_name = match_name;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }

    public void setMatch_time(Time match_time) {
        this.match_time = match_time;
    }

    public void setMatchVenue(MatchVenue matchVenue) {
        this.matchVenue = matchVenue;
    }

    @Override
    public String toString() {
        return "MatchDetails{" +
                "match_id=" + match_id +
                ", match_name='" + match_name + '\'' +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", match_date=" + match_date +
                ", match_time=" + match_time +
                ", matchVenue=" + matchVenue +
                '}';
    }
}
