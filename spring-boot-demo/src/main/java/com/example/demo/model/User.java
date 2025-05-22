package com.example.demo.model;

public abstract class User {

    protected String id;
    protected String username;
    protected String password;
    protected String name;

    public User(String id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public abstract void login();
    public abstract void logout();
}