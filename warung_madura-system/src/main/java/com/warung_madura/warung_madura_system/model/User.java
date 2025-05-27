package com.warung_madura.warung_madura_system.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {

    protected String username;
    protected String name;
    protected String password;
    protected String role;

    public User(String username, String name, String password, String role) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public abstract void showMenu();
}
