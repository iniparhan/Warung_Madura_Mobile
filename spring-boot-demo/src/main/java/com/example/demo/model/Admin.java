package com.example.demo.model;

public class Admin extends User {

    public Admin(String id, String username, String password, String name) {
        super(id, username, password, name);
    }

    @Override
    public void login() {
        System.out.println("Admin " + name + " logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Admin " + name + " logged out.");
    }
}