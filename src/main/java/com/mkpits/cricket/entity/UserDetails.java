package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @Column(name = "user_id")
    private int userid;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "address_id")
    private int addressid;
    @Column(name = "date_of_birth")
    private Date dateofbirth;
    @Column(name = "mobile_no")
    private int mobilenumber;
    @Column(name = "gender")
    private String gender;
    @Column(name = "create_date")
    private LocalDateTime createdate;
    @Column(name = "role_id")
    private int roleid;
    @Column(name = "last_update")
    private Timestamp lastupdate;
    @Column(name = "is_deleted")
    private boolean isdeleted;

    public UserDetails() {
    }

    public UserDetails(int userid, String firstname, String lastname, String email,
                       int addressid, Date dateofbirth, int mobilenumber, String gender,
                       LocalDateTime createdate, int roleid, Timestamp lastupdate,
                       boolean isdeleted) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.addressid = addressid;
        this.dateofbirth = dateofbirth;
        this.mobilenumber = mobilenumber;
        this.gender = gender;
        this.createdate = createdate;
        this.roleid = roleid;
        this.lastupdate = lastupdate;
        this.isdeleted = isdeleted;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDateTime createdate) {
        this.createdate = createdate;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public boolean isIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
