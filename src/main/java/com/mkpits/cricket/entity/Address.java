package com.mkpits.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private int addressid;
    private String address1;
    private String address2;
    private String district;
    @Column(name = "city_id")
    private String cityid;
    @Column(name = "postal_code")
    private String postalcode;

    public Address(){

    }
    public Address(int addressid, String address1, String address2, String district,
                   String cityid, String postalcode) {
        this.addressid = addressid;
        this.address1 = address1;
        this.address2 = address2;
        this.district = district;
        this.cityid = cityid;
        this.postalcode = postalcode;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
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

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
}
