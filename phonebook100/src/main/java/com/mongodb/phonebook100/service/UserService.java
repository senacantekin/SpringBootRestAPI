package com.mongodb.phonebook100.service;

import com.mongodb.phonebook100.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    User getById(String id);
    Boolean deleteUser(String id);

    List<User> getAll();

}
