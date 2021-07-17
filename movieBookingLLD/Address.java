package com.abhi.lldclass.movieBookingLLD;

public class Address {
    private String Street1;
    private int zipCode;
    private String city;

    public Address(String street1, int zipCode, String city) {
        Street1 = street1;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String street1) {
        Street1 = street1;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street1='" + Street1 + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                '}';
    }}
