package com.alenasoft.behavioral.iterator;

public class CREUser {
    private int id;
    private UserData userData;

    public CREUser(int id, String name, String address, double payment) {
        this.id = id;
        this.userData = new UserData(name, address, payment);
    }

    @Override
    public String toString() {
        return String.format("CREUser: %d-%s, Address: %s, Payment: %f", this.id, this.userData.getName(),
                this.userData.getAddress(), this.userData.getPayment());
    }
}
