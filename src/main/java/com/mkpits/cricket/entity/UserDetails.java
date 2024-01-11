package com.mkpits.cricket.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.sql.Timestamp;

import java.sql.Date;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "mobile_no")
    private String mobileNumber;
    @Column(name = "gender")
    private String gender;
    @Column(name = "created_by")
    private String created_By;
    @Column(name = "updated_by")
    private String updated_By;
    @Column(name = "updated_on")
    @UpdateTimestamp
    private Timestamp updated_On;
    @Column(name = "created_on")
    @CreationTimestamp
    private Timestamp created_On;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne(mappedBy ="userDetails", cascade = CascadeType.ALL)
    private UserLogin userLogin;

    public UserDetails() {
    }

    public UserDetails(String firstName, String lastName, String email, Date dateOfBirth, String mobileNumber, String gender, String created_By, String updated_By,Address address,UserLogin userLogin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.created_By = created_By;
        this.updated_By = updated_By;
        this.address=address;
        this.userLogin=userLogin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getCreated_By() {
        return created_By;
    }

    public void setCreated_By(String created_By) {
        this.created_By = created_By;
    }

    public String getUpdated_By() {
        return updated_By;
    }

    public void setUpdated_By(String updated_By) {
        this.updated_By = updated_By;
    }

    public Timestamp getUpdated_On() {
        return updated_On;
    }

    public void setUpdated_On(Timestamp updated_On) {
        this.updated_On = updated_On;
    }

    public Timestamp getCreated_On() {
        return created_On;
    }

    public void setCreated_On(Timestamp created_On) {
        this.created_On = created_On;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
}
