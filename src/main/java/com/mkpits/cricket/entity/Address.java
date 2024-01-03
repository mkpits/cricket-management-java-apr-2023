package com.mkpits.cricket.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    private String address1;
    private String address2;
    private String district;
    @Column(name = "postal_code")
    private String postalCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;

    public Address(){

    }

    public Address(int addressId, String address1, String address2, String district, String postalCode, City city) {
        this.addressId = addressId;
        this.address1 = address1;
        this.address2 = address2;
        this.district = district;
        this.postalCode = postalCode;
        this.city=city;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
