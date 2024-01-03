package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_master")
public class UserMaster {
    @Id
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "user_id")
    private int userId;

    public UserMaster(){

    }

    public UserMaster(int roleId, String roleName, int userId) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
