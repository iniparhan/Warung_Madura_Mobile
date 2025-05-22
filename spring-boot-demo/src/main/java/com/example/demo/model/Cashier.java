package com.example.demo.model;

public class Cashier extends User {

    public Cashier(String id, String username, String password, String name) {
        super(id, username, password, name);
    }

    @Override
    public void login() {
        System.out.println("Cashier " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Cashier " + name + " logged out.");
    }
}
