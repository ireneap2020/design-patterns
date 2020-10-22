package com.alenasoft.behavioral.iterator;

public class UserData {
    private String name;
    private String address;
    private double payment;

    public UserData(String name, String address, double payment) {
        this.name = name;
        this.address = address;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getPayment() {
        return payment;
    }
}
