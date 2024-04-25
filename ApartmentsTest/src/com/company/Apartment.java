package com.company;

public class Apartment {
    private String city;
    private int numberOfRooms;
    private int m2;
    private int price;
    private int phoneNumber;

    public Apartment() {
    }

    public Apartment(String city, int numberOfRooms, int m2, int price, int phoneNumber) {
        this.city = city;
        this.numberOfRooms = numberOfRooms;
        this.m2 = m2;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
