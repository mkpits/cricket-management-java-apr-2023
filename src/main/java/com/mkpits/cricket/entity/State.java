package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {
    @Id
    @Column(name = "state_id")
    private int stateid;
    @Column(name = "state_name")
    private String statename;
    @Column(name = "country_id")
    private int countryid;

    public State(){

    }

    public State(int stateid, String statename, int countryid) {
        this.stateid = stateid;
        this.statename = statename;
        this.countryid = countryid;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }
}
