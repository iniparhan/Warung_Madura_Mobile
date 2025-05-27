package com.warung_madura.warung_madura_system.model;

public class Admin extends User {

//  public User(String username, String name, String password, String role)

    public Admin(String id, String name) {
        super(username, name, "Admin");
    }

    @Override
    public void showMenu() {
        System.out.println("Admin Menu: Manage Users, View Reports, etc.");
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}