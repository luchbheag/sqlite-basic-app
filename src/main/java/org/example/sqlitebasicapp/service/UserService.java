package org.example.sqlitebasicapp.service;

import org.example.sqlitebasicapp.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(Long id);

    User addUser(User user);

    void deleteUser(Long id);
}
