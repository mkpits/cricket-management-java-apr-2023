package com.mkpits.cricket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    private int user_id;
    private int role_id;

}
