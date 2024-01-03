package com.mkpits.cricket.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;
    @Column(name = "city_name")
    private String cityName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id")
    private State state;

    public City(){
    }

    public City(int cityId, String cityName,State state) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.state=state;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
