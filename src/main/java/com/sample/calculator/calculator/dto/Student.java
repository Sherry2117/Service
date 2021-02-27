package com.sample.calculator.calculator.dto;

public class Student {

    private String Name;
    long ID;
    String address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
