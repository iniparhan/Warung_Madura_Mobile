package com.warung_madura.warung_madura_system.model;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String username) {
        users.removeIf(u -> u.getUsername().equals(username));
    }

    public User getUserByUser(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}

// userService.updateUserByUsername(username, updatedUser);

// userService.deleteUserByUsername(username);

