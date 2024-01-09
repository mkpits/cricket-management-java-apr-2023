package com.mkpits.cricket.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "players")
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "date_of_birth")
    private Date date_of_birth;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "city")
    private String city;

    @Column(name = "percentage_of_fitness")
    private double percentage_of_fitness;

    @Column(name = "is_bowler")
    private String is_bowler;

    @Column(name = "is_batsman")
    private String is_batsman;

    @Column(name = "is_allrounder")
    private String is_all_rounder;

    @Column(name = "is_wicket_keeper")
    private String is_wicket_keeper;

    @Column(name = "is_alloted")
    private int is_alloted;

//    @ManyToOne
//    @JoinTable(name = "allot_team_player",
//            joinColumns= @JoinColumn(name = "team_id"))
//    private Team team;

    public Players() {
    }

    public Players(String first_name, String last_name, Date date_of_birth, String nationality, String city, double percentage_of_fitness, String is_bowler, String is_batsman, String is_all_rounder, String is_wicket_keeper,int is_alloted) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.city = city;
        this.percentage_of_fitness = percentage_of_fitness;
        this.is_bowler = is_bowler;
        this.is_batsman = is_batsman;
        this.is_all_rounder = is_all_rounder;
        this.is_wicket_keeper = is_wicket_keeper;
        this.is_alloted=is_alloted;


    }


    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage_of_fitness() {
        return percentage_of_fitness;
    }

    public void setPercentage_of_fitness(double percentage_of_fitness) {
        this.percentage_of_fitness = percentage_of_fitness;
    }

    public String getIs_bowler() {
        return is_bowler;
    }

    public void setIs_bowler(String is_bowler) {
        this.is_bowler = is_bowler;
    }

    public String getIs_batsman() {
        return is_batsman;
    }

    public void setIs_batsman(String is_batsman) {
        this.is_batsman = is_batsman;
    }

    public String getIs_all_rounder() {
        return is_all_rounder;
    }

    public void setIs_all_rounder(String is_all_rounder) {
        this.is_all_rounder = is_all_rounder;
    }

    public String getIs_wicket_keeper() {
        return is_wicket_keeper;
    }

    public void setIs_wicket_keeper(String is_wicket_keeper) {
        this.is_wicket_keeper = is_wicket_keeper;
    }

//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }


    @Override
    public String toString() {
        return
                "player_id=" + player_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\''+
                ", date_of_birth=" + date_of_birth +
                ", nationality='" + nationality + '\'' +
                ", city='" + city + '\'' +
                ", percentage_of_fitness=" + percentage_of_fitness +
                ", is_bowler='" + is_bowler + '\'' +
                ", is_batsman='" + is_batsman + '\'' +
                ", is_all_rounder='" + is_all_rounder + '\'' +
                ", is_wicket_keeper='" + is_wicket_keeper + '\'' ;

    }
}
