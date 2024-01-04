package com.mkpits.cricket.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table
public class UserSetting {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int usersettingid;
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private String nationality;
    private String city;
    private double percentage_of_fitness;
    private String is_bowler;
    private String is_batsman;
    private String is_all_rounder;
    private String is_wicket_keeper;

    public UserSetting() {
    }

    public UserSetting(String first_name, String last_name, Date date_of_birth, String nationality, String city, double percentage_of_fitness, String is_bowler, String is_batsman, String is_all_rounder, String is_wicket_keeper) {
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
}
