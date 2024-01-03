package com.mkpits.cricket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "updateprofile")
public class UserEntity{
    @Id
    private int user_id;
    private String f_name;
    private String l_name;
    private String email;


    public UserEntity() {
    }

    public UserEntity(String f_name, String l_name, String email) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
    }


    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
