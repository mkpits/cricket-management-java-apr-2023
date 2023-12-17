package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_id")
    private int cityid;
    @Column(name = "city_name")
    private String cityname;
    @Column(name = "state_id")
    private int stateid;

    public City(){
    }

    public City(int cityid, String cityname, int stateid) {
        this.cityid = cityid;
        this.cityname = cityname;
        this.stateid = stateid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }
}
