package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_login")
public class UserLogin {
    @Id
    @Column(name = "user_id")
    private int userId;
    private String username;
    private String password;

    public UserLogin(){
    }

    public UserLogin(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
