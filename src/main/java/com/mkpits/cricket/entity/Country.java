package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "country_id")
    private int countryid;
    @Column(name = "country_name")
    private String countryname;

    public Country(){

    }

    public Country(int countryid, String countryname) {
        this.countryid = countryid;
        this.countryname = countryname;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
